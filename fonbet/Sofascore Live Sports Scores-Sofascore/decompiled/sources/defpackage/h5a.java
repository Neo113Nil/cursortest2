package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class h5a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static long e;
    public static Method f;
    public static Method g;
    public static Method h;

    public h5a() {
        new ConcurrentHashMap();
    }

    public static final void A(int i, int i2, int i3, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-427369763);
        int i4 = i3 | (av8Var.e(i) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc d0 = l98.d0(n9e.q(bkh.g(xtcVar, 84.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var), o7g.a(16.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.f, uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
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
            kq9.b(s6a.N(R.drawable.ic_weekly_streak, 6, av8Var), null, bkh.l(utcVar, 16.0f), r13.i, av8Var, V2.b.f, 0);
            xtc f0 = l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            Locale d2 = dla.d();
            String quantityString = context.getResources().getQuantityString(R.plurals.weekly_streak_counter, i);
            quantityString.getClass();
            String format = String.format(d2, quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            yf8 yf8Var = xth.a;
            udj.c(format, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.m(), av8Var, 48, 24576, 114680);
            av8Var.s(true);
            udj.c(oea.v(i2, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(i, i2, xtcVar, i3, 9);
        }
    }

    public static final void B(q5l q5lVar, xtc xtcVar, of3 of3Var, int i) {
        q5lVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1778921166);
        int i2 = (av8Var.g(q5lVar) ? 4 : 2) | i | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtcVar = utc.a;
            xtc q = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
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
            Integer num = q5lVar.a;
            int intValue = num != null ? num.intValue() : 0;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            A(intValue, R.string.weekly_current_streak, 0, av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            Integer num2 = q5lVar.b;
            int intValue2 = num2 != null ? num2.intValue() : 0;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            A(intValue2, R.string.weekly_longest_streak, 0, av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(q5lVar, xtcVar, i, 12);
        }
    }

    public static final void C(final rfl rflVar, final long j, final Function1 function1, final boolean z, final boolean z2, final boolean z3, final xtc xtcVar, of3 of3Var, final int i) {
        rflVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1761998333);
        int i2 = i | (av8Var.g(rflVar) ? 4 : 2) | (av8Var.f(j) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192) | (av8Var.h(z3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i2 & 1, (599187 & i2) != 599186)) {
            agl aglVar = rflVar.e;
            boolean z4 = aglVar != null;
            boolean g2 = av8Var.g(aglVar != null ? aglVar.b : null);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                if (z4) {
                    vel velVar = vel.a;
                    zdl zdlVar = (zdl) ((Map) vel.h.getValue()).get(aglVar.b);
                    if (zdlVar == null) {
                        zdlVar = vel.b;
                    }
                    O = zdlVar;
                } else {
                    O = null;
                }
                av8Var.n0(O);
            }
            zdl zdlVar2 = (zdl) O;
            if (zdlVar2 != null) {
                String str = aglVar != null ? aglVar.b : null;
                if (str != null && str.length() != 0 && aglVar.a != null) {
                    av8Var.d0(1398699698);
                    int i3 = i2 << 6;
                    int i4 = i2 << 3;
                    q5a.i(aglVar.a.intValue(), zdlVar2, rflVar, j, z, z2, z3, function1, xtcVar, av8Var, (i3 & 234881024) | ((i2 << 15) & 29360128) | (i3 & 8064) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016));
                    av8Var.s(false);
                }
            }
            av8Var.d0(1399129606);
            p(rflVar, z, function1, xtcVar, av8Var, (i2 & 14) | ((i2 >> 6) & 112) | (i2 & 896) | ((i2 >> 9) & 7168));
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(j, function1, z, z2, z3, xtcVar, i) { // from class: pfl
                public final /* synthetic */ long b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ xtc g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    h5a.C(rfl.this, this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static int D(BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle, int i) {
        return (blazeVideosPlayerButtonStyle.hashCode() + i) * 31;
    }

    public static final void E(yzc yzcVar, u6b u6bVar, List list, skd skdVar) {
        yzcVar.getClass();
        u6bVar.getClass();
        list.getClass();
        d5m d5mVar = new d5m(new deh(15, yzcVar, skdVar));
        yzcVar.e(u6bVar, skdVar);
        list.add(d5mVar);
    }

    public static final void F(h7d h7dVar, KClass kClass, Map map, km5 km5Var, Function1 function1, Function1 function12, Function1 function13, Function1 function14, tc3 tc3Var) {
        z8d z8dVar = h7dVar.g;
        z8dVar.getClass();
        pe3 pe3Var = new pe3((oe3) z8dVar.b(haa.o(oe3.class)), kClass, map, tc3Var);
        km5Var.getClass();
        im5.a.getClass();
        pe3Var.i = function1;
        pe3Var.j = function12;
        pe3Var.k = function13;
        pe3Var.l = function14;
        h7dVar.i.add(pe3Var.a());
    }

    public static Long K(Context context) {
        SharedPreferences d2;
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
        long j = sharedPreferences.getLong("PREF_REMOVE_ADS_YEARLY_OFFER_LAST_SHOWN_TIMESTAMP", 0L);
        if (j <= 0) {
            return null;
        }
        long currentTimeMillis = (j + 86400000) - System.currentTimeMillis();
        Long valueOf = Long.valueOf(currentTimeMillis);
        if (currentTimeMillis > 0) {
            return valueOf;
        }
        return null;
    }

    public static void L(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            is8.h(cause);
        }
    }

    public static boolean M() {
        if (Build.VERSION.SDK_INT >= 29) {
            return yrj.c();
        }
        try {
            Method method = f;
            if (method == null) {
                e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                f = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(e))).booleanValue();
        } catch (Exception e2) {
            L(e2);
            return false;
        }
    }

    public static final vy8 N(vy8 vy8Var, float f2) {
        l3e T = T(f2);
        return vy8Var.d(new n3e(T, T, T, T));
    }

    public static vy8 O(vy8 vy8Var, float f2, int i) {
        int i2 = i & 1;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i2 != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) == 0) {
            f3 = 8.0f;
        }
        return vy8Var.d(new n3e(T(f2), T(f3), T(f2), T(f3)));
    }

    public static vy8 P(vy8 vy8Var, float f2, float f3) {
        return vy8Var.d(new n3e(T(f2), T(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), T(f3), T(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }

    public static final jej Q(int i, int i2, int i3, of3 of3Var) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 8;
        }
        av8 av8Var = (av8) of3Var;
        sf8 sf8Var = (sf8) av8Var.k(dh3.k);
        kx4 kx4Var = (kx4) av8Var.k(dh3.h);
        ema emaVar = (ema) av8Var.k(dh3.n);
        boolean g2 = av8Var.g(sf8Var) | av8Var.g(kx4Var) | av8Var.e(emaVar.ordinal());
        if ((((i2 & 14) ^ 6) <= 4 || !av8Var.e(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = g2 | z;
        Object O = av8Var.O();
        if (z2 || O == nf3.a) {
            O = new jej(sf8Var, kx4Var, emaVar, i);
            av8Var.n0(O);
        }
        return (jej) O;
    }

    public static final ArrayList R(List list) {
        list.getClass();
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
    }

    public static final float S(List list, Resources resources) {
        Iterator it = list.iterator();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (it.hasNext()) {
            f2 += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return f2;
    }

    public static final l3e T(float f2) {
        return new l3e(f2, 2);
    }

    public static String U(String str) {
        return str.length() <= 127 ? str : str.substring(0, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean V(String str, Object[] objArr) {
        if (objArr != null) {
            int max = Math.max(0, 0);
            if (str == null) {
                while (max < 0) {
                    if (objArr[max] != null) {
                        max++;
                    } else if (max == -1) {
                        return true;
                    }
                }
            } else {
                while (max < 0) {
                    if (!str.equals(objArr[max])) {
                        max++;
                    } else if (max == -1) {
                    }
                }
            }
        }
        return false;
    }

    public static boolean W(byte b2) {
        return b2 > -65;
    }

    public static final void c(zdl zdlVar, xtc xtcVar, float f2, of3 of3Var, int i) {
        xtc xtcVar2;
        float f3;
        zdlVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(655805932);
        int i2 = (av8Var.g(zdlVar) ? 4 : 2) | i | 432;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new pcl(9);
                av8Var.n0(O);
            }
            final float f4 = 16.0f;
            tc3 H = yqo.H(107332634, av8Var, new et8() { // from class: qfl
                @Override // defpackage.et8
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    List list;
                    zdl zdlVar2 = (zdl) obj2;
                    int intValue = ((Integer) obj4).intValue();
                    ((k60) obj).getClass();
                    zdlVar2.getClass();
                    av8 av8Var2 = (av8) ((of3) obj3);
                    if (((Boolean) av8Var2.k(f5a.a)).booleanValue()) {
                        av8Var2.d0(2090915685);
                        av8Var2.s(false);
                        list = km5.a;
                    } else {
                        av8Var2.d0(2090959271);
                        boolean z = (((intValue & 112) ^ 48) > 32 && av8Var2.g(zdlVar2)) || (intValue & 48) == 32;
                        Object O2 = av8Var2.O();
                        if (z || O2 == nf3.a) {
                            vel velVar = vel.a;
                            Map map = (Map) vel.h.getValue();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (Intrinsics.c(entry.getValue(), zdlVar2)) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            O2 = kotlin.collections.a.d(l6g.W(linkedHashMap.keySet()));
                            av8Var2.n0(O2);
                        }
                        list = (List) O2;
                        av8Var2.s(false);
                    }
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    utc utcVar = utc.a;
                    xtc C = fqj.C(av8Var2, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c2, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    int size = list.size();
                    float f5 = f4;
                    if (size == 2) {
                        av8Var2.d0(-1366293319);
                        float f6 = 1.375f * f5;
                        float f7 = f5 * 0.625f;
                        String str = (String) CollectionsKt.a0(0, list);
                        td4.k(str == null ? "" : str, bkh.l(utcVar, f6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 0, 12);
                        String str2 = (String) CollectionsKt.a0(1, list);
                        td4.k(str2 == null ? "" : str2, bkh.l(l98.f0(utcVar, f7, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), f6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 0, 12);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-1365661415);
                        String str3 = (String) CollectionsKt.a0(0, list);
                        td4.k(str3 == null ? "" : str3, bkh.l(utcVar, f5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 0, 12);
                        String str4 = (String) CollectionsKt.a0(1, list);
                        td4.k(str4 == null ? "" : str4, bkh.l(l98.f0(utcVar, 0.75f * f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), f5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 0, 12);
                        String str5 = (String) CollectionsKt.a0(2, list);
                        td4.k(str5 == null ? "" : str5, bkh.l(l98.f0(utcVar, f5 * 0.25f, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), f5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 0, 12);
                        String str6 = (String) CollectionsKt.a0(3, list);
                        td4.k(str6 == null ? "" : str6, bkh.l(l98.f0(utcVar, f5, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), f5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 0, 12);
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                    return Unit.a;
                }
            });
            int i3 = (i2 & 14) | 1597872;
            utc utcVar = utc.a;
            l98.b(zdlVar, utcVar, (Function1) O, null, "team_logos", null, H, av8Var, i3, 40);
            xtcVar2 = utcVar;
            f3 = 16.0f;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            f3 = f2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new oc7(zdlVar, xtcVar2, f3, i, 3);
        }
    }

    public static final void g(final gla glaVar, final Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        tc3 tc3Var;
        final int i3;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(259141571);
        final int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(glaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i7 = glaVar.g;
            x43 x43Var = glaVar.p;
            boolean z = glaVar.e;
            String str = glaVar.h;
            String str2 = glaVar.i;
            tc3 H = yqo.H(1947230557, av8Var2, new ct8() { // from class: ela
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i5;
                    gla glaVar2 = glaVar;
                    switch (i8) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = glaVar2.k;
                                bx7 bx7Var = glaVar2.l;
                                l98.r(str3, bx7Var.c, bx7Var.b, bx7Var.d, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        case 1:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                xtc d0 = l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                ux7 ux7Var = glaVar2.m;
                                int i9 = ux7Var.a;
                                String str4 = ux7Var.b;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                l98.o(i9, str4, d0, Integer.valueOf(glaVar2.n.a), glaVar2.o.c, null, false, null, av8Var4, 384, 224);
                            } else {
                                av8Var4.W();
                            }
                            break;
                        default:
                            of3 of3Var4 = (of3) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var5 = (av8) of3Var4;
                            if (av8Var5.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                boolean i10 = av8Var5.i(glaVar2);
                                Object O = av8Var5.O();
                                if (i10 || O == nf3.a) {
                                    O = new ida(glaVar2, 3);
                                    av8Var5.n0(O);
                                }
                                td4.a((Function1) O, null, null, av8Var5, 0, 6);
                            } else {
                                av8Var5.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H2 = yqo.H(1722461155, av8Var2, new ct8() { // from class: ela
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i6;
                    gla glaVar2 = glaVar;
                    switch (i8) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = glaVar2.k;
                                bx7 bx7Var = glaVar2.l;
                                l98.r(str3, bx7Var.c, bx7Var.b, bx7Var.d, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        case 1:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                xtc d0 = l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                ux7 ux7Var = glaVar2.m;
                                int i9 = ux7Var.a;
                                String str4 = ux7Var.b;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                l98.o(i9, str4, d0, Integer.valueOf(glaVar2.n.a), glaVar2.o.c, null, false, null, av8Var4, 384, 224);
                            } else {
                                av8Var4.W();
                            }
                            break;
                        default:
                            of3 of3Var4 = (of3) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var5 = (av8) of3Var4;
                            if (av8Var5.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                boolean i10 = av8Var5.i(glaVar2);
                                Object O = av8Var5.O();
                                if (i10 || O == nf3.a) {
                                    O = new ida(glaVar2, 3);
                                    av8Var5.n0(O);
                                }
                                td4.a((Function1) O, null, null, av8Var5, 0, 6);
                            } else {
                                av8Var5.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H3 = yqo.H(-2085432415, av8Var2, new ct8() { // from class: ela
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i4;
                    gla glaVar2 = glaVar;
                    switch (i8) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = glaVar2.k;
                                bx7 bx7Var = glaVar2.l;
                                l98.r(str3, bx7Var.c, bx7Var.b, bx7Var.d, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        case 1:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                xtc d0 = l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                ux7 ux7Var = glaVar2.m;
                                int i9 = ux7Var.a;
                                String str4 = ux7Var.b;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                l98.o(i9, str4, d0, Integer.valueOf(glaVar2.n.a), glaVar2.o.c, null, false, null, av8Var4, 384, 224);
                            } else {
                                av8Var4.W();
                            }
                            break;
                        default:
                            of3 of3Var4 = (of3) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var5 = (av8) of3Var4;
                            if (av8Var5.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                boolean i10 = av8Var5.i(glaVar2);
                                Object O = av8Var5.O();
                                if (i10 || O == nf3.a) {
                                    O = new ida(glaVar2, 3);
                                    av8Var5.n0(O);
                                }
                                td4.a((Function1) O, null, null, av8Var5, 0, 6);
                            } else {
                                av8Var5.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            int i8 = i2 & 112;
            boolean i9 = (i8 == 32) | av8Var2.i(glaVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i9 || O == a99Var) {
                tc3Var = H3;
                i3 = 0;
                O = new Function0() { // from class: fla
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i10 = i3;
                        gla glaVar2 = glaVar;
                        Function1 function12 = function1;
                        switch (i10) {
                            case 0:
                                function12.invoke(new gw7(null, glaVar2.m.a, 30, null));
                                break;
                            default:
                                function12.invoke(new yv7(glaVar2));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(O);
            } else {
                tc3Var = H3;
                i3 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i8 == 32) {
                i3 = 1;
            }
            int i10 = i3 | (av8Var2.i(glaVar) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i10 != 0 || O2 == a99Var) {
                final int i11 = 1;
                O2 = new Function0() { // from class: fla
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i11;
                        gla glaVar2 = glaVar;
                        Function1 function12 = function1;
                        switch (i102) {
                            case 0:
                                function12.invoke(new gw7(null, glaVar2.m.a, 30, null));
                                break;
                            default:
                                function12.invoke(new yv7(glaVar2));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i7, x43Var, xtcVar, H, H2, null, tc3Var, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i2 & 896) | 1600512, ((i2 << 15) & 3670016) | 24576, 46240);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(glaVar, function1, xtcVar, i, 5);
        }
    }

    public static final void i(Integer num, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        String k;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-230264439);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g(num) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function0) ? 32 : 16;
        }
        int i7 = i2 | 384;
        if (av8Var.T(i7 & 1, (i7 & 147) != 146)) {
            if (num != null) {
                i3 = 2054178898;
                i4 = R.color.n_lv_1;
            } else {
                i3 = 2054179383;
                i4 = R.color.on_color_primary;
            }
            long f2 = ljg.f(av8Var, i3, i4, av8Var, false);
            if (num != null) {
                i5 = 2054181522;
                i6 = R.color.n_lv_3;
            } else {
                i5 = 2054182009;
                i6 = R.color.on_color_secondary;
            }
            long f3 = ljg.f(av8Var, i5, i6, av8Var, false);
            utc utcVar = utc.a;
            xtc e0 = l98.e0(bkh.d(utcVar, 1.0f), 16.0f, 16.0f, 8.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
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
            goa g2 = ljg.g(av8Var, C, f50Var3, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, g2);
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
            String v = oea.v(R.string.who_is_your_goat, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, f2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            if (num != null) {
                av8Var.d0(484341050);
                k = oea.v(R.string.prediction_total_votes, av8Var) + " " + uxf.E(num.intValue(), 62, false);
                av8Var.s(false);
            } else {
                k = ljg.k(av8Var, 484508419, R.string.lets_settle_the_debate, av8Var, false);
            }
            udj.c(k, null, f3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var.s(true);
            ImageVector N = s6a.N(R.drawable.ic_menu_list_share, 6, av8Var);
            xtc l = bkh.l(utcVar, 32.0f);
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
                O2 = jxa.b;
                av8Var.n0(O2);
            }
            kq9.b(N, null, l98.b0(tol.y(l, true, false, true, D, wzcVar, new p28((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 10), av8Var, 0), 4.0f), f2, av8Var, 48, 0);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(num, function0, xtcVar2, i, 9);
        }
    }

    public static final void j(exa exaVar, int i, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        boolean z;
        long j;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2031907182);
        int i3 = i2 | (av8Var2.g(exaVar) ? 4 : 2) | (av8Var2.e(i) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) av8Var2.k(nz.b);
            gv9 gv9Var = exaVar.b;
            if (gv9Var == null || !gv9Var.isEmpty()) {
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    if (((jrj) it.next()).c) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                j = ljg.f(av8Var2, 1547328159, R.color.surface_1, av8Var2, false);
            } else {
                av8Var2.d0(1547328957);
                av8Var2.s(false);
                j = r13.i;
            }
            xtc A = wnn.A(bkh.d(xtcVar, 1.0f), o7g.a(16.0f));
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
                O2 = jxa.c;
                av8Var2.n0(O2);
            }
            boolean z2 = z;
            long j2 = j;
            xtc y = tol.y(A, true, true, true, D, wzcVar, new kxa((boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), z, context, i), av8Var2, 0);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            d7e t = haa.t(2131231519, 0, av8Var2);
            n12 n12Var = n12.a;
            utc utcVar = utc.a;
            wkn.k(t, null, n12Var.b(utcVar), null, mp3.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24632, 104);
            av8Var = av8Var2;
            xtc q = n9e.q(bkh.d(utcVar, 1.0f), j2, o7g.a(16.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            i(z2 ? Integer.valueOf(exaVar.a) : null, function0, null, av8Var, (i3 >> 3) & 112);
            if (z2) {
                av8Var.d0(1988748261);
                av8Var.d0(-628582978);
                int i4 = 0;
                for (Object obj : CollectionsKt.L0(gv9Var, 3)) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    w3a.i(i5, (jrj) obj, null, av8Var, 0);
                    i4 = i5;
                }
                av8Var.s(false);
                String v = oea.v(R.string.see_all, av8Var);
                xtc z3 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, 5).z(new we9(uxf.p));
                boolean i6 = av8Var.i(context);
                Object O3 = av8Var.O();
                if (i6 || O3 == a99Var) {
                    O3 = new c6(context, 27);
                    av8Var.n0(O3);
                }
                bea.f(v, z3, null, false, (Function0) O3, Integer.valueOf(R.drawable.ic_chevron_right_large_16), av8Var, 0, 12);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                bf3.r(8.0f, 1989544961, av8Var, av8Var, utcVar);
                tol.b(dh3.n.a(ema.a), yqo.H(-922495950, av8Var, new n61(context, i, 7)), av8Var, 56);
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(exaVar, xtcVar, function0, i, i2, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(xtc xtcVar, float f2, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        float f3;
        xtc xtcVar3;
        float f4;
        eqf u;
        q50 q50Var;
        q50 q50Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1581201483);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = (av8Var.g(xtcVar2) ? 4 : 2) | i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f3 = f2;
            i3 |= av8Var.d(f3) ? 32 : 16;
            if (av8Var.T(i3 & 1, (i3 & 19) == 18)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
                f4 = f3;
            } else {
                xtcVar3 = i4 != 0 ? utc.a : xtcVar2;
                f4 = i5 != 0 ? 20.0f : f3;
                long D = lz.D(R.color.live, av8Var);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = e.f(Boolean.FALSE);
                    av8Var.n0(O);
                }
                e1d e1dVar = (e1d) O;
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    av8Var.n0(O2);
                }
                q50 q50Var3 = (q50) O2;
                Object O3 = av8Var.O();
                if (O3 == a99Var) {
                    O3 = ml4.b(0.25f);
                    av8Var.n0(O3);
                }
                q50 q50Var4 = (q50) O3;
                Boolean bool = (Boolean) e1dVar.getValue();
                bool.getClass();
                boolean i6 = av8Var.i(q50Var3) | av8Var.i(q50Var4);
                Object O4 = av8Var.O();
                if (i6 || O4 == a99Var) {
                    q50Var = q50Var3;
                    h10 h10Var = new h10(q50Var, q50Var4, e1dVar, (rq3) null, 11);
                    q50Var2 = q50Var4;
                    av8Var.n0(h10Var);
                    O4 = h10Var;
                } else {
                    q50Var2 = q50Var4;
                    q50Var = q50Var3;
                }
                hz8.o(av8Var, bool, (Function2) O4);
                xtc l = bkh.l(xtcVar3, f4);
                boolean f5 = av8Var.f(D) | av8Var.i(q50Var) | av8Var.i(q50Var2);
                Object O5 = av8Var.O();
                if (f5 || O5 == a99Var) {
                    bv2 bv2Var = new bv2(D, q50Var, q50Var2, 1);
                    av8Var.n0(bv2Var);
                    O5 = bv2Var;
                }
                lz.d(0, av8Var, l, (Function1) O5);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new v07(f4, i, i2, xtcVar3);
                return;
            }
            return;
        }
        f3 = f2;
        if (av8Var.T(i3 & 1, (i3 & 19) == 18)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void n(p23 p23Var, b7k b7kVar, dch dchVar, tc3 tc3Var, of3 of3Var, int i, int i2) {
        p23 p23Var2;
        int i3;
        b7k b7kVar2;
        dch dchVar2;
        b7k b7kVar3;
        int i4;
        int i5;
        int i6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(53836214);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                p23Var2 = p23Var;
                if (av8Var.g(p23Var2)) {
                    i6 = 4;
                    i3 = i6 | i;
                }
            } else {
                p23Var2 = p23Var;
            }
            i6 = 2;
            i3 = i6 | i;
        } else {
            p23Var2 = p23Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                b7kVar2 = b7kVar;
                if (av8Var.g(b7kVar2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                b7kVar2 = b7kVar;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            b7kVar2 = b7kVar;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                dchVar2 = dchVar;
                if (av8Var.g(dchVar2)) {
                    i4 = NotificationCompat.FLAG_LOCAL_ONLY;
                    i3 |= i4;
                }
            } else {
                dchVar2 = dchVar;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            dchVar2 = dchVar;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var.i(tc3Var) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                if ((i2 & 1) != 0) {
                    p23Var2 = (p23) av8Var.k(q23.a);
                }
                b7kVar3 = (i2 & 2) != 0 ? (b7k) av8Var.k(e7k.b) : b7kVar2;
                if ((i2 & 4) != 0) {
                    dchVar2 = (dch) av8Var.k(fch.a);
                }
            } else {
                av8Var.W();
                b7kVar3 = b7kVar2;
            }
            av8Var.t();
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                p23 p23Var3 = new p23(p23Var2.b(), ((r13) ((eoh) p23Var2.b).getValue()).a, ((r13) ((eoh) p23Var2.c).getValue()).a, ((r13) ((eoh) p23Var2.d).getValue()).a, ((r13) ((eoh) p23Var2.e).getValue()).a, p23Var2.c(), ((r13) ((eoh) p23Var2.g).getValue()).a, ((r13) ((eoh) p23Var2.h).getValue()).a, ((r13) ((eoh) p23Var2.i).getValue()).a, ((r13) ((eoh) p23Var2.j).getValue()).a, p23Var2.a(), ((r13) ((eoh) p23Var2.l).getValue()).a, p23Var2.d());
                av8Var.n0(p23Var3);
                O = p23Var3;
            }
            p23 p23Var4 = (p23) O;
            ff5 ff5Var = q23.a;
            long b2 = p23Var2.b();
            e1d e1dVar = p23Var4.a;
            e1d e1dVar2 = p23Var4.e;
            ((eoh) e1dVar).setValue(new r13(b2));
            r13 r13Var = (r13) ((eoh) p23Var2.b).getValue();
            long j = r13Var.a;
            ((eoh) p23Var4.b).setValue(r13Var);
            r13 r13Var2 = (r13) ((eoh) p23Var2.c).getValue();
            long j2 = r13Var2.a;
            ((eoh) p23Var4.c).setValue(r13Var2);
            r13 r13Var3 = (r13) ((eoh) p23Var2.d).getValue();
            long j3 = r13Var3.a;
            ((eoh) p23Var4.d).setValue(r13Var3);
            r13 r13Var4 = (r13) ((eoh) p23Var2.e).getValue();
            long j4 = r13Var4.a;
            ((eoh) e1dVar2).setValue(r13Var4);
            ((eoh) p23Var4.f).setValue(new r13(p23Var2.c()));
            r13 r13Var5 = (r13) ((eoh) p23Var2.g).getValue();
            long j5 = r13Var5.a;
            ((eoh) p23Var4.g).setValue(r13Var5);
            r13 r13Var6 = (r13) ((eoh) p23Var2.h).getValue();
            long j6 = r13Var6.a;
            ((eoh) p23Var4.h).setValue(r13Var6);
            r13 r13Var7 = (r13) ((eoh) p23Var2.i).getValue();
            long j7 = r13Var7.a;
            ((eoh) p23Var4.i).setValue(r13Var7);
            r13 r13Var8 = (r13) ((eoh) p23Var2.j).getValue();
            long j8 = r13Var8.a;
            ((eoh) p23Var4.j).setValue(r13Var8);
            ((eoh) p23Var4.k).setValue(new r13(p23Var2.a()));
            r13 r13Var9 = (r13) ((eoh) p23Var2.l).getValue();
            long j9 = r13Var9.a;
            ((eoh) p23Var4.l).setValue(r13Var9);
            ((eoh) p23Var4.m).setValue(Boolean.valueOf(p23Var2.d()));
            q5g a2 = o5g.a();
            long b3 = p23Var4.b();
            long j10 = ((r13) ((eoh) e1dVar2).getValue()).a;
            av8Var.d0(-2060762245);
            long a3 = q23.a(p23Var4, j10);
            if (a3 == 16) {
                a3 = ((r13) av8Var.k(mo3.a)).a;
            }
            av8Var.s(false);
            long j11 = ((r13) av8Var.k(mo3.a)).a;
            long c2 = r13.c(a3, (!((p23) av8Var.k(q23.a)).d() ? ((double) hkg.e0(j11)) < 0.5d : ((double) hkg.e0(j11)) > 0.5d) ? 0.6f : 0.74f);
            boolean f2 = av8Var.f(b3) | av8Var.f(j10) | av8Var.f(c2);
            Object O2 = av8Var.O();
            float f3 = 1.0f;
            if (f2 || O2 == a99Var) {
                long b4 = p23Var4.b();
                float s = r4a.s(b3, 0.4f, c2, j10);
                float s2 = r4a.s(b3, 0.2f, c2, j10);
                float f4 = 0.4f;
                if (s < 4.5f) {
                    float f5 = 0.2f;
                    if (s2 >= 4.5f) {
                        float f6 = 0.4f;
                        for (int i7 = 0; i7 < 7; i7++) {
                            float s3 = (r4a.s(b3, f4, c2, j10) / 4.5f) - 1.0f;
                            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= s3 && s3 <= 0.01f) {
                                break;
                            }
                            if (s3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f6 = f4;
                            } else {
                                f5 = f4;
                            }
                            f4 = (f6 + f5) / 2.0f;
                        }
                    } else {
                        f4 = 0.2f;
                    }
                }
                wej wejVar = new wej(b4, r13.c(b3, f4));
                av8Var.n0(wejVar);
                O2 = wejVar;
            }
            wej wejVar2 = (wej) O2;
            ff5 ff5Var2 = q23.a;
            gb0 a4 = ff5Var2.a(p23Var4);
            ff5 ff5Var3 = go3.a;
            long j12 = ((r13) av8Var.k(mo3.a)).a;
            if (!((p23) av8Var.k(ff5Var2)).d() ? hkg.e0(j12) >= 0.5d : hkg.e0(j12) <= 0.5d) {
                f3 = 0.87f;
            }
            tol.c(new gb0[]{a4, ff5Var3.a(Float.valueOf(f3)), f1a.a.a(a2), fch.a.a(dchVar2), xej.a.a(wejVar2), e7k.b.a(b7kVar3)}, yqo.H(496803446, av8Var, new op9(14, b7kVar3, tc3Var)), av8Var, 56);
        } else {
            av8Var.W();
            b7kVar3 = b7kVar2;
        }
        dch dchVar3 = dchVar2;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hj7(p23Var2, b7kVar3, dchVar3, tc3Var, i, i2, 2);
        }
    }

    public static final void p(rfl rflVar, boolean z, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        boolean z2;
        Function1 function12 = function1;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1459376101);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(rflVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z3 = z || !rflVar.b;
            boolean z4 = z3;
            cdi b2 = a60.b(z3 ? 180.0f : 0.0f, null, "arrow_rotation_animation", av8Var2, 3072, 22);
            gv9 gv9Var = vel.d;
            int size = gv9Var.size();
            f2a q = i2a.q(i2a.F(null, av8Var2, 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size - 1, s02.P(s02.h0(size * 3500, 0, jg5.d, 2), bzf.a, 0L, 4), "wc_color_index", av8Var2, 28728, 0);
            boolean g2 = av8Var2.g(gv9Var);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (g2 || O == a99Var) {
                O = goh.b(new hp5(q, size, gv9Var, 10));
                av8Var2.n0(O);
            }
            b0l b0lVar = (b0l) ((cdi) O).getValue();
            xtc A = wnn.A(l98.d0(bkh.d(xtcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f));
            A.getClass();
            b0lVar.getClass();
            xtc d0 = l98.d0(n9e.q(fqj.q(A, new uri(b0lVar, 22)), lz.D(R.color.darken_overlay_1, av8Var2), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
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
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
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
            c(b0lVar.a, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0);
            int i3 = 1;
            xtc e2 = fn0.e(1.0f, l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), true);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, e2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            String v = oea.v(R.string.team_spotlight, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 0, 0, 131066);
            tc3 tc3Var = yso.c;
            x23 x23Var = x23.a;
            fz8.b(x23Var, !z4, null, null, null, null, tc3Var, av8Var2, 1572870, 30);
            av8 av8Var3 = av8Var2;
            av8Var3.s(true);
            if (rflVar.b) {
                av8Var3.d0(-2120994762);
                xtc l = bkh.l(utcVar, 32.0f);
                boolean z5 = (i2 & 896) == 256;
                z2 = z4;
                boolean h2 = av8Var3.h(z2) | z5;
                Object O2 = av8Var3.O();
                if (h2 || O2 == a99Var) {
                    function12 = function1;
                    O2 = new ct2(function12, z2, 3);
                    av8Var3.n0(O2);
                } else {
                    function12 = function1;
                }
                ao2.g((Function0) O2, l, false, null, null, yqo.H(-539033806, av8Var3, new mph(b2, i3)), av8Var3, 1572912, 60);
                av8Var3 = av8Var3;
                av8Var3.s(false);
            } else {
                function12 = function1;
                z2 = z4;
                av8Var3.d0(-2120395625);
                av8Var3.s(false);
            }
            av8Var3.s(true);
            av8 av8Var4 = av8Var3;
            fz8.b(x23Var, z2, null, null, null, null, yqo.H(246079319, av8Var3, new e6i(24, rflVar, function12)), av8Var4, 1572870, 30);
            av8Var = av8Var4;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(rflVar, z, function12, xtcVar, i, 23);
        }
    }

    public static final long q(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void r(boolean z, Function2 function2, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-642000585);
        if ((i & 6) == 0) {
            i2 = (av8Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function2) ? 32 : 16;
        }
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (g8d) av8Var.k(ohb.a);
            if (obj == null) {
                av8Var.d0(1512740606);
                obj = phb.a(av8Var);
            } else {
                av8Var.d0(1512737723);
            }
            av8Var.s(false);
            if (obj == null) {
                a70.r("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean g2 = av8Var.g(obj);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g2 || O == a99Var) {
                g8d g8dVar = obj instanceof g8d ? (g8d) obj : null;
                f8d navigationEventDispatcher = g8dVar != null ? g8dVar.getNavigationEventDispatcher() : null;
                vpd vpdVar = obj instanceof vpd ? (vpd) obj : null;
                O = new qx0(navigationEventDispatcher, vpdVar != null ? vpdVar.getOnBackPressedDispatcher() : null);
                av8Var.n0(O);
            }
            qx0 qx0Var = (qx0) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = hz8.G(g.a, av8Var);
                av8Var.n0(O2);
            }
            ku3 ku3Var = (ku3) O2;
            long j = av8Var.T;
            boolean g3 = av8Var.g(qx0Var) | av8Var.f(j);
            Object O3 = av8Var.O();
            if (g3 || O3 == a99Var) {
                O3 = new te3(ku3Var, new h4f(obj, j));
                av8Var.n0(O3);
            }
            te3 te3Var = (te3) O3;
            av8Var.d0(-348514256);
            boolean i4 = av8Var.i(te3Var) | av8Var.i(function2);
            Object O4 = av8Var.O();
            if (i4 || O4 == a99Var) {
                O4 = new zbe(10, te3Var, function2);
                av8Var.n0(O4);
            }
            hz8.t((Function0) O4, av8Var);
            Boolean valueOf = Boolean.valueOf(z);
            int i5 = i2 & 14;
            boolean i6 = (i5 == 4) | av8Var.i(te3Var);
            Object O5 = av8Var.O();
            if (i6 || O5 == a99Var) {
                O5 = new sx0(te3Var, z, 5);
                av8Var.n0(O5);
            }
            jca.e(valueOf, te3Var, null, (Function1) O5, av8Var, i5);
            boolean i7 = av8Var.i(qx0Var) | av8Var.i(te3Var);
            Object O6 = av8Var.O();
            if (i7 || O6 == a99Var) {
                O6 = new ord(24, qx0Var, te3Var);
                av8Var.n0(O6);
            }
            hz8.b(qx0Var, te3Var, (Function1) O6, av8Var);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l9b(i, i3, function2, z);
        }
    }

    public static final void s(int i, int i2, long j, of3 of3Var, xtc xtcVar) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(95708309);
        int i3 = i2 | (av8Var2.e(i) ? 4 : 2) | (av8Var2.f(j) ? 32 : 16) | 384;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            long u = ((kx4) av8Var2.k(dh3.h)).u(12.0f);
            mv1 mv1Var = uxf.g;
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 16.0f);
            n7g n7gVar = o7g.a;
            xtc q = n9e.q(wnn.A(l, n7gVar), j, n7gVar);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String valueOf = String.valueOf(i);
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            udj.c(valueOf, null, lz.D(R.color.on_color_primary, av8Var2), null, u, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.n(), av8Var2, 0, 0, 131050);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new fr1(i, j, xtcVar2, i2, 2);
        }
    }

    public static final void t(f49 f49Var, wla wlaVar, ct8 ct8Var, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        ct8 ct8Var2;
        av8 av8Var;
        wlaVar.getClass();
        ct8Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1567644957);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(f49Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? av8Var2.g(wlaVar) : av8Var2.i(wlaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            ct8Var2 = ct8Var;
            i2 |= av8Var2.i(ct8Var2) ? 256 : 128;
        } else {
            ct8Var2 = ct8Var;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            xtc d0 = l98.d0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
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
            utc utcVar = utc.a;
            z8e.l(R.drawable.ic_more_media, R.string.feed_clips_for_you, 384, av8Var2, l98.f0(utcVar, 16.0f, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, 4));
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new wla();
                av8Var2.n0(O);
            }
            Context context = (Context) av8Var2.k(nz.b);
            xtc s = b6a.s(utcVar, (wla) O);
            t3e C2 = l98.C(8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            boolean i3 = ((i2 & 14) == 4) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && av8Var2.i(wlaVar))) | av8Var2.i(context) | ((i2 & 896) == 256);
            Object O2 = av8Var2.O();
            if (i3 || O2 == a99Var) {
                lwc lwcVar = new lwc(f49Var, wlaVar, context, ct8Var2, 8);
                av8Var2.n0(lwcVar);
                O2 = lwcVar;
            }
            v8a.c(s, null, C2, null, null, null, false, null, (Function1) O2, av8Var2, 100663680, 250);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(i, 25, f49Var, wlaVar, ct8Var, xtcVar);
        }
    }

    public static final void u(ShortVideoFeedCardModel shortVideoFeedCardModel, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        shortVideoFeedCardModel.getClass();
        function1.getClass();
        xtcVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(54596849);
        int i2 = 4;
        int i3 = i | (av8Var.g(shortVideoFeedCardModel) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtc A = wnn.A(l98.f0(bkh.m(xtcVar, 100.0f, 188.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), o7g.a(12.0f));
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new deh(i4, function1, shortVideoFeedCardModel);
                av8Var.n0(O);
            }
            un0.a(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), o7g.a(12.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), rd0.u(2.0f, 62), null, yqo.H(-2092819649, av8Var, new kr1(shortVideoFeedCardModel, i2)), av8Var, 196608, 16);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(shortVideoFeedCardModel, function1, xtcVar, i, 0);
        }
    }

    public static final void v(int i, int i2, long j, of3 of3Var, xtc xtcVar, Function1 function1, boolean z) {
        boolean z2;
        int i3;
        long j2;
        xtc xtcVar2;
        long j3;
        xtc xtcVar3;
        float H0;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1534636471);
        if ((i & 6) == 0) {
            z2 = z;
            i3 = (av8Var.h(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i & 3072) == 0) {
            j2 = j;
            i4 |= ((i2 & 8) == 0 && av8Var.f(j2)) ? a.o : 1024;
        } else {
            j2 = j;
        }
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                int i5 = i2 & 8;
                xtcVar3 = utc.a;
                if (i5 != 0) {
                    j2 = lz.D(R.color.primary_default, av8Var);
                    i4 &= -7169;
                }
            } else {
                av8Var.W();
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                }
                xtcVar3 = xtcVar;
            }
            int i6 = i4;
            long j4 = j2;
            av8Var.t();
            long D = lz.D(R.color.neutral_variant, av8Var);
            long c2 = r13.c(lz.D(R.color.n_lv_1, av8Var), 0.15f);
            boolean z3 = (i6 & 14) == 4;
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (z3 || O == obj) {
                O = e.f(Boolean.valueOf(z2));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            i4k h0 = s02.h0(150, 0, null, 6);
            if (((Boolean) e1dVar.getValue()).booleanValue()) {
                av8Var.d0(1572241558);
                H0 = ((kx4) av8Var.k(dh3.h)).H0(28.0f);
                av8Var.s(false);
            } else {
                av8Var.d0(1572313974);
                H0 = ((kx4) av8Var.k(dh3.h)).H0(10.0f);
                av8Var.s(false);
            }
            xtc xtcVar4 = xtcVar3;
            cdi b2 = a60.b(H0, h0, "", av8Var, 3120, 20);
            cdi a2 = wih.a(((Boolean) e1dVar.getValue()).booleanValue() ? j4 : D, s02.h0(250, 0, null, 6), "", av8Var, 432, 8);
            av8Var = av8Var;
            xtc c0 = l98.c0(bkh.m(xtcVar4, 48.0f, 24.0f), 6.0f, 2.0f);
            Unit unit = Unit.a;
            boolean g2 = av8Var.g(e1dVar) | ((i6 & 112) == 32);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj) {
                O2 = new ot3(2, function1, e1dVar);
                av8Var.n0(O2);
            }
            xtc a3 = koi.a(c0, unit, (PointerInputEventHandler) O2);
            boolean f2 = av8Var.f(c2) | av8Var.g(a2) | av8Var.g(b2);
            Object O3 = av8Var.O();
            if (f2 || O3 == obj) {
                O3 = new pz1(c2, a2, b2, 3);
                av8Var.n0(O3);
            }
            lz.d(0, av8Var, a3, (Function1) O3);
            j3 = j4;
            xtcVar2 = xtcVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            j3 = j2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new plh(i, i2, j3, xtcVar2, function1, z);
        }
    }

    public static final void w(String str, int i, xtc xtcVar, p4b p4bVar, of3 of3Var, int i2, int i3) {
        p4b p4bVar2;
        int i4;
        av8 av8Var;
        p4b p4bVar3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1138325914);
        int i5 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.e(i) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            p4bVar2 = p4bVar;
        } else {
            p4bVar2 = p4bVar;
            i4 = i5 | (av8Var2.g(p4bVar2) ? a.o : 1024);
        }
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            p4b p4bVar4 = i6 != 0 ? null : p4bVar2;
            xtc d0 = l98.d0(n9e.q(bkh.g(xtcVar, 84.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var2), o7g.a(16.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.f, uxf.p, av8Var2, 54);
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
            waa.K(av8Var2, C, f50Var3);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var2, utcVar);
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
            if (p4bVar4 != null) {
                av8Var2.d0(1967100688);
                o6a.d(bkh.p(utcVar, 24.0f), p4bVar4, av8Var2, ((i4 >> 6) & 112) | 6, 0);
                av8Var2.s(false);
            } else {
                av8Var2.d0(1967252526);
                av8Var2.s(false);
            }
            xtc f0 = l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            yf8 yf8Var = xth.a;
            int i7 = (i4 & 14) | 48;
            udj.c(str, f0, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.m(), av8Var2, i7, 24576, 114680);
            av8Var2.s(true);
            av8Var = av8Var2;
            udj.c(oea.v(i, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            av8Var.s(true);
            p4bVar3 = p4bVar4;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            p4bVar3 = p4bVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(str, i, xtcVar, p4bVar3, i2, i3);
        }
    }

    public static final void x(s2l s2lVar, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        String w;
        s2lVar.getClass();
        String str = s2lVar.d;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-729713803);
        int i2 = (av8Var.g(s2lVar) ? 4 : 2) | i | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtcVar2 = utc.a;
            xtc q = n9e.q(bkh.d(xtcVar2, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
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
            Integer num = s2lVar.a;
            String str2 = str != null ? str : "";
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String str3 = str == null ? "" : str;
            String str4 = s2lVar.c;
            w(str2, R.string.weekly_challenge_highest_league, goaVar, new p4b(true, true, str3, str4 == null ? "" : str4, "", "", 1, R.color.on_color_primary), av8Var, 0, 0);
            if (num == null) {
                av8Var.d0(717007776);
                av8Var.s(false);
                w = null;
            } else {
                av8Var.d0(717007777);
                w = oea.w(R.string.hashtag_template, new Object[]{num}, av8Var);
                av8Var.s(false);
            }
            if (w == null) {
                w = "-";
            }
            String str5 = w;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            w(str5, R.string.weekly_challenge_highest_rank, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, av8Var, 0, 8);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(s2lVar, xtcVar2, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y(String str, tc3 tc3Var, xtc xtcVar, boolean z, Function0 function0, of3 of3Var, int i, int i2) {
        boolean z2;
        int i3;
        Function0 function02;
        int i4;
        tc3 tc3Var2;
        xtc xtcVar2;
        boolean z3;
        eqf u;
        boolean z4;
        utc utcVar;
        utc utcVar2;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-457384824);
        int i5 = (av8Var.g(str) ? 4 : 2) | i;
        int i6 = i5 | 384;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 = i5 | 3456;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i6 |= av8Var.h(z2) ? a.o : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i4 = i6 | 24576;
                function02 = function0;
            } else {
                function02 = function0;
                i4 = i6 | (av8Var.i(function02) ? 16384 : 8192);
            }
            if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
                tc3Var2 = tc3Var;
                av8Var.W();
                xtcVar2 = xtcVar;
                z3 = z2;
            } else {
                if (i7 != 0) {
                    z2 = false;
                }
                Function0 function03 = i3 != 0 ? null : function02;
                av8Var.d0(-1460138992);
                utc utcVar3 = utc.a;
                xtc A = wnn.A(n9e.q(bkh.d(utcVar3, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), o7g.a(16.0f));
                if (function03 != null) {
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
                        O2 = wzj.h;
                        av8Var.n0(O2);
                    }
                    utcVar = utcVar3;
                    z4 = false;
                    xtc y = tol.y(utcVar, true, true, true, D, wzcVar, new cyg((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function03, 26), av8Var, 0);
                    av8Var = av8Var;
                    A = A.z(y);
                } else {
                    z4 = false;
                    utcVar = utcVar3;
                }
                av8Var.s(z4);
                xtc e0 = l98.e0(A, 8.0f, 16.0f, 8.0f, 8.0f);
                u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var, 54);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, e0);
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
                l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                boolean z5 = z2;
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, utcVar);
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
                yf8 yf8Var = xth.a;
                int i8 = i4 & 14;
                av8 av8Var2 = av8Var;
                utc utcVar4 = utcVar;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, i8, 0, 131066);
                av8Var = av8Var2;
                if (z5) {
                    av8Var.d0(-868389828);
                    utcVar2 = utcVar4;
                    kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var), null, bkh.l(l98.f0(utcVar4, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                    av8Var.s(false);
                } else {
                    utcVar2 = utcVar4;
                    av8Var.d0(-868064576);
                    av8Var.s(false);
                }
                av8Var.s(true);
                tc3Var2 = tc3Var;
                tc3Var2.invoke(av8Var, 6);
                av8Var.s(true);
                function02 = function03;
                xtcVar2 = utcVar2;
                z3 = z5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new ci(str, tc3Var2, xtcVar2, z3, function02, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public abstract Typeface G(Context context, lg8 lg8Var, Resources resources, int i);

    public abstract Typeface H(Context context, yg8[] yg8VarArr, int i);

    public Typeface I(int i, Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface J(Context context, Resources resources, int i, String str);
}
