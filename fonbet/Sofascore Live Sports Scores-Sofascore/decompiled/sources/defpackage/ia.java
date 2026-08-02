package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ia implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ia(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fd, code lost:
    
        if (defpackage.yid.m(r4 != null ? r4.getFumbleOpponentFumbleRecovery() : null) > 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0267, code lost:
    
        if (defpackage.yid.m(r4 != null ? r4.getReceivingTargets() : null) > 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        if (defpackage.yid.m(r4 != null ? r4.getPuntReturnsFairCatches() : null) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011c, code lost:
    
        if (defpackage.yid.m(r4 != null ? r4.getKickReturnsFairCatches() : null) > 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0179, code lost:
    
        if (defpackage.yid.m(r4 != null ? r4.getKickingExtraAttempts() : null) > 0) goto L98;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 3:
                ((eld) obj).getClass();
                return "odds_comparison_item";
            case 4:
                ((pv3) obj).getClass();
                return "signup_link_item";
            case 5:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(300, 0, null, 6), 2), uo5.f(s02.h0(300, 0, null, 6), 2));
            case 6:
                qj qjVar = (qj) obj;
                qjVar.getClass();
                return hz8.I(qjVar);
            case 7:
                qj qjVar2 = (qj) obj;
                qjVar2.getClass();
                return hz8.I(qjVar2);
            case 8:
                pv3 pv3Var = (pv3) obj;
                pv3Var.getClass();
                return Integer.valueOf(pv3Var.a);
            case 9:
                PlayerData playerData = (PlayerData) obj;
                playerData.getClass();
                AmericanFootballPlayerEventStatistics amFootballStatistics = playerData.getAmFootballStatistics();
                return Boolean.valueOf(yid.m(amFootballStatistics != null ? amFootballStatistics.getPassingAttempts() : null) > 0);
            case 10:
                PlayerData playerData2 = (PlayerData) obj;
                playerData2.getClass();
                AmericanFootballPlayerEventStatistics amFootballStatistics2 = playerData2.getAmFootballStatistics();
                return Boolean.valueOf(yid.m(amFootballStatistics2 != null ? amFootballStatistics2.getRushingAttempts() : null) > 0);
            case 11:
                PlayerData playerData3 = (PlayerData) obj;
                playerData3.getClass();
                PlayerEventStatistics statistics = playerData3.getStatistics();
                if (!(statistics instanceof AmericanFootballPlayerEventStatistics)) {
                    statistics = null;
                }
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) statistics;
                if (yid.m(americanFootballPlayerEventStatistics != null ? americanFootballPlayerEventStatistics.getReceivingReceptions() : null) <= 0) {
                    AmericanFootballPlayerEventStatistics amFootballStatistics3 = playerData3.getAmFootballStatistics();
                    break;
                }
                r0 = true;
                return Boolean.valueOf(r0);
            case 12:
                PlayerData playerData4 = (PlayerData) obj;
                playerData4.getClass();
                AmericanFootballPlayerEventStatistics amFootballStatistics4 = playerData4.getAmFootballStatistics();
                return Boolean.valueOf(yid.m(amFootballStatistics4 != null ? amFootballStatistics4.getDefensiveCombineTackles() : null) > 0);
            case 13:
                PlayerData playerData5 = (PlayerData) obj;
                playerData5.getClass();
                AmericanFootballPlayerEventStatistics amFootballStatistics5 = playerData5.getAmFootballStatistics();
                return Boolean.valueOf(yid.m(amFootballStatistics5 != null ? amFootballStatistics5.getDefensiveInterceptions() : null) > 0);
            case 14:
                PlayerData playerData6 = (PlayerData) obj;
                playerData6.getClass();
                PlayerEventStatistics statistics2 = playerData6.getStatistics();
                if (!(statistics2 instanceof AmericanFootballPlayerEventStatistics)) {
                    statistics2 = null;
                }
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2 = (AmericanFootballPlayerEventStatistics) statistics2;
                if (yid.m(americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleFumbles() : null) <= 0) {
                    if (yid.m(americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleRecovery() : null) <= 0) {
                        if (yid.m(americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleLost() : null) <= 0) {
                            if (yid.m(americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveForcedFumbles() : null) <= 0) {
                                if (yid.m(americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleTouchdownReturns() : null) <= 0) {
                                    if (yid.m(americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleOutOfBounds() : null) <= 0) {
                                        if (yid.m(americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleOwnFumbleRecovery() : null) <= 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                r0 = true;
                return Boolean.valueOf(r0);
            case 15:
                PlayerData playerData7 = (PlayerData) obj;
                playerData7.getClass();
                PlayerEventStatistics statistics3 = playerData7.getStatistics();
                if (!(statistics3 instanceof AmericanFootballPlayerEventStatistics)) {
                    statistics3 = null;
                }
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics3 = (AmericanFootballPlayerEventStatistics) statistics3;
                if (yid.m(americanFootballPlayerEventStatistics3 != null ? americanFootballPlayerEventStatistics3.getKickingFgAttempts() : null) <= 0) {
                    PlayerEventStatistics statistics4 = playerData7.getStatistics();
                    if (!(statistics4 instanceof AmericanFootballPlayerEventStatistics)) {
                        statistics4 = null;
                    }
                    AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics4 = (AmericanFootballPlayerEventStatistics) statistics4;
                    break;
                }
                r0 = true;
                return Boolean.valueOf(r0);
            case 16:
                PlayerData playerData8 = (PlayerData) obj;
                playerData8.getClass();
                PlayerEventStatistics statistics5 = playerData8.getStatistics();
                if (!(statistics5 instanceof AmericanFootballPlayerEventStatistics)) {
                    statistics5 = null;
                }
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics5 = (AmericanFootballPlayerEventStatistics) statistics5;
                return Boolean.valueOf(yid.m(americanFootballPlayerEventStatistics5 != null ? americanFootballPlayerEventStatistics5.getPuntingTotal() : null) > 0);
            case 17:
                PlayerData playerData9 = (PlayerData) obj;
                playerData9.getClass();
                PlayerEventStatistics statistics6 = playerData9.getStatistics();
                if (!(statistics6 instanceof AmericanFootballPlayerEventStatistics)) {
                    statistics6 = null;
                }
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics6 = (AmericanFootballPlayerEventStatistics) statistics6;
                if (yid.m(americanFootballPlayerEventStatistics6 != null ? americanFootballPlayerEventStatistics6.getKickReturnsTotal() : null) <= 0) {
                    PlayerEventStatistics statistics7 = playerData9.getStatistics();
                    if (!(statistics7 instanceof AmericanFootballPlayerEventStatistics)) {
                        statistics7 = null;
                    }
                    AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics7 = (AmericanFootballPlayerEventStatistics) statistics7;
                    break;
                }
                r0 = true;
                return Boolean.valueOf(r0);
            case 18:
                PlayerData playerData10 = (PlayerData) obj;
                playerData10.getClass();
                PlayerEventStatistics statistics8 = playerData10.getStatistics();
                if (!(statistics8 instanceof AmericanFootballPlayerEventStatistics)) {
                    statistics8 = null;
                }
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics8 = (AmericanFootballPlayerEventStatistics) statistics8;
                if (yid.m(americanFootballPlayerEventStatistics8 != null ? americanFootballPlayerEventStatistics8.getPuntReturnsTotal() : null) <= 0) {
                    PlayerEventStatistics statistics9 = playerData10.getStatistics();
                    if (!(statistics9 instanceof AmericanFootballPlayerEventStatistics)) {
                        statistics9 = null;
                    }
                    AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics9 = (AmericanFootballPlayerEventStatistics) statistics9;
                    break;
                }
                r0 = true;
                return Boolean.valueOf(r0);
            case 19:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics10 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics10.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics10.getDefensiveCombineTackles()));
            case 20:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getDefensiveTacklesForLoss()));
            case 21:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getDefensiveCombineTackles()));
            case 22:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 23:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 24:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics11 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics11.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics11.getDefensiveAssistTackles()));
            case 25:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getDefensiveAssistTackles()));
            case 26:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 27:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics12 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics12.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics12.getDefensiveSacks()), 1);
            case 28:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics13 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics13.getClass();
                Double defensiveSacks = americanFootballPlayerEventStatistics13.getDefensiveSacks();
                return Double.valueOf(defensiveSacks != null ? defensiveSacks.doubleValue() : 0.0d);
            default:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
