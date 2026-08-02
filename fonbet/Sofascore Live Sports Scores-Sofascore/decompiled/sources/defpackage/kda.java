package defpackage;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.UserManager;
import android.util.TypedValue;
import android.widget.EditText;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTextStyle;
import com.blaze.blazesdk.widgets.models.OverridableValueRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemStatusIndicatorStateStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemTextStyleRemoteDto;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.internal.fido.zzck;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.HandballPlayerEventStatistics;
import com.sofascore.model.network.response.IceHockeyPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.results.R;
import com.sofascore.results.wc26.widget.LaunchPlayerDetails;
import com.sofascore.results.wc26.widget.LaunchPlayerSeason;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class kda {
    public static final /* synthetic */ int a = 0;

    public static qyj A(Integer num) {
        return (num != null && num.intValue() == 1) ? qyj.a : (num != null && num.intValue() == 2) ? qyj.b : (num != null && num.intValue() == 3) ? qyj.c : (num != null && num.intValue() == 4) ? qyj.d : qyj.e;
    }

    public static final Object B(p0d p0dVar, e5f e5fVar, Serializable serializable) {
        p0dVar.getClass();
        e5fVar.getClass();
        Object c = p0dVar.c(e5fVar);
        return c == null ? serializable : c;
    }

    public static long C(byte b, byte b2) {
        int i;
        int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static boolean D(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x015f, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0149, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0133, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x011d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b0, code lost:
    
        if (r12 <= r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b2, code lost:
    
        r0 = r36.getRushingAttempts();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b6, code lost:
    
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b8, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c3, code lost:
    
        r2 = new kotlin.Pair(r15, r0);
        r0 = r36.getRushingYards();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cc, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ce, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d9, code lost:
    
        r5 = new kotlin.Pair(r4, r0);
        r0 = r36.getRushingTouchdowns();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e2, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e4, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ef, code lost:
    
        r4 = new kotlin.Pair(r3, r0);
        r0 = java.lang.Integer.valueOf(com.sofascore.results.R.string.legend_am_foot_red_zone_attemps);
        r3 = r36.getRushingRedZoneAttempts();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ff, code lost:
    
        if (r3 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0201, code lost:
    
        r3 = java.lang.String.valueOf(r3.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x020c, code lost:
    
        r7 = new kotlin.Pair(r0, r3);
        r0 = r36.getRushingLongest();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0215, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0217, code lost:
    
        r22 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0238, code lost:
    
        return P(kotlin.collections.b.j(r2, r5, r4, r7, new kotlin.Pair(r10, r22)), 4, 0, 1, 3, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x020a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01c1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023a, code lost:
    
        if (1 > r12) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023c, code lost:
    
        if (r12 >= r5) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023e, code lost:
    
        r2 = r36.getReceivingReceptions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_SAFETY) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0244, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024f, code lost:
    
        r5 = new kotlin.Pair(r11, r2);
        r2 = r36.getReceivingYards();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0258, code lost:
    
        if (r2 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x025a, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0265, code lost:
    
        r7 = new kotlin.Pair(r14, r2);
        r2 = r36.getReceivingTouchdowns();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x026e, code lost:
    
        if (r2 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0270, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x027b, code lost:
    
        r8 = new kotlin.Pair(r13, r2);
        r2 = r36.getRushingYards();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0284, code lost:
    
        if (r2 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bf, code lost:
    
        r9 = r3;
        r5 = r4;
        r4 = r12;
        r3 = r21;
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0286, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0291, code lost:
    
        r10 = new kotlin.Pair(r4, r2);
        r2 = r36.getRushingTouchdowns();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x029a, code lost:
    
        if (r2 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x029c, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02a7, code lost:
    
        r4 = new kotlin.Pair(r3, r2);
        r2 = r36.getReceivingTargets();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02b0, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b2, code lost:
    
        r22 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02df, code lost:
    
        return P(kotlin.collections.b.j(r5, r7, r8, r10, r4, new kotlin.Pair(r9, r22)), 4, 0, 1, 3, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a5, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x05be, code lost:
    
        r0 = r36.getDefensiveCombineTackles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x028f, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0279, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0263, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x024d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02e0, code lost:
    
        if (r5 <= r12) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02e2, code lost:
    
        r0 = r36.getReceivingYards();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02e6, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02e8, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02f3, code lost:
    
        r1 = new kotlin.Pair(r14, r0);
        r0 = r36.getReceivingTargets();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02fc, code lost:
    
        if (r0 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x05c2, code lost:
    
        if (r0 == null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02fe, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0309, code lost:
    
        r2 = new kotlin.Pair(r9, r0);
        r0 = r36.getReceivingTouchdowns();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0312, code lost:
    
        if (r0 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0314, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031f, code lost:
    
        r3 = new kotlin.Pair(r13, r0);
        r0 = java.lang.Integer.valueOf(com.sofascore.results.R.string.legend_am_foot_red_zone_targets);
        r4 = r36.getReceivingRedZoneTargets();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x032f, code lost:
    
        if (r4 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0331, code lost:
    
        r4 = java.lang.String.valueOf(r4.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x033c, code lost:
    
        r5 = new kotlin.Pair(r0, r4);
        r0 = java.lang.Integer.valueOf(com.sofascore.results.R.string.legend_am_foot_receiving_longest_reception);
        r4 = r36.getReceivingLongest();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034c, code lost:
    
        if (r4 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x034e, code lost:
    
        r22 = java.lang.String.valueOf(r4.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x05c4, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0370, code lost:
    
        return P(kotlin.collections.b.j(r1, r2, r3, r5, new kotlin.Pair(r0, r22)), 4, 0, 1, 2, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x033a, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x031d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0307, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02f1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0373, code lost:
    
        return defpackage.km5.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00f9, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_TIGHT_END) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x05cf, code lost:
    
        r10 = new kotlin.Pair(r8, r0);
        r0 = r36.getDefensiveAssistTackles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0103, code lost:
    
        if (r37.equals("RB") == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x05d8, code lost:
    
        if (r0 == null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x05da, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x05e5, code lost:
    
        r11 = new kotlin.Pair(r7, r0);
        r0 = r36.getDefensiveInterceptions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0486, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_NOSE_TACKLE) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04a8, code lost:
    
        r0 = r36.getDefensiveCombineTackles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04ac, code lost:
    
        if (r0 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04ae, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x04b9, code lost:
    
        r9 = new kotlin.Pair(r8, r0);
        r0 = r36.getDefensiveAssistTackles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04c2, code lost:
    
        if (r0 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04c4, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04cf, code lost:
    
        r10 = new kotlin.Pair(r7, r0);
        r0 = r36.getDefensiveSacks();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04d8, code lost:
    
        if (r0 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04da, code lost:
    
        r0 = java.lang.String.valueOf(r0.doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x05ee, code lost:
    
        if (r0 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04e5, code lost:
    
        r11 = new kotlin.Pair(r2, r0);
        r0 = r36.getDefensiveForcedFumbles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04ee, code lost:
    
        if (r0 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04f0, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04fb, code lost:
    
        r12 = new kotlin.Pair(r6, r0);
        r0 = r36.getFumbleRecovery();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0506, code lost:
    
        if (r0 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0508, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0513, code lost:
    
        r13 = new kotlin.Pair(r21, r0);
        r0 = r36.getDefensiveInterceptions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x051e, code lost:
    
        if (r0 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0520, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x052b, code lost:
    
        r14 = new kotlin.Pair(r12, r0);
        r0 = r36.getDefensiveTacklesForLoss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x05f0, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0536, code lost:
    
        if (r0 == null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0538, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0543, code lost:
    
        r15 = new kotlin.Pair(r4, r0);
        r0 = r36.getDefensiveBattedPasses();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x054e, code lost:
    
        if (r0 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0550, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x055b, code lost:
    
        r1 = new kotlin.Pair(r3, r0);
        r0 = r36.getDefensiveSacks();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0566, code lost:
    
        if (r0 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0568, code lost:
    
        r0 = java.lang.String.valueOf(r0.doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0570, code lost:
    
        if (r0 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0572, code lost:
    
        r22 = Q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x05fb, code lost:
    
        r12 = new kotlin.Pair(r4, r0);
        r0 = r36.getDefensiveSacks();
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0595, code lost:
    
        return P(kotlin.collections.b.j(r9, r10, r11, r12, r13, r14, r15, r1, new kotlin.Pair(r2, r22)), 4, 6, 7, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0559, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0541, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0529, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0511, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04f9, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04e3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04cd, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04b7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0604, code lost:
    
        if (r0 == null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0490, code lost:
    
        if (r37.equals("LB") == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x049a, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_TACKLE) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04a4, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05a6, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_BACK) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05ba, code lost:
    
        if (r37.equals("CB") == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0606, code lost:
    
        r0 = java.lang.String.valueOf(r0.doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0611, code lost:
    
        r13 = new kotlin.Pair(r2, r0);
        r0 = r36.getDefensiveForcedFumbles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x061a, code lost:
    
        if (r0 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x061c, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0627, code lost:
    
        r14 = new kotlin.Pair(r1, r0);
        r0 = r36.getFumbleRecovery();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0630, code lost:
    
        if (r0 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0632, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x063d, code lost:
    
        r15 = new kotlin.Pair(r3, r0);
        r0 = java.lang.Integer.valueOf(com.sofascore.results.R.string.am_football_passes_defended_long);
        r1 = r36.getDefensivePassesDefensed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x064d, code lost:
    
        if (r1 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x064f, code lost:
    
        r1 = java.lang.String.valueOf(r1.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x065a, code lost:
    
        r3 = new kotlin.Pair(r0, r1);
        r0 = r36.getDefensiveBattedPasses();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0663, code lost:
    
        if (r0 == null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0665, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0670, code lost:
    
        r1 = new kotlin.Pair(r9, r0);
        r0 = java.lang.Integer.valueOf(com.sofascore.results.R.string.am_football_def_targets);
        r7 = r36.getDefensiveDefensiveTargets();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0680, code lost:
    
        if (r7 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0682, code lost:
    
        r7 = java.lang.String.valueOf(r7.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x068d, code lost:
    
        r8 = new kotlin.Pair(r0, r7);
        r0 = r36.getDefensiveTacklesForLoss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0696, code lost:
    
        if (r0 == null) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0698, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x06a3, code lost:
    
        r7 = new kotlin.Pair(r5, r0);
        r0 = r36.getDefensiveInterceptions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x06ac, code lost:
    
        if (r0 == null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x06ae, code lost:
    
        r0 = java.lang.String.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x06b6, code lost:
    
        if (r0 == null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x06b8, code lost:
    
        r0 = Q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x06bf, code lost:
    
        r5 = new kotlin.Pair(r4, r0);
        r0 = r36.getDefensiveSacks();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x06c8, code lost:
    
        if (r0 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x06ca, code lost:
    
        r0 = java.lang.String.valueOf(r0.doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x06d2, code lost:
    
        if (r0 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x06d4, code lost:
    
        r22 = Q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x06ff, code lost:
    
        return P(kotlin.collections.b.j(r10, r11, r12, r13, r14, r15, r3, r1, r8, r7, r5, new kotlin.Pair(r2, r22)), 4, 10, 11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x06bd, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x06a1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x068b, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x066e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0658, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x063b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0625, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x060f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x05f9, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x05e3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x05cd, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d1, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OUTSIDE_LINEBACK) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00db, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_MIDDLE_LINEBACK) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e5, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_INSIDE_LINEBACK) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ef, code lost:
    
        if (r37.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_WIDE_RECEIVER) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
    
        if (1 > r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010c, code lost:
    
        if (r5 >= r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010e, code lost:
    
        r2 = r36.getRushingAttempts();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0112, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0114, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011f, code lost:
    
        r5 = new kotlin.Pair(r15, r2);
        r2 = r36.getRushingYards();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0128, code lost:
    
        if (r2 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012a, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0135, code lost:
    
        r7 = new kotlin.Pair(r4, r2);
        r2 = r36.getRushingTouchdowns();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        if (r2 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0140, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014b, code lost:
    
        r4 = new kotlin.Pair(r3, r2);
        r2 = r36.getReceivingYards();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0156, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
    
        r3 = new kotlin.Pair(r14, r2);
        r2 = r36.getReceivingTouchdowns();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016a, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016c, code lost:
    
        r2 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0177, code lost:
    
        r8 = new kotlin.Pair(r13, r2);
        r2 = r36.getReceivingReceptions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0180, code lost:
    
        if (r2 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0182, code lost:
    
        r22 = java.lang.String.valueOf(r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01af, code lost:
    
        return P(kotlin.collections.b.j(r5, r7, r4, r3, r8, new kotlin.Pair(r11, r22)), 4, 0, 1, 3, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0175, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List E(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, String str, boolean z) {
        Integer num;
        int i;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer valueOf = Integer.valueOf(R.string.am_football_touchback);
        Integer valueOf2 = Integer.valueOf(R.string.am_football_batted_pass);
        Integer valueOf3 = Integer.valueOf(R.string.am_football_tackles_loss);
        Integer valueOf4 = Integer.valueOf(R.string.fumble_recoveries);
        Integer valueOf5 = Integer.valueOf(R.string.am_football_forced_fumbles_long);
        Integer valueOf6 = Integer.valueOf(R.string.assist_tackle);
        Integer valueOf7 = Integer.valueOf(R.string.combine_tackles);
        Integer valueOf8 = Integer.valueOf(R.string.am_football_receiving_targets_long);
        Integer valueOf9 = Integer.valueOf(R.string.longest_rush);
        Integer valueOf10 = Integer.valueOf(R.string.am_football_receptions_long);
        Integer valueOf11 = Integer.valueOf(R.string.am_football_interceptions_long);
        Integer valueOf12 = Integer.valueOf(R.string.receiving_touchdowns);
        Integer valueOf13 = Integer.valueOf(R.string.am_football_receiving_yards_long);
        Integer valueOf14 = Integer.valueOf(R.string.rushing_attempts);
        Integer valueOf15 = Integer.valueOf(R.string.sacks);
        Integer valueOf16 = Integer.valueOf(R.string.rushing_touchdowns);
        Integer valueOf17 = Integer.valueOf(R.string.rushing_yards);
        Integer rushingYards = americanFootballPlayerEventStatistics.getRushingYards();
        int intValue = rushingYards != null ? rushingYards.intValue() : 0;
        Integer receivingYards = americanFootballPlayerEventStatistics.getReceivingYards();
        if (receivingYards != null) {
            int intValue2 = receivingYards.intValue();
            num = valueOf4;
            i = intValue2;
        } else {
            num = valueOf4;
            i = 0;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_KICKER)) {
                        Pair pair = new Pair(Integer.valueOf(R.string.amf_field_goals), rei.h(americanFootballPlayerEventStatistics.getKickingFgMade(), americanFootballPlayerEventStatistics.getKickingFgAttempts(), true, z));
                        Pair pair2 = new Pair(Integer.valueOf(R.string.legend_am_foot_extra_points), rei.h(americanFootballPlayerEventStatistics.getKickingExtraMade(), americanFootballPlayerEventStatistics.getKickingExtraAttempts(), true, z));
                        Integer valueOf18 = Integer.valueOf(R.string.field_goals_blocked);
                        Integer kickingFgBlocked = americanFootballPlayerEventStatistics.getKickingFgBlocked();
                        Pair pair3 = new Pair(valueOf18, kickingFgBlocked != null ? String.valueOf(kickingFgBlocked.intValue()) : null);
                        Integer valueOf19 = Integer.valueOf(R.string.kicking_fg_long);
                        Integer kickingFgLong = americanFootballPlayerEventStatistics.getKickingFgLong();
                        Pair pair4 = new Pair(valueOf19, kickingFgLong != null ? String.valueOf(kickingFgLong.intValue()) : null);
                        Integer valueOf20 = Integer.valueOf(R.string.am_football_kicking_total_points);
                        Integer kickingTotalPoints = americanFootballPlayerEventStatistics.getKickingTotalPoints();
                        Pair pair5 = new Pair(valueOf20, kickingTotalPoints != null ? String.valueOf(kickingTotalPoints.intValue()) : null);
                        Integer valueOf21 = Integer.valueOf(R.string.am_football_out_of_bounds_kickoffs);
                        Integer kickoffOutOfBounds = americanFootballPlayerEventStatistics.getKickoffOutOfBounds();
                        Pair pair6 = new Pair(valueOf21, kickoffOutOfBounds != null ? String.valueOf(kickoffOutOfBounds.intValue()) : null);
                        Integer valueOf22 = Integer.valueOf(R.string.am_football_inside_20);
                        Integer kickoffInside20 = americanFootballPlayerEventStatistics.getKickoffInside20();
                        Pair pair7 = new Pair(valueOf22, kickoffInside20 != null ? String.valueOf(kickoffInside20.intValue()) : null);
                        Integer kickoffEndZone = americanFootballPlayerEventStatistics.getKickoffEndZone();
                        return P(b.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(valueOf, kickoffEndZone != null ? String.valueOf(kickoffEndZone.intValue()) : null)), 4, 6);
                    }
                    break;
                case 80:
                    if (str.equals("P")) {
                        Integer valueOf23 = Integer.valueOf(R.string.punts);
                        Integer puntingTotal = americanFootballPlayerEventStatistics.getPuntingTotal();
                        Pair pair8 = new Pair(valueOf23, puntingTotal != null ? String.valueOf(puntingTotal.intValue()) : null);
                        Integer valueOf24 = Integer.valueOf(R.string.punting_yards);
                        Integer puntingYards = americanFootballPlayerEventStatistics.getPuntingYards();
                        Pair pair9 = new Pair(valueOf24, puntingYards != null ? String.valueOf(puntingYards.intValue()) : null);
                        Integer valueOf25 = Integer.valueOf(R.string.punts_blocked);
                        Integer puntingBlocked = americanFootballPlayerEventStatistics.getPuntingBlocked();
                        Pair pair10 = new Pair(valueOf25, puntingBlocked != null ? String.valueOf(puntingBlocked.intValue()) : null);
                        Integer valueOf26 = Integer.valueOf(R.string.punts_inside_20);
                        Integer puntingInside20 = americanFootballPlayerEventStatistics.getPuntingInside20();
                        Pair pair11 = new Pair(valueOf26, puntingInside20 != null ? String.valueOf(puntingInside20.intValue()) : null);
                        Integer valueOf27 = Integer.valueOf(R.string.longest_punt);
                        Integer puntingLongest = americanFootballPlayerEventStatistics.getPuntingLongest();
                        Pair pair12 = new Pair(valueOf27, puntingLongest != null ? String.valueOf(puntingLongest.intValue()) : null);
                        Integer puntingTouchbacks = americanFootballPlayerEventStatistics.getPuntingTouchbacks();
                        return P(b.j(pair8, pair9, pair10, pair11, pair12, new Pair(valueOf, puntingTouchbacks != null ? String.valueOf(puntingTouchbacks.intValue()) : null)), 4, new int[0]);
                    }
                    break;
                case 2143:
                    num2 = valueOf2;
                    num3 = valueOf3;
                    num4 = valueOf11;
                    num5 = num;
                    num6 = valueOf5;
                    break;
                case 2174:
                    num2 = valueOf2;
                    num3 = valueOf3;
                    num4 = valueOf11;
                    num5 = num;
                    num6 = valueOf5;
                    break;
                case 2177:
                    break;
                case 2192:
                    break;
                case 2422:
                    break;
                case 2502:
                    break;
                case 2577:
                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_QUARTERBACK)) {
                        Pair pair13 = new Pair(Integer.valueOf(R.string.am_football_passing), rei.h(americanFootballPlayerEventStatistics.getPassingCompletions(), americanFootballPlayerEventStatistics.getPassingAttempts(), true, z));
                        Integer valueOf28 = Integer.valueOf(R.string.passing_yards);
                        Integer passingYards = americanFootballPlayerEventStatistics.getPassingYards();
                        Pair pair14 = new Pair(valueOf28, passingYards != null ? String.valueOf(passingYards.intValue()) : null);
                        Pair pair15 = new Pair(Integer.valueOf(R.string.am_football_passing_touchdowns_interceptions), rei.h(americanFootballPlayerEventStatistics.getPassingTouchdowns(), americanFootballPlayerEventStatistics.getPassingInterceptions(), false, z));
                        Integer rushingTouchdowns = americanFootballPlayerEventStatistics.getRushingTouchdowns();
                        Pair pair16 = new Pair(valueOf16, rushingTouchdowns != null ? String.valueOf(rushingTouchdowns.intValue()) : null);
                        Integer valueOf29 = Integer.valueOf(R.string.fumbles);
                        Integer fumbleFumbles = americanFootballPlayerEventStatistics.getFumbleFumbles();
                        Pair pair17 = new Pair(valueOf29, fumbleFumbles != null ? String.valueOf(fumbleFumbles.intValue()) : null);
                        Pair pair18 = new Pair(Integer.valueOf(R.string.am_football_sack_yards_stat), y(americanFootballPlayerEventStatistics.getPassingSackYards(), americanFootballPlayerEventStatistics.getPassingSacked(), true, z));
                        Integer rushingYards2 = americanFootballPlayerEventStatistics.getRushingYards();
                        Pair pair19 = new Pair(valueOf17, rushingYards2 != null ? String.valueOf(rushingYards2.intValue()) : null);
                        Integer rushingAttempts = americanFootballPlayerEventStatistics.getRushingAttempts();
                        Pair pair20 = new Pair(valueOf14, rushingAttempts != null ? String.valueOf(rushingAttempts.intValue()) : null);
                        Integer rushingLongest = americanFootballPlayerEventStatistics.getRushingLongest();
                        return P(b.j(pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, new Pair(valueOf9, rushingLongest != null ? String.valueOf(rushingLongest.intValue()) : null)), 4, 7, 8);
                    }
                    break;
                case 2608:
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
        }
        return null;
    }

    public static List F(PlayerEventStatistics playerEventStatistics, String str, boolean z, boolean z2) {
        List E;
        List j;
        List list;
        String str2;
        Integer valueOf = Integer.valueOf(R.string.plus_minus);
        Integer valueOf2 = Integer.valueOf(R.string.blocks);
        Integer valueOf3 = Integer.valueOf(R.string.goals);
        playerEventStatistics.getClass();
        if (playerEventStatistics instanceof FootballPlayerEventStatistics) {
            FootballPlayerEventStatistics footballPlayerEventStatistics = (FootballPlayerEventStatistics) playerEventStatistics;
            Integer valueOf4 = Integer.valueOf(R.string.football_minutes_played);
            Integer valueOf5 = Integer.valueOf(R.string.goal_assist);
            if (z2) {
                Integer goals = footballPlayerEventStatistics.getGoals();
                if ((goals != null ? goals.intValue() : 0) <= 0) {
                    goals = null;
                }
                String valueOf6 = goals != null ? String.valueOf(goals.intValue()) : null;
                if (Intrinsics.c(valueOf6, "null")) {
                    valueOf6 = null;
                }
                Pair pair = new Pair(valueOf3, valueOf6);
                Integer goalAssist = footballPlayerEventStatistics.getGoalAssist();
                if ((goalAssist != null ? goalAssist.intValue() : 0) <= 0) {
                    goalAssist = null;
                }
                String valueOf7 = String.valueOf(goalAssist);
                if (valueOf7.equals("null")) {
                    valueOf7 = null;
                }
                list = b.j(pair, new Pair(valueOf5, valueOf7));
            } else {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 68) {
                        if (hashCode != 77) {
                            if (hashCode != 70) {
                                if (hashCode == 71 && str.equals("G")) {
                                    Integer goals2 = footballPlayerEventStatistics.getGoals();
                                    Pair pair2 = new Pair(valueOf3, goals2 != null ? String.valueOf(goals2.intValue()) : null);
                                    Integer goalAssist2 = footballPlayerEventStatistics.getGoalAssist();
                                    Pair pair3 = new Pair(valueOf5, goalAssist2 != null ? String.valueOf(goalAssist2.intValue()) : null);
                                    Integer valueOf8 = Integer.valueOf(R.string.football_saves);
                                    Integer saves = footballPlayerEventStatistics.getSaves();
                                    Pair pair4 = new Pair(valueOf8, saves != null ? String.valueOf(saves.intValue()) : null);
                                    Integer valueOf9 = Integer.valueOf(R.string.football_goals_prevented);
                                    Double goalsPrevented = footballPlayerEventStatistics.getGoalsPrevented();
                                    Pair pair5 = new Pair(valueOf9, goalsPrevented != null ? rei.b(2, Double.valueOf(goalsPrevented.doubleValue())) : null);
                                    Integer valueOf10 = Integer.valueOf(R.string.football_saves_from_inside_box);
                                    Integer savedShotsFromInsideTheBox = footballPlayerEventStatistics.getSavedShotsFromInsideTheBox();
                                    Pair pair6 = new Pair(valueOf10, savedShotsFromInsideTheBox != null ? String.valueOf(savedShotsFromInsideTheBox.intValue()) : null);
                                    Integer valueOf11 = Integer.valueOf(R.string.football_total_long_balls);
                                    if (footballPlayerEventStatistics.getAccurateLongBalls() != null) {
                                        Integer accurateLongBalls = footballPlayerEventStatistics.getAccurateLongBalls();
                                        Integer valueOf12 = Integer.valueOf(accurateLongBalls != null ? accurateLongBalls.intValue() : 0);
                                        Integer totalLongBalls = footballPlayerEventStatistics.getTotalLongBalls();
                                        str2 = y(valueOf12, Integer.valueOf(totalLongBalls != null ? totalLongBalls.intValue() : 0), true, z);
                                    } else {
                                        str2 = null;
                                    }
                                    list = b.j(pair2, pair3, pair4, pair5, pair6, new Pair(valueOf11, str2), new Pair(Integer.valueOf(R.string.football_accurate_passes), rei.h(footballPlayerEventStatistics.getAccuratePass(), footballPlayerEventStatistics.getTotalPass(), true, z)));
                                }
                            } else if (str.equals("F")) {
                                Integer minutesPlayed = footballPlayerEventStatistics.getMinutesPlayed();
                                Pair pair7 = new Pair(valueOf4, minutesPlayed != null ? mz1.i(minutesPlayed.intValue(), "'") : null);
                                Integer goals3 = footballPlayerEventStatistics.getGoals();
                                Pair pair8 = new Pair(valueOf3, goals3 != null ? String.valueOf(goals3.intValue()) : null);
                                Integer valueOf13 = Integer.valueOf(R.string.football_expected_goals);
                                Double expectedGoals = footballPlayerEventStatistics.getExpectedGoals();
                                Pair pair9 = new Pair(valueOf13, expectedGoals != null ? rei.b(2, Double.valueOf(expectedGoals.doubleValue())) : null);
                                Integer goalAssist3 = footballPlayerEventStatistics.getGoalAssist();
                                Pair pair10 = new Pair(valueOf5, goalAssist3 != null ? String.valueOf(goalAssist3.intValue()) : null);
                                Integer valueOf14 = Integer.valueOf(R.string.football_total_shots);
                                Integer onTargetScoringAttempt = footballPlayerEventStatistics.getOnTargetScoringAttempt();
                                int intValue = onTargetScoringAttempt != null ? onTargetScoringAttempt.intValue() : 0;
                                Integer shotOffTarget = footballPlayerEventStatistics.getShotOffTarget();
                                int intValue2 = intValue + (shotOffTarget != null ? shotOffTarget.intValue() : 0);
                                Integer blockedShots = footballPlayerEventStatistics.getBlockedShots();
                                int intValue3 = intValue2 + (blockedShots != null ? blockedShots.intValue() : 0);
                                Pair pair11 = new Pair(valueOf14, intValue3 == 0 ? null : String.valueOf(intValue3));
                                Integer valueOf15 = Integer.valueOf(R.string.football_big_chances_missed);
                                Integer bigChanceMissed = footballPlayerEventStatistics.getBigChanceMissed();
                                Pair pair12 = new Pair(valueOf15, bigChanceMissed != null ? String.valueOf(bigChanceMissed.intValue()) : null);
                                Integer valueOf16 = Integer.valueOf(R.string.total_duels);
                                Integer duelWon = footballPlayerEventStatistics.getDuelWon();
                                int intValue4 = duelWon != null ? duelWon.intValue() : 0;
                                Integer aerialWon = footballPlayerEventStatistics.getAerialWon();
                                int intValue5 = intValue4 - (aerialWon != null ? aerialWon.intValue() : 0);
                                Integer aerialWon2 = footballPlayerEventStatistics.getAerialWon();
                                int intValue6 = intValue5 + (aerialWon2 != null ? aerialWon2.intValue() : 0);
                                Integer duelLost = footballPlayerEventStatistics.getDuelLost();
                                int intValue7 = duelLost != null ? duelLost.intValue() : 0;
                                Integer aerialLost = footballPlayerEventStatistics.getAerialLost();
                                int intValue8 = intValue7 - (aerialLost != null ? aerialLost.intValue() : 0);
                                Integer aerialLost2 = footballPlayerEventStatistics.getAerialLost();
                                list = b.j(pair7, pair8, pair9, pair10, pair11, pair12, new Pair(valueOf16, y(Integer.valueOf(intValue6), Integer.valueOf(intValue8 + (aerialLost2 != null ? aerialLost2.intValue() : 0)), false, z)));
                            }
                        } else if (str.equals(PlayerKt.FOOTBALL_MIDFIELDER)) {
                            Integer minutesPlayed2 = footballPlayerEventStatistics.getMinutesPlayed();
                            Pair pair13 = new Pair(valueOf4, minutesPlayed2 != null ? mz1.i(minutesPlayed2.intValue(), "'") : null);
                            Integer goals4 = footballPlayerEventStatistics.getGoals();
                            Pair pair14 = new Pair(valueOf3, goals4 != null ? String.valueOf(goals4.intValue()) : null);
                            Integer goalAssist4 = footballPlayerEventStatistics.getGoalAssist();
                            Pair pair15 = new Pair(valueOf5, goalAssist4 != null ? String.valueOf(goalAssist4.intValue()) : null);
                            Integer valueOf17 = Integer.valueOf(R.string.football_touches);
                            Integer touches = footballPlayerEventStatistics.getTouches();
                            Pair pair16 = new Pair(valueOf17, touches != null ? String.valueOf(touches.intValue()) : null);
                            Pair pair17 = new Pair(Integer.valueOf(R.string.football_dribble_attempts), y(footballPlayerEventStatistics.getWonContest(), footballPlayerEventStatistics.getTotalContest(), false, z));
                            Integer valueOf18 = Integer.valueOf(R.string.football_big_chances_created);
                            Integer bigChanceCreated = footballPlayerEventStatistics.getBigChanceCreated();
                            Pair pair18 = new Pair(valueOf18, bigChanceCreated != null ? String.valueOf(bigChanceCreated.intValue()) : null);
                            Integer valueOf19 = Integer.valueOf(R.string.football_key_passes);
                            Integer keyPass = footballPlayerEventStatistics.getKeyPass();
                            list = b.j(pair13, pair14, pair15, pair16, pair17, pair18, new Pair(valueOf19, keyPass != null ? String.valueOf(keyPass.intValue()) : null));
                        }
                    } else if (str.equals("D")) {
                        Integer minutesPlayed3 = footballPlayerEventStatistics.getMinutesPlayed();
                        Pair pair19 = new Pair(valueOf4, minutesPlayed3 != null ? mz1.i(minutesPlayed3.intValue(), "'") : null);
                        Integer goals5 = footballPlayerEventStatistics.getGoals();
                        Pair pair20 = new Pair(valueOf3, goals5 != null ? String.valueOf(goals5.intValue()) : null);
                        Integer goalAssist5 = footballPlayerEventStatistics.getGoalAssist();
                        Pair pair21 = new Pair(valueOf5, goalAssist5 != null ? String.valueOf(goalAssist5.intValue()) : null);
                        Integer valueOf20 = Integer.valueOf(R.string.football_ground_duels_won_in_brackets);
                        Integer duelWon2 = footballPlayerEventStatistics.getDuelWon();
                        int intValue9 = duelWon2 != null ? duelWon2.intValue() : 0;
                        Integer aerialWon3 = footballPlayerEventStatistics.getAerialWon();
                        int intValue10 = intValue9 - (aerialWon3 != null ? aerialWon3.intValue() : 0);
                        Integer duelLost2 = footballPlayerEventStatistics.getDuelLost();
                        int intValue11 = duelLost2 != null ? duelLost2.intValue() : 0;
                        Integer aerialLost3 = footballPlayerEventStatistics.getAerialLost();
                        Pair pair22 = new Pair(valueOf20, y(Integer.valueOf(intValue10), Integer.valueOf(intValue11 - (aerialLost3 != null ? aerialLost3.intValue() : 0)), false, z));
                        Pair pair23 = new Pair(Integer.valueOf(R.string.football_aerial_duels_won_in_brackets), y(footballPlayerEventStatistics.getAerialWon(), footballPlayerEventStatistics.getAerialLost(), false, z));
                        Integer valueOf21 = Integer.valueOf(R.string.football_tackles);
                        Integer totalTackle = footballPlayerEventStatistics.getTotalTackle();
                        Pair pair24 = new Pair(valueOf21, totalTackle != null ? String.valueOf(totalTackle.intValue()) : null);
                        Integer valueOf22 = Integer.valueOf(R.string.football_clearances);
                        Integer totalClearance = footballPlayerEventStatistics.getTotalClearance();
                        list = b.j(pair19, pair20, pair21, pair22, pair23, pair24, new Pair(valueOf22, totalClearance != null ? String.valueOf(totalClearance.intValue()) : null));
                    }
                }
                list = null;
            }
            if (list != null) {
                E = P(list, 4, new int[0]);
            }
            E = null;
        } else {
            if (playerEventStatistics instanceof BasketballPlayerEventStatistics) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) playerEventStatistics;
                Pair pair25 = new Pair(Integer.valueOf(R.string.basketball_minutes_played), basketballPlayerEventStatistics.getSecondsPlayed() != null ? mz1.i(wzb.a(r2.intValue() / 60.0d), "'") : "");
                Integer valueOf23 = Integer.valueOf(R.string.points_basketball);
                Integer points = basketballPlayerEventStatistics.getPoints();
                Pair pair26 = new Pair(valueOf23, points != null ? String.valueOf(points.intValue()) : null);
                Integer valueOf24 = Integer.valueOf(R.string.rebounds);
                Integer rebounds = basketballPlayerEventStatistics.getRebounds();
                Pair pair27 = new Pair(valueOf24, rebounds != null ? String.valueOf(rebounds.intValue()) : null);
                Integer valueOf25 = Integer.valueOf(R.string.basketball_assists);
                Integer assists = basketballPlayerEventStatistics.getAssists();
                Pair pair28 = new Pair(valueOf25, assists != null ? String.valueOf(assists.intValue()) : null);
                Integer blocks = basketballPlayerEventStatistics.getBlocks();
                Pair pair29 = new Pair(valueOf2, blocks != null ? String.valueOf(blocks.intValue()) : null);
                Integer plusMinus = basketballPlayerEventStatistics.getPlusMinus();
                E = P(b.j(pair25, pair26, pair27, pair28, pair29, new Pair(valueOf, plusMinus != null ? String.valueOf(plusMinus.intValue()) : null)), 5, new int[0]);
            } else if (playerEventStatistics instanceof IceHockeyPlayerEventStatistics) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) playerEventStatistics;
                Integer valueOf26 = Integer.valueOf(R.string.time_on_ice);
                String j2 = rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                if (j2.equals("")) {
                    j2 = null;
                }
                Pair pair30 = new Pair(valueOf26, j2);
                Integer goals6 = iceHockeyPlayerEventStatistics.getGoals();
                Pair pair31 = new Pair(valueOf3, goals6 != null ? String.valueOf(goals6.intValue()) : null);
                Integer valueOf27 = Integer.valueOf(R.string.ice_hockey_assists);
                Integer assists2 = iceHockeyPlayerEventStatistics.getAssists();
                Pair pair32 = new Pair(valueOf27, assists2 != null ? String.valueOf(assists2.intValue()) : null);
                Integer plusMinus2 = iceHockeyPlayerEventStatistics.getPlusMinus();
                Pair pair33 = new Pair(valueOf, plusMinus2 != null ? String.valueOf(plusMinus2.intValue()) : null);
                Integer valueOf28 = Integer.valueOf(R.string.hits);
                Integer hits = iceHockeyPlayerEventStatistics.getHits();
                Pair pair34 = new Pair(valueOf28, hits != null ? String.valueOf(hits.intValue()) : null);
                Integer blocked = iceHockeyPlayerEventStatistics.getBlocked();
                Pair pair35 = new Pair(valueOf2, blocked != null ? String.valueOf(blocked.intValue()) : null);
                Integer valueOf29 = Integer.valueOf(R.string.hockey_penalty_minutes);
                Integer penaltyMinutes = iceHockeyPlayerEventStatistics.getPenaltyMinutes();
                E = P(b.j(pair30, pair31, pair32, pair33, pair34, pair35, new Pair(valueOf29, penaltyMinutes != null ? String.valueOf(penaltyMinutes.intValue()) : null)), 4, 0, 1, 2, 3, 4, 5, 6);
            } else if (playerEventStatistics instanceof HandballPlayerEventStatistics) {
                HandballPlayerEventStatistics handballPlayerEventStatistics = (HandballPlayerEventStatistics) playerEventStatistics;
                Integer valueOf30 = Integer.valueOf(R.string.shots);
                if (str != null) {
                    if (str.equals("G")) {
                        Integer valueOf31 = Integer.valueOf(R.string.handball_saves);
                        Integer saves2 = handballPlayerEventStatistics.getSaves();
                        Pair pair36 = new Pair(valueOf31, saves2 != null ? String.valueOf(saves2.intValue()) : null);
                        Integer gkShots = handballPlayerEventStatistics.getGkShots();
                        Pair pair37 = new Pair(valueOf30, gkShots != null ? String.valueOf(gkShots.intValue()) : null);
                        Integer valueOf32 = Integer.valueOf(R.string.m7_saves);
                        Integer gk7mSaves = handballPlayerEventStatistics.getGk7mSaves();
                        Pair pair38 = new Pair(valueOf32, gk7mSaves != null ? String.valueOf(gk7mSaves.intValue()) : null);
                        Integer valueOf33 = Integer.valueOf(R.string.m6_saves);
                        Integer gk6mSaves = handballPlayerEventStatistics.getGk6mSaves();
                        Pair pair39 = new Pair(valueOf33, gk6mSaves != null ? String.valueOf(gk6mSaves.intValue()) : null);
                        Integer valueOf34 = Integer.valueOf(R.string.pivot_saves);
                        Integer gkPivotSaves = handballPlayerEventStatistics.getGkPivotSaves();
                        Pair pair40 = new Pair(valueOf34, gkPivotSaves != null ? String.valueOf(gkPivotSaves.intValue()) : null);
                        Integer valueOf35 = Integer.valueOf(R.string.m9_saves);
                        Integer gk9mSaves = handballPlayerEventStatistics.getGk9mSaves();
                        Pair pair41 = new Pair(valueOf35, gk9mSaves != null ? String.valueOf(gk9mSaves.intValue()) : null);
                        Integer valueOf36 = Integer.valueOf(R.string.breakthrough_saves);
                        Integer gkBreakthroughSaves = handballPlayerEventStatistics.getGkBreakthroughSaves();
                        Pair pair42 = new Pair(valueOf36, gkBreakthroughSaves != null ? String.valueOf(gkBreakthroughSaves.intValue()) : null);
                        Integer valueOf37 = Integer.valueOf(R.string.fastbreak_saves);
                        Integer gkFastbreakSaves = handballPlayerEventStatistics.getGkFastbreakSaves();
                        j = b.j(pair36, pair37, pair38, pair39, pair40, pair41, pair42, new Pair(valueOf37, gkFastbreakSaves != null ? String.valueOf(gkFastbreakSaves.intValue()) : null));
                    } else {
                        Integer goals7 = handballPlayerEventStatistics.getGoals();
                        Pair pair43 = new Pair(valueOf3, goals7 != null ? String.valueOf(goals7.intValue()) : null);
                        Integer shots = handballPlayerEventStatistics.getShots();
                        Pair pair44 = new Pair(valueOf30, shots != null ? String.valueOf(shots.intValue()) : null);
                        Integer valueOf38 = Integer.valueOf(R.string.handball_assists);
                        Integer assists3 = handballPlayerEventStatistics.getAssists();
                        Pair pair45 = new Pair(valueOf38, assists3 != null ? String.valueOf(assists3.intValue()) : null);
                        Integer valueOf39 = Integer.valueOf(R.string.steals);
                        Integer steals = handballPlayerEventStatistics.getSteals();
                        Pair pair46 = new Pair(valueOf39, steals != null ? String.valueOf(steals.intValue()) : null);
                        Integer valueOf40 = Integer.valueOf(R.string.blocked_scoring_attempt);
                        Integer blockedShots2 = handballPlayerEventStatistics.getBlockedShots();
                        Pair pair47 = new Pair(valueOf40, blockedShots2 != null ? String.valueOf(blockedShots2.intValue()) : null);
                        Integer valueOf41 = Integer.valueOf(R.string.two_min_penalty);
                        Integer twoMinutePenalties = handballPlayerEventStatistics.getTwoMinutePenalties();
                        Pair pair48 = new Pair(valueOf41, twoMinutePenalties != null ? String.valueOf(twoMinutePenalties.intValue()) : null);
                        Integer valueOf42 = Integer.valueOf(R.string.technical_faults);
                        Integer technicalFaults = handballPlayerEventStatistics.getTechnicalFaults();
                        Pair pair49 = new Pair(valueOf42, technicalFaults != null ? String.valueOf(technicalFaults.intValue()) : null);
                        Integer valueOf43 = Integer.valueOf(R.string.handball_yellow_cards);
                        Integer yellowCards = handballPlayerEventStatistics.getYellowCards();
                        j = b.j(pair43, pair44, pair45, pair46, pair47, pair48, pair49, new Pair(valueOf43, yellowCards != null ? String.valueOf(yellowCards.intValue()) : null));
                    }
                    E = P(j, 4, new int[0]);
                }
                E = null;
            } else {
                E = playerEventStatistics instanceof AmericanFootballPlayerEventStatistics ? E((AmericanFootballPlayerEventStatistics) playerEventStatistics, str, z) : km5.a;
            }
        }
        if (!z2) {
            if ((E != null ? E.size() : 0) < 4) {
                return null;
            }
        }
        return E;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002f, B:13:0x00e4, B:15:0x00ec, B:17:0x00f0, B:19:0x00fc, B:21:0x0108, B:62:0x00bd), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:34:0x0042, B:35:0x0079, B:37:0x0081, B:39:0x008d, B:41:0x0099, B:52:0x0060), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(noi noiVar, jwc jwcVar, b10 b10Var, fze fzeVar, h21 h21Var) {
        y2h y2hVar;
        int i;
        noi noiVar2;
        asf asfVar;
        int size;
        ilg ilgVar = k03.f;
        try {
            try {
                if (h21Var instanceof y2h) {
                    y2hVar = (y2h) h21Var;
                    int i2 = y2hVar.v;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        y2hVar.v = i2 - Integer.MIN_VALUE;
                        Object obj = y2hVar.u;
                        lu3 lu3Var = lu3.a;
                        i = y2hVar.v;
                        int i3 = 0;
                        if (i == 0) {
                            if (i == 1) {
                                jwcVar = y2hVar.s;
                                noiVar = y2hVar.r;
                                y6a.M(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List list = noiVar.f.s.a;
                                    int size2 = list.size();
                                    while (i3 < size2) {
                                        mze mzeVar = (mze) list.get(i3);
                                        if (qea.m(mzeVar)) {
                                            mzeVar.a();
                                        }
                                        i3++;
                                    }
                                }
                                return Unit.a;
                            }
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            asfVar = y2hVar.t;
                            jwcVar = y2hVar.s;
                            noiVar2 = y2hVar.r;
                            y6a.M(obj);
                            if (((Boolean) obj).booleanValue() && asfVar.a) {
                                List list2 = noiVar2.f.s.a;
                                size = list2.size();
                                while (i3 < size) {
                                    mze mzeVar2 = (mze) list2.get(i3);
                                    if (qea.m(mzeVar2)) {
                                        mzeVar2.a();
                                    }
                                    i3++;
                                }
                            }
                            jwcVar.b();
                            return Unit.a;
                        }
                        y6a.M(obj);
                        mze mzeVar3 = (mze) fzeVar.a.get(0);
                        if ((fzeVar.e & 1) != 0) {
                            if (jwcVar.g(mzeVar3.c)) {
                                mzeVar3.a();
                                long j = mzeVar3.a;
                                qfg qfgVar = new qfg(jwcVar, 12);
                                y2hVar.r = noiVar;
                                y2hVar.s = jwcVar;
                                y2hVar.v = 1;
                                obj = e95.f(noiVar, j, qfgVar, y2hVar);
                                if (obj == lu3Var) {
                                    return lu3Var;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return Unit.a;
                        }
                        int i4 = b10Var.b;
                        ilg ilgVar2 = i4 != 1 ? i4 != 2 ? k03.i : k03.h : ilgVar;
                        if (jwcVar.c(mzeVar3.c, ilgVar2, i4)) {
                            asf asfVar2 = new asf();
                            asfVar2.a = !ilgVar2.equals(ilgVar);
                            long j2 = mzeVar3.a;
                            vsc vscVar = new vsc(16, jwcVar, ilgVar2, asfVar2);
                            y2hVar.r = noiVar;
                            y2hVar.s = jwcVar;
                            y2hVar.t = asfVar2;
                            y2hVar.v = 2;
                            obj = e95.f(noiVar, j2, vscVar, y2hVar);
                            if (obj != lu3Var) {
                                noiVar2 = noiVar;
                                asfVar = asfVar2;
                                if (((Boolean) obj).booleanValue()) {
                                    List list22 = noiVar2.f.s.a;
                                    size = list22.size();
                                    while (i3 < size) {
                                    }
                                }
                                jwcVar.b();
                            }
                            return lu3Var;
                        }
                        return Unit.a;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        y2hVar = new y2h(h21Var);
        Object obj2 = y2hVar.u;
        lu3 lu3Var2 = lu3.a;
        i = y2hVar.v;
        int i32 = 0;
    }

    public static final void H(String str, String str2, tm0 tm0Var, ct8 ct8Var, au3 au3Var) {
        if (str != null) {
            xw3.L(oc3.a, au3Var, null, new ajj(K(str, tm0Var), ct8Var, tm0Var, str2, str, null, 9), 2);
            return;
        }
        cjb.a("Error firing " + str2 + " event tracker, empty url");
        Unit unit = Unit.a;
    }

    public static void I(o0g o0gVar, wcd wcdVar, tm0 tm0Var) {
        ct8 ct8Var = v14.b;
        if (ct8Var == null) {
            ct8Var = ztj.a;
        }
        hs4 hs4Var = z45.a;
        hq4 hq4Var = hq4.c;
        o0gVar.getClass();
        wcdVar.getClass();
        ct8Var.getClass();
        hq4Var.getClass();
        H((String) wcdVar.a.s.get("loss_response"), "Loss", tm0Var, ct8Var, hq4Var);
    }

    public static final gnh J(knh knhVar, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        kx4 kx4Var = (kx4) av8Var.k(dh3.h);
        ol4 a2 = iyh.a(av8Var);
        boolean g = av8Var.g(kx4Var) | av8Var.g(knhVar) | av8Var.g(a2);
        Object O = av8Var.O();
        if (g || O == nf3.a) {
            O = new gnh(knhVar, a2, s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5));
            av8Var.n0(O);
        }
        return (gnh) O;
    }

    public static final String K(String str, tm0 tm0Var) {
        str.getClass();
        String str2 = tm0Var.b;
        if (str2 != null) {
            str = c.r(str, "[AUCTION_PRICE]", str2, false);
        }
        String str3 = tm0Var.c;
        return str3 != null ? c.r(str, "[WINNING_SOURCE]", str3, false) : str;
    }

    public static final xtc M(int i, of3 of3Var, xtc xtcVar, boolean z, boolean z2) {
        xtcVar.getClass();
        final boolean z3 = (i & 1) != 0 ? false : z;
        final boolean z4 = (i & 2) != 0 ? true : z2;
        final long D = lz.D(R.color.n_lv_1, of3Var);
        av8 av8Var = (av8) of3Var;
        final boolean z5 = ((Configuration) av8Var.k(nz.a)).getLayoutDirection() == 1;
        boolean h = av8Var.h(z5) | av8Var.h(z3) | av8Var.f(D) | av8Var.h(z4);
        Object O = av8Var.O();
        if (h || O == nf3.a) {
            Function1 function1 = new Function1() { // from class: duc
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    yma ymaVar = (yma) obj;
                    ymaVar.getClass();
                    final float H0 = ymaVar.H0(3.0f);
                    ymaVar.a();
                    final boolean z6 = z3;
                    final long j = D;
                    final boolean z7 = z4;
                    cga.I(ymaVar, z5, new Function1() { // from class: euc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            long j2;
                            ha5 ha5Var = (ha5) obj2;
                            Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            ha5Var.getClass();
                            boolean z8 = z6;
                            long j3 = j;
                            float f = H0;
                            if (z8) {
                                v7b t = wxf.t(new Pair[]{new Pair(valueOf, new r13(r13.c(j3, 0.1f))), new Pair(Float.valueOf(f), new r13(r13.h))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 8);
                                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                                j2 = j3;
                                ha5.g0(ha5Var, t, 0L, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                            } else {
                                j2 = j3;
                            }
                            if (z7) {
                                v7b t2 = wxf.t(new Pair[]{new Pair(valueOf, new r13(r13.h)), new Pair(Float.valueOf(f), new r13(r13.c(j2, 0.1f)))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 8);
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - f;
                                ((hpo) ha5Var.L0().a).I(intBitsToFloat2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                try {
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                                    ha5.g0(ha5Var, t2, 0L, (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                                } finally {
                                    ((hpo) ha5Var.L0().a).I(-intBitsToFloat2, -0.0f);
                                }
                            }
                            return Unit.a;
                        }
                    });
                    return Unit.a;
                }
            };
            av8Var.n0(function1);
            O = function1;
        }
        return td4.Z(xtcVar, (Function1) O);
    }

    public static final Object N(Context context, h4i h4iVar) {
        lj2 lj2Var = new lj2(1, z9a.b(h4iVar));
        lj2Var.t();
        EditText editText = new EditText(context);
        editText.setHint("Enter DAS URL");
        int b = wzb.b(editText.getResources().getDisplayMetrics().density * 16.0f);
        editText.setPadding(b, b, b, b);
        AlertDialog create = new AlertDialog.Builder(context).setTitle("Creative Testing").setView(editText).setPositiveButton("Preview Ad", new g7j(editText, lj2Var)).setOnCancelListener(new n15(lj2Var, 1)).create();
        lj2Var.v(new xjd(create, 11));
        create.setOnShowListener(new f7j(editText, context));
        create.show();
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public static final xtc O(xtc xtcVar, String str, of3 of3Var) {
        xtcVar.getClass();
        return n9e.J(xtcVar, ((Context) ((av8) of3Var).k(nz.b)).getPackageName() + ":id/" + str);
    }

    public static List P(List list, int i, int... iArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            Pair pair = (Pair) obj;
            Object obj2 = pair.b;
            if (obj2 != null && ((!obj2.equals("0") && !Intrinsics.c(pair.b, "0.0")) || ph0.s(i2, iArr))) {
                arrayList.add(obj);
            }
            i2 = i3;
        }
        return CollectionsKt.L0(arrayList, i);
    }

    public static String Q(String str) {
        if (str.equals("0") || str.equals("0.0")) {
            return str;
        }
        return null;
    }

    public static final void R(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof m9j) {
            R(((m9j) charSequence).c, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    public static final int S(Context context, Integer num) {
        context.getClass();
        return (int) TypedValue.applyDimension(1, num.floatValue(), context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r15 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:12:0x002c, B:13:0x00a1, B:15:0x00a9, B:17:0x00b5, B:19:0x00c1, B:21:0x00c4, B:24:0x00c7, B:28:0x00cb, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:40:0x0086, B:45:0x004a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(noi noiVar, b9j b9jVar, fze fzeVar, h21 h21Var) {
        z2h z2hVar;
        int i;
        mze mzeVar;
        mze mzeVar2;
        try {
            if (h21Var instanceof z2h) {
                z2hVar = (z2h) h21Var;
                int i2 = z2hVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    z2hVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = z2hVar.u;
                    lu3 lu3Var = lu3.a;
                    i = z2hVar.v;
                    int i3 = 1;
                    if (i != 0) {
                        y6a.M(obj);
                        mzeVar = (mze) CollectionsKt.Y(fzeVar.a);
                        long j = mzeVar.a;
                        z2hVar.r = noiVar;
                        z2hVar.s = b9jVar;
                        z2hVar.t = mzeVar;
                        z2hVar.v = 1;
                        obj = e95.c(noiVar, j, z2hVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b9jVar = z2hVar.s;
                            noiVar = z2hVar.r;
                            y6a.M(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List list = noiVar.f.s.a;
                                int size = list.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    mze mzeVar3 = (mze) list.get(i4);
                                    if (qea.m(mzeVar3)) {
                                        mzeVar3.a();
                                    }
                                }
                                b9jVar.onStop();
                            } else {
                                b9jVar.onCancel();
                            }
                            return Unit.a;
                        }
                        mze mzeVar4 = z2hVar.t;
                        b9jVar = z2hVar.s;
                        noi noiVar2 = z2hVar.r;
                        y6a.M(obj);
                        mzeVar = mzeVar4;
                        noiVar = noiVar2;
                    }
                    mzeVar2 = (mze) obj;
                    if (mzeVar2 != null) {
                        long j2 = mzeVar2.c;
                        if (dnd.d(dnd.h(mzeVar.c, j2)) < e95.i(noiVar.e(), mzeVar.i)) {
                            b9jVar.a(j2, c3h.a);
                            long j3 = mzeVar2.a;
                            bkb bkbVar = new bkb(b9jVar, i3);
                            z2hVar.r = noiVar;
                            z2hVar.s = b9jVar;
                            z2hVar.t = null;
                            z2hVar.v = 2;
                            obj = e95.f(noiVar, j3, bkbVar, z2hVar);
                        }
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            mzeVar2 = (mze) obj;
            if (mzeVar2 != null) {
            }
            return Unit.a;
        } catch (CancellationException e) {
            b9jVar.onCancel();
            throw e;
        }
        z2hVar = new z2h(h21Var);
        Object obj2 = z2hVar.u;
        lu3 lu3Var2 = lu3.a;
        i = z2hVar.v;
        int i32 = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:
    
        if (r14 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00c6, B:15:0x00ce, B:17:0x00db, B:19:0x00e7, B:21:0x00ea, B:24:0x00ed, B:28:0x00f1, B:35:0x008f, B:37:0x0093, B:38:0x0095, B:40:0x0099, B:42:0x009f, B:44:0x00a3, B:46:0x00a9, B:48:0x00ad, B:49:0x00b2, B:58:0x004f, B:60:0x005d, B:61:0x0062, B:64:0x0060), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00c6, B:15:0x00ce, B:17:0x00db, B:19:0x00e7, B:21:0x00ea, B:24:0x00ed, B:28:0x00f1, B:35:0x008f, B:37:0x0093, B:38:0x0095, B:40:0x0099, B:42:0x009f, B:44:0x00a3, B:46:0x00a9, B:48:0x00ad, B:49:0x00b2, B:58:0x004f, B:60:0x005d, B:61:0x0062, B:64:0x0060), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00c6, B:15:0x00ce, B:17:0x00db, B:19:0x00e7, B:21:0x00ea, B:24:0x00ed, B:28:0x00f1, B:35:0x008f, B:37:0x0093, B:38:0x0095, B:40:0x0099, B:42:0x009f, B:44:0x00a3, B:46:0x00a9, B:48:0x00ad, B:49:0x00b2, B:58:0x004f, B:60:0x005d, B:61:0x0062, B:64:0x0060), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(noi noiVar, b9j b9jVar, fze fzeVar, int i, h21 h21Var) {
        a3h a3hVar;
        int i2;
        long j;
        esf esfVar;
        i75 i75Var;
        try {
            if (h21Var instanceof a3h) {
                a3hVar = (a3h) h21Var;
                int i3 = a3hVar.w;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    a3hVar.w = i3 - Integer.MIN_VALUE;
                    Object obj = a3hVar.v;
                    lu3 lu3Var = lu3.a;
                    i2 = a3hVar.w;
                    int i4 = 2;
                    if (i2 != 0) {
                        y6a.M(obj);
                        mze mzeVar = (mze) CollectionsKt.Y(fzeVar.a);
                        j = mzeVar.a;
                        b9jVar.a(mzeVar.c, i > 2 ? k03.i : k03.h);
                        esfVar = new esf();
                        esfVar.a = 9205357640488583168L;
                        long b = noiVar.e().b();
                        b3h b3hVar = new b3h(j, esfVar, null);
                        a3hVar.r = noiVar;
                        a3hVar.s = b9jVar;
                        a3hVar.t = esfVar;
                        a3hVar.u = j;
                        a3hVar.w = 1;
                        obj = noiVar.g(b, b3hVar, a3hVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b9jVar = a3hVar.s;
                            noiVar = a3hVar.r;
                            y6a.M(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List list = noiVar.f.s.a;
                                int size = list.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    mze mzeVar2 = (mze) list.get(i5);
                                    if (qea.m(mzeVar2)) {
                                        mzeVar2.a();
                                    }
                                }
                                b9jVar.onStop();
                            } else {
                                b9jVar.onCancel();
                            }
                            return Unit.a;
                        }
                        long j2 = a3hVar.u;
                        esfVar = a3hVar.t;
                        b9j b9jVar2 = a3hVar.s;
                        noi noiVar2 = a3hVar.r;
                        try {
                            y6a.M(obj);
                            j = j2;
                            b9jVar = b9jVar2;
                            noiVar = noiVar2;
                        } catch (CancellationException e) {
                            e = e;
                            b9jVar = b9jVar2;
                            b9jVar.onCancel();
                            throw e;
                        }
                    }
                    i75Var = (i75) obj;
                    if (i75Var == null) {
                        i75Var = i75.c;
                    }
                    if (i75Var != i75.d) {
                        b9jVar.onCancel();
                        return Unit.a;
                    }
                    if (i75Var == i75.a) {
                        b9jVar.onStop();
                        return Unit.a;
                    }
                    if (i75Var == i75.b) {
                        b9jVar.d(esfVar.a);
                    }
                    bkb bkbVar = new bkb(b9jVar, i4);
                    a3hVar.r = noiVar;
                    a3hVar.s = b9jVar;
                    a3hVar.t = null;
                    a3hVar.w = 2;
                    obj = e95.f(noiVar, j, bkbVar, a3hVar);
                }
            }
            if (i2 != 0) {
            }
            i75Var = (i75) obj;
            if (i75Var == null) {
            }
            if (i75Var != i75.d) {
            }
        } catch (CancellationException e2) {
            e = e2;
        }
        a3hVar = new a3h(h21Var);
        Object obj2 = a3hVar.v;
        lu3 lu3Var2 = lu3.a;
        i2 = a3hVar.w;
        int i42 = 2;
    }

    public static void V(vg0 vg0Var, vg0 vg0Var2, ArrayList arrayList) {
        w8g u8gVar;
        while (!vg0Var.isEmpty() && vg0Var2.size() >= 2) {
            ezj ezjVar = (ezj) vg0Var.removeFirst();
            azj azjVar = (azj) vg0Var2.removeFirst();
            azj azjVar2 = (azj) vg0Var2.removeFirst();
            dzj dzjVar = ezjVar.b;
            yyj yyjVar = ezjVar.a;
            int ordinal = dzjVar.ordinal();
            if (ordinal == 0) {
                u8gVar = new u8g(yyjVar, azjVar, azjVar2);
            } else {
                if (ordinal != 1) {
                    zzl.b();
                    return;
                }
                u8gVar = new t8g(yyjVar, azjVar, azjVar2);
            }
            arrayList.add(u8gVar);
        }
    }

    public static final Object W(g6b g6bVar, e6b e6bVar, Function2 function2, hoi hoiVar) {
        hs4 hs4Var = z45.a;
        return xw3.R(rob.a.f, new jce(g6bVar, e6bVar, function2, null, 0), hoiVar);
    }

    public static void X(Object obj, Object obj2) {
        if (obj == null) {
            yhk.s("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            String obj3 = obj.toString();
            yhk.s(wt3.m("null value in entry: ", obj3, new StringBuilder(obj3.length() + 26), "=null"));
        }
    }

    public static boolean Y(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = bvn.a;
            }
        } else {
            if (!(collection instanceof zzck)) {
                return false;
            }
            obj = ((zzck) collection).d;
        }
        return comparator.equals(obj);
    }

    public static void Z(int i, String str) {
        if (i >= 0) {
            return;
        }
        a70.p(bf3.h(i, str, " cannot be negative but was: ", new StringBuilder(str.length() + 29 + String.valueOf(i).length())));
    }

    public static final void a(vy8 vy8Var, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1060451148);
        int i2 = 4;
        if ((((av8Var.g(vy8Var) ? 4 : 2) | i | 16 | (av8Var.g(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128)) & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            vra vraVar = vra.b;
            ho hoVar = new ho(0, 1);
            ArrayList arrayList = new ArrayList();
            function1.invoke(new zra(arrayList));
            tc3 tc3Var = new tc3(1748368075, new sz(5, arrayList, hoVar), true);
            av8Var.e0(578571862);
            av8Var.e0(-548224868);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            if (av8Var.S) {
                av8Var.l(vraVar);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, vy8Var, ff3.B);
            waa.K(av8Var, new eo(0), ff3.C);
            tc3Var.invoke(av8Var, 0);
            av8Var.s(true);
            av8Var.s(false);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sz(vy8Var, function1, i, i2);
        }
    }

    public static final void b(long j, ho hoVar, tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2015416678);
        if ((((av8Var.f(j) ? 4 : 2) | i | (av8Var.g(hoVar) ? 32 : 16)) & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.a0(1110757559, Long.valueOf(j));
            wra wraVar = wra.b;
            av8Var.e0(578571862);
            av8Var.e0(-548224868);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            if (av8Var.S) {
                av8Var.l(wraVar);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, Long.valueOf(j), ff3.D);
            waa.K(av8Var, hoVar, ff3.E);
            tc3Var.invoke(av8Var, 6);
            av8Var.s(true);
            av8Var.s(false);
            av8Var.s(false);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sjh(j, hoVar, tc3Var, i);
        }
    }

    public static final void c(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1737713605);
        int i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            un0.a(l98.d0(bkh.d(xtcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(12.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, o02.d, av8Var, 196608, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i, 20);
        }
    }

    public static final void d(oll ollVar, vy8 vy8Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1461654301);
        int i2 = (av8Var.i(ollVar) ? 4 : 2) | i | (av8Var.g(vy8Var) ? 32 : 16);
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            lz.c(nq8.A(vy8Var), ho.e, yqo.H(1812776955, av8Var, new nll(ollVar, i3)), av8Var, 384, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(ollVar, vy8Var, i, 23);
        }
    }

    public static final void e(int i, int i2, of3 of3Var, xtc xtcVar, String str, String str2) {
        av8 av8Var;
        str.getClass();
        str2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1701231294);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.e(i) ? 32 : 16) | (av8Var2.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var2, 6);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var2, i3 & 14, 24960, 110586);
            av8Var = av8Var2;
            ufa.g(i, (i3 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, av8Var, null, str2);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(str, xtcVar, str2, i, i2, 28);
        }
    }

    public static final void f(gta gtaVar, qbf qbfVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        int i3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(655585865);
        if ((i & 6) == 0) {
            i2 = (av8Var2.e(gtaVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(qbfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) av8Var2.k(nz.b);
            String str = qbfVar.b;
            Integer intOrNull = StringsKt.toIntOrNull(str);
            int i4 = (intOrNull != null && intOrNull.intValue() == 1) ? 48 : 40;
            Integer intOrNull2 = StringsKt.toIntOrNull(str);
            int i5 = (intOrNull2 != null && intOrNull2.intValue() == 1) ? 3 : 2;
            Integer intOrNull3 = StringsKt.toIntOrNull(str);
            float f = (intOrNull3 != null && intOrNull3.intValue() == 1) ? 78 : (intOrNull3 != null && intOrNull3.intValue() == 2) ? 46 : 38;
            gta gtaVar2 = gta.b;
            String str2 = gtaVar == gtaVar2 ? qbfVar.g : qbfVar.h;
            xtc d = bkh.d(xtcVar, 1.0f);
            k1c c = e12.c(uxf.c, false);
            int i6 = i4;
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d);
            if3.k7.getClass();
            String str3 = str2;
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, c, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            mv1 mv1Var = uxf.d;
            n12 n12Var = n12.a;
            xtc A = wnn.A(l98.f0(n12Var.a(d2, mv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i6 / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), o7g.a(8.0f));
            long D = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = mce.h;
                av8Var2.n0(O2);
            }
            xtc f0 = l98.f0(yso.o(n9e.q(tol.y(A, true, true, true, D, wzcVar, new z9f((boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), context, gtaVar, qbfVar, 0), av8Var2, 0), lz.D(R.color.surface_2, av8Var2), o7g.a(8.0f)), 1.0f, lz.D(R.color.n_lv_4, av8Var2), o7g.a(8.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            String str4 = qbfVar.d;
            yf8 yf8Var = xth.a;
            udj.c(str4, l98.f0(bkh.r(bkh.g(l98.f0(utcVar, 4.0f, f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 36.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), uxf.n, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, i5, 0, null, xth.m(), av8Var2, 0, 384, 109560);
            av8 av8Var3 = av8Var2;
            if (gtaVar == gtaVar2) {
                av8Var3.d0(1207293682);
                udj.c(qbfVar.h, null, lz.D(R.color.primary_default, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.m(), av8Var3, 0, 0, 130042);
                av8Var3 = av8Var3;
                i3 = 0;
                av8Var3.s(false);
            } else {
                i3 = 0;
                av8Var3.d0(1207525717);
                av8Var3.s(false);
            }
            int i7 = i3;
            av8 av8Var4 = av8Var3;
            udj.c(dmi.q("\u200e", str3), null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.m(), av8Var4, 0, 0, 130042);
            av8Var4.s(true);
            udj.c(qbfVar.b, rd0.N(n12Var.a(utcVar, uxf.e), -4.0f, !Intrinsics.c(str, "1") ? -4.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), lz.D(R.color.n_lv_1, av8Var4), null, v8a.v(20), null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var4, 24576, 0, 131048);
            String str5 = qbfVar.c;
            long D2 = lz.D(R.color.n_lv_4, av8Var4);
            Object O3 = av8Var4.O();
            if (O3 == a99Var) {
                O3 = mz1.e(av8Var4);
            }
            wzc wzcVar2 = (wzc) O3;
            Object[] objArr2 = new Object[i7];
            Object O4 = av8Var4.O();
            if (O4 == a99Var) {
                O4 = mce.i;
                av8Var4.n0(O4);
            }
            av8Var = av8Var4;
            td4.L(i7, av8Var, bkh.l(n12Var.a(tol.y(utcVar, true, false, true, D2, wzcVar2, new z9f((boh) o3a.N(objArr2, (Function0) O4, av8Var4, 48), context, gtaVar, qbfVar, 1), av8Var4, 0), mv1Var), i6), str5);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(gtaVar, qbfVar, xtcVar, i, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final void g(gta gtaVar, gv9 gv9Var, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        ?? r7;
        boolean z;
        gtaVar.getClass();
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2044689930);
        int i2 = i | (av8Var.e(gtaVar.ordinal()) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            long D = lz.D(R.color.surface_1, av8Var);
            jf9 jf9Var = oyn.e;
            utc utcVar = utc.a;
            xtc d = bkh.d(l98.b0(n9e.q(utcVar, D, jf9Var), 16.0f), 1.0f);
            k1c c = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.n;
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            xtc q = bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 320.0f, 1);
            l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, q);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            qbf qbfVar = (qbf) CollectionsKt.a0(1, gv9Var);
            p8g p8gVar = p8g.a;
            if (qbfVar == null) {
                av8Var.d0(-1477558856);
                r7 = 0;
                av8Var.s(false);
            } else {
                r7 = 0;
                av8Var.d0(-1477558855);
                f(gtaVar, qbfVar, p8gVar.a(0.3f, utcVar, true), av8Var, i2 & 14);
                av8Var.s(false);
            }
            qbf qbfVar2 = (qbf) CollectionsKt.a0(r7, gv9Var);
            if (qbfVar2 == null) {
                av8Var.d0(-1477291016);
                av8Var.s(r7);
            } else {
                av8Var.d0(-1477291015);
                f(gtaVar, qbfVar2, p8gVar.a(0.4f, utcVar, true), av8Var, i2 & 14);
                av8Var.s(r7);
            }
            qbf qbfVar3 = (qbf) CollectionsKt.a0(2, gv9Var);
            if (qbfVar3 == null) {
                av8Var.d0(-1477023176);
                av8Var.s(r7);
                z = true;
            } else {
                av8Var.d0(-1477023175);
                z = true;
                f(gtaVar, qbfVar3, p8gVar.a(0.3f, utcVar, true), av8Var, i2 & 14);
                av8Var.s(r7);
            }
            av8Var.s(z);
            av8Var.s(z);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(gtaVar, gv9Var, xtcVar2, i, 14);
        }
    }

    public static final rhi h(yea yeaVar, String str) {
        yeaVar.getClass();
        str.getClass();
        return new rhi(str, yeaVar.a);
    }

    public static final void i(lwi lwiVar, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function0 function03, of3 of3Var, int i) {
        int i2;
        Function1 function13;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(139013382);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(lwiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function1) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.i(function03) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i3 = 1572864 & i;
        utc utcVar = utc.a;
        if (i3 == 0) {
            i2 |= av8Var.g(utcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (av8Var.T(i2 & 1, (599187 & i2) != 599186)) {
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc A = wnn.A(n9e.q(bkh.d(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), o7g.a(16.0f));
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, A);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i4 = i2 & 14;
            hda.h(lwiVar, function0, function02, function03, l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), av8Var, i4 | 24576 | (i2 & 112) | (i2 & 896) | ((i2 >> 6) & 7168));
            bea.g(lwiVar.c, l98.b0(bkh.d(utcVar, 1.0f), 8.0f), av8Var, 48);
            xtc x = gz8.x(utcVar, null, null, 3);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new rfi(25);
                av8Var.n0(O);
            }
            Function1 function14 = (Function1) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new rfi(26);
                av8Var.n0(O2);
            }
            function13 = function1;
            l98.b(lwiVar, x, function14, null, "calendar_grid_slide", (Function1) O2, yqo.H(1959557890, av8Var, new qb7(function13, function12, 2)), av8Var, i4 | 1794432, 8);
            av8Var = av8Var;
            nq8.j(6, av8Var, l98.f0(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
            av8Var.s(true);
            av8Var.s(true);
        } else {
            function13 = function1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(lwiVar, function0, function02, function13, function12, function03, i);
        }
    }

    public static final void j(xwi xwiVar, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        Object fl8Var;
        xwi xwiVar2;
        xwiVar.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(325582951);
        int i2 = i | (av8Var2.i(xwiVar) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | 384;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) av8Var2.k(nz.b);
            lwi lwiVar = (lwi) rfo.x(xwiVar.p, av8Var2, 0).getValue();
            if (lwiVar == null) {
                av8Var2.d0(1405847200);
                av8Var2.s(false);
                av8Var = av8Var2;
            } else {
                av8Var2.d0(1405847201);
                boolean i3 = av8Var2.i(xwiVar);
                Object O = av8Var2.O();
                a99 a99Var = nf3.a;
                if (i3 || O == a99Var) {
                    fl8 fl8Var2 = new fl8(0, xwiVar, xwi.class, "navigateCalendarPrevious", "navigateCalendarPrevious()V", 0, 27);
                    av8Var2.n0(fl8Var2);
                    O = fl8Var2;
                }
                KFunction kFunction = (KFunction) O;
                boolean i4 = av8Var2.i(xwiVar);
                Object O2 = av8Var2.O();
                if (i4 || O2 == a99Var) {
                    fl8Var = new fl8(0, xwiVar, xwi.class, "navigateCalendarNext", "navigateCalendarNext()V", 0, 28);
                    xwiVar2 = xwiVar;
                    av8Var2.n0(fl8Var);
                } else {
                    fl8Var = O2;
                    xwiVar2 = xwiVar;
                }
                Function0 function02 = (Function0) kFunction;
                Function0 function03 = (Function0) ((KFunction) fl8Var);
                boolean i5 = av8Var2.i(context);
                Object O3 = av8Var2.O();
                if (i5 || O3 == a99Var) {
                    O3 = new vt(context, 15);
                    av8Var2.n0(O3);
                }
                Function1 function1 = (Function1) O3;
                boolean i6 = av8Var2.i(context) | av8Var2.i(xwiVar2);
                Object O4 = av8Var2.O();
                if (i6 || O4 == a99Var) {
                    O4 = new dvi(3, context, xwiVar2);
                    av8Var2.n0(O4);
                }
                av8Var = av8Var2;
                i(lwiVar, function02, function03, function1, (Function1) O4, function0, av8Var, (i2 << 12) & 4128768);
                av8Var.s(false);
            }
            xtcVar2 = utc.a;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(xwiVar, function0, xtcVar2, i, 6);
        }
    }

    public static final void k(oll ollVar, vy8 vy8Var, of3 of3Var, int i, int i2) {
        int i3;
        kc kcVar = fz8.m;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(40460669);
        int i4 = (av8Var.i(ollVar) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (av8Var.g(vy8Var) ? 32 : 16);
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                vy8Var = ty8.a;
            }
            Context context = (Context) av8Var.k(bh3.b);
            vy8 N = h5a.N(gz8.E(c5n.t(nq8.y(vy8Var), new h1g(R.color.on_color_highlight_2)), 8.0f), 8.0f);
            Integer num = ollVar.a;
            if (num != null) {
                int intValue = num.intValue();
                vy8 x = j72.x(N, ollVar.d ? new x9g(LaunchPlayerSeason.class, zm2.A((lc[]) Arrays.copyOf(new lc[]{new lc(kcVar, Integer.valueOf(intValue))}, 1))) : new x9g(LaunchPlayerDetails.class, zm2.A((lc[]) Arrays.copyOf(new lc[]{new lc(kcVar, Integer.valueOf(intValue))}, 1))));
                if (x != null) {
                    N = x;
                }
            }
            rd0.b(N, 0, 1, yqo.H(-488786233, av8Var, new e6i(26, context, ollVar)), av8Var, 3072, 2);
        } else {
            av8Var.W();
        }
        vy8 vy8Var2 = vy8Var;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(i, i2, 26, ollVar, vy8Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto, BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle) {
        int backgroundColor;
        String text;
        String borderColor;
        int borderColor2;
        sgm sgmVar;
        blazeWidgetItemStatusIndicatorStateStyle.getClass();
        OverridableValueRemoteDto<String> backgroundImage = widgetItemStatusIndicatorStateStyleRemoteDto.getBackgroundImage();
        if (backgroundImage != null) {
            Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            String value = backgroundImage.getValue();
            if (value != null) {
                if (application$blazesdk_release != null) {
                    int identifier = application$blazesdk_release.getResources().getIdentifier(value, "drawable", application$blazesdk_release.getPackageName());
                    Integer valueOf = identifier == 0 ? null : Integer.valueOf(identifier);
                    if (valueOf != null) {
                        sgmVar = new sgm(Integer.valueOf(valueOf.intValue()), null);
                    }
                }
                sgmVar = new sgm(null, value);
            } else {
                sgmVar = null;
            }
            if (sgmVar != null) {
                blazeWidgetItemStatusIndicatorStateStyle.setBackgroundImageResId(sgmVar.a);
                blazeWidgetItemStatusIndicatorStateStyle.setBackgroundImageUrl$blazesdk_release(sgmVar.b);
            }
        }
        OverridableValueRemoteDto<Float> cornerRadiusRatio = widgetItemStatusIndicatorStateStyleRemoteDto.getCornerRadiusRatio();
        if (cornerRadiusRatio != null) {
            blazeWidgetItemStatusIndicatorStateStyle.setCornerRadiusRatio(cornerRadiusRatio.getValue());
        }
        WidgetItemTextStyleRemoteDto textStyle = widgetItemStatusIndicatorStateStyleRemoteDto.getTextStyle();
        BlazeWidgetItemTextStyle textStyle2 = blazeWidgetItemStatusIndicatorStateStyle.getTextStyle();
        if (textStyle != null) {
            bea.l(textStyle, textStyle2);
        }
        blazeWidgetItemStatusIndicatorStateStyle.setTextStyle(textStyle2);
        Boolean isVisible = widgetItemStatusIndicatorStateStyleRemoteDto.isVisible();
        blazeWidgetItemStatusIndicatorStateStyle.setVisible(isVisible != null ? isVisible.booleanValue() : blazeWidgetItemStatusIndicatorStateStyle.isVisible());
        String backgroundColor2 = widgetItemStatusIndicatorStateStyleRemoteDto.getBackgroundColor();
        if (backgroundColor2 != null) {
            Application application$blazesdk_release2 = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            Integer b = application$blazesdk_release2 != null ? cnb.b(application$blazesdk_release2, backgroundColor2) : null;
            if (b != null) {
                backgroundColor = b.intValue();
                blazeWidgetItemStatusIndicatorStateStyle.setBackgroundColor(backgroundColor);
                text = widgetItemStatusIndicatorStateStyleRemoteDto.getText();
                if (text == null) {
                    text = blazeWidgetItemStatusIndicatorStateStyle.getText();
                }
                blazeWidgetItemStatusIndicatorStateStyle.setText(text);
                Float cornerRadius = widgetItemStatusIndicatorStateStyleRemoteDto.getCornerRadius();
                blazeWidgetItemStatusIndicatorStateStyle.setCornerRadius(cornerRadius == null ? new BlazeDp(wzb.b(cornerRadius.floatValue())) : blazeWidgetItemStatusIndicatorStateStyle.getCornerRadius());
                borderColor = widgetItemStatusIndicatorStateStyleRemoteDto.getBorderColor();
                if (borderColor != null) {
                    Application application$blazesdk_release3 = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                    Integer b2 = application$blazesdk_release3 != null ? cnb.b(application$blazesdk_release3, borderColor) : null;
                    if (b2 != null) {
                        borderColor2 = b2.intValue();
                        blazeWidgetItemStatusIndicatorStateStyle.setBorderColor(borderColor2);
                        Integer borderWidth = widgetItemStatusIndicatorStateStyleRemoteDto.getBorderWidth();
                        blazeWidgetItemStatusIndicatorStateStyle.setBorderWidth(borderWidth != null ? new BlazeDp(borderWidth.intValue()) : blazeWidgetItemStatusIndicatorStateStyle.getBorderWidth());
                    }
                }
                borderColor2 = blazeWidgetItemStatusIndicatorStateStyle.getBorderColor();
                blazeWidgetItemStatusIndicatorStateStyle.setBorderColor(borderColor2);
                Integer borderWidth2 = widgetItemStatusIndicatorStateStyleRemoteDto.getBorderWidth();
                blazeWidgetItemStatusIndicatorStateStyle.setBorderWidth(borderWidth2 != null ? new BlazeDp(borderWidth2.intValue()) : blazeWidgetItemStatusIndicatorStateStyle.getBorderWidth());
            }
        }
        backgroundColor = blazeWidgetItemStatusIndicatorStateStyle.getBackgroundColor();
        blazeWidgetItemStatusIndicatorStateStyle.setBackgroundColor(backgroundColor);
        text = widgetItemStatusIndicatorStateStyleRemoteDto.getText();
        if (text == null) {
        }
        blazeWidgetItemStatusIndicatorStateStyle.setText(text);
        Float cornerRadius2 = widgetItemStatusIndicatorStateStyleRemoteDto.getCornerRadius();
        blazeWidgetItemStatusIndicatorStateStyle.setCornerRadius(cornerRadius2 == null ? new BlazeDp(wzb.b(cornerRadius2.floatValue())) : blazeWidgetItemStatusIndicatorStateStyle.getCornerRadius());
        borderColor = widgetItemStatusIndicatorStateStyleRemoteDto.getBorderColor();
        if (borderColor != null) {
        }
        borderColor2 = blazeWidgetItemStatusIndicatorStateStyle.getBorderColor();
        blazeWidgetItemStatusIndicatorStateStyle.setBorderColor(borderColor2);
        Integer borderWidth22 = widgetItemStatusIndicatorStateStyleRemoteDto.getBorderWidth();
        blazeWidgetItemStatusIndicatorStateStyle.setBorderWidth(borderWidth22 != null ? new BlazeDp(borderWidth22.intValue()) : blazeWidgetItemStatusIndicatorStateStyle.getBorderWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(oug ougVar, float f, d80 d80Var, ol4 ol4Var, Function1 function1, sq3 sq3Var) {
        inh inhVar;
        int i;
        float f2;
        csf csfVar;
        if (sq3Var instanceof inh) {
            inhVar = (inh) sq3Var;
            int i2 = inhVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inhVar.v = i2 - Integer.MIN_VALUE;
                Object obj = inhVar.u;
                lu3 lu3Var = lu3.a;
                i = inhVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    csf csfVar2 = new csf();
                    boolean z = ((Number) d80Var.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    hnh hnhVar = new hnh(f, csfVar2, ougVar, function1, 0);
                    inhVar.s = d80Var;
                    inhVar.t = csfVar2;
                    inhVar.r = f;
                    inhVar.v = 1;
                    if (d2a.n(d80Var, ol4Var, !z, hnhVar, inhVar) == lu3Var) {
                        return lu3Var;
                    }
                    f2 = f;
                    csfVar = csfVar2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = inhVar.r;
                    csfVar = inhVar.t;
                    d80Var = inhVar.s;
                    y6a.M(obj);
                }
                return new z70(new Float(f2 - csfVar.a), d80Var);
            }
        }
        inhVar = new inh(sq3Var);
        Object obj2 = inhVar.u;
        lu3 lu3Var2 = lu3.a;
        i = inhVar.v;
        if (i != 0) {
        }
        return new z70(new Float(f2 - csfVar.a), d80Var);
    }

    public static final void n(b80 b80Var, oug ougVar, Function1 function1, float f) {
        float f2;
        try {
            f2 = ougVar.a(f);
        } catch (CancellationException unused) {
            b80Var.a();
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        function1.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            b80Var.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(oug ougVar, float f, float f2, d80 d80Var, c80 c80Var, Function1 function1, sq3 sq3Var) {
        jnh jnhVar;
        int i;
        float floatValue;
        d80 d80Var2;
        csf csfVar;
        float f3 = f;
        if (sq3Var instanceof jnh) {
            jnhVar = (jnh) sq3Var;
            int i2 = jnhVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jnhVar.w = i2 - Integer.MIN_VALUE;
                jnh jnhVar2 = jnhVar;
                Object obj = jnhVar2.v;
                lu3 lu3Var = lu3.a;
                i = jnhVar2.w;
                if (i != 0) {
                    y6a.M(obj);
                    csf csfVar2 = new csf();
                    floatValue = ((Number) d80Var.c()).floatValue();
                    Float f4 = new Float(f3);
                    boolean z = ((Number) d80Var.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    hnh hnhVar = new hnh(f2, csfVar2, ougVar, function1, 1);
                    jnhVar2.t = d80Var;
                    jnhVar2.u = csfVar2;
                    jnhVar2.r = f3;
                    jnhVar2.s = floatValue;
                    jnhVar2.w = 1;
                    if (d2a.o(d80Var, f4, c80Var, !z, hnhVar, jnhVar2) == lu3Var) {
                        return lu3Var;
                    }
                    d80Var2 = d80Var;
                    csfVar = csfVar2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f5 = jnhVar2.s;
                    float f6 = jnhVar2.r;
                    csfVar = jnhVar2.u;
                    d80Var2 = jnhVar2.t;
                    y6a.M(obj);
                    floatValue = f5;
                    f3 = f6;
                }
                return new z70(new Float(f3 - csfVar.a), t62.B(d80Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, t(((Number) d80Var2.c()).floatValue(), floatValue), 29));
            }
        }
        jnhVar = new jnh(sq3Var);
        jnh jnhVar22 = jnhVar;
        Object obj2 = jnhVar22.v;
        lu3 lu3Var2 = lu3.a;
        i = jnhVar22.w;
        if (i != 0) {
        }
        return new z70(new Float(f3 - csfVar.a), t62.B(d80Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, t(((Number) d80Var2.c()).floatValue(), floatValue), 29));
    }

    public static final void p(k6b k6bVar, Function1 function1, Function1 function12) {
        k6bVar.a(new yp7(function12, function1, (rq3) null, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(noi noiVar, h21 h21Var) {
        x2h x2hVar;
        int i;
        int size;
        int i2;
        if (h21Var instanceof x2h) {
            x2hVar = (x2h) h21Var;
            int i3 = x2hVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x2hVar.t = i3 - Integer.MIN_VALUE;
                Object obj = x2hVar.s;
                lu3 lu3Var = lu3.a;
                i = x2hVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    gze gzeVar = gze.b;
                    x2hVar.r = noiVar;
                    x2hVar.t = 1;
                    obj = noiVar.b(gzeVar, x2hVar);
                    if (obj == lu3Var) {
                    }
                    fze fzeVar = (fze) obj;
                    List list = fzeVar.a;
                    size = list.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return fzeVar;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                noiVar = x2hVar.r;
                y6a.M(obj);
                fze fzeVar2 = (fze) obj;
                List list2 = fzeVar2.a;
                size = list2.size();
                i2 = 0;
                while (i2 < size) {
                    if (qea.k((mze) list2.get(i2))) {
                        i2++;
                    } else {
                        gze gzeVar2 = gze.b;
                        x2hVar.r = noiVar;
                        x2hVar.t = 1;
                        obj = noiVar.b(gzeVar2, x2hVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        fze fzeVar22 = (fze) obj;
                        List list22 = fzeVar22.a;
                        size = list22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return fzeVar22;
            }
        }
        x2hVar = new x2h(h21Var);
        Object obj2 = x2hVar.s;
        lu3 lu3Var2 = lu3.a;
        i = x2hVar.t;
        if (i != 0) {
        }
    }

    public static final Object r(qze qzeVar, jwc jwcVar, b9j b9jVar, rq3 rq3Var) {
        ooi ooiVar = (ooi) qzeVar;
        ooiVar.getClass();
        Object s = oyn.s(qzeVar, new qp1(new b10(c6o.c0(ooiVar).A), jwcVar, b9jVar, (rq3) null), rq3Var);
        return s == lu3.a ? s : Unit.a;
    }

    public static ArrayList s(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final float t(float f, float f2) {
        return f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f >= f2 : f <= f2) ? f : f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, lm5] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static uag v(jag jagVar, String str) {
        Double d;
        Double valueOf;
        tag tagVar;
        Map map;
        Object obj;
        jagVar.getClass();
        rag ragVar = jagVar.b;
        Map map2 = jagVar.G;
        Integer num = jagVar.p;
        Integer num2 = jagVar.o;
        if (ragVar == rag.NATIVE_AD) {
            valueOf = Double.valueOf(-1.0d);
        } else {
            if (num2 == null || num == null || num.intValue() == 0) {
                d = null;
                jgg jggVar = jagVar.g0;
                sag sagVar = jggVar == null ? new sag(jggVar.a, jggVar.b, jggVar.c, jggVar.d, jggVar.e) : null;
                String str2 = jagVar.d;
                if (map2 == null && (obj = map2.get("rtb")) != null && (obj instanceof Map)) {
                    Map map3 = (Map) obj;
                    Object obj2 = map3.get("advertiserId");
                    String str3 = obj2 instanceof String ? (String) obj2 : null;
                    Object obj3 = map3.get("auctionId");
                    String str4 = obj3 instanceof String ? (String) obj3 : null;
                    Object obj4 = map3.get("buyerId");
                    String str5 = obj4 instanceof String ? (String) obj4 : null;
                    Object obj5 = map3.get("campaignId");
                    String str6 = obj5 instanceof String ? (String) obj5 : null;
                    Object obj6 = map3.get("creativeId");
                    String str7 = obj6 instanceof String ? (String) obj6 : null;
                    Object obj7 = map3.get("dealId");
                    String str8 = obj7 instanceof String ? (String) obj7 : null;
                    Object obj8 = map3.get("dspId");
                    String str9 = obj8 instanceof String ? (String) obj8 : null;
                    Object obj9 = map3.get("publisherId");
                    String str10 = obj9 instanceof String ? (String) obj9 : null;
                    Object obj10 = map3.get("clearedPricePublisherCurrency");
                    String str11 = obj10 instanceof String ? (String) obj10 : null;
                    Object obj11 = map3.get("publisherCurrencyCode");
                    String str12 = obj11 instanceof String ? (String) obj11 : null;
                    Object obj12 = map3.get("externalDealId");
                    tagVar = new tag(str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, obj12 instanceof String ? (String) obj12 : null);
                } else {
                    tagVar = null;
                }
                String[] strArr = {"advertiserId", "campaignId", "creativeId", "insertionId", "templateId", "rtb"};
                if (map2 == null) {
                    map = new LinkedHashMap();
                    for (Map.Entry entry : map2.entrySet()) {
                        if (!ph0.v(strArr, (String) entry.getKey())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    map = lm5.a;
                    map.getClass();
                }
                return new uag(str2, d, str, tagVar, sagVar, map);
            }
            valueOf = Double.valueOf(num2.intValue() / num.intValue());
        }
        d = valueOf;
        jgg jggVar2 = jagVar.g0;
        if (jggVar2 == null) {
        }
        String str22 = jagVar.d;
        if (map2 == null) {
        }
        tagVar = null;
        String[] strArr2 = {"advertiserId", "campaignId", "creativeId", "insertionId", "templateId", "rtb"};
        if (map2 == null) {
        }
        return new uag(str22, d, str, tagVar, sagVar, map);
    }

    public static final xtc w(xtc xtcVar) {
        xtcVar.getClass();
        return o3h.a(xtcVar, false, new clc(10));
    }

    public static void x(vg0 vg0Var, ArrayList arrayList) {
        while (vg0Var.size() >= 2) {
            arrayList.add(new v8g((azj) vg0Var.removeFirst(), (azj) vg0Var.removeFirst()));
        }
    }

    public static String y(Integer num, Integer num2, boolean z, boolean z2) {
        if ((num == null || num.intValue() == 0) && (num2 == null || num2.intValue() == 0)) {
            return null;
        }
        return rei.u(Integer.valueOf(num != null ? num.intValue() : 0), Integer.valueOf(num2 != null ? num2.intValue() : 0), z, z2);
    }

    public static float z(float f, float f2) {
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 1.0f;
        }
        float f3 = f2 / 1.0f;
        float f4 = f2 * 0.02222222f;
        if (f < f4) {
            f = f4;
        }
        return wzb.b((f / f3) * 100.0f) / 100.0f;
    }

    public abstract kda L(String str, Function1 function1);

    public abstract Object u();
}
