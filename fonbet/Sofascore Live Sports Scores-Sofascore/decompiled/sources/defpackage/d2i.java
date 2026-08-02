package defpackage;

import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d2i extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ StageConstructorActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2i(StageConstructorActivity stageConstructorActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = stageConstructorActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        StageConstructorActivity stageConstructorActivity = this.t;
        switch (i) {
            case 0:
                d2i d2iVar = new d2i(stageConstructorActivity, rq3Var, 0);
                d2iVar.s = obj;
                return d2iVar;
            default:
                d2i d2iVar2 = new d2i(stageConstructorActivity, rq3Var, 1);
                d2iVar2.s = obj;
                return d2iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((d2i) create((Team) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((d2i) create((FavoritesEventsData) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        NotificationsActionButton notificationsActionButton;
        int i = this.r;
        StageConstructorActivity stageConstructorActivity = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                Team team = (Team) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                int i2 = StageConstructorActivity.R;
                Team l = stageConstructorActivity.X().l();
                Long l2 = l != null ? new Long(l.getUserCount()) : null;
                if (team != null) {
                    iz8.D(stageConstructorActivity.Q().f, team, l2 != null && team.getUserCount() > l2.longValue());
                } else if (l2 != null) {
                    iz8.r(stageConstructorActivity.Q().f, l2.longValue());
                }
                break;
            default:
                FavoritesEventsData favoritesEventsData = (FavoritesEventsData) obj2;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (favoritesEventsData != null && (notificationsActionButton = stageConstructorActivity.Q) != null) {
                    notificationsActionButton.f(favoritesEventsData);
                }
                break;
        }
        return Unit.a;
    }
}
