package com.sofascore.results.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.nq8;
import defpackage.o8;
import defpackage.pn2;
import defpackage.s61;
import defpackage.xt7;
import defpackage.yhk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/view/FeatureMatchCardView;", "Lo8;", "", "getLayoutId", "()I", "Lkotlin/Function0;", "", "callback", "setOpenEventClick", "(Lkotlin/jvm/functions/Function0;)V", "setCtaClick", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureMatchCardView extends o8 {
    public static final /* synthetic */ int l = 0;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final xt7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureMatchCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.d = context.getColor(R.color.n_lv_1);
        this.e = context.getColor(R.color.n_lv_3);
        this.f = context.getColor(R.color.live);
        this.g = ao2.s(20, context);
        this.h = ao2.s(28, context);
        this.i = ao2.s(40, context);
        this.j = ao2.s(48, context);
        View root = getRoot();
        int i = R.id.away_logo_barrier;
        if (((Barrier) nq8.B(R.id.away_logo_barrier, root)) != null) {
            i = R.id.away_team_flag_1;
            ImageView imageView = (ImageView) nq8.B(R.id.away_team_flag_1, root);
            if (imageView != null) {
                i = R.id.away_team_flag_2;
                ImageView imageView2 = (ImageView) nq8.B(R.id.away_team_flag_2, root);
                if (imageView2 != null) {
                    i = R.id.away_team_logo_1;
                    ImageView imageView3 = (ImageView) nq8.B(R.id.away_team_logo_1, root);
                    if (imageView3 != null) {
                        i = R.id.away_team_logo_2;
                        ImageView imageView4 = (ImageView) nq8.B(R.id.away_team_logo_2, root);
                        if (imageView4 != null) {
                            i = R.id.away_team_name_1;
                            TextView textView = (TextView) nq8.B(R.id.away_team_name_1, root);
                            if (textView != null) {
                                i = R.id.away_team_name_2;
                                TextView textView2 = (TextView) nq8.B(R.id.away_team_name_2, root);
                                if (textView2 != null) {
                                    i = R.id.away_team_name_container;
                                    if (((LinearLayout) nq8.B(R.id.away_team_name_container, root)) != null) {
                                        i = R.id.away_team_seed;
                                        TextView textView3 = (TextView) nq8.B(R.id.away_team_seed, root);
                                        if (textView3 != null) {
                                            i = R.id.bottom_text;
                                            TextView textView4 = (TextView) nq8.B(R.id.bottom_text, root);
                                            if (textView4 != null) {
                                                i = R.id.cta_bottom;
                                                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.cta_bottom, root);
                                                if (frameLayout != null) {
                                                    i = R.id.featured_match_container;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.featured_match_container, root);
                                                    if (constraintLayout != null) {
                                                        i = R.id.featured_match_title;
                                                        if (((TextView) nq8.B(R.id.featured_match_title, root)) != null) {
                                                            i = R.id.home_logo_barrier;
                                                            if (((Barrier) nq8.B(R.id.home_logo_barrier, root)) != null) {
                                                                i = R.id.home_team_flag_1;
                                                                ImageView imageView5 = (ImageView) nq8.B(R.id.home_team_flag_1, root);
                                                                if (imageView5 != null) {
                                                                    i = R.id.home_team_flag_2;
                                                                    ImageView imageView6 = (ImageView) nq8.B(R.id.home_team_flag_2, root);
                                                                    if (imageView6 != null) {
                                                                        i = R.id.home_team_logo_1;
                                                                        ImageView imageView7 = (ImageView) nq8.B(R.id.home_team_logo_1, root);
                                                                        if (imageView7 != null) {
                                                                            i = R.id.home_team_logo_2;
                                                                            ImageView imageView8 = (ImageView) nq8.B(R.id.home_team_logo_2, root);
                                                                            if (imageView8 != null) {
                                                                                i = R.id.home_team_name_1;
                                                                                TextView textView5 = (TextView) nq8.B(R.id.home_team_name_1, root);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.home_team_name_2;
                                                                                    TextView textView6 = (TextView) nq8.B(R.id.home_team_name_2, root);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.home_team_name_container;
                                                                                        if (((LinearLayout) nq8.B(R.id.home_team_name_container, root)) != null) {
                                                                                            i = R.id.home_team_seed;
                                                                                            TextView textView7 = (TextView) nq8.B(R.id.home_team_seed, root);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.league_details_row;
                                                                                                View B = nq8.B(R.id.league_details_row, root);
                                                                                                if (B != null) {
                                                                                                    pn2 a = pn2.a(B);
                                                                                                    i = R.id.main_text;
                                                                                                    TextView textView8 = (TextView) nq8.B(R.id.main_text, root);
                                                                                                    if (textView8 != null) {
                                                                                                        i = R.id.primary_score_away;
                                                                                                        TextView textView9 = (TextView) nq8.B(R.id.primary_score_away, root);
                                                                                                        if (textView9 != null) {
                                                                                                            i = R.id.primary_score_home;
                                                                                                            TextView textView10 = (TextView) nq8.B(R.id.primary_score_home, root);
                                                                                                            if (textView10 != null) {
                                                                                                                i = R.id.primary_score_slash;
                                                                                                                TextView textView11 = (TextView) nq8.B(R.id.primary_score_slash, root);
                                                                                                                if (textView11 != null) {
                                                                                                                    this.k = new xt7((LinearLayout) root, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, frameLayout, constraintLayout, imageView5, imageView6, imageView7, imageView8, textView5, textView6, textView7, a, textView8, textView9, textView10, textView11);
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.featured_match_card_view;
    }

    public final void setCtaClick(@NotNull Function0<Unit> callback) {
        callback.getClass();
        FrameLayout frameLayout = (FrameLayout) this.k.w;
        frameLayout.setVisibility(0);
        frameLayout.setOnClickListener(new s61(2, callback));
    }

    public final void setOpenEventClick(@NotNull Function0<Unit> callback) {
        callback.getClass();
        this.k.b.setOnClickListener(new s61(3, callback));
    }
}
