package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bp6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ FantasyCompetitionActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp6(FantasyCompetitionActivity fantasyCompetitionActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = fantasyCompetitionActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        FantasyCompetitionActivity fantasyCompetitionActivity = this.t;
        switch (i) {
            case 0:
                bp6 bp6Var = new bp6(fantasyCompetitionActivity, rq3Var, 0);
                bp6Var.s = obj;
                return bp6Var;
            default:
                bp6 bp6Var2 = new bp6(fantasyCompetitionActivity, rq3Var, 1);
                bp6Var2.s = obj;
                return bp6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((bp6) create((ip6) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((bp6) create((anh) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        FantasyCompetitionActivity fantasyCompetitionActivity = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                int i2 = FantasyCompetitionActivity.R;
                ((dsi) fantasyCompetitionActivity.N.getValue()).f((ip6) obj2);
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                int i3 = ze3.C;
                int i4 = FantasyCompetitionActivity.R;
                CoordinatorLayout coordinatorLayout = fantasyCompetitionActivity.Q().e;
                coordinatorLayout.getClass();
                ze3 I = fkf.I(fantasyCompetitionActivity, coordinatorLayout, (anh) obj2);
                if (I != null) {
                    I.i();
                }
                break;
        }
        return Unit.a;
    }
}
