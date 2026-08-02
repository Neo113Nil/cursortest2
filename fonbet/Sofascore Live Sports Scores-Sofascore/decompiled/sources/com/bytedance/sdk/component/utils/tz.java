package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tz {
    private static Resources gm = null;
    private static String oo = null;
    private static Context pcc = null;
    private static String sf = null;
    private static boolean vj = false;
    private static boolean wh = false;

    public static synchronized void gm(Context context) {
        synchronized (tz.class) {
            try {
                if (TextUtils.isEmpty(sf)) {
                    return;
                }
                vj = true;
            } catch (Throwable unused) {
            }
        }
    }

    public static int kj(Context context, String str) {
        return pcc(context, str, "color");
    }

    private static String oo(Context context) {
        String str = oo;
        if (str != null) {
            return str;
        }
        String packageName = context.getPackageName();
        oo = packageName;
        return packageName;
    }

    private static int pcc(Context context, String str, String str2) {
        int identifier = sf(context).getIdentifier(str, str2, oo(context));
        if (identifier != 0) {
            return identifier;
        }
        if (vj) {
            return context.getResources().getIdentifier(str, str2, oo(context));
        }
        gm(context);
        return sf(context).getIdentifier(str, str2, oo(context));
    }

    public static int qf(Context context, String str) {
        return sf(context).getColor(kj(context, str));
    }

    public static Resources sf(Context context) {
        Resources resources = gm;
        if (resources == null) {
            resources = null;
        }
        Context context2 = pcc;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static int vj(Context context, String str) {
        return pcc(context, str, "id");
    }

    public static int vy(Context context, String str) {
        return pcc(context, str, "anim");
    }

    public static int wh(Context context, String str) {
        return pcc(context, str, TtmlNode.TAG_STYLE);
    }

    public static int oo(Context context, String str) {
        try {
            return pcc(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Drawable gm(Context context, String str) {
        try {
            return sf(context).getDrawable(oo(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int sf(Context context, String str) {
        return pcc(context, str, "string");
    }

    public static void pcc(String str) {
        oo = str;
    }

    public static void pcc(Context context) {
        pcc = context;
    }

    public static String pcc(Context context, String str) {
        return sf(context).getString(sf(context, str));
    }
}
