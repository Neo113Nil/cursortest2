package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public class a4 {
    public static int a = 504;
    public static String b;
    private static volatile String c;
    private static Context d;

    public static synchronized void a(byte[] bArr) {
        synchronized (a4.class) {
            if (bArr != null) {
                if (bArr.length > 0) {
                    Object meta = com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, d, bArr);
                    if ((meta instanceof Integer) && ((Integer) meta).intValue() == 0) {
                        a = 200;
                    } else if (meta instanceof String) {
                        c = (String) meta;
                        a = 200;
                    }
                }
            }
        }
    }

    public static void b() {
        Context context = d;
        if (context != null) {
            ar.b(new ao(context, Sdk.SDKError.Reason.MRAID_ERROR_VALUE, null));
            a = 102;
            com.pgl.ssdk.ces.b e = com.pgl.ssdk.ces.b.e();
            if (e != null) {
                e.a("");
            }
        }
    }

    public static void a(Context context, String str) {
        if (d == null) {
            d = context;
        }
        int i = a;
        if (i == 102 || i == 202 || i == 200) {
            return;
        }
        b = str;
        a = 102;
        ar.b(new ao(context, Sdk.SDKError.Reason.MRAID_ERROR_VALUE, null));
    }

    public static synchronized String a() {
        String str;
        synchronized (a4.class) {
            try {
                if (TextUtils.isEmpty(c)) {
                    c = (String) com.pgl.ssdk.ces.a.meta(303, d, null);
                }
                str = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
