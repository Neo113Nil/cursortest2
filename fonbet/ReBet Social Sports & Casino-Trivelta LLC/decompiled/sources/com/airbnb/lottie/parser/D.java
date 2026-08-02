package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29003a = c.a.a("nm", "p", "s", "r", "hd");

    public static com.airbnb.lottie.model.content.l a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        String str = null;
        F3.o oVar = null;
        F3.f fVar = null;
        F3.b bVar = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29003a);
            if (U10 == 0) {
                str = cVar.M0();
            } else if (U10 == 1) {
                oVar = AbstractC2947a.b(cVar, c2940j);
            } else if (U10 == 2) {
                fVar = AbstractC2950d.i(cVar, c2940j);
            } else if (U10 == 3) {
                bVar = AbstractC2950d.e(cVar, c2940j);
            } else if (U10 != 4) {
                cVar.C();
            } else {
                z10 = cVar.k();
            }
        }
        return new com.airbnb.lottie.model.content.l(str, oVar, fVar, bVar, z10);
    }
}
