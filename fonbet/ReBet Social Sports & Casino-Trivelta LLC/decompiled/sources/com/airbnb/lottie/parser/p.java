package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29070a = c.a.a("nm", "g", "o", "t", "s", com.bumptech.glide.gifdecoder.e.f29601m, "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29071b = c.a.a("p", "k");

    public static com.airbnb.lottie.model.content.e a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        F3.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        com.airbnb.lottie.model.content.g gVar = null;
        F3.c cVar2 = null;
        F3.f fVar = null;
        F3.f fVar2 = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            switch (cVar.U(f29070a)) {
                case 0:
                    str = cVar.M0();
                    break;
                case 1:
                    cVar.m();
                    int i10 = -1;
                    while (cVar.hasNext()) {
                        int U10 = cVar.U(f29071b);
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
                    break;
                case 2:
                    dVar = AbstractC2950d.h(cVar, c2940j);
                    break;
                case 3:
                    gVar = cVar.nextInt() == 1 ? com.airbnb.lottie.model.content.g.LINEAR : com.airbnb.lottie.model.content.g.RADIAL;
                    break;
                case 4:
                    fVar = AbstractC2950d.i(cVar, c2940j);
                    break;
                case 5:
                    fVar2 = AbstractC2950d.i(cVar, c2940j);
                    break;
                case 6:
                    fillType = cVar.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z10 = cVar.k();
                    break;
                default:
                    cVar.w0();
                    cVar.C();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new F3.d(Collections.singletonList(new G3.a(100)));
        }
        return new com.airbnb.lottie.model.content.e(str, gVar, fillType, cVar2, dVar, fVar, fVar2, null, null, z10);
    }
}
