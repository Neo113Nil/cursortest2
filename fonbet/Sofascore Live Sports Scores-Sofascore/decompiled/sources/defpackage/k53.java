package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Debug;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.fantasy.FantasyPlayerFixture;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcomeCategory;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class k53 implements Encoder, wf3 {
    public static final tc3 c;
    public static final tc3 d;
    public static final tc3 f;
    public static final float j = 28.0f;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Type[] b = new Type[0];
    public static final tc3 e = new tc3(147012104, new qd3(3), false);
    public static final tc3 g = new tc3(548307394, new pd3(28), false);
    public static final tc3 h = new tc3(-1786385991, new pd3(29), false);
    public static final Object i = new Object();

    static {
        int i2 = 2;
        c = new tc3(22565135, new pr1(i2), false);
        d = new tc3(-1233292799, new qd3(i2), false);
        f = new tc3(1000700098, new pd3(i2), false);
    }

    public static String A0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static final qzc B0(ly3 ly3Var, Function1 function1) {
        ly3Var.getClass();
        qzc qzcVar = new qzc(ly3Var);
        qzcVar.a.put(za9.d, new se2(5, function1));
        return qzcVar;
    }

    public static final void G(svb svbVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, of3 of3Var, int i2) {
        Function1 function15;
        char c2;
        long f2;
        svb svbVar2 = svbVar;
        Function0 function02 = function0;
        svbVar2.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1332983571);
        int i3 = i2 | (av8Var.g(svbVar2) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function13) ? a.o : 1024) | (av8Var.i(function14) ? 16384 : 8192) | (av8Var.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            utc utcVar = utc.a;
            xtc h2 = ljg.h(16.0f, bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, h2);
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
            String v = oea.v(R.string.crowdsourcing_match_not_started, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
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
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc A = wnn.A(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), o7g.a(8.0f));
            Boolean bool = svbVar2.a;
            Boolean bool2 = Boolean.TRUE;
            long f3 = Intrinsics.c(bool, bool2) ? ljg.f(av8Var, -1029139789, R.color.success, av8Var, false) : ljg.f(av8Var, -1029139212, R.color.surface_2, av8Var, false);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, f3, jf9Var);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            int i5 = 6;
            if (z || O == a99Var) {
                O = new ri(i5, function1);
                av8Var.n0(O);
            }
            xtc y = tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            mv1 mv1Var = uxf.g;
            k1c c3 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            ImageVector N = s6a.N(R.drawable.ic_tv_channel_checkmark_16, 6, av8Var);
            if (Intrinsics.c(bool, bool2)) {
                c2 = 1555;
                f2 = ljg.f(av8Var, -164668742, R.color.surface_1, av8Var, false);
            } else {
                c2 = 1555;
                f2 = ljg.f(av8Var, -164668138, R.color.n_lv_3, av8Var, false);
            }
            kq9.b(N, null, bkh.l(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 16.0f), f2, av8Var, 432, 0);
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc A2 = wnn.A(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), o7g.a(8.0f));
            Boolean bool3 = Boolean.FALSE;
            xtc q2 = n9e.q(A2, Intrinsics.c(bool, bool3) ? ljg.f(av8Var, -1029110863, R.color.error, av8Var, false) : ljg.f(av8Var, -1029110348, R.color.surface_2, av8Var, false), jf9Var);
            boolean z2 = i4 == 32;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new ri(7, function1);
                av8Var.n0(O2);
            }
            xtc y2 = tol.y(q2, false, false, false, 0L, null, (Function0) O2, av8Var, 31);
            k1c c4 = e12.c(mv1Var, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, y2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c4, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_tv_channel_x_16, 6, av8Var), null, bkh.l(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 16.0f), Intrinsics.c(bool, bool3) ? ljg.f(av8Var, -533811055, R.color.surface_1, av8Var, false) : ljg.f(av8Var, -533810451, R.color.n_lv_3, av8Var, false), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
            boolean c5 = Intrinsics.c(bool, bool2);
            svbVar2 = svbVar;
            function02 = function0;
            tc3 H = yqo.H(1335476539, av8Var, new er6(svbVar2, function12, function13, function02, 13));
            x23 x23Var = x23.a;
            fz8.b(x23Var, c5, null, null, null, null, H, av8Var, 1572870, 30);
            function15 = function14;
            fz8.b(x23Var, Intrinsics.c(bool, bool3), null, null, null, null, yqo.H(1205605746, av8Var, new d67(14, (Object) svbVar2, (Object) function02, function15)), av8Var, 1572870, 30);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            function15 = function14;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(svbVar2, function1, function12, function13, function15, function02, i2);
        }
    }

    public static final void H(String str, String str2, Function0 function0, xtc xtcVar, boolean z, of3 of3Var, int i2) {
        xtc xtcVar2;
        str2.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1137834586);
        int i3 = (av8Var.g(str2) ? 32 : 16) | i2;
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.h(z) ? 16384 : 8192;
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.g(bkh.d(utcVar, 1.0f), 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            String concat = str.concat(":");
            yf8 yf8Var = xth.a;
            udj.c(concat, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            udj.c(str2, new goa(1.0f, true), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, (i4 >> 3) & 14, 24960, 110584);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            if (z) {
                av8Var.d0(1317719537);
                ImageVector N = s6a.N(R.drawable.ic_content_copy_16, 6, av8Var);
                long D = lz.D(R.color.primary_default, av8Var);
                xtc l2 = bkh.l(utcVar, 24.0f);
                boolean z2 = (i4 & 896) == 256;
                Object O = av8Var.O();
                if (z2 || O == nf3.a) {
                    O = new v61(16, function0);
                    av8Var.n0(O);
                }
                xtc y = tol.y(l2, false, false, false, 0L, null, (Function0) O, av8Var, 29);
                av8Var = av8Var;
                kq9.b(N, null, y, D, av8Var, 48, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(1318105208);
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(str, str2, function0, xtcVar2, z, i2);
        }
    }

    public static final void I(wa6 wa6Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1558733549);
        int i4 = 2;
        int i5 = 4;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(wa6Var) ? 4 : 2) | i2;
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
            tc3 H = yqo.H(637114348, av8Var2, new fv2(wa6Var, 25));
            tc3 H2 = yqo.H(-1230085228, av8Var2, new ra6(wa6Var, 3));
            tc3 H3 = yqo.H(-1454854630, av8Var2, new ra6(wa6Var, i5));
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new ta6(function1, wa6Var, i4);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, H2, H3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i3 >> 6) & 14) | V2.b.f, 2032);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ua6(wa6Var, function1, xtcVar, i2, 1);
        }
    }

    public static final void J(final FantasyPlayerUiModel fantasyPlayerUiModel, final FantasyPlayerUiModel fantasyPlayerUiModel2, final float f2, final boolean z, final Function1 function1, final Function1 function12, final boolean z2, xtc xtcVar, of3 of3Var, final int i2) {
        final xtc xtcVar2;
        utc utcVar;
        function1.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1230979462);
        final float f3 = f2;
        final Function1 function13 = function12;
        boolean z3 = z2;
        int i3 = i2 | (av8Var.g(fantasyPlayerUiModel) ? 4 : 2) | (av8Var.g(fantasyPlayerUiModel2) ? 32 : 16) | (av8Var.d(f3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.i(function13) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        boolean z4 = true;
        if (av8Var.T(i3 & 1, (4793491 & i3) != 4793490)) {
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            utc utcVar2 = utc.a;
            float f4 = 1.0f;
            xtc Y = fz8.Y(bkh.d(utcVar2, 1.0f), n9a.b);
            if (z) {
                utcVar = utcVar2;
                Y = Y.z(d2a.E(utcVar, 2.0f, null, false, 0L, 30));
            } else {
                utcVar = utcVar2;
            }
            xtc b0 = l98.b0(n9e.q(Y, lz.D(R.color.surface_1, av8Var), oyn.e), 8.0f);
            l8g a2 = k8g.a(ng0Var, uxf.l, av8Var, 6);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-1445021862);
            for (Pair pair : b.j(new Pair(fantasyPlayerUiModel, nc7.a), new Pair(fantasyPlayerUiModel2, nc7.b))) {
                FantasyPlayerUiModel fantasyPlayerUiModel3 = (FantasyPlayerUiModel) pair.a;
                final nc7 nc7Var = (nc7) pair.b;
                av8Var.a0(-257940224, String.valueOf(nc7Var));
                xtc c2 = bkh.c(new goa(f4, z4), f4);
                Object O = av8Var.O();
                if (O == nf3.a) {
                    O = new yn6(10);
                    av8Var.n0(O);
                }
                final boolean z5 = z3;
                l98.b(fantasyPlayerUiModel3, c2, (Function1) O, null, "player_picker_item_transition", null, yqo.H(1906648727, av8Var, new et8() { // from class: oo6
                    @Override // defpackage.et8
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        FantasyPlayerUiModel fantasyPlayerUiModel4 = (FantasyPlayerUiModel) obj2;
                        of3 of3Var2 = (of3) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        ((k60) obj).getClass();
                        final nc7 nc7Var2 = nc7Var;
                        float f5 = f3;
                        final int i4 = 0;
                        Object obj5 = nf3.a;
                        if (fantasyPlayerUiModel4 != null) {
                            av8 av8Var2 = (av8) of3Var2;
                            av8Var2.d0(29824530);
                            g28 g28Var = bkh.c;
                            final Function1 function14 = Function1.this;
                            boolean g2 = av8Var2.g(function14) | av8Var2.e(nc7Var2.ordinal());
                            Object O2 = av8Var2.O();
                            if (g2 || O2 == obj5) {
                                O2 = new Function0() { // from class: no6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i4) {
                                            case 0:
                                                function14.invoke(nc7Var2);
                                                break;
                                            default:
                                                function14.invoke(nc7Var2);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var2.n0(O2);
                            }
                            fz8.k(fantasyPlayerUiModel4, (Function0) O2, z5, g28Var, f5, av8Var2, ((intValue >> 3) & 14) | 3072);
                            av8Var2.s(false);
                        } else {
                            av8 av8Var3 = (av8) of3Var2;
                            av8Var3.d0(30217083);
                            g28 g28Var2 = bkh.c;
                            final Function1 function15 = function13;
                            boolean g3 = av8Var3.g(function15) | av8Var3.e(nc7Var2.ordinal());
                            Object O3 = av8Var3.O();
                            if (g3 || O3 == obj5) {
                                final int i5 = 1;
                                O3 = new Function0() { // from class: no6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i5) {
                                            case 0:
                                                function15.invoke(nc7Var2);
                                                break;
                                            default:
                                                function15.invoke(nc7Var2);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var3.n0(O3);
                            }
                            l98.i((Function0) O3, g28Var2, f5, av8Var3, 48);
                            av8Var3.s(false);
                        }
                        return Unit.a;
                    }
                }), av8Var, 1597824, 40);
                av8Var.s(false);
                f3 = f2;
                function13 = function12;
                z3 = z2;
                f4 = f4;
                z4 = z4;
            }
            av8Var.s(false);
            av8Var.s(z4);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(fantasyPlayerUiModel2, f2, z, function1, function12, z2, xtcVar2, i2) { // from class: po6
                public final /* synthetic */ FantasyPlayerUiModel b;
                public final /* synthetic */ float c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ xtc h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    k53.J(FantasyPlayerUiModel.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void K(do7 do7Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-52030746);
        int i3 = i2 | (av8Var.g(do7Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            ev6 ev6Var = do7Var.c;
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new vx6(function1, do7Var, 0);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f, 8.0f);
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
            td4.p(ev6Var.d, ev6Var.g, ev6Var.a, ev6Var.y, bkh.l(utcVar, 16.0f), av8Var, 24576);
            goa d2 = bf3.d(utcVar, 8.0f, av8Var, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
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
            String q2 = dmi.q(ev6Var.x ? "[A] " : "", ev6Var.e);
            yf8 yf8Var = xth.a;
            udj.c(q2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            udj.c(do7Var.b, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            kq9.b(s6a.N(R.drawable.ic_chevron_right_small_16, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wx6(do7Var, function1, xtcVar2, i2, 0);
        }
    }

    public static final void L(final int i2, int i3, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1396489050);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3 | 48;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            final Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new go7(7);
                av8Var.n0(O);
            }
            pr4 b2 = c6e.b(0, (Function0) O, av8Var, 390, 2);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = e.f(Boolean.FALSE);
                av8Var.n0(O2);
            }
            e1d e1dVar = (e1d) O2;
            Boolean bool = (Boolean) e1dVar.getValue();
            bool.getClass();
            boolean g2 = av8Var.g(b2);
            Object O3 = av8Var.O();
            if (g2 || O3 == a99Var) {
                O3 = new yp7(b2, e1dVar, (rq3) null, i5);
                av8Var.n0(O3);
            }
            hz8.o(av8Var, bool, (Function2) O3);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
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
            int n2 = b2.n();
            t3e B = l98.B(8.0f, 2);
            lv1 lv1Var = uxf.m;
            Unit unit = Unit.a;
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = new aq7(i5, e1dVar);
                av8Var.n0(O4);
            }
            xtcVar2 = utcVar;
            f6a.a(b2, koi.a(utcVar, unit, (PointerInputEventHandler) O4), B, null, n2, 8.0f, lv1Var, null, false, null, null, null, yqo.H(630497757, av8Var, new et8() { // from class: wp7
                @Override // defpackage.et8
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    of3 of3Var2 = (of3) obj3;
                    ((Integer) obj4).getClass();
                    ((u5e) obj).getClass();
                    if (intValue == 0) {
                        av8 av8Var2 = (av8) of3Var2;
                        av8Var2.d0(1266757675);
                        x2a.d(oea.v(R.string.fantasy_elite_faceoff_unlimited_transfers_info, av8Var2), null, null, 0L, 0L, 0L, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 0, 0, 2046);
                        av8Var2.s(false);
                    } else if (intValue == 1) {
                        av8 av8Var3 = (av8) of3Var2;
                        av8Var3.d0(1266965437);
                        x2a.d(oea.w(R.string.fantasy_elite_faceoff_transfers_deadline_info, new Object[]{Integer.valueOf(i2)}, av8Var3), null, null, 0L, 0L, 0L, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var3, 0, 0, 2046);
                        av8Var3.s(false);
                    } else if (intValue != 2) {
                        av8 av8Var4 = (av8) of3Var2;
                        av8Var4.d0(318003809);
                        av8Var4.s(false);
                    } else {
                        av8 av8Var5 = (av8) of3Var2;
                        av8Var5.d0(1267231572);
                        String v = oea.v(R.string.fantasy_what_are_expected_fantasy_points, av8Var5);
                        long D = lz.D(R.color.primary_default, av8Var5);
                        Context context2 = context;
                        boolean i6 = av8Var5.i(context2);
                        Object O5 = av8Var5.O();
                        if (i6 || O5 == nf3.a) {
                            O5 = new c6(context2, 23);
                            av8Var5.n0(O5);
                        }
                        x2a.e(v, (Function0) O5, null, Integer.valueOf(R.drawable.ic_predictions_menu), D, 0L, null, R.drawable.ic_info, null, 0, 0, 0, av8Var5, 0, 0, 8036);
                        av8Var5.s(false);
                    }
                    return Unit.a;
                }
            }), av8Var, 1769856, 24576, 16264);
            nq8.h(av8Var, bkh.e(xtcVar2, 8.0f));
            O(3, b2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 6);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i2, xtcVar2, i3, 8);
        }
    }

    public static final void M(boolean z, of3 of3Var, int i2) {
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(6293328);
        int i3 = (av8Var.h(z) ? 4 : 2) | i2;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new zl8(7);
                av8Var.n0(O);
            }
            z2 = z;
            un0.f(z2, (Function0) O, false, false, oyn.a, av8Var, (i3 & 14) | 25008, 8);
        } else {
            z2 = z;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zj7(z2, i2, i4);
        }
    }

    public static final void N(boolean z, xtc xtcVar, of3 of3Var, int i2) {
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2067934656);
        int i3 = 2;
        int i4 = (av8Var.h(z) ? 4 : 2) | i2 | 48;
        byte b2 = 0;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new zl8(8);
                av8Var.n0(O);
            }
            z2 = z;
            un0.f(z2, (Function0) O, false, false, yqo.H(-457470351, av8Var, new hd3(b2, i3)), av8Var, (i4 & 14) | 25008, 8);
            xtcVar = utc.a;
        } else {
            z2 = z;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new es8(z2, xtcVar, i2, b2);
        }
    }

    public static final void O(final int i2, final a6e a6eVar, xtc xtcVar, float f2, of3 of3Var, final int i3) {
        final xtc xtcVar2;
        final float f3;
        a6eVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1973689698);
        int i4 = ((i3 & 6) == 0 ? i3 | (av8Var.e(i2) ? 4 : 2) : i3) | (av8Var.g(a6eVar) ? 32 : 16) | 3456;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            k1c c2 = e12.c(uxf.f, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            av8Var.d0(950095666);
            for (int i5 = 0; i5 < i2; i5++) {
                e12.a(0, av8Var, n9e.q(bkh.l(utcVar, 8.0f), lz.D(R.color.primary_highlight, av8Var), o7g.a));
            }
            av8Var.s(false);
            av8Var.s(true);
            e12.a(0, av8Var, n9e.q(bkh.l(s02.M(utcVar, new w47(18, a6eVar, (ema) av8Var.k(dh3.n))), 8.0f), lz.D(R.color.primary_default, av8Var), o7g.a));
            av8Var.s(true);
            xtcVar2 = utcVar;
            f3 = 8.0f;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            f3 = f2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: xp7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k53.O(i2, a6eVar, xtcVar2, f3, (of3) obj, aba.K(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void P(e9i e9iVar, omj omjVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1654702740);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(e9iVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(omjVar) ? 32 : 16;
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
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
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
            av8Var.d0(711738842);
            Iterator it = CollectionsKt.L0(omjVar.a, 3).iterator();
            int i4 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                a99 a99Var = nf3.a;
                if (hasNext) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    Sport sport = (Sport) next;
                    float a4 = e9iVar.a(i4 == 0 ? 0 : i4 * TTAdConstant.STYLE_SIZE_RADIO_3_2, 1000);
                    float f2 = (0.1f * a4) + 0.9f;
                    String slug = sport.getSlug();
                    xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, 7);
                    boolean d2 = av8Var.d(a4) | av8Var.d(f2);
                    Object O = av8Var.O();
                    if (d2 || O == a99Var) {
                        O = new n28(5, a4, f2);
                        av8Var.n0(O);
                    }
                    S(0, av8Var, s02.M(f0, (Function1) O), slug);
                    i4 = i5;
                } else {
                    av8Var.s(false);
                    av8Var.s(true);
                    nq8.h(av8Var, bkh.e(utcVar, 48.0f));
                    float a5 = e9iVar.a(5000, 500);
                    float f3 = (0.1f * a5) + 0.9f;
                    String a6 = omjVar.b.a(av8Var);
                    yf8 yf8Var = xth.a;
                    dfj f4 = xth.f();
                    long D = lz.D(R.color.on_color_primary, av8Var);
                    boolean d3 = av8Var.d(a5) | av8Var.d(f3);
                    Object O2 = av8Var.O();
                    if (d3 || O2 == a99Var) {
                        O2 = new n28(6, a5, f3);
                        av8Var.n0(O2);
                    }
                    udj.c(a6, s02.M(utcVar, (Function1) O2), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, f4, av8Var, 0, 0, 131064);
                    av8Var = av8Var;
                    av8Var.s(true);
                }
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(e9iVar, omjVar, i2, 10);
        }
    }

    public static final void Q(xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            R(xtcVar, tc3Var, av8Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u30(xtcVar, tc3Var, i2, i4);
        }
    }

    public static final void R(xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(771959668);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = 0;
        int i5 = 1;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.e(null, f7a.k);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new v30(i4, e1dVar);
                av8Var.n0(O2);
            }
            tol.b(p8j.b.a(w0((Function0) O2, av8Var, 0)), yqo.H(-291176396, av8Var, new cyb(3, xtcVar, e1dVar, tc3Var)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u30(xtcVar, tc3Var, i2, i5);
        }
    }

    public static final void S(int i2, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-120931180);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            int a2 = wyh.a(str);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            ImageVector N = s6a.N(a2, 6, av8Var);
            long D = lz.D(R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            kq9.b(N, null, bkh.l(utcVar, 34.0f), D, av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 20.0f));
            String c2 = wyh.c(context, str);
            yf8 yf8Var = xth.a;
            udj.c(c2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yi7(str, xtcVar, i2, 3);
        }
    }

    public static final void T(v23 v23Var, omj omjVar, of3 of3Var, int i2) {
        int i3;
        omj omjVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(767214577);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(omjVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(90.0f, utcVar, true));
            String a2 = omjVar.e.a(av8Var);
            yf8 yf8Var = xth.a;
            utc utcVar2 = utcVar;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, v23Var.a(87.0f, utcVar2, true));
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, utcVar2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-2096934720);
            omjVar2 = omjVar;
            Iterator it = CollectionsKt.L0(omjVar2.a, 3).iterator();
            while (it.hasNext()) {
                utc utcVar3 = utcVar2;
                S(48, av8Var, l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, 7), ((Sport) it.next()).getSlug());
                utcVar2 = utcVar3;
            }
            av8Var.s(false);
            av8Var.s(true);
            nq8.h(av8Var, v23Var.a(165.0f, utcVar2, true));
        } else {
            omjVar2 = omjVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(v23Var, omjVar2, i2, 9);
        }
    }

    public static final void U(final gv9 gv9Var, final wv9 wv9Var, final boolean z, xtc xtcVar, final boolean z2, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        gv9Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(498813141);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(wv9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.h(z2) ? 16384 : 8192;
        }
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            xtc d0 = l98.d0(xtcVar.z(bkh.c), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            t3e C = l98.C(8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            Object O = av8Var2.O();
            if (z3 || O == nf3.a) {
                O = new Function1() { // from class: sdk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        esa esaVar = (esa) obj;
                        esaVar.getClass();
                        gv9 gv9Var2 = gv9.this;
                        esaVar.a(gv9Var2.size(), null, new dyg(gv9Var2, 6), new tc3(802480018, new tdk(gv9Var2, z, wv9Var, z2), true));
                        esa.d(esaVar, null, null, c6o.d, 3);
                        return Unit.a;
                    }
                };
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v8a.a(d0, null, C, ng0Var, null, null, false, null, (Function1) O, av8Var, 24576, 490);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dt2(gv9Var, wv9Var, z, xtcVar, z2, i2);
        }
    }

    public static final void V(xdk xdkVar, gv9 gv9Var, xtc xtcVar, boolean z, of3 of3Var, int i2) {
        xtc xtcVar2;
        xdkVar.getClass();
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1518860234);
        int i3 = (av8Var.i(xdkVar) ? 4 : 2) | i2 | (av8Var.g(gv9Var) ? 32 : 16) | 384 | (av8Var.h(z) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                yea yeaVar = j58.a;
                O = Boolean.valueOf(j58.j());
                av8Var.n0(O);
            }
            utc utcVar = utc.a;
            U(gv9Var, l6g.Y((Iterable) rfo.x(xdkVar.i, av8Var, 0).getValue()), ((Boolean) O).booleanValue(), utcVar, z, av8Var, ((i3 >> 3) & 14) | 3456 | ((i3 << 3) & 57344));
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(xdkVar, gv9Var, xtcVar2, z, i2, 24);
        }
    }

    public static z88 W(z88 z88Var, int i2) {
        a62 a62Var = a62.a;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            ogj.h(ljg.j(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i2 == -1) {
            a62Var = a62.b;
            i2 = 0;
        }
        int i3 = i2;
        a62 a62Var2 = a62Var;
        return z88Var instanceof pt8 ? pt8.c((pt8) z88Var, null, i3, a62Var2, 1) : new vn2(z88Var, null, i3, a62Var2, 2);
    }

    public static synchronized long X(Context context) {
        long j2;
        synchronized (k53.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j2 = memoryInfo.totalMem;
        }
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [a] */
    public static Type Y(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new a(0, Y(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(0, ((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds(), 0);
    }

    public static void Z(Type type) {
        c5n.w(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static void a0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static xtc b0(xtc xtcVar, n29 n29Var, Function0 function0, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        xtcVar.getClass();
        n29Var.getClass();
        function0.getClass();
        return xtcVar.z(new ca5(n29Var, function0, z));
    }

    public static boolean e0(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e0(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
    
        if (r5 < (defpackage.hkg.b0(r31) ? 3.0d : 1.6d)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d9, code lost:
    
        r18 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d6, code lost:
    
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        if (r5 > (defpackage.hkg.b0(r31) ? 3.0d : 1.6d)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f0(int i2, Context context) {
        context.getClass();
        int color = context.getColor(R.color.sofaBackground);
        double e2 = o23.e(i2, color);
        ufj ufjVar = vfj.a;
        if (e2 >= (hkg.b0(context) ? 3.0d : 1.6d)) {
            return i2;
        }
        double f2 = o23.f(color);
        double[] dArr = {Math.max(0.0d, (116.0d * r13) - 16.0d), r26, r28};
        o23.c(Color.red(i2), Color.green(i2), Color.blue(i2), dArr);
        double d2 = dArr[0];
        double d3 = dArr[1];
        double d4 = dArr[2];
        double j2 = o23.j(d2 / 95.047d);
        double d5 = 100.0d;
        double j3 = o23.j(d3 / 100.0d);
        double d6 = 0.0d;
        double d7 = (j2 - j3) * 500.0d;
        double j4 = (j3 - o23.j(d4 / 108.883d)) * 200.0d;
        for (int i3 = 0; i3 < 15 && d5 - d6 > 1.0E-5d; i3++) {
            double d8 = (d6 + d5) / 2.0d;
            int a2 = o23.a(d8, d7, j4);
            if (f2 < 0.5d) {
                double e3 = o23.e(a2, color);
                ufj ufjVar2 = vfj.a;
            } else {
                double e4 = o23.e(a2, color);
                ufj ufjVar3 = vfj.a;
            }
        }
        return o23.a(d6, d7, j4);
    }

    public static final z88 g0(z88 z88Var, CoroutineContext coroutineContext) {
        if (coroutineContext.get(uic.g) == null) {
            return coroutineContext.equals(g.a) ? z88Var : z88Var instanceof pt8 ? pt8.c((pt8) z88Var, coroutineContext, 0, null, 6) : new vn2(z88Var, coroutineContext, 0, null, 12);
        }
        hg6.e(coroutineContext, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static boolean h0(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int q0 = q0(context, str, "bool");
            if (q0 > 0) {
                return resources.getBoolean(q0);
            }
            int q02 = q0(context, str, "string");
            if (q02 > 0) {
                return Boolean.parseBoolean(context.getString(q02));
            }
        }
        return z;
    }

    public static final KClass i0(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof fq3) {
            return ((fq3) serialDescriptor).b;
        }
        if (serialDescriptor instanceof l5h) {
            return i0(((l5h) serialDescriptor).a);
        }
        return null;
    }

    public static final int j0(BaseballActionOutcomeCategory baseballActionOutcomeCategory) {
        baseballActionOutcomeCategory.getClass();
        int i2 = i81.c[baseballActionOutcomeCategory.ordinal()];
        if (i2 == 1) {
            return R.color.error;
        }
        if (i2 == 2) {
            return R.color.n_lv_1;
        }
        if (i2 == 3) {
            return R.color.secondary_default;
        }
        if (i2 == 4) {
            return R.color.primary_default;
        }
        if (i2 == 5) {
            return R.color.neutral_default;
        }
        zzl.b();
        return 0;
    }

    public static final int k0(BaseballActionOutcome baseballActionOutcome, Integer num) {
        return ((baseballActionOutcome == BaseballActionOutcome.FoulBall && num != null && num.intValue() == 2) || baseballActionOutcome == null) ? j0(BaseballActionOutcomeCategory.Other) : j0(baseballActionOutcome.getCategory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int l0() {
        boolean u0 = u0();
        ?? r0 = u0;
        if (v0()) {
            r0 = (u0 ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static Type m0(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m0(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m0(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final int n0(BaseballActionOutcome baseballActionOutcome) {
        switch (i81.b[baseballActionOutcome.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return R.string.baseball_outcome_strike;
            case 6:
                return R.string.baseball_outcome_foul_ball;
            case 7:
                return R.string.baseball_outcome_foul_tip;
            case 8:
                return R.string.baseball_outcome_umpire_ruling;
            case 9:
                return R.string.baseball_outcome_umpire_ruling;
            case 10:
                return R.string.baseball_outcome_batters_interference;
            case 11:
            case 12:
            case 13:
                return R.string.baseball_outcome_double_play;
            case 14:
            case 15:
            case 16:
            case 17:
                return R.string.baseball_outcome_fielders_choice;
            case 18:
                return R.string.baseball_outcome_flyout;
            case 19:
                return R.string.baseball_outcome_groundout;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                return R.string.baseball_outcome_out;
            case 37:
                return R.string.baseball_outcome_lineout;
            case 38:
                return R.string.baseball_outcome_out_of_batters_box;
            case 39:
                return R.string.baseball_outcome_out_on_appeal;
            case 40:
                return R.string.baseball_outcome_pop_out;
            case 41:
            case 42:
            case 43:
            case 44:
                return R.string.baseball_outcome_sacrifice_bunt;
            case 45:
            case 46:
            case 47:
            case 48:
                return R.string.baseball_outcome_sacrifice_fly;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                return R.string.baseball_outcome_ball;
            case 57:
                return R.string.baseball_outcome_balk;
            case 58:
                return R.string.baseball_outcome_catchers_interference;
            case 59:
            case 60:
            case 61:
                return R.string.baseball_outcome_double;
            case 62:
            case 63:
            case 64:
                return R.string.baseball_outcome_fielders_choice;
            case 65:
                return R.string.baseball_outcome_hit_by_pitch;
            case 66:
                return R.string.baseball_outcome_home_run;
            case 67:
                return R.string.baseball_outcome_intentional_walk;
            case 68:
                return R.string.baseball_outcome_walk;
            case 69:
            case 70:
            case 71:
            case 72:
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                return R.string.baseball_outcome_strikeout;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
            case 79:
            case 80:
                return R.string.baseball_reached_base_on_error;
            case 81:
                return R.string.baseball_reached_base_on_violation;
            case 82:
            case 83:
            case 84:
            case 85:
                return R.string.baseball_outcome_single;
            case 86:
            case 87:
            case 88:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return R.string.baseball_outcome_sacrifice_bunt;
            case 90:
            case 91:
            case 92:
            case 93:
                return R.string.baseball_outcome_sacrifice_fly;
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                return R.string.baseball_outcome_triple;
            case 95:
                return R.string.baseball_outcome_triple;
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return R.string.baseball_outcome_caught_stealing;
            case 102:
            case 103:
            case 104:
            case 105:
                return R.string.baseball_outcome_tag_out;
            case 106:
            case 107:
            case 108:
            case 109:
                return R.string.baseball_outcome_forceout;
            case 110:
            case 111:
            case 112:
                return R.string.baseball_outcome_doubled_off;
            case 113:
            case ASSET_WRITE_ERROR_VALUE:
            case INVALID_INDEX_URL_VALUE:
            case GZIP_ENCODE_ERROR_VALUE:
            case ASSET_FAILED_STATUS_CODE_VALUE:
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
            case JSON_ENCODE_ERROR_VALUE:
            case 120:
            case TPAT_ERROR_VALUE:
                return R.string.baseball_outcome_out;
            case INVALID_ADS_ENDPOINT_VALUE:
            case INVALID_RI_ENDPOINT_VALUE:
                return R.string.baseball_outcome_stolen_base;
            case INVALID_LOG_ERROR_ENDPOINT_VALUE:
            case INVALID_METRICS_ENDPOINT_VALUE:
                return R.string.baseball_outcome_stolen_home_base;
            case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
            case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
            case 128:
                return R.string.baseball_outcome_runner_advances;
            case 129:
            case 130:
                return R.string.baseball_outcome_defensive_indifference;
            case MRAID_JS_WRITE_FAILED_VALUE:
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 134:
            case 135:
                return R.string.baseball_outcome_caught_stealing;
            case PRIVACY_URL_ERROR_VALUE:
            case TPAT_RETRY_FAILED_VALUE:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
                return R.string.baseball_outcome_stolen_base;
            case 147:
                return R.string.baseball_outcome_runner_checked;
            case 148:
            case 149:
                return R.string.baseball_outcome_pickoff;
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
                return R.string.baseball_outcome_run;
            case 156:
                return R.string.baseball_pitching_substitution;
            case 157:
            case 158:
                return R.string.baseball_offensive_substitution;
            case 159:
                return R.string.baseball_defensive_substitution;
            case 160:
                return R.string.baseball_defensive_switch;
            default:
                zzl.b();
                return 0;
        }
    }

    public static final lj2 o0(rq3 rq3Var) {
        Unsafe unsafe;
        lj2 lj2Var;
        lj2 lj2Var2;
        if (!(rq3Var instanceof s45)) {
            return new lj2(1, rq3Var);
        }
        s45 s45Var = (s45) rq3Var;
        long j2 = s45.h;
        loop0: while (true) {
            unsafe = rh0.a;
            Object objectVolatile = unsafe.getObjectVolatile(s45Var, j2);
            lj2Var = null;
            ih2 ih2Var = t45.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(s45Var, j2, ih2Var);
                lj2Var2 = null;
                break;
            }
            if (objectVolatile instanceof lj2) {
                do {
                    unsafe = rh0.a;
                    if (unsafe.compareAndSwapObject(s45Var, s45.h, objectVolatile, ih2Var)) {
                        lj2Var2 = (lj2) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(s45Var, j2) == objectVolatile);
            } else if (objectVolatile != ih2Var && !(objectVolatile instanceof Throwable)) {
                cp4.g(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (lj2Var2 != null) {
            long j3 = lj2.h;
            Object objectVolatile2 = unsafe.getObjectVolatile(lj2Var2, j3);
            if (!(objectVolatile2 instanceof cb3) || ((cb3) objectVolatile2).d == null) {
                unsafe.putIntVolatile(lj2Var2, lj2.f, 536870911);
                unsafe.putObjectVolatile(lj2Var2, j3, nc.a);
                lj2Var = lj2Var2;
            } else {
                lj2Var2.n();
            }
            if (lj2Var != null) {
                return lj2Var;
            }
        }
        return new lj2(2, rq3Var);
    }

    public static Class p0(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            c5n.w(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) p0(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return p0(((WildcardType) type).getUpperBounds()[0]);
        }
        yhk.m("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static int q0(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i2);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static final String r0(BaseballActionOutcome baseballActionOutcome, Context context) {
        baseballActionOutcome.getClass();
        context.getClass();
        Integer stringFormatNumber = baseballActionOutcome.getStringFormatNumber();
        if (stringFormatNumber != null) {
            String string = context.getString(n0(baseballActionOutcome), Integer.valueOf(stringFormatNumber.intValue()));
            if (string != null) {
                return string;
            }
        }
        String string2 = context.getString(n0(baseballActionOutcome));
        string2.getClass();
        return string2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FantasyPlayerFixture s0(FantasyRoundPlayer fantasyRoundPlayer) {
        List<FantasyPlayerFixture> fixtures = fantasyRoundPlayer.getFixtures();
        FantasyPlayerFixture fantasyPlayerFixture = null;
        if (fixtures != null && !fixtures.isEmpty()) {
            Iterator it = CollectionsKt.H0(fixtures, new se7(4)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.c(((FantasyPlayerFixture) next).getEventStatusType(), StatusKt.STATUS_NOT_STARTED)) {
                    fantasyPlayerFixture = next;
                    break;
                }
            }
            fantasyPlayerFixture = fantasyPlayerFixture;
            if (fantasyPlayerFixture == null) {
                return (FantasyPlayerFixture) CollectionsKt.h0(fixtures);
            }
        }
        return fantasyPlayerFixture;
    }

    public static String t0(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            int i4 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static boolean u0() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean v0() {
        boolean u0 = u0();
        String str = Build.TAGS;
        if ((u0 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !u0 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static final t30 w0(Function0 function0, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        View view = (View) av8Var.k(nz.f);
        boolean g2 = av8Var.g(view);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (g2 || O == a99Var) {
            O = new t30(view, null, function0);
            av8Var.n0(O);
        }
        t30 t30Var = (t30) O;
        boolean i3 = av8Var.i(t30Var);
        Object O2 = av8Var.O();
        if (i3 || O2 == a99Var) {
            O2 = new o30(t30Var, 3);
            av8Var.n0(O2);
        }
        hz8.d(t30Var, (Function1) O2, av8Var);
        return t30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013a, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013c, code lost:
    
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013f, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a A[EDGE_INSN: B:24:0x013a->B:25:0x013a BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type x0(Type type, Class cls, Type type2, HashMap hashMap) {
        Type x0;
        Type bVar;
        TypeVariable typeVariable = null;
        while (true) {
            int i2 = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                hashMap.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 != null) {
                    Type m0 = m0(type, cls, cls3);
                    if (m0 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i2 < length) {
                            if (typeVariable2.equals(typeParameters[i2])) {
                                type2 = ((ParameterizedType) m0).getActualTypeArguments()[i2];
                                if (type2 != typeVariable2) {
                                    break;
                                }
                            } else {
                                i2++;
                            }
                        }
                        yhk.d();
                        return null;
                    }
                }
                type2 = typeVariable2;
                if (type2 != typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls4 = type2;
                    if (cls4.isArray()) {
                        Class<?> componentType = cls4.getComponentType();
                        Type x02 = x0(type, cls, componentType, hashMap);
                        if (Objects.equals(componentType, x02)) {
                            type2 = cls4;
                        } else {
                            bVar = new a(0, x02);
                            type2 = bVar;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type x03 = x0(type, cls, genericComponentType, hashMap);
                    if (!Objects.equals(genericComponentType, x03)) {
                        bVar = new a(0, x03);
                        type2 = bVar;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type x04 = x0(type, cls, ownerType, hashMap);
                    boolean z = !Objects.equals(x04, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i2 < length2) {
                        Type x05 = x0(type, cls, actualTypeArguments[i2], hashMap);
                        if (!Objects.equals(x05, actualTypeArguments[i2])) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i2] = x05;
                        }
                        i2++;
                    }
                    if (z) {
                        bVar = new b(x04, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type x06 = x0(type, cls, lowerBounds[0], hashMap);
                        if (x06 != lowerBounds[0]) {
                            type2 = new c(new Type[]{Object.class}, x06 instanceof WildcardType ? ((WildcardType) x06).getLowerBounds() : new Type[]{x06}, 0);
                        }
                    } else if (upperBounds.length == 1 && (x0 = x0(type, cls, upperBounds[0], hashMap)) != upperBounds[0]) {
                        type2 = new c(x0 instanceof WildcardType ? ((WildcardType) x0).getUpperBounds() : new Type[]{x0}, b, 0);
                    }
                }
            }
        }
    }

    public static String y0(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bytes);
            return t0(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String z0(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = useDelimiter.hasNext() ? useDelimiter.next() : "";
            useDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (useDelimiter != null) {
                try {
                    useDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.wf3
    public void A(b7f b7fVar, int i2, char c2) {
        c0(b7fVar, i2);
        w(c2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void B(int i2) {
        d0(Integer.valueOf(i2));
    }

    @Override // defpackage.wf3
    public void D(SerialDescriptor serialDescriptor, int i2, double d2) {
        serialDescriptor.getClass();
        c0(serialDescriptor, i2);
        e(d2);
    }

    @Override // defpackage.wf3
    public void E(SerialDescriptor serialDescriptor, int i2, long j2) {
        serialDescriptor.getClass();
        c0(serialDescriptor, i2);
        m(j2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void F(String str) {
        str.getClass();
        d0(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public wf3 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    public void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    public void c0(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
    }

    public void d0(Object obj) {
        obj.getClass();
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        fuf fufVar = duf.a;
        sb.append(fufVar.getOrCreateKotlinClass(cls));
        sb.append(" is not supported by ");
        sb.append(fufVar.getOrCreateKotlinClass(getClass()));
        sb.append(" encoder");
        throw new v5h(sb.toString());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(double d2) {
        d0(Double.valueOf(d2));
    }

    @Override // defpackage.wf3
    public void f(SerialDescriptor serialDescriptor, int i2, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        c0(serialDescriptor, i2);
        l(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void g(byte b2) {
        d0(Byte.valueOf(b2));
    }

    public void h(SerialDescriptor serialDescriptor, int i2, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        c0(serialDescriptor, i2);
        if (kSerializer.getDescriptor().b()) {
            l(kSerializer, obj);
        } else if (obj == null) {
            p();
        } else {
            l(kSerializer, obj);
        }
    }

    @Override // defpackage.wf3
    public void i(b7f b7fVar, int i2, short s) {
        c0(b7fVar, i2);
        r(s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void j(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        d0(Integer.valueOf(i2));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder k(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void m(long j2) {
        d0(Long.valueOf(j2));
    }

    @Override // defpackage.wf3
    public Encoder n(b7f b7fVar, int i2) {
        c0(b7fVar, i2);
        return k(b7fVar.g(i2));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void p() {
        throw new v5h("'null' is not supported by default");
    }

    @Override // defpackage.wf3
    public void q(SerialDescriptor serialDescriptor, int i2, byte b2) {
        serialDescriptor.getClass();
        c0(serialDescriptor, i2);
        g(b2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void r(short s) {
        d0(Short.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void s(boolean z) {
        d0(Boolean.valueOf(z));
    }

    @Override // defpackage.wf3
    public void t(SerialDescriptor serialDescriptor, int i2, float f2) {
        serialDescriptor.getClass();
        c0(serialDescriptor, i2);
        v(f2);
    }

    @Override // defpackage.wf3
    public void u(int i2, int i3, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        c0(serialDescriptor, i2);
        B(i3);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void v(float f2) {
        d0(Float.valueOf(f2));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void w(char c2) {
        d0(Character.valueOf(c2));
    }

    @Override // defpackage.wf3
    public void x(SerialDescriptor serialDescriptor, int i2, boolean z) {
        serialDescriptor.getClass();
        c0(serialDescriptor, i2);
        s(z);
    }

    @Override // defpackage.wf3
    public void y(SerialDescriptor serialDescriptor, int i2, String str) {
        serialDescriptor.getClass();
        str.getClass();
        c0(serialDescriptor, i2);
        F(str);
    }
}
