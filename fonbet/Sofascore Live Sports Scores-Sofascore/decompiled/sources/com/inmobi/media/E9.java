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
public final class E9 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ F9 b;
    public final /* synthetic */ AbstractC3291af c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E9(F9 f9, AbstractC3291af abstractC3291af, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = f9;
        this.c = abstractC3291af;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new E9(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E9(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        F4 f4 = this.b.a;
        AbstractC3291af abstractC3291af = this.c;
        this.a = 1;
        Object a = f4.a(abstractC3291af, this);
        return a == lu3Var ? lu3Var : a;
    }
}
