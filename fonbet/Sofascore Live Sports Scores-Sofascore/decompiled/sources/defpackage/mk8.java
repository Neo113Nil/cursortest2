package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mk8 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ mk8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wyg wygVar;
        FootballPlayerSeasonStatistics B;
        Integer bigChancesMissed;
        wyg wygVar2;
        FootballPlayerSeasonStatistics B2;
        wyg wygVar3;
        FootballPlayerSeasonStatistics B3;
        Integer assists;
        wyg wygVar4;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        wyg wygVar5;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics2;
        wyg wygVar6;
        FootballPlayerSeasonStatistics B4;
        wyg wygVar7;
        FootballPlayerSeasonStatistics B5;
        wyg wygVar8;
        FootballPlayerSeasonStatistics B6;
        wyg wygVar9;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics3;
        wyg wygVar10;
        FootballPlayerSeasonStatistics B7;
        wyg wygVar11;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics4;
        wyg wygVar12;
        FootballPlayerSeasonStatistics B8;
        wyg wygVar13;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics5;
        wyg wygVar14;
        FootballPlayerSeasonStatistics B9;
        wyg wygVar15;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics6;
        wyg wygVar16;
        FootballPlayerSeasonStatistics B10;
        Team team;
        wyg wygVar17;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics7;
        wyg wygVar18;
        FootballPlayerSeasonStatistics B11;
        wyg wygVar19;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics8;
        wyg wygVar20;
        FootballPlayerSeasonStatistics B12;
        wyg wygVar21;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics9;
        wyg wygVar22;
        FootballPlayerSeasonStatistics B13;
        wyg wygVar23;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics10;
        wyg wygVar24;
        FootballPlayerSeasonStatistics B14;
        wyg wygVar25;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics11;
        wyg wygVar26;
        FootballPlayerSeasonStatistics B15;
        wyg wygVar27;
        FootballPlayerSeasonStatistics B16;
        Double rating;
        wyg wygVar28;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics12;
        wyg wygVar29;
        FootballPlayerSeasonStatistics B17;
        wyg wygVar30;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics13;
        wyg wygVar31;
        FootballPlayerSeasonStatistics B18;
        wyg wygVar32;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics14;
        wyg wygVar33;
        FootballPlayerSeasonStatistics B19;
        wyg wygVar34;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics15;
        wyg wygVar35;
        FootballPlayerSeasonStatistics B20;
        wyg wygVar36;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics16;
        wyg wygVar37;
        FootballPlayerSeasonStatistics B21;
        wyg wygVar38;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics17;
        wyg wygVar39;
        FootballPlayerSeasonStatistics B22;
        wyg wygVar40;
        FootballPlayerSeasonStatistics B23;
        wyg wygVar41;
        FootballPlayerSeasonStatistics B24;
        wyg wygVar42;
        FootballPlayerSeasonStatistics B25;
        wyg wygVar43;
        FootballPlayerSeasonStatistics B26;
        Integer minutesPlayed;
        wyg wygVar44;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics18;
        wyg wygVar45;
        FootballPlayerSeasonStatistics B27;
        Integer minutesPlayed2;
        wyg wygVar46;
        FootballPlayerSeasonStatistics B28;
        wyg wygVar47;
        FootballPlayerSeasonStatistics B29;
        Integer num = null;
        c73 c73Var = (c73) obj;
        switch (this.a) {
            case 0:
                c73Var.getClass();
                d73 d73Var = c73Var.c;
                if (d73Var == null || (wygVar = d73Var.c) == null || (B = o1j.B(wygVar)) == null || (bigChancesMissed = B.getBigChancesMissed()) == null) {
                    return null;
                }
                return yid.i(bigChancesMissed);
            case 1:
                c73Var.getClass();
                d73 d73Var2 = c73Var.c;
                if (d73Var2 == null || (wygVar2 = d73Var2.c) == null || (B2 = o1j.B(wygVar2)) == null) {
                    return null;
                }
                return B2.getAssists();
            case 2:
                c73Var.getClass();
                d73 d73Var3 = c73Var.c;
                if (d73Var3 == null || (wygVar3 = d73Var3.c) == null || (B3 = o1j.B(wygVar3)) == null || (assists = B3.getAssists()) == null) {
                    return null;
                }
                if (d73Var3 != null && (wygVar4 = d73Var3.c) != null && (abstractPlayerSeasonStatistics = wygVar4.a) != null) {
                    num = abstractPlayerSeasonStatistics.getAppearances();
                }
                return td4.n0(assists, num);
            case 3:
                c73Var.getClass();
                d73 d73Var4 = c73Var.c;
                Integer accurateLongBalls = (d73Var4 == null || (wygVar6 = d73Var4.c) == null || (B4 = o1j.B(wygVar6)) == null) ? null : B4.getAccurateLongBalls();
                if (d73Var4 != null && (wygVar5 = d73Var4.c) != null && (abstractPlayerSeasonStatistics2 = wygVar5.a) != null) {
                    num = abstractPlayerSeasonStatistics2.getAppearances();
                }
                return td4.n0(accurateLongBalls, num);
            case 4:
                c73Var.getClass();
                d73 d73Var5 = c73Var.c;
                if (d73Var5 == null || (wygVar7 = d73Var5.c) == null || (B5 = o1j.B(wygVar7)) == null) {
                    return null;
                }
                return B5.getExpectedAssists();
            case 5:
                c73Var.getClass();
                d73 d73Var6 = c73Var.c;
                if (d73Var6 == null || (wygVar8 = d73Var6.c) == null || (B6 = o1j.B(wygVar8)) == null) {
                    return null;
                }
                return B6.getBigChancesCreated();
            case 6:
                c73Var.getClass();
                d73 d73Var7 = c73Var.c;
                Integer accurateLongBalls2 = (d73Var7 == null || (wygVar10 = d73Var7.c) == null || (B7 = o1j.B(wygVar10)) == null) ? null : B7.getAccurateLongBalls();
                if (d73Var7 != null && (wygVar9 = d73Var7.c) != null && (abstractPlayerSeasonStatistics3 = wygVar9.a) != null) {
                    num = abstractPlayerSeasonStatistics3.getAppearances();
                }
                return td4.n0(accurateLongBalls2, num);
            case 7:
                c73Var.getClass();
                d73 d73Var8 = c73Var.c;
                Integer accurateCrosses = (d73Var8 == null || (wygVar12 = d73Var8.c) == null || (B8 = o1j.B(wygVar12)) == null) ? null : B8.getAccurateCrosses();
                if (d73Var8 != null && (wygVar11 = d73Var8.c) != null && (abstractPlayerSeasonStatistics4 = wygVar11.a) != null) {
                    num = abstractPlayerSeasonStatistics4.getAppearances();
                }
                return td4.n0(accurateCrosses, num);
            case 8:
                c73Var.getClass();
                d73 d73Var9 = c73Var.c;
                Integer goalsConceded = (d73Var9 == null || (wygVar14 = d73Var9.c) == null || (B9 = o1j.B(wygVar14)) == null) ? null : B9.getGoalsConceded();
                if (d73Var9 != null && (wygVar13 = d73Var9.c) != null && (abstractPlayerSeasonStatistics5 = wygVar13.a) != null) {
                    num = abstractPlayerSeasonStatistics5.getAppearances();
                }
                return yid.h(td4.n0(goalsConceded, num));
            case 9:
                c73Var.getClass();
                d73 d73Var10 = c73Var.c;
                Integer interceptions = (d73Var10 == null || (wygVar16 = d73Var10.c) == null || (B10 = o1j.B(wygVar16)) == null) ? null : B10.getInterceptions();
                if (d73Var10 != null && (wygVar15 = d73Var10.c) != null && (abstractPlayerSeasonStatistics6 = wygVar15.a) != null) {
                    num = abstractPlayerSeasonStatistics6.getAppearances();
                }
                return td4.n0(interceptions, num);
            case 10:
                c73Var.getClass();
                qo2 qo2Var = c73Var.a;
                a73 a73Var = qo2Var instanceof a73 ? (a73) qo2Var : null;
                Player player = a73Var != null ? a73Var.c : null;
                d73 d73Var11 = c73Var.c;
                if (d73Var11 != null && (team = d73Var11.f) != null) {
                    return team;
                }
                if (player != null) {
                    return player.getTeam();
                }
                return null;
            case 11:
                c73Var.getClass();
                d73 d73Var12 = c73Var.c;
                Integer tackles = (d73Var12 == null || (wygVar18 = d73Var12.c) == null || (B11 = o1j.B(wygVar18)) == null) ? null : B11.getTackles();
                if (d73Var12 != null && (wygVar17 = d73Var12.c) != null && (abstractPlayerSeasonStatistics7 = wygVar17.a) != null) {
                    num = abstractPlayerSeasonStatistics7.getAppearances();
                }
                return td4.n0(tackles, num);
            case 12:
                c73Var.getClass();
                d73 d73Var13 = c73Var.c;
                Integer dribbledPast = (d73Var13 == null || (wygVar20 = d73Var13.c) == null || (B12 = o1j.B(wygVar20)) == null) ? null : B12.getDribbledPast();
                if (d73Var13 != null && (wygVar19 = d73Var13.c) != null && (abstractPlayerSeasonStatistics8 = wygVar19.a) != null) {
                    num = abstractPlayerSeasonStatistics8.getAppearances();
                }
                return yid.h(td4.n0(dribbledPast, num));
            case 13:
                c73Var.getClass();
                d73 d73Var14 = c73Var.c;
                Integer clearances = (d73Var14 == null || (wygVar22 = d73Var14.c) == null || (B13 = o1j.B(wygVar22)) == null) ? null : B13.getClearances();
                if (d73Var14 != null && (wygVar21 = d73Var14.c) != null && (abstractPlayerSeasonStatistics9 = wygVar21.a) != null) {
                    num = abstractPlayerSeasonStatistics9.getAppearances();
                }
                return td4.n0(clearances, num);
            case 14:
                c73Var.getClass();
                d73 d73Var15 = c73Var.c;
                Integer outfielderBlocks = (d73Var15 == null || (wygVar24 = d73Var15.c) == null || (B14 = o1j.B(wygVar24)) == null) ? null : B14.getOutfielderBlocks();
                if (d73Var15 != null && (wygVar23 = d73Var15.c) != null && (abstractPlayerSeasonStatistics10 = wygVar23.a) != null) {
                    num = abstractPlayerSeasonStatistics10.getAppearances();
                }
                return td4.n0(outfielderBlocks, num);
            case 15:
                c73Var.getClass();
                d73 d73Var16 = c73Var.c;
                Integer successfulDribbles = (d73Var16 == null || (wygVar26 = d73Var16.c) == null || (B15 = o1j.B(wygVar26)) == null) ? null : B15.getSuccessfulDribbles();
                if (d73Var16 != null && (wygVar25 = d73Var16.c) != null && (abstractPlayerSeasonStatistics11 = wygVar25.a) != null) {
                    num = abstractPlayerSeasonStatistics11.getAppearances();
                }
                return td4.n0(successfulDribbles, num);
            case 16:
                c73Var.getClass();
                d73 d73Var17 = c73Var.c;
                if (d73Var17 == null || (wygVar27 = d73Var17.c) == null || (B16 = o1j.B(wygVar27)) == null || (rating = B16.getRating()) == null || rating.doubleValue() <= 0.0d) {
                    return null;
                }
                return rating;
            case 17:
                c73Var.getClass();
                d73 d73Var18 = c73Var.c;
                Integer groundDuelsWon = (d73Var18 == null || (wygVar29 = d73Var18.c) == null || (B17 = o1j.B(wygVar29)) == null) ? null : B17.getGroundDuelsWon();
                if (d73Var18 != null && (wygVar28 = d73Var18.c) != null && (abstractPlayerSeasonStatistics12 = wygVar28.a) != null) {
                    num = abstractPlayerSeasonStatistics12.getAppearances();
                }
                return td4.n0(groundDuelsWon, num);
            case 18:
                c73Var.getClass();
                d73 d73Var19 = c73Var.c;
                Integer aerialDuelsWon = (d73Var19 == null || (wygVar31 = d73Var19.c) == null || (B18 = o1j.B(wygVar31)) == null) ? null : B18.getAerialDuelsWon();
                if (d73Var19 != null && (wygVar30 = d73Var19.c) != null && (abstractPlayerSeasonStatistics13 = wygVar30.a) != null) {
                    num = abstractPlayerSeasonStatistics13.getAppearances();
                }
                return td4.n0(aerialDuelsWon, num);
            case 19:
                c73Var.getClass();
                d73 d73Var20 = c73Var.c;
                Integer possessionLost = (d73Var20 == null || (wygVar33 = d73Var20.c) == null || (B19 = o1j.B(wygVar33)) == null) ? null : B19.getPossessionLost();
                if (d73Var20 != null && (wygVar32 = d73Var20.c) != null && (abstractPlayerSeasonStatistics14 = wygVar32.a) != null) {
                    num = abstractPlayerSeasonStatistics14.getAppearances();
                }
                return yid.h(td4.n0(possessionLost, num));
            case 20:
                c73Var.getClass();
                d73 d73Var21 = c73Var.c;
                Integer saves = (d73Var21 == null || (wygVar35 = d73Var21.c) == null || (B20 = o1j.B(wygVar35)) == null) ? null : B20.getSaves();
                if (d73Var21 != null && (wygVar34 = d73Var21.c) != null && (abstractPlayerSeasonStatistics15 = wygVar34.a) != null) {
                    num = abstractPlayerSeasonStatistics15.getAppearances();
                }
                return td4.n0(saves, num);
            case 21:
                c73Var.getClass();
                d73 d73Var22 = c73Var.c;
                Integer fouls = (d73Var22 == null || (wygVar37 = d73Var22.c) == null || (B21 = o1j.B(wygVar37)) == null) ? null : B21.getFouls();
                if (d73Var22 != null && (wygVar36 = d73Var22.c) != null && (abstractPlayerSeasonStatistics16 = wygVar36.a) != null) {
                    num = abstractPlayerSeasonStatistics16.getAppearances();
                }
                return yid.h(td4.n0(fouls, num));
            case 22:
                c73Var.getClass();
                d73 d73Var23 = c73Var.c;
                Integer wasFouled = (d73Var23 == null || (wygVar39 = d73Var23.c) == null || (B22 = o1j.B(wygVar39)) == null) ? null : B22.getWasFouled();
                if (d73Var23 != null && (wygVar38 = d73Var23.c) != null && (abstractPlayerSeasonStatistics17 = wygVar38.a) != null) {
                    num = abstractPlayerSeasonStatistics17.getAppearances();
                }
                return td4.n0(wasFouled, num);
            case 23:
                c73Var.getClass();
                d73 d73Var24 = c73Var.c;
                if (d73Var24 != null && (wygVar40 = d73Var24.c) != null && (B23 = o1j.B(wygVar40)) != null) {
                    num = B23.getYellowCards();
                }
                return yid.i(num);
            case 24:
                c73Var.getClass();
                d73 d73Var25 = c73Var.c;
                if (d73Var25 != null && (wygVar41 = d73Var25.c) != null && (B24 = o1j.B(wygVar41)) != null) {
                    num = B24.getYellowRedCards();
                }
                return yid.i(num);
            case 25:
                c73Var.getClass();
                d73 d73Var26 = c73Var.c;
                if (d73Var26 != null && (wygVar42 = d73Var26.c) != null && (B25 = o1j.B(wygVar42)) != null) {
                    num = B25.getRedCards();
                }
                return yid.i(num);
            case 26:
                c73Var.getClass();
                d73 d73Var27 = c73Var.c;
                if (d73Var27 == null || (wygVar43 = d73Var27.c) == null || (B26 = o1j.B(wygVar43)) == null || (minutesPlayed = B26.getMinutesPlayed()) == null) {
                    return null;
                }
                if (minutesPlayed.intValue() <= 0) {
                    minutesPlayed = null;
                }
                if (minutesPlayed == null) {
                    return null;
                }
                Double n0 = td4.n0(minutesPlayed, (d73Var27 == null || (wygVar44 = d73Var27.c) == null || (abstractPlayerSeasonStatistics18 = wygVar44.a) == null) ? null : abstractPlayerSeasonStatistics18.getAppearances());
                if (n0 != null) {
                    return Integer.valueOf(wzb.a(n0.doubleValue()));
                }
                return null;
            case 27:
                c73Var.getClass();
                d73 d73Var28 = c73Var.c;
                if (d73Var28 == null || (wygVar45 = d73Var28.c) == null || (B27 = o1j.B(wygVar45)) == null || (minutesPlayed2 = B27.getMinutesPlayed()) == null || minutesPlayed2.intValue() <= 0) {
                    return null;
                }
                return minutesPlayed2;
            case 28:
                c73Var.getClass();
                d73 d73Var29 = c73Var.c;
                if (d73Var29 == null || (wygVar46 = d73Var29.c) == null || (B28 = o1j.B(wygVar46)) == null) {
                    return null;
                }
                return B28.getGoalsPrevented();
            default:
                c73Var.getClass();
                d73 d73Var30 = c73Var.c;
                if (d73Var30 == null || (wygVar47 = d73Var30.c) == null || (B29 = o1j.B(wygVar47)) == null) {
                    return null;
                }
                return B29.getCleanSheet();
        }
    }
}
