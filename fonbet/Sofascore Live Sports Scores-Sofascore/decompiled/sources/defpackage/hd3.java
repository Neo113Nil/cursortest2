package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballTeamSeasonStatistics;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hd3 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ hd3(int i) {
        this.a = 4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Window window;
        Window window2;
        Integer fieldGoalsMade;
        wyg wygVar;
        wyg wygVar2;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        wyg wygVar3;
        BasketballPlayerSeasonStatistics b;
        Integer height;
        String w;
        wyg wygVar4;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics2;
        wyg wygVar5;
        BasketballPlayerSeasonStatistics b2;
        wyg wygVar6;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics3;
        wyg wygVar7;
        BasketballPlayerSeasonStatistics b3;
        wyg wygVar8;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics4;
        wyg wygVar9;
        BasketballPlayerSeasonStatistics b4;
        wyg wygVar10;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics5;
        wyg wygVar11;
        BasketballPlayerSeasonStatistics b5;
        wyg wygVar12;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics6;
        wyg wygVar13;
        BasketballPlayerSeasonStatistics b6;
        wyg wygVar14;
        BasketballPlayerSeasonStatistics b7;
        wyg wygVar15;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics7;
        wyg wygVar16;
        BasketballPlayerSeasonStatistics b8;
        Player player;
        Long dateOfBirthTimestamp;
        wyg wygVar17;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics8;
        wyg wygVar18;
        BasketballPlayerSeasonStatistics b9;
        wyg wygVar19;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics9;
        wyg wygVar20;
        BasketballPlayerSeasonStatistics b10;
        wyg wygVar21;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics10;
        wyg wygVar22;
        BasketballPlayerSeasonStatistics b11;
        wyg wygVar23;
        BasketballPlayerSeasonStatistics b12;
        Integer doubleDoubles;
        wyg wygVar24;
        BasketballPlayerSeasonStatistics b13;
        Integer tripleDoubles;
        wyg wygVar25;
        BasketballPlayerSeasonStatistics b14;
        Integer appearances;
        Integer appearances2;
        wyg wygVar26;
        wyg wygVar27;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics11;
        wyg wygVar28;
        BasketballPlayerSeasonStatistics b15;
        Integer freeThrowsMade;
        wyg wygVar29;
        Integer twoPointsMade;
        wyg wygVar30;
        Integer threePointsMade;
        wyg wygVar31;
        Double threePointsPercentage;
        int i = 1;
        r4 = null;
        r4 = null;
        Double d = null;
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    ViewParent parent = ((View) av8Var.k(nz.f)).getParent();
                    e25 e25Var = parent instanceof e25 ? (e25) parent : null;
                    if (e25Var != null && (window = e25Var.getWindow()) != null) {
                        window.setDimAmount(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    nq8.h(av8Var, tol.m(bkh.c));
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ViewParent parent2 = ((View) av8Var2.k(nz.f)).getParent();
                    e25 e25Var2 = parent2 instanceof e25 ? (e25) parent2 : null;
                    if (e25Var2 != null && (window2 = e25Var2.getWindow()) != null) {
                        window2.setDimAmount(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    nq8.h(av8Var2, tol.m(bkh.c));
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    g28 g28Var = bkh.c;
                    xtc m = tol.m(g28Var);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m2 = av8Var3.m();
                    xtc C = fqj.C(av8Var3, m);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c, hf3.g);
                    waa.K(av8Var3, m2, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C, hf3.d);
                    s6a.f(48.0f, 4.0f, 197046, 8, lz.D(R.color.on_color_primary, av8Var3), r13.h, av8Var3, g28Var);
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                CharSequence charSequence = (CharSequence) obj;
                int intValue4 = ((Integer) obj2).intValue();
                charSequence.getClass();
                return Character.valueOf(charSequence.charAt(intValue4));
            case 4:
                ((Integer) obj2).getClass();
                m6k.g(aba.K(1), (of3) obj);
                return Unit.a;
            case 5:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                ((Context) obj2).getClass();
                d73 d73Var = c73Var.c;
                BasketballPlayerSeasonStatistics b16 = (d73Var == null || (wygVar = d73Var.c) == null) ? null : rr1.b(wygVar);
                if (b16 == null || (fieldGoalsMade = b16.getFieldGoalsMade()) == null) {
                    return null;
                }
                Integer valueOf = Integer.valueOf(fieldGoalsMade.intValue());
                Integer appearances3 = b16.getAppearances();
                if (appearances3 != null) {
                    Integer num = appearances3.intValue() > 0 ? appearances3 : null;
                    if (num != null) {
                        i = num.intValue();
                    }
                }
                return rei.o(valueOf, Integer.valueOf(i), b16.getFieldGoalsPercentage(), 0);
            case 6:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                ((Context) obj2).getClass();
                d73 d73Var2 = c73Var2.c;
                Double n0 = td4.n0((d73Var2 == null || (wygVar3 = d73Var2.c) == null || (b = rr1.b(wygVar3)) == null) ? null : b.getRebounds(), (d73Var2 == null || (wygVar2 = d73Var2.c) == null || (abstractPlayerSeasonStatistics = wygVar2.a) == null) ? null : abstractPlayerSeasonStatistics.getAppearances());
                if (n0 != null) {
                    return rr1.a(n0);
                }
                return null;
            case 7:
                c73 c73Var3 = (c73) obj;
                Context context = (Context) obj2;
                c73Var3.getClass();
                context.getClass();
                qo2 qo2Var = c73Var3.a;
                a73 a73Var = qo2Var instanceof a73 ? (a73) qo2Var : null;
                if (a73Var == null || (height = a73Var.c.getHeight()) == null) {
                    return null;
                }
                w = v7a.w(context, height.intValue() / 100.0d, (r4 & 4) == 0, false);
                return w;
            case 8:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                ((Context) obj2).getClass();
                d73 d73Var3 = c73Var4.c;
                Double n02 = td4.n0((d73Var3 == null || (wygVar5 = d73Var3.c) == null || (b2 = rr1.b(wygVar5)) == null) ? null : b2.getDefensiveRebounds(), (d73Var3 == null || (wygVar4 = d73Var3.c) == null || (abstractPlayerSeasonStatistics2 = wygVar4.a) == null) ? null : abstractPlayerSeasonStatistics2.getAppearances());
                if (n02 != null) {
                    return rr1.a(n02);
                }
                return null;
            case 9:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                ((Context) obj2).getClass();
                d73 d73Var4 = c73Var5.c;
                Double n03 = td4.n0((d73Var4 == null || (wygVar7 = d73Var4.c) == null || (b3 = rr1.b(wygVar7)) == null) ? null : b3.getOffensiveRebounds(), (d73Var4 == null || (wygVar6 = d73Var4.c) == null || (abstractPlayerSeasonStatistics3 = wygVar6.a) == null) ? null : abstractPlayerSeasonStatistics3.getAppearances());
                if (n03 != null) {
                    return rr1.a(n03);
                }
                return null;
            case 10:
                c73 c73Var6 = (c73) obj;
                c73Var6.getClass();
                ((Context) obj2).getClass();
                d73 d73Var5 = c73Var6.c;
                Double n04 = td4.n0((d73Var5 == null || (wygVar9 = d73Var5.c) == null || (b4 = rr1.b(wygVar9)) == null) ? null : b4.getAssists(), (d73Var5 == null || (wygVar8 = d73Var5.c) == null || (abstractPlayerSeasonStatistics4 = wygVar8.a) == null) ? null : abstractPlayerSeasonStatistics4.getAppearances());
                if (n04 != null) {
                    return rr1.a(n04);
                }
                return null;
            case 11:
                c73 c73Var7 = (c73) obj;
                c73Var7.getClass();
                ((Context) obj2).getClass();
                d73 d73Var6 = c73Var7.c;
                Double n05 = td4.n0((d73Var6 == null || (wygVar11 = d73Var6.c) == null || (b5 = rr1.b(wygVar11)) == null) ? null : b5.getTurnovers(), (d73Var6 == null || (wygVar10 = d73Var6.c) == null || (abstractPlayerSeasonStatistics5 = wygVar10.a) == null) ? null : abstractPlayerSeasonStatistics5.getAppearances());
                if (n05 != null) {
                    return rr1.a(n05);
                }
                return null;
            case 12:
                c73 c73Var8 = (c73) obj;
                c73Var8.getClass();
                ((Context) obj2).getClass();
                d73 d73Var7 = c73Var8.c;
                Double n06 = td4.n0((d73Var7 == null || (wygVar13 = d73Var7.c) == null || (b6 = rr1.b(wygVar13)) == null) ? null : b6.getSteals(), (d73Var7 == null || (wygVar12 = d73Var7.c) == null || (abstractPlayerSeasonStatistics6 = wygVar12.a) == null) ? null : abstractPlayerSeasonStatistics6.getAppearances());
                if (n06 != null) {
                    return rr1.a(n06);
                }
                return null;
            case 13:
                c73 c73Var9 = (c73) obj;
                c73Var9.getClass();
                ((Context) obj2).getClass();
                d73 d73Var8 = c73Var9.c;
                if (d73Var8 != null && (wygVar14 = d73Var8.c) != null && (b7 = rr1.b(wygVar14)) != null) {
                    d = b7.getAssistTurnoverRatio();
                }
                return yid.g(d);
            case 14:
                c73 c73Var10 = (c73) obj;
                c73Var10.getClass();
                ((Context) obj2).getClass();
                d73 d73Var9 = c73Var10.c;
                Double n07 = td4.n0((d73Var9 == null || (wygVar16 = d73Var9.c) == null || (b8 = rr1.b(wygVar16)) == null) ? null : b8.getBlocks(), (d73Var9 == null || (wygVar15 = d73Var9.c) == null || (abstractPlayerSeasonStatistics7 = wygVar15.a) == null) ? null : abstractPlayerSeasonStatistics7.getAppearances());
                if (n07 != null) {
                    return rr1.a(n07);
                }
                return null;
            case 15:
                c73 c73Var11 = (c73) obj;
                c73Var11.getClass();
                ((Context) obj2).getClass();
                qo2 qo2Var2 = c73Var11.a;
                a73 a73Var2 = qo2Var2 instanceof a73 ? (a73) qo2Var2 : null;
                if (a73Var2 == null || (dateOfBirthTimestamp = (player = a73Var2.c).getDateOfBirthTimestamp()) == null) {
                    return null;
                }
                if (player.getDeceased()) {
                    dateOfBirthTimestamp = null;
                }
                if (dateOfBirthTimestamp != null) {
                    return String.valueOf((int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(dateOfBirthTimestamp.longValue() * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v()))));
                }
                return null;
            case 16:
                c73 c73Var12 = (c73) obj;
                c73Var12.getClass();
                ((Context) obj2).getClass();
                d73 d73Var10 = c73Var12.c;
                Double n08 = td4.n0((d73Var10 == null || (wygVar18 = d73Var10.c) == null || (b9 = rr1.b(wygVar18)) == null) ? null : b9.getPersonalFouls(), (d73Var10 == null || (wygVar17 = d73Var10.c) == null || (abstractPlayerSeasonStatistics8 = wygVar17.a) == null) ? null : abstractPlayerSeasonStatistics8.getAppearances());
                if (n08 != null) {
                    return rr1.a(n08);
                }
                return null;
            case 17:
                c73 c73Var13 = (c73) obj;
                c73Var13.getClass();
                ((Context) obj2).getClass();
                d73 d73Var11 = c73Var13.c;
                Double n09 = td4.n0((d73Var11 == null || (wygVar20 = d73Var11.c) == null || (b10 = rr1.b(wygVar20)) == null) ? null : b10.getPlusMinus(), (d73Var11 == null || (wygVar19 = d73Var11.c) == null || (abstractPlayerSeasonStatistics9 = wygVar19.a) == null) ? null : abstractPlayerSeasonStatistics9.getAppearances());
                if (n09 != null) {
                    return rr1.a(n09);
                }
                return null;
            case 18:
                c73 c73Var14 = (c73) obj;
                c73Var14.getClass();
                ((Context) obj2).getClass();
                d73 d73Var12 = c73Var14.c;
                Double n010 = td4.n0((d73Var12 == null || (wygVar22 = d73Var12.c) == null || (b11 = rr1.b(wygVar22)) == null) ? null : b11.getPir(), (d73Var12 == null || (wygVar21 = d73Var12.c) == null || (abstractPlayerSeasonStatistics10 = wygVar21.a) == null) ? null : abstractPlayerSeasonStatistics10.getAppearances());
                if (n010 != null) {
                    return rr1.a(n010);
                }
                return null;
            case 19:
                c73 c73Var15 = (c73) obj;
                c73Var15.getClass();
                ((Context) obj2).getClass();
                d73 d73Var13 = c73Var15.c;
                if (d73Var13 == null || (wygVar23 = d73Var13.c) == null || (b12 = rr1.b(wygVar23)) == null || (doubleDoubles = b12.getDoubleDoubles()) == null) {
                    return null;
                }
                return String.valueOf(doubleDoubles.intValue());
            case 20:
                c73 c73Var16 = (c73) obj;
                c73Var16.getClass();
                ((Context) obj2).getClass();
                d73 d73Var14 = c73Var16.c;
                if (d73Var14 == null || (wygVar24 = d73Var14.c) == null || (b13 = rr1.b(wygVar24)) == null || (tripleDoubles = b13.getTripleDoubles()) == null) {
                    return null;
                }
                return String.valueOf(tripleDoubles.intValue());
            case 21:
                c73 c73Var17 = (c73) obj;
                c73Var17.getClass();
                ((Context) obj2).getClass();
                d73 d73Var15 = c73Var17.c;
                if (d73Var15 == null || (wygVar25 = d73Var15.c) == null || (b14 = rr1.b(wygVar25)) == null || (appearances = b14.getAppearances()) == null) {
                    return null;
                }
                return String.valueOf(appearances.intValue());
            case 22:
                c73 c73Var18 = (c73) obj;
                c73Var18.getClass();
                ((Context) obj2).getClass();
                d73 d73Var16 = c73Var18.c;
                BasketballPlayerSeasonStatistics b17 = (d73Var16 == null || (wygVar26 = d73Var16.c) == null) ? null : rr1.b(wygVar26);
                if (b17 == null || (appearances2 = b17.getAppearances()) == null) {
                    return null;
                }
                int intValue5 = appearances2.intValue();
                Integer secondsPlayed = b17.getSecondsPlayed();
                if (secondsPlayed == null) {
                    return null;
                }
                if (secondsPlayed.intValue() <= 0) {
                    secondsPlayed = null;
                }
                if (secondsPlayed != null) {
                    return rei.l(intValue5 * 60, Integer.valueOf(secondsPlayed.intValue()));
                }
                return null;
            case 23:
                c73 c73Var19 = (c73) obj;
                c73Var19.getClass();
                ((Context) obj2).getClass();
                d73 d73Var17 = c73Var19.c;
                Double n011 = td4.n0((d73Var17 == null || (wygVar28 = d73Var17.c) == null || (b15 = rr1.b(wygVar28)) == null) ? null : b15.getPoints(), (d73Var17 == null || (wygVar27 = d73Var17.c) == null || (abstractPlayerSeasonStatistics11 = wygVar27.a) == null) ? null : abstractPlayerSeasonStatistics11.getAppearances());
                if (n011 != null) {
                    return rr1.a(n011);
                }
                return null;
            case 24:
                c73 c73Var20 = (c73) obj;
                c73Var20.getClass();
                ((Context) obj2).getClass();
                d73 d73Var18 = c73Var20.c;
                BasketballPlayerSeasonStatistics b18 = (d73Var18 == null || (wygVar29 = d73Var18.c) == null) ? null : rr1.b(wygVar29);
                if (b18 == null || (freeThrowsMade = b18.getFreeThrowsMade()) == null) {
                    return null;
                }
                Integer valueOf2 = Integer.valueOf(freeThrowsMade.intValue());
                Integer appearances4 = b18.getAppearances();
                if (appearances4 != null) {
                    Integer num2 = appearances4.intValue() > 0 ? appearances4 : null;
                    if (num2 != null) {
                        i = num2.intValue();
                    }
                }
                return rei.o(valueOf2, Integer.valueOf(i), b18.getFreeThrowsPercentage(), 0);
            case 25:
                c73 c73Var21 = (c73) obj;
                c73Var21.getClass();
                ((Context) obj2).getClass();
                d73 d73Var19 = c73Var21.c;
                BasketballPlayerSeasonStatistics b19 = (d73Var19 == null || (wygVar30 = d73Var19.c) == null) ? null : rr1.b(wygVar30);
                if (b19 == null || (twoPointsMade = b19.getTwoPointsMade()) == null) {
                    return null;
                }
                Integer valueOf3 = Integer.valueOf(twoPointsMade.intValue());
                Integer appearances5 = b19.getAppearances();
                if (appearances5 != null) {
                    Integer num3 = appearances5.intValue() > 0 ? appearances5 : null;
                    if (num3 != null) {
                        i = num3.intValue();
                    }
                }
                return rei.o(valueOf3, Integer.valueOf(i), b19.getTwoPointsPercentage(), 0);
            case 26:
                c73 c73Var22 = (c73) obj;
                c73Var22.getClass();
                ((Context) obj2).getClass();
                d73 d73Var20 = c73Var22.c;
                BasketballPlayerSeasonStatistics b20 = (d73Var20 == null || (wygVar31 = d73Var20.c) == null) ? null : rr1.b(wygVar31);
                if (b20 == null || (threePointsMade = b20.getThreePointsMade()) == null) {
                    return null;
                }
                Integer valueOf4 = Integer.valueOf(threePointsMade.intValue());
                Integer appearances6 = b20.getAppearances();
                if (appearances6 != null) {
                    Integer num4 = appearances6.intValue() > 0 ? appearances6 : null;
                    if (num4 != null) {
                        i = num4.intValue();
                    }
                }
                return rei.o(valueOf4, Integer.valueOf(i), b20.getThreePointsPercentage(), 0);
            case 27:
                c73 c73Var23 = (c73) obj;
                BasketballTeamSeasonStatistics g = fn0.g(c73Var23, (Context) obj2, c73Var23);
                if (g == null || (threePointsPercentage = g.getThreePointsPercentage()) == null) {
                    return null;
                }
                double doubleValue = threePointsPercentage.doubleValue();
                String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
                int a = wzb.a(doubleValue);
                if (a == Double.parseDouble(format)) {
                    format = String.valueOf(a);
                }
                return dmi.y(format, "%");
            case 28:
                c73 c73Var24 = (c73) obj;
                BasketballTeamSeasonStatistics g2 = fn0.g(c73Var24, (Context) obj2, c73Var24);
                Double P = z8e.P(g2 != null ? g2.getFreeThrowsMade() : null, z8e.F(c73Var24));
                if (P != null) {
                    return z8e.D(P);
                }
                return null;
            default:
                c73 c73Var25 = (c73) obj;
                BasketballTeamSeasonStatistics g3 = fn0.g(c73Var25, (Context) obj2, c73Var25);
                Double P2 = z8e.P(g3 != null ? g3.getFreeThrowAttempts() : null, z8e.F(c73Var25));
                if (P2 != null) {
                    return z8e.D(P2);
                }
                return null;
        }
    }

    public /* synthetic */ hd3(byte b, int i) {
        this.a = i;
    }
}
