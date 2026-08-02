package defpackage;

import com.sofascore.network.api.FantasyAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sg7 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wi7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg7(wi7 wi7Var, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = wi7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        wi7 wi7Var = this.t;
        switch (i) {
            case 0:
                return new sg7(wi7Var, rq3Var, 0);
            default:
                return new sg7(wi7Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((sg7) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        wi7 wi7Var = this.t;
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
                FantasyAPI fantasyAPI = wi7Var.a;
                this.s = 1;
                Object competitions = fantasyAPI.getCompetitions(null, this);
                return competitions == lu3Var ? lu3Var : competitions;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI2 = wi7Var.a;
                this.s = 1;
                Object upcomingCompetitions = fantasyAPI2.getUpcomingCompetitions(this);
                return upcomingCompetitions == lu3Var2 ? lu3Var2 : upcomingCompetitions;
        }
    }
}
