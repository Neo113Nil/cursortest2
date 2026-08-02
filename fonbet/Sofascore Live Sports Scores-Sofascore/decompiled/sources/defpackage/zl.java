package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sofascore.results.R;
import com.sofascore.results.event.overs.view.OverBallsContainerView;
import com.sofascore.results.view.MmaRoundInfoView;
import com.sofascore.results.view.SofaTextInputLayout;
import com.sofascore.results.view.follownotification.FollowButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zl implements krk {
    public final /* synthetic */ int a = 2;
    public final View b;
    public final View c;
    public final View d;
    public final Object e;
    public final Object f;
    public final TextView g;
    public final Object h;
    public final Object i;
    public final View j;
    public final View k;
    public final Object l;
    public final Object m;
    public final Object n;

    public zl(LinearLayout linearLayout, ImageView imageView, FollowButton followButton, ImageView imageView2, ImageView imageView3, ImageView imageView4, View view, ImageView imageView5, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        this.f = linearLayout;
        this.c = imageView;
        this.n = followButton;
        this.d = imageView2;
        this.e = imageView3;
        this.h = imageView4;
        this.i = view;
        this.m = imageView5;
        this.g = textView;
        this.j = textView2;
        this.k = textView3;
        this.b = textView4;
        this.l = view2;
    }

    public static zl a(View view) {
        int i = R.id.aggregate_result_header;
        TextView textView = (TextView) nq8.B(R.id.aggregate_result_header, view);
        if (textView != null) {
            i = R.id.arrow_divider;
            View B = nq8.B(R.id.arrow_divider, view);
            if (B != null) {
                i = R.id.first_team_logo;
                ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, view);
                if (imageView != null) {
                    i = R.id.first_team_score;
                    TextView textView2 = (TextView) nq8.B(R.id.first_team_score, view);
                    if (textView2 != null) {
                        i = R.id.first_team_win_indicator;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.first_team_win_indicator, view);
                        if (imageView2 != null) {
                            i = R.id.image_arrow_start;
                            ImageView imageView3 = (ImageView) nq8.B(R.id.image_arrow_start, view);
                            if (imageView3 != null) {
                                i = R.id.image_series;
                                ImageView imageView4 = (ImageView) nq8.B(R.id.image_series, view);
                                if (imageView4 != null) {
                                    i = R.id.minus;
                                    if (((TextView) nq8.B(R.id.minus, view)) != null) {
                                        i = R.id.result_container;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.result_container, view);
                                        if (constraintLayout != null) {
                                            i = R.id.second_team_logo;
                                            ImageView imageView5 = (ImageView) nq8.B(R.id.second_team_logo, view);
                                            if (imageView5 != null) {
                                                i = R.id.second_team_score;
                                                TextView textView3 = (TextView) nq8.B(R.id.second_team_score, view);
                                                if (textView3 != null) {
                                                    i = R.id.second_team_win_indicator;
                                                    ImageView imageView6 = (ImageView) nq8.B(R.id.second_team_win_indicator, view);
                                                    if (imageView6 != null) {
                                                        i = R.id.series_divider;
                                                        View B2 = nq8.B(R.id.series_divider, view);
                                                        if (B2 != null) {
                                                            return new zl((LinearLayout) view, textView, B, imageView, textView2, imageView2, imageView3, imageView4, constraintLayout, imageView5, textView3, imageView6, B2);
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

    public static zl b(View view) {
        int i = R.id.auto_translated;
        TextView textView = (TextView) nq8.B(R.id.auto_translated, view);
        if (textView != null) {
            i = R.id.flag;
            ImageView imageView = (ImageView) nq8.B(R.id.flag, view);
            if (imageView != null) {
                i = R.id.progress_chat;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.progress_chat, view);
                if (circularProgressIndicator != null) {
                    i = R.id.replied_text_message;
                    View B = nq8.B(R.id.replied_text_message, view);
                    if (B != null) {
                        e92 a = e92.a(B);
                        i = R.id.separator;
                        View B2 = nq8.B(R.id.separator, view);
                        if (B2 != null) {
                            i = R.id.text_container;
                            MaterialCardView materialCardView = (MaterialCardView) nq8.B(R.id.text_container, view);
                            if (materialCardView != null) {
                                i = R.id.thumbnail;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.thumbnail, view);
                                if (shapeableImageView != null) {
                                    i = R.id.timestamp;
                                    TextView textView2 = (TextView) nq8.B(R.id.timestamp, view);
                                    if (textView2 != null) {
                                        i = R.id.user_logo;
                                        View B3 = nq8.B(R.id.user_logo, view);
                                        if (B3 != null) {
                                            dd a2 = dd.a(B3);
                                            i = R.id.user_message;
                                            TextView textView3 = (TextView) nq8.B(R.id.user_message, view);
                                            if (textView3 != null) {
                                                i = R.id.user_name;
                                                TextView textView4 = (TextView) nq8.B(R.id.user_name, view);
                                                if (textView4 != null) {
                                                    i = R.id.user_role;
                                                    TextView textView5 = (TextView) nq8.B(R.id.user_role, view);
                                                    if (textView5 != null) {
                                                        return new zl((ConstraintLayout) view, textView, imageView, circularProgressIndicator, a, B2, materialCardView, shapeableImageView, textView2, a2, textView3, textView4, textView5);
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

    public static zl c(View view) {
        int i = R.id.bottom_divider;
        View B = nq8.B(R.id.bottom_divider, view);
        if (B != null) {
            i = R.id.draw_label;
            View B2 = nq8.B(R.id.draw_label, view);
            if (B2 != null) {
                jlc a = jlc.a(B2);
                i = R.id.flag_away;
                ImageView imageView = (ImageView) nq8.B(R.id.flag_away, view);
                if (imageView != null) {
                    i = R.id.flag_home;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.flag_home, view);
                    if (imageView2 != null) {
                        i = R.id.image_fighter_away;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.image_fighter_away, view);
                        if (imageView3 != null) {
                            i = R.id.image_fighter_home;
                            ImageView imageView4 = (ImageView) nq8.B(R.id.image_fighter_home, view);
                            if (imageView4 != null) {
                                i = R.id.name_fighter_away;
                                TextView textView = (TextView) nq8.B(R.id.name_fighter_away, view);
                                if (textView != null) {
                                    i = R.id.name_fighter_home;
                                    TextView textView2 = (TextView) nq8.B(R.id.name_fighter_home, view);
                                    if (textView2 != null) {
                                        i = R.id.round_info;
                                        MmaRoundInfoView mmaRoundInfoView = (MmaRoundInfoView) nq8.B(R.id.round_info, view);
                                        if (mmaRoundInfoView != null) {
                                            i = R.id.vs;
                                            TextView textView3 = (TextView) nq8.B(R.id.vs, view);
                                            if (textView3 != null) {
                                                i = R.id.win_marker_away;
                                                View B3 = nq8.B(R.id.win_marker_away, view);
                                                if (B3 != null) {
                                                    lsc a2 = lsc.a(B3);
                                                    i = R.id.win_marker_home;
                                                    View B4 = nq8.B(R.id.win_marker_home, view);
                                                    if (B4 != null) {
                                                        return new zl((ConstraintLayout) view, B, a, imageView, imageView2, imageView3, imageView4, textView, textView2, mmaRoundInfoView, textView3, a2, lsc.a(B4));
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

    public static zl d(View view) {
        int i = R.id.arrow_1;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow_1, view);
        if (imageView != null) {
            i = R.id.constraint_layout;
            if (((ConstraintLayout) nq8.B(R.id.constraint_layout, view)) != null) {
                i = R.id.follow_button;
                FollowButton followButton = (FollowButton) nq8.B(R.id.follow_button, view);
                if (followButton != null) {
                    i = R.id.icon;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.icon, view);
                    if (imageView2 != null) {
                        i = R.id.image_lower;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.image_lower, view);
                        if (imageView3 != null) {
                            i = R.id.image_lower_2;
                            ImageView imageView4 = (ImageView) nq8.B(R.id.image_lower_2, view);
                            if (imageView4 != null) {
                                i = R.id.lower_separator_dot;
                                View B = nq8.B(R.id.lower_separator_dot, view);
                                if (B != null) {
                                    i = R.id.pin_icon;
                                    ImageView imageView5 = (ImageView) nq8.B(R.id.pin_icon, view);
                                    if (imageView5 != null) {
                                        i = R.id.text_lower;
                                        TextView textView = (TextView) nq8.B(R.id.text_lower, view);
                                        if (textView != null) {
                                            i = R.id.text_lower_2;
                                            TextView textView2 = (TextView) nq8.B(R.id.text_lower_2, view);
                                            if (textView2 != null) {
                                                i = R.id.text_upper_1;
                                                TextView textView3 = (TextView) nq8.B(R.id.text_upper_1, view);
                                                if (textView3 != null) {
                                                    i = R.id.text_upper_2;
                                                    TextView textView4 = (TextView) nq8.B(R.id.text_upper_2, view);
                                                    if (textView4 != null) {
                                                        i = R.id.top_divider;
                                                        View B2 = nq8.B(R.id.top_divider, view);
                                                        if (B2 != null) {
                                                            return new zl((LinearLayout) view, imageView, followButton, imageView2, imageView3, imageView4, B, imageView5, textView, textView2, textView3, textView4, B2);
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

    public static zl e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d(layoutInflater.inflate(R.layout.tournament_header_cell, viewGroup, false));
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        View view = this.b;
        Object obj = this.f;
        switch (i) {
            case 0:
                return (LinearLayout) obj;
            case 1:
                return (ConstraintLayout) view;
            case 2:
                return (LinearLayout) obj;
            case 3:
                return (NestedScrollView) obj;
            case 4:
                return (ConstraintLayout) view;
            case 5:
                return (ConstraintLayout) view;
            case 6:
                return (ConstraintLayout) view;
            case 7:
                return (CardView) obj;
            default:
                return (LinearLayout) obj;
        }
    }

    public zl(ConstraintLayout constraintLayout, drc drcVar, z82 z82Var, ImageView imageView, View view, drc drcVar2, z82 z82Var2, ImageView imageView2, ConstraintLayout constraintLayout2, OverBallsContainerView overBallsContainerView, TextView textView, TextView textView2, TextView textView3) {
        this.b = constraintLayout;
        this.f = drcVar;
        this.l = z82Var;
        this.c = imageView;
        this.i = view;
        this.e = drcVar2;
        this.h = z82Var2;
        this.d = imageView2;
        this.m = constraintLayout2;
        this.n = overBallsContainerView;
        this.g = textView;
        this.j = textView2;
        this.k = textView3;
    }

    public zl(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, CircularProgressIndicator circularProgressIndicator, e92 e92Var, View view, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, TextView textView2, dd ddVar, TextView textView3, TextView textView4, TextView textView5) {
        this.b = constraintLayout;
        this.g = textView;
        this.c = imageView;
        this.f = circularProgressIndicator;
        this.l = e92Var;
        this.i = view;
        this.d = materialCardView;
        this.e = shapeableImageView;
        this.j = textView2;
        this.h = ddVar;
        this.k = textView3;
        this.m = textView4;
        this.n = textView5;
    }

    public zl(ConstraintLayout constraintLayout, View view, jlc jlcVar, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, MmaRoundInfoView mmaRoundInfoView, TextView textView3, lsc lscVar, lsc lscVar2) {
        this.b = constraintLayout;
        this.i = view;
        this.f = jlcVar;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.h = imageView4;
        this.g = textView;
        this.j = textView2;
        this.l = mmaRoundInfoView;
        this.k = textView3;
        this.m = lscVar;
        this.n = lscVar2;
    }

    public zl(LinearLayout linearLayout, TextView textView, View view, ImageView imageView, TextView textView2, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, ImageView imageView5, TextView textView3, ImageView imageView6, View view2) {
        this.f = linearLayout;
        this.g = textView;
        this.i = view;
        this.c = imageView;
        this.j = textView2;
        this.d = imageView2;
        this.e = imageView3;
        this.h = imageView4;
        this.b = constraintLayout;
        this.m = imageView5;
        this.k = textView3;
        this.n = imageView6;
        this.l = view2;
    }

    public zl(CardView cardView, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, ImageView imageView2, TextView textView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ShapeableImageView shapeableImageView, Barrier barrier, Guideline guideline, TextView textView3) {
        this.f = cardView;
        this.c = imageView;
        this.b = constraintLayout;
        this.g = textView;
        this.d = imageView2;
        this.j = textView2;
        this.e = imageView3;
        this.h = imageView4;
        this.m = imageView5;
        this.i = shapeableImageView;
        this.l = barrier;
        this.n = guideline;
        this.k = textView3;
    }

    public zl(LinearLayout linearLayout, View view, View view2, ConstraintLayout constraintLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView2, TextView textView5) {
        this.f = linearLayout;
        this.i = view;
        this.l = view2;
        this.b = constraintLayout;
        this.e = linearLayout2;
        this.h = constraintLayout2;
        this.c = imageView;
        this.g = textView;
        this.j = textView2;
        this.k = textView3;
        this.m = textView4;
        this.d = imageView2;
        this.n = textView5;
    }

    public zl(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, FrameLayout frameLayout2, FrameLayout frameLayout3, LinearLayout linearLayout, TextView textView, FrameLayout frameLayout4, LinearLayout linearLayout2, ImageView imageView4, View view) {
        this.b = constraintLayout;
        this.j = frameLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.k = frameLayout2;
        this.l = frameLayout3;
        this.f = linearLayout;
        this.g = textView;
        this.m = frameLayout4;
        this.n = linearLayout2;
        this.h = imageView4;
        this.i = view;
    }

    public zl(NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, MaterialAutoCompleteTextView materialAutoCompleteTextView, SofaTextInputLayout sofaTextInputLayout, dk2 dk2Var, RadioButton radioButton, RadioButton radioButton2, Group group, MaterialAutoCompleteTextView materialAutoCompleteTextView2, SofaTextInputLayout sofaTextInputLayout2, RangeSlider rangeSlider, dk2 dk2Var2, TextView textView) {
        this.f = nestedScrollView;
        this.b = constraintLayout;
        this.j = materialAutoCompleteTextView;
        this.k = sofaTextInputLayout;
        this.i = dk2Var;
        this.l = radioButton;
        this.c = radioButton2;
        this.d = group;
        this.e = materialAutoCompleteTextView2;
        this.h = sofaTextInputLayout2;
        this.m = rangeSlider;
        this.n = dk2Var2;
        this.g = textView;
    }
}
