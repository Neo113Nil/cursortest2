package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gsl extends hoi implements Function1 {
    public final /* synthetic */ som r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsl(som somVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = somVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new gsl(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new gsl(this.r, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        som somVar = this.r;
        somVar.q.g(somVar.w());
        return Unit.a;
    }
}
