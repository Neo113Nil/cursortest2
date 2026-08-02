package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a4m extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ f7m s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4m(f7m f7mVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = f7mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new a4m(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        new a4m(this.s, (rq3) obj2).invokeSuspend(Unit.a);
        return lu3.a;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                throw wt3.i(obj);
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        aeh aehVar = tjm.d;
        l0m l0mVar = new l0m(this.s);
        this.r = 1;
        aehVar.collect(l0mVar, this);
        return lu3Var;
    }
}
