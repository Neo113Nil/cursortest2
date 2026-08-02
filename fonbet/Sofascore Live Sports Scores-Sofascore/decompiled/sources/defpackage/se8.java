package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class se8 extends bw4 implements p3h, a09, ug3, tkd, jyj {
    public static final it7 w = new it7(24);
    public wzc q;
    public final Function1 r;
    public rd8 s;
    public ara t;
    public dma u;
    public final ne8 v;

    public se8(wzc wzcVar, int i, Function1 function1) {
        this.q = wzcVar;
        this.r = function1;
        ne8 ne8Var = new ne8(i, 10, new p1(2, this, se8.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 8));
        k1(ne8Var);
        this.v = ne8Var;
    }

    @Override // defpackage.a09
    public final void K(dma dmaVar) {
        this.u = dmaVar;
        if (this.v.p1().g()) {
            boolean f = dmaVar.f();
            mx9 mx9Var = te8.o;
            if (!f) {
                if (this.n) {
                    jca.C(this, mx9Var);
                }
            } else {
                dma dmaVar2 = this.u;
                if (dmaVar2 != null && dmaVar2.f() && this.n) {
                    jca.C(this, mx9Var);
                }
            }
        }
    }

    @Override // defpackage.tkd
    public final void Z() {
        fsf fsfVar = new fsf();
        z1a.R(this, new n37(29, fsfVar, this));
        ara araVar = (ara) fsfVar.a;
        if (this.v.p1().g()) {
            ara araVar2 = this.t;
            if (araVar2 != null) {
                araVar2.b();
            }
            if (araVar != null) {
                araVar.a();
            } else {
                araVar = null;
            }
            this.t = araVar;
        }
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.wtc
    public final void e1() {
        ara araVar = this.t;
        if (araVar != null) {
            araVar.b();
        }
        this.t = null;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        boolean g = this.v.p1().g();
        KProperty[] kPropertyArr = y3h.a;
        a4h a4hVar = w3h.l;
        KProperty kProperty = y3h.a[4];
        b4hVar.a(a4hVar, Boolean.valueOf(g));
        b4hVar.a(k3h.w, new m9(null, new av6(0, this, se8.class, "requestFocus", "requestFocus()Z", 0, 29)));
    }

    public final void n1(wzc wzcVar, i7a i7aVar) {
        if (!this.n) {
            wzcVar.c(i7aVar);
            return;
        }
        yda ydaVar = (yda) ((ad2) Y0()).b.get(uic.g);
        xw3.L(Y0(), null, null, new zi7(wzcVar, i7aVar, ydaVar != null ? ydaVar.n(new w47(24, wzcVar, i7aVar)) : null, (rq3) null, 10), 3);
    }

    public final void o1(wzc wzcVar) {
        rd8 rd8Var;
        if (Intrinsics.c(this.q, wzcVar)) {
            return;
        }
        wzc wzcVar2 = this.q;
        if (wzcVar2 != null && (rd8Var = this.s) != null) {
            wzcVar2.c(new sd8(rd8Var));
        }
        this.s = null;
        this.q = wzcVar;
    }

    @Override // defpackage.jyj
    public final Object s() {
        return w;
    }

    public se8(wzc wzcVar, x9j x9jVar, int i) {
        this(wzcVar, 1, (i & 4) != 0 ? null : x9jVar);
    }
}
