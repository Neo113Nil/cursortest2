package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;
import defpackage.me4;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class i0 {
    public static int a(Context context, String str, String str2) {
        String str3 = "";
        try {
            try {
                str3 = com.mbridge.msdk.foundation.controller.c.n().i();
            } catch (Exception unused) {
                q0.b("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + str);
            }
            if (a1.a(str3) && context != null) {
                str3 = context.getPackageName();
            }
            if (a1.a(str3) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, str3);
        } catch (Exception unused2) {
            me4.u("Resource not found resName:", str, "ResourceUtil");
            return -1;
        }
    }

    public static boolean a(int i) {
        return (i == -1 || ((-16777216) & i) == 0 || (i & 16711680) == 0) ? false : true;
    }

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e) {
                w1l.v(e, new StringBuilder("Resource error:"), "ResourceUtil");
            }
        }
        return null;
    }
}
