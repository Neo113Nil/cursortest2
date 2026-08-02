package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingEvent;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Bowler;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.StatisticSection;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.RefereeStatisticsItem;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z02 extends p8 {
    public final /* synthetic */ int c;
    public final krk d;
    public Object e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z02(j22 j22Var) {
        super(r0);
        Drawable drawable;
        this.c = 0;
        ConstraintLayout constraintLayout = j22Var.b;
        constraintLayout.getClass();
        this.d = j22Var;
        Drawable drawable2 = this.b.getDrawable(R.drawable.ic_cricket_ball);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTintList(ColorStateList.valueOf(this.b.getColor(R.color.live)));
        }
        this.e = drawable;
        NumberFormat numberFormat = NumberFormat.getInstance(dla.d());
        numberFormat.setMaximumFractionDigits(2);
        this.f = numberFormat;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String valueOf;
        String string;
        String Q;
        String Q2;
        Team team;
        String t;
        String t2;
        Player playerOut;
        Brand brand;
        int i3 = this.c;
        Context context = this.b;
        Object obj2 = this.f;
        krk krkVar = this.d;
        int i4 = 0;
        switch (i3) {
            case 0:
                y02 y02Var = (y02) obj;
                y02Var.getClass();
                j22 j22Var = (j22) krkVar;
                TextView textView = (TextView) j22Var.p;
                View view = j22Var.c;
                ImageView imageView = j22Var.m;
                View view2 = j22Var.n;
                Bowler bowler = y02Var.c;
                String playerName = bowler.getPlayerName();
                if (playerName == null) {
                    playerName = tba.t(bowler.getPlayer());
                }
                textView.setText(playerName);
                if (y02Var.a) {
                    view.setVisibility(0);
                    view2.setVisibility(0);
                    if (y02Var.b) {
                        view.setBackgroundColor(view.getContext().getColor(R.color.home_primary_highlight));
                        view2.setBackgroundColor(view2.getContext().getColor(R.color.home_primary));
                    } else {
                        view.setBackgroundColor(view.getContext().getColor(R.color.away_primary_highlight));
                        view2.setBackgroundColor(view2.getContext().getColor(R.color.away_primary));
                    }
                    imageView.setImageDrawable((Drawable) this.e);
                    imageView.setVisibility(0);
                } else {
                    view.setVisibility(8);
                    view2.setVisibility(8);
                    imageView.setVisibility(8);
                }
                TextView textView2 = j22Var.d;
                NumberFormat numberFormat = (NumberFormat) obj2;
                Double over = bowler.getOver();
                double d = 0.0d;
                textView2.setText(numberFormat.format(over != null ? over.doubleValue() : 0.0d));
                TextView textView3 = j22Var.e;
                Integer maiden = bowler.getMaiden();
                String str5 = "-";
                if (maiden == null || (str = String.valueOf(maiden.intValue())) == null) {
                    str = "-";
                }
                textView3.setText(str);
                TextView textView4 = j22Var.f;
                Integer run = bowler.getRun();
                if (run == null || (str2 = String.valueOf(run.intValue())) == null) {
                    str2 = "-";
                }
                textView4.setText(str2);
                TextView textView5 = (TextView) j22Var.g;
                Integer wicket = bowler.getWicket();
                if (wicket == null || (str3 = String.valueOf(wicket.intValue())) == null) {
                    str3 = "-";
                }
                textView5.setText(str3);
                TextView textView6 = (TextView) j22Var.h;
                Integer noBall = bowler.getNoBall();
                if (noBall == null || (str4 = String.valueOf(noBall.intValue())) == null) {
                    str4 = "-";
                }
                textView6.setText(str4);
                TextView textView7 = (TextView) j22Var.i;
                Integer wide = bowler.getWide();
                if (wide != null && (valueOf = String.valueOf(wide.intValue())) != null) {
                    str5 = valueOf;
                }
                textView7.setText(str5);
                Double over2 = bowler.getOver();
                double doubleValue = over2 != null ? over2.doubleValue() : 0.0d;
                if (doubleValue != 0.0d) {
                    List h = new Regex("\\.").h(String.valueOf(doubleValue));
                    ArrayList arrayList = new ArrayList(k13.r(h, 10));
                    Iterator it = h.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                    }
                    int intValue = ((Number) arrayList.get(0)).intValue();
                    int intValue2 = ((Number) arrayList.get(1)).intValue();
                    d = (bowler.getRun() != null ? r3.intValue() : 0) / ((intValue2 / 6.0d) + intValue);
                }
                ((TextView) j22Var.j).setText(yid.c("%.2f", Double.valueOf(d)));
                tgj.m(j22Var, context, new y04());
                tgj.n(j22Var, y02Var.d);
                return;
            case 1:
                Comment comment = (Comment) obj;
                Event event = (Event) this.e;
                comment.getClass();
                xz0 xz0Var = (xz0) krkVar;
                LinearLayout linearLayout = (LinearLayout) xz0Var.j;
                linearLayout.getClass();
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i == 0 ? ao2.s(8, context) : ao2.s(4, context);
                linearLayout.setLayoutParams(marginLayoutParams);
                Player playerIn = comment.getPlayerIn();
                if (playerIn != null && (playerOut = comment.getPlayerOut()) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) xz0Var.k;
                    aba.y(constraintLayout, 0, 3);
                    z8e.a0(constraintLayout, 1000L, new m61(this, xz0Var, playerIn, playerOut, 2));
                }
                ImageView imageView2 = xz0Var.c;
                ImageView imageView3 = (ImageView) xz0Var.m;
                Set set = m43.a;
                Context context2 = imageView2.getContext();
                context2.getClass();
                String type = comment.getType();
                comment.getPeriodName();
                Drawable b = m43.b(context2, type, comment.getGoalType());
                if (b != null) {
                    imageView2.setImageDrawable(b);
                    imageView2.setVisibility(0);
                } else {
                    imageView2.setVisibility(8);
                }
                TextView textView8 = xz0Var.b;
                if (comment.getAddedTime() == null || (string = context.getString(R.string.minutes_added_time_template, comment.getTime(), comment.getAddedTime())) == null) {
                    string = context.getString(R.string.minutes_template, comment.getTime());
                    string.getClass();
                }
                textView8.setText(string);
                TextView textView9 = (TextView) xz0Var.i;
                Context context3 = textView9.getContext();
                context3.getClass();
                String c = m43.c(context3, comment, event);
                if (c != null) {
                    textView9.setText(c);
                    textView9.setVisibility(0);
                } else {
                    textView9.setVisibility(8);
                }
                Boolean isHome$default = Comment.getIsHome$default(comment, null, 1, null);
                if (isHome$default != null) {
                    Team homeTeam$default = isHome$default.booleanValue() ? Event.getHomeTeam$default(event, null, 1, null) : Event.getAwayTeam$default(event, null, 1, null);
                    imageView3.setClickable(true);
                    as9.o(imageView3, homeTeam$default.getId());
                    aba.y(imageView3, 0, 3);
                    z8e.a0(imageView3, 1000L, new ix1(18, imageView3, homeTeam$default));
                    imageView3.setVisibility(0);
                } else {
                    imageView3.setVisibility(8);
                    Unit unit = Unit.a;
                }
                Player playerIn2 = comment.getPlayerIn();
                if (playerIn2 != null) {
                    as9.l((ImageView) xz0Var.f, playerIn2.getId(), null);
                }
                Player playerIn3 = comment.getPlayerIn();
                if (playerIn3 != null && (t2 = tba.t(playerIn3)) != null) {
                    xz0Var.d.setText(t2);
                }
                Player playerOut2 = comment.getPlayerOut();
                if (playerOut2 != null) {
                    as9.l((ImageView) xz0Var.l, playerOut2.getId(), null);
                }
                Player playerOut3 = comment.getPlayerOut();
                if (playerOut3 != null && (t = tba.t(playerOut3)) != null) {
                    ((TextView) xz0Var.g).setText(t);
                }
                Player playerIn4 = comment.getPlayerIn();
                if (playerIn4 != null && (team = playerIn4.getTeam()) != null) {
                    as9.o(imageView3, team.getId());
                }
                TextView textView10 = xz0Var.e;
                Player playerIn5 = comment.getPlayerIn();
                Q = hkg.Q(context, R.string.substituted_in, playerIn5 != null ? playerIn5.getGender() : null, new Object[0]);
                textView10.setText(context.getString(R.string.braces_template, Q));
                TextView textView11 = (TextView) xz0Var.h;
                Player playerOut4 = comment.getPlayerOut();
                Q2 = hkg.Q(context, R.string.substituted_out, playerOut4 != null ? playerOut4.getGender() : null, new Object[0]);
                textView11.setText(context.getString(R.string.braces_template, Q2));
                return;
            case 2:
                c14 c14Var = (c14) obj;
                c14Var.getClass();
                z82 z82Var = (z82) krkVar;
                ((ConstraintLayout) z82Var.b).setBackgroundColor(((Integer) this.e).intValue());
                ((TextView) z82Var.g).setText(context.getString(c14Var.a));
                int i5 = 0;
                for (Object obj3 : (List) obj2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    TextView textView12 = (TextView) obj3;
                    g04 g04Var = (g04) CollectionsKt.a0(i5, c14Var.c);
                    if (g04Var != null) {
                        textView12.setVisibility(0);
                        textView12.setText(g04Var.a);
                        ViewGroup.LayoutParams layoutParams2 = textView12.getLayoutParams();
                        if (layoutParams2 == null) {
                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            return;
                        }
                        tl3 tl3Var = (tl3) layoutParams2;
                        tl3Var.H = g04Var.b;
                        tl3Var.P = ao2.s(g04Var.c, context);
                        textView12.setLayoutParams(tl3Var);
                    } else {
                        textView12.setVisibility(8);
                    }
                    i5 = i6;
                }
                return;
            case 3:
                StatisticSection statisticSection = (StatisticSection) obj;
                statisticSection.getClass();
                TextView textView13 = ((u22) krkVar).b;
                String name = statisticSection.getName();
                String str6 = (String) this.e;
                context.getClass();
                name.getClass();
                str6.getClass();
                switch (name.hashCode()) {
                    case -1911513953:
                        if (name.equals("Passes")) {
                            name = context.getString(R.string.passes);
                            name.getClass();
                            break;
                        }
                        break;
                    case -1898886909:
                        if (name.equals("Points")) {
                            name = str6.equals(Sports.TENNIS) ? context.getString(R.string.tennis_points_stat) : context.getString(R.string.ice_hockey_points);
                            name.getClass();
                            break;
                        }
                        break;
                    case -1890823218:
                        if (name.equals("Miscellaneous")) {
                            name = context.getString(R.string.tennis_miscellaneous_stat);
                            name.getClass();
                            break;
                        }
                        break;
                    case -1850529456:
                        if (name.equals("Return")) {
                            name = context.getString(R.string.tennis_return_stat);
                            name.getClass();
                            break;
                        }
                        break;
                    case -1789452013:
                        if (name.equals("Matches")) {
                            mqi mqiVar = bii.a;
                            name = context.getString(bii.b(str6, false));
                            name.getClass();
                            break;
                        }
                        break;
                    case -1591508288:
                        if (name.equals("Receiving")) {
                            name = context.getString(R.string.receiving);
                            name.getClass();
                            break;
                        }
                        break;
                    case -1551474833:
                        if (name.equals("Special teams")) {
                            name = context.getString(R.string.hockey_special_teams);
                            name.getClass();
                            break;
                        }
                        break;
                    case -1280532492:
                        if (name.equals("Winners")) {
                            name = context.getString(R.string.tennis_winners_stat);
                            name.getClass();
                            break;
                        }
                        break;
                    case -1085397968:
                        if (name.equals("Defence")) {
                            name = context.getString(R.string.football_defence);
                            name.getClass();
                            break;
                        }
                        break;
                    case -1075091222:
                        if (name.equals("Rushing")) {
                            name = context.getString(R.string.rushing);
                            name.getClass();
                            break;
                        }
                        break;
                    case -864354104:
                        if (name.equals("Fielding")) {
                            name = context.getString(R.string.baseball_group_fielding);
                            name.getClass();
                            break;
                        }
                        break;
                    case -706308433:
                        if (name.equals("Scoring")) {
                            name = context.getString(R.string.ice_hockey_scoring);
                            name.getClass();
                            break;
                        }
                        break;
                    case -654193598:
                        if (name.equals("Advanced")) {
                            name = context.getString(R.string.hockey_advanced_stats);
                            name.getClass();
                            break;
                        }
                        break;
                    case -646160747:
                        if (name.equals("Service")) {
                            name = context.getString(R.string.tennis_service_stat);
                            name.getClass();
                            break;
                        }
                        break;
                    case -526517815:
                        if (name.equals("Points (per game)")) {
                            name = context.getString(R.string.points_per_game);
                            name.getClass();
                            break;
                        }
                        break;
                    case -194875198:
                        if (name.equals("Pitching")) {
                            name = context.getString(R.string.baseball_group_pitching);
                            name.getClass();
                            break;
                        }
                        break;
                    case 2606829:
                        if (name.equals("Time")) {
                            name = context.getString(R.string.ice_hockey_time);
                            name.getClass();
                            break;
                        }
                        break;
                    case 24702345:
                        if (name.equals("Kick returns")) {
                            name = context.getString(R.string.kick_returns);
                            name.getClass();
                            break;
                        }
                        break;
                    case 64878403:
                        if (name.equals("Cards")) {
                            name = context.getString(R.string.football_statistics_category_cards);
                            name.getClass();
                            break;
                        }
                        break;
                    case 66385499:
                        if (name.equals("Duels")) {
                            name = context.getString(R.string.football_duels);
                            name.getClass();
                            break;
                        }
                        break;
                    case 67412976:
                        if (name.equals("Extra")) {
                            name = context.getString(R.string.extra);
                            name.getClass();
                            break;
                        }
                        break;
                    case 68567713:
                        if (name.equals("Games")) {
                            name = context.getString(R.string.tennis_games_stat);
                            name.getClass();
                            break;
                        }
                        break;
                    case 68973472:
                        if (name.equals("Goals")) {
                            name = context.getString(R.string.goals);
                            name.getClass();
                            break;
                        }
                        break;
                    case 76517104:
                        if (name.equals("Other")) {
                            name = context.getString(R.string.other);
                            name.getClass();
                            break;
                        }
                        break;
                    case 79860889:
                        if (name.equals("Shots")) {
                            name = str6.equals(Sports.ICE_HOCKEY) ? context.getString(R.string.hockey_shots) : context.getString(R.string.football_shots);
                            name.getClass();
                            break;
                        }
                        break;
                    case 109748138:
                        if (name.equals("Goalkeeping")) {
                            name = context.getString(R.string.goalkeeping);
                            name.getClass();
                            break;
                        }
                        break;
                    case 115837578:
                        if (name.equals("Offense")) {
                            name = context.getString(R.string.amf_offense);
                            name.getClass();
                            break;
                        }
                        break;
                    case 153660860:
                        if (name.equals("Other (per game)")) {
                            name = context.getString(R.string.other_per_game);
                            name.getClass();
                            break;
                        }
                        break;
                    case 609642828:
                        if (name.equals("Defending")) {
                            name = context.getString(R.string.football_defending);
                            name.getClass();
                            break;
                        }
                        break;
                    case 610089939:
                        if (name.equals("Defensive")) {
                            name = context.getString(str6.equals(Sports.BASKETBALL) ? R.string.basketball_stat_rebounds_defensive : str6.equals(Sports.AMERICAN_FOOTBALL) ? R.string.american_football_stat_defence : R.string.defensive);
                            name.getClass();
                            break;
                        }
                        break;
                    case 872613393:
                        if (name.equals("Passing")) {
                            name = context.getString(R.string.passing);
                            name.getClass();
                            break;
                        }
                        break;
                    case 944086345:
                        if (name.equals("Kickoff")) {
                            name = context.getString(R.string.kickoff);
                            name.getClass();
                            break;
                        }
                        break;
                    case 981979241:
                        if (name.equals("Penalty")) {
                            name = context.getString(R.string.ice_hockey_penalty);
                            name.getClass();
                            break;
                        }
                        break;
                    case 1154049238:
                        if (name.equals("Fumbles")) {
                            name = context.getString(R.string.fumbles);
                            name.getClass();
                            break;
                        }
                        break;
                    case 1179118996:
                        if (name.equals("Match overview")) {
                            name = str6.equals(Sports.ICE_HOCKEY) ? context.getString(R.string.hockey_game_overview) : context.getString(R.string.match_overview);
                            name.getClass();
                            break;
                        }
                        break;
                    case 1221177060:
                        if (name.equals("Rebounds (per game)")) {
                            name = context.getString(R.string.rebounds_per_game);
                            name.getClass();
                            break;
                        }
                        break;
                    case 1333417059:
                        if (name.equals("Batting")) {
                            name = context.getString(R.string.baseball_group_batting);
                            name.getClass();
                            break;
                        }
                        break;
                    case 1440608599:
                        if (name.equals("Punting")) {
                            name = context.getString(R.string.punting);
                            name.getClass();
                            break;
                        }
                        break;
                    case 1564019417:
                        if (name.equals("Field goal kickers")) {
                            name = context.getString(R.string.field_goal_kickers);
                            name.getClass();
                            break;
                        }
                        break;
                    case 1781708921:
                        if (name.equals("Unforced errors")) {
                            name = context.getString(R.string.tennis_unforced_errors);
                            name.getClass();
                            break;
                        }
                        break;
                    case 1944204856:
                        if (name.equals("Playoffs")) {
                            name = context.getString(R.string.playoffs);
                            name.getClass();
                            break;
                        }
                        break;
                    case 1971575400:
                        if (name.equals("Attack")) {
                            name = context.getString(R.string.attack_statistics);
                            name.getClass();
                            break;
                        }
                        break;
                    case 2084199307:
                        if (name.equals("Errors")) {
                            name = context.getString(R.string.tennis_errors_stat);
                            name.getClass();
                            break;
                        }
                        break;
                    case 2094894253:
                        if (name.equals("Passes (per game)")) {
                            name = context.getString(R.string.passes_per_game);
                            name.getClass();
                            break;
                        }
                        break;
                    case 2108487687:
                        if (name.equals("Regular season")) {
                            name = context.getString(R.string.regular_season);
                            name.getClass();
                            break;
                        }
                        break;
                }
                textView13.setText(name);
                sea.v(textView13, statisticSection.getIsCardStart(), false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                boolean z = ((nb6) obj2).m;
                ViewGroup.LayoutParams layoutParams3 = textView13.getLayoutParams();
                if (layoutParams3 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                int s = z ? 0 : ao2.s(8, context);
                int s2 = z ? 0 : ao2.s(8, context);
                int i7 = marginLayoutParams2.topMargin;
                int i8 = marginLayoutParams2.bottomMargin;
                marginLayoutParams2.setMarginStart(s);
                marginLayoutParams2.topMargin = i7;
                marginLayoutParams2.setMarginEnd(s2);
                marginLayoutParams2.bottomMargin = i8;
                marginLayoutParams2.height = statisticSection.getIsCardStart() ? ao2.s(40, context) : -2;
                textView13.setLayoutParams(marginLayoutParams2);
                return;
            case 4:
                String str7 = (String) obj;
                str7.getClass();
                kqb kqbVar = (kqb) krkVar;
                kqbVar.c.setVisibility(8);
                TextView textView14 = kqbVar.d;
                ViewGroup.LayoutParams layoutParams4 = textView14.getLayoutParams();
                layoutParams4.getClass();
                tl3 tl3Var2 = (tl3) layoutParams4;
                tl3Var2.setMarginEnd(ao2.s(16, context));
                tl3Var2.setMarginStart(ao2.s(16, context));
                textView14.setText(str7);
                ((kqb) obj2).b.setBackgroundColor(context.getColor(R.color.surface_0));
                return;
            case 5:
                y93 y93Var = (y93) obj;
                y93Var.getClass();
                ComposeView composeView = ((esk) krkVar).a;
                sea.v(composeView, getBindingAdapterPosition() == 0, !y93Var.d || y93Var.c.isEmpty(), 24, 6, 0, null, 112);
                composeView.setContent(new tc3(1929102560, new uge(y93Var, this, i, r10), true));
                return;
            case 6:
                w3f w3fVar = (w3f) obj;
                ComposeView composeView2 = (ComposeView) ((ed) krkVar).c;
                w3fVar.getClass();
                int i9 = w3fVar.q;
                boolean z2 = w3fVar.j;
                String str8 = w3fVar.k;
                BrandingEvent a = nwb.a(context, i9, z2, str8);
                BrandingEvent b2 = a == null ? nwb.b(context, i9, z2, str8) : null;
                if (a == null) {
                    a = b2;
                }
                boolean z3 = b2 != null;
                zsk zskVar = (zsk) this.e;
                if (zskVar != null) {
                    zskVar.a();
                }
                this.e = null;
                if (a != null && (brand = a.getBrand()) != null) {
                    String slug = brand.getSlug();
                    if (slug.length() != 0) {
                        if (composeView2.isAttachedToWindow()) {
                            g6b t3 = qea.t(composeView2);
                            if (t3 != null) {
                                zsk zskVar2 = new zsk(t3, 30);
                                zskVar2.b(composeView2, new lc6(this, i9, slug), null);
                                this.e = zskVar2;
                            }
                        } else {
                            composeView2.addOnAttachStateChangeListener(new f4f(composeView2, this, i9, slug));
                        }
                    }
                }
                composeView2.setContent(new tc3(1004354831, new p81(a, w3fVar, (g4f) obj2, z3), true));
                return;
            default:
                RefereeStatisticsItem refereeStatisticsItem = (RefereeStatisticsItem) obj;
                refereeStatisticsItem.getClass();
                eoc eocVar = (eoc) krkVar;
                ConstraintLayout constraintLayout2 = eocVar.b;
                ImageView imageView4 = eocVar.d;
                constraintLayout2.getClass();
                sea.v(constraintLayout2, false, i == i2 + (-1), 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                as9.q(imageView4, Integer.valueOf(refereeStatisticsItem.getUniqueTournament().getId()), refereeStatisticsItem.getUniqueTournament().getId(), null);
                imageView4.setVisibility(0);
                eocVar.e.setText(tba.x(refereeStatisticsItem.getUniqueTournament()));
                eocVar.c.setText(String.valueOf(refereeStatisticsItem.getAppearances()));
                eocVar.h.setText(((DecimalFormat) this.e).format(refereeStatisticsItem.getYellowCards() / refereeStatisticsItem.getAppearances()));
                eocVar.g.setText(String.valueOf(refereeStatisticsItem.getYellowRedCards() + refereeStatisticsItem.getRedCards()));
                eocVar.f.setText(String.valueOf(refereeStatisticsItem.getPenalty()));
                Iterator it2 = ((ArrayList) obj2).iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i10 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    TextView textView15 = (TextView) next;
                    if (i4 == refereeStatisticsItem.getSelectedOrd()) {
                        textView15.getClass();
                        haa.G(textView15);
                    } else {
                        textView15.getClass();
                        haa.C(textView15);
                    }
                    i4 = i10;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z02(kqb kqbVar) {
        super(r1);
        this.c = 4;
        this.c = 4;
        nxk nxkVar = new nxk(7);
        ConstraintLayout constraintLayout = kqbVar.b;
        constraintLayout.getClass();
        this.d = kqbVar;
        this.e = nxkVar;
        this.f = kqbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z02(z82 z82Var, Integer num) {
        super(r0);
        this.c = 2;
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        constraintLayout.getClass();
        this.d = z82Var;
        this.e = num;
        this.f = b.j((TextView) z82Var.d, (TextView) z82Var.f, (TextView) z82Var.c, (TextView) z82Var.e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z02(eoc eocVar) {
        super(r0);
        this.c = 7;
        ConstraintLayout constraintLayout = eocVar.b;
        constraintLayout.getClass();
        this.d = eocVar;
        this.e = new DecimalFormat("#.#");
        this.f = b.l(eocVar.c, eocVar.h, eocVar.g, eocVar.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z02(g4f g4fVar, ed edVar) {
        super(r2);
        this.c = 6;
        this.f = g4fVar;
        LinearLayout linearLayout = (LinearLayout) edVar.b;
        linearLayout.getClass();
        this.d = edVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z02(xz0 xz0Var, Event event, k43 k43Var) {
        super(r0);
        this.c = 1;
        event.getClass();
        k43Var.getClass();
        LinearLayout linearLayout = (LinearLayout) xz0Var.j;
        linearLayout.getClass();
        this.d = xz0Var;
        this.e = event;
        this.f = k43Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z02(esk eskVar, ox1 ox1Var, ct8 ct8Var) {
        super(eskVar.a);
        this.c = 5;
        this.d = eskVar;
        this.e = ox1Var;
        this.f = ct8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z02(nb6 nb6Var, u22 u22Var, String str) {
        super(u22Var.b);
        this.c = 3;
        str.getClass();
        this.f = nb6Var;
        this.d = u22Var;
        this.e = str;
    }
}
