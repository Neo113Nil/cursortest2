package defpackage;

import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class opm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ sqm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opm(sqm sqmVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = sqmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new opm(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new opm(this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            sqm sqmVar = this.s;
            n4m D = sqmVar.D();
            if (D != null) {
                D.m = Boolean.TRUE;
                gim gimVar = D.b;
                if (gimVar instanceof gim.b) {
                    gum gumVar = sqmVar.k0;
                    String str = ((gim.b) gimVar).a.id;
                    Integer t = tz9.t(sqmVar.t, sqmVar.D());
                    String H = sqmVar.H();
                    this.r = 1;
                    gumVar.getClass();
                    if (gum.g(str, false, t, H) == lu3Var) {
                        return lu3Var;
                    }
                }
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
