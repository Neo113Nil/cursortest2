package kg;

import ig.C7073b;
import ig.p;
import java.util.Locale;
import jg.AbstractC7423b;
import jg.l;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private Lf.a f71578a;

    /* renamed from: b, reason: collision with root package name */
    private Locale f71579b;

    /* renamed from: c, reason: collision with root package name */
    private g f71580c;

    /* renamed from: d, reason: collision with root package name */
    private int f71581d;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    e(Lf.a aVar, C7676a c7676a) {
        boolean equals;
        jg.g b11 = c7676a.b();
        if (b11 != null) {
            jg.g gVar = (jg.g) aVar.d(mg.i.a());
            p pVar = (p) aVar.d(mg.i.g());
            if (gVar == null) {
                if (b11 == null) {
                    equals = true;
                    AbstractC7423b abstractC7423b = null;
                    b11 = equals ? null : b11;
                    if (b11 != null) {
                        jg.g gVar2 = b11 != null ? b11 : gVar;
                        if (b11 != null) {
                            if (aVar.L(EnumC8145a.EPOCH_DAY)) {
                                abstractC7423b = gVar2.a(aVar);
                            } else if (b11 != l.f70047c || gVar != null) {
                                for (EnumC8145a enumC8145a : EnumC8145a.values()) {
                                    if (enumC8145a.b() && aVar.L(enumC8145a)) {
                                        throw new C7073b("Invalid override chronology for temporal: " + b11 + " " + aVar);
                                    }
                                }
                            }
                        }
                        aVar = new d(abstractC7423b, aVar, gVar2, pVar);
                    }
                }
                equals = false;
                AbstractC7423b abstractC7423b2 = null;
                if (equals) {
                }
                if (b11 != null) {
                }
            } else {
                if (b11 != null) {
                    equals = gVar.equals(b11);
                    AbstractC7423b abstractC7423b22 = null;
                    if (equals) {
                    }
                    if (b11 != null) {
                    }
                }
                equals = false;
                AbstractC7423b abstractC7423b222 = null;
                if (equals) {
                }
                if (b11 != null) {
                }
            }
        }
        this.f71578a = aVar;
        this.f71579b = c7676a.d();
        this.f71580c = c7676a.c();
    }

    final void a() {
        this.f71581d--;
    }

    final Locale b() {
        return this.f71579b;
    }

    final g c() {
        return this.f71580c;
    }

    final mg.e d() {
        return this.f71578a;
    }

    final Long e(mg.h hVar) {
        try {
            return Long.valueOf(this.f71578a.m(hVar));
        } catch (C7073b e11) {
            if (this.f71581d > 0) {
                return null;
            }
            throw e11;
        }
    }

    final <R> R f(mg.j<R> jVar) {
        Lf.a aVar = this.f71578a;
        R r11 = (R) aVar.d(jVar);
        if (r11 != null || this.f71581d != 0) {
            return r11;
        }
        throw new C7073b("Unable to extract value: " + aVar.getClass());
    }

    final void g() {
        this.f71581d++;
    }

    public final String toString() {
        return this.f71578a.toString();
    }
}
