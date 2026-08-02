package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PointType;
import com.sofascore.results.R;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class yye {
    public static final Set a = ph0.a0(new String[]{Sports.TABLE_TENNIS, Sports.BADMINTON});

    public static Integer a(Event event, Integer num) {
        if (!event.isDoublesMatch()) {
            if (num != null && num.intValue() == 1) {
                return Integer.valueOf(Event.getHomeTeam$default(event, null, 1, null).getId());
            }
            if (num != null && num.intValue() == 2) {
                return Integer.valueOf(Event.getAwayTeam$default(event, null, 1, null).getId());
            }
        }
        return null;
    }

    public static int b(PointType pointType) {
        int i = pointType == null ? -1 : xye.a[pointType.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? R.color.secondary_default : R.color.n_lv_3 : R.color.n_lv_1;
    }

    public static gv9 c(Context context, Event event, Integer num) {
        List c;
        if (event.isDoublesMatch()) {
            if (num != null && num.intValue() == 1) {
                String nameCode = Event.getHomeTeam$default(event, null, 1, null).getNameCode();
                if (nameCode == null || (c = a.c(nameCode)) == null) {
                    Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                    SubTeam subTeam1 = homeTeam$default.getSubTeam1();
                    String D = tba.D(subTeam1, context);
                    if (D == null) {
                        D = tba.v(subTeam1, context);
                    }
                    SubTeam subTeam2 = homeTeam$default.getSubTeam2();
                    String D2 = tba.D(subTeam2, context);
                    if (D2 == null) {
                        D2 = tba.v(subTeam2, context);
                    }
                    c = b.j(D, D2);
                }
            } else if (num != null && num.intValue() == 2) {
                String nameCode2 = Event.getAwayTeam$default(event, null, 1, null).getNameCode();
                if (nameCode2 == null || (c = a.c(nameCode2)) == null) {
                    Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                    SubTeam subTeam12 = awayTeam$default.getSubTeam1();
                    String D3 = tba.D(subTeam12, context);
                    if (D3 == null) {
                        D3 = tba.v(subTeam12, context);
                    }
                    SubTeam subTeam22 = awayTeam$default.getSubTeam2();
                    String D4 = tba.D(subTeam22, context);
                    if (D4 == null) {
                        D4 = tba.v(subTeam22, context);
                    }
                    c = b.j(D3, D4);
                }
            } else {
                c = a.c("");
            }
        } else if (num != null && num.intValue() == 1) {
            Team homeTeam$default2 = Event.getHomeTeam$default(event, null, 1, null);
            String A = tba.A(context, homeTeam$default2);
            if (A == null) {
                A = tba.p(context, homeTeam$default2);
            }
            c = a.c(A);
        } else if (num != null && num.intValue() == 2) {
            Team awayTeam$default2 = Event.getAwayTeam$default(event, null, 1, null);
            String A2 = tba.A(context, awayTeam$default2);
            if (A2 == null) {
                A2 = tba.p(context, awayTeam$default2);
            }
            c = a.c(A2);
        } else {
            c = a.c("");
        }
        return l6g.W(c);
    }

    public static int d(PointType pointType) {
        int i = pointType == null ? -1 : xye.a[pointType.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? R.color.secondary_default : (i == 4 || i == 5) ? R.color.value : R.color.n_lv_3 : R.color.n_lv_1;
    }
}
