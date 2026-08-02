package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y5f extends o8 {
    public final p12 d;
    public final mqi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5f(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.compare_button;
        TextView textView = (TextView) nq8.B(R.id.compare_button, root);
        if (textView != null) {
            i = R.id.divider_1;
            View B = nq8.B(R.id.divider_1, root);
            if (B != null) {
                i = R.id.divider_2;
                View B2 = nq8.B(R.id.divider_2, root);
                if (B2 != null) {
                    i = R.id.logo_away_team;
                    ImageView imageView = (ImageView) nq8.B(R.id.logo_away_team, root);
                    if (imageView != null) {
                        i = R.id.logo_home_team;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.logo_home_team, root);
                        if (imageView2 != null) {
                            i = R.id.nr_draws;
                            TextView textView2 = (TextView) nq8.B(R.id.nr_draws, root);
                            if (textView2 != null) {
                                i = R.id.nr_win_away_team;
                                TextView textView3 = (TextView) nq8.B(R.id.nr_win_away_team, root);
                                if (textView3 != null) {
                                    i = R.id.nr_win_home_team;
                                    TextView textView4 = (TextView) nq8.B(R.id.nr_win_home_team, root);
                                    if (textView4 != null) {
                                        i = R.id.recycler;
                                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler, root);
                                        if (recyclerView != null) {
                                            i = R.id.title;
                                            TextView textView5 = (TextView) nq8.B(R.id.title, root);
                                            if (textView5 != null) {
                                                this.d = new p12((ConstraintLayout) root, textView, B, B2, imageView, imageView2, textView2, textView3, textView4, recyclerView, textView5);
                                                this.e = ypa.b(new nzd(context, 27));
                                                setVisibility(8);
                                                return;
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final x5f getH2hAdapter() {
        return (x5f) this.e.getValue();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.prematch_h2h_view;
    }

    public final void j(Event event, Tournament tournament, List list, int i, int i2, boolean z) {
        tournament.getClass();
        list.getClass();
        if (getVisibility() == 0) {
            return;
        }
        setVisibility(0);
        int i3 = 1;
        yba ybaVar = new yba(this, 1);
        p12 p12Var = this.d;
        TextView textView = (TextView) p12Var.l;
        String slug = tournament.getCategory().getSport().getSlug();
        textView.setText(Intrinsics.c(slug, Sports.E_SPORTS) ? getContext().getString(R.string.pre_game_head_to_head_esports) : ph0.a0(new String[]{Sports.BASKETBALL, Sports.AMERICAN_FOOTBALL, Sports.ICE_HOCKEY, Sports.BASEBALL}).contains(slug) ? getContext().getString(R.string.pre_game_head_to_head) : getContext().getString(R.string.pre_match_head_to_head));
        RecyclerView recyclerView = (RecyclerView) p12Var.k;
        x5f h2hAdapter = getH2hAdapter();
        int i4 = 4;
        pte pteVar = new pte(recyclerView, i4);
        h2hAdapter.getClass();
        h2hAdapter.a.d = pteVar;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(getH2hAdapter());
        recyclerView.addOnItemTouchListener(ybaVar);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (it.hasNext()) {
                w5f w5fVar = (w5f) it.next();
                Integer num = w5fVar.f;
                if (num == null || num.intValue() != i3 || w5fVar.b != i) {
                    if ((num != null && num.intValue() == i3) || (num != null && num.intValue() == 2 && w5fVar.c == i2)) {
                        i6++;
                    } else if (num == null || num.intValue() != 2) {
                        i7++;
                    }
                    i3 = 1;
                }
                i5++;
                i3 = 1;
            }
            ImageView imageView = (ImageView) p12Var.g;
            TextView textView2 = (TextView) p12Var.h;
            as9.o(imageView, i);
            z8e.a0(imageView, 1000L, new bk7(this, i, i4));
            ImageView imageView2 = (ImageView) p12Var.f;
            as9.o(imageView2, i2);
            z8e.a0(imageView2, 1000L, new bk7(this, i2, i4));
            ((TextView) p12Var.j).setText(String.valueOf(i5));
            ((TextView) p12Var.i).setText(String.valueOf(i6));
            textView2.setText(String.valueOf(i7));
            if (wyh.j(tournament)) {
                ((View) p12Var.d).setVisibility(8);
                textView2.setVisibility(8);
            }
        }
        getH2hAdapter().F(list);
        TextView textView3 = (TextView) p12Var.c;
        textView3.setVisibility(z ? 0 : 8);
        if (z) {
            z8e.a0(textView3, 1000L, new ug9(textView3, i, i2, event));
        }
    }
}
