package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uee extends b5 implements tee {
    public static final uee g;
    public final Object d;
    public final Object e;
    public final bee f;

    static {
        k03 k03Var = k03.d;
        bee beeVar = bee.f;
        beeVar.getClass();
        g = new uee(k03Var, k03Var, beeVar);
    }

    public uee(Object obj, Object obj2, bee beeVar) {
        this.d = obj;
        this.e = obj2;
        this.f = beeVar;
    }

    @Override // defpackage.b5
    public final Set a() {
        return new yee(this, 0);
    }

    @Override // defpackage.tee
    public final tee b(Integer num, Object obj) {
        return put(num, obj);
    }

    @Override // defpackage.b5
    public final Set c() {
        return new yee(this, 1);
    }

    @Override // defpackage.b5, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // defpackage.b5
    public final int d() {
        return this.f.d();
    }

    @Override // defpackage.b5
    public final Collection e() {
        return new a5(this, 4);
    }

    @Override // defpackage.b5, java.util.Map
    public final boolean equals(Object obj) {
        bee beeVar = this.f;
        u0k u0kVar = beeVar.d;
        if (obj == this) {
            return true;
        }
        byte b = 0;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (beeVar.d() == map.size()) {
                return map instanceof uee ? u0kVar.g(((uee) obj).f.d, new eee(b, 4)) : map instanceof vee ? u0kVar.g(((vee) obj).d.c, new eee(b, 5)) : map instanceof bee ? u0kVar.g(((bee) obj).d, new eee(b, 6)) : map instanceof fee ? u0kVar.g(((fee) obj).c, new eee(b, 7)) : super.equals(obj);
            }
        }
        return false;
    }

    @Override // defpackage.b5, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final uee put(Object obj, Object obj2) {
        boolean isEmpty = isEmpty();
        bee beeVar = this.f;
        if (isEmpty) {
            return new uee(obj, obj, beeVar.put(obj, new obb(obj2)));
        }
        obb obbVar = (obb) beeVar.get(obj);
        Object obj3 = this.e;
        Object obj4 = this.d;
        if (obbVar != null) {
            return obbVar.a == obj2 ? this : new uee(obj4, obj3, beeVar.put(obj, new obb(obj2, obbVar.b, obbVar.c)));
        }
        Object obj5 = beeVar.get(obj3);
        obj5.getClass();
        obb obbVar2 = (obb) obj5;
        return new uee(obj4, obj, beeVar.put(obj3, new obb(obbVar2.a, obbVar2.b, obj)).put(obj, new obb(obj2, obj3)));
    }

    @Override // defpackage.b5, java.util.Map
    public final Object get(Object obj) {
        obb obbVar = (obb) this.f.get(obj);
        if (obbVar != null) {
            return obbVar.a;
        }
        return null;
    }

    public final tee h(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return this;
        }
        vee veeVar = new vee(this);
        veeVar.putAll(map);
        return veeVar.build();
    }
}
