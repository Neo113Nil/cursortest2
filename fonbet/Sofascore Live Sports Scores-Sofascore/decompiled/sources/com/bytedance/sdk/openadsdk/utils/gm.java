package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import defpackage.vxd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    public static int pcc = -1;

    public static int pcc(Context context, int i, int i2) {
        int pcc2 = pcc(context, i2);
        if (pcc2 == -1) {
            return pcc;
        }
        return Math.max(Math.min(i > 655 ? vxd.b(i, 728.0f, 90.0f) : i > 632 ? 81 : i > 526 ? vxd.b(i, 468.0f, 60.0f) : i > 432 ? 68 : vxd.b(i, 320.0f, 50.0f), Math.min(90, Math.round(pcc2 * 0.15f))), 50);
    }

    public static int pcc(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                    int i2 = configuration.orientation;
                    if (i == 0) {
                        i = i2;
                    }
                    if (i == i2) {
                        return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                    }
                    return Math.round(displayMetrics.widthPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return pcc;
            }
        }
        return pcc;
    }
}
