package f8;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import k2.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h implements Map, Serializable, j$.util.Map {

    /* renamed from: a, reason: collision with root package name */
    public transient n f9508a;

    /* renamed from: b, reason: collision with root package name */
    public transient o f9509b;

    /* renamed from: c, reason: collision with root package name */
    public transient p f9510c;

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j entrySet() {
        n nVar = this.f9508a;
        if (nVar != null) {
            return nVar;
        }
        q qVar = (q) this;
        n nVar2 = new n(qVar, qVar.f9530e, qVar.f9531f);
        this.f9508a = nVar2;
        return nVar2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        p pVar = this.f9510c;
        if (pVar == null) {
            q qVar = (q) this;
            p pVar2 = new p(1, qVar.f9531f, qVar.f9530e);
            this.f9510c = pVar2;
            pVar = pVar2;
        }
        return pVar.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5 = ~(~(i5 + (next != null ? next.hashCode() : 0)));
        }
        return i5;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((q) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        o oVar = this.f9509b;
        if (oVar != null) {
            return oVar;
        }
        q qVar = (q) this;
        o oVar2 = new o(qVar, new p(0, qVar.f9531f, qVar.f9530e));
        this.f9509b = oVar2;
        return oVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i5 = ((q) this).f9531f;
        x.f(i5, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i5 * 8, 1073741824L));
        sb2.append('{');
        t it = ((n) entrySet()).iterator();
        boolean z5 = true;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            if (!z5) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z5 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        p pVar = this.f9510c;
        if (pVar != null) {
            return pVar;
        }
        q qVar = (q) this;
        p pVar2 = new p(1, qVar.f9531f, qVar.f9530e);
        this.f9510c = pVar2;
        return pVar2;
    }

    public Object writeReplace() {
        return new g(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
