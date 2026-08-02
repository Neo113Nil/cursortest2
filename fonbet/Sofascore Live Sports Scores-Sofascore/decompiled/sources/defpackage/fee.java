package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fee extends w6 implements see {
    public bee a;
    public rik b = new rik(28);
    public u0k c;
    public Object d;
    public int e;
    public int f;

    public fee(bee beeVar) {
        this.a = beeVar;
        this.c = beeVar.d;
        this.f = beeVar.e;
    }

    @Override // defpackage.w6
    public final Set a() {
        return new jee(this, 0);
    }

    @Override // defpackage.w6
    public final Set c() {
        return new ntb(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        u0k u0kVar = u0k.e;
        u0kVar.getClass();
        g(u0kVar);
        h(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.w6
    public final int d() {
        return this.f;
    }

    @Override // defpackage.w6
    public final Collection e() {
        return new otb(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        int i = 1;
        if (obj != this) {
            byte b = 0;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f == map.size()) {
                    if (map instanceof bee) {
                        return this.c.g(((bee) obj).d, new eee(b, b));
                    }
                    if (map instanceof fee) {
                        return this.c.g(((fee) obj).c, new eee(b, i));
                    }
                    if (map instanceof uee) {
                        return this.c.g(((uee) obj).f.d, new eee(b, 2));
                    }
                    if (map instanceof vee) {
                        return this.c.g(((vee) obj).d.c, new eee(b, 3));
                    }
                    if (d() != map.size()) {
                        a70.p("Failed requirement.");
                        return false;
                    }
                    if (!map.isEmpty()) {
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            if (!cga.q(this, (Map.Entry) it.next())) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.see
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final bee build() {
        bee beeVar = this.a;
        if (beeVar != null) {
            return beeVar;
        }
        bee beeVar2 = new bee(this.c, d());
        this.a = beeVar2;
        this.b = new rik(28);
        return beeVar2;
    }

    public final void g(u0k u0kVar) {
        if (u0kVar != this.c) {
            this.c = u0kVar;
            this.a = null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.c.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final void h(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        g(this.c.m(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        bee beeVar = null;
        bee beeVar2 = map instanceof bee ? (bee) map : null;
        if (beeVar2 == null) {
            fee feeVar = map instanceof fee ? (fee) map : null;
            if (feeVar != null) {
                beeVar = feeVar.build();
            }
        } else {
            beeVar = beeVar2;
        }
        if (beeVar == null) {
            super.putAll(map);
            return;
        }
        gx4 gx4Var = new gx4();
        gx4Var.a = 0;
        int d = d();
        u0k u0kVar = this.c;
        u0k u0kVar2 = beeVar.d;
        u0kVar2.getClass();
        g(u0kVar.n(u0kVar2, 0, gx4Var, this));
        int d2 = (beeVar.d() + d) - gx4Var.a;
        if (d != d2) {
            h(d2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int d = d();
        u0k p = this.c.p(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (p == null) {
            p = u0k.e;
            p.getClass();
        }
        g(p);
        return d != d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.d = null;
        u0k o = this.c.o(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (o == null) {
            o = u0k.e;
            o.getClass();
        }
        g(o);
        return this.d;
    }
}
