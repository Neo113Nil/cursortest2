package defpackage;

import defpackage.pxm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class czm extends hoi implements Function1 {
    public final /* synthetic */ pxm r;
    public final /* synthetic */ n4m s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czm(pxm pxmVar, n4m n4mVar, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = pxmVar;
        this.s = n4mVar;
        this.t = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new czm(this.r, this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((czm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        n4m n4mVar = this.s;
        this.r.c = new pxm.a.C1356a(n4mVar);
        this.t.invoke(n4mVar);
        return Unit.a;
    }
}
