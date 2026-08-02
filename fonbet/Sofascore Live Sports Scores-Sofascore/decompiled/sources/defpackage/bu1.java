package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.common.widget.NestedHorizontalScrollView;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.view.graph.TennisPowerGraph;
import com.sofascore.results.view.header.FollowersTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bu1 implements krk {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public bu1(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, ImageView imageView4, ImageView imageView5, View view, TennisPowerGraph tennisPowerGraph, NestedHorizontalScrollView nestedHorizontalScrollView) {
        this.b = constraintLayout;
        this.d = imageView;
        this.j = imageView2;
        this.c = imageView3;
        this.e = textView;
        this.g = imageView4;
        this.h = imageView5;
        this.f = view;
        this.i = tennisPowerGraph;
        this.k = nestedHorizontalScrollView;
    }

    public static bu1 a(View view) {
        int i = R.id.date_label;
        TextView textView = (TextView) nq8.B(R.id.date_label, view);
        if (textView != null) {
            i = R.id.first_team;
            TextView textView2 = (TextView) nq8.B(R.id.first_team, view);
            if (textView2 != null) {
                i = R.id.icon;
                ImageView imageView = (ImageView) nq8.B(R.id.icon, view);
                if (imageView != null) {
                    i = R.id.league_label;
                    TextView textView3 = (TextView) nq8.B(R.id.league_label, view);
                    if (textView3 != null) {
                        i = R.id.league_logo;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.league_logo, view);
                        if (imageView2 != null) {
                            i = R.id.score;
                            TextView textView4 = (TextView) nq8.B(R.id.score, view);
                            if (textView4 != null) {
                                i = R.id.second_team;
                                TextView textView5 = (TextView) nq8.B(R.id.second_team, view);
                                if (textView5 != null) {
                                    i = R.id.separator1;
                                    if (((ImageView) nq8.B(R.id.separator1, view)) != null) {
                                        i = R.id.separator2;
                                        if (((ImageView) nq8.B(R.id.separator2, view)) != null) {
                                            i = R.id.slash;
                                            TextView textView6 = (TextView) nq8.B(R.id.slash, view);
                                            if (textView6 != null) {
                                                i = R.id.sport_logo;
                                                ImageView imageView3 = (ImageView) nq8.B(R.id.sport_logo, view);
                                                if (imageView3 != null) {
                                                    return new bu1((LinearLayout) view, textView, textView2, imageView, textView3, imageView2, textView4, textView5, textView6, imageView3);
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

    public static bu1 b(View view) {
        int i = R.id.followers_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.followers_container, view);
        if (constraintLayout != null) {
            i = R.id.followers_count;
            FollowersTextView followersTextView = (FollowersTextView) nq8.B(R.id.followers_count, view);
            if (followersTextView != null) {
                i = R.id.followers_increment;
                TextView textView = (TextView) nq8.B(R.id.followers_increment, view);
                if (textView != null) {
                    i = R.id.followers_increment_container;
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.followers_increment_container, view);
                    if (frameLayout != null) {
                        i = R.id.followers_label;
                        if (((TextView) nq8.B(R.id.followers_label, view)) != null) {
                            i = R.id.image;
                            ImageView imageView = (ImageView) nq8.B(R.id.image, view);
                            if (imageView != null) {
                                i = R.id.main_content;
                                if (((ConstraintLayout) nq8.B(R.id.main_content, view)) != null) {
                                    i = R.id.photo_icon;
                                    if (((ImageView) nq8.B(R.id.photo_icon, view)) != null) {
                                        i = R.id.primary_label;
                                        TextView textView2 = (TextView) nq8.B(R.id.primary_label, view);
                                        if (textView2 != null) {
                                            i = R.id.secondary_label;
                                            TextView textView3 = (TextView) nq8.B(R.id.secondary_label, view);
                                            if (textView3 != null) {
                                                i = R.id.secondary_label_icon;
                                                ImageView imageView2 = (ImageView) nq8.B(R.id.secondary_label_icon, view);
                                                if (imageView2 != null) {
                                                    i = R.id.spinner;
                                                    Spinner spinner = (Spinner) nq8.B(R.id.spinner, view);
                                                    if (spinner != null) {
                                                        return new bu1((LinearLayout) view, constraintLayout, followersTextView, textView, frameLayout, imageView, textView2, textView3, imageView2, spinner);
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

    public static bu1 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.best_of_5_cs_view_row, viewGroup, false);
        int i = R.id.current_game;
        TextView textView = (TextView) nq8.B(R.id.current_game, inflate);
        if (textView != null) {
            i = R.id.darken_overlay;
            View B = nq8.B(R.id.darken_overlay, inflate);
            if (B != null) {
                i = R.id.first_team_side;
                View B2 = nq8.B(R.id.first_team_side, inflate);
                if (B2 != null) {
                    i = R.id.game_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.game_container, inflate);
                    if (constraintLayout != null) {
                        i = R.id.indicator;
                        ImageView imageView = (ImageView) nq8.B(R.id.indicator, inflate);
                        if (imageView != null) {
                            i = R.id.map_image;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.map_image, inflate);
                            if (imageView2 != null) {
                                i = R.id.score_container;
                                View B3 = nq8.B(R.id.score_container, inflate);
                                if (B3 != null) {
                                    v82 c = v82.c(B3);
                                    i = R.id.second_team_side;
                                    View B4 = nq8.B(R.id.second_team_side, inflate);
                                    if (B4 != null) {
                                        i = R.id.start_time;
                                        TextView textView2 = (TextView) nq8.B(R.id.start_time, inflate);
                                        if (textView2 != null) {
                                            return new bu1((FrameLayout) inflate, textView, B, B2, constraintLayout, imageView, imageView2, c, B4, textView2);
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

    public static bu1 d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.ranking_row_three_columns_layout, viewGroup, false);
        int i = R.id.ranking_item_subtitle;
        TextView textView = (TextView) nq8.B(R.id.ranking_item_subtitle, inflate);
        if (textView != null) {
            i = R.id.ranking_item_title;
            TextView textView2 = (TextView) nq8.B(R.id.ranking_item_title, inflate);
            if (textView2 != null) {
                i = R.id.ranking_main_image;
                ImageView imageView = (ImageView) nq8.B(R.id.ranking_main_image, inflate);
                if (imageView != null) {
                    i = R.id.ranking_position;
                    TextView textView3 = (TextView) nq8.B(R.id.ranking_position, inflate);
                    if (textView3 != null) {
                        i = R.id.ranking_position_diff;
                        TextView textView4 = (TextView) nq8.B(R.id.ranking_position_diff, inflate);
                        if (textView4 != null) {
                            i = R.id.ranking_secondary_image;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.ranking_secondary_image, inflate);
                            if (imageView2 != null) {
                                i = R.id.ranking_value_1;
                                TextView textView5 = (TextView) nq8.B(R.id.ranking_value_1, inflate);
                                if (textView5 != null) {
                                    i = R.id.ranking_value_2;
                                    TextView textView6 = (TextView) nq8.B(R.id.ranking_value_2, inflate);
                                    if (textView6 != null) {
                                        i = R.id.ranking_value_3;
                                        TextView textView7 = (TextView) nq8.B(R.id.ranking_value_3, inflate);
                                        if (textView7 != null) {
                                            return new bu1((ConstraintLayout) inflate, textView, textView2, imageView, textView3, textView4, imageView2, textView5, textView6, textView7);
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
        Object obj = this.f;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
        }
        return (ConstraintLayout) obj3;
    }

    public bu1(FrameLayout frameLayout, TextView textView, View view, View view2, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, v82 v82Var, View view3, TextView textView2) {
        this.c = frameLayout;
        this.e = textView;
        this.f = view;
        this.h = view2;
        this.b = constraintLayout;
        this.d = imageView;
        this.j = imageView2;
        this.k = v82Var;
        this.i = view3;
        this.g = textView2;
    }

    public bu1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, ImageView imageView2, TextView textView5, TextView textView6, TextView textView7) {
        this.b = constraintLayout;
        this.e = textView;
        this.g = textView2;
        this.d = imageView;
        this.c = textView3;
        this.f = textView4;
        this.j = imageView2;
        this.h = textView5;
        this.i = textView6;
        this.k = textView7;
    }

    public bu1(ConstraintLayout constraintLayout, SofaDivider sofaDivider, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, TextView textView6, TextView textView7) {
        this.b = constraintLayout;
        this.c = sofaDivider;
        this.e = textView;
        this.g = textView2;
        this.f = textView3;
        this.h = textView4;
        this.i = textView5;
        this.d = imageView;
        this.j = textView6;
        this.k = textView7;
    }

    public bu1(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout, TextView textView4, FrameLayout frameLayout2, TextView textView5, FrameLayout frameLayout3, TextView textView6) {
        this.f = linearLayout;
        this.e = textView;
        this.g = textView2;
        this.h = textView3;
        this.c = frameLayout;
        this.i = textView4;
        this.b = frameLayout2;
        this.d = textView5;
        this.j = frameLayout3;
        this.k = textView6;
    }

    public bu1(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, TextView textView, FrameLayout frameLayout3, View view, TextView textView2, TextView textView3) {
        this.b = constraintLayout;
        this.h = shapeableImageView;
        this.c = frameLayout;
        this.i = frameLayout2;
        this.d = imageView;
        this.e = textView;
        this.j = frameLayout3;
        this.f = view;
        this.g = textView2;
        this.k = textView3;
    }

    public bu1(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, ImageView imageView2, TextView textView4, TextView textView5, TextView textView6, ImageView imageView3) {
        this.c = linearLayout;
        this.e = textView;
        this.g = textView2;
        this.d = imageView;
        this.f = textView3;
        this.j = imageView2;
        this.h = textView4;
        this.i = textView5;
        this.b = textView6;
        this.k = imageView3;
    }

    public bu1(CardView cardView, rfe rfeVar, e92 e92Var, n9i n9iVar, n9i n9iVar2, n9i n9iVar3, n9i n9iVar4, n9i n9iVar5, n9i n9iVar6, n9i n9iVar7) {
        this.c = cardView;
        this.e = rfeVar;
        this.g = e92Var;
        this.f = n9iVar;
        this.h = n9iVar2;
        this.i = n9iVar3;
        this.b = n9iVar4;
        this.d = n9iVar5;
        this.j = n9iVar6;
        this.k = n9iVar7;
    }

    public bu1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.b = constraintLayout;
        this.e = textView;
        this.g = textView2;
        this.c = textView3;
        this.f = textView4;
        this.h = textView5;
        this.i = textView6;
        this.d = textView7;
        this.j = textView8;
        this.k = textView9;
    }

    public bu1(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, TextView textView, TextView textView2, TextView textView3, TextView textView4, SeekBar seekBar) {
        this.b = constraintLayout;
        this.f = view;
        this.h = view2;
        this.i = view3;
        this.c = view4;
        this.e = view5;
        this.g = view6;
        this.d = view7;
        this.j = view8;
        this.k = seekBar;
    }

    public bu1(LinearLayout linearLayout, ConstraintLayout constraintLayout, FollowersTextView followersTextView, TextView textView, FrameLayout frameLayout, ImageView imageView, TextView textView2, TextView textView3, ImageView imageView2, Spinner spinner) {
        this.f = linearLayout;
        this.b = constraintLayout;
        this.h = followersTextView;
        this.e = textView;
        this.c = frameLayout;
        this.d = imageView;
        this.g = textView2;
        this.i = textView3;
        this.j = imageView2;
        this.k = spinner;
    }

    public bu1(CardView cardView, TextView textView, TextView textView2, LinearLayout linearLayout, View view, Group group, ImageView imageView, ImageView imageView2, View view2, FrameLayout frameLayout) {
        this.i = cardView;
        this.e = textView;
        this.g = textView2;
        this.b = linearLayout;
        this.f = view;
        this.k = group;
        this.d = imageView;
        this.j = imageView2;
        this.h = view2;
        this.c = frameLayout;
    }

    public bu1(ConstraintLayout constraintLayout, TextView textView, hs1 hs1Var, hs1 hs1Var2, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.b = constraintLayout;
        this.e = textView;
        this.c = hs1Var;
        this.f = hs1Var2;
        this.d = imageView;
        this.j = imageView2;
        this.g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.k = textView5;
    }
}
