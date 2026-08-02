package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sofascore.model.Money;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class lk8 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ lk8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wyg wygVar;
        FootballPlayerSeasonStatistics B;
        Integer bigChancesMissed;
        wyg wygVar2;
        FootballPlayerSeasonStatistics B2;
        Integer assists;
        wyg wygVar3;
        FootballPlayerSeasonStatistics B3;
        Integer assists2;
        wyg wygVar4;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        wyg wygVar5;
        FootballPlayerSeasonStatistics B4;
        Money proposedMarketValueRaw;
        wyg wygVar6;
        FootballPlayerSeasonStatistics B5;
        Integer bigChancesCreated;
        Integer accurateLongBalls;
        wyg wygVar7;
        Integer accurateCrosses;
        wyg wygVar8;
        wyg wygVar9;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics2;
        wyg wygVar10;
        FootballPlayerSeasonStatistics B6;
        wyg wygVar11;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics3;
        wyg wygVar12;
        FootballPlayerSeasonStatistics B7;
        wyg wygVar13;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics4;
        wyg wygVar14;
        FootballPlayerSeasonStatistics B8;
        wyg wygVar15;
        FootballPlayerSeasonStatistics B9;
        Integer clearances;
        wyg wygVar16;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics5;
        wyg wygVar17;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics6;
        wyg wygVar18;
        FootballPlayerSeasonStatistics B10;
        Integer appearances;
        wyg wygVar19;
        Integer successfulDribbles;
        wyg wygVar20;
        Integer groundDuelsWon;
        wyg wygVar21;
        Integer aerialDuelsWon;
        wyg wygVar22;
        wyg wygVar23;
        FootballPlayerSeasonStatistics B11;
        Integer possessionLost;
        wyg wygVar24;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics7;
        wyg wygVar25;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics8;
        wyg wygVar26;
        FootballPlayerSeasonStatistics B12;
        wyg wygVar27;
        FootballPlayerSeasonStatistics B13;
        Integer wasFouled;
        wyg wygVar28;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics9;
        wyg wygVar29;
        FootballPlayerSeasonStatistics B14;
        Integer yellowCards;
        ryg rygVar;
        wyg wygVar30;
        FootballPlayerSeasonStatistics B15;
        Integer yellowRedCards;
        wyg wygVar31;
        FootballPlayerSeasonStatistics B16;
        Integer redCards;
        wyg wygVar32;
        FootballPlayerSeasonStatistics B17;
        wyg wygVar33;
        FootballPlayerSeasonStatistics B18;
        Integer minutesPlayed;
        wyg wygVar34;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics10;
        wyg wygVar35;
        FootballPlayerSeasonStatistics B19;
        Integer minutesPlayed2;
        wyg wygVar36;
        FootballPlayerSeasonStatistics B20;
        Integer cleanSheet;
        Double averageBallPossession;
        Integer accuratePasses;
        int i = 1;
        Double d = null;
        r2 = null;
        r2 = null;
        Double d2 = null;
        r2 = null;
        r2 = null;
        Integer num = null;
        r2 = null;
        r2 = null;
        Integer num2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        Double d3 = null;
        r2 = null;
        r2 = null;
        Double d4 = null;
        r2 = null;
        r2 = null;
        Integer num3 = null;
        d = null;
        d = null;
        d = null;
        c73 c73Var = (c73) obj;
        switch (this.a) {
            case 0:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var = c73Var.c;
                if (d73Var == null || (wygVar = d73Var.c) == null || (B = o1j.B(wygVar)) == null || (bigChancesMissed = B.getBigChancesMissed()) == null) {
                    return null;
                }
                return String.valueOf(bigChancesMissed.intValue());
            case 1:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var2 = c73Var.c;
                if (d73Var2 == null || (wygVar2 = d73Var2.c) == null || (B2 = o1j.B(wygVar2)) == null || (assists = B2.getAssists()) == null) {
                    return null;
                }
                return String.valueOf(assists.intValue());
            case 2:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var3 = c73Var.c;
                if (d73Var3 != null && (wygVar3 = d73Var3.c) != null && (B3 = o1j.B(wygVar3)) != null && (assists2 = B3.getAssists()) != null) {
                    if (d73Var3 != null && (wygVar4 = d73Var3.c) != null && (abstractPlayerSeasonStatistics = wygVar4.a) != null) {
                        num3 = abstractPlayerSeasonStatistics.getAppearances();
                    }
                    d = td4.n0(assists2, num3);
                }
                return o1j.z(d);
            case 3:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var4 = c73Var.c;
                if (d73Var4 != null && (wygVar5 = d73Var4.c) != null && (B4 = o1j.B(wygVar5)) != null) {
                    d4 = B4.getExpectedAssists();
                }
                return yid.g(d4);
            case 4:
                Context context = (Context) obj2;
                c73Var.getClass();
                context.getClass();
                qo2 qo2Var = c73Var.a;
                a73 a73Var = qo2Var instanceof a73 ? (a73) qo2Var : null;
                if (a73Var == null || (proposedMarketValueRaw = a73Var.c.getProposedMarketValueRaw()) == null) {
                    return null;
                }
                Set set = o84.a;
                return o84.a(context, proposedMarketValueRaw, 0L, 12);
            case 5:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var5 = c73Var.c;
                if (d73Var5 == null || (wygVar6 = d73Var5.c) == null || (B5 = o1j.B(wygVar6)) == null || (bigChancesCreated = B5.getBigChancesCreated()) == null) {
                    return null;
                }
                return String.valueOf(bigChancesCreated.intValue());
            case 6:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var6 = c73Var.c;
                FootballPlayerSeasonStatistics B21 = (d73Var6 == null || (wygVar7 = d73Var6.c) == null) ? null : o1j.B(wygVar7);
                if (B21 == null || (accurateLongBalls = B21.getAccurateLongBalls()) == null) {
                    return null;
                }
                Integer valueOf = Integer.valueOf(accurateLongBalls.intValue());
                Integer appearances2 = B21.getAppearances();
                if (appearances2 != null) {
                    Integer num4 = appearances2.intValue() > 0 ? appearances2 : null;
                    if (num4 != null) {
                        i = num4.intValue();
                    }
                }
                return rei.o(valueOf, Integer.valueOf(i), B21.getAccurateLongBallsPercentage(), 0);
            case 7:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var7 = c73Var.c;
                FootballPlayerSeasonStatistics B22 = (d73Var7 == null || (wygVar8 = d73Var7.c) == null) ? null : o1j.B(wygVar8);
                if (B22 == null || (accurateCrosses = B22.getAccurateCrosses()) == null) {
                    return null;
                }
                Integer valueOf2 = Integer.valueOf(accurateCrosses.intValue());
                Integer appearances3 = B22.getAppearances();
                if (appearances3 != null) {
                    Integer num5 = appearances3.intValue() > 0 ? appearances3 : null;
                    if (num5 != null) {
                        i = num5.intValue();
                    }
                }
                return rei.o(valueOf2, Integer.valueOf(i), B22.getAccurateCrossesPercentage(), 0);
            case 8:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var8 = c73Var.c;
                Double n0 = td4.n0((d73Var8 == null || (wygVar10 = d73Var8.c) == null || (B6 = o1j.B(wygVar10)) == null) ? null : B6.getInterceptions(), (d73Var8 == null || (wygVar9 = d73Var8.c) == null || (abstractPlayerSeasonStatistics2 = wygVar9.a) == null) ? null : abstractPlayerSeasonStatistics2.getAppearances());
                if (n0 != null) {
                    return o1j.z(n0);
                }
                return null;
            case 9:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var9 = c73Var.c;
                Double n02 = td4.n0((d73Var9 == null || (wygVar12 = d73Var9.c) == null || (B7 = o1j.B(wygVar12)) == null) ? null : B7.getTackles(), (d73Var9 == null || (wygVar11 = d73Var9.c) == null || (abstractPlayerSeasonStatistics3 = wygVar11.a) == null) ? null : abstractPlayerSeasonStatistics3.getAppearances());
                if (n02 != null) {
                    return o1j.z(n02);
                }
                return null;
            case 10:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var10 = c73Var.c;
                Double n03 = td4.n0((d73Var10 == null || (wygVar14 = d73Var10.c) == null || (B8 = o1j.B(wygVar14)) == null) ? null : B8.getDribbledPast(), (d73Var10 == null || (wygVar13 = d73Var10.c) == null || (abstractPlayerSeasonStatistics4 = wygVar13.a) == null) ? null : abstractPlayerSeasonStatistics4.getAppearances());
                if (n03 != null) {
                    return o1j.z(n03);
                }
                return null;
            case 11:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var11 = c73Var.c;
                if (d73Var11 != null && (wygVar15 = d73Var11.c) != null && (B9 = o1j.B(wygVar15)) != null && (clearances = B9.getClearances()) != null) {
                    if (d73Var11 != null && (wygVar16 = d73Var11.c) != null && (abstractPlayerSeasonStatistics5 = wygVar16.a) != null) {
                        num2 = abstractPlayerSeasonStatistics5.getAppearances();
                    }
                    d3 = td4.n0(clearances, num2);
                }
                return o1j.z(d3);
            case 12:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var12 = c73Var.c;
                Integer outfielderBlocks = (d73Var12 == null || (wygVar18 = d73Var12.c) == null || (B10 = o1j.B(wygVar18)) == null) ? null : B10.getOutfielderBlocks();
                if (d73Var12 != null && (wygVar17 = d73Var12.c) != null && (abstractPlayerSeasonStatistics6 = wygVar17.a) != null) {
                    num = abstractPlayerSeasonStatistics6.getAppearances();
                }
                return o1j.z(td4.n0(outfielderBlocks, num));
            case 13:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var13 = c73Var.c;
                FootballPlayerSeasonStatistics B23 = (d73Var13 == null || (wygVar19 = d73Var13.c) == null) ? null : o1j.B(wygVar19);
                int m = yid.m(B23 != null ? B23.getSaves() : null);
                int m2 = yid.m(B23 != null ? B23.getGoalsConceded() : null);
                Integer valueOf3 = Integer.valueOf(m);
                if (m + m2 <= 0) {
                    valueOf3 = null;
                }
                if (valueOf3 == null) {
                    return null;
                }
                int intValue = valueOf3.intValue();
                Integer valueOf4 = Integer.valueOf(intValue);
                if (B23 != null && (appearances = B23.getAppearances()) != null) {
                    Integer num6 = appearances.intValue() > 0 ? appearances : null;
                    if (num6 != null) {
                        i = num6.intValue();
                    }
                }
                return rei.o(valueOf4, Integer.valueOf(i), Double.valueOf((intValue * 100.0d) / (intValue + m2)), 0);
            case 14:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var14 = c73Var.c;
                FootballPlayerSeasonStatistics B24 = (d73Var14 == null || (wygVar20 = d73Var14.c) == null) ? null : o1j.B(wygVar20);
                if (B24 == null || (successfulDribbles = B24.getSuccessfulDribbles()) == null) {
                    return null;
                }
                Integer valueOf5 = Integer.valueOf(successfulDribbles.intValue());
                Integer appearances4 = B24.getAppearances();
                if (appearances4 != null) {
                    Integer num7 = appearances4.intValue() > 0 ? appearances4 : null;
                    if (num7 != null) {
                        i = num7.intValue();
                    }
                }
                return rei.o(valueOf5, Integer.valueOf(i), B24.getSuccessfulDribblesPercentage(), 0);
            case 15:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var15 = c73Var.c;
                FootballPlayerSeasonStatistics B25 = (d73Var15 == null || (wygVar21 = d73Var15.c) == null) ? null : o1j.B(wygVar21);
                if (B25 == null || (groundDuelsWon = B25.getGroundDuelsWon()) == null) {
                    return null;
                }
                Integer valueOf6 = Integer.valueOf(groundDuelsWon.intValue());
                Integer appearances5 = B25.getAppearances();
                if (appearances5 != null) {
                    Integer num8 = appearances5.intValue() > 0 ? appearances5 : null;
                    if (num8 != null) {
                        i = num8.intValue();
                    }
                }
                return rei.o(valueOf6, Integer.valueOf(i), B25.getGroundDuelsWonPercentage(), 0);
            case 16:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var16 = c73Var.c;
                FootballPlayerSeasonStatistics B26 = (d73Var16 == null || (wygVar22 = d73Var16.c) == null) ? null : o1j.B(wygVar22);
                if (B26 == null || (aerialDuelsWon = B26.getAerialDuelsWon()) == null) {
                    return null;
                }
                Integer valueOf7 = Integer.valueOf(aerialDuelsWon.intValue());
                Integer appearances6 = B26.getAppearances();
                if (appearances6 != null) {
                    Integer num9 = appearances6.intValue() > 0 ? appearances6 : null;
                    if (num9 != null) {
                        i = num9.intValue();
                    }
                }
                return rei.o(valueOf7, Integer.valueOf(i), B26.getAerialDuelsWonPercentage(), 0);
            case 17:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var17 = c73Var.c;
                if (d73Var17 == null || (wygVar23 = d73Var17.c) == null || (B11 = o1j.B(wygVar23)) == null || (possessionLost = B11.getPossessionLost()) == null) {
                    return null;
                }
                Double n04 = td4.n0(possessionLost, (d73Var17 == null || (wygVar24 = d73Var17.c) == null || (abstractPlayerSeasonStatistics7 = wygVar24.a) == null) ? null : abstractPlayerSeasonStatistics7.getAppearances());
                if (n04 != null) {
                    return o1j.z(n04);
                }
                return null;
            case 18:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var18 = c73Var.c;
                Double n05 = td4.n0((d73Var18 == null || (wygVar26 = d73Var18.c) == null || (B12 = o1j.B(wygVar26)) == null) ? null : B12.getFouls(), (d73Var18 == null || (wygVar25 = d73Var18.c) == null || (abstractPlayerSeasonStatistics8 = wygVar25.a) == null) ? null : abstractPlayerSeasonStatistics8.getAppearances());
                if (n05 != null) {
                    return o1j.z(n05);
                }
                return null;
            case 19:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var19 = c73Var.c;
                if (d73Var19 == null || (wygVar27 = d73Var19.c) == null || (B13 = o1j.B(wygVar27)) == null || (wasFouled = B13.getWasFouled()) == null) {
                    return null;
                }
                Double n06 = td4.n0(wasFouled, (d73Var19 == null || (wygVar28 = d73Var19.c) == null || (abstractPlayerSeasonStatistics9 = wygVar28.a) == null) ? null : abstractPlayerSeasonStatistics9.getAppearances());
                if (n06 != null) {
                    return o1j.z(n06);
                }
                return null;
            case 20:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var20 = c73Var.c;
                if (d73Var20 == null || (wygVar29 = d73Var20.c) == null || (B14 = o1j.B(wygVar29)) == null || (yellowCards = B14.getYellowCards()) == null) {
                    return null;
                }
                return String.valueOf(yellowCards.intValue());
            case 21:
                Context context2 = (Context) obj2;
                c73Var.getClass();
                context2.getClass();
                i99 C = c5n.C();
                d73 d73Var21 = c73Var.c;
                if (d73Var21 == null || (rygVar = d73Var21.d) == null) {
                    return null;
                }
                Bitmap a = C.a(context2, rygVar.b, rygVar.a, true, 2);
                int i2 = rygVar.c;
                int i3 = rygVar.d;
                int i4 = rygVar.e;
                StringBuilder s = lnb.s(i2, i3, "heatmap_", "_", "_");
                s.append(i4);
                return new v0i(a, s.toString());
            case 22:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var22 = c73Var.c;
                if (d73Var22 == null || (wygVar30 = d73Var22.c) == null || (B15 = o1j.B(wygVar30)) == null || (yellowRedCards = B15.getYellowRedCards()) == null) {
                    return null;
                }
                return String.valueOf(yellowRedCards.intValue());
            case 23:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var23 = c73Var.c;
                if (d73Var23 == null || (wygVar31 = d73Var23.c) == null || (B16 = o1j.B(wygVar31)) == null || (redCards = B16.getRedCards()) == null) {
                    return null;
                }
                return String.valueOf(redCards.intValue());
            case 24:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var24 = c73Var.c;
                if (d73Var24 != null && (wygVar32 = d73Var24.c) != null && (B17 = o1j.B(wygVar32)) != null) {
                    d2 = B17.getGoalsPrevented();
                }
                return yid.f(d2);
            case 25:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var25 = c73Var.c;
                if (d73Var25 == null || (wygVar33 = d73Var25.c) == null || (B18 = o1j.B(wygVar33)) == null || (minutesPlayed = B18.getMinutesPlayed()) == null) {
                    return null;
                }
                if (minutesPlayed.intValue() <= 0) {
                    minutesPlayed = null;
                }
                if (minutesPlayed == null) {
                    return null;
                }
                Double n07 = td4.n0(minutesPlayed, (d73Var25 == null || (wygVar34 = d73Var25.c) == null || (abstractPlayerSeasonStatistics10 = wygVar34.a) == null) ? null : abstractPlayerSeasonStatistics10.getAppearances());
                if (n07 != null) {
                    return String.valueOf(wzb.a(n07.doubleValue()));
                }
                return null;
            case 26:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var26 = c73Var.c;
                if (d73Var26 == null || (wygVar35 = d73Var26.c) == null || (B19 = o1j.B(wygVar35)) == null || (minutesPlayed2 = B19.getMinutesPlayed()) == null) {
                    return null;
                }
                if (minutesPlayed2.intValue() <= 0) {
                    minutesPlayed2 = null;
                }
                if (minutesPlayed2 != null) {
                    return String.valueOf(minutesPlayed2.intValue());
                }
                return null;
            case 27:
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var27 = c73Var.c;
                if (d73Var27 == null || (wygVar36 = d73Var27.c) == null || (B20 = o1j.B(wygVar36)) == null || (cleanSheet = B20.getCleanSheet()) == null) {
                    return null;
                }
                return String.valueOf(cleanSheet.intValue());
            case 28:
                FootballTeamSeasonStatistics c = fc6.c(c73Var, (Context) obj2, c73Var);
                if (c == null || (averageBallPossession = c.getAverageBallPossession()) == null) {
                    return null;
                }
                return rei.c(Double.valueOf(averageBallPossession.doubleValue()), 1, true);
            default:
                FootballTeamSeasonStatistics c2 = fc6.c(c73Var, (Context) obj2, c73Var);
                if (c2 == null || (accuratePasses = c2.getAccuratePasses()) == null) {
                    return null;
                }
                Integer valueOf8 = Integer.valueOf(accuratePasses.intValue());
                FootballTeamSeasonStatistics v = ktm.v(c73Var);
                Integer valueOf9 = v != null ? Integer.valueOf(v.getMatches()) : null;
                if (yid.m(valueOf9) <= 0) {
                    valueOf9 = null;
                }
                Integer valueOf10 = Integer.valueOf(valueOf9 != null ? valueOf9.intValue() : 1);
                FootballTeamSeasonStatistics v2 = ktm.v(c73Var);
                return rei.o(valueOf8, valueOf10, v2 != null ? v2.getAccuratePassesPercentage() : null, 1);
        }
    }
}
