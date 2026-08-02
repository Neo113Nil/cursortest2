package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29012a = c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", W9.d.f13160a);

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29013b = c.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [F3.b] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public static com.airbnb.lottie.model.content.s a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        ?? r15;
        ArrayList arrayList = new ArrayList();
        String str = null;
        s.b bVar = null;
        s.c cVar2 = null;
        F3.b bVar2 = null;
        F3.a aVar = null;
        F3.b bVar3 = null;
        String str2 = null;
        float f10 = 0.0f;
        boolean z10 = false;
        F3.d dVar = null;
        while (cVar.hasNext()) {
            switch (cVar.U(f29012a)) {
                case 0:
                    str = cVar.M0();
                    break;
                case 1:
                    aVar = AbstractC2950d.c(cVar, c2940j);
                    break;
                case 2:
                    bVar3 = AbstractC2950d.e(cVar, c2940j);
                    break;
                case 3:
                    dVar = AbstractC2950d.h(cVar, c2940j);
                    break;
                case 4:
                    bVar = s.b.values()[cVar.nextInt() - 1];
                    break;
                case 5:
                    cVar2 = s.c.values()[cVar.nextInt() - 1];
                    break;
                case 6:
                    f10 = (float) cVar.nextDouble();
                    break;
                case 7:
                    z10 = cVar.k();
                    break;
                case 8:
                    cVar.p();
                    while (cVar.hasNext()) {
                        cVar.m();
                        String str3 = str2;
                        r15 = str3;
                        while (cVar.hasNext()) {
                            int U10 = cVar.U(f29013b);
                            if (U10 == 0) {
                                str3 = cVar.M0();
                            } else if (U10 != 1) {
                                cVar.w0();
                                cVar.C();
                            } else {
                                r15 = AbstractC2950d.e(cVar, c2940j);
                            }
                            r15 = r15;
                        }
                        cVar.t();
                        str3.getClass();
                        switch (str3) {
                            case "d":
                            case "g":
                                c2940j.u(true);
                                arrayList.add(r15);
                                break;
                            case "o":
                                bVar2 = r15;
                                break;
                        }
                        str2 = null;
                    }
                    cVar.n();
                    if (arrayList.size() == 1) {
                        arrayList.add((F3.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    cVar.C();
                    continue;
            }
            str2 = null;
        }
        if (dVar == null) {
            dVar = new F3.d(Collections.singletonList(new G3.a(100)));
        }
        if (bVar == null) {
            bVar = s.b.BUTT;
        }
        if (cVar2 == null) {
            cVar2 = s.c.MITER;
        }
        return new com.airbnb.lottie.model.content.s(str, bVar2, arrayList, aVar, dVar, bVar3, bVar, cVar2, f10, z10);
    }
}
