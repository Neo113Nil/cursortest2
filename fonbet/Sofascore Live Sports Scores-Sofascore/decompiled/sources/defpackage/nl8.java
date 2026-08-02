package defpackage;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nl8 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ nl8(dk9 dk9Var) {
        this.a = 27;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer accurateLongBalls;
        Integer cleanSheets;
        Integer penaltyGoalsConceded;
        Integer duelsWon;
        Integer goalsScored;
        Integer redCards;
        Integer goalsConceded;
        Integer assists;
        switch (this.a) {
            case 0:
                c73 c73Var = (c73) obj;
                FootballTeamSeasonStatistics c = fc6.c(c73Var, (Context) obj2, c73Var);
                if (c == null || (accurateLongBalls = c.getAccurateLongBalls()) == null) {
                    return null;
                }
                Integer valueOf = Integer.valueOf(accurateLongBalls.intValue());
                FootballTeamSeasonStatistics v = ktm.v(c73Var);
                Integer valueOf2 = v != null ? Integer.valueOf(v.getMatches()) : null;
                if (yid.m(valueOf2) <= 0) {
                    valueOf2 = null;
                }
                Integer valueOf3 = Integer.valueOf(valueOf2 != null ? valueOf2.intValue() : 1);
                FootballTeamSeasonStatistics v2 = ktm.v(c73Var);
                return rei.o(valueOf, valueOf3, v2 != null ? v2.getAccurateLongBallsPercentage() : null, 1);
            case 1:
                c73 c73Var2 = (c73) obj;
                FootballTeamSeasonStatistics c2 = fc6.c(c73Var2, (Context) obj2, c73Var2);
                if (c2 == null || (cleanSheets = c2.getCleanSheets()) == null) {
                    return null;
                }
                return String.valueOf(cleanSheets.intValue());
            case 2:
                c73 c73Var3 = (c73) obj;
                FootballTeamSeasonStatistics c3 = fc6.c(c73Var3, (Context) obj2, c73Var3);
                Double H = ktm.H(c3 != null ? c3.getGoalsConceded() : null, ktm.v(c73Var3));
                if (H != null) {
                    return yid.c("%.1f", H);
                }
                return null;
            case 3:
                c73 c73Var4 = (c73) obj;
                FootballTeamSeasonStatistics c4 = fc6.c(c73Var4, (Context) obj2, c73Var4);
                Double H2 = ktm.H(c4 != null ? c4.getInterceptions() : null, ktm.v(c73Var4));
                if (H2 != null) {
                    return yid.c("%.1f", H2);
                }
                return null;
            case 4:
                c73 c73Var5 = (c73) obj;
                FootballTeamSeasonStatistics c5 = fc6.c(c73Var5, (Context) obj2, c73Var5);
                if (c5 != null) {
                    return String.valueOf(c5.getMatches());
                }
                return null;
            case 5:
                c73 c73Var6 = (c73) obj;
                FootballTeamSeasonStatistics c6 = fc6.c(c73Var6, (Context) obj2, c73Var6);
                Double H3 = ktm.H(c6 != null ? c6.getTackles() : null, ktm.v(c73Var6));
                if (H3 != null) {
                    return yid.c("%.1f", H3);
                }
                return null;
            case 6:
                c73 c73Var7 = (c73) obj;
                FootballTeamSeasonStatistics c7 = fc6.c(c73Var7, (Context) obj2, c73Var7);
                Double H4 = ktm.H(c7 != null ? c7.getClearances() : null, ktm.v(c73Var7));
                if (H4 != null) {
                    return yid.c("%.1f", H4);
                }
                return null;
            case 7:
                c73 c73Var8 = (c73) obj;
                FootballTeamSeasonStatistics c8 = fc6.c(c73Var8, (Context) obj2, c73Var8);
                if (c8 == null || (penaltyGoalsConceded = c8.getPenaltyGoalsConceded()) == null) {
                    return null;
                }
                return String.valueOf(penaltyGoalsConceded.intValue());
            case 8:
                c73 c73Var9 = (c73) obj;
                FootballTeamSeasonStatistics c9 = fc6.c(c73Var9, (Context) obj2, c73Var9);
                Double H5 = ktm.H(c9 != null ? c9.getSaves() : null, ktm.v(c73Var9));
                if (H5 != null) {
                    return yid.c("%.1f", H5);
                }
                return null;
            case 9:
                c73 c73Var10 = (c73) obj;
                FootballTeamSeasonStatistics c10 = fc6.c(c73Var10, (Context) obj2, c73Var10);
                if (c10 == null || (duelsWon = c10.getDuelsWon()) == null) {
                    return null;
                }
                Integer valueOf4 = Integer.valueOf(duelsWon.intValue());
                FootballTeamSeasonStatistics v3 = ktm.v(c73Var10);
                Integer valueOf5 = v3 != null ? Integer.valueOf(v3.getMatches()) : null;
                if (yid.m(valueOf5) <= 0) {
                    valueOf5 = null;
                }
                Integer valueOf6 = Integer.valueOf(valueOf5 != null ? valueOf5.intValue() : 1);
                FootballTeamSeasonStatistics v4 = ktm.v(c73Var10);
                return rei.o(valueOf4, valueOf6, v4 != null ? v4.getDuelsWonPercentage() : null, 1);
            case 10:
                c73 c73Var11 = (c73) obj;
                FootballTeamSeasonStatistics c11 = fc6.c(c73Var11, (Context) obj2, c73Var11);
                Double H6 = ktm.H(c11 != null ? c11.getFouls() : null, ktm.v(c73Var11));
                if (H6 != null) {
                    return yid.c("%.1f", H6);
                }
                return null;
            case 11:
                c73 c73Var12 = (c73) obj;
                FootballTeamSeasonStatistics c12 = fc6.c(c73Var12, (Context) obj2, c73Var12);
                Double H7 = ktm.H(c12 != null ? c12.getOffsides() : null, ktm.v(c73Var12));
                if (H7 != null) {
                    return yid.c("%.1f", H7);
                }
                return null;
            case 12:
                c73 c73Var13 = (c73) obj;
                FootballTeamSeasonStatistics c13 = fc6.c(c73Var13, (Context) obj2, c73Var13);
                return yid.f(ktm.H(c13 != null ? c13.getGoalsScored() : null, ktm.v(c73Var13)));
            case 13:
                c73 c73Var14 = (c73) obj;
                FootballTeamSeasonStatistics c14 = fc6.c(c73Var14, (Context) obj2, c73Var14);
                Double H8 = ktm.H(c14 != null ? c14.getGoalKicks() : null, ktm.v(c73Var14));
                if (H8 != null) {
                    return yid.c("%.1f", H8);
                }
                return null;
            case 14:
                c73 c73Var15 = (c73) obj;
                FootballTeamSeasonStatistics c15 = fc6.c(c73Var15, (Context) obj2, c73Var15);
                Double H9 = ktm.H(c15 != null ? c15.getThrowIns() : null, ktm.v(c73Var15));
                if (H9 != null) {
                    return yid.c("%.1f", H9);
                }
                return null;
            case 15:
                c73 c73Var16 = (c73) obj;
                FootballTeamSeasonStatistics c16 = fc6.c(c73Var16, (Context) obj2, c73Var16);
                Double H10 = ktm.H(c16 != null ? c16.getYellowCards() : null, ktm.v(c73Var16));
                if (H10 != null) {
                    return yid.c("%.1f", H10);
                }
                return null;
            case 16:
                c73 c73Var17 = (c73) obj;
                FootballTeamSeasonStatistics c17 = fc6.c(c73Var17, (Context) obj2, c73Var17);
                if (c17 == null || (goalsScored = c17.getGoalsScored()) == null) {
                    return null;
                }
                return String.valueOf(goalsScored.intValue());
            case 17:
                c73 c73Var18 = (c73) obj;
                FootballTeamSeasonStatistics c18 = fc6.c(c73Var18, (Context) obj2, c73Var18);
                if (c18 == null || (redCards = c18.getRedCards()) == null) {
                    return null;
                }
                return String.valueOf(redCards.intValue());
            case 18:
                c73 c73Var19 = (c73) obj;
                FootballTeamSeasonStatistics c19 = fc6.c(c73Var19, (Context) obj2, c73Var19);
                if (c19 == null || (goalsConceded = c19.getGoalsConceded()) == null) {
                    return null;
                }
                return String.valueOf(goalsConceded.intValue());
            case 19:
                c73 c73Var20 = (c73) obj;
                FootballTeamSeasonStatistics c20 = fc6.c(c73Var20, (Context) obj2, c73Var20);
                if (c20 == null || (assists = c20.getAssists()) == null) {
                    return null;
                }
                return String.valueOf(assists.intValue());
            case 20:
                c73 c73Var21 = (c73) obj;
                FootballTeamSeasonStatistics c21 = fc6.c(c73Var21, (Context) obj2, c73Var21);
                return yid.f(ktm.H(c21 != null ? c21.getShotsOnTarget() : null, ktm.v(c73Var21)));
            case 21:
                c73 c73Var22 = (c73) obj;
                FootballTeamSeasonStatistics c22 = fc6.c(c73Var22, (Context) obj2, c73Var22);
                return yid.f(ktm.H(c22 != null ? c22.getBigChances() : null, ktm.v(c73Var22)));
            case 22:
                c73 c73Var23 = (c73) obj;
                FootballTeamSeasonStatistics c23 = fc6.c(c73Var23, (Context) obj2, c73Var23);
                return yid.f(ktm.H(c23 != null ? c23.getBigChancesMissed() : null, ktm.v(c73Var23)));
            case 23:
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                return Unit.a;
            case 24:
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                return Unit.a;
            case 25:
                ((ot9) obj).getClass();
                ((fmi) obj2).getClass();
                return Unit.a;
            case 26:
                ((ok9) obj).getClass();
                ((yj9) obj2).getClass();
                return Unit.a;
            case 27:
                int intValue = ((Integer) obj2).intValue();
                ((mk9) obj).getClass();
                long min = Math.min((long) (Math.pow(2.0d, intValue - 1) * 1000.0d), ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                glf.a.getClass();
                return Long.valueOf(glf.b.i() + min);
            case 28:
                ha5 ha5Var = (ha5) obj;
                an8 an8Var = (an8) obj2;
                ha5Var.getClass();
                an8Var.getClass();
                d7e.h(an8Var.a, ha5Var, ha5Var.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, an8Var.b, 2);
                return Unit.a;
            default:
                ((Integer) obj2).intValue();
                return new o39(waa.b(1));
        }
    }

    public /* synthetic */ nl8(int i) {
        this.a = i;
    }
}
