package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.model.content.t;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29014a = c.a.a("s", com.bumptech.glide.gifdecoder.e.f29601m, "o", "nm", X9.m.f13664a, "hd");

    public static com.airbnb.lottie.model.content.t a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        String str = null;
        t.a aVar = null;
        F3.b bVar = null;
        F3.b bVar2 = null;
        F3.b bVar3 = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29014a);
            if (U10 == 0) {
                bVar = AbstractC2950d.f(cVar, c2940j, false);
            } else if (U10 == 1) {
                bVar2 = AbstractC2950d.f(cVar, c2940j, false);
            } else if (U10 == 2) {
                bVar3 = AbstractC2950d.f(cVar, c2940j, false);
            } else if (U10 == 3) {
                str = cVar.M0();
            } else if (U10 == 4) {
                aVar = t.a.b(cVar.nextInt());
            } else if (U10 != 5) {
                cVar.C();
            } else {
                z10 = cVar.k();
            }
        }
        return new com.airbnb.lottie.model.content.t(str, aVar, bVar, bVar2, bVar3, z10);
    }
}
