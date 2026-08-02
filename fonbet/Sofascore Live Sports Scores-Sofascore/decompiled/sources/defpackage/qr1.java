package defpackage;

import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballTeamSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class qr1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ qr1(int i) {
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
        Integer num = null;
        r0 = null;
        r0 = null;
        Integer num2 = null;
        num = null;
        num = null;
        switch (this.a) {
            case 0:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                d73 d73Var = c73Var.c;
                Integer twoPointsMade = (d73Var == null || (wygVar2 = d73Var.c) == null || (b = rr1.b(wygVar2)) == null) ? null : b.getTwoPointsMade();
                if (d73Var != null && (wygVar = d73Var.c) != null && (abstractPlayerSeasonStatistics = wygVar.a) != null) {
                    num = abstractPlayerSeasonStatistics.getAppearances();
                }
                return td4.n0(twoPointsMade, num);
            case 1:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                d73 d73Var2 = c73Var2.c;
                Integer threePointsMade = (d73Var2 == null || (wygVar4 = d73Var2.c) == null || (b2 = rr1.b(wygVar4)) == null) ? null : b2.getThreePointsMade();
                if (d73Var2 != null && (wygVar3 = d73Var2.c) != null && (abstractPlayerSeasonStatistics2 = wygVar3.a) != null) {
                    num2 = abstractPlayerSeasonStatistics2.getAppearances();
                }
                return td4.n0(threePointsMade, num2);
            case 2:
                PlayerMatchesEventStatistics playerMatchesEventStatistics = (PlayerMatchesEventStatistics) obj;
                return String.valueOf(yid.k(playerMatchesEventStatistics != null ? Double.valueOf(playerMatchesEventStatistics.getRating()) : null));
            case 3:
                PlayerMatchesEventStatistics playerMatchesEventStatistics2 = (PlayerMatchesEventStatistics) obj;
                return String.valueOf(yid.m(playerMatchesEventStatistics2 != null ? Integer.valueOf(playerMatchesEventStatistics2.getPoints()) : null));
            case 4:
                PlayerMatchesEventStatistics playerMatchesEventStatistics3 = (PlayerMatchesEventStatistics) obj;
                return String.valueOf(yid.m(playerMatchesEventStatistics3 != null ? Integer.valueOf(playerMatchesEventStatistics3.getRebounds()) : null));
            case 5:
                PlayerMatchesEventStatistics playerMatchesEventStatistics4 = (PlayerMatchesEventStatistics) obj;
                return String.valueOf(yid.m(playerMatchesEventStatistics4 != null ? Integer.valueOf(playerMatchesEventStatistics4.getAssists()) : null));
            case 6:
                PlayerMatchesEventStatistics playerMatchesEventStatistics5 = (PlayerMatchesEventStatistics) obj;
                return String.valueOf(yid.m(playerMatchesEventStatistics5 != null ? Integer.valueOf(playerMatchesEventStatistics5.getBlocks()) : null));
            case 7:
                PlayerMatchesEventStatistics playerMatchesEventStatistics6 = (PlayerMatchesEventStatistics) obj;
                return String.valueOf(yid.m(playerMatchesEventStatistics6 != null ? Integer.valueOf(playerMatchesEventStatistics6.getSteals()) : null));
            case 8:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                BasketballTeamSeasonStatistics F = z8e.F(c73Var3);
                return z8e.P(F != null ? F.getThreePointAttempts() : null, z8e.F(c73Var3));
            case 9:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                BasketballTeamSeasonStatistics F2 = z8e.F(c73Var4);
                if (F2 != null) {
                    return F2.getThreePointsPercentage();
                }
                return null;
            case 10:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                BasketballTeamSeasonStatistics F3 = z8e.F(c73Var5);
                return z8e.P(F3 != null ? F3.getPoints() : null, z8e.F(c73Var5));
            case 11:
                c73 c73Var6 = (c73) obj;
                c73Var6.getClass();
                BasketballTeamSeasonStatistics F4 = z8e.F(c73Var6);
                return z8e.P(F4 != null ? F4.getFreeThrowsMade() : null, z8e.F(c73Var6));
            case 12:
                c73 c73Var7 = (c73) obj;
                c73Var7.getClass();
                BasketballTeamSeasonStatistics F5 = z8e.F(c73Var7);
                return z8e.P(F5 != null ? F5.getFreeThrowAttempts() : null, z8e.F(c73Var7));
            case 13:
                c73 c73Var8 = (c73) obj;
                c73Var8.getClass();
                BasketballTeamSeasonStatistics F6 = z8e.F(c73Var8);
                if (F6 != null) {
                    return F6.getFreeThrowsPercentage();
                }
                return null;
            case 14:
                c73 c73Var9 = (c73) obj;
                c73Var9.getClass();
                BasketballTeamSeasonStatistics F7 = z8e.F(c73Var9);
                if (F7 != null) {
                    return F7.getEffectiveFieldGoalPercentage();
                }
                return null;
            case 15:
                c73 c73Var10 = (c73) obj;
                c73Var10.getClass();
                BasketballTeamSeasonStatistics F8 = z8e.F(c73Var10);
                if (F8 != null) {
                    return F8.getTrueShootingPercentage();
                }
                return null;
            case 16:
                c73 c73Var11 = (c73) obj;
                c73Var11.getClass();
                BasketballTeamSeasonStatistics F9 = z8e.F(c73Var11);
                return z8e.P(F9 != null ? F9.getBenchPoints() : null, z8e.F(c73Var11));
            case 17:
                c73 c73Var12 = (c73) obj;
                c73Var12.getClass();
                BasketballTeamSeasonStatistics F10 = z8e.F(c73Var12);
                return z8e.P(F10 != null ? F10.getSecondChancePoints() : null, z8e.F(c73Var12));
            case 18:
                c73 c73Var13 = (c73) obj;
                c73Var13.getClass();
                BasketballTeamSeasonStatistics F11 = z8e.F(c73Var13);
                return z8e.P(F11 != null ? F11.getPointsInPaint() : null, z8e.F(c73Var13));
            case 19:
                c73 c73Var14 = (c73) obj;
                c73Var14.getClass();
                BasketballTeamSeasonStatistics F12 = z8e.F(c73Var14);
                return z8e.P(F12 != null ? F12.getOffensiveRebounds() : null, z8e.F(c73Var14));
            case 20:
                c73 c73Var15 = (c73) obj;
                c73Var15.getClass();
                BasketballTeamSeasonStatistics F13 = z8e.F(c73Var15);
                return z8e.P(F13 != null ? F13.getDefensiveRebounds() : null, z8e.F(c73Var15));
            case 21:
                c73 c73Var16 = (c73) obj;
                c73Var16.getClass();
                BasketballTeamSeasonStatistics F14 = z8e.F(c73Var16);
                return yid.h(z8e.P(F14 != null ? F14.getPointsAgainst() : null, z8e.F(c73Var16)));
            case 22:
                c73 c73Var17 = (c73) obj;
                c73Var17.getClass();
                BasketballTeamSeasonStatistics F15 = z8e.F(c73Var17);
                return z8e.P(F15 != null ? F15.getRebounds() : null, z8e.F(c73Var17));
            case 23:
                c73 c73Var18 = (c73) obj;
                c73Var18.getClass();
                BasketballTeamSeasonStatistics F16 = z8e.F(c73Var18);
                return z8e.P(F16 != null ? F16.getBlocks() : null, z8e.F(c73Var18));
            case 24:
                c73 c73Var19 = (c73) obj;
                c73Var19.getClass();
                BasketballTeamSeasonStatistics F17 = z8e.F(c73Var19);
                return z8e.P(F17 != null ? F17.getSteals() : null, z8e.F(c73Var19));
            case 25:
                c73 c73Var20 = (c73) obj;
                c73Var20.getClass();
                BasketballTeamSeasonStatistics F18 = z8e.F(c73Var20);
                return yid.h(F18 != null ? F18.getThreePointsPercentageAgainst() : null);
            case 26:
                c73 c73Var21 = (c73) obj;
                c73Var21.getClass();
                BasketballTeamSeasonStatistics F19 = z8e.F(c73Var21);
                return yid.h(F19 != null ? F19.getTrueShootingPercentageAgainst() : null);
            case 27:
                c73 c73Var22 = (c73) obj;
                c73Var22.getClass();
                BasketballTeamSeasonStatistics F20 = z8e.F(c73Var22);
                return z8e.P(F20 != null ? F20.getOffensiveFoulsAgainst() : null, z8e.F(c73Var22));
            case 28:
                c73 c73Var23 = (c73) obj;
                c73Var23.getClass();
                BasketballTeamSeasonStatistics F21 = z8e.F(c73Var23);
                return z8e.P(F21 != null ? F21.getFieldGoalAttempts() : null, z8e.F(c73Var23));
            default:
                c73 c73Var24 = (c73) obj;
                c73Var24.getClass();
                BasketballTeamSeasonStatistics F22 = z8e.F(c73Var24);
                return yid.h(z8e.P(F22 != null ? F22.getTurnovers() : null, z8e.F(c73Var24)));
        }
    }
}
