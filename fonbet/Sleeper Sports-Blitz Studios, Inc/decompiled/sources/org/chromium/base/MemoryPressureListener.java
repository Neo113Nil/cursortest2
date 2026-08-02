package org.chromium.base;

import android.app.Activity;
import android.os.Handler;
import internal.org.chromium.build.NullUtil;
import java.util.Iterator;
import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.base.memory.MemoryPressureCallback;
import org.chromium.base.memory.SelfFreezeCallback;

/* loaded from: classes10.dex */
public class MemoryPressureListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_LOW_MEMORY = "org.chromium.base.ACTION_LOW_MEMORY";
    private static final String ACTION_TRIM_MEMORY = "org.chromium.base.ACTION_TRIM_MEMORY";
    private static final String ACTION_TRIM_MEMORY_MODERATE = "org.chromium.base.ACTION_TRIM_MEMORY_MODERATE";
    private static final String ACTION_TRIM_MEMORY_RUNNING_CRITICAL = "org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL";
    private static ObserverList<MemoryPressureCallback> sCallbacks;
    private static ObserverList<SelfFreezeCallback> sSelfFreezeCallbacks;
    private static volatile Handler sSelfFreezeHandler;

    interface Natives {
        boolean isTrimMemoryBackgroundCritical();

        void onMemoryPressure(int pressure);

        void onPreFreeze();
    }

    private static void addNativeCallback() {
        ThreadUtils.assertOnUiThread();
        addCallback(new MemoryPressureCallback() { // from class: org.chromium.base.MemoryPressureListener$$ExternalSyntheticLambda0
            @Override // org.chromium.base.memory.MemoryPressureCallback
            public final void onPressure(int i) {
                MemoryPressureListenerJni.get().onMemoryPressure(i);
            }
        });
    }

    public static void addCallback(MemoryPressureCallback callback) {
        ThreadUtils.assertOnUiThread();
        if (sCallbacks == null) {
            sCallbacks = new ObserverList<>();
        }
        sCallbacks.addObserver(callback);
    }

    public static void addSelfFreezeCallback(SelfFreezeCallback callback) {
        if (sSelfFreezeCallbacks == null) {
            sSelfFreezeCallbacks = new ObserverList<>();
        }
        sSelfFreezeCallbacks.addObserver(callback);
        if (sSelfFreezeHandler == null) {
            sSelfFreezeHandler = new Handler();
        }
    }

    public static void removeCallback(MemoryPressureCallback callback) {
        ThreadUtils.assertOnUiThread();
        ObserverList<MemoryPressureCallback> observerList = sCallbacks;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(callback);
    }

    public static void removeSelfFreezeCallback(SelfFreezeCallback callback) {
        ((ObserverList) NullUtil.assumeNonNull(sSelfFreezeCallbacks)).removeObserver(callback);
    }

    public static void notifyMemoryPressure(int pressure) {
        ThreadUtils.assertOnUiThread();
        ObserverList<MemoryPressureCallback> observerList = sCallbacks;
        if (observerList == null) {
            return;
        }
        Iterator<MemoryPressureCallback> it = observerList.iterator();
        while (it.hasNext()) {
            it.next().onPressure(pressure);
        }
    }

    public static void notifySelfFreeze() {
        ThreadUtils.assertOnUiThread();
        if (sSelfFreezeHandler != null) {
            sSelfFreezeHandler.post(new Runnable() { // from class: org.chromium.base.MemoryPressureListener$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryPressureListener.lambda$notifySelfFreeze$1();
                }
            });
        }
    }

    static /* synthetic */ void lambda$notifySelfFreeze$1() {
        ObserverList<SelfFreezeCallback> observerList = sSelfFreezeCallbacks;
        if (observerList == null) {
            return;
        }
        Iterator<SelfFreezeCallback> it = observerList.iterator();
        while (it.hasNext()) {
            it.next().onSelfFreeze();
        }
    }

    public static void onPreFreeze() {
        if (LibraryLoader.getInstance().isInitialized()) {
            MemoryPressureListenerJni.get().onPreFreeze();
        }
    }

    public static boolean isTrimMemoryBackgroundCritical() {
        if (LibraryLoader.getInstance().isInitialized()) {
            return MemoryPressureListenerJni.get().isTrimMemoryBackgroundCritical();
        }
        return false;
    }

    public static boolean handleDebugIntent(Activity activity, String action) {
        ThreadUtils.assertOnUiThread();
        if (ACTION_LOW_MEMORY.equals(action)) {
            simulateLowMemoryPressureSignal(activity);
            return true;
        }
        if (ACTION_TRIM_MEMORY.equals(action)) {
            simulateTrimMemoryPressureSignal(activity, 80);
            return true;
        }
        if (ACTION_TRIM_MEMORY_RUNNING_CRITICAL.equals(action)) {
            simulateTrimMemoryPressureSignal(activity, 15);
            return true;
        }
        if (!ACTION_TRIM_MEMORY_MODERATE.equals(action)) {
            return false;
        }
        simulateTrimMemoryPressureSignal(activity, 60);
        return true;
    }

    private static void simulateLowMemoryPressureSignal(Activity activity) {
        activity.getApplication().onLowMemory();
        activity.onLowMemory();
    }

    private static void simulateTrimMemoryPressureSignal(Activity activity, int level) {
        activity.getApplication().onTrimMemory(level);
        activity.onTrimMemory(level);
    }
}
