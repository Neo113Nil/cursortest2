package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.c0;
import com.moloco.sdk.internal.publisher.h1;
import com.moloco.sdk.publisher.MolocoAdKt;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k extends hoi implements Function2 {
    public final /* synthetic */ h1 r;
    public final /* synthetic */ m s;
    public final /* synthetic */ y t;
    public final /* synthetic */ long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h1 h1Var, m mVar, y yVar, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = h1Var;
        this.s = mVar;
        this.t = yVar;
        this.u = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new k(this.r, this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        String str = this.s.b;
        y yVar = this.t;
        ((c0) this.r).b(MolocoAdKt.createAdInfo(str, new Float(yVar.b), yVar.e), this.u, yVar.d.d);
        return Unit.a;
    }
}
