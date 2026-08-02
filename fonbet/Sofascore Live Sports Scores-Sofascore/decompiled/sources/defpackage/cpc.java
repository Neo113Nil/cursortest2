package defpackage;

import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cpc extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ MmaOrganisationActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cpc(MmaOrganisationActivity mmaOrganisationActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = mmaOrganisationActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        MmaOrganisationActivity mmaOrganisationActivity = this.t;
        switch (i) {
            case 0:
                cpc cpcVar = new cpc(mmaOrganisationActivity, rq3Var, 0);
                cpcVar.s = obj;
                return cpcVar;
            default:
                cpc cpcVar2 = new cpc(mmaOrganisationActivity, rq3Var, 1);
                cpcVar2.s = obj;
                return cpcVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((cpc) create((UniqueTournament) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((cpc) create((FavoritesEventsData) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        MmaOrganisationActivity mmaOrganisationActivity = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                UniqueTournament uniqueTournament = (UniqueTournament) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                int i2 = MmaOrganisationActivity.T;
                UniqueTournament uniqueTournament2 = (UniqueTournament) mmaOrganisationActivity.X().h.d();
                Long l = uniqueTournament2 != null ? new Long(uniqueTournament2.getUserCount()) : null;
                if (uniqueTournament != null) {
                    iz8.D(mmaOrganisationActivity.Q().f, uniqueTournament, l != null && uniqueTournament.getUserCount() > l.longValue());
                } else if (l != null) {
                    iz8.r(mmaOrganisationActivity.Q().f, l.longValue());
                }
                break;
            default:
                FavoritesEventsData favoritesEventsData = (FavoritesEventsData) obj2;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (favoritesEventsData != null) {
                    FollowActionButton followActionButton = mmaOrganisationActivity.S;
                    if (followActionButton != null) {
                        followActionButton.f(favoritesEventsData);
                    }
                    NotificationsActionButton notificationsActionButton = mmaOrganisationActivity.R;
                    if (notificationsActionButton != null) {
                        notificationsActionButton.f(favoritesEventsData);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
