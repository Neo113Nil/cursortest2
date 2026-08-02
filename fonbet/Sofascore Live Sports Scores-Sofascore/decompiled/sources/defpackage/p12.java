package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelGraphView;
import com.sofascore.results.event.details.view.tennis.SwitchView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p12 implements krk {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final View f;
    public final View g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public p12(ConstraintLayout constraintLayout, View view, LinearLayout linearLayout, ImageView imageView, View view2, TextView textView, TextView textView2, ImageView imageView2, ImageView imageView3, ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView, TextView textView3) {
        this.a = 8;
        this.b = constraintLayout;
        this.d = view;
        this.f = linearLayout;
        this.e = imageView;
        this.h = view2;
        this.c = textView;
        this.i = textView2;
        this.j = imageView2;
        this.k = imageView3;
        this.g = scrollInterceptorHorizontalScrollView;
        this.l = textView3;
    }

    public static p12 a(View view) {
        int i = R.id.button_left;
        ImageButton imageButton = (ImageButton) nq8.B(R.id.button_left, view);
        if (imageButton != null) {
            i = R.id.button_right;
            ImageButton imageButton2 = (ImageButton) nq8.B(R.id.button_right, view);
            if (imageButton2 != null) {
                i = R.id.header_root;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.header_root, view);
                if (linearLayout != null) {
                    i = R.id.horizontal_scroll;
                    ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.horizontal_scroll, view);
                    if (scrollInterceptorHorizontalScrollView != null) {
                        i = R.id.sort_lineups_header_button;
                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.sort_lineups_header_button, view);
                        if (frameLayout != null) {
                            i = R.id.sort_lineups_header_main_1;
                            View B = nq8.B(R.id.sort_lineups_header_main_1, view);
                            if (B != null) {
                                v12 a = v12.a(B);
                                i = R.id.sort_lineups_header_main_2;
                                View B2 = nq8.B(R.id.sort_lineups_header_main_2, view);
                                if (B2 != null) {
                                    v12 a2 = v12.a(B2);
                                    i = R.id.sort_lineups_header_main_3;
                                    View B3 = nq8.B(R.id.sort_lineups_header_main_3, view);
                                    if (B3 != null) {
                                        v12 a3 = v12.a(B3);
                                        i = R.id.sort_lineups_header_main_4;
                                        View B4 = nq8.B(R.id.sort_lineups_header_main_4, view);
                                        if (B4 != null) {
                                            v12 a4 = v12.a(B4);
                                            i = R.id.sort_lineups_header_text;
                                            TextView textView = (TextView) nq8.B(R.id.sort_lineups_header_text, view);
                                            if (textView != null) {
                                                i = R.id.start_guideline;
                                                if (((Guideline) nq8.B(R.id.start_guideline, view)) != null) {
                                                    return new p12((ConstraintLayout) view, imageButton, imageButton2, linearLayout, scrollInterceptorHorizontalScrollView, frameLayout, a, a2, a3, a4, textView);
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

    public static p12 b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.column_1;
        TextView textView = (TextView) nq8.B(R.id.column_1, view);
        if (textView != null) {
            i = R.id.column_2;
            TextView textView2 = (TextView) nq8.B(R.id.column_2, view);
            if (textView2 != null) {
                i = R.id.column_3;
                TextView textView3 = (TextView) nq8.B(R.id.column_3, view);
                if (textView3 != null) {
                    i = R.id.column_4;
                    TextView textView4 = (TextView) nq8.B(R.id.column_4, view);
                    if (textView4 != null) {
                        i = R.id.column_5;
                        TextView textView5 = (TextView) nq8.B(R.id.column_5, view);
                        if (textView5 != null) {
                            i = R.id.column_6;
                            TextView textView6 = (TextView) nq8.B(R.id.column_6, view);
                            if (textView6 != null) {
                                i = R.id.column_7;
                                TextView textView7 = (TextView) nq8.B(R.id.column_7, view);
                                if (textView7 != null) {
                                    i = R.id.item_section_name;
                                    TextView textView8 = (TextView) nq8.B(R.id.item_section_name, view);
                                    if (textView8 != null) {
                                        i = R.id.item_section_order;
                                        TextView textView9 = (TextView) nq8.B(R.id.item_section_order, view);
                                        if (textView9 != null) {
                                            return new p12(constraintLayout, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, 1);
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

    public static p12 c(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.main_list_popup, (ViewGroup) null, false);
        int i = R.id.away_sub_team_1;
        View B = nq8.B(R.id.away_sub_team_1, inflate);
        if (B != null) {
            nfc a = nfc.a(B);
            i = R.id.away_sub_team_2;
            View B2 = nq8.B(R.id.away_sub_team_2, inflate);
            if (B2 != null) {
                nfc a2 = nfc.a(B2);
                i = R.id.away_team;
                View B3 = nq8.B(R.id.away_team, inflate);
                if (B3 != null) {
                    nfc a3 = nfc.a(B3);
                    i = R.id.divider;
                    View B4 = nq8.B(R.id.divider, inflate);
                    if (B4 != null) {
                        i = R.id.home_sub_team_1;
                        View B5 = nq8.B(R.id.home_sub_team_1, inflate);
                        if (B5 != null) {
                            nfc a4 = nfc.a(B5);
                            i = R.id.home_sub_team_2;
                            View B6 = nq8.B(R.id.home_sub_team_2, inflate);
                            if (B6 != null) {
                                nfc a5 = nfc.a(B6);
                                i = R.id.home_team;
                                View B7 = nq8.B(R.id.home_team, inflate);
                                if (B7 != null) {
                                    nfc a6 = nfc.a(B7);
                                    i = R.id.league;
                                    View B8 = nq8.B(R.id.league, inflate);
                                    if (B8 != null) {
                                        nfc a7 = nfc.a(B8);
                                        i = R.id.mute;
                                        View B9 = nq8.B(R.id.mute, inflate);
                                        if (B9 != null) {
                                            nfc a8 = nfc.a(B9);
                                            i = R.id.popup;
                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.popup, inflate);
                                            if (linearLayout != null) {
                                                return new p12((FrameLayout) inflate, a, a2, a3, B4, a4, a5, a6, a7, a8, linearLayout);
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

    public static p12 d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b(layoutInflater.inflate(R.layout.cricket_innings_section_layout, viewGroup, false));
    }

    public static p12 e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.viewholder_event_cricket, viewGroup, false);
        int i = R.id.action_layout;
        View B = nq8.B(R.id.action_layout, inflate);
        if (B != null) {
            nr1 a = nr1.a(B);
            i = R.id.description;
            TextView textView = (TextView) nq8.B(R.id.description, inflate);
            if (textView != null) {
                i = R.id.first_team_logo;
                ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, inflate);
                if (imageView != null) {
                    i = R.id.first_team_name;
                    TextView textView2 = (TextView) nq8.B(R.id.first_team_name, inflate);
                    if (textView2 != null) {
                        i = R.id.first_team_score;
                        TextView textView3 = (TextView) nq8.B(R.id.first_team_score, inflate);
                        if (textView3 != null) {
                            i = R.id.first_team_special_indicator;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.first_team_special_indicator, inflate);
                            if (imageView2 != null) {
                                i = R.id.score_current_start_barrier;
                                if (((Barrier) nq8.B(R.id.score_current_start_barrier, inflate)) != null) {
                                    i = R.id.second_team_logo;
                                    ImageView imageView3 = (ImageView) nq8.B(R.id.second_team_logo, inflate);
                                    if (imageView3 != null) {
                                        i = R.id.second_team_name;
                                        TextView textView4 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                        if (textView4 != null) {
                                            i = R.id.second_team_score;
                                            TextView textView5 = (TextView) nq8.B(R.id.second_team_score, inflate);
                                            if (textView5 != null) {
                                                i = R.id.second_team_special_indicator;
                                                ImageView imageView4 = (ImageView) nq8.B(R.id.second_team_special_indicator, inflate);
                                                if (imageView4 != null) {
                                                    return new p12((ConstraintLayout) inflate, a, textView, imageView, textView2, textView3, imageView2, imageView3, textView4, textView5, imageView4, 9);
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
        }
        return (ConstraintLayout) this.b;
    }

    public p12(FrameLayout frameLayout, nfc nfcVar, nfc nfcVar2, nfc nfcVar3, View view, nfc nfcVar4, nfc nfcVar5, nfc nfcVar6, nfc nfcVar7, nfc nfcVar8, LinearLayout linearLayout) {
        this.a = 4;
        this.h = frameLayout;
        this.b = nfcVar;
        this.d = nfcVar2;
        this.e = nfcVar3;
        this.g = view;
        this.i = nfcVar4;
        this.j = nfcVar5;
        this.k = nfcVar6;
        this.l = nfcVar7;
        this.c = nfcVar8;
        this.f = linearLayout;
    }

    public p12(ConstraintLayout constraintLayout, TextView textView, View view, View view2, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, TextView textView4, RecyclerView recyclerView, TextView textView5) {
        this.a = 6;
        this.b = constraintLayout;
        this.c = textView;
        this.d = view;
        this.e = view2;
        this.f = imageView;
        this.g = imageView2;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = recyclerView;
        this.l = textView5;
    }

    public p12(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, ImageView imageView2, View view, v82 v82Var, LinearLayout linearLayout2, TextView textView2, ImageView imageView3, View view2) {
        this.a = 3;
        this.b = constraintLayout;
        this.d = imageView;
        this.f = linearLayout;
        this.c = textView;
        this.e = imageView2;
        this.g = view;
        this.h = v82Var;
        this.i = linearLayout2;
        this.j = textView2;
        this.k = imageView3;
        this.l = view2;
    }

    public /* synthetic */ p12(ConstraintLayout constraintLayout, Object obj, TextView textView, View view, TextView textView2, TextView textView3, View view2, View view3, TextView textView4, TextView textView5, View view4, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.d = obj;
        this.c = textView;
        this.e = view;
        this.f = textView2;
        this.g = textView3;
        this.h = view2;
        this.i = view3;
        this.j = textView4;
        this.k = textView5;
        this.l = view4;
    }

    public p12(CardView cardView, LinearLayout linearLayout, ConstraintLayout constraintLayout, View view, ImageView imageView, ImageView imageView2, TextView textView, SofascoreRatingView sofascoreRatingView, ImageView imageView3, TextView textView2, TextView textView3) {
        this.a = 5;
        this.d = cardView;
        this.f = linearLayout;
        this.b = constraintLayout;
        this.e = view;
        this.g = imageView;
        this.h = imageView2;
        this.c = textView;
        this.i = sofascoreRatingView;
        this.j = imageView3;
        this.k = textView2;
        this.l = textView3;
    }

    public p12(FrameLayout frameLayout, View view, m8g m8gVar, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, m8g m8gVar2, ImageView imageView2, TextView textView3, m8g m8gVar3) {
        this.a = 7;
        this.h = frameLayout;
        this.d = view;
        this.e = m8gVar;
        this.f = imageView;
        this.c = textView;
        this.b = constraintLayout;
        this.g = textView2;
        this.i = m8gVar2;
        this.j = imageView2;
        this.k = textView3;
        this.l = m8gVar3;
    }

    public p12(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, LinearLayout linearLayout, ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView, FrameLayout frameLayout, v12 v12Var, v12 v12Var2, v12 v12Var3, v12 v12Var4, TextView textView) {
        this.a = 0;
        this.b = constraintLayout;
        this.d = imageButton;
        this.e = imageButton2;
        this.f = linearLayout;
        this.g = scrollInterceptorHorizontalScrollView;
        this.h = frameLayout;
        this.i = v12Var;
        this.j = v12Var2;
        this.k = v12Var3;
        this.l = v12Var4;
        this.c = textView;
    }

    public p12(ConstraintLayout constraintLayout, gh5 gh5Var, GraphicLarge graphicLarge, Group group, TypeHeaderView typeHeaderView, ComposeView composeView, LinearLayout linearLayout, SwitchView switchView, SegmentedButtonsView segmentedButtonsView, lqb lqbVar, gh5 gh5Var2, CricketWagonWheelGraphView cricketWagonWheelGraphView) {
        this.a = 2;
        this.b = constraintLayout;
        this.d = gh5Var;
        this.e = graphicLarge;
        this.g = group;
        this.h = typeHeaderView;
        this.f = linearLayout;
        this.i = switchView;
        this.j = segmentedButtonsView;
        this.k = lqbVar;
        this.l = gh5Var2;
        this.c = cricketWagonWheelGraphView;
    }
}
