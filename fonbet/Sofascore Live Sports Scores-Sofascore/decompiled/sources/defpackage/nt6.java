package defpackage;

import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nt6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ FantasyCompetitionMyTeamFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt6(FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = fantasyCompetitionMyTeamFragment;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = this.t;
        switch (i) {
            case 0:
                return new nt6(fantasyCompetitionMyTeamFragment, rq3Var, 0);
            case 1:
                return new nt6(fantasyCompetitionMyTeamFragment, rq3Var, 1);
            default:
                return new nt6(fantasyCompetitionMyTeamFragment, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((nt6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(5, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(R, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                fantasyCompetitionMyTeamFragment.m();
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var2 = xd5.b;
                    long R2 = wkn.R(5, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(R2, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                fantasyCompetitionMyTeamFragment.m();
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var3 = xd5.b;
                    long R3 = wkn.R(5, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(R3, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                fantasyCompetitionMyTeamFragment.m();
                break;
        }
        return Unit.a;
    }
}
