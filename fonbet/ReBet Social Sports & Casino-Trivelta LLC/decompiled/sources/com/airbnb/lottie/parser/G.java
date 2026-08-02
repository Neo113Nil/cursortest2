package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes.dex */
public class G implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final G f29006a = new G();

    @Override // com.airbnb.lottie.parser.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public G3.d a(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        boolean z10 = cVar.B() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.p();
        }
        float nextDouble = (float) cVar.nextDouble();
        float nextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.C();
        }
        if (z10) {
            cVar.n();
        }
        return new G3.d((nextDouble / 100.0f) * f10, (nextDouble2 / 100.0f) * f10);
    }
}
