package io.agora.rtc2.gl;

import android.opengl.EGL14;
import androidx.annotation.NonNull;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import io.agora.base.internal.video.EglBaseFactory;
import java.util.Objects;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes3.dex */
public class EglBaseProvider {
    private static final String RELEASE_MESSAGE_TEMPLATE = "EglBaseProvider released %s unavailable";
    private static final String TAG = "EglBaseProvider";
    private static volatile EglBaseProvider instance;
    private volatile boolean initialized = false;
    private EglBase localEglBase;
    private EglBase remoteEglBase;
    private EglBase rootEglBase;

    private EglBaseProvider() {
    }

    @CalledByNative
    public static void acquireEglBaseReadLock() {
        EglBase.rwlock.readLock().lock();
    }

    private boolean checkEglContext(Object obj) {
        boolean equals;
        if (obj == null) {
            return false;
        }
        boolean z10 = obj instanceof EglBase10.Context;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        if (z10) {
            equals = ((EglBase10.Context) obj).getEglContext().equals(eGLContext);
        } else if (obj instanceof EglBase14.Context) {
            equals = ((EglBase14.Context) obj).getEglContext().equals(EGL14.EGL_NO_CONTEXT);
        } else if (obj instanceof EGLContext) {
            equals = ((EGLContext) obj).equals(eGLContext);
        } else {
            if (!(obj instanceof android.opengl.EGLContext)) {
                return false;
            }
            equals = ((android.opengl.EGLContext) obj).equals(EGL14.EGL_NO_CONTEXT);
        }
        return !equals;
    }

    private void checkReleased(String str) {
        if (instance == null) {
            throw new IllegalStateException(String.format(RELEASE_MESSAGE_TEMPLATE, str));
        }
    }

    private EglBase.Context createEglBaseContext(Object obj) {
        if (obj instanceof EglBase.Context) {
            return (EglBase.Context) obj;
        }
        if (obj instanceof EGLContext) {
            return new EglBase10.Context((EGLContext) obj);
        }
        if (!(obj instanceof android.opengl.EGLContext)) {
            Logging.e(TAG, "illegal egl context!");
            return null;
        }
        EglBase14.Context context = new EglBase14.Context((android.opengl.EGLContext) obj);
        Logging.i(TAG, "createRemoteEglContext: " + context.getEglContext());
        return context;
    }

