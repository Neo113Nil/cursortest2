package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class xnh extends rdi implements coh, cdi, e1d {
    public wnh b;

    public xnh(float f) {
        nnh h = snh.h();
        wnh wnhVar = new wnh(h.g(), f);
        if (!(h instanceof d09)) {
            wnhVar.b = new wnh(1L, f);
        }
        this.b = wnhVar;
    }

    @Override // defpackage.coh
    public final foh b() {
        return wib.i;
    }

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        this.b = (wnh) sdiVar;
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.b;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((wnh) snh.s(this.b, this)).c;
    }

    public final void i(float f) {
        nnh h;
        wnh wnhVar = (wnh) snh.f(this.b);
        if (wnhVar.c == f) {
            return;
        }
        wnh wnhVar2 = this.b;
        synchronized (snh.c) {
            h = snh.h();
            ((wnh) snh.n(wnhVar2, this, h, wnhVar)).c = f;
            Unit unit = Unit.a;
        }
        snh.l(h, this);
    }

    @Override // defpackage.qdi
    public final sdi n(sdi sdiVar, sdi sdiVar2, sdi sdiVar3) {
        if (((wnh) sdiVar2).c == ((wnh) sdiVar3).c) {
            return sdiVar2;
        }
        return null;
    }

    @Override // defpackage.e1d
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((wnh) snh.f(this.b)).c + ")@" + hashCode();
    }
}
