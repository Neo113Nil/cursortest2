package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import internal.org.chromium.build.NullUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.base.lifetime.DestroyChecker;

/* loaded from: classes10.dex */
public final class UnownedUserDataHost {
    private final DestroyChecker mDestroyChecker;
    private Handler mHandler;
    private final ThreadUtils.ThreadChecker mThreadChecker;
    private HashMap<UnownedUserDataKey<?>, WeakReference<? extends UnownedUserData>> mUnownedUserDataMap;

    private static Looper retrieveNonNullLooperOrThrow() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        throw new IllegalStateException();
    }

    public UnownedUserDataHost() {
        this(new Handler(retrieveNonNullLooperOrThrow()));
    }

    UnownedUserDataHost(Handler handler) {
        this.mThreadChecker = new ThreadUtils.ThreadChecker();
        this.mDestroyChecker = new DestroyChecker();
        this.mUnownedUserDataMap = new HashMap<>();
        this.mHandler = handler;
    }

    <T extends UnownedUserData> void set(UnownedUserDataKey<T> key, T newValue) {
        checkState();
        if (this.mUnownedUserDataMap.containsKey(key) && !newValue.equals(get(key))) {
            key.detachFromHost(this);
        }
        this.mUnownedUserDataMap.put(key, new WeakReference<>(newValue));
    }

    <T extends UnownedUserData> T get(UnownedUserDataKey<T> key) {
        checkState();
        WeakReference<? extends UnownedUserData> weakReference = this.mUnownedUserDataMap.get(key);
        if (weakReference == null) {
            return null;
        }
        UnownedUserData unownedUserData = weakReference.get();
        if (unownedUserData == null) {
            key.detachFromHost(this);
            return null;
        }
        return key.getValueClass().cast(unownedUserData);
    }

    <T extends UnownedUserData> void remove(UnownedUserDataKey<T> key) {
        final UnownedUserData unownedUserData;
        checkState();
        WeakReference<? extends UnownedUserData> remove = this.mUnownedUserDataMap.remove(key);
        if (remove == null || (unownedUserData = remove.get()) == null || !unownedUserData.informOnDetachmentFromHost()) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: org.chromium.base.UnownedUserDataHost$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnownedUserDataHost.this.lambda$remove$0(unownedUserData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$remove$0(UnownedUserData unownedUserData) {
        unownedUserData.onDetachedFromHost(this);
    }

    public void destroy() {
        this.mThreadChecker.assertOnValidThread();
        if (isDestroyed()) {
            return;
        }
        Iterator it = new HashSet(this.mUnownedUserDataMap.keySet()).iterator();
        while (it.hasNext()) {
            ((UnownedUserDataKey) it.next()).detachFromHost(this);
        }
        this.mUnownedUserDataMap = null;
        this.mHandler = null;
        this.mDestroyChecker.destroy();
    }

    int getMapSize() {
        checkState();
        return this.mUnownedUserDataMap.size();
    }

    boolean isDestroyed() {
        if (this.mDestroyChecker.isDestroyed()) {
            return true;
        }
        NullUtil.assumeNonNull(this.mUnownedUserDataMap);
        NullUtil.assumeNonNull(this.mHandler);
        return false;
    }

    private void checkState() {
        this.mThreadChecker.assertOnValidThread();
        this.mDestroyChecker.checkNotDestroyed();
        NullUtil.assumeNonNull(this.mUnownedUserDataMap);
        NullUtil.assumeNonNull(this.mHandler);
    }
}
