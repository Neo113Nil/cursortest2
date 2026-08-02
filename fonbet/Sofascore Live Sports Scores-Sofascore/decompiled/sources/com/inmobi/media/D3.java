package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class D3 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Z2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3(Z2 z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = z2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new D3(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new D3(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object obj2 = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            C3357d3 c3357d3 = (C3357d3) E3.b.getValue();
            Z2 z2 = this.b;
            this.a = 1;
            Object a = C3724r9.a(c3357d3.a, "click", AbstractC3408f3.a(z2), null, null, this, 28);
            if (a != obj2) {
                a = Unit.a;
            }
            if (a == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
