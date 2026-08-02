package com.google.common.collect;

import com.google.common.collect.Q;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3426f implements O {

    /* renamed from: a, reason: collision with root package name */
    public transient Collection f36810a;

    /* renamed from: b, reason: collision with root package name */
    public transient Set f36811b;

    /* renamed from: c, reason: collision with root package name */
    public transient Collection f36812c;

    /* renamed from: d, reason: collision with root package name */
    public transient Map f36813d;

    /* renamed from: com.google.common.collect.f$a */
    public class a extends Q.b {
        public a() {
        }

        @Override // com.google.common.collect.Q.b
        public O a() {
            return AbstractC3426f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3426f.this.h();
        }
    }

    /* renamed from: com.google.common.collect.f$b */
    public class b extends AbstractCollection {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC3426f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC3426f.this.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3426f.this.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC3426f.this.size();
        }
    }

    @Override // com.google.common.collect.O
    public Collection a() {
        Collection collection = this.f36810a;
        if (collection != null) {
            return collection;
        }
        Collection e10 = e();
        this.f36810a = e10;
        return e10;
    }

    @Override // com.google.common.collect.O
    public Map asMap() {
        Map map = this.f36813d;
        if (map != null) {
            return map;
        }
        Map d10 = d();
        this.f36813d = d10;
        return d10;
    }

    @Override // com.google.common.collect.O
    public boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj) {
        Iterator it = asMap().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map d();

    public abstract Collection e();

    public boolean equals(Object obj) {
        return Q.a(this, obj);
    }

    public abstract Set f();

    public abstract Collection g();

    public abstract Iterator h();

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean i() {
        return size() == 0;
    }

    public Set j() {
        Set set = this.f36811b;
        if (set != null) {
            return set;
        }
        Set f10 = f();
        this.f36811b = f10;
        return f10;
    }

    public boolean k(Object obj, Iterable iterable) {
        Ra.n.k(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator it = iterable.iterator();
        return it.hasNext() && J.a(get(obj), it);
    }

    public abstract Iterator l();

    @Override // com.google.common.collect.O
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // com.google.common.collect.O
    public Collection values() {
        Collection collection = this.f36812c;
        if (collection != null) {
            return collection;
        }
        Collection g10 = g();
        this.f36812c = g10;
        return g10;
    }
}
