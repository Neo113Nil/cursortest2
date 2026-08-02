package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class AFh1cSDK {

    @NonNull
    public final AFh1bSDK AFInAppEventParameterName;
    private boolean AFKeystoreWrapper;

    public AFh1cSDK(boolean z11, @NonNull AFh1bSDK aFh1bSDK) {
        this.AFKeystoreWrapper = z11;
        this.AFInAppEventParameterName = aFh1bSDK;
    }

    public final boolean AFInAppEventType() {
        return this.AFKeystoreWrapper;
    }
}
