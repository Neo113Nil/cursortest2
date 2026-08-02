package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreSmallRatingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kme extends p8 {
    public final z82 c;
    public final tug d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kme(z82 z82Var, tug tugVar) {
        super(r0);
        tugVar.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        constraintLayout.getClass();
        this.c = z82Var;
        this.d = tugVar;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        FrameLayout frameLayout;
        ule uleVar = (ule) obj;
        uleVar.getClass();
        z82 z82Var = this.c;
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) z82Var.g;
        tug tugVar = this.d;
        tugVar.d(scrollInterceptorHorizontalScrollView);
        ArrayList arrayList = uleVar.a.b;
        LinearLayout linearLayout = (LinearLayout) z82Var.f;
        tugVar.a(scrollInterceptorHorizontalScrollView, null);
        TextView textView = (TextView) z82Var.d;
        StringBuilder sb = new StringBuilder();
        UniqueTournament uniqueTournament = uleVar.b;
        sb.append(tba.x(uniqueTournament));
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics = uleVar.d;
        boolean c = Intrinsics.c(abstractPlayerSeasonStatistics.getType(), Season.SubSeasonType.REGULAR_SEASON.getLabel());
        Context context = this.b;
        if (c || Intrinsics.c(abstractPlayerSeasonStatistics.getType(), Season.SubSeasonType.PLAYOFFS.getLabel())) {
            Set set = f5k.a;
            sb.append(" (" + f5k.b(context, abstractPlayerSeasonStatistics.getType(), uniqueTournament.getSportSlug()) + ")");
        }
        textView.setText(sb.toString());
        as9.q((ImageView) z82Var.e, Integer.valueOf(uniqueTournament.getId()), 0, null);
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            pk2 pk2Var = (pk2) next;
            if (i3 < linearLayout.getChildCount()) {
                View childAt = linearLayout.getChildAt(i3);
                if (childAt == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout");
                    return;
                } else {
                    frameLayout = (FrameLayout) childAt;
                    frameLayout.setVisibility(0);
                }
            } else {
                frameLayout = (FrameLayout) dd.e(LayoutInflater.from(context).inflate(R.layout.player_league_career_stats_item_with_rating, (ViewGroup) linearLayout, false)).b;
                frameLayout.getClass();
                linearLayout.addView(frameLayout);
            }
            String str = (String) pk2Var.c.invoke(abstractPlayerSeasonStatistics);
            boolean z = pk2Var.e;
            frameLayout.setVisibility(0);
            dd e = dd.e(frameLayout);
            TextView textView2 = (TextView) e.d;
            SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) e.c;
            if (z) {
                textView2.setVisibility(8);
                sofascoreSmallRatingView.setVisibility(0);
                SofascoreSmallRatingView.l(sofascoreSmallRatingView, str);
            } else {
                sofascoreSmallRatingView.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setText(str);
                haa.C(textView2);
                textView2.setTypeface(Typeface.create(textView2.getTypeface(), 0), 0);
            }
            i3 = i4;
        }
        z8e.J(linearLayout, arrayList.size() - 1);
        ((MaterialDivider) z82Var.c).setVisibility(uleVar.e ? 0 : 8);
        ((ConstraintLayout) z82Var.b).post(new gjc(14, z82Var, this));
    }
}
