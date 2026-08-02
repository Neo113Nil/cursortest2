package defpackage;

import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lta extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ LeagueActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lta(LeagueActivity leagueActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = leagueActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        LeagueActivity leagueActivity = this.t;
        switch (i) {
            case 0:
                lta ltaVar = new lta(leagueActivity, rq3Var, 0);
                ltaVar.s = obj;
                return ltaVar;
            default:
                lta ltaVar2 = new lta(leagueActivity, rq3Var, 1);
                ltaVar2.s = obj;
                return ltaVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((lta) create((FavoritesEventsData) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((lta) create((UniqueTournament) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        UniqueTournament uniqueTournament;
        int i = this.r;
        LeagueActivity leagueActivity = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                FavoritesEventsData favoritesEventsData = (FavoritesEventsData) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (favoritesEventsData != null) {
                    FollowActionButton followActionButton = leagueActivity.g0;
                    if (followActionButton != null) {
                        followActionButton.f(favoritesEventsData);
                    }
                    NotificationsActionButton notificationsActionButton = leagueActivity.f0;
                    if (notificationsActionButton != null) {
                        notificationsActionButton.f(favoritesEventsData);
                    }
                }
                break;
            default:
                UniqueTournament uniqueTournament2 = (UniqueTournament) obj2;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                a99 a99Var = LeagueActivity.h0;
                Tournament n = leagueActivity.R().n();
                Long l = (n == null || (uniqueTournament = n.getUniqueTournament()) == null) ? null : new Long(uniqueTournament.getUserCount());
                if (uniqueTournament2 != null) {
                    iz8.D(leagueActivity.S().g, uniqueTournament2, l != null && uniqueTournament2.getUserCount() > l.longValue());
                } else if (l != null) {
                    iz8.r(leagueActivity.S().g, l.longValue());
                }
                break;
        }
        return Unit.a;
    }
}
