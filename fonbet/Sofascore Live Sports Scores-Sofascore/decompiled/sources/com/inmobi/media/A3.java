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
public final class A3 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Z2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(Z2 z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = z2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new A3(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new A3(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            C3357d3 c3357d3 = (C3357d3) E3.b.getValue();
            int i2 = this.b.a;
            this.a = 1;
            Object a = c3357d3.a.a("click", "id=?", new String[]{String.valueOf(i2)}, this);
            if (a != lu3Var) {
                a = Unit.a;
            }
            if (a == lu3Var) {
                return lu3Var;
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
