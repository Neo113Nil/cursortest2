package expo.modules.core.interfaces.services;

import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.LifecycleEventListener;

/* loaded from: classes8.dex */
public interface UIManager {
    void registerActivityEventListener(ActivityEventListener activityEventListener);

    void registerLifecycleEventListener(LifecycleEventListener lifecycleEventListener);

    void runOnClientCodeQueueThread(Runnable runnable);

    void runOnUiQueueThread(Runnable runnable);

    void unregisterActivityEventListener(ActivityEventListener activityEventListener);

    void unregisterLifecycleEventListener(LifecycleEventListener lifecycleEventListener);
}
