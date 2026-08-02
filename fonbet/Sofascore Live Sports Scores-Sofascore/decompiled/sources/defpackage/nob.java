package defpackage;

import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nob extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ MainActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nob(MainActivity mainActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = mainActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        MainActivity mainActivity = this.t;
        switch (i) {
            case 0:
                nob nobVar = new nob(mainActivity, rq3Var, 0);
                nobVar.s = obj;
                return nobVar;
            case 1:
                nob nobVar2 = new nob(mainActivity, rq3Var, 1);
                nobVar2.s = obj;
                return nobVar2;
            default:
                nob nobVar3 = new nob(mainActivity, rq3Var, 2);
                nobVar3.s = obj;
                return nobVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((nob) create((FavoritesEventsData) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((nob) create((hwg) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((nob) create((zdl) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        MainActivity mainActivity = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                FavoritesEventsData favoritesEventsData = (FavoritesEventsData) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (favoritesEventsData != null) {
                    NotificationsActionButton notificationsActionButton = mainActivity.X;
                    if (notificationsActionButton != null) {
                        notificationsActionButton.f(favoritesEventsData);
                    }
                    FollowActionButton followActionButton = mainActivity.W;
                    if (followActionButton != null) {
                        followActionButton.f(favoritesEventsData);
                    }
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                boolean z = MainActivity.n0;
                mainActivity.Y((hwg) obj2);
                break;
            default:
                zdl zdlVar = (zdl) obj2;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                boolean z2 = MainActivity.n0;
                mainActivity.Q().b.setWorldCupTeamColor(zdlVar != null ? new Integer(zdlVar.a) : null);
                break;
        }
        return Unit.a;
    }
}
