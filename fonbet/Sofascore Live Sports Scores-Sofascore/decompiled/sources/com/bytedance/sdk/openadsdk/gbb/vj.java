package com.bytedance.sdk.openadsdk.gbb;

import android.app.Activity;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    public static void pcc(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT == 26) {
            return;
        }
        try {
            if (activity.getRequestedOrientation() == 1) {
                return;
            }
            activity.setRequestedOrientation(1);
        } catch (Throwable unused) {
        }
    }
}
