package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentOddsView;
import com.sofascore.results.view.BellButton;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yu7 extends g7 {
    public final g6b l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu7(Context context, g6b g6bVar) {
        super(context);
        context.getClass();
        g6bVar.getClass();
        this.l = g6bVar;
    }

    public final void G() {
        Iterator it = this.i.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            if (next instanceof iv7) {
                notifyItemChanged(this.g.size() + i, new scb(((iv7) next).a));
            }
            i = i2;
        }
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        return Integer.valueOf(R.id.container);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return i == 0;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewDetachedFromWindow(u uVar) {
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        super.onViewDetachedFromWindow(p8Var);
        if (p8Var instanceof xu7) {
            ((Handler) ((xu7) p8Var).h.getValue()).removeMessages(0);
        }
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 14);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof iv7) {
            return 0;
        }
        if (obj instanceof String) {
            return 1;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.b;
        if (i != 0) {
            if (i == 1) {
                return new z02(kqb.d(hkg.S(context), viewGroup, false));
            }
            ilg.c();
            return null;
        }
        View inflate = hkg.S(context).inflate(R.layout.viewholder_event_featured_tournament, viewGroup, false);
        int i2 = R.id.bell_button;
        BellButton bellButton = (BellButton) nq8.B(R.id.bell_button, inflate);
        if (bellButton != null) {
            i2 = R.id.choice_group;
            TextView textView = (TextView) nq8.B(R.id.choice_group, inflate);
            if (textView != null) {
                i2 = R.id.container;
                ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.container, inflate);
                if (constraintLayout != null) {
                    i2 = R.id.event_odds;
                    FeaturedTournamentOddsView featuredTournamentOddsView = (FeaturedTournamentOddsView) nq8.B(R.id.event_odds, inflate);
                    if (featuredTournamentOddsView != null) {
                        i2 = R.id.first_team_logo;
                        ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, inflate);
                        if (imageView != null) {
                            i2 = R.id.first_team_name;
                            TextView textView2 = (TextView) nq8.B(R.id.first_team_name, inflate);
                            if (textView2 != null) {
                                i2 = R.id.first_team_score;
                                TextView textView3 = (TextView) nq8.B(R.id.first_team_score, inflate);
                                if (textView3 != null) {
                                    i2 = R.id.info_label;
                                    TextView textView4 = (TextView) nq8.B(R.id.info_label, inflate);
                                    if (textView4 != null) {
                                        i2 = R.id.live_label;
                                        TextView textView5 = (TextView) nq8.B(R.id.live_label, inflate);
                                        if (textView5 != null) {
                                            i2 = R.id.main_text;
                                            TextView textView6 = (TextView) nq8.B(R.id.main_text, inflate);
                                            if (textView6 != null) {
                                                i2 = R.id.market_name;
                                                TextView textView7 = (TextView) nq8.B(R.id.market_name, inflate);
                                                if (textView7 != null) {
                                                    i2 = R.id.second_team_logo;
                                                    ImageView imageView2 = (ImageView) nq8.B(R.id.second_team_logo, inflate);
                                                    if (imageView2 != null) {
                                                        i2 = R.id.second_team_name;
                                                        TextView textView8 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                                        if (textView8 != null) {
                                                            i2 = R.id.second_team_score;
                                                            TextView textView9 = (TextView) nq8.B(R.id.second_team_score, inflate);
                                                            if (textView9 != null) {
                                                                i2 = R.id.secondary_text;
                                                                TextView textView10 = (TextView) nq8.B(R.id.secondary_text, inflate);
                                                                if (textView10 != null) {
                                                                    i2 = R.id.secondary_text_2;
                                                                    TextView textView11 = (TextView) nq8.B(R.id.secondary_text_2, inflate);
                                                                    if (textView11 != null) {
                                                                        i2 = R.id.slash;
                                                                        TextView textView12 = (TextView) nq8.B(R.id.slash, inflate);
                                                                        if (textView12 != null) {
                                                                            i2 = R.id.special_status_indicator;
                                                                            TextView textView13 = (TextView) nq8.B(R.id.special_status_indicator, inflate);
                                                                            if (textView13 != null) {
                                                                                return new xu7(new f92((FrameLayout) inflate, bellButton, textView, constraintLayout, featuredTournamentOddsView, imageView, textView2, textView3, textView4, textView5, textView6, textView7, imageView2, textView8, textView9, textView10, textView11, textView12, textView13), this.l);
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
