package defpackage;

import com.sofascore.model.fantasy.FantasyUserRoundSquadResponse;
import com.sofascore.model.fantasy.FantasyUserSquad;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class so7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ vo7 t;
    public final /* synthetic */ ho7 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so7(vo7 vo7Var, ho7 ho7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = vo7Var;
        this.u = ho7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ho7 ho7Var = this.u;
        vo7 vo7Var = this.t;
        switch (i) {
            case 0:
                return new so7(vo7Var, ho7Var, rq3Var, 0);
            default:
                return new so7(vo7Var, ho7Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((so7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        FantasyUserSquad squad;
        int i = this.r;
        ho7 ho7Var = this.u;
        vo7 vo7Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ky6 ky6Var = vo7Var.f;
                int i3 = ho7Var.a.a;
                this.s = 1;
                ky6Var.getClass();
                Object r = s9a.r(new hy6(ky6Var, i3, null, 1), this);
                return r == lu3Var ? lu3Var : r;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = vo7Var.e;
                    String str = vo7Var.h;
                    int i5 = ho7Var.a.a;
                    this.s = 1;
                    obj = wi7Var.W(i5, str, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyUserRoundSquadResponse fantasyUserRoundSquadResponse = (FantasyUserRoundSquadResponse) obj;
                if (fantasyUserRoundSquadResponse == null || (squad = fantasyUserRoundSquadResponse.getSquad()) == null) {
                    return null;
                }
                return squad.getPlayers();
        }
    }
}
