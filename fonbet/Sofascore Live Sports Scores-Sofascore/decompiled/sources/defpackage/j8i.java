package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.bettingtips.TeamStreak;
import com.sofascore.model.network.response.Duel;
import com.sofascore.model.newNetwork.StageSportDriverSeasonData;
import com.sofascore.model.newNetwork.StageSportDriverTeamData;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.view.TopH2HStreakView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Set;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class j8i extends p8 {
    public final /* synthetic */ int c = 9;
    public final krk d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(u22 u22Var, boolean z) {
        super(r0);
        TextView textView = u22Var.b;
        this.d = u22Var;
        textView.setPaddingRelative(ao2.s(z ? 24 : 16, this.b), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03eb  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(int i, int i2, Object obj) {
        int i3;
        Integer racesStarted;
        String str;
        Integer podiums;
        Integer victories;
        Integer polePositions;
        String valueOf;
        String str2;
        Sport sport;
        int i4 = this.c;
        String str3 = null;
        Context context = this.b;
        krk krkVar = this.d;
        switch (i4) {
            case 0:
                StageSportDriverSeasonData stageSportDriverSeasonData = (StageSportDriverSeasonData) obj;
                z82 z82Var = (z82) krkVar;
                TextView textView = (TextView) z82Var.e;
                stageSportDriverSeasonData.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Long endDateTimestamp = stageSportDriverSeasonData.getStage().getEndDateTimestamp();
                long longValue = endDateTimestamp != null ? endDateTimestamp.longValue() : Long.MAX_VALUE;
                int i5 = R.color.surface_1;
                if (longValue < currentTimeMillis) {
                    Integer position = stageSportDriverSeasonData.getPosition();
                    if (position != null && position.intValue() == 1) {
                        i3 = R.color.value;
                    } else {
                        Integer position2 = stageSportDriverSeasonData.getPosition();
                        if (position2 != null && position2.intValue() == 2) {
                            i3 = R.color.neutral_default;
                        } else {
                            Integer position3 = stageSportDriverSeasonData.getPosition();
                            if (position3 != null && position3.intValue() == 3) {
                                i3 = R.color.n_lv_4;
                            }
                        }
                    }
                    textView.setBackgroundTintList(ColorStateList.valueOf(textView.getContext().getColor(i3)));
                    Context context2 = textView.getContext();
                    if (i3 != R.color.value) {
                        i5 = R.color.n_lv_1;
                    }
                    textView.setTextColor(context2.getColor(i5));
                    String description = stageSportDriverSeasonData.getStage().getDescription();
                    String substring = description.substring(StringsKt.T(" ", description, 6) + 1);
                    if (stageSportDriverSeasonData.getPosition() != null) {
                        substring = fc6.n(substring, " (", context.getString(R.string.motorsport_driver_final_placement, String.valueOf(stageSportDriverSeasonData.getPosition())), ")");
                    }
                    textView.setText(substring);
                    TextView textView2 = (TextView) z82Var.c;
                    racesStarted = stageSportDriverSeasonData.getRacesStarted();
                    str = "0";
                    if (racesStarted != null || (r2 = String.valueOf(racesStarted.intValue())) == null) {
                        String str4 = "0";
                    }
                    textView2.setText(str4);
                    TextView textView3 = (TextView) z82Var.d;
                    podiums = stageSportDriverSeasonData.getPodiums();
                    if (podiums != null || (r2 = String.valueOf(podiums.intValue())) == null) {
                        String str5 = "0";
                    }
                    textView3.setText(str5);
                    TextView textView4 = (TextView) z82Var.g;
                    victories = stageSportDriverSeasonData.getVictories();
                    if (victories != null || (r2 = String.valueOf(victories.intValue())) == null) {
                        String str6 = "0";
                    }
                    textView4.setText(str6);
                    TextView textView5 = (TextView) z82Var.f;
                    polePositions = stageSportDriverSeasonData.getPolePositions();
                    if (polePositions != null && (valueOf = String.valueOf(polePositions.intValue())) != null) {
                        str = valueOf;
                    }
                    textView5.setText(str);
                    break;
                }
                i3 = R.color.surface_1;
                textView.setBackgroundTintList(ColorStateList.valueOf(textView.getContext().getColor(i3)));
                Context context22 = textView.getContext();
                if (i3 != R.color.value) {
                }
                textView.setTextColor(context22.getColor(i5));
                String description2 = stageSportDriverSeasonData.getStage().getDescription();
                String substring2 = description2.substring(StringsKt.T(" ", description2, 6) + 1);
                if (stageSportDriverSeasonData.getPosition() != null) {
                }
                textView.setText(substring2);
                TextView textView22 = (TextView) z82Var.c;
                racesStarted = stageSportDriverSeasonData.getRacesStarted();
                str = "0";
                if (racesStarted != null) {
                }
                String str42 = "0";
                textView22.setText(str42);
                TextView textView32 = (TextView) z82Var.d;
                podiums = stageSportDriverSeasonData.getPodiums();
                if (podiums != null) {
                }
                String str52 = "0";
                textView32.setText(str52);
                TextView textView42 = (TextView) z82Var.g;
                victories = stageSportDriverSeasonData.getVictories();
                if (victories != null) {
                }
                String str62 = "0";
                textView42.setText(str62);
                TextView textView52 = (TextView) z82Var.f;
                polePositions = stageSportDriverSeasonData.getPolePositions();
                if (polePositions != null) {
                    str = valueOf;
                }
                textView52.setText(str);
                break;
            case 1:
                StageSportDriverTeamData stageSportDriverTeamData = (StageSportDriverTeamData) obj;
                stageSportDriverTeamData.getClass();
                nr1 nr1Var = (nr1) krkVar;
                ImageView imageView = (ImageView) nr1Var.e;
                String R = pco.R(stageSportDriverTeamData.getParentTeam().getId());
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = R;
                vt9.f(ht9Var, imageView);
                vt9.e(ht9Var, R.drawable.team_logo_placeholder);
                vt9.a(ht9Var, R.drawable.team_logo_placeholder);
                ht9Var.q = jrg.b;
                a.a(ht9Var.a());
                ((TextView) nr1Var.g).setText(tba.p(context, stageSportDriverTeamData.getParentTeam()));
                ((TextView) nr1Var.h).setText(stageSportDriverTeamData.getYearsActive());
                ((TextView) nr1Var.f).setText(String.valueOf(stageSportDriverTeamData.getRacesStarted()));
                nr1Var.b.setText(String.valueOf(stageSportDriverTeamData.getPodiums()));
                ((TextView) nr1Var.i).setText(String.valueOf(stageSportDriverTeamData.getVictories()));
                ((TextView) nr1Var.d).setText(String.valueOf(stageSportDriverTeamData.getPolePositions()));
                break;
            case 2:
                x9i x9iVar = (x9i) obj;
                x9iVar.getClass();
                rfe rfeVar = (rfe) krkVar;
                y6a.s(rfeVar, x9iVar, false);
                ConstraintLayout constraintLayout = (ConstraintLayout) rfeVar.b;
                constraintLayout.getClass();
                sea.v(constraintLayout, false, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) rfeVar.c;
                constraintLayout2.getClass();
                constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), ao2.s(8, context));
                break;
            case 3:
                String str7 = (String) obj;
                str7.getClass();
                ((mt1) krkVar).c.setText(str7);
                break;
            case 4:
                w5b w5bVar = (w5b) obj;
                w5bVar.getClass();
                gh5 gh5Var = (gh5) krkVar;
                LinearLayout linearLayout = gh5Var.b;
                linearLayout.getClass();
                sea.v(linearLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                ImageView imageView2 = gh5Var.c;
                imageView2.setVisibility(0);
                Integer valueOf2 = Integer.valueOf(R.drawable.ic_info);
                apf a2 = ajh.a(imageView2.getContext());
                ht9 ht9Var2 = new ht9(imageView2.getContext());
                ht9Var2.c = valueOf2;
                fc6.w(ht9Var2, imageView2, a2);
                imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.n_lv_3)));
                gh5Var.d.setText(w5bVar.a);
                break;
            case 5:
                o2j o2jVar = (o2j) obj;
                o2jVar.getClass();
                av1 av1Var = (av1) krkVar;
                LinearLayout linearLayout2 = av1Var.b;
                ImageView imageView3 = av1Var.c;
                linearLayout2.getClass();
                sea.v(linearLayout2, false, i == i2 - 1, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                ImageView imageView4 = av1Var.d;
                TeamStreak teamStreak = o2jVar.a;
                boolean z = o2jVar.b;
                as9.o(imageView4, teamStreak.getTeam().getId());
                TextView textView6 = av1Var.e;
                Team team = teamStreak.getTeam();
                context.getClass();
                if (team == null) {
                    str2 = "";
                } else {
                    String p = tba.p(context, team);
                    if (qea.y(team) && team.getSport() != null) {
                        Set set = wyh.a;
                        if (!wyh.e(team.getSportSlug())) {
                            str2 = wv8.i(p, " ", context.getString(R.string.female_team));
                        }
                    }
                    str2 = p;
                }
                textView6.setText(str2);
                av1Var.f.setText(teamStreak.getValue());
                imageView3.setVisibility(z ? 0 : 8);
                if (z) {
                    Set set2 = wyh.a;
                    Category category = teamStreak.getTeam().getCategory();
                    if (category != null && (sport = category.getSport()) != null) {
                        str3 = sport.getSlug();
                    }
                    imageView3.setImageResource(wyh.a(str3));
                    break;
                }
                break;
            case 6:
                d(i, i2, (xlf) obj);
                break;
            case 7:
                vej vejVar = (vej) obj;
                vejVar.getClass();
                z3f z3fVar = (z3f) krkVar;
                ((TextView) z3fVar.d).setText(vejVar.a.b(context));
                ((TextView) z3fVar.c).setText(vejVar.b);
                break;
            case 8:
                ud6 ud6Var = (ud6) obj;
                ud6Var.getClass();
                rvk rvkVar = (rvk) krkVar;
                FrameLayout frameLayout = rvkVar.b;
                TopH2HStreakView topH2HStreakView = (TopH2HStreakView) rvkVar.c;
                frameLayout.getClass();
                sea.v(frameLayout, i == 0, i == i2 - 1, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                aba.u(topH2HStreakView);
                Event event = ud6Var.b;
                Duel duel = ud6Var.c;
                if (duel == null) {
                    duel = new Duel(0, 0, 0);
                }
                boolean z2 = ud6Var.a;
                Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                bv1 bv1Var = topH2HStreakView.d;
                ImageView imageView5 = (ImageView) bv1Var.e;
                ImageView imageView6 = (ImageView) bv1Var.i;
                as9.o(imageView5, homeTeam$default.getId());
                as9.o((ImageView) bv1Var.f, awayTeam$default.getId());
                TextView textView7 = (TextView) bv1Var.c;
                Context context3 = topH2HStreakView.getContext();
                context3.getClass();
                textView7.setText(v8a.x(context3, homeTeam$default));
                TextView textView8 = (TextView) bv1Var.h;
                Context context4 = topH2HStreakView.getContext();
                context4.getClass();
                textView8.setText(v8a.x(context4, awayTeam$default));
                ((TextView) bv1Var.d).setText(String.valueOf(Duel.getHomeWins$default(duel, null, 1, null)));
                ((TextView) bv1Var.j).setText(String.valueOf(Duel.getAwayWins$default(duel, null, 1, null)));
                ((TextView) bv1Var.g).setText(String.valueOf(duel.getDraws()));
                imageView6.setVisibility(z2 ? 0 : 8);
                if (z2) {
                    Set set3 = wyh.a;
                    imageView6.setImageResource(wyh.a(ok3.s(event)));
                    break;
                }
                break;
            case 9:
                loj lojVar = (loj) obj;
                lojVar.getClass();
                aik.s((j22) krkVar, context, lojVar, i, true);
                break;
            case 10:
                krj krjVar = (krj) obj;
                krjVar.getClass();
                TextView textView9 = ((u22) krkVar).b;
                sea.v(textView9, krjVar.c, false, 0, 0, 0, krjVar.d, 60);
                textView9.setText(krjVar.b);
                break;
            case 11:
                Country country = (Country) obj;
                country.getClass();
                ez0 ez0Var = (ez0) krkVar;
                as9.c((ImageView) ez0Var.c, country.getIso2Alpha(), false, null, 6);
                ((TextView) ez0Var.e).setText(tv3.c(context, country.getName()));
                ((View) ez0Var.d).setVisibility(country.getHasChannels() ? 0 : 8);
                break;
            default:
                TvChannel tvChannel = (TvChannel) obj;
                tvChannel.getClass();
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) ((ed) krkVar).c;
                materialCheckBox.setText(tvChannel.getName());
                materialCheckBox.setChecked(tvChannel.getIsSelected());
                break;
        }
    }

    @Override // defpackage.p8
    public void c(int i, int i2, Object obj) {
        switch (this.c) {
            case 2:
                x9i x9iVar = (x9i) obj;
                x9iVar.getClass();
                y6a.s((rfe) this.d, x9iVar, true);
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    public void d(int i, int i2, xlf xlfVar) {
        com.sofascore.model.mvvm.model.Country country;
        String alpha2;
        com.sofascore.model.mvvm.model.Country country2;
        String name;
        xlfVar.getClass();
        RankingRow rankingRow = xlfVar.a;
        bu1 bu1Var = (bu1) this.d;
        ((TextView) bu1Var.c).setText(String.valueOf(rankingRow.getPosition()));
        haa.n(rankingRow, (TextView) bu1Var.f);
        ImageView imageView = (ImageView) bu1Var.d;
        Team team = rankingRow.getTeam();
        as9.o(imageView, team != null ? team.getId() : 0);
        TextView textView = (TextView) bu1Var.g;
        Team team2 = rankingRow.getTeam();
        Context context = this.b;
        textView.setText(team2 != null ? tba.p(context, team2) : null);
        Team team3 = rankingRow.getTeam();
        String c = (team3 == null || (country2 = team3.getCountry()) == null || (name = country2.getName()) == null) ? null : tv3.c(context, name);
        Team team4 = rankingRow.getTeam();
        if (team4 != null && (country = team4.getCountry()) != null && (alpha2 = country.getAlpha2()) != null) {
            as9.c((ImageView) bu1Var.j, alpha2, false, null, 6);
        }
        ((TextView) bu1Var.e).setText(c);
        ((TextView) bu1Var.h).setVisibility(8);
        ((TextView) bu1Var.i).setVisibility(8);
        Double points = rankingRow.getPoints();
        haa.N((TextView) bu1Var.k, points != null ? String.valueOf(wzb.a(points.doubleValue())) : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8i(View view) {
        super(view);
        view.getClass();
        this.d = j22.b(view);
    }

    public j8i(ed edVar) {
        super((MaterialCheckBox) edVar.b);
        this.d = edVar;
    }

    public j8i(mt1 mt1Var) {
        super(mt1Var.b);
        this.d = mt1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(rvk rvkVar) {
        super(r0);
        FrameLayout frameLayout = rvkVar.b;
        frameLayout.getClass();
        this.d = rvkVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(z3f z3fVar) {
        super(r0);
        FrameLayout frameLayout = (FrameLayout) z3fVar.b;
        frameLayout.getClass();
        this.d = z3fVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(gh5 gh5Var) {
        super(r0);
        LinearLayout linearLayout = gh5Var.b;
        linearLayout.getClass();
        this.d = gh5Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(ez0 ez0Var) {
        super(r0);
        LinearLayout linearLayout = (LinearLayout) ez0Var.b;
        linearLayout.getClass();
        this.d = ez0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(z82 z82Var) {
        super(r0);
        LinearLayout linearLayout = (LinearLayout) z82Var.b;
        linearLayout.getClass();
        this.d = z82Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(av1 av1Var) {
        super(r0);
        LinearLayout linearLayout = av1Var.b;
        linearLayout.getClass();
        this.d = av1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(rfe rfeVar) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) rfeVar.b;
        constraintLayout.getClass();
        this.d = rfeVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(nr1 nr1Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        constraintLayout.getClass();
        this.d = nr1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8i(bu1 bu1Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) bu1Var.b;
        constraintLayout.getClass();
        this.d = bu1Var;
    }
}
