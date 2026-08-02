package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class t2k {
    public static final b7 a = l6g.K(Float.valueOf(0.00999999f), Float.valueOf(0.02000001f), Float.valueOf(0.030000001f), Float.valueOf(0.03999999f), Float.valueOf(0.050000012f), Float.valueOf(0.060000002f), Float.valueOf(0.06999999f), Float.valueOf(0.07499999f), Float.valueOf(0.08000001f), Float.valueOf(0.095f), Float.valueOf(0.120000005f), Float.valueOf(0.155f), Float.valueOf(0.22f));

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gv9 gv9Var, final gv9 gv9Var2, final gv9 gv9Var3, int i, final float f, final long j, of3 of3Var, final int i2, final int i3) {
        int i4;
        final gv9 gv9Var4;
        int i5;
        float f2;
        int i6;
        av8 av8Var;
        final int i7;
        eqf u;
        Float f3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-200078306);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(gv9Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            gv9Var4 = gv9Var3;
            i4 |= av8Var2.g(gv9Var4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            gv9Var4 = gv9Var3;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 = i;
            i4 |= av8Var2.e(i5) ? a.o : 1024;
            if ((i2 & 24576) != 0) {
                f2 = f;
                i4 |= av8Var2.d(f2) ? 16384 : 8192;
            } else {
                f2 = f;
            }
            if ((i2 & 196608) == 0) {
                i4 |= av8Var2.f(j) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            }
            i6 = i4;
            if (av8Var2.T(i6 & 1, (74899 & i6) == 74898)) {
                av8Var = av8Var2;
                av8Var.W();
                i7 = i5;
            } else {
                final int i9 = i8 != 0 ? 0 : i5;
                if (i9 >= gv9Var.size()) {
                    eqf u2 = av8Var2.u();
                    if (u2 != null) {
                        final int i10 = 0;
                        final float f4 = f2;
                        u2.d = new Function2() { // from class: o2k
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i10) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        t2k.a(gv9Var, gv9Var2, gv9Var4, i9, f4, j, (of3) obj, aba.K(i2 | 1), i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        t2k.a(gv9Var, gv9Var2, gv9Var4, i9, f4, j, (of3) obj, aba.K(i2 | 1), i3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                boolean z = i9 == gv9Var.size() - 1;
                gv9 gv9Var5 = (gv9) gv9Var.get(i9);
                float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (!z && (f3 = (Float) CollectionsKt.a0(i9, gv9Var2)) != null) {
                    f5 = f3.floatValue();
                }
                final int i11 = i9;
                av8Var = av8Var2;
                b(gv9Var5, gv9Var3, f5, z, f, yqo.H(-528614302, av8Var2, new ct8() { // from class: p2k
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        of3 of3Var2 = (of3) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((m12) obj).getClass();
                        av8 av8Var3 = (av8) of3Var2;
                        if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                            t2k.a(gv9Var, gv9Var2, gv9Var3, i11 + 1, f, j, av8Var3, 0, 0);
                        } else {
                            av8Var3.W();
                        }
                        return Unit.a;
                    }
                }), av8Var, ((i6 >> 3) & 112) | 196608 | (57344 & i6));
                i7 = i11;
            }
            u = av8Var.u();
            if (u == null) {
                final int i12 = 1;
                u.d = new Function2() { // from class: o2k
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i12) {
                            case 0:
                                ((Integer) obj2).getClass();
                                t2k.a(gv9Var, gv9Var2, gv9Var3, i7, f, j, (of3) obj, aba.K(i2 | 1), i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                t2k.a(gv9Var, gv9Var2, gv9Var3, i7, f, j, (of3) obj, aba.K(i2 | 1), i3);
                                break;
                        }
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        i5 = i;
        if ((i2 & 24576) != 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        i6 = i4;
        if (av8Var2.T(i6 & 1, (74899 & i6) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(final gv9 gv9Var, final gv9 gv9Var2, final float f, final boolean z, final float f2, final tc3 tc3Var, of3 of3Var, final int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-472783612);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(gv9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(gv9Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.d(f) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.h(z) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.i(tc3Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            final v7b E = wxf.E(gv9Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            final v7b E2 = wxf.E(gv9Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            dy0.b(bkh.c, uxf.g, yqo.H(1902034906, av8Var, new ct8() { // from class: q2k
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s22 s22Var = (s22) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    s22Var.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                    }
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                        av8Var2.d0(-1800511199);
                        g28 g28Var = bkh.c;
                        float c = s22Var.c();
                        float f3 = f;
                        xtc p = n9e.p(l98.c0(g28Var, c * f3, s22Var.b() * f3), E, o7g.a(0.75f), 4);
                        if (z) {
                            float f4 = f2;
                            boolean d = av8Var2.d(f4);
                            v7b v7bVar = E2;
                            boolean g = d | av8Var2.g(v7bVar);
                            Object O = av8Var2.O();
                            if (g || O == nf3.a) {
                                O = new z6d(f4, v7bVar);
                                av8Var2.n0(O);
                            }
                            p = p.z(td4.Y(utc.a, (Function1) O));
                        }
                        av8Var2.s(false);
                        k1c c2 = e12.c(uxf.g, false);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m = av8Var2.m();
                        xtc C = fqj.C(av8Var2, p);
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
                        tc3Var.invoke(n12.a, av8Var2, 6);
                        av8Var2.s(true);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 3126, 4);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: r2k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t2k.b(gv9.this, gv9Var2, f, z, f2, tc3Var, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(gv9 gv9Var, long j, gv9 gv9Var2, float f, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        gv9Var.getClass();
        gv9Var2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1130754074);
        int i2 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.f(j) ? 32 : 16) | (av8Var.g(gv9Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.d(f) ? a.o : 1024) | 24576;
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            boolean e = av8Var.e(gv9Var.size());
            Object O = av8Var.O();
            if (e || O == nf3.a) {
                O = l6g.W(CollectionsKt.L0(a, gv9Var.size()));
                av8Var.n0(O);
            }
            gv9 gv9Var3 = (gv9) O;
            g28 g28Var = bkh.c;
            k1c c = e12.c(uxf.g, false);
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
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            a(gv9Var, gv9Var3, gv9Var2, 0, f, j, av8Var, (i2 & 910) | ((i2 << 3) & 57344) | ((i2 << 12) & 458752), 8);
            av8Var.s(true);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new pni(gv9Var, j, gv9Var2, f, xtcVar2, i);
        }
    }
}
