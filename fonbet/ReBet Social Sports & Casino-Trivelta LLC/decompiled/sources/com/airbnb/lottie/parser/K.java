package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static c.a f29011a = c.a.a("nm", "ind", "ks", "hd");

    public static com.airbnb.lottie.model.content.r a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        F3.h hVar = null;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29011a);
            if (U10 == 0) {
                str = cVar.M0();
            } else if (U10 == 1) {
                i10 = cVar.nextInt();
            } else if (U10 == 2) {
                hVar = AbstractC2950d.k(cVar, c2940j);
            } else if (U10 != 3) {
                cVar.C();
            } else {
                z10 = cVar.k();
            }
        }
        return new com.airbnb.lottie.model.content.r(str, i10, hVar, z10);
    }
}
