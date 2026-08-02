package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class bn8 extends s18 {
    public final s18 c;

    public bn8(s18 s18Var) {
        s18Var.getClass();
        this.c = s18Var;
    }

    @Override // defpackage.s18
    public final tha C(uae uaeVar) {
        uaeVar.getClass();
        return this.c.C(uaeVar);
    }

    @Override // defpackage.s18
    public ejh H(uae uaeVar, boolean z) {
        uaeVar.getClass();
        return this.c.H(uaeVar, z);
    }

    @Override // defpackage.s18
    public final cwh M(uae uaeVar) {
        uaeVar.getClass();
        return this.c.M(uaeVar);
    }

    @Override // defpackage.s18, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.s18
    public final ejh e(uae uaeVar) {
        uaeVar.getClass();
        return this.c.e(uaeVar);
    }

    @Override // defpackage.s18
    public final void f(uae uaeVar, uae uaeVar2) {
        uaeVar.getClass();
        uaeVar2.getClass();
        this.c.f(uaeVar, uaeVar2);
    }

    @Override // defpackage.s18
    public final void h(uae uaeVar) {
        uaeVar.getClass();
        this.c.h(uaeVar);
    }

    @Override // defpackage.s18
    public final void i(uae uaeVar) {
        uaeVar.getClass();
        this.c.i(uaeVar);
    }

    @Override // defpackage.s18
    public final List m(uae uaeVar) {
        uaeVar.getClass();
        List<uae> m = this.c.m(uaeVar);
        ArrayList arrayList = new ArrayList();
        for (uae uaeVar2 : m) {
            uaeVar2.getClass();
            arrayList.add(uaeVar2);
        }
        n13.t(arrayList);
        return arrayList;
    }

    @Override // defpackage.s18
    public final ux4 p(uae uaeVar) {
        uaeVar.getClass();
        ux4 p = this.c.p(uaeVar);
        if (p == null) {
            return null;
        }
        uae uaeVar2 = (uae) p.d;
        if (uaeVar2 == null) {
            return p;
        }
        boolean z = p.b;
        boolean z2 = p.c;
        Long l = (Long) p.e;
        Long l2 = (Long) p.f;
        Long l3 = (Long) p.g;
        Long l4 = (Long) p.h;
        Map map = (Map) p.i;
        map.getClass();
        return new ux4(z, z2, uaeVar2, l, l2, l3, l4, map);
    }

    @Override // defpackage.s18
    public final tha t(uae uaeVar) {
        return this.c.t(uaeVar);
    }

    public final String toString() {
        return duf.a.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.c + ')';
    }
}
