package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;

/* renamed from: com.airbnb.lottie.parser.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2951e {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29021a = c.a.a("ef");

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29022b = c.a.a("ty", "v");

    public static com.airbnb.lottie.model.content.a a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        cVar.m();
        com.airbnb.lottie.model.content.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (cVar.hasNext()) {
                int U10 = cVar.U(f29022b);
                if (U10 != 0) {
                    if (U10 != 1) {
                        cVar.w0();
                        cVar.C();
                    } else if (z10) {
                        aVar = new com.airbnb.lottie.model.content.a(AbstractC2950d.e(cVar, c2940j));
                    } else {
                        cVar.C();
                    }
                } else if (cVar.nextInt() == 0) {
                    z10 = true;
                }
            }
            cVar.t();
            return aVar;
        }
    }

    public static com.airbnb.lottie.model.content.a b(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        com.airbnb.lottie.model.content.a aVar = null;
        while (cVar.hasNext()) {
            if (cVar.U(f29021a) != 0) {
                cVar.w0();
                cVar.C();
            } else {
                cVar.p();
                while (cVar.hasNext()) {
                    com.airbnb.lottie.model.content.a a10 = a(cVar, c2940j);
                    if (a10 != null) {
                        aVar = a10;
                    }
                }
                cVar.n();
            }
        }
        return aVar;
    }
}
