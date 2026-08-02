package defpackage;

import android.content.Context;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.mvvm.model.AmericanFootballDownDistance;
import com.sofascore.model.mvvm.model.AmericanFootballEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class sc6 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ sc6(ay6 ay6Var) {
        this.a = 11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wyg wygVar;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        wyg wygVar2;
        FootballPlayerSeasonStatistics B;
        Integer accuratePasses;
        wyg wygVar3;
        Player player;
        Long dateOfBirthTimestamp;
        wyg wygVar4;
        FootballPlayerSeasonStatistics B2;
        Integer appearances;
        wyg wygVar5;
        FootballPlayerSeasonStatistics B3;
        Integer goals;
        Double expectedGoals;
        wyg wygVar6;
        Integer accurateLongBalls;
        wyg wygVar7;
        wyg wygVar8;
        FootballPlayerSeasonStatistics B4;
        Integer goals2;
        wyg wygVar9;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics2;
        Integer height;
        String w;
        int i = 0;
        r0 = false;
        boolean z = false;
        i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                Event event = (Event) obj;
                event.getClass();
                obj2.getClass();
                event.getHomeScore(TeamSides.ORIGINAL).setPeriod3((Integer) obj2);
                return Unit.a;
            case 1:
                Event event2 = (Event) obj;
                event2.getClass();
                obj2.getClass();
                event2.getHomeScore(TeamSides.ORIGINAL).setPeriod4((Integer) obj2);
                return Unit.a;
            case 2:
                Event event3 = (Event) obj;
                event3.getClass();
                obj2.getClass();
                event3.getHomeScore(TeamSides.ORIGINAL).setPeriod5((Integer) obj2);
                return Unit.a;
            case 3:
                Event event4 = (Event) obj;
                event4.getClass();
                obj2.getClass();
                event4.getHomeScore(TeamSides.ORIGINAL).setPeriod6((Integer) obj2);
                return Unit.a;
            case 4:
                Event event5 = (Event) obj;
                event5.getClass();
                obj2.getClass();
                event5.getHomeScore(TeamSides.ORIGINAL).setPeriod7((Integer) obj2);
                return Unit.a;
            case 5:
                Event event6 = (Event) obj;
                event6.getClass();
                obj2.getClass();
                event6.getHomeScore(TeamSides.ORIGINAL).setPoint((String) obj2);
                return Unit.a;
            case 6:
                AmericanFootballEvent americanFootballEvent = (AmericanFootballEvent) obj;
                americanFootballEvent.getClass();
                obj2.getClass();
                AmericanFootballDownDistance yardDistance = americanFootballEvent.getYardDistance();
                if (yardDistance != null) {
                    yardDistance.setGoalPossession((Boolean) obj2);
                }
                return Unit.a;
            case 7:
                Event event7 = (Event) obj;
                event7.getClass();
                obj2.getClass();
                event7.getStatus().setCode(((Integer) obj2).intValue());
                return Unit.a;
            case 8:
                Event event8 = (Event) obj;
                event8.getClass();
                obj2.getClass();
                event8.getStatus().setDescription((String) obj2);
                return Unit.a;
            case 9:
                Event event9 = (Event) obj;
                event9.getClass();
                obj2.getClass();
                event9.getStatus().setType((String) obj2);
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                n9e.c(aba.K(1), (of3) obj);
                return Unit.a;
            case 11:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                Pair k = ay6.k(str);
                boolean booleanValue = ((Boolean) k.a).booleanValue();
                int intValue = ((Number) k.b).intValue();
                str2.getClass();
                Pair k2 = ay6.k(str2);
                boolean booleanValue2 = ((Boolean) k2.a).booleanValue();
                int d = Intrinsics.d(((Number) k2.b).intValue(), intValue);
                if (d != 0) {
                    i = d;
                } else if (booleanValue && !booleanValue2) {
                    i = 1;
                } else if (!booleanValue && booleanValue2) {
                    i = -1;
                }
                return Integer.valueOf(i);
            case 12:
                j67 j67Var = (j67) obj2;
                ((ev6) obj).getClass();
                j67Var.getClass();
                return Boolean.valueOf(j67Var.k == FantasyLeagueGameType.HEAD_TO_HEAD);
            case 13:
                ev6 ev6Var = (ev6) obj;
                j67 j67Var2 = (j67) obj2;
                ev6Var.getClass();
                j67Var2.getClass();
                if (!ev6Var.w) {
                    String str3 = j67Var2.d;
                    ia0 ia0Var = ia0.q;
                    if (Intrinsics.c(str3, ok3.p().e().getId())) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                ((ev6) obj).getClass();
                ((j67) obj2).getClass();
                return Boolean.TRUE;
            case 15:
                ((Integer) obj).intValue();
                t77 t77Var = (t77) obj2;
                t77Var.getClass();
                return Integer.valueOf(t77Var.a);
            case 16:
                ((Integer) obj2).getClass();
                wnn.m(aba.K(1), (of3) obj);
                return Unit.a;
            case 17:
                ((Integer) obj).intValue();
                dm7 dm7Var = (dm7) obj2;
                dm7Var.getClass();
                return Integer.valueOf(dm7Var.a);
            case 18:
                ((Integer) obj).intValue();
                lj7 lj7Var = (lj7) obj2;
                lj7Var.getClass();
                return Integer.valueOf(lj7Var.a);
            case 19:
                ((Integer) obj2).getClass();
                wx7.c(aba.K(1), (of3) obj);
                return Unit.a;
            case 20:
                return Boolean.valueOf(Intrinsics.c(obj, obj2));
            case 21:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var = c73Var.c;
                Integer goalsConceded = (d73Var == null || (wygVar2 = d73Var.c) == null || (B = o1j.B(wygVar2)) == null) ? null : B.getGoalsConceded();
                if (d73Var != null && (wygVar = d73Var.c) != null && (abstractPlayerSeasonStatistics = wygVar.a) != null) {
                    r2 = abstractPlayerSeasonStatistics.getAppearances();
                }
                return o1j.z(td4.n0(goalsConceded, r2));
            case 22:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                ((Context) obj2).getClass();
                d73 d73Var2 = c73Var2.c;
                FootballPlayerSeasonStatistics B5 = (d73Var2 == null || (wygVar3 = d73Var2.c) == null) ? null : o1j.B(wygVar3);
                if (B5 == null || (accuratePasses = B5.getAccuratePasses()) == null) {
                    return null;
                }
                Integer valueOf = Integer.valueOf(accuratePasses.intValue());
                Integer appearances2 = B5.getAppearances();
                if (appearances2 != null) {
                    r2 = appearances2.intValue() > 0 ? appearances2 : null;
                    if (r2 != null) {
                        i2 = r2.intValue();
                    }
                }
                return rei.o(valueOf, Integer.valueOf(i2), B5.getAccuratePassesPercentage(), 0);
            case 23:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                ((Context) obj2).getClass();
                qo2 qo2Var = c73Var3.a;
                a73 a73Var = qo2Var instanceof a73 ? (a73) qo2Var : null;
                if (a73Var == null || (dateOfBirthTimestamp = (player = a73Var.c).getDateOfBirthTimestamp()) == null) {
                    return null;
                }
                if (player.getDeceased()) {
                    dateOfBirthTimestamp = null;
                }
                if (dateOfBirthTimestamp != null) {
                    return String.valueOf((int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(dateOfBirthTimestamp.longValue() * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v()))));
                }
                return null;
            case 24:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                ((Context) obj2).getClass();
                d73 d73Var3 = c73Var4.c;
                if (d73Var3 == null || (wygVar4 = d73Var3.c) == null || (B2 = o1j.B(wygVar4)) == null || (appearances = B2.getAppearances()) == null) {
                    return null;
                }
                return String.valueOf(appearances.intValue());
            case 25:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                ((Context) obj2).getClass();
                d73 d73Var4 = c73Var5.c;
                if (d73Var4 == null || (wygVar5 = d73Var4.c) == null || (B3 = o1j.B(wygVar5)) == null || (goals = B3.getGoals()) == null) {
                    return null;
                }
                return String.valueOf(goals.intValue());
            case 26:
                c73 c73Var6 = (c73) obj;
                c73Var6.getClass();
                ((Context) obj2).getClass();
                d73 d73Var5 = c73Var6.c;
                FootballPlayerSeasonStatistics B6 = (d73Var5 == null || (wygVar6 = d73Var5.c) == null) ? null : o1j.B(wygVar6);
                if (B6 == null || (expectedGoals = B6.getExpectedGoals()) == null) {
                    return null;
                }
                return vxd.j(yid.m(B6.getGoals()), yid.c("%.2f", Double.valueOf(expectedGoals.doubleValue())), " (", ")");
            case 27:
                c73 c73Var7 = (c73) obj;
                c73Var7.getClass();
                ((Context) obj2).getClass();
                d73 d73Var6 = c73Var7.c;
                FootballPlayerSeasonStatistics B7 = (d73Var6 == null || (wygVar7 = d73Var6.c) == null) ? null : o1j.B(wygVar7);
                if (B7 == null || (accurateLongBalls = B7.getAccurateLongBalls()) == null) {
                    return null;
                }
                Integer valueOf2 = Integer.valueOf(accurateLongBalls.intValue());
                Integer appearances3 = B7.getAppearances();
                if (appearances3 != null) {
                    r2 = appearances3.intValue() > 0 ? appearances3 : null;
                    if (r2 != null) {
                        i2 = r2.intValue();
                    }
                }
                return rei.o(valueOf2, Integer.valueOf(i2), B7.getAccurateLongBallsPercentage(), 0);
            case 28:
                c73 c73Var8 = (c73) obj;
                c73Var8.getClass();
                ((Context) obj2).getClass();
                d73 d73Var7 = c73Var8.c;
                if (d73Var7 == null || (wygVar8 = d73Var7.c) == null || (B4 = o1j.B(wygVar8)) == null || (goals2 = B4.getGoals()) == null) {
                    return null;
                }
                Double n0 = td4.n0(goals2, (d73Var7 == null || (wygVar9 = d73Var7.c) == null || (abstractPlayerSeasonStatistics2 = wygVar9.a) == null) ? null : abstractPlayerSeasonStatistics2.getAppearances());
                if (n0 != null) {
                    return o1j.z(n0);
                }
                return null;
            default:
                c73 c73Var9 = (c73) obj;
                Context context = (Context) obj2;
                c73Var9.getClass();
                context.getClass();
                qo2 qo2Var2 = c73Var9.a;
                a73 a73Var2 = qo2Var2 instanceof a73 ? (a73) qo2Var2 : null;
                if (a73Var2 == null || (height = a73Var2.c.getHeight()) == null) {
                    return null;
                }
                w = v7a.w(context, height.intValue() / 100.0d, (r4 & 4) == 0, false);
                return w;
        }
    }

    public /* synthetic */ sc6(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ sc6(int i) {
        this.a = i;
    }
}
