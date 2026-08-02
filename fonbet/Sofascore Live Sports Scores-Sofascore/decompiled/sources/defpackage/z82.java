package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.tennis.TennisGroundTypeView;
import com.sofascore.results.event.statistics.view.hockey.HockeyEventMapView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.CircularDropdownIndicatorView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.follownotification.FollowButton;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z82 implements krk {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public z82(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
        this.a = 25;
        this.b = constraintLayout;
        this.d = textView;
        this.e = imageView;
        this.g = imageView2;
        this.f = imageView3;
        this.c = imageView4;
    }

    public static z82 a(View view) {
        int i = R.id.first_value_text;
        TextView textView = (TextView) nq8.B(R.id.first_value_text, view);
        if (textView != null) {
            i = R.id.guideline_end;
            Guideline guideline = (Guideline) nq8.B(R.id.guideline_end, view);
            if (guideline != null) {
                i = R.id.guideline_start;
                Guideline guideline2 = (Guideline) nq8.B(R.id.guideline_start, view);
                if (guideline2 != null) {
                    i = R.id.label_text;
                    TextView textView2 = (TextView) nq8.B(R.id.label_text, view);
                    if (textView2 != null) {
                        i = R.id.second_value_text;
                        TextView textView3 = (TextView) nq8.B(R.id.second_value_text, view);
                        if (textView3 != null) {
                            return new z82((ViewGroup) view, textView, (Object) guideline, (Object) guideline2, (Object) textView2, (Object) textView3, 4);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static z82 b(View view) {
        int i = R.id.background_highlight;
        View B = nq8.B(R.id.background_highlight, view);
        if (B != null) {
            i = R.id.icon_action;
            FollowButton followButton = (FollowButton) nq8.B(R.id.icon_action, view);
            if (followButton != null) {
                i = R.id.icon_main;
                ImageView imageView = (ImageView) nq8.B(R.id.icon_main, view);
                if (imageView != null) {
                    i = R.id.icon_sport_indicator;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.icon_sport_indicator, view);
                    if (imageView2 != null) {
                        i = R.id.item_title;
                        TextView textView = (TextView) nq8.B(R.id.item_title, view);
                        if (textView != null) {
                            return new z82((ConstraintLayout) view, B, followButton, imageView, imageView2, textView);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static z82 c(View view) {
        int i = R.id.chevron_image;
        ImageView imageView = (ImageView) nq8.B(R.id.chevron_image, view);
        if (imageView != null) {
            i = R.id.football_player_clickable_area;
            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.football_player_clickable_area, view);
            if (shapeableImageView != null) {
                i = R.id.player_image;
                ImageView imageView2 = (ImageView) nq8.B(R.id.player_image, view);
                if (imageView2 != null) {
                    i = R.id.player_name;
                    TextView textView = (TextView) nq8.B(R.id.player_name, view);
                    if (textView != null) {
                        i = R.id.player_rating_holder;
                        SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.player_rating_holder, view);
                        if (sofascoreSmallRatingView != null) {
                            return new z82((ConstraintLayout) view, imageView, (View) shapeableImageView, imageView2, textView, (TextView) sofascoreSmallRatingView, 15);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static z82 d(View view) {
        int i = R.id.barrier_opponent_name_start;
        if (((Guideline) nq8.B(R.id.barrier_opponent_name_start, view)) != null) {
            i = R.id.fighter_image;
            ImageView imageView = (ImageView) nq8.B(R.id.fighter_image, view);
            if (imageView != null) {
                i = R.id.fighter_name;
                TextView textView = (TextView) nq8.B(R.id.fighter_name, view);
                if (textView != null) {
                    i = R.id.last_fight_date;
                    TextView textView2 = (TextView) nq8.B(R.id.last_fight_date, view);
                    if (textView2 != null) {
                        i = R.id.last_fight_opponent;
                        TextView textView3 = (TextView) nq8.B(R.id.last_fight_opponent, view);
                        if (textView3 != null) {
                            i = R.id.last_fight_result;
                            TextView textView4 = (TextView) nq8.B(R.id.last_fight_result, view);
                            if (textView4 != null) {
                                i = R.id.rank;
                                if (((ImageView) nq8.B(R.id.rank, view)) != null) {
                                    return new z82((ConstraintLayout) view, imageView, textView, (View) textView2, (View) textView3, (View) textView4, 21);
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

    public static z82 e(View view) {
        int i = R.id.more_label;
        TextView textView = (TextView) nq8.B(R.id.more_label, view);
        if (textView != null) {
            i = R.id.player1;
            ImageView imageView = (ImageView) nq8.B(R.id.player1, view);
            if (imageView != null) {
                i = R.id.player2;
                ImageView imageView2 = (ImageView) nq8.B(R.id.player2, view);
                if (imageView2 != null) {
                    i = R.id.player3;
                    ImageView imageView3 = (ImageView) nq8.B(R.id.player3, view);
                    if (imageView3 != null) {
                        i = R.id.player4;
                        ImageView imageView4 = (ImageView) nq8.B(R.id.player4, view);
                        if (imageView4 != null) {
                            return new z82((ConstraintLayout) view, textView, imageView, imageView2, imageView3, imageView4);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static z82 f(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_discard, (ViewGroup) null, false);
        int i = R.id.action_button;
        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.action_button, inflate);
        if (materialButton != null) {
            i = R.id.cancel_button;
            MaterialButton materialButton2 = (MaterialButton) nq8.B(R.id.cancel_button, inflate);
            if (materialButton2 != null) {
                i = R.id.extra_text;
                TextView textView = (TextView) nq8.B(R.id.extra_text, inflate);
                if (textView != null) {
                    i = R.id.text;
                    TextView textView2 = (TextView) nq8.B(R.id.text, inflate);
                    if (textView2 != null) {
                        i = R.id.title;
                        TextView textView3 = (TextView) nq8.B(R.id.title, inflate);
                        if (textView3 != null) {
                            return new z82((ViewGroup) inflate, (Object) materialButton, (Object) materialButton2, textView, (View) textView2, textView3, 10);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static z82 g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.category_header_cell, viewGroup, false);
        int i = R.id.dropdown_indicator;
        CircularDropdownIndicatorView circularDropdownIndicatorView = (CircularDropdownIndicatorView) nq8.B(R.id.dropdown_indicator, inflate);
        if (circularDropdownIndicatorView != null) {
            i = R.id.event_count_text;
            TextView textView = (TextView) nq8.B(R.id.event_count_text, inflate);
            if (textView != null) {
                i = R.id.header_description;
                TextView textView2 = (TextView) nq8.B(R.id.header_description, inflate);
                if (textView2 != null) {
                    i = R.id.header_logo;
                    ImageView imageView = (ImageView) nq8.B(R.id.header_logo, inflate);
                    if (imageView != null) {
                        i = R.id.header_name;
                        TextView textView3 = (TextView) nq8.B(R.id.header_name, inflate);
                        if (textView3 != null) {
                            return new z82((ViewGroup) inflate, (Object) circularDropdownIndicatorView, (Object) textView, (Object) textView2, (Object) imageView, (Object) textView3, 2);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static z82 h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b(layoutInflater.inflate(R.layout.favorites_grid_item, viewGroup, false));
    }

    public static z82 i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_compare_search_player, viewGroup, false);
        int i = R.id.delete_button;
        ImageView imageView = (ImageView) nq8.B(R.id.delete_button, inflate);
        if (imageView != null) {
            i = R.id.guideline;
            Guideline guideline = (Guideline) nq8.B(R.id.guideline, inflate);
            if (guideline != null) {
                i = R.id.player_image;
                ImageView imageView2 = (ImageView) nq8.B(R.id.player_image, inflate);
                if (imageView2 != null) {
                    i = R.id.player_name;
                    TextView textView = (TextView) nq8.B(R.id.player_name, inflate);
                    if (textView != null) {
                        i = R.id.team_name;
                        TextView textView2 = (TextView) nq8.B(R.id.team_name, inflate);
                        if (textView2 != null) {
                            return new z82((ConstraintLayout) inflate, imageView, (View) guideline, imageView2, textView, textView2, 17);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static z82 j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.list_item_competition_tournament, viewGroup, false);
        int i = R.id.action_button;
        ImageView imageView = (ImageView) nq8.B(R.id.action_button, inflate);
        if (imageView != null) {
            i = R.id.competition_name;
            TextView textView = (TextView) nq8.B(R.id.competition_name, inflate);
            if (textView != null) {
                i = R.id.divider;
                View B = nq8.B(R.id.divider, inflate);
                if (B != null) {
                    i = R.id.tournament_country;
                    TextView textView2 = (TextView) nq8.B(R.id.tournament_country, inflate);
                    if (textView2 != null) {
                        i = R.id.tournament_logo;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.tournament_logo, inflate);
                        if (imageView2 != null) {
                            return new z82((ConstraintLayout) inflate, imageView, textView, B, (View) textView2, (View) imageView2, 19);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static z82 k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.list_item_favorites_team_suggestion, viewGroup, false);
        int i = R.id.button_follow;
        FollowButton followButton = (FollowButton) nq8.B(R.id.button_follow, inflate);
        if (followButton != null) {
            i = R.id.container;
            if (((ConstraintLayout) nq8.B(R.id.container, inflate)) != null) {
                i = R.id.sport_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) nq8.B(R.id.sport_icon, inflate);
                if (appCompatImageView != null) {
                    i = R.id.sport_name;
                    TextView textView = (TextView) nq8.B(R.id.sport_name, inflate);
                    if (textView != null) {
                        i = R.id.team_logo;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) nq8.B(R.id.team_logo, inflate);
                        if (appCompatImageView2 != null) {
                            i = R.id.team_name;
                            TextView textView2 = (TextView) nq8.B(R.id.team_name, inflate);
                            if (textView2 != null) {
                                return new z82((ViewGroup) inflate, (Object) followButton, (Object) appCompatImageView, textView, (View) appCompatImageView2, textView2, 20);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static z82 l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.player_league_career_stats_season_stat_row, viewGroup, false);
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
        if (linearLayout != null) {
            i = R.id.divider;
            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
            if (materialDivider != null) {
                i = R.id.scroller;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                if (scrollInterceptorHorizontalScrollView != null) {
                    i = R.id.season_name;
                    TextView textView = (TextView) nq8.B(R.id.season_name, inflate);
                    if (textView != null) {
                        i = R.id.team_image_container;
                        LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.team_image_container, inflate);
                        if (linearLayout2 != null) {
                            return new z82((ViewGroup) inflate, linearLayout, (View) materialDivider, (FrameLayout) scrollInterceptorHorizontalScrollView, textView, (View) linearLayout2, 27);
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
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            case 1:
                return (ConstraintLayout) viewGroup;
            case 2:
                return (LinearLayout) viewGroup;
            case 3:
                return (LinearLayout) viewGroup;
            case 4:
                return (ConstraintLayout) viewGroup;
            case 5:
                return (LinearLayout) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (NestedScrollView) viewGroup;
            case 8:
                return (LinearLayout) viewGroup;
            case 9:
                return (LinearLayout) viewGroup;
            case 10:
                return (ConstraintLayout) viewGroup;
            case 11:
                return (LinearLayout) viewGroup;
            case 12:
                return (LinearLayout) viewGroup;
            case 13:
                return (ConstraintLayout) viewGroup;
            case 14:
                return (ConstraintLayout) viewGroup;
            case 15:
                return (ConstraintLayout) viewGroup;
            case 16:
                return (ConstraintLayout) viewGroup;
            case 17:
                return (ConstraintLayout) viewGroup;
            case 18:
                return (ConstraintLayout) viewGroup;
            case 19:
                return (ConstraintLayout) viewGroup;
            case 20:
                return (MaterialCardView) viewGroup;
            case 21:
                return (ConstraintLayout) viewGroup;
            case 22:
                return (ConstraintLayout) viewGroup;
            case 23:
                return (LinearLayout) viewGroup;
            case 24:
                return (RelativeLayout) viewGroup;
            case 25:
                return (ConstraintLayout) viewGroup;
            case 26:
                return (ConstraintLayout) viewGroup;
            case 27:
                return (ConstraintLayout) viewGroup;
            case 28:
                return (LinearLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public /* synthetic */ z82(ViewGroup viewGroup, TextView textView, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = viewGroup;
        this.d = textView;
        this.f = obj;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
    }

    public /* synthetic */ z82(ViewGroup viewGroup, Object obj, Object obj2, TextView textView, View view, TextView textView2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.f = obj;
        this.c = obj2;
        this.d = textView;
        this.e = view;
        this.g = textView2;
    }

    public /* synthetic */ z82(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = viewGroup;
        this.f = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.g = obj5;
    }

    public /* synthetic */ z82(ConstraintLayout constraintLayout, ImageView imageView, View view, ImageView imageView2, TextView textView, TextView textView2, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.e = imageView;
        this.f = view;
        this.g = imageView2;
        this.d = textView;
        this.c = textView2;
    }

    public /* synthetic */ z82(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, View view, View view2, View view3, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.e = imageView;
        this.d = textView;
        this.f = view;
        this.c = view2;
        this.g = view3;
    }

    public /* synthetic */ z82(ViewGroup viewGroup, LinearLayout linearLayout, View view, FrameLayout frameLayout, TextView textView, View view2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.f = linearLayout;
        this.c = view;
        this.e = frameLayout;
        this.d = textView;
        this.g = view2;
    }

    public z82(LinearLayout linearLayout, dk2 dk2Var, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.a = 28;
        this.b = linearLayout;
        this.f = dk2Var;
        this.e = imageView;
        this.c = linearLayout2;
        this.d = textView;
        this.g = textView2;
    }

    public z82(ConstraintLayout constraintLayout, View view, FollowButton followButton, ImageView imageView, ImageView imageView2, TextView textView) {
        this.a = 14;
        this.b = constraintLayout;
        this.f = view;
        this.c = followButton;
        this.e = imageView;
        this.g = imageView2;
        this.d = textView;
    }

    public z82(ConstraintLayout constraintLayout, TennisGroundTypeView tennisGroundTypeView, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.a = 18;
        this.b = constraintLayout;
        this.f = tennisGroundTypeView;
        this.e = imageView;
        this.d = textView;
        this.c = textView2;
        this.g = imageView2;
    }

    public z82(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view, ImageView imageView) {
        this.a = 22;
        this.b = constraintLayout;
        this.d = textView;
        this.c = textView2;
        this.g = textView3;
        this.f = view;
        this.e = imageView;
    }

    public z82(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView, ImageView imageView) {
        this.a = 1;
        this.b = constraintLayout;
        this.f = shapeableImageView;
        this.c = frameLayout;
        this.g = frameLayout2;
        this.d = textView;
        this.e = imageView;
    }

    public z82(ConstraintLayout constraintLayout, ImageView imageView, GraphicLarge graphicLarge, HockeyEventMapView hockeyEventMapView, Group group, ComposeView composeView, ComposeView composeView2, SegmentedButtonsView segmentedButtonsView) {
        this.a = 16;
        this.b = constraintLayout;
        this.e = imageView;
        this.f = graphicLarge;
        this.d = hockeyEventMapView;
        this.c = group;
        this.g = segmentedButtonsView;
    }

    public z82(RelativeLayout relativeLayout, Button button, ImageView imageView, LinearLayout linearLayout, View view, View view2, TextView textView, TextView textView2) {
        this.a = 24;
        this.b = relativeLayout;
        this.e = imageView;
        this.f = view;
        this.c = view2;
        this.d = textView;
        this.g = textView2;
    }
}
