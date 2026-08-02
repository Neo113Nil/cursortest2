package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.material.card.MaterialCardView;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.ESportMap;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.model.newNetwork.ShotActionArea;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.BettingTipsActivity;
import com.sofascore.results.fantasy.ui.components.FantasyLeaderboardStatistic;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.settings.SettingsActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class tol {
    public static final int[] a = {R.color.heatmap_bb_00, R.color.heatmap_bb_05, R.color.heatmap_bb_25, R.color.heatmap_bb_40, R.color.heatmap_bb_60, R.color.heatmap_bb_75, R.color.heatmap_bb_85, R.color.heatmap_bb_99, R.color.heatmap_bb_100};
    public static final float[] b = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.05f, 0.25f, 0.4f, 0.6f, 0.75f, 0.85f, 0.99f, 1.0f};
    public static final tc3 c = new tc3(-2110752512, new pr1(6), false);
    public static final tc3 d = new tc3(1645590508, new ud3(15), false);
    public static final Object e = new Object();
    public static final byte[] f = {48, 49, 53, 0};
    public static final byte[] g = {48, 49, 48, 0};
    public static final byte[] h = {48, 48, 57, 0};
    public static final byte[] i = {48, 48, 53, 0};
    public static final byte[] j = {48, 48, 49, 0};
    public static final byte[] k = {48, 48, 49, 0};
    public static final byte[] l = {48, 48, 50, 0};
    public static final b10 m;
    public static final b10 n;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;

    static {
        long j2 = -1L;
        int i2 = 2;
        int i3 = 25;
        m = new b10((Object) "gads:crash_without_write_reset_v3:count", (Object) j2, i2, i3);
        n = new b10((Object) "gads:init_without_write_reset_v3:count", (Object) j2, i2, i3);
    }

    public static int A(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static int B(Object obj) {
        return A(obj == null ? 0 : obj.hashCode());
    }

    public static int C(a35 a35Var, jrg jrgVar) {
        if (a35Var instanceof t25) {
            return ((t25) a35Var).a;
        }
        int ordinal = jrgVar.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Integer.MAX_VALUE;
        }
        zzl.b();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(swd swdVar, OutputStream outputStream, sq3 sq3Var) {
        dy dyVar;
        int i2;
        try {
            if (sq3Var instanceof dy) {
                dyVar = (dy) sq3Var;
                int i3 = dyVar.t;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dyVar.t = i3 - Integer.MIN_VALUE;
                    Object obj = dyVar.s;
                    lu3 lu3Var = lu3.a;
                    i2 = dyVar.t;
                    if (i2 != 0) {
                        y6a.M(obj);
                        if (swdVar instanceof rwd) {
                            outputStream.write(((rwd) swdVar).d());
                            Unit unit = Unit.a;
                        } else if (swdVar instanceof ku4) {
                            db2 d2 = ((ku4) swdVar).d();
                            dyVar.r = outputStream;
                            dyVar.t = 1;
                            if (pea.r(d2, outputStream, Long.MAX_VALUE, dyVar) == lu3Var) {
                                return lu3Var;
                            }
                            Unit unit2 = Unit.a;
                        } else {
                            if (!(swdVar instanceof dm5)) {
                                throw new ndd();
                            }
                            Unit unit3 = Unit.a;
                        }
                    } else if (i2 == 1) {
                        outputStream = dyVar.r;
                        y6a.M(obj);
                        Unit unit22 = Unit.a;
                    } else if (i2 == 2) {
                        outputStream = dyVar.r;
                        y6a.M(obj);
                    } else {
                        if (i2 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        outputStream = dyVar.r;
                        y6a.M(obj);
                        Unit unit4 = Unit.a;
                    }
                    Unit unit5 = Unit.a;
                    n4o.x(outputStream, null);
                    return Unit.a;
                }
            }
            if (i2 != 0) {
            }
            Unit unit52 = Unit.a;
            n4o.x(outputStream, null);
            return Unit.a;
        } finally {
        }
        dyVar = new dy(sq3Var);
        Object obj2 = dyVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = dyVar.t;
    }

    public static final void a(int i2, int i3, of3 of3Var, Function0 function0, boolean z) {
        boolean z2;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-361453782);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else if ((i2 & 6) == 0) {
            z2 = z;
            i4 = (av8Var.h(z2) ? 4 : 2) | i2;
        } else {
            z2 = z;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.i(function0) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            boolean z3 = i5 != 0 ? true : z2;
            Object obj = (g8d) av8Var.k(ohb.a);
            if (obj == null) {
                av8Var.d0(535274673);
                obj = phb.a(av8Var);
            } else {
                av8Var.d0(535271790);
            }
            av8Var.s(false);
            if (obj == null) {
                a70.r("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean g2 = av8Var.g(obj);
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            if (g2 || O == obj2) {
                g8d g8dVar = obj instanceof g8d ? (g8d) obj : null;
                f8d navigationEventDispatcher = g8dVar != null ? g8dVar.getNavigationEventDispatcher() : null;
                vpd vpdVar = obj instanceof vpd ? (vpd) obj : null;
                O = new qx0(navigationEventDispatcher, vpdVar != null ? vpdVar.getOnBackPressedDispatcher() : null);
                av8Var.n0(O);
            }
            Object obj3 = (qx0) O;
            long j2 = av8Var.T;
            boolean g3 = av8Var.g(obj3) | av8Var.f(j2);
            Object O2 = av8Var.O();
            Object obj4 = O2;
            if (g3 || O2 == obj2) {
                zd3 zd3Var = new zd3(new rx0(obj, j2));
                zd3Var.c = new t63(3);
                av8Var.n0(zd3Var);
                obj4 = zd3Var;
            }
            Object obj5 = (zd3) obj4;
            av8Var.d0(-585307852);
            boolean i6 = av8Var.i(obj5) | ((i4 & 112) == 32);
            Object O3 = av8Var.O();
            if (i6 || O3 == obj2) {
                O3 = new j4(11, obj5, function0);
                av8Var.n0(O3);
            }
            hz8.t((Function0) O3, av8Var);
            Boolean valueOf = Boolean.valueOf(z3);
            int i7 = i4 & 14;
            boolean i8 = av8Var.i(obj5) | (i7 == 4);
            Object O4 = av8Var.O();
            if (i8 || O4 == obj2) {
                O4 = new sx0(obj5, z3, 0);
                av8Var.n0(O4);
            }
            jca.e(valueOf, obj5, null, (Function1) O4, av8Var, i7);
            boolean i9 = av8Var.i(obj3) | av8Var.i(obj5);
            Object O5 = av8Var.O();
            if (i9 || O5 == obj2) {
                O5 = new s1(12, obj3, obj5);
                av8Var.n0(O5);
            }
            hz8.b(obj3, obj5, (Function1) O5, av8Var);
            av8Var.s(false);
            z2 = z3;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tx0(z2, function0, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(gb0 gb0Var, Function2 function2, of3 of3Var, int i2) {
        jkk jkkVar;
        boolean z;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-149765515);
        e7a e7aVar = av8Var.x;
        aee m2 = av8Var.m();
        av8Var.Z(201, sf3.b);
        Object O = av8Var.O();
        if (Intrinsics.c(O, nf3.a)) {
            jkkVar = null;
        } else {
            O.getClass();
            jkkVar = (jkk) O;
        }
        d dVar = (d) gb0Var.f;
        jkk c2 = dVar.c(gb0Var, jkkVar);
        boolean equals = c2.equals(jkkVar);
        if (!equals) {
            av8Var.n0(c2);
        }
        if (av8Var.S) {
            if (gb0Var.e || !m2.containsKey(dVar)) {
                m2 = m2.j(dVar, c2);
            }
            av8Var.J = true;
        } else {
            ilh ilhVar = av8Var.G;
            Object b2 = ilhVar.b(ilhVar.g, ilhVar.b);
            b2.getClass();
            aee aeeVar = (aee) b2;
            if (!(av8Var.D() && equals) && (gb0Var.e || !m2.containsKey(dVar))) {
                m2 = m2.j(dVar, c2);
            } else if ((equals && !av8Var.w) || !av8Var.w) {
                m2 = aeeVar;
            }
            if (av8Var.y || aeeVar != m2) {
                z = true;
                if (z && !av8Var.S) {
                    av8Var.M(m2);
                }
                e7aVar.e(av8Var.w ? 1 : 0);
                av8Var.w = z;
                av8Var.K = m2;
                av8Var.X(202, sf3.c, m2, 0);
                function2.invoke(av8Var, Integer.valueOf((i2 >> 3) & 14));
                av8Var.s(false);
                av8Var.s(false);
                av8Var.w = e7aVar.d() != 0;
                av8Var.K = null;
                u = av8Var.u();
                if (u == null) {
                    u.d = new lj(gb0Var, function2, i2, 13);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            av8Var.M(m2);
        }
        e7aVar.e(av8Var.w ? 1 : 0);
        av8Var.w = z;
        av8Var.K = m2;
        av8Var.X(202, sf3.c, m2, 0);
        function2.invoke(av8Var, Integer.valueOf((i2 >> 3) & 14));
        av8Var.s(false);
        av8Var.s(false);
        av8Var.w = e7aVar.d() != 0;
        av8Var.K = null;
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(gb0[] gb0VarArr, Function2 function2, of3 of3Var, int i2) {
        aee f2;
        boolean z;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(415205898);
        e7a e7aVar = av8Var.x;
        aee m2 = av8Var.m();
        av8Var.Z(201, sf3.b);
        boolean z2 = av8Var.S;
        otd otdVar = sf3.d;
        if (z2) {
            aee K = ktm.K(gb0VarArr, m2, aee.g);
            m2.getClass();
            zde zdeVar = new zde(m2);
            zdeVar.g = m2;
            zdeVar.putAll(K);
            f2 = zdeVar.f();
            av8Var.Z(204, otdVar);
            av8Var.G();
            av8Var.o0(f2);
            av8Var.G();
            av8Var.o0(K);
            av8Var.s(false);
            av8Var.J = true;
        } else {
            ilh ilhVar = av8Var.G;
            Object h2 = ilhVar.h(ilhVar.g, 0);
            h2.getClass();
            aee aeeVar = (aee) h2;
            ilh ilhVar2 = av8Var.G;
            Object h3 = ilhVar2.h(ilhVar2.g, 1);
            h3.getClass();
            aee aeeVar2 = (aee) h3;
            aee K2 = ktm.K(gb0VarArr, m2, aeeVar2);
            if (av8Var.D() && !av8Var.y && aeeVar2.equals(K2)) {
                av8Var.l = av8Var.G.s() + av8Var.l;
                f2 = aeeVar;
            } else {
                m2.getClass();
                zde zdeVar2 = new zde(m2);
                zdeVar2.g = m2;
                zdeVar2.putAll(K2);
                f2 = zdeVar2.f();
                av8Var.Z(204, otdVar);
                av8Var.G();
                av8Var.o0(f2);
                av8Var.G();
                av8Var.o0(K2);
                av8Var.s(false);
                if (av8Var.y || !f2.equals(aeeVar)) {
                    z = true;
                    if (z && !av8Var.S) {
                        av8Var.M(f2);
                    }
                    e7aVar.e(av8Var.w ? 1 : 0);
                    av8Var.w = z;
                    av8Var.K = f2;
                    av8Var.X(202, sf3.c, f2, 0);
                    function2.invoke(av8Var, Integer.valueOf((i2 >> 3) & 14));
                    av8Var.s(false);
                    av8Var.s(false);
                    av8Var.w = e7aVar.d() != 0;
                    av8Var.K = null;
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new lj(gb0VarArr, function2, i2, 12);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            av8Var.M(f2);
        }
        e7aVar.e(av8Var.w ? 1 : 0);
        av8Var.w = z;
        av8Var.K = f2;
        av8Var.X(202, sf3.c, f2, 0);
        function2.invoke(av8Var, Integer.valueOf((i2 >> 3) & 14));
        av8Var.s(false);
        av8Var.s(false);
        av8Var.w = e7aVar.d() != 0;
        av8Var.K = null;
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v48, types: [java.lang.Double] */
    public static final void d(mte mteVar, final boolean z, final boolean z2, final Integer num, final Function1 function1, Long l2, final long j2, final xtc xtcVar, final boolean z3, of3 of3Var, final int i2) {
        int i3;
        mte mteVar2;
        av8 av8Var;
        r13 r13Var;
        long j3;
        mv1 mv1Var;
        Object obj;
        utc utcVar;
        av8 av8Var2;
        boolean z4;
        int i4;
        boolean z5;
        r13 e2;
        long j4;
        av8 av8Var3;
        Integer num2;
        av8 av8Var4;
        Integer num3;
        Integer num4;
        Double d2;
        final Long l3 = l2;
        mv1 mv1Var2 = uxf.k;
        function1.getClass();
        av8 av8Var5 = (av8) of3Var;
        av8Var5.f0(2137251364);
        if ((i2 & 6) == 0) {
            i3 = (av8Var5.g(mteVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var5.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var5.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var5.g(num) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var5.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var5.g(l3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var5.f(j2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= av8Var5.g(xtcVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= av8Var5.h(z3) ? 67108864 : 33554432;
        }
        if (av8Var5.T(i3 & 1, (38347923 & i3) != 38347922)) {
            boolean z6 = av8Var5.k(dh3.n) == ema.b;
            boolean z7 = (z && !z6) || (!z && z6);
            float f2 = z7 ? 0.15f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = z7 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.15f;
            Double d3 = mteVar != null ? mteVar.c : null;
            if (d3 == null) {
                av8Var5.d0(-2034109977);
                av8Var5.s(false);
                r13Var = null;
            } else {
                av8Var5.d0(-2034109976);
                long x = kpg.x(d3.doubleValue(), av8Var5);
                av8Var5.s(false);
                r13Var = new r13(x);
            }
            if (r13Var == null) {
                j3 = ljg.f(av8Var5, 904216689, R.color.rating_90, av8Var5, false);
            } else {
                av8Var5.d0(904214395);
                av8Var5.s(false);
                j3 = r13Var.a;
            }
            long D = lz.D(R.color.n_lv_1, av8Var5);
            boolean f4 = av8Var5.f(j3) | av8Var5.d(f2) | av8Var5.d(f3);
            Object O = av8Var5.O();
            int i5 = i3;
            a99 a99Var = nf3.a;
            if (f4 || O == a99Var) {
                mv1Var = mv1Var2;
                Pair[] pairArr = {new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new r13(r13.c(j3, f2))), new Pair(Float.valueOf(1.0f), new r13(r13.c(j3, f3)))};
                av8Var5.n0(pairArr);
                obj = pairArr;
            } else {
                mv1Var = mv1Var2;
                obj = O;
            }
            Pair[] pairArr2 = (Pair[]) obj;
            av8Var5.d0(904229116);
            xtc p2 = n9e.p(xtcVar, wxf.t((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6);
            utc utcVar2 = utc.a;
            if (mteVar != null) {
                long D2 = lz.D(R.color.n_lv_4, av8Var5);
                Object O2 = av8Var5.O();
                if (O2 == a99Var) {
                    O2 = mz1.e(av8Var5);
                }
                wzc wzcVar = (wzc) O2;
                Object[] objArr = new Object[0];
                Object O3 = av8Var5.O();
                if (O3 == a99Var) {
                    O3 = b74.r;
                    av8Var5.n0(O3);
                }
                mteVar2 = mteVar;
                qz5 qz5Var = new qz5((boh) o3a.N(objArr, (Function0) O3, av8Var5, 48), mteVar2, function1);
                z4 = false;
                xtc y = y(utcVar2, true, true, true, D2, wzcVar, qz5Var, av8Var5, 0);
                utcVar = utcVar2;
                av8Var2 = av8Var5;
                p2 = p2.z(y);
            } else {
                mteVar2 = mteVar;
                utcVar = utcVar2;
                av8Var2 = av8Var5;
                z4 = false;
            }
            av8Var2.s(z4);
            xtc c0 = l98.c0(p2, 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
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
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            String v = oea.v(z ? R.string.fans_player_of_the_match_pick : R.string.sofascore_rating, av8Var2);
            yf8 yf8Var = xth.a;
            utc utcVar3 = utcVar;
            av8 av8Var6 = av8Var2;
            udj.c(v, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var6, 0, 24960, 110586);
            nq8.h(av8Var6, bkh.e(utcVar3, 8.0f));
            xtc p3 = bkh.p(utcVar3, 52.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var6.T);
            aee m3 = av8Var6.m();
            xtc C2 = fqj.C(av8Var6, p3);
            av8Var6.h0();
            if (av8Var6.S) {
                av8Var6.l(zg3Var);
            } else {
                av8Var6.q0();
            }
            waa.K(av8Var6, c2, f50Var);
            waa.K(av8Var6, m3, ff3Var);
            bf3.s(hashCode2, av8Var6, f50Var2, av8Var6, ryVar);
            waa.K(av8Var6, C2, f50Var3);
            int i6 = mteVar2 != null ? mteVar2.a : -1;
            mv1 mv1Var3 = uxf.g;
            n12 n12Var = n12.a;
            td4.C(i6, bkh.l(n12Var.a(utcVar3, mv1Var3), 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var6, 0, 12);
            Double d4 = mteVar2 != null ? mteVar2.c : null;
            if (d4 == null) {
                av8Var6.d0(307093878);
                z5 = false;
                av8Var6.s(false);
                e2 = null;
            } else {
                av8Var6.d0(307093879);
                double doubleValue = d4.doubleValue();
                if (doubleValue != 0.0d) {
                    if (doubleValue < 6.0d) {
                        i4 = R.color.rating_10;
                    } else if (doubleValue < 6.5d) {
                        i4 = R.color.rating_60;
                    } else if (doubleValue < 7.0d) {
                        i4 = R.color.rating_65;
                    } else if (doubleValue < 8.0d) {
                        i4 = R.color.rating_70;
                    } else if (doubleValue < 9.0d) {
                        i4 = R.color.rating_80;
                    } else if (doubleValue <= 10.0d) {
                        i4 = R.color.rating_90;
                    }
                    z5 = false;
                    e2 = vxd.e(av8Var6, false, lz.D(i4, av8Var6));
                }
                i4 = R.color.rating_00;
                z5 = false;
                e2 = vxd.e(av8Var6, false, lz.D(i4, av8Var6));
            }
            if (e2 == null) {
                j4 = ljg.f(av8Var6, 979739803, R.color.primary_default, av8Var6, z5);
            } else {
                av8Var6.d0(979737106);
                av8Var6.s(z5);
                j4 = e2.a;
            }
            long j5 = j4;
            if (z) {
                av8Var6.d0(307243702);
                c5n.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 28, j5, 0L, av8Var6, n12Var.a(utcVar3, mv1Var));
                av8Var3 = av8Var6;
                av8Var3.s(false);
            } else {
                av8Var6.d0(307427129);
                c5n.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 28, j5, 0L, av8Var6, n12Var.a(utcVar3, mv1Var));
                av8Var3 = av8Var6;
                av8Var3.s(false);
            }
            bf3.t(av8Var3, true, utcVar3, 8.0f, av8Var3);
            if (mteVar2 != null) {
                av8Var3.d0(-977939333);
                av8 av8Var7 = av8Var3;
                udj.c(mteVar2.b, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var7, 0, 24960, 110586);
                nq8.h(av8Var7, bkh.e(utcVar3, 2.0f));
                l8g a3 = k8g.a(ww9.b, uxf.m, av8Var7, 48);
                int hashCode3 = Long.hashCode(av8Var7.T);
                aee m4 = av8Var7.m();
                xtc C3 = fqj.C(av8Var7, utcVar3);
                av8Var7.h0();
                if (av8Var7.S) {
                    av8Var7.l(zg3Var);
                } else {
                    av8Var7.q0();
                }
                waa.K(av8Var7, a3, f50Var);
                waa.K(av8Var7, m4, ff3Var);
                bf3.s(hashCode3, av8Var7, f50Var2, av8Var7, ryVar);
                waa.K(av8Var7, C3, f50Var3);
                td4.G(mteVar2.f, bkh.l(utcVar3, 16.0f), false, 0L, av8Var7, 48, 12);
                nq8.h(av8Var7, bkh.p(utcVar3, 4.0f));
                udj.c(mteVar2.g, null, lz.D(R.color.n_lv_3, av8Var7), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var7, 0, 24960, 110586);
                av8Var3 = av8Var7;
                av8Var3.s(true);
                av8Var3.s(false);
                l3 = l2;
                num2 = null;
            } else {
                av8Var3.d0(-977076169);
                l3 = l2;
                num2 = null;
                wnn.g(l3, null, z3, av8Var3, ((i5 >> 15) & 14) | ((i5 >> 18) & 896));
                av8Var3.s(false);
            }
            nq8.h(av8Var3, bkh.e(utcVar3, 8.0f));
            if (z) {
                av8Var3.d0(-976887689);
                Integer valueOf2 = (mteVar2 == null || (d2 = mteVar2.d) == null) ? num2 : Integer.valueOf((int) d2.doubleValue());
                if (mteVar2 != null) {
                    av8Var4 = av8Var3;
                    num3 = valueOf2;
                    num4 = mteVar2.e;
                } else {
                    av8Var4 = av8Var3;
                    num3 = valueOf2;
                    num4 = num2;
                }
                if (mteVar2 != null) {
                    num2 = Integer.valueOf(mteVar2.a);
                }
                av8 av8Var8 = av8Var4;
                oyn.d(num3, num4, j2, Intrinsics.c(num2, num), z2, null, av8Var8, ((i5 >> 12) & 896) | (57344 & (i5 << 6)));
                av8Var = av8Var8;
                av8Var.s(false);
            } else {
                av8Var3.d0(-976544209);
                av8 av8Var9 = av8Var3;
                i9a.j(mteVar2 != null ? mteVar2.c : num2, false, !z3, bkh.l(utcVar3, 32.0f), false, true, new p75(18.0f), av8Var9, 1772592, 16);
                av8Var = av8Var9;
                av8Var.s(false);
            }
            w1l.s(utcVar3, 8.0f, av8Var, true);
        } else {
            mteVar2 = mteVar;
            av8Var = av8Var5;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final mte mteVar3 = mteVar2;
            u.d = new Function2() { // from class: d56
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    tol.d(mte.this, z, z2, num, function1, l3, j2, xtcVar, z3, (of3) obj2, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(String str, String str2, String str3, Function0 function0, Function0 function02, xtc xtcVar, String str4, xqh xqhVar, xqh xqhVar2, of3 of3Var, int i2) {
        xtc xtcVar2;
        String str5;
        xqh xqhVar3;
        int i3;
        String v;
        xtc xtcVar3;
        xqh xqhVar4;
        str.getClass();
        str2.getClass();
        str3.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1381435290);
        int i4 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.g(str3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024) | (av8Var.i(function02) ? 16384 : 8192) | 101384192;
        if (av8Var.T(i4 & 1, (38347923 & i4) != 38347922)) {
            av8Var.Y();
            int i5 = i2 & 1;
            utc utcVar = utc.a;
            if (i5 == 0 || av8Var.B()) {
                i3 = i4 & (-3670017);
                v = oea.v(R.string.cancel, av8Var);
                xtcVar3 = utcVar;
                xqhVar4 = gqh.a;
            } else {
                av8Var.W();
                v = str4;
                xqhVar4 = xqhVar2;
                i3 = i4 & (-3670017);
                xtcVar3 = xtcVar;
            }
            av8Var.t();
            xtc b0 = l98.b0(n9e.q(wnn.A(l98.d0(bkh.d(xtcVar3, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f)), lz.D(R.color.surface_P, av8Var), oyn.e), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            xtc xtcVar4 = xtcVar3;
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var, i3 & 14, 24960, 110586);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, (i3 >> 3) & 14, 0, 131066);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
            we9 we9Var = new we9(uxf.q);
            l8g a3 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, we9Var);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String str6 = v;
            xqh xqhVar5 = xqhVar4;
            mha.h(str6, function02, null, xqhVar5, null, false, false, false, 0L, 0, 0, av8Var, ((i3 >> 9) & 112) | 3072, 0, 2036);
            mha.h(str3, function0, null, xqhVar, null, false, false, false, 0L, 0, 0, av8Var, ((i3 >> 6) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 3072, 0, 2036);
            av8Var.s(true);
            av8Var.s(true);
            str5 = str6;
            xqhVar3 = xqhVar5;
            xtcVar2 = xtcVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            str5 = str4;
            xqhVar3 = xqhVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qn6(str, str2, str3, function0, function02, xtcVar2, str5, xqhVar, xqhVar3, i2);
        }
    }

    public static final void f(il8 il8Var, boolean z, final Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        final Function1 function12;
        xtc xtcVar2;
        final il8 il8Var2 = il8Var;
        il8Var2.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-148115609);
        int i3 = i2 | (av8Var.e(il8Var2.ordinal()) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128) | 3072;
        final int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            int i5 = i3 & 896;
            int i6 = i3 & 14;
            boolean z2 = (i5 == 256) | (i6 == 4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new Function0() { // from class: w17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                function1.invoke(il8Var2);
                                break;
                            default:
                                function1.invoke(il8Var2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            }
            final int i7 = 1;
            xtc c0 = l98.c0(y(d2, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            kq9.b(s6a.N(il8Var2.c, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            goa d3 = bf3.d(utcVar, 16.0f, av8Var, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            il8Var2 = il8Var;
            String v = oea.v(il8Var2.a, av8Var);
            yf8 yf8Var = xth.a;
            boolean z3 = false;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            udj.c(oea.v(il8Var2.b, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            xtc l2 = bkh.l(utcVar, 24.0f);
            clf r2 = t6a.r(lz.D(R.color.primary_default, av8Var), lz.D(R.color.primary_default, av8Var), av8Var);
            boolean z4 = i5 == 256;
            if (i6 == 4) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object O2 = av8Var.O();
            if (z5 || O2 == a99Var) {
                function12 = function1;
                O2 = new Function0() { // from class: w17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                function12.invoke(il8Var2);
                                break;
                            default:
                                function12.invoke(il8Var2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            } else {
                function12 = function1;
            }
            y6a.d(z, (Function0) O2, l2, false, r2, av8Var, ((i3 >> 3) & 14) | 384, 40);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            function12 = function1;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(il8Var2, z, function12, xtcVar2, i2, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final osa osaVar, a37 a37Var, final boolean z, final ev6 ev6Var, final Function1 function1, final Function1 function12, final Function1 function13, xtc xtcVar, Function0 function0, boolean z2, of3 of3Var, final int i2, final int i3) {
        Function0 function02;
        int i4;
        boolean z3;
        final xtc xtcVar2;
        av8 av8Var;
        final boolean z4;
        final Function0 function03;
        a99 a99Var;
        Object obj;
        Brand brand;
        BrandColors color;
        String E;
        boolean z5;
        float f2;
        Object obj2;
        utc utcVar;
        a99 a99Var2;
        g28 g28Var;
        Function0 function04;
        ksa ksaVar;
        final boolean z6;
        av8 av8Var2;
        gv9 gv9Var;
        final eo7 eo7Var;
        final a37 a37Var2 = a37Var;
        osaVar.getClass();
        a37Var2.getClass();
        ev6Var.getClass();
        BrandingFantasyCompetition brandingFantasyCompetition = ev6Var.D;
        function1.getClass();
        function12.getClass();
        function13.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1197707736);
        int i5 = i2 | (av8Var3.i(osaVar) ? 4 : 2) | (av8Var3.g(a37Var2) ? 32 : 16) | (av8Var3.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var3.g(ev6Var) ? a.o : 1024) | (av8Var3.i(function1) ? 16384 : 8192) | (av8Var3.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var3.i(function13) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i6 = i5 | 12582912;
        int i7 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i7 != 0) {
            i4 = i5 | 113246208;
            function02 = function0;
        } else {
            function02 = function0;
            i4 = i6 | (av8Var3.i(function02) ? 67108864 : 33554432);
        }
        int i8 = i3 & 512;
        if (i8 != 0) {
            i4 |= 805306368;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 805306368) == 0) {
                i4 |= av8Var3.h(z3) ? 536870912 : 268435456;
            }
        }
        int i9 = i4;
        if (av8Var3.T(i9 & 1, (i9 & 306783379) != 306783378)) {
            if (i7 != 0) {
                function02 = null;
            }
            boolean z7 = i8 != 0 ? false : z3;
            final Context context = (Context) av8Var3.k(nz.b);
            final ksa a2 = msa.a(0, 0, av8Var3, 0, 3);
            Object O = av8Var3.O();
            a99 a99Var3 = nf3.a;
            if (O == a99Var3) {
                O = hz8.G(g.a, av8Var3);
                av8Var3.n0(O);
            }
            final ku3 ku3Var = (ku3) O;
            Object O2 = av8Var3.O();
            if (O2 == a99Var3) {
                ia0 ia0Var = ia0.q;
                O2 = ok3.p().e().getId();
                av8Var3.n0(O2);
            }
            final String str = (String) O2;
            fo1 fo1Var = a37Var2.e;
            boolean z8 = a37Var2.g;
            boolean z9 = fo1Var != null;
            final Function0 function05 = function02;
            Object[] objArr = new Object[0];
            Object O3 = av8Var3.O();
            if (O3 == a99Var3) {
                O3 = new au6(18);
                av8Var3.n0(O3);
            }
            final e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O3, av8Var3, 48);
            boolean h2 = av8Var3.h(z8) | av8Var3.h(z9) | av8Var3.e(((r27) e1dVar.getValue()).ordinal());
            Object O4 = av8Var3.O();
            if (h2 || O4 == a99Var3) {
                r27 r27Var = (r27) e1dVar.getValue();
                r27Var.getClass();
                O4 = (z8 && r27Var == r27.a) ? l6g.K(FantasyLeaderboardStatistic.Wins, FantasyLeaderboardStatistic.Draws, FantasyLeaderboardStatistic.Losses, FantasyLeaderboardStatistic.H2HPoints) : (z8 && r27Var == r27.b) ? l6g.K(FantasyLeaderboardStatistic.PointsFor, FantasyLeaderboardStatistic.PointsAgainst, FantasyLeaderboardStatistic.H2HPoints) : z9 ? l6g.K(FantasyLeaderboardStatistic.Points) : l6g.K(FantasyLeaderboardStatistic.RoundPoints, FantasyLeaderboardStatistic.Points);
                av8Var3.n0(O4);
            }
            final gv9 gv9Var2 = (gv9) O4;
            Object O5 = av8Var3.O();
            if (O5 == a99Var3) {
                O5 = goh.b(new mi(28, a2, str, osaVar));
                av8Var3.n0(O5);
            }
            cdi cdiVar = (cdi) O5;
            Object O6 = av8Var3.O();
            if (O6 == a99Var3) {
                O6 = goh.b(new ni4(a2, 2));
                av8Var3.n0(O6);
            }
            final cdi cdiVar2 = (cdi) O6;
            boolean g2 = av8Var3.g(brandingFantasyCompetition);
            Object O7 = av8Var3.O();
            if (g2 || O7 == a99Var3) {
                it7 it7Var = un6.b;
                un6 un6Var = un6.REWARD;
                it7Var.getClass();
                O7 = Boolean.valueOf(it7.x(brandingFantasyCompetition, un6Var, true));
                av8Var3.n0(O7);
            }
            final boolean booleanValue = ((Boolean) O7).booleanValue();
            boolean g3 = av8Var3.g(brandingFantasyCompetition);
            Object O8 = av8Var3.O();
            if (g3 || O8 == a99Var3) {
                if (brandingFantasyCompetition == null || (brand = brandingFantasyCompetition.getBrand()) == null || (color = brand.getColor()) == null || (E = tz9.E(color, context)) == null) {
                    a99Var = a99Var3;
                    obj = null;
                } else {
                    a99Var = a99Var3;
                    obj = new r13(hkg.b(Color.parseColor(E)));
                }
                av8Var3.n0(obj);
            } else {
                obj = O8;
                a99Var = a99Var3;
            }
            final r13 r13Var = (r13) obj;
            if (z7) {
                av8Var3.d0(54167040);
                WeakHashMap weakHashMap = cal.w;
                float a3 = xw3.s(qea.p(av8Var3).e, av8Var3).a();
                z5 = false;
                av8Var3.s(false);
                f2 = a3;
            } else {
                z5 = false;
                av8Var3.d0(54168042);
                av8Var3.s(false);
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            g28 g28Var2 = bkh.c;
            k1c c2 = e12.c(uxf.c, z5);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            a99 a99Var4 = a99Var;
            xtc C = fqj.C(av8Var3, g28Var2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, c2, hf3.g);
            waa.K(av8Var3, m2, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(utcVar2, 1.0f);
            t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f + f2, 7);
            boolean i10 = ((i9 & 112) == 32) | av8Var3.i(context) | ((57344 & i9) == 16384) | av8Var3.i(ku3Var) | av8Var3.g(a2) | ((i9 & 7168) == 2048) | av8Var3.h(booleanValue) | av8Var3.g(r13Var) | ((i9 & 14) == 4 || av8Var3.i(osaVar)) | av8Var3.g(e1dVar) | ((234881024 & i9) == 67108864) | av8Var3.g(gv9Var2) | ((3670016 & i9) == 1048576) | av8Var3.h(z9) | ((i9 & 896) == 256) | ((458752 & i9) == 131072);
            Object O9 = av8Var3.O();
            if (!i10) {
                if (O9 == a99Var4) {
                    a99Var4 = a99Var4;
                } else {
                    function04 = function05;
                    a99Var2 = a99Var4;
                    z6 = z9;
                    utcVar = utcVar2;
                    ksaVar = a2;
                    obj2 = O9;
                    gv9Var = gv9Var2;
                    g28Var = g28Var2;
                    a37Var2 = a37Var;
                    av8Var2 = av8Var3;
                    av8 av8Var4 = av8Var2;
                    v8a.a(d2, ksaVar, C2, null, null, null, false, null, (Function1) obj2, av8Var4, 6, PglCryptUtils.BASE64_FAILED);
                    s6a.a(Intrinsics.c(osaVar.d().a, ofb.b), g28Var, av8Var4, 48);
                    eo7Var = a37Var2.d;
                    if (eo7Var != null) {
                        av8Var4.d0(-1393763852);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(-1393763851);
                        utc utcVar3 = utcVar;
                        xtc a4 = n12.a.a(utcVar3, uxf.j);
                        boolean booleanValue2 = ((Boolean) cdiVar.getValue()).booleanValue();
                        i4k h0 = s02.h0(250, 0, null, 6);
                        Object O10 = av8Var4.O();
                        int i11 = 12;
                        a99 a99Var5 = a99Var2;
                        if (O10 == a99Var5) {
                            O10 = new yt6(i11);
                            av8Var4.n0(O10);
                        }
                        zo5 n2 = uo5.n(h0, (Function1) O10);
                        i4k h02 = s02.h0(250, 0, null, 6);
                        Object O11 = av8Var4.O();
                        if (O11 == a99Var5) {
                            O11 = new yt6(i11);
                            av8Var4.n0(O11);
                        }
                        final gv9 gv9Var3 = gv9Var;
                        final float f3 = f2;
                        utcVar = utcVar3;
                        fz8.e(booleanValue2, a4, n2, uo5.p(h02, (Function1) O11), null, yqo.H(662609866, av8Var4, new ct8() { // from class: y27
                            @Override // defpackage.ct8
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                of3 of3Var2 = (of3) obj4;
                                ((Integer) obj5).getClass();
                                ((r70) obj3).getClass();
                                long D = lz.D(R.color.surface_1, of3Var2);
                                long D2 = lz.D(R.color.surface_1, of3Var2);
                                yso.g(eo7Var, gv9Var3, z6, z, tol.m(n9e.q(wnn.A(l98.f0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f + f3, 2), o7g.a(16.0f)), lz.D(R.color.primary_default, of3Var2), o7g.a(16.0f))), D, D2, null, true, false, false, of3Var2, 113246208, 0, 1536);
                                return Unit.a;
                            }
                        }), av8Var4, 196608, 16);
                        Unit unit = Unit.a;
                        av8Var4.s(false);
                    }
                    av8Var4.s(true);
                    av8Var = av8Var4;
                    z4 = z7;
                    xtcVar2 = utcVar;
                    function03 = function04;
                }
            }
            final boolean z10 = z9;
            utcVar = utcVar2;
            a99Var2 = a99Var4;
            g28Var = g28Var2;
            a37Var2 = a37Var;
            obj2 = new Function1() { // from class: x27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    final r13 r13Var2;
                    Brand brand2;
                    esa esaVar = (esa) obj3;
                    esaVar.getClass();
                    final a37 a37Var3 = a37.this;
                    boolean z11 = a37Var3.g;
                    final Context context2 = context;
                    if (!z11) {
                        esa.b(esaVar, "dropdown", new tc3(-1791252246, new dl1(a37Var3, function1, ku3Var, a2, context2, cdiVar2), true), 2);
                    }
                    final ev6 ev6Var2 = ev6Var;
                    BrandingFantasyCompetition brandingFantasyCompetition2 = ev6Var2.D;
                    final boolean z12 = booleanValue;
                    final r13 r13Var3 = r13Var;
                    if (brandingFantasyCompetition2 != null && (brand2 = brandingFantasyCompetition2.getBrand()) != null) {
                        if (!z12) {
                            brand2 = null;
                        }
                        if (brand2 != null) {
                            esaVar.f("branding_strip", "branding_strip", new tc3(-1734408795, new d67(19, brand2, r13Var3, ev6Var2), true));
                        }
                    }
                    final osa osaVar2 = osaVar;
                    if (osaVar2.c() > 0) {
                        if (a37Var3.g) {
                            esaVar.f("h2h_toggle", "h2h_toggle", new tc3(-1057676496, new l4b(e1dVar, z12, r13Var3, 3), true));
                        }
                        eo7 eo7Var2 = a37Var3.d;
                        if (eo7Var2 != null) {
                            final long longValue = eo7Var2.k.longValue();
                            ct8 ct8Var = new ct8() { // from class: u27
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    long j2;
                                    xpa xpaVar = (xpa) obj4;
                                    of3 of3Var2 = (of3) obj5;
                                    int intValue = ((Integer) obj6).intValue();
                                    xpaVar.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((av8) of3Var2).g(xpaVar) ? 4 : 2;
                                    }
                                    av8 av8Var5 = (av8) of3Var2;
                                    if (av8Var5.T(intValue & 1, (intValue & 19) != 18)) {
                                        String w = oea.w(R.string.last_updated_template, new Object[]{rik.j(context2, longValue, bi4.PATTERN_DMM, ", ")}, av8Var5);
                                        yf8 yf8Var = xth.a;
                                        dfj b2 = xth.b();
                                        long D = lz.D(R.color.n_lv_3, av8Var5);
                                        av8Var5.d0(680583661);
                                        xtc a5 = xpa.a(xpaVar, utc.a, 7);
                                        boolean z13 = z12;
                                        xtc q2 = n9e.q(bkh.d(u0a.F(a5, (z13 || a37Var3.g) ? icb.b : icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var5, 62), 1.0f), lz.D(R.color.surface_1, av8Var5), oyn.e);
                                        if (z13) {
                                            r13 r13Var4 = r13Var3;
                                            if (r13Var4 == null) {
                                                j2 = ljg.f(av8Var5, -1340682517, R.color.primary_default, av8Var5, false);
                                            } else {
                                                av8Var5.d0(-1340682951);
                                                av8Var5.s(false);
                                                j2 = r13Var4.a;
                                            }
                                            q2 = q2.z(f5p.F(j2));
                                        }
                                        av8Var5.s(false);
                                        udj.c(w, l98.f0(l98.d0(q2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), D, null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, b2, av8Var5, 0, 24960, 109560);
                                    } else {
                                        av8Var5.W();
                                    }
                                    return Unit.a;
                                }
                            };
                            a37Var3 = a37Var3;
                            r13Var2 = r13Var3;
                            esaVar.f("updated_at_label", "updated_at_label", new tc3(-1867446176, ct8Var, true));
                        } else {
                            r13Var2 = r13Var3;
                        }
                        int c3 = osaVar2.c();
                        Function0 function06 = function05;
                        boolean z13 = c3 < 2 && function06 != null;
                        final gv9 gv9Var4 = gv9Var2;
                        esaVar.f("list_legend", "list_legend", new tc3(-1766556331, new a93(gv9Var4, function13, z12, r13Var2, 1), true));
                        int c4 = osaVar2.c();
                        uf8 uf8Var = new uf8(15, new yt6(10), osaVar2);
                        yt6 yt6Var = new yt6(11);
                        final String str2 = str;
                        final boolean z14 = z10;
                        final boolean z15 = z;
                        final Function1 function14 = function12;
                        final boolean z16 = z13;
                        esaVar.a(c4, uf8Var, yt6Var, new tc3(-2039417058, new et8() { // from class: v27
                            @Override // defpackage.et8
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                int i12;
                                long j2;
                                long j3;
                                xpa xpaVar = (xpa) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                of3 of3Var2 = (of3) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                xpaVar.getClass();
                                int i13 = 4;
                                if ((intValue2 & 6) == 0) {
                                    i12 = (((av8) of3Var2).g(xpaVar) ? 4 : 2) | intValue2;
                                } else {
                                    i12 = intValue2;
                                }
                                if ((intValue2 & 48) == 0) {
                                    i12 |= ((av8) of3Var2).e(intValue) ? 32 : 16;
                                }
                                av8 av8Var5 = (av8) of3Var2;
                                if (av8Var5.T(i12 & 1, (i12 & 147) != 146)) {
                                    osa osaVar3 = osa.this;
                                    Object b2 = osaVar3.b(intValue);
                                    if (b2 == null) {
                                        a70.r("Required value was null.");
                                        return null;
                                    }
                                    eo7 eo7Var3 = (eo7) b2;
                                    boolean c5 = Intrinsics.c(eo7Var3.e, str2);
                                    boolean z17 = intValue == 0 && eo7Var3.a != null;
                                    boolean z18 = intValue == osaVar3.c() - 1 && !z16;
                                    av8Var5.d0(-1374678967);
                                    av8Var5.d0(-1374683449);
                                    utc utcVar4 = utc.a;
                                    xtc F = u0a.F(xpa.a(xpaVar, utcVar4, 7), z18 ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var5, 30);
                                    boolean z19 = z12;
                                    r13 r13Var4 = r13Var2;
                                    if (z19) {
                                        if (r13Var4 == null) {
                                            j3 = ljg.f(av8Var5, 2031535308, R.color.primary_default, av8Var5, false);
                                        } else {
                                            av8Var5.d0(2031534874);
                                            av8Var5.s(false);
                                            j3 = r13Var4.a;
                                        }
                                        F = F.z(f5p.F(j3));
                                    }
                                    av8Var5.s(false);
                                    if (z19 && z18) {
                                        if (r13Var4 == null) {
                                            j2 = ljg.f(av8Var5, -154358669, R.color.primary_default, av8Var5, false);
                                        } else {
                                            av8Var5.d0(-154359103);
                                            av8Var5.s(false);
                                            j2 = r13Var4.a;
                                        }
                                        F = F.z(l98.f0(td4.Y(utcVar4, new yz(j2, i13)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
                                    }
                                    av8Var5.s(false);
                                    u23 a5 = t23.a(ww9.d, uxf.o, av8Var5, 0);
                                    int hashCode2 = Long.hashCode(av8Var5.T);
                                    aee m3 = av8Var5.m();
                                    xtc C3 = fqj.C(av8Var5, F);
                                    if3.k7.getClass();
                                    zg3 zg3Var2 = hf3.b;
                                    av8Var5.h0();
                                    if (av8Var5.S) {
                                        av8Var5.l(zg3Var2);
                                    } else {
                                        av8Var5.q0();
                                    }
                                    waa.K(av8Var5, a5, hf3.g);
                                    waa.K(av8Var5, m3, hf3.f);
                                    waa.K(av8Var5, Integer.valueOf(hashCode2), hf3.j);
                                    waa.J(av8Var5, hf3.k);
                                    waa.K(av8Var5, C3, hf3.d);
                                    yso.g(eo7Var3, gv9Var4, z14, z15, n9e.q(utcVar4, lz.D(R.color.surface_1, av8Var5), oyn.e), 0L, 0L, function14, c5, z17, ev6Var2.w, av8Var5, 0, 0, 96);
                                    if (intValue != osaVar3.c() - 1) {
                                        av8Var5.d0(1661023268);
                                        tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.surface_1, av8Var5), av8Var5, null);
                                        av8Var5.s(false);
                                    } else {
                                        av8Var5.d0(1661125134);
                                        av8Var5.s(false);
                                    }
                                    av8Var5.s(true);
                                } else {
                                    av8Var5.W();
                                }
                                return Unit.a;
                            }
                        }, true));
                        if (z16) {
                            esaVar.f("leaderboard_empty_state", "leaderboard_empty_state", new tc3(1944731175, new a93(a37Var3, function06, z12, r13Var2, 2), true));
                        }
                    } else if (!Intrinsics.c(osaVar2.d().a, ofb.b)) {
                        esaVar.f("no_data_empty_state", "no_data_empty_state", gz8.a);
                    }
                    return Unit.a;
                }
            };
            function04 = function05;
            ksaVar = a2;
            z6 = z10;
            av8Var2 = av8Var3;
            gv9Var = gv9Var2;
            av8Var2.n0(obj2);
            av8 av8Var42 = av8Var2;
            v8a.a(d2, ksaVar, C2, null, null, null, false, null, (Function1) obj2, av8Var42, 6, PglCryptUtils.BASE64_FAILED);
            s6a.a(Intrinsics.c(osaVar.d().a, ofb.b), g28Var, av8Var42, 48);
            eo7Var = a37Var2.d;
            if (eo7Var != null) {
            }
            av8Var42.s(true);
            av8Var = av8Var42;
            z4 = z7;
            xtcVar2 = utcVar;
            function03 = function04;
        } else {
            av8Var3.W();
            xtcVar2 = xtcVar;
            av8Var = av8Var3;
            z4 = z3;
            function03 = function02;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final a37 a37Var3 = a37Var2;
            u.d = new Function2() { // from class: z27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    tol.g(osa.this, a37Var3, z, ev6Var, function1, function12, function13, xtcVar2, function03, z4, (of3) obj3, aba.K(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(gv9 gv9Var, int i2, FantasyCompetitionType fantasyCompetitionType, String str, int i3, boolean z, xtc xtcVar, of3 of3Var, int i4) {
        gv9Var.getClass();
        fantasyCompetitionType.getClass();
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1969425295);
        int i5 = i4 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.e(fantasyCompetitionType.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str) ? a.o : 1024) | (av8Var.e(i3) ? 16384 : 8192) | (av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i5 & 1, (599187 & i5) != 599186)) {
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(697391971, av8Var, new qn7(gv9Var, (Context) av8Var.k(nz.b), str, i3, i2, fantasyCompetitionType, z)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ci(gv9Var, i2, fantasyCompetitionType, str, i3, z, xtcVar, i4);
        }
    }

    public static final void i(u28 u28Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        u28Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1069525445);
        int i3 = i2 | (av8Var.g(u28Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_2, av8Var), av8Var, 0), null, null, yqo.H(-1919444589, av8Var, new qm4(24, u28Var, function1)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(u28Var, function1, xtcVar, i2, 22);
        }
    }

    public static final void j(gv9 gv9Var, final ev6 ev6Var, final Function1 function1, final il8 il8Var, Function0 function0, boolean z, final boolean z2, final boolean z3, xtc xtcVar, boolean z4, gv9 gv9Var2, of3 of3Var, int i2, int i3) {
        Function0 function02;
        boolean z5;
        xtc xtcVar2;
        int i4;
        int i5;
        char c2;
        boolean z6;
        gv9 gv9Var3;
        xtc xtcVar3;
        gv9Var.getClass();
        ev6Var.getClass();
        function1.getClass();
        il8Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2078250543);
        int i6 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.g(ev6Var) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(il8Var.ordinal()) ? a.o : 1024);
        if ((i2 & 24576) == 0) {
            function02 = function0;
            i6 |= av8Var.i(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        if ((196608 & i2) == 0) {
            z5 = z;
            i6 |= av8Var.h(z5) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            z5 = z;
        }
        int i7 = i6 | (av8Var.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.h(z3) ? 8388608 : 4194304);
        int i8 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i8 != 0) {
            i4 = i7 | 100663296;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i7 | (av8Var.g(xtcVar2) ? 67108864 : 33554432);
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i4 |= av8Var.h(z4) ? 536870912 : 268435456;
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            c2 = 6;
            i5 = i4;
        } else {
            i5 = i4;
            c2 = av8Var.g(gv9Var2) ? (char) 4 : (char) 2;
        }
        if (av8Var.T(i5 & 1, ((i5 & 306783379) == 306783378 && (c2 & 3) == 2) ? false : true)) {
            xtc xtcVar4 = i8 != 0 ? utc.a : xtcVar2;
            boolean z7 = i9 != 0 ? true : z4;
            gv9 gv9Var4 = i10 != 0 ? null : gv9Var2;
            gv9 gv9Var5 = gv9Var.isEmpty() ? null : gv9Var;
            if (gv9Var5 == null) {
                gv9Var5 = gv9Var4 == null ? rlh.b : gv9Var4;
            }
            xtc d2 = bkh.d(xtcVar4, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            gv9 gv9Var6 = gv9Var5;
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            cp cpVar = new cp(new se7(12), 17);
            ArrayList arrayList = new ArrayList();
            for (Object obj : gv9Var6) {
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                if (!z7 || !fantasyRoundPlayerUiModel.k) {
                    arrayList.add(obj);
                }
            }
            final gv9 W = l6g.W(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : gv9Var6) {
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) obj2;
                if (z7 && fantasyRoundPlayerUiModel2.k) {
                    arrayList2.add(obj2);
                }
            }
            final gv9 W2 = l6g.W(CollectionsKt.H0(arrayList2, cpVar));
            final Function0 function03 = function02;
            final boolean z8 = z5;
            dy0.b(null, null, yqo.H(1872207749, av8Var, new ct8() { // from class: gl8
                @Override // defpackage.ct8
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    s22 s22Var = (s22) obj3;
                    of3 of3Var2 = (of3) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    s22Var.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                    }
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                        tol.b(thb.a.a(Double.valueOf(s22Var.c() / 360.0d)), yqo.H(261726917, av8Var2, new li4(gv9.this, W2, ev6Var, il8Var, z8, function1, z2, z3, function03)), av8Var2, 56);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 3072, 7);
            av8Var.s(true);
            xtcVar3 = xtcVar4;
            z6 = z7;
            gv9Var3 = gv9Var4;
        } else {
            av8Var.W();
            z6 = z4;
            gv9Var3 = gv9Var2;
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sk7(gv9Var, ev6Var, function1, il8Var, function0, z, z2, z3, xtcVar3, z6, gv9Var3, i2, i3);
        }
    }

    public static final void k(e9i e9iVar, jjj jjjVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-615379153);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(jjjVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kg0 kg0Var = ww9.f;
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String a3 = jjjVar.a.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 130042);
            av8Var = av8Var;
            r9k r9kVar = jjjVar.b;
            if (r9kVar == null) {
                av8Var.d0(1196202041);
                av8Var.s(false);
            } else {
                utc utcVar = utc.a;
                bf3.r(48.0f, 1196202042, av8Var, av8Var, utcVar);
                float a4 = e9iVar.a(2500, 500);
                float f2 = (0.1f * a4) + 0.9f;
                String a5 = r9kVar.a(av8Var);
                dfj f3 = xth.f();
                long D = lz.D(R.color.on_color_primary, av8Var);
                boolean d2 = av8Var.d(a4) | av8Var.d(f2);
                Object O = av8Var.O();
                if (d2 || O == nf3.a) {
                    O = new n28(18, a4, f2);
                    av8Var.n0(O);
                }
                udj.c(a5, s02.M(utcVar, (Function1) O), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, f3, av8Var, 0, 0, 130040);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(e9iVar, jjjVar, i2, 7);
        }
    }

    public static final void l(p12 p12Var, Context context, c14 c14Var) {
        List list;
        Throwable th;
        String str;
        TextView textView = (TextView) p12Var.c;
        context.getClass();
        TextView textView2 = (TextView) p12Var.k;
        ConstraintLayout constraintLayout = (ConstraintLayout) p12Var.b;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) p12Var.d;
        int i2 = c14Var.a;
        List list2 = c14Var.c;
        textView2.setText(context.getString(i2));
        TextView textView3 = (TextView) p12Var.l;
        String str2 = c14Var.b;
        textView3.setVisibility(str2 != null ? 0 : 8);
        textView3.setText(str2);
        constraintLayout2.getClass();
        constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), ao2.s(8, context), constraintLayout2.getPaddingEnd(), constraintLayout2.getPaddingBottom());
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g04) it.next()).d == null) {
                    constraintLayout2.setOnClickListener(new m(1));
                    list = list2;
                    th = null;
                    break;
                }
            }
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.cricket_statistic_tooltip, (ViewGroup) constraintLayout, false);
        int i3 = R.id.card;
        MaterialCardView materialCardView = (MaterialCardView) nq8.B(R.id.card, inflate);
        if (materialCardView != null) {
            i3 = R.id.info_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.info_container, inflate);
            if (linearLayout != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                ed edVar = new ed(5, materialCardView, frameLayout, linearLayout);
                ug5 ug5Var = new ug5();
                ug5 ug5Var2 = new ug5();
                ug5 ug5Var3 = new ug5();
                th = null;
                float s = ao2.s(8, context);
                hz8 n2 = l4a.n(0);
                q0 q0Var = new q0(s);
                q0 q0Var2 = new q0(s);
                q0 q0Var3 = new q0(s);
                q0 q0Var4 = new q0(s);
                r0k r0kVar = new r0k(context);
                list = list2;
                xah xahVar = new xah();
                xahVar.a = n2;
                xahVar.b = n2;
                xahVar.c = n2;
                xahVar.d = n2;
                xahVar.e = q0Var;
                xahVar.f = q0Var2;
                xahVar.g = q0Var3;
                xahVar.h = q0Var4;
                xahVar.i = r0kVar;
                xahVar.j = ug5Var;
                xahVar.k = ug5Var2;
                xahVar.l = ug5Var3;
                materialCardView.setShapeAppearanceModel(xahVar);
                if (linearLayout.getChildCount() == 0) {
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            b.q();
                            throw null;
                        }
                        g04 g04Var = (g04) obj;
                        View inflate2 = LayoutInflater.from(context).inflate(R.layout.info_tooltip_panel_item, (ViewGroup) frameLayout, false);
                        int i6 = R.id.code;
                        TextView textView4 = (TextView) nq8.B(R.id.code, inflate2);
                        if (textView4 != null) {
                            i6 = R.id.name;
                            TextView textView5 = (TextView) nq8.B(R.id.name, inflate2);
                            if (textView5 != null) {
                                LinearLayout linearLayout2 = (LinearLayout) inflate2;
                                textView4.setText(g04Var.a);
                                Integer num = g04Var.d;
                                if (num == null || (str = context.getString(num.intValue())) == null) {
                                    str = "";
                                }
                                textView5.setText(str);
                                ((LinearLayout) edVar.c).addView(linearLayout2);
                                if (i4 == list.size() - 1) {
                                    frameLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                }
                                i4 = i5;
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i6)));
                        return;
                    }
                }
                constraintLayout.getClass();
                textView = textView;
                textView.post(new kx0(context, textView, edVar, constraintLayout, 1));
                int i7 = 0;
                for (Object obj2 : b.j(textView, (TextView) p12Var.e, (TextView) p12Var.f, (TextView) p12Var.g, (TextView) p12Var.h, (TextView) p12Var.i, (TextView) p12Var.j)) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        b.q();
                        throw th;
                    }
                    TextView textView6 = (TextView) obj2;
                    List list3 = list;
                    g04 g04Var2 = (g04) CollectionsKt.a0(i7, list3);
                    if (g04Var2 != null) {
                        textView6.getClass();
                        textView6.setVisibility(0);
                        textView6.setText(g04Var2.a);
                        ViewGroup.LayoutParams layoutParams = textView6.getLayoutParams();
                        if (layoutParams == null) {
                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            return;
                        }
                        tl3 tl3Var = (tl3) layoutParams;
                        tl3Var.H = g04Var2.b;
                        tl3Var.P = ao2.s(g04Var2.c, context);
                        textView6.setLayoutParams(tl3Var);
                    } else {
                        textView6.getClass();
                        textView6.setVisibility(8);
                    }
                    i7 = i8;
                    list = list3;
                }
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    public static final xtc m(xtc xtcVar) {
        xtcVar.getClass();
        return koi.a(xtcVar, Unit.a, nw2.b);
    }

    public static xtc n(xtc xtcVar, float f2, Function0 function0, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.95f;
        }
        xtcVar.getClass();
        function0.getClass();
        return fqj.q(xtcVar, new lw2(f2, function0, 200L));
    }

    public static final xtc o(xtc xtcVar) {
        xtcVar.getClass();
        return fqj.q(xtcVar, new gd3(7));
    }

    public static int p(double d2, int i2) {
        int max = Math.max(i2, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d2 * highestOneBit))) {
            return highestOneBit;
        }
        int i3 = highestOneBit << 1;
        if (i3 > 0) {
            return i3;
        }
        return 1073741824;
    }

    public static final long q(int i2, int i3, kjh kjhVar, jrg jrgVar, kjh kjhVar2) {
        int i4;
        int i5;
        if (!Intrinsics.c(kjhVar, kjh.c)) {
            i2 = C(kjhVar.a, jrgVar);
            i3 = C(kjhVar.b, jrgVar);
        }
        a35 a35Var = kjhVar2.a;
        a35 a35Var2 = kjhVar2.b;
        if ((a35Var instanceof t25) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((t25) a35Var).a)) {
            i2 = i5;
        }
        if ((a35Var2 instanceof t25) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((t25) a35Var2).a)) {
            i3 = i4;
        }
        return t6a.s(i2, i3);
    }

    public static final double r(int i2, int i3, int i4, int i5, jrg jrgVar, kjh kjhVar) {
        double max;
        double d2 = i2;
        double d3 = i4 / d2;
        double d4 = i3;
        double d5 = i5 / d4;
        int ordinal = jrgVar.ordinal();
        if (ordinal == 0) {
            max = Math.max(d3, d5);
        } else {
            if (ordinal != 1) {
                zzl.b();
                return 0.0d;
            }
            max = Math.min(d3, d5);
        }
        if (kjhVar.a instanceof t25) {
            double d6 = ((t25) r9).a / d2;
            if (max > d6) {
                max = d6;
            }
        }
        if (kjhVar.b instanceof t25) {
            double d7 = ((t25) r9).a / d4;
            if (max > d7) {
                return d7;
            }
        }
        return max;
    }

    public static boolean s(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!s(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static final void t(Context context) {
        context.getClass();
        try {
            File cacheDir = context.getCacheDir();
            String[] list = cacheDir.list();
            if (list != null) {
                for (String str : list) {
                    if (str.equals("images")) {
                        s(new File(cacheDir, str));
                    }
                }
            }
        } catch (Exception e2) {
            s38.a().c(e2);
        }
    }

    public static final Function0 u(Function0 function0, of3 of3Var) {
        u6b u6bVar = (u6b) ((av8) of3Var).k(mhb.a);
        e6b e6bVar = e6b.a;
        av8 av8Var = (av8) of3Var;
        boolean i2 = av8Var.i(u6bVar) | av8Var.g(function0);
        Object O = av8Var.O();
        if (i2 || O == nf3.a) {
            O = new h84(u6bVar, function0);
            av8Var.n0(O);
        }
        return (Function0) O;
    }

    public static int v(double d2, ShotActionArea shotActionArea) {
        return shotActionArea == null ? R.color.away_primary_10 : d2 > shotActionArea.getP5() ? R.color.away_primary : d2 > shotActionArea.getP4() ? R.color.away_primary_80 : d2 > shotActionArea.getP3() ? R.color.away_primary_60 : d2 > shotActionArea.getP2() ? R.color.away_primary_40 : d2 > shotActionArea.getP1() ? R.color.away_primary_20 : R.color.away_primary_10;
    }

    public static Intent w(Context context, Integer num, String str) {
        if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            ccd ccdVar = vl.b;
            String string = sharedPreferences.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18");
            ccd ccdVar2 = vl.b;
            if (!Intrinsics.c(string, "25_or_older")) {
                int i2 = SettingsActivity.L;
                Intent intent = new Intent(context, (Class<?>) SettingsActivity.class);
                intent.putExtra("open", "openAdsOddsPreferences");
                return intent;
            }
        }
        Intent intent2 = new Intent(context, (Class<?>) BettingTipsActivity.class);
        intent2.putExtra("BET_BOOST_EVENT_ID", num);
        intent2.putExtra("BET_BOOST_EVENT_SPORT", str);
        return intent2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.sofascore.model.mvvm.model.TeamSides, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, android.widget.TextView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void x(v82 v82Var, Context context, EsportsGame esportsGame, boolean z, boolean z2) {
        int i2;
        ?? r1;
        int i3;
        context.getClass();
        esportsGame.getClass();
        z82 z82Var = (z82) v82Var.f;
        ConstraintLayout constraintLayout = ((iq5) v82Var.d).b;
        ConstraintLayout constraintLayout2 = ((iq5) v82Var.h).b;
        View view = (View) v82Var.g;
        ?? r7 = (TextView) v82Var.e;
        TextView textView = (TextView) v82Var.c;
        TextView textView2 = (TextView) z82Var.e;
        View view2 = (View) z82Var.f;
        LinearLayout linearLayout = (LinearLayout) z82Var.c;
        TextView textView3 = (TextView) z82Var.g;
        TextView textView4 = (TextView) z82Var.d;
        int color = context.getColor(R.color.live);
        int color2 = context.getColor(R.color.on_color_primary);
        int color3 = context.getColor(R.color.on_color_secondary);
        int color4 = context.getColor(R.color.darken_overlay_2);
        if (esportsGame.isLive()) {
            textView4.setTextColor(color);
            textView3.setTextColor(color);
            textView2.setTextColor(color);
            view2.setVisibility(0);
            view2.getBackground().setTint(color);
            linearLayout.getBackground().mutate().setTint(color4);
        } else {
            if (!Intrinsics.c(esportsGame.getStatus().getType(), StatusKt.STATUS_FINISHED) || !z2) {
                Integer winnerCode$default = EsportsGame.getWinnerCode$default(esportsGame, null, 1, null);
                textView4.setTextColor((winnerCode$default != null && winnerCode$default.intValue() == 1) ? color2 : color3);
                Integer winnerCode$default2 = EsportsGame.getWinnerCode$default(esportsGame, null, 1, null);
                textView3.setTextColor((winnerCode$default2 != null && winnerCode$default2.intValue() == 2) ? color2 : color3);
                textView2.setTextColor(color3);
                view2.setVisibility(8);
                i2 = 0;
                linearLayout.getBackground().mutate().setTint(0);
                r1 = 0;
                if (EsportsGame.getHomeScore$default(esportsGame, r1, 1, r1).getDisplay() == null && EsportsGame.getAwayScore$default(esportsGame, r1, 1, r1).getDisplay() != null) {
                    linearLayout.setVisibility(i2);
                    textView4.setText(String.valueOf(EsportsGame.getHomeScore$default(esportsGame, r1, 1, r1).getDisplay()));
                    textView3.setText(String.valueOf(EsportsGame.getAwayScore$default(esportsGame, r1, 1, r1).getDisplay()));
                    i3 = 0;
                } else if (esportsGame.isLive()) {
                    i3 = 0;
                    linearLayout.setVisibility(8);
                } else {
                    i3 = 0;
                    linearLayout.setVisibility(0);
                    textView4.setText("");
                    textView3.setText("");
                }
                if (z) {
                    return;
                }
                if (!z2 || esportsGame.getMap() == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(i3);
                    ESportMap map = esportsGame.getMap();
                    textView.setText(map != null ? map.getName() : r1);
                }
                String type = esportsGame.getStatus().getType();
                if (Intrinsics.c(type, StatusKt.STATUS_IN_PROGRESS)) {
                    z(v82Var, context, esportsGame);
                    return;
                }
                if (!Intrinsics.c(type, StatusKt.STATUS_FINISHED)) {
                    r7.setVisibility(8);
                    view.setVisibility(8);
                    constraintLayout2.setVisibility(8);
                    constraintLayout.setVisibility(8);
                    return;
                }
                if (z2) {
                    z(v82Var, context, esportsGame);
                    return;
                }
                r7.setVisibility(0);
                view.setVisibility(8);
                constraintLayout2.setVisibility(8);
                constraintLayout.setVisibility(8);
                Integer length = esportsGame.getLength();
                if (length != null) {
                    if (esportsGame.isLive()) {
                        length = r1;
                    }
                    if (length != null) {
                        r1 = ((int) (length.intValue() / 60.0d)) + " " + context.getString(R.string.minute_short);
                    }
                }
                r7.setText(r1);
                return;
            }
            Integer winnerCode$default3 = EsportsGame.getWinnerCode$default(esportsGame, null, 1, null);
            textView4.setTextColor((winnerCode$default3 != null && winnerCode$default3.intValue() == 1) ? color2 : color3);
            Integer winnerCode$default4 = EsportsGame.getWinnerCode$default(esportsGame, null, 1, null);
            textView3.setTextColor((winnerCode$default4 != null && winnerCode$default4.intValue() == 2) ? color2 : color3);
            textView2.setTextColor(color3);
            view2.setVisibility(0);
            view2.getBackground().setTint(color3);
            linearLayout.getBackground().mutate().setTint(color4);
        }
        r1 = 0;
        i2 = 0;
        if (EsportsGame.getHomeScore$default(esportsGame, r1, 1, r1).getDisplay() == null) {
        }
        if (esportsGame.isLive()) {
        }
        if (z) {
        }
    }

    public static final xtc y(xtc xtcVar, boolean z, boolean z2, boolean z3, long j2, wzc wzcVar, Function0 function0, of3 of3Var, int i2) {
        xtcVar.getClass();
        function0.getClass();
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        if ((i2 & 8) != 0) {
            j2 = lz.D(R.color.n_lv_4, of3Var);
        }
        if ((i2 & 16) != 0) {
            av8 av8Var = (av8) of3Var;
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = mz1.e(av8Var);
            }
            wzcVar = (wzc) O;
        }
        return oyn.u(xtcVar, wzcVar, z3 ? n5g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, j2, z2) : null, z, null, null, function0, 24);
    }

    public static final void z(v82 v82Var, Context context, EsportsGame esportsGame) {
        ((TextView) v82Var.e).setVisibility(8);
        View view = (View) v82Var.g;
        view.setVisibility(0);
        iq5 iq5Var = (iq5) v82Var.h;
        TextView textView = iq5Var.d;
        TextView textView2 = iq5Var.e;
        TextView textView3 = iq5Var.c;
        ConstraintLayout constraintLayout = iq5Var.b;
        constraintLayout.setVisibility(0);
        iq5 iq5Var2 = (iq5) v82Var.d;
        TextView textView4 = iq5Var2.d;
        TextView textView5 = iq5Var2.e;
        TextView textView6 = iq5Var2.c;
        ConstraintLayout constraintLayout2 = iq5Var2.b;
        constraintLayout2.setVisibility(0);
        Integer period1 = EsportsGame.getHomeScore$default(esportsGame, null, 1, null).getPeriod1();
        int intValue = period1 != null ? period1.intValue() : 0;
        Integer period2 = EsportsGame.getHomeScore$default(esportsGame, null, 1, null).getPeriod2();
        int intValue2 = period2 != null ? period2.intValue() : 0;
        Integer overtime = EsportsGame.getHomeScore$default(esportsGame, null, 1, null).getOvertime();
        int intValue3 = overtime != null ? overtime.intValue() : 0;
        Integer period12 = EsportsGame.getAwayScore$default(esportsGame, null, 1, null).getPeriod1();
        int intValue4 = period12 != null ? period12.intValue() : 0;
        Integer period22 = EsportsGame.getAwayScore$default(esportsGame, null, 1, null).getPeriod2();
        int intValue5 = period22 != null ? period22.intValue() : 0;
        Integer overtime2 = EsportsGame.getAwayScore$default(esportsGame, null, 1, null).getOvertime();
        int intValue6 = overtime2 != null ? overtime2.intValue() : 0;
        if (intValue3 > 0 || intValue6 > 0) {
            textView6.setText(String.valueOf(intValue3));
            textView5.setText(String.valueOf(intValue6));
            textView4.setText(PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE);
            textView3.setText(String.valueOf(intValue + intValue2));
            textView2.setText(String.valueOf(intValue4 + intValue5));
            textView.setText("FT");
            return;
        }
        if (intValue2 > 0 || intValue5 > 0) {
            textView6.setText(String.valueOf(intValue2));
            textView5.setText(String.valueOf(intValue5));
            textView4.setText(context.getString(R.string.status_half, yid.p(2)));
            textView3.setText(String.valueOf(intValue));
            textView2.setText(String.valueOf(intValue4));
            textView.setText(context.getString(R.string.status_half, yid.p(1)));
            return;
        }
        if (intValue <= 0 && intValue4 <= 0) {
            view.setVisibility(8);
            constraintLayout.setVisibility(8);
            constraintLayout2.setVisibility(8);
        } else {
            textView3.setText(String.valueOf(intValue));
            textView2.setText(String.valueOf(intValue4));
            textView.setText(context.getString(R.string.status_half, yid.p(1)));
            view.setVisibility(8);
            constraintLayout2.setVisibility(8);
        }
    }
}
