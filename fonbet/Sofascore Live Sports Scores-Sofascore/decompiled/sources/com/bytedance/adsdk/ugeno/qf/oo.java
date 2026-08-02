package com.bytedance.adsdk.ugeno.qf;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oo {
    private static Context gm;
    private static String pcc;
    private static Resources sf;

    private static int pcc(Context context, String str, String str2) {
        Resources resources = sf;
        if (resources == null) {
            resources = context.getResources();
            sf = resources;
        }
        return resources.getIdentifier(str, str2, pcc(context));
    }

    public static int sf(Context context, String str) {
        return pcc(context, str, "drawable");
    }

    private static String pcc(Context context) {
        String str = pcc;
        if (str != null) {
            return str;
        }
        String packageName = context.getPackageName();
        pcc = packageName;
        return packageName;
    }

    public static void pcc(String str) {
        pcc = str;
    }

    public static int pcc(Context context, String str) {
        return pcc(context, str, "raw");
    }
}
