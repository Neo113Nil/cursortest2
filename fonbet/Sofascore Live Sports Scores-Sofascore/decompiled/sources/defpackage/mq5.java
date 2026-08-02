package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mq5 extends g7 {
    @Override // defpackage.ysk
    public final Integer a(int i) {
        if (i == 1) {
            return Integer.valueOf(R.id.card_content);
        }
        if (i == 2 || i == 3) {
            return Integer.valueOf(R.id.darken_overlay);
        }
        return null;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return i == 1 || i == 2;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 11);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof Event) {
            return 0;
        }
        if (obj instanceof rq5) {
            return 1;
        }
        if (obj instanceof lq5) {
            return 2;
        }
        if (obj instanceof kq5) {
            return 3;
        }
        if (obj instanceof String) {
            return 5;
        }
        if (obj instanceof qq5) {
            return 6;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater from = LayoutInflater.from(this.b);
        int i2 = R.id.header_title;
        if (i == 0) {
            View inflate = from.inflate(R.layout.main_section_center_with_series, viewGroup, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            int i3 = R.id.first_1_inner;
            ImageView imageView = (ImageView) nq8.B(R.id.first_1_inner, inflate);
            if (imageView != null) {
                i3 = R.id.first_1_outer;
                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.first_1_outer, inflate);
                if (frameLayout != null) {
                    i3 = R.id.first_2_inner;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.first_2_inner, inflate);
                    if (imageView2 != null) {
                        i3 = R.id.first_2_outer;
                        FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.first_2_outer, inflate);
                        if (frameLayout2 != null) {
                            i3 = R.id.first_3_inner;
                            ImageView imageView3 = (ImageView) nq8.B(R.id.first_3_inner, inflate);
                            if (imageView3 != null) {
                                i3 = R.id.first_3_outer;
                                FrameLayout frameLayout3 = (FrameLayout) nq8.B(R.id.first_3_outer, inflate);
                                if (frameLayout3 != null) {
                                    TextView textView = (TextView) nq8.B(R.id.header_title, inflate);
                                    if (textView != null) {
                                        i2 = R.id.second_1_inner;
                                        ImageView imageView4 = (ImageView) nq8.B(R.id.second_1_inner, inflate);
                                        if (imageView4 != null) {
                                            i2 = R.id.second_1_outer;
                                            FrameLayout frameLayout4 = (FrameLayout) nq8.B(R.id.second_1_outer, inflate);
                                            if (frameLayout4 != null) {
                                                i2 = R.id.second_2_inner;
                                                ImageView imageView5 = (ImageView) nq8.B(R.id.second_2_inner, inflate);
                                                if (imageView5 != null) {
                                                    i2 = R.id.second_2_outer;
                                                    FrameLayout frameLayout5 = (FrameLayout) nq8.B(R.id.second_2_outer, inflate);
                                                    if (frameLayout5 != null) {
                                                        i2 = R.id.second_3_inner;
                                                        ImageView imageView6 = (ImageView) nq8.B(R.id.second_3_inner, inflate);
                                                        if (imageView6 != null) {
                                                            i2 = R.id.second_3_outer;
                                                            FrameLayout frameLayout6 = (FrameLayout) nq8.B(R.id.second_3_outer, inflate);
                                                            if (frameLayout6 != null) {
                                                                return new wh(new js2(constraintLayout, imageView, frameLayout, imageView2, frameLayout2, imageView3, frameLayout3, textView, imageView4, frameLayout4, imageView5, frameLayout5, imageView6, frameLayout6), (byte) 0);
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
                        }
                    }
                }
            }
            i2 = i3;
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        int i4 = R.id.center_guideline;
        if (i == 1) {
            View inflate2 = from.inflate(R.layout.best_of_5_view_row, viewGroup, false);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate2;
            if (((Guideline) nq8.B(R.id.center_guideline, inflate2)) != null) {
                i4 = R.id.current_game;
                TextView textView2 = (TextView) nq8.B(R.id.current_game, inflate2);
                if (textView2 != null) {
                    i4 = R.id.first_team_logo;
                    ImageView imageView7 = (ImageView) nq8.B(R.id.first_team_logo, inflate2);
                    if (imageView7 != null) {
                        i4 = R.id.first_team_score;
                        TextView textView3 = (TextView) nq8.B(R.id.first_team_score, inflate2);
                        if (textView3 != null) {
                            i4 = R.id.first_team_side;
                            View B = nq8.B(R.id.first_team_side, inflate2);
                            if (B != null) {
                                i4 = R.id.game_duration;
                                TextView textView4 = (TextView) nq8.B(R.id.game_duration, inflate2);
                                if (textView4 != null) {
                                    i4 = R.id.indicator;
                                    ImageView imageView8 = (ImageView) nq8.B(R.id.indicator, inflate2);
                                    if (imageView8 != null) {
                                        i4 = R.id.score_separator;
                                        TextView textView5 = (TextView) nq8.B(R.id.score_separator, inflate2);
                                        if (textView5 != null) {
                                            i4 = R.id.second_team_logo;
                                            ImageView imageView9 = (ImageView) nq8.B(R.id.second_team_logo, inflate2);
                                            if (imageView9 != null) {
                                                i4 = R.id.second_team_score;
                                                TextView textView6 = (TextView) nq8.B(R.id.second_team_score, inflate2);
                                                if (textView6 != null) {
                                                    i4 = R.id.second_team_side;
                                                    View B2 = nq8.B(R.id.second_team_side, inflate2);
                                                    if (B2 != null) {
                                                        i4 = R.id.start_time;
                                                        TextView textView7 = (TextView) nq8.B(R.id.start_time, inflate2);
                                                        if (textView7 != null) {
                                                            return new ja9(new xz0(constraintLayout2, textView2, imageView7, textView3, B, textView4, imageView8, textView5, imageView9, textView6, B2, textView7));
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
            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
            return null;
        }
        if (i == 2) {
            return new ld2(bu1.c(from, viewGroup), 1);
        }
        if (i == 3) {
            return new ld2(bu1.c(from, viewGroup), 0);
        }
        if (i == 5) {
            View inflate3 = from.inflate(R.layout.main_section_center_with_icon_card, viewGroup, false);
            ImageView imageView10 = (ImageView) nq8.B(R.id.header_icon, inflate3);
            if (imageView10 != null) {
                TextView textView8 = (TextView) nq8.B(R.id.header_title, inflate3);
                if (textView8 != null) {
                    return new ja9(new kqb((ConstraintLayout) inflate3, imageView10, textView8, 1));
                }
            } else {
                i2 = R.id.header_icon;
            }
            yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
            return null;
        }
        if (i != 6) {
            ilg.c();
            return null;
        }
        View inflate4 = from.inflate(R.layout.expected_lineups_row_view, viewGroup, false);
        if (((Guideline) nq8.B(R.id.center_guideline, inflate4)) != null) {
            i4 = R.id.first_player_image;
            ImageView imageView11 = (ImageView) nq8.B(R.id.first_player_image, inflate4);
            if (imageView11 != null) {
                i4 = R.id.first_player_name;
                TextView textView9 = (TextView) nq8.B(R.id.first_player_name, inflate4);
                if (textView9 != null) {
                    i4 = R.id.first_player_nickname;
                    TextView textView10 = (TextView) nq8.B(R.id.first_player_nickname, inflate4);
                    if (textView10 != null) {
                        i4 = R.id.first_player_role;
                        ImageView imageView12 = (ImageView) nq8.B(R.id.first_player_role, inflate4);
                        if (imageView12 != null) {
                            i4 = R.id.second_player_image;
                            ImageView imageView13 = (ImageView) nq8.B(R.id.second_player_image, inflate4);
                            if (imageView13 != null) {
                                i4 = R.id.second_player_name;
                                TextView textView11 = (TextView) nq8.B(R.id.second_player_name, inflate4);
                                if (textView11 != null) {
                                    i4 = R.id.second_player_nickname;
                                    TextView textView12 = (TextView) nq8.B(R.id.second_player_nickname, inflate4);
                                    if (textView12 != null) {
                                        i4 = R.id.second_player_role;
                                        ImageView imageView14 = (ImageView) nq8.B(R.id.second_player_role, inflate4);
                                        if (imageView14 != null) {
                                            return new pq5(new bv1((ConstraintLayout) inflate4, imageView11, textView9, textView10, imageView12, imageView13, textView11, textView12, imageView14));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i4)));
        return null;
    }
}
