package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;

/* renamed from: com.airbnb.lottie.parser.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2949c {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29019a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29020b = c.a.a("k");

    public static void a(F3.b bVar, C2940j c2940j) {
        Float valueOf = Float.valueOf(0.0f);
        if (bVar.b().isEmpty()) {
            bVar.b().add(new G3.a(c2940j, valueOf, valueOf, null, 0.0f, Float.valueOf(c2940j.f())));
        } else if (((G3.a) bVar.b().get(0)).f3855b == null) {
            bVar.b().set(0, new G3.a(c2940j, valueOf, valueOf, null, 0.0f, Float.valueOf(c2940j.f())));
        }
    }

    public static boolean b(F3.e eVar) {
        if (eVar != null) {
            return eVar.c() && ((PointF) ((G3.a) eVar.b().get(0)).f3855b).equals(0.0f, 0.0f);
        }
        return true;
    }

    public static boolean c(F3.o oVar) {
        if (oVar != null) {
            return !(oVar instanceof F3.i) && oVar.c() && ((PointF) ((G3.a) oVar.b().get(0)).f3855b).equals(0.0f, 0.0f);
        }
        return true;
    }

    public static boolean d(F3.b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((G3.a) bVar.b().get(0)).f3855b).floatValue() == 0.0f;
        }
        return true;
    }

    public static boolean e(F3.g gVar) {
        if (gVar != null) {
            return gVar.c() && ((G3.d) ((G3.a) gVar.b().get(0)).f3855b).a(1.0f, 1.0f);
        }
        return true;
    }

    public static boolean f(F3.b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((G3.a) bVar.b().get(0)).f3855b).floatValue() == 0.0f;
        }
        return true;
    }

    public static boolean g(F3.b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((G3.a) bVar.b().get(0)).f3855b).floatValue() == 0.0f;
        }
        return true;
    }

    public static F3.n h(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        boolean z10 = cVar.B() == c.b.BEGIN_OBJECT;
        if (z10) {
            cVar.m();
        }
        F3.e eVar = null;
        F3.o oVar = null;
        F3.b bVar = null;
        F3.g gVar = null;
        F3.b bVar2 = null;
        F3.b bVar3 = null;
        F3.b bVar4 = null;
        F3.b bVar5 = null;
        F3.b bVar6 = null;
        F3.d dVar = null;
        F3.b bVar7 = null;
        F3.b bVar8 = null;
        while (cVar.hasNext()) {
            switch (cVar.U(f29019a)) {
                case 0:
                    cVar.m();
                    while (cVar.hasNext()) {
                        if (cVar.U(f29020b) != 0) {
                            cVar.w0();
                            cVar.C();
                        } else {
                            eVar = AbstractC2947a.a(cVar, c2940j);
                        }
                    }
                    cVar.t();
                    break;
                case 1:
                    oVar = AbstractC2947a.b(cVar, c2940j);
                    break;
                case 2:
                    gVar = AbstractC2950d.j(cVar, c2940j);
                    break;
                case 3:
                    bVar6 = AbstractC2950d.f(cVar, c2940j, false);
                    a(bVar6, c2940j);
                    break;
                case 4:
                    bVar = AbstractC2950d.f(cVar, c2940j, false);
                    a(bVar, c2940j);
                    break;
                case 5:
                    dVar = AbstractC2950d.h(cVar, c2940j);
                    break;
                case 6:
                    bVar7 = AbstractC2950d.f(cVar, c2940j, false);
                    break;
                case 7:
                    bVar8 = AbstractC2950d.f(cVar, c2940j, false);
                    break;
                case 8:
                    bVar2 = AbstractC2950d.f(cVar, c2940j, false);
                    break;
                case 9:
                    bVar3 = AbstractC2950d.f(cVar, c2940j, false);
                    break;
                case 10:
                    bVar4 = AbstractC2950d.f(cVar, c2940j, false);
                    a(bVar4, c2940j);
                    break;
                case 11:
                    bVar5 = AbstractC2950d.f(cVar, c2940j, false);
                    a(bVar5, c2940j);
                    break;
                default:
                    cVar.w0();
                    cVar.C();
                    break;
            }
        }
        if (z10) {
            cVar.t();
        }
        return new F3.n(b(eVar) ? null : eVar, c(oVar) ? null : oVar, e(gVar) ? null : gVar, d(bVar) ? null : bVar, dVar, bVar7, bVar8, g(bVar2) ? null : bVar2, f(bVar3) ? null : bVar3, d(bVar4) ? null : bVar4, d(bVar5) ? null : bVar5, d(bVar6) ? null : bVar6);
    }
}