    @CalledByNative
    public static void destroy() {
        synchronized (EglBaseProvider.class) {
            try {
                if (instance != null) {
                    instance.release();
                    instance = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    public static EglBase.Context getCurrentEglContext() {
        if (EglBase14.isEGL14SupportedImpl()) {
            android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
            if (Objects.equals(eglGetCurrentContext, EGL14.EGL_NO_CONTEXT)) {
                return null;
            }
            return new EglBase14.Context(eglGetCurrentContext);
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (egl10 == null || !Objects.equals(egl10.eglGetCurrentContext(), EGL10.EGL_NO_CONTEXT)) {
            return null;
        }
        return new EglBase10.Context(egl10.eglGetCurrentContext());
    }

    private void initialize() {
        if (this.initialized) {
            return;
        }
        EglBase create = EglBaseFactory.create();
        this.rootEglBase = create;
        this.localEglBase = EglBaseFactory.create(create.getEglBaseContext());
        this.remoteEglBase = EglBaseFactory.create(this.rootEglBase.getEglBaseContext());
        this.initialized = true;
    }

    @NonNull
    @CalledByNative
    public static EglBaseProvider instance() {
        EglBaseProvider eglBaseProvider;
        synchronized (EglBaseProvider.class) {
            try {
                if (instance == null) {
                    instance = new EglBaseProvider();
                }
                eglBaseProvider = instance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eglBaseProvider;
    }

    @CalledByNative
    public static boolean isEgl14BaseContext(EglBase.Context context) {
        return context instanceof EglBase14.Context;
    }

    @CalledByNative
    public static boolean isSameEglContext(EglBase.Context context, EglBase.Context context2) {
        return Objects.equals(context, context2);
    }

    public static native void nativeExtensionNativeStartFunc(long j10);

    public static native void nativeExtensionNativeStopFunc(long j10);

    private void release() {
        synchronized (EglBaseProvider.class) {
            try {
                EglBase eglBase = this.remoteEglBase;
                if (eglBase != null) {
                    eglBase.release();
                }
                EglBase eglBase2 = this.localEglBase;
                if (eglBase2 != null) {
                    eglBase2.release();
                }
                EglBase eglBase3 = this.rootEglBase;
                if (eglBase3 != null) {
                    eglBase3.release();
                }
                this.initialized = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    public static void releaseEglBaseReadLock() {
        EglBase.rwlock.readLock().unlock();
    }

    private void releaseRemoteEglbase() {
        synchronized (EglBaseProvider.class) {
            try {
                EglBase eglBase = this.remoteEglBase;
                if (eglBase != null) {
                    eglBase.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    public static void startWithEglBaseLock(long j10) {
        synchronized (EglBase.lock) {
            nativeExtensionNativeStartFunc(j10);
        }
    }

    @CalledByNative
    public static void stopWithEglBaseLock(long j10) {
        synchronized (EglBase.lock) {
            nativeExtensionNativeStopFunc(j10);
        }
    }

    @CalledByNative
    public void destroyRemoteEglContext() {
        synchronized (EglBaseProvider.class) {
            checkReleased("destroyRemoteEglContext");
            releaseRemoteEglbase();
            this.remoteEglBase = EglBaseFactory.create(this.rootEglBase.getEglBaseContext());
        }
    }

    public EglBase getLocalEglBase() {
        EglBase eglBase;
        synchronized (EglBaseProvider.class) {
            checkReleased("getLocalEglBase");
            initialize();
            eglBase = instance.localEglBase;
        }
        return eglBase;
    }

    @CalledByNative
    public EglBase.Context getLocalEglBaseContext() {
        EglBase.Context eglBaseContext;
        synchronized (EglBaseProvider.class) {
            checkReleased("getLocalEglBaseContext");
            initialize();
            eglBaseContext = instance.localEglBase.getEglBaseContext();
        }
        return eglBaseContext;
    }

    public EglBase getRemoteEglBase() {
        EglBase eglBase;
        synchronized (EglBaseProvider.class) {
            checkReleased("getRemoteEglBase");
            initialize();
            eglBase = instance.remoteEglBase;
        }
        return eglBase;
    }

    @CalledByNative
    public EglBase.Context getRemoteEglBaseContext() {
        EglBase.Context eglBaseContext;
        synchronized (EglBaseProvider.class) {
            checkReleased("getRemoteEglBaseContext");
            initialize();
            eglBaseContext = instance.remoteEglBase.getEglBaseContext();
        }
        return eglBaseContext;
    }

    public EglBase getRootEglBase() {
        EglBase eglBase;
        synchronized (EglBaseProvider.class) {
            checkReleased("getRootEglBase");
            initialize();
            eglBase = instance.rootEglBase;
        }
        return eglBase;
    }

    @CalledByNative
    public boolean replaceRemoteEglContext(Object obj) {
        EglBase.Context eglBaseContext;
        synchronized (EglBaseProvider.class) {
            try {
                checkReleased("replaceRemoteEglContext");
                initialize();
                if (obj == null) {
                    eglBaseContext = this.rootEglBase.getEglBaseContext();
                } else {
                    if (!checkEglContext(obj)) {
                        return false;
                    }
                    eglBaseContext = createEglBaseContext(obj);
                    if (eglBaseContext == null) {
                        return false;
                    }
                    Logging.i(TAG, "replaceRemoteEglContext: " + eglBaseContext + " eglBase Context: " + this.rootEglBase.getEglBaseContext());
                }
                releaseRemoteEglbase();
                this.remoteEglBase = EglBaseFactory.create(eglBaseContext);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    public void replaceRootBase(EglBase.Context context) {
        synchronized (EglBaseProvider.class) {
            release();
            EglBase create = EglBaseFactory.create(context, EglBase.CONFIG_PLAIN);
            this.rootEglBase = create;
            this.localEglBase = EglBaseFactory.create(create.getEglBaseContext());
            this.remoteEglBase = EglBaseFactory.create(this.rootEglBase.getEglBaseContext());
            this.initialized = true;
        }
    }
}
