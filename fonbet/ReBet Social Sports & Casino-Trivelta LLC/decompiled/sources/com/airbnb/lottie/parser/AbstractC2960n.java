package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;

/* renamed from: com.airbnb.lottie.parser.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2960n {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29068a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    public static E3.c a(com.airbnb.lottie.parser.moshi.c cVar) {
        cVar.m();
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        String str3 = null;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29068a);
            if (U10 == 0) {
                str = cVar.M0();
            } else if (U10 == 1) {
                str3 = cVar.M0();
            } else if (U10 == 2) {
                str2 = cVar.M0();
            } else if (U10 != 3) {
                cVar.w0();
                cVar.C();
            } else {
                f10 = (float) cVar.nextDouble();
            }
        }
        cVar.t();
        return new E3.c(str, str3, str2, f10);
    }
}
