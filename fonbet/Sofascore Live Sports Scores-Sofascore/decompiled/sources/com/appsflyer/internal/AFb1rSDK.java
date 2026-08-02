package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFb1rSDK {
    @Nullable
    public static Uri g_(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        AFi1eSDK aFi1eSDK = new AFi1eSDK(intent);
        Uri uri = (Uri) aFi1eSDK.O_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String AFLogger = aFi1eSDK.AFLogger("android.intent.extra.REFERRER_NAME");
        if (AFLogger != null) {
            return Uri.parse(AFLogger);
        }
        return null;
    }
}
