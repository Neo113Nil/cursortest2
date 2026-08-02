package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.moments.widgets.compose.BlazeComposeWidgetMomentsStateHandler;
import com.blaze.blazesdk.features.moments.widgets.compose.grid.BlazeComposeMomentsWidgetGridViewKt;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.fantasy.FantasyPlayerFixture;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.mvvm.model.AmericanFootballEvent;
import com.sofascore.model.mvvm.model.BaseballEvent;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.BasketballEvent;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.DartsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventChanges;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.newNetwork.AiInsightsSections;
import com.sofascore.model.player.PlayerEventIncidents;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class s9a {
    public static ExecutorService b;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final Object a = new Object();
    public static final tc3 c = new tc3(-1893462935, new gd3(0), false);
    public static final tc3 d = new tc3(359871618, new pd3(12), false);
    public static final tc3 e = new tc3(952007863, new ud3(4), false);
    public static final tc3 f = new tc3(2073913300, new ud3(5), false);
    public static final SerialDescriptor[] g = new SerialDescriptor[0];
    public static final rfi h = new rfi(15);

    public static final xtc A(xtc xtcVar, ct8 ct8Var) {
        return xtcVar.z(new fma(ct8Var));
    }

    public static float B(float f2, float[] fArr, float[] fArr2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float abs = Math.abs(f2);
        float signum = Math.signum(f2);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i2 = -(binarySearch + 1);
        int i3 = i2 - 1;
        if (i3 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            return f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (fArr2[fArr.length - 1] / f7) * f2;
        }
        if (i3 == -1) {
            float f8 = fArr[0];
            f5 = fArr2[0];
            f6 = f8;
            f4 = 0.0f;
            f3 = 0.0f;
        } else {
            float f9 = fArr[i3];
            float f10 = fArr[i2];
            f3 = fArr2[i3];
            f4 = f9;
            f5 = fArr2[i2];
            f6 = f10;
        }
        return (((f5 - f3) * Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, f4 == f6 ? 0.0f : (abs - f4) / (f6 - f4)))) + f3) * signum;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_POSTPONED) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015a, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f3, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_WILL_CONTINUE) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010a, code lost:
    
        r0 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r15, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010e, code lost:
    
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        if (r0.intValue() != 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0117, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011a, code lost:
    
        r2 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r15, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011e, code lost:
    
        if (r2 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0126, code lost:
    
        if (r2.intValue() != 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        r3 = r0;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0119, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fd, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_CANCELED) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0107, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014c, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_SUSPENDED) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_INTERRUPTED) == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void C(y21 y21Var, Event event) {
        Integer num;
        jfj jfjVar;
        String valueOf;
        String str;
        int i2 = R.color.n_lv_1;
        Integer valueOf2 = Integer.valueOf(R.color.n_lv_1);
        Integer valueOf3 = Integer.valueOf(R.color.n_lv_3);
        y21Var.getClass();
        event.getClass();
        jfj jfjVar2 = null;
        Integer penalties = Event.getHomeScore$default(event, null, 1, null).getPenalties();
        int i3 = 4;
        int i4 = R.color.live;
        if (penalties == null) {
            String statusType = event.getStatusType();
            switch (statusType.hashCode()) {
                case -1947652542:
                    break;
                case -1661628965:
                    break;
                case -1411655086:
                    if (statusType.equals(StatusKt.STATUS_IN_PROGRESS)) {
                        if (event.isCrowdsourcingLive()) {
                            i4 = R.color.crowdsourcing_live;
                        }
                        valueOf3 = Integer.valueOf(i4);
                        num = Integer.valueOf(i4);
                        break;
                    }
                    num = null;
                    valueOf3 = null;
                    break;
                case -673660814:
                    break;
                case -123173735:
                    break;
                case 527231609:
                    break;
                case 2018521742:
                    break;
                default:
                    num = null;
                    valueOf3 = null;
                    break;
            }
            if (valueOf3 != null) {
                Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
                y21Var.e = new jfj(i3, display != null ? String.valueOf(display.intValue()) : null, valueOf3);
                Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
                y21Var.f = new jfj(i3, display2 != null ? String.valueOf(display2.intValue()) : null, num);
                return;
            }
            return;
        }
        Integer penalties2 = Event.getHomeScore$default(event, null, 1, null).getPenalties();
        int intValue = penalties2 != null ? penalties2.intValue() : 0;
        Integer penalties3 = Event.getAwayScore$default(event, null, 1, null).getPenalties();
        int intValue2 = penalties3 != null ? penalties3.intValue() : 0;
        y21Var.e = new jfj(i3, lnb.k(intValue, "(", ")"), Integer.valueOf(ok3.D(event) ? event.isCrowdsourcingLive() ? R.color.crowdsourcing_live : R.color.live : intValue > intValue2 ? R.color.n_lv_1 : R.color.n_lv_3));
        String k2 = lnb.k(intValue2, "(", ")");
        if (ok3.D(event)) {
            i2 = event.isCrowdsourcingLive() ? R.color.crowdsourcing_live : R.color.live;
        } else if (intValue2 <= intValue) {
            i2 = R.color.n_lv_3;
        }
        y21Var.f = new jfj(i3, k2, Integer.valueOf(i2));
        jfj jfjVar3 = y21Var.y;
        String str2 = "";
        if (jfjVar3 != null) {
            Integer display3 = Event.getHomeScore$default(event, null, 1, null).getDisplay();
            if (display3 == null || (str = String.valueOf(display3.intValue())) == null) {
                str = "";
            }
            jfjVar = jfj.a(jfjVar3, str, null, 6);
        } else {
            jfjVar = null;
        }
        y21Var.y = jfjVar;
        jfj jfjVar4 = y21Var.z;
        if (jfjVar4 != null) {
            Integer display4 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
            if (display4 != null && (valueOf = String.valueOf(display4.intValue())) != null) {
                str2 = valueOf;
            }
            jfjVar2 = jfj.a(jfjVar4, str2, null, 6);
        }
        y21Var.z = jfjVar2;
    }

    public static final FantasyPlayerFixtureUiModel D(FantasyPlayerFixture fantasyPlayerFixture, boolean z) {
        fantasyPlayerFixture.getClass();
        int eventId = fantasyPlayerFixture.getEventId();
        Integer homeTeamId = fantasyPlayerFixture.getHomeTeamId();
        Integer awayTeamId = fantasyPlayerFixture.getAwayTeamId();
        FantasyRound fantasyRound = fantasyPlayerFixture.getFantasyRound();
        Integer num = null;
        Integer valueOf = fantasyRound != null ? Integer.valueOf(fantasyRound.getId()) : null;
        FantasyRound fantasyRound2 = fantasyPlayerFixture.getFantasyRound();
        String name = fantasyRound2 != null ? fantasyRound2.getName() : null;
        if (name == null) {
            name = "";
        }
        FantasyRound fantasyRound3 = fantasyPlayerFixture.getFantasyRound();
        int sequence = fantasyRound3 != null ? fantasyRound3.getSequence() : 0;
        String nameCode = fantasyPlayerFixture.getTeam().getNameCode();
        if (nameCode == null && (nameCode = fantasyPlayerFixture.getTeam().getShortName()) == null) {
            nameCode = fantasyPlayerFixture.getTeam().getName();
        }
        String locationType = fantasyPlayerFixture.getLocationType();
        int id = fantasyPlayerFixture.getTeam().getId();
        long eventStartTimestamp = fantasyPlayerFixture.getEventStartTimestamp();
        String eventStatusType = fantasyPlayerFixture.getEventStatusType();
        Integer score = fantasyPlayerFixture.getScore();
        if (score != null) {
            num = score;
        } else if (z) {
            num = 0;
        }
        hjg hjgVar = o68.b;
        String fixtureDifficulty = fantasyPlayerFixture.getFixtureDifficulty();
        hjgVar.getClass();
        o68 q = hjg.q(fixtureDifficulty);
        kpg kpgVar = p68.b;
        String locationType2 = fantasyPlayerFixture.getLocationType();
        kpgVar.getClass();
        p68 s = kpg.s(locationType2);
        Integer winnerCode = fantasyPlayerFixture.getWinnerCode();
        Integer playerTeamSide = fantasyPlayerFixture.getPlayerTeamSide();
        Float expectedPoints = fantasyPlayerFixture.getExpectedPoints();
        Double rating = fantasyPlayerFixture.getRating();
        Integer homeScore = fantasyPlayerFixture.getHomeScore();
        Integer awayScore = fantasyPlayerFixture.getAwayScore();
        wxf wxfVar = sd7.c;
        String missingType = fantasyPlayerFixture.getMissingType();
        wxfVar.getClass();
        sd7 g2 = wxf.g(missingType);
        uxf uxfVar = rd7.b;
        Integer missingReason = fantasyPlayerFixture.getMissingReason();
        uxfVar.getClass();
        rd7 C = uxf.C(missingReason);
        zic zicVar = ad7.a;
        String playerFixtureStatus = fantasyPlayerFixture.getPlayerFixtureStatus();
        zicVar.getClass();
        return new FantasyPlayerFixtureUiModel(eventId, homeTeamId, awayTeamId, valueOf, name, sequence, id, nameCode, locationType, num, expectedPoints, rating, eventStartTimestamp, eventStatusType, s, q, winnerCode, playerTeamSide, homeScore, awayScore, g2, C, zic.v(playerFixtureStatus));
    }

    public static final String E(KClass kClass) {
        kClass.getClass();
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return lnb.o("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final ad2 F(ku3 ku3Var, CoroutineContext coroutineContext) {
        return new ad2(ku3Var.getCoroutineContext().plus(coroutineContext));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (((r2 != null ? r2.longValue() : 0) + 6) < (java.lang.System.currentTimeMillis() / 1000)) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void G(y21 y21Var) {
        Event d2 = y21Var.d();
        va9 va9Var = new va9();
        va9Var.a = false;
        va9Var.b = false;
        va9Var.c = false;
        va9Var.d = false;
        va9Var.e = false;
        va9Var.f = false;
        va9Var.g = false;
        va9Var.h = false;
        d2.getClass();
        EventChanges changes = d2.getChanges();
        if (changes != null) {
            long changeTimestamp = changes.getChangeTimestamp();
            if (changeTimestamp > aba.b) {
                aba.b = changeTimestamp;
            }
            if (((System.currentTimeMillis() / 1000) + xe6.c().b) - changeTimestamp >= 30) {
                d2.setChanges(null);
            }
        }
        EventChanges changes2 = d2.getChanges();
        if (changes2 != null) {
            EventChanges eventChanges = Intrinsics.c(d2.getStatusType(), StatusKt.STATUS_IN_PROGRESS) ? changes2 : null;
            if (eventChanges != null) {
                Long l2 = y21Var.E;
                long changeTimestamp2 = eventChanges.getChangeTimestamp();
                if (l2 != null && l2.longValue() == changeTimestamp2) {
                    Long l3 = y21Var.F;
                }
                Long l4 = y21Var.E;
                long changeTimestamp3 = eventChanges.getChangeTimestamp();
                if (l4 == null || l4.longValue() != changeTimestamp3) {
                    va9Var.h = true;
                    y21Var.F = Long.valueOf(System.currentTimeMillis() / 1000);
                }
                y21Var.E = Long.valueOf(eventChanges.getChangeTimestamp());
                if (eventChanges.isStatus()) {
                    va9Var.g = true;
                }
                if (eventChanges.isHomeScore() && yid.m(d2.getHomeScore(TeamSides.ORIGINAL).getDisplay()) > 0) {
                    if (d2.shouldReverseTeams()) {
                        va9Var.b = true;
                    } else {
                        va9Var.a = true;
                    }
                }
                if (eventChanges.isAwayScore() && yid.m(d2.getAwayScore(TeamSides.ORIGINAL).getDisplay()) > 0) {
                    if (d2.shouldReverseTeams()) {
                        va9Var.a = true;
                    } else {
                        va9Var.b = true;
                    }
                }
                if (!va9Var.g && !va9Var.a && !va9Var.b) {
                    if (eventChanges.isHomePeriod() && yid.m(d2.getHomeScore(TeamSides.ORIGINAL).getScoreByPeriodName(d2.getLastPeriod())) > 0) {
                        if (d2.shouldReverseTeams()) {
                            va9Var.d = true;
                        } else {
                            va9Var.c = true;
                        }
                    }
                    if (eventChanges.isAwayPeriod() && yid.m(d2.getAwayScore(TeamSides.ORIGINAL).getScoreByPeriodName(d2.getLastPeriod())) > 0) {
                        if (d2.shouldReverseTeams()) {
                            va9Var.c = true;
                        } else {
                            va9Var.d = true;
                        }
                    }
                    if (!va9Var.c && !va9Var.d) {
                        if (eventChanges.isHomePoint() && !Intrinsics.c(d2.getHomeScore(TeamSides.ORIGINAL).getPoint(), "0")) {
                            if (d2.shouldReverseTeams()) {
                                va9Var.f = true;
                            } else {
                                va9Var.e = true;
                            }
                        }
                        if (eventChanges.isAwayPoint() && !Intrinsics.c(d2.getAwayScore(TeamSides.ORIGINAL).getPoint(), "0")) {
                            if (d2.shouldReverseTeams()) {
                                va9Var.e = true;
                            } else {
                                va9Var.f = true;
                            }
                        }
                    }
                }
            }
        }
        y21Var.C = va9Var;
    }

    public static final Object H(Object obj) {
        if (obj instanceof eb3) {
            p2g p2gVar = w2g.b;
            return y6a.x(((eb3) obj).a);
        }
        p2g p2gVar2 = w2g.b;
        return obj;
    }

    public static void I(lcd lcdVar) {
        long currentTimeMillis = System.currentTimeMillis() - lcdVar.getLastReportTime$render_release();
        lcdVar.setNeedsExposureUpdate$render_release(true);
        if (lcdVar.getExposureScheduled$render_release()) {
            return;
        }
        lcdVar.setExposureScheduled$render_release(true);
        xw3.L(lcdVar.getExposureScope$render_release(), null, null, new z40(currentTimeMillis, lcdVar, (rq3) null, 1), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x027a, code lost:
    
        if (r7.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x037c, code lost:
    
        if (r7.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_SUSPENDED) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0385, code lost:
    
        if (r7.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_INTERRUPTED) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x025b, code lost:
    
        if (r7.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_POSTPONED) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03c7, code lost:
    
        r2.g = new defpackage.jfj(r5, r0, true);
        r2.h = null;
        r14 = 4;
        r2.D = new defpackage.jfj(r14, r4, java.lang.Integer.valueOf(com.sofascore.results.R.color.live));
        r2.a = new defpackage.jfj(r14, r10, r9);
        r2.c = new defpackage.jfj(r14, r12, r9);
        r2.b = new defpackage.jfj(r14, r11, r9);
        r2.d = new defpackage.jfj(r14, r13, r9);
        r10 = null;
        r10 = 0;
        r10 = 0;
        r4 = com.sofascore.model.mvvm.model.Event.getHomeScore$default(r2.d(), null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0409, code lost:
    
        if (r4 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x040b, code lost:
    
        r4 = java.lang.String.valueOf(r4.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0415, code lost:
    
        r2.e = new defpackage.jfj(r14, r4, r5);
        r4 = com.sofascore.model.mvvm.model.Event.getAwayScore$default(r2.d(), null, 1, null).getDisplay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0428, code lost:
    
        if (r4 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x042a, code lost:
    
        r4 = java.lang.String.valueOf(r4.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0434, code lost:
    
        r2.f = new defpackage.jfj(r14, r4, r5);
        r7 = 5;
        r2.y = new defpackage.jfj(r7, (java.lang.String) (r10 == true ? 1 : 0), r5);
        r2.z = new defpackage.jfj(r7, (java.lang.String) (r10 == true ? 1 : 0), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0433, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0414, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0266, code lost:
    
        if (r7.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_WILL_CONTINUE) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x027e, code lost:
    
        r9 = 4;
        r2.g = new defpackage.jfj(r9, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0286, code lost:
    
        if (r14 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0288, code lost:
    
        r0 = new defpackage.jfj(r9, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x028f, code lost:
    
        r2.h = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0291, code lost:
    
        if (r14 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0293, code lost:
    
        r0 = new defpackage.jfj(r9, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x029a, code lost:
    
        r2.D = r0;
        r0 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r2.d(), null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a6, code lost:
    
        if (r0 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ad, code lost:
    
        if (r0.intValue() != 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02af, code lost:
    
        r0 = com.sofascore.results.R.color.n_lv_1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02b6, code lost:
    
        r7 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r2.d(), null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02be, code lost:
    
        if (r7 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c5, code lost:
    
        if (r7.intValue() != 2) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02c7, code lost:
    
        r4 = com.sofascore.results.R.color.n_lv_1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02ce, code lost:
    
        r9 = 4;
        r2.a = new defpackage.jfj(r9, r10, java.lang.Integer.valueOf(r0));
        r2.c = new defpackage.jfj(r9, r12, java.lang.Integer.valueOf(r0));
        r2.y = new defpackage.jfj(5, (java.lang.String) null, java.lang.Integer.valueOf(r0));
        r2.b = new defpackage.jfj(r9, r11, java.lang.Integer.valueOf(r4));
        r2.d = new defpackage.jfj(r9, r13, java.lang.Integer.valueOf(r4));
        r2.z = new defpackage.jfj(5, (java.lang.String) null, java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02cb, code lost:
    
        r4 = com.sofascore.results.R.color.n_lv_3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02b3, code lost:
    
        r0 = com.sofascore.results.R.color.n_lv_3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0299, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x028e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0270, code lost:
    
        if (r7.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_CANCELED) == false) goto L128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y21 J(Event event, Context context, boolean z, boolean z2, y16 y16Var, int i2) {
        DateTimeFormatter a2;
        TeamSides teamSides;
        boolean z3 = (i2 & 2) == 0;
        boolean z4 = (i2 & 4) != 0 ? false : z;
        boolean z5 = (i2 & 8) != 0 ? true : z2;
        Integer num = null;
        y16 y16Var2 = (i2 & 16) != 0 ? null : y16Var;
        event.getClass();
        context.getClass();
        y21 mj8Var = event instanceof FootballEvent ? new mj8((FootballEvent) event) : event instanceof TennisEvent ? new n5j((TennisEvent) event) : event instanceof BasketballEvent ? new hr1((BasketballEvent) event) : event instanceof AmericanFootballEvent ? new tt((AmericanFootballEvent) event) : event instanceof MmaEvent ? new plc((MmaEvent) event) : event instanceof DartsEvent ? new xc4((DartsEvent) event) : event instanceof CricketEvent ? new j04((CricketEvent) event, z3) : event instanceof BaseballEvent ? z4 ? new hm1((BaseballEvent) event) : new nwd(event) : new nwd(event);
        if (y16Var2 != null) {
            Integer num2 = (Integer) y16Var2.a.get(Integer.valueOf(mj8Var.d().getId()));
            Integer valueOf = Integer.valueOf(num2 != null ? num2.intValue() : 0);
            PlayerEventIncidents playerEventIncidents = (PlayerEventIncidents) y16Var2.b.get(Integer.valueOf(mj8Var.d().getId()));
            PlayerMatchesEventStatistics playerMatchesEventStatistics = (PlayerMatchesEventStatistics) y16Var2.c.get(Integer.valueOf(mj8Var.d().getId()));
            Boolean bool = (Boolean) y16Var2.d.get(Integer.valueOf(mj8Var.d().getId()));
            if (mj8Var instanceof j04) {
                ((j04) mj8Var).l = valueOf;
            } else {
                mj8Var.l = valueOf;
                mj8Var.G = playerEventIncidents;
                mj8Var.H = playerMatchesEventStatistics;
                mj8Var.J = bool;
            }
        }
        Integer valueOf2 = Integer.valueOf(R.color.n_lv_3);
        Integer valueOf3 = Integer.valueOf(R.color.n_lv_1);
        String A = tba.A(context, Event.getHomeTeam$default(mj8Var.d(), null, 1, null));
        String K = qea.K(tba.A(context, Event.getAwayTeam$default(mj8Var.d(), null, 1, null)), mj8Var.d().shouldReverseTeams());
        String nameCode = Event.getHomeTeam$default(mj8Var.d(), null, 1, null).getNameCode();
        String K2 = qea.K(Event.getAwayTeam$default(mj8Var.d(), null, 1, null).getNameCode(), mj8Var.d().shouldReverseTeams());
        long startTimestamp = mj8Var.d().getStartTimestamp();
        if (mj8Var.d().getHideDate() || fc6.B(fc6.t(Instant.ofEpochSecond(startTimestamp)))) {
            String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
            bestPattern.getClass();
            a2 = hk4.a(bestPattern);
        } else {
            bi4 bi4Var = bi4.PATTERN_DMY_SHORT;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            a2 = hk4.a(bi4Var.d());
        }
        String i3 = fc6.i(startTimestamp, a2);
        String v = v(context, mj8Var.d(), mj8Var.d().getHideDate());
        boolean z6 = Intrinsics.c(mj8Var.d().getStatusType(), StatusKt.STATUS_WILL_CONTINUE) || mj8Var.d().isAwarded() || afi.e(mj8Var.d().getStatus().getCode());
        int i4 = 6;
        mj8Var.a = new jfj(i4, A, num);
        mj8Var.b = new jfj(i4, K, num);
        mj8Var.c = new jfj(i4, nameCode, num);
        mj8Var.d = new jfj(i4, K2, num);
        mj8Var.g = new jfj(i4, i3, num);
        mj8Var.h = new jfj(i4, v, num);
        Boolean hasGlobalHighlights = mj8Var.d().getHasGlobalHighlights();
        Boolean bool2 = Boolean.TRUE;
        mj8Var.j = Intrinsics.c(hasGlobalHighlights, bool2);
        mj8Var.i = Intrinsics.c(mj8Var.d().getHasEventPlayerStatistics(), bool2);
        mj8Var.v = mj8Var.d().getCrowdsourcingEnabled();
        String statusType = mj8Var.d().getStatusType();
        int hashCode = statusType.hashCode();
        int i5 = R.color.live;
        switch (hashCode) {
            case -1947652542:
                break;
            case -1661628965:
                break;
            case -1411655086:
                if (statusType.equals(StatusKt.STATUS_IN_PROGRESS)) {
                    if (mj8Var.d().isCrowdsourcingLive()) {
                        i5 = R.color.crowdsourcing_live;
                    }
                    int i6 = 4;
                    mj8Var.g = new jfj(i6, i3, valueOf2);
                    mj8Var.h = new jfj(i6, v, Integer.valueOf(i5));
                    mj8Var.a = new jfj(i6, A, valueOf3);
                    mj8Var.c = new jfj(i6, nameCode, valueOf3);
                    int i7 = 5;
                    String str = null;
                    mj8Var.y = new jfj(i7, str, Integer.valueOf(i5));
                    mj8Var.b = new jfj(i6, K, valueOf3);
                    mj8Var.d = new jfj(i6, K2, valueOf3);
                    mj8Var.z = new jfj(i7, str, Integer.valueOf(i5));
                    teamSides = null;
                    break;
                }
                int i8 = 4;
                mj8Var.g = new jfj(i8, i3, valueOf2);
                mj8Var.h = new jfj(i8, v, valueOf2);
                mj8Var.a = new jfj(i8, A, valueOf3);
                mj8Var.c = new jfj(i8, nameCode, valueOf3);
                String str2 = "";
                int i9 = 6;
                Integer num3 = null;
                mj8Var.y = new jfj(i9, str2, num3);
                mj8Var.b = new jfj(i8, K, valueOf3);
                mj8Var.d = new jfj(i8, K2, valueOf3);
                mj8Var.z = new jfj(i9, str2, num3);
                teamSides = null;
                break;
            case -673660814:
                break;
            case -123173735:
                break;
            case 527231609:
                break;
            case 2018521742:
                break;
            default:
                int i82 = 4;
                mj8Var.g = new jfj(i82, i3, valueOf2);
                mj8Var.h = new jfj(i82, v, valueOf2);
                mj8Var.a = new jfj(i82, A, valueOf3);
                mj8Var.c = new jfj(i82, nameCode, valueOf3);
                String str22 = "";
                int i92 = 6;
                Integer num32 = null;
                mj8Var.y = new jfj(i92, str22, num32);
                mj8Var.b = new jfj(i82, K, valueOf3);
                mj8Var.d = new jfj(i82, K2, valueOf3);
                mj8Var.z = new jfj(i92, str22, num32);
                teamSides = null;
                break;
        }
        Integer aggregatedWinnerCode$default = Event.getAggregatedWinnerCode$default(mj8Var.d(), teamSides, 1, teamSides);
        mj8Var.A = aggregatedWinnerCode$default != null && aggregatedWinnerCode$default.intValue() == 1;
        Integer aggregatedWinnerCode$default2 = Event.getAggregatedWinnerCode$default(mj8Var.d(), teamSides, 1, teamSides);
        mj8Var.B = aggregatedWinnerCode$default2 != null && aggregatedWinnerCode$default2.intValue() == 2;
        mj8Var.h(context, mj8Var.d());
        mj8Var.K = mj8Var.d().getCrowdsourcingEnabled() || Intrinsics.c(mj8Var.d().isEditor(), bool2);
        mj8Var.m = z5;
        return mj8Var;
    }

    public static final void a(ek0 ek0Var, String str, xtc xtcVar, Function1 function1, Function1 function12, io ioVar, op3 op3Var, float f2, of3 of3Var, int i2, int i3) {
        int i4;
        Function1 function13;
        Function1 function14;
        io ioVar2;
        int i5;
        nt9 nt9Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(ek0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            function13 = function1;
            i4 |= av8Var.i(function13) ? a.o : 1024;
        } else {
            function13 = function1;
        }
        if ((i2 & 24576) == 0) {
            function14 = function12;
            i4 |= av8Var.i(function14) ? 16384 : 8192;
        } else {
            function14 = function12;
        }
        if ((196608 & i2) == 0) {
            ioVar2 = ioVar;
            i4 |= av8Var.g(ioVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            ioVar2 = ioVar;
        }
        if ((1572864 & i2) == 0) {
            i4 |= av8Var.g(op3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= av8Var.d(f2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= av8Var.g(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= av8Var.e(1) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (av8Var.h(true) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (av8Var.T(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            Object obj = ek0Var.a;
            int i6 = bjk.b;
            av8Var.d0(-329318062);
            boolean z = obj instanceof nt9;
            Object obj2 = nf3.a;
            if (z) {
                av8Var.d0(-1008942344);
                nt9Var = (nt9) obj;
                if (nt9Var.w.f != null) {
                    av8Var.d0(-1008902292);
                    av8Var.s(false);
                    av8Var.s(false);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1008854118);
                    gkh b2 = bjk.b(op3Var, av8Var);
                    boolean g2 = av8Var.g(obj) | av8Var.g(b2);
                    Object O = av8Var.O();
                    if (g2 || O == obj2) {
                        ht9 a2 = nt9.a(nt9Var);
                        a2.p = b2;
                        O = a2.a();
                        av8Var.n0(O);
                    }
                    nt9Var = (nt9) O;
                    ljg.t(av8Var, false, false, false);
                }
            } else {
                av8Var.d0(-1008595950);
                Context context = (Context) av8Var.k(nz.b);
                gkh b3 = bjk.b(op3Var, av8Var);
                boolean g3 = av8Var.g(context) | av8Var.g(obj) | av8Var.g(b3);
                Object O2 = av8Var.O();
                if (g3 || O2 == obj2) {
                    ht9 ht9Var = new ht9(context);
                    ht9Var.c = obj;
                    ht9Var.p = b3;
                    O2 = ht9Var.a();
                    av8Var.n0(O2);
                }
                nt9Var = (nt9) O2;
                av8Var.s(false);
                av8Var.s(false);
            }
            bjk.f(nt9Var);
            xtc z2 = xtcVar.z(new ip3(nt9Var, ek0Var.c, ek0Var.b, function13, function14, ioVar2, op3Var, f2, bjk.a(av8Var), str));
            g00 g00Var = g00.l;
            int hashCode = Long.hashCode(av8Var.T);
            xtc C = fqj.C(av8Var, z2);
            aee m = av8Var.m();
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, g00Var, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new la0(ek0Var, str, xtcVar, function1, function12, ioVar, op3Var, f2, i2, i3);
        }
    }

    public static final void b(zr1 zr1Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1573407672);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(zr1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            tc3 H = yqo.H(1841988817, av8Var2, new t21(zr1Var, 25));
            tc3 H2 = yqo.H(453868153, av8Var2, new wr1(zr1Var, i4));
            boolean i5 = av8Var2.i(zr1Var) | ((i3 & 112) == 32);
            Object O = av8Var2.O();
            if (i5 || O == nf3.a) {
                O = new xr1(function1, zr1Var, i4);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, H2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i3 >> 6) & 14) | 197040, 2008);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yr1(zr1Var, function1, xtcVar, i2, 1);
        }
    }

    public static final ad2 c(CoroutineContext coroutineContext) {
        if (coroutineContext.get(uic.g) == null) {
            coroutineContext = coroutineContext.plus(bea.a());
        }
        return new ad2(coroutineContext);
    }

    public static final void d(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(85142896);
        int i3 = i2 | (av8Var.i(gv9Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        boolean z = true;
        boolean z2 = false;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            float f2 = 8.0f;
            xtc f0 = l98.f0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 8.0f, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p = ljg.p(av8Var, C, hf3.d, -454142289, gv9Var);
            while (p.hasNext()) {
                AiInsightsSections aiInsightsSections = (AiInsightsSections) p.next();
                utc utcVar = utc.a;
                float f3 = f2;
                xtc f02 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 5);
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                boolean z3 = z;
                udj.c(aiInsightsSections.getSubtitle(), f02, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 48, 0, 131064);
                udj.c(aiInsightsSections.getText(), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, z3 ? 1 : 0), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 48, 0, 131064);
                z = z3 ? 1 : 0;
                f2 = f3;
                av8Var = av8Var2;
                z2 = false;
            }
            av8Var.s(z2);
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new j73(gv9Var, xtcVar, i2, 3);
        }
    }

    public static final void e(lm lmVar, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        gv9 gv9Var = lmVar.a;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(978020932);
        int i3 = (av8Var.i(lmVar) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc c0 = l98.c0(hkg.u0(bkh.c, hkg.o0(av8Var), false, 14), 8.0f, 8.0f);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            gv9 gv9Var2 = lmVar.c;
            gv9 gv9Var3 = lmVar.b;
            if (gv9Var.isEmpty()) {
                av8Var.d0(1137903592);
                av8Var.s(false);
            } else {
                av8Var.d0(1137819985);
                z8e.d(gv9Var, null, av8Var, 0);
                av8Var.s(false);
            }
            int i4 = lmVar.e;
            int i5 = lmVar.f;
            or5 or5Var = lmVar.d;
            boolean z = lmVar.g;
            long D = lz.D(R.color.surface_1, av8Var);
            n7g a3 = o7g.a(16.0f);
            utc utcVar = utc.a;
            ktm.d(i4, i5, or5Var, z, false, n9e.q(utcVar, D, a3), av8Var, 196608);
            if (gv9Var3 == null || !gv9Var3.isEmpty()) {
                Iterator<E> it = gv9Var3.iterator();
                while (it.hasNext()) {
                    if (!((ks5) it.next()).b.isEmpty()) {
                        av8Var.d0(1138424051);
                        o1j.e(gv9Var3, null, av8Var, 0);
                        av8Var.s(false);
                        break;
                    }
                }
            }
            av8Var.d0(1138505736);
            av8Var.s(false);
            if (gv9Var2.isEmpty()) {
                av8Var.d0(1138715048);
                av8Var.s(false);
            } else {
                av8Var.d0(1138556483);
                d(gv9Var2, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), av8Var, 48);
                av8Var.s(false);
            }
            xtc z2 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5).z(new we9(uxf.p));
            yf8 yf8Var = xth.a;
            udj.c(oea.v(R.string.ai_insights_betting_disclaimer, av8Var), z2, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 0, 0, null, f6a.N(xth.g()), av8Var, 0, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(lmVar, xtcVar2, i2, 13);
        }
    }

    public static final void f(boolean z, ev6 ev6Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1068119964);
        int i3 = (av8Var.h(z) ? 4 : 2) | i2 | (av8Var.g(ev6Var) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new au6(5);
                av8Var.n0(O);
            }
            un0.p(z, (Function0) O, null, yqo.H(-1199318107, av8Var, new t21(ev6Var)), av8Var, (i3 & 14) | 3120);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(z, (Serializable) ev6Var, xtcVar2, i2, 5);
        }
    }

    public static final void g(gv9 gv9Var, gv9 gv9Var2, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        gv9 gv9Var3;
        gv9Var.getClass();
        gv9Var2.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1278555600);
        int i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.g(gv9Var2) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            cm7 cm7Var = cm7.MOST_POINTS;
            if (gv9Var.isEmpty()) {
                cm7Var = null;
            }
            gv9 W = l6g.W(ph0.x(new cm7[]{cm7Var, gv9Var2.isEmpty() ? null : cm7.AVERAGE_POINTS}));
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.f(CollectionsKt.Y(W));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            int ordinal = ((cm7) e1dVar.getValue()).ordinal();
            if (ordinal == 0) {
                gv9Var3 = gv9Var;
            } else {
                if (ordinal != 1) {
                    zzl.b();
                    return;
                }
                gv9Var3 = gv9Var2;
            }
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(789829538, av8Var, new km7(W, gv9Var3, e1dVar, z, function1)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(gv9Var, gv9Var2, function1, z, xtcVar, i2, 6);
        }
    }

    public static final void h(b49 b49Var, wla wlaVar, Function1 function1, ct8 ct8Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        wlaVar.getClass();
        function1.getClass();
        ct8Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1094963224);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(b49Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? av8Var.g(wlaVar) : av8Var.i(wlaVar) ? 32 : 16;
        }
        int i4 = i3 | (av8Var.i(function1) ? 256 : 128) | (av8Var.i(ct8Var) ? a.o : 1024);
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            utc utcVar = utc.a;
            xtc f0 = l98.f0(utcVar, 16.0f, 8.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            iy7 iy7Var = b49Var.p;
            String str = iy7Var.b;
            if (str == null) {
                str = "";
            }
            Integer num = iy7Var.a;
            int intValue = num != null ? num.intValue() : 0;
            x43 x43Var = b49Var.o;
            boolean i5 = ((i4 & 896) == 256) | av8Var.i(b49Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i5 || O == a99Var) {
                O = new ij8(8, function1, b49Var);
                av8Var.n0(O);
            }
            gvd.k(str, intValue, x43Var, true, f0, null, (Function0) O, av8Var, 3072, 32);
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            boolean i6 = av8Var.i(b49Var);
            Object O2 = av8Var.O();
            if (i6 || O2 == a99Var) {
                O2 = new sr8(b49Var, 3);
                av8Var.n0(O2);
            }
            f6a.a(c6e.b(0, (Function0) O2, av8Var, 6, 2), d0, l98.C(8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, yqo.H(-84057007, av8Var, new c61(9, wlaVar, b49Var, ct8Var)), av8Var, 432, 27648, 8184);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(b49Var, wlaVar, function1, ct8Var, xtcVar, i2, 7);
        }
    }

    public static final void i(cqk cqkVar, ArrayList arrayList, int i2, ct8 ct8Var, xtc xtcVar, of3 of3Var, int i3) {
        int i4;
        int i5;
        cqk cqkVar2 = cqkVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(850780826);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.i(cqkVar2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.i(arrayList) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i2;
            i4 |= av8Var.e(i5) ? 256 : 128;
        } else {
            i5 = i2;
        }
        if ((i3 & 3072) == 0) {
            i4 |= av8Var.i(ct8Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        int i6 = 0;
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            xtc A = wnn.A(l98.f0(qx9.p(bkh.d(xtcVar, 1.0f), 1.7777778f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), o7g.a(12.0f));
            boolean i7 = ((i4 & 7168) == 2048) | av8Var.i(cqkVar2) | av8Var.i(arrayList) | ((i4 & 896) == 256);
            Object O = av8Var.O();
            if (i7 || O == nf3.a) {
                im1 im1Var = new im1(ct8Var, cqkVar2, arrayList, i5, 3);
                cqkVar2 = cqkVar2;
                av8Var.n0(im1Var);
                O = im1Var;
            }
            xtc y = tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            av8Var = av8Var;
            un0.a(y, o7g.a(12.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), rd0.u(2.0f, 62), null, yqo.H(-2136863988, av8Var, new w39(cqkVar2, i6)), av8Var, 196608, 16);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hj7(cqkVar2, arrayList, i2, ct8Var, xtcVar, i3);
        }
    }

    public static final void j(fq9 fq9Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-970463729);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(fq9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            rz8.q(((i3 << 12) & 3670016) | (i3 & 14) | 3072 | (i3 & 112), fq9Var, av8Var, null, fq9Var.m, fq9Var.n, xtcVar, fq9Var.o, function1);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new eq9(fq9Var, function1, xtcVar, i2, 1);
        }
    }

    public static final ad2 k() {
        smi o = tz9.o();
        hs4 hs4Var = z45.a;
        return new ad2(kotlin.coroutines.e.d(o, rob.a));
    }

    public static final void l(xtc xtcVar, BlazeComposeWidgetMomentsStateHandler blazeComposeWidgetMomentsStateHandler, of3 of3Var, int i2) {
        int i3;
        blazeComposeWidgetMomentsStateHandler.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1126785855);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(blazeComposeWidgetMomentsStateHandler) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            xtc z = xtcVar.z(bkh.c);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, z);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            BlazeComposeMomentsWidgetGridViewKt.BlazeComposeMomentsWidgetGridView(bkh.d(utc.a, 1.0f), blazeComposeWidgetMomentsStateHandler, av8Var, ((i3 << 3) & 112) | 6);
            av8Var.s(true);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nx1(blazeComposeWidgetMomentsStateHandler, xtcVar, i2);
        }
    }

    public static final Set m(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof rf2) {
            return ((rf2) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.d());
        int d2 = serialDescriptor.d();
        for (int i2 = 0; i2 < d2; i2++) {
            hashSet.add(serialDescriptor.e(i2));
        }
        return hashSet;
    }

    public static Object n(lcd lcdVar, hoi hoiVar) {
        Object R = xw3.R(z45.a, new qj6(lcdVar, new LinkedHashMap(), new LinkedHashMap(), (rq3) null), hoiVar);
        return R == lu3.a ? R : Unit.a;
    }

    public static final void o(ku3 ku3Var, CancellationException cancellationException) {
        yda ydaVar = (yda) ku3Var.getCoroutineContext().get(uic.g);
        if (ydaVar != null) {
            ydaVar.e(cancellationException);
        } else {
            cp4.g(ku3Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final SerialDescriptor[] p(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? g : serialDescriptorArr;
    }

    public static final boolean q(g85 g85Var, long j2) {
        if (!g85Var.a.n) {
            return false;
        }
        z3a z3aVar = (z3a) c6o.c0(g85Var).F.d;
        if (!z3aVar.S.n) {
            return false;
        }
        long P = z3aVar.P(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (P >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (P & 4294967295L));
        long j3 = g85Var.r;
        float f2 = ((int) (j3 >> 32)) + intBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f2) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f3;
    }

    public static final Object r(Function2 function2, rq3 rq3Var) {
        btg btgVar = new btg(rq3Var, rq3Var.getContext());
        Object L = y6a.L(btgVar, true, btgVar, function2);
        lu3 lu3Var = lu3.a;
        return L;
    }

    public static dg4 s(String str, c6h c6hVar) {
        q73 q73Var = new q73(22);
        hs4 hs4Var = z45.a;
        return new dg4(str, new cqa(c6hVar), q73Var, c(hq4.c.plus(tz9.o())));
    }

    public static final void t(ku3 ku3Var) {
        bea.u(ku3Var.getCoroutineContext());
    }

    public static final boolean u(ViewGroup viewGroup, Rect rect, Map map, ViewGroup viewGroup2, Rect rect2) {
        int childCount;
        int i2;
        boolean z;
        Drawable background;
        viewGroup.getClass();
        map.getClass();
        viewGroup2.getClass();
        rect2.getClass();
        try {
            p2g p2gVar = w2g.b;
            viewGroup2.offsetRectIntoDescendantCoords(viewGroup, rect);
            childCount = viewGroup.getChildCount();
            i2 = 0;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
            return false;
        }
        while (true) {
            if (i2 >= childCount) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i2);
            childAt.getClass();
            childAt.getHitRect(rect2);
            Unit unit = Unit.a;
            if (!rect2.intersect(rect)) {
                childAt = null;
            }
            if (childAt != null && childAt.getVisibility() == 0 && childAt.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                z = true;
                if (!(childAt instanceof ViewGroup) || ((ViewGroup) childAt).getChildCount() <= 0) {
                    if (childAt.willNotDraw() && ((background = childAt.getBackground()) == null || !background.isVisible() || background.getAlpha() <= 0)) {
                        ad2 ad2Var = oc3.a;
                        Drawable foreground = childAt.getForeground();
                        if (foreground == null) {
                            continue;
                        } else if (!foreground.isVisible()) {
                            continue;
                        } else if (foreground.getAlpha() <= 0) {
                        }
                    }
                    Rect rect3 = (Rect) map.get(childAt);
                    if (rect3 != null) {
                        rect3.set(rect2);
                    } else {
                        rect3 = new Rect(rect2);
                    }
                    map.put(childAt, rect3);
                    if (rect2.contains(rect)) {
                        break;
                    }
                } else if (u((ViewGroup) childAt, rect, map, viewGroup, rect2)) {
                    break;
                }
                p2g p2gVar22 = w2g.b;
                return false;
            }
            i2++;
        }
        if (Intrinsics.c(viewGroup.getParent(), viewGroup2)) {
            viewGroup2.offsetDescendantRectToMyCoords(viewGroup, rect);
        }
        return z;
    }

    public static final String v(Context context, Event event, boolean z) {
        StatusTime statusTime;
        BaseballInningInfo currentInningInfo;
        context.getClass();
        event.getClass();
        if ((event instanceof BaseballEvent) && Intrinsics.c(event.getStatusType(), StatusKt.STATUS_IN_PROGRESS) && (currentInningInfo = ((BaseballEvent) event).getCurrentInningInfo()) != null) {
            String string = context.getString(R.string.status_inning, yid.p(currentInningInfo.getInning()));
            string.getClass();
            return string;
        }
        long startTimestamp = event.getStartTimestamp();
        ZoneId systemDefault = ZoneId.systemDefault();
        if (!Instant.ofEpochSecond(startTimestamp).atZone(systemDefault).toLocalDate().isAfter(LocalDate.now(systemDefault)) || z) {
            if (!event.isCrowdsourcingLive()) {
                Time time = event.getTime();
                return (time == null || (statusTime = time.getStatusTime()) == null) ? pd0.u(context, event) : z8e.H(statusTime, xe6.c().b);
            }
            String string2 = context.getString(R.string.menu_live);
            string2.getClass();
            return string2;
        }
        if (Intrinsics.c(event.getStatusType(), StatusKt.STATUS_CANCELED) || Intrinsics.c(event.getStatusType(), StatusKt.STATUS_SUSPENDED) || Intrinsics.c(event.getStatusType(), StatusKt.STATUS_POSTPONED)) {
            String u = z8e.u(context, event.getStatusDescription(), ok3.s(event), true);
            u.getClass();
            return u;
        }
        long startTimestamp2 = event.getStartTimestamp();
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
        bestPattern.getClass();
        return fc6.i(startTimestamp2, hk4.a(bestPattern));
    }

    public static final boolean w(ku3 ku3Var) {
        yda ydaVar = (yda) ku3Var.getCoroutineContext().get(uic.g);
        if (ydaVar != null) {
            return ydaVar.isActive();
        }
        return true;
    }

    public static boolean x(Context context) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        return sharedPreferences.getBoolean("BUZZER_MAIN_SCREEN", true);
    }

    public static final boolean y(Message message) {
        ChatUser user = message.getUser();
        return Intrinsics.c(user != null ? user.getId() : null, "sofascore");
    }

    public static final KClass z(KType kType) {
        kType.getClass();
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            is8.c(classifier, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }
}
