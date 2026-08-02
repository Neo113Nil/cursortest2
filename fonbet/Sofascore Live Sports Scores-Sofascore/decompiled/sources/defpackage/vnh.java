package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vnh extends rdi implements coh, cdi, e1d {
    public unh b;

    public vnh(double d) {
        nnh h = snh.h();
        unh unhVar = new unh(h.g(), d);
        if (!(h instanceof d09)) {
            unhVar.b = new unh(1L, d);
        }
        this.b = unhVar;
    }

    @Override // defpackage.coh
    public final foh b() {
        return wib.i;
    }

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        this.b = (unh) sdiVar;
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.b;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return Double.valueOf(h());
    }

    public final double h() {
        return ((unh) snh.s(this.b, this)).c;
    }

    public final void i(double d) {
        nnh h;
        unh unhVar = (unh) snh.f(this.b);
        if (unhVar.c == d) {
            return;
        }
        unh unhVar2 = this.b;
        synchronized (snh.c) {
            h = snh.h();
            ((unh) snh.n(unhVar2, this, h, unhVar)).c = d;
            Unit unit = Unit.a;
        }
        snh.l(h, this);
    }

    @Override // defpackage.qdi
    public final sdi n(sdi sdiVar, sdi sdiVar2, sdi sdiVar3) {
        if (((unh) sdiVar2).c == ((unh) sdiVar3).c) {
            return sdiVar2;
        }
        return null;
    }

    @Override // defpackage.e1d
    public final void setValue(Object obj) {
        i(((Number) obj).doubleValue());
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((unh) snh.f(this.b)).c + ")@" + hashCode();
    }
}
