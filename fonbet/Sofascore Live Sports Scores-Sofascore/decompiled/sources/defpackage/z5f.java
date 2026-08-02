package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.TeamLinkedRound;
import com.sofascore.results.R;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z5f extends o8 {
    public final z82 d;
    public final joa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5f(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.chart_button;
        TextView textView = (TextView) nq8.B(R.id.chart_button, root);
        if (textView != null) {
            i = R.id.table_first_row;
            View B = nq8.B(R.id.table_first_row, root);
            if (B != null) {
                n9i a = n9i.a(B);
                i = R.id.table_header;
                View B2 = nq8.B(R.id.table_header, root);
                if (B2 != null) {
                    n9i a2 = n9i.a(B2);
                    i = R.id.table_second_row;
                    View B3 = nq8.B(R.id.table_second_row, root);
                    if (B3 != null) {
                        n9i a3 = n9i.a(B3);
                        i = R.id.title;
                        TextView textView2 = (TextView) nq8.B(R.id.title, root);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) root;
                            this.d = new z82((ViewGroup) constraintLayout, textView, (Object) a, (Object) a2, (Object) a3, (Object) textView2, 29);
                            this.e = ypa.a(ysa.c, new nzd(context, 28));
                            setVisibility(8);
                            constraintLayout.setClipToOutline(true);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final m0j getTeamRoundListPopup() {
        return (m0j) this.e.getValue();
    }

    public static final void l(bbi bbiVar, z5f z5fVar, View view) {
        StandingsTableRow standingsTableRow = bbiVar.c;
        List<TeamLinkedRound> teamLinks = standingsTableRow.getTeam().getTeamLinks();
        if (teamLinks == null || teamLinks.isEmpty()) {
            int i = TeamActivity.Z;
            Context context = z5fVar.getContext();
            context.getClass();
            jle.r(context, standingsTableRow.getTeam().getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            return;
        }
        List<TeamLinkedRound> teamLinks2 = standingsTableRow.getTeam().getTeamLinks();
        if (teamLinks2 != null) {
            Context context2 = z5fVar.getContext();
            context2.getClass();
            view.getClass();
            nxi.b(teamLinks2, context2, view, z5fVar.getTeamRoundListPopup());
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.prematch_standings_view;
    }

    public final void j(Event event, StandingsTableRow standingsTableRow, StandingsTableRow standingsTableRow2, boolean z, ox5 ox5Var) {
        standingsTableRow.getClass();
        standingsTableRow2.getClass();
        if (getVisibility() == 0) {
            return;
        }
        setVisibility(0);
        String s = ok3.s(event);
        List j = b.j(standingsTableRow, standingsTableRow2);
        ArrayList a = y9i.a(s);
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            t9i t9iVar = (t9i) next;
            t9i t9iVar2 = t9i.x;
            if (t9iVar == t9iVar2 || t9iVar.d.invoke(CollectionsKt.a0(0, j)) == null) {
                if (t9iVar == t9iVar2 && (j == null || !j.isEmpty())) {
                    Iterator it2 = j.iterator();
                    while (it2.hasNext()) {
                        if (t9iVar.d.invoke((StandingsTableRow) it2.next()) != null) {
                        }
                    }
                }
            }
            arrayList.add(next);
        }
        cai caiVar = cai.b;
        wai waiVar = new wai(0, caiVar, arrayList, arrayList, null, null, null, false, s);
        abi abiVar = abi.d;
        bbi bbiVar = new bbi(0, s, standingsTableRow, abiVar, caiVar, (List) arrayList, (List) arrayList, false, 384);
        bbi bbiVar2 = new bbi(0, s, standingsTableRow2, abiVar, caiVar, (List) arrayList, (List) arrayList, false, 384);
        z82 z82Var = this.d;
        n9i n9iVar = (n9i) z82Var.c;
        TextView textView = (TextView) z82Var.g;
        TextView textView2 = (TextView) z82Var.d;
        y6a.t(n9iVar, waiVar, new iai(), b.j(n9iVar.b, n9iVar.c, n9iVar.d, n9iVar.e, n9iVar.f, n9iVar.g, n9iVar.h, n9iVar.i, n9iVar.j), false);
        for (Pair pair : b.j(new Pair((n9i) z82Var.f, bbiVar), new Pair((n9i) z82Var.e, bbiVar2))) {
            Object obj = pair.a;
            obj.getClass();
            n9i n9iVar2 = (n9i) obj;
            bbi bbiVar3 = (bbi) pair.b;
            iai iaiVar = new iai();
            TextView textView3 = n9iVar2.b;
            ConstraintLayout constraintLayout = n9iVar2.a;
            y6a.u(n9iVar2, bbiVar3, iaiVar, b.j(textView3, n9iVar2.c, n9iVar2.d, n9iVar2.e, n9iVar2.f, n9iVar2.g, n9iVar2.h, n9iVar2.i, n9iVar2.j), tub.h(new Pair(n9iVar2.w, n9iVar2.l), new Pair(n9iVar2.x, n9iVar2.m), new Pair(n9iVar2.y, n9iVar2.n), new Pair(n9iVar2.z, n9iVar2.o), new Pair(n9iVar2.A, n9iVar2.p), new Pair(n9iVar2.B, n9iVar2.q)), false);
            n9iVar2.D.setTextColor(getContext().getColor(R.color.n_lv_1));
            constraintLayout.getClass();
            aba.y(constraintLayout, 0, 3);
            constraintLayout.setOnClickListener(new eyd(12, bbiVar3, this));
        }
        if (!z || textView2.getVisibility() == 0) {
            if (z || textView2.getVisibility() != 0) {
                return;
            }
            textView2.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var = (tl3) layoutParams;
            tl3Var.E = 0.5f;
            textView.setLayoutParams(tl3Var);
            return;
        }
        textView2.setVisibility(0);
        Integer valueOf = Integer.valueOf(R.drawable.ic_show_chart);
        ua5 ua5Var = ua5.a;
        Context context = textView2.getContext();
        context.getClass();
        haa.L(textView2, valueOf, ua5Var, Integer.valueOf(ao2.s(16, context)));
        textView2.setOnClickListener(new cne(ox5Var, 7));
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var2 = (tl3) layoutParams2;
        tl3Var2.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        textView.setLayoutParams(tl3Var2);
    }
}
