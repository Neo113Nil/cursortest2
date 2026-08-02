package org.chromium.base.lifetime;

import internal.org.chromium.build.BuildConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.base.task.PostTask;

/* loaded from: classes10.dex */
public class LifetimeAssert {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static TestHook sTestHook;
    private final Object mTarget;
    final WrappedReference mWrapper;

    interface TestHook {
        void onCleaned(WrappedReference ref, String msg);
    }

    static class LifetimeAssertException extends RuntimeException {
        LifetimeAssertException(String msg, Throwable causedBy) {
            super(msg, causedBy);
        }
    }

    private static class CreationException extends RuntimeException {
        CreationException() {
            super("vvv This is where object was created. vvv");
        }
    }

    static class WrappedReference extends PhantomReference<Object> {
        final CreationException mCreationException;
        boolean mSafeToGc;
        final Class<?> mTargetClass;
        private static final ReferenceQueue<Object> sReferenceQueue = new ReferenceQueue<>();
        private static final Set<WrappedReference> sActiveWrappers = Collections.synchronizedSet(new HashSet());

        private WrappedReference(Object target, CreationException creationException, boolean safeToGc) {
            super(target, sReferenceQueue);
            this.mCreationException = (CreationException) PostTask.maybeAddTaskOrigin(creationException);
            this.mSafeToGc = safeToGc;
            this.mTargetClass = target.getClass();
            sActiveWrappers.add(this);
        }

        static {
            new Thread("GcStateAssertQueue") { // from class: org.chromium.base.lifetime.LifetimeAssert.WrappedReference.1
                {
                    setDaemon(true);
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    while (true) {
                        try {
                            WrappedReference wrappedReference = (WrappedReference) WrappedReference.sReferenceQueue.remove();
                            if (WrappedReference.sActiveWrappers.remove(wrappedReference)) {
                                if (!wrappedReference.mSafeToGc) {
                                    String format = String.format("Object of type %s was GC'ed without cleanup. Refer to \"Caused by\" for where object was created.", wrappedReference.mTargetClass.getName());
                                    if (LifetimeAssert.sTestHook != null) {
                                        LifetimeAssert.sTestHook.onCleaned(wrappedReference, format);
                                    } else {
                                        throw new LifetimeAssertException(format, wrappedReference.mCreationException);
                                    }
                                } else if (LifetimeAssert.sTestHook != null) {
                                    LifetimeAssert.sTestHook.onCleaned(wrappedReference, null);
                                }
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            };
        }
    }

    private LifetimeAssert(WrappedReference wrapper, Object target) {
        this.mWrapper = wrapper;
        this.mTarget = target;
    }

    public static LifetimeAssert create(Object target) {
        if (BuildConfig.ENABLE_ASSERTS) {
            return new LifetimeAssert(new WrappedReference(target, new CreationException(), false), target);
        }
        return null;
    }

    public static LifetimeAssert create(Object target, boolean safeToGc) {
        if (BuildConfig.ENABLE_ASSERTS) {
            return new LifetimeAssert(new WrappedReference(target, new CreationException(), safeToGc), target);
        }
        return null;
    }

    public static void setSafeToGc(LifetimeAssert asserter, boolean value) {
        if (BuildConfig.ENABLE_ASSERTS) {
            synchronized (asserter.mTarget) {
                asserter.mWrapper.mSafeToGc = value;
            }
        }
    }

    public static void assertNotDestroyed(LifetimeAssert asserter) {
        boolean z = BuildConfig.ENABLE_ASSERTS;
    }

    public static void destroy(LifetimeAssert asserter) {
        assertNotDestroyed(asserter);
        setSafeToGc(asserter, true);
    }

    public static void assertAllInstancesDestroyedForTesting() {
        if (BuildConfig.ENABLE_ASSERTS) {
            synchronized (WrappedReference.sActiveWrappers) {
                try {
                    for (WrappedReference wrappedReference : WrappedReference.sActiveWrappers) {
                        if (!wrappedReference.mSafeToGc) {
                            throw new LifetimeAssertException(String.format("Object of type %s was not destroyed after test completed. Refer to \"Caused by\" for where object was created.", wrappedReference.mTargetClass.getName()), wrappedReference.mCreationException);
                        }
                    }
                } finally {
                    WrappedReference.sActiveWrappers.clear();
                }
            }
        }
    }

    public static void resetForTesting() {
        if (BuildConfig.ENABLE_ASSERTS) {
            WrappedReference.sActiveWrappers.clear();
        }
    }
}
