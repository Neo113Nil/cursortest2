package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.PointF;
import com.airbnb.lottie.K;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class q implements s, a.b {

    /* renamed from: a, reason: collision with root package name */
    public final K f28653a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28654b;

    /* renamed from: c, reason: collision with root package name */
    public final B3.a f28655c;

    /* renamed from: d, reason: collision with root package name */
    public com.airbnb.lottie.model.content.o f28656d;

    public q(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.n nVar) {
        this.f28653a = k10;
        this.f28654b = nVar.c();
        B3.a a10 = nVar.b().a();
        this.f28655c = a10;
        bVar.j(a10);
        a10.a(this);
    }

    public static int e(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    public static int g(int i10, int i11) {
        return i10 - (e(i10, i11) * i11);
    }

    @Override // B3.a.b
    public void a() {
        this.f28653a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r7 != (r0.size() - 1)) goto L27;
     */
    @Override // com.airbnb.lottie.animation.content.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.airbnb.lottie.model.content.o c(com.airbnb.lottie.model.content.o oVar) {
        boolean z10;
        List list;
        List a10 = oVar.a();
        if (a10.size() > 2) {
            float floatValue = ((Float) this.f28655c.h()).floatValue();
            if (floatValue != 0.0f) {
                com.airbnb.lottie.model.content.o j10 = j(oVar);
                j10.f(oVar.b().x, oVar.b().y);
                List a11 = j10.a();
                boolean d10 = oVar.d();
                int i10 = 0;
                int i11 = 0;
                while (i10 < a10.size()) {
                    E3.a aVar = (E3.a) a10.get(i10);
                    E3.a aVar2 = (E3.a) a10.get(g(i10 - 1, a10.size()));
                    E3.a aVar3 = (E3.a) a10.get(g(i10 - 2, a10.size()));
                    PointF c10 = (i10 != 0 || d10) ? aVar2.c() : oVar.b();
                    PointF b10 = (i10 != 0 || d10) ? aVar2.b() : c10;
                    PointF a12 = aVar.a();
                    PointF c11 = aVar3.c();
                    PointF c12 = aVar.c();
                    if (!oVar.d()) {
                        z10 = true;
                        if (i10 != 0) {
                        }
                        if (b10.equals(c10) || !a12.equals(c10) || z10) {
                            list = a10;
                            E3.a aVar4 = (E3.a) a11.get(g(i11 - 1, a11.size()));
                            E3.a aVar5 = (E3.a) a11.get(i11);
                            aVar4.e(aVar2.b().x, aVar2.b().y);
                            aVar4.f(aVar2.c().x, aVar2.c().y);
                            aVar5.d(aVar.a().x, aVar.a().y);
                            i11++;
                        } else {
                            float f10 = c10.x;
                            float f11 = f10 - c11.x;
                            float f12 = c10.y;
                            float f13 = f12 - c11.y;
                            float f14 = c12.x - f10;
                            float f15 = c12.y - f12;
                            list = a10;
                            float hypot = (float) Math.hypot(f11, f13);
                            float hypot2 = (float) Math.hypot(f14, f15);
                            float min = Math.min(floatValue / hypot, 0.5f);
                            float min2 = Math.min(floatValue / hypot2, 0.5f);
                            float f16 = c10.x;
                            float f17 = ((c11.x - f16) * min) + f16;
                            float f18 = c10.y;
                            float f19 = ((c11.y - f18) * min) + f18;
                            float f20 = ((c12.x - f16) * min2) + f16;
                            float f21 = ((c12.y - f18) * min2) + f18;
                            float f22 = f17 - ((f17 - f16) * 0.5519f);
                            float f23 = f19 - ((f19 - f18) * 0.5519f);
                            float f24 = f20 - ((f20 - f16) * 0.5519f);
                            float f25 = f21 - ((f21 - f18) * 0.5519f);
                            E3.a aVar6 = (E3.a) a11.get(g(i11 - 1, a11.size()));
                            E3.a aVar7 = (E3.a) a11.get(i11);
                            aVar6.e(f17, f19);
                            aVar6.f(f17, f19);
                            if (i10 == 0) {
                                j10.f(f17, f19);
                            }
                            aVar7.d(f22, f23);
                            E3.a aVar8 = (E3.a) a11.get(i11 + 1);
                            aVar7.e(f24, f25);
                            aVar7.f(f20, f21);
                            aVar8.d(f20, f21);
                            i11 += 2;
                        }
                        i10++;
                        a10 = list;
                    }
                    z10 = false;
                    if (b10.equals(c10)) {
                    }
                    list = a10;
                    E3.a aVar42 = (E3.a) a11.get(g(i11 - 1, a11.size()));
                    E3.a aVar52 = (E3.a) a11.get(i11);
                    aVar42.e(aVar2.b().x, aVar2.b().y);
                    aVar42.f(aVar2.c().x, aVar2.c().y);
                    aVar52.d(aVar.a().x, aVar.a().y);
                    i11++;
                    i10++;
                    a10 = list;
                }
                return j10;
            }
        }
        return oVar;
    }

    @Override // com.airbnb.lottie.animation.content.s
    public void h(a.b bVar) {
        this.f28655c.a(bVar);
    }

    public B3.a i() {
        return this.f28655c;
    }

    public final com.airbnb.lottie.model.content.o j(com.airbnb.lottie.model.content.o oVar) {
        List a10 = oVar.a();
        boolean d10 = oVar.d();
        int size = a10.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            E3.a aVar = (E3.a) a10.get(size);
            E3.a aVar2 = (E3.a) a10.get(g(size - 1, a10.size()));
            PointF c10 = (size != 0 || d10) ? aVar2.c() : oVar.b();
            i10 = (((size != 0 || d10) ? aVar2.b() : c10).equals(c10) && aVar.a().equals(c10) && !(!oVar.d() && (size == 0 || size == a10.size() - 1))) ? i10 + 2 : i10 + 1;
            size--;
        }
        com.airbnb.lottie.model.content.o oVar2 = this.f28656d;
        if (oVar2 == null || oVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new E3.a());
            }
            this.f28656d = new com.airbnb.lottie.model.content.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f28656d.e(d10);
        return this.f28656d;
    }
}
