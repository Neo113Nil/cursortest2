package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1bSDK implements AFi1zSDK {
    @Override // com.appsflyer.internal.AFi1zSDK
    @NotNull
    public final String AFKeystoreWrapper(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }

    @Override // com.appsflyer.internal.AFi1zSDK
    @Nullable
    public final String registerClient(@Nullable Activity activity) {
        Uri g_ = AFb1rSDK.g_(activity != null ? activity.getIntent() : null);
        String obj = g_ != null ? g_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (kotlin.text.c.v(obj, "android-app://", false)) {
            return null;
        }
        return obj;
    }
}
