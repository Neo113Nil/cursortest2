package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29005a = c.a.a("nm", "r", "hd");

    public static com.airbnb.lottie.model.content.n a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        boolean z10 = false;
        String str = null;
        F3.b bVar = null;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29005a);
            if (U10 == 0) {
                str = cVar.M0();
            } else if (U10 == 1) {
                bVar = AbstractC2950d.f(cVar, c2940j, true);
            } else if (U10 != 2) {
                cVar.C();
            } else {
                z10 = cVar.k();
            }
        }
        if (z10) {
            return null;
        }
        return new com.airbnb.lottie.model.content.n(str, bVar);
    }
}
