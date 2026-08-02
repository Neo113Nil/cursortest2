package defpackage;

import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jui extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ TeamActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jui(TeamActivity teamActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = teamActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        TeamActivity teamActivity = this.t;
        switch (i) {
            case 0:
                jui juiVar = new jui(teamActivity, rq3Var, 0);
                juiVar.s = obj;
                return juiVar;
            default:
                jui juiVar2 = new jui(teamActivity, rq3Var, 1);
                juiVar2.s = obj;
                return juiVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((jui) create((Team) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((jui) create((FavoritesEventsData) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        TeamActivity teamActivity = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                Team team = (Team) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                int i2 = TeamActivity.Z;
                Team Z = teamActivity.Z();
                Long l = Z != null ? new Long(Z.getUserCount()) : null;
                if (team != null) {
                    iz8.D(teamActivity.Q().f, team, l != null && team.getUserCount() > l.longValue());
                } else if (l != null) {
                    iz8.r(teamActivity.Q().f, l.longValue());
                }
                break;
            default:
                FavoritesEventsData favoritesEventsData = (FavoritesEventsData) obj2;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (favoritesEventsData != null) {
                    FollowActionButton followActionButton = teamActivity.V;
                    if (followActionButton != null) {
                        followActionButton.f(favoritesEventsData);
                    }
                    NotificationsActionButton notificationsActionButton = teamActivity.U;
                    if (notificationsActionButton != null) {
                        notificationsActionButton.f(favoritesEventsData);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
