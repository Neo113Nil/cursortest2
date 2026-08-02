package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.model.content.k;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29002a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", W9.d.f13160a);

    public static com.airbnb.lottie.model.content.k a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, int i10) {
        boolean z10 = false;
        boolean z11 = i10 == 3;
        String str = null;
        k.a aVar = null;
        F3.b bVar = null;
        F3.o oVar = null;
        F3.b bVar2 = null;
        F3.b bVar3 = null;
        F3.b bVar4 = null;
        F3.b bVar5 = null;
        F3.b bVar6 = null;
        while (cVar.hasNext()) {
            switch (cVar.U(f29002a)) {
                case 0:
                    str = cVar.M0();
                    break;
                case 1:
                    aVar = k.a.b(cVar.nextInt());
                    break;
                case 2:
                    bVar = AbstractC2950d.f(cVar, c2940j, false);
                    break;
                case 3:
                    oVar = AbstractC2947a.b(cVar, c2940j);
                    break;
                case 4:
                    bVar2 = AbstractC2950d.f(cVar, c2940j, false);
                    break;
                case 5:
                    bVar4 = AbstractC2950d.e(cVar, c2940j);
                    break;
                case 6:
                    bVar6 = AbstractC2950d.f(cVar, c2940j, false);
                    break;
                case 7:
                    bVar3 = AbstractC2950d.e(cVar, c2940j);
                    break;
                case 8:
                    bVar5 = AbstractC2950d.f(cVar, c2940j, false);
                    break;
                case 9:
                    z10 = cVar.k();
                    break;
                case 10:
                    if (cVar.nextInt() != 3) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                default:
                    cVar.w0();
                    cVar.C();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.k(str, aVar, bVar, oVar, bVar2, bVar3, bVar4, bVar5, bVar6, z10, z11);
    }
}
