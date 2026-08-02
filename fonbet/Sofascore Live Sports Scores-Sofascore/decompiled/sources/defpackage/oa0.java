package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class oa0 {
    public static final ff5 a = new ff5(0, new st(16));
    public static final float b;
    public static final float c;

    static {
        new zsa(new st(17));
        new h74(0.8f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    public static final void a(xtc xtcVar, dfj dfjVar, dfj dfjVar2, tc3 tc3Var, ct8 ct8Var, float f, w8l w8lVar, zkj zkjVar, of3 of3Var, int i, int i2) {
        int i3;
        float f2;
        w8l w8lVar2;
        int i4;
        tc3 tc3Var2 = wnn.c;
        kv1 kv1Var = uxf.o;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2033800111);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.i(tc3Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(dfjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var.i(null) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var.g(dfjVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= av8Var.g(kv1Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= av8Var.i(tc3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= av8Var.i(ct8Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= av8Var.d(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            w8lVar2 = w8lVar;
            i3 |= av8Var.g(w8lVar2) ? 536870912 : 268435456;
        } else {
            w8lVar2 = w8lVar;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (av8Var.g(zkjVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(null) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((qs4) av8Var.k(a)).a(new iih(xtcVar, dfjVar, dfjVar2, tc3Var, ct8Var, f2, w8lVar2, zkjVar), av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new la0(xtcVar, dfjVar, dfjVar2, tc3Var, ct8Var, f, w8lVar, zkjVar, i, i2);
        }
    }

    public static final void b(xtc xtcVar, final tc3 tc3Var, ct8 ct8Var, final float f, w8l w8lVar, final zkj zkjVar, of3 of3Var, final int i) {
        final xtc xtcVar2;
        final ct8 ct8Var2;
        final w8l w8lVar2;
        int i2;
        ct8 ct8Var3;
        xtc xtcVar3;
        w8l w8lVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1784421840);
        int i3 = i | 68656 | (av8Var.g(zkjVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        if (av8Var.T(i3 & 1, (4793491 & i3) != 4793490)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                tc3 tc3Var2 = wc3.a;
                j7b a2 = alj.a(av8Var);
                i2 = i3 & (-458753);
                ct8Var3 = tc3Var2;
                xtcVar3 = utc.a;
                w8lVar3 = a2;
            } else {
                av8Var.W();
                i2 = i3 & (-458753);
                xtcVar3 = xtcVar;
                ct8Var3 = ct8Var;
                w8lVar3 = w8lVar;
            }
            av8Var.t();
            a(xtcVar3, d7k.a(xa0.a, av8Var), dfj.d, tc3Var, ct8Var3, (p75.b(f, Float.NaN) || p75.b(f, Float.POSITIVE_INFINITY)) ? alj.a : f, w8lVar3, zkjVar, av8Var, 14380086, (i2 >> 18) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            xtcVar2 = xtcVar3;
            ct8Var2 = ct8Var3;
            w8lVar2 = w8lVar3;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            ct8Var2 = ct8Var;
            w8lVar2 = w8lVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(tc3Var, ct8Var2, f, w8lVar2, zkjVar, i) { // from class: ka0
                public final /* synthetic */ tc3 b;
                public final /* synthetic */ ct8 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ w8l e;
                public final /* synthetic */ zkj f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(24967);
                    oa0.b(xtc.this, this.b, this.c, this.d, this.e, this.f, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final xtc xtcVar, final a88 a88Var, final long j, final long j2, final long j3, long j4, final dfj dfjVar, final dfj dfjVar2, final Function0 function0, final tc3 tc3Var, tc3 tc3Var2, final float f, of3 of3Var, final int i) {
        final tc3 tc3Var3;
        av8 av8Var;
        final long j5 = j4;
        tc3 tc3Var4 = wnn.c;
        kv1 kv1Var = uxf.o;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(126395868);
        int i2 = i | (av8Var2.g(xtcVar) ? 4 : 2) | (av8Var2.g(a88Var) ? 32 : 16) | (av8Var2.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.f(j2) ? a.o : 1024) | (av8Var2.f(j3) ? 16384 : 8192);
        boolean f2 = av8Var2.f(j5);
        int i3 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i4 = (av8Var2.i(null) ? 67108864 : 33554432) | i2 | (f2 ? 131072 : 65536) | (av8Var2.i(tc3Var4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.g(dfjVar) ? 8388608 : 4194304) | (av8Var2.g(dfjVar2) ? 536870912 : 268435456);
        int i5 = 1600566 | (av8Var2.g(kv1Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.i(tc3Var)) {
            i3 = 131072;
        }
        int i6 = i5 | i3 | (av8Var2.d(f) ? 8388608 : 4194304);
        if (av8Var2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (4793491 & i6) == 4793490) ? false : true)) {
            boolean z = ((i4 & 112) == 32) | ((i6 & 896) == 256) | ((29360128 & i6) == 8388608);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new clj(a88Var, f);
                av8Var2.n0(O);
            }
            clj cljVar = (clj) O;
            int G = z8e.G(av8Var2);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var2, cljVar, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            f50 f50Var2 = hf3.j;
            if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var2, G, f50Var2);
            }
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            xtc D = ww9.D(utcVar, "navigationIcon");
            float f3 = b;
            xtc f0 = l98.f0(D, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int G2 = z8e.G(av8Var2);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G2))) {
                mz1.t(G2, av8Var2, G2, f50Var2);
            }
            waa.K(av8Var2, C2, f50Var3);
            ff5 ff5Var = lo3.a;
            tol.b(ff5Var.a(new r13(j)), tc3Var, av8Var2, ((i6 >> 12) & 112) | 8);
            av8Var2.s(true);
            av8Var2.d0(-1359701523);
            xtc d0 = l98.d0(ww9.D(utcVar, "title"), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            av8Var2.d0(510340109);
            av8Var2.s(false);
            xtc z2 = d0.z(utcVar);
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new ma0(0, function0);
                av8Var2.n0(O2);
            }
            xtc M = s02.M(z2, (Function1) O2);
            k1c c3 = e12.c(mv1Var, false);
            int G3 = z8e.G(av8Var2);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, M);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G3))) {
                mz1.t(G3, av8Var2, G3, f50Var2);
            }
            waa.K(av8Var2, C3, f50Var3);
            w1a.f(j2, dfjVar, tc3Var4, av8Var2, ((i4 >> 9) & 14) | ((i4 >> 18) & 112) | ((i4 >> 12) & 896));
            av8Var = av8Var2;
            av8Var.s(true);
            av8Var.s(false);
            xtc f02 = l98.f0(ww9.D(utcVar, "actionIcons"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            k1c c4 = e12.c(mv1Var, false);
            int G4 = z8e.G(av8Var);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G4))) {
                mz1.t(G4, av8Var, G4, f50Var2);
            }
            waa.K(av8Var, C4, f50Var3);
            j5 = j4;
            tc3Var3 = tc3Var2;
            tol.b(ff5Var.a(new r13(j5)), tc3Var3, av8Var, 56);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            tc3Var3 = tc3Var2;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(a88Var, j, j2, j3, j5, dfjVar, dfjVar2, function0, tc3Var, tc3Var3, f, i) { // from class: na0
                public final /* synthetic */ a88 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ dfj g;
                public final /* synthetic */ dfj h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ tc3 j;
                public final /* synthetic */ tc3 k;
                public final /* synthetic */ float l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    oa0.c(xtc.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }
}
