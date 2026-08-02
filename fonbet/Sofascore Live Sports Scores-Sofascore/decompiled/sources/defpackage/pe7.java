package defpackage;

import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class pe7 {
    public static final void a(final osa osaVar, final w28 w28Var, final boolean z, final boolean z2, final Function1 function1, final Function1 function12, final ho1 ho1Var, final Function1 function13, final Float f, final Function1 function14, final rz6 rz6Var, final Function1 function15, final Function0 function0, final mei meiVar, final nei neiVar, final Function1 function16, final boolean z3, xtc xtcVar, String str, ct8 ct8Var, of3 of3Var, final int i, final int i2, final int i3) {
        int i4;
        av8 av8Var;
        final xtc xtcVar2;
        final String str2;
        final ct8 ct8Var2;
        e1d e1dVar;
        g28 g28Var;
        ct8 ct8Var3;
        String str3;
        osaVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        function0.getClass();
        meiVar.getClass();
        neiVar.getClass();
        function16.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1691574828);
        int i5 = i | (av8Var2.i(osaVar) ? 4 : 2) | (av8Var2.g(w28Var) ? 32 : 16) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? 16384 : 8192);
        boolean i6 = av8Var2.i(function12);
        int i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i8 = i5 | (i6 ? 131072 : 65536) | (av8Var2.g(ho1Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.i(function13) ? 8388608 : 4194304) | (av8Var2.g(f) ? 67108864 : 33554432) | (av8Var2.i(function14) ? 536870912 : 268435456);
        int i9 = (av8Var2.e(meiVar.ordinal()) ? a.o : 1024) | i2 | (av8Var2.e(rz6Var == null ? -1 : rz6Var.ordinal()) ? 4 : 2) | (av8Var2.i(function15) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.e(neiVar.ordinal()) ? 16384 : 8192);
        if (av8Var2.i(function16)) {
            i7 = 131072;
        }
        int i10 = i9 | i7 | (av8Var2.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i11 = i3 & 131072;
        if (i11 != 0) {
            i4 = i10 | 12582912;
        } else {
            i4 = i10 | (av8Var2.g(xtcVar) ? 8388608 : 4194304);
        }
        int i12 = i3 & 262144;
        if (i12 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i4 |= av8Var2.g(str) ? 67108864 : 33554432;
        }
        int i13 = i3 & 524288;
        if (i13 != 0) {
            i4 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i4 |= av8Var2.i(ct8Var) ? 536870912 : 268435456;
        }
        if (av8Var2.T(i8 & 1, ((i8 & 306783379) == 306783378 && (i4 & 306783379) == 306783378) ? false : true)) {
            xtc xtcVar3 = i11 != 0 ? utc.a : xtcVar;
            String str4 = i12 != 0 ? null : str;
            ct8 ct8Var4 = i13 != 0 ? v9g.a : ct8Var;
            ksa a = msa.a(0, 0, av8Var2, 0, 3);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = goh.b(new ni4(a, 5));
                av8Var2.n0(O);
            }
            cdi cdiVar = (cdi) O;
            qug o0 = hkg.o0(av8Var2);
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = e.f(Boolean.TRUE);
                av8Var2.n0(O2);
            }
            e1d e1dVar2 = (e1d) O2;
            boolean g = av8Var2.g(a);
            Object O3 = av8Var2.O();
            if (g || O3 == a99Var) {
                e1dVar = e1dVar2;
                O3 = new ck1(5, null, a);
                av8Var2.n0(O3);
            } else {
                e1dVar = e1dVar2;
            }
            hz8.p(ho1Var, f, rz6Var, (Function2) O3, av8Var2);
            g28 g28Var2 = bkh.c;
            xtc z4 = xtcVar3.z(g28Var2);
            xtc xtcVar4 = xtcVar3;
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, z4);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            WeakHashMap weakHashMap = cal.w;
            t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xw3.s(qea.p(av8Var2).e, av8Var2).a() + 48.0f, 7);
            boolean g2 = ((i8 & 458752) == 131072) | ((i8 & 112) == 32) | ((i8 & 3670016) == 1048576) | ((29360128 & i8) == 8388608) | ((i8 & 234881024) == 67108864) | ((i8 & 1879048192) == 536870912) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 3670016) == 1048576) | ((i8 & 14) == 4 || av8Var2.i(osaVar)) | av8Var2.g(o0) | ((i4 & 458752) == 131072) | ((i4 & 7168) == 2048) | ((i4 & 57344) == 16384) | ((i4 & 1879048192) == 536870912) | ((i8 & 896) == 256) | ((i4 & 234881024) == 67108864) | ((i8 & 57344) == 16384);
            Object O4 = av8Var2.O();
            if (g2 || O4 == a99Var) {
                g28Var = g28Var2;
                String str5 = str4;
                ct8Var3 = ct8Var4;
                ke7 ke7Var = new ke7(osaVar, str5, w28Var, ho1Var, function13, f, function14, rz6Var, function15, function0, z3, cdiVar, o0, function16, meiVar, neiVar, ct8Var3, z, z2, e1dVar, function1, function12);
                str3 = str5;
                av8Var = av8Var2;
                av8Var.n0(ke7Var);
                O4 = ke7Var;
            } else {
                av8Var = av8Var2;
                g28Var = g28Var2;
                str3 = str4;
                ct8Var3 = ct8Var4;
            }
            v8a.a(g28Var, a, C2, null, null, null, false, null, (Function1) O4, av8Var, 6, PglCryptUtils.BASE64_FAILED);
            fz8.e(Intrinsics.c(osaVar.d().a, ofb.b), null, uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2), null, v9g.d, av8Var, 200064, 18);
            av8Var.s(true);
            str2 = str3;
            ct8Var2 = ct8Var3;
            xtcVar2 = xtcVar4;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
            str2 = str;
            ct8Var2 = ct8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(w28Var, z, z2, function1, function12, ho1Var, function13, f, function14, rz6Var, function15, function0, meiVar, neiVar, function16, z3, xtcVar2, str2, ct8Var2, i, i2, i3) { // from class: le7
                public final /* synthetic */ w28 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ ho1 g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Float i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ rz6 k;
                public final /* synthetic */ Function1 l;
                public final /* synthetic */ Function0 m;
                public final /* synthetic */ mei n;
                public final /* synthetic */ nei o;
                public final /* synthetic */ Function1 p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ xtc r;
                public final /* synthetic */ String s;
                public final /* synthetic */ ct8 t;
                public final /* synthetic */ int u;
                public final /* synthetic */ int v;

                {
                    this.u = i2;
                    this.v = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(3081);
                    int K2 = aba.K(this.u);
                    pe7.a(osa.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (of3) obj, K, K2, this.v);
                    return Unit.a;
                }
            };
        }
    }
}
