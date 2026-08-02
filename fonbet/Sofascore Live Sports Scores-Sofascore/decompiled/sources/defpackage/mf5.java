package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import defpackage.ltl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mf5 extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf5(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        mf5 mf5Var = new mf5(this.t, rq3Var);
        mf5Var.s = obj;
        return mf5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mf5 mf5Var = new mf5(this.t, (rq3) obj2);
        mf5Var.s = (ltl) obj;
        return mf5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ltl ltlVar = (ltl) this.s;
            if (ltlVar instanceof ltl.c) {
                ltl.c cVar = (ltl.c) ltlVar;
                n4m n4mVar = cVar.a;
                boolean z = cVar.d;
                this.r = 1;
                int i2 = a.I;
                if (this.t.C(n4mVar, z, this) == lu3Var) {
                    return lu3Var;
                }
            } else if (!(ltlVar instanceof ltl.a) && !(ltlVar instanceof ltl.b)) {
                zzl.b();
                return null;
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
