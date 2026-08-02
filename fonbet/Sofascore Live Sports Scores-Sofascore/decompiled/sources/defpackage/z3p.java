package defpackage;

import com.ironsource.C4427z5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class z3p implements Map, Serializable {
    public transient c4p a;
    public transient c4p b;
    public transient j3p c;

    public static i5p a(Object obj, Serializable serializable) {
        kda.X(obj, serializable);
        return i5p.m(1, new Object[]{obj, serializable}, null);
    }

    public static z3p c(Map map) {
        int size;
        Object[] objArr;
        int length;
        int size2;
        if ((map instanceof z3p) && !(map instanceof SortedMap)) {
            z3p z3pVar = (z3p) map;
            if (!z3pVar.l()) {
                return z3pVar;
            }
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z = entrySet instanceof Collection;
        y3p y3pVar = new y3p(z ? entrySet.size() : 4);
        if (z && (size2 = (size = entrySet.size()) + size) > (length = (objArr = y3pVar.a).length)) {
            y3pVar.a = Arrays.copyOf(objArr, i3p.a(length, size2));
        }
        for (Map.Entry entry : entrySet) {
            y3pVar.a(entry.getKey(), entry.getValue());
        }
        return y3pVar.b();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map, java.util.SortedMap
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final c4p entrySet() {
        c4p c4pVar = this.a;
        if (c4pVar != null) {
            return c4pVar;
        }
        c4p g = g();
        this.a = g;
        return g;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract c4p g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, java.util.SortedMap
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public c4p keySet() {
        c4p c4pVar = this.b;
        if (c4pVar != null) {
            return c4pVar;
        }
        c4p i = i();
        this.b = i;
        return i;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return qea.M(entrySet());
    }

    public abstract c4p i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, java.util.SortedMap
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public j3p values() {
        j3p j3pVar = this.c;
        if (j3pVar != null) {
            return j3pVar;
        }
        j3p k = k();
        this.c = k;
        return k;
    }

    public abstract j3p k();

    public abstract boolean l();

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        kda.Z(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(C4427z5.U);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
