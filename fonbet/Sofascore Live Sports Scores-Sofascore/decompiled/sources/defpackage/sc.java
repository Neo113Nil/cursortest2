package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.results.R;
import com.sofascore.results.view.DotView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sc implements krk {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;
    public final View f;
    public final View g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final View k;
    public final Object l;
    public final View m;
    public final View n;
    public final Object o;
    public final Object p;

    public sc(ConstraintLayout constraintLayout, View view, jlc jlcVar, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, View view2, View view3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, lsc lscVar, lsc lscVar2) {
        this.l = constraintLayout;
        this.n = view;
        this.o = jlcVar;
        this.c = shapeableImageView;
        this.e = shapeableImageView2;
        this.f = view2;
        this.g = view3;
        this.d = textView;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
        this.m = textView6;
        this.p = lscVar;
        this.b = lscVar2;
    }

    public static sc a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.commentary_incident_layout, viewGroup, false);
        int i = R.id.baseball_footer;
        View B = nq8.B(R.id.baseball_footer, inflate);
        if (B != null) {
            int i2 = R.id.ball_1;
            DotView dotView = (DotView) nq8.B(R.id.ball_1, B);
            if (dotView != null) {
                i2 = R.id.ball_2;
                DotView dotView2 = (DotView) nq8.B(R.id.ball_2, B);
                if (dotView2 != null) {
                    i2 = R.id.ball_3;
                    DotView dotView3 = (DotView) nq8.B(R.id.ball_3, B);
                    if (dotView3 != null) {
                        i2 = R.id.ball_4;
                        DotView dotView4 = (DotView) nq8.B(R.id.ball_4, B);
                        if (dotView4 != null) {
                            i2 = R.id.bases;
                            ComposeView composeView = (ComposeView) nq8.B(R.id.bases, B);
                            if (composeView != null) {
                                i2 = R.id.strike_1;
                                DotView dotView5 = (DotView) nq8.B(R.id.strike_1, B);
                                if (dotView5 != null) {
                                    i2 = R.id.strike_2;
                                    DotView dotView6 = (DotView) nq8.B(R.id.strike_2, B);
                                    if (dotView6 != null) {
                                        i2 = R.id.strike_3;
                                        DotView dotView7 = (DotView) nq8.B(R.id.strike_3, B);
                                        if (dotView7 != null) {
                                            bv1 bv1Var = new bv1((LinearLayout) B, dotView, dotView2, dotView3, dotView4, composeView, dotView5, dotView6, dotView7, 7);
                                            i = R.id.commentary_holder;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.commentary_holder, inflate);
                                            if (constraintLayout != null) {
                                                i = R.id.commentary_icon;
                                                ImageView imageView = (ImageView) nq8.B(R.id.commentary_icon, inflate);
                                                if (imageView != null) {
                                                    i = R.id.commentary_minute;
                                                    TextView textView = (TextView) nq8.B(R.id.commentary_minute, inflate);
                                                    if (textView != null) {
                                                        i = R.id.commentary_player;
                                                        ImageView imageView2 = (ImageView) nq8.B(R.id.commentary_player, inflate);
                                                        if (imageView2 != null) {
                                                            i = R.id.commentary_player_second;
                                                            ImageView imageView3 = (ImageView) nq8.B(R.id.commentary_player_second, inflate);
                                                            if (imageView3 != null) {
                                                                i = R.id.commentary_player_team;
                                                                ImageView imageView4 = (ImageView) nq8.B(R.id.commentary_player_team, inflate);
                                                                if (imageView4 != null) {
                                                                    i = R.id.commentary_primary_text;
                                                                    TextView textView2 = (TextView) nq8.B(R.id.commentary_primary_text, inflate);
                                                                    if (textView2 != null) {
                                                                        i = R.id.commentary_secondary_text;
                                                                        TextView textView3 = (TextView) nq8.B(R.id.commentary_secondary_text, inflate);
                                                                        if (textView3 != null) {
                                                                            i = R.id.commentary_title;
                                                                            TextView textView4 = (TextView) nq8.B(R.id.commentary_title, inflate);
                                                                            if (textView4 != null) {
                                                                                i = R.id.commentary_title_chip;
                                                                                TextView textView5 = (TextView) nq8.B(R.id.commentary_title_chip, inflate);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.goal_animation_stub;
                                                                                    ViewStub viewStub = (ViewStub) nq8.B(R.id.goal_animation_stub, inflate);
                                                                                    if (viewStub != null) {
                                                                                        i = R.id.goal_details_button;
                                                                                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.goal_details_button, inflate);
                                                                                        if (frameLayout != null) {
                                                                                            i = R.id.notable_actions_container;
                                                                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.notable_actions_container, inflate);
                                                                                            if (linearLayout != null) {
                                                                                                i = R.id.penalty_incident_time;
                                                                                                if (((LinearLayout) nq8.B(R.id.penalty_incident_time, inflate)) != null) {
                                                                                                    i = R.id.top_barrier;
                                                                                                    if (((Barrier) nq8.B(R.id.top_barrier, inflate)) != null) {
                                                                                                        return new sc((LinearLayout) inflate, bv1Var, constraintLayout, imageView, textView, imageView2, imageView3, imageView4, textView2, textView3, textView4, textView5, viewStub, frameLayout, linearLayout);
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
            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i2)));
            return null;
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return (CoordinatorLayout) obj2;
            case 1:
                return (LinearLayout) obj;
            case 2:
                return (ConstraintLayout) obj2;
            case 3:
                return (LinearLayout) obj;
            default:
                return (ConstraintLayout) obj2;
        }
    }

    public sc(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, MaterialCardView materialCardView, View view, View view2, View view3, View view4, ImageView imageView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.l = constraintLayout;
        this.c = imageView;
        this.d = textView;
        this.h = textView2;
        this.o = materialCardView;
        this.f = view;
        this.g = view2;
        this.p = view3;
        this.b = view4;
        this.e = imageView2;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
        this.m = textView6;
        this.n = textView7;
    }

    public sc(LinearLayout linearLayout, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, TextView textView, Group group, ImageView imageView3, FrameLayout frameLayout2, TextView textView2, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView3, TextView textView4) {
        this.b = linearLayout;
        this.l = materialCardView;
        this.c = imageView;
        this.e = imageView2;
        this.k = frameLayout;
        this.d = textView;
        this.m = group;
        this.f = imageView3;
        this.n = frameLayout2;
        this.h = textView2;
        this.g = imageView4;
        this.p = imageView5;
        this.o = imageView6;
        this.i = textView3;
        this.j = textView4;
    }

    public sc(LinearLayout linearLayout, bv1 bv1Var, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ViewStub viewStub, FrameLayout frameLayout, LinearLayout linearLayout2) {
        this.b = linearLayout;
        this.l = bv1Var;
        this.m = constraintLayout;
        this.c = imageView;
        this.d = textView;
        this.e = imageView2;
        this.f = imageView3;
        this.g = imageView4;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
        this.n = viewStub;
        this.o = frameLayout;
        this.p = linearLayout2;
    }

    public sc(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, ImageView imageView2, TextView textView5, TextView textView6, TextView textView7, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, TextView textView8) {
        this.l = coordinatorLayout;
        this.d = textView;
        this.h = textView2;
        this.c = imageView;
        this.i = textView3;
        this.j = textView4;
        this.e = imageView2;
        this.k = textView5;
        this.m = textView6;
        this.n = textView7;
        this.f = imageView3;
        this.g = imageView4;
        this.p = imageView5;
        this.b = linearLayout;
        this.o = textView8;
    }
}
