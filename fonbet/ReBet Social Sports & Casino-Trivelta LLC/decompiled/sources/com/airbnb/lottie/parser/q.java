package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29072a = c.a.a("nm", "g", "o", "t", "s", com.bumptech.glide.gifdecoder.e.f29601m, "w", "lc", "lj", "ml", "hd", W9.d.f13160a);

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29073b = c.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f29074c = c.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0027. Please report as an issue. */
    public static com.airbnb.lottie.model.content.f a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        F3.d dVar;
        ArrayList arrayList = new ArrayList();
        com.airbnb.lottie.model.content.g gVar = null;
        String str = null;
        F3.c cVar2 = null;
        F3.f fVar = null;
        F3.f fVar2 = null;
        F3.b bVar = null;
        s.b bVar2 = null;
        s.c cVar3 = null;
        F3.b bVar3 = null;
        float f10 = 0.0f;
        boolean z10 = false;
        F3.d dVar2 = null;
        while (cVar.hasNext()) {
            com.airbnb.lottie.model.content.g gVar2 = gVar;
            switch (cVar.U(f29072a)) {
                case 0:
                    str = cVar.M0();
                    gVar = gVar2;
                    break;
                case 1:
                    dVar = dVar2;
                    cVar.m();
                    int i10 = -1;
                    while (cVar.hasNext()) {
                        int U10 = cVar.U(f29073b);
                        if (U10 == 0) {
                            i10 = cVar.nextInt();
                        } else if (U10 != 1) {
                            cVar.w0();
                            cVar.C();
                        } else {
                            cVar2 = AbstractC2950d.g(cVar, c2940j, i10);
                        }
                    }
                    cVar.t();
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                case 2:
                    dVar2 = AbstractC2950d.h(cVar, c2940j);
                    gVar = gVar2;
                    break;
                case 3:
                    dVar = dVar2;
                    gVar = cVar.nextInt() == 1 ? com.airbnb.lottie.model.content.g.LINEAR : com.airbnb.lottie.model.content.g.RADIAL;
                    dVar2 = dVar;
                    break;
                case 4:
                    fVar = AbstractC2950d.i(cVar, c2940j);
                    gVar = gVar2;
                    break;
                case 5:
                    fVar2 = AbstractC2950d.i(cVar, c2940j);
                    gVar = gVar2;
                    break;
                case 6:
                    bVar = AbstractC2950d.e(cVar, c2940j);
                    gVar = gVar2;
                    break;
                case 7:
                    dVar = dVar2;
                    bVar2 = s.b.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                case 8:
                    dVar = dVar2;
                    cVar3 = s.c.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                case 9:
                    dVar = dVar2;
                    f10 = (float) cVar.nextDouble();
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                case 10:
                    z10 = cVar.k();
                    gVar = gVar2;
                    break;
                case 11:
                    cVar.p();
                    while (cVar.hasNext()) {
                        cVar.m();
                        String str2 = null;
                        F3.b bVar4 = null;
                        while (cVar.hasNext()) {
                            int U11 = cVar.U(f29074c);
                            if (U11 != 0) {
                                F3.d dVar3 = dVar2;
                                if (U11 != 1) {
                                    cVar.w0();
                                    cVar.C();
                                } else {
                                    bVar4 = AbstractC2950d.e(cVar, c2940j);
                                }
                                dVar2 = dVar3;
                            } else {
                                str2 = cVar.M0();
                            }
                        }
                        F3.d dVar4 = dVar2;
                        cVar.t();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else if (str2.equals(W9.d.f13160a) || str2.equals("g")) {
                            c2940j.u(true);
                            arrayList.add(bVar4);
                            dVar2 = dVar4;
                        }
                        dVar2 = dVar4;
                    }
                    dVar = dVar2;
                    cVar.n();
                    if (arrayList.size() == 1) {
                        arrayList.add((F3.b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                default:
                    cVar.w0();
                    cVar.C();
                    gVar = gVar2;
                    break;
            }
        }
        F3.d dVar5 = dVar2;
        return new com.airbnb.lottie.model.content.f(str, gVar, cVar2, dVar5 == null ? new F3.d(Collections.singletonList(new G3.a(100))) : dVar5, fVar, fVar2, bVar, bVar2, cVar3, f10, arrayList, bVar3, z10);
    }
}
