package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.BaseballEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.results.R;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hm1 extends y21 {
    public final BaseballEvent O;
    public jfj P = new jfj(7, (String) null, (Integer) null);
    public jfj Q = new jfj(7, (String) null, (Integer) null);
    public jfj R;
    public jfj S;

    public hm1(BaseballEvent baseballEvent) {
        this.O = baseballEvent;
    }

    @Override // defpackage.y21
    public final Event d() {
        return this.O;
    }

    @Override // defpackage.y21
    public final void h(Context context, Event event) {
        String str;
        int i;
        BaseballEvent baseballEvent = (BaseballEvent) event;
        context.getClass();
        baseballEvent.getClass();
        long startTimestamp = baseballEvent.getStartTimestamp();
        bi4 bi4Var = bi4.PATTERN_DM;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        this.P = new jfj(6, fc6.i(startTimestamp, hk4.a(bi4Var.d())), (Integer) null);
        Integer num = this.l;
        int id = baseballEvent.getHomeTeam(TeamSides.ORIGINAL).getId();
        if (num != null && num.intValue() == id) {
            String string = context.getString(R.string.versus);
            string.getClass();
            str = string.toLowerCase(Locale.ROOT);
            str.getClass();
        } else {
            str = "@";
        }
        this.Q = new jfj(6, str, (Integer) null);
        if (ok3.E(baseballEvent)) {
            this.S = new jfj(4, context.getString(R.string.upcoming), Integer.valueOf(R.color.n_lv_3));
            return;
        }
        boolean C = ok3.C(baseballEvent);
        int i2 = R.color.error;
        if (!C) {
            String c = afi.c(context, baseballEvent.getStatusDescription(), Sports.BASEBALL, false);
            if (ok3.D(baseballEvent)) {
                i2 = R.color.live;
            }
            this.S = new jfj(4, c, Integer.valueOf(i2));
            return;
        }
        Integer num2 = this.l;
        int i3 = (num2 != null && num2.intValue() == Event.getHomeTeam$default(baseballEvent, null, 1, null).getId()) ? 1 : 2;
        Integer winnerCode$default = Event.getWinnerCode$default(baseballEvent, null, 1, null);
        if (winnerCode$default != null && winnerCode$default.intValue() == 3) {
            i = R.string.any_sport_draws_short;
        } else {
            Integer winnerCode$default2 = Event.getWinnerCode$default(baseballEvent, null, 1, null);
            i = (winnerCode$default2 != null && i3 == winnerCode$default2.intValue()) ? R.string.any_sport_wins_short : R.string.any_sport_losses_short;
        }
        String string2 = context.getString(i);
        string2.getClass();
        Integer winnerCode$default3 = Event.getWinnerCode$default(baseballEvent, null, 1, null);
        if (winnerCode$default3 != null && winnerCode$default3.intValue() == 3) {
            i2 = R.color.neutral_default;
        } else {
            Integer winnerCode$default4 = Event.getWinnerCode$default(baseballEvent, null, 1, null);
            if (winnerCode$default4 != null && i3 == winnerCode$default4.intValue()) {
                i2 = R.color.success;
            }
        }
        String m = ljg.m(Event.getHomeScore$default(baseballEvent, null, 1, null).getDisplay(), Event.getAwayScore$default(baseballEvent, null, 1, null).getDisplay(), "-");
        if (hkg.c0(context)) {
            m = n9e.G(m, "-");
        }
        this.R = new jfj(4, lnb.o(string2, " ", m), Integer.valueOf(i2));
    }
}
