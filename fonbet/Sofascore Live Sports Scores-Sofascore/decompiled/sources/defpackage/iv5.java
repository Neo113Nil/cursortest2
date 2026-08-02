package defpackage;

import com.sofascore.model.TeamSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iv5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ kv5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv5(kv5 kv5Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = kv5Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        kv5 kv5Var = this.t;
        switch (i) {
            case 0:
                return new iv5(kv5Var, rq3Var, 0);
            default:
                return new iv5(kv5Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((iv5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        kv5 kv5Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    g62 g62Var = kv5Var.v;
                    Unit unit = Unit.a;
                    this.s = 1;
                    if (g62Var.q(this, unit) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    yzc yzcVar = kv5Var.t;
                    TeamSelection teamSelection = kv5Var.l;
                    if (teamSelection == null) {
                        Intrinsics.i("selectedTeam");
                        throw null;
                    }
                    int i4 = jv5.a[teamSelection.ordinal()];
                    yzcVar.j(i4 != 1 ? i4 != 2 ? kv5Var.i : kv5Var.k : kv5Var.j);
                    this.s = 1;
                    if (kv5Var.j(this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
