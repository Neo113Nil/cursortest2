package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import com.ironsource.U3;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo {
    private static boolean pcc = false;
    private static String sf = "";

    public static void gm(String str, Object... objArr) {
        if (pcc && objArr != null) {
            sf(str);
            pcc(objArr);
        }
    }

    private static String pcc(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    private static String sf(String str) {
        return TextUtils.isEmpty(sf) ? str : pcc(fc6.o(new StringBuilder(U3.j.d), sf, "]-[", str, U3.j.e));
    }

    public static void gm(String str, String str2) {
        if (pcc && str2 != null) {
            sf(str);
        }
    }

    public static void sf(String str, String str2) {
        if (pcc && str2 != null) {
            sf(str);
        }
    }

    public static void sf(String str, Object... objArr) {
        if (pcc && objArr != null) {
            sf(str);
            pcc(objArr);
        }
    }

    public static void sf() {
        pcc = false;
    }

    public static void pcc(String str, String str2) {
        if (pcc && str2 != null) {
            sf(str);
        }
    }

    public static void pcc(String str, Object... objArr) {
        if (pcc && objArr != null) {
            sf(str);
            pcc(objArr);
        }
    }

    public static void pcc(String str, String str2, Throwable th) {
        if (pcc) {
            if (str2 == null && th == null) {
                return;
            }
            sf(str);
        }
    }

    public static void pcc(String str) {
        sf = str;
    }

    public static void pcc() {
        pcc = true;
    }
}
