package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.z88;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Em extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z88 c;
    public final /* synthetic */ Nm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em(z88 z88Var, rq3 rq3Var, Nm nm) {
        super(2, rq3Var);
        this.c = z88Var;
        this.d = nm;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Em em = new Em(this.c, rq3Var, this.d);
        em.b = obj;
        return em;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Em) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.b;
            z88 z88Var = this.c;
            Dm dm = new Dm(ku3Var, this.d);
            this.a = 1;
            if (z88Var.collect(dm, this) == lu3Var) {
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
