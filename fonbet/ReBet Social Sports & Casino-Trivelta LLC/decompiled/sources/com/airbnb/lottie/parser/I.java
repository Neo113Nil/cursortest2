package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29009a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static com.airbnb.lottie.model.content.p a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        F3.d dVar = null;
        String str = null;
        F3.a aVar = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 1;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29009a);
            if (U10 == 0) {
                str = cVar.M0();
            } else if (U10 == 1) {
                aVar = AbstractC2950d.c(cVar, c2940j);
            } else if (U10 == 2) {
                dVar = AbstractC2950d.h(cVar, c2940j);
            } else if (U10 == 3) {
                z10 = cVar.k();
            } else if (U10 == 4) {
                i10 = cVar.nextInt();
            } else if (U10 != 5) {
                cVar.w0();
                cVar.C();
            } else {
                z11 = cVar.k();
            }
        }
        if (dVar == null) {
            dVar = new F3.d(Collections.singletonList(new G3.a(100)));
        }
        return new com.airbnb.lottie.model.content.p(str, z10, i10 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z11);
    }
}
