package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l1a extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ m1a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1a(m1a m1aVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = m1aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        m1a m1aVar = this.t;
        switch (i) {
            case 0:
                return new l1a(m1aVar, rq3Var, 0);
            case 1:
                return new l1a(m1aVar, rq3Var, 1);
            case 2:
                return new l1a(m1aVar, rq3Var, 2);
            default:
                return new l1a(m1aVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((l1a) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        m1a m1aVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    q50 q50Var = m1aVar.x;
                    if (q50Var != null) {
                        n9j n9jVar = m1aVar.w;
                        if (n9jVar == null) {
                            n9jVar = hjg.p((g23) tgj.x(m1aVar, i23.a), (wej) tgj.x(m1aVar, xej.a));
                        }
                        r13 r13Var = new r13(n9jVar.c(m1aVar.q, false, m1aVar.u));
                        c80 p = m1aVar.q ? ufa.p((awc) tgj.x(m1aVar, tzb.a), bwc.d) : s02.d0();
                        this.s = 1;
                        obj = q50.a(q50Var, r13Var, p, null, this, 12);
                        if (obj == lu3Var) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    q50 q50Var2 = m1aVar.z;
                    p75 p75Var = new p75((m1aVar.u && m1aVar.q) ? m1aVar.s : m1aVar.t);
                    c80 p2 = m1aVar.q ? ufa.p((awc) tgj.x(m1aVar, tzb.a), bwc.b) : s02.d0();
                    this.s = 1;
                    if (q50.a(q50Var2, p75Var, p2, null, this, 12) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (m1aVar.o1(this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (m1aVar.o1(this) == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
