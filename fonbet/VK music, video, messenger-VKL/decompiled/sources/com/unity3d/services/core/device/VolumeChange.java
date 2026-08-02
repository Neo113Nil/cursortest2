package com.unity3d.services.core.device;

/* compiled from: VolumeChange.kt */
/* loaded from: classes14.dex */
public interface VolumeChange {
    void clearAllListeners();

    void registerListener(VolumeChangeListener volumeChangeListener);

    void startObserving();

    void stopObserving();

    void unregisterListener(VolumeChangeListener volumeChangeListener);
}
