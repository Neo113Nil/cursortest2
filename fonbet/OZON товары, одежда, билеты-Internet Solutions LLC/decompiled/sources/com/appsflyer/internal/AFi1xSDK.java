package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1xSDK implements AFi1ySDK {
    private String values;

    private static boolean valueOf(String str) {
        return kotlin.text.h.e0(str, "android-app://", false);
    }

    private static String values(Activity activity) {
        Uri AFKeystoreWrapper = AFc1aSDK.AFKeystoreWrapper(activity != null ? activity.getIntent() : null);
        String obj = AFKeystoreWrapper != null ? AFKeystoreWrapper.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (valueOf(obj)) {
            return null;
        }
        return obj;
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    public final String AFInAppEventParameterName(Activity activity) {
        String str = this.values;
        this.values = null;
        return (str == null || str.length() == 0) ? values(activity) : str;
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    @NotNull
    public final String AFInAppEventType(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }

    @Override // com.appsflyer.internal.AFi1ySDK
    public final void AFKeystoreWrapper(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.values;
        if (str == null || str.length() == 0) {
            this.values = values(activity);
        }
    }
}
