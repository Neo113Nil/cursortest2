package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class wh3 implements Map, iia {
    public final ConcurrentHashMap a = new ConcurrentHashMap(32);

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set entrySet = this.a.entrySet();
        entrySet.getClass();
        return entrySet;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return obj.equals(this.a);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set keySet = this.a.keySet();
        keySet.getClass();
        return keySet;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return "ConcurrentMapJvm by " + this.a;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection values = this.a.values();
        values.getClass();
        return values;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return this.a.remove(obj, obj2);
    }
}
