package com.inmobi.media;

import defpackage.a70;
import defpackage.dsf;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pa3;
import defpackage.qa3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ea extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Aa b;
    public final /* synthetic */ dsf c;
    public final /* synthetic */ dsf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ea(Aa aa, dsf dsfVar, dsf dsfVar2, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = aa;
        this.c = dsfVar;
        this.d = dsfVar2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ea(this.b, this.c, this.d, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ea) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            pa3 pa3Var = this.b.e;
            this.a = 1;
            if (((qa3) pa3Var).w(this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        dsf dsfVar = this.c;
        Aa aa = this.b;
        dsfVar.a = aa.c;
        this.d.a = aa.d;
        return Unit.a;
    }
}
