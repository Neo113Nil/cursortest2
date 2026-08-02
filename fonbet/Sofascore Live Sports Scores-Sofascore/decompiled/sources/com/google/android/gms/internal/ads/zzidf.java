package com.google.android.gms.internal.ads;

import com.ironsource.Ua;
import defpackage.wt3;
import java.math.BigDecimal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzidf {
    public static BigDecimal a(String str) {
        b(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < Ua.s) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void b(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        throw new NumberFormatException(wt3.m("Number string too large: ", substring, new StringBuilder(substring.length() + 28), "..."));
    }
}
