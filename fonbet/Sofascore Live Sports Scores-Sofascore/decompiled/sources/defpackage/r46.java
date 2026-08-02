package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.event.overs.view.OverBallsContainerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r46 extends g7 {
    public final t46 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r46(Context context, t46 t46Var) {
        super(context);
        context.getClass();
        this.l = t46Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(CricketEvent cricketEvent, List list, TeamSelection teamSelection) {
        q04 q04Var;
        Team homeTeam$default;
        boolean z;
        teamSelection.getClass();
        ArrayList<q04> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            q04Var = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Incident.CricketIncident cricketIncident = (Incident.CricketIncident) CollectionsKt.firstOrNull(((q04) next).c);
            if (cricketIncident != null && cricketIncident.getBattingTeamId() == Event.getHomeTeam$default(cricketEvent, null, 1, null).getId()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            Incident.CricketIncident cricketIncident2 = (Incident.CricketIncident) CollectionsKt.firstOrNull(((q04) obj).c);
            if (cricketIncident2 != null && cricketIncident2.getBattingTeamId() == Event.getAwayTeam$default(cricketEvent, null, 1, null).getId()) {
                arrayList2.add(obj);
            }
        }
        int i = q46.a[teamSelection.ordinal()];
        if (i == 1) {
            homeTeam$default = Event.getHomeTeam$default(cricketEvent, null, 1, null);
        } else if (i != 2) {
            homeTeam$default = Event.getHomeTeam$default(cricketEvent, null, 1, null);
        } else {
            homeTeam$default = Event.getAwayTeam$default(cricketEvent, null, 1, null);
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            F(a.c(new j29(Integer.valueOf(R.drawable.play_by_play), null, Integer.valueOf(R.string.cricket_overs_empty_state), 501)));
            return;
        }
        Incident.CricketIncident cricketIncident3 = (Incident.CricketIncident) CollectionsKt.Y(((q04) CollectionsKt.Y(arrayList)).c);
        if (Intrinsics.c(cricketEvent.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS)) {
            Integer currentBattingTeamId = cricketEvent.getCurrentBattingTeamId();
            int battingTeamId = cricketIncident3.getBattingTeamId();
            if (currentBattingTeamId != null && currentBattingTeamId.intValue() == battingTeamId) {
                z = true;
                Integer inningNumber = cricketIncident3.getInningNumber();
                int intValue = inningNumber == null ? inningNumber.intValue() : 1;
                xbb b = a.b();
                b.add(new f14(homeTeam$default, (1 <= intValue || intValue >= 3) ? 2 : 1, z, ((q04) CollectionsKt.Y(arrayList)).d));
                for (q04 q04Var2 : arrayList) {
                    int i2 = q04Var2.a;
                    if (intValue != i2) {
                        if (q04Var != null) {
                            q04Var.e = true;
                        }
                        b.add(new f14(homeTeam$default, (1 > i2 || i2 >= 3) ? 2 : 1, false, q04Var2.d));
                        intValue = i2;
                    }
                    b.add(q04Var2);
                    q04Var = q04Var2;
                }
                xbb a = a.a(b);
                if (q04Var != null) {
                    q04Var.e = true;
                }
                F(a);
            }
        }
        z = false;
        Integer inningNumber2 = cricketIncident3.getInningNumber();
        if (inningNumber2 == null) {
        }
        xbb b2 = a.b();
        b2.add(new f14(homeTeam$default, (1 <= intValue || intValue >= 3) ? 2 : 1, z, ((q04) CollectionsKt.Y(arrayList)).d));
        while (r11.hasNext()) {
        }
        xbb a2 = a.a(b2);
        if (q04Var != null) {
        }
        F(a2);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 29);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof q04) {
            return 1;
        }
        if (obj instanceof f14) {
            return 2;
        }
        if (obj instanceof j29) {
            return 4;
        }
        a70.p(r46.class.getName());
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.b;
        if (i != 1) {
            if (i == 2) {
                return new wh(js2.b(LayoutInflater.from(context), viewGroup));
            }
            if (i != 4) {
                a70.p(r46.class.getName());
                return null;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) v82.g(LayoutInflater.from(context), viewGroup).b;
            constraintLayout.getClass();
            return new wh(constraintLayout);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.cricket_over_item_layout, viewGroup, false);
        int i2 = R.id.batter_image_double;
        View B = nq8.B(R.id.batter_image_double, inflate);
        if (B != null) {
            drc a = drc.a(B);
            i2 = R.id.batter_image_multiple;
            View B2 = nq8.B(R.id.batter_image_multiple, inflate);
            if (B2 != null) {
                z82 e = z82.e(B2);
                i2 = R.id.batter_image_single;
                ImageView imageView = (ImageView) nq8.B(R.id.batter_image_single, inflate);
                if (imageView != null) {
                    i2 = R.id.bottom_divider;
                    View B3 = nq8.B(R.id.bottom_divider, inflate);
                    if (B3 != null) {
                        i2 = R.id.bowler_image_double;
                        View B4 = nq8.B(R.id.bowler_image_double, inflate);
                        if (B4 != null) {
                            drc a2 = drc.a(B4);
                            i2 = R.id.bowler_image_multiple;
                            View B5 = nq8.B(R.id.bowler_image_multiple, inflate);
                            if (B5 != null) {
                                z82 e2 = z82.e(B5);
                                i2 = R.id.bowler_image_single;
                                ImageView imageView2 = (ImageView) nq8.B(R.id.bowler_image_single, inflate);
                                if (imageView2 != null) {
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                    i2 = R.id.container_view;
                                    OverBallsContainerView overBallsContainerView = (OverBallsContainerView) nq8.B(R.id.container_view, inflate);
                                    if (overBallsContainerView != null) {
                                        i2 = R.id.over_number;
                                        TextView textView = (TextView) nq8.B(R.id.over_number, inflate);
                                        if (textView != null) {
                                            i2 = R.id.player_description;
                                            TextView textView2 = (TextView) nq8.B(R.id.player_description, inflate);
                                            if (textView2 != null) {
                                                i2 = R.id.runs_number;
                                                TextView textView3 = (TextView) nq8.B(R.id.runs_number, inflate);
                                                if (textView3 != null) {
                                                    return new fyd(new zl(constraintLayout2, a, e, imageView, B3, a2, e2, imageView2, constraintLayout2, overBallsContainerView, textView, textView2, textView3), this.l);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
