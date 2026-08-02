package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29004a = c.a.a("nm", "c", "o", "tr", "hd");

    public static com.airbnb.lottie.model.content.m a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        String str = null;
        F3.b bVar = null;
        F3.b bVar2 = null;
        F3.n nVar = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29004a);
            if (U10 == 0) {
                str = cVar.M0();
            } else if (U10 == 1) {
                bVar = AbstractC2950d.f(cVar, c2940j, false);
            } else if (U10 == 2) {
                bVar2 = AbstractC2950d.f(cVar, c2940j, false);
            } else if (U10 == 3) {
                nVar = AbstractC2949c.h(cVar, c2940j);
            } else if (U10 != 4) {
                cVar.C();
            } else {
                z10 = cVar.k();
            }
        }
        return new com.airbnb.lottie.model.content.m(str, bVar, bVar2, nVar, z10);
    }
}
