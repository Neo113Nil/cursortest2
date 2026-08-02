package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class x extends hoi implements Function2 {
    public final /* synthetic */ a0 r;
    public final /* synthetic */ c0 s;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, c0 c0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = a0Var;
        this.s = c0Var;
        this.t = cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new x(this.r, this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.internal.ortb.model.a0 a0Var;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        a0 a0Var2 = this.r;
        a0Var2.k = false;
        com.moloco.sdk.internal.d0 a = com.moloco.sdk.internal.e0.a(a0Var2.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, this.t);
        com.moloco.sdk.internal.ortb.model.y a2 = a0.a(a0Var2.m);
        this.s.a(a, (a2 == null || (a0Var = a2.d) == null) ? null : a0Var.d);
        return Unit.a;
    }
}
