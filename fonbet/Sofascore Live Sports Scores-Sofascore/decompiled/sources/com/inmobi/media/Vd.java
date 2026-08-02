package com.inmobi.media;

import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vd extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Wd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vd(Wd wd, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = wd;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Vd vd = new Vd(this.c, rq3Var);
        vd.b = obj;
        return vd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Vd vd = new Vd(this.c, (rq3) obj2);
        vd.b = (k8f) obj;
        return vd.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            k8f k8fVar = (k8f) this.b;
            Wd wd = this.c;
            b1d b1dVar = wd.a.a;
            Ud ud = new Ud(wd, k8fVar);
            this.a = 1;
            if (b1dVar.collect(ud, this) == lu3Var) {
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
