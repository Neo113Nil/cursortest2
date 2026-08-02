package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yq1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ yq1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wyg wygVar;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        wyg wygVar2;
        BasketballPlayerSeasonStatistics b;
        wyg wygVar3;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics2;
        wyg wygVar4;
        BasketballPlayerSeasonStatistics b2;
        wyg wygVar5;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics3;
        wyg wygVar6;
        BasketballPlayerSeasonStatistics b3;
        wyg wygVar7;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics4;
        wyg wygVar8;
        BasketballPlayerSeasonStatistics b4;
        wyg wygVar9;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics5;
        wyg wygVar10;
        BasketballPlayerSeasonStatistics b5;
        wyg wygVar11;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics6;
        wyg wygVar12;
        BasketballPlayerSeasonStatistics b6;
        Team team;
        wyg wygVar13;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics7;
        wyg wygVar14;
        BasketballPlayerSeasonStatistics b7;
        wyg wygVar15;
        BasketballPlayerSeasonStatistics b8;
        wyg wygVar16;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics8;
        wyg wygVar17;
        BasketballPlayerSeasonStatistics b9;
        wyg wygVar18;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics9;
        wyg wygVar19;
        BasketballPlayerSeasonStatistics b10;
        wyg wygVar20;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics10;
        wyg wygVar21;
        BasketballPlayerSeasonStatistics b11;
        wyg wygVar22;
        BasketballPlayerSeasonStatistics b12;
        Double rating;
        wyg wygVar23;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics11;
        wyg wygVar24;
        BasketballPlayerSeasonStatistics b13;
        wyg wygVar25;
        BasketballPlayerSeasonStatistics b14;
        wyg wygVar26;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics12;
        wyg wygVar27;
        BasketballPlayerSeasonStatistics b15;
        wyg wygVar28;
        BasketballPlayerSeasonStatistics b16;
        wyg wygVar29;
        BasketballPlayerSeasonStatistics b17;
        Integer appearances;
        wyg wygVar30;
        wyg wygVar31;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics13;
        wyg wygVar32;
        BasketballPlayerSeasonStatistics b18;
        r0 = null;
        r0 = null;
        Integer num = null;
        r0 = null;
        r0 = null;
        Integer num2 = null;
        r0 = null;
        r0 = null;
        Integer num3 = null;
        r0 = null;
        r0 = null;
        Integer num4 = null;
        r0 = null;
        r0 = null;
        Integer num5 = null;
        r0 = null;
        r0 = null;
        Integer num6 = null;
        r0 = null;
        r0 = null;
        Integer num7 = null;
        r0 = null;
        r0 = null;
        Integer num8 = null;
        r0 = null;
        r0 = null;
        Integer num9 = null;
        r0 = null;
        r0 = null;
        Integer num10 = null;
        r0 = null;
        r0 = null;
        Integer num11 = null;
        r0 = null;
        r0 = null;
        Integer num12 = null;
        r0 = null;
        r0 = null;
        Integer num13 = null;
        switch (this.a) {
            case 0:
                return new q9k(R.string.basketball_triple_double_short);
            case 1:
                return new q9k(R.string.basketball_triple_double);
            case 2:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(basketballPlayerSeasonStatistics.getTripleDoubles());
                Regex regex = yid.a;
                return y0;
            case 3:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics2 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics2.getClass();
                String y02 = o02.y0(basketballPlayerSeasonStatistics2.getTripleDoubles());
                Regex regex2 = yid.a;
                return y02;
            case 4:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics3 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics3.getTripleDoubles()));
            case 5:
                return new q9k(R.string.basketball_lineups_turnovers);
            case 6:
                return new q9k(R.string.turnovers);
            case 7:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics4 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics4.getClass();
                String y03 = o02.y0(basketballPlayerSeasonStatistics4.getTurnovers());
                Regex regex3 = yid.a;
                return y03;
            case 8:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics5 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics5.getClass();
                Integer turnovers = basketballPlayerSeasonStatistics5.getTurnovers();
                String l = turnovers != null ? rei.l(yid.m(basketballPlayerSeasonStatistics5.getAppearances()), Integer.valueOf(turnovers.intValue())) : null;
                Regex regex4 = yid.a;
                return l == null ? "-" : l;
            case 9:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics6 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics6.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics6.getTurnovers()));
            case 10:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                d73 d73Var = c73Var.c;
                Integer fieldGoalsMade = (d73Var == null || (wygVar2 = d73Var.c) == null || (b = rr1.b(wygVar2)) == null) ? null : b.getFieldGoalsMade();
                if (d73Var != null && (wygVar = d73Var.c) != null && (abstractPlayerSeasonStatistics = wygVar.a) != null) {
                    num13 = abstractPlayerSeasonStatistics.getAppearances();
                }
                return td4.n0(fieldGoalsMade, num13);
            case 11:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                d73 d73Var2 = c73Var2.c;
                Integer rebounds = (d73Var2 == null || (wygVar4 = d73Var2.c) == null || (b2 = rr1.b(wygVar4)) == null) ? null : b2.getRebounds();
                if (d73Var2 != null && (wygVar3 = d73Var2.c) != null && (abstractPlayerSeasonStatistics2 = wygVar3.a) != null) {
                    num12 = abstractPlayerSeasonStatistics2.getAppearances();
                }
                return td4.n0(rebounds, num12);
            case 12:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                d73 d73Var3 = c73Var3.c;
                Integer defensiveRebounds = (d73Var3 == null || (wygVar6 = d73Var3.c) == null || (b3 = rr1.b(wygVar6)) == null) ? null : b3.getDefensiveRebounds();
                if (d73Var3 != null && (wygVar5 = d73Var3.c) != null && (abstractPlayerSeasonStatistics3 = wygVar5.a) != null) {
                    num11 = abstractPlayerSeasonStatistics3.getAppearances();
                }
                return td4.n0(defensiveRebounds, num11);
            case 13:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                d73 d73Var4 = c73Var4.c;
                Integer offensiveRebounds = (d73Var4 == null || (wygVar8 = d73Var4.c) == null || (b4 = rr1.b(wygVar8)) == null) ? null : b4.getOffensiveRebounds();
                if (d73Var4 != null && (wygVar7 = d73Var4.c) != null && (abstractPlayerSeasonStatistics4 = wygVar7.a) != null) {
                    num10 = abstractPlayerSeasonStatistics4.getAppearances();
                }
                return td4.n0(offensiveRebounds, num10);
            case 14:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                d73 d73Var5 = c73Var5.c;
                Integer assists = (d73Var5 == null || (wygVar10 = d73Var5.c) == null || (b5 = rr1.b(wygVar10)) == null) ? null : b5.getAssists();
                if (d73Var5 != null && (wygVar9 = d73Var5.c) != null && (abstractPlayerSeasonStatistics5 = wygVar9.a) != null) {
                    num9 = abstractPlayerSeasonStatistics5.getAppearances();
                }
                return td4.n0(assists, num9);
            case 15:
                c73 c73Var6 = (c73) obj;
                c73Var6.getClass();
                d73 d73Var6 = c73Var6.c;
                Integer turnovers2 = (d73Var6 == null || (wygVar12 = d73Var6.c) == null || (b6 = rr1.b(wygVar12)) == null) ? null : b6.getTurnovers();
                if (d73Var6 != null && (wygVar11 = d73Var6.c) != null && (abstractPlayerSeasonStatistics6 = wygVar11.a) != null) {
                    num8 = abstractPlayerSeasonStatistics6.getAppearances();
                }
                return yid.h(td4.n0(turnovers2, num8));
            case 16:
                c73 c73Var7 = (c73) obj;
                c73Var7.getClass();
                qo2 qo2Var = c73Var7.a;
                a73 a73Var = qo2Var instanceof a73 ? (a73) qo2Var : null;
                Player player = a73Var != null ? a73Var.c : null;
                d73 d73Var7 = c73Var7.c;
                if (d73Var7 != null && (team = d73Var7.f) != null) {
                    return team;
                }
                if (player != null) {
                    return player.getTeam();
                }
                return null;
            case 17:
                c73 c73Var8 = (c73) obj;
                c73Var8.getClass();
                d73 d73Var8 = c73Var8.c;
                Integer steals = (d73Var8 == null || (wygVar14 = d73Var8.c) == null || (b7 = rr1.b(wygVar14)) == null) ? null : b7.getSteals();
                if (d73Var8 != null && (wygVar13 = d73Var8.c) != null && (abstractPlayerSeasonStatistics7 = wygVar13.a) != null) {
                    num7 = abstractPlayerSeasonStatistics7.getAppearances();
                }
                return td4.n0(steals, num7);
            case 18:
                c73 c73Var9 = (c73) obj;
                c73Var9.getClass();
                d73 d73Var9 = c73Var9.c;
                if (d73Var9 == null || (wygVar15 = d73Var9.c) == null || (b8 = rr1.b(wygVar15)) == null) {
                    return null;
                }
                return b8.getAssistTurnoverRatio();
            case 19:
                c73 c73Var10 = (c73) obj;
                c73Var10.getClass();
                d73 d73Var10 = c73Var10.c;
                Integer blocks = (d73Var10 == null || (wygVar17 = d73Var10.c) == null || (b9 = rr1.b(wygVar17)) == null) ? null : b9.getBlocks();
                if (d73Var10 != null && (wygVar16 = d73Var10.c) != null && (abstractPlayerSeasonStatistics8 = wygVar16.a) != null) {
                    num6 = abstractPlayerSeasonStatistics8.getAppearances();
                }
                return td4.n0(blocks, num6);
            case 20:
                c73 c73Var11 = (c73) obj;
                c73Var11.getClass();
                d73 d73Var11 = c73Var11.c;
                Integer personalFouls = (d73Var11 == null || (wygVar19 = d73Var11.c) == null || (b10 = rr1.b(wygVar19)) == null) ? null : b10.getPersonalFouls();
                if (d73Var11 != null && (wygVar18 = d73Var11.c) != null && (abstractPlayerSeasonStatistics9 = wygVar18.a) != null) {
                    num5 = abstractPlayerSeasonStatistics9.getAppearances();
                }
                return yid.h(td4.n0(personalFouls, num5));
            case 21:
                c73 c73Var12 = (c73) obj;
                c73Var12.getClass();
                d73 d73Var12 = c73Var12.c;
                Integer plusMinus = (d73Var12 == null || (wygVar21 = d73Var12.c) == null || (b11 = rr1.b(wygVar21)) == null) ? null : b11.getPlusMinus();
                if (d73Var12 != null && (wygVar20 = d73Var12.c) != null && (abstractPlayerSeasonStatistics10 = wygVar20.a) != null) {
                    num4 = abstractPlayerSeasonStatistics10.getAppearances();
                }
                return td4.n0(plusMinus, num4);
            case 22:
                c73 c73Var13 = (c73) obj;
                c73Var13.getClass();
                d73 d73Var13 = c73Var13.c;
                if (d73Var13 == null || (wygVar22 = d73Var13.c) == null || (b12 = rr1.b(wygVar22)) == null || (rating = b12.getRating()) == null || rating.doubleValue() <= 0.0d) {
                    return null;
                }
                return rating;
            case 23:
                c73 c73Var14 = (c73) obj;
                c73Var14.getClass();
                d73 d73Var14 = c73Var14.c;
                Integer pir = (d73Var14 == null || (wygVar24 = d73Var14.c) == null || (b13 = rr1.b(wygVar24)) == null) ? null : b13.getPir();
                if (d73Var14 != null && (wygVar23 = d73Var14.c) != null && (abstractPlayerSeasonStatistics11 = wygVar23.a) != null) {
                    num3 = abstractPlayerSeasonStatistics11.getAppearances();
                }
                return td4.n0(pir, num3);
            case 24:
                c73 c73Var15 = (c73) obj;
                c73Var15.getClass();
                d73 d73Var15 = c73Var15.c;
                if (d73Var15 == null || (wygVar25 = d73Var15.c) == null || (b14 = rr1.b(wygVar25)) == null) {
                    return null;
                }
                return b14.getDoubleDoubles();
            case 25:
                c73 c73Var16 = (c73) obj;
                c73Var16.getClass();
                d73 d73Var16 = c73Var16.c;
                Integer points = (d73Var16 == null || (wygVar27 = d73Var16.c) == null || (b15 = rr1.b(wygVar27)) == null) ? null : b15.getPoints();
                if (d73Var16 != null && (wygVar26 = d73Var16.c) != null && (abstractPlayerSeasonStatistics12 = wygVar26.a) != null) {
                    num2 = abstractPlayerSeasonStatistics12.getAppearances();
                }
                return td4.n0(points, num2);
            case 26:
                c73 c73Var17 = (c73) obj;
                c73Var17.getClass();
                d73 d73Var17 = c73Var17.c;
                if (d73Var17 == null || (wygVar28 = d73Var17.c) == null || (b16 = rr1.b(wygVar28)) == null) {
                    return null;
                }
                return b16.getTripleDoubles();
            case 27:
                c73 c73Var18 = (c73) obj;
                c73Var18.getClass();
                d73 d73Var18 = c73Var18.c;
                if (d73Var18 == null || (wygVar29 = d73Var18.c) == null || (b17 = rr1.b(wygVar29)) == null) {
                    return null;
                }
                return b17.getAppearances();
            case 28:
                c73 c73Var19 = (c73) obj;
                c73Var19.getClass();
                d73 d73Var19 = c73Var19.c;
                BasketballPlayerSeasonStatistics b19 = (d73Var19 == null || (wygVar30 = d73Var19.c) == null) ? null : rr1.b(wygVar30);
                if (b19 == null || (appearances = b19.getAppearances()) == null) {
                    return null;
                }
                if (appearances.intValue() <= 0) {
                    appearances = null;
                }
                if (appearances == null) {
                    return null;
                }
                int intValue = appearances.intValue();
                Integer secondsPlayed = b19.getSecondsPlayed();
                if (secondsPlayed == null) {
                    return null;
                }
                if (secondsPlayed.intValue() <= 0) {
                    secondsPlayed = null;
                }
                if (secondsPlayed != null) {
                    return Float.valueOf(secondsPlayed.intValue() / (intValue * 60.0f));
                }
                return null;
            default:
                c73 c73Var20 = (c73) obj;
                c73Var20.getClass();
                d73 d73Var20 = c73Var20.c;
                Integer freeThrowsMade = (d73Var20 == null || (wygVar32 = d73Var20.c) == null || (b18 = rr1.b(wygVar32)) == null) ? null : b18.getFreeThrowsMade();
                if (d73Var20 != null && (wygVar31 = d73Var20.c) != null && (abstractPlayerSeasonStatistics13 = wygVar31.a) != null) {
                    num = abstractPlayerSeasonStatistics13.getAppearances();
                }
                return td4.n0(freeThrowsMade, num);
        }
    }
}
