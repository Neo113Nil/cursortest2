package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vee extends w6 implements see {
    public uee a;
    public Object b;
    public Object c;
    public final fee d;

    public vee(uee ueeVar) {
        this.a = ueeVar;
        this.b = ueeVar.d;
        this.c = ueeVar.e;
        this.d = new fee(ueeVar.f);
    }

    @Override // defpackage.w6
    public final Set a() {
        return new jee(this, 1);
    }

    @Override // defpackage.see
    public final tee build() {
        uee ueeVar = this.a;
        if (ueeVar != null) {
            return ueeVar;
        }
        uee ueeVar2 = new uee(this.b, this.c, this.d.build());
        this.a = ueeVar2;
        return ueeVar2;
    }

    @Override // defpackage.w6
    public final Set c() {
        return new ntb(this, 2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        fee feeVar = this.d;
        if (!feeVar.isEmpty()) {
            this.a = null;
        }
        feeVar.clear();
        k03 k03Var = k03.d;
        this.b = k03Var;
        this.c = k03Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.w6
    public final int d() {
        return this.d.d();
    }

    @Override // defpackage.w6
    public final Collection e() {
        return new otb(this, 3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        byte b = 0;
        if (obj instanceof Map) {
            fee feeVar = this.d;
            Map map = (Map) obj;
            if (feeVar.d() == map.size()) {
                if (map instanceof uee) {
                    return feeVar.c.g(((uee) obj).f.d, new eee(b, 8));
                }
                if (map instanceof vee) {
                    return feeVar.c.g(((vee) obj).d.c, new eee(b, 9));
                }
                if (map instanceof bee) {
                    return feeVar.c.g(((bee) obj).d, new eee(b, 10));
                }
                if (map instanceof fee) {
                    return feeVar.c.g(((fee) obj).c, new eee(b, 11));
                }
                if (d() != map.size()) {
                    a70.p("Failed requirement.");
                    return false;
                }
                if (map.isEmpty()) {
                    return true;
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (!cga.q(this, (Map.Entry) it.next())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        obb obbVar = (obb) this.d.get(obj);
        if (obbVar != null) {
            return obbVar.a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        fee feeVar = this.d;
        obb obbVar = (obb) feeVar.get(obj);
        if (obbVar != null) {
            Object obj3 = obbVar.a;
            if (obj3 == obj2) {
                return obj2;
            }
            this.a = null;
            feeVar.put(obj, new obb(obj2, obbVar.b, obbVar.c));
            return obj3;
        }
        this.a = null;
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            feeVar.put(obj, new obb(obj2));
            return null;
        }
        Object obj4 = this.c;
        Object obj5 = feeVar.get(obj4);
        obj5.getClass();
        obb obbVar2 = (obb) obj5;
        feeVar.put(obj4, new obb(obbVar2.a, obbVar2.b, obj));
        feeVar.put(obj, new obb(obj2, obj4));
        this.c = obj;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        fee feeVar = this.d;
        obb obbVar = (obb) feeVar.remove(obj);
        if (obbVar == null) {
            return null;
        }
        Object obj2 = obbVar.c;
        Object obj3 = obbVar.b;
        this.a = null;
        k03 k03Var = k03.d;
        if (obj3 != k03Var) {
            Object obj4 = feeVar.get(obj3);
            obj4.getClass();
            obb obbVar2 = (obb) obj4;
            feeVar.put(obj3, new obb(obbVar2.a, obbVar2.b, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 != k03Var) {
            Object obj5 = feeVar.get(obj2);
            obj5.getClass();
            obb obbVar3 = (obb) obj5;
            feeVar.put(obj2, new obb(obbVar3.a, obj3, obbVar3.c));
        } else {
            this.c = obj3;
        }
        return obbVar.a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        obb obbVar = (obb) this.d.get(obj);
        if (obbVar == null || !Intrinsics.c(obbVar.a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
