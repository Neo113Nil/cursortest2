package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oj9 extends hoi implements ft8 {
    public int r;
    public /* synthetic */ aq4 s;
    public /* synthetic */ db2 t;
    public /* synthetic */ h5k u;
    public final /* synthetic */ Charset v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj9(Charset charset, rq3 rq3Var) {
        super(5, rq3Var);
        this.v = charset;
    }

    @Override // defpackage.ft8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        oj9 oj9Var = new oj9(this.v, (rq3) obj5);
        oj9Var.s = (aq4) obj2;
        oj9Var.t = (db2) obj3;
        oj9Var.u = (h5k) obj4;
        return oj9Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        aq4 aq4Var;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            aq4 aq4Var2 = this.s;
            db2 db2Var = this.t;
            if (!Intrinsics.c(this.u.a, duf.a.getOrCreateKotlinClass(String.class))) {
                return null;
            }
            this.s = aq4Var2;
            this.t = null;
            this.r = 1;
            Object Q = l6g.Q(db2Var, this);
            if (Q == lu3Var) {
                return lu3Var;
            }
            aq4Var = aq4Var2;
            obj = Q;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aq4Var = this.s;
            y6a.M(obj);
        }
        bwh bwhVar = (bwh) obj;
        xh9 b = aq4Var.b();
        bjb bjbVar = pj9.a;
        Charset v = xw3.v(b.d());
        if (v == null) {
            v = this.v;
        }
        pj9.a.l("Reading response body for " + b.c().getUrl() + " as String with charset " + v);
        bwhVar.getClass();
        v.getClass();
        return v.equals(Charsets.UTF_8) ? qha.P(bwhVar) : ao2.r(v.newDecoder(), bwhVar);
    }
}
