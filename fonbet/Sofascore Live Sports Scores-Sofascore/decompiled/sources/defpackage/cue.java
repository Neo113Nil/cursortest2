package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreRatingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cue extends o8 {
    public final z82 d;
    public final LayoutInflater e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cue(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.disclaimer;
        View B = nq8.B(R.id.disclaimer, root);
        if (B != null) {
            TextView textView = (TextView) nq8.B(R.id.label, B);
            if (textView == null) {
                yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(R.id.label)));
                throw null;
            }
            dk2 dk2Var = new dk2((LinearLayout) B, textView, 7);
            i = R.id.info_button;
            ImageView imageView = (ImageView) nq8.B(R.id.info_button, root);
            if (imageView != null) {
                i = R.id.players_holder;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.players_holder, root);
                if (linearLayout != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) nq8.B(R.id.title, root);
                    if (textView2 != null) {
                        i = R.id.view_top_players;
                        TextView textView3 = (TextView) nq8.B(R.id.view_top_players, root);
                        if (textView3 != null) {
                            this.d = new z82((LinearLayout) root, dk2Var, imageView, linearLayout, textView2, textView3);
                            this.e = LayoutInflater.from(context);
                            setVisibility(8);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_of_the_season_race;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r8v18, types: [android.view.View, android.widget.ImageView] */
    public final void j(List list, List list2, boolean z, Function0 function0, Function0 function02, Function0 function03) {
        ArrayList arrayList;
        String valueOf;
        String Q;
        Iterator it;
        TopPlayersStatisticsItem topPlayersStatisticsItem;
        int i;
        Drawable drawable;
        if (getVisibility() == 0) {
            return;
        }
        List list3 = list == null ? km5.a : list;
        List list4 = list2 == null ? km5.a : list2;
        boolean z2 = false;
        if (list3.size() < 3) {
            arrayList = null;
        } else {
            List L0 = CollectionsKt.L0(list3, 3);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list4) {
                if (yid.k(((BaseTopPlayersStatisticsItem) ((TopPlayersStatisticsItem) obj).getStatistics()).getRating()) > yid.k(((BaseTopPlayersStatisticsItem) ((TopPlayersStatisticsItem) CollectionsKt.h0(L0)).getStatistics()).getRating())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(k13.r(L0, 10));
            Iterator it2 = L0.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new Pair((TopPlayersStatisticsItem) it2.next(), Boolean.FALSE));
            }
            ArrayList arrayList4 = new ArrayList(k13.r(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(new Pair((TopPlayersStatisticsItem) it3.next(), Boolean.TRUE));
            }
            List<Pair> H0 = CollectionsKt.H0(CollectionsKt.w0(arrayList4, arrayList3), new wpb(15));
            arrayList = new ArrayList(k13.r(H0, 10));
            int i2 = 0;
            for (Pair pair : H0) {
                TopPlayersStatisticsItem topPlayersStatisticsItem2 = (TopPlayersStatisticsItem) pair.a;
                boolean booleanValue = ((Boolean) pair.b).booleanValue();
                if (booleanValue) {
                    valueOf = "-";
                } else {
                    i2++;
                    valueOf = String.valueOf(i2);
                }
                arrayList.add(new s2e(topPlayersStatisticsItem2, booleanValue, valueOf));
            }
        }
        if (arrayList == null) {
            return;
        }
        setVisibility(0);
        Team team = ((s2e) CollectionsKt.Y(arrayList)).a.getTeam();
        Gender gender = team != null ? team.getGender() : null;
        z82 z82Var = this.d;
        TextView textView = (TextView) z82Var.d;
        ?? r8 = (ImageView) z82Var.e;
        dk2 dk2Var = (dk2) z82Var.f;
        TextView textView2 = (TextView) z82Var.g;
        if (z) {
            Context context = getContext();
            context.getClass();
            Q = hkg.Q(context, R.string.player_of_the_tournament_race, gender, new Object[0]);
        } else {
            Context context2 = getContext();
            context2.getClass();
            Q = hkg.Q(context2, R.string.player_of_the_season_race, gender, new Object[0]);
        }
        textView.setText(Q);
        Context context3 = getContext();
        context3.getClass();
        textView2.setText(hkg.Q(context3, R.string.view_top_players, gender, new Object[0]));
        if (!arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (((s2e) it4.next()).b) {
                    TextView textView3 = dk2Var.c;
                    Context context4 = getContext();
                    context4.getClass();
                    textView3.setText(hkg.Q(context4, R.string.disclaimer_award_eligibility, gender, new Object[0]));
                    dk2Var.b.setVisibility(0);
                    break;
                }
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            s2e s2eVar = (s2e) it5.next();
            LinearLayout linearLayout = (LinearLayout) z82Var.c;
            View inflate = this.e.inflate(R.layout.image_labels_rating_layout, linearLayout, z2);
            linearLayout.addView(inflate);
            j22 b = j22.b(inflate);
            SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) b.j;
            ConstraintLayout constraintLayout = b.b;
            ImageView imageView = (ImageView) b.p;
            TextView textView4 = b.f;
            ImageView imageView2 = (ImageView) b.k;
            ImageView imageView3 = (ImageView) b.n;
            TextView textView5 = (TextView) b.g;
            TopPlayersStatisticsItem topPlayersStatisticsItem3 = s2eVar.a;
            textView5.setText(tba.t(topPlayersStatisticsItem3.getPlayer()));
            as9.l(imageView3, topPlayersStatisticsItem3.getPlayer().getId(), null);
            sofascoreRatingView.setVisibility(0);
            ((TextView) b.i).setVisibility(8);
            Double rating = ((BaseTopPlayersStatisticsItem) topPlayersStatisticsItem3.getStatistics()).getRating();
            if (rating != null) {
                topPlayersStatisticsItem = topPlayersStatisticsItem3;
                double doubleValue = rating.doubleValue();
                it = it5;
                sofascoreRatingView.setShouldAnimate(true);
                i = 0;
                sofascoreRatingView.m(doubleValue, false);
            } else {
                it = it5;
                topPlayersStatisticsItem = topPlayersStatisticsItem3;
                i = 0;
            }
            Team team2 = topPlayersStatisticsItem.getTeam();
            if (team2 != null) {
                ((LinearLayout) b.o).setVisibility(i);
                imageView2.setVisibility(i);
                as9.o(imageView2, team2.getId());
                TextView textView6 = (TextView) b.h;
                Context context5 = getContext();
                context5.getClass();
                textView6.setText(tba.p(context5, team2));
            }
            textView4.setText(s2eVar.c);
            if (s2eVar.b) {
                imageView3.setAlpha(0.5f);
                textView4.setAlpha(0.5f);
                imageView.setVisibility(0);
                Context context6 = getContext();
                context6.getClass();
                Integer valueOf2 = Integer.valueOf(R.color.alert);
                Drawable drawable2 = context6.getDrawable(R.drawable.ic_warning);
                if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                    drawable = null;
                } else {
                    drawable.setTint(context6.getColor(valueOf2.intValue()));
                }
                imageView.setImageDrawable(drawable);
            }
            constraintLayout.getClass();
            aba.y(constraintLayout, 0, 3);
            z8e.a0(constraintLayout, 1000L, new zbe(8, this, s2eVar));
            z2 = false;
            it5 = it;
        }
        r8.setVisibility(z ? 8 : z2);
        z8e.a0(r8, 1000L, function0);
        z8e.a0(textView2, 1000L, function02);
        function03.invoke();
    }
}
