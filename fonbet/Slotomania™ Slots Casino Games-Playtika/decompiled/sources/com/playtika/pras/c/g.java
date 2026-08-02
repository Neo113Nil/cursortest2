package com.playtika.pras.c;

import com.ironsource.B5;

/* loaded from: classes7.dex */
public abstract class g {
    public static String a(String str, String str2) {
        String lowerCase = str.toLowerCase();
        if (str2 != null) {
            return str2.replaceAll("/+$", "");
        }
        if (lowerCase.equals(B5.t)) {
            return "https://epayments.playtika.com";
        }
        return com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + lowerCase + "-api-epayments.playtika.com";
    }
}
