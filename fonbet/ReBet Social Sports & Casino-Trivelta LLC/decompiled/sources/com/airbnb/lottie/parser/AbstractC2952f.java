package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;

/* renamed from: com.airbnb.lottie.parser.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2952f {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29023a = c.a.a("nm", "p", "s", "hd", W9.d.f13160a);

    public static com.airbnb.lottie.model.content.b a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, int i10) {
        boolean z10 = i10 == 3;
        boolean z11 = false;
        String str = null;
        F3.o oVar = null;
        F3.f fVar = null;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29023a);
            if (U10 == 0) {
                str = cVar.M0();
            } else if (U10 == 1) {
                oVar = AbstractC2947a.b(cVar, c2940j);
            } else if (U10 == 2) {
                fVar = AbstractC2950d.i(cVar, c2940j);
            } else if (U10 == 3) {
                z11 = cVar.k();
            } else if (U10 != 4) {
                cVar.w0();
                cVar.C();
            } else {
                z10 = cVar.nextInt() == 3;
            }
        }
        return new com.airbnb.lottie.model.content.b(str, oVar, fVar, z10, z11);
    }
}
