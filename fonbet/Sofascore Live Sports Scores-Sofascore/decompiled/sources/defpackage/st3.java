package defpackage;

import android.view.autofill.AutofillValue;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class st3 extends bw4 implements p3h {
    public gwj q;
    public wcj r;
    public q5b s;
    public boolean t;
    public boolean u;
    public nnd v;
    public tbj w;
    public qu9 x;
    public ce8 y;

    public static void n1(q5b q5bVar, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        jdj jdjVar = q5bVar.e;
        gt3 gt3Var = q5bVar.v;
        if (jdjVar == null) {
            int length = str.length();
            gt3Var.invoke(new wcj(4, t6a.g(length, length), str));
        } else {
            wcj f = q5bVar.d.f(b.j(new yw4(), new t43(str, 1)));
            jdjVar.a(null, f);
            gt3Var.invoke(f);
        }
    }

    @Override // defpackage.p3h
    public final boolean U0() {
        return true;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        q80 q80Var = this.r.a;
        KProperty[] kPropertyArr = y3h.a;
        a4h a4hVar = w3h.F;
        KProperty[] kPropertyArr2 = y3h.a;
        KProperty kProperty = kPropertyArr2[18];
        b4hVar.a(a4hVar, q80Var);
        q80 q80Var2 = this.q.a;
        a4h a4hVar2 = w3h.G;
        KProperty kProperty2 = kPropertyArr2[19];
        b4hVar.a(a4hVar2, q80Var2);
        long j = this.r.b;
        a4h a4hVar3 = w3h.H;
        KProperty kProperty3 = kPropertyArr2[20];
        b4hVar.a(a4hVar3, new pej(j));
        uz uzVar = uxf.r;
        a4h a4hVar4 = w3h.s;
        KProperty kProperty4 = kPropertyArr2[9];
        b4hVar.a(a4hVar4, uzVar);
        r00 r00Var = new r00(AutofillValue.forText(this.r.a));
        a4h a4hVar5 = w3h.t;
        KProperty kProperty5 = kPropertyArr2[10];
        b4hVar.a(a4hVar5, r00Var);
        boolean z = false;
        z = false;
        y3h.b(b4hVar, new rt3(this, z ? 1 : 0));
        int i = this.x.d;
        if (i == 6) {
            vp3.a.getClass();
            y3h.f(b4hVar, rp3.c);
        } else if (i == 7 || i == 8) {
            vp3.a.getClass();
            y3h.f(b4hVar, rp3.b);
        } else if (i == 4) {
            vp3.a.getClass();
            y3h.f(b4hVar, rp3.d);
        }
        if (!this.u) {
            b4hVar.a(w3h.j, Unit.a);
        }
        int i2 = 1;
        if (this.u && !this.t) {
            z = true;
        }
        a4h a4hVar6 = w3h.Q;
        KProperty kProperty6 = kPropertyArr2[28];
        b4hVar.a(a4hVar6, Boolean.valueOf(z));
        y3h.a(b4hVar, new rt3(this, i2));
        int i3 = 2;
        if (z) {
            b4hVar.a(k3h.k, new m9(null, new rt3(this, i3)));
            b4hVar.a(k3h.o, new m9(null, new rt3(this, b4hVar)));
        }
        b4hVar.a(k3h.j, new m9(null, new kr1(this, 23)));
        y3h.c(b4hVar, this.x.e, new qt3(this, 6));
        b4hVar.a(k3h.b, new m9(null, new qt3(this, 7)));
        b4hVar.a(k3h.c, new m9(null, new qt3(this, 1)));
        if (!pej.d(this.r.b)) {
            b4hVar.a(k3h.q, new m9(null, new qt3(this, 2)));
            if (this.u && !this.t) {
                b4hVar.a(k3h.r, new m9(null, new qt3(this, 3)));
            }
        }
        if (!this.u || this.t) {
            return;
        }
        b4hVar.a(k3h.s, new m9(null, new qt3(this, 5)));
    }
}
