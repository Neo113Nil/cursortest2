package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import xsna.f740;

/* compiled from: AbstractMultimap.java */
/* loaded from: classes13.dex */
public abstract class d<K, V> implements f740<K, V> {
    public transient Set<K> b;
    public transient Collection<V> c;
    public transient Map<K, Collection<V>> d;

    /* compiled from: AbstractMultimap.java */
    public class a extends AbstractCollection<V> {
        public final /* synthetic */ c b;

        public a(c cVar) {
            this.b = cVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.b.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<Collection<V>> it = this.b.i().values().iterator();
            while (it.hasNext()) {
                if (it.next().contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.b.f;
        }
    }

    public abstract Map<K, Collection<V>> d();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f740) {
            return i().equals(((f740) obj).i());
        }
        return false;
    }

    public abstract Set<K> g();

    public final int hashCode() {
        return i().hashCode();
    }

    @Override // xsna.f740
    public Map<K, Collection<V>> i() {
        Map<K, Collection<V>> map = this.d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> d = d();
        this.d = d;
        return d;
    }

    public final String toString() {
        return i().toString();
    }
}
