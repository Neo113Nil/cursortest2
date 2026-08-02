package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class znh extends rdi implements coh, cdi, e1d {
    public ynh b;

    public znh(int i) {
        nnh h = snh.h();
        ynh ynhVar = new ynh(h.g(), i);
        if (!(h instanceof d09)) {
            ynhVar.b = new ynh(1L, i);
        }
        this.b = ynhVar;
    }

    @Override // defpackage.coh
    public final foh b() {
        return wib.i;
    }

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        this.b = (ynh) sdiVar;
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.b;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((ynh) snh.s(this.b, this)).c;
    }

    public final void i(int i) {
        nnh h;
        ynh ynhVar = (ynh) snh.f(this.b);
        if (ynhVar.c != i) {
            ynh ynhVar2 = this.b;
            synchronized (snh.c) {
                h = snh.h();
                ((ynh) snh.n(ynhVar2, this, h, ynhVar)).c = i;
                Unit unit = Unit.a;
            }
            snh.l(h, this);
        }
    }

    @Override // defpackage.qdi
    public final sdi n(sdi sdiVar, sdi sdiVar2, sdi sdiVar3) {
        if (((ynh) sdiVar2).c == ((ynh) sdiVar3).c) {
            return sdiVar2;
        }
        return null;
    }

    @Override // defpackage.e1d
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((ynh) snh.f(this.b)).c + ")@" + hashCode();
    }
}
