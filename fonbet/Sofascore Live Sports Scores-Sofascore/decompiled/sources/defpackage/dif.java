package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dif extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ obm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dif(obm obmVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new dif(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new dif(this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        obm obmVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            int i2 = obm.D;
            ilm ilmVar = (ilm) obmVar.getViewModel();
            this.r = 1;
            if (ilmVar.Y(this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        Unit unit = Unit.a;
        int i3 = obm.D;
        obmVar.getClass();
        obmVar.o(new k7k(obmVar, null));
        return unit;
    }
}
