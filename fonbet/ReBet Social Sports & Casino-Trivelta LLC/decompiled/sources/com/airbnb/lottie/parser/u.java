package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static c.a f29081a = c.a.a("k");

    public static List a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, float f10, N n10, boolean z10) {
        com.airbnb.lottie.parser.moshi.c cVar2;
        C2940j c2940j2;
        float f11;
        N n11;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (cVar.B() == c.b.STRING) {
            c2940j.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.m();
        while (cVar.hasNext()) {
            if (cVar.U(f29081a) != 0) {
                cVar.C();
            } else if (cVar.B() == c.b.BEGIN_ARRAY) {
                cVar.p();
                if (cVar.B() == c.b.NUMBER) {
                    com.airbnb.lottie.parser.moshi.c cVar3 = cVar;
                    C2940j c2940j3 = c2940j;
                    float f12 = f10;
                    N n12 = n10;
                    boolean z12 = z10;
                    G3.a c10 = t.c(cVar3, c2940j3, f12, n12, false, z12);
                    cVar2 = cVar3;
                    c2940j2 = c2940j3;
                    f11 = f12;
                    n11 = n12;
                    z11 = z12;
                    arrayList.add(c10);
                } else {
                    cVar2 = cVar;
                    c2940j2 = c2940j;
                    f11 = f10;
                    n11 = n10;
                    z11 = z10;
                    while (cVar2.hasNext()) {
                        arrayList.add(t.c(cVar2, c2940j2, f11, n11, true, z11));
                    }
                }
                cVar2.n();
                cVar = cVar2;
                c2940j = c2940j2;
                f10 = f11;
                n10 = n11;
                z10 = z11;
            } else {
                com.airbnb.lottie.parser.moshi.c cVar4 = cVar;
                arrayList.add(t.c(cVar4, c2940j, f10, n10, false, z10));
                cVar = cVar4;
            }
        }
        cVar.t();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i10;
        Object obj;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            G3.a aVar = (G3.a) list.get(i11);
            i11++;
            G3.a aVar2 = (G3.a) list.get(i11);
            aVar.f3861h = Float.valueOf(aVar2.f3860g);
            if (aVar.f3856c == null && (obj = aVar2.f3855b) != null) {
                aVar.f3856c = obj;
                if (aVar instanceof B3.i) {
                    ((B3.i) aVar).j();
                }
            }
        }
        G3.a aVar3 = (G3.a) list.get(i10);
        if ((aVar3.f3855b == null || aVar3.f3856c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
