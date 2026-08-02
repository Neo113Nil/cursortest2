package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import xsna.fxc0;

/* compiled from: AbstractListMultimap.java */
/* loaded from: classes13.dex */
public abstract class a<K, V> extends c<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public a(Map<K, Collection<V>> map) {
        fxc0.p(map.isEmpty());
        this.e = map;
    }

    public final boolean m(K k, V v) {
        Collection<V> collection = this.e.get(k);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.f++;
            return true;
        }
        Collection<V> j = j();
        if (!j.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f++;
        this.e.put(k, j);
        return true;
    }
}
