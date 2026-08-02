package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kle extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ PlayerActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kle(PlayerActivity playerActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = playerActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        PlayerActivity playerActivity = this.t;
        switch (i) {
            case 0:
                kle kleVar = new kle(playerActivity, rq3Var, 0);
                kleVar.s = obj;
                return kleVar;
            default:
                kle kleVar2 = new kle(playerActivity, rq3Var, 1);
                kleVar2.s = obj;
                return kleVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((kle) create((Player) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((kle) create((List) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        PlayerActivity playerActivity = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                Player player = (Player) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                int i2 = PlayerActivity.Z;
                Player player2 = playerActivity.X().l;
                Long l = player2 != null ? new Long(player2.getUserCount()) : null;
                if (player != null) {
                    iz8.D(playerActivity.Q().f, player, l != null && player.getUserCount() > l.longValue());
                } else if (l != null) {
                    iz8.r(playerActivity.Q().f, l.longValue());
                }
                break;
            default:
                List list = (List) obj2;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                FollowActionButton followActionButton = playerActivity.Y;
                if (followActionButton != null) {
                    followActionButton.g(list);
                }
                NotificationsActionButton notificationsActionButton = playerActivity.X;
                if (notificationsActionButton != null) {
                    notificationsActionButton.g(list);
                }
                break;
        }
        return Unit.a;
    }
}
