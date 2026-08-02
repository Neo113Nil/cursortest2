package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29010a = c.a.a("nm", "hd", "it");

    public static com.airbnb.lottie.model.content.q a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29010a);
            if (U10 == 0) {
                str = cVar.M0();
            } else if (U10 == 1) {
                z10 = cVar.k();
            } else if (U10 != 2) {
                cVar.C();
            } else {
                cVar.p();
                while (cVar.hasNext()) {
                    com.airbnb.lottie.model.content.c a10 = AbstractC2954h.a(cVar, c2940j);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                cVar.n();
            }
        }
        return new com.airbnb.lottie.model.content.q(str, arrayList, z10);
    }
}
