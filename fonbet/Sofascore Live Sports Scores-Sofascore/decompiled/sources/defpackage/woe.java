package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.FutsalPlayerEventStatistics;
import com.sofascore.model.network.response.HandballPlayerEventStatistics;
import com.sofascore.model.network.response.IceHockeyPlayerEventStatistics;
import com.sofascore.model.network.response.OtherPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.network.response.RugbyPlayerEventStatistics;
import com.sofascore.model.network.response.VolleyballPlayerEventStatistics;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class woe extends g7 {
    public final String l;
    public final Gender m;
    public final LayoutInflater n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woe(Context context, String str, Gender gender) {
        super(context);
        context.getClass();
        str.getClass();
        this.l = str;
        this.m = gender;
        this.n = LayoutInflater.from(context);
    }

    public final void G(PlayerEventStatisticsResponse playerEventStatisticsResponse, PlayerEventStatisticsResponse playerEventStatisticsResponse2, boolean z, yzd yzdVar, gzd gzdVar) {
        epe qt8Var;
        FutsalPlayerEventStatistics futsalPlayerEventStatistics;
        epe epeVar;
        wj1 wj1Var;
        BaseballPlayerEventStatistics baseballPlayerEventStatistics;
        RugbyPlayerEventStatistics rugbyPlayerEventStatistics;
        VolleyballPlayerEventStatistics volleyballPlayerEventStatistics;
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics;
        HandballPlayerEventStatistics handballPlayerEventStatistics;
        FootballPlayerEventStatistics footballPlayerEventStatistics;
        String str;
        List a;
        playerEventStatisticsResponse.getClass();
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new CustomizableDivider(false, 0, false, null, 14, null));
        }
        Context context = this.b;
        context.getClass();
        PlayerEventStatistics statistics = playerEventStatisticsResponse.getStatistics();
        BasketballPlayerEventStatistics basketballPlayerEventStatistics = null;
        AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = null;
        if (statistics instanceof AmericanFootballPlayerEventStatistics) {
            PlayerEventStatistics statistics2 = playerEventStatisticsResponse.getStatistics();
            if (statistics2 == null) {
                yhk.s("null cannot be cast to non-null type com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics");
                return;
            }
            AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2 = (AmericanFootballPlayerEventStatistics) statistics2;
            if (playerEventStatisticsResponse2 != null) {
                PlayerEventStatistics statistics3 = playerEventStatisticsResponse2.getStatistics();
                americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) (statistics3 instanceof AmericanFootballPlayerEventStatistics ? statistics3 : null);
            }
            qt8Var = new g7h(context, z, americanFootballPlayerEventStatistics2, americanFootballPlayerEventStatistics);
        } else if (statistics instanceof BasketballPlayerEventStatistics) {
            PlayerEventStatistics statistics4 = playerEventStatisticsResponse.getStatistics();
            if (statistics4 == null) {
                yhk.s("null cannot be cast to non-null type com.sofascore.model.network.response.BasketballPlayerEventStatistics");
                return;
            }
            BasketballPlayerEventStatistics basketballPlayerEventStatistics2 = (BasketballPlayerEventStatistics) statistics4;
            if (playerEventStatisticsResponse2 != null) {
                PlayerEventStatistics statistics5 = playerEventStatisticsResponse2.getStatistics();
                basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) (statistics5 instanceof BasketballPlayerEventStatistics ? statistics5 : null);
            }
            qt8Var = new mr1(context, z, basketballPlayerEventStatistics2, basketballPlayerEventStatistics);
        } else if (statistics instanceof FootballPlayerEventStatistics) {
            fzd fzdVar = gzdVar instanceof fzd ? (fzd) gzdVar : null;
            mzd mzdVar = fzdVar != null ? fzdVar.a : null;
            PlayerEventStatistics statistics6 = playerEventStatisticsResponse.getStatistics();
            if (statistics6 == null) {
                yhk.s("null cannot be cast to non-null type com.sofascore.model.network.response.FootballPlayerEventStatistics");
                return;
            }
            FootballPlayerEventStatistics footballPlayerEventStatistics2 = (FootballPlayerEventStatistics) statistics6;
            if (playerEventStatisticsResponse2 != null) {
                PlayerEventStatistics statistics7 = playerEventStatisticsResponse2.getStatistics();
                if (!(statistics7 instanceof FootballPlayerEventStatistics)) {
                    statistics7 = null;
                }
                footballPlayerEventStatistics = (FootballPlayerEventStatistics) statistics7;
                str = null;
            } else {
                footballPlayerEventStatistics = null;
                str = null;
            }
            String position = playerEventStatisticsResponse.getPosition();
            if (playerEventStatisticsResponse2 != null) {
                str = playerEventStatisticsResponse2.getPosition();
            }
            qt8Var = new hk8(context, z, footballPlayerEventStatistics2, footballPlayerEventStatistics, position, str, yzdVar == null ? yzd.All : yzdVar, mzdVar, this.m);
        } else {
            String str2 = null;
            if (statistics instanceof HandballPlayerEventStatistics) {
                PlayerEventStatistics statistics8 = playerEventStatisticsResponse.getStatistics();
                if (statistics8 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.model.network.response.HandballPlayerEventStatistics");
                    return;
                }
                HandballPlayerEventStatistics handballPlayerEventStatistics2 = (HandballPlayerEventStatistics) statistics8;
                if (playerEventStatisticsResponse2 != null) {
                    PlayerEventStatistics statistics9 = playerEventStatisticsResponse2.getStatistics();
                    if (!(statistics9 instanceof HandballPlayerEventStatistics)) {
                        statistics9 = null;
                    }
                    handballPlayerEventStatistics = (HandballPlayerEventStatistics) statistics9;
                } else {
                    handballPlayerEventStatistics = null;
                }
                String position2 = playerEventStatisticsResponse.getPosition();
                if (playerEventStatisticsResponse2 != null) {
                    str2 = playerEventStatisticsResponse2.getPosition();
                }
                qt8Var = new g69(context, z, handballPlayerEventStatistics2, handballPlayerEventStatistics, position2, str2);
            } else if (statistics instanceof IceHockeyPlayerEventStatistics) {
                PlayerEventStatistics statistics10 = playerEventStatisticsResponse.getStatistics();
                if (statistics10 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.model.network.response.IceHockeyPlayerEventStatistics");
                    return;
                }
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2 = (IceHockeyPlayerEventStatistics) statistics10;
                if (playerEventStatisticsResponse2 != null) {
                    PlayerEventStatistics statistics11 = playerEventStatisticsResponse2.getStatistics();
                    if (!(statistics11 instanceof IceHockeyPlayerEventStatistics)) {
                        statistics11 = null;
                    }
                    iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) statistics11;
                } else {
                    iceHockeyPlayerEventStatistics = null;
                }
                String position3 = playerEventStatisticsResponse.getPosition();
                if (playerEventStatisticsResponse2 != null) {
                    str2 = playerEventStatisticsResponse2.getPosition();
                }
                qt8Var = new sp9(context, z, iceHockeyPlayerEventStatistics2, iceHockeyPlayerEventStatistics, position3, str2);
            } else if (statistics instanceof VolleyballPlayerEventStatistics) {
                PlayerEventStatistics statistics12 = playerEventStatisticsResponse.getStatistics();
                if (statistics12 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.model.network.response.VolleyballPlayerEventStatistics");
                    return;
                }
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics2 = (VolleyballPlayerEventStatistics) statistics12;
                if (playerEventStatisticsResponse2 != null) {
                    PlayerEventStatistics statistics13 = playerEventStatisticsResponse2.getStatistics();
                    volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) (!(statistics13 instanceof VolleyballPlayerEventStatistics) ? null : statistics13);
                } else {
                    volleyballPlayerEventStatistics = null;
                }
                qt8Var = new mxk(context, z, volleyballPlayerEventStatistics2, volleyballPlayerEventStatistics);
            } else {
                if (!(statistics instanceof RugbyPlayerEventStatistics)) {
                    if (statistics instanceof BaseballPlayerEventStatistics) {
                        ezd ezdVar = gzdVar instanceof ezd ? (ezd) gzdVar : null;
                        if (ezdVar != null && (wj1Var = ezdVar.a) != null) {
                            PlayerEventStatistics statistics14 = playerEventStatisticsResponse.getStatistics();
                            if (statistics14 == null) {
                                yhk.s("null cannot be cast to non-null type com.sofascore.model.network.response.BaseballPlayerEventStatistics");
                                return;
                            }
                            BaseballPlayerEventStatistics baseballPlayerEventStatistics2 = (BaseballPlayerEventStatistics) statistics14;
                            if (playerEventStatisticsResponse2 != null) {
                                PlayerEventStatistics statistics15 = playerEventStatisticsResponse2.getStatistics();
                                if (!(statistics15 instanceof BaseballPlayerEventStatistics)) {
                                    statistics15 = null;
                                }
                                baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) statistics15;
                            } else {
                                baseballPlayerEventStatistics = null;
                            }
                            qt8Var = new h91(context, z, baseballPlayerEventStatistics2, baseballPlayerEventStatistics, wj1Var);
                        }
                        epeVar = null;
                    } else if (statistics instanceof FutsalPlayerEventStatistics) {
                        PlayerEventStatistics statistics16 = playerEventStatisticsResponse.getStatistics();
                        if (statistics16 == null) {
                            yhk.s("null cannot be cast to non-null type com.sofascore.model.network.response.FutsalPlayerEventStatistics");
                            return;
                        }
                        FutsalPlayerEventStatistics futsalPlayerEventStatistics2 = (FutsalPlayerEventStatistics) statistics16;
                        if (playerEventStatisticsResponse2 != null) {
                            PlayerEventStatistics statistics17 = playerEventStatisticsResponse2.getStatistics();
                            futsalPlayerEventStatistics = (FutsalPlayerEventStatistics) (!(statistics17 instanceof FutsalPlayerEventStatistics) ? null : statistics17);
                        } else {
                            futsalPlayerEventStatistics = null;
                        }
                        qt8Var = new qt8(context, z, futsalPlayerEventStatistics2, futsalPlayerEventStatistics);
                    } else {
                        if (!(statistics instanceof OtherPlayerEventStatistics)) {
                            zzl.b();
                            return;
                        }
                        epeVar = null;
                    }
                    if (epeVar != null && (a = epeVar.a()) != null) {
                        arrayList.addAll(a);
                    }
                    F(arrayList);
                }
                PlayerEventStatistics statistics18 = playerEventStatisticsResponse.getStatistics();
                if (statistics18 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.model.network.response.RugbyPlayerEventStatistics");
                    return;
                }
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics2 = (RugbyPlayerEventStatistics) statistics18;
                if (playerEventStatisticsResponse2 != null) {
                    PlayerEventStatistics statistics19 = playerEventStatisticsResponse2.getStatistics();
                    rugbyPlayerEventStatistics = (RugbyPlayerEventStatistics) (!(statistics19 instanceof RugbyPlayerEventStatistics) ? null : statistics19);
                } else {
                    rugbyPlayerEventStatistics = null;
                }
                qt8Var = new r9g(context, z, rugbyPlayerEventStatistics2, rugbyPlayerEventStatistics);
            }
        }
        epeVar = qt8Var;
        if (epeVar != null) {
            arrayList.addAll(a);
        }
        F(arrayList);
    }

    @Override // defpackage.ysk
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 2);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof jei) {
            return 2;
        }
        if (obj instanceof EventStatisticsItem) {
            return 3;
        }
        if (obj instanceof CustomizableDivider) {
            return 1;
        }
        if (obj instanceof String) {
            return 4;
        }
        ogj.h(obj);
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 1) {
            return new wh(new SofaDivider(this.b, null, 6));
        }
        Gender gender = this.m;
        LayoutInflater layoutInflater = this.n;
        if (i == 2) {
            return new uih(h04.c(layoutInflater, viewGroup), gender, 4);
        }
        if (i != 3) {
            if (i != 4) {
                ilg.c();
                return null;
            }
            View inflate = layoutInflater.inflate(R.layout.item_player_event_statistics_category_header, viewGroup, false);
            if (inflate != null) {
                return new ja9(13, (TextView) inflate);
            }
            yhk.s("rootView");
            return null;
        }
        View inflate2 = layoutInflater.inflate(R.layout.statistics_value_layout, viewGroup, false);
        int i2 = R.id.bottom_divider;
        View B = nq8.B(R.id.bottom_divider, inflate2);
        if (B != null) {
            i2 = R.id.first_team_value_background;
            View B2 = nq8.B(R.id.first_team_value_background, inflate2);
            if (B2 != null) {
                i2 = R.id.guideline_end;
                Guideline guideline = (Guideline) nq8.B(R.id.guideline_end, inflate2);
                if (guideline != null) {
                    i2 = R.id.guideline_start;
                    Guideline guideline2 = (Guideline) nq8.B(R.id.guideline_start, inflate2);
                    if (guideline2 != null) {
                        i2 = R.id.second_team_value_background;
                        View B3 = nq8.B(R.id.second_team_value_background, inflate2);
                        if (B3 != null) {
                            i2 = R.id.statistic_name;
                            TextView textView = (TextView) nq8.B(R.id.statistic_name, inflate2);
                            if (textView != null) {
                                i2 = R.id.value_first_team;
                                TextView textView2 = (TextView) nq8.B(R.id.value_first_team, inflate2);
                                if (textView2 != null) {
                                    i2 = R.id.value_second_team;
                                    TextView textView3 = (TextView) nq8.B(R.id.value_second_team, inflate2);
                                    if (textView3 != null) {
                                        return new lei(new bv1((ConstraintLayout) inflate2, B, B2, guideline, guideline2, B3, textView, textView2, textView3), this.l, gender);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
        return null;
    }
}
