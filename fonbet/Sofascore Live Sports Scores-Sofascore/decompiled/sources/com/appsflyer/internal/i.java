package com.appsflyer.internal;

import com.appsflyer.sdk_base.referrer.Payload;
import com.bytedance.sdk.openadsdk.core.pq;
import defpackage.av8;
import defpackage.bkh;
import defpackage.ff3;
import defpackage.hsk;
import defpackage.nq8;
import defpackage.utc;
import defpackage.waa;
import defpackage.wt3;
import defpackage.zkh;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static final int a(int i) {
        com.facebook.w wVar = com.facebook.w.a;
        com.facebook.internal.h.k();
        return wt3.C(i) + com.facebook.w.k;
    }

    public static /* synthetic */ boolean b(int i) {
        switch (i) {
            case 1:
                return true;
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
                return true;
            case 6:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "cancel";
        }
        if (i == 3) {
            return "error";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "only_me";
        }
        if (i == 3) {
            return "friends";
        }
        if (i == 4) {
            return "everyone";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return Payload.SOURCE_FACEBOOK;
        }
        if (i == 2) {
            return Payload.SOURCE_INSTAGRAM;
        }
        throw null;
    }

    public static zkh f(av8 av8Var, hsk hskVar, ff3 ff3Var, av8 av8Var2) {
        waa.K(av8Var, hskVar, ff3Var);
        av8Var.r();
        return new zkh(av8Var2);
    }

    public static String g(int i, String str, String str2, String str3, String str4) {
        return str + i + str2 + str3 + str4;
    }

    public static String h(String str, String str2, String str3) {
        str.getClass();
        return str2 + str3;
    }

    public static String i(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String j(String str, boolean z) {
        return str + z;
    }

    public static String k(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    public static HashMap l(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static void m(int i, pq.AnonymousClass1 anonymousClass1, String str, int i2, String str2) {
        anonymousClass1.put(Integer.valueOf(i), str);
        anonymousClass1.put(Integer.valueOf(i2), str2);
    }

    public static void n(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(j);
    }

    public static void o(av8 av8Var, boolean z, utc utcVar, float f, av8 av8Var2) {
        av8Var.s(z);
        nq8.h(av8Var2, bkh.p(utcVar, f));
    }

    public static void p(av8 av8Var, boolean z, boolean z2, boolean z3, boolean z4) {
        av8Var.s(z);
        av8Var.s(z2);
        av8Var.s(z3);
        av8Var.s(z4);
    }

    public static void q(StringBuilder sb, Boolean bool, String str, Boolean bool2, String str2) {
        sb.append(bool);
        sb.append(str);
        sb.append(bool2);
        sb.append(str2);
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "S256";
        }
        if (i == 2) {
            return "PLAIN";
        }
        throw null;
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ONLY_ME";
        }
        if (i == 3) {
            return "FRIENDS";
        }
        if (i == 4) {
            return "EVERYONE";
        }
        throw null;
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "NATIVE_WITH_FALLBACK";
            case 2:
                return "NATIVE_ONLY";
            case 3:
                return "KATANA_ONLY";
            case 4:
                return "WEB_ONLY";
            case 5:
                return "DIALOG_ONLY";
            case 6:
                return "DEVICE_AUTH";
            default:
                throw null;
        }
    }
}
