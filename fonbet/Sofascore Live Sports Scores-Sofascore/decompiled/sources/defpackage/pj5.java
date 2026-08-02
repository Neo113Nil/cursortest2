package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pj5 extends g7 {
    public final int l;
    public final vnh m;
    public final znh n;
    public final znh o;
    public final znh p;
    public y74 q;

    public pj5(Context context, int i) {
        super(context);
        this.l = i;
        this.m = e.a();
        this.n = e.c(-1);
        this.o = e.c(0);
        this.p = e.c(Integer.MAX_VALUE);
    }

    public final void G(int i, of3 of3Var, boolean z, boolean z2) {
        long j;
        double d;
        float f;
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(788392595);
        int i2 = (av8Var.h(z) ? 4 : 2) | i | (av8Var.h(z2) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc c = bkh.c(utcVar, 1.0f);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (z) {
                av8Var.d0(328496308);
                av8Var.s(false);
                j = r13.h;
            } else {
                j = ljg.f(av8Var, 328495510, R.color.surface_1, av8Var, false);
            }
            xtc p = bkh.p(utcVar, 2.0f);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                d = 0.0d;
                f = Float.MAX_VALUE;
            } else {
                d = 0.0d;
                f = 1.0f;
            }
            xtc z3 = p.z(new goa(f, true));
            jf9 jf9Var = oyn.e;
            nq8.h(av8Var, n9e.q(z3, j, jf9Var));
            nq8.h(av8Var, bkh.p(bkh.e(utcVar, 8.0f), 2.0f));
            nq8.h(av8Var, n9e.q(bkh.p(bkh.e(utcVar, 8.0f), 2.0f), j, jf9Var));
            if (z2 || z) {
                av8Var.d0(1594008090);
                nq8.h(av8Var, n9e.q(bkh.p(bkh.e(utcVar, 2.0f), 2.0f), lz.D(R.color.surface_1, av8Var), jf9Var));
                av8Var.s(false);
            } else {
                av8Var.d0(1594222393);
                av8Var.s(false);
            }
            if (z2) {
                av8Var.d0(328523572);
                av8Var.s(false);
                j2 = r13.h;
            } else {
                j2 = ljg.f(av8Var, 328522774, R.color.surface_1, av8Var, false);
            }
            nq8.h(av8Var, n9e.q(bkh.p(bkh.e(utcVar, 8.0f), 2.0f), j2, jf9Var));
            nq8.h(av8Var, bkh.p(bkh.e(utcVar, 8.0f), 2.0f));
            xtc p2 = bkh.p(utcVar, 2.0f);
            if (1.0f <= d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            nq8.h(av8Var, n9e.q(p2.z(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), j2, jf9Var));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ej5(this, z, z2, i);
        }
    }

    public final void H(final int i, final boolean z, final double d, final boolean z2, final float f, of3 of3Var, final int i2) {
        int i3;
        xtc e;
        boolean z3;
        int i4;
        xtc e2;
        long j;
        jf9 jf9Var = oyn.e;
        kv1 kv1Var = uxf.o;
        p4h p4hVar = ww9.d;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-196152574);
        int i5 = i2 | (av8Var.e(i) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.c(d) ? a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192) | (av8Var.d(f) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (!av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
            av8Var.W();
        } else if (z) {
            av8Var.d0(1869394509);
            utc utcVar = utc.a;
            x23 x23Var = x23.a;
            if (d >= 24.0d) {
                av8Var.d0(1869396369);
                if (z2) {
                    av8Var.d0(466661843);
                    e2 = x23Var.a(1.0f, utcVar, true);
                    i4 = 0;
                    av8Var.s(false);
                } else {
                    i4 = 0;
                    av8Var.d0(330634546);
                    e2 = bkh.e(utcVar, f);
                    av8Var.s(false);
                }
                xtc p = bkh.p(e2, 2.0f);
                u23 a = t23.a(p4hVar, kv1Var, av8Var, i4);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, p);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                nq8.h(av8Var, n9e.q(bkh.p(bkh.e(utcVar, 8.0f), 2.0f), lz.D(R.color.surface_1, av8Var), jf9Var));
                av8Var.d0(2017425163);
                int i6 = i - 1;
                for (int i7 = 0; i7 < i6; i7++) {
                    xtc p2 = bkh.p(new goa(1.0f, true), 2.0f);
                    if (i7 % 2 == 1) {
                        j = ljg.f(av8Var, 2017433275, R.color.surface_1, av8Var, false);
                    } else {
                        av8Var.d0(2017434073);
                        av8Var.s(false);
                        j = r13.h;
                    }
                    nq8.h(av8Var, n9e.q(p2, j, jf9Var));
                }
                av8Var.s(false);
                nq8.h(av8Var, n9e.q(bkh.p(bkh.e(utcVar, 8.0f), 2.0f), lz.D(R.color.surface_1, av8Var), jf9Var));
                av8Var.s(true);
                av8Var.s(false);
                z3 = false;
            } else {
                av8Var.d0(1870619474);
                double d2 = (16.0d + d) / 3.0d;
                if (z2) {
                    av8Var.d0(-101343716);
                    xtc a2 = x23Var.a(1.0f, utcVar, true);
                    i3 = 0;
                    av8Var.s(false);
                    e = a2;
                } else {
                    i3 = 0;
                    av8Var.d0(671698235);
                    e = bkh.e(utcVar, f);
                    av8Var.s(false);
                }
                xtc p3 = bkh.p(e, 2.0f);
                u23 a3 = t23.a(p4hVar, kv1Var, av8Var, i3);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, p3);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                nq8.h(av8Var, n9e.q(bkh.p(x23Var.a(1.0f, utcVar, true), 2.0f), lz.D(R.color.surface_1, av8Var), jf9Var));
                nq8.h(av8Var, bkh.p(bkh.e(utcVar, (float) d2), 2.0f));
                nq8.h(av8Var, n9e.q(bkh.p(x23Var.a(1.0f, utcVar, true), 2.0f), lz.D(R.color.surface_1, av8Var), jf9Var));
                av8Var.s(true);
                z3 = false;
                av8Var.s(false);
            }
            av8Var.s(z3);
        } else {
            av8Var.d0(1871688416);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i, z, d, z2, f, i2) { // from class: fj5
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ double d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ float f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(7);
                    pj5.this.H(this.b, this.c, this.d, this.e, this.f, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 10);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        hj5 hj5Var = (hj5) obj;
        hj5Var.getClass();
        return this.i.indexOf(hj5Var);
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new vh(this, new ComposeView(this.b, null, 6));
    }
}
