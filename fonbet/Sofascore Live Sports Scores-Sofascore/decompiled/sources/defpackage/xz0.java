package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.header.TeamLogoView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xz0 implements krk {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final ViewGroup j;
    public final View k;
    public final View l;
    public final View m;

    public xz0(LinearLayout linearLayout, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, TextView textView3, ImageView imageView3, TextView textView4, TextView textView5, ImageView imageView4, TextView textView6) {
        this.j = linearLayout;
        this.k = constraintLayout;
        this.c = imageView;
        this.b = textView;
        this.f = imageView2;
        this.d = textView2;
        this.e = textView3;
        this.l = imageView3;
        this.g = textView4;
        this.h = textView5;
        this.m = imageView4;
        this.i = textView6;
    }

    public static xz0 a(View view) {
        int i = R.id.arrow;
        if (((ImageView) nq8.B(R.id.arrow, view)) != null) {
            i = R.id.barrier_name_end;
            if (((Barrier) nq8.B(R.id.barrier_name_end, view)) != null) {
                i = R.id.bottom_divider;
                SofaDivider sofaDivider = (SofaDivider) nq8.B(R.id.bottom_divider, view);
                if (sofaDivider != null) {
                    i = R.id.from_team_logo;
                    if (((ImageView) nq8.B(R.id.from_team_logo, view)) != null) {
                        i = R.id.future_transfer_clickable_area;
                        View B = nq8.B(R.id.future_transfer_clickable_area, view);
                        if (B != null) {
                            i = R.id.future_transfer_date;
                            if (((TextView) nq8.B(R.id.future_transfer_date, view)) != null) {
                                i = R.id.future_transfer_group;
                                Group group = (Group) nq8.B(R.id.future_transfer_group, view);
                                if (group != null) {
                                    i = R.id.national_team_appearances;
                                    TextView textView = (TextView) nq8.B(R.id.national_team_appearances, view);
                                    if (textView != null) {
                                        i = R.id.national_team_goals;
                                        TextView textView2 = (TextView) nq8.B(R.id.national_team_goals, view);
                                        if (textView2 != null) {
                                            i = R.id.national_team_group;
                                            Group group2 = (Group) nq8.B(R.id.national_team_group, view);
                                            if (group2 != null) {
                                                i = R.id.team_logo;
                                                ImageView imageView = (ImageView) nq8.B(R.id.team_logo, view);
                                                if (imageView != null) {
                                                    i = R.id.team_name;
                                                    TextView textView3 = (TextView) nq8.B(R.id.team_name, view);
                                                    if (textView3 != null) {
                                                        i = R.id.to_team_logo;
                                                        if (((ImageView) nq8.B(R.id.to_team_logo, view)) != null) {
                                                            i = R.id.transfer_amount;
                                                            TextView textView4 = (TextView) nq8.B(R.id.transfer_amount, view);
                                                            if (textView4 != null) {
                                                                i = R.id.transfer_barrier;
                                                                if (((Barrier) nq8.B(R.id.transfer_barrier, view)) != null) {
                                                                    i = R.id.transfer_date;
                                                                    TextView textView5 = (TextView) nq8.B(R.id.transfer_date, view);
                                                                    if (textView5 != null) {
                                                                        i = R.id.transfer_type;
                                                                        TextView textView6 = (TextView) nq8.B(R.id.transfer_type, view);
                                                                        if (textView6 != null) {
                                                                            return new xz0((ConstraintLayout) view, sofaDivider, B, group, textView, textView2, group2, imageView, textView3, textView4, textView5, textView6);
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
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.j;
        switch (i) {
            case 0:
                return (FrameLayout) viewGroup;
            case 1:
                return (ConstraintLayout) viewGroup;
            case 2:
                return (ConstraintLayout) this.g;
            case 3:
                return (LinearLayout) viewGroup;
            case 4:
                return (ConstraintLayout) this.f;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public xz0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, View view, TextView textView3, ImageView imageView2, TextView textView4, ImageView imageView3, TextView textView5, View view2, TextView textView6) {
        this.j = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.k = view;
        this.e = textView3;
        this.f = imageView2;
        this.g = textView4;
        this.l = imageView3;
        this.h = textView5;
        this.m = view2;
        this.i = textView6;
    }

    public xz0(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, TextView textView, LinearLayout linearLayout2, FrameLayout frameLayout2, ImageView imageView3, FrameLayout frameLayout3, TextView textView2, TextView textView3) {
        this.g = constraintLayout;
        this.h = linearLayout;
        this.c = imageView;
        this.j = frameLayout;
        this.f = imageView2;
        this.b = textView;
        this.i = linearLayout2;
        this.k = frameLayout2;
        this.l = imageView3;
        this.m = frameLayout3;
        this.d = textView2;
        this.e = textView3;
    }

    public xz0(ConstraintLayout constraintLayout, ComposeView composeView, TextView textView, TeamLogoView teamLogoView, TextView textView2, FrameLayout frameLayout, ImageView imageView, TextView textView3, TeamLogoView teamLogoView2, TextView textView4, TextView textView5, LinearLayout linearLayout) {
        this.f = constraintLayout;
        this.i = composeView;
        this.b = textView;
        this.k = teamLogoView;
        this.d = textView2;
        this.j = frameLayout;
        this.c = imageView;
        this.e = textView3;
        this.l = teamLogoView2;
        this.g = textView4;
        this.h = textView5;
        this.m = linearLayout;
    }

    public xz0(FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, SofascoreSmallRatingView sofascoreSmallRatingView, SofascoreSmallRatingView sofascoreSmallRatingView2, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.j = frameLayout;
        this.c = imageView;
        this.f = imageView2;
        this.b = textView;
        this.d = textView2;
        this.e = textView3;
        this.l = sofascoreSmallRatingView;
        this.m = sofascoreSmallRatingView2;
        this.g = textView4;
        this.h = textView5;
        this.i = textView6;
        this.k = textView7;
    }

    public xz0(ConstraintLayout constraintLayout, SofaDivider sofaDivider, View view, Group group, TextView textView, TextView textView2, Group group2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.j = constraintLayout;
        this.f = sofaDivider;
        this.k = view;
        this.l = group;
        this.b = textView;
        this.d = textView2;
        this.m = group2;
        this.c = imageView;
        this.e = textView3;
        this.g = textView4;
        this.h = textView5;
        this.i = textView6;
    }
}
