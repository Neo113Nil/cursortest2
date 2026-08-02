package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.shootout.PenaltiesGridView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v82 implements krk {
    public final /* synthetic */ int a;
    public final View b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public v82(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        this.a = 13;
        this.b = constraintLayout;
        this.h = guideline;
        this.c = guideline2;
        this.f = progressBar;
        this.e = textView;
        this.g = textView2;
        this.d = textView3;
    }

    public static v82 a(View view) {
        int i = R.id.first_team_hero_1;
        View B = nq8.B(R.id.first_team_hero_1, view);
        if (B != null) {
            jq5 a = jq5.a(B);
            i = R.id.first_team_hero_2;
            View B2 = nq8.B(R.id.first_team_hero_2, view);
            if (B2 != null) {
                jq5 a2 = jq5.a(B2);
                i = R.id.first_team_hero_3;
                View B3 = nq8.B(R.id.first_team_hero_3, view);
                if (B3 != null) {
                    jq5 a3 = jq5.a(B3);
                    i = R.id.second_team_hero_1;
                    View B4 = nq8.B(R.id.second_team_hero_1, view);
                    if (B4 != null) {
                        jq5 a4 = jq5.a(B4);
                        i = R.id.second_team_hero_2;
                        View B5 = nq8.B(R.id.second_team_hero_2, view);
                        if (B5 != null) {
                            jq5 a5 = jq5.a(B5);
                            i = R.id.second_team_hero_3;
                            View B6 = nq8.B(R.id.second_team_hero_3, view);
                            if (B6 != null) {
                                return new v82((ConstraintLayout) view, a, a2, a3, a4, a5, jq5.a(B6), 4);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static v82 b(View view) {
        int i = R.id.graph_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.graph_container, view);
        if (linearLayout != null) {
            i = R.id.graph_row_title;
            TextView textView = (TextView) nq8.B(R.id.graph_row_title, view);
            if (textView != null) {
                i = R.id.lower_container;
                LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.lower_container, view);
                if (linearLayout2 != null) {
                    i = R.id.lower_logo;
                    ImageView imageView = (ImageView) nq8.B(R.id.lower_logo, view);
                    if (imageView != null) {
                        i = R.id.upper_container;
                        LinearLayout linearLayout3 = (LinearLayout) nq8.B(R.id.upper_container, view);
                        if (linearLayout3 != null) {
                            i = R.id.upper_logo;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.upper_logo, view);
                            if (imageView2 != null) {
                                return new v82((ConstraintLayout) view, linearLayout, textView, linearLayout2, imageView, linearLayout3, imageView2);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static v82 c(View view) {
        int i = R.id.first_half_score_row;
        View B = nq8.B(R.id.first_half_score_row, view);
        if (B != null) {
            iq5 a = iq5.a(B);
            i = R.id.game_duration;
            TextView textView = (TextView) nq8.B(R.id.game_duration, view);
            if (textView != null) {
                i = R.id.game_map;
                TextView textView2 = (TextView) nq8.B(R.id.game_map, view);
                if (textView2 != null) {
                    i = R.id.game_score_container;
                    View B2 = nq8.B(R.id.game_score_container, view);
                    if (B2 != null) {
                        int i2 = R.id.first_team_score;
                        TextView textView3 = (TextView) nq8.B(R.id.first_team_score, B2);
                        if (textView3 != null) {
                            i2 = R.id.score_border;
                            View B3 = nq8.B(R.id.score_border, B2);
                            if (B3 != null) {
                                i2 = R.id.score_container;
                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.score_container, B2);
                                if (linearLayout != null) {
                                    i2 = R.id.score_separator;
                                    TextView textView4 = (TextView) nq8.B(R.id.score_separator, B2);
                                    if (textView4 != null) {
                                        i2 = R.id.second_team_score;
                                        TextView textView5 = (TextView) nq8.B(R.id.second_team_score, B2);
                                        if (textView5 != null) {
                                            z82 z82Var = new z82((ViewGroup) B2, textView3, (Object) B3, (Object) linearLayout, (Object) textView4, (Object) textView5, 13);
                                            i = R.id.period_score_divider;
                                            View B4 = nq8.B(R.id.period_score_divider, view);
                                            if (B4 != null) {
                                                i = R.id.second_half_score_row;
                                                View B5 = nq8.B(R.id.second_half_score_row, view);
                                                if (B5 != null) {
                                                    return new v82((ViewGroup) view, (krk) a, textView, (View) textView2, (Object) z82Var, B4, (Object) iq5.a(B5), 6);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i2)));
                        return null;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static v82 d(View view) {
        int i = R.id.graphic_large_button;
        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.graphic_large_button, view);
        if (materialButton != null) {
            i = R.id.graphic_large_image;
            ImageView imageView = (ImageView) nq8.B(R.id.graphic_large_image, view);
            if (imageView != null) {
                i = R.id.graphic_large_subtitle;
                TextView textView = (TextView) nq8.B(R.id.graphic_large_subtitle, view);
                if (textView != null) {
                    i = R.id.graphic_large_title;
                    TextView textView2 = (TextView) nq8.B(R.id.graphic_large_title, view);
                    if (textView2 != null) {
                        i = R.id.graphic_small_background;
                        View B = nq8.B(R.id.graphic_small_background, view);
                        if (B != null) {
                            i = R.id.graphic_small_image;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.graphic_small_image, view);
                            if (imageView2 != null) {
                                return new v82((ConstraintLayout) view, (View) materialButton, imageView, textView, (View) textView2, B, (View) imageView2, 7);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static v82 e(View view) {
        int i = R.id.additional_penalties_holder;
        PenaltiesGridView penaltiesGridView = (PenaltiesGridView) nq8.B(R.id.additional_penalties_holder, view);
        if (penaltiesGridView != null) {
            i = R.id.background_view;
            View B = nq8.B(R.id.background_view, view);
            if (B != null) {
                i = R.id.first_five_penalties_holder;
                PenaltiesGridView penaltiesGridView2 = (PenaltiesGridView) nq8.B(R.id.first_five_penalties_holder, view);
                if (penaltiesGridView2 != null) {
                    i = R.id.players;
                    ComposeView composeView = (ComposeView) nq8.B(R.id.players, view);
                    if (composeView != null) {
                        i = R.id.shots_container;
                        if (((LinearLayout) nq8.B(R.id.shots_container, view)) != null) {
                            i = R.id.team_logo_image;
                            ImageView imageView = (ImageView) nq8.B(R.id.team_logo_image, view);
                            if (imageView != null) {
                                i = R.id.team_score_text;
                                TextView textView = (TextView) nq8.B(R.id.team_score_text, view);
                                if (textView != null) {
                                    return new v82((ConstraintLayout) view, penaltiesGridView, B, penaltiesGridView2, composeView, imageView, textView);
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

    public static v82 f(View view) {
        int i = R.id.live_label;
        TextView textView = (TextView) nq8.B(R.id.live_label, view);
        if (textView != null) {
            i = R.id.market_name;
            TextView textView2 = (TextView) nq8.B(R.id.market_name, view);
            if (textView2 != null) {
                i = R.id.odds_choice_0;
                View B = nq8.B(R.id.odds_choice_0, view);
                if (B != null) {
                    pu1 a = pu1.a(B);
                    i = R.id.odds_choice_1;
                    View B2 = nq8.B(R.id.odds_choice_1, view);
                    if (B2 != null) {
                        pu1 a2 = pu1.a(B2);
                        i = R.id.odds_choice_2;
                        View B3 = nq8.B(R.id.odds_choice_2, view);
                        if (B3 != null) {
                            pu1 a3 = pu1.a(B3);
                            i = R.id.provider_logo;
                            ImageView imageView = (ImageView) nq8.B(R.id.provider_logo, view);
                            if (imageView != null) {
                                return new v82(view, textView, textView2, a, a2, a3, imageView, 16);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static v82 g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d(layoutInflater.inflate(R.layout.graphic_large, viewGroup, false));
    }

    public static v82 h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.summary_info_referee_row_layout_test, viewGroup, false);
        viewGroup.addView(inflate);
        int i = R.id.arrow_icon;
        if (((ImageView) nq8.B(R.id.arrow_icon, inflate)) != null) {
            i = R.id.average_cards_label;
            if (((TextView) nq8.B(R.id.average_cards_label, inflate)) != null) {
                i = R.id.cards_group;
                Group group = (Group) nq8.B(R.id.cards_group, inflate);
                if (group != null) {
                    i = R.id.info_icon;
                    ImageView imageView = (ImageView) nq8.B(R.id.info_icon, inflate);
                    if (imageView != null) {
                        i = R.id.red_cards_icon;
                        if (((ImageView) nq8.B(R.id.red_cards_icon, inflate)) != null) {
                            i = R.id.red_cards_label;
                            TextView textView = (TextView) nq8.B(R.id.red_cards_label, inflate);
                            if (textView != null) {
                                i = R.id.referee_country;
                                ImageView imageView2 = (ImageView) nq8.B(R.id.referee_country, inflate);
                                if (imageView2 != null) {
                                    i = R.id.referee_name;
                                    TextView textView2 = (TextView) nq8.B(R.id.referee_name, inflate);
                                    if (textView2 != null) {
                                        i = R.id.yellow_cards_icon;
                                        if (((ImageView) nq8.B(R.id.yellow_cards_icon, inflate)) != null) {
                                            i = R.id.yellow_cards_label;
                                            TextView textView3 = (TextView) nq8.B(R.id.yellow_cards_label, inflate);
                                            if (textView3 != null) {
                                                return new v82((ConstraintLayout) inflate, (View) group, imageView, textView, (View) imageView2, (View) textView2, (View) textView3, 14);
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
        int i = this.a;
        View view = this.b;
        switch (i) {
        }
        return (ConstraintLayout) view;
    }

    public /* synthetic */ v82(ViewGroup viewGroup, krk krkVar, TextView textView, View view, Object obj, View view2, Object obj2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.h = krkVar;
        this.e = textView;
        this.c = view;
        this.f = obj;
        this.g = view2;
        this.d = obj2;
    }

    public /* synthetic */ v82(ViewGroup viewGroup, View view, TextView textView, ImageView imageView, TextView textView2, View view2, View view3, int i) {
        this.a = i;
        this.b = viewGroup;
        this.h = view;
        this.e = textView;
        this.d = imageView;
        this.c = textView2;
        this.f = view2;
        this.g = view3;
    }

    public /* synthetic */ v82(ConstraintLayout constraintLayout, View view, ImageView imageView, TextView textView, View view2, View view3, View view4, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.h = view;
        this.d = imageView;
        this.e = textView;
        this.c = view2;
        this.f = view3;
        this.g = view4;
    }

    public v82(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, FrameLayout frameLayout2, FrameLayout frameLayout3, TextView textView2) {
        this.a = 1;
        this.b = constraintLayout;
        this.c = frameLayout;
        this.d = imageView;
        this.e = textView;
        this.f = frameLayout2;
        this.g = frameLayout3;
        this.h = textView2;
    }

    public v82(ConstraintLayout constraintLayout, View view, TextView textView, FrameLayout frameLayout, TextView textView2, ImageView imageView, TextView textView3) {
        this.a = 2;
        this.b = constraintLayout;
        this.h = view;
        this.e = textView;
        this.c = frameLayout;
        this.f = textView2;
        this.d = imageView;
        this.g = textView3;
    }

    public v82(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, ImageView imageView2) {
        this.a = 5;
        this.b = constraintLayout;
        this.h = linearLayout;
        this.e = textView;
        this.c = linearLayout2;
        this.d = imageView;
        this.f = linearLayout3;
        this.g = imageView2;
    }

    public /* synthetic */ v82(View view, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = view;
        this.e = obj;
        this.h = obj2;
        this.c = obj3;
        this.f = obj4;
        this.g = obj5;
        this.d = obj6;
    }

    public v82(ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout) {
        this.a = 18;
        this.b = constraintLayout;
        this.e = textView;
        this.d = imageView;
        this.h = imageView2;
        this.c = textView2;
        this.f = textView3;
        this.g = textView4;
    }

    public v82(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, View view, ConstraintLayout constraintLayout, TextView textView2, TextView textView3) {
        this.a = 12;
        this.h = linearLayout;
        this.e = textView;
        this.c = linearLayout2;
        this.f = view;
        this.b = constraintLayout;
        this.g = textView2;
        this.d = textView3;
    }

    public v82(ConstraintLayout constraintLayout, LinearLayout linearLayout, MaterialDivider materialDivider, TextView textView, TextView textView2, TextView textView3, ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView) {
        this.a = 9;
        this.b = constraintLayout;
        this.h = linearLayout;
        this.c = materialDivider;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
        this.d = scrollInterceptorHorizontalScrollView;
    }

    public v82(ConstraintLayout constraintLayout, PenaltiesGridView penaltiesGridView, View view, PenaltiesGridView penaltiesGridView2, ComposeView composeView, ImageView imageView, TextView textView) {
        this.a = 10;
        this.b = constraintLayout;
        this.h = penaltiesGridView;
        this.c = view;
        this.f = penaltiesGridView2;
        this.g = composeView;
        this.d = imageView;
        this.e = textView;
    }
}
