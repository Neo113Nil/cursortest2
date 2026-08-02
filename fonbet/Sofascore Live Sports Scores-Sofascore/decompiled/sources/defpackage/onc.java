package defpackage;

import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class onc extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ MmaFighterActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onc(MmaFighterActivity mmaFighterActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = mmaFighterActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        MmaFighterActivity mmaFighterActivity = this.t;
        switch (i) {
            case 0:
                onc oncVar = new onc(mmaFighterActivity, rq3Var, 0);
                oncVar.s = obj;
                return oncVar;
            default:
                onc oncVar2 = new onc(mmaFighterActivity, rq3Var, 1);
                oncVar2.s = obj;
                return oncVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((onc) create((Team) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((onc) create((FavoritesEventsData) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        MmaFighterActivity mmaFighterActivity = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                Team team = (Team) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (team != null) {
                    int i2 = MmaFighterActivity.U;
                    iz8.D(mmaFighterActivity.Q().f, team, mmaFighterActivity.T);
                } else {
                    int i3 = MmaFighterActivity.U;
                    Team Y = mmaFighterActivity.Y();
                    if (Y != null) {
                        iz8.r(mmaFighterActivity.Q().f, Y.getUserCount());
                    }
                }
                break;
            default:
                FavoritesEventsData favoritesEventsData = (FavoritesEventsData) obj2;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (favoritesEventsData != null) {
                    FollowActionButton followActionButton = mmaFighterActivity.S;
                    if (followActionButton != null) {
                        followActionButton.f(favoritesEventsData);
                    }
                    NotificationsActionButton notificationsActionButton = mmaFighterActivity.R;
                    if (notificationsActionButton != null) {
                        notificationsActionButton.f(favoritesEventsData);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
