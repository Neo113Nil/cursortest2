package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bme extends g7 {
    public final List l;
    public final boolean m;
    public final eme n;
    public final tug o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bme(Context context, List list, boolean z, eme emeVar) {
        super(context);
        context.getClass();
        list.getClass();
        this.l = list;
        this.m = z;
        this.n = emeVar;
        this.o = new tug();
    }

    @Override // defpackage.ysk
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        zle zleVar = (zle) obj;
        boolean z = zleVar instanceof yle;
        Object obj2 = null;
        Integer num = z ? ((yle) zleVar).f : null;
        boolean z2 = zleVar instanceof ule;
        Integer valueOf = z2 ? Integer.valueOf(((ule) zleVar).b.getId()) : null;
        String str = z ? ((yle) zleVar).b : z2 ? ((ule) zleVar).c : null;
        loop0: for (Object obj3 : this.l) {
            UniqueTournamentSeasons uniqueTournamentSeasons = (UniqueTournamentSeasons) obj3;
            int id = uniqueTournamentSeasons.getUniqueTournament().getId();
            if (valueOf == null || id != valueOf.intValue()) {
                List<Season> seasons = uniqueTournamentSeasons.getSeasons();
                if (seasons == null || !seasons.isEmpty()) {
                    Iterator<T> it = seasons.iterator();
                    while (it.hasNext()) {
                        int id2 = ((Season) it.next()).getId();
                        if (num != null && id2 == num.intValue()) {
                        }
                    }
                }
            }
            obj2 = obj3;
        }
        UniqueTournamentSeasons uniqueTournamentSeasons2 = (UniqueTournamentSeasons) obj2;
        if (uniqueTournamentSeasons2 == null) {
            return false;
        }
        List<Season> seasons2 = uniqueTournamentSeasons2.getSeasons();
        if (seasons2 != null && seasons2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = seasons2.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.c(((Season) it2.next()).getYear(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 0);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        zle zleVar = (zle) obj;
        zleVar.getClass();
        if (zleVar instanceof tle) {
            return 1;
        }
        if (zleVar instanceof yle) {
            return 2;
        }
        if (zleVar instanceof wle) {
            return 3;
        }
        if (zleVar instanceof xle) {
            return 4;
        }
        if (zleVar instanceof ule) {
            return 5;
        }
        zzl.s();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        tug tugVar = this.o;
        boolean z = this.m;
        Context context = this.b;
        int i2 = 0;
        int i3 = 1;
        if (i == 1) {
            z82 l = z82.l(LayoutInflater.from(context), viewGroup);
            if (z) {
                x2a.U(l);
            }
            tugVar.getClass();
            return new jme(l, tugVar, i2);
        }
        if (i == 2) {
            z82 l2 = z82.l(LayoutInflater.from(context), viewGroup);
            if (z) {
                x2a.U(l2);
            }
            tugVar.getClass();
            return new jme(l2, tugVar, i3);
        }
        if (i == 3) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.player_league_career_stats_legend, viewGroup, false);
            int i4 = R.id.legend_item_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.legend_item_container, inflate);
            if (linearLayout != null) {
                i4 = R.id.sub_section_title;
                if (((TextView) nq8.B(R.id.sub_section_title, inflate)) != null) {
                    return new ja9(new ed((LinearLayout) inflate, 19, linearLayout));
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
            return null;
        }
        if (i == 4) {
            z82 l3 = z82.l(LayoutInflater.from(context), viewGroup);
            if (z) {
                x2a.U(l3);
            }
            return new lme(l3, tugVar, this.n);
        }
        if (i != 5) {
            a70.p(ljg.j(i, "Unknown view type: "));
            return null;
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.player_league_career_stats_competition_stat_row, viewGroup, false);
        int i5 = R.id.competition_logo;
        ImageView imageView = (ImageView) nq8.B(R.id.competition_logo, inflate2);
        if (imageView != null) {
            i5 = R.id.competition_name;
            TextView textView = (TextView) nq8.B(R.id.competition_name, inflate2);
            if (textView != null) {
                i5 = R.id.container;
                LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.container, inflate2);
                if (linearLayout2 != null) {
                    i5 = R.id.divider;
                    MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate2);
                    if (materialDivider != null) {
                        i5 = R.id.scroller;
                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate2);
                        if (scrollInterceptorHorizontalScrollView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
                            z82 z82Var = new z82(constraintLayout, imageView, textView, (View) linearLayout2, (View) materialDivider, (View) scrollInterceptorHorizontalScrollView, 26);
                            if (z) {
                                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                                if (layoutParams == null) {
                                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                    return null;
                                }
                                tl3 tl3Var = (tl3) layoutParams;
                                ((ViewGroup.MarginLayoutParams) tl3Var).width = 0;
                                tl3Var.u = scrollInterceptorHorizontalScrollView.getId();
                                textView.setLayoutParams(tl3Var);
                                ViewGroup.LayoutParams layoutParams2 = scrollInterceptorHorizontalScrollView.getLayoutParams();
                                if (layoutParams2 == null) {
                                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                    return null;
                                }
                                tl3 tl3Var2 = (tl3) layoutParams2;
                                Context context2 = constraintLayout.getContext();
                                context2.getClass();
                                ((ViewGroup.MarginLayoutParams) tl3Var2).width = ao2.s(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, context2);
                                scrollInterceptorHorizontalScrollView.setLayoutParams(tl3Var2);
                            }
                            return new kme(z82Var, tugVar);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i5)));
        return null;
    }
}
