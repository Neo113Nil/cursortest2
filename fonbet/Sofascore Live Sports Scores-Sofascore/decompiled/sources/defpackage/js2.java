package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.media3.ui.PlayerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.regular.view.PlayerPenaltyShotView;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.EventInfoView;
import com.sofascore.results.view.follownotification.FollowButton;
import com.sofascore.results.view.header.TeamLogoView;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class js2 implements krk {
    public final /* synthetic */ int a = 0;
    public final View b;
    public final Object c;
    public final TextView d;
    public final View e;
    public final View f;
    public final Object g;
    public final View h;
    public final ViewGroup i;
    public final View j;
    public final Object k;
    public final Object l;
    public final View m;
    public final View n;
    public final View o;

    public js2(ConstraintLayout constraintLayout, ImageView imageView, Guideline guideline, RelativeLayout relativeLayout, ImageView imageView2, View view, FrameLayout frameLayout, ImageView imageView3, Group group, TextView textView, SegmentedButtonsView segmentedButtonsView, TextView textView2, TextView textView3, TextView textView4, RelativeLayout relativeLayout2, ImageView imageView4, ImageView imageView5, TextView textView5) {
        this.j = constraintLayout;
        this.b = imageView;
        this.k = guideline;
        this.h = relativeLayout;
        this.c = imageView2;
        this.l = view;
        this.i = frameLayout;
        this.e = imageView3;
        this.m = group;
        this.n = segmentedButtonsView;
        this.o = relativeLayout2;
        this.f = imageView4;
        this.g = imageView5;
        this.d = textView5;
    }

    public static js2 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.hockey_two_players_horizontal_commentary_item, viewGroup, false);
        int i = R.id.additional_player_1_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.additional_player_1_icon, inflate);
        if (imageView != null) {
            i = R.id.additional_player_2_icon;
            ImageView imageView2 = (ImageView) nq8.B(R.id.additional_player_2_icon, inflate);
            if (imageView2 != null) {
                i = R.id.additional_text_1;
                TextView textView = (TextView) nq8.B(R.id.additional_text_1, inflate);
                if (textView != null) {
                    i = R.id.additional_text_2;
                    TextView textView2 = (TextView) nq8.B(R.id.additional_text_2, inflate);
                    if (textView2 != null) {
                        i = R.id.bottom_text;
                        TextView textView3 = (TextView) nq8.B(R.id.bottom_text, inflate);
                        if (textView3 != null) {
                            i = R.id.card;
                            MaterialCardView materialCardView = (MaterialCardView) nq8.B(R.id.card, inflate);
                            if (materialCardView != null) {
                                i = R.id.icon;
                                ImageView imageView3 = (ImageView) nq8.B(R.id.icon, inflate);
                                if (imageView3 != null) {
                                    i = R.id.icon_barrier;
                                    if (((Barrier) nq8.B(R.id.icon_barrier, inflate)) != null) {
                                        i = R.id.player_icon;
                                        ImageView imageView4 = (ImageView) nq8.B(R.id.player_icon, inflate);
                                        if (imageView4 != null) {
                                            i = R.id.player_info;
                                            TextView textView4 = (TextView) nq8.B(R.id.player_info, inflate);
                                            if (textView4 != null) {
                                                i = R.id.player_team;
                                                ImageView imageView5 = (ImageView) nq8.B(R.id.player_team, inflate);
                                                if (imageView5 != null) {
                                                    i = R.id.team_icon;
                                                    ImageView imageView6 = (ImageView) nq8.B(R.id.team_icon, inflate);
                                                    if (imageView6 != null) {
                                                        i = R.id.time;
                                                        TextView textView5 = (TextView) nq8.B(R.id.time, inflate);
                                                        if (textView5 != null) {
                                                            i = R.id.title;
                                                            TextView textView6 = (TextView) nq8.B(R.id.title, inflate);
                                                            if (textView6 != null) {
                                                                return new js2((LinearLayout) inflate, imageView, imageView2, textView, textView2, textView3, materialCardView, imageView3, imageView4, textView4, imageView5, imageView6, textView5, textView6);
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
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static js2 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.image_label_sport_layout, viewGroup, false);
        int i = R.id.button_favorites;
        FollowButton followButton = (FollowButton) nq8.B(R.id.button_favorites, inflate);
        if (followButton != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            i = R.id.followers_count;
            TextView textView = (TextView) nq8.B(R.id.followers_count, inflate);
            if (textView != null) {
                i = R.id.followers_count_group;
                Group group = (Group) nq8.B(R.id.followers_count_group, inflate);
                if (group != null) {
                    i = R.id.followers_separator;
                    if (((ImageView) nq8.B(R.id.followers_separator, inflate)) != null) {
                        i = R.id.icon;
                        ImageView imageView = (ImageView) nq8.B(R.id.icon, inflate);
                        if (imageView != null) {
                            i = R.id.layout_image;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.layout_image, inflate);
                            if (imageView2 != null) {
                                i = R.id.primary_label;
                                TextView textView2 = (TextView) nq8.B(R.id.primary_label, inflate);
                                if (textView2 != null) {
                                    i = R.id.primary_row;
                                    if (((ConstraintLayout) nq8.B(R.id.primary_row, inflate)) != null) {
                                        i = R.id.secondary_label;
                                        TextView textView3 = (TextView) nq8.B(R.id.secondary_label, inflate);
                                        if (textView3 != null) {
                                            i = R.id.secondary_logo;
                                            ImageView imageView3 = (ImageView) nq8.B(R.id.secondary_logo, inflate);
                                            if (imageView3 != null) {
                                                i = R.id.secondary_row;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.secondary_row, inflate);
                                                if (constraintLayout != null) {
                                                    i = R.id.separator;
                                                    ImageView imageView4 = (ImageView) nq8.B(R.id.separator, inflate);
                                                    if (imageView4 != null) {
                                                        i = R.id.ternary_label;
                                                        TextView textView4 = (TextView) nq8.B(R.id.ternary_label, inflate);
                                                        if (textView4 != null) {
                                                            i = R.id.ternary_logo;
                                                            ImageView imageView5 = (ImageView) nq8.B(R.id.ternary_logo, inflate);
                                                            if (imageView5 != null) {
                                                                return new js2(linearLayout, followButton, linearLayout, textView, group, imageView, imageView2, textView2, textView3, imageView3, constraintLayout, imageView4, textView4, imageView5);
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
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return (FrameLayout) this.i;
            case 1:
                return (LinearLayout) this.i;
            case 2:
                return (LinearLayout) this.i;
            case 3:
                return (ConstraintLayout) this.l;
            case 4:
                return (ConstraintLayout) this.i;
            case 5:
                return (ConstraintLayout) this.j;
            case 6:
                return (NestedScrollView) this.i;
            case 7:
                return (LinearLayout) this.i;
            case 8:
                return (ConstraintLayout) this.i;
            default:
                return (ConstraintLayout) this.j;
        }
    }

    public js2(FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, View view, ImageView imageView2, ImageView imageView3, EditText editText, ImageView imageView4, ShapeableImageView shapeableImageView, FrameLayout frameLayout3, TextView textView, CircularProgressIndicator circularProgressIndicator, ImageView imageView5, ImageView imageView6) {
        this.i = frameLayout;
        this.b = imageView;
        this.j = frameLayout2;
        this.l = view;
        this.c = imageView2;
        this.e = imageView3;
        this.m = editText;
        this.f = imageView4;
        this.n = shapeableImageView;
        this.k = frameLayout3;
        this.d = textView;
        this.o = circularProgressIndicator;
        this.g = imageView5;
        this.h = imageView6;
    }

    public js2(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, MaterialCardView materialCardView, ImageView imageView3, ImageView imageView4, TextView textView4, ImageView imageView5, ImageView imageView6, TextView textView5, TextView textView6) {
        this.i = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.j = textView2;
        this.k = textView3;
        this.l = materialCardView;
        this.e = imageView3;
        this.f = imageView4;
        this.m = textView4;
        this.g = imageView5;
        this.h = imageView6;
        this.n = textView5;
        this.o = textView6;
    }

    public js2(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, FrameLayout frameLayout2, ImageView imageView3, FrameLayout frameLayout3, TextView textView, ImageView imageView4, FrameLayout frameLayout4, ImageView imageView5, FrameLayout frameLayout5, ImageView imageView6, FrameLayout frameLayout6) {
        this.l = constraintLayout;
        this.b = imageView;
        this.i = frameLayout;
        this.c = imageView2;
        this.j = frameLayout2;
        this.e = imageView3;
        this.k = frameLayout3;
        this.d = textView;
        this.f = imageView4;
        this.m = frameLayout4;
        this.g = imageView5;
        this.n = frameLayout5;
        this.h = imageView6;
        this.o = frameLayout6;
    }

    public js2(NestedScrollView nestedScrollView, RangeSlider rangeSlider, dk2 dk2Var, TextView textView, TypeHeaderView typeHeaderView, dk2 dk2Var2, TypeHeaderView typeHeaderView2, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout, TypeHeaderView typeHeaderView3, dk2 dk2Var3, AutoCompleteTextView autoCompleteTextView2, TextInputLayout textInputLayout2, ConstraintLayout constraintLayout) {
        this.i = nestedScrollView;
        this.j = rangeSlider;
        this.k = dk2Var;
        this.d = textView;
        this.b = typeHeaderView;
        this.c = dk2Var2;
        this.e = typeHeaderView2;
        this.f = autoCompleteTextView;
        this.g = textInputLayout;
        this.h = typeHeaderView3;
        this.l = dk2Var3;
        this.m = autoCompleteTextView2;
        this.n = textInputLayout2;
        this.o = constraintLayout;
    }

    public js2(ConstraintLayout constraintLayout, ProgressBar progressBar, ImageView imageView, ImageView imageView2, TeamLogoView teamLogoView, LinearLayout linearLayout, MaterialButton materialButton, LinearLayout linearLayout2, ImageView imageView3, ShapeableImageView shapeableImageView, PlayerView playerView, TeamLogoView teamLogoView2, TextView textView, ConstraintLayout constraintLayout2) {
        this.i = constraintLayout;
        this.j = progressBar;
        this.b = imageView;
        this.c = imageView2;
        this.k = teamLogoView;
        this.f = linearLayout;
        this.g = materialButton;
        this.h = linearLayout2;
        this.e = imageView3;
        this.n = shapeableImageView;
        this.l = playerView;
        this.m = teamLogoView2;
        this.d = textView;
        this.o = constraintLayout2;
    }

    public js2(LinearLayout linearLayout, FollowButton followButton, LinearLayout linearLayout2, TextView textView, Group group, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, ImageView imageView3, ConstraintLayout constraintLayout, ImageView imageView4, TextView textView4, ImageView imageView5) {
        this.i = linearLayout;
        this.j = followButton;
        this.k = linearLayout2;
        this.d = textView;
        this.h = group;
        this.b = imageView;
        this.c = imageView2;
        this.l = textView2;
        this.m = textView3;
        this.e = imageView3;
        this.n = constraintLayout;
        this.f = imageView4;
        this.o = textView4;
        this.g = imageView5;
    }

    public js2(ConstraintLayout constraintLayout, EventInfoView eventInfoView, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView, ImageView imageView2, PlayerPenaltyShotView playerPenaltyShotView, TypeHeaderView typeHeaderView, TextView textView7) {
        this.j = constraintLayout;
        this.k = eventInfoView;
        this.d = textView;
        this.i = frameLayout;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
        this.l = textView6;
        this.b = imageView;
        this.c = imageView2;
        this.m = playerPenaltyShotView;
        this.n = typeHeaderView;
        this.o = textView7;
    }

    public js2(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, zl zlVar, TextView textView8, TextView textView9, TextView textView10, LinearLayout linearLayout2, TextView textView11) {
        this.i = linearLayout;
        this.d = textView;
        this.j = textView2;
        this.k = textView3;
        this.b = textView4;
        this.c = textView5;
        this.e = textView6;
        this.f = textView7;
        this.g = zlVar;
        this.h = textView8;
        this.l = textView9;
        this.m = textView10;
        this.n = linearLayout2;
        this.o = textView11;
    }

    public js2(ConstraintLayout constraintLayout, BellButton bellButton, v82 v82Var, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView2, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.i = constraintLayout;
        this.j = bellButton;
        this.k = v82Var;
        this.b = imageView;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.c = imageView2;
        this.h = textView5;
        this.l = textView6;
        this.m = textView7;
        this.n = textView8;
        this.o = textView9;
    }
}
