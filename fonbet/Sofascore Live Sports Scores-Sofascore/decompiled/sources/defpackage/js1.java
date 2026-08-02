package defpackage;

import android.content.Context;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsProvider;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballTeamSeasonStatistics;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class js1 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ js1(int i) {
        this.a = 26;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Double freeThrowsPercentage;
        Double effectiveFieldGoalPercentage;
        Double trueShootingPercentage;
        Double threePointsPercentageAgainst;
        Double trueShootingPercentageAgainst;
        Integer technicalFouls;
        Integer flagrantFouls;
        Double assistTurnoverRatio;
        Double fieldGoalsPercentage;
        String generateAd$lambda$2$lambda$0;
        Unit globalThrowableCatcher$lambda$27;
        switch (this.a) {
            case 0:
                c73 c73Var = (c73) obj;
                BasketballTeamSeasonStatistics g = fn0.g(c73Var, (Context) obj2, c73Var);
                if (g == null || (freeThrowsPercentage = g.getFreeThrowsPercentage()) == null) {
                    return null;
                }
                double doubleValue = freeThrowsPercentage.doubleValue();
                String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
                int a = wzb.a(doubleValue);
                if (a == Double.parseDouble(format)) {
                    format = String.valueOf(a);
                }
                return dmi.y(format, "%");
            case 1:
                c73 c73Var2 = (c73) obj;
                BasketballTeamSeasonStatistics g2 = fn0.g(c73Var2, (Context) obj2, c73Var2);
                if (g2 == null || (effectiveFieldGoalPercentage = g2.getEffectiveFieldGoalPercentage()) == null) {
                    return null;
                }
                double doubleValue2 = effectiveFieldGoalPercentage.doubleValue();
                String format2 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue2)}, 1));
                int a2 = wzb.a(doubleValue2);
                if (a2 == Double.parseDouble(format2)) {
                    format2 = String.valueOf(a2);
                }
                return dmi.y(format2, "%");
            case 2:
                c73 c73Var3 = (c73) obj;
                BasketballTeamSeasonStatistics g3 = fn0.g(c73Var3, (Context) obj2, c73Var3);
                if (g3 == null || (trueShootingPercentage = g3.getTrueShootingPercentage()) == null) {
                    return null;
                }
                double doubleValue3 = trueShootingPercentage.doubleValue();
                String format3 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue3)}, 1));
                int a3 = wzb.a(doubleValue3);
                if (a3 == Double.parseDouble(format3)) {
                    format3 = String.valueOf(a3);
                }
                return dmi.y(format3, "%");
            case 3:
                c73 c73Var4 = (c73) obj;
                BasketballTeamSeasonStatistics g4 = fn0.g(c73Var4, (Context) obj2, c73Var4);
                Double P = z8e.P(g4 != null ? g4.getPointsAgainst() : null, z8e.F(c73Var4));
                if (P != null) {
                    return z8e.D(P);
                }
                return null;
            case 4:
                c73 c73Var5 = (c73) obj;
                BasketballTeamSeasonStatistics g5 = fn0.g(c73Var5, (Context) obj2, c73Var5);
                Double P2 = z8e.P(g5 != null ? g5.getBenchPoints() : null, z8e.F(c73Var5));
                if (P2 != null) {
                    return z8e.D(P2);
                }
                return null;
            case 5:
                c73 c73Var6 = (c73) obj;
                BasketballTeamSeasonStatistics g6 = fn0.g(c73Var6, (Context) obj2, c73Var6);
                Double P3 = z8e.P(g6 != null ? g6.getSecondChancePoints() : null, z8e.F(c73Var6));
                if (P3 != null) {
                    return z8e.D(P3);
                }
                return null;
            case 6:
                c73 c73Var7 = (c73) obj;
                BasketballTeamSeasonStatistics g7 = fn0.g(c73Var7, (Context) obj2, c73Var7);
                Double P4 = z8e.P(g7 != null ? g7.getPointsInPaint() : null, z8e.F(c73Var7));
                if (P4 != null) {
                    return z8e.D(P4);
                }
                return null;
            case 7:
                c73 c73Var8 = (c73) obj;
                BasketballTeamSeasonStatistics g8 = fn0.g(c73Var8, (Context) obj2, c73Var8);
                Double P5 = z8e.P(g8 != null ? g8.getPoints() : null, z8e.F(c73Var8));
                if (P5 != null) {
                    return z8e.D(P5);
                }
                return null;
            case 8:
                c73 c73Var9 = (c73) obj;
                BasketballTeamSeasonStatistics g9 = fn0.g(c73Var9, (Context) obj2, c73Var9);
                Double P6 = z8e.P(g9 != null ? g9.getOffensiveRebounds() : null, z8e.F(c73Var9));
                if (P6 != null) {
                    return z8e.D(P6);
                }
                return null;
            case 9:
                c73 c73Var10 = (c73) obj;
                BasketballTeamSeasonStatistics g10 = fn0.g(c73Var10, (Context) obj2, c73Var10);
                Double P7 = z8e.P(g10 != null ? g10.getDefensiveRebounds() : null, z8e.F(c73Var10));
                if (P7 != null) {
                    return z8e.D(P7);
                }
                return null;
            case 10:
                c73 c73Var11 = (c73) obj;
                BasketballTeamSeasonStatistics g11 = fn0.g(c73Var11, (Context) obj2, c73Var11);
                Double P8 = z8e.P(g11 != null ? g11.getRebounds() : null, z8e.F(c73Var11));
                if (P8 != null) {
                    return z8e.D(P8);
                }
                return null;
            case 11:
                c73 c73Var12 = (c73) obj;
                BasketballTeamSeasonStatistics g12 = fn0.g(c73Var12, (Context) obj2, c73Var12);
                Double P9 = z8e.P(g12 != null ? g12.getBlocks() : null, z8e.F(c73Var12));
                if (P9 != null) {
                    return z8e.D(P9);
                }
                return null;
            case 12:
                c73 c73Var13 = (c73) obj;
                BasketballTeamSeasonStatistics g13 = fn0.g(c73Var13, (Context) obj2, c73Var13);
                Double P10 = z8e.P(g13 != null ? g13.getFieldGoalAttempts() : null, z8e.F(c73Var13));
                if (P10 != null) {
                    return z8e.D(P10);
                }
                return null;
            case 13:
                c73 c73Var14 = (c73) obj;
                BasketballTeamSeasonStatistics g14 = fn0.g(c73Var14, (Context) obj2, c73Var14);
                Double P11 = z8e.P(g14 != null ? g14.getSteals() : null, z8e.F(c73Var14));
                if (P11 != null) {
                    return z8e.D(P11);
                }
                return null;
            case 14:
                c73 c73Var15 = (c73) obj;
                BasketballTeamSeasonStatistics g15 = fn0.g(c73Var15, (Context) obj2, c73Var15);
                if (g15 == null || (threePointsPercentageAgainst = g15.getThreePointsPercentageAgainst()) == null) {
                    return null;
                }
                double doubleValue4 = threePointsPercentageAgainst.doubleValue();
                String format4 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue4)}, 1));
                int a4 = wzb.a(doubleValue4);
                if (a4 == Double.parseDouble(format4)) {
                    format4 = String.valueOf(a4);
                }
                return dmi.y(format4, "%");
            case 15:
                c73 c73Var16 = (c73) obj;
                BasketballTeamSeasonStatistics g16 = fn0.g(c73Var16, (Context) obj2, c73Var16);
                if (g16 == null || (trueShootingPercentageAgainst = g16.getTrueShootingPercentageAgainst()) == null) {
                    return null;
                }
                double doubleValue5 = trueShootingPercentageAgainst.doubleValue();
                String format5 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue5)}, 1));
                int a5 = wzb.a(doubleValue5);
                if (a5 == Double.parseDouble(format5)) {
                    format5 = String.valueOf(a5);
                }
                return dmi.y(format5, "%");
            case 16:
                c73 c73Var17 = (c73) obj;
                BasketballTeamSeasonStatistics g17 = fn0.g(c73Var17, (Context) obj2, c73Var17);
                Double P12 = z8e.P(g17 != null ? g17.getAssists() : null, z8e.F(c73Var17));
                if (P12 != null) {
                    return z8e.D(P12);
                }
                return null;
            case 17:
                c73 c73Var18 = (c73) obj;
                BasketballTeamSeasonStatistics g18 = fn0.g(c73Var18, (Context) obj2, c73Var18);
                Double P13 = z8e.P(g18 != null ? g18.getOffensiveFoulsAgainst() : null, z8e.F(c73Var18));
                if (P13 != null) {
                    return z8e.D(P13);
                }
                return null;
            case 18:
                c73 c73Var19 = (c73) obj;
                BasketballTeamSeasonStatistics g19 = fn0.g(c73Var19, (Context) obj2, c73Var19);
                Double P14 = z8e.P(g19 != null ? g19.getTurnovers() : null, z8e.F(c73Var19));
                if (P14 != null) {
                    return z8e.D(P14);
                }
                return null;
            case 19:
                c73 c73Var20 = (c73) obj;
                BasketballTeamSeasonStatistics g20 = fn0.g(c73Var20, (Context) obj2, c73Var20);
                if (g20 == null || (technicalFouls = g20.getTechnicalFouls()) == null) {
                    return null;
                }
                return String.valueOf(technicalFouls.intValue());
            case 20:
                c73 c73Var21 = (c73) obj;
                BasketballTeamSeasonStatistics g21 = fn0.g(c73Var21, (Context) obj2, c73Var21);
                if (g21 == null || (flagrantFouls = g21.getFlagrantFouls()) == null) {
                    return null;
                }
                return String.valueOf(flagrantFouls.intValue());
            case 21:
                c73 c73Var22 = (c73) obj;
                BasketballTeamSeasonStatistics g22 = fn0.g(c73Var22, (Context) obj2, c73Var22);
                if (g22 == null || (assistTurnoverRatio = g22.getAssistTurnoverRatio()) == null) {
                    return null;
                }
                return z8e.D(assistTurnoverRatio);
            case 22:
                c73 c73Var23 = (c73) obj;
                BasketballTeamSeasonStatistics g23 = fn0.g(c73Var23, (Context) obj2, c73Var23);
                Double P15 = z8e.P(g23 != null ? g23.getFieldGoalsMade() : null, z8e.F(c73Var23));
                if (P15 != null) {
                    return z8e.D(P15);
                }
                return null;
            case 23:
                c73 c73Var24 = (c73) obj;
                BasketballTeamSeasonStatistics g24 = fn0.g(c73Var24, (Context) obj2, c73Var24);
                if (g24 == null || (fieldGoalsPercentage = g24.getFieldGoalsPercentage()) == null) {
                    return null;
                }
                double doubleValue6 = fieldGoalsPercentage.doubleValue();
                String format6 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue6)}, 1));
                int a6 = wzb.a(doubleValue6);
                if (a6 == Double.parseDouble(format6)) {
                    format6 = String.valueOf(a6);
                }
                return dmi.y(format6, "%");
            case 24:
                c73 c73Var25 = (c73) obj;
                BasketballTeamSeasonStatistics g25 = fn0.g(c73Var25, (Context) obj2, c73Var25);
                Double P16 = z8e.P(g25 != null ? g25.getThreePointsMade() : null, z8e.F(c73Var25));
                if (P16 != null) {
                    return z8e.D(P16);
                }
                return null;
            case 25:
                c73 c73Var26 = (c73) obj;
                BasketballTeamSeasonStatistics g26 = fn0.g(c73Var26, (Context) obj2, c73Var26);
                Double P17 = z8e.P(g26 != null ? g26.getThreePointAttempts() : null, z8e.F(c73Var26));
                if (P17 != null) {
                    return z8e.D(P17);
                }
                return null;
            case 26:
                ((Integer) obj2).getClass();
                ktm.b(aba.K(1), (of3) obj);
                return Unit.a;
            case 27:
                generateAd$lambda$2$lambda$0 = BlazeCustomNativeAdsProvider.generateAd$lambda$2$lambda$0((String) obj, (String) obj2);
                return generateAd$lambda$2$lambda$0;
            case 28:
                globalThrowableCatcher$lambda$27 = BlazeSDK.globalThrowableCatcher$lambda$27((Throwable) obj, (g0) obj2);
                return globalThrowableCatcher$lambda$27;
            default:
                ij9 ij9Var = (ij9) obj;
                int intValue = ((Integer) obj2).intValue();
                ij9Var.getClass();
                return Character.valueOf(ij9Var.a.charAt(intValue));
        }
    }

    public /* synthetic */ js1(byte b, int i) {
        this.a = i;
    }
}
