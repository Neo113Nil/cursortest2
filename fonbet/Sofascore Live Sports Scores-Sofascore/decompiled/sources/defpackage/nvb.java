package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nvb extends nn8 {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public nvb(mij mijVar, Object obj, Object obj2) {
        super(mijVar);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.nn8, defpackage.mij
    public final int b(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.nn8, defpackage.mij
    public final iij f(int i, iij iijVar, boolean z) {
        this.b.f(i, iijVar, z);
        if (Objects.equals(iijVar.b, this.d) && z) {
            iijVar.b = e;
        }
        return iijVar;
    }

    @Override // defpackage.nn8, defpackage.mij
    public final Object l(int i) {
        Object l = this.b.l(i);
        return Objects.equals(l, this.d) ? e : l;
    }

    @Override // defpackage.nn8, defpackage.mij
    public final kij m(int i, kij kijVar, long j) {
        this.b.m(i, kijVar, j);
        if (Objects.equals(kijVar.a, this.c)) {
            kijVar.a = kij.p;
        }
        return kijVar;
    }
}
