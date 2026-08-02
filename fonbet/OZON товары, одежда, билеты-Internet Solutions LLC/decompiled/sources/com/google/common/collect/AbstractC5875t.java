package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC5875t<K, V> extends AbstractC5876u implements Map<K, V> {
    @Override // java.util.Map
    public final void clear() {
        i().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        H h11 = new H(entrySet().iterator());
        if (obj == null) {
            while (h11.hasNext()) {
                if (h11.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (h11.hasNext()) {
            if (obj.equals(h11.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return i().entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return i().get(obj);
    }

    protected abstract Map<K, V> i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return i().isEmpty();
    }

    protected final boolean j(Object obj) {
        return I.a(this, obj);
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return i().keySet();
    }

    protected final int l() {
        return b0.c(entrySet());
    }

    @Override // java.util.Map
    public final V put(K k11, V v11) {
        return i().put(k11, v11);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        i().putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return i().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return i().size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return i().values();
    }
}
