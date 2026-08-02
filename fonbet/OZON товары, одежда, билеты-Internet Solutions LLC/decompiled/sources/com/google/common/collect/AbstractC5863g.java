package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5863g<K, V> implements J<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private transient Set<K> f59097a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection<V> f59098b;

    /* renamed from: c, reason: collision with root package name */
    private transient Map<K, Collection<V>> f59099c;

    /* renamed from: com.google.common.collect.g$a */
    class a extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5861e f59100a;

        a(AbstractC5861e abstractC5861e) {
            this.f59100a = abstractC5861e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f59100a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<Collection<V>> it = this.f59100a.b().values().iterator();
            while (it.hasNext()) {
                if (it.next().contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C5860d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f59100a.size();
        }
    }

    AbstractC5863g() {
    }

    abstract Map<K, Collection<V>> a();

    @Override // com.google.common.collect.J
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f59099c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> a11 = a();
        this.f59099c = a11;
        return a11;
    }

    abstract Set<K> d();

    abstract Collection<V> e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            return b().equals(((J) obj).b());
        }
        return false;
    }

    public Set<K> f() {
        Set<K> set = this.f59097a;
        if (set != null) {
            return set;
        }
        Set<K> d11 = d();
        this.f59097a = d11;
        return d11;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString();
    }

    @Override // com.google.common.collect.J
    public Collection<V> values() {
        Collection<V> collection = this.f59098b;
        if (collection != null) {
            return collection;
        }
        Collection<V> e11 = e();
        this.f59098b = e11;
        return e11;
    }
}
