package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class bee extends b5 implements tee {
    public static final bee f = new bee(u0k.e, 0);
    public final u0k d;
    public final int e;

    public bee(u0k u0kVar, int i) {
        u0kVar.getClass();
        this.d = u0kVar;
        this.e = i;
    }

    @Override // defpackage.b5
    public final Set a() {
        return new oee(this, 0);
    }

    @Override // defpackage.tee
    public final tee b(Integer num, Object obj) {
        return put(num, obj);
    }

    @Override // defpackage.b5
    public final Set c() {
        return new oee(this, 1);
    }

    @Override // defpackage.b5, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.b5
    public final int d() {
        return this.e;
    }

    @Override // defpackage.b5
    public final Collection e() {
        return new a5(this, 2);
    }

    @Override // defpackage.b5, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.e != map.size()) {
            return false;
        }
        boolean z = map instanceof uee;
        u0k u0kVar = this.d;
        return z ? u0kVar.g(((uee) obj).f.d, new mpa(26)) : map instanceof vee ? u0kVar.g(((vee) obj).d.c, new mpa(27)) : map instanceof bee ? u0kVar.g(((bee) obj).d, new mpa(28)) : map instanceof fee ? u0kVar.g(((fee) obj).c, new mpa(29)) : super.equals(obj);
    }

    @Override // defpackage.b5, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final bee put(Object obj, Object obj2) {
        yz1 u = this.d.u(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return u == null ? this : new bee((u0k) u.c, this.e + u.b);
    }

    @Override // defpackage.b5, java.util.Map
    public final Object get(Object obj) {
        return this.d.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
