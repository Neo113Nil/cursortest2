package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.parser.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2948b {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29016a = c.a.a("s", "a");

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29017b = c.a.a("s", com.bumptech.glide.gifdecoder.e.f29601m, "o", "r");

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f29018c = c.a.a("fc", "sc", "sw", "t", "o");

    public static F3.k a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        cVar.m();
        F3.m mVar = null;
        F3.l lVar = null;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29016a);
            if (U10 == 0) {
                lVar = b(cVar, c2940j);
            } else if (U10 != 1) {
                cVar.w0();
                cVar.C();
            } else {
                mVar = c(cVar, c2940j);
            }
        }
        cVar.t();
        return new F3.k(mVar, lVar);
    }

    public static F3.l b(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        cVar.m();
        F3.d dVar = null;
        F3.d dVar2 = null;
        F3.d dVar3 = null;
        com.airbnb.lottie.model.content.u uVar = null;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29017b);
            if (U10 == 0) {
                dVar = AbstractC2950d.h(cVar, c2940j);
            } else if (U10 == 1) {
                dVar2 = AbstractC2950d.h(cVar, c2940j);
            } else if (U10 == 2) {
                dVar3 = AbstractC2950d.h(cVar, c2940j);
            } else if (U10 != 3) {
                cVar.w0();
                cVar.C();
            } else {
                int nextInt = cVar.nextInt();
                if (nextInt == 1 || nextInt == 2) {
                    uVar = nextInt == 1 ? com.airbnb.lottie.model.content.u.PERCENT : com.airbnb.lottie.model.content.u.INDEX;
                } else {
                    c2940j.a("Unsupported text range units: " + nextInt);
                    uVar = com.airbnb.lottie.model.content.u.INDEX;
                }
            }
        }
        cVar.t();
        if (dVar == null && dVar2 != null) {
            dVar = new F3.d(Collections.singletonList(new G3.a(0)));
        }
        return new F3.l(dVar, dVar2, dVar3, uVar);
    }

    public static F3.m c(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        cVar.m();
        F3.a aVar = null;
        F3.a aVar2 = null;
        F3.b bVar = null;
        F3.b bVar2 = null;
        F3.d dVar = null;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29018c);
            if (U10 == 0) {
                aVar = AbstractC2950d.c(cVar, c2940j);
            } else if (U10 == 1) {
                aVar2 = AbstractC2950d.c(cVar, c2940j);
            } else if (U10 == 2) {
                bVar = AbstractC2950d.e(cVar, c2940j);
            } else if (U10 == 3) {
                bVar2 = AbstractC2950d.e(cVar, c2940j);
            } else if (U10 != 4) {
                cVar.w0();
                cVar.C();
            } else {
                dVar = AbstractC2950d.h(cVar, c2940j);
            }
        }
        cVar.t();
        return new F3.m(aVar, aVar2, bVar, bVar2, dVar);
    }
}
