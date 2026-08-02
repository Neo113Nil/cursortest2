package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ν, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0356 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WeakReference f897;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m202(String str, String str2, String str3, String str4) {
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            String str5 = str3 + StringFog.decrypt("AQ==\n", "OzDeQRDTvyg=\n") + str;
            AbstractC0420.m254(str, StringFog.decrypt("B8cYbqpdYrQ23Uo=\n", "QrVqAdh9Fd0=\n") + str5 + StringFog.decrypt("7YTAcSzQZsS5hMFrZw==\n", "ze2uBUm3FKU=\n"), false);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str4 != null ? "\n".concat(str4) : "");
            AbstractC0420.m254(str, sb.toString(), false);
            C0298 c0298 = (C0298) f897.get();
            if (c0298 != null) {
                c0298.m175(str, str2, str5, str4, null, false);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m205(String str, String str2, Throwable th, boolean z, boolean z2, boolean z3) {
        try {
            if (z) {
                AbstractC0420.m254(str, str2, z3);
                if (th != null) {
                    AbstractC0420.m252(str, str, StringFog.decrypt("8+0lVzXp/Ks=\n", "t4hRNlyFj5E=\n"), th, null, z3);
                }
            } else {
                AbstractC0420.m252(str, str, str2, th, null, z3);
            }
            m203(str, str2, StringFog.decrypt("jRaAu6WepyOyXg==\n", "2WTh2MD8xkA=\n") + str, th, null, null, false, z2, z3);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m203(String str, String str2, String str3, Throwable th, AbstractC0463 abstractC0463, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        String str4;
        String stackTraceString;
        if (z) {
            try {
                String str5 = str3 + StringFog.decrypt("CQ==\n", "M7VxAmnsY9Q=\n") + str;
                AbstractC0420.m252(str, str, str2 + StringFog.decrypt("bXXBbBEkxw==\n", "TV2iA3VB594=\n") + str5 + StringFog.decrypt("Hw==\n", "NjU2RwNY0UU=\n"), th, abstractC0463, z3);
                str4 = str5;
            } catch (Throwable unused) {
                return;
            }
        } else {
            str4 = str3;
        }
        C0298 c0298 = (C0298) f897.get();
        if (c0298 != null) {
            if (abstractC0463 != null) {
                stackTraceString = abstractC0463.toString();
            } else if (th instanceof AbstractC0463) {
                stackTraceString = th.toString();
            } else {
                stackTraceString = Log.getStackTraceString(th);
            }
            c0298.m175(str, str2, str4, stackTraceString, jSONObject, z2);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m204(String str, String str2, Throwable th, boolean z) {
        try {
            m205(str, str2, th, z, false, false);
        } catch (Throwable unused) {
        }
    }
}
