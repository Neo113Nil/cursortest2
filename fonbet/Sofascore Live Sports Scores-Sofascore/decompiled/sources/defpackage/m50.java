package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m50 extends hoi implements Function1 {
    public d80 r;
    public asf s;
    public int t;
    public final /* synthetic */ q50 u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ vti w;
    public final /* synthetic */ long x;
    public final /* synthetic */ Function1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(q50 q50Var, Object obj, vti vtiVar, long j, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.u = q50Var;
        this.v = obj;
        this.w = vtiVar;
        this.x = j;
        this.y = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new m50(this.u, this.v, this.w, this.x, this.y, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m50) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        d80 d80Var;
        asf asfVar;
        vti vtiVar = this.w;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        q50 q50Var = this.u;
        try {
            if (i == 0) {
                y6a.M(obj);
                q50Var.c.c = (j80) q50Var.a.a.invoke(this.v);
                ((eoh) q50Var.e).setValue(vtiVar.c);
                ((eoh) q50Var.d).setValue(Boolean.TRUE);
                d80 d80Var2 = q50Var.c;
                d80 d80Var3 = new d80(d80Var2.a, ((eoh) d80Var2.b).getValue(), j72.y(d80Var2.c), d80Var2.d, Long.MIN_VALUE, d80Var2.f);
                asf asfVar2 = new asf();
                long j = this.x;
                l50 l50Var = new l50(q50Var, d80Var3, this.y, asfVar2, 0);
                this.r = d80Var3;
                this.s = asfVar2;
                this.t = 1;
                if (d2a.l(d80Var3, vtiVar, j, l50Var, this) == lu3Var) {
                    return lu3Var;
                }
                d80Var = d80Var3;
                asfVar = asfVar2;
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                asfVar = this.s;
                d80Var = this.r;
                y6a.M(obj);
            }
            u70 u70Var = asfVar.a ? u70.a : u70.b;
            q50Var.c();
            return new a80(d80Var, u70Var);
        } catch (CancellationException e) {
            q50Var.c();
            throw e;
        }
    }
}
