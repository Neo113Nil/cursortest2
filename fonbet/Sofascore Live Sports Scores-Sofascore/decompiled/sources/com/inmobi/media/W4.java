package com.inmobi.media;

import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class W4 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ b1d b;
    public final /* synthetic */ AbstractC3650oc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W4(b1d b1dVar, AbstractC3650oc abstractC3650oc, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = b1dVar;
        this.c = abstractC3650oc;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new W4(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new W4(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            b1d b1dVar = this.b;
            AbstractC3650oc abstractC3650oc = this.c;
            this.a = 1;
            if (b1dVar.emit(abstractC3650oc, this) == lu3Var) {
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
