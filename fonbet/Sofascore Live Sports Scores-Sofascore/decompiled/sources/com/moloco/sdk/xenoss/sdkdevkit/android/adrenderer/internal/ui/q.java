package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.av8;
import defpackage.b7k;
import defpackage.ct8;
import defpackage.d7e;
import defpackage.dfj;
import defpackage.e7k;
import defpackage.hz8;
import defpackage.lfj;
import defpackage.of3;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q implements ct8 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public q(Function0 function0, boolean z, long j, long j2, long j3) {
        this.a = function0;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u uVar = (u) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        uVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(uVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        av8 av8Var2 = (av8) of3Var;
        dfj dfjVar = ((b7k) av8Var2.k(e7k.b)).f;
        if (uVar instanceof r) {
            av8Var2.e0(1000266506);
            av8Var2.s(false);
        } else if (uVar instanceof s) {
            av8Var2.e0(1000608622);
            s sVar = (s) uVar;
            com.facebook.appevents.j.f(sVar.a, this.a, null, this.b, sVar.b, this.c, this.d, sVar.c, sVar.d, sVar.e, av8Var2, 0, 4);
            av8Var2.s(false);
        } else {
            if (!(uVar instanceof t)) {
                av8Var2.e0(-1491754012);
                av8Var2.s(false);
                zzl.b();
                return null;
            }
            av8Var2.e0(1001871283);
            t tVar = (t) uVar;
            long j = tVar.j;
            if (lfj.a(j, lfj.c)) {
                j = this.e;
            }
            d7e d7eVar = tVar.b;
            long j2 = tVar.i;
            long i = hz8.i(120.0f, 20.0f);
            f1.q(tVar.a, d7eVar, tVar.c, tVar.d, tVar.e, tVar.f, i, j2, tVar.g, tVar.h, j, this.a, av8Var2, 1572864);
            av8Var2.s(false);
        }
        return Unit.a;
    }
}
