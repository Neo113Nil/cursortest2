package com.moloco.sdk.internal;

import com.moloco.sdk.internal.ortb.model.g1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.sofascore.results.R;
import defpackage.av8;
import defpackage.d7e;
import defpackage.haa;
import defpackage.hz8;
import defpackage.lfj;
import defpackage.mv1;
import defpackage.of3;
import defpackage.r13;
import defpackage.s75;
import defpackage.t3e;
import defpackage.tc3;
import defpackage.v8a;
import defpackage.y7k;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class o implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.moloco.sdk.internal.ortb.model.d b;

    public /* synthetic */ o(com.moloco.sdk.internal.ortb.model.d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        boolean z;
        r13 r13Var;
        tc3 d;
        int i = this.a;
        tc3 tc3Var = null;
        com.moloco.sdk.internal.ortb.model.d dVar = this.b;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                av8 av8Var = (av8) ((of3) obj);
                av8Var.e0(1941247592);
                com.moloco.sdk.internal.ortb.model.b bVar = dVar.d;
                y7k y7kVar = bVar.f;
                if (y7kVar != null) {
                    float f = y7kVar.a;
                    j = hz8.i(f, f);
                } else {
                    j = r.d;
                }
                long j2 = j;
                mv1 a = r.a(bVar.c, bVar.d);
                float f2 = bVar.b;
                t3e t3eVar = new t3e(f2, f2, f2, f2);
                long c = s75.c(j2, 0.6f);
                long j3 = bVar.e;
                r13 r13Var2 = bVar.g;
                tc3 a2 = f1.a(j2, c, r13Var2 != null ? r13Var2.a : r.b, a, t3eVar, j3, haa.t(R.drawable.moloco_volume_off, 0, av8Var), haa.t(R.drawable.moloco_volume_on, 0, av8Var), av8Var, 516);
                av8Var.s(false);
                return a2;
            case 1:
                ((Number) obj2).intValue();
                av8 av8Var2 = (av8) ((of3) obj);
                av8Var2.e0(1588309742);
                com.moloco.sdk.internal.ortb.model.l lVar = dVar.a;
                if (lVar == null) {
                    z = false;
                } else {
                    int i2 = lVar.c;
                    float f3 = i2;
                    long i3 = hz8.i(f3, f3);
                    g1 g1Var = dVar.m;
                    long j4 = (g1Var == null || (r13Var = g1Var.d) == null) ? lVar.f : r13Var.a;
                    mv1 a3 = r.a(lVar.d, lVar.e);
                    float f4 = lVar.b;
                    t3e t3eVar2 = new t3e(f4, f4, f4, f4);
                    long v = v8a.v(i2);
                    v8a.l(v);
                    long E = v8a.E(1095216660480L & v, lfj.c(v) / 2.0f);
                    long c2 = s75.c(i3, 0.4f);
                    r13 r13Var3 = lVar.g;
                    tc3Var = f1.b(a3, t3eVar2, j4, i3, E, r.g(c2, r13Var3 != null ? r13Var3.a : r.b, j4, dVar.m, av8Var2), dVar.j, av8Var2, 64);
                    av8Var2 = av8Var2;
                    z = false;
                }
                av8Var2.s(z);
                return tc3Var;
            case 2:
                ((Number) obj2).intValue();
                av8 av8Var3 = (av8) ((of3) obj);
                av8Var3.e0(884446767);
                com.moloco.sdk.internal.ortb.model.l lVar2 = dVar.a;
                if (lVar2 != null) {
                    int i4 = lVar2.c;
                    float f5 = i4;
                    long i5 = hz8.i(f5, f5);
                    mv1 a4 = r.a(lVar2.d, lVar2.e);
                    float f6 = lVar2.b;
                    t3e t3eVar3 = new t3e(f6, f6, f6, f6);
                    long j5 = lVar2.f;
                    long v2 = v8a.v(i4);
                    v8a.l(v2);
                    long E2 = v8a.E(v2 & 1095216660480L, lfj.c(v2) / 2.0f);
                    d7e t = haa.t(2131232663, 0, av8Var3);
                    long c3 = s75.c(i5, 0.4f);
                    r13 r13Var4 = lVar2.g;
                    tc3Var = f1.b(a4, t3eVar3, j5, i5, E2, f1.g(t, c3, r13Var4 != null ? r13Var4.a : r.b, av8Var3, 4), dVar.j, av8Var3, 64);
                    av8Var3 = av8Var3;
                }
                av8Var3.s(false);
                return tc3Var;
            case 3:
                ((Number) obj2).intValue();
                av8 av8Var4 = (av8) ((of3) obj);
                av8Var4.e0(1485642988);
                com.moloco.sdk.internal.ortb.model.f fVar = dVar.c;
                if (fVar != null) {
                    mv1 a5 = r.a(fVar.b, fVar.c);
                    float f7 = fVar.a;
                    tc3Var = f1.c(a5, new t3e(f7, f7, f7, f7), fVar.d, av8Var4, 0);
                }
                av8Var4.s(false);
                return tc3Var;
            default:
                ((Number) obj2).intValue();
                av8 av8Var5 = (av8) ((of3) obj);
                av8Var5.e0(1045477038);
                com.moloco.sdk.internal.ortb.model.n nVar = dVar.h;
                av8Var5.e0(-1135677423);
                if (nVar == null) {
                    d = null;
                } else {
                    mv1 a6 = r.a(nVar.b, nVar.c);
                    float f8 = nVar.a;
                    d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.d(a6, new t3e(f8, f8, f8, f8), av8Var5, 0);
                }
                av8Var5.s(false);
                if (d == null) {
                    d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.d(null, null, av8Var5, 3);
                }
                av8Var5.s(false);
                return d;
        }
    }
}
