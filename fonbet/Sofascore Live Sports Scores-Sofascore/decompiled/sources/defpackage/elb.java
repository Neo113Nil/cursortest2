package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class elb extends hoi implements Function1 {
    public final /* synthetic */ flb r;
    public final /* synthetic */ plb s;
    public final /* synthetic */ float t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elb(flb flbVar, plb plbVar, float f, boolean z, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = flbVar;
        this.s = plbVar;
        this.t = f;
        this.u = z;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new elb(this.r, this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((elb) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        flb flbVar = this.r;
        ((eoh) flbVar.i).setValue(this.s);
        flbVar.j(this.t);
        flbVar.h(1);
        flbVar.i(false);
        if (this.u) {
            ((eoh) flbVar.l).setValue(Long.MIN_VALUE);
        }
        return Unit.a;
    }
}
