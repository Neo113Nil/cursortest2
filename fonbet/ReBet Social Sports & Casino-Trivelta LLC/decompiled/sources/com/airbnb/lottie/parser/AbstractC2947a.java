package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import lb.C5444x;

/* renamed from: com.airbnb.lottie.parser.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2947a {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29015a = c.a.a("k", C5444x.f55808b, "y");

    public static F3.e a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        ArrayList arrayList = new ArrayList();
        if (cVar.B() == c.b.BEGIN_ARRAY) {
            cVar.p();
            while (cVar.hasNext()) {
                arrayList.add(z.a(cVar, c2940j));
            }
            cVar.n();
            u.b(arrayList);
        } else {
            arrayList.add(new G3.a(s.e(cVar, com.airbnb.lottie.utils.z.e())));
        }
        return new F3.e(arrayList);
    }

    public static F3.o b(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        cVar.m();
        F3.e eVar = null;
        F3.b bVar = null;
        boolean z10 = false;
        F3.b bVar2 = null;
        while (cVar.B() != c.b.END_OBJECT) {
            int U10 = cVar.U(f29015a);
            if (U10 == 0) {
                eVar = a(cVar, c2940j);
            } else if (U10 != 1) {
                if (U10 != 2) {
                    cVar.w0();
                    cVar.C();
                } else if (cVar.B() == c.b.STRING) {
                    cVar.C();
                    z10 = true;
                } else {
                    bVar = AbstractC2950d.e(cVar, c2940j);
                }
            } else if (cVar.B() == c.b.STRING) {
                cVar.C();
                z10 = true;
            } else {
                bVar2 = AbstractC2950d.e(cVar, c2940j);
            }
        }
        cVar.t();
        if (z10) {
            c2940j.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new F3.i(bVar2, bVar);
    }
}
