package defpackage;

import android.view.KeyEvent;
import android.view.autofill.AutofillValue;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class caj extends bw4 implements ga5, oje, p3h, a09, pze, wia, ug3, ztc, tkd, ula, be8 {
    public final se8 A;
    public final ooi B;
    public b85 C;
    public final g85 D;
    public s8l E;
    public g9i F;
    public final ejg G;
    public final aaj H;
    public final x9j I;
    public g9i J;
    public final w9j K;
    public final e1d L;
    public jwj q;
    public cej r;
    public lcj s;
    public q4a t;
    public boolean u;
    public kja v;
    public fja w;
    public boolean x;
    public wzc y;
    public b1d z;

    public caj(jwj jwjVar, cej cejVar, lcj lcjVar, q4a q4aVar, boolean z, kja kjaVar, fja fjaVar, boolean z2, wzc wzcVar, b1d b1dVar) {
        this.q = jwjVar;
        this.r = cejVar;
        this.s = lcjVar;
        this.t = q4aVar;
        this.u = z;
        this.v = kjaVar;
        this.w = fjaVar;
        this.x = z2;
        this.y = wzcVar;
        this.z = b1dVar;
        int i = 3;
        lcjVar.l = new w9j(this, i);
        this.A = new se8(wzcVar, new x9j(this, 0), 2);
        m00 m00Var = new m00(this, 7);
        fze fzeVar = koi.a;
        ooi ooiVar = new ooi(null, null, m00Var);
        k1(ooiVar);
        this.B = ooiVar;
        int i2 = 5;
        w9j w9jVar = new w9j(this, i2);
        q8i q8iVar = new q8i(this, 26);
        int i3 = 4;
        g85 g85Var = new g85(new i20(9, new g2i(w9jVar, 28), new gaj(new x9j(this, 1), q8iVar, new x9j(this, 2), new x9j(this, i), new x9j(this, i3), new x9j(this, i2))), 1);
        k1(g85Var);
        this.D = g85Var;
        this.G = new ejg(2);
        this.H = new aaj(this);
        this.I = new x9j(this, 6);
        this.K = new w9j(this, i3);
        this.L = e.f(Boolean.FALSE);
    }

    @Override // defpackage.pze
    public final void B(fze fzeVar, gze gzeVar, long j) {
        this.B.B(fzeVar, gzeVar, j);
    }

    @Override // defpackage.be8
    public final void I(zd8 zd8Var) {
        dma b;
        lcj lcjVar = this.s;
        cej cejVar = lcjVar.b;
        aej c = cejVar.c();
        oqf oqfVar = oqf.e;
        if (c != null) {
            if (lcjVar.d) {
                m9j d = lcjVar.a.d();
                if (pej.d(d.d)) {
                    oqfVar = lcjVar.a(c, d);
                } else {
                    long j = d.d;
                    if (!pej.d(j)) {
                        int i = (int) (j >> 32);
                        eyc eycVar = c.b;
                        int d2 = eycVar.d(i);
                        int i2 = (int) (4294967295L & j);
                        int d3 = eycVar.d(i2);
                        if (d2 == d3) {
                            float e = c.e(i, true);
                            float e2 = c.e(i2, true);
                            oqfVar = new oqf(Math.min(e, e2), eycVar.f(d2), Math.max(e, e2), eycVar.b(d3));
                        } else {
                            oqfVar = c.j(pej.g(j), pej.f(j)).e();
                        }
                    }
                }
                dma e3 = cejVar.e();
                if (e3 != null) {
                    if (!e3.f()) {
                        e3 = null;
                    }
                    if (e3 != null && (b = cejVar.b()) != null) {
                        dma dmaVar = b.f() ? b : null;
                        if (dmaVar != null) {
                            oqfVar = oqfVar.k(dmaVar.p(e3, false).f());
                        }
                    }
                }
            } else {
                oqfVar = wib.d;
            }
        }
        zd8Var.c(oqfVar);
    }

    @Override // defpackage.a09
    public final void K(dma dmaVar) {
        ((eoh) this.r.e).setValue(dmaVar);
        if (this.u) {
            this.A.K(dmaVar);
        }
    }

    @Override // defpackage.p3h
    public final boolean U0() {
        return true;
    }

    @Override // defpackage.tkd
    public final void Z() {
        z1a.R(this, new w9j(this, 1));
    }

    @Override // defpackage.ula, defpackage.o1c
    public final void c(long j) {
        this.D.r = j;
    }

    @Override // defpackage.wtc
    public final void c1() {
        z1a.R(this, new w9j(this, 1));
        this.s.m = this.K;
        if (this.u) {
            k1(this.A);
        }
    }

    @Override // defpackage.wtc
    public final void d1() {
        o1();
        this.s.m = null;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        m9j c = this.q.a.c();
        long j = c.d;
        q80 q80Var = new q80(this.q.a.c().c.toString());
        KProperty[] kPropertyArr = y3h.a;
        a4h a4hVar = w3h.F;
        KProperty[] kPropertyArr2 = y3h.a;
        KProperty kProperty = kPropertyArr2[18];
        b4hVar.a(a4hVar, q80Var);
        q80 q80Var2 = new q80(c.c.toString());
        a4h a4hVar2 = w3h.G;
        KProperty kProperty2 = kPropertyArr2[19];
        b4hVar.a(a4hVar2, q80Var2);
        a4h a4hVar3 = w3h.H;
        KProperty kProperty3 = kPropertyArr2[20];
        b4hVar.a(a4hVar3, new pej(j));
        pej pejVar = this.q.a.c().e;
        a4h a4hVar4 = w3h.I;
        KProperty kProperty4 = kPropertyArr2[21];
        b4hVar.a(a4hVar4, pejVar);
        o4a o4aVar = new o4a(((Boolean) ((eoh) this.q.a.e).getValue()).booleanValue());
        a4h a4hVar5 = w3h.M;
        KProperty kProperty5 = kPropertyArr2[27];
        b4hVar.a(a4hVar5, o4aVar);
        if (!this.u) {
            b4hVar.a(w3h.j, Unit.a);
        }
        final boolean z = this.u;
        a4h a4hVar6 = w3h.Q;
        KProperty kProperty6 = kPropertyArr2[28];
        b4hVar.a(a4hVar6, Boolean.valueOf(z));
        uz uzVar = uxf.r;
        a4h a4hVar7 = w3h.s;
        int i = 9;
        KProperty kProperty7 = kPropertyArr2[9];
        b4hVar.a(a4hVar7, uzVar);
        r00 r00Var = new r00(AutofillValue.forText(c));
        a4h a4hVar8 = w3h.t;
        int i2 = 10;
        KProperty kProperty8 = kPropertyArr2[10];
        b4hVar.a(a4hVar8, r00Var);
        final int i3 = 0;
        y3h.b(b4hVar, new Function1() { // from class: v9j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i3;
                boolean z2 = true;
                caj cajVar = this;
                boolean z3 = z;
                switch (i4) {
                    case 0:
                        r00 r00Var2 = (r00) obj;
                        if (z3) {
                            AutofillValue autofillValue = r00Var2.a;
                            rq3 rq3Var = null;
                            CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                            if (textValue != null) {
                                cajVar.q.g(textValue);
                            }
                            ((eoh) cajVar.L).setValue(Boolean.TRUE);
                            xw3.L(cajVar.Y0(), null, null, new z9j(cajVar, rq3Var, 3), 3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        q80 q80Var3 = (q80) obj;
                        if (z3) {
                            cajVar.q.g(q80Var3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        q80 q80Var4 = (q80) obj;
                        if (z3) {
                            jwj.h(cajVar.q, q80Var4, false, 12);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        });
        int i4 = this.v.c;
        int i5 = 8;
        int i6 = 7;
        int i7 = 6;
        if (i4 == 6) {
            vp3.a.getClass();
            y3h.f(b4hVar, rp3.c);
        } else if (i4 == 7) {
            vp3.a.getClass();
            y3h.f(b4hVar, rp3.b);
        } else if (i4 == 8) {
            vp3.a.getClass();
            y3h.f(b4hVar, rp3.b);
        } else if (i4 == 4) {
            vp3.a.getClass();
            y3h.f(b4hVar, rp3.d);
        }
        y3h.a(b4hVar, new x9j(this, i6));
        final int i8 = 1;
        if (z) {
            b4hVar.a(k3h.k, new m9(null, new Function1() { // from class: v9j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i42 = i8;
                    boolean z2 = true;
                    caj cajVar = this;
                    boolean z3 = z;
                    switch (i42) {
                        case 0:
                            r00 r00Var2 = (r00) obj;
                            if (z3) {
                                AutofillValue autofillValue = r00Var2.a;
                                rq3 rq3Var = null;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                if (textValue != null) {
                                    cajVar.q.g(textValue);
                                }
                                ((eoh) cajVar.L).setValue(Boolean.TRUE);
                                xw3.L(cajVar.Y0(), null, null, new z9j(cajVar, rq3Var, 3), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            q80 q80Var3 = (q80) obj;
                            if (z3) {
                                cajVar.q.g(q80Var3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            q80 q80Var4 = (q80) obj;
                            if (z3) {
                                jwj.h(cajVar.q, q80Var4, false, 12);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
            final int i9 = 2;
            b4hVar.a(k3h.o, new m9(null, new Function1() { // from class: v9j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i42 = i9;
                    boolean z2 = true;
                    caj cajVar = this;
                    boolean z3 = z;
                    switch (i42) {
                        case 0:
                            r00 r00Var2 = (r00) obj;
                            if (z3) {
                                AutofillValue autofillValue = r00Var2.a;
                                rq3 rq3Var = null;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                if (textValue != null) {
                                    cajVar.q.g(textValue);
                                }
                                ((eoh) cajVar.L).setValue(Boolean.TRUE);
                                xw3.L(cajVar.Y0(), null, null, new z9j(cajVar, rq3Var, 3), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            q80 q80Var3 = (q80) obj;
                            if (z3) {
                                cajVar.q.g(q80Var3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            q80 q80Var4 = (q80) obj;
                            if (z3) {
                                jwj.h(cajVar.q, q80Var4, false, 12);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
        }
        b4hVar.a(k3h.j, new m9(null, new uri(this, i)));
        int c2 = this.v.c();
        y3h.c(b4hVar, c2, new y9j(this, c2, 1));
        b4hVar.a(k3h.b, new m9(null, new w9j(this, i5)));
        b4hVar.a(k3h.c, new m9(null, new w9j(this, i)));
        if (!pej.d(j)) {
            b4hVar.a(k3h.q, new m9(null, new w9j(this, i2)));
            if (this.u) {
                b4hVar.a(k3h.r, new m9(null, new w9j(this, i3)));
            }
        }
        if (z) {
            b4hVar.a(k3h.s, new m9(null, new w9j(this, i7)));
        }
        q4a q4aVar = this.t;
        if (q4aVar != null) {
            q4aVar.i(b4hVar);
        }
        if (this.u) {
            this.A.i(b4hVar);
        }
    }

    @Override // defpackage.wia
    public final boolean n0(KeyEvent keyEvent) {
        jwj jwjVar = this.q;
        lcj lcjVar = this.s;
        s1();
        this.G.getClass();
        if (pej.d(jwjVar.d().d) || keyEvent.getKeyCode() != 4 || u0a.z(keyEvent) != 1) {
            return false;
        }
        jwj jwjVar2 = lcjVar.a;
        if (!pej.d(jwjVar2.d().d)) {
            scj scjVar = jwjVar2.a;
            q4a q4aVar = jwjVar2.b;
            haj hajVar = haj.a;
            scjVar.b.a().q();
            l9j l9jVar = scjVar.b;
            int i = (int) (l9jVar.e & 4294967295L);
            cga.P(l9jVar, i, i);
            scjVar.b(q4aVar, true, hajVar);
            scjVar.e(true);
        }
        lcjVar.w(false);
        lcjVar.x(gfj.a);
        return true;
    }

    public final boolean n1(int i) {
        if (i == 6) {
            ((yd8) ((wd8) tgj.x(this, dh3.i))).h(1, true);
            return true;
        }
        if (i == 5) {
            ((yd8) ((wd8) tgj.x(this, dh3.i))).h(2, true);
            return true;
        }
        if (i != 7) {
            return false;
        }
        ((lw4) s1()).a();
        return true;
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        ymaVar.a();
        if (((Boolean) ((eoh) this.L).getValue()).booleanValue()) {
            n52 n52Var = (n52) tgj.x(this, mv0.a);
            long j = ((r13) tgj.x(this, mv0.b)).a;
            long b = hkg.b(1308617531);
            int i = r13.j;
            if (!e8k.a(j, b)) {
                n52Var = new pvh(j);
            }
            ha5.g0(ymaVar, n52Var, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
    }

    public final void o1() {
        g9i g9iVar = this.J;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.J = null;
        b1d b1dVar = this.z;
        if (b1dVar != null) {
            b1dVar.d();
        }
    }

    public final void p1() {
        b85 b85Var = this.C;
        if (b85Var != null) {
            this.y.c(new c85(b85Var));
            this.C = null;
        }
    }

    @Override // defpackage.ula
    public final void q0(dma dmaVar) {
        this.D.getClass();
    }

    public final boolean q1() {
        s8l s8lVar;
        return this.A.v.p1().g() && (s8lVar = this.E) != null && ((ata) s8lVar).b();
    }

    public final boolean r1(int i) {
        fja fjaVar;
        if (i == 0 || i == 1 || (fjaVar = this.w) == null) {
            return n1(i);
        }
        fjaVar.a(new y9j(this, i, 0));
        return true;
    }

    public final mvh s1() {
        mvh mvhVar = (mvh) tgj.x(this, dh3.q);
        if (mvhVar != null) {
            return mvhVar;
        }
        a70.r("No software keyboard controller");
        return null;
    }

    public final void t1(boolean z) {
        if (!z) {
            Boolean bool = this.v.e;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        upf.a(this);
        this.J = xw3.L(Y0(), null, null, new z9j(this, null, 5), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0195  */
    @Override // defpackage.wia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w0(KeyEvent keyEvent) {
        boolean z;
        g88 g88Var;
        float f;
        int ordinal;
        ria riaVar;
        boolean r1;
        boolean z2;
        m9j m9jVar;
        l2l l2lVar;
        oqf oqfVar;
        Integer a;
        jwj jwjVar = this.q;
        cej cejVar = this.r;
        lcj lcjVar = this.s;
        mvh s1 = s1();
        boolean z3 = this.u;
        boolean z4 = this.x;
        ejg ejgVar = this.G;
        ejgVar.getClass();
        g88 g88Var2 = (g88) ejgVar.c;
        if (u0a.z(keyEvent) == 2 && keyEvent.isFromSource(257) && (!rha.s(keyEvent) || !sha.F(keyEvent))) {
            lcjVar.v(false);
        }
        long b = d2a.b(keyEvent.getKeyCode());
        if (u0a.z(keyEvent) == 1) {
            c0d c0dVar = (c0d) ejgVar.d;
            if (c0dVar != null && c0dVar.a(b)) {
                c0d c0dVar2 = (c0d) ejgVar.d;
                if (c0dVar2 != null) {
                    c0dVar2.e(b);
                }
                return true;
            }
        } else if (u0a.z(keyEvent) != 0 || sha.F(keyEvent)) {
            if (!sha.F(keyEvent) || (a = ((gl4) ejgVar.b).a(keyEvent)) == null) {
                ria x = rz8.h.x(keyEvent);
                if (x == null || (x.a && !z3)) {
                    z = false;
                } else {
                    aej c = cejVar.c();
                    dma e = cejVar.e();
                    if (e != null) {
                        if (!e.f()) {
                            e = null;
                        }
                        if (e != null) {
                            dma b2 = cejVar.b();
                            if (b2 != null) {
                                if (!b2.f()) {
                                    b2 = null;
                                }
                                if (b2 != null) {
                                    oqfVar = b2.p(e, true);
                                    if (oqfVar != null) {
                                        long e2 = oqfVar.e();
                                        g88Var = g88Var2;
                                        f = Float.intBitsToFloat((int) (e2 & 4294967295L));
                                        g88 g88Var3 = g88Var;
                                        h3h h3hVar = new h3h(jwjVar, c, rha.s(keyEvent), f, g88Var3);
                                        e1d e1dVar = jwjVar.e;
                                        scj scjVar = jwjVar.a;
                                        ordinal = x.ordinal();
                                        String str = h3hVar.j;
                                        switch (ordinal) {
                                            case 0:
                                                riaVar = x;
                                                g88Var3.a = Float.NaN;
                                                if (str.length() > 0) {
                                                    if (pej.d(h3hVar.h)) {
                                                        if (h3hVar.b()) {
                                                            h3hVar.j();
                                                        } else {
                                                            h3hVar.g();
                                                        }
                                                        Unit unit = Unit.a;
                                                    } else {
                                                        boolean b3 = h3hVar.b();
                                                        long j = h3hVar.h;
                                                        if (b3) {
                                                            int g = pej.g(j);
                                                            h3hVar.h = t6a.g(g, g);
                                                        } else {
                                                            int f2 = pej.f(j);
                                                            h3hVar.h = t6a.g(f2, f2);
                                                        }
                                                    }
                                                }
                                                r1 = true;
                                                ria riaVar2 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                z = (riaVar != riaVar2 || riaVar == ria.DOWN || riaVar == ria.LEFT_CHAR || riaVar == ria.RIGHT_CHAR) ? !pej.c(m9jVar.d, h3hVar.h) : r1;
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                    jwjVar.j(h3hVar.h);
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                    if (!pej.d(scjVar.c().d)) {
                                                        ((eoh) e1dVar).setValue(new j3h(h3hVar.g.a, l2lVar));
                                                        break;
                                                    } else {
                                                        ((eoh) e1dVar).setValue(new j3h(l2lVar, l2lVar));
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 1:
                                                riaVar = x;
                                                g88Var3.a = Float.NaN;
                                                if (str.length() > 0) {
                                                    if (pej.d(h3hVar.h)) {
                                                        if (h3hVar.b()) {
                                                            h3hVar.g();
                                                        } else {
                                                            h3hVar.j();
                                                        }
                                                        Unit unit2 = Unit.a;
                                                    } else {
                                                        boolean b4 = h3hVar.b();
                                                        long j2 = h3hVar.h;
                                                        if (b4) {
                                                            int f3 = pej.f(j2);
                                                            h3hVar.h = t6a.g(f3, f3);
                                                        } else {
                                                            int g2 = pej.g(j2);
                                                            h3hVar.h = t6a.g(g2, g2);
                                                        }
                                                    }
                                                }
                                                r1 = true;
                                                ria riaVar22 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22) {
                                                    break;
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 2:
                                                riaVar = x;
                                                if (h3hVar.b()) {
                                                    h3hVar.i();
                                                } else {
                                                    h3hVar.l();
                                                }
                                                r1 = true;
                                                ria riaVar222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 3:
                                                riaVar = x;
                                                if (h3hVar.b()) {
                                                    h3hVar.l();
                                                } else {
                                                    h3hVar.i();
                                                }
                                                r1 = true;
                                                ria riaVar2222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 4:
                                                riaVar = x;
                                                h3hVar.h();
                                                r1 = true;
                                                ria riaVar22222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 5:
                                                riaVar = x;
                                                h3hVar.k();
                                                r1 = true;
                                                ria riaVar222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 6:
                                                riaVar = x;
                                                h3hVar.p();
                                                r1 = true;
                                                ria riaVar2222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 7:
                                                riaVar = x;
                                                h3hVar.o();
                                                r1 = true;
                                                ria riaVar22222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 8:
                                                riaVar = x;
                                                if (h3hVar.b()) {
                                                    h3hVar.p();
                                                } else {
                                                    h3hVar.o();
                                                }
                                                r1 = true;
                                                ria riaVar222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 9:
                                                riaVar = x;
                                                if (h3hVar.b()) {
                                                    h3hVar.o();
                                                } else {
                                                    h3hVar.p();
                                                }
                                                r1 = true;
                                                ria riaVar2222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 10:
                                                riaVar = x;
                                                h3hVar.q();
                                                r1 = true;
                                                ria riaVar22222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 11:
                                                riaVar = x;
                                                h3hVar.e();
                                                r1 = true;
                                                ria riaVar222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 12:
                                                riaVar = x;
                                                ((lw4) s1).b();
                                                Unit unit3 = Unit.a;
                                                r1 = true;
                                                ria riaVar2222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 13:
                                                riaVar = x;
                                                h3hVar.r();
                                                r1 = true;
                                                ria riaVar22222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 14:
                                                riaVar = x;
                                                h3hVar.f();
                                                r1 = true;
                                                ria riaVar222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 15:
                                                riaVar = x;
                                                h3hVar.n();
                                                r1 = true;
                                                ria riaVar2222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 16:
                                                riaVar = x;
                                                h3hVar.m();
                                                r1 = true;
                                                ria riaVar22222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 17:
                                            case 18:
                                            case 19:
                                                riaVar = x;
                                                this.I.invoke(riaVar);
                                                Unit unit4 = Unit.a;
                                                r1 = true;
                                                ria riaVar222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 20:
                                                g88Var3.a = Float.NaN;
                                                if (str.length() > 0) {
                                                    long j3 = h3hVar.h;
                                                    int i = pej.c;
                                                    int i2 = (int) (j3 & 4294967295L);
                                                    int i3 = -1;
                                                    if (i2 > 0) {
                                                        cl5 C = hda.C();
                                                        if (C != null) {
                                                            int b5 = C.b(str, i2 - 1);
                                                            if (b5 >= 0) {
                                                                i3 = b5;
                                                            } else if (i2 > 0) {
                                                                i3 = Character.offsetByCodePoints(str, i2, -1);
                                                            }
                                                        } else if (i2 > 0) {
                                                            i3 = Character.offsetByCodePoints(str, i2, -1);
                                                        }
                                                    }
                                                    long r = s6a.r(i3, i2, jwjVar);
                                                    int i4 = (int) (r >> 32);
                                                    l2l w = ok3.w(r);
                                                    if (i4 != i2 || !pej.d(h3hVar.h)) {
                                                        h3hVar.h = t6a.g(i4, i4);
                                                    }
                                                    if (w != null) {
                                                        h3hVar.i = w;
                                                    }
                                                }
                                                h3hVar.a();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar2222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 21:
                                                h3hVar.g();
                                                h3hVar.a();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar22222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 22:
                                                h3hVar.l();
                                                h3hVar.a();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 23:
                                                h3hVar.i();
                                                h3hVar.a();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar2222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 24:
                                                h3hVar.p();
                                                h3hVar.a();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar22222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 25:
                                                h3hVar.o();
                                                h3hVar.a();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 26:
                                                g88Var3.a = Float.NaN;
                                                if (str.length() > 0) {
                                                    h3hVar.h = t6a.g(0, str.length());
                                                }
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar2222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 27:
                                                if (h3hVar.b()) {
                                                    h3hVar.j();
                                                } else {
                                                    h3hVar.g();
                                                }
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar22222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 28:
                                                if (h3hVar.b()) {
                                                    h3hVar.g();
                                                } else {
                                                    h3hVar.j();
                                                }
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 29:
                                                h3hVar.q();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar2222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 30:
                                                h3hVar.e();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar22222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 31:
                                                h3hVar.r();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 32:
                                                h3hVar.f();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar2222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 33:
                                                h3hVar.n();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar22222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 34:
                                                h3hVar.m();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 35:
                                                if (h3hVar.b()) {
                                                    h3hVar.l();
                                                } else {
                                                    h3hVar.i();
                                                }
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar2222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 36:
                                                if (h3hVar.b()) {
                                                    h3hVar.i();
                                                } else {
                                                    h3hVar.l();
                                                }
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar22222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 37:
                                                h3hVar.h();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 38:
                                                h3hVar.k();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar2222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 39:
                                                h3hVar.p();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar22222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 40:
                                                h3hVar.o();
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar222222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 41:
                                                if (h3hVar.b()) {
                                                    h3hVar.p();
                                                } else {
                                                    h3hVar.o();
                                                }
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar2222222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 42:
                                                if (h3hVar.b()) {
                                                    h3hVar.o();
                                                } else {
                                                    h3hVar.p();
                                                }
                                                h3hVar.s();
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar22222222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 43:
                                                g88Var3.a = Float.NaN;
                                                if (str.length() > 0) {
                                                    long j4 = h3hVar.h;
                                                    int i5 = pej.c;
                                                    int i6 = (int) (j4 & 4294967295L);
                                                    h3hVar.h = t6a.g(i6, i6);
                                                }
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar222222222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 44:
                                                if (z4) {
                                                    r1 = r1(this.v.c());
                                                } else {
                                                    jwj.h(jwjVar, "\n", !rha.s(keyEvent), 4);
                                                    r1 = true;
                                                }
                                                Unit unit5 = Unit.a;
                                                riaVar = x;
                                                ria riaVar2222222222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 45:
                                                if (z4) {
                                                    z2 = false;
                                                } else {
                                                    jwj.h(jwjVar, "\t", !rha.s(keyEvent), 4);
                                                    z2 = true;
                                                }
                                                Unit unit6 = Unit.a;
                                                r1 = z2;
                                                riaVar = x;
                                                ria riaVar22222222222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 46:
                                                scj scjVar2 = (scj) scjVar.f.b;
                                                y3g y3gVar = scjVar2.a;
                                                z9k z9kVar = (z9k) y3gVar.b;
                                                SnapshotStateList snapshotStateList = z9kVar.b;
                                                SnapshotStateList snapshotStateList2 = z9kVar.b;
                                                if (!snapshotStateList.isEmpty() || ((kfj) ((eoh) ((e1d) y3gVar.c)).getValue()) != null) {
                                                    y3gVar.o();
                                                    if (snapshotStateList2.isEmpty()) {
                                                        u3a.c("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
                                                    }
                                                    Object D = o13.D(snapshotStateList2);
                                                    z9kVar.c.add(D);
                                                    kfj kfjVar = (kfj) D;
                                                    scjVar2.b.a().q();
                                                    l9j l9jVar = scjVar2.b;
                                                    int i7 = kfjVar.a;
                                                    l9jVar.c(i7, kfjVar.c.length() + i7, kfjVar.b);
                                                    long j5 = kfjVar.d;
                                                    cga.P(l9jVar, (int) (j5 >> 32), (int) (j5 & 4294967295L));
                                                    scjVar2.h(scjVar2.c(), l9j.g(scjVar2.b, 0L, null, 15), true);
                                                }
                                                Unit unit7 = Unit.a;
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar222222222222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar222222222222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 47:
                                                scj scjVar3 = (scj) scjVar.f.b;
                                                y3g y3gVar2 = scjVar3.a;
                                                z9k z9kVar2 = (z9k) y3gVar2.b;
                                                SnapshotStateList snapshotStateList3 = z9kVar2.c;
                                                SnapshotStateList snapshotStateList4 = z9kVar2.c;
                                                if (!snapshotStateList3.isEmpty() && ((kfj) ((eoh) ((e1d) y3gVar2.c)).getValue()) == null) {
                                                    if (snapshotStateList4.isEmpty()) {
                                                        u3a.c("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
                                                    }
                                                    Object D2 = o13.D(snapshotStateList4);
                                                    z9kVar2.b.add(D2);
                                                    kfj kfjVar2 = (kfj) D2;
                                                    scjVar3.b.a().q();
                                                    l9j l9jVar2 = scjVar3.b;
                                                    int i8 = kfjVar2.a;
                                                    l9jVar2.c(i8, kfjVar2.b.length() + i8, kfjVar2.c);
                                                    long j6 = kfjVar2.e;
                                                    cga.P(l9jVar2, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                                                    scjVar3.h(scjVar3.c(), l9j.g(scjVar3.b, 0L, null, 15), true);
                                                }
                                                Unit unit8 = Unit.a;
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar2222222222222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar2222222222222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            case 48:
                                                Unit unit9 = Unit.a;
                                                riaVar = x;
                                                r1 = true;
                                                ria riaVar22222222222222222222222222222222222222222222222 = ria.UP;
                                                m9jVar = h3hVar.f;
                                                if (riaVar != riaVar22222222222222222222222222222222222222222222222) {
                                                }
                                                if (!pej.c(h3hVar.h, m9jVar.d)) {
                                                }
                                                l2lVar = h3hVar.i;
                                                if (l2lVar != null) {
                                                }
                                                break;
                                            default:
                                                zzl.b();
                                                return false;
                                        }
                                    }
                                }
                            }
                            oqfVar = null;
                            if (oqfVar != null) {
                            }
                        }
                    }
                    g88Var = g88Var2;
                    f = Float.NaN;
                    g88 g88Var32 = g88Var;
                    h3h h3hVar2 = new h3h(jwjVar, c, rha.s(keyEvent), f, g88Var32);
                    e1d e1dVar2 = jwjVar.e;
                    scj scjVar4 = jwjVar.a;
                    ordinal = x.ordinal();
                    String str2 = h3hVar2.j;
                    switch (ordinal) {
                    }
                }
            } else {
                String sb = new StringBuilder(2).appendCodePoint(a.intValue()).toString();
                if (z3) {
                    jwj.h(jwjVar, sb, !rha.s(keyEvent), 4);
                    g88Var2.a = Float.NaN;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                c0d c0dVar3 = (c0d) ejgVar.d;
                if (c0dVar3 == null) {
                    c0dVar3 = new c0d(3);
                    ejgVar.d = c0dVar3;
                }
                c0dVar3.d(b);
            }
            return z;
        }
        return false;
    }

    @Override // defpackage.pze
    public final void y0() {
        this.B.y0();
    }
}
