package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.shootout.PenaltiesGridView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ede extends o8 {
    public static final /* synthetic */ int m = 0;
    public int d;
    public int e;
    public final e92 f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ede(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = -1;
        this.e = -1;
        View root = getRoot();
        int i = R.id.first_team_penalty_layout;
        View B = nq8.B(R.id.first_team_penalty_layout, root);
        if (B != null) {
            v82 e = v82.e(B);
            i = R.id.penalty_teams_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.penalty_teams_container, root);
            if (linearLayout != null) {
                i = R.id.penalty_title;
                TextView textView = (TextView) nq8.B(R.id.penalty_title, root);
                if (textView != null) {
                    i = R.id.second_team_penalty_layout;
                    View B2 = nq8.B(R.id.second_team_penalty_layout, root);
                    if (B2 != null) {
                        this.f = new e92((LinearLayout) root, e, linearLayout, textView, v82.e(B2), 18);
                        this.g = ao2.s(560, context);
                        this.h = ao2.s(8, context);
                        this.i = ao2.s(12, context);
                        this.j = ao2.s(16, context);
                        this.k = ao2.s(24, context);
                        this.l = ao2.s(248, context);
                        o8.d(this, 0, 7);
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    public static ArrayList l(int i, List list, ComposeView composeView) {
        String playerName;
        tce tceVar;
        tce tceVar2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                if (list.size() < i2) {
                    tceVar2 = tce.a;
                } else {
                    Incident.PenaltyShotIncident penaltyShotIncident = (Incident.PenaltyShotIncident) list.get(i2 - 1);
                    Player player = penaltyShotIncident.getPlayer();
                    if ((player == null || (playerName = tba.C(player)) == null) && (playerName = penaltyShotIncident.getPlayerName()) == null) {
                        playerName = "-";
                    }
                    String h = me4.h("\\s+", playerName, " ");
                    String str = list.size() > i2 ? ", " : null;
                    if (str == null) {
                        str = "";
                    }
                    String y = dmi.y(h, str);
                    if (Intrinsics.c(penaltyShotIncident.getIncidentClass(), Incident.PenaltyShotIncident.PENALTY_SHOT_SCORED)) {
                        tceVar = tce.b;
                        arrayList.add(new bde(y, tceVar));
                    } else {
                        tceVar = tce.c;
                        arrayList.add(new bde(y, tceVar));
                    }
                    tceVar2 = tceVar;
                }
                arrayList2.add(tceVar2);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        composeView.setContent(new tc3(-264772695, new cde(arrayList, 0), true));
        return arrayList2;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.penalty_shootout_holder_layout;
    }

    public final void j(Event event, List list) {
        int i;
        list.getClass();
        event.getClass();
        boolean c = Intrinsics.c(event.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS);
        this.d = Event.getHomeTeam$default(event, null, 1, null).getId();
        this.e = Event.getAwayTeam$default(event, null, 1, null).getId();
        e92 e92Var = this.f;
        if (c) {
            haa.B((TextView) e92Var.f);
        } else {
            haa.C((TextView) e92Var.f);
        }
        if (dde.a(list).isEmpty()) {
            return;
        }
        ArrayList a = dde.a(list);
        int i2 = Intrinsics.c(ok3.s(event), Sports.MINI_FOOTBALL) ? 3 : 5;
        int i3 = ((i2 * 2) - 1) * this.h;
        v82 v82Var = (v82) e92Var.d;
        v82 v82Var2 = (v82) e92Var.d;
        v82 v82Var3 = (v82) e92Var.c;
        PenaltiesGridView penaltiesGridView = (PenaltiesGridView) v82Var.f;
        ViewGroup.LayoutParams layoutParams = penaltiesGridView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = i3;
        penaltiesGridView.setLayoutParams(layoutParams);
        PenaltiesGridView penaltiesGridView2 = (PenaltiesGridView) v82Var3.f;
        ViewGroup.LayoutParams layoutParams2 = penaltiesGridView2.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams2.width = i3;
        penaltiesGridView2.setLayoutParams(layoutParams2);
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (Intrinsics.c(Incident.isHome$default((Incident.PenaltyShotIncident) next, null, 1, null), Boolean.TRUE)) {
                arrayList.add(next);
            }
        }
        List B0 = CollectionsKt.B0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (Intrinsics.c(Incident.isHome$default((Incident.PenaltyShotIncident) next2, null, 1, null), Boolean.FALSE)) {
                arrayList2.add(next2);
            }
        }
        List B02 = CollectionsKt.B0(arrayList2);
        int i4 = 0;
        ((LinearLayout) e92Var.e).setVisibility(0);
        PenaltiesGridView penaltiesGridView3 = (PenaltiesGridView) v82Var2.f;
        penaltiesGridView3.f = true;
        ((GridLayout) penaltiesGridView3.d.b).setColumnCount(i2);
        PenaltiesGridView penaltiesGridView4 = (PenaltiesGridView) v82Var3.f;
        penaltiesGridView4.f = true;
        ((GridLayout) penaltiesGridView4.d.b).setColumnCount(i2);
        int max = Math.max(B0.size(), B02.size());
        ArrayList l = l(max, B0, (ComposeView) v82Var2.g);
        ArrayList l2 = l(max, B02, (ComposeView) v82Var3.g);
        if (l.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = l.iterator();
            i = 0;
            while (it3.hasNext()) {
                if (((tce) it3.next()) == tce.b && (i = i + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        if (!l2.isEmpty()) {
            Iterator it4 = l2.iterator();
            while (it4.hasNext()) {
                if (((tce) it4.next()) == tce.b && (i4 = i4 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        cga.Q(v82Var2, this.d, i, i - i4, c);
        cga.Q(v82Var3, this.e, i4, i4 - i, c);
        if (B0.size() == B02.size() && i == i4 && max >= i2) {
            tce tceVar = tce.a;
            l.add(tceVar);
            l2.add(tceVar);
        }
        cga.O(v82Var2, l, i2);
        cga.O(v82Var3, l2, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ((LinearLayout) this.f.e).post(new pn0(this, i, 12));
    }
}
