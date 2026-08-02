package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class b6 extends p8 {
    public final boolean c;
    public final Function1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(View view, boolean z, Function1 function1) {
        super(view);
        view.getClass();
        this.c = z;
        this.d = function1;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        Integer winnerCode$default;
        Team team;
        Team team2;
        RankingRow rankingRow = (RankingRow) obj;
        rankingRow.getClass();
        boolean z = this.c;
        Context context = this.b;
        boolean z2 = false;
        if (z) {
            View root = d().getRoot();
            root.getClass();
            Integer valueOf = Integer.valueOf(i);
            Function1 function1 = this.d;
            sea.v(root, false, ((Boolean) function1.invoke(valueOf)).booleanValue(), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            View root2 = d().getRoot();
            root2.getClass();
            root2.setPaddingRelative(root2.getPaddingStart(), root2.getPaddingTop(), root2.getPaddingEnd(), ((Boolean) function1.invoke(Integer.valueOf(i))).booleanValue() ? ao2.s(8, context) : 0);
        }
        TextView j = j();
        if (j != null) {
            j.setText(String.valueOf(rankingRow.getPosition()));
        }
        Team team3 = rankingRow.getTeam();
        if (team3 != null) {
            f().setText(team3.getName());
            as9.d(e(), team3.getId(), team3.getGender(), false);
        }
        Event lastEvent = rankingRow.getLastEvent();
        if (lastEvent == null) {
            i().setVisibility(8);
            h().setVisibility(8);
            g().setVisibility(8);
            return;
        }
        i().setVisibility(0);
        h().setVisibility(0);
        g().setVisibility(0);
        Team team4 = rankingRow.getTeam();
        h().setText(tba.A(context, (team4 == null || Event.getHomeTeam$default(lastEvent, null, 1, null).getId() != team4.getId()) ? Event.getHomeTeam$default(lastEvent, null, 1, null) : Event.getAwayTeam$default(lastEvent, null, 1, null)));
        g().setTextDirection(context.getResources().getConfiguration().getLayoutDirection() == 1 ? 4 : 3);
        TextView g = g();
        long startTimestamp = lastEvent.getStartTimestamp();
        bi4 bi4Var = bi4.PATTERN_Y;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        g.setText("(" + fc6.i(startTimestamp, hk4.a(bi4Var.d())) + ")");
        Integer winnerCode$default2 = Event.getWinnerCode$default(lastEvent, null, 1, null);
        if ((winnerCode$default2 != null && winnerCode$default2.intValue() == 1 && (team2 = rankingRow.getTeam()) != null && Event.getHomeTeam$default(lastEvent, null, 1, null).getId() == team2.getId()) || ((winnerCode$default = Event.getWinnerCode$default(lastEvent, null, 1, null)) != null && winnerCode$default.intValue() == 2 && (team = rankingRow.getTeam()) != null && Event.getAwayTeam$default(lastEvent, null, 1, null).getId() == team.getId())) {
            z2 = true;
        }
        Integer winnerCode$default3 = Event.getWinnerCode$default(lastEvent, null, 1, null);
        if ((winnerCode$default3 != null && winnerCode$default3.intValue() == 1) || (winnerCode$default3 != null && winnerCode$default3.intValue() == 2)) {
            if (z2) {
                k(lqc.WIN);
                return;
            } else {
                k(lqc.LOSE);
                return;
            }
        }
        if (winnerCode$default3 != null && winnerCode$default3.intValue() == 3) {
            k(lqc.DRAW);
        } else if (winnerCode$default3 != null && winnerCode$default3.intValue() == 4) {
            k(lqc.NO_CONTEST);
        } else {
            k(lqc.NONE);
        }
    }

    public abstract krk d();

    public abstract ImageView e();

    public abstract TextView f();

    public abstract TextView g();

    public abstract TextView h();

    public abstract TextView i();

    public abstract TextView j();

    public final void k(lqc lqcVar) {
        TextView i = i();
        i.setText(i.getContext().getString(lqcVar.a));
        i.setTextColor(i.getContext().getColor(lqcVar.b));
    }
}
