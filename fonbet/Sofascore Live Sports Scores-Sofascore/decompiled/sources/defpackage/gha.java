package defpackage;

import kotlin.Unit;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gha extends m2g implements ct8 {
    public int s;
    public /* synthetic */ um4 t;
    public final /* synthetic */ pp4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gha(pp4 pp4Var, rq3 rq3Var) {
        super(3, rq3Var);
        this.u = pp4Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gha ghaVar = new gha(this.u, (rq3) obj3);
        ghaVar.t = (um4) obj;
        return ghaVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        pp4 pp4Var = this.u;
        n4 n4Var = (n4) pp4Var.d;
        um4 um4Var = this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            byte x = n4Var.x();
            if (x == 1) {
                return pp4Var.n(true);
            }
            if (x == 0) {
                return pp4Var.n(false);
            }
            if (x != 6) {
                if (x == 8) {
                    return pp4Var.l();
                }
                n4.s(n4Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.t = null;
            this.s = 1;
            obj = pp4Var.m(um4Var, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return (b) obj;
    }
}
