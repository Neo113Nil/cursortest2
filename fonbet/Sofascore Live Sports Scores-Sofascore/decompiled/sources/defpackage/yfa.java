package defpackage;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.net.Uri;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.IncidentKt;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.notifications.NotificationData;
import com.sofascore.model.notifications.NotificationOpen;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardsActivity;
import com.sofascore.results.stagesport.StageCategoryActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class yfa {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static boolean f = false;
    public static long g = 3000;
    public static long h = 30000;
    public static int i = 3;
    public static volatile boolean j = true;

    public static int A(j9e j9eVar) {
        int m = j9eVar.m();
        if (j9eVar.m() == 1684108385) {
            j9eVar.O(8);
            int i2 = m - 16;
            if (i2 == 1) {
                return j9eVar.A();
            }
            if (i2 == 2) {
                return j9eVar.H();
            }
            if (i2 == 3) {
                return j9eVar.D();
            }
            if (i2 == 4 && (j9eVar.j() & 128) == 0) {
                return j9eVar.E();
            }
        }
        tgj.d0("Failed to parse data atom to int");
        return -1;
    }

    public static yq9 B(int i2, String str, j9e j9eVar, boolean z, boolean z2) {
        int A = A(j9eVar);
        if (z2) {
            A = Math.min(1, A);
        }
        if (A >= 0) {
            return z ? new cdj(str, null, hv9.z(Integer.toString(A))) : new u33(C.LANGUAGE_UNDETERMINED, str, Integer.toString(A));
        }
        tgj.d0("Failed to parse uint8 attribute: ".concat(ffb.h(i2)));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00dc, code lost:
    
        if (r9.equals("volleyball_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x028c, code lost:
    
        r12 = 2131232119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00e6, code lost:
    
        if (r9.equals("suggestion_declined") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0102, code lost:
    
        if (r9.equals("cricket_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ee, code lost:
    
        r12 = 2131232091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x010c, code lost:
    
        if (r9.equals("ice-hockey_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0132, code lost:
    
        r12 = 2131232104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0116, code lost:
    
        if (r9.equals("tennis_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x032f, code lost:
    
        r12 = 2131232118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x012e, code lost:
    
        if (r9.equals("ice-hockey_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x013d, code lost:
    
        if (r9.equals("basketball_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0169, code lost:
    
        r12 = 2131232088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0147, code lost:
    
        if (r9.equals("floorball_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0191, code lost:
    
        r12 = 2131232099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0151, code lost:
    
        if (r9.equals("bandy_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x022f, code lost:
    
        r12 = 2131232086;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x015b, code lost:
    
        if (r9.equals("handball_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02fc, code lost:
    
        r12 = 2131232102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0165, code lost:
    
        if (r9.equals("basketball_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0174, code lost:
    
        if (r9.equals("badminton_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0183, code lost:
    
        if (r9.equals("rugby_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0222, code lost:
    
        r14 = 2131232114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x018d, code lost:
    
        if (r9.equals("floorball_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x019c, code lost:
    
        if (r9.equals("american-football_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009a, code lost:
    
        if (r9.equals("waterpolo_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x02d2, code lost:
    
        r12 = 2131232120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0205, code lost:
    
        if (r9.equals("football_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x021e, code lost:
    
        if (r9.equals("rugby_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x022b, code lost:
    
        if (r9.equals("bandy_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x023a, code lost:
    
        if (r9.equals("football_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0244, code lost:
    
        if (r9.equals("aussie-rules_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x025b, code lost:
    
        if (r9.equals("baseball_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02e0, code lost:
    
        r12 = 2131232087;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0274, code lost:
    
        if (r9.equals("aussie-rules_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x027e, code lost:
    
        if (r9.equals("snooker_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0341, code lost:
    
        r12 = 2131232115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0288, code lost:
    
        if (r9.equals("volleyball_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0297, code lost:
    
        if (r9.equals("darts_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0321, code lost:
    
        r12 = 2131232092;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02ce, code lost:
    
        if (r9.equals("waterpolo_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02dd, code lost:
    
        if (r9.equals("baseball_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02eb, code lost:
    
        if (r9.equals("cricket_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02f9, code lost:
    
        if (r9.equals("handball_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0315, code lost:
    
        if (r9.equals("futsal_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x031e, code lost:
    
        if (r9.equals("darts_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x032c, code lost:
    
        if (r9.equals("tennis_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x033a, code lost:
    
        if (r9.equals("snooker_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b4, code lost:
    
        if (r9.equals("badminton_period_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0178, code lost:
    
        r12 = 2131232085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00be, code lost:
    
        if (r9.equals("suggestion_approved") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ea, code lost:
    
        r12 = 2131232090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c8, code lost:
    
        if (r9.equals("futsal_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00d2, code lost:
    
        if (r9.equals("american-football_current_score") == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a0, code lost:
    
        r12 = 2131232084;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x008f. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NotificationData C(String str) {
        int i2;
        JSONObject optJSONObject;
        String optString;
        String str2;
        String optString2;
        int i3;
        xbb xbbVar;
        NotificationOpen notificationOpen;
        String str3;
        String optString3;
        Object obj;
        JSONObject jSONObject = new JSONObject(str);
        String optString4 = jSONObject.optString("channel");
        optString4.getClass();
        if (StringsKt.R(optString4)) {
            is8.c(jSONObject, "Channel cannot be null. This should be reported to backend. Json object: ");
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("teams");
        int optInt = jSONObject.optInt("forTeam");
        if (optInt == 0) {
            if (optJSONArray == null || optJSONArray.length() != 1) {
                i2 = 0;
                optJSONObject = jSONObject.optJSONObject("open");
                String optString5 = jSONObject.optString("title");
                optString5.getClass();
                String optString6 = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
                optString6.getClass();
                int optInt2 = jSONObject.optInt("groupKey");
                optString = jSONObject.optString("sound");
                optString.getClass();
                if (!StringsKt.R(optString)) {
                    String lowerCase = optString.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (!lowerCase.equals("null")) {
                        str2 = optString;
                        optString2 = jSONObject.optString("icon");
                        optString2.getClass();
                        int i4 = 2131232100;
                        switch (optString2.hashCode()) {
                            case -2035844970:
                                break;
                            case -2029490200:
                                break;
                            case -1897569249:
                                break;
                            case -1806938918:
                                break;
                            case -1759488676:
                                if (optString2.equals("ice_hockey_lineups")) {
                                    i4 = 2131232105;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case -1743081285:
                                break;
                            case -1551009758:
                                break;
                            case -1477463517:
                                break;
                            case -1470981146:
                                break;
                            case -1276231777:
                                if (optString2.equals("prestart")) {
                                    i4 = 2131232112;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case -1274442605:
                                if (optString2.equals("finish")) {
                                    i4 = 2131232098;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case -1249310171:
                                if (optString2.equals("weekly_challenge")) {
                                    i4 = 2131232121;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case -1131646943:
                                break;
                            case -1127587833:
                                break;
                            case -1123226998:
                                break;
                            case -1094186137:
                                break;
                            case -1081737434:
                                if (optString2.equals("fantasy")) {
                                    i4 = 2131232096;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case -993271139:
                                break;
                            case -938102371:
                                if (optString2.equals(CampaignEx.JSON_KEY_STAR)) {
                                    i4 = 2131232111;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case -926529511:
                                break;
                            case -753927642:
                                break;
                            case -526986191:
                                break;
                            case -458894728:
                                break;
                            case -53100160:
                                if (optString2.equals("halftime")) {
                                    i4 = 2131232101;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case -38495494:
                                break;
                            case 3138974:
                                if (optString2.equals("feed")) {
                                    i4 = 2131232097;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case 105510629:
                                if (optString2.equals("missed_penalty")) {
                                    i4 = 2131232109;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case 109757538:
                                if (optString2.equals("start")) {
                                    i4 = 2131232116;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case 176922820:
                                if (optString2.equals("lineups")) {
                                    i4 = 2131232106;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case 301041764:
                                if (optString2.equals("period_start")) {
                                    i4 = 2131232110;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case 357304895:
                                if (optString2.equals("highlights")) {
                                    i4 = 2131232103;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case 407655481:
                                break;
                            case 423970584:
                                break;
                            case 517590248:
                                break;
                            case 533378515:
                                break;
                            case 690790994:
                                break;
                            case 715106373:
                                break;
                            case 754335247:
                                break;
                            case 785011272:
                                break;
                            case 793618382:
                                break;
                            case 803901038:
                                break;
                            case 826147581:
                                if (optString2.equals(IncidentKt.TYPE_SUBSTITUTION)) {
                                    i4 = 2131232117;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case 982962040:
                                break;
                            case 1009553330:
                                break;
                            case 1021762686:
                                break;
                            case 1083147041:
                                if (optString2.equals("redcard")) {
                                    i4 = 2131232113;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case 1135110153:
                                break;
                            case 1262940473:
                                break;
                            case 1610842951:
                                break;
                            case 1677893318:
                                break;
                            case 1752158866:
                                break;
                            case 1758371885:
                                break;
                            case 1928339274:
                                if (optString2.equals("basketball_lineups")) {
                                    i4 = 2131232089;
                                    i3 = i4;
                                    break;
                                }
                                i4 = 2131231886;
                                i3 = i4;
                            case 1970809786:
                                break;
                            default:
                                i4 = 2131231886;
                                i3 = i4;
                                break;
                        }
                        int optInt3 = jSONObject.optInt("campaignId", -1);
                        String optString7 = jSONObject.optString("footer");
                        String optString8 = jSONObject.optString("imageUrl");
                        long optLong = jSONObject.optLong("endTimeStamp");
                        if (optJSONArray != null || optJSONArray.length() != 2) {
                            optJSONArray = null;
                        }
                        if (optJSONArray != null) {
                            xbb b2 = a.b();
                            int length = optJSONArray.length();
                            for (int i5 = 0; i5 < length; i5++) {
                                Object obj2 = optJSONArray.get(i5);
                                if (obj2 instanceof Integer) {
                                    b2.add(obj2);
                                }
                            }
                            xbbVar = a.a(b2);
                        } else {
                            xbbVar = null;
                        }
                        if (optJSONObject != null || (optString3 = optJSONObject.optString("target")) == null) {
                            notificationOpen = null;
                        } else {
                            Iterator<E> it = NotificationOpen.getEntries().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (Intrinsics.c(((NotificationOpen) obj).getValue(), optString3)) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            notificationOpen = (NotificationOpen) obj;
                        }
                        int m = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("id")) : null);
                        int m2 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("playerId")) : null);
                        int m3 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("uniqueId")) : null);
                        int m4 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("categoryId")) : null);
                        int m5 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("teamOfThePeriodId")) : null);
                        if (optJSONObject != null || (str3 = optJSONObject.optString("url")) == null || str3.length() <= 0) {
                            str3 = null;
                        }
                        String optString9 = jSONObject.optString("updateableNotificationId");
                        optString9.getClass();
                        String str4 = optString9.length() > 0 ? optString9 : null;
                        String optString10 = jSONObject.optString(CampaignEx.JSON_KEY_STAR);
                        optString10.getClass();
                        return new NotificationData(optString5, optString6, optString4, optInt2, notificationOpen, m, m2, m3, m4, m5, str3, i3, str2, xbbVar, i2, str4, optString10.length() > 0 ? optString10 : null, optInt3, optString7, optString8, optLong);
                    }
                }
                str2 = null;
                optString2 = jSONObject.optString("icon");
                optString2.getClass();
                int i42 = 2131232100;
                switch (optString2.hashCode()) {
                    case -2035844970:
                        break;
                    case -2029490200:
                        break;
                    case -1897569249:
                        break;
                    case -1806938918:
                        break;
                    case -1759488676:
                        break;
                    case -1743081285:
                        break;
                    case -1551009758:
                        break;
                    case -1477463517:
                        break;
                    case -1470981146:
                        break;
                    case -1276231777:
                        break;
                    case -1274442605:
                        break;
                    case -1249310171:
                        break;
                    case -1131646943:
                        break;
                    case -1127587833:
                        break;
                    case -1123226998:
                        break;
                    case -1094186137:
                        break;
                    case -1081737434:
                        break;
                    case -993271139:
                        break;
                    case -938102371:
                        break;
                    case -926529511:
                        break;
                    case -753927642:
                        break;
                    case -526986191:
                        break;
                    case -458894728:
                        break;
                    case -53100160:
                        break;
                    case -38495494:
                        break;
                    case 3138974:
                        break;
                    case 105510629:
                        break;
                    case 109757538:
                        break;
                    case 176922820:
                        break;
                    case 301041764:
                        break;
                    case 357304895:
                        break;
                    case 407655481:
                        break;
                    case 423970584:
                        break;
                    case 517590248:
                        break;
                    case 533378515:
                        break;
                    case 690790994:
                        break;
                    case 715106373:
                        break;
                    case 754335247:
                        break;
                    case 785011272:
                        break;
                    case 793618382:
                        break;
                    case 803901038:
                        break;
                    case 826147581:
                        break;
                    case 982962040:
                        break;
                    case 1009553330:
                        break;
                    case 1021762686:
                        break;
                    case 1083147041:
                        break;
                    case 1135110153:
                        break;
                    case 1262940473:
                        break;
                    case 1610842951:
                        break;
                    case 1677893318:
                        break;
                    case 1752158866:
                        break;
                    case 1758371885:
                        break;
                    case 1928339274:
                        break;
                    case 1970809786:
                        break;
                }
                int optInt32 = jSONObject.optInt("campaignId", -1);
                String optString72 = jSONObject.optString("footer");
                String optString82 = jSONObject.optString("imageUrl");
                long optLong2 = jSONObject.optLong("endTimeStamp");
                if (optJSONArray != null) {
                }
                optJSONArray = null;
                if (optJSONArray != null) {
                }
                if (optJSONObject != null) {
                }
                notificationOpen = null;
                int m6 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("id")) : null);
                int m22 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("playerId")) : null);
                int m32 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("uniqueId")) : null);
                int m42 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("categoryId")) : null);
                int m52 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("teamOfThePeriodId")) : null);
                if (optJSONObject != null) {
                }
                str3 = null;
                String optString92 = jSONObject.optString("updateableNotificationId");
                optString92.getClass();
                if (optString92.length() > 0) {
                }
                String optString102 = jSONObject.optString(CampaignEx.JSON_KEY_STAR);
                optString102.getClass();
                return new NotificationData(optString5, optString6, optString4, optInt2, notificationOpen, m6, m22, m32, m42, m52, str3, i3, str2, xbbVar, i2, str4, optString102.length() > 0 ? optString102 : null, optInt32, optString72, optString82, optLong2);
            }
            optInt = optJSONArray.optInt(0);
        }
        i2 = optInt;
        optJSONObject = jSONObject.optJSONObject("open");
        String optString52 = jSONObject.optString("title");
        optString52.getClass();
        String optString62 = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
        optString62.getClass();
        int optInt22 = jSONObject.optInt("groupKey");
        optString = jSONObject.optString("sound");
        optString.getClass();
        if (!StringsKt.R(optString)) {
        }
        str2 = null;
        optString2 = jSONObject.optString("icon");
        optString2.getClass();
        int i422 = 2131232100;
        switch (optString2.hashCode()) {
            case -2035844970:
                break;
            case -2029490200:
                break;
            case -1897569249:
                break;
            case -1806938918:
                break;
            case -1759488676:
                break;
            case -1743081285:
                break;
            case -1551009758:
                break;
            case -1477463517:
                break;
            case -1470981146:
                break;
            case -1276231777:
                break;
            case -1274442605:
                break;
            case -1249310171:
                break;
            case -1131646943:
                break;
            case -1127587833:
                break;
            case -1123226998:
                break;
            case -1094186137:
                break;
            case -1081737434:
                break;
            case -993271139:
                break;
            case -938102371:
                break;
            case -926529511:
                break;
            case -753927642:
                break;
            case -526986191:
                break;
            case -458894728:
                break;
            case -53100160:
                break;
            case -38495494:
                break;
            case 3138974:
                break;
            case 105510629:
                break;
            case 109757538:
                break;
            case 176922820:
                break;
            case 301041764:
                break;
            case 357304895:
                break;
            case 407655481:
                break;
            case 423970584:
                break;
            case 517590248:
                break;
            case 533378515:
                break;
            case 690790994:
                break;
            case 715106373:
                break;
            case 754335247:
                break;
            case 785011272:
                break;
            case 793618382:
                break;
            case 803901038:
                break;
            case 826147581:
                break;
            case 982962040:
                break;
            case 1009553330:
                break;
            case 1021762686:
                break;
            case 1083147041:
                break;
            case 1135110153:
                break;
            case 1262940473:
                break;
            case 1610842951:
                break;
            case 1677893318:
                break;
            case 1752158866:
                break;
            case 1758371885:
                break;
            case 1928339274:
                break;
            case 1970809786:
                break;
        }
        int optInt322 = jSONObject.optInt("campaignId", -1);
        String optString722 = jSONObject.optString("footer");
        String optString822 = jSONObject.optString("imageUrl");
        long optLong22 = jSONObject.optLong("endTimeStamp");
        if (optJSONArray != null) {
        }
        optJSONArray = null;
        if (optJSONArray != null) {
        }
        if (optJSONObject != null) {
        }
        notificationOpen = null;
        int m62 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("id")) : null);
        int m222 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("playerId")) : null);
        int m322 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("uniqueId")) : null);
        int m422 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("categoryId")) : null);
        int m522 = yid.m(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("teamOfThePeriodId")) : null);
        if (optJSONObject != null) {
        }
        str3 = null;
        String optString922 = jSONObject.optString("updateableNotificationId");
        optString922.getClass();
        if (optString922.length() > 0) {
        }
        String optString1022 = jSONObject.optString(CampaignEx.JSON_KEY_STAR);
        optString1022.getClass();
        return new NotificationData(optString52, optString62, optString4, optInt22, notificationOpen, m62, m222, m322, m422, m522, str3, i3, str2, xbbVar, i2, str4, optString1022.length() > 0 ? optString1022 : null, optInt322, optString722, optString822, optLong22);
    }

    public static cdj D(int i2, j9e j9eVar, String str) {
        int m = j9eVar.m();
        if (j9eVar.m() == 1684108385) {
            j9eVar.O(8);
            return new cdj(str, null, hv9.z(j9eVar.w(m - 16)));
        }
        tgj.d0("Failed to parse text attribute: ".concat(ffb.h(i2)));
        return null;
    }

    public static TimeInterpolator E(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            a70.p("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!s(valueOf, "cubic-bezier") && !s(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (s(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            if (split.length == 4) {
                return new PathInterpolator(p(0, split), p(1, split), p(2, split), p(3, split));
            }
            hg6.d(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!s(valueOf, "path")) {
            a70.p("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String h2 = wv8.h(1, 5, valueOf);
        Path path = new Path();
        try {
            jca.O(jca.A(h2), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            vp2.e("Error in parsing ".concat(h2), e2);
            return null;
        }
    }

    public static e0i F(Context context) {
        TypedValue K = x2a.K(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = pjf.F;
        TypedArray obtainStyledAttributes = K == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(K.resourceId, iArr);
        e0i e0iVar = new e0i();
        try {
            float f2 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f3 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f3 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            e0iVar.b(f2);
            e0iVar.a(f3);
            return e0iVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static final b50 G(i50 i50Var, int i2) {
        Object obj;
        Iterator<T> it = i50Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((wma) ((Map.Entry) obj).getKey()).b == i2) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (b50) entry.getValue();
        }
        return null;
    }

    public static void H(int i2, ric ricVar, qm8 qm8Var, ric ricVar2, ric... ricVarArr) {
        if (ricVar2 == null) {
            ricVar2 = new ric(new lic[0]);
        }
        if (ricVar != null) {
            zu9 s = hv9.s();
            for (lic licVar : ricVar.a) {
                if (e1c.class.isAssignableFrom(licVar.getClass())) {
                    s.c((lic) e1c.class.cast(licVar));
                }
            }
            av9 listIterator = s.g().listIterator(0);
            while (listIterator.hasNext()) {
                e1c e1cVar = (e1c) listIterator.next();
                if (!e1cVar.a.equals("com.android.capture.fps") || i2 == 2) {
                    ricVar2 = ricVar2.a(e1cVar);
                }
            }
        }
        for (ric ricVar3 : ricVarArr) {
            ricVar2 = ricVar2.b(ricVar3);
        }
        if (ricVar2.a.length > 0) {
            qm8Var.k = ricVar2;
        }
    }

    public static void I(Context context, baf bafVar) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) ProfileTopLeaderboardsActivity.class);
        intent.putExtra("INITIAL_TAB", bafVar);
        context.startActivity(intent);
    }

    public static void J(Context context, UniqueStage uniqueStage) {
        context.getClass();
        joa joaVar = l5i.a;
        if (!l5i.g(uniqueStage)) {
            context.startActivity(o(uniqueStage.getId(), context));
            return;
        }
        boolean z = MainActivity.n0;
        int id = uniqueStage.getId();
        Intent s = f8h.s(context, null);
        s.putExtra("open_action", "open_main");
        s.putExtra("sport_name", Sports.CYCLING);
        s.putExtra("unique_stage_id", id);
        s.putExtra("preselected_tab", jqb.k);
        context.startActivity(s);
    }

    public static void K(Activity activity) {
        View z;
        int hashCode = activity.hashCode();
        HashMap hashMap = wtk.d;
        HashMap hashMap2 = null;
        if (!cw3.a.contains(wtk.class)) {
            try {
                hashMap2 = wtk.d;
            } catch (Throwable th) {
                cw3.a(wtk.class, th);
            }
        }
        Integer valueOf = Integer.valueOf(hashCode);
        Object obj = hashMap2.get(valueOf);
        if (obj == null) {
            obj = new wtk(activity);
            hashMap2.put(valueOf, obj);
        }
        wtk wtkVar = (wtk) obj;
        Set set = cw3.a;
        if (set.contains(wtk.class)) {
            return;
        }
        try {
            if (set.contains(wtkVar)) {
                return;
            }
            try {
                if (!wtkVar.c.getAndSet(true) && (z = pd0.z((Activity) wtkVar.a.get())) != null) {
                    ViewTreeObserver viewTreeObserver = z.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(wtkVar);
                        wtkVar.a();
                    }
                }
            } catch (Throwable th2) {
                cw3.a(wtkVar, th2);
            }
        } catch (Throwable th3) {
            cw3.a(wtk.class, th3);
        }
    }

    public static void L(Activity activity) {
        View z;
        int hashCode = activity.hashCode();
        HashMap hashMap = wtk.d;
        HashMap hashMap2 = null;
        if (!cw3.a.contains(wtk.class)) {
            try {
                hashMap2 = wtk.d;
            } catch (Throwable th) {
                cw3.a(wtk.class, th);
            }
        }
        wtk wtkVar = (wtk) hashMap2.remove(Integer.valueOf(hashCode));
        if (wtkVar != null) {
            Set set = cw3.a;
            if (set.contains(wtk.class)) {
                return;
            }
            try {
                if (!set.contains(wtkVar)) {
                    try {
                        if (wtkVar.c.getAndSet(false) && (z = pd0.z((Activity) wtkVar.a.get())) != null) {
                            ViewTreeObserver viewTreeObserver = z.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(wtkVar);
                            }
                        }
                    } catch (Throwable th2) {
                        cw3.a(wtkVar, th2);
                    }
                }
            } catch (Throwable th3) {
                cw3.a(wtk.class, th3);
            }
        }
    }

    public static final Object M(g6b g6bVar, e6b e6bVar, boolean z, r69 r69Var, Function0 function0, hoi hoiVar) {
        lj2 lj2Var = new lj2(1, z9a.b(hoiVar));
        lj2Var.t();
        yo8 yo8Var = new yo8(e6bVar, g6bVar, lj2Var, function0);
        if (z) {
            r69Var.i(g.a, new vlo(24, g6bVar, yo8Var));
        } else {
            g6bVar.a(yo8Var);
        }
        lj2Var.v(new tx5(4, r69Var, g6bVar, yo8Var));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public static final byte[] N(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        Charset charset2 = Charsets.UTF_8;
        if (!charset.equals(charset2)) {
            return gz8.F(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        q4 q4Var = u4.Companion;
        int length2 = str.length();
        q4Var.getClass();
        q4.a(0, length, length2);
        CharsetEncoder newEncoder = charset2.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            array.getClass();
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                array2.getClass();
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    public static final String O(Map map) {
        map.getClass();
        try {
            return new JSONObject(map).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final String P(int i2) {
        if (i2 == 0) {
            return "android.widget.Button";
        }
        if (i2 == 1) {
            return "android.widget.CheckBox";
        }
        if (i2 == 3) {
            return "android.widget.RadioButton";
        }
        if (i2 == 5) {
            return "android.widget.ImageView";
        }
        if (i2 == 6) {
            return "android.widget.Spinner";
        }
        if (i2 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final void Q(fze fzeVar, long j2, Function1 function1, boolean z) {
        MotionEvent a2 = fzeVar.a();
        if (a2 == null) {
            a70.p("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = a2.getAction();
        if (z) {
            a2.setAction(3);
        }
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        a2.offsetLocation(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
        function1.invoke(a2);
        a2.offsetLocation(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        a2.setAction(action);
    }

    public static int R(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (e6p.a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i5);
                int abs2 = abs - (Math.abs(i3) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (abs2 <= 0) {
                    return i4;
                }
                break;
            default:
                ogj.b();
                return 0;
        }
        return i4 + i6;
    }

    public static final wfa a(Number number, String str) {
        return new wfa(x(number, str), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }

    public static final wfa b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        String str = "Value of type '" + serialDescriptor.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getKind() + '\'';
        serialDescriptor.h();
        return new wfa(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void c(final lzd lzdVar, of3 of3Var, int i2) {
        av8 av8Var;
        int i3;
        boolean z;
        d7e d7eVar;
        a99 a99Var;
        f50 f50Var;
        ry ryVar;
        f50 f50Var2;
        ff3 ff3Var;
        lzd lzdVar2 = lzdVar;
        lzdVar2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(801428943);
        int i4 = i2 | (av8Var2.g(lzdVar2) ? 4 : 2);
        if (av8Var2.T(i4 & 1, (i4 & 3) != 2)) {
            gv9 gv9Var = lzdVar2.a;
            boolean z2 = lzdVar2.b;
            if (gv9Var.isEmpty()) {
                av8Var = av8Var2;
                i3 = 3;
                av8Var.d0(-350997197);
                av8Var.s(false);
            } else {
                av8Var2.d0(-353369906);
                utc utcVar = utc.a;
                xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
                int hashCode = Long.hashCode(av8Var2.T);
                aee m = av8Var2.m();
                xtc C = fqj.C(av8Var2, d0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                f50 f50Var3 = hf3.g;
                waa.K(av8Var2, a2, f50Var3);
                ff3 ff3Var2 = hf3.f;
                waa.K(av8Var2, m, ff3Var2);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var4 = hf3.j;
                waa.K(av8Var2, valueOf, f50Var4);
                ry ryVar2 = hf3.k;
                waa.J(av8Var2, ryVar2);
                f50 f50Var5 = hf3.d;
                waa.K(av8Var2, C, f50Var5);
                final kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
                Context context = (Context) av8Var2.k(nz.b);
                final long D = lz.D(R.color.terrain_football, av8Var2);
                d7e t = haa.t(R.drawable.ic_football_full_lines, 0, av8Var2);
                boolean z3 = av8Var2.k(dh3.n) == ema.b;
                boolean h2 = av8Var2.h(z2) | av8Var2.h(z3);
                boolean z4 = z3;
                Object O = av8Var2.O();
                a99 a99Var2 = nf3.a;
                if (h2 || O == a99Var2) {
                    O = Boolean.valueOf((!Boolean.valueOf(z2).equals(Boolean.TRUE)) ^ z4);
                    av8Var2.n0(O);
                }
                final boolean booleanValue = ((Boolean) O).booleanValue();
                boolean g2 = av8Var2.g(context);
                Object O2 = av8Var2.O();
                if (g2 || O2 == a99Var2) {
                    kx4Var.getClass();
                    float H0 = kx4Var.H0(4.5f);
                    float H02 = kx4Var.H0(4.0f);
                    float H03 = kx4Var.H0(4.5f);
                    float H04 = kx4Var.H0(4.0f);
                    b20 a3 = e20.a();
                    a3.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    float f2 = H04 / 2.0f;
                    float f3 = -H03;
                    z = z2;
                    a3.f(f3, -f2);
                    a3.f(f3, f2);
                    a3.d();
                    ob obVar = new ob(H0, H02, a3, kx4Var.H0(1.5f), f5p.r(new float[]{kx4Var.H0(3.0f), kx4Var.H0(3.0f)}, kx4Var.H0(1.0f)));
                    tb tbVar = new tb(R.color.surface_1, kx4Var.H0(5.0f), kx4Var.H0(1.0f));
                    float H05 = kx4Var.H0(5.0f);
                    float H06 = kx4Var.H0(1.0f);
                    float H07 = kx4Var.H0(5.0f);
                    b20 a4 = e20.a();
                    d7eVar = t;
                    a99Var = a99Var2;
                    float sqrt = (H07 * ((float) Math.sqrt(2.0d))) / 2.0f;
                    float f4 = -sqrt;
                    a4.g(f4, f4);
                    a4.f(sqrt, sqrt);
                    a4.g(f4, sqrt);
                    a4.f(sqrt, f4);
                    O2 = new wb(context, 0L, obVar, tbVar, new qb(H05, H06, a4), 2);
                    av8Var2.n0(O2);
                } else {
                    d7eVar = t;
                    a99Var = a99Var2;
                    z = z2;
                }
                final wb wbVar = (wb) O2;
                xtc p = qx9.p(bkh.d(utcVar, 1.0f), 1.6f);
                final d7e d7eVar2 = d7eVar;
                boolean g3 = av8Var2.g(kx4Var) | av8Var2.h(booleanValue) | av8Var2.f(D) | av8Var2.i(d7eVar2) | av8Var2.i(wbVar) | ((i4 & 14) == 4);
                Object O3 = av8Var2.O();
                if (g3 || O3 == a99Var) {
                    f50Var = f50Var5;
                    ryVar = ryVar2;
                    f50Var2 = f50Var4;
                    ff3Var = ff3Var2;
                    Function1 function1 = new Function1() { // from class: jzd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            final long j2 = D;
                            final d7e d7eVar3 = d7eVar2;
                            final wb wbVar2 = wbVar;
                            final lzd lzdVar3 = lzdVar;
                            final ha5 ha5Var = (ha5) obj;
                            ha5Var.getClass();
                            float H08 = kx4.this.H0(12.0f);
                            ((hpo) ha5Var.L0().a).y(H08, H08, H08, H08);
                            try {
                                Function1 function12 = new Function1() { // from class: kzd
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Iterator it;
                                        sx2 L0;
                                        long D2;
                                        c20 c20Var;
                                        kzd kzdVar = this;
                                        ha5 ha5Var2 = (ha5) obj2;
                                        ha5Var2.getClass();
                                        ha5.o0(ha5Var2, j2, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                                        d7e.h(d7eVar3, ha5Var2, ha5Var2.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 6);
                                        gv9 gv9Var2 = lzdVar3.a;
                                        wb wbVar3 = wbVar2;
                                        wbVar3.getClass();
                                        gv9Var2.getClass();
                                        Iterator it2 = gv9Var2.iterator();
                                        while (it2.hasNext()) {
                                            vb vbVar = (vb) it2.next();
                                            boolean z5 = vbVar instanceof pb;
                                            ha5 ha5Var3 = ha5Var;
                                            if (z5) {
                                                pb pbVar = (pb) vbVar;
                                                ob obVar2 = wbVar3.c;
                                                if (obVar2 != null) {
                                                    long b2 = wbVar3.b(pbVar.d);
                                                    long c2 = wbVar3.c(ha5Var3, pbVar.a);
                                                    long c3 = wbVar3.c(ha5Var3, pbVar.b);
                                                    long h3 = dnd.h(c3, c2);
                                                    float d2 = dnd.d(h3);
                                                    if (d2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                        long b3 = dnd.b(h3, d2);
                                                        it = it2;
                                                        long h4 = dnd.h(c3, dnd.j(b3, obVar2.a));
                                                        float f5 = obVar2.b;
                                                        if (d2 > f5) {
                                                            d2 = f5;
                                                        }
                                                        long i5 = dnd.i(c2, dnd.j(b3, d2 - f5));
                                                        float f6 = obVar2.d;
                                                        int ordinal = pbVar.c.ordinal();
                                                        if (ordinal == 0) {
                                                            c20Var = null;
                                                        } else {
                                                            if (ordinal != 1) {
                                                                zzl.b();
                                                                return null;
                                                            }
                                                            c20Var = obVar2.e;
                                                        }
                                                        ha5.W0(ha5Var3, b2, i5, h4, f6, 0, c20Var, 384);
                                                        int i6 = (int) (c3 & 4294967295L);
                                                        int i7 = (int) (c3 >> 32);
                                                        float atan2 = (float) Math.atan2(Float.intBitsToFloat(i6) - Float.intBitsToFloat((int) (c2 & 4294967295L)), Float.intBitsToFloat(i7) - Float.intBitsToFloat((int) (c2 >> 32)));
                                                        L0 = ha5Var3.L0();
                                                        D2 = L0.D();
                                                        L0.t().o();
                                                        try {
                                                            hpo hpoVar = (hpo) L0.a;
                                                            hpoVar.I(Float.intBitsToFloat(i7), Float.intBitsToFloat(i6));
                                                            hpoVar.F(0L, atan2 * 57.29578f);
                                                            ha5.X0(ha5Var3, obVar2.c, b2, 1.0f, null, 56);
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                it = it2;
                                            } else {
                                                it = it2;
                                                if (vbVar instanceof ub) {
                                                    ub ubVar = (ub) vbVar;
                                                    wbVar3.a(ha5Var3, ubVar.a, ubVar.b, 1.0f);
                                                } else {
                                                    if (!(vbVar instanceof rb)) {
                                                        zzl.b();
                                                        return null;
                                                    }
                                                    rb rbVar = (rb) vbVar;
                                                    qb qbVar = wbVar3.e;
                                                    if (qbVar == null) {
                                                        continue;
                                                    } else {
                                                        long c4 = wbVar3.c(ha5Var3, rbVar.a);
                                                        ha5.U(ha5Var3, wbVar3.b(R.color.surface_1), qbVar.b + qbVar.a, c4, 1.0f, e28.a, 96);
                                                        L0 = ha5Var3.L0();
                                                        D2 = L0.D();
                                                        L0.t().o();
                                                        try {
                                                            ((hpo) L0.a).I(Float.intBitsToFloat((int) (c4 >> 32)), Float.intBitsToFloat((int) (c4 & 4294967295L)));
                                                            ha5.X0(ha5Var3, qbVar.c, wbVar3.b(rbVar.b), 1.0f, qbVar.d, 48);
                                                        } finally {
                                                        }
                                                    }
                                                }
                                            }
                                            kzdVar = this;
                                            it2 = it;
                                        }
                                        return Unit.a;
                                    }
                                };
                                if (booleanValue) {
                                    sx2 L0 = ha5Var.L0();
                                    long D2 = L0.D();
                                    L0.t().o();
                                    try {
                                        hpo.H((hpo) L0.a, -1.0f, -1.0f);
                                        function12.invoke(ha5Var);
                                        mz1.v(L0, D2);
                                    } catch (Throwable th) {
                                        mz1.v(L0, D2);
                                        throw th;
                                    }
                                } else {
                                    function12.invoke(ha5Var);
                                }
                                float f5 = -H08;
                                ((hpo) ha5Var.L0().a).y(f5, f5, f5, f5);
                                return Unit.a;
                            } catch (Throwable th2) {
                                float f6 = -H08;
                                ((hpo) ha5Var.L0().a).y(f6, f6, f6, f6);
                                throw th2;
                            }
                        }
                    };
                    av8Var2.n0(function1);
                    O3 = function1;
                } else {
                    f50Var = f50Var5;
                    ryVar = ryVar2;
                    f50Var2 = f50Var4;
                    ff3Var = ff3Var2;
                }
                int i5 = 6;
                lz.d(6, av8Var2, p, (Function1) O3);
                xtc v = !z ? haa.v(utcVar, 180.0f) : utcVar;
                l8g a5 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                int hashCode2 = Long.hashCode(av8Var2.T);
                aee m2 = av8Var2.m();
                xtc C2 = fqj.C(av8Var2, v);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a5, f50Var3);
                waa.K(av8Var2, m2, ff3Var);
                bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C2, f50Var);
                av8Var2.d0(-211034787);
                int i6 = 0;
                while (i6 < 3) {
                    av8 av8Var3 = av8Var2;
                    kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, i5, av8Var2), null, bkh.l(utcVar, 16.0f), lz.D(R.color.neutral_default, av8Var2), av8Var3, 432, 0);
                    i6++;
                    i5 = i5;
                    av8Var2 = av8Var3;
                }
                av8Var = av8Var2;
                av8Var.s(false);
                av8Var.s(true);
                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                lzdVar2 = lzdVar;
                i3 = 3;
                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var, null);
                av8Var.s(true);
                av8Var.s(false);
            }
        } else {
            av8Var = av8Var2;
            i3 = 3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t1d(lzdVar2, i2, i3);
        }
    }

    public static final void d(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-590314969);
        int i3 = 4;
        int i4 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            s02.n(bkh.d(utcVar, 1.0f), null, null, null, 0, 0, yqo.H(-435251764, av8Var, new k73(i3, gv9Var)), av8Var, 1572864, 62);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i2, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, final Function0 function0, xtc xtcVar, fph fphVar, final cph cphVar, ImageVector imageVector, boolean z, boolean z2, long j2, of3 of3Var, final int i2, final int i3) {
        int i4;
        Function0 function02;
        xtc xtcVar2;
        int i5;
        fph fphVar2;
        cph cphVar2;
        int i6;
        ImageVector imageVector2;
        int i7;
        final boolean z3;
        int i8;
        final boolean z4;
        final long j3;
        final ImageVector imageVector3;
        final xtc xtcVar3;
        final fph fphVar3;
        eqf u;
        str.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(368353134);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            function02 = function0;
            i4 |= av8Var.i(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                fphVar2 = fphVar;
                i4 |= av8Var.g(fphVar2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
                if ((i2 & 24576) == 0) {
                    cphVar2 = cphVar;
                    i4 |= av8Var.g(cphVar2) ? 16384 : 8192;
                } else {
                    cphVar2 = cphVar;
                }
                int i10 = 196608 | i4;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i10 = 1769472 | i4;
                } else if ((1572864 & i2) == 0) {
                    imageVector2 = imageVector;
                    i10 |= av8Var.g(imageVector2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i10 |= 12582912;
                    } else if ((12582912 & i2) == 0) {
                        z3 = z;
                        i10 |= av8Var.h(z3) ? 8388608 : 4194304;
                        i8 = i10 | 905969664;
                        if (av8Var.T(i8 & 1, (306783379 & i8) != 306783378)) {
                            final xtc xtcVar4 = i9 != 0 ? utc.a : xtcVar2;
                            final fph fphVar4 = i5 != 0 ? eph.a : fphVar2;
                            final ImageVector imageVector4 = i6 != 0 ? null : imageVector2;
                            if (i7 != 0) {
                                z3 = true;
                            }
                            final long j4 = 200;
                            final Function0 function03 = function02;
                            final cph cphVar3 = cphVar2;
                            tol.b(l7a.c.a(new p75(Float.NaN)), yqo.H(1871963182, av8Var, new Function2() { // from class: yoh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Function2 j5;
                                    of3 of3Var2 = (of3) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                                        boolean z5 = z3;
                                        fph fphVar5 = fphVar4;
                                        if (z5) {
                                            av8Var2.d0(-634677572);
                                            j5 = fphVar5.m();
                                        } else {
                                            av8Var2.d0(-634676732);
                                            j5 = fphVar5.j();
                                        }
                                        long j6 = ((r13) j5.invoke(av8Var2, 0)).a;
                                        av8Var2.s(false);
                                        xtc g2 = bkh.g(xtcVar4, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                        Object O = av8Var2.O();
                                        if (O == nf3.a) {
                                            O = e.d(0L);
                                            av8Var2.n0(O);
                                        }
                                        fqh fqhVar = new fqh(j4, function03, (boh) O);
                                        v72 b2 = q72.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                                        n7g a2 = o7g.a(8.0f);
                                        cph cphVar4 = cphVar3;
                                        float d2 = cphVar4.d();
                                        float b3 = cphVar4.b();
                                        iz8.e(fqhVar, g2, z5, a2, q72.a(((r13) fphVar5.l().invoke(av8Var2, 0)).a, ((r13) fphVar5.m().invoke(av8Var2, 0)).a, ((r13) fphVar5.k().invoke(av8Var2, 0)).a, ((r13) fphVar5.j().invoke(av8Var2, 0)).a, av8Var2, 0), b2, null, new t3e(b3, d2, b3, d2), null, yqo.H(-1707523042, av8Var2, new jv3(cphVar4, j6, str, imageVector4)), av8Var2, 805306368, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
                                    } else {
                                        av8Var2.W();
                                    }
                                    return Unit.a;
                                }
                            }), av8Var, 56);
                            fphVar3 = fphVar4;
                            xtcVar3 = xtcVar4;
                            j3 = 200;
                            imageVector3 = imageVector4;
                            z4 = true;
                        } else {
                            av8Var.W();
                            z4 = z2;
                            j3 = j2;
                            imageVector3 = imageVector2;
                            xtcVar3 = xtcVar2;
                            fphVar3 = fphVar2;
                        }
                        final boolean z5 = z3;
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new Function2() { // from class: zoh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    yfa.e(str, function0, xtcVar3, fphVar3, cphVar, imageVector3, z5, z4, j3, (of3) obj, aba.K(i2 | 1), i3);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    z3 = z;
                    i8 = i10 | 905969664;
                    if (av8Var.T(i8 & 1, (306783379 & i8) != 306783378)) {
                    }
                    final boolean z52 = z3;
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                imageVector2 = imageVector;
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                z3 = z;
                i8 = i10 | 905969664;
                if (av8Var.T(i8 & 1, (306783379 & i8) != 306783378)) {
                }
                final boolean z522 = z3;
                u = av8Var.u();
                if (u != null) {
                }
            }
            fphVar2 = fphVar;
            if ((i2 & 24576) == 0) {
            }
            int i102 = 196608 | i4;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            imageVector2 = imageVector;
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            z3 = z;
            i8 = i102 | 905969664;
            if (av8Var.T(i8 & 1, (306783379 & i8) != 306783378)) {
            }
            final boolean z5222 = z3;
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        fphVar2 = fphVar;
        if ((i2 & 24576) == 0) {
        }
        int i1022 = 196608 | i4;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        imageVector2 = imageVector;
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        z3 = z;
        i8 = i1022 | 905969664;
        if (av8Var.T(i8 & 1, (306783379 & i8) != 306783378)) {
        }
        final boolean z52222 = z3;
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final ArrayList f(List list) {
        ArrayList k = me4.k(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qrl qrlVar = ((atm) it.next()).d;
            if (qrlVar != null) {
                k.add(qrlVar);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = k.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((qrl) next).c)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final String g(XmlPullParser xmlPullParser, tl0 tl0Var) {
        String attributeValue = xmlPullParser.getAttributeValue(null, tl0Var.a);
        if (attributeValue != null) {
            return StringsKt.l0(attributeValue).toString();
        }
        return null;
    }

    public static final String h(XmlPullParser xmlPullParser, d9g d9gVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, d9gVar.a);
        if (attributeValue != null) {
            return StringsKt.l0(attributeValue).toString();
        }
        return null;
    }

    public static final boolean i(XmlPullParser xmlPullParser, tl0 tl0Var) {
        tl0Var.getClass();
        return c.o(xmlPullParser.getName(), tl0Var.a, true);
    }

    public static final boolean j(XmlPullParser xmlPullParser, vnf vnfVar) {
        vnfVar.getClass();
        return c.o(xmlPullParser.getName(), vnfVar.a, true);
    }

    public static final boolean k(XmlPullParser xmlPullParser, d9g d9gVar) {
        d9gVar.getClass();
        return c.o(xmlPullParser.getName(), d9gVar.a, true);
    }

    public static khg l(jag jagVar) {
        jagVar.getClass();
        String str = jagVar.v;
        if (str == null || str.length() == 0) {
            throw new wo0("Invalid VPAID ad : missing VPAID url");
        }
        String path = Uri.parse(str).getPath();
        if (path == null || !c.n(path, ".js", true)) {
            throw new wo0(lnb.o("Invalid VPAID ad : file at url ", str, " is not a valid VPAID creative"));
        }
        String str2 = jagVar.v;
        String str3 = jagVar.l;
        List list = jagVar.z;
        List list2 = jagVar.y;
        String str4 = jagVar.x;
        String str5 = jagVar.A;
        w9f w9fVar = ubg.a;
        Integer num = jagVar.D;
        w9fVar.getClass();
        return new khg(str2, str3, list, list2, str4, str5, (num != null && num.intValue() == 1) ? ubg.c : (num != null && num.intValue() == 2) ? ubg.d : ubg.b);
    }

    public static final String m(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + ": ");
        }
        sb.append(str);
        if (str2 != null && !StringsKt.R(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !StringsKt.R(str3)) {
            sb.append("\n" + str3);
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final String n(j9b j9bVar) {
        j9bVar.getClass();
        if (j9bVar instanceof g9b) {
            return "InfoCard";
        }
        if (j9bVar instanceof h9b) {
            return "Manager";
        }
        if (j9bVar instanceof i9b) {
            return "SectionHeader";
        }
        if (j9bVar instanceof p9b) {
            return "Player";
        }
        zzl.b();
        return null;
    }

    public static Intent o(int i2, Context context) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) StageCategoryActivity.class);
        intent.putExtra("STAGE_SPORT", i2);
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent;
    }

    public static float p(int i2, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && parseFloat <= 1.0f) {
            return parseFloat;
        }
        sw9.k("Motion easing control point value must be between 0 and 1; instead got: ", parseFloat);
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final aej q(l3h l3hVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object g2 = l3hVar.a.g(k3h.a);
        if (g2 == null) {
            g2 = null;
        }
        m9 m9Var = (m9) g2;
        if (m9Var == null || (function1 = (Function1) m9Var.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (aej) arrayList.get(0);
    }

    public static final void r(n4 n4Var, String str) {
        n4Var.r(n4Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static boolean s(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean t(byte b2) {
        return b2 > -65;
    }

    public static final CharSequence u(CharSequence charSequence, int i2) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                sb.append(charSequence.subSequence(i3, i4).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final long v(long j2, float f2) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j2 : r13.c(j2, r13.d(j2) * f2);
    }

    public static final String w(XmlPullParser xmlPullParser) {
        try {
            String nextText = xmlPullParser.nextText();
            if (nextText != null) {
                return StringsKt.l0(nextText).toString();
            }
            return null;
        } catch (XmlPullParserException unused) {
            StringBuilder sb = new StringBuilder();
            int eventType = xmlPullParser.getEventType();
            int i2 = 0;
            while (eventType != 1) {
                if (eventType == 2) {
                    i2++;
                } else if (eventType != 3) {
                    if (eventType == 4 || eventType == 5) {
                        sb.append(xmlPullParser.getText());
                    }
                } else {
                    if (i2 == 0) {
                        break;
                    }
                    i2--;
                }
                eventType = xmlPullParser.next();
            }
            String obj = StringsKt.l0(sb.toString()).toString();
            if (obj.length() > 0) {
                return obj;
            }
            return null;
        }
    }

    public static final String x(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return mz1.o(sb, str != null ? lnb.o(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static v90 y(j9e j9eVar) {
        int m = j9eVar.m();
        if (j9eVar.m() != 1684108385) {
            tgj.d0("Failed to parse cover art attribute");
            return null;
        }
        int m2 = j9eVar.m();
        byte[] bArr = l12.a;
        int i2 = m2 & 16777215;
        String str = i2 == 13 ? "image/jpeg" : i2 == 14 ? "image/png" : null;
        if (str == null) {
            fn0.r(i2, "Unrecognized cover art flags: ");
            return null;
        }
        j9eVar.O(4);
        int i3 = m - 16;
        byte[] bArr2 = new byte[i3];
        j9eVar.k(bArr2, 0, i3);
        return new v90(str, null, 3, bArr2);
    }

    public static cdj z(int i2, j9e j9eVar, String str) {
        int m = j9eVar.m();
        if (j9eVar.m() == 1684108385 && m >= 22) {
            j9eVar.O(10);
            int H = j9eVar.H();
            if (H > 0) {
                String j2 = ljg.j(H, "");
                int H2 = j9eVar.H();
                if (H2 > 0) {
                    j2 = mz1.j(H2, j2, "/");
                }
                return new cdj(str, null, hv9.z(j2));
            }
        }
        tgj.d0("Failed to parse index/count attribute: ".concat(ffb.h(i2)));
        return null;
    }
}
