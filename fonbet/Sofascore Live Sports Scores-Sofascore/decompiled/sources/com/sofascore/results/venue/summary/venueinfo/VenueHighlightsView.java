package com.sofascore.results.venue.summary.venueinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.VenueSportStatistics;
import com.sofascore.results.R;
import defpackage.lm5;
import defpackage.nq8;
import defpackage.o8;
import defpackage.vy1;
import defpackage.w9h;
import defpackage.wyh;
import defpackage.wzb;
import defpackage.y9h;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/venue/summary/venueinfo/VenueHighlightsView;", "Lo8;", "", "getLayoutId", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VenueHighlightsView extends o8 {
    public static final /* synthetic */ int i = 0;
    public final vy1 d;
    public final LayoutInflater e;
    public final ArrayList f;
    public Map g;
    public final LinkedHashSet h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VenueHighlightsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        if (root == null) {
            yhk.s("rootView");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) root;
        this.d = new vy1(linearLayout, 5);
        this.e = LayoutInflater.from(context);
        this.f = new ArrayList();
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.g = lm5Var;
        this.h = y9h.f(wyh.A, w9h.b(Sports.MMA));
        setVisibility(8);
        linearLayout.setClipToOutline(true);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_card_linear;
    }

    public final void j(String str, String str2) {
        LinearLayout linearLayout = this.d.b;
        View inflate = this.e.inflate(R.layout.summary_info_single_line_layout, (ViewGroup) linearLayout, false);
        linearLayout.addView(inflate);
        int i2 = R.id.label;
        TextView textView = (TextView) nq8.B(R.id.label, inflate);
        if (textView != null) {
            i2 = R.id.value;
            TextView textView2 = (TextView) nq8.B(R.id.value, inflate);
            if (textView2 != null) {
                LinearLayout linearLayout2 = (LinearLayout) inflate;
                textView.setText(str);
                textView2.setText(str2);
                linearLayout2.getClass();
                this.f.add(linearLayout2);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final void l(String str) {
        Float drawsPercentage;
        Float homeTeamWinsPercentage;
        ArrayList arrayList = this.f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.d.b.removeView((View) it.next());
        }
        arrayList.clear();
        VenueSportStatistics venueSportStatistics = (VenueSportStatistics) this.g.get(str);
        if (venueSportStatistics == null) {
            return;
        }
        boolean c = Intrinsics.c(str, Sports.FOOTBALL);
        String string = wyh.A.contains(str) ? getContext().getString(R.string.racquet_sports_matches_played) : Intrinsics.c(str, Sports.MMA) ? getContext().getString(R.string.total_events) : Intrinsics.c(str, Sports.BASKETBALL) ? getContext().getString(R.string.basketball_games_played) : Intrinsics.c(str, Sports.BASEBALL) ? getContext().getString(R.string.baseball_games_played) : Intrinsics.c(str, Sports.AMERICAN_FOOTBALL) ? getContext().getString(R.string.am_foot_games_played) : Intrinsics.c(str, Sports.ICE_HOCKEY) ? getContext().getString(R.string.hockey_games_played) : getContext().getString(R.string.matches_played);
        string.getClass();
        j(string, String.valueOf(venueSportStatistics.getTotalMatches()));
        if (c) {
            String string2 = getContext().getString(R.string.football_goals_scored);
            string2.getClass();
            j(string2, String.valueOf(venueSportStatistics.getGoalsScored()));
        }
        if (!this.h.contains(str) && (homeTeamWinsPercentage = venueSportStatistics.getHomeTeamWinsPercentage()) != null) {
            float floatValue = homeTeamWinsPercentage.floatValue();
            String string3 = getContext().getString(R.string.home_team_wins);
            string3.getClass();
            j(string3, wzb.b(floatValue) + "%");
        }
        if (!c || (drawsPercentage = venueSportStatistics.getDrawsPercentage()) == null) {
            return;
        }
        float floatValue2 = drawsPercentage.floatValue();
        String string4 = getContext().getString(R.string.draws);
        string4.getClass();
        j(string4, wzb.b(floatValue2) + "%");
    }
}
