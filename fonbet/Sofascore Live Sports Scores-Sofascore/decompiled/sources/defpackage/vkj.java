package defpackage;

import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.V2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vkj {
    public static final t3e a = new t3e(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final xkj xkjVar, xtc xtcVar, float f, uah uahVar, long j, long j2, final tc3 tc3Var, of3 of3Var, final int i) {
        int i2;
        av8 av8Var;
        final xtc xtcVar2;
        final float f2;
        final uah uahVar2;
        final long j3;
        final long j4;
        long d;
        int i3;
        long d2;
        xtc xtcVar3;
        uah uahVar3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var2.g(xkjVar) : av8Var2.i(xkjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | V2.b.f;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= av8Var2.i(tc3Var) ? 536870912 : 268435456;
        }
        if (av8Var2.T(i5 & 1, (306783379 & i5) != 306783378)) {
            av8Var2.Y();
            if ((i & 1) == 0 || av8Var2.B()) {
                f2 = rkj.a;
                uah b = ech.b(aie.b, av8Var2);
                d = i23.d(aie.c, av8Var2);
                i3 = i5 & (-4186113);
                d2 = i23.d(aie.a, av8Var2);
                xtcVar3 = utc.a;
                uahVar3 = b;
            } else {
                av8Var2.W();
                i3 = i5 & (-4186113);
                xtcVar3 = xtcVar;
                f2 = f;
                uahVar3 = uahVar;
                d = j;
                d2 = j2;
            }
            av8Var2.t();
            av8Var2.d0(-1719831991);
            av8Var2.s(false);
            int i6 = i3 >> 9;
            av8Var = av8Var2;
            uni.a(xtcVar3, uahVar3, d2, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(-1573998995, av8Var2, new ukj(f2, d, tc3Var)), av8Var, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            j3 = d;
            xtcVar2 = xtcVar3;
            uahVar2 = uahVar3;
            j4 = d2;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
            f2 = f;
            uahVar2 = uahVar;
            j3 = j;
            j4 = j2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: tkj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vkj.a(xkj.this, xtcVar2, f2, uahVar2, j3, j4, tc3Var, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(f2f f2fVar, tc3 tc3Var, ykj ykjVar, xtc xtcVar, boolean z, tc3 tc3Var2, of3 of3Var, int i) {
        int i2;
        f2f f2fVar2;
        ykj ykjVar2;
        tc3 tc3Var3;
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-293753984);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(f2fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? av8Var.g(ykjVar) : av8Var.i(ykjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= av8Var.i(tc3Var2) ? 67108864 : 33554432;
        }
        if (av8Var.T(i3 & 1, (38347923 & i3) != 38347922)) {
            axj H = yso.H(ykjVar.b, "tooltip transition", av8Var, 48);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(null);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                new tra(25, e1dVar);
                O2 = new xkj();
                av8Var.n0(O2);
            }
            f2fVar2 = f2fVar;
            ykjVar2 = ykjVar;
            rz8.a(f2fVar2, yqo.H(-527401546, av8Var, new lfc(H, tc3Var, (xkj) O2)), ykjVar2, yqo.H(-23901870, av8Var, new kp1(15, e1dVar, tc3Var2)), av8Var, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3));
            xtcVar = utc.a;
            tc3Var3 = tc3Var2;
            z2 = true;
        } else {
            f2fVar2 = f2fVar;
            ykjVar2 = ykjVar;
            av8Var.W();
            tc3Var3 = tc3Var2;
            z2 = z;
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(f2fVar2, tc3Var, ykjVar2, xtcVar2, z2, tc3Var3, i);
        }
    }

    public static final ykj c(of3 of3Var) {
        q1d q1dVar = gp1.a;
        boolean h = ((av8) of3Var).h(false) | ((av8) of3Var).g(q1dVar);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (h || O == nf3.a) {
            O = new ykj(q1dVar);
            av8Var.n0(O);
        }
        return (ykj) O;
    }
}
