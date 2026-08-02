package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;
import xsna.dq;
import xsna.kft0;

/* compiled from: ResourceUtil.java */
/* loaded from: classes13.dex */
public class i0 {
    public static boolean a(int i) {
        return (i == -1 || ((-16777216) & i) == 0 || (i & 16711680) == 0) ? false : true;
    }

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
            dq.i("Resource not found resName:", str, "ResourceUtil");
            return -1;
        }
    }

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e) {
                kft0.a(e, new StringBuilder("Resource error:"), "ResourceUtil");
            }
        }
        return null;
    }
}
