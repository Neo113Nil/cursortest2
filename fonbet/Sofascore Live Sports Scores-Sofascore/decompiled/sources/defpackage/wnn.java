package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.d;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.OffersBannerLayout;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wnn implements i72 {
    public static final tc3 a = new tc3(-733232229, new qs2(23), false);
    public static final tc3 b = new tc3(-1795434381, new qs2(24), false);
    public static final tc3 c = new tc3(1990730023, new pd3(24), false);
    public static final tc3 d = new tc3(-348288136, new ud3(16), false);
    public static final pvd e = new pvd(16);
    public static Constructor f;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;

    public static final xtc A(xtc xtcVar, uah uahVar) {
        return s02.O(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, uahVar, 518143);
    }

    public static final xtc B(xtc xtcVar) {
        return s02.O(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 520191);
    }

    public static final int C(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        zzl.g(c2, "Unexpected hex digit: ");
        return 0;
    }

    public static final Integer D(EsportsGame esportsGame, Context context) {
        Integer homeTeamStartingSide$default;
        context.getClass();
        bg5 bg5Var = (bg5) CollectionsKt.a0((esportsGame == null || (homeTeamStartingSide$default = EsportsGame.getHomeTeamStartingSide$default(esportsGame, null, 1, null)) == null) ? -1 : homeTeamStartingSide$default.intValue(), bg5.d);
        if (bg5Var != null) {
            return Integer.valueOf(context.getColor(bg5Var.b));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte E(Context context) {
        Byte b2;
        context.getClass();
        if (eq3.b(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            if (eq3.b(context, "android.permission.READ_PHONE_STATE") != 0) {
                return (byte) 0;
            }
            Object systemService = context.getSystemService("phone");
            systemService.getClass();
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            ad2 ad2Var = oc3.a;
            switch (Build.VERSION.SDK_INT >= 29 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return (byte) 4;
            }
        }
        Object systemService2 = context.getSystemService("connectivity");
        systemService2.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
        ad2 ad2Var2 = oc3.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            byte b3 = 1;
            if (!networkCapabilities.hasTransport(3)) {
                if (networkCapabilities.hasTransport(1)) {
                    b3 = 2;
                } else if (networkCapabilities.hasTransport(0)) {
                    int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
                    b3 = linkDownstreamBandwidthKbps < 1000 ? (byte) 3 : linkDownstreamBandwidthKbps < 10000 ? (byte) 5 : (byte) 6;
                } else {
                    b3 = 0;
                }
            }
            b2 = Byte.valueOf(b3);
        } else {
            b2 = null;
        }
        byte byteValue = b2 != null ? b2.byteValue() : (byte) 0;
        Byte valueOf = (ph0.t(new byte[]{0, 3}, byteValue) && eq3.b(context, "android.permission.READ_PHONE_STATE") == 0) ? null : Byte.valueOf(byteValue);
        if (valueOf != null) {
            return valueOf.byteValue();
        }
        Object systemService3 = context.getSystemService("phone");
        systemService3.getClass();
        TelephonyManager telephonyManager2 = (TelephonyManager) systemService3;
        switch (Build.VERSION.SDK_INT >= 29 ? telephonyManager2.getDataNetworkType() : telephonyManager2.getNetworkType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return (byte) 4;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
                return (byte) 5;
            case 13:
                return (byte) 6;
            case 18:
            case 20:
                return (byte) 2;
            case 19:
            default:
                return (byte) 3;
        }
    }

    public static final Integer F(EsportsGame esportsGame, Context context) {
        Integer homeTeamStartingSide$default;
        context.getClass();
        bg5 bg5Var = (bg5) CollectionsKt.a0((esportsGame == null || (homeTeamStartingSide$default = EsportsGame.getHomeTeamStartingSide$default(esportsGame, null, 1, null)) == null) ? -1 : homeTeamStartingSide$default.intValue(), bg5.d);
        if (bg5Var != null) {
            return Integer.valueOf(context.getColor(bg5Var.a));
        }
        return null;
    }

    public static final String G(Event event, boolean z, of3 of3Var) {
        Integer winnerCode$default;
        int i;
        event.getClass();
        Integer winnerCode$default2 = Event.getWinnerCode$default(event, null, 1, null);
        boolean z2 = (winnerCode$default2 != null && winnerCode$default2.intValue() == 1 && z) || !((winnerCode$default = Event.getWinnerCode$default(event, null, 1, null)) == null || winnerCode$default.intValue() != 2 || z);
        Integer winnerCode$default3 = Event.getWinnerCode$default(event, null, 1, null);
        if ((winnerCode$default3 != null && winnerCode$default3.intValue() == 1) || (winnerCode$default3 != null && winnerCode$default3.intValue() == 2)) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(115282081);
            if (z2) {
                av8Var.d0(115282429);
                lqc lqcVar = lqc.WIN;
                i = R.string.win_short;
            } else {
                av8Var.d0(115284468);
                lqc lqcVar2 = lqc.WIN;
                i = R.string.losses_short;
            }
            String v = oea.v(i, av8Var);
            av8Var.s(false);
            av8Var.s(false);
            return v;
        }
        if (winnerCode$default3 != null && winnerCode$default3.intValue() == 3) {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(115288222);
            lqc lqcVar3 = lqc.WIN;
            String v2 = oea.v(R.string.draw_short, av8Var2);
            av8Var2.s(false);
            return v2;
        }
        if (winnerCode$default3 != null && winnerCode$default3.intValue() == 4) {
            av8 av8Var3 = (av8) of3Var;
            av8Var3.d0(115291268);
            lqc lqcVar4 = lqc.WIN;
            String v3 = oea.v(R.string.no_contest_short, av8Var3);
            av8Var3.s(false);
            return v3;
        }
        av8 av8Var4 = (av8) of3Var;
        av8Var4.d0(115293854);
        lqc lqcVar5 = lqc.WIN;
        String v4 = oea.v(R.string.minus, av8Var4);
        av8Var4.s(false);
        return v4;
    }

    public static Object H(Class cls, Object obj, Method method, Object[] objArr) {
        Constructor constructor = f;
        if (constructor == null) {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            f = constructor;
        }
        return ((MethodHandles.Lookup) constructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static boolean I(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || PlayerKt.AMERICAN_FOOTBALL_TIGHT_END.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static int J(int i, j9e j9eVar) {
        switch (i) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return j9eVar.A() + 1;
            case 7:
                return j9eVar.H() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i - 8);
            default:
                return -1;
        }
    }

    public static final void K(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            u3a.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        u3a.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final int L(float f2, float[] fArr, int i) {
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = f2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, of3 of3Var, xtc xtcVar, boolean z, boolean z2) {
        xtc xtcVar2;
        av8 av8Var;
        xtc xtcVar3;
        eqf u;
        Object eb4Var;
        Boolean bool;
        a99 a99Var;
        q50 q50Var;
        q50 q50Var2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2048971360);
        int i3 = (av8Var2.h(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= av8Var2.h(z2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var2.T(i3 & 1, (i3 & 147) == 146)) {
                av8Var = av8Var2;
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i4 != 0 ? utcVar : xtcVar2;
                cdi b2 = a60.b(z ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(200, 0, null, 6), "chevronRotation", av8Var2, 3120, 20);
                boolean z3 = z && z2;
                Object O = av8Var2.O();
                a99 a99Var2 = nf3.a;
                if (O == a99Var2) {
                    O = ml4.b(-90.0f);
                    av8Var2.n0(O);
                }
                q50 q50Var3 = (q50) O;
                Object O2 = av8Var2.O();
                if (O2 == a99Var2) {
                    O2 = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    av8Var2.n0(O2);
                }
                q50 q50Var4 = (q50) O2;
                Boolean valueOf = Boolean.valueOf(z3);
                Boolean valueOf2 = Boolean.valueOf(z);
                boolean h2 = av8Var2.h(z3) | av8Var2.i(q50Var4) | av8Var2.i(q50Var3) | ((i3 & 14) == 4);
                Object O3 = av8Var2.O();
                if (h2 || O3 == a99Var2) {
                    av8Var = av8Var2;
                    bool = valueOf;
                    a99Var = a99Var2;
                    q50Var = q50Var3;
                    q50Var2 = q50Var4;
                    eb4Var = new eb4(z3, q50Var2, q50Var, z, (rq3) null);
                    av8Var.n0(eb4Var);
                } else {
                    av8Var = av8Var2;
                    a99Var = a99Var2;
                    eb4Var = O3;
                    q50Var = q50Var3;
                    q50Var2 = q50Var4;
                    bool = valueOf;
                }
                hz8.q(bool, valueOf2, (Function2) eb4Var, av8Var);
                xtc z4 = xtcVar4.z(bkh.c);
                k1c c2 = e12.c(uxf.g, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, z4);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                e12.a(0, av8Var, yso.o(bkh.l(utcVar, 40.0f), 1.0f, lz.D(R.color.n_lv_5, av8Var), o7g.a));
                if (((Number) q50Var2.d()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    av8Var.d0(-969824109);
                    long D = lz.D(R.color.primary_default, av8Var);
                    xtc l = bkh.l(utcVar, 40.0f);
                    boolean f2 = av8Var.f(D) | av8Var.i(q50Var2) | av8Var.i(q50Var);
                    Object O4 = av8Var.O();
                    if (f2 || O4 == a99Var) {
                        O4 = new bv2(D, q50Var2, q50Var, 0);
                        av8Var.n0(O4);
                    }
                    lz.d(6, av8Var, l, (Function1) O4);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-969231172);
                    av8Var.s(false);
                }
                kq9.b(s6a.N(R.drawable.ic_chevron_down, 6, av8Var), null, haa.v(bkh.l(utcVar, 24.0f), ((Number) b2.getValue()).floatValue()), lz.D(R.color.neutral_default, av8Var), av8Var, 48, 0);
                av8Var.s(true);
                xtcVar3 = xtcVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new cv2(z, z2, xtcVar3, i, i2);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var2.T(i3 & 1, (i3 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(axj axjVar, xtc xtcVar, j38 j38Var, Function1 function1, tc3 tc3Var, of3 of3Var, int i, int i2) {
        Object obj;
        Function1 function12;
        Object obj2;
        eqf u;
        axj axjVar2 = axjVar;
        t01 t01Var = axjVar2.a;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1877370462);
        int i3 = (i & 6) == 0 ? (av8Var.g(axjVar2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = j38Var;
            i3 |= av8Var.i(obj) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            obj = j38Var;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i3 |= av8Var.i(function12) ? a.o : 1024;
            if ((i & 24576) != 0) {
                obj2 = tc3Var;
                i3 |= av8Var.i(obj2) ? 16384 : 8192;
            } else {
                obj2 = tc3Var;
            }
            if (av8Var.T(i3 & 1, (i3 & 9363) == 9362)) {
                av8Var.W();
            } else {
                Object obj3 = nf3.a;
                if (i4 != 0) {
                    Object O = av8Var.O();
                    if (O == obj3) {
                        O = ry.M;
                        av8Var.n0(O);
                    }
                    function12 = (Function1) O;
                }
                Object O2 = av8Var.O();
                Object obj4 = O2;
                if (O2 == obj3) {
                    SnapshotStateList snapshotStateList = new SnapshotStateList();
                    snapshotStateList.add(t01Var.w());
                    av8Var.n0(snapshotStateList);
                    obj4 = snapshotStateList;
                }
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj4;
                Object O3 = av8Var.O();
                if (O3 == obj3) {
                    long[] jArr = qrg.a;
                    O3 = new x0d();
                    av8Var.n0(O3);
                }
                x0d x0dVar = (x0d) O3;
                eoh eohVar = (eoh) axjVar2.d;
                if (Intrinsics.c(t01Var.w(), eohVar.getValue())) {
                    av8Var.d0(321145192);
                    if (snapshotStateList2.size() == 1 && Intrinsics.c(snapshotStateList2.get(0), eohVar.getValue())) {
                        av8Var.d0(321469824);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(321279546);
                        boolean z = (i3 & 14) == 4;
                        Object O4 = av8Var.O();
                        if (z || O4 == obj3) {
                            O4 = new oo(axjVar2, 13);
                            av8Var.n0(O4);
                        }
                        o13.A(snapshotStateList2, (Function1) O4);
                        x0dVar.a();
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                } else {
                    av8Var.d0(321475776);
                    av8Var.s(false);
                }
                if (x0dVar.b(eohVar.getValue())) {
                    av8Var.d0(322279296);
                    av8Var.s(false);
                } else {
                    av8Var.d0(321536443);
                    ListIterator listIterator = snapshotStateList2.listIterator();
                    int i5 = 0;
                    while (true) {
                        hc9 hc9Var = (hc9) listIterator;
                        if (!hc9Var.hasNext()) {
                            i5 = -1;
                            break;
                        } else if (Intrinsics.c(function12.invoke(hc9Var.next()), function12.invoke(eohVar.getValue()))) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i5 == -1) {
                        snapshotStateList2.add(eohVar.getValue());
                    } else {
                        snapshotStateList2.set(i5, eohVar.getValue());
                    }
                    x0dVar.a();
                    int size = snapshotStateList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj5 = snapshotStateList2.get(i6);
                        x0dVar.m(obj5, yqo.H(-934471669, av8Var, new d24(axjVar2, obj, obj5, obj2, 0)));
                        i6++;
                        axjVar2 = axjVar;
                        obj = j38Var;
                        obj2 = tc3Var;
                    }
                    av8Var.s(false);
                }
                k1c c2 = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, xtcVar);
                if3.k7.getClass();
                Function0 function0 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(function0);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.C(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                av8Var.d0(-1312707512);
                int size2 = snapshotStateList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    Object obj6 = snapshotStateList2.get(i7);
                    av8Var.a0(1171574969, function12.invoke(obj6));
                    Function2 function2 = (Function2) x0dVar.g(obj6);
                    if (function2 == null) {
                        av8Var.d0(1959122128);
                    } else {
                        av8Var.d0(1171576145);
                        function2.invoke(av8Var, 0);
                    }
                    av8Var.s(false);
                    av8Var.s(false);
                }
                av8Var.s(false);
                av8Var.s(true);
            }
            Function1 function13 = function12;
            u = av8Var.u();
            if (u == null) {
                u.d = new g50(axjVar, xtcVar, j38Var, function13, tc3Var, i, i2);
                return;
            }
            return;
        }
        function12 = function1;
        if ((i & 24576) != 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) == 9362)) {
        }
        Function1 function132 = function12;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void c(Object obj, xtc xtcVar, j38 j38Var, tc3 tc3Var, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        j38 j38Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-160948176);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? av8Var.g(obj) : av8Var.i(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i & 3072) == 0) {
            i5 |= av8Var.i(tc3Var) ? a.o : 1024;
        }
        if (av8Var.T(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                xtcVar = utc.a;
            }
            xtc xtcVar3 = xtcVar;
            i4k h0 = s02.h0(0, 0, null, 7);
            b(yso.L(obj, null, av8Var, i5 & 14, 2), xtcVar3, h0, null, tc3Var, av8Var, (i5 & 1008) | ((i5 << 3) & 57344), 4);
            xtcVar2 = xtcVar3;
            j38Var2 = h0;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            j38Var2 = j38Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r20(obj, xtcVar2, j38Var2, tc3Var, i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(Object obj, xtc xtcVar, j38 j38Var, String str, tc3 tc3Var, of3 of3Var, int i, int i2) {
        int i3;
        String str2;
        xtc xtcVar2;
        av8 av8Var;
        j38 j38Var2;
        eqf u;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? av8Var2.g(obj) : av8Var2.i(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= av8Var2.i(j38Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str2 = str;
            i3 |= av8Var2.g(str2) ? a.o : 1024;
            if ((i & 24576) == 0) {
                i3 |= av8Var2.i(tc3Var) ? 16384 : 8192;
            }
            if (av8Var2.T(i3 & 1, (i3 & 9363) == 9362)) {
                av8Var2.W();
                xtcVar2 = xtcVar;
                av8Var = av8Var2;
                j38Var2 = j38Var;
            } else {
                xtc xtcVar3 = i4 != 0 ? utc.a : xtcVar;
                j38 h0 = i5 != 0 ? s02.h0(0, 0, null, 7) : j38Var;
                String str3 = i6 != 0 ? "Crossfade" : str2;
                b(yso.L(obj, str3, av8Var2, (i3 & 14) | ((i3 >> 6) & 112), 0), xtcVar3, h0, null, tc3Var, av8Var2, i3 & 58352, 4);
                xtcVar2 = xtcVar3;
                av8Var = av8Var2;
                str2 = str3;
                j38Var2 = h0;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new g50(i, i2, 1, tc3Var, xtcVar2, obj, j38Var2, str2);
                return;
            }
            return;
        }
        str2 = str;
        if ((i & 24576) == 0) {
        }
        if (av8Var2.T(i3 & 1, (i3 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final ox4 e(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        og8 a2 = pg8.a(f2);
        if (a2 == null) {
            a2 = new u7b(f2);
        }
        return new ox4(f3, f2, a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(Event event, xtc xtcVar, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        String w;
        String str;
        String valueOf;
        boolean z;
        String valueOf2;
        Event event2 = event;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2035938356);
        int i4 = i | (av8Var.i(event2) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i4 | (av8Var.g(xtcVar2) ? 32 : 16);
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc xtcVar3 = i5 != 0 ? utcVar : xtcVar2;
            xtc d2 = bkh.d(xtcVar3, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
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
            Integer valueOf3 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf3, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.m;
            kg0 kg0Var = ww9.f;
            xtc d3 = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d3);
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
            Integer v = ok3.v(event2);
            td4.y(v != null ? v.intValue() : event2.getTournament().getId(), 48, 12, av8Var, bkh.l(utcVar, 24.0f), null, false);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            UniqueTournament uniqueTournament = event2.getTournament().getUniqueTournament();
            if (uniqueTournament == null || (w = tba.x(uniqueTournament)) == null) {
                w = tba.w(event2.getTournament());
            }
            yf8 yf8Var = xth.a;
            xtc xtcVar4 = xtcVar3;
            udj.c(w, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
            bf3.t(av8Var, true, utcVar, 24.0f, av8Var);
            wxf wxfVar = ww9.b;
            xtc d4 = bkh.d(utcVar, 1.0f);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d4);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            event2 = event;
            boolean z2 = event2 instanceof MmaEvent;
            String str2 = "";
            if (z2) {
                av8Var.d0(-116277325);
                valueOf = G(event2, true, av8Var);
                av8Var.s(false);
            } else {
                av8Var.d0(690419513);
                av8Var.s(false);
                Integer display = Event.getHomeScore$default(event2, null, 1, null).getDisplay();
                if (display == null || (valueOf = String.valueOf(display.intValue())) == null) {
                    str = "";
                    Team homeTeam$default = Event.getHomeTeam$default(event2, null, 1, null);
                    Integer winnerCode$default = Event.getWinnerCode$default(event2, null, 1, null);
                    boolean z3 = winnerCode$default != null && winnerCode$default.intValue() == 1;
                    boolean E = ok3.E(event2);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    s(homeTeam$default, str, z3, E, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
                    nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                    if (z2) {
                        av8Var.d0(-116260812);
                        z = false;
                        str2 = G(event2, false, av8Var);
                        av8Var.s(false);
                    } else {
                        z = false;
                        av8Var.d0(690932377);
                        av8Var.s(false);
                        Integer display2 = Event.getAwayScore$default(event2, null, 1, null).getDisplay();
                        if (display2 != null && (valueOf2 = String.valueOf(display2.intValue())) != null) {
                            str2 = valueOf2;
                        }
                    }
                    Team awayTeam$default = Event.getAwayTeam$default(event2, null, 1, null);
                    Integer winnerCode$default2 = Event.getWinnerCode$default(event2, null, 1, null);
                    boolean z4 = (winnerCode$default2 != null && winnerCode$default2.intValue() == 2) ? true : z;
                    boolean E2 = ok3.E(event2);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    s(awayTeam$default, str2, z4, E2, new goa(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
                    bf3.t(av8Var, true, utcVar, 16.0f, av8Var);
                    long startTimestamp = event2.getStartTimestamp();
                    bi4 bi4Var = bi4.PATTERN_DMY;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    udj.c(fc6.i(startTimestamp, hk4.a(bi4Var.d())), bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 130040);
                    av8Var = av8Var;
                    av8Var.s(true);
                    xtcVar2 = xtcVar4;
                }
            }
            str = valueOf;
            Team homeTeam$default2 = Event.getHomeTeam$default(event2, null, 1, null);
            Integer winnerCode$default3 = Event.getWinnerCode$default(event2, null, 1, null);
            if (winnerCode$default3 != null) {
                boolean E3 = ok3.E(event2);
                if (1.0f <= 0.0d) {
                }
                s(homeTeam$default2, str, z3, E3, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                if (z2) {
                }
                Team awayTeam$default2 = Event.getAwayTeam$default(event2, null, 1, null);
                Integer winnerCode$default22 = Event.getWinnerCode$default(event2, null, 1, null);
                if (winnerCode$default22 != null) {
                    boolean E22 = ok3.E(event2);
                    if (1.0f <= 0.0d) {
                    }
                    s(awayTeam$default2, str2, z4, E22, new goa(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
                    bf3.t(av8Var, true, utcVar, 16.0f, av8Var);
                    long startTimestamp2 = event2.getStartTimestamp();
                    bi4 bi4Var2 = bi4.PATTERN_DMY;
                    ConcurrentHashMap concurrentHashMap2 = hk4.a;
                    udj.c(fc6.i(startTimestamp2, hk4.a(bi4Var2.d())), bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 130040);
                    av8Var = av8Var;
                    av8Var.s(true);
                    xtcVar2 = xtcVar4;
                }
                boolean E222 = ok3.E(event2);
                if (1.0f <= 0.0d) {
                }
                s(awayTeam$default2, str2, z4, E222, new goa(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
                bf3.t(av8Var, true, utcVar, 16.0f, av8Var);
                long startTimestamp22 = event2.getStartTimestamp();
                bi4 bi4Var22 = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap22 = hk4.a;
                udj.c(fc6.i(startTimestamp22, hk4.a(bi4Var22.d())), bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 130040);
                av8Var = av8Var;
                av8Var.s(true);
                xtcVar2 = xtcVar4;
            }
            boolean E32 = ok3.E(event2);
            if (1.0f <= 0.0d) {
            }
            s(homeTeam$default2, str, z3, E32, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            if (z2) {
            }
            Team awayTeam$default22 = Event.getAwayTeam$default(event2, null, 1, null);
            Integer winnerCode$default222 = Event.getWinnerCode$default(event2, null, 1, null);
            if (winnerCode$default222 != null) {
            }
            boolean E2222 = ok3.E(event2);
            if (1.0f <= 0.0d) {
            }
            s(awayTeam$default22, str2, z4, E2222, new goa(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
            bf3.t(av8Var, true, utcVar, 16.0f, av8Var);
            long startTimestamp222 = event2.getStartTimestamp();
            bi4 bi4Var222 = bi4.PATTERN_DMY;
            ConcurrentHashMap concurrentHashMap222 = hk4.a;
            udj.c(fc6.i(startTimestamp222, hk4.a(bi4Var222.d())), bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = xtcVar4;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(i, i2, 10, event2, xtcVar2);
        }
    }

    public static final void g(Long l, xtc xtcVar, boolean z, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        xtc xtcVar2;
        utc utcVar;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(100002022);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar2 = utc.a;
            xtc g2 = bkh.g(utcVar2, 34.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.f, uxf.p, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, g2);
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
            if (z || l == null) {
                utcVar = utcVar2;
                av8Var2.d0(94421739);
                String v = oea.v(R.string.voting_open, av8Var2);
                long D = lz.D(R.color.n_lv_1, av8Var2);
                yf8 yf8Var = xth.a;
                udj.c(v, null, D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.g(), av8Var2, 0, 24960, 109562);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                av8Var2.d0(94736110);
                cdi M = hda.M(l.longValue(), av8Var2, i3 & 14);
                String v2 = oea.v(R.string.voting_closes_in, av8Var2);
                long D2 = lz.D(R.color.n_lv_1, av8Var2);
                yf8 yf8Var2 = xth.a;
                utcVar = utcVar2;
                udj.c(v2, null, D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
                long j = ((js8) M.getValue()).c;
                wd5 wd5Var = xd5.b;
                be5 be5Var = be5.SECONDS;
                long S = wkn.S(j, be5Var);
                udj.c(String.format(dla.d(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(xd5.k(S, be5.HOURS)), Long.valueOf(xd5.k(S, be5.MINUTES) % 60), Long.valueOf(xd5.k(S, be5Var) % 60)}, 3)), null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(l, xtcVar2, z, i, 5);
        }
    }

    public static final void h(boolean z, ev6 ev6Var, BrandingFantasyCompetition brandingFantasyCompetition, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        brandingFantasyCompetition.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1267518040);
        int i2 = (av8Var.h(z) ? 4 : 2) | i | (av8Var.g(ev6Var) ? 32 : 16) | (av8Var.i(brandingFantasyCompetition) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new ec6(26);
                av8Var.n0(O);
            }
            un0.p(z, (Function0) O, null, yqo.H(-1002620369, av8Var, new vn6(brandingFantasyCompetition, ev6Var)), av8Var, (i2 & 14) | 3120);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(z, ev6Var, brandingFantasyCompetition, xtcVar2, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023b  */
    /* JADX WARN: Type inference failed for: r9v22, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(y97 y97Var, ct8 ct8Var, Function2 function2, Function1 function1, xtc xtcVar, qug qugVar, boolean z, of3 of3Var, int i) {
        Function2 function22;
        xtc xtcVar2;
        av8 av8Var;
        boolean z2;
        boolean booleanValue;
        xtc xtcVar3;
        a99 a99Var;
        ?? r9;
        boolean z3;
        Object O;
        int i2;
        float f2;
        int i3;
        boolean z4;
        Object O2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1568589177);
        int i4 = i | (av8Var2.g(y97Var) ? 4 : 2) | (av8Var2.i(ct8Var) ? 32 : 16) | (av8Var2.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024) | 24576 | (av8Var2.g(qugVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 1572864;
        if (av8Var2.T(i4 & 1, (599187 & i4) != 599186)) {
            av8Var2.Y();
            int i5 = i & 1;
            utc utcVar = utc.a;
            a99 a99Var2 = nf3.a;
            if (i5 == 0 || av8Var2.B()) {
                Object O3 = av8Var2.O();
                if (O3 == a99Var2) {
                    yea yeaVar = j58.a;
                    e58 f3 = e58.f();
                    f3.getClass();
                    nxf[] nxfVarArr = nxf.a;
                    O3 = Boolean.valueOf(f3.c("fantasy_h2h_leagues_enabled"));
                    av8Var2.n0(O3);
                }
                booleanValue = ((Boolean) O3).booleanValue();
                xtcVar3 = utcVar;
            } else {
                av8Var2.W();
                xtcVar3 = xtcVar;
                booleanValue = z;
            }
            av8Var2.t();
            wd8 wd8Var = (wd8) av8Var2.k(dh3.i);
            Object O4 = av8Var2.O();
            int i6 = 5;
            if (O4 == a99Var2) {
                O4 = goh.b(new fu5(qugVar, i6));
                av8Var2.n0(O4);
            }
            cdi cdiVar = (cdi) O4;
            xtc o = tol.o(bkh.d(xtcVar3, 1.0f));
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, o);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            xtc xtcVar4 = xtcVar3;
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            xtc d0 = l98.d0(hkg.u0(ljg.g(av8Var2, C, f50Var3, 1.0f, false), qugVar, false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            xtc d02 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            String str = y97Var.a;
            String v = oea.v(R.string.fantasy_league_name, av8Var2);
            String v2 = oea.v(R.string.fantasy_league_name_restriction, av8Var2);
            t28 C3 = r4a.C(30);
            int i7 = i4 & 896;
            boolean z5 = i7 == 256;
            Object O5 = av8Var2.O();
            if (z5) {
                a99Var = a99Var2;
            } else {
                a99Var = a99Var2;
                if (O5 != a99Var) {
                    r9 = 1;
                    boolean z6 = r9;
                    a99 a99Var3 = a99Var;
                    q5a.r(str, d02, null, (Function1) O5, null, null, null, v, null, v2, null, false, C3, 0L, 0, 0, null, 0L, 0L, 6, false, false, false, av8Var2, 48, 384, 6, 15723892);
                    xtc d03 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, z6 ? 1 : 0);
                    String str2 = y97Var.b;
                    String v3 = oea.v(R.string.fantasy_league_description, av8Var2);
                    String v4 = oea.v(R.string.fantasy_league_description_restriction, av8Var2);
                    t28 C4 = r4a.C(1000);
                    z3 = i7 != 256 ? z6 ? 1 : 0 : false;
                    O = av8Var2.O();
                    if (!z3 || O == a99Var3) {
                        function22 = function2;
                        O = new su5(2, function22);
                        av8Var2.n0(O);
                    } else {
                        function22 = function2;
                    }
                    q5a.r(str2, d03, null, (Function1) O, null, null, null, v3, null, v4, null, false, C4, 0L, 0, 0, null, 0L, 0L, 0, false, false, false, av8Var2, 48, 384, 384, 12578164);
                    if (booleanValue) {
                        i2 = i4;
                        f2 = 8.0f;
                        i3 = 5;
                        av8Var2.d0(1625567421);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1625258506);
                        f2 = 8.0f;
                        xtc d04 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, z6 ? 1 : 0);
                        FantasyLeagueGameType fantasyLeagueGameType = y97Var.c;
                        i2 = i4;
                        boolean i8 = av8Var2.i(wd8Var) | ((i2 & 7168) == 2048 ? z6 ? 1 : 0 : false);
                        Object O6 = av8Var2.O();
                        if (i8 || O6 == a99Var3) {
                            i3 = 5;
                            O6 = new w47(i3, wd8Var, function1);
                            av8Var2.n0(O6);
                        } else {
                            i3 = 5;
                        }
                        hz8.m(fantasyLeagueGameType, (Function1) O6, d04, av8Var2, 384);
                        av8Var2.s(false);
                    }
                    w1l.s(utcVar, 48.0f, av8Var2, z6);
                    String v5 = oea.v(R.string.fantasy_create_button, av8Var2);
                    int i9 = i2;
                    boolean z7 = y97Var.f;
                    boolean z8 = y97Var.e;
                    xtc b0 = l98.b0(ml4.f0(n9e.q(d2a.E(bkh.d(utcVar, 1.0f), !((Boolean) cdiVar.getValue()).booleanValue() ? f2 : 0.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var2), oyn.e)), 16.0f);
                    z4 = ((i9 & 112) != 32 ? z6 ? 1 : 0 : false) | ((i9 & 14) != 4 ? z6 ? 1 : 0 : false);
                    O2 = av8Var2.O();
                    if (!z4 || O2 == a99Var3) {
                        O2 = new n37(i3, ct8Var, y97Var);
                        av8Var2.n0(O2);
                    }
                    mha.h(v5, (Function0) O2, b0, null, null, z7, z8, false, 0L, 0, 0, av8Var2, 0, 0, 1944);
                    av8Var2.s(z6);
                    av8Var = av8Var2;
                    z2 = booleanValue;
                    xtcVar2 = xtcVar4;
                }
            }
            r9 = 1;
            O5 = new su5(r9, function2);
            av8Var2.n0(O5);
            boolean z62 = r9;
            a99 a99Var32 = a99Var;
            q5a.r(str, d02, null, (Function1) O5, null, null, null, v, null, v2, null, false, C3, 0L, 0, 0, null, 0L, 0L, 6, false, false, false, av8Var2, 48, 384, 6, 15723892);
            xtc d032 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, z62 ? 1 : 0);
            String str22 = y97Var.b;
            String v32 = oea.v(R.string.fantasy_league_description, av8Var2);
            String v42 = oea.v(R.string.fantasy_league_description_restriction, av8Var2);
            t28 C42 = r4a.C(1000);
            if (i7 != 256) {
            }
            O = av8Var2.O();
            if (z3) {
            }
            function22 = function2;
            O = new su5(2, function22);
            av8Var2.n0(O);
            q5a.r(str22, d032, null, (Function1) O, null, null, null, v32, null, v42, null, false, C42, 0L, 0, 0, null, 0L, 0L, 0, false, false, false, av8Var2, 48, 384, 384, 12578164);
            if (booleanValue) {
            }
            w1l.s(utcVar, 48.0f, av8Var2, z62);
            String v52 = oea.v(R.string.fantasy_create_button, av8Var2);
            int i92 = i2;
            boolean z72 = y97Var.f;
            boolean z82 = y97Var.e;
            xtc b02 = l98.b0(ml4.f0(n9e.q(d2a.E(bkh.d(utcVar, 1.0f), !((Boolean) cdiVar.getValue()).booleanValue() ? f2 : 0.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var2), oyn.e)), 16.0f);
            z4 = ((i92 & 112) != 32 ? z62 ? 1 : 0 : false) | ((i92 & 14) != 4 ? z62 ? 1 : 0 : false);
            O2 = av8Var2.O();
            if (!z4) {
            }
            O2 = new n37(i3, ct8Var, y97Var);
            av8Var2.n0(O2);
            mha.h(v52, (Function0) O2, b02, null, null, z72, z82, false, 0L, 0, 0, av8Var2, 0, 0, 1944);
            av8Var2.s(z62);
            av8Var = av8Var2;
            z2 = booleanValue;
            xtcVar2 = xtcVar4;
        } else {
            function22 = function2;
            av8Var2.W();
            xtcVar2 = xtcVar;
            av8Var = av8Var2;
            z2 = z;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rc7(y97Var, ct8Var, function22, function1, xtcVar2, qugVar, z2, i);
        }
    }

    public static final void j(boolean z, boolean z2, int i, boolean z3, Function1 function1, Function0 function0, xtc xtcVar, qug qugVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        xtc xtcVar3;
        zg3 zg3Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1252755225);
        int i3 = i2 | (av8Var.h(z) ? 4 : 2) | (av8Var.h(z2) ? 32 : 16) | (av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z3) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 1572864 | (av8Var.g(qugVar) ? 8388608 : 4194304);
        if (av8Var.T(i3 & 1, (i3 & 4793491) != 4793490)) {
            av8Var.Y();
            int i4 = i2 & 1;
            utc utcVar = utc.a;
            if (i4 == 0 || av8Var.B()) {
                xtcVar3 = utcVar;
            } else {
                av8Var.W();
                xtcVar3 = xtcVar;
            }
            av8Var.t();
            Context context = (Context) av8Var.k(nz.b);
            xtc f0 = l98.f0(tol.o(bkh.d(hkg.u0(xtcVar3, qugVar, false, 14), 1.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            xtc xtcVar4 = xtcVar3;
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
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
            xtc d0 = l98.d0(n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var), o7g.a(16.0f)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f("");
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            sha.a(0, 2, av8Var, null, oea.v(R.string.fantasy_private_league, av8Var));
            String g2 = bf3.g(8.0f, R.string.fantasy_league_join_text, av8Var, av8Var, utcVar);
            yf8 yf8Var = xth.a;
            int i5 = 0;
            udj.c(g2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            String str = (String) e1dVar.getValue();
            long D = lz.D(R.color.surface_1, av8Var);
            boolean z4 = (z || z2) ? false : true;
            String v = oea.v(R.string.fantasy_league_code, av8Var);
            String v2 = oea.v(R.string.fantasy_league_join_code_error, av8Var);
            int i6 = 5;
            t28 t28Var = new t28(r4a.C(5), new t28(p4a.b, new so(pie.a.P().c())));
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new m27(i5);
                av8Var.n0(O2);
            }
            t28 t28Var2 = new t28(t28Var, (q4a) O2);
            Object O3 = av8Var.O();
            int i7 = 3;
            if (O3 == a99Var) {
                O3 = new fw6(i7, e1dVar);
                av8Var.n0(O3);
            }
            q5a.r(str, null, null, (Function1) O3, null, null, null, v, null, null, v2, z3, t28Var2, D, 0, 0, null, 0L, 0L, 0, z4, false, false, av8Var, 3072, (i3 >> 6) & 112, 0, 14656374);
            String g3 = bf3.g(24.0f, R.string.button_join_private_league, av8Var, av8Var, utcVar);
            boolean z5 = !z2 && ((String) e1dVar.getValue()).length() == 5;
            xtc d2 = bkh.d(utcVar, 1.0f);
            boolean z6 = (i3 & 57344) == 16384;
            Object O4 = av8Var.O();
            if (z6 || O4 == a99Var) {
                O4 = new s91(function1, e1dVar, i6);
                av8Var.n0(O4);
            }
            mha.h(g3, (Function0) O4, d2, null, null, z5, z, false, 0L, 0, 0, av8Var, ((i3 << 18) & 3670016) | 384, 0, 1944);
            w1l.s(utcVar, 16.0f, av8Var, true);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            xtc d02 = l98.d0(n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var), o7g.a(16.0f)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            xtc d3 = bkh.d(utcVar, 1.0f);
            l8g a5 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            String v3 = oea.v(R.string.fantasy_random_league, av8Var);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            sha.a(0, 0, av8Var, new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).z(new ebl(mo.a)), v3);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            ebl eblVar = new ebl(mo.a);
            context.getClass();
            udj.c(fc6.g(i, 3, hkg.c0(context) ? "\\" : "/"), eblVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(5), 0L, 2, false, 0, 0, null, xth.j(), av8Var, 0, 384, 125944);
            bf3.t(av8Var, true, utcVar, 8.0f, av8Var);
            udj.c(oea.v(R.string.fantasy_random_league_body_text, av8Var), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            mha.h(bf3.g(24.0f, R.string.button_join_random_league, av8Var, av8Var, utcVar), function0, bkh.d(utcVar, 1.0f), null, null, !z && i < 3, z2, false, 0L, 0, 0, av8Var, ((i3 >> 12) & 112) | 384 | ((i3 << 15) & 3670016), 0, 1944);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = xtcVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vy6(z, z2, i, z3, function1, function0, xtcVar2, qugVar, i2);
        }
    }

    public static final void k(y97 y97Var, ct8 ct8Var, Function2 function2, Function1 function1, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        ct8Var.getClass();
        function2.getClass();
        function1.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1913577013);
        int i2 = 4;
        int i3 = i | (av8Var.g(y97Var) ? 4 : 2) | (av8Var.i(ct8Var) ? 32 : 16) | (av8Var.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? a.o : 1024) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            qug o0 = hkg.o0(av8Var);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new e87(i2);
                av8Var.n0(O2);
            }
            dfh g2 = ctc.g((Function1) O2, av8Var, 54, 0);
            int i5 = i3 >> 12;
            tz9.k(true, function0, xtcVar, o0, g2, null, new i68(0, 0, 0, 0), yqo.H(-509763351, av8Var, new s87(ku3Var, g2, function0, i4)), yqo.H(1586072200, av8Var, new ff7(y97Var, ct8Var, function2, function1, o0)), av8Var, (i5 & 896) | (i5 & 112) | 113246214, 32);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44((Object) y97Var, (Object) ct8Var, (Object) function2, function1, function0, xtcVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(final int i, int i2, final boolean z, final xtc xtcVar, String str, float f2, boolean z2, Function0 function0, of3 of3Var, final int i3, final int i4) {
        int i5;
        String str2;
        int i6;
        float f3;
        int i7;
        boolean z3;
        int i8;
        Function0 function02;
        int i9;
        final String str3;
        final float f4;
        final boolean z4;
        final Function0 function03;
        eqf u;
        utc utcVar;
        boolean z5;
        float f5;
        av8 av8Var;
        xtc xtcVar2;
        boolean z6;
        String str4;
        boolean z7;
        final int i10 = i2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(309354186);
        if ((i3 & 6) == 0) {
            i5 = (av8Var2.e(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= av8Var2.e(i10) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        int i11 = i4 & 16;
        if (i11 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            str2 = str;
            i5 |= av8Var2.g(str2) ? 16384 : 8192;
            i6 = i4 & 32;
            if (i6 == 0) {
                i5 |= 196608;
            } else if ((196608 & i3) == 0) {
                f3 = f2;
                i5 |= av8Var2.d(f3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i7 = i4 & 64;
                if (i7 != 0) {
                    i5 |= 1572864;
                } else if ((1572864 & i3) == 0) {
                    z3 = z2;
                    i5 |= av8Var2.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    i8 = i4 & 128;
                    if (i8 == 0) {
                        i5 |= 12582912;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i3 & 12582912) == 0) {
                            i5 |= av8Var2.i(function02) ? 8388608 : 4194304;
                        }
                    }
                    i9 = i5;
                    if (av8Var2.T(i9 & 1, (i9 & 4793491) == 4793490)) {
                        av8Var2.W();
                        str3 = str2;
                        f4 = f3;
                        z4 = z3;
                        function03 = function02;
                    } else {
                        if (i11 != 0) {
                            str2 = null;
                        }
                        float f6 = i6 != 0 ? 16.0f : f3;
                        boolean z8 = i7 != 0 ? true : z3;
                        Function0 function04 = i8 == 0 ? function02 : null;
                        av8Var2.d0(936639399);
                        utc utcVar2 = utc.a;
                        if (function04 != null) {
                            boolean z9 = (i9 & 29360128) == 8388608;
                            Object O = av8Var2.O();
                            if (z9 || O == nf3.a) {
                                O = new v61(29, function04);
                                av8Var2.n0(O);
                            }
                            z5 = false;
                            f5 = 16.0f;
                            xtc y = tol.y(utcVar2, false, false, false, 0L, null, (Function0) O, av8Var2, 29);
                            utcVar = utcVar2;
                            av8Var = av8Var2;
                            xtcVar2 = xtcVar.z(y);
                        } else {
                            utcVar = utcVar2;
                            z5 = false;
                            f5 = 16.0f;
                            av8Var = av8Var2;
                            xtcVar2 = xtcVar;
                        }
                        av8Var.s(z5);
                        mv1 mv1Var = uxf.c;
                        k1c c2 = e12.c(mv1Var, z5);
                        String str5 = str2;
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, xtcVar2);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var, c2, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var, m, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var, ryVar);
                        Function0 function05 = function04;
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var, C, f50Var3);
                        int i12 = i9 >> 3;
                        td4.s(i, (i9 & 14) | 384 | (i12 & 112), av8Var, bkh.c, z);
                        n12 n12Var = n12.a;
                        if (z || !z8) {
                            z6 = false;
                            av8Var.d0(107082930);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(106662012);
                            xtc a2 = n12Var.a(l98.b0(bkh.l(n9e.q(utcVar, lz.D(R.color.on_color_primary, av8Var), o7g.a(4.0f)), f6), 1.0f), uxf.i);
                            k1c c3 = e12.c(mv1Var, false);
                            int hashCode2 = Long.hashCode(av8Var.T);
                            aee m2 = av8Var.m();
                            xtc C2 = fqj.C(av8Var, a2);
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, c3, f50Var);
                            waa.K(av8Var, m2, ff3Var);
                            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C2, f50Var3);
                            i10 = i2;
                            td4.u(i10, (i12 & 14) | 48, av8Var, utcVar);
                            av8Var.s(true);
                            z6 = false;
                            av8Var.s(false);
                        }
                        if (str5 == null) {
                            av8Var.d0(107125988);
                            av8Var.s(z6);
                            av8Var2 = av8Var;
                            z7 = true;
                            str4 = str5;
                        } else {
                            av8Var.d0(107125989);
                            mv1 mv1Var2 = uxf.g;
                            xtc a3 = n12Var.a(n9e.q(bkh.l(utcVar, f6), lz.D(R.color.n_lv_1, av8Var), o7g.a), uxf.k);
                            k1c c4 = e12.c(mv1Var2, false);
                            int hashCode3 = Long.hashCode(av8Var.T);
                            aee m3 = av8Var.m();
                            xtc C3 = fqj.C(av8Var, a3);
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, c4, f50Var);
                            waa.K(av8Var, m3, ff3Var);
                            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C3, f50Var3);
                            yf8 yf8Var = xth.a;
                            dfj c5 = xth.c();
                            long j = xth.c().a.b;
                            v8a.l(j);
                            long E = v8a.E(j & 1095216660480L, lfj.c(j) * f6);
                            v8a.l(E);
                            av8 av8Var3 = av8Var;
                            str4 = str5;
                            fqj.a(str4, dfj.a(c5, 0L, v8a.E(1095216660480L & E, lfj.c(E) / f5), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), lz.D(R.color.surface_1, av8Var), null, null, av8Var3, (i9 >> 12) & 14, 24);
                            av8Var2 = av8Var3;
                            z7 = true;
                            av8Var2.s(true);
                            Unit unit = Unit.a;
                            av8Var2.s(false);
                        }
                        av8Var2.s(z7);
                        f4 = f6;
                        str3 = str4;
                        z4 = z8;
                        function03 = function05;
                    }
                    u = av8Var2.u();
                    if (u == null) {
                        u.d = new Function2() { // from class: id7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                wnn.l(i, i10, z, xtcVar, str3, f4, z4, function03, (of3) obj, aba.K(i3 | 1), i4);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z3 = z2;
                i8 = i4 & 128;
                if (i8 == 0) {
                }
                i9 = i5;
                if (av8Var2.T(i9 & 1, (i9 & 4793491) == 4793490)) {
                }
                u = av8Var2.u();
                if (u == null) {
                }
            }
            f3 = f2;
            i7 = i4 & 64;
            if (i7 != 0) {
            }
            z3 = z2;
            i8 = i4 & 128;
            if (i8 == 0) {
            }
            i9 = i5;
            if (av8Var2.T(i9 & 1, (i9 & 4793491) == 4793490)) {
            }
            u = av8Var2.u();
            if (u == null) {
            }
        }
        str2 = str;
        i6 = i4 & 32;
        if (i6 == 0) {
        }
        f3 = f2;
        i7 = i4 & 64;
        if (i7 != 0) {
        }
        z3 = z2;
        i8 = i4 & 128;
        if (i8 == 0) {
        }
        i9 = i5;
        if (av8Var2.T(i9 & 1, (i9 & 4793491) == 4793490)) {
        }
        u = av8Var2.u();
        if (u == null) {
        }
    }

    public static final void m(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1185575229);
        if (av8Var.T(i & 1, i != 0)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.fantasy_price_tracker_graph_explained, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
            tol.b(dh3.n.a(ema.a), u6h.c, av8Var, 56);
            p(0, lz.D(R.color.primary_default, av8Var), av8Var, null, bf3.g(8.0f, R.string.fantasy_player_joined_the_league_indicator, av8Var, av8Var, utcVar));
            p(0, lz.D(R.color.error, av8Var), av8Var, null, oea.v(R.string.fantasy_player_left_the_league_indicator, av8Var));
            p(0, lz.D(R.color.alert, av8Var), av8Var, null, oea.v(R.string.fantasy_average_price_indicator, av8Var));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sc6(i, 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if ((r29 & 4) != 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Function0 function0, xtc xtcVar, long j, of3 of3Var, int i, int i2) {
        long j2;
        int i3;
        int i4;
        long j3;
        eqf u;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-972617663);
        int i5 = i | (av8Var.i(function0) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if ((i2 & 4) == 0) {
            j2 = j;
            if (av8Var.f(j2)) {
                i3 = NotificationCompat.FLAG_LOCAL_ONLY;
                i4 = i5 | i3;
                if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
                    av8Var.W();
                    j3 = j2;
                } else {
                    av8Var.Y();
                    if ((i & 1) == 0 || av8Var.B()) {
                        if ((i2 & 4) != 0) {
                            j2 = lz.D(R.color.surface_1, av8Var);
                            i4 &= -897;
                        }
                        av8Var.t();
                        kg0 kg0Var = ww9.f;
                        xtc f0 = l98.f0(l98.d0(n9e.q(d2a.E(bkh.d(xtcVar, 1.0f), 4.0f, o7g.a(16.0f), false, 0L, 28), j2, o7g.a(16.0f)), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
                        u23 a2 = t23.a(kg0Var, uxf.o, av8Var, 6);
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
                        waa.K(av8Var, C, hf3.d);
                        j72.h(null, Integer.valueOf(R.drawable.twitter_feed), Integer.valueOf(R.string.fantasy_update_app_empty_title), Integer.valueOf(R.string.fantasy_update_app_empty_text), false, null, 0, 0L, av8Var, 24576, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
                        utc utcVar = utc.a;
                        mha.h(oea.v(R.string.fantasy_update_now_button, av8Var), function0, vxd.f(utcVar, 24.0f, av8Var, utcVar, 1.0f), null, null, false, false, false, 0L, 0, 0, av8Var, ((i4 << 3) & 112) | 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                        av8Var = av8Var;
                        av8Var.s(true);
                        j3 = j2;
                    } else {
                        av8Var.W();
                    }
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new bo7(function0, xtcVar, j3, i, i2);
                    return;
                }
                return;
            }
        } else {
            j2 = j;
        }
        i3 = 128;
        i4 = i5 | i3;
        if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final xtc xtcVar, final boolean z, long j, boolean z2, boolean z3, of3 of3Var, final int i, final int i2) {
        int i3;
        final long j2;
        boolean z4;
        int i4;
        boolean z5;
        final boolean z6;
        final boolean z7;
        eqf u;
        final boolean z8;
        final boolean z9;
        long D;
        long f2;
        long f3;
        Object O;
        Object obj;
        boolean f4;
        Object O2;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1459924408);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (av8Var.f(j2)) {
                    i5 = NotificationCompat.FLAG_LOCAL_ONLY;
                    i3 |= i5;
                }
            } else {
                j2 = j;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            j2 = j;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z4 = z2;
            i3 |= av8Var.h(z4) ? a.o : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z5 = z3;
                i3 |= av8Var.h(z5) ? 16384 : 8192;
                if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
                    av8Var.Y();
                    if ((i & 1) == 0 || av8Var.B()) {
                        if ((i2 & 4) != 0) {
                            j2 = lz.D(R.color.terrain_football_lineups, av8Var);
                            i3 &= -897;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        }
                        if (i4 != 0) {
                            z8 = z4;
                            z9 = false;
                            av8Var.t();
                            D = lz.D(R.color.terrain_football_lineups, av8Var);
                            int i7 = r13.j;
                            if (e8k.a(j2, D)) {
                                f2 = ljg.f(av8Var, -1466939541, R.color.neutral_default, av8Var, false);
                            } else {
                                av8Var.d0(-1466939907);
                                av8Var.s(false);
                                f2 = r13.d;
                            }
                            if (e8k.a(j2, lz.D(R.color.terrain_football_lineups, av8Var))) {
                                f3 = ljg.f(av8Var, -1466935999, R.color.n_lv_1, av8Var, false);
                            } else {
                                av8Var.d0(-1466936355);
                                av8Var.s(false);
                                f3 = r13.d;
                            }
                            O = av8Var.O();
                            obj = nf3.a;
                            if (O == obj) {
                                O = new ay1(f3, 5);
                                av8Var.n0(O);
                            }
                            final ay1 ay1Var = (ay1) O;
                            d dVar = dh3.h;
                            final float H0 = ((kx4) av8Var.k(dVar)).H0(72.0f);
                            final float H02 = ((kx4) av8Var.k(dVar)).H0(11.0f);
                            final lmk J = o6a.J(s6a.N(R.drawable.ic_sofascore_logo_watermark, 6, av8Var), av8Var);
                            xtc b0 = l98.b0(u6h.C(n9e.q(xtcVar, j2, oyn.e), 0.3f), 1.0f);
                            if (z8) {
                                b0 = b0.z(haa.v(utc.a, 180.0f));
                            }
                            f4 = av8Var.f(f2) | av8Var.i(J) | av8Var.d(H0) | av8Var.d(H02) | ((57344 & i3) != 16384) | ((i3 & 7168) != 2048);
                            O2 = av8Var.O();
                            if (!f4 || O2 == obj) {
                                final long j3 = f2;
                                O2 = new Function1() { // from class: vl8
                                    /* JADX WARN: Removed duplicated region for block: B:26:0x03ab  */
                                    @Override // kotlin.jvm.functions.Function1
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object invoke(Object obj2) {
                                        lmk lmkVar;
                                        ha5 ha5Var;
                                        float f5;
                                        float f6;
                                        ay1 ay1Var2;
                                        boolean z10;
                                        long j4;
                                        float f7;
                                        float f8;
                                        jii jiiVar;
                                        float f9;
                                        jii jiiVar2;
                                        jii jiiVar3;
                                        sx2 L0;
                                        long D2;
                                        float f10;
                                        float f11;
                                        sx2 L02;
                                        long D3;
                                        long j5;
                                        ha5 ha5Var2 = (ha5) obj2;
                                        ha5Var2.getClass();
                                        float H03 = ha5Var2.H0(2.0f);
                                        float f12 = H03 / 2.0f;
                                        jii jiiVar4 = new jii(H03, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
                                        float H04 = ha5Var2.H0(54.0f);
                                        float H05 = ha5Var2.H0(156.0f);
                                        float H06 = ha5Var2.H0(44.0f);
                                        float H07 = ha5Var2.H0(68.0f);
                                        float H08 = ha5Var2.H0(20.0f);
                                        float H09 = ha5Var2.H0(48.0f);
                                        float H010 = ha5Var2.H0(28.0f);
                                        float H011 = ha5Var2.H0(10.0f);
                                        float H012 = ha5Var2.H0(12.0f);
                                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                                        long n = ha5Var2.n();
                                        long j6 = j3;
                                        ha5.o0(ha5Var2, j6, 0L, n, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, null, 106);
                                        boolean z11 = z;
                                        float f13 = H0;
                                        float f14 = H02;
                                        ha5 ha5Var3 = ha5Var2;
                                        lmk lmkVar2 = J;
                                        ay1 ay1Var3 = ay1Var;
                                        float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        if (z11) {
                                            ((hpo) ha5Var3.L0().a).I(H012, H012);
                                            try {
                                                long floatToRawIntBits = Float.floatToRawIntBits(f13);
                                                f5 = f14;
                                                f6 = f13;
                                                ha5Var3 = ha5Var3;
                                                d7e.h(lmkVar2, ha5Var3, (Float.floatToRawIntBits(f14) & 4294967295L) | (floatToRawIntBits << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var3, 2);
                                                lmkVar = lmkVar2;
                                                ha5Var = ha5Var3;
                                                ay1Var2 = ay1Var3;
                                                try {
                                                    Unit unit = Unit.a;
                                                    float f16 = -H012;
                                                    ((hpo) ha5Var.L0().a).I(f16, f16);
                                                    float f17 = (-H011) + f12;
                                                    float f18 = H011 * 2.0f;
                                                    z10 = z11;
                                                    f7 = f12;
                                                    f9 = H011;
                                                    ha5.L(ha5Var, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, (Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, 832);
                                                    ha5.L(ha5Var, j6, 90.0f, 90.0f, (Float.floatToRawIntBits(f17) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - f9) - f7) << 32), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, 832);
                                                    ha5.o0(ha5Var, j6, (Float.floatToRawIntBits((intBitsToFloat - H05) / 2.0f) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(H05) << 32) | (Float.floatToRawIntBits(H06) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, null, 104);
                                                    ha5.o0(ha5Var, j6, (Float.floatToRawIntBits((intBitsToFloat - H07) / 2.0f) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(H07) << 32) | (Float.floatToRawIntBits(H08) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, null, 104);
                                                    sx2 L03 = ha5Var.L0();
                                                    long D4 = L03.D();
                                                    L03.t().o();
                                                    try {
                                                        try {
                                                            ((hpo) L03.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, H06, 0);
                                                            j4 = j6;
                                                            ha5.U(ha5Var, j4, H09, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.O0() >> 32))) << 32) | (Float.floatToRawIntBits(H06 - H010) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, 104);
                                                            f8 = H09;
                                                            jiiVar = jiiVar4;
                                                            mz1.v(L03, D4);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            j5 = D4;
                                                            mz1.v(L03, j5);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        j5 = D4;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    float f19 = -H012;
                                                    ((hpo) ha5Var.L0().a).I(f19, f19);
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                ha5Var = ha5Var3;
                                            }
                                        } else {
                                            lmkVar = lmkVar2;
                                            ha5Var = ha5Var3;
                                            f5 = f14;
                                            f6 = f13;
                                            ay1Var2 = ay1Var3;
                                            z10 = z11;
                                            j4 = j6;
                                            f7 = f12;
                                            f8 = H09;
                                            jiiVar = jiiVar4;
                                            f9 = H011;
                                        }
                                        if (z10) {
                                            float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var.O0() & 4294967295L));
                                            float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var.O0() & 4294967295L));
                                            ha5.W0(ha5Var, j4, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), H03, 0, null, 496);
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (!z10) {
                                                        jiiVar2 = jiiVar;
                                                        if (!z9) {
                                                            jiiVar3 = jiiVar2;
                                                            ha5.U(ha5Var, j4, H04, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.O0() >> 32))) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar3, 104);
                                                        }
                                                        float f20 = intBitsToFloat2 - H06;
                                                        ha5.o0(ha5Var, j4, (Float.floatToRawIntBits((intBitsToFloat - H05) / 2.0f) << 32) | (Float.floatToRawIntBits(f20) & 4294967295L), (Float.floatToRawIntBits(H05) << 32) | (Float.floatToRawIntBits(H06) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar2, null, 104);
                                                        ha5.o0(ha5Var, j4, (Float.floatToRawIntBits(intBitsToFloat2 - H08) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - H07) / 2.0f) << 32), (Float.floatToRawIntBits(H07) << 32) | (Float.floatToRawIntBits(H08) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar2, null, 104);
                                                        L0 = ha5Var.L0();
                                                        D2 = L0.D();
                                                        L0.t().o();
                                                        ((hpo) L0.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2, intBitsToFloat, f20, 0);
                                                        jii jiiVar5 = jiiVar2;
                                                        ha5.U(ha5Var, j4, f8, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.O0() >> 32))) << 32) | (Float.floatToRawIntBits(f20 + H010) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar5, 104);
                                                        L0.t().h();
                                                        L0.N(D2);
                                                        float f21 = (intBitsToFloat2 - f9) - f7;
                                                        float f22 = f9 * 2.0f;
                                                        ha5.L(ha5Var, j4, 180.0f, 90.0f, (Float.floatToRawIntBits(f21) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - f9) - f7) << 32), (Float.floatToRawIntBits(f22) << 32) | (Float.floatToRawIntBits(f22) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar5, 832);
                                                        ha5.L(ha5Var, j4, 270.0f, 90.0f, (Float.floatToRawIntBits(f21) & 4294967295L) | (Float.floatToRawIntBits((-f9) + f7) << 32), (Float.floatToRawIntBits(f22) << 32) | (Float.floatToRawIntBits(f22) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar5, 832);
                                                        f10 = (intBitsToFloat - H012) - f6;
                                                        f11 = (intBitsToFloat2 - H012) - f5;
                                                        ((hpo) ha5Var.L0().a).I(f10, f11);
                                                        if (z8) {
                                                            f15 = 180.0f;
                                                        }
                                                        float f23 = f15;
                                                        float f24 = f5 / 2.0f;
                                                        long floatToRawIntBits2 = (Float.floatToRawIntBits(f24) & 4294967295L) | (Float.floatToRawIntBits(f6 / 2.0f) << 32);
                                                        L02 = ha5Var.L0();
                                                        D3 = L02.D();
                                                        L02.t().o();
                                                        ((hpo) L02.a).F(floatToRawIntBits2, f23);
                                                        d7e.h(lmkVar, ha5Var, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var2, 2);
                                                        L02.t().h();
                                                        L02.N(D3);
                                                        Unit unit2 = Unit.a;
                                                        ((hpo) ha5Var.L0().a).I(-f10, -f11);
                                                        return Unit.a;
                                                    }
                                                    jiiVar3 = jiiVar;
                                                    ha5.U(ha5Var, j4, H04, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar3, 108);
                                                    ((hpo) L02.a).F(floatToRawIntBits2, f23);
                                                    d7e.h(lmkVar, ha5Var, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var2, 2);
                                                    L02.t().h();
                                                    L02.N(D3);
                                                    Unit unit22 = Unit.a;
                                                    ((hpo) ha5Var.L0().a).I(-f10, -f11);
                                                    return Unit.a;
                                                } catch (Throwable th5) {
                                                    L02.t().h();
                                                    L02.N(D3);
                                                    throw th5;
                                                }
                                                long floatToRawIntBits22 = (Float.floatToRawIntBits(f24) & 4294967295L) | (Float.floatToRawIntBits(f6 / 2.0f) << 32);
                                                L02 = ha5Var.L0();
                                                D3 = L02.D();
                                                L02.t().o();
                                            } catch (Throwable th6) {
                                                ((hpo) ha5Var.L0().a).I(-f10, -f11);
                                                throw th6;
                                            }
                                            ((hpo) L0.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2, intBitsToFloat, f20, 0);
                                            jii jiiVar52 = jiiVar2;
                                            ha5.U(ha5Var, j4, f8, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.O0() >> 32))) << 32) | (Float.floatToRawIntBits(f20 + H010) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar52, 104);
                                            L0.t().h();
                                            L0.N(D2);
                                            float f212 = (intBitsToFloat2 - f9) - f7;
                                            float f222 = f9 * 2.0f;
                                            ha5.L(ha5Var, j4, 180.0f, 90.0f, (Float.floatToRawIntBits(f212) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - f9) - f7) << 32), (Float.floatToRawIntBits(f222) << 32) | (Float.floatToRawIntBits(f222) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar52, 832);
                                            ha5.L(ha5Var, j4, 270.0f, 90.0f, (Float.floatToRawIntBits(f212) & 4294967295L) | (Float.floatToRawIntBits((-f9) + f7) << 32), (Float.floatToRawIntBits(f222) << 32) | (Float.floatToRawIntBits(f222) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar52, 832);
                                            f10 = (intBitsToFloat - H012) - f6;
                                            f11 = (intBitsToFloat2 - H012) - f5;
                                            ((hpo) ha5Var.L0().a).I(f10, f11);
                                            if (z8) {
                                            }
                                            float f232 = f15;
                                            float f242 = f5 / 2.0f;
                                        } catch (Throwable th7) {
                                            mz1.v(L0, D2);
                                            throw th7;
                                        }
                                        jiiVar2 = jiiVar3;
                                        float f202 = intBitsToFloat2 - H06;
                                        ha5.o0(ha5Var, j4, (Float.floatToRawIntBits((intBitsToFloat - H05) / 2.0f) << 32) | (Float.floatToRawIntBits(f202) & 4294967295L), (Float.floatToRawIntBits(H05) << 32) | (Float.floatToRawIntBits(H06) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar2, null, 104);
                                        ha5.o0(ha5Var, j4, (Float.floatToRawIntBits(intBitsToFloat2 - H08) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - H07) / 2.0f) << 32), (Float.floatToRawIntBits(H07) << 32) | (Float.floatToRawIntBits(H08) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar2, null, 104);
                                        L0 = ha5Var.L0();
                                        D2 = L0.D();
                                        L0.t().o();
                                    }
                                };
                                av8Var.n0(O2);
                            }
                            lz.d(0, av8Var, b0, (Function1) O2);
                            z7 = z9;
                            z6 = z8;
                        }
                    } else {
                        av8Var.W();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    z8 = z4;
                    z9 = z5;
                    av8Var.t();
                    D = lz.D(R.color.terrain_football_lineups, av8Var);
                    int i72 = r13.j;
                    if (e8k.a(j2, D)) {
                    }
                    if (e8k.a(j2, lz.D(R.color.terrain_football_lineups, av8Var))) {
                    }
                    O = av8Var.O();
                    obj = nf3.a;
                    if (O == obj) {
                    }
                    final ay1 ay1Var2 = (ay1) O;
                    d dVar2 = dh3.h;
                    final float H03 = ((kx4) av8Var.k(dVar2)).H0(72.0f);
                    final float H022 = ((kx4) av8Var.k(dVar2)).H0(11.0f);
                    final lmk J2 = o6a.J(s6a.N(R.drawable.ic_sofascore_logo_watermark, 6, av8Var), av8Var);
                    xtc b02 = l98.b0(u6h.C(n9e.q(xtcVar, j2, oyn.e), 0.3f), 1.0f);
                    if (z8) {
                    }
                    f4 = av8Var.f(f2) | av8Var.i(J2) | av8Var.d(H03) | av8Var.d(H022) | ((57344 & i3) != 16384) | ((i3 & 7168) != 2048);
                    O2 = av8Var.O();
                    if (!f4) {
                    }
                    final long j32 = f2;
                    O2 = new Function1() { // from class: vl8
                        /* JADX WARN: Removed duplicated region for block: B:26:0x03ab  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj2) {
                            lmk lmkVar;
                            ha5 ha5Var;
                            float f5;
                            float f6;
                            ay1 ay1Var22;
                            boolean z10;
                            long j4;
                            float f7;
                            float f8;
                            jii jiiVar;
                            float f9;
                            jii jiiVar2;
                            jii jiiVar3;
                            sx2 L0;
                            long D2;
                            float f10;
                            float f11;
                            sx2 L02;
                            long D3;
                            long j5;
                            ha5 ha5Var2 = (ha5) obj2;
                            ha5Var2.getClass();
                            float H032 = ha5Var2.H0(2.0f);
                            float f12 = H032 / 2.0f;
                            jii jiiVar4 = new jii(H032, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
                            float H04 = ha5Var2.H0(54.0f);
                            float H05 = ha5Var2.H0(156.0f);
                            float H06 = ha5Var2.H0(44.0f);
                            float H07 = ha5Var2.H0(68.0f);
                            float H08 = ha5Var2.H0(20.0f);
                            float H09 = ha5Var2.H0(48.0f);
                            float H010 = ha5Var2.H0(28.0f);
                            float H011 = ha5Var2.H0(10.0f);
                            float H012 = ha5Var2.H0(12.0f);
                            float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                            long n = ha5Var2.n();
                            long j6 = j32;
                            ha5.o0(ha5Var2, j6, 0L, n, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, null, 106);
                            boolean z11 = z;
                            float f13 = H03;
                            float f14 = H022;
                            ha5 ha5Var3 = ha5Var2;
                            lmk lmkVar2 = J2;
                            ay1 ay1Var3 = ay1Var2;
                            float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (z11) {
                                ((hpo) ha5Var3.L0().a).I(H012, H012);
                                try {
                                    long floatToRawIntBits = Float.floatToRawIntBits(f13);
                                    f5 = f14;
                                    f6 = f13;
                                    ha5Var3 = ha5Var3;
                                    d7e.h(lmkVar2, ha5Var3, (Float.floatToRawIntBits(f14) & 4294967295L) | (floatToRawIntBits << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var3, 2);
                                    lmkVar = lmkVar2;
                                    ha5Var = ha5Var3;
                                    ay1Var22 = ay1Var3;
                                    try {
                                        Unit unit = Unit.a;
                                        float f16 = -H012;
                                        ((hpo) ha5Var.L0().a).I(f16, f16);
                                        float f17 = (-H011) + f12;
                                        float f18 = H011 * 2.0f;
                                        z10 = z11;
                                        f7 = f12;
                                        f9 = H011;
                                        ha5.L(ha5Var, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, (Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, 832);
                                        ha5.L(ha5Var, j6, 90.0f, 90.0f, (Float.floatToRawIntBits(f17) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - f9) - f7) << 32), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, 832);
                                        ha5.o0(ha5Var, j6, (Float.floatToRawIntBits((intBitsToFloat - H05) / 2.0f) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(H05) << 32) | (Float.floatToRawIntBits(H06) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, null, 104);
                                        ha5.o0(ha5Var, j6, (Float.floatToRawIntBits((intBitsToFloat - H07) / 2.0f) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(H07) << 32) | (Float.floatToRawIntBits(H08) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, null, 104);
                                        sx2 L03 = ha5Var.L0();
                                        long D4 = L03.D();
                                        L03.t().o();
                                        try {
                                            try {
                                                ((hpo) L03.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, H06, 0);
                                                j4 = j6;
                                                ha5.U(ha5Var, j4, H09, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.O0() >> 32))) << 32) | (Float.floatToRawIntBits(H06 - H010) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar4, 104);
                                                f8 = H09;
                                                jiiVar = jiiVar4;
                                                mz1.v(L03, D4);
                                            } catch (Throwable th) {
                                                th = th;
                                                j5 = D4;
                                                mz1.v(L03, j5);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j5 = D4;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        float f19 = -H012;
                                        ((hpo) ha5Var.L0().a).I(f19, f19);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    ha5Var = ha5Var3;
                                }
                            } else {
                                lmkVar = lmkVar2;
                                ha5Var = ha5Var3;
                                f5 = f14;
                                f6 = f13;
                                ay1Var22 = ay1Var3;
                                z10 = z11;
                                j4 = j6;
                                f7 = f12;
                                f8 = H09;
                                jiiVar = jiiVar4;
                                f9 = H011;
                            }
                            if (z10) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var.O0() & 4294967295L));
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var.O0() & 4294967295L));
                                ha5.W0(ha5Var, j4, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), H032, 0, null, 496);
                            }
                            try {
                                try {
                                    try {
                                        if (!z10) {
                                            jiiVar2 = jiiVar;
                                            if (!z9) {
                                                jiiVar3 = jiiVar2;
                                                ha5.U(ha5Var, j4, H04, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.O0() >> 32))) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar3, 104);
                                            }
                                            float f202 = intBitsToFloat2 - H06;
                                            ha5.o0(ha5Var, j4, (Float.floatToRawIntBits((intBitsToFloat - H05) / 2.0f) << 32) | (Float.floatToRawIntBits(f202) & 4294967295L), (Float.floatToRawIntBits(H05) << 32) | (Float.floatToRawIntBits(H06) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar2, null, 104);
                                            ha5.o0(ha5Var, j4, (Float.floatToRawIntBits(intBitsToFloat2 - H08) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - H07) / 2.0f) << 32), (Float.floatToRawIntBits(H07) << 32) | (Float.floatToRawIntBits(H08) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar2, null, 104);
                                            L0 = ha5Var.L0();
                                            D2 = L0.D();
                                            L0.t().o();
                                            ((hpo) L0.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2, intBitsToFloat, f202, 0);
                                            jii jiiVar52 = jiiVar2;
                                            ha5.U(ha5Var, j4, f8, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.O0() >> 32))) << 32) | (Float.floatToRawIntBits(f202 + H010) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar52, 104);
                                            L0.t().h();
                                            L0.N(D2);
                                            float f212 = (intBitsToFloat2 - f9) - f7;
                                            float f222 = f9 * 2.0f;
                                            ha5.L(ha5Var, j4, 180.0f, 90.0f, (Float.floatToRawIntBits(f212) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - f9) - f7) << 32), (Float.floatToRawIntBits(f222) << 32) | (Float.floatToRawIntBits(f222) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar52, 832);
                                            ha5.L(ha5Var, j4, 270.0f, 90.0f, (Float.floatToRawIntBits(f212) & 4294967295L) | (Float.floatToRawIntBits((-f9) + f7) << 32), (Float.floatToRawIntBits(f222) << 32) | (Float.floatToRawIntBits(f222) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar52, 832);
                                            f10 = (intBitsToFloat - H012) - f6;
                                            f11 = (intBitsToFloat2 - H012) - f5;
                                            ((hpo) ha5Var.L0().a).I(f10, f11);
                                            if (z8) {
                                                f15 = 180.0f;
                                            }
                                            float f232 = f15;
                                            float f242 = f5 / 2.0f;
                                            long floatToRawIntBits22 = (Float.floatToRawIntBits(f242) & 4294967295L) | (Float.floatToRawIntBits(f6 / 2.0f) << 32);
                                            L02 = ha5Var.L0();
                                            D3 = L02.D();
                                            L02.t().o();
                                            ((hpo) L02.a).F(floatToRawIntBits22, f232);
                                            d7e.h(lmkVar, ha5Var, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var22, 2);
                                            L02.t().h();
                                            L02.N(D3);
                                            Unit unit22 = Unit.a;
                                            ((hpo) ha5Var.L0().a).I(-f10, -f11);
                                            return Unit.a;
                                        }
                                        jiiVar3 = jiiVar;
                                        ha5.U(ha5Var, j4, H04, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar3, 108);
                                        ((hpo) L02.a).F(floatToRawIntBits22, f232);
                                        d7e.h(lmkVar, ha5Var, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var22, 2);
                                        L02.t().h();
                                        L02.N(D3);
                                        Unit unit222 = Unit.a;
                                        ((hpo) ha5Var.L0().a).I(-f10, -f11);
                                        return Unit.a;
                                    } catch (Throwable th5) {
                                        L02.t().h();
                                        L02.N(D3);
                                        throw th5;
                                    }
                                    long floatToRawIntBits222 = (Float.floatToRawIntBits(f242) & 4294967295L) | (Float.floatToRawIntBits(f6 / 2.0f) << 32);
                                    L02 = ha5Var.L0();
                                    D3 = L02.D();
                                    L02.t().o();
                                } catch (Throwable th6) {
                                    ((hpo) ha5Var.L0().a).I(-f10, -f11);
                                    throw th6;
                                }
                                ((hpo) L0.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2, intBitsToFloat, f202, 0);
                                jii jiiVar522 = jiiVar2;
                                ha5.U(ha5Var, j4, f8, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.O0() >> 32))) << 32) | (Float.floatToRawIntBits(f202 + H010) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar522, 104);
                                L0.t().h();
                                L0.N(D2);
                                float f2122 = (intBitsToFloat2 - f9) - f7;
                                float f2222 = f9 * 2.0f;
                                ha5.L(ha5Var, j4, 180.0f, 90.0f, (Float.floatToRawIntBits(f2122) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - f9) - f7) << 32), (Float.floatToRawIntBits(f2222) << 32) | (Float.floatToRawIntBits(f2222) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar522, 832);
                                ha5.L(ha5Var, j4, 270.0f, 90.0f, (Float.floatToRawIntBits(f2122) & 4294967295L) | (Float.floatToRawIntBits((-f9) + f7) << 32), (Float.floatToRawIntBits(f2222) << 32) | (Float.floatToRawIntBits(f2222) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar522, 832);
                                f10 = (intBitsToFloat - H012) - f6;
                                f11 = (intBitsToFloat2 - H012) - f5;
                                ((hpo) ha5Var.L0().a).I(f10, f11);
                                if (z8) {
                                }
                                float f2322 = f15;
                                float f2422 = f5 / 2.0f;
                            } catch (Throwable th7) {
                                mz1.v(L0, D2);
                                throw th7;
                            }
                            jiiVar2 = jiiVar3;
                            float f2022 = intBitsToFloat2 - H06;
                            ha5.o0(ha5Var, j4, (Float.floatToRawIntBits((intBitsToFloat - H05) / 2.0f) << 32) | (Float.floatToRawIntBits(f2022) & 4294967295L), (Float.floatToRawIntBits(H05) << 32) | (Float.floatToRawIntBits(H06) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar2, null, 104);
                            ha5.o0(ha5Var, j4, (Float.floatToRawIntBits(intBitsToFloat2 - H08) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat - H07) / 2.0f) << 32), (Float.floatToRawIntBits(H07) << 32) | (Float.floatToRawIntBits(H08) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar2, null, 104);
                            L0 = ha5Var.L0();
                            D2 = L0.D();
                            L0.t().o();
                        }
                    };
                    av8Var.n0(O2);
                    lz.d(0, av8Var, b02, (Function1) O2);
                    z7 = z9;
                    z6 = z8;
                } else {
                    av8Var.W();
                    z6 = z4;
                    z7 = z5;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: wl8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            wnn.o(xtc.this, z, j2, z6, z7, (of3) obj2, aba.K(i | 1), i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            z5 = z3;
            if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z4 = z2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z5 = z3;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void p(int i, long j, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-564963282);
        int i2 = i | (av8Var2.g(str) ? 4 : 2) | (av8Var2.f(j) ? 32 : 16) | 384;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
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
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            e12.a(0, av8Var2, n9e.q(l98.d0(bkh.e(bkh.p(utcVar, 24.0f), 4.0f), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j, oyn.e));
            nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            udj.c(str, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, i2 & 14, 24960, 110586);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l67(str, j, xtcVar2, i, 1);
        }
    }

    public static final void q(byb bybVar, ksa ksaVar, Function2 function2, Function1 function1, Function0 function0, Function0 function02, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-321375390);
        int i2 = (av8Var2.g(bybVar) ? 4 : 2) | i | (av8Var2.g(ksaVar) ? 32 : 16) | (av8Var2.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024);
        if ((i & 24576) == 0) {
            i2 |= av8Var2.i(function0) ? 16384 : 8192;
        }
        int i3 = i2 | (av8Var2.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            g28 g28Var = bkh.c;
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, g28Var);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            goa g2 = ljg.g(av8Var2, C, f50Var3, 1.0f, true);
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new dr6(29, bybVar, function1, function2);
                av8Var2.n0(O);
            }
            v8a.a(g2, ksaVar, null, null, null, null, false, null, (Function1) O, av8Var2, i3 & 112, IronSourceError.ERROR_CODE_INIT_FAILED);
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var2), oyn.e), 16.0f);
            l8g a3 = k8g.a(ww9.c, uxf.l, av8Var2, 6);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, b0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            mha.h(oea.v(R.string.close, av8Var2), function0, null, gqh.a, null, false, false, false, 0L, 0, 0, av8Var2, ((i3 >> 9) & 112) | 3072, 0, 2036);
            mha.h(fc6.f(16.0f, R.string.apply, av8Var2, av8Var2, utcVar), function02, null, kqh.a, null, false, false, false, 0L, 0, 0, av8Var2, ((i3 >> 12) & 112) | 3072, 0, 2036);
            av8Var = av8Var2;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(bybVar, ksaVar, function2, function1, function0, function02, i, 6);
        }
    }

    public static final void r(dyb dybVar, ksa ksaVar, Function0 function0, of3 of3Var, int i) {
        av8 av8Var;
        dybVar.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(132211097);
        int i2 = i | (av8Var2.i(dybVar) ? 4 : 2) | (av8Var2.g(ksaVar) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            byb bybVar = (byb) rfo.x(dybVar.f, av8Var2, 0).getValue();
            boolean i3 = av8Var2.i(dybVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i3 || O == a99Var) {
                p1 p1Var = new p1(2, dybVar, dyb.class, "onOptionSelected", "onOptionSelected(Ljava/lang/String;Ljava/lang/String;)V", 0, 11);
                av8Var2.n0(p1Var);
                O = p1Var;
            }
            Function2 function2 = (Function2) ((KFunction) O);
            boolean i4 = av8Var2.i(dybVar);
            Object O2 = av8Var2.O();
            if (i4 || O2 == a99Var) {
                v9b v9bVar = new v9b(1, dybVar, dyb.class, "updateDisplayType", "updateDisplayType(Lcom/sofascore/model/database/DisplayType;)V", 0, 11);
                av8Var2.n0(v9bVar);
                O2 = v9bVar;
            }
            Function1 function1 = (Function1) ((KFunction) O2);
            boolean i5 = av8Var2.i(dybVar);
            Object O3 = av8Var2.O();
            if (i5 || O3 == a99Var) {
                fl8 fl8Var = new fl8(0, dybVar, dyb.class, "applyFilter", "applyFilter()V", 0, 8);
                av8Var2.n0(fl8Var);
                O3 = fl8Var;
            }
            av8Var = av8Var2;
            q(bybVar, ksaVar, function2, function1, function0, (Function0) ((KFunction) O3), av8Var, (i2 & 112) | (57344 & (i2 << 6)));
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(dybVar, ksaVar, function0, i, 29);
        }
    }

    public static final void s(Team team, String str, boolean z, boolean z2, xtc xtcVar, of3 of3Var, int i) {
        boolean z3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-511606868);
        int i2 = i | (av8Var.i(team) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z2) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192);
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 54);
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
            String p = tba.p(context, team);
            yf8 yf8Var = xth.a;
            udj.c(p, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 109562);
            av8Var = av8Var;
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            td4.G(team.getId(), bkh.l(utcVar, 112.0f), false, 0L, av8Var, 48, 12);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            if (z2) {
                z3 = true;
                av8Var.d0(528727436);
                av8Var.s(false);
            } else {
                av8Var.d0(528118162);
                xtc c0 = l98.c0(bkh.d(n9e.q(utcVar, lz.D(R.color.darken_overlay_2, av8Var), oyn.e), 1.0f), 24.0f, 8.0f);
                k1c c2 = e12.c(uxf.g, false);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, c0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                udj.c(str, null, z ? ljg.f(av8Var, -497106205, R.color.on_color_primary, av8Var, false) : ljg.f(av8Var, -497105563, R.color.on_color_secondary, av8Var, false), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.h(), av8Var, (i2 >> 3) & 14, 24960, 110586);
                av8Var = av8Var;
                z3 = true;
                av8Var.s(true);
                av8Var.s(false);
            }
            av8Var.s(z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u93(team, str, z, z2, xtcVar, i, 6);
        }
    }

    public static final void t(e9i e9iVar, dlj dljVar, of3 of3Var, int i) {
        int i2;
        e9i e9iVar2 = e9iVar;
        dlj dljVar2 = dljVar;
        Event event = dljVar2.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-342251838);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g(e9iVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(dljVar2) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            g28 g28Var = bkh.c;
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            float a2 = e9iVar2.a(1000, TTAdConstant.STYLE_SIZE_RADIO_3_2);
            float f2 = (a2 * 0.1f) + 0.9f;
            Set set = wyh.a;
            ImageVector N = s6a.N(wyh.a(event.getSportSlug()), 6, av8Var);
            long D = lz.D(R.color.on_color_highlight_2, av8Var);
            boolean d2 = av8Var.d(a2) | av8Var.d(f2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d2 || O == a99Var) {
                O = new n28(19, a2, f2);
                av8Var.n0(O);
            }
            kq9.b(N, null, s02.M(g28Var, (Function1) O), D, av8Var, 48, 0);
            kg0 kg0Var = ww9.f;
            kv1 kv1Var = uxf.o;
            xtc d0 = l98.d0(g28Var, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
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
            String a4 = dljVar2.a.a(av8Var);
            yf8 yf8Var = xth.a;
            dfj i3 = xth.i();
            long D2 = lz.D(R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            udj.c(a4, bkh.d(utcVar, 1.0f), D2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, i3, av8Var, 48, 0, 130040);
            nq8.h(av8Var, bkh.e(utcVar, 42.0f));
            boolean d3 = av8Var.d(a2) | av8Var.d(f2);
            Object O2 = av8Var.O();
            if (d3 || O2 == a99Var) {
                O2 = new n28(20, a2, f2);
                av8Var.n0(O2);
            }
            f(event, s02.M(utcVar, (Function1) O2), av8Var, 0, 0);
            nq8.h(av8Var, bkh.e(utcVar, 56.0f));
            float a5 = e9iVar.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 500);
            float f3 = (0.1f * a5) + 0.9f;
            String a6 = dljVar.c.a(av8Var);
            dfj e2 = xth.e();
            long D3 = lz.D(R.color.on_color_primary, av8Var);
            xtc d4 = bkh.d(utcVar, 1.0f);
            boolean d5 = av8Var.d(a5) | av8Var.d(f3);
            Object O3 = av8Var.O();
            if (d5 || O3 == a99Var) {
                O3 = new n28(21, a5, f3);
                av8Var.n0(O3);
            }
            dljVar2 = dljVar;
            e9iVar2 = e9iVar;
            udj.c(a6, s02.M(d4, (Function1) O3), D3, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, e2, av8Var, 0, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(e9iVar2, dljVar2, i, 8);
        }
    }

    public static final void u(v23 v23Var, dlj dljVar, of3 of3Var, int i) {
        int i2;
        Event event = dljVar.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1665174227);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(dljVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(v23Var.a(1.0f, utcVar, true), 1.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            Set set = wyh.a;
            ImageVector N = s6a.N(wyh.a(event.getSportSlug()), 6, av8Var);
            long D = lz.D(R.color.on_color_highlight_2, av8Var);
            g28 g28Var = bkh.c;
            kq9.b(N, null, g28Var, D, av8Var, 432, 0);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, g28Var);
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
            x23 x23Var = x23.a;
            nq8.h(av8Var, x23Var.a(55.0f, utcVar, true));
            String a3 = dljVar.f.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, x23Var.a(46.0f, utcVar, true));
            f(event, null, av8Var, 0, 2);
            nq8.h(av8Var, x23Var.a(105.0f, utcVar, true));
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(v23Var, dljVar, i, 9);
        }
    }

    public static final void v(int i, of3 of3Var, xtc xtcVar, ImageVector imageVector, String str, String str2, Function0 function0, boolean z) {
        int i2;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1371325795);
        int i4 = i | (av8Var.g(xtcVar) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(imageVector) ? a.o : 1024) | (av8Var.h(z) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            n7g a2 = o7g.a(16.0f);
            k1c c2 = e12.c(uxf.c, false);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc A = A(bkh.c, a2);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = jxa.k;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, true, true, true, D, wzcVar, new p28((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 13), av8Var, 0);
            xtc xtcVar2 = utc.a;
            if (z) {
                av8Var.d0(-200147087);
                xtcVar2 = yso.o(xtcVar2, 1.0f, lz.D(R.color.primary_default, av8Var), a2);
                av8Var.s(false);
            } else {
                av8Var.d0(-200144783);
                av8Var.s(false);
            }
            xtc z2 = y.z(xtcVar2);
            if (z) {
                i2 = -200142018;
                i3 = R.color.primary_highlight;
            } else {
                i2 = -200141162;
                i3 = R.color.surface_2;
            }
            uni.a(z2, a2, ljg.f(av8Var, i2, i3, av8Var, false), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(-374120572, av8Var, new cyb(str2, imageVector, str)), av8Var, 12582912, 120);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i67(xtcVar, str, str2, imageVector, z, function0, i);
        }
    }

    public static final d7e w(nr9 nr9Var, Context context, int i) {
        return nr9Var instanceof ax1 ? n4o.b(new a10(((ax1) nr9Var).a), i) : nr9Var instanceof ra5 ? new sa5(rfo.t(nr9Var, context.getResources()).mutate()) : new ct9(nr9Var);
    }

    public static final void x(PromotionBannerView promotionBannerView, bef befVar, fv fvVar) {
        int ordinal = befVar.ordinal();
        if (ordinal == 1) {
            vdf n = promotionBannerView.n(befVar, fvVar, OffersBannerLayout.Clean);
            String string = promotionBannerView.getContext().getString(R.string.utr_pro_tennis_tour);
            string.getClass();
            n.d = string;
            String string2 = promotionBannerView.getContext().getString(R.string.stream_it_now);
            string2.getClass();
            n.e = string2;
            String string3 = promotionBannerView.getContext().getString(R.string.learn_more_button);
            string3.getClass();
            n.f = string3;
            n.k = Integer.valueOf(R.drawable.banner_utr);
            n.a();
            return;
        }
        if (ordinal != 4) {
            return;
        }
        vdf n2 = promotionBannerView.n(befVar, fvVar, OffersBannerLayout.Clean);
        String string4 = promotionBannerView.getContext().getString(R.string.sfl_promo_banner_title);
        string4.getClass();
        n2.d = string4;
        String string5 = promotionBannerView.getContext().getString(R.string.sfl_promo_banner_body);
        string5.getClass();
        n2.e = string5;
        String string6 = promotionBannerView.getContext().getString(R.string.learn_more_button);
        string6.getClass();
        n2.f = string6;
        n2.k = Integer.valueOf(R.drawable.banner_sfl);
        n2.a();
    }

    public static final void y(PromotionBannerView promotionBannerView, fv fvVar) {
        vdf n = promotionBannerView.n(bef.q, fvVar, OffersBannerLayout.Clean);
        String string = promotionBannerView.getContext().getString(R.string.banner_nba_league_pass_title);
        string.getClass();
        n.d = string;
        String string2 = promotionBannerView.getContext().getString(R.string.banner_nba_league_pass_description);
        string2.getClass();
        n.e = string2;
        String string3 = promotionBannerView.getContext().getString(R.string.link_visit_nba);
        string3.getClass();
        n.f = string3;
        n.k = Integer.valueOf(R.drawable.ic_nba_league_pass);
        n.a();
    }

    public static boolean z(j9e j9eVar, g78 g78Var, int i, b78 b78Var) {
        long C = j9eVar.C();
        long j = C >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((C >> 12) & 15);
        int i3 = (int) ((C >> 8) & 15);
        int i4 = (int) ((C >> 4) & 15);
        int i5 = (int) ((C >> 1) & 7);
        boolean z2 = (C & 1) == 1;
        if (i4 <= 7) {
            if (i4 != g78Var.h - 1) {
                return false;
            }
        } else if (i4 > 10 || g78Var.h != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == g78Var.j) || z2) {
            return false;
        }
        try {
            long I = j9eVar.I();
            if (!z) {
                I *= g78Var.c;
            }
            long j2 = g78Var.k;
            if (j2 != 0 && I > j2) {
                return false;
            }
            b78Var.a = I;
            int J = J(i2, j9eVar);
            long j3 = g78Var.k;
            boolean z3 = j3 == 0 || I + ((long) J) >= j3;
            if (J == -1) {
                return false;
            }
            if ((!z3 && J < g78Var.b) || J > g78Var.c) {
                return false;
            }
            int i6 = g78Var.f;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != g78Var.g) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int H = j9eVar.H();
                    if (i3 == 14) {
                        H *= 10;
                    }
                    if (H != i6) {
                        return false;
                    }
                } else if (j9eVar.A() * 1000 != i6) {
                    return false;
                }
            }
            int A = j9eVar.A();
            int i7 = j9eVar.b;
            byte[] bArr = j9eVar.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = j9eVar.b; i10 < i8; i10++) {
                i9 = nik.m[i9 ^ (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
            }
            String str = nik.a;
            if (A != i9) {
                return false;
            }
            if (j9eVar.a() != 0) {
                int j4 = j9eVar.j();
                if ((j4 & 128) != 0) {
                    return false;
                }
                int i11 = (j4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    tgj.O("Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
