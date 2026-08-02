package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFh1uSDK {
    public final Intent AFKeystoreWrapper;
    public final String valueOf;

    @NotNull
    public final String values;

    public AFh1uSDK(@NotNull Activity activity, @NotNull AFi1ySDK aFi1ySDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1ySDK, "");
        this.AFKeystoreWrapper = activity.getIntent();
        this.values = aFi1ySDK.AFInAppEventType(activity);
        this.valueOf = aFi1ySDK.AFInAppEventParameterName(activity);
    }
}
