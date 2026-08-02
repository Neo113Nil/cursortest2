package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class phf {
    public static final phf a = new phf();
    public static final n7g b = o7g.a;
    public static final float c = 80.0f;
    public static final float d = 80.0f;
    public static final float e = 3.0f;

    public final void a(final xhf xhfVar, final boolean z, final xtc xtcVar, long j, long j2, float f, of3 of3Var, final int i, final int i2) {
        int i3;
        final long j3;
        final long j4;
        final float f2;
        int i4;
        float f3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1076870256);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(xhfVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            j3 = j;
            i3 |= ((i2 & 8) == 0 && av8Var.f(j3)) ? a.o : 1024;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            j4 = j2;
            i3 |= ((i2 & 16) == 0 && av8Var.f(j4)) ? 16384 : 8192;
        } else {
            j4 = j2;
        }
        if ((196608 & i) == 0) {
            i3 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= av8Var.g(this) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                if ((i2 & 8) != 0) {
                    j3 = ((g23) av8Var.k(i23.a)).G;
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    j4 = ((g23) av8Var.k(i23.a)).s;
                    i3 &= -57345;
                }
                i4 = i3 & (-458753);
                f3 = d;
            } else {
                av8Var.W();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                i4 = i3 & (-458753);
                f3 = f;
            }
            long j5 = j4;
            long j6 = j3;
            av8Var.t();
            int i5 = (i4 & 14) | 12582912 | (i4 & 112) | (i4 & 896);
            int i6 = i4 << 6;
            b(xhfVar, z, xtcVar, f3, null, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yqo.H(298232649, av8Var, new ohf(z, j5, xhfVar)), av8Var, i5 | (458752 & i6) | (i6 & 234881024));
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            av8Var.W();
            f2 = f;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: hhf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    phf.this.a(xhfVar, z, xtcVar, j3, j4, f2, (of3) obj, aba.K(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public final void b(final xhf xhfVar, final boolean z, final xtc xtcVar, final float f, uah uahVar, final long j, float f2, final tc3 tc3Var, of3 of3Var, final int i) {
        final xhf xhfVar2;
        int i2;
        phf phfVar;
        final uah uahVar2;
        final float f3;
        int i3;
        uah uahVar3;
        final uah uahVar4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1341144489);
        if ((i & 6) == 0) {
            xhfVar2 = xhfVar;
            i2 = (av8Var.g(xhfVar2) ? 4 : 2) | i;
        } else {
            xhfVar2 = xhfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.d(f) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.f(j) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var.i(tc3Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            phfVar = this;
            i2 |= av8Var.g(phfVar) ? 67108864 : 33554432;
        } else {
            phfVar = this;
        }
        if (av8Var.T(i2 & 1, (38347923 & i2) != 38347922)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                i3 = i2 & (-3727361);
                uahVar3 = b;
                f3 = e;
            } else {
                av8Var.W();
                i3 = i2 & (-3727361);
                uahVar3 = uahVar;
                f3 = f2;
            }
            int i4 = i3;
            av8Var.t();
            xtc l = bkh.l(xtcVar, 40.0f);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new b1f(23);
                av8Var.n0(O);
            }
            xtc Z = td4.Z(l, (Function1) O);
            boolean d2 = ((i4 & 112) == 32) | ((i4 & 14) == 4) | ((((i4 & 7168) ^ 3072) > 2048 && av8Var.d(f)) || (i4 & 3072) == 2048) | av8Var.d(f3) | av8Var.g(uahVar3);
            Object O2 = av8Var.O();
            if (d2 || O2 == a99Var) {
                uahVar4 = uahVar3;
                ct8 ct8Var = new ct8() { // from class: ihf
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final qhe J = ((g1c) obj2).J(((an3) obj3).a);
                        int i5 = J.a;
                        int i6 = J.b;
                        final xhf xhfVar3 = xhf.this;
                        final boolean z2 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final uah uahVar5 = uahVar4;
                        return m1c.G0((m1c) obj, i5, i6, new Function1() { // from class: khf
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                final xhf xhfVar4 = xhfVar3;
                                final boolean z3 = z2;
                                final float f6 = f4;
                                final float f7 = f5;
                                final uah uahVar6 = uahVar5;
                                phe.m((phe) obj4, qhe.this, 0, 0, new Function1() { // from class: lhf
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        f4g f4gVar = (f4g) obj5;
                                        xhf xhfVar5 = xhf.this;
                                        float floatValue = ((Number) xhfVar5.a.d()).floatValue();
                                        float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        boolean z4 = floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || z3;
                                        f4gVar.y((((Number) xhfVar5.a.d()).floatValue() * f4gVar.e0(f6)) - Float.intBitsToFloat((int) (f4gVar.r & 4294967295L)));
                                        if (z4) {
                                            f8 = f4gVar.s.j() * f7;
                                        }
                                        f4gVar.m(f8);
                                        f4gVar.o(uahVar6);
                                        f4gVar.d(true);
                                        return Unit.a;
                                    }
                                }, 4);
                                return Unit.a;
                            }
                        });
                    }
                };
                av8Var.n0(ct8Var);
                O2 = ct8Var;
            } else {
                uahVar4 = uahVar3;
            }
            xtc q = n9e.q(s9a.A(Z, (ct8) O2), j, uahVar4);
            int i5 = ((i4 >> 12) & 7168) | 48;
            k1c c2 = e12.c(uxf.g, false);
            int G = z8e.G(av8Var);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            tc3Var.invoke(n12.a, av8Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            av8Var.s(true);
            uahVar2 = uahVar4;
        } else {
            av8Var.W();
            uahVar2 = uahVar;
            f3 = f2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final phf phfVar2 = phfVar;
            u.d = new Function2() { // from class: jhf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    phf.this.b(xhfVar, z, xtcVar, f, uahVar2, j, f3, tc3Var, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
