package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.icu.text.DateTimePatternGenerator;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.model.ChatCountry;
import com.sofascore.model.Country;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.buzzer.BasketballTopStatistics;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import com.sofascore.model.buzzer.Race;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.RankingItem;
import com.sofascore.results.R;
import com.sofascore.results.buzzer.BuzzerActivity;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.historical.LeagueHistoricalDataActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.ranking.RankingsActivity;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ts1 extends v11 {
    public final /* synthetic */ int g;
    public final krk h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts1(View view, View view2, String str, int i) {
        super(view, view2, str);
        int i2;
        int i3;
        View view3;
        this.g = i;
        int i4 = R.id.unexpected_background;
        int i5 = R.id.second_team_logo;
        int i6 = R.id.team_logo;
        int i7 = R.id.player_name_text;
        int i8 = R.id.full_color;
        int i9 = R.id.overlay;
        switch (i) {
            case 1:
                view.getClass();
                view2.getClass();
                str.getClass();
                super(view, view2, str);
                int i10 = R.id.cup_round_label;
                TextView textView = (TextView) nq8.B(R.id.cup_round_label, view2);
                if (textView != null) {
                    View B = nq8.B(R.id.full_color, view2);
                    if (B != null) {
                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.overlay, view2);
                        if (frameLayout != null) {
                            ImageView imageView = (ImageView) nq8.B(R.id.team_logo, view2);
                            if (imageView != null) {
                                i10 = R.id.team_name_text;
                                TextView textView2 = (TextView) nq8.B(R.id.team_name_text, view2);
                                if (textView2 != null) {
                                    i10 = R.id.tournament_background;
                                    View B2 = nq8.B(R.id.tournament_background, view2);
                                    if (B2 != null) {
                                        ImageView imageView2 = (ImageView) nq8.B(R.id.tournament_logo, view2);
                                        if (imageView2 != null) {
                                            View B3 = nq8.B(R.id.unexpected_background, view2);
                                            if (B3 != null) {
                                                this.h = new bv1((ConstraintLayout) view2, textView, B, frameLayout, imageView, textView2, B2, imageView2, B3);
                                                return;
                                            }
                                            i8 = R.id.unexpected_background;
                                        } else {
                                            i8 = R.id.tournament_logo;
                                        }
                                    }
                                }
                            } else {
                                i8 = R.id.team_logo;
                            }
                        } else {
                            i8 = R.id.overlay;
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i8)));
                    throw null;
                }
                i8 = i10;
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i8)));
                throw null;
            case 2:
                view.getClass();
                view2.getClass();
                str.getClass();
                super(view, view2, str);
                ImageView imageView3 = (ImageView) nq8.B(R.id.first_team_logo, view2);
                if (imageView3 != null) {
                    View B4 = nq8.B(R.id.full_color, view2);
                    if (B4 != null) {
                        FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.overlay, view2);
                        if (frameLayout2 != null) {
                            ImageView imageView4 = (ImageView) nq8.B(R.id.player_image, view2);
                            if (imageView4 != null) {
                                TextView textView3 = (TextView) nq8.B(R.id.player_name_text, view2);
                                if (textView3 != null) {
                                    SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.player_rating_text, view2);
                                    if (sofascoreSmallRatingView != null) {
                                        ImageView imageView5 = (ImageView) nq8.B(R.id.second_team_logo, view2);
                                        if (imageView5 != null) {
                                            i5 = R.id.team_logos_holder;
                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.team_logos_holder, view2);
                                            if (linearLayout != null) {
                                                this.h = new bv1((ConstraintLayout) view2, imageView3, B4, frameLayout2, imageView4, textView3, sofascoreSmallRatingView, imageView5, linearLayout);
                                                return;
                                            }
                                        }
                                    } else {
                                        i5 = R.id.player_rating_text;
                                    }
                                } else {
                                    i5 = R.id.player_name_text;
                                }
                            } else {
                                i5 = R.id.player_image;
                            }
                        } else {
                            i5 = R.id.overlay;
                        }
                    } else {
                        i5 = R.id.full_color;
                    }
                } else {
                    i5 = R.id.first_team_logo;
                }
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i5)));
                throw null;
            case 3:
                view.getClass();
                view2.getClass();
                str.getClass();
                super(view, view2, str);
                ImageView imageView6 = (ImageView) nq8.B(R.id.from_team_logo, view2);
                if (imageView6 != null) {
                    View B5 = nq8.B(R.id.full_color, view2);
                    if (B5 != null) {
                        FrameLayout frameLayout3 = (FrameLayout) nq8.B(R.id.overlay, view2);
                        if (frameLayout3 != null) {
                            ImageView imageView7 = (ImageView) nq8.B(R.id.player_image, view2);
                            if (imageView7 != null) {
                                TextView textView4 = (TextView) nq8.B(R.id.player_name_text, view2);
                                if (textView4 != null) {
                                    i7 = R.id.to_team_logo;
                                    ImageView imageView8 = (ImageView) nq8.B(R.id.to_team_logo, view2);
                                    if (imageView8 != null) {
                                        i7 = R.id.transfer_background;
                                        View B6 = nq8.B(R.id.transfer_background, view2);
                                        if (B6 != null) {
                                            i7 = R.id.transfer_icon;
                                            ImageView imageView9 = (ImageView) nq8.B(R.id.transfer_icon, view2);
                                            if (imageView9 != null) {
                                                this.h = new bv1((ConstraintLayout) view2, imageView6, B5, frameLayout3, imageView7, textView4, imageView8, B6, imageView9);
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i7 = R.id.player_image;
                            }
                        } else {
                            i7 = R.id.overlay;
                        }
                    } else {
                        i7 = R.id.full_color;
                    }
                } else {
                    i7 = R.id.from_team_logo;
                }
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i7)));
                throw null;
            case 4:
                view.getClass();
                view2.getClass();
                str.getClass();
                super(view, view2, str);
                int i11 = R.id.drivers_holder;
                LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.drivers_holder, view2);
                if (linearLayout2 != null) {
                    i11 = R.id.formula_logo;
                    ImageView imageView10 = (ImageView) nq8.B(R.id.formula_logo, view2);
                    if (imageView10 != null) {
                        FrameLayout frameLayout4 = (FrameLayout) nq8.B(R.id.gradient, view2);
                        if (frameLayout4 != null) {
                            i11 = R.id.image;
                            ImageView imageView11 = (ImageView) nq8.B(R.id.image, view2);
                            if (imageView11 != null) {
                                int i12 = R.id.label;
                                TextView textView5 = (TextView) nq8.B(R.id.label, view2);
                                if (textView5 != null) {
                                    if (((ImageView) nq8.B(R.id.live_dot_animation, view2)) != null) {
                                        i11 = R.id.live_holder;
                                        LinearLayout linearLayout3 = (LinearLayout) nq8.B(R.id.live_holder, view2);
                                        if (linearLayout3 != null) {
                                            i12 = R.id.live_text;
                                            if (((TextView) nq8.B(R.id.live_text, view2)) != null) {
                                                FrameLayout frameLayout5 = (FrameLayout) nq8.B(R.id.overlay, view2);
                                                if (frameLayout5 != null) {
                                                    i2 = R.id.race_end_flag;
                                                    ImageView imageView12 = (ImageView) nq8.B(R.id.race_end_flag, view2);
                                                    if (imageView12 != null) {
                                                        FrameLayout frameLayout6 = (FrameLayout) nq8.B(R.id.ripple_holder, view2);
                                                        if (frameLayout6 != null) {
                                                            i2 = R.id.stage_name;
                                                            TextView textView6 = (TextView) nq8.B(R.id.stage_name, view2);
                                                            if (textView6 != null) {
                                                                i2 = R.id.sub_stage_text;
                                                                TextView textView7 = (TextView) nq8.B(R.id.sub_stage_text, view2);
                                                                if (textView7 != null) {
                                                                    this.h = new xz0((ConstraintLayout) view2, linearLayout2, imageView10, frameLayout4, imageView11, textView5, linearLayout3, frameLayout5, imageView12, frameLayout6, textView6, textView7);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            i2 = R.id.ripple_holder;
                                                        }
                                                    }
                                                } else {
                                                    i2 = R.id.overlay;
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = R.id.live_dot_animation;
                                    }
                                }
                                i2 = i12;
                            }
                        } else {
                            i2 = R.id.gradient;
                        }
                        yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i2)));
                        throw null;
                    }
                }
                i2 = i11;
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i2)));
                throw null;
            case 5:
                view.getClass();
                view2.getClass();
                str.getClass();
                super(view, view2, str);
                FrameLayout frameLayout7 = (FrameLayout) nq8.B(R.id.gradient, view2);
                if (frameLayout7 != null) {
                    ImageView imageView13 = (ImageView) nq8.B(R.id.image, view2);
                    if (imageView13 != null) {
                        TextView textView8 = (TextView) nq8.B(R.id.label, view2);
                        if (textView8 != null) {
                            FrameLayout frameLayout8 = (FrameLayout) nq8.B(R.id.overlay, view2);
                            if (frameLayout8 != null) {
                                FrameLayout frameLayout9 = (FrameLayout) nq8.B(R.id.ripple_holder, view2);
                                if (frameLayout9 != null) {
                                    i3 = R.id.text;
                                    TextView textView9 = (TextView) nq8.B(R.id.text, view2);
                                    if (textView9 != null) {
                                        this.h = new v82((ConstraintLayout) view2, frameLayout7, imageView13, textView8, frameLayout8, frameLayout9, textView9);
                                        return;
                                    }
                                } else {
                                    i3 = R.id.ripple_holder;
                                }
                            } else {
                                i3 = R.id.overlay;
                            }
                        } else {
                            i3 = R.id.label;
                        }
                    } else {
                        i3 = R.id.image;
                    }
                } else {
                    i3 = R.id.gradient;
                }
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i3)));
                throw null;
            case 6:
                view.getClass();
                view2.getClass();
                str.getClass();
                super(view, view2, str);
                View B7 = nq8.B(R.id.full_color, view2);
                if (B7 != null) {
                    TextView textView10 = (TextView) nq8.B(R.id.key_moment_text, view2);
                    if (textView10 != null) {
                        FrameLayout frameLayout10 = (FrameLayout) nq8.B(R.id.overlay, view2);
                        if (frameLayout10 != null) {
                            ImageView imageView14 = (ImageView) nq8.B(R.id.sport_logo, view2);
                            if (imageView14 != null) {
                                ImageView imageView15 = (ImageView) nq8.B(R.id.tournament_logo, view2);
                                if (imageView15 != null) {
                                    this.h = new z82((ConstraintLayout) view2, B7, textView10, frameLayout10, imageView14, imageView15, 0);
                                    return;
                                }
                                i8 = R.id.tournament_logo;
                            } else {
                                i8 = R.id.sport_logo;
                            }
                        } else {
                            i8 = R.id.overlay;
                        }
                    } else {
                        i8 = R.id.key_moment_text;
                    }
                }
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i8)));
                throw null;
            case 7:
                view.getClass();
                view2.getClass();
                str.getClass();
                super(view, view2, str);
                int i13 = R.id.background_image;
                ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.background_image, view2);
                if (shapeableImageView != null) {
                    i13 = R.id.fighter_gradient_away;
                    View B8 = nq8.B(R.id.fighter_gradient_away, view2);
                    if (B8 != null) {
                        i13 = R.id.fighter_gradient_home;
                        View B9 = nq8.B(R.id.fighter_gradient_home, view2);
                        if (B9 != null) {
                            i13 = R.id.fighter_image_away;
                            ImageView imageView16 = (ImageView) nq8.B(R.id.fighter_image_away, view2);
                            if (imageView16 != null) {
                                i13 = R.id.fighter_image_home;
                                ImageView imageView17 = (ImageView) nq8.B(R.id.fighter_image_home, view2);
                                if (imageView17 != null) {
                                    FrameLayout frameLayout11 = (FrameLayout) nq8.B(R.id.gradient, view2);
                                    if (frameLayout11 != null) {
                                        i13 = R.id.half_screen_guideline;
                                        if (((Guideline) nq8.B(R.id.half_screen_guideline, view2)) != null) {
                                            if (((ImageView) nq8.B(R.id.live_dot_animation, view2)) != null) {
                                                LinearLayout linearLayout4 = (LinearLayout) nq8.B(R.id.live_holder, view2);
                                                if (linearLayout4 == null) {
                                                    i9 = R.id.live_holder;
                                                } else if (((TextView) nq8.B(R.id.live_text, view2)) != null) {
                                                    i13 = R.id.organisation_logo;
                                                    ImageView imageView18 = (ImageView) nq8.B(R.id.organisation_logo, view2);
                                                    if (imageView18 != null) {
                                                        FrameLayout frameLayout12 = (FrameLayout) nq8.B(R.id.overlay, view2);
                                                        if (frameLayout12 != null) {
                                                            i9 = R.id.result_bubble;
                                                            TextView textView11 = (TextView) nq8.B(R.id.result_bubble, view2);
                                                            if (textView11 != null) {
                                                                i9 = R.id.result_bubble_half_guideline;
                                                                View B10 = nq8.B(R.id.result_bubble_half_guideline, view2);
                                                                if (B10 != null) {
                                                                    i9 = R.id.result_draw;
                                                                    TextView textView12 = (TextView) nq8.B(R.id.result_draw, view2);
                                                                    if (textView12 != null) {
                                                                        i9 = R.id.result_gradient;
                                                                        View B11 = nq8.B(R.id.result_gradient, view2);
                                                                        if (B11 != null) {
                                                                            i9 = R.id.result_group;
                                                                            Group group = (Group) nq8.B(R.id.result_group, view2);
                                                                            if (group != null) {
                                                                                i9 = R.id.result_win_type;
                                                                                TextView textView13 = (TextView) nq8.B(R.id.result_win_type, view2);
                                                                                if (textView13 != null) {
                                                                                    FrameLayout frameLayout13 = (FrameLayout) nq8.B(R.id.ripple_holder, view2);
                                                                                    if (frameLayout13 != null) {
                                                                                        i9 = R.id.text_status;
                                                                                        TextView textView14 = (TextView) nq8.B(R.id.text_status, view2);
                                                                                        if (textView14 != null) {
                                                                                            i9 = R.id.text_vs;
                                                                                            TextView textView15 = (TextView) nq8.B(R.id.text_vs, view2);
                                                                                            if (textView15 != null) {
                                                                                                i9 = R.id.text_weight_class;
                                                                                                TextView textView16 = (TextView) nq8.B(R.id.text_weight_class, view2);
                                                                                                if (textView16 != null) {
                                                                                                    i9 = R.id.top_label_background;
                                                                                                    ImageView imageView19 = (ImageView) nq8.B(R.id.top_label_background, view2);
                                                                                                    if (imageView19 != null) {
                                                                                                        i9 = R.id.top_label_text;
                                                                                                        TextView textView17 = (TextView) nq8.B(R.id.top_label_text, view2);
                                                                                                        if (textView17 != null) {
                                                                                                            this.h = new b92((ConstraintLayout) view2, shapeableImageView, B8, B9, imageView16, imageView17, frameLayout11, linearLayout4, imageView18, frameLayout12, textView11, B10, textView12, B11, group, textView13, frameLayout13, textView14, textView15, textView16, imageView19, textView17);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i9 = R.id.ripple_holder;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i9 = R.id.live_text;
                                                }
                                            } else {
                                                i9 = R.id.live_dot_animation;
                                            }
                                        }
                                    } else {
                                        i9 = R.id.gradient;
                                    }
                                    yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i9)));
                                    throw null;
                                }
                            }
                        }
                    }
                }
                i9 = i13;
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i9)));
                throw null;
            case 8:
                view.getClass();
                view2.getClass();
                str.getClass();
                super(view, view2, str);
                View B12 = nq8.B(R.id.full_color, view2);
                if (B12 != null) {
                    i8 = R.id.new_ranking_text;
                    TextView textView18 = (TextView) nq8.B(R.id.new_ranking_text, view2);
                    if (textView18 != null) {
                        FrameLayout frameLayout14 = (FrameLayout) nq8.B(R.id.overlay, view2);
                        if (frameLayout14 != null) {
                            int i14 = R.id.ranking_diff_text;
                            TextView textView19 = (TextView) nq8.B(R.id.ranking_diff_text, view2);
                            if (textView19 != null) {
                                i14 = R.id.ranking_image;
                                ImageView imageView20 = (ImageView) nq8.B(R.id.ranking_image, view2);
                                if (imageView20 != null) {
                                    i14 = R.id.ranking_name_text;
                                    TextView textView20 = (TextView) nq8.B(R.id.ranking_name_text, view2);
                                    if (textView20 != null) {
                                        this.h = new v82((ConstraintLayout) view2, B12, textView18, frameLayout14, textView19, imageView20, textView20);
                                        return;
                                    }
                                }
                            }
                            view3 = view2;
                            i8 = i14;
                        } else {
                            view3 = view2;
                            i8 = R.id.overlay;
                        }
                        yhk.s("Missing required view with ID: ".concat(view3.getResources().getResourceName(i8)));
                        throw null;
                    }
                }
                view3 = view2;
                yhk.s("Missing required view with ID: ".concat(view3.getResources().getResourceName(i8)));
                throw null;
            case 9:
                view.getClass();
                view2.getClass();
                str.getClass();
                super(view, view2, str);
                FrameLayout frameLayout15 = (FrameLayout) nq8.B(R.id.ripple_holder, view2);
                if (frameLayout15 != null) {
                    this.h = new ed((ConstraintLayout) view2, 2, frameLayout15);
                    return;
                } else {
                    yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(R.id.ripple_holder)));
                    throw null;
                }
            case 10:
                str.getClass();
                super(view, view2, str);
                int i15 = R.id.analyst_logo;
                ImageView imageView21 = (ImageView) nq8.B(R.id.analyst_logo, view2);
                if (imageView21 != null) {
                    i15 = R.id.first_team_double_logo_1;
                    ImageView imageView22 = (ImageView) nq8.B(R.id.first_team_double_logo_1, view2);
                    if (imageView22 != null) {
                        i15 = R.id.first_team_double_logo_2;
                        ImageView imageView23 = (ImageView) nq8.B(R.id.first_team_double_logo_2, view2);
                        if (imageView23 != null) {
                            ImageView imageView24 = (ImageView) nq8.B(R.id.first_team_logo, view2);
                            if (imageView24 != null) {
                                i15 = R.id.first_team_penalties_result;
                                TextView textView21 = (TextView) nq8.B(R.id.first_team_penalties_result, view2);
                                if (textView21 != null) {
                                    View B13 = nq8.B(R.id.full_color, view2);
                                    if (B13 != null) {
                                        ImageView imageView25 = (ImageView) nq8.B(R.id.live_dot_animation, view2);
                                        if (imageView25 != null) {
                                            FrameLayout frameLayout16 = (FrameLayout) nq8.B(R.id.overlay, view2);
                                            if (frameLayout16 != null) {
                                                i15 = R.id.result_text;
                                                TextView textView22 = (TextView) nq8.B(R.id.result_text, view2);
                                                if (textView22 != null) {
                                                    i15 = R.id.second_team_double_logo_1;
                                                    ImageView imageView26 = (ImageView) nq8.B(R.id.second_team_double_logo_1, view2);
                                                    if (imageView26 != null) {
                                                        i15 = R.id.second_team_double_logo_2;
                                                        ImageView imageView27 = (ImageView) nq8.B(R.id.second_team_double_logo_2, view2);
                                                        if (imageView27 != null) {
                                                            ImageView imageView28 = (ImageView) nq8.B(R.id.second_team_logo, view2);
                                                            if (imageView28 != null) {
                                                                i15 = R.id.second_team_penalties_result;
                                                                TextView textView23 = (TextView) nq8.B(R.id.second_team_penalties_result, view2);
                                                                if (textView23 != null) {
                                                                    ImageView imageView29 = (ImageView) nq8.B(R.id.sport_logo, view2);
                                                                    if (imageView29 != null) {
                                                                        i15 = R.id.status_holder;
                                                                        LinearLayout linearLayout5 = (LinearLayout) nq8.B(R.id.status_holder, view2);
                                                                        if (linearLayout5 != null) {
                                                                            i15 = R.id.status_text;
                                                                            TextView textView24 = (TextView) nq8.B(R.id.status_text, view2);
                                                                            if (textView24 != null) {
                                                                                View B14 = nq8.B(R.id.unexpected_background, view2);
                                                                                if (B14 != null) {
                                                                                    i4 = R.id.upcoming_text;
                                                                                    TextView textView25 = (TextView) nq8.B(R.id.upcoming_text, view2);
                                                                                    if (textView25 != null) {
                                                                                        this.h = new f92((ConstraintLayout) view2, imageView21, imageView22, imageView23, imageView24, textView21, B13, imageView25, frameLayout16, textView22, imageView26, imageView27, imageView28, textView23, imageView29, linearLayout5, textView24, B14, textView25);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i4 = R.id.sport_logo;
                                                                    }
                                                                }
                                                            } else {
                                                                i4 = R.id.second_team_logo;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i4 = R.id.overlay;
                                            }
                                        } else {
                                            i4 = R.id.live_dot_animation;
                                        }
                                    } else {
                                        i4 = R.id.full_color;
                                    }
                                }
                            } else {
                                i4 = R.id.first_team_logo;
                            }
                            yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i4)));
                            throw null;
                        }
                    }
                }
                i4 = i15;
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i4)));
                throw null;
            default:
                view.getClass();
                view2.getClass();
                str.getClass();
                View B15 = nq8.B(R.id.full_color, view2);
                if (B15 != null) {
                    FrameLayout frameLayout17 = (FrameLayout) nq8.B(R.id.overlay, view2);
                    if (frameLayout17 != null) {
                        ImageView imageView30 = (ImageView) nq8.B(R.id.player_image, view2);
                        if (imageView30 != null) {
                            TextView textView26 = (TextView) nq8.B(R.id.player_name_text, view2);
                            if (textView26 != null) {
                                FrameLayout frameLayout18 = (FrameLayout) nq8.B(R.id.ripple_holder, view2);
                                if (frameLayout18 != null) {
                                    int i16 = R.id.stats_background;
                                    View B16 = nq8.B(R.id.stats_background, view2);
                                    if (B16 != null) {
                                        i16 = R.id.stats_text;
                                        TextView textView27 = (TextView) nq8.B(R.id.stats_text, view2);
                                        if (textView27 != null) {
                                            ImageView imageView31 = (ImageView) nq8.B(R.id.team_logo, view2);
                                            if (imageView31 != null) {
                                                this.h = new bv1((ConstraintLayout) view2, B15, frameLayout17, imageView30, textView26, frameLayout18, B16, textView27, imageView31);
                                                return;
                                            }
                                        }
                                    }
                                    i6 = i16;
                                } else {
                                    i6 = R.id.ripple_holder;
                                }
                            } else {
                                i6 = R.id.player_name_text;
                            }
                        } else {
                            i6 = R.id.player_image;
                        }
                    } else {
                        i6 = R.id.overlay;
                    }
                } else {
                    i6 = R.id.full_color;
                }
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i6)));
                throw null;
        }
    }

    public static String i(String str, String str2, Integer num) {
        if (num == null || num.intValue() <= 0) {
            return str;
        }
        if (str == null) {
            return num + " " + str2;
        }
        return str + "\n" + num + " " + str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0c64, code lost:
    
        if (r7 == null) goto L371;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x08f1  */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v111, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v115 */
    /* JADX WARN: Type inference failed for: r3v129 */
    @Override // defpackage.v11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj) {
        Boolean isHome;
        String description;
        Season season;
        TeamSides teamSides;
        ColorStateList colorStateList;
        Object a;
        Object obj2;
        xz0 xz0Var;
        Stage stageParent;
        String str;
        String string;
        int i;
        int i2;
        Object u2gVar;
        int intValue;
        String imageUrl;
        ts1 ts1Var;
        ts1 ts1Var2;
        View view;
        View view2;
        int i3;
        Context context;
        TextView textView;
        ?? r3;
        String str2;
        TeamSides teamSides2;
        String i4;
        int i5 = this.g;
        String str3 = "";
        Context context2 = this.b;
        krk krkVar = this.h;
        switch (i5) {
            case 0:
                APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj;
                aPIBuzzerTile.getClass();
                bv1 bv1Var = (bv1) krkVar;
                ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
                constraintLayout.setClipToOutline(true);
                Player player = aPIBuzzerTile.getPlayer();
                if (player != null) {
                    as9.l((ImageView) bv1Var.e, player.getId(), null);
                    Event event = aPIBuzzerTile.getEvent();
                    if (event != null && (isHome = aPIBuzzerTile.isHome()) != null) {
                        as9.o((ImageView) bv1Var.f, (isHome.booleanValue() ? event.getHomeTeam(TeamSides.ORIGINAL) : event.getAwayTeam(TeamSides.ORIGINAL)).getId());
                    }
                }
                BasketballTopStatistics topStatistics = aPIBuzzerTile.getTopStatistics();
                if (topStatistics != null) {
                    Integer points = topStatistics.getPoints();
                    String string2 = context2.getString(R.string.basketball_lineups_points);
                    string2.getClass();
                    String i6 = i(null, string2, points);
                    Integer rebounds = topStatistics.getRebounds();
                    String string3 = context2.getString(R.string.basketball_lineups_rebounds);
                    string3.getClass();
                    String i7 = i(i6, string3, rebounds);
                    Integer assists = topStatistics.getAssists();
                    String string4 = context2.getString(R.string.basketball_lineups_assists);
                    string4.getClass();
                    ((TextView) bv1Var.d).setText(i(i7, string4, assists));
                }
                aba.y((View) bv1Var.i, context2.getColor(R.color.n_lv_3), 2);
                constraintLayout.setOnClickListener(new cn(8, this, aPIBuzzerTile));
                break;
            case 1:
                APIBuzzerTile aPIBuzzerTile2 = (APIBuzzerTile) obj;
                aPIBuzzerTile2.getClass();
                bv1 bv1Var2 = (bv1) krkVar;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) bv1Var2.b;
                constraintLayout2.setClipToOutline(true);
                UniqueTournament uniqueTournament = aPIBuzzerTile2.getUniqueTournament();
                if (uniqueTournament != null) {
                    as9.q((ImageView) bv1Var2.f, Integer.valueOf(uniqueTournament.getId()), 0, null);
                }
                Team winningTeam = aPIBuzzerTile2.getWinningTeam();
                if (winningTeam != null) {
                    as9.o((ImageView) bv1Var2.e, winningTeam.getId());
                    ((TextView) bv1Var2.d).setText(tba.A(context2, winningTeam));
                    CupTreeRound nextCupRound = aPIBuzzerTile2.getNextCupRound();
                    if (nextCupRound != null) {
                        int type = nextCupRound.getType();
                        UniqueTournament uniqueTournament2 = aPIBuzzerTile2.getUniqueTournament();
                        Integer valueOf = uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null;
                        Event event2 = aPIBuzzerTile2.getEvent();
                        String d = v02.d(context2, type, valueOf, (event2 == null || (season = event2.getSeason()) == null) ? null : season.getName());
                        if ((d == null || d.length() == 0) && (description = nextCupRound.getDescription()) != null) {
                            Regex regex = d7g.a;
                            Team team = aPIBuzzerTile2.getTeam();
                            d = d7g.c(context2, description, team != null ? team.getSportSlug() : null);
                        }
                        ((TextView) bv1Var2.c).setText(d);
                    }
                }
                aba.y((View) bv1Var2.i, context2.getColor(R.color.n_lv_3), 2);
                constraintLayout2.setOnClickListener(new cn(22, this, aPIBuzzerTile2));
                break;
            case 2:
                APIBuzzerTile aPIBuzzerTile3 = (APIBuzzerTile) obj;
                aPIBuzzerTile3.getClass();
                bv1 bv1Var3 = (bv1) krkVar;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) bv1Var3.b;
                constraintLayout3.setClipToOutline(true);
                Player player2 = aPIBuzzerTile3.getPlayer();
                if (player2 != null) {
                    teamSides = null;
                    as9.l((ImageView) bv1Var3.f, player2.getId(), null);
                } else {
                    teamSides = null;
                }
                Event event3 = aPIBuzzerTile3.getEvent();
                if (event3 != null) {
                    as9.o((ImageView) bv1Var3.e, Event.getHomeTeam$default(event3, teamSides, 1, teamSides).getId());
                    as9.o((ImageView) bv1Var3.i, Event.getAwayTeam$default(event3, teamSides, 1, teamSides).getId());
                }
                Double rating = aPIBuzzerTile3.getRating();
                if (rating != null) {
                    SofascoreSmallRatingView.k((SofascoreSmallRatingView) bv1Var3.h, Double.valueOf(rating.doubleValue()), 6);
                }
                aba.y((View) bv1Var3.d, context2.getColor(R.color.n_lv_3), 2);
                constraintLayout3.setOnClickListener(new au7(6, this, aPIBuzzerTile3));
                break;
            case 3:
                APIBuzzerTile aPIBuzzerTile4 = (APIBuzzerTile) obj;
                Integer valueOf2 = Integer.valueOf(R.drawable.ic_no_team);
                aPIBuzzerTile4.getClass();
                bv1 bv1Var4 = (bv1) krkVar;
                ConstraintLayout constraintLayout4 = (ConstraintLayout) bv1Var4.b;
                ImageView imageView = (ImageView) bv1Var4.e;
                constraintLayout4.setClipToOutline(true);
                Transfer transfer = aPIBuzzerTile4.getTransfer();
                if (transfer != null) {
                    Player player3 = transfer.getPlayer();
                    if (player3 != null) {
                        colorStateList = null;
                        as9.l((ImageView) bv1Var4.f, player3.getId(), null);
                    } else {
                        colorStateList = null;
                    }
                    Team transferFrom = transfer.getTransferFrom();
                    if (transferFrom != null) {
                        if (!Intrinsics.c(transferFrom.getName(), "No team")) {
                            imageView.setImageTintList(colorStateList);
                            as9.o(imageView, transferFrom.getId());
                            a = Unit.a;
                            break;
                        } else {
                            imageView.setImageTintList(ColorStateList.valueOf(context2.getColor(R.color.on_color_primary)));
                            apf a2 = ajh.a(imageView.getContext());
                            ht9 ht9Var = new ht9(imageView.getContext());
                            ht9Var.c = valueOf2;
                            vt9.f(ht9Var, imageView);
                            a = a2.a(ht9Var.a());
                            break;
                        }
                    }
                    imageView.setImageTintList(ColorStateList.valueOf(context2.getColor(R.color.on_color_primary)));
                    apf a3 = ajh.a(imageView.getContext());
                    ht9 ht9Var2 = new ht9(imageView.getContext());
                    ht9Var2.c = valueOf2;
                    fc6.w(ht9Var2, imageView, a3);
                    Team transferTo = transfer.getTransferTo();
                    if (transferTo != null) {
                        as9.o((ImageView) bv1Var4.i, transferTo.getId());
                    }
                }
                aba.y((View) bv1Var4.d, context2.getColor(R.color.n_lv_3), 2);
                constraintLayout4.setOnClickListener(new au7(7, this, aPIBuzzerTile4));
                break;
            case 4:
                APIBuzzerTile aPIBuzzerTile5 = (APIBuzzerTile) obj;
                aPIBuzzerTile5.getClass();
                xz0 xz0Var2 = (xz0) krkVar;
                ((ConstraintLayout) xz0Var2.g).setClipToOutline(true);
                TextView textView2 = xz0Var2.b;
                textView2.setVisibility(8);
                TextView textView3 = xz0Var2.d;
                textView3.setVisibility(8);
                TextView textView4 = xz0Var2.e;
                textView4.setVisibility(8);
                LinearLayout linearLayout = (LinearLayout) xz0Var2.h;
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = (LinearLayout) xz0Var2.i;
                linearLayout2.setVisibility(8);
                ImageView imageView2 = (ImageView) xz0Var2.l;
                imageView2.setVisibility(8);
                linearLayout.removeAllViews();
                Team polePositionWinner = aPIBuzzerTile5.getPolePositionWinner();
                String str4 = this.d;
                if (polePositionWinner != null) {
                    obj2 = StatusKt.STATUS_IN_PROGRESS;
                    x82 x82Var = new x82(context2, Intrinsics.c(str4, "buzzer_feed"));
                    x82Var.j(polePositionWinner, true, 1);
                    linearLayout.addView(x82Var);
                } else {
                    obj2 = StatusKt.STATUS_IN_PROGRESS;
                }
                Race race = aPIBuzzerTile5.getRace();
                if (race != null) {
                    Stage stage = race.getStage();
                    if (stage == null || (stageParent = stage.getStageParent()) == null) {
                        xz0Var = xz0Var2;
                    } else {
                        textView3.setText(stageParent.getDescription());
                        ImageView imageView3 = (ImageView) xz0Var2.f;
                        xz0Var = xz0Var2;
                        String j = vxd.j(stageParent.getId(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "stage/", "/buzzer-background-image");
                        apf a4 = ajh.a(imageView3.getContext());
                        ht9 ht9Var3 = new ht9(imageView3.getContext());
                        ht9Var3.c = j;
                        vt9.f(ht9Var3, imageView3);
                        a4.a(ht9Var3.a());
                        Status status = stage.getStatus();
                        if (status != null) {
                            String type2 = status.getType();
                            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                            layoutParams.getClass();
                            tl3 tl3Var = (tl3) layoutParams;
                            int hashCode = type2.hashCode();
                            if (hashCode != -1411655086) {
                                if (hashCode != -673660814) {
                                    if (hashCode == -500280754 && type2.equals(StatusKt.STATUS_NOT_STARTED)) {
                                        textView3.setVisibility(0);
                                        textView2.setVisibility(0);
                                        textView2.getBackground().mutate().setTintList(eq3.q(R.color.n_lv_3, context2));
                                        if (ug5.u(stage.getStartDateTimestamp())) {
                                            long startDateTimestamp = stage.getStartDateTimestamp();
                                            DateTimePatternGenerator b = hk4.b();
                                            String bestPattern = DateFormat.is24HourFormat(context2) ? b.getBestPattern("Hm") : b.getBestPattern("hm");
                                            bestPattern.getClass();
                                            string = fc6.i(startDateTimestamp, hk4.a(bestPattern));
                                        } else {
                                            string = ug5.v(stage.getStartDateTimestamp()) ? context2.getString(R.string.tomorrow) : "";
                                        }
                                        textView2.setText(string);
                                        ServerType type3 = stage.getType();
                                        if (type3 != null) {
                                            if (type3 == ServerType.RACE) {
                                                ((ViewGroup.MarginLayoutParams) tl3Var).bottomMargin = ao2.s(2, context2);
                                                linearLayout.setVisibility(0);
                                            } else {
                                                DayOfWeek dayOfWeek = hwc.a;
                                                textView4.setText(hwc.d(context2, stage.getDescription(), false));
                                                textView4.setVisibility(0);
                                            }
                                        }
                                    }
                                } else if (type2.equals(StatusKt.STATUS_FINISHED)) {
                                    linearLayout.removeAllViews();
                                    List<Team> standings = race.getStandings();
                                    if (standings != null) {
                                        int size = standings.size();
                                        int i8 = 3 > size ? size : 3;
                                        if (1 <= i8) {
                                            int i9 = 1;
                                            while (true) {
                                                Team team2 = standings.get(i9 - 1);
                                                x82 x82Var2 = new x82(context2, Intrinsics.c(str4, "buzzer_feed"));
                                                x82Var2.j(team2, false, i9);
                                                linearLayout.addView(x82Var2);
                                                if (i9 != i8) {
                                                    i9++;
                                                }
                                            }
                                        }
                                    }
                                    ((ViewGroup.MarginLayoutParams) tl3Var).bottomMargin = ao2.s(Intrinsics.c(str4, "buzzer_feed") ? 12 : 8, context2);
                                    linearLayout.setVisibility(0);
                                    imageView2.setVisibility(0);
                                }
                            } else if (type2.equals(obj2)) {
                                textView2.setVisibility(0);
                                v9g.K(textView2.getBackground().mutate(), context2.getColor(R.color.live));
                                ServerType type4 = stage.getType();
                                if (type4 != null) {
                                    if (type4 == ServerType.RACE) {
                                        Integer leadingLap = race.getLeadingLap();
                                        Integer valueOf3 = Integer.valueOf(leadingLap != null ? leadingLap.intValue() : 0);
                                        Integer laps = race.getLaps();
                                        textView2.setText(context2.getString(R.string.slash_template, valueOf3, Integer.valueOf(laps != null ? laps.intValue() : 0)));
                                    } else {
                                        joa joaVar = l5i.a;
                                        String description2 = stage.getDescription();
                                        description2.getClass();
                                        int hashCode2 = description2.hashCode();
                                        if (hashCode2 != -1811812806) {
                                            switch (hashCode2) {
                                                case -2118018528:
                                                    if (description2.equals("Qualification 1")) {
                                                        str = "Q1";
                                                        break;
                                                    }
                                                    str = "";
                                                    break;
                                                case -2118018527:
                                                    if (description2.equals("Qualification 2")) {
                                                        str = "Q2";
                                                        break;
                                                    }
                                                    str = "";
                                                    break;
                                                case -2118018526:
                                                    if (description2.equals("Qualification 3")) {
                                                        str = "Q3";
                                                        break;
                                                    }
                                                    str = "";
                                                    break;
                                                default:
                                                    str = "";
                                                    break;
                                            }
                                            textView2.setText(str);
                                        } else {
                                            if (description2.equals("Sprint")) {
                                                str = "SQ";
                                                textView2.setText(str);
                                            }
                                            str = "";
                                            textView2.setText(str);
                                        }
                                    }
                                }
                                textView3.setVisibility(0);
                                linearLayout2.setVisibility(0);
                            }
                        }
                    }
                    xz0Var2 = xz0Var;
                }
                ((FrameLayout) xz0Var2.m).setOnClickListener(new au7(8, this, aPIBuzzerTile5));
                break;
            case 5:
                APIBuzzerTile aPIBuzzerTile6 = (APIBuzzerTile) obj;
                aPIBuzzerTile6.getClass();
                v82 v82Var = (v82) krkVar;
                ConstraintLayout constraintLayout5 = (ConstraintLayout) v82Var.b;
                FrameLayout frameLayout = (FrameLayout) v82Var.f;
                FrameLayout frameLayout2 = (FrameLayout) v82Var.c;
                ImageView imageView4 = (ImageView) v82Var.d;
                constraintLayout5.setClipToOutline(true);
                String label = aPIBuzzerTile6.getLabel();
                TextView textView5 = (TextView) v82Var.e;
                if (label != null) {
                    textView5.setVisibility(0);
                    textView5.setText(label);
                } else {
                    textView5.setVisibility(8);
                }
                String labelBackground = aPIBuzzerTile6.getLabelBackground();
                if (labelBackground != null) {
                    try {
                        textView5.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(labelBackground)));
                    } catch (Exception unused) {
                        textView5.setBackgroundTintList(ColorStateList.valueOf(0));
                    }
                } else {
                    textView5.setBackgroundTintList(ColorStateList.valueOf(0));
                }
                ((TextView) v82Var.h).setText(aPIBuzzerTile6.getText());
                Integer overlay = aPIBuzzerTile6.getOverlay();
                if (overlay == null) {
                    i = 8;
                    frameLayout2.setVisibility(8);
                    frameLayout.setVisibility(8);
                    i2 = 0;
                } else {
                    i = 8;
                    if (overlay.intValue() == 2) {
                        i2 = 0;
                        frameLayout2.setVisibility(0);
                        frameLayout.setVisibility(8);
                    } else {
                        i2 = 0;
                        if (overlay.intValue() == 1) {
                            frameLayout2.setVisibility(8);
                            frameLayout.setVisibility(0);
                        }
                    }
                }
                if (aPIBuzzerTile6.getImageBackground() == null && aPIBuzzerTile6.getImageUrl() == null) {
                    imageView4.setVisibility(i);
                } else {
                    imageView4.setVisibility(i2);
                    String imageBackground = aPIBuzzerTile6.getImageBackground();
                    if (imageBackground != null) {
                        try {
                            p2g p2gVar = w2g.b;
                            u2gVar = Integer.valueOf(Color.parseColor(imageBackground));
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        Integer num = (Integer) (u2gVar instanceof u2g ? null : u2gVar);
                        if (num != null) {
                            intValue = num.intValue();
                            imageView4.setBackgroundColor(intValue);
                            imageUrl = aPIBuzzerTile6.getImageUrl();
                            if (imageUrl != null) {
                                if (StringsKt.J("https://" + uaa.c, "api.sofascore1.com/", false)) {
                                    yea yeaVar = j58.a;
                                    e58 f = e58.f();
                                    f.getClass();
                                    imageUrl = c.r(imageUrl, "sofascore.com", f.g("vpn_browser_host"), false);
                                }
                                apf a5 = ajh.a(imageView4.getContext());
                                ht9 ht9Var4 = new ht9(imageView4.getContext());
                                ht9Var4.c = imageUrl;
                                fc6.w(ht9Var4, imageView4, a5);
                            }
                        }
                    }
                    intValue = context2.getColor(R.color.primary_variant);
                    imageView4.setBackgroundColor(intValue);
                    imageUrl = aPIBuzzerTile6.getImageUrl();
                    if (imageUrl != null) {
                    }
                }
                ((FrameLayout) v82Var.g).setOnClickListener(new au7(10, this, aPIBuzzerTile6));
                break;
            case 6:
                APIBuzzerTile aPIBuzzerTile7 = (APIBuzzerTile) obj;
                aPIBuzzerTile7.getClass();
                z82 z82Var = (z82) krkVar;
                ConstraintLayout constraintLayout6 = (ConstraintLayout) z82Var.b;
                constraintLayout6.setClipToOutline(true);
                UniqueTournament uniqueTournament3 = aPIBuzzerTile7.getUniqueTournament();
                if (uniqueTournament3 != null) {
                    as9.q((ImageView) z82Var.g, Integer.valueOf(uniqueTournament3.getId()), 0, null);
                    ImageView imageView5 = (ImageView) z82Var.e;
                    Set set = wyh.a;
                    imageView5.setBackgroundResource(wyh.a(uniqueTournament3.getCategory().getSport().getSlug()));
                    ((TextView) z82Var.d).setText(aPIBuzzerTile7.getText());
                }
                aba.y((View) z82Var.f, context2.getColor(R.color.n_lv_3), 2);
                constraintLayout6.setOnClickListener(new au7(12, this, aPIBuzzerTile7));
                break;
            case 7:
                APIBuzzerTile aPIBuzzerTile8 = (APIBuzzerTile) obj;
                aPIBuzzerTile8.getClass();
                b92 b92Var = (b92) krkVar;
                ConstraintLayout constraintLayout7 = b92Var.a;
                TextView textView6 = b92Var.m;
                Group group = b92Var.o;
                TextView textView7 = b92Var.v;
                ImageView imageView6 = b92Var.u;
                TextView textView8 = b92Var.r;
                LinearLayout linearLayout3 = b92Var.h;
                ImageView imageView7 = b92Var.i;
                constraintLayout7.setClipToOutline(true);
                Event event4 = aPIBuzzerTile8.getEvent();
                MmaEvent mmaEvent = event4 instanceof MmaEvent ? (MmaEvent) event4 : null;
                if (mmaEvent != null) {
                    ShapeableImageView shapeableImageView = b92Var.b;
                    UniqueTournament uniqueTournament4 = mmaEvent.getTournament().getUniqueTournament();
                    String I = pco.I(mmaEvent.getTournament().getId(), Integer.valueOf(uniqueTournament4 != null ? uniqueTournament4.getId() : 0), hkg.b0(context2));
                    apf a6 = ajh.a(shapeableImageView.getContext());
                    ht9 ht9Var5 = new ht9(shapeableImageView.getContext());
                    ht9Var5.c = I;
                    vt9.f(ht9Var5, shapeableImageView);
                    awj[] awjVarArr = {new ty1(context2.getColor(R.color.surface_1), 25.0f, 1.5f)};
                    sl6 sl6Var = st9.a;
                    st9.b(ht9Var5, ph0.X(awjVarArr));
                    a6.a(ht9Var5.a());
                    UniqueTournament uniqueTournament5 = mmaEvent.getTournament().getUniqueTournament();
                    as9.q(imageView7, Integer.valueOf(uniqueTournament5 != null ? uniqueTournament5.getId() : 0), mmaEvent.getTournament().getId(), null);
                    as9.d(b92Var.f, Event.getHomeTeam$default(mmaEvent, null, 1, null).getId(), Event.getHomeTeam$default(mmaEvent, null, 1, null).getGender(), false);
                    as9.d(b92Var.e, Event.getAwayTeam$default(mmaEvent, null, 1, null).getId(), Event.getAwayTeam$default(mmaEvent, null, 1, null).getGender(), false);
                    linearLayout3.setVisibility(8);
                    textView8.setVisibility(8);
                    b92Var.t.setVisibility(8);
                    imageView6.setVisibility(8);
                    textView7.setVisibility(8);
                    group.setVisibility(8);
                    textView6.setVisibility(8);
                    if (Intrinsics.c(mmaEvent.getStatus().getType(), StatusKt.STATUS_FINISHED)) {
                        View view3 = b92Var.n;
                        TextView textView9 = b92Var.k;
                        ViewGroup.LayoutParams layoutParams2 = imageView7.getLayoutParams();
                        layoutParams2.getClass();
                        ((tl3) layoutParams2).t = 0;
                        TextView textView10 = b92Var.p;
                        String winType = mmaEvent.getWinType();
                        textView10.setText(winType != null ? winType : "");
                        Integer winnerCode$default = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                        if (winnerCode$default != null && winnerCode$default.intValue() == 1) {
                            group.setVisibility(0);
                            ViewGroup.LayoutParams layoutParams3 = textView9.getLayoutParams();
                            layoutParams3.getClass();
                            tl3 tl3Var2 = (tl3) layoutParams3;
                            tl3Var2.t = 0;
                            tl3Var2.setMarginStart(ao2.s(8, context2));
                            tl3Var2.v = -1;
                            tl3Var2.setMarginEnd(0);
                            ViewGroup.LayoutParams layoutParams4 = textView10.getLayoutParams();
                            layoutParams4.getClass();
                            tl3 tl3Var3 = (tl3) layoutParams4;
                            tl3Var3.s = textView9.getId();
                            tl3Var3.u = -1;
                            tl3Var3.setMarginStart(ao2.s(8, context2));
                            tl3Var3.setMarginEnd(ao2.s(8, context2));
                            ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                            layoutParams5.getClass();
                            tl3 tl3Var4 = (tl3) layoutParams5;
                            tl3Var4.t = R.id.result_bubble_half_guideline;
                            tl3Var4.v = -1;
                            view3.setScaleX(context2.getResources().getInteger(R.integer.drawable_scaleX_normal));
                        } else if (winnerCode$default != null && winnerCode$default.intValue() == 2) {
                            group.setVisibility(0);
                            ViewGroup.LayoutParams layoutParams6 = textView9.getLayoutParams();
                            layoutParams6.getClass();
                            tl3 tl3Var5 = (tl3) layoutParams6;
                            tl3Var5.v = 0;
                            tl3Var5.setMarginEnd(ao2.s(8, context2));
                            tl3Var5.t = -1;
                            tl3Var5.setMarginStart(0);
                            ViewGroup.LayoutParams layoutParams7 = textView10.getLayoutParams();
                            layoutParams7.getClass();
                            tl3 tl3Var6 = (tl3) layoutParams7;
                            tl3Var6.u = textView9.getId();
                            tl3Var6.s = -1;
                            tl3Var6.setMarginStart(ao2.s(8, context2));
                            tl3Var6.setMarginEnd(ao2.s(8, context2));
                            ViewGroup.LayoutParams layoutParams8 = view3.getLayoutParams();
                            layoutParams8.getClass();
                            tl3 tl3Var7 = (tl3) layoutParams8;
                            tl3Var7.t = -1;
                            tl3Var7.v = R.id.result_bubble_half_guideline;
                            view3.setScaleX(context2.getResources().getInteger(R.integer.drawable_scaleX_flipped));
                        } else if (winnerCode$default != null && winnerCode$default.intValue() == 3) {
                            textView6.setVisibility(0);
                            textView6.setText(context2.getString(R.string.draw));
                        } else if (winnerCode$default != null && winnerCode$default.intValue() == 4) {
                            textView6.setVisibility(0);
                            textView6.setText(context2.getString(R.string.no_contest_mma));
                        }
                        ts1Var = this;
                    } else if (Intrinsics.c(mmaEvent.getStatus().getType(), StatusKt.STATUS_NOT_STARTED)) {
                        ts1Var = this;
                        ts1Var.k(mmaEvent);
                    } else {
                        ts1Var = this;
                        if (Intrinsics.c(mmaEvent.getTournament().isLive(), Boolean.TRUE)) {
                            boolean c = Intrinsics.c(mmaEvent.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS);
                            linearLayout3.setVisibility(0);
                            textView8.setVisibility(0);
                            ViewGroup.LayoutParams layoutParams9 = imageView7.getLayoutParams();
                            layoutParams9.getClass();
                            ((tl3) layoutParams9).t = -1;
                            Integer finalRound = mmaEvent.getFinalRound();
                            textView7.setText(context2.getString(R.string.mma_status_round_short, Integer.valueOf(finalRound != null ? finalRound.intValue() : 1)));
                            textView7.setVisibility(0);
                            imageView6.setVisibility(0);
                            imageView6.setBackgroundTintList(ColorStateList.valueOf(context2.getColor(R.color.live)));
                            textView8.setText(context2.getString(c ? R.string.in_progress : R.string.next_fight_mma));
                        } else {
                            ts1Var.k(mmaEvent);
                        }
                    }
                    constraintLayout7.requestLayout();
                    b92Var.q.setOnClickListener(new au7(26, ts1Var, aPIBuzzerTile8));
                    break;
                }
                break;
            case 8:
                APIBuzzerTile aPIBuzzerTile9 = (APIBuzzerTile) obj;
                aPIBuzzerTile9.getClass();
                v82 v82Var2 = (v82) krkVar;
                ConstraintLayout constraintLayout8 = (ConstraintLayout) v82Var2.b;
                constraintLayout8.setClipToOutline(true);
                RankingItem ranking = aPIBuzzerTile9.getRanking();
                if (ranking != null) {
                    Team team3 = ranking.getTeam();
                    if (team3 != null) {
                        as9.o((ImageView) v82Var2.d, team3.getId());
                    }
                    String reason = aPIBuzzerTile9.getReason();
                    if (reason != null) {
                        int hashCode3 = reason.hashCode();
                        if (hashCode3 != -1717547201) {
                            if (hashCode3 != -328204946) {
                                if (hashCode3 == -162298312 && reason.equals(BuzzerConfigResponseKt.ATP_SINGLES_RANKING_CHANGE)) {
                                    str3 = "atp";
                                }
                            } else if (reason.equals(BuzzerConfigResponseKt.FIFA_RANKING_CHANGE)) {
                                str3 = "FIFA";
                            }
                        } else if (reason.equals(BuzzerConfigResponseKt.WTA_SINGLES_RANKING_CHANGE)) {
                            str3 = "wta";
                        }
                    }
                    me4.s(new Object[]{str3, Integer.valueOf(ranking.getRanking())}, 2, dla.d(), "%s %d", (TextView) v82Var2.e);
                    ((TextView) v82Var2.f).setText(String.valueOf(ranking.getPreviousRanking() - ranking.getRanking()));
                }
                aba.y((View) v82Var2.h, context2.getColor(R.color.n_lv_3), 2);
                constraintLayout8.setOnClickListener(new eyd(14, this, aPIBuzzerTile9));
                break;
            case 9:
                o82 o82Var = (o82) obj;
                o82Var.getClass();
                ed edVar = (ed) krkVar;
                ((ConstraintLayout) edVar.b).setClipToOutline(true);
                ((FrameLayout) edVar.c).setOnClickListener(new eyd(17, this, o82Var));
                break;
            default:
                APIBuzzerTile aPIBuzzerTile10 = (APIBuzzerTile) obj;
                aPIBuzzerTile10.getClass();
                f92 f92Var = (f92) krkVar;
                ConstraintLayout constraintLayout9 = f92Var.b;
                View view4 = f92Var.t;
                ImageView imageView8 = f92Var.j;
                ImageView imageView9 = (ImageView) f92Var.n;
                ImageView imageView10 = (ImageView) f92Var.q;
                ImageView imageView11 = (ImageView) f92Var.m;
                ImageView imageView12 = (ImageView) f92Var.p;
                ImageView imageView13 = (ImageView) f92Var.o;
                ImageView imageView14 = (ImageView) f92Var.l;
                ImageView imageView15 = (ImageView) f92Var.k;
                TextView textView11 = f92Var.h;
                TextView textView12 = f92Var.i;
                LinearLayout linearLayout4 = (LinearLayout) f92Var.g;
                TextView textView13 = f92Var.e;
                constraintLayout9.setClipToOutline(true);
                View view5 = f92Var.s;
                view5.setBackgroundColor(context2.getColor(R.color.primary_variant));
                Event event5 = aPIBuzzerTile10.getEvent();
                if (event5 != null) {
                    boolean F = ok3.F(event5);
                    view = view5;
                    imageView15.setVisibility(F ? 0 : 8);
                    imageView14.setVisibility(F ? 0 : 8);
                    imageView13.setVisibility(F ? 0 : 8);
                    imageView12.setVisibility(F ? 0 : 8);
                    imageView11.setVisibility(!F ? 0 : 8);
                    imageView10.setVisibility(!F ? 0 : 8);
                    if (F) {
                        context = context2;
                        SubTeam subTeam1 = Event.getHomeTeam$default(event5, null, 1, null).getSubTeam1();
                        as9.o(imageView15, yid.m(subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null));
                        SubTeam subTeam2 = Event.getHomeTeam$default(event5, null, 1, null).getSubTeam2();
                        as9.o(imageView14, yid.m(subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null));
                        SubTeam subTeam12 = Event.getAwayTeam$default(event5, null, 1, null).getSubTeam1();
                        as9.o(imageView13, yid.m(subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null));
                        SubTeam subTeam22 = Event.getAwayTeam$default(event5, null, 1, null).getSubTeam2();
                        as9.o(imageView12, yid.m(subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null));
                    } else {
                        context = context2;
                        as9.o(imageView11, Event.getHomeTeam$default(event5, null, 1, null).getId());
                        as9.o(imageView10, Event.getAwayTeam$default(event5, null, 1, null).getId());
                    }
                    ImageView imageView16 = (ImageView) f92Var.r;
                    Set set2 = wyh.a;
                    imageView16.setBackgroundResource(wyh.a(event5.getTournament().getCategory().getSport().getSlug()));
                    textView12.setVisibility(8);
                    textView13.setVisibility(8);
                    linearLayout4.setVisibility(8);
                    imageView9.setVisibility(8);
                    imageView8.setVisibility(8);
                    boolean z = (Event.getHomeScore$default(event5, null, 1, null).getPenalties() == null || Event.getAwayScore$default(event5, null, 1, null).getPenalties() == null) ? false : true;
                    String statusType = event5.getStatusType();
                    int hashCode4 = statusType.hashCode();
                    if (hashCode4 == -1661628965) {
                        ts1Var2 = this;
                        textView = textView11;
                        context2 = context;
                        r3 = 1;
                        if (statusType.equals(StatusKt.STATUS_SUSPENDED)) {
                            Score homeScore$default = Event.getHomeScore$default(event5, null, 1, null);
                            Score awayScore$default = Event.getAwayScore$default(event5, null, 1, null);
                            ts1Var2.l(z, homeScore$default.getPenalties(), awayScore$default.getPenalties());
                            textView13.setVisibility(0);
                            if (homeScore$default.getDisplay() == null || awayScore$default.getDisplay() == null) {
                                str2 = "-";
                            } else {
                                Locale d2 = dla.d();
                                String string5 = context2.getString(R.string.score_template);
                                string5.getClass();
                                str2 = String.format(d2, string5, Arrays.copyOf(new Object[]{homeScore$default.getDisplay(), awayScore$default.getDisplay()}, 2));
                            }
                            textView13.setText(str2);
                            linearLayout4.setVisibility(0);
                            textView.setText(afi.c(context2, event5.getStatusDescription(), ok3.s(event5), true));
                            view2 = view4;
                            view2.setVisibility(8);
                        } else {
                            teamSides2 = null;
                            ts1Var2.l(z, Event.getHomeScore$default(event5, teamSides2, r3, teamSides2).getPenalties(), Event.getAwayScore$default(event5, teamSides2, r3, teamSides2).getPenalties());
                            textView13.setVisibility(0);
                            Locale d3 = dla.d();
                            String string6 = context2.getString(R.string.score_template);
                            string6.getClass();
                            me4.s(new Object[]{Integer.valueOf(yid.m(Event.getHomeScore$default(event5, teamSides2, r3, teamSides2).getDisplay())), Integer.valueOf(yid.m(Event.getAwayScore$default(event5, teamSides2, r3, teamSides2).getDisplay()))}, 2, d3, string6, textView13);
                            linearLayout4.setVisibility(0);
                            textView.setText(afi.c(context2, event5.getStatusDescription(), ok3.s(event5), r3));
                            view2 = view4;
                            view2.setVisibility(8);
                        }
                    } else if (hashCode4 == -1411655086) {
                        ts1Var2 = this;
                        context2 = context;
                        if (statusType.equals(StatusKt.STATUS_IN_PROGRESS)) {
                            ts1Var2.l(z, Event.getHomeScore$default(event5, null, 1, null).getPenalties(), Event.getAwayScore$default(event5, null, 1, null).getPenalties());
                            textView13.setVisibility(0);
                            Locale d4 = dla.d();
                            String string7 = context2.getString(R.string.score_template);
                            string7.getClass();
                            me4.s(new Object[]{Integer.valueOf(yid.m(Event.getHomeScore$default(event5, null, 1, null).getDisplay())), Integer.valueOf(yid.m(Event.getAwayScore$default(event5, null, 1, null).getDisplay()))}, 2, d4, string7, textView13);
                            linearLayout4.setVisibility(0);
                            imageView9.setVisibility(0);
                            textView11.setText(afi.c(context2, event5.getStatusDescription(), ok3.s(event5), true));
                            view2 = view4;
                            view2.setVisibility(8);
                        } else {
                            textView = textView11;
                            teamSides2 = null;
                            r3 = 1;
                            ts1Var2.l(z, Event.getHomeScore$default(event5, teamSides2, r3, teamSides2).getPenalties(), Event.getAwayScore$default(event5, teamSides2, r3, teamSides2).getPenalties());
                            textView13.setVisibility(0);
                            Locale d32 = dla.d();
                            String string62 = context2.getString(R.string.score_template);
                            string62.getClass();
                            me4.s(new Object[]{Integer.valueOf(yid.m(Event.getHomeScore$default(event5, teamSides2, r3, teamSides2).getDisplay())), Integer.valueOf(yid.m(Event.getAwayScore$default(event5, teamSides2, r3, teamSides2).getDisplay()))}, 2, d32, string62, textView13);
                            linearLayout4.setVisibility(0);
                            textView.setText(afi.c(context2, event5.getStatusDescription(), ok3.s(event5), r3));
                            view2 = view4;
                            view2.setVisibility(8);
                        }
                    } else if (hashCode4 == -500280754 && statusType.equals(StatusKt.STATUS_NOT_STARTED)) {
                        ts1Var2 = this;
                        ts1Var2.l(false, null, null);
                        long startTimestamp = event5.getStartTimestamp();
                        if (ug5.u(startTimestamp)) {
                            context2 = context;
                            i4 = context2.getString(R.string.today);
                        } else {
                            context2 = context;
                            if (ug5.v(startTimestamp)) {
                                i4 = context2.getString(R.string.tomorrow);
                            } else {
                                bi4 bi4Var = bi4.PATTERN_DMM;
                                ConcurrentHashMap concurrentHashMap = hk4.a;
                                i4 = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
                            }
                        }
                        i4.getClass();
                        DateTimePatternGenerator b2 = hk4.b();
                        String bestPattern2 = DateFormat.is24HourFormat(context2) ? b2.getBestPattern("Hm") : b2.getBestPattern("hm");
                        bestPattern2.getClass();
                        String format = hk4.a(bestPattern2).format(Instant.ofEpochSecond(startTimestamp));
                        format.getClass();
                        textView12.setVisibility(0);
                        textView12.setText(context2.getString(R.string.two_line_text_template, i4, format));
                        view2 = view4;
                        view2.setVisibility(8);
                    } else {
                        teamSides2 = null;
                        r3 = 1;
                        ts1Var2 = this;
                        textView = textView11;
                        context2 = context;
                        ts1Var2.l(z, Event.getHomeScore$default(event5, teamSides2, r3, teamSides2).getPenalties(), Event.getAwayScore$default(event5, teamSides2, r3, teamSides2).getPenalties());
                        textView13.setVisibility(0);
                        Locale d322 = dla.d();
                        String string622 = context2.getString(R.string.score_template);
                        string622.getClass();
                        me4.s(new Object[]{Integer.valueOf(yid.m(Event.getHomeScore$default(event5, teamSides2, r3, teamSides2).getDisplay())), Integer.valueOf(yid.m(Event.getAwayScore$default(event5, teamSides2, r3, teamSides2).getDisplay()))}, 2, d322, string622, textView13);
                        linearLayout4.setVisibility(0);
                        textView.setText(afi.c(context2, event5.getStatusDescription(), ok3.s(event5), r3));
                        view2 = view4;
                        view2.setVisibility(8);
                    }
                } else {
                    ts1Var2 = this;
                    view = view5;
                    view2 = view4;
                }
                View view6 = view;
                aba.y(view6, context2.getColor(R.color.n_lv_3), 2);
                constraintLayout9.setOnClickListener(new cn(4, ts1Var2, aPIBuzzerTile10));
                int action = aPIBuzzerTile10.getAction();
                j82[] j82VarArr = j82.a;
                if (action == 26) {
                    i3 = 0;
                    imageView8.setVisibility(0);
                    textView12.setVisibility(8);
                    textView13.setVisibility(8);
                    linearLayout4.setVisibility(8);
                    imageView9.setVisibility(8);
                    view6.setBackgroundColor(context2.getColor(R.color.brand_tertiary_default));
                } else {
                    i3 = 0;
                }
                Integer valueOf4 = Integer.valueOf(i3);
                if (!Intrinsics.c(aPIBuzzerTile10.getReason(), BuzzerConfigResponseKt.SURPRISE_EVENT_RESULT)) {
                    valueOf4 = null;
                }
                view2.setVisibility(valueOf4 != null ? valueOf4.intValue() : 8);
                aba.y(view6, context2.getColor(R.color.n_lv_3), 2);
                constraintLayout9.setOnClickListener(new eyd(29, ts1Var2, aPIBuzzerTile10));
                break;
        }
    }

    @Override // defpackage.v11
    public final void e(Object obj) {
        Player player;
        Integer winnerCode$default;
        int i = this.g;
        krk krkVar = this.h;
        Context context = this.b;
        switch (i) {
            case 0:
                APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj;
                aPIBuzzerTile.getClass();
                int s = ao2.s(12, context);
                int s2 = ao2.s(24, context);
                int s3 = ao2.s(64, context);
                bv1 bv1Var = (bv1) krkVar;
                ViewGroup.LayoutParams layoutParams = ((ImageView) bv1Var.e).getLayoutParams();
                layoutParams.getClass();
                tl3 tl3Var = (tl3) layoutParams;
                ((ViewGroup.MarginLayoutParams) tl3Var).width = s3;
                ((ViewGroup.MarginLayoutParams) tl3Var).height = s3;
                ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = s2;
                tl3Var.setMarginStart(s);
                int s4 = ao2.s(32, context);
                TextView textView = (TextView) bv1Var.d;
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                layoutParams2.getClass();
                ((tl3) layoutParams2).setMarginStart(s4);
                textView.setTextSize(1, 14.0f);
                TextView textView2 = (TextView) bv1Var.c;
                ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                layoutParams3.getClass();
                ((tl3) layoutParams3).setMargins(s, s, s, s);
                textView2.setTextSize(2, 14.0f);
                ViewGroup.LayoutParams layoutParams4 = ((ImageView) bv1Var.f).getLayoutParams();
                layoutParams4.getClass();
                tl3 tl3Var2 = (tl3) layoutParams4;
                ((ViewGroup.MarginLayoutParams) tl3Var2).width = s2;
                ((ViewGroup.MarginLayoutParams) tl3Var2).height = s2;
                Player player2 = aPIBuzzerTile.getPlayer();
                if (player2 != null) {
                    textView2.setText(tba.t(player2));
                    break;
                }
                break;
            case 1:
                ((APIBuzzerTile) obj).getClass();
                int s5 = ao2.s(56, context);
                bv1 bv1Var2 = (bv1) krkVar;
                ViewGroup.LayoutParams layoutParams5 = ((ImageView) bv1Var2.e).getLayoutParams();
                layoutParams5.getClass();
                tl3 tl3Var3 = (tl3) layoutParams5;
                ((ViewGroup.MarginLayoutParams) tl3Var3).width = s5;
                ((ViewGroup.MarginLayoutParams) tl3Var3).height = s5;
                int s6 = ao2.s(28, context);
                int s7 = ao2.s(30, context);
                ViewGroup.LayoutParams layoutParams6 = ((View) bv1Var2.h).getLayoutParams();
                layoutParams6.getClass();
                tl3 tl3Var4 = (tl3) layoutParams6;
                ((ViewGroup.MarginLayoutParams) tl3Var4).width = s6;
                ((ViewGroup.MarginLayoutParams) tl3Var4).height = s6;
                tl3Var4.setMarginEnd(s7);
                int s8 = ao2.s(24, context);
                ViewGroup.LayoutParams layoutParams7 = ((ImageView) bv1Var2.f).getLayoutParams();
                layoutParams7.getClass();
                tl3 tl3Var5 = (tl3) layoutParams7;
                ((ViewGroup.MarginLayoutParams) tl3Var5).width = s8;
                ((ViewGroup.MarginLayoutParams) tl3Var5).height = s8;
                int s9 = ao2.s(12, context);
                TextView textView3 = (TextView) bv1Var2.c;
                ViewGroup.LayoutParams layoutParams8 = textView3.getLayoutParams();
                layoutParams8.getClass();
                ((tl3) layoutParams8).setMargins(s9, s9, s9, s9);
                textView3.setTextSize(2, 12.0f);
                TextView textView4 = (TextView) bv1Var2.d;
                ViewGroup.LayoutParams layoutParams9 = textView4.getLayoutParams();
                layoutParams9.getClass();
                ((tl3) layoutParams9).setMargins(s9, s9, s9, s9);
                textView4.setTextSize(2, 14.0f);
                break;
            case 2:
                APIBuzzerTile aPIBuzzerTile2 = (APIBuzzerTile) obj;
                aPIBuzzerTile2.getClass();
                int s10 = ao2.s(12, context);
                int s11 = ao2.s(72, context);
                bv1 bv1Var3 = (bv1) krkVar;
                ViewGroup.LayoutParams layoutParams10 = ((ImageView) bv1Var3.f).getLayoutParams();
                layoutParams10.getClass();
                tl3 tl3Var6 = (tl3) layoutParams10;
                ((ViewGroup.MarginLayoutParams) tl3Var6).topMargin = s10;
                ((ViewGroup.MarginLayoutParams) tl3Var6).width = s11;
                ((ViewGroup.MarginLayoutParams) tl3Var6).height = s11;
                TextView textView5 = (TextView) bv1Var3.c;
                ViewGroup.LayoutParams layoutParams11 = textView5.getLayoutParams();
                layoutParams11.getClass();
                textView5.setTextSize(2, 14.0f);
                textView5.setMaxLines(2);
                ((tl3) layoutParams11).setMargins(s10, s10, s10, s10);
                Player player3 = aPIBuzzerTile2.getPlayer();
                if (player3 != null) {
                    textView5.setText(tba.t(player3));
                } else {
                    textView5.setText("");
                }
                ViewGroup.LayoutParams layoutParams12 = ((LinearLayout) bv1Var3.j).getLayoutParams();
                layoutParams12.getClass();
                ((tl3) layoutParams12).setMarginStart(s10);
                break;
            case 3:
                APIBuzzerTile aPIBuzzerTile3 = (APIBuzzerTile) obj;
                aPIBuzzerTile3.getClass();
                int s12 = ao2.s(64, context);
                bv1 bv1Var4 = (bv1) krkVar;
                ViewGroup.LayoutParams layoutParams13 = ((ImageView) bv1Var4.f).getLayoutParams();
                layoutParams13.getClass();
                tl3 tl3Var7 = (tl3) layoutParams13;
                ((ViewGroup.MarginLayoutParams) tl3Var7).width = s12;
                ((ViewGroup.MarginLayoutParams) tl3Var7).height = s12;
                ViewGroup.LayoutParams layoutParams14 = ((View) bv1Var4.h).getLayoutParams();
                layoutParams14.getClass();
                ((tl3) layoutParams14).setMarginStart(s12 / 2);
                int s13 = ao2.s(20, context);
                ViewGroup.LayoutParams layoutParams15 = ((ImageView) bv1Var4.e).getLayoutParams();
                layoutParams15.getClass();
                tl3 tl3Var8 = (tl3) layoutParams15;
                ((ViewGroup.MarginLayoutParams) tl3Var8).width = s13;
                ((ViewGroup.MarginLayoutParams) tl3Var8).height = s13;
                int s14 = ao2.s(24, context);
                ViewGroup.LayoutParams layoutParams16 = ((ImageView) bv1Var4.i).getLayoutParams();
                layoutParams16.getClass();
                tl3 tl3Var9 = (tl3) layoutParams16;
                ((ViewGroup.MarginLayoutParams) tl3Var9).width = s14;
                ((ViewGroup.MarginLayoutParams) tl3Var9).height = s14;
                ViewGroup.LayoutParams layoutParams17 = ((ImageView) bv1Var4.j).getLayoutParams();
                layoutParams17.getClass();
                tl3 tl3Var10 = (tl3) layoutParams17;
                ((ViewGroup.MarginLayoutParams) tl3Var10).width = s14;
                ((ViewGroup.MarginLayoutParams) tl3Var10).height = s14;
                int s15 = ao2.s(12, context);
                TextView textView6 = (TextView) bv1Var4.c;
                ViewGroup.LayoutParams layoutParams18 = textView6.getLayoutParams();
                layoutParams18.getClass();
                textView6.setTextSize(2, 14.0f);
                textView6.setMaxLines(2);
                ((tl3) layoutParams18).setMargins(s15, s15, s15, s15);
                Transfer transfer = aPIBuzzerTile3.getTransfer();
                if (transfer != null && (player = transfer.getPlayer()) != null) {
                    textView6.setText(tba.t(player));
                    break;
                } else {
                    textView6.setText("");
                    break;
                }
                break;
            case 4:
                ((APIBuzzerTile) obj).getClass();
                int s16 = ao2.s(8, context);
                int s17 = ao2.s(12, context);
                xz0 xz0Var = (xz0) krkVar;
                ViewGroup.LayoutParams layoutParams19 = xz0Var.c.getLayoutParams();
                layoutParams19.getClass();
                tl3 tl3Var11 = (tl3) layoutParams19;
                ((ViewGroup.MarginLayoutParams) tl3Var11).topMargin = s16;
                tl3Var11.setMarginEnd(s17);
                TextView textView7 = xz0Var.d;
                ViewGroup.LayoutParams layoutParams20 = textView7.getLayoutParams();
                layoutParams20.getClass();
                ((tl3) layoutParams20).setMargins(s17, s17, s17, s17);
                textView7.setTextSize(2, 14.0f);
                break;
            case 5:
                ((APIBuzzerTile) obj).getClass();
                int s18 = ao2.s(12, context);
                v82 v82Var = (v82) krkVar;
                ViewGroup.LayoutParams layoutParams21 = ((TextView) v82Var.e).getLayoutParams();
                layoutParams21.getClass();
                tl3 tl3Var12 = (tl3) layoutParams21;
                ((ViewGroup.MarginLayoutParams) tl3Var12).topMargin = s18;
                tl3Var12.setMarginEnd(s18);
                ViewGroup.LayoutParams layoutParams22 = ((TextView) v82Var.h).getLayoutParams();
                layoutParams22.getClass();
                ((tl3) layoutParams22).setMargins(s18, s18, s18, s18);
                break;
            case 6:
                ((APIBuzzerTile) obj).getClass();
                int s19 = ao2.s(12, context);
                int s20 = ao2.s(64, context);
                z82 z82Var = (z82) krkVar;
                ViewGroup.LayoutParams layoutParams23 = ((ImageView) z82Var.g).getLayoutParams();
                layoutParams23.getClass();
                tl3 tl3Var13 = (tl3) layoutParams23;
                ((ViewGroup.MarginLayoutParams) tl3Var13).width = s20;
                ((ViewGroup.MarginLayoutParams) tl3Var13).height = s20;
                tl3Var13.setMarginStart(s19);
                int s21 = ao2.s(16, context);
                int s22 = ao2.s(40, context);
                ViewGroup.LayoutParams layoutParams24 = ((ImageView) z82Var.e).getLayoutParams();
                layoutParams24.getClass();
                LinearLayout.LayoutParams layoutParams25 = (LinearLayout.LayoutParams) layoutParams24;
                layoutParams25.width = s22;
                layoutParams25.height = s22;
                layoutParams25.setMarginEnd(s21);
                TextView textView8 = (TextView) z82Var.d;
                ViewGroup.LayoutParams layoutParams26 = textView8.getLayoutParams();
                layoutParams26.getClass();
                ((tl3) layoutParams26).setMargins(s19, s19, s19, s19);
                textView8.setTextSize(2, 14.0f);
                break;
            case 7:
                APIBuzzerTile aPIBuzzerTile4 = (APIBuzzerTile) obj;
                aPIBuzzerTile4.getClass();
                b92 b92Var = (b92) krkVar;
                TextView textView9 = b92Var.t;
                textView9.setTextAppearance(R.style.BodyMedium);
                haa.E(textView9);
                TextView textView10 = b92Var.s;
                textView10.setTextAppearance(R.style.DisplaySmall);
                haa.E(textView10);
                ViewGroup.LayoutParams layoutParams27 = b92Var.i.getLayoutParams();
                layoutParams27.getClass();
                ((tl3) layoutParams27).setMarginEnd(ao2.s(12, context));
                ViewGroup.LayoutParams layoutParams28 = b92Var.r.getLayoutParams();
                layoutParams28.getClass();
                ((tl3) layoutParams28).setMarginStart(ao2.s(12, context));
                ViewGroup.LayoutParams layoutParams29 = b92Var.h.getLayoutParams();
                layoutParams29.getClass();
                tl3 tl3Var14 = (tl3) layoutParams29;
                tl3Var14.setMarginStart(ao2.s(12, context));
                ((ViewGroup.MarginLayoutParams) tl3Var14).bottomMargin = ao2.s(3, context);
                ViewGroup.LayoutParams layoutParams30 = b92Var.k.getLayoutParams();
                layoutParams30.getClass();
                tl3 tl3Var15 = (tl3) layoutParams30;
                Event event = aPIBuzzerTile4.getEvent();
                if (event == null || (winnerCode$default = Event.getWinnerCode$default(event, null, 1, null)) == null || winnerCode$default.intValue() != 1) {
                    tl3Var15.setMarginEnd(ao2.s(16, context));
                    ((ViewGroup.MarginLayoutParams) tl3Var15).bottomMargin = ao2.s(14, context);
                } else {
                    tl3Var15.setMarginStart(ao2.s(16, context));
                    ((ViewGroup.MarginLayoutParams) tl3Var15).bottomMargin = ao2.s(14, context);
                }
                ViewGroup.LayoutParams layoutParams31 = b92Var.f.getLayoutParams();
                layoutParams31.getClass();
                tl3 tl3Var16 = (tl3) layoutParams31;
                ((ViewGroup.MarginLayoutParams) tl3Var16).topMargin = ao2.s(42, context);
                ((ViewGroup.MarginLayoutParams) tl3Var16).height = ao2.s(56, context);
                ((ViewGroup.MarginLayoutParams) tl3Var16).width = ao2.s(56, context);
                ViewGroup.LayoutParams layoutParams32 = b92Var.e.getLayoutParams();
                layoutParams32.getClass();
                tl3 tl3Var17 = (tl3) layoutParams32;
                ((ViewGroup.MarginLayoutParams) tl3Var17).topMargin = ao2.s(42, context);
                ((ViewGroup.MarginLayoutParams) tl3Var17).height = ao2.s(56, context);
                ((ViewGroup.MarginLayoutParams) tl3Var17).width = ao2.s(56, context);
                break;
            case 8:
                APIBuzzerTile aPIBuzzerTile5 = (APIBuzzerTile) obj;
                aPIBuzzerTile5.getClass();
                int s23 = ao2.s(12, context);
                int s24 = ao2.s(36, context);
                int s25 = ao2.s(52, context);
                v82 v82Var2 = (v82) krkVar;
                ViewGroup.LayoutParams layoutParams33 = ((ImageView) v82Var2.d).getLayoutParams();
                layoutParams33.getClass();
                tl3 tl3Var18 = (tl3) layoutParams33;
                tl3Var18.setMarginStart(s23);
                ((ViewGroup.MarginLayoutParams) tl3Var18).topMargin = s24;
                ((ViewGroup.MarginLayoutParams) tl3Var18).width = s25;
                ((ViewGroup.MarginLayoutParams) tl3Var18).height = s25;
                TextView textView11 = (TextView) v82Var2.g;
                ViewGroup.LayoutParams layoutParams34 = textView11.getLayoutParams();
                layoutParams34.getClass();
                ((tl3) layoutParams34).setMargins(s23, s23, s23, s23);
                TextView textView12 = (TextView) v82Var2.e;
                ViewGroup.LayoutParams layoutParams35 = textView12.getLayoutParams();
                layoutParams35.getClass();
                ((tl3) layoutParams35).setMarginStart(s25 / 2);
                int s26 = ao2.s(4, context);
                TextView textView13 = (TextView) v82Var2.f;
                ViewGroup.LayoutParams layoutParams36 = textView13.getLayoutParams();
                layoutParams36.getClass();
                tl3 tl3Var19 = (tl3) layoutParams36;
                ((ViewGroup.MarginLayoutParams) tl3Var19).topMargin = s26;
                tl3Var19.setMarginEnd(s23);
                textView12.setTextSize(2, 14.0f);
                textView13.setTextSize(2, 14.0f);
                textView11.setTextSize(2, 14.0f);
                RankingItem ranking = aPIBuzzerTile5.getRanking();
                if (ranking != null) {
                    String rowName = ranking.getRowName();
                    if (rowName == null) {
                        Team team = ranking.getTeam();
                        if (team != null) {
                            textView11.setText(tba.p(context, team));
                            break;
                        }
                    } else {
                        textView11.setText(rowName);
                        break;
                    }
                }
                break;
            case 9:
                ((o82) obj).getClass();
                break;
            default:
                int s27 = ao2.s(88, context);
                f92 f92Var = (f92) krkVar;
                ViewGroup.LayoutParams layoutParams37 = ((ImageView) f92Var.r).getLayoutParams();
                layoutParams37.getClass();
                tl3 tl3Var20 = (tl3) layoutParams37;
                ((ViewGroup.MarginLayoutParams) tl3Var20).width = s27;
                ((ViewGroup.MarginLayoutParams) tl3Var20).height = s27;
                ((ViewGroup.MarginLayoutParams) tl3Var20).topMargin = 0;
                int s28 = ao2.s(16, context);
                int s29 = ao2.s(38, context);
                ViewGroup.LayoutParams layoutParams38 = ((ImageView) f92Var.m).getLayoutParams();
                layoutParams38.getClass();
                tl3 tl3Var21 = (tl3) layoutParams38;
                tl3Var21.setMarginStart(s28);
                ((ViewGroup.MarginLayoutParams) tl3Var21).topMargin = s29;
                ViewGroup.LayoutParams layoutParams39 = ((ImageView) f92Var.k).getLayoutParams();
                layoutParams39.getClass();
                tl3 tl3Var22 = (tl3) layoutParams39;
                tl3Var22.setMarginStart(s28);
                ((ViewGroup.MarginLayoutParams) tl3Var22).topMargin = s29;
                ViewGroup.LayoutParams layoutParams40 = ((ImageView) f92Var.q).getLayoutParams();
                layoutParams40.getClass();
                ((tl3) layoutParams40).setMarginEnd(s28);
                ViewGroup.LayoutParams layoutParams41 = ((ImageView) f92Var.o).getLayoutParams();
                layoutParams41.getClass();
                ((tl3) layoutParams41).setMarginEnd(s28);
                TextView textView14 = f92Var.i;
                textView14.setTextSize(2, 14.0f);
                TextView textView15 = f92Var.d;
                textView15.setTextSize(2, 14.0f);
                TextView textView16 = f92Var.f;
                textView16.setTextSize(2, 14.0f);
                TextView textView17 = f92Var.e;
                textView17.setTextSize(2, 22.0f);
                int s30 = ao2.s(12, context);
                ViewGroup.LayoutParams layoutParams42 = textView14.getLayoutParams();
                layoutParams42.getClass();
                ((tl3) layoutParams42).setMargins(s30, s30, s30, s30);
                ViewGroup.LayoutParams layoutParams43 = ((LinearLayout) f92Var.g).getLayoutParams();
                layoutParams43.getClass();
                tl3 tl3Var23 = (tl3) layoutParams43;
                tl3Var23.setMarginStart(s30);
                tl3Var23.setMarginEnd(s30);
                ViewGroup.LayoutParams layoutParams44 = textView15.getLayoutParams();
                layoutParams44.getClass();
                ((tl3) layoutParams44).setMarginStart(s30);
                ViewGroup.LayoutParams layoutParams45 = textView16.getLayoutParams();
                layoutParams45.getClass();
                ((tl3) layoutParams45).setMarginEnd(s30);
                ViewGroup.LayoutParams layoutParams46 = textView17.getLayoutParams();
                layoutParams46.getClass();
                tl3 tl3Var24 = (tl3) layoutParams46;
                tl3Var24.A = s30;
                tl3Var24.B = s30;
                ((ViewGroup.MarginLayoutParams) tl3Var24).bottomMargin = s30;
                break;
        }
    }

    @Override // defpackage.v11
    public final void f(Object obj) {
        Player player;
        Integer winnerCode$default;
        Team team;
        int i = this.g;
        Context context = this.b;
        krk krkVar = this.h;
        switch (i) {
            case 0:
                APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj;
                aPIBuzzerTile.getClass();
                Player player2 = aPIBuzzerTile.getPlayer();
                if (player2 != null) {
                    TextView textView = (TextView) ((bv1) krkVar).c;
                    String C = tba.C(player2);
                    if (C == null) {
                        C = tba.t(player2);
                    }
                    textView.setText(C);
                    break;
                }
                break;
            case 1:
                ((APIBuzzerTile) obj).getClass();
                break;
            case 2:
                APIBuzzerTile aPIBuzzerTile2 = (APIBuzzerTile) obj;
                aPIBuzzerTile2.getClass();
                Player player3 = aPIBuzzerTile2.getPlayer();
                TextView textView2 = (TextView) ((bv1) krkVar).c;
                if (player3 == null) {
                    textView2.setText("");
                    break;
                } else {
                    textView2.setText(tba.C(player3));
                    break;
                }
            case 3:
                APIBuzzerTile aPIBuzzerTile3 = (APIBuzzerTile) obj;
                TextView textView3 = (TextView) ((bv1) krkVar).c;
                aPIBuzzerTile3.getClass();
                Transfer transfer = aPIBuzzerTile3.getTransfer();
                if (transfer != null && (player = transfer.getPlayer()) != null) {
                    String C2 = tba.C(player);
                    if (C2 == null) {
                        C2 = tba.t(player);
                    }
                    textView3.setText(C2);
                    break;
                } else {
                    textView3.setText("");
                    break;
                }
            case 4:
                ((APIBuzzerTile) obj).getClass();
                break;
            case 5:
                APIBuzzerTile aPIBuzzerTile4 = (APIBuzzerTile) obj;
                aPIBuzzerTile4.getClass();
                ViewGroup.LayoutParams layoutParams = ((CardView) this.e.c).getLayoutParams();
                int s = ao2.s(112, context);
                if (aPIBuzzerTile4.getType() != 2) {
                    layoutParams.width = s;
                    break;
                } else {
                    layoutParams.width = (int) ((s * 4.0d) / 3.0d);
                    break;
                }
            case 6:
                ((APIBuzzerTile) obj).getClass();
                break;
            case 7:
                APIBuzzerTile aPIBuzzerTile5 = (APIBuzzerTile) obj;
                aPIBuzzerTile5.getClass();
                ViewGroup.LayoutParams layoutParams2 = ((b92) krkVar).k.getLayoutParams();
                layoutParams2.getClass();
                tl3 tl3Var = (tl3) layoutParams2;
                Event event = aPIBuzzerTile5.getEvent();
                if (event != null && (winnerCode$default = Event.getWinnerCode$default(event, null, 1, null)) != null && winnerCode$default.intValue() == 1) {
                    tl3Var.setMarginStart(ao2.s(8, context));
                    break;
                } else {
                    tl3Var.setMarginEnd(ao2.s(8, context));
                    break;
                }
                break;
            case 8:
                APIBuzzerTile aPIBuzzerTile6 = (APIBuzzerTile) obj;
                aPIBuzzerTile6.getClass();
                RankingItem ranking = aPIBuzzerTile6.getRanking();
                if (ranking != null && (team = ranking.getTeam()) != null) {
                    ((TextView) ((v82) krkVar).g).setText(tba.A(context, team));
                    break;
                }
                break;
            case 9:
                ((o82) obj).getClass();
                break;
        }
    }

    @Override // defpackage.v11
    public final void g(Context context, Object obj) {
        Event event;
        int id;
        UniqueTournament uniqueTournament;
        Event event2;
        String actionValue;
        String actionValue2;
        String actionValue3;
        Integer intOrNull;
        Integer intOrNull2;
        Team team;
        List split$default;
        List split$default2;
        UniqueTournament uniqueTournament2;
        String actionValue4;
        Team team2;
        String actionValue5;
        String actionValue6;
        r12 = null;
        Integer num = null;
        r12 = null;
        Integer num2 = null;
        switch (this.g) {
            case 0:
                APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile.getClass();
                int action = aPIBuzzerTile.getAction();
                j82[] j82VarArr = j82.a;
                if (action != 12 || (event = aPIBuzzerTile.getEvent()) == null) {
                    return;
                }
                Player player = aPIBuzzerTile.getPlayer();
                id = player != null ? player.getId() : 0;
                TeamSides teamSides = TeamSides.ORIGINAL;
                Integer valueOf = Intrinsics.c(aPIBuzzerTile.isHome(), Boolean.FALSE) ? null : Integer.valueOf(event.getHomeTeam(teamSides).getId());
                int intValue = valueOf != null ? valueOf.intValue() : event.getAwayTeam(teamSides).getId();
                wxf wxfVar = EventActivity.h0;
                wxf.B(context, event.getId(), null, Integer.valueOf(id), Integer.valueOf(intValue), null, 76);
                return;
            case 1:
                APIBuzzerTile aPIBuzzerTile2 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile2.getClass();
                int action2 = aPIBuzzerTile2.getAction();
                j82[] j82VarArr2 = j82.a;
                if (action2 != 5) {
                    if (aPIBuzzerTile2.getAction() != 8 || (uniqueTournament = aPIBuzzerTile2.getUniqueTournament()) == null) {
                        return;
                    }
                    a99.A(LeagueActivity.h0, context, Integer.valueOf(uniqueTournament.getId()), 0, null, null, null, null, 4088);
                    return;
                }
                String actionValue7 = aPIBuzzerTile2.getActionValue();
                if (actionValue7 != null) {
                    wxf wxfVar2 = EventActivity.h0;
                    wxf.B(context, Integer.parseInt(actionValue7), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    return;
                }
                return;
            case 2:
                APIBuzzerTile aPIBuzzerTile3 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile3.getClass();
                int action3 = aPIBuzzerTile3.getAction();
                j82[] j82VarArr3 = j82.a;
                if (action3 != 12 || (event2 = aPIBuzzerTile3.getEvent()) == null) {
                    return;
                }
                Player player2 = aPIBuzzerTile3.getPlayer();
                id = player2 != null ? player2.getId() : 0;
                TeamSides teamSides2 = TeamSides.ORIGINAL;
                Integer valueOf2 = Intrinsics.c(aPIBuzzerTile3.isHome(), Boolean.FALSE) ? null : Integer.valueOf(event2.getHomeTeam(teamSides2).getId());
                int intValue2 = valueOf2 != null ? valueOf2.intValue() : event2.getAwayTeam(teamSides2).getId();
                wxf wxfVar3 = EventActivity.h0;
                wxf.B(context, event2.getId(), null, Integer.valueOf(id), Integer.valueOf(intValue2), null, 76);
                return;
            case 3:
                APIBuzzerTile aPIBuzzerTile4 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile4.getClass();
                int action4 = aPIBuzzerTile4.getAction();
                j82[] j82VarArr4 = j82.a;
                if (action4 != 7 || (actionValue = aPIBuzzerTile4.getActionValue()) == null) {
                    return;
                }
                int i = PlayerActivity.Z;
                jle.q(context, Integer.parseInt(actionValue), 0, null, null, true, null, null, 472);
                return;
            case 4:
                APIBuzzerTile aPIBuzzerTile5 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile5.getClass();
                int action5 = aPIBuzzerTile5.getAction();
                j82[] j82VarArr5 = j82.a;
                if (action5 != 11 || (actionValue2 = aPIBuzzerTile5.getActionValue()) == null) {
                    return;
                }
                fff.i(StageDetailsActivity.T, context, Integer.parseInt(actionValue2));
                return;
            case 5:
                APIBuzzerTile aPIBuzzerTile6 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile6.getClass();
                int action6 = aPIBuzzerTile6.getAction();
                j82[] j82VarArr6 = j82.a;
                if (action6 == 2) {
                    boolean z = MainActivity.n0;
                    String actionValue8 = aPIBuzzerTile6.getActionValue();
                    Intent s = f8h.s(context, null);
                    s.putExtra("open_action", "open_main");
                    s.putExtra("sport_name", actionValue8);
                    context.startActivity(s);
                    return;
                }
                if (action6 == 4) {
                    bea.G(context, aPIBuzzerTile6.getActionValue());
                    return;
                }
                if (action6 == 5) {
                    String actionValue9 = aPIBuzzerTile6.getActionValue();
                    if (actionValue9 != null) {
                        wxf wxfVar4 = EventActivity.h0;
                        wxf.B(context, Integer.parseInt(actionValue9), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return;
                    }
                    return;
                }
                if (action6 == 6) {
                    int i2 = ke0.c;
                    ArrayList arrayList = dv3.a;
                    Country b = dv3.b(Integer.valueOf(i2));
                    if (b != null) {
                        ChatCountry chatCountry = new ChatCountry(i2, tv3.c(context, b.getName()));
                        int i3 = ChatActivity.Z;
                        uic.w(context, chatCountry, null, 60);
                        return;
                    }
                    return;
                }
                if (action6 == 7) {
                    String actionValue10 = aPIBuzzerTile6.getActionValue();
                    if (actionValue10 != null) {
                        int i4 = PlayerActivity.Z;
                        jle.q(context, Integer.parseInt(actionValue10), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                        return;
                    }
                    return;
                }
                if (action6 == 24) {
                    String actionValue11 = aPIBuzzerTile6.getActionValue();
                    if (actionValue11 != null) {
                        int i5 = PlayerActivity.Z;
                        jle.q(context, Integer.parseInt(actionValue11), 0, null, zxe.d, false, null, null, 488);
                        return;
                    }
                    return;
                }
                if (action6 == 8) {
                    String actionValue12 = aPIBuzzerTile6.getActionValue();
                    if (actionValue12 != null) {
                        a99.A(LeagueActivity.h0, context, Integer.valueOf(Integer.parseInt(actionValue12)), 0, null, null, null, null, 4088);
                        return;
                    }
                    return;
                }
                if (action6 == 11) {
                    String actionValue13 = aPIBuzzerTile6.getActionValue();
                    if (actionValue13 != null) {
                        fff.i(StageDetailsActivity.T, context, Integer.parseInt(actionValue13));
                        return;
                    }
                    return;
                }
                if (action6 == 12) {
                    String actionValue14 = aPIBuzzerTile6.getActionValue();
                    if (actionValue14 != null) {
                        split$default = StringsKt__StringsKt.split$default(actionValue14, new String[]{"-"}, false, 0, 6, null);
                        String str = split$default.size() == 2 ? actionValue14 : null;
                        if (str != null) {
                            split$default2 = StringsKt__StringsKt.split$default(str, new String[]{"-"}, false, 0, 6, null);
                            int parseInt = Integer.parseInt(StringsKt.l0((String) split$default2.get(0)).toString());
                            int parseInt2 = Integer.parseInt(StringsKt.l0((String) split$default2.get(1)).toString());
                            wxf wxfVar5 = EventActivity.h0;
                            wxf.B(context, parseInt, null, Integer.valueOf(parseInt2), null, null, 108);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (action6 == 13) {
                    String actionValue15 = aPIBuzzerTile6.getActionValue();
                    if (actionValue15 != null) {
                        int i6 = TeamActivity.Z;
                        jle.r(context, Integer.parseInt(actionValue15), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return;
                    }
                    return;
                }
                if (action6 == 14) {
                    RankingItem ranking = aPIBuzzerTile6.getRanking();
                    if (ranking != null && (team = ranking.getTeam()) != null) {
                        num2 = Integer.valueOf(team.getId());
                    }
                    String reason = aPIBuzzerTile6.getReason();
                    if (reason != null) {
                        int hashCode = reason.hashCode();
                        if (hashCode == -1717547201) {
                            if (reason.equals(BuzzerConfigResponseKt.WTA_SINGLES_RANKING_CHANGE)) {
                                int i7 = RankingsActivity.O;
                                jaa.N(context, jmf.c, num2);
                                return;
                            }
                            return;
                        }
                        if (hashCode == -328204946) {
                            if (reason.equals(BuzzerConfigResponseKt.FIFA_RANKING_CHANGE)) {
                                int i8 = RankingsActivity.O;
                                jaa.N(context, jmf.f, num2);
                                return;
                            }
                            return;
                        }
                        if (hashCode == -162298312 && reason.equals(BuzzerConfigResponseKt.ATP_SINGLES_RANKING_CHANGE)) {
                            int i9 = RankingsActivity.O;
                            jaa.N(context, jmf.b, num2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (action6 == 15) {
                    View inflate = LayoutInflater.from(context).inflate(R.layout.buzzer_social_dialog_layout, (ViewGroup) null, false);
                    inflate.getClass();
                    int i10 = R.id.dialog_image;
                    ImageView imageView = (ImageView) nq8.B(R.id.dialog_image, inflate);
                    if (imageView != null) {
                        i10 = R.id.dialog_text;
                        TextView textView = (TextView) nq8.B(R.id.dialog_text, inflate);
                        if (textView != null) {
                            i10 = R.id.dialog_title;
                            TextView textView2 = (TextView) nq8.B(R.id.dialog_title, inflate);
                            if (textView2 != null) {
                                gph gphVar = new gph(context, R.style.DialogStyle);
                                gphVar.setView(inflate);
                                textView2.setText(aPIBuzzerTile6.getText());
                                textView.setText(aPIBuzzerTile6.getIntroText());
                                String introImageUrl = aPIBuzzerTile6.getIntroImageUrl();
                                if (introImageUrl != null) {
                                    apf a = ajh.a(imageView.getContext());
                                    ht9 ht9Var = new ht9(imageView.getContext());
                                    ht9Var.c = introImageUrl;
                                    fc6.w(ht9Var, imageView, a);
                                    String string = StringsKt.J(introImageUrl, "facebook.com", false) ? context.getString(R.string.view_on_facebook) : StringsKt.J(introImageUrl, "instagram.com", false) ? context.getString(R.string.view_on_instagram) : StringsKt.J(introImageUrl, "twitter.com", false) ? context.getString(R.string.view_on_x) : context.getString(R.string.view_on_social_media);
                                    string.getClass();
                                    gphVar.setButton(-1, string, new h0(9, context, aPIBuzzerTile6));
                                } else {
                                    imageView.setVisibility(8);
                                }
                                gphVar.setButton(-3, context.getString(R.string.dismiss), new pr9(gphVar, 0));
                                gphVar.show();
                                return;
                            }
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                    return;
                }
                if (action6 == 21) {
                    int i11 = WeeklyChallengeActivity.O;
                    context.startActivity(new Intent(context, (Class<?>) WeeklyChallengeActivity.class));
                    return;
                }
                if (action6 == 22) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    SharedPreferences.Editor i12 = dmi.i(sharedPreferences, "PREF_IS_IN_SUPPORTED_COUNTRY", true);
                    Unit unit = Unit.a;
                    i12.apply();
                    boolean z2 = MainActivity.n0;
                    f8h.z(context, fz8.C(fz8.H("open_action", "select_fantasy_tab")), 4);
                    return;
                }
                if (action6 == 23) {
                    String actionValue16 = aPIBuzzerTile6.getActionValue();
                    if (actionValue16 != null) {
                        int i13 = LeagueHistoricalDataActivity.Q;
                        int parseInt3 = Integer.parseInt(actionValue16);
                        Intent intent = new Intent(context, (Class<?>) LeagueHistoricalDataActivity.class);
                        intent.putExtra("uniqueTournamentId", parseInt3);
                        intent.putExtra("seasonId", (Serializable) null);
                        context.startActivity(intent);
                        return;
                    }
                    return;
                }
                if (action6 == 25) {
                    int i14 = PlayerTransfersActivity.R;
                    context.startActivity(new Intent(context, (Class<?>) PlayerTransfersActivity.class));
                    return;
                }
                if (action6 == 26) {
                    String actionValue17 = aPIBuzzerTile6.getActionValue();
                    if (actionValue17 != null) {
                        wxf wxfVar6 = EventActivity.h0;
                        wxf.B(context, Integer.parseInt(actionValue17), rd6.d, null, null, null, 120);
                        return;
                    }
                    return;
                }
                if (action6 == 27) {
                    String actionValue18 = aPIBuzzerTile6.getActionValue();
                    if (actionValue18 == null || (intOrNull2 = StringsKt.toIntOrNull(actionValue18)) == null) {
                        return;
                    }
                    a99.A(LeagueActivity.h0, context, Integer.valueOf(intOrNull2.intValue()), 0, null, y4b.i, null, null, 4056);
                    return;
                }
                if (action6 != 28 || (actionValue3 = aPIBuzzerTile6.getActionValue()) == null || (intOrNull = StringsKt.toIntOrNull(actionValue3)) == null) {
                    return;
                }
                a99.A(LeagueActivity.h0, context, Integer.valueOf(intOrNull.intValue()), 0, null, y4b.j, null, null, 4056);
                return;
            case 6:
                APIBuzzerTile aPIBuzzerTile7 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile7.getClass();
                int action7 = aPIBuzzerTile7.getAction();
                j82[] j82VarArr7 = j82.a;
                if (action7 == 8) {
                    UniqueTournament uniqueTournament3 = aPIBuzzerTile7.getUniqueTournament();
                    if (uniqueTournament3 != null) {
                        a99.A(LeagueActivity.h0, context, Integer.valueOf(uniqueTournament3.getId()), 0, null, null, null, null, 4088);
                        return;
                    }
                    return;
                }
                if (action7 == 27) {
                    UniqueTournament uniqueTournament4 = aPIBuzzerTile7.getUniqueTournament();
                    if (uniqueTournament4 != null) {
                        a99.A(LeagueActivity.h0, context, Integer.valueOf(uniqueTournament4.getId()), 0, null, y4b.i, null, null, 4056);
                        return;
                    }
                    return;
                }
                if (action7 != 28 || (uniqueTournament2 = aPIBuzzerTile7.getUniqueTournament()) == null) {
                    return;
                }
                a99.A(LeagueActivity.h0, context, Integer.valueOf(uniqueTournament2.getId()), 0, null, y4b.j, null, null, 4056);
                return;
            case 7:
                APIBuzzerTile aPIBuzzerTile8 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile8.getClass();
                int action8 = aPIBuzzerTile8.getAction();
                j82[] j82VarArr8 = j82.a;
                if (action8 != 5 || (actionValue4 = aPIBuzzerTile8.getActionValue()) == null) {
                    return;
                }
                wxf wxfVar7 = EventActivity.h0;
                wxf.B(context, Integer.parseInt(actionValue4), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            case 8:
                APIBuzzerTile aPIBuzzerTile9 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile9.getClass();
                int action9 = aPIBuzzerTile9.getAction();
                j82[] j82VarArr9 = j82.a;
                if (action9 == 14) {
                    RankingItem ranking2 = aPIBuzzerTile9.getRanking();
                    if (ranking2 != null && (team2 = ranking2.getTeam()) != null) {
                        num = Integer.valueOf(team2.getId());
                    }
                    String reason2 = aPIBuzzerTile9.getReason();
                    if (reason2 != null) {
                        int hashCode2 = reason2.hashCode();
                        if (hashCode2 == -1717547201) {
                            if (reason2.equals(BuzzerConfigResponseKt.WTA_SINGLES_RANKING_CHANGE)) {
                                int i15 = RankingsActivity.O;
                                jaa.N(context, jmf.c, num);
                                return;
                            }
                            return;
                        }
                        if (hashCode2 == -328204946) {
                            if (reason2.equals(BuzzerConfigResponseKt.FIFA_RANKING_CHANGE)) {
                                int i16 = RankingsActivity.O;
                                jaa.N(context, jmf.f, num);
                                return;
                            }
                            return;
                        }
                        if (hashCode2 == -162298312 && reason2.equals(BuzzerConfigResponseKt.ATP_SINGLES_RANKING_CHANGE)) {
                            int i17 = RankingsActivity.O;
                            jaa.N(context, jmf.b, num);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                context.getClass();
                ((o82) obj).getClass();
                int i18 = BuzzerActivity.O;
                context.startActivity(new Intent(context, (Class<?>) BuzzerActivity.class));
                return;
            default:
                APIBuzzerTile aPIBuzzerTile10 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile10.getClass();
                int action10 = aPIBuzzerTile10.getAction();
                j82[] j82VarArr10 = j82.a;
                if (action10 == 5 && (actionValue6 = aPIBuzzerTile10.getActionValue()) != null) {
                    wxf wxfVar8 = EventActivity.h0;
                    wxf.B(context, Integer.parseInt(actionValue6), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                if (aPIBuzzerTile10.getAction() != 26 || (actionValue5 = aPIBuzzerTile10.getActionValue()) == null) {
                    return;
                }
                wxf wxfVar9 = EventActivity.h0;
                wxf.B(context, Integer.parseInt(actionValue5), rd6.d, null, null, null, 120);
                return;
        }
    }

    public void k(MmaEvent mmaEvent) {
        b92 b92Var = (b92) this.h;
        ViewGroup.LayoutParams layoutParams = b92Var.i.getLayoutParams();
        layoutParams.getClass();
        ((tl3) layoutParams).t = -1;
        ImageView imageView = b92Var.u;
        imageView.setVisibility(0);
        z8e.V(imageView.getContext().getColor(R.color.n_lv_4), imageView);
        TextView textView = b92Var.v;
        textView.setVisibility(0);
        Context context = textView.getContext();
        context.getClass();
        long startTimestamp = mmaEvent.getStartTimestamp();
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
        bestPattern.getClass();
        String format = hk4.a(bestPattern).format(Instant.ofEpochSecond(startTimestamp));
        format.getClass();
        textView.setText(format);
        String weightClass = mmaEvent.getWeightClass();
        if (weightClass != null) {
            TextView textView2 = b92Var.t;
            textView2.setVisibility(0);
            Context context2 = textView2.getContext();
            context2.getClass();
            textView2.setText(tnf.q(context2, weightClass));
        }
    }

    public void l(boolean z, Integer num, Integer num2) {
        f92 f92Var = (f92) this.h;
        TextView textView = f92Var.f;
        TextView textView2 = f92Var.d;
        if (z) {
            Object[] objArr = {String.valueOf(yid.m(num))};
            Context context = this.b;
            textView2.setText(context.getString(R.string.braces_template, objArr));
            textView.setText(context.getString(R.string.braces_template, String.valueOf(yid.m(num2))));
        }
        textView2.setVisibility(z ? 0 : 8);
        textView.setVisibility(z ? 0 : 8);
    }

    private final void j(Object obj) {
    }
}
