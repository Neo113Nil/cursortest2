package defpackage;

import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.stagesport.StageDriverActivity;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r4i extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ StageDriverActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4i(StageDriverActivity stageDriverActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = stageDriverActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        StageDriverActivity stageDriverActivity = this.t;
        switch (i) {
            case 0:
                r4i r4iVar = new r4i(stageDriverActivity, rq3Var, 0);
                r4iVar.s = obj;
                return r4iVar;
            default:
                r4i r4iVar2 = new r4i(stageDriverActivity, rq3Var, 1);
                r4iVar2.s = obj;
                return r4iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((r4i) create((Team) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((r4i) create((FavoritesEventsData) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        NotificationsActionButton notificationsActionButton;
        int i = this.r;
        StageDriverActivity stageDriverActivity = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                Team team = (Team) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                int i2 = StageDriverActivity.R;
                Team l = stageDriverActivity.X().l();
                Long l2 = l != null ? new Long(l.getUserCount()) : null;
                if (team != null) {
                    iz8.D(stageDriverActivity.Q().f, team, l2 != null && team.getUserCount() > l2.longValue());
                } else if (l2 != null) {
                    iz8.r(stageDriverActivity.Q().f, l2.longValue());
                }
                break;
            default:
                FavoritesEventsData favoritesEventsData = (FavoritesEventsData) obj2;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (favoritesEventsData != null && (notificationsActionButton = stageDriverActivity.Q) != null) {
                    notificationsActionButton.f(favoritesEventsData);
                }
                break;
        }
        return Unit.a;
    }
}
