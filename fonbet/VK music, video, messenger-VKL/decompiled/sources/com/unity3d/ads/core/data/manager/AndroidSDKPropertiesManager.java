package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.SdkProperties;

/* compiled from: AndroidSDKPropertiesManager.kt */
/* loaded from: classes14.dex */
public final class AndroidSDKPropertiesManager implements SDKPropertiesManager {
    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public SdkProperties.InitializationState getCurrentInitializationState() {
        return SdkProperties.getCurrentInitializationState();
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTime() {
        SdkProperties.setInitializationTime(Device.getElapsedRealtime());
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTimeSinceEpoch() {
        SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializeState(SdkProperties.InitializationState initializationState) {
        SdkProperties.setInitializeState(initializationState);
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitialized(boolean z) {
        SdkProperties.setInitialized(z);
    }
}
