package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class eoh extends rdi implements coh {
    public final foh b;
    public doh c;

    public eoh(Object obj, foh fohVar) {
        this.b = fohVar;
        nnh h = snh.h();
        doh dohVar = new doh(obj, h.g());
        if (!(h instanceof d09)) {
            dohVar.b = new doh(obj, 1L);
        }
        this.c = dohVar;
    }

    @Override // defpackage.coh
    public final foh b() {
        return this.b;
    }

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        this.c = (doh) sdiVar;
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.c;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return ((doh) snh.s(this.c, this)).c;
    }

    @Override // defpackage.qdi
    public final sdi n(sdi sdiVar, sdi sdiVar2, sdi sdiVar3) {
        if (this.b.q(((doh) sdiVar2).c, ((doh) sdiVar3).c)) {
            return sdiVar2;
        }
        return null;
    }

    @Override // defpackage.e1d
    public final void setValue(Object obj) {
        nnh h;
        doh dohVar = (doh) snh.f(this.c);
        if (this.b.q(dohVar.c, obj)) {
            return;
        }
        doh dohVar2 = this.c;
        synchronized (snh.c) {
            h = snh.h();
            ((doh) snh.n(dohVar2, this, h, dohVar)).c = obj;
            Unit unit = Unit.a;
        }
        snh.l(h, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((doh) snh.f(this.c)).c + ")@" + hashCode();
    }
}
