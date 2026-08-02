package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29089a = c.a.a("nm", "mm", "hd");

    public static com.airbnb.lottie.model.content.j a(com.airbnb.lottie.parser.moshi.c cVar) {
        String str = null;
        boolean z10 = false;
        j.a aVar = null;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29089a);
            if (U10 == 0) {
                str = cVar.M0();
            } else if (U10 == 1) {
                aVar = j.a.b(cVar.nextInt());
            } else if (U10 != 2) {
                cVar.w0();
                cVar.C();
            } else {
                z10 = cVar.k();
            }
        }
        return new com.airbnb.lottie.model.content.j(str, aVar, z10);
    }
}
