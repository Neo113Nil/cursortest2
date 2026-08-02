package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class AFj1ySDK {
    public final WeakReference<Context> AFInAppEventType;
    public String AFKeystoreWrapper;

    public AFj1ySDK(@NonNull Context context) {
        this.AFInAppEventType = new WeakReference<>(context);
    }
}
