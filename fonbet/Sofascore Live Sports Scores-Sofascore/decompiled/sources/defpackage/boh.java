package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class boh extends rdi implements coh, cdi, e1d {
    public aoh b;

    public boh(long j) {
        nnh h = snh.h();
        aoh aohVar = new aoh(h.g(), j);
        if (!(h instanceof d09)) {
            aohVar.b = new aoh(1L, j);
        }
        this.b = aohVar;
    }

    @Override // defpackage.coh
    public final foh b() {
        return wib.i;
    }

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        this.b = (aoh) sdiVar;
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.b;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((aoh) snh.s(this.b, this)).c;
    }

    public final void i(long j) {
        nnh h;
        aoh aohVar = (aoh) snh.f(this.b);
        if (aohVar.c != j) {
            aoh aohVar2 = this.b;
            synchronized (snh.c) {
                h = snh.h();
                ((aoh) snh.n(aohVar2, this, h, aohVar)).c = j;
                Unit unit = Unit.a;
            }
            snh.l(h, this);
        }
    }

    @Override // defpackage.qdi
    public final sdi n(sdi sdiVar, sdi sdiVar2, sdi sdiVar3) {
        if (((aoh) sdiVar2).c == ((aoh) sdiVar3).c) {
            return sdiVar2;
        }
        return null;
    }

    @Override // defpackage.e1d
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((aoh) snh.f(this.b)).c + ")@" + hashCode();
    }
}
