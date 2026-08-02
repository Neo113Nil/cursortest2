package defpackage;

import android.content.Context;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class zt {
    public static final String a(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Number number, boolean z) {
        if (z) {
            return number.toString();
        }
        Integer appearances = americanFootballPlayerSeasonStatistics.getAppearances();
        return rei.l(appearances != null ? appearances.intValue() : 1, number);
    }

    public static final String b(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Integer num, Integer num2, boolean z) {
        americanFootballPlayerSeasonStatistics.getClass();
        return wv8.i(a(americanFootballPlayerSeasonStatistics, num, z), "/", a(americanFootballPlayerSeasonStatistics, num2, z));
    }

    public static final ArrayList c(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        Integer defensiveCombineTackles = americanFootballPlayerSeasonStatistics.getDefensiveCombineTackles();
        if (defensiveCombineTackles != null) {
            int intValue = defensiveCombineTackles.intValue();
            String string = context.getString(R.string.combine_tackles);
            arrayList.add(new jei(string, wt3.l(string, intValue, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer defensiveTotalTackles = americanFootballPlayerSeasonStatistics.getDefensiveTotalTackles();
        if (defensiveTotalTackles != null) {
            int intValue2 = defensiveTotalTackles.intValue();
            String string2 = context.getString(R.string.football_tackles);
            arrayList.add(new jei(string2, wt3.l(string2, intValue2, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer defensiveAssistTackles = americanFootballPlayerSeasonStatistics.getDefensiveAssistTackles();
        if (defensiveAssistTackles != null) {
            int intValue3 = defensiveAssistTackles.intValue();
            String string3 = context.getString(R.string.assist_tackle);
            arrayList.add(new jei(string3, wt3.l(string3, intValue3, americanFootballPlayerSeasonStatistics, z), null));
        }
        Double defensiveSacks = americanFootballPlayerSeasonStatistics.getDefensiveSacks();
        if (defensiveSacks != null) {
            double doubleValue = defensiveSacks.doubleValue();
            String string4 = context.getString(R.string.sacks);
            string4.getClass();
            arrayList.add(new jei(string4, a(americanFootballPlayerSeasonStatistics, Double.valueOf(doubleValue), z), null));
        }
        Integer defensiveForcedFumbles = americanFootballPlayerSeasonStatistics.getDefensiveForcedFumbles();
        if (defensiveForcedFumbles != null) {
            int intValue4 = defensiveForcedFumbles.intValue();
            String string5 = context.getString(R.string.forced_fumbles);
            arrayList.add(new jei(string5, wt3.l(string5, intValue4, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer defensiveSafeties = americanFootballPlayerSeasonStatistics.getDefensiveSafeties();
        if (defensiveSafeties != null) {
            int intValue5 = defensiveSafeties.intValue();
            String string6 = context.getString(R.string.safeties);
            arrayList.add(new jei(string6, wt3.l(string6, intValue5, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer defensiveInterceptions = americanFootballPlayerSeasonStatistics.getDefensiveInterceptions();
        if (defensiveInterceptions != null) {
            int intValue6 = defensiveInterceptions.intValue();
            String string7 = context.getString(R.string.interceptions);
            arrayList.add(new jei(string7, wt3.l(string7, intValue6, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer defensiveInterceptionsTouchdowns = americanFootballPlayerSeasonStatistics.getDefensiveInterceptionsTouchdowns();
        if (defensiveInterceptionsTouchdowns != null) {
            int intValue7 = defensiveInterceptionsTouchdowns.intValue();
            String string8 = context.getString(R.string.interceptions_touchdowns);
            arrayList.add(new jei(string8, wt3.l(string8, intValue7, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer defensiveInterceptionsYards = americanFootballPlayerSeasonStatistics.getDefensiveInterceptionsYards();
        if (defensiveInterceptionsYards != null) {
            int intValue8 = defensiveInterceptionsYards.intValue();
            String string9 = context.getString(R.string.interceptions_yards);
            arrayList.add(new jei(string9, wt3.l(string9, intValue8, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer defensivePassesDefensed = americanFootballPlayerSeasonStatistics.getDefensivePassesDefensed();
        if (defensivePassesDefensed != null) {
            int intValue9 = defensivePassesDefensed.intValue();
            String string10 = context.getString(R.string.passes_defended);
            arrayList.add(new jei(string10, wt3.l(string10, intValue9, americanFootballPlayerSeasonStatistics, z), null));
        }
        return arrayList;
    }

    public static final List d(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Context context, boolean z) {
        Integer fumbleFumbles = americanFootballPlayerSeasonStatistics.getFumbleFumbles();
        if ((fumbleFumbles != null ? fumbleFumbles.intValue() : 0) < 1) {
            Integer fumbleRecovery = americanFootballPlayerSeasonStatistics.getFumbleRecovery();
            if ((fumbleRecovery != null ? fumbleRecovery.intValue() : 0) < 1) {
                return km5.a;
            }
        }
        ArrayList arrayList = new ArrayList();
        Integer fumbleFumbles2 = americanFootballPlayerSeasonStatistics.getFumbleFumbles();
        if (fumbleFumbles2 != null) {
            int intValue = fumbleFumbles2.intValue();
            String string = context.getString(R.string.fumbles);
            arrayList.add(new jei(string, wt3.l(string, intValue, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer fumbleRecovery2 = americanFootballPlayerSeasonStatistics.getFumbleRecovery();
        if (fumbleRecovery2 != null) {
            int intValue2 = fumbleRecovery2.intValue();
            String string2 = context.getString(R.string.fumble_recoveries);
            arrayList.add(new jei(string2, wt3.l(string2, intValue2, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer fumbleLost = americanFootballPlayerSeasonStatistics.getFumbleLost();
        if (fumbleLost != null) {
            int intValue3 = fumbleLost.intValue();
            String string3 = context.getString(R.string.fumbles_lost);
            arrayList.add(new jei(string3, wt3.l(string3, intValue3, americanFootballPlayerSeasonStatistics, z), null));
        }
        Integer fumbleSafety = americanFootballPlayerSeasonStatistics.getFumbleSafety();
        if (fumbleSafety != null) {
            int intValue4 = fumbleSafety.intValue();
            String string4 = context.getString(R.string.fumbles_safety);
            arrayList.add(new jei(string4, wt3.l(string4, intValue4, americanFootballPlayerSeasonStatistics, z), null));
        }
        return arrayList;
    }

    public static final ArrayList e(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        Integer passingAttempts = americanFootballPlayerSeasonStatistics.getPassingAttempts();
        if (passingAttempts != null) {
            if (passingAttempts.intValue() <= 0) {
                passingAttempts = null;
            }
            if (passingAttempts != null) {
                int intValue = passingAttempts.intValue();
                Integer passingTouchdowns = americanFootballPlayerSeasonStatistics.getPassingTouchdowns();
                if (passingTouchdowns != null) {
                    int intValue2 = passingTouchdowns.intValue();
                    String string = context.getString(R.string.touchdowns);
                    arrayList.add(new jei(string, wt3.l(string, intValue2, americanFootballPlayerSeasonStatistics, z), null));
                }
                String string2 = context.getString(R.string.attempts);
                arrayList.add(new jei(string2, wt3.l(string2, intValue, americanFootballPlayerSeasonStatistics, z), null));
                Integer passingCompletions = americanFootballPlayerSeasonStatistics.getPassingCompletions();
                if (passingCompletions != null) {
                    int intValue3 = passingCompletions.intValue();
                    String string3 = context.getString(R.string.completions);
                    arrayList.add(new jei(string3, wt3.l(string3, intValue3, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer passingYards = americanFootballPlayerSeasonStatistics.getPassingYards();
                if (passingYards != null) {
                    int intValue4 = passingYards.intValue();
                    String string4 = context.getString(R.string.yards);
                    arrayList.add(new jei(string4, wt3.l(string4, intValue4, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer passingNetYards = americanFootballPlayerSeasonStatistics.getPassingNetYards();
                if (passingNetYards != null) {
                    int intValue5 = passingNetYards.intValue();
                    String string5 = context.getString(R.string.net_yards);
                    arrayList.add(new jei(string5, wt3.l(string5, intValue5, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer passingLongest = americanFootballPlayerSeasonStatistics.getPassingLongest();
                if (passingLongest != null) {
                    int intValue6 = passingLongest.intValue();
                    String string6 = context.getString(R.string.longest_pass);
                    string6.getClass();
                    arrayList.add(new jei(string6, String.valueOf(intValue6), null));
                }
                Integer passingInterceptions = americanFootballPlayerSeasonStatistics.getPassingInterceptions();
                if (passingInterceptions != null) {
                    int intValue7 = passingInterceptions.intValue();
                    String string7 = context.getString(R.string.interceptions_thrown);
                    arrayList.add(new jei(string7, wt3.l(string7, intValue7, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer passingSacked = americanFootballPlayerSeasonStatistics.getPassingSacked();
                if (passingSacked != null) {
                    int intValue8 = passingSacked.intValue();
                    String string8 = context.getString(R.string.sacked);
                    arrayList.add(new jei(string8, wt3.l(string8, intValue8, americanFootballPlayerSeasonStatistics, z), null));
                }
            }
        }
        return arrayList;
    }

    public static final ArrayList f(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        Integer puntingTotal = americanFootballPlayerSeasonStatistics.getPuntingTotal();
        if (puntingTotal != null) {
            if (puntingTotal.intValue() <= 0) {
                puntingTotal = null;
            }
            if (puntingTotal != null) {
                int intValue = puntingTotal.intValue();
                String string = context.getString(R.string.punts);
                arrayList.add(new jei(string, wt3.l(string, intValue, americanFootballPlayerSeasonStatistics, z), null));
                Integer puntingYards = americanFootballPlayerSeasonStatistics.getPuntingYards();
                if (puntingYards != null) {
                    int intValue2 = puntingYards.intValue();
                    String string2 = context.getString(R.string.yards);
                    arrayList.add(new jei(string2, wt3.l(string2, intValue2, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer puntingNetYards = americanFootballPlayerSeasonStatistics.getPuntingNetYards();
                if (puntingNetYards != null) {
                    int intValue3 = puntingNetYards.intValue();
                    String string3 = context.getString(R.string.net_yards);
                    arrayList.add(new jei(string3, wt3.l(string3, intValue3, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer puntingLongest = americanFootballPlayerSeasonStatistics.getPuntingLongest();
                if (puntingLongest != null) {
                    int intValue4 = puntingLongest.intValue();
                    String string4 = context.getString(R.string.longest);
                    string4.getClass();
                    arrayList.add(new jei(string4, String.valueOf(intValue4), null));
                }
                Integer puntingBlocked = americanFootballPlayerSeasonStatistics.getPuntingBlocked();
                if (puntingBlocked != null) {
                    int intValue5 = puntingBlocked.intValue();
                    String string5 = context.getString(R.string.blocked);
                    arrayList.add(new jei(string5, wt3.l(string5, intValue5, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer puntingTouchbacks = americanFootballPlayerSeasonStatistics.getPuntingTouchbacks();
                if (puntingTouchbacks != null) {
                    int intValue6 = puntingTouchbacks.intValue();
                    String string6 = context.getString(R.string.touchbacks);
                    arrayList.add(new jei(string6, wt3.l(string6, intValue6, americanFootballPlayerSeasonStatistics, z), null));
                }
            }
        }
        return arrayList;
    }

    public static final ArrayList g(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        Integer receivingReceptions = americanFootballPlayerSeasonStatistics.getReceivingReceptions();
        if (receivingReceptions != null) {
            if (receivingReceptions.intValue() <= 0) {
                receivingReceptions = null;
            }
            if (receivingReceptions != null) {
                int intValue = receivingReceptions.intValue();
                Integer receivingTouchdowns = americanFootballPlayerSeasonStatistics.getReceivingTouchdowns();
                if (receivingTouchdowns != null) {
                    int intValue2 = receivingTouchdowns.intValue();
                    String string = context.getString(R.string.touchdowns);
                    arrayList.add(new jei(string, wt3.l(string, intValue2, americanFootballPlayerSeasonStatistics, z), null));
                }
                String string2 = context.getString(R.string.receptions);
                arrayList.add(new jei(string2, wt3.l(string2, intValue, americanFootballPlayerSeasonStatistics, z), null));
                Integer receivingYards = americanFootballPlayerSeasonStatistics.getReceivingYards();
                if (receivingYards != null) {
                    int intValue3 = receivingYards.intValue();
                    String string3 = context.getString(R.string.yards);
                    arrayList.add(new jei(string3, wt3.l(string3, intValue3, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer receivingLongest = americanFootballPlayerSeasonStatistics.getReceivingLongest();
                if (receivingLongest != null) {
                    int intValue4 = receivingLongest.intValue();
                    String string4 = context.getString(R.string.longest_reception);
                    string4.getClass();
                    arrayList.add(new jei(string4, String.valueOf(intValue4), null));
                }
                Integer receivingFirstDowns = americanFootballPlayerSeasonStatistics.getReceivingFirstDowns();
                if (receivingFirstDowns != null) {
                    int intValue5 = receivingFirstDowns.intValue();
                    String string5 = context.getString(R.string.amf_first_downs);
                    arrayList.add(new jei(string5, wt3.l(string5, intValue5, americanFootballPlayerSeasonStatistics, z), null));
                }
            }
        }
        return arrayList;
    }

    public static final ArrayList h(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        Integer rushingAttempts = americanFootballPlayerSeasonStatistics.getRushingAttempts();
        if (rushingAttempts != null) {
            if (rushingAttempts.intValue() <= 0) {
                rushingAttempts = null;
            }
            if (rushingAttempts != null) {
                int intValue = rushingAttempts.intValue();
                String string = context.getString(R.string.attempts);
                arrayList.add(new jei(string, wt3.l(string, intValue, americanFootballPlayerSeasonStatistics, z), null));
                Integer rushingYards = americanFootballPlayerSeasonStatistics.getRushingYards();
                if (rushingYards != null) {
                    int intValue2 = rushingYards.intValue();
                    String string2 = context.getString(R.string.yards);
                    arrayList.add(new jei(string2, wt3.l(string2, intValue2, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer rushingTouchdowns = americanFootballPlayerSeasonStatistics.getRushingTouchdowns();
                if (rushingTouchdowns != null) {
                    int intValue3 = rushingTouchdowns.intValue();
                    String string3 = context.getString(R.string.touchdowns);
                    arrayList.add(new jei(string3, wt3.l(string3, intValue3, americanFootballPlayerSeasonStatistics, z), null));
                }
                Integer rushingLongest = americanFootballPlayerSeasonStatistics.getRushingLongest();
                if (rushingLongest != null) {
                    int intValue4 = rushingLongest.intValue();
                    String string4 = context.getString(R.string.longest_rush);
                    string4.getClass();
                    arrayList.add(new jei(string4, String.valueOf(intValue4), null));
                }
                Integer rushingFumbles = americanFootballPlayerSeasonStatistics.getRushingFumbles();
                if (rushingFumbles != null) {
                    int intValue5 = rushingFumbles.intValue();
                    String string5 = context.getString(R.string.fumbles);
                    arrayList.add(new jei(string5, wt3.l(string5, intValue5, americanFootballPlayerSeasonStatistics, z), null));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x02c1, code lost:
    
        r2 = r17.getString(com.sofascore.results.R.string.american_football_stat_defence);
        r2.getClass();
        defpackage.ezg.g(r4, r2, c(r16, r17, r19), r7);
        r2 = r17.getString(com.sofascore.results.R.string.fumbles);
        r2.getClass();
        defpackage.ezg.g(r4, r2, d(r16, r17, r19), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OUTSIDE_LINEBACK) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_MIDDLE_LINEBACK) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0515, code lost:
    
        if (r18.equals("G") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x051e, code lost:
    
        if (r18.equals("C") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_INSIDE_LINEBACK) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_WIDE_RECEIVER) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0154, code lost:
    
        r2 = r17.getString(com.sofascore.results.R.string.receiving);
        r2.getClass();
        defpackage.ezg.g(r4, r2, g(r16, r17, r19), r7);
        r2 = r17.getString(com.sofascore.results.R.string.rushing);
        r2.getClass();
        defpackage.ezg.g(r4, r2, h(r16, r17, r19), r7);
        r2 = r17.getString(com.sofascore.results.R.string.passing);
        r2.getClass();
        defpackage.ezg.g(r4, r2, e(r16, r17, r19), r7);
        r2 = r17.getString(com.sofascore.results.R.string.fumbles);
        r2.getClass();
        defpackage.ezg.g(r4, r2, d(r16, r17, r19), r7);
        r2 = r17.getString(com.sofascore.results.R.string.kick_returns);
        r2.getClass();
        r5 = new java.util.ArrayList();
        r6 = r16.getKickReturnsTotal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x019f, code lost:
    
        if (r6 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01a5, code lost:
    
        if (r6.intValue() <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a8, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01a9, code lost:
    
        if (r6 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ab, code lost:
    
        r6 = r6.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b1, code lost:
    
        if (r19 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b3, code lost:
    
        r12 = com.sofascore.results.R.string.total;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01b8, code lost:
    
        r12 = r17.getString(r12);
        r5.add(new defpackage.jei(r12, defpackage.wt3.l(r12, r6, r16, r19), null));
        r6 = r16.getKickReturnsYards();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ca, code lost:
    
        if (r6 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01cc, code lost:
    
        r6 = r6.intValue();
        r12 = r17.getString(com.sofascore.results.R.string.yards);
        r5.add(new defpackage.jei(r12, defpackage.wt3.l(r12, r6, r16, r19), null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01e0, code lost:
    
        r6 = r16.getKickReturnsTouchdowns();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e4, code lost:
    
        if (r6 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01e6, code lost:
    
        r6 = r6.intValue();
        r12 = r17.getString(com.sofascore.results.R.string.touchdowns);
        r5.add(new defpackage.jei(r12, defpackage.wt3.l(r12, r6, r16, r19), null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01fd, code lost:
    
        r6 = r16.getKickReturnsFumbles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0201, code lost:
    
        if (r6 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0203, code lost:
    
        r6 = r6.intValue();
        r10 = r17.getString(com.sofascore.results.R.string.fumbles);
        r5.add(new defpackage.jei(r10, defpackage.wt3.l(r10, r6, r16, r19), null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b5, code lost:
    
        r12 = com.sofascore.results.R.string.basketball_per_game_stats_title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0217, code lost:
    
        defpackage.ezg.g(r4, r2, r5, r7);
        r2 = r17.getString(com.sofascore.results.R.string.amf_punt_returns);
        r2.getClass();
        r5 = new java.util.ArrayList();
        r6 = r16.getPuntReturnsTotal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x022d, code lost:
    
        if (r6 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0233, code lost:
    
        if (r6.intValue() <= 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0236, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0237, code lost:
    
        if (r6 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0239, code lost:
    
        r6 = r6.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023f, code lost:
    
        if (r19 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0241, code lost:
    
        r12 = com.sofascore.results.R.string.total;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0246, code lost:
    
        r11 = r17.getString(r12);
        r5.add(new defpackage.jei(r11, defpackage.wt3.l(r11, r6, r16, r19), null));
        r6 = r16.getPuntReturnsYards();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0258, code lost:
    
        if (r6 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x025a, code lost:
    
        r6 = r6.intValue();
        r9 = r17.getString(com.sofascore.results.R.string.yards);
        r5.add(new defpackage.jei(r9, defpackage.wt3.l(r9, r6, r16, r19), null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026e, code lost:
    
        r6 = r16.getPuntReturnsTouchdowns();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0272, code lost:
    
        if (r6 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0274, code lost:
    
        r6 = r6.intValue();
        r1 = r17.getString(com.sofascore.results.R.string.punt_returns_touchdowns);
        r5.add(new defpackage.jei(r1, defpackage.wt3.l(r1, r6, r16, r19), null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0243, code lost:
    
        r12 = com.sofascore.results.R.string.basketball_per_game_stats_title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x028b, code lost:
    
        defpackage.ezg.g(r4, r2, r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a9, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_TIGHT_END) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bd, code lost:
    
        if (r18.equals("RB") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0521, code lost:
    
        r2 = r17.getString(com.sofascore.results.R.string.fumbles);
        r2.getClass();
        defpackage.ezg.g(r4, r2, d(r16, r17, r19), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_LINEMAN) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011e, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_GUARD) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0128, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_NOSE_TACKLE) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0132, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_LONG_SNAPPER) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013c, code lost:
    
        if (r18.equals("LB") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0146, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_FREE_SAFETY) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0150, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_FULLBACK) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0295, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_TACKLE) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x029f, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_LINEMAN) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a9, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b3, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_BACK) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02bd, code lost:
    
        if (r18.equals("CB") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e4, code lost:
    
        if (r18.equals("T") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        if (r18.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_SAFETY) == false) goto L206;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList i(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Context context, String str, boolean z) {
        Integer kickingExtraAttempts;
        americanFootballPlayerSeasonStatistics.getClass();
        context.getClass();
        ArrayList arrayList = new ArrayList();
        mqi mqiVar = bii.a;
        String string = context.getString(bii.b(Sports.AMERICAN_FOOTBALL, false));
        string.getClass();
        ArrayList arrayList2 = new ArrayList();
        Integer appearances = americanFootballPlayerSeasonStatistics.getAppearances();
        if (appearances != null) {
            int intValue = appearances.intValue();
            String string2 = context.getString(R.string.am_foot_games_played);
            string2.getClass();
            arrayList2.add(new jei(string2, String.valueOf(intValue), null));
        }
        km5 km5Var = km5.a;
        ezg.g(arrayList, string, arrayList2, km5Var);
        if (str != null) {
            switch (str.hashCode()) {
                case 67:
                    break;
                case 71:
                    break;
                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_KICKER)) {
                        String string3 = context.getString(R.string.amf_kicking);
                        string3.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        Integer kickingFgAttempts = americanFootballPlayerSeasonStatistics.getKickingFgAttempts();
                        if (kickingFgAttempts != null) {
                            if (kickingFgAttempts.intValue() <= 0) {
                                kickingFgAttempts = null;
                            }
                            if (kickingFgAttempts != null && (kickingExtraAttempts = americanFootballPlayerSeasonStatistics.getKickingExtraAttempts()) != null) {
                                if (kickingExtraAttempts.intValue() <= 0) {
                                    kickingExtraAttempts = null;
                                }
                                if (kickingExtraAttempts != null) {
                                    Integer kickingFgMade = americanFootballPlayerSeasonStatistics.getKickingFgMade();
                                    if (kickingFgMade != null) {
                                        int intValue2 = kickingFgMade.intValue();
                                        Integer kickingFgAttempts2 = americanFootballPlayerSeasonStatistics.getKickingFgAttempts();
                                        if (kickingFgAttempts2 != null) {
                                            int intValue3 = kickingFgAttempts2.intValue();
                                            String string4 = context.getString(R.string.overall_made);
                                            string4.getClass();
                                            arrayList3.add(new jei(string4, b(americanFootballPlayerSeasonStatistics, Integer.valueOf(intValue2), Integer.valueOf(intValue3), z), null));
                                        }
                                    }
                                    Integer kickingExtraMade = americanFootballPlayerSeasonStatistics.getKickingExtraMade();
                                    if (kickingExtraMade != null) {
                                        int intValue4 = kickingExtraMade.intValue();
                                        Integer kickingExtraAttempts2 = americanFootballPlayerSeasonStatistics.getKickingExtraAttempts();
                                        if (kickingExtraAttempts2 != null) {
                                            int intValue5 = kickingExtraAttempts2.intValue();
                                            String string5 = context.getString(R.string.kicking_extra_made);
                                            string5.getClass();
                                            arrayList3.add(new jei(string5, b(americanFootballPlayerSeasonStatistics, Integer.valueOf(intValue4), Integer.valueOf(intValue5), z), null));
                                        }
                                    }
                                    Integer kickingFgMade20to29 = americanFootballPlayerSeasonStatistics.getKickingFgMade20to29();
                                    if (kickingFgMade20to29 != null) {
                                        int intValue6 = kickingFgMade20to29.intValue();
                                        Integer kickingFgAttempts20to29 = americanFootballPlayerSeasonStatistics.getKickingFgAttempts20to29();
                                        if (kickingFgAttempts20to29 != null) {
                                            int intValue7 = kickingFgAttempts20to29.intValue();
                                            String string6 = context.getString(R.string.made_20);
                                            string6.getClass();
                                            arrayList3.add(new jei(string6, b(americanFootballPlayerSeasonStatistics, Integer.valueOf(intValue6), Integer.valueOf(intValue7), z), null));
                                        }
                                    }
                                    Integer kickingFgMade30to39 = americanFootballPlayerSeasonStatistics.getKickingFgMade30to39();
                                    if (kickingFgMade30to39 != null) {
                                        int intValue8 = kickingFgMade30to39.intValue();
                                        Integer kickingFgAttempts30to39 = americanFootballPlayerSeasonStatistics.getKickingFgAttempts30to39();
                                        if (kickingFgAttempts30to39 != null) {
                                            int intValue9 = kickingFgAttempts30to39.intValue();
                                            String string7 = context.getString(R.string.made_30);
                                            string7.getClass();
                                            arrayList3.add(new jei(string7, b(americanFootballPlayerSeasonStatistics, Integer.valueOf(intValue8), Integer.valueOf(intValue9), z), null));
                                        }
                                    }
                                    Integer kickingFgMade40to49 = americanFootballPlayerSeasonStatistics.getKickingFgMade40to49();
                                    if (kickingFgMade40to49 != null) {
                                        int intValue10 = kickingFgMade40to49.intValue();
                                        Integer kickingFgAttempts40to49 = americanFootballPlayerSeasonStatistics.getKickingFgAttempts40to49();
                                        if (kickingFgAttempts40to49 != null) {
                                            int intValue11 = kickingFgAttempts40to49.intValue();
                                            String string8 = context.getString(R.string.made_40);
                                            string8.getClass();
                                            arrayList3.add(new jei(string8, b(americanFootballPlayerSeasonStatistics, Integer.valueOf(intValue10), Integer.valueOf(intValue11), z), null));
                                        }
                                    }
                                    Integer kickingFgMade50plus = americanFootballPlayerSeasonStatistics.getKickingFgMade50plus();
                                    if (kickingFgMade50plus != null) {
                                        int intValue12 = kickingFgMade50plus.intValue();
                                        Integer kickingFgAttempts50plus = americanFootballPlayerSeasonStatistics.getKickingFgAttempts50plus();
                                        if (kickingFgAttempts50plus != null) {
                                            int intValue13 = kickingFgAttempts50plus.intValue();
                                            String string9 = context.getString(R.string.made_50);
                                            string9.getClass();
                                            arrayList3.add(new jei(string9, b(americanFootballPlayerSeasonStatistics, Integer.valueOf(intValue12), Integer.valueOf(intValue13), z), null));
                                        }
                                    }
                                    Integer kickingFgBlocked = americanFootballPlayerSeasonStatistics.getKickingFgBlocked();
                                    if (kickingFgBlocked != null) {
                                        int intValue14 = kickingFgBlocked.intValue();
                                        if (americanFootballPlayerSeasonStatistics.getAppearances() != null) {
                                            String string10 = context.getString(R.string.overall_blocked);
                                            arrayList3.add(new jei(string10, wt3.l(string10, intValue14, americanFootballPlayerSeasonStatistics, z), null));
                                        }
                                    }
                                }
                            }
                        }
                        ezg.g(arrayList, string3, arrayList3, km5Var);
                        String string11 = context.getString(R.string.punting);
                        string11.getClass();
                        ezg.g(arrayList, string11, f(americanFootballPlayerSeasonStatistics, context, z), km5Var);
                        String string12 = context.getString(R.string.kickoff);
                        string12.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        Integer kickoffTotal = americanFootballPlayerSeasonStatistics.getKickoffTotal();
                        if (kickoffTotal != null) {
                            if (kickoffTotal.intValue() <= 0) {
                                kickoffTotal = null;
                            }
                            if (kickoffTotal != null) {
                                int intValue15 = kickoffTotal.intValue();
                                String string13 = context.getString(z ? R.string.total : R.string.basketball_per_game_stats_title);
                                arrayList4.add(new jei(string13, wt3.l(string13, intValue15, americanFootballPlayerSeasonStatistics, z), null));
                                Integer kickoffTouchbacks = americanFootballPlayerSeasonStatistics.getKickoffTouchbacks();
                                if (kickoffTouchbacks != null) {
                                    int intValue16 = kickoffTouchbacks.intValue();
                                    String string14 = context.getString(R.string.touchbacks);
                                    arrayList4.add(new jei(string14, wt3.l(string14, intValue16, americanFootballPlayerSeasonStatistics, z), null));
                                }
                                Integer kickoffReturns = americanFootballPlayerSeasonStatistics.getKickoffReturns();
                                if (kickoffReturns != null) {
                                    int intValue17 = kickoffReturns.intValue();
                                    String string15 = context.getString(R.string.kick_returns);
                                    arrayList4.add(new jei(string15, wt3.l(string15, intValue17, americanFootballPlayerSeasonStatistics, z), null));
                                }
                            }
                        }
                        ezg.g(arrayList, string12, arrayList4, km5Var);
                        break;
                    }
                    break;
                case 80:
                    if (str.equals("P")) {
                        String string16 = context.getString(R.string.punting);
                        string16.getClass();
                        ezg.g(arrayList, string16, f(americanFootballPlayerSeasonStatistics, context, z), km5Var);
                        break;
                    }
                    break;
                case 84:
                    break;
                case 2143:
                    break;
                case 2174:
                    break;
                case 2177:
                    break;
                case 2184:
                    break;
                case 2192:
                    break;
                case 2236:
                    break;
                case 2253:
                    break;
                case 2422:
                    break;
                case 2439:
                    break;
                case 2502:
                    break;
                case 2520:
                    break;
                case 2525:
                    break;
                case 2533:
                    break;
                case 2577:
                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_QUARTERBACK)) {
                        String string17 = context.getString(R.string.passing);
                        string17.getClass();
                        ezg.g(arrayList, string17, e(americanFootballPlayerSeasonStatistics, context, z), km5Var);
                        String string18 = context.getString(R.string.rushing);
                        string18.getClass();
                        ezg.g(arrayList, string18, h(americanFootballPlayerSeasonStatistics, context, z), km5Var);
                        String string19 = context.getString(R.string.receiving);
                        string19.getClass();
                        ezg.g(arrayList, string19, g(americanFootballPlayerSeasonStatistics, context, z), km5Var);
                        String string20 = context.getString(R.string.fumbles);
                        string20.getClass();
                        ezg.g(arrayList, string20, d(americanFootballPlayerSeasonStatistics, context, z), km5Var);
                        break;
                    }
                    break;
                case 2608:
                    break;
                case 2656:
                    break;
                case 2673:
                    break;
                case 2779:
                    break;
                case 72575:
                    break;
                case 76419:
                    break;
                case 78341:
                    break;
                case 81848:
                    break;
            }
            return arrayList;
        }
        String string21 = context.getString(R.string.passing);
        string21.getClass();
        ezg.g(arrayList, string21, e(americanFootballPlayerSeasonStatistics, context, z), km5Var);
        String string22 = context.getString(R.string.rushing);
        string22.getClass();
        ezg.g(arrayList, string22, h(americanFootballPlayerSeasonStatistics, context, z), km5Var);
        String string23 = context.getString(R.string.fumbles);
        string23.getClass();
        ezg.g(arrayList, string23, d(americanFootballPlayerSeasonStatistics, context, z), km5Var);
        String string24 = context.getString(R.string.american_football_stat_defence);
        string24.getClass();
        ezg.g(arrayList, string24, c(americanFootballPlayerSeasonStatistics, context, z), km5Var);
        return arrayList;
    }
}
