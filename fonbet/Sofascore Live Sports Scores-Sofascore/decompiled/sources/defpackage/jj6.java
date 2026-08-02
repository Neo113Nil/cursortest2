package defpackage;

import androidx.compose.runtime.e;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jj6 {
    public final /* synthetic */ ce8 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e1d c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ mvh g;
    public final /* synthetic */ e1d h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ znh j;
    public final /* synthetic */ znh k;

    public jj6(ce8 ce8Var, boolean z, e1d e1dVar, String str, String str2, String str3, mvh mvhVar, e1d e1dVar2, Function1 function1, znh znhVar, znh znhVar2) {
        this.a = ce8Var;
        this.b = z;
        this.c = e1dVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = mvhVar;
        this.h = e1dVar2;
        this.i = function1;
        this.j = znhVar;
        this.k = znhVar2;
    }

    public final void a(final boolean z, final Function0 function0, xtc xtcVar, qug qugVar, boolean z2, uah uahVar, final long j, float f, final tc3 tc3Var, of3 of3Var, final int i, final int i2) {
        int i3;
        av8 av8Var;
        xtc xtcVar2;
        final qug qugVar2;
        final boolean z3;
        uah uahVar2;
        float f2;
        qug o0;
        uah b;
        float f3;
        xtc xtcVar3;
        boolean z4;
        qug qugVar3;
        xtc xtcVar4;
        boolean z5;
        boolean z6;
        qug qugVar4;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-126848451);
        int i4 = i | (av8Var2.h(z) ? 4 : 2) | 91520 | (av8Var2.f(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 918552576;
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var2.i(tc3Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(this) ? 32 : 16;
        }
        if (av8Var2.T(i4 & 1, ((306783379 & i4) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            av8Var2.Y();
            if ((i & 1) == 0 || av8Var2.B()) {
                o0 = hkg.o0(av8Var2);
                float f4 = wec.a;
                b = ech.b(agc.c, av8Var2);
                f3 = wec.a;
                xtcVar3 = utc.a;
                z4 = true;
            } else {
                av8Var2.W();
                xtcVar3 = xtcVar;
                o0 = qugVar;
                z4 = z2;
                b = uahVar;
                f3 = f;
            }
            av8Var2.t();
            Object O = av8Var2.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = e.e(Unit.a, f7a.k);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            WeakHashMap weakHashMap = cal.w;
            int i5 = qea.p(av8Var2).f.e().b;
            if (z) {
                av8Var2.d0(629991660);
                Object O2 = av8Var2.O();
                if (O2 == obj) {
                    qugVar3 = o0;
                    O2 = new v30(19, e1dVar);
                    av8Var2.n0(O2);
                } else {
                    qugVar3 = o0;
                }
                qx9.k((Function0) O2, av8Var2, 6);
                av8Var2.s(false);
            } else {
                qugVar3 = o0;
                av8Var2.d0(630077189);
                av8Var2.s(false);
            }
            Object O3 = av8Var2.O();
            if (O3 == obj) {
                O3 = new h1d(Boolean.FALSE);
                av8Var2.n0(O3);
            }
            h1d h1dVar = (h1d) O3;
            h1dVar.R(Boolean.valueOf(z));
            if (((Boolean) ((eoh) h1dVar.c).getValue()).booleanValue() || ((Boolean) ((eoh) h1dVar.d).getValue()).booleanValue()) {
                av8Var2.d0(630396489);
                Object O4 = av8Var2.O();
                if (O4 == obj) {
                    xtcVar4 = xtcVar3;
                    z5 = z4;
                    O4 = e.f(new xvj(xvj.b));
                    av8Var2.n0(O4);
                } else {
                    xtcVar4 = xtcVar3;
                    z5 = z4;
                }
                e1d e1dVar2 = (e1d) O4;
                boolean g = av8Var2.g(kx4Var) | av8Var2.e(i5);
                Object O5 = av8Var2.O();
                if (g || O5 == obj) {
                    O5 = new mj6(kx4Var, i5, e1dVar, new q10(1, e1dVar2));
                    av8Var2.n0(O5);
                }
                mj6 mj6Var = (mj6) O5;
                String str = ((fj6) this.h.getValue()).a;
                boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
                ndb G = un0.G(0, 7, av8Var2);
                int i6 = !((Boolean) G.getValue()).booleanValue() ? 393248 : 393216;
                if ((str.equals("PrimaryEditable") || (str.equals("SecondaryEditable") && !((Boolean) G.getValue()).booleanValue())) && !booleanValue) {
                    i6 |= 8;
                }
                g2f g2fVar = new g2f(true, true, true, i6);
                qug qugVar5 = qugVar3;
                xtc xtcVar5 = xtcVar4;
                boolean z7 = z5;
                hj6 hj6Var = new hj6(this, xtcVar5, z7, h1dVar, e1dVar2, qugVar5, b, j, f3, tc3Var);
                z6 = z7;
                qugVar4 = qugVar5;
                f2 = f3;
                uahVar2 = b;
                xtcVar2 = xtcVar5;
                av8Var = av8Var2;
                t20.a(mj6Var, function0, g2fVar, yqo.H(2063119149, av8Var2, hj6Var), av8Var, 3120, 0);
                av8Var.s(false);
            } else {
                av8Var2.d0(631807237);
                av8Var2.s(false);
                qugVar4 = qugVar3;
                z6 = z4;
                f2 = f3;
                av8Var = av8Var2;
                uahVar2 = b;
                xtcVar2 = xtcVar3;
            }
            qugVar2 = qugVar4;
            z3 = z6;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
            qugVar2 = qugVar;
            z3 = z2;
            uahVar2 = uahVar;
            f2 = f;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final xtc xtcVar6 = xtcVar2;
            final uah uahVar3 = uahVar2;
            final float f5 = f2;
            u.d = new Function2(z, function0, xtcVar6, qugVar2, z3, uahVar3, j, f5, tc3Var, i, i2) { // from class: gj6
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ xtc d;
                public final /* synthetic */ qug e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ uah g;
                public final /* synthetic */ long h;
                public final /* synthetic */ float i;
                public final /* synthetic */ tc3 j;
                public final /* synthetic */ int k;

                {
                    this.k = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int K = aba.K(49);
                    int K2 = aba.K(this.k);
                    jj6.this.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (of3) obj2, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    public final xtc b(xtc xtcVar, String str) {
        xtc G = lz.G(xtcVar, this.a);
        e1d e1dVar = this.h;
        xtc z = G.z(new dj6(new h84(17, str, e1dVar)));
        Function1 function1 = this.i;
        boolean z2 = this.b;
        b93 b93Var = new b93(e1dVar, str, function1, z2);
        return z.z(o3h.a(iz8.z(koi.a(utc.a, b93Var, new ot3(1, str, b93Var)), new lj6(str, b93Var, z2, this.c)), false, new ij6(str, z2, this.d, this.e, this.f, b93Var, this.g, 0)));
    }
}
