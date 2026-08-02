package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uc7 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ ksa s;
    public final /* synthetic */ float t;
    public final /* synthetic */ kx4 u;
    public final /* synthetic */ float v;
    public final /* synthetic */ e1d w;
    public final /* synthetic */ xnh x;
    public final /* synthetic */ cdi y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc7(ksa ksaVar, float f, kx4 kx4Var, float f2, e1d e1dVar, xnh xnhVar, cdi cdiVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = ksaVar;
        this.t = f;
        this.u = kx4Var;
        this.v = f2;
        this.w = e1dVar;
        this.x = xnhVar;
        this.y = cdiVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new uc7(this.s, this.t, this.u, this.v, this.w, this.x, this.y, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uc7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            pog y = sea.y(new ni4(this.s, 4));
            tc7 tc7Var = new tc7(this.t, this.u, this.s, this.v, this.w, this.x, this.y);
            this.r = 1;
            if (y.collect(tc7Var, this) == lu3Var) {
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
