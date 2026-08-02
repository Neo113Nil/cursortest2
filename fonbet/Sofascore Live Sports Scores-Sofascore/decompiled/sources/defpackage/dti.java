package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.newNetwork.AttributeOverviewData;
import com.sofascore.results.R;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLSocket;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class dti implements qs3, q02, abj, zzyh, zzqp, ev4, fn5, hd9, um6, cje {
    public static final dti b = new dti(1);
    public static final dti c = new dti(2);
    public static final dti d = new dti(3);
    public static final dti e = new dti(4);
    public static final dti f = new dti(5);
    public static final dti g = new dti(6);
    public static final dti h = new dti(7);
    public static final dti i = new dti(8);
    public static final dti j = new dti(9);
    public static final dti k = new dti(10);
    public static final dti l = new dti(11);
    public static final dti m = new dti(12);
    public static final dti n = new dti(13);
    public static final dti o = new dti(14);
    public static boolean p;
    public final /* synthetic */ int a;

    public /* synthetic */ dti(int i2) {
        this.a = i2;
    }

    public static boolean e(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2002238939:
                return str.equals(Sports.ICE_HOCKEY);
            case -1721090992:
                return str.equals(Sports.BASEBALL);
            case -1263172551:
                return str.equals(Sports.FUTSAL);
            case -1160328212:
                return str.equals(Sports.VOLLEYBALL);
            case -83759494:
                return str.equals(Sports.AMERICAN_FOOTBALL);
            case 1767150:
                return str.equals(Sports.HANDBALL);
            case 108869083:
                return str.equals(Sports.RUGBY);
            case 394668909:
                return str.equals(Sports.FOOTBALL);
            case 727149765:
                return str.equals(Sports.BASKETBALL);
            case 932645060:
                return str.equals(Sports.MINI_FOOTBALL);
            case 1032299505:
                return str.equals(Sports.CRICKET);
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x001a, B:87:0x0014, B:84:0x0010), top: B:3:0x0003, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gx9 j(Context context) {
        ox9 ox9Var;
        ox9 ox9Var2;
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        Object obj;
        Object B;
        Object B2;
        synchronized (ox9.h) {
            if (!cw3.a.contains(ox9.class)) {
                try {
                    ox9Var = ox9.i;
                } catch (Throwable th) {
                    cw3.a(ox9.class, th);
                }
                if (ox9Var == null) {
                    ox9Var = it7.e();
                }
                ox9Var2 = ox9Var;
            }
            ox9Var = null;
            if (ox9Var == null) {
            }
            ox9Var2 = ox9Var;
        }
        if (ox9Var2 == null) {
            return null;
        }
        Class x = qx9.x("com.android.billingclient.api.BillingClient");
        Class x2 = qx9.x("com.android.billingclient.api.Purchase");
        Class x3 = qx9.x("com.android.billingclient.api.Purchase$PurchasesResult");
        Class x4 = qx9.x("com.android.billingclient.api.SkuDetails");
        Class x5 = qx9.x("com.android.billingclient.api.PurchaseHistoryRecord");
        Class x6 = qx9.x("com.android.billingclient.api.SkuDetailsResponseListener");
        Class x7 = qx9.x("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (x == null || x3 == null || x2 == null || x4 == null || x6 == null || x5 == null || x7 == null) {
            gx9.e();
            return null;
        }
        Method z = qx9.z(x, "queryPurchases", String.class);
        Method z2 = qx9.z(x3, "getPurchasesList", new Class[0]);
        Method z3 = qx9.z(x2, "getOriginalJson", new Class[0]);
        Method z4 = qx9.z(x4, "getOriginalJson", new Class[0]);
        Method z5 = qx9.z(x5, "getOriginalJson", new Class[0]);
        if (!cw3.a.contains(ox9Var2)) {
            try {
                cls = (Class) ox9Var2.b;
            } catch (Throwable th2) {
                cw3.a(ox9Var2, th2);
            }
            Method z6 = qx9.z(x, "querySkuDetailsAsync", cls, x6);
            Method z7 = qx9.z(x, "queryPurchaseHistoryAsync", String.class, x7);
            if (z != null || z2 == null || z3 == null || z4 == null || z5 == null || z6 == null || z7 == null) {
                gx9.e();
                return null;
            }
            Class x8 = qx9.x("com.android.billingclient.api.BillingClient$Builder");
            Class x9 = qx9.x("com.android.billingclient.api.PurchasesUpdatedListener");
            if (x8 == null || x9 == null) {
                cls2 = x;
                cls3 = x4;
            } else {
                Method z8 = qx9.z(x, "newBuilder", Context.class);
                Method z9 = qx9.z(x8, "enablePendingPurchases", new Class[0]);
                Method z10 = qx9.z(x8, "setListener", x9);
                cls3 = x4;
                Method z11 = qx9.z(x8, "build", new Class[0]);
                if (z8 == null || z9 == null || z10 == null || z11 == null || (B = qx9.B(x, null, z8, context)) == null) {
                    cls2 = x;
                } else {
                    cls2 = x;
                    cls4 = x5;
                    Object B3 = qx9.B(x8, B, z10, Proxy.newProxyInstance(x9.getClassLoader(), new Class[]{x9}, new ex9(0)));
                    if (B3 != null && (B2 = qx9.B(x8, B3, z9, new Object[0])) != null) {
                        obj = qx9.B(x8, B2, z11, new Object[0]);
                        if (obj == null) {
                            gx9.e();
                            return null;
                        }
                        gx9 gx9Var = new gx9(obj, cls2, cls3, cls4, x6, x7, z4, z5, z6, z7, ox9Var2);
                        if (!cw3.a.contains(gx9.class)) {
                            try {
                                gx9.m = gx9Var;
                            } catch (Throwable th3) {
                                cw3.a(gx9.class, th3);
                            }
                        }
                        if (!cw3.a.contains(gx9.class)) {
                            try {
                                return gx9.m;
                            } catch (Throwable th4) {
                                cw3.a(gx9.class, th4);
                            }
                        }
                        return null;
                    }
                    obj = null;
                    if (obj == null) {
                    }
                }
            }
            cls4 = x5;
            obj = null;
            if (obj == null) {
            }
        }
        cls = null;
        Method z62 = qx9.z(x, "querySkuDetailsAsync", cls, x6);
        Method z72 = qx9.z(x, "queryPurchaseHistoryAsync", String.class, x7);
        if (z != null) {
        }
        gx9.e();
        return null;
    }

    public static String n(double d2, int i2) {
        if (d2 < 0.001d) {
            return "-";
        }
        if (Math.abs(d2 - 10.0d) < 0.001d) {
            return "10";
        }
        return String.format(Locale.US, lnb.k(i2, "%.", InneractiveMediationDefs.GENDER_FEMALE), Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
    }

    public static d91 o(String str) {
        Object obj;
        if (d91.e.contains(str)) {
            return d91.f;
        }
        Iterator<E> it = d91.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((d91) obj).a.equals(str)) {
                break;
            }
        }
        return (d91) obj;
    }

    public static final LinkedHashMap q(AttributeOverviewData attributeOverviewData) {
        attributeOverviewData.getClass();
        return Intrinsics.c(attributeOverviewData.getPosition(), "G") ? tub.g(new Pair("SAV", attributeOverviewData.getSaves()), new Pair("ANT", attributeOverviewData.getAnticipation()), new Pair("TAC", attributeOverviewData.getTactical()), new Pair("BAL", attributeOverviewData.getBallDistribution()), new Pair("AER", attributeOverviewData.getAerial())) : tub.g(new Pair("ATT", attributeOverviewData.getAttacking()), new Pair("TEC", attributeOverviewData.getTechnical()), new Pair("TAC", attributeOverviewData.getTactical()), new Pair("DEF", attributeOverviewData.getDefending()), new Pair("CRE", attributeOverviewData.getCreativity()));
    }

    public static String t(int i2, boolean z, Context context) {
        context.getClass();
        if (i2 == 24 && z) {
            i2 = -1;
        }
        switch (i2) {
            case -1:
                return context.getString(R.string.long_shots_saving);
            case 0:
            case 8:
            case 12:
            default:
                return null;
            case 1:
                return context.getString(R.string.anchor_play);
            case 2:
                return context.getString(R.string.penalty_taking);
            case 3:
                return context.getString(R.string.direct_free_kicks);
            case 4:
                return context.getString(R.string.football_long_shots);
            case 5:
                return context.getString(R.string.finishing);
            case 6:
                return context.getString(R.string.passing);
            case 7:
                return context.getString(R.string.football_playmaking);
            case 9:
                return context.getString(R.string.football_tackling);
            case 10:
                return context.getString(R.string.ball_interception);
            case 11:
                return context.getString(R.string.football_consistency);
            case 13:
                return context.getString(R.string.football_long_balls);
            case 14:
                return context.getString(R.string.football_ball_control);
            case 15:
                return context.getString(R.string.football_ground_duels);
            case 16:
                return context.getString(R.string.football_aerial_duels);
            case 17:
                return context.getString(R.string.football_error_proneness);
            case 18:
                return context.getString(R.string.football_discipline);
            case 19:
                return context.getString(R.string.penalty_saving);
            case 20:
                return context.getString(R.string.football_reflexes);
            case 21:
                return context.getString(R.string.football_runs_out_characteristic);
            case 22:
                return context.getString(R.string.football_high_claims);
            case 23:
                return context.getString(R.string.handling);
            case 24:
                return context.getString(R.string.long_distance_shots);
            case 25:
                return context.getString(R.string.football_positioning);
            case 26:
                return context.getString(R.string.football_high_pressing);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x06a2, code lost:
    
        if (r23.equals("RW") == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x06cc, code lost:
    
        if (r24 == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x06ce, code lost:
    
        r1 = com.sofascore.results.R.string.hockey_right_wing_short;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x06d1, code lost:
    
        r0 = r20.getString(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x06da, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x06dd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x06d6, code lost:
    
        r1 = com.sofascore.results.R.string.right_wing;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x06ac, code lost:
    
        if (r23.equals(com.sofascore.model.mvvm.model.PlayerKt.ICE_HOCKEY_RIGHT_DEFENSEMAN) == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0731, code lost:
    
        if (r24 == false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0733, code lost:
    
        r1 = com.sofascore.results.R.string.hockey_defenceman_short;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0736, code lost:
    
        r0 = r20.getString(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x073f, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0742, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x073b, code lost:
    
        r1 = com.sofascore.results.R.string.defenseman;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x06b4, code lost:
    
        if (r23.equals("LW") == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x06e6, code lost:
    
        if (r24 == false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x06e8, code lost:
    
        r1 = com.sofascore.results.R.string.hockey_left_wing_short;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x06eb, code lost:
    
        r0 = r20.getString(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x06f4, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x06f7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x06f0, code lost:
    
        r1 = com.sofascore.results.R.string.left_wing;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x06be, code lost:
    
        if (r23.equals(com.sofascore.model.mvvm.model.PlayerKt.ICE_HOCKEY_LEFT_DEFENSEMAN) == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x06c8, code lost:
    
        if (r23.equals(com.sofascore.model.mvvm.model.PlayerKt.ICE_HOCKEY_RIGHT_WING) == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x06e2, code lost:
    
        if (r23.equals("L") == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x072e, code lost:
    
        if (r23.equals("D") == false) goto L556;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0764 A[PHI: r17
      0x0764: PHI (r17v2 java.lang.String) = 
      (r17v1 java.lang.String)
      (r17v3 java.lang.String)
      (r17v3 java.lang.String)
      (r17v3 java.lang.String)
      (r17v3 java.lang.String)
      (r17v3 java.lang.String)
      (r17v3 java.lang.String)
      (r17v3 java.lang.String)
      (r17v3 java.lang.String)
     binds: [B:475:0x0762, B:473:0x075c, B:392:0x065d, B:374:0x0615, B:221:0x0340, B:129:0x0224, B:73:0x0119, B:69:0x010a, B:49:0x00c5] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String u(Context context, Gender gender, String str, String str2, boolean z) {
        String str3;
        String str4;
        context.getClass();
        if (str != null) {
            str3 = "";
            switch (str.hashCode()) {
                case -2002238939:
                    if (str.equals(Sports.ICE_HOCKEY)) {
                        if (str2 != null) {
                            int hashCode = str2.hashCode();
                            if (hashCode != 67) {
                                if (hashCode == 68) {
                                    break;
                                } else if (hashCode != 70) {
                                    if (hashCode != 71) {
                                        if (hashCode == 76) {
                                            break;
                                        } else if (hashCode == 82) {
                                            break;
                                        } else if (hashCode == 2424) {
                                            break;
                                        } else if (hashCode == 2443) {
                                            break;
                                        } else if (hashCode == 2610) {
                                            break;
                                        } else if (hashCode == 2629) {
                                            break;
                                        }
                                    } else if (str2.equals("G")) {
                                        String string = context.getString(z ? R.string.hockey_goalie_short : R.string.goalie);
                                        string.getClass();
                                        return string;
                                    }
                                } else if (str2.equals("F")) {
                                    String string2 = context.getString(z ? R.string.hockey_forward_short : R.string.ice_hockey_forward);
                                    string2.getClass();
                                    return string2;
                                }
                            }
                            if (str2.equals("C")) {
                                String string3 = context.getString(z ? R.string.hockey_centre_short : R.string.hockey_center);
                                string3.getClass();
                                return string3;
                            }
                        }
                        return str2 == null ? str3 : str2;
                    }
                    break;
                case -1721090992:
                    if (str.equals(Sports.BASEBALL)) {
                        rk1.d.getClass();
                        rk1 rk1Var = str2 != null ? rk1.e.contains(str2) ? rk1.g : (rk1) rk1.f.get(str2) : null;
                        if (rk1Var != null && z) {
                            String string4 = context.getString(rk1Var.c);
                            string4.getClass();
                            return string4;
                        }
                        if (rk1Var != null) {
                            String string5 = context.getString(rk1Var.b);
                            string5.getClass();
                            return string5;
                        }
                        if (str2 != null) {
                            return str2;
                        }
                    }
                    break;
                case -1160328212:
                    if (str.equals(Sports.VOLLEYBALL)) {
                        if (str2 != null) {
                            int hashCode2 = str2.hashCode();
                            if (hashCode2 != 76) {
                                if (hashCode2 != 79) {
                                    if (hashCode2 != 83) {
                                        if (hashCode2 != 2453) {
                                            if (hashCode2 == 2521 && str2.equals(PlayerKt.VOLLEYBALL_OUTSIDE_HITTER)) {
                                                String string6 = context.getString(z ? R.string.volleyball_player_position_outside_hitter_short : R.string.volleyball_player_position_outside_hitter);
                                                string6.getClass();
                                                return string6;
                                            }
                                        } else if (str2.equals(PlayerKt.VOLLEYBALL_MIDDLE_BLOCKER)) {
                                            String string7 = context.getString(z ? R.string.volleyball_player_position_middle_blocker_short : R.string.volleyball_player_position_middle_blocker);
                                            string7.getClass();
                                            return string7;
                                        }
                                    } else if (str2.equals(PlayerKt.VOLLEYBALL_SETTER)) {
                                        String string8 = context.getString(z ? R.string.volleyball_player_position_setter_short : R.string.volleyball_player_position_setter);
                                        string8.getClass();
                                        return string8;
                                    }
                                } else if (str2.equals(PlayerKt.VOLLEYBALL_OPPOSITE)) {
                                    String string9 = context.getString(z ? R.string.volleyball_player_position_opposite_short : R.string.volleyball_player_position_opposite);
                                    string9.getClass();
                                    return string9;
                                }
                            } else if (str2.equals("L")) {
                                String string10 = context.getString(z ? R.string.volleyball_player_position_libero_short : R.string.volleyball_player_position_libero);
                                string10.getClass();
                                return string10;
                            }
                        }
                        if (str2 != null) {
                            return str2;
                        }
                    }
                    break;
                case -83759494:
                    if (str.equals(Sports.AMERICAN_FOOTBALL)) {
                        String str5 = z ? str2 : null;
                        if (str5 != null) {
                            return str5;
                        }
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case 67:
                                    if (str2.equals("C")) {
                                        str4 = context.getString(R.string.amf_center);
                                        break;
                                    }
                                    break;
                                case 71:
                                    if (str2.equals("G")) {
                                        str4 = context.getString(R.string.amf_guard);
                                        break;
                                    }
                                    break;
                                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_KICKER)) {
                                        str4 = context.getString(R.string.amf_kicker);
                                        break;
                                    }
                                    break;
                                case 80:
                                    if (str2.equals("P")) {
                                        str4 = context.getString(R.string.amf_punter);
                                        break;
                                    }
                                    break;
                                case 84:
                                    if (str2.equals("T")) {
                                        str4 = context.getString(R.string.amf_tackle);
                                        break;
                                    }
                                    break;
                                case 2143:
                                    if (str2.equals("CB")) {
                                        str4 = context.getString(R.string.amf_corner_back);
                                        break;
                                    }
                                    break;
                                case 2174:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_BACK)) {
                                        str4 = context.getString(R.string.amf_defensive_back);
                                        break;
                                    }
                                    break;
                                case 2177:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END)) {
                                        str4 = context.getString(R.string.amf_defensive_end);
                                        break;
                                    }
                                    break;
                                case 2184:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_LINEMAN)) {
                                        str4 = context.getString(R.string.amf_defensive_lineman);
                                        break;
                                    }
                                    break;
                                case 2192:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_TACKLE)) {
                                        str4 = context.getString(R.string.amf_defensive_tackle);
                                        break;
                                    }
                                    break;
                                case 2236:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_FULLBACK)) {
                                        str4 = context.getString(R.string.amf_fullback);
                                        break;
                                    }
                                    break;
                                case 2253:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_FREE_SAFETY)) {
                                        str4 = context.getString(R.string.amf_free_safety);
                                        break;
                                    }
                                    break;
                                case 2422:
                                    if (str2.equals("LB")) {
                                        str4 = context.getString(R.string.amf_lineback);
                                        break;
                                    }
                                    break;
                                case 2439:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_LONG_SNAPPER)) {
                                        str4 = context.getString(R.string.amf_long_snapper);
                                        break;
                                    }
                                    break;
                                case 2502:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_NOSE_TACKLE)) {
                                        str4 = context.getString(R.string.amf_nose_tackle);
                                        break;
                                    }
                                    break;
                                case 2520:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_GUARD)) {
                                        str4 = context.getString(R.string.amf_offensive_guard);
                                        break;
                                    }
                                    break;
                                case 2525:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_LINEMAN)) {
                                        str4 = context.getString(R.string.amf_offensive_lineman);
                                        break;
                                    }
                                    break;
                                case 2533:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE)) {
                                        str4 = context.getString(R.string.amf_offensive_tackle);
                                        break;
                                    }
                                    break;
                                case 2562:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER)) {
                                        str4 = context.getString(R.string.amf_punt_returner);
                                        break;
                                    }
                                    break;
                                case 2577:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_QUARTERBACK)) {
                                        str4 = context.getString(R.string.amf_quarterback);
                                        break;
                                    }
                                    break;
                                case 2608:
                                    if (str2.equals("RB")) {
                                        str4 = context.getString(R.string.amf_running_back);
                                        break;
                                    }
                                    break;
                                case 2656:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY)) {
                                        str4 = context.getString(R.string.amf_strong_safety);
                                        break;
                                    }
                                    break;
                                case 2673:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_TIGHT_END)) {
                                        str4 = context.getString(R.string.amf_tight_end);
                                        break;
                                    }
                                    break;
                                case 2779:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_WIDE_RECEIVER)) {
                                        str4 = context.getString(R.string.amf_wide_receiver);
                                        break;
                                    }
                                    break;
                                case 72575:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_INSIDE_LINEBACK)) {
                                        str4 = context.getString(R.string.amf_inside_lineback);
                                        break;
                                    }
                                    break;
                                case 76419:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_MIDDLE_LINEBACK)) {
                                        str4 = context.getString(R.string.amf_middle_lineback);
                                        break;
                                    }
                                    break;
                                case 78341:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_OUTSIDE_LINEBACK)) {
                                        str4 = context.getString(R.string.amf_outside_lineback);
                                        break;
                                    }
                                    break;
                                case 81848:
                                    if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_SAFETY)) {
                                        str4 = context.getString(R.string.amf_safety);
                                        break;
                                    }
                                    break;
                            }
                            str4.getClass();
                            return str4;
                        }
                        str4 = str2 == null ? str3 : str2;
                        str4.getClass();
                        return str4;
                    }
                    break;
                case 1767150:
                    if (str.equals(Sports.HANDBALL)) {
                        if (str2 != null) {
                            int hashCode3 = str2.hashCode();
                            if (hashCode3 != 71) {
                                if (hashCode3 != 80) {
                                    if (hashCode3 != 2143) {
                                        if (hashCode3 != 2422) {
                                            if (hashCode3 != 2443) {
                                                if (hashCode3 != 2608) {
                                                    if (hashCode3 == 2629 && str2.equals("RW")) {
                                                        String string11 = context.getString(z ? R.string.handball_position_right_wing_short : R.string.handball_position_right_wing);
                                                        string11.getClass();
                                                        return string11;
                                                    }
                                                } else if (str2.equals("RB")) {
                                                    String string12 = context.getString(z ? R.string.handball_position_right_back_short : R.string.handball_position_right_back);
                                                    string12.getClass();
                                                    return string12;
                                                }
                                            } else if (str2.equals("LW")) {
                                                String string13 = context.getString(z ? R.string.handball_position_left_wing_short : R.string.handball_position_left_wing);
                                                string13.getClass();
                                                return string13;
                                            }
                                        } else if (str2.equals("LB")) {
                                            String string14 = context.getString(z ? R.string.handball_position_left_back_short : R.string.handball_position_left_back);
                                            string14.getClass();
                                            return string14;
                                        }
                                    } else if (str2.equals("CB")) {
                                        String string15 = context.getString(z ? R.string.handball_position_centre_back_short : R.string.handball_position_centre_back);
                                        string15.getClass();
                                        return string15;
                                    }
                                } else if (str2.equals("P")) {
                                    String string16 = context.getString(z ? R.string.handball_position_pivot_short : R.string.handball_position_pivot);
                                    string16.getClass();
                                    return string16;
                                }
                            } else if (str2.equals("G")) {
                                String string17 = context.getString(z ? R.string.handball_position_goalkeeper_short : R.string.handball_position_goalkeeper);
                                string17.getClass();
                                return string17;
                            }
                        }
                        if (str2 != null) {
                            return str2;
                        }
                    }
                    break;
                case 108869083:
                    if (str.equals(Sports.RUGBY)) {
                        String str6 = z ? str2 : null;
                        if (str6 != null) {
                            return str6;
                        }
                        String string18 = Intrinsics.c(str2, "F") ? context.getString(R.string.rugby_position_forward) : Intrinsics.c(str2, "B") ? context.getString(R.string.rugby_position_back) : str2 == null ? str3 : str2;
                        string18.getClass();
                        return string18;
                    }
                    break;
                case 394668909:
                    if (str.equals(Sports.FOOTBALL)) {
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1429705729:
                                    if (str2.equals("Midfielder")) {
                                        return hkg.Q(context, R.string.football_midfielder, gender, new Object[0]);
                                    }
                                    break;
                                case 68:
                                    if (str2.equals("D")) {
                                        if (!z) {
                                            return hkg.Q(context, R.string.football_defender, gender, new Object[0]);
                                        }
                                        String string19 = context.getString(R.string.defender_short);
                                        string19.getClass();
                                        return string19;
                                    }
                                    break;
                                case 70:
                                    if (str2.equals("F")) {
                                        if (!z) {
                                            return hkg.Q(context, R.string.football_forward, gender, new Object[0]);
                                        }
                                        String string20 = context.getString(R.string.forward_short);
                                        string20.getClass();
                                        return string20;
                                    }
                                    break;
                                case 71:
                                    if (str2.equals("G")) {
                                        if (!z) {
                                            return hkg.Q(context, R.string.goalkeeper, gender, new Object[0]);
                                        }
                                        String string21 = context.getString(R.string.goalkeeper_short);
                                        string21.getClass();
                                        return string21;
                                    }
                                    break;
                                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                                    if (str2.equals(PlayerKt.FOOTBALL_MIDFIELDER)) {
                                        if (!z) {
                                            return hkg.Q(context, R.string.football_midfielder, gender, new Object[0]);
                                        }
                                        String string22 = context.getString(R.string.midfielder_short);
                                        string22.getClass();
                                        return string22;
                                    }
                                    break;
                                case 712402435:
                                    if (str2.equals("Defender")) {
                                        return hkg.Q(context, R.string.football_defender, gender, new Object[0]);
                                    }
                                    break;
                                case 987507365:
                                    if (str2.equals("Forward")) {
                                        return hkg.Q(context, R.string.football_forward, gender, new Object[0]);
                                    }
                                    break;
                                case 1252425914:
                                    if (str2.equals("Substitute")) {
                                        String string23 = context.getString(R.string.substitute);
                                        string23.getClass();
                                        return string23;
                                    }
                                    break;
                                case 1943202789:
                                    if (str2.equals("Goalkeeper")) {
                                        return hkg.Q(context, R.string.goalkeeper, gender, new Object[0]);
                                    }
                                    break;
                            }
                        }
                        if (str2 != null) {
                            return str2;
                        }
                    }
                    break;
                case 727149765:
                    if (str.equals(Sports.BASKETBALL)) {
                        if (str2 != null) {
                            char[] charArray = str2.toCharArray();
                            charArray.getClass();
                            return ph0.J(charArray, "-", new sx0(context, z, 4), 30);
                        }
                    }
                    break;
                case 932645060:
                    if (str.equals(Sports.MINI_FOOTBALL)) {
                        if (Intrinsics.c(str2, "G")) {
                            if (!z) {
                                return hkg.Q(context, R.string.goalkeeper, gender, new Object[0]);
                            }
                            String string24 = context.getString(R.string.goalkeeper_short);
                            string24.getClass();
                            return string24;
                        }
                        if (Intrinsics.c(str2, "F")) {
                            String string25 = context.getString(z ? R.string.minifootball_outfield_player_short : R.string.minifootball_outfield_player);
                            string25.getClass();
                            return string25;
                        }
                        if (str2 != null) {
                            return str2;
                        }
                    }
                    break;
                case 1032299505:
                    if (str.equals(Sports.CRICKET)) {
                        if (str2 != null) {
                            int hashCode4 = str2.hashCode();
                            if (hashCode4 != 66) {
                                if (hashCode4 != 2097) {
                                    if (hashCode4 != 2123) {
                                        if (hashCode4 == 2772 && str2.equals(PlayerKt.CRICKET_KEEPER)) {
                                            String string26 = context.getString(z ? R.string.cricket_keeper_short : R.string.cricket_keeper);
                                            string26.getClass();
                                            return string26;
                                        }
                                    } else if (str2.equals(PlayerKt.CRICKET_BATTER)) {
                                        String string27 = context.getString(z ? R.string.cricket_batter_short : R.string.cricket_batter);
                                        string27.getClass();
                                        return string27;
                                    }
                                } else if (str2.equals(PlayerKt.CRICKET_ALLROUNDER)) {
                                    String string28 = context.getString(z ? R.string.cricket_allrounder_short : R.string.cricket_allrounder);
                                    string28.getClass();
                                    return string28;
                                }
                            } else if (str2.equals("B")) {
                                String string29 = context.getString(z ? R.string.cricket_bowler_short : R.string.cricket_bowler);
                                string29.getClass();
                                return string29;
                            }
                        }
                        if (str2 != null) {
                            return str2;
                        }
                    }
                    break;
            }
        } else {
            str3 = "";
        }
        if (str2 != null) {
            return str2;
        }
    }

    public static void w(Bundle bundle) {
        bundle.getClass();
        if (bundle.containsKey("enable_multiple_ads_per_unit") && Intrinsics.c(bundle.getString("enable_multiple_ads_per_unit"), "true")) {
            p = true;
        }
    }

    public static boolean x() {
        boolean z;
        try {
            Method declaredMethod = Class.forName("com.google.android.gms.ads.internal.adaptersettings.AdapterSettings").getDeclaredMethod(Constants.GET_INSTANCE, null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            Method declaredMethod2 = invoke.getClass().getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(invoke, "adapter:mintegral_android_restrict_multiple_ads", Boolean.FALSE);
            invoke2.getClass();
            z = ((Boolean) invoke2).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            z = false;
        }
        return z || p;
    }

    public static void y(in5 in5Var, StringBuilder sb) {
        int charAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        ((StringBuilder) in5Var.f).append(new String(new char[]{(char) (charAt / NotificationCompat.FLAG_LOCAL_ONLY), (char) (charAt % NotificationCompat.FLAG_LOCAL_ONLY)}));
        sb.delete(0, 3);
    }

    @Override // defpackage.ev4
    public boolean a(SSLSocket sSLSocket) {
        return c.v(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.hd9
    public w9e b(dd9 dd9Var, zc9 zc9Var) {
        return new gd9(dd9Var, zc9Var);
    }

    @Override // defpackage.hd9
    public w9e c() {
        return new gd9();
    }

    @Override // defpackage.qs3
    public Object convert(Object obj) {
        ((i2g) obj).close();
        return Unit.a;
    }

    @Override // defpackage.ev4
    public poh d(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                a70.j(ljg.l(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new l30(cls2);
    }

    @Override // defpackage.fn5
    public void f(in5 in5Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!in5Var.b()) {
                break;
            }
            char a = in5Var.a();
            in5Var.a++;
            int k2 = k(a, sb);
            int length = ((StringBuilder) in5Var.f).length() + ((sb.length() / 3) << 1);
            in5Var.d(length);
            int i2 = ((hpi) in5Var.g).b - length;
            if (!in5Var.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i2 < 2 || i2 > 2)) {
                    int length2 = sb.length();
                    sb.delete(length2 - k2, length2);
                    in5Var.a--;
                    k2 = k(in5Var.a(), sb2);
                    in5Var.g = null;
                }
                while (sb.length() % 3 == 1 && ((k2 <= 3 && i2 != 1) || k2 > 3)) {
                    int length3 = sb.length();
                    sb.delete(length3 - k2, length3);
                    in5Var.a--;
                    k2 = k(in5Var.a(), sb2);
                    in5Var.g = null;
                }
            } else if (sb.length() % 3 == 0) {
                if (n4o.M(in5Var.a, r(), in5Var.d) != r()) {
                    in5Var.b = 0;
                    break;
                }
            }
        }
        v(in5Var, sb);
    }

    @Override // defpackage.q02
    public long g(zz0 zz0Var, int i2) {
        return ((aej) zz0Var.e).k(i2);
    }

    @Override // defpackage.um6
    public void h(Object obj) {
        ((List) obj).clear();
    }

    public boolean i() {
        return false;
    }

    public int k(char c2, StringBuilder sb) {
        if (c2 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c2 >= '0' && c2 <= '9') {
            sb.append((char) (c2 - ','));
            return 1;
        }
        if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) (c2 - '3'));
            return 1;
        }
        if (c2 < ' ') {
            sb.append((char) 0);
            sb.append(c2);
            return 2;
        }
        if (c2 >= '!' && c2 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c2 - '!'));
            return 2;
        }
        if (c2 >= ':' && c2 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c2 - '+'));
            return 2;
        }
        if (c2 >= '[' && c2 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c2 - 'E'));
            return 2;
        }
        if (c2 < '`' || c2 > 127) {
            sb.append("\u0001\u001e");
            return k((char) (c2 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c2 - '`'));
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r5 == r9) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(k6g k6gVar, CancellationSignal cancellationSignal, Callable callable, sq3 sq3Var) {
        su3 su3Var;
        int i2;
        if (sq3Var instanceof su3) {
            su3Var = (su3) sq3Var;
            int i3 = su3Var.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                su3Var.x = i3 - Integer.MIN_VALUE;
                Object obj = su3Var.v;
                Object obj2 = lu3.a;
                i2 = su3Var.x;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (k6gVar.isOpenInternal$room_runtime() && k6gVar.inTransaction()) {
                        return callable.call();
                    }
                    su3Var.r = k6gVar;
                    su3Var.s = cancellationSignal;
                    su3Var.t = callable;
                    su3Var.x = 1;
                    obj = gz8.I(k6gVar, false, su3Var);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    callable = su3Var.t;
                    cancellationSignal = su3Var.s;
                    k6gVar = su3Var.r;
                    y6a.M(obj);
                }
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                su3Var.r = k6gVar;
                su3Var.s = cancellationSignal;
                su3Var.t = callable;
                su3Var.u = coroutineContext;
                su3Var.x = 2;
                lj2 lj2Var = new lj2(1, z9a.b(su3Var));
                lj2Var.t();
                int i4 = 11;
                lj2Var.v(new zi(i4, cancellationSignal, xw3.L(k6gVar.getCoroutineScope(), coroutineContext, null, new r1(callable, lj2Var, rq3Var, i4), 2)));
                Object q = lj2Var.q();
                return q != obj2 ? obj2 : q;
            }
        }
        su3Var = new su3(this, sq3Var);
        Object obj3 = su3Var.v;
        Object obj22 = lu3.a;
        i2 = su3Var.x;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        CoroutineContext coroutineContext2 = (CoroutineContext) obj3;
        su3Var.r = k6gVar;
        su3Var.s = cancellationSignal;
        su3Var.t = callable;
        su3Var.u = coroutineContext2;
        su3Var.x = 2;
        lj2 lj2Var2 = new lj2(1, z9a.b(su3Var));
        lj2Var2.t();
        int i42 = 11;
        lj2Var2.v(new zi(i42, cancellationSignal, xw3.L(k6gVar.getCoroutineScope(), coroutineContext2, null, new r1(callable, lj2Var2, rq3Var2, i42), 2)));
        Object q2 = lj2Var2.q();
        if (q2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r5 == r9) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(k6g k6gVar, boolean z, Callable callable, sq3 sq3Var) {
        ru3 ru3Var;
        int i2;
        if (sq3Var instanceof ru3) {
            ru3Var = (ru3) sq3Var;
            int i3 = ru3Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ru3Var.u = i3 - Integer.MIN_VALUE;
                Object obj = ru3Var.s;
                Object obj2 = lu3.a;
                i2 = ru3Var.u;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (k6gVar.isOpenInternal$room_runtime() && k6gVar.inTransaction()) {
                        return callable.call();
                    }
                    ru3Var.r = callable;
                    ru3Var.u = 1;
                    obj = gz8.I(k6gVar, z, ru3Var);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    callable = ru3Var.r;
                    y6a.M(obj);
                }
                ip1 ip1Var = new ip1(callable, rq3Var, 6);
                ru3Var.r = null;
                ru3Var.u = 2;
                Object R = xw3.R((CoroutineContext) obj, ip1Var, ru3Var);
                return R != obj2 ? obj2 : R;
            }
        }
        ru3Var = new ru3(this, sq3Var);
        Object obj3 = ru3Var.s;
        Object obj22 = lu3.a;
        i2 = ru3Var.u;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        ip1 ip1Var2 = new ip1(callable, rq3Var2, 6);
        ru3Var.r = null;
        ru3Var.u = 2;
        Object R2 = xw3.R((CoroutineContext) obj3, ip1Var2, ru3Var);
        if (R2 != obj22) {
        }
    }

    public Object p() {
        throw new IllegalStateException("");
    }

    public int r() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(Context context, String str, int i2, awj[] awjVarArr, sq3 sq3Var) {
        cu9 cu9Var;
        int i3;
        nr9 b2;
        if (sq3Var instanceof cu9) {
            cu9Var = (cu9) sq3Var;
            int i4 = cu9Var.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cu9Var.u = i4 - Integer.MIN_VALUE;
                Object obj = cu9Var.s;
                lu3 lu3Var = lu3.a;
                i3 = cu9Var.u;
                if (i3 != 0) {
                    y6a.M(obj);
                    apf a = ajh.a(context);
                    ht9 ht9Var = new ht9(context);
                    ht9Var.c = str;
                    z8e.Q(ht9Var, context, i2, null, null);
                    awj[] awjVarArr2 = (awj[]) Arrays.copyOf(awjVarArr, awjVarArr.length);
                    sl6 sl6Var = st9.a;
                    st9.b(ht9Var, ph0.X(awjVarArr2));
                    nt9 a2 = ht9Var.a();
                    cu9Var.r = context;
                    cu9Var.u = 1;
                    obj = a.c(a2, cu9Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = cu9Var.r;
                    y6a.M(obj);
                }
                b2 = ((wt9) obj).b();
                if (b2 != null) {
                    return null;
                }
                Resources resources = context.getResources();
                resources.getClass();
                return rfo.t(b2, resources);
            }
        }
        cu9Var = new cu9(this, sq3Var);
        Object obj2 = cu9Var.s;
        lu3 lu3Var2 = lu3.a;
        i3 = cu9Var.u;
        if (i3 != 0) {
        }
        b2 = ((wt9) obj2).b();
        if (b2 != null) {
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "TextFieldLineLimits.SingleLine";
            default:
                return super.toString();
        }
    }

    public void v(in5 in5Var, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int length3 = ((StringBuilder) in5Var.f).length() + length;
        in5Var.d(length3);
        int i2 = ((hpi) in5Var.g).b - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                y(in5Var, sb);
            }
            if (in5Var.b()) {
                in5Var.e((char) 254);
            }
        } else if (i2 == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                y(in5Var, sb);
            }
            if (in5Var.b()) {
                in5Var.e((char) 254);
            }
            in5Var.a--;
        } else {
            if (length2 != 0) {
                a70.r("Unexpected case. Please report!");
                return;
            }
            while (sb.length() >= 3) {
                y(in5Var, sb);
            }
            if (i2 > 0 || in5Var.b()) {
                in5Var.e((char) 254);
            }
        }
        in5Var.b = 0;
    }
}
