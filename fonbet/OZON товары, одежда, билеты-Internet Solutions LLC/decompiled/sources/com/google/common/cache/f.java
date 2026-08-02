package com.google.common.cache;

import Bl0.k0;
import com.google.common.cache.c;
import com.google.common.cache.d;
import com.google.common.cache.f;
import com.google.common.collect.AbstractC5864h;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class f<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: v, reason: collision with root package name */
    static final Logger f58885v = Logger.getLogger(f.class.getName());

    /* renamed from: w, reason: collision with root package name */
    static final C5848a f58886w = new C5848a();

    /* renamed from: x, reason: collision with root package name */
    static final Queue<?> f58887x = new C5849b();

    /* renamed from: a, reason: collision with root package name */
    final int f58888a;

    /* renamed from: b, reason: collision with root package name */
    final int f58889b;

    /* renamed from: c, reason: collision with root package name */
    final p<K, V>[] f58890c;

    /* renamed from: d, reason: collision with root package name */
    final int f58891d;

    /* renamed from: e, reason: collision with root package name */
    final O7.d<Object> f58892e;

    /* renamed from: f, reason: collision with root package name */
    final O7.d<Object> f58893f;

    /* renamed from: g, reason: collision with root package name */
    final r f58894g;

    /* renamed from: h, reason: collision with root package name */
    final r f58895h;

    /* renamed from: i, reason: collision with root package name */
    final long f58896i;

    /* renamed from: j, reason: collision with root package name */
    final com.google.common.cache.n<K, V> f58897j;

    /* renamed from: k, reason: collision with root package name */
    final long f58898k;

    /* renamed from: l, reason: collision with root package name */
    final long f58899l;

    /* renamed from: m, reason: collision with root package name */
    final long f58900m;

    /* renamed from: n, reason: collision with root package name */
    final AbstractQueue f58901n;

    /* renamed from: o, reason: collision with root package name */
    final com.google.common.cache.l<K, V> f58902o;

    /* renamed from: p, reason: collision with root package name */
    final O7.s f58903p;

    /* renamed from: q, reason: collision with root package name */
    final EnumC0895f f58904q;

    /* renamed from: r, reason: collision with root package name */
    final a f58905r;

    /* renamed from: s, reason: collision with root package name */
    Set<K> f58906s;

    /* renamed from: t, reason: collision with root package name */
    Collection<V> f58907t;

    /* renamed from: u, reason: collision with root package name */
    Set<Map.Entry<K, V>> f58908u;

    /* loaded from: classes9.dex */
    static final class A<K, V> extends C<K, V> {

        /* renamed from: d, reason: collision with root package name */
        volatile long f58909d;

        /* renamed from: e, reason: collision with root package name */
        j<K, V> f58910e;

        /* renamed from: f, reason: collision with root package name */
        j<K, V> f58911f;

        A(int i11, j jVar, Object obj, ReferenceQueue referenceQueue) {
            super(i11, jVar, obj, referenceQueue);
            this.f58909d = Long.MAX_VALUE;
            o oVar = o.INSTANCE;
            this.f58910e = oVar;
            this.f58911f = oVar;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void b(j<K, V> jVar) {
            this.f58911f = jVar;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void g(long j11) {
            this.f58909d = j11;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final j<K, V> j() {
            return this.f58911f;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final j<K, V> m() {
            return this.f58910e;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final long p() {
            return this.f58909d;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void s(j<K, V> jVar) {
            this.f58910e = jVar;
        }
    }

    /* loaded from: classes9.dex */
    static final class B<K, V> extends C<K, V> {

        /* renamed from: d, reason: collision with root package name */
        volatile long f58912d;

        /* renamed from: e, reason: collision with root package name */
        j<K, V> f58913e;

        /* renamed from: f, reason: collision with root package name */
        j<K, V> f58914f;

        /* renamed from: g, reason: collision with root package name */
        volatile long f58915g;

        /* renamed from: h, reason: collision with root package name */
        j<K, V> f58916h;

        /* renamed from: i, reason: collision with root package name */
        j<K, V> f58917i;

        B(int i11, j jVar, Object obj, ReferenceQueue referenceQueue) {
            super(i11, jVar, obj, referenceQueue);
            this.f58912d = Long.MAX_VALUE;
            o oVar = o.INSTANCE;
            this.f58913e = oVar;
            this.f58914f = oVar;
            this.f58915g = Long.MAX_VALUE;
            this.f58916h = oVar;
            this.f58917i = oVar;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void b(j<K, V> jVar) {
            this.f58914f = jVar;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final j<K, V> d() {
            return this.f58917i;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final long f() {
            return this.f58915g;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void g(long j11) {
            this.f58912d = j11;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void i(long j11) {
            this.f58915g = j11;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final j<K, V> j() {
            return this.f58914f;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final j<K, V> l() {
            return this.f58916h;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final j<K, V> m() {
            return this.f58913e;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final long p() {
            return this.f58912d;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void s(j<K, V> jVar) {
            this.f58913e = jVar;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void u(j<K, V> jVar) {
            this.f58916h = jVar;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void v(j<K, V> jVar) {
            this.f58917i = jVar;
        }
    }

    /* loaded from: classes9.dex */
    static class C<K, V> extends WeakReference<K> implements j<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final int f58918a;

        /* renamed from: b, reason: collision with root package name */
        final j<K, V> f58919b;

        /* renamed from: c, reason: collision with root package name */
        volatile y<K, V> f58920c;

        C(int i11, j jVar, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f58920c = f.f58886w;
            this.f58918a = i11;
            this.f58919b = jVar;
        }

        @Override // com.google.common.cache.j
        public final y<K, V> a() {
            return this.f58920c;
        }

        public void b(j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        public j<K, V> d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public final void e(y<K, V> yVar) {
            this.f58920c = yVar;
        }

        public long f() {
            throw new UnsupportedOperationException();
        }

        public void g(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public final K getKey() {
            return get();
        }

        @Override // com.google.common.cache.j
        public final j<K, V> h() {
            return this.f58919b;
        }

        public void i(long j11) {
            throw new UnsupportedOperationException();
        }

        public j<K, V> j() {
            throw new UnsupportedOperationException();
        }

        public j<K, V> l() {
            throw new UnsupportedOperationException();
        }

        public j<K, V> m() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public final int n() {
            return this.f58918a;
        }

        public long p() {
            throw new UnsupportedOperationException();
        }

        public void s(j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        public void u(j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        public void v(j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes9.dex */
    static class D<K, V> extends WeakReference<V> implements y<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final j<K, V> f58921a;

        D(ReferenceQueue<V> referenceQueue, V v11, j<K, V> jVar) {
            super(v11, referenceQueue);
            this.f58921a = jVar;
        }

        @Override // com.google.common.cache.f.y
        public final void a(V v11) {
        }

        @Override // com.google.common.cache.f.y
        public final V b() {
            return get();
        }

        @Override // com.google.common.cache.f.y
        public y<K, V> c(ReferenceQueue<V> referenceQueue, V v11, j<K, V> jVar) {
            return new D(referenceQueue, v11, jVar);
        }

        @Override // com.google.common.cache.f.y
        public final j<K, V> d() {
            return this.f58921a;
        }

        @Override // com.google.common.cache.f.y
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.f.y
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.f.y
        public final boolean isLoading() {
            return false;
        }
    }

    /* loaded from: classes9.dex */
    static final class E<K, V> extends C<K, V> {

        /* renamed from: d, reason: collision with root package name */
        volatile long f58922d;

        /* renamed from: e, reason: collision with root package name */
        j<K, V> f58923e;

        /* renamed from: f, reason: collision with root package name */
        j<K, V> f58924f;

        E(int i11, j jVar, Object obj, ReferenceQueue referenceQueue) {
            super(i11, jVar, obj, referenceQueue);
            this.f58922d = Long.MAX_VALUE;
            o oVar = o.INSTANCE;
            this.f58923e = oVar;
            this.f58924f = oVar;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final j<K, V> d() {
            return this.f58924f;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final long f() {
            return this.f58922d;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void i(long j11) {
            this.f58922d = j11;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final j<K, V> l() {
            return this.f58923e;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void u(j<K, V> jVar) {
            this.f58923e = jVar;
        }

        @Override // com.google.common.cache.f.C, com.google.common.cache.j
        public final void v(j<K, V> jVar) {
            this.f58924f = jVar;
        }
    }

    /* loaded from: classes9.dex */
    static final class F<K, V> extends q<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final int f58925b;

        F(int i11, j jVar, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, jVar);
            this.f58925b = i11;
        }

        @Override // com.google.common.cache.f.q, com.google.common.cache.f.y
        public final y<K, V> c(ReferenceQueue<V> referenceQueue, V v11, j<K, V> jVar) {
            return new F(this.f58925b, jVar, v11, referenceQueue);
        }

        @Override // com.google.common.cache.f.q, com.google.common.cache.f.y
        public final int getWeight() {
            return this.f58925b;
        }
    }

    /* loaded from: classes9.dex */
    static final class G<K, V> extends v<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final int f58926b;

        G(V v11, int i11) {
            super(v11);
            this.f58926b = i11;
        }

        @Override // com.google.common.cache.f.v, com.google.common.cache.f.y
        public final int getWeight() {
            return this.f58926b;
        }
    }

    /* loaded from: classes9.dex */
    static final class H<K, V> extends D<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final int f58927b;

        H(int i11, j jVar, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, jVar);
            this.f58927b = i11;
        }

        @Override // com.google.common.cache.f.D, com.google.common.cache.f.y
        public final y<K, V> c(ReferenceQueue<V> referenceQueue, V v11, j<K, V> jVar) {
            return new H(this.f58927b, jVar, v11, referenceQueue);
        }

        @Override // com.google.common.cache.f.D, com.google.common.cache.f.y
        public final int getWeight() {
            return this.f58927b;
        }
    }

    /* loaded from: classes9.dex */
    static final class I<K, V> extends AbstractQueue<j<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        final a f58928a;

        final class a extends AbstractC5851d<K, V> {

            /* renamed from: a, reason: collision with root package name */
            j<K, V> f58929a;

            /* renamed from: b, reason: collision with root package name */
            j<K, V> f58930b;

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final j<K, V> d() {
                return this.f58930b;
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final long f() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final void i(long j11) {
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final j<K, V> l() {
                return this.f58929a;
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final void u(j<K, V> jVar) {
                this.f58929a = jVar;
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final void v(j<K, V> jVar) {
                this.f58930b = jVar;
            }
        }

        final class b extends AbstractC5864h<j<K, V>> {
            b(j jVar) {
                super(jVar);
            }

            @Override // com.google.common.collect.AbstractC5864h
            protected final Object a(Object obj) {
                j<K, V> l11 = ((j) obj).l();
                if (l11 == I.this.f58928a) {
                    return null;
                }
                return l11;
            }
        }

        I() {
            a aVar = new a();
            aVar.f58929a = aVar;
            aVar.f58930b = aVar;
            this.f58928a = aVar;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            a aVar = this.f58928a;
            j<K, V> jVar = aVar.f58929a;
            while (jVar != aVar) {
                j<K, V> l11 = jVar.l();
                Logger logger = f.f58885v;
                o oVar = o.INSTANCE;
                jVar.u(oVar);
                jVar.v(oVar);
                jVar = l11;
            }
            aVar.f58929a = aVar;
            aVar.f58930b = aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((j) obj).l() != o.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            a aVar = this.f58928a;
            return aVar.f58929a == aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<j<K, V>> iterator() {
            a aVar = this.f58928a;
            j<K, V> jVar = aVar.f58929a;
            if (jVar == aVar) {
                jVar = null;
            }
            return new b(jVar);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            j<K, V> jVar = (j) obj;
            j<K, V> d11 = jVar.d();
            j<K, V> l11 = jVar.l();
            Logger logger = f.f58885v;
            d11.u(l11);
            l11.v(d11);
            a aVar = this.f58928a;
            j<K, V> jVar2 = aVar.f58930b;
            jVar2.u(jVar);
            jVar.v(jVar2);
            jVar.u(aVar);
            aVar.f58930b = jVar;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            a aVar = this.f58928a;
            j<K, V> jVar = aVar.f58929a;
            if (jVar == aVar) {
                return null;
            }
            return jVar;
        }

        @Override // java.util.Queue
        public final Object poll() {
            a aVar = this.f58928a;
            j<K, V> jVar = aVar.f58929a;
            if (jVar == aVar) {
                return null;
            }
            remove(jVar);
            return jVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            j jVar = (j) obj;
            j<K, V> d11 = jVar.d();
            j<K, V> l11 = jVar.l();
            Logger logger = f.f58885v;
            d11.u(l11);
            l11.v(d11);
            o oVar = o.INSTANCE;
            jVar.u(oVar);
            jVar.v(oVar);
            return l11 != oVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            a aVar = this.f58928a;
            int i11 = 0;
            for (j<K, V> jVar = aVar.f58929a; jVar != aVar; jVar = jVar.l()) {
                i11++;
            }
            return i11;
        }
    }

    final class J implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f58932a;

        /* renamed from: b, reason: collision with root package name */
        V f58933b;

        J(K k11, V v11) {
            this.f58932a = k11;
            this.f58933b = v11;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f58932a.equals(entry.getKey()) && this.f58933b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f58932a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f58933b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f58932a.hashCode() ^ this.f58933b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            V v12 = (V) f.this.put(this.f58932a, v11);
            this.f58933b = v11;
            return v12;
        }

        public final String toString() {
            return this.f58932a + "=" + this.f58933b;
        }
    }

    /* renamed from: com.google.common.cache.f$a, reason: case insensitive filesystem */
    final class C5848a implements y<Object, Object> {
        @Override // com.google.common.cache.f.y
        public final void a(Object obj) {
        }

        @Override // com.google.common.cache.f.y
        public final Object b() {
            return null;
        }

        @Override // com.google.common.cache.f.y
        public final y<Object, Object> c(ReferenceQueue<Object> referenceQueue, Object obj, j<Object, Object> jVar) {
            return this;
        }

        @Override // com.google.common.cache.f.y
        public final j<Object, Object> d() {
            return null;
        }

        @Override // com.google.common.cache.f.y
        public final Object get() {
            return null;
        }

        @Override // com.google.common.cache.f.y
        public final int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.f.y
        public final boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.f.y
        public final boolean isLoading() {
            return false;
        }
    }

    /* renamed from: com.google.common.cache.f$b, reason: case insensitive filesystem */
    final class C5849b extends AbstractQueue<Object> {
        C5849b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return com.google.common.collect.A.B().iterator();
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }
    }

    /* renamed from: com.google.common.cache.f$c, reason: case insensitive filesystem */
    abstract class AbstractC5850c<T> extends AbstractSet<T> {
        AbstractC5850c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return f.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return f.this.size();
        }
    }

    /* renamed from: com.google.common.cache.f$d, reason: case insensitive filesystem */
    static abstract class AbstractC5851d<K, V> implements j<K, V> {
        @Override // com.google.common.cache.j
        public y<K, V> a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public void b(j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public j<K, V> d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public void e(y<K, V> yVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public long f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public void g(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public j<K, V> h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public void i(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public j<K, V> j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public j<K, V> l() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public j<K, V> m() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public int n() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public long p() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public void s(j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public void u(j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.j
        public void v(j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.cache.f$e, reason: case insensitive filesystem */
    static final class C5852e<K, V> extends AbstractQueue<j<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        final a f58936a;

        /* renamed from: com.google.common.cache.f$e$a */
        final class a extends AbstractC5851d<K, V> {

            /* renamed from: a, reason: collision with root package name */
            j<K, V> f58937a;

            /* renamed from: b, reason: collision with root package name */
            j<K, V> f58938b;

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final void b(j<K, V> jVar) {
                this.f58938b = jVar;
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final void g(long j11) {
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final j<K, V> j() {
                return this.f58938b;
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final j<K, V> m() {
                return this.f58937a;
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final long p() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
            public final void s(j<K, V> jVar) {
                this.f58937a = jVar;
            }
        }

        /* renamed from: com.google.common.cache.f$e$b */
        /* loaded from: classes9.dex */
        final class b extends AbstractC5864h<j<K, V>> {
            b(j jVar) {
                super(jVar);
            }

            @Override // com.google.common.collect.AbstractC5864h
            protected final Object a(Object obj) {
                j<K, V> m11 = ((j) obj).m();
                if (m11 == C5852e.this.f58936a) {
                    return null;
                }
                return m11;
            }
        }

        C5852e() {
            a aVar = new a();
            aVar.f58937a = aVar;
            aVar.f58938b = aVar;
            this.f58936a = aVar;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            a aVar = this.f58936a;
            j<K, V> jVar = aVar.f58937a;
            while (jVar != aVar) {
                j<K, V> m11 = jVar.m();
                Logger logger = f.f58885v;
                o oVar = o.INSTANCE;
                jVar.s(oVar);
                jVar.b(oVar);
                jVar = m11;
            }
            aVar.f58937a = aVar;
            aVar.f58938b = aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((j) obj).m() != o.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            a aVar = this.f58936a;
            return aVar.f58937a == aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<j<K, V>> iterator() {
            a aVar = this.f58936a;
            j<K, V> jVar = aVar.f58937a;
            if (jVar == aVar) {
                jVar = null;
            }
            return new b(jVar);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            j<K, V> jVar = (j) obj;
            j<K, V> j11 = jVar.j();
            j<K, V> m11 = jVar.m();
            Logger logger = f.f58885v;
            j11.s(m11);
            m11.b(j11);
            a aVar = this.f58936a;
            j<K, V> jVar2 = aVar.f58938b;
            jVar2.s(jVar);
            jVar.b(jVar2);
            jVar.s(aVar);
            aVar.f58938b = jVar;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            a aVar = this.f58936a;
            j<K, V> jVar = aVar.f58937a;
            if (jVar == aVar) {
                return null;
            }
            return jVar;
        }

        @Override // java.util.Queue
        public final Object poll() {
            a aVar = this.f58936a;
            j<K, V> jVar = aVar.f58937a;
            if (jVar == aVar) {
                return null;
            }
            remove(jVar);
            return jVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            j jVar = (j) obj;
            j<K, V> j11 = jVar.j();
            j<K, V> m11 = jVar.m();
            Logger logger = f.f58885v;
            j11.s(m11);
            m11.b(j11);
            o oVar = o.INSTANCE;
            jVar.s(oVar);
            jVar.b(oVar);
            return m11 != oVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            a aVar = this.f58936a;
            int i11 = 0;
            for (j<K, V> jVar = aVar.f58937a; jVar != aVar; jVar = jVar.m()) {
                i11++;
            }
            return i11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.google.common.cache.f$f, reason: collision with other inner class name */
    static abstract class EnumC0895f {
        private static final /* synthetic */ EnumC0895f[] $VALUES;
        static final int ACCESS_MASK = 1;
        public static final EnumC0895f STRONG;
        public static final EnumC0895f STRONG_ACCESS;
        public static final EnumC0895f STRONG_ACCESS_WRITE;
        public static final EnumC0895f STRONG_WRITE;
        public static final EnumC0895f WEAK;
        public static final EnumC0895f WEAK_ACCESS;
        public static final EnumC0895f WEAK_ACCESS_WRITE;
        static final int WEAK_MASK = 4;
        public static final EnumC0895f WEAK_WRITE;
        static final int WRITE_MASK = 2;
        static final EnumC0895f[] factories;

        /* renamed from: com.google.common.cache.f$f$a */
        enum a extends EnumC0895f {
            a() {
                super("STRONG", 0);
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final j e(int i11, p pVar, j jVar, Object obj) {
                return new u(obj, i11, jVar);
            }
        }

        /* renamed from: com.google.common.cache.f$f$b */
        enum b extends EnumC0895f {
            b() {
                super("STRONG_ACCESS", 1);
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final <K, V> j<K, V> b(p<K, V> pVar, j<K, V> jVar, j<K, V> jVar2, K k11) {
                j<K, V> b11 = super.b(pVar, jVar, jVar2, k11);
                EnumC0895f.a(jVar, b11);
                return b11;
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final j e(int i11, p pVar, j jVar, Object obj) {
                s sVar = new s(obj, i11, jVar);
                sVar.f58981e = Long.MAX_VALUE;
                o oVar = o.INSTANCE;
                sVar.f58982f = oVar;
                sVar.f58983g = oVar;
                return sVar;
            }
        }

        /* renamed from: com.google.common.cache.f$f$c */
        enum c extends EnumC0895f {
            c() {
                super("STRONG_WRITE", 2);
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final <K, V> j<K, V> b(p<K, V> pVar, j<K, V> jVar, j<K, V> jVar2, K k11) {
                j<K, V> b11 = super.b(pVar, jVar, jVar2, k11);
                EnumC0895f.d(jVar, b11);
                return b11;
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final j e(int i11, p pVar, j jVar, Object obj) {
                return new w(obj, i11, jVar);
            }
        }

        /* renamed from: com.google.common.cache.f$f$d */
        enum d extends EnumC0895f {
            d() {
                super("STRONG_ACCESS_WRITE", 3);
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final <K, V> j<K, V> b(p<K, V> pVar, j<K, V> jVar, j<K, V> jVar2, K k11) {
                j<K, V> b11 = super.b(pVar, jVar, jVar2, k11);
                EnumC0895f.a(jVar, b11);
                EnumC0895f.d(jVar, b11);
                return b11;
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final j e(int i11, p pVar, j jVar, Object obj) {
                return new t(obj, i11, jVar);
            }
        }

        /* renamed from: com.google.common.cache.f$f$e */
        enum e extends EnumC0895f {
            e() {
                super("WEAK", 4);
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final j e(int i11, p pVar, j jVar, Object obj) {
                return new C(i11, jVar, obj, pVar.f58973h);
            }
        }

        /* renamed from: com.google.common.cache.f$f$f, reason: collision with other inner class name */
        enum C0896f extends EnumC0895f {
            C0896f() {
                super("WEAK_ACCESS", 5);
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final <K, V> j<K, V> b(p<K, V> pVar, j<K, V> jVar, j<K, V> jVar2, K k11) {
                j<K, V> b11 = super.b(pVar, jVar, jVar2, k11);
                EnumC0895f.a(jVar, b11);
                return b11;
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final j e(int i11, p pVar, j jVar, Object obj) {
                return new A(i11, jVar, obj, pVar.f58973h);
            }
        }

        /* renamed from: com.google.common.cache.f$f$g */
        enum g extends EnumC0895f {
            g() {
                super("WEAK_WRITE", 6);
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final <K, V> j<K, V> b(p<K, V> pVar, j<K, V> jVar, j<K, V> jVar2, K k11) {
                j<K, V> b11 = super.b(pVar, jVar, jVar2, k11);
                EnumC0895f.d(jVar, b11);
                return b11;
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final j e(int i11, p pVar, j jVar, Object obj) {
                return new E(i11, jVar, obj, pVar.f58973h);
            }
        }

        /* renamed from: com.google.common.cache.f$f$h */
        enum h extends EnumC0895f {
            h() {
                super("WEAK_ACCESS_WRITE", 7);
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final <K, V> j<K, V> b(p<K, V> pVar, j<K, V> jVar, j<K, V> jVar2, K k11) {
                j<K, V> b11 = super.b(pVar, jVar, jVar2, k11);
                EnumC0895f.a(jVar, b11);
                EnumC0895f.d(jVar, b11);
                return b11;
            }

            @Override // com.google.common.cache.f.EnumC0895f
            final j e(int i11, p pVar, j jVar, Object obj) {
                return new B(i11, jVar, obj, pVar.f58973h);
            }
        }

        static {
            a aVar = new a();
            STRONG = aVar;
            b bVar = new b();
            STRONG_ACCESS = bVar;
            c cVar = new c();
            STRONG_WRITE = cVar;
            d dVar = new d();
            STRONG_ACCESS_WRITE = dVar;
            e eVar = new e();
            WEAK = eVar;
            C0896f c0896f = new C0896f();
            WEAK_ACCESS = c0896f;
            g gVar = new g();
            WEAK_WRITE = gVar;
            h hVar = new h();
            WEAK_ACCESS_WRITE = hVar;
            $VALUES = new EnumC0895f[]{aVar, bVar, cVar, dVar, eVar, c0896f, gVar, hVar};
            factories = new EnumC0895f[]{aVar, bVar, cVar, dVar, eVar, c0896f, gVar, hVar};
        }

        private EnumC0895f() {
            throw null;
        }

        static void a(j jVar, j jVar2) {
            jVar2.g(jVar.p());
            j<K, V> j11 = jVar.j();
            Logger logger = f.f58885v;
            j11.s(jVar2);
            jVar2.b(j11);
            j<K, V> m11 = jVar.m();
            jVar2.s(m11);
            m11.b(jVar2);
            o oVar = o.INSTANCE;
            jVar.s(oVar);
            jVar.b(oVar);
        }

        static void d(j jVar, j jVar2) {
            jVar2.i(jVar.f());
            j<K, V> d11 = jVar.d();
            Logger logger = f.f58885v;
            d11.u(jVar2);
            jVar2.v(d11);
            j<K, V> l11 = jVar.l();
            jVar2.u(l11);
            l11.v(jVar2);
            o oVar = o.INSTANCE;
            jVar.u(oVar);
            jVar.v(oVar);
        }

        public static EnumC0895f valueOf(String str) {
            return (EnumC0895f) Enum.valueOf(EnumC0895f.class, str);
        }

        public static EnumC0895f[] values() {
            return (EnumC0895f[]) $VALUES.clone();
        }

        <K, V> j<K, V> b(p<K, V> pVar, j<K, V> jVar, j<K, V> jVar2, K k11) {
            return e(jVar.n(), pVar, jVar2, k11);
        }

        abstract j e(int i11, p pVar, j jVar, Object obj);
    }

    /* renamed from: com.google.common.cache.f$g, reason: case insensitive filesystem */
    final class C5853g extends f<K, V>.AbstractC5855i<Map.Entry<K, V>> {
    }

    /* renamed from: com.google.common.cache.f$h, reason: case insensitive filesystem */
    final class C5854h extends f<K, V>.AbstractC5850c<Map.Entry<K, V>> {
        C5854h() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            f fVar;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (fVar = f.this).get(key)) != null && fVar.f58893f.e(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C5853g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && f.this.remove(key, entry.getValue());
        }
    }

    /* renamed from: com.google.common.cache.f$i, reason: case insensitive filesystem */
    abstract class AbstractC5855i<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        int f58941a;

        /* renamed from: b, reason: collision with root package name */
        int f58942b = -1;

        /* renamed from: c, reason: collision with root package name */
        p<K, V> f58943c;

        /* renamed from: d, reason: collision with root package name */
        AtomicReferenceArray<j<K, V>> f58944d;

        /* renamed from: e, reason: collision with root package name */
        j<K, V> f58945e;

        /* renamed from: f, reason: collision with root package name */
        f<K, V>.J f58946f;

        /* renamed from: g, reason: collision with root package name */
        f<K, V>.J f58947g;

        AbstractC5855i() {
            this.f58941a = f.this.f58890c.length - 1;
            a();
        }

        final void a() {
            this.f58946f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i11 = this.f58941a;
                if (i11 < 0) {
                    return;
                }
                p<K, V>[] pVarArr = f.this.f58890c;
                this.f58941a = i11 - 1;
                p<K, V> pVar = pVarArr[i11];
                this.f58943c = pVar;
                if (pVar.f58967b != 0) {
                    this.f58944d = this.f58943c.f58971f;
                    this.f58942b = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
        
            r6.f58946f = new com.google.common.cache.f.J(r0, r3, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
        
            r6.f58943c.n();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final boolean b(j<K, V> jVar) {
            V v11;
            f fVar = f.this;
            try {
                long a11 = fVar.f58903p.a();
                K key = jVar.getKey();
                V v12 = null;
                if (jVar.getKey() != null && (v11 = jVar.a().get()) != null && !fVar.i(jVar, a11)) {
                    v12 = v11;
                }
                this.f58943c.n();
                return false;
            } catch (Throwable th2) {
                this.f58943c.n();
                throw th2;
            }
        }

        final f<K, V>.J c() {
            f<K, V>.J j11 = this.f58946f;
            if (j11 == null) {
                throw new NoSuchElementException();
            }
            this.f58947g = j11;
            a();
            return this.f58947g;
        }

        final boolean d() {
            j<K, V> jVar = this.f58945e;
            if (jVar == null) {
                return false;
            }
            while (true) {
                this.f58945e = jVar.h();
                j<K, V> jVar2 = this.f58945e;
                if (jVar2 == null) {
                    return false;
                }
                if (b(jVar2)) {
                    return true;
                }
                jVar = this.f58945e;
            }
        }

        final boolean e() {
            while (true) {
                int i11 = this.f58942b;
                if (i11 < 0) {
                    return false;
                }
                AtomicReferenceArray<j<K, V>> atomicReferenceArray = this.f58944d;
                this.f58942b = i11 - 1;
                j<K, V> jVar = atomicReferenceArray.get(i11);
                this.f58945e = jVar;
                if (jVar != null && (b(jVar) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f58946f != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            k0.m(this.f58947g != null);
            f.this.remove(this.f58947g.f58932a);
            this.f58947g = null;
        }
    }

    /* renamed from: com.google.common.cache.f$j, reason: case insensitive filesystem */
    /* loaded from: classes9.dex */
    final class C5856j extends f<K, V>.AbstractC5855i<K> {
        @Override // com.google.common.cache.f.AbstractC5855i, java.util.Iterator
        public final K next() {
            return c().f58932a;
        }
    }

    /* loaded from: classes9.dex */
    final class k extends f<K, V>.AbstractC5850c<K> {
        k() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return f.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new C5856j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return f.this.remove(obj) != null;
        }
    }

    static class m<K, V> implements b<K, V>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final f<K, V> f58953a;

        m(c<? super K, ? super V> cVar) {
            this.f58953a = new f<>(cVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        @Override // com.google.common.cache.b
        public final ConcurrentMap<K, V> b() {
            return this.f58953a;
        }

        @Override // com.google.common.cache.b
        public final Object e(String str, Callable callable) throws ExecutionException {
            String str2;
            j<K, V> j11;
            f<K, V> fVar = this.f58953a;
            h hVar = new h(callable);
            fVar.getClass();
            str.getClass();
            int h11 = fVar.h(str);
            p<K, V> j12 = fVar.j(h11);
            j12.getClass();
            try {
                try {
                    if (j12.f58967b == 0 || (j11 = j12.j(h11, str)) == null) {
                        str2 = str;
                    } else {
                        long a11 = j12.f58966a.f58903p.a();
                        V l11 = j12.l(j11, a11);
                        if (l11 != null) {
                            j12.u(j11, a11);
                            j12.f58979n.e();
                            V E11 = j12.E(j11, str, h11, l11, a11, hVar);
                            j12.n();
                            return E11;
                        }
                        str2 = str;
                        y<K, V> a12 = j11.a();
                        if (a12.isLoading()) {
                            Object I11 = j12.I(j11, str2, a12);
                            j12.n();
                            return I11;
                        }
                    }
                    Object m11 = j12.m(str2, h11, hVar);
                    j12.n();
                    return m11;
                } catch (ExecutionException e11) {
                    Throwable cause = e11.getCause();
                    if (cause instanceof Error) {
                        throw new com.google.common.util.concurrent.e((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new com.google.common.util.concurrent.r((RuntimeException) cause);
                    }
                    throw e11;
                }
            } catch (Throwable th2) {
                j12.n();
                throw th2;
            }
        }

        Object writeReplace() {
            return new n(this.f58953a);
        }
    }

    /* loaded from: classes9.dex */
    static class n<K, V> extends e<K, V> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final r f58954a;

        /* renamed from: b, reason: collision with root package name */
        final r f58955b;

        /* renamed from: c, reason: collision with root package name */
        final O7.d<Object> f58956c;

        /* renamed from: d, reason: collision with root package name */
        final O7.d<Object> f58957d;

        /* renamed from: e, reason: collision with root package name */
        final long f58958e;

        /* renamed from: f, reason: collision with root package name */
        final long f58959f;

        /* renamed from: g, reason: collision with root package name */
        final long f58960g;

        /* renamed from: h, reason: collision with root package name */
        final com.google.common.cache.n<K, V> f58961h;

        /* renamed from: i, reason: collision with root package name */
        final int f58962i;

        /* renamed from: j, reason: collision with root package name */
        final com.google.common.cache.l<? super K, ? super V> f58963j;

        /* renamed from: k, reason: collision with root package name */
        final O7.s f58964k;

        /* renamed from: l, reason: collision with root package name */
        transient b<K, V> f58965l;

        n(f<K, V> fVar) {
            this.f58954a = fVar.f58894g;
            this.f58955b = fVar.f58895h;
            this.f58956c = fVar.f58892e;
            this.f58957d = fVar.f58893f;
            this.f58958e = fVar.f58899l;
            this.f58959f = fVar.f58898k;
            this.f58960g = fVar.f58896i;
            this.f58961h = fVar.f58897j;
            this.f58962i = fVar.f58891d;
            this.f58963j = fVar.f58902o;
            O7.s b11 = O7.s.b();
            O7.s sVar = fVar.f58903p;
            this.f58964k = (sVar == b11 || sVar == c.f58869p) ? null : sVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            c<Object, Object> c11 = c.c();
            r rVar = c11.f58875f;
            k0.k(rVar, "Key strength was already set to %s", rVar == null);
            r rVar2 = this.f58954a;
            rVar2.getClass();
            c11.f58875f = rVar2;
            r rVar3 = c11.f58876g;
            k0.k(rVar3, "Value strength was already set to %s", rVar3 == null);
            r rVar4 = this.f58955b;
            rVar4.getClass();
            c11.f58876g = rVar4;
            O7.d<Object> dVar = c11.f58879j;
            k0.k(dVar, "key equivalence was already set to %s", dVar == null);
            O7.d<Object> dVar2 = this.f58956c;
            dVar2.getClass();
            c11.f58879j = dVar2;
            O7.d<Object> dVar3 = c11.f58880k;
            k0.k(dVar3, "value equivalence was already set to %s", dVar3 == null);
            O7.d<Object> dVar4 = this.f58957d;
            dVar4.getClass();
            c11.f58880k = dVar4;
            int i11 = c11.f58871b;
            if (i11 != -1) {
                throw new IllegalStateException(O7.o.d("concurrency level was already set to %s", Integer.valueOf(i11)));
            }
            int i12 = this.f58962i;
            k0.e(i12 > 0);
            c11.f58871b = i12;
            k0.m(c11.f58881l == null);
            com.google.common.cache.l<? super K, ? super V> lVar = this.f58963j;
            lVar.getClass();
            c11.f58881l = lVar;
            c11.f58870a = false;
            long j11 = this.f58958e;
            if (j11 > 0) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long j12 = c11.f58877h;
                k0.j(j12, "expireAfterWrite was already set to %s ns", j12 == -1);
                if (!(j11 >= 0)) {
                    throw new IllegalArgumentException(O7.o.d("duration cannot be negative: %s %s", Long.valueOf(j11), timeUnit));
                }
                c11.f58877h = timeUnit.toNanos(j11);
            }
            long j13 = this.f58959f;
            if (j13 > 0) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long j14 = c11.f58878i;
                k0.j(j14, "expireAfterAccess was already set to %s ns", j14 == -1);
                if (!(j13 >= 0)) {
                    throw new IllegalArgumentException(O7.o.d("duration cannot be negative: %s %s", Long.valueOf(j13), timeUnit2));
                }
                c11.f58878i = timeUnit2.toNanos(j13);
            }
            c.e eVar = c.e.INSTANCE;
            long j15 = this.f58960g;
            com.google.common.cache.n<K, V> nVar = this.f58961h;
            if (nVar != eVar) {
                k0.m(c11.f58874e == null);
                if (c11.f58870a) {
                    long j16 = c11.f58872c;
                    k0.j(j16, "weigher can not be combined with maximum size (%s provided)", j16 == -1);
                }
                nVar.getClass();
                c11.f58874e = nVar;
                if (j15 != -1) {
                    long j17 = c11.f58873d;
                    k0.j(j17, "maximum weight was already set to %s", j17 == -1);
                    long j18 = c11.f58872c;
                    k0.j(j18, "maximum size was already set to %s", j18 == -1);
                    k0.d("maximum weight must not be negative", j15 >= 0);
                    c11.f58873d = j15;
                }
            } else if (j15 != -1) {
                c11.b(j15);
            }
            O7.s sVar = this.f58964k;
            if (sVar != null) {
                k0.m(c11.f58882m == null);
                c11.f58882m = sVar;
            }
            this.f58965l = (b<K, V>) c11.a();
        }

        private Object readResolve() {
            return this.f58965l;
        }

        @Override // com.google.common.collect.AbstractC5876u
        protected final Object h() {
            return this.f58965l;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class o implements j<Object, Object> {
        private static final /* synthetic */ o[] $VALUES;
        public static final o INSTANCE;

        static {
            o oVar = new o("INSTANCE", 0);
            INSTANCE = oVar;
            $VALUES = new o[]{oVar};
        }

        private o() {
            throw null;
        }

        public static o valueOf(String str) {
            return (o) Enum.valueOf(o.class, str);
        }

        public static o[] values() {
            return (o[]) $VALUES.clone();
        }

        @Override // com.google.common.cache.j
        public final y<Object, Object> a() {
            return null;
        }

        @Override // com.google.common.cache.j
        public final void b(j<Object, Object> jVar) {
        }

        @Override // com.google.common.cache.j
        public final j<Object, Object> d() {
            return this;
        }

        @Override // com.google.common.cache.j
        public final void e(y<Object, Object> yVar) {
        }

        @Override // com.google.common.cache.j
        public final long f() {
            return 0L;
        }

        @Override // com.google.common.cache.j
        public final void g(long j11) {
        }

        @Override // com.google.common.cache.j
        public final Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.j
        public final j<Object, Object> h() {
            return null;
        }

        @Override // com.google.common.cache.j
        public final void i(long j11) {
        }

        @Override // com.google.common.cache.j
        public final j<Object, Object> j() {
            return this;
        }

        @Override // com.google.common.cache.j
        public final j<Object, Object> l() {
            return this;
        }

        @Override // com.google.common.cache.j
        public final j<Object, Object> m() {
            return this;
        }

        @Override // com.google.common.cache.j
        public final int n() {
            return 0;
        }

        @Override // com.google.common.cache.j
        public final long p() {
            return 0L;
        }

        @Override // com.google.common.cache.j
        public final void s(j<Object, Object> jVar) {
        }

        @Override // com.google.common.cache.j
        public final void u(j<Object, Object> jVar) {
        }

        @Override // com.google.common.cache.j
        public final void v(j<Object, Object> jVar) {
        }
    }

    static class p<K, V> extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        final f<K, V> f58966a;

        /* renamed from: b, reason: collision with root package name */
        volatile int f58967b;

        /* renamed from: c, reason: collision with root package name */
        long f58968c;

        /* renamed from: d, reason: collision with root package name */
        int f58969d;

        /* renamed from: e, reason: collision with root package name */
        int f58970e;

        /* renamed from: f, reason: collision with root package name */
        volatile AtomicReferenceArray<j<K, V>> f58971f;

        /* renamed from: g, reason: collision with root package name */
        final long f58972g;

        /* renamed from: h, reason: collision with root package name */
        final ReferenceQueue<K> f58973h;

        /* renamed from: i, reason: collision with root package name */
        final ReferenceQueue<V> f58974i;

        /* renamed from: j, reason: collision with root package name */
        final AbstractQueue f58975j;

        /* renamed from: k, reason: collision with root package name */
        final AtomicInteger f58976k = new AtomicInteger();

        /* renamed from: l, reason: collision with root package name */
        final AbstractQueue f58977l;

        /* renamed from: m, reason: collision with root package name */
        final AbstractQueue f58978m;

        /* renamed from: n, reason: collision with root package name */
        final a f58979n;

        p(f<K, V> fVar, int i11, long j11, a aVar) {
            this.f58966a = fVar;
            this.f58972g = j11;
            aVar.getClass();
            this.f58979n = aVar;
            AtomicReferenceArray<j<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i11);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f58970e = length;
            if (fVar.f58897j == c.e.INSTANCE && length == j11) {
                this.f58970e = length + 1;
            }
            this.f58971f = atomicReferenceArray;
            r rVar = fVar.f58894g;
            r rVar2 = r.STRONG;
            this.f58973h = rVar != rVar2 ? new ReferenceQueue<>() : null;
            this.f58974i = fVar.f58895h != rVar2 ? new ReferenceQueue<>() : null;
            this.f58975j = (AbstractQueue) ((fVar.c() || fVar.b()) ? new ConcurrentLinkedQueue() : f.f58887x);
            this.f58977l = (AbstractQueue) (fVar.e() ? new I() : f.f58887x);
            this.f58978m = (AbstractQueue) ((fVar.c() || fVar.b()) ? new C5852e() : f.f58887x);
        }

        final j<K, V> A(j<K, V> jVar, j<K, V> jVar2) {
            int i11 = this.f58967b;
            j<K, V> h11 = jVar2.h();
            while (jVar != jVar2) {
                j<K, V> a11 = a(jVar, h11);
                if (a11 != null) {
                    h11 = a11;
                } else {
                    v(jVar);
                    i11--;
                }
                jVar = jVar.h();
            }
            this.f58967b = i11;
            return h11;
        }

        final j B(j jVar, j jVar2, Object obj, Object obj2, y yVar, com.google.common.cache.k kVar) {
            e(obj, obj2, yVar.getWeight(), kVar);
            this.f58977l.remove(jVar2);
            this.f58978m.remove(jVar2);
            if (!yVar.isLoading()) {
                return A(jVar, jVar2);
            }
            yVar.a(null);
            return jVar;
        }

        final void C(long j11) {
            if (tryLock()) {
                try {
                    d();
                    h(j11);
                    this.f58976k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        final void D() {
            if (isHeldByCurrentThread()) {
                return;
            }
            while (true) {
                f<K, V> fVar = this.f58966a;
                if (((com.google.common.cache.m) fVar.f58901n.poll()) == null) {
                    return;
                }
                try {
                    fVar.f58902o.getClass();
                } catch (Throwable th2) {
                    f.f58885v.log(Level.WARNING, "Exception thrown by removal listener", th2);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        
            unlock();
            D();
            r10 = r0;
         */
        /* JADX WARN: Finally extract failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final V E(j<K, V> jVar, final K k11, final int i11, V v11, long j11, d<? super K, V> dVar) {
            V v12;
            l lVar;
            final l lVar2;
            if (this.f58966a.f58900m > 0 && j11 - jVar.f() > this.f58966a.f58900m && !jVar.a().isLoading()) {
                lock();
                try {
                    long a11 = this.f58966a.f58903p.a();
                    C(a11);
                    AtomicReferenceArray<j<K, V>> atomicReferenceArray = this.f58971f;
                    int length = (atomicReferenceArray.length() - 1) & i11;
                    j jVar2 = atomicReferenceArray.get(length);
                    j jVar3 = jVar2;
                    while (true) {
                        v12 = null;
                        if (jVar3 == null) {
                            this.f58969d++;
                            lVar = new l();
                            EnumC0895f enumC0895f = this.f58966a.f58904q;
                            k11.getClass();
                            j e11 = enumC0895f.e(i11, this, jVar2, k11);
                            e11.e(lVar);
                            atomicReferenceArray.set(length, e11);
                            break;
                        }
                        K key = jVar3.getKey();
                        if (jVar3.n() == i11 && key != null && this.f58966a.f58892e.e(k11, key)) {
                            y<K, V> a12 = jVar3.a();
                            if (!a12.isLoading() && a11 - jVar3.f() >= this.f58966a.f58900m) {
                                this.f58969d++;
                                lVar = new l(a12);
                                jVar3.e(lVar);
                            }
                            unlock();
                            D();
                            lVar2 = null;
                        } else {
                            jVar3 = jVar3.h();
                        }
                    }
                    if (lVar2 != null) {
                        final com.google.common.util.concurrent.m<V> e12 = lVar2.e(k11, dVar);
                        e12.a(new Runnable() { // from class: com.google.common.cache.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                Object obj = k11;
                                int i12 = i11;
                                f.l lVar3 = lVar2;
                                com.google.common.util.concurrent.m mVar = e12;
                                f.p pVar = f.p.this;
                                pVar.getClass();
                                try {
                                    pVar.i(obj, i12, lVar3, mVar);
                                } catch (Throwable th2) {
                                    f.f58885v.log(Level.WARNING, "Exception thrown during refresh", th2);
                                    lVar3.f58951b.w(th2);
                                }
                            }
                        }, com.google.common.util.concurrent.o.a());
                        if (e12.isDone()) {
                            try {
                                v12 = (V) com.google.common.util.concurrent.s.a(e12);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (v12 != null) {
                        return v12;
                    }
                } catch (Throwable th2) {
                    unlock();
                    D();
                    throw th2;
                }
            }
            return v11;
        }

        final void F(j<K, V> jVar, K k11, V v11, long j11) {
            y<K, V> a11 = jVar.a();
            f<K, V> fVar = this.f58966a;
            fVar.f58897j.getClass();
            jVar.e(fVar.f58895h.b(1, this, jVar, v11));
            b();
            this.f58968c++;
            if (fVar.c()) {
                jVar.g(j11);
            }
            if (fVar.e() || fVar.f58900m > 0) {
                jVar.i(j11);
            }
            this.f58978m.add(jVar);
            this.f58977l.add(jVar);
            a11.a(v11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void G(Object obj, int i11, l lVar, Object obj2) {
            Throwable th2;
            long a11;
            int i12;
            AtomicReferenceArray<j<K, V>> atomicReferenceArray;
            int length;
            j jVar;
            j jVar2;
            V v11;
            K k11;
            j e11;
            p<K, V> pVar;
            Throwable th3;
            lock();
            try {
                a11 = this.f58966a.f58903p.a();
                C(a11);
                i12 = this.f58967b + 1;
                if (i12 > this.f58970e) {
                    try {
                        g();
                        i12 = this.f58967b + 1;
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                atomicReferenceArray = this.f58971f;
                length = i11 & (atomicReferenceArray.length() - 1);
                jVar = atomicReferenceArray.get(length);
                jVar2 = jVar;
                k11 = obj;
                v11 = obj2;
            } catch (Throwable th5) {
                th = th5;
            }
            while (jVar2 != null) {
                try {
                    K key = jVar2.getKey();
                    if (jVar2.n() == i11 && key != null && this.f58966a.f58892e.e(k11, key)) {
                        y<K, V> a12 = jVar2.a();
                        V v12 = a12.get();
                        if (lVar != a12 && (v12 != null || a12 == f.f58886w)) {
                            e(k11, v11, 0, com.google.common.cache.k.REPLACED);
                            unlock();
                            D();
                            return;
                        }
                        this.f58969d++;
                        try {
                            if (lVar.f58950a.isActive()) {
                                e(k11, v12, lVar.f58950a.getWeight(), v12 == null ? com.google.common.cache.k.COLLECTED : com.google.common.cache.k.REPLACED);
                                i12--;
                            }
                            try {
                                F(jVar2, k11, v11, a11);
                                pVar = this;
                                pVar.f58967b = i12;
                                f(jVar2);
                                unlock();
                                D();
                                return;
                            } catch (Throwable th6) {
                                th3 = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            pVar = this;
                        }
                    } else {
                        K k12 = k11;
                        V v13 = v11;
                        pVar = this;
                        try {
                            jVar2 = jVar2.h();
                            k11 = k12;
                            v11 = v13;
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                    th = th8;
                } catch (Throwable th9) {
                    th = th9;
                    pVar = this;
                }
                th3 = th;
                th2 = th3;
                unlock();
                D();
                throw th2;
            }
            K k13 = k11;
            V v14 = v11;
            try {
                this.f58969d++;
                EnumC0895f enumC0895f = this.f58966a.f58904q;
                k13.getClass();
                e11 = enumC0895f.e(i11, this, jVar, k13);
            } catch (Throwable th10) {
                th = th10;
            }
            try {
                F(e11, k13, v14, a11);
                atomicReferenceArray.set(length, e11);
                this.f58967b = i12;
                f(e11);
                unlock();
                D();
            } catch (Throwable th11) {
                th = th11;
                th2 = th;
                unlock();
                D();
                throw th2;
            }
        }

        final void H() {
            if (tryLock()) {
                try {
                    d();
                } finally {
                    unlock();
                }
            }
        }

        final Object I(j jVar, String str, y yVar) throws ExecutionException {
            a aVar = this.f58979n;
            if (!yVar.isLoading()) {
                throw new AssertionError();
            }
            k0.k(str, "Recursive load of: %s", !Thread.holdsLock(jVar));
            try {
                Object b11 = yVar.b();
                if (b11 != null) {
                    u(jVar, this.f58966a.f58903p.a());
                    return b11;
                }
                throw new d.a("CacheLoader returned null for key " + ((Object) str) + ".");
            } finally {
                aVar.c();
            }
        }

        final j<K, V> a(j<K, V> jVar, j<K, V> jVar2) {
            K key = jVar.getKey();
            if (key == null) {
                return null;
            }
            y<K, V> a11 = jVar.a();
            V v11 = a11.get();
            if (v11 == null && a11.isActive()) {
                return null;
            }
            j<K, V> b11 = this.f58966a.f58904q.b(this, jVar, jVar2, key);
            b11.e(a11.c(this.f58974i, v11, b11));
            return b11;
        }

        final void b() {
            while (true) {
                j jVar = (j) this.f58975j.poll();
                if (jVar == null) {
                    return;
                }
                AbstractQueue abstractQueue = this.f58978m;
                if (abstractQueue.contains(jVar)) {
                    abstractQueue.add(jVar);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00f6, code lost:
        
            if (r4.isHeldByCurrentThread() == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
        
            r4.D();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
        
            r2 = r2 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
        
            if (r4.isHeldByCurrentThread() == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
        
            if (r4.isHeldByCurrentThread() == false) goto L45;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void d() {
            p<K, V> pVar;
            int i11 = 0;
            if (this.f58966a.f58894g != r.STRONG) {
                int i12 = 0;
                do {
                    Reference<? extends K> poll = this.f58973h.poll();
                    if (poll == null) {
                        break;
                    }
                    j<K, V> jVar = (j) poll;
                    f<K, V> fVar = this.f58966a;
                    fVar.getClass();
                    int n11 = jVar.n();
                    p<K, V> j11 = fVar.j(n11);
                    j11.lock();
                    try {
                        AtomicReferenceArray<j<K, V>> atomicReferenceArray = j11.f58971f;
                        int length = n11 & (atomicReferenceArray.length() - 1);
                        j<K, V> jVar2 = atomicReferenceArray.get(length);
                        j<K, V> jVar3 = jVar2;
                        while (true) {
                            if (jVar3 == null) {
                                break;
                            }
                            if (jVar3 == jVar) {
                                j11.f58969d++;
                                j<K, V> B11 = j11.B(jVar2, jVar3, jVar3.getKey(), jVar3.a().get(), jVar3.a(), com.google.common.cache.k.COLLECTED);
                                int i13 = j11.f58967b - 1;
                                atomicReferenceArray.set(length, B11);
                                j11.f58967b = i13;
                                break;
                            }
                            jVar3 = jVar3.h();
                        }
                        i12++;
                    } finally {
                        j11.unlock();
                        j11.D();
                    }
                } while (i12 != 16);
            }
            if (this.f58966a.f58895h != r.STRONG) {
                do {
                    Reference<? extends V> poll2 = this.f58974i.poll();
                    if (poll2 == null) {
                        return;
                    }
                    y<K, V> yVar = (y) poll2;
                    f<K, V> fVar2 = this.f58966a;
                    fVar2.getClass();
                    j<K, V> d11 = yVar.d();
                    int n12 = d11.n();
                    p<K, V> j12 = fVar2.j(n12);
                    K key = d11.getKey();
                    j12.lock();
                    try {
                        AtomicReferenceArray<j<K, V>> atomicReferenceArray2 = j12.f58971f;
                        int length2 = n12 & (atomicReferenceArray2.length() - 1);
                        j<K, V> jVar4 = atomicReferenceArray2.get(length2);
                        int i14 = n12;
                        pVar = j12;
                        j<K, V> jVar5 = jVar4;
                        while (jVar5 != null) {
                            int i15 = i14;
                            try {
                                K key2 = jVar5.getKey();
                                if (jVar5.n() != i15 || key2 == null || !pVar.f58966a.f58892e.e(key, key2)) {
                                    jVar5 = jVar5.h();
                                    i14 = i15;
                                } else if (jVar5.a() == yVar) {
                                    pVar.f58969d++;
                                    j<K, V> B12 = pVar.B(jVar4, jVar5, key2, yVar.get(), yVar, com.google.common.cache.k.COLLECTED);
                                    int i16 = pVar.f58967b - 1;
                                    atomicReferenceArray2.set(length2, B12);
                                    pVar.f58967b = i16;
                                    pVar.unlock();
                                } else {
                                    pVar.unlock();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                pVar.unlock();
                                if (!pVar.isHeldByCurrentThread()) {
                                    pVar.D();
                                }
                                throw th;
                            }
                        }
                        pVar.unlock();
                    } catch (Throwable th3) {
                        th = th3;
                        pVar = j12;
                    }
                } while (i11 != 16);
            }
        }

        final void e(Object obj, Object obj2, int i11, com.google.common.cache.k kVar) {
            this.f58968c -= i11;
            if (kVar.a()) {
                this.f58979n.a();
            }
            f<K, V> fVar = this.f58966a;
            if (fVar.f58901n != f.f58887x) {
                fVar.f58901n.offer(new com.google.common.cache.m(obj, obj2));
            }
        }

        final void f(j<K, V> jVar) {
            if (this.f58966a.b()) {
                b();
                long weight = jVar.a().getWeight();
                long j11 = this.f58972g;
                if (weight > j11 && !y(jVar, jVar.n(), com.google.common.cache.k.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f58968c > j11) {
                    for (j<K, V> jVar2 : this.f58978m) {
                        if (jVar2.a().getWeight() > 0) {
                            if (!y(jVar2, jVar2.n(), com.google.common.cache.k.SIZE)) {
                                throw new AssertionError();
                            }
                        }
                    }
                    throw new AssertionError();
                }
            }
        }

        final void g() {
            AtomicReferenceArray<j<K, V>> atomicReferenceArray = this.f58971f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i11 = this.f58967b;
            AtomicReferenceArray<j<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
            this.f58970e = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i12 = 0; i12 < length; i12++) {
                j<K, V> jVar = atomicReferenceArray.get(i12);
                if (jVar != null) {
                    j<K, V> h11 = jVar.h();
                    int n11 = jVar.n() & length2;
                    if (h11 == null) {
                        atomicReferenceArray2.set(n11, jVar);
                    } else {
                        j<K, V> jVar2 = jVar;
                        while (h11 != null) {
                            int n12 = h11.n() & length2;
                            if (n12 != n11) {
                                jVar2 = h11;
                                n11 = n12;
                            }
                            h11 = h11.h();
                        }
                        atomicReferenceArray2.set(n11, jVar2);
                        while (jVar != jVar2) {
                            int n13 = jVar.n() & length2;
                            j<K, V> a11 = a(jVar, atomicReferenceArray2.get(n13));
                            if (a11 != null) {
                                atomicReferenceArray2.set(n13, a11);
                            } else {
                                v(jVar);
                                i11--;
                            }
                            jVar = jVar.h();
                        }
                    }
                }
            }
            this.f58971f = atomicReferenceArray2;
            this.f58967b = i11;
        }

        final void h(long j11) {
            j<K, V> jVar;
            j<K, V> jVar2;
            b();
            do {
                jVar = (j) this.f58977l.peek();
                f<K, V> fVar = this.f58966a;
                if (jVar == null || !fVar.i(jVar, j11)) {
                    do {
                        jVar2 = (j) this.f58978m.peek();
                        if (jVar2 == null || !fVar.i(jVar2, j11)) {
                            return;
                        }
                    } while (y(jVar2, jVar2.n(), com.google.common.cache.k.EXPIRED));
                    throw new AssertionError();
                }
            } while (y(jVar, jVar.n(), com.google.common.cache.k.EXPIRED));
            throw new AssertionError();
        }

        final V i(K k11, int i11, l<K, V> lVar, com.google.common.util.concurrent.m<V> mVar) throws ExecutionException {
            V v11;
            a aVar = this.f58979n;
            try {
                v11 = (V) com.google.common.util.concurrent.s.a(mVar);
            } catch (Throwable th2) {
                th = th2;
                v11 = null;
            }
            try {
                if (v11 != null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    aVar.b(lVar.f58952c.b());
                    G(k11, i11, lVar, v11);
                    return v11;
                }
                throw new d.a("CacheLoader returned null for key " + k11 + ".");
            } catch (Throwable th3) {
                th = th3;
                if (v11 == null) {
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    aVar.d(lVar.f58952c.b());
                    lock();
                    try {
                        AtomicReferenceArray<j<K, V>> atomicReferenceArray = this.f58971f;
                        int length = (atomicReferenceArray.length() - 1) & i11;
                        j<K, V> jVar = atomicReferenceArray.get(length);
                        j<K, V> jVar2 = jVar;
                        while (true) {
                            if (jVar2 == null) {
                                break;
                            }
                            K key = jVar2.getKey();
                            if (jVar2.n() != i11 || key == null || !this.f58966a.f58892e.e(k11, key)) {
                                jVar2 = jVar2.h();
                            } else if (jVar2.a() == lVar) {
                                if (lVar.f58950a.isActive()) {
                                    jVar2.e(lVar.f58950a);
                                } else {
                                    atomicReferenceArray.set(length, A(jVar, jVar2));
                                }
                            }
                        }
                        unlock();
                        D();
                    } catch (Throwable th4) {
                        unlock();
                        D();
                        throw th4;
                    }
                }
                throw th;
            }
        }

        final j j(int i11, Object obj) {
            for (j<K, V> jVar = this.f58971f.get((r0.length() - 1) & i11); jVar != null; jVar = jVar.h()) {
                if (jVar.n() == i11) {
                    K key = jVar.getKey();
                    if (key == null) {
                        H();
                    } else if (this.f58966a.f58892e.e(obj, key)) {
                        return jVar;
                    }
                }
            }
            return null;
        }

        final V l(j<K, V> jVar, long j11) {
            if (jVar.getKey() == null) {
                H();
                return null;
            }
            V v11 = jVar.a().get();
            if (v11 == null) {
                H();
                return null;
            }
            if (!this.f58966a.i(jVar, j11)) {
                return v11;
            }
            if (!tryLock()) {
                return null;
            }
            try {
                h(j11);
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
        
            if (r6 == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
        
            r11 = new com.google.common.cache.f.l<>();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
        
            if (r10 != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
        
            r3 = r16.f58966a.f58904q;
            r17.getClass();
            r10 = r3.e(r18, r16, r9, r17);
            r10.e(r11);
            r7.set(r8, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
        
            r10.e(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
        
            unlock();
            D();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
        
            if (r6 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:
        
            return I(r10, r17, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
        
            r0 = i(r17, r18, r11, r11.e(r17, r19));
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
        
            monitor-exit(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
        
            r16.f58979n.c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
        
            throw r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final Object m(String str, int i11, d dVar) throws ExecutionException {
            y<K, V> yVar;
            lock();
            try {
                long a11 = this.f58966a.f58903p.a();
                C(a11);
                boolean z11 = true;
                int i12 = this.f58967b - 1;
                AtomicReferenceArray<j<K, V>> atomicReferenceArray = this.f58971f;
                int length = (atomicReferenceArray.length() - 1) & i11;
                j jVar = atomicReferenceArray.get(length);
                j jVar2 = jVar;
                while (true) {
                    l<K, V> lVar = null;
                    if (jVar2 == null) {
                        yVar = null;
                        break;
                    }
                    K key = jVar2.getKey();
                    if (jVar2.n() == i11 && key != null && this.f58966a.f58892e.e(str, key)) {
                        yVar = jVar2.a();
                        if (yVar.isLoading()) {
                            z11 = false;
                        } else {
                            V v11 = yVar.get();
                            if (v11 == null) {
                                e(key, v11, yVar.getWeight(), com.google.common.cache.k.COLLECTED);
                            } else {
                                if (!this.f58966a.i(jVar2, a11)) {
                                    s(jVar2, a11);
                                    this.f58979n.e();
                                    unlock();
                                    D();
                                    return v11;
                                }
                                e(key, v11, yVar.getWeight(), com.google.common.cache.k.EXPIRED);
                            }
                            this.f58977l.remove(jVar2);
                            this.f58978m.remove(jVar2);
                            this.f58967b = i12;
                        }
                    } else {
                        jVar2 = jVar2.h();
                    }
                }
            } catch (Throwable th2) {
                unlock();
                D();
                throw th2;
            }
        }

        final void n() {
            if ((this.f58976k.incrementAndGet() & 63) == 0) {
                C(this.f58966a.f58903p.a());
                D();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            r10 = r2.a();
            r0 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (r0 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            r9.f58969d++;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        
            if (r10.isActive() == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            e(r11, r0, r10.getWeight(), com.google.common.cache.k.COLLECTED);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        
            r1 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        
            r1.F(r2, r11, r12, r5);
            r10 = r1.f58967b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        
            r1.f58967b = r10;
            f(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        
            unlock();
            D();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        
            r1 = r9;
            r1.F(r2, r11, r12, r5);
            r10 = r1.f58967b + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
        
            r3 = r11;
            r4 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        
            if (r13 == false) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        
            s(r2, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        
            unlock();
            D();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
        
            r9.f58969d++;
            e(r3, r0, r10.getWeight(), com.google.common.cache.k.REPLACED);
            F(r2, r3, r4, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        
            r11 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        
            f(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
        
            unlock();
            D();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final Object p(int i11, Object obj, Object obj2, boolean z11) {
            Throwable th2;
            long a11;
            AtomicReferenceArray<j<K, V>> atomicReferenceArray;
            int length;
            j jVar;
            j jVar2;
            V v11;
            K k11;
            p<K, V> pVar;
            lock();
            try {
                a11 = this.f58966a.f58903p.a();
                C(a11);
                if (this.f58967b + 1 > this.f58970e) {
                    try {
                        g();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                atomicReferenceArray = this.f58971f;
                length = i11 & (atomicReferenceArray.length() - 1);
                jVar = atomicReferenceArray.get(length);
                jVar2 = jVar;
                k11 = obj;
                v11 = obj2;
            } catch (Throwable th4) {
                th = th4;
            }
            while (true) {
                try {
                } catch (Throwable th5) {
                    th = th5;
                }
                if (jVar2 != null) {
                    try {
                        K key = jVar2.getKey();
                        if (jVar2.n() == i11 && key != null && this.f58966a.f58892e.e(k11, key)) {
                            break;
                        }
                        K k12 = k11;
                        V v12 = v11;
                        pVar = this;
                        try {
                            jVar2 = jVar2.h();
                            k11 = k12;
                            v11 = v12;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        th = th6;
                    } catch (Throwable th7) {
                        th = th7;
                        pVar = this;
                    }
                    th2 = th;
                    unlock();
                    D();
                    throw th2;
                }
                K k13 = k11;
                V v13 = v11;
                try {
                    this.f58969d++;
                    j e11 = this.f58966a.f58904q.e(i11, this, jVar, k13);
                    F(e11, k13, v13, a11);
                    atomicReferenceArray.set(length, e11);
                    this.f58967b++;
                    f(e11);
                    unlock();
                    D();
                    return null;
                } catch (Throwable th8) {
                    th = th8;
                }
                th2 = th;
                unlock();
                D();
                throw th2;
            }
        }

        final void s(j<K, V> jVar, long j11) {
            if (this.f58966a.c()) {
                jVar.g(j11);
            }
            this.f58978m.add(jVar);
        }

        final void u(j<K, V> jVar, long j11) {
            if (this.f58966a.c()) {
                jVar.g(j11);
            }
            this.f58975j.add(jVar);
        }

        final void v(j<K, V> jVar) {
            K key = jVar.getKey();
            jVar.n();
            e(key, jVar.a().get(), jVar.a().getWeight(), com.google.common.cache.k.COLLECTED);
            this.f58977l.remove(jVar);
            this.f58978m.remove(jVar);
        }

        final boolean y(j<K, V> jVar, int i11, com.google.common.cache.k kVar) {
            AtomicReferenceArray<j<K, V>> atomicReferenceArray = this.f58971f;
            int length = i11 & (atomicReferenceArray.length() - 1);
            j<K, V> jVar2 = atomicReferenceArray.get(length);
            for (j<K, V> jVar3 = jVar2; jVar3 != null; jVar3 = jVar3.h()) {
                if (jVar3 == jVar) {
                    this.f58969d++;
                    j<K, V> B11 = B(jVar2, jVar3, jVar3.getKey(), jVar3.a().get(), jVar3.a(), kVar);
                    int i12 = this.f58967b - 1;
                    atomicReferenceArray.set(length, B11);
                    this.f58967b = i12;
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes9.dex */
    static class q<K, V> extends SoftReference<V> implements y<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final j<K, V> f58980a;

        q(ReferenceQueue<V> referenceQueue, V v11, j<K, V> jVar) {
            super(v11, referenceQueue);
            this.f58980a = jVar;
        }

        @Override // com.google.common.cache.f.y
        public final void a(V v11) {
        }

        @Override // com.google.common.cache.f.y
        public final V b() {
            return get();
        }

        public y<K, V> c(ReferenceQueue<V> referenceQueue, V v11, j<K, V> jVar) {
            return new q(referenceQueue, v11, jVar);
        }

        @Override // com.google.common.cache.f.y
        public final j<K, V> d() {
            return this.f58980a;
        }

        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.f.y
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.f.y
        public final boolean isLoading() {
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class r {
        private static final /* synthetic */ r[] $VALUES;
        public static final r SOFT;
        public static final r STRONG;
        public static final r WEAK;

        enum a extends r {
            a() {
                super("STRONG", 0);
            }

            @Override // com.google.common.cache.f.r
            final O7.d<Object> a() {
                return O7.d.d();
            }

            @Override // com.google.common.cache.f.r
            final y b(int i11, p pVar, j jVar, Object obj) {
                return i11 == 1 ? new v(obj) : new G(obj, i11);
            }
        }

        enum b extends r {
            b() {
                super("SOFT", 1);
            }

            @Override // com.google.common.cache.f.r
            final O7.d<Object> a() {
                return O7.d.g();
            }

            @Override // com.google.common.cache.f.r
            final y b(int i11, p pVar, j jVar, Object obj) {
                return i11 == 1 ? new q(pVar.f58974i, obj, jVar) : new F(i11, jVar, obj, pVar.f58974i);
            }
        }

        enum c extends r {
            c() {
                super("WEAK", 2);
            }

            @Override // com.google.common.cache.f.r
            final O7.d<Object> a() {
                return O7.d.g();
            }

            @Override // com.google.common.cache.f.r
            final y b(int i11, p pVar, j jVar, Object obj) {
                return i11 == 1 ? new D(pVar.f58974i, obj, jVar) : new H(i11, jVar, obj, pVar.f58974i);
            }
        }

        static {
            a aVar = new a();
            STRONG = aVar;
            b bVar = new b();
            SOFT = bVar;
            c cVar = new c();
            WEAK = cVar;
            $VALUES = new r[]{aVar, bVar, cVar};
        }

        private r() {
            throw null;
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) $VALUES.clone();
        }

        abstract O7.d<Object> a();

        abstract y b(int i11, p pVar, j jVar, Object obj);
    }

    static final class s<K, V> extends u<K, V> {

        /* renamed from: e, reason: collision with root package name */
        volatile long f58981e;

        /* renamed from: f, reason: collision with root package name */
        j<K, V> f58982f;

        /* renamed from: g, reason: collision with root package name */
        j<K, V> f58983g;

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void b(j<K, V> jVar) {
            this.f58983g = jVar;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void g(long j11) {
            this.f58981e = j11;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final j<K, V> j() {
            return this.f58983g;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final j<K, V> m() {
            return this.f58982f;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final long p() {
            return this.f58981e;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void s(j<K, V> jVar) {
            this.f58982f = jVar;
        }
    }

    /* loaded from: classes9.dex */
    static final class t<K, V> extends u<K, V> {

        /* renamed from: e, reason: collision with root package name */
        volatile long f58984e;

        /* renamed from: f, reason: collision with root package name */
        j<K, V> f58985f;

        /* renamed from: g, reason: collision with root package name */
        j<K, V> f58986g;

        /* renamed from: h, reason: collision with root package name */
        volatile long f58987h;

        /* renamed from: i, reason: collision with root package name */
        j<K, V> f58988i;

        /* renamed from: j, reason: collision with root package name */
        j<K, V> f58989j;

        t(K k11, int i11, j<K, V> jVar) {
            super(k11, i11, jVar);
            this.f58984e = Long.MAX_VALUE;
            o oVar = o.INSTANCE;
            this.f58985f = oVar;
            this.f58986g = oVar;
            this.f58987h = Long.MAX_VALUE;
            this.f58988i = oVar;
            this.f58989j = oVar;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void b(j<K, V> jVar) {
            this.f58986g = jVar;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final j<K, V> d() {
            return this.f58989j;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final long f() {
            return this.f58987h;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void g(long j11) {
            this.f58984e = j11;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void i(long j11) {
            this.f58987h = j11;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final j<K, V> j() {
            return this.f58986g;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final j<K, V> l() {
            return this.f58988i;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final j<K, V> m() {
            return this.f58985f;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final long p() {
            return this.f58984e;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void s(j<K, V> jVar) {
            this.f58985f = jVar;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void u(j<K, V> jVar) {
            this.f58988i = jVar;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void v(j<K, V> jVar) {
            this.f58989j = jVar;
        }
    }

    static class u<K, V> extends AbstractC5851d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f58990a;

        /* renamed from: b, reason: collision with root package name */
        final int f58991b;

        /* renamed from: c, reason: collision with root package name */
        final j<K, V> f58992c;

        /* renamed from: d, reason: collision with root package name */
        volatile y<K, V> f58993d = f.f58886w;

        u(K k11, int i11, j<K, V> jVar) {
            this.f58990a = k11;
            this.f58991b = i11;
            this.f58992c = jVar;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final y<K, V> a() {
            return this.f58993d;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void e(y<K, V> yVar) {
            this.f58993d = yVar;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final K getKey() {
            return this.f58990a;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final j<K, V> h() {
            return this.f58992c;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final int n() {
            return this.f58991b;
        }
    }

    static class v<K, V> implements y<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final V f58994a;

        v(V v11) {
            this.f58994a = v11;
        }

        @Override // com.google.common.cache.f.y
        public final void a(V v11) {
        }

        @Override // com.google.common.cache.f.y
        public final V b() {
            return this.f58994a;
        }

        @Override // com.google.common.cache.f.y
        public final y<K, V> c(ReferenceQueue<V> referenceQueue, V v11, j<K, V> jVar) {
            return this;
        }

        @Override // com.google.common.cache.f.y
        public final j<K, V> d() {
            return null;
        }

        @Override // com.google.common.cache.f.y
        public final V get() {
            return this.f58994a;
        }

        @Override // com.google.common.cache.f.y
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.f.y
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.f.y
        public final boolean isLoading() {
            return false;
        }
    }

    /* loaded from: classes9.dex */
    static final class w<K, V> extends u<K, V> {

        /* renamed from: e, reason: collision with root package name */
        volatile long f58995e;

        /* renamed from: f, reason: collision with root package name */
        j<K, V> f58996f;

        /* renamed from: g, reason: collision with root package name */
        j<K, V> f58997g;

        w(K k11, int i11, j<K, V> jVar) {
            super(k11, i11, jVar);
            this.f58995e = Long.MAX_VALUE;
            o oVar = o.INSTANCE;
            this.f58996f = oVar;
            this.f58997g = oVar;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final j<K, V> d() {
            return this.f58997g;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final long f() {
            return this.f58995e;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void i(long j11) {
            this.f58995e = j11;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final j<K, V> l() {
            return this.f58996f;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void u(j<K, V> jVar) {
            this.f58996f = jVar;
        }

        @Override // com.google.common.cache.f.AbstractC5851d, com.google.common.cache.j
        public final void v(j<K, V> jVar) {
            this.f58997g = jVar;
        }
    }

    /* loaded from: classes9.dex */
    final class x extends f<K, V>.AbstractC5855i<V> {
        @Override // com.google.common.cache.f.AbstractC5855i, java.util.Iterator
        public final V next() {
            return c().f58933b;
        }
    }

    interface y<K, V> {
        void a(V v11);

        V b() throws ExecutionException;

        y<K, V> c(ReferenceQueue<V> referenceQueue, V v11, j<K, V> jVar);

        j<K, V> d();

        V get();

        int getWeight();

        boolean isActive();

        boolean isLoading();
    }

    /* loaded from: classes9.dex */
    final class z extends AbstractCollection<V> {
        z() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return f.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return f.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new x();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return f.this.size();
        }
    }

    f(c cVar) {
        int i11 = cVar.f58871b;
        this.f58891d = Math.min(i11 == -1 ? 4 : i11, 65536);
        r rVar = cVar.f58875f;
        r rVar2 = r.STRONG;
        r rVar3 = (r) O7.g.a(rVar, rVar2);
        this.f58894g = rVar3;
        this.f58895h = (r) O7.g.a(cVar.f58876g, rVar2);
        this.f58892e = (O7.d) O7.g.a(cVar.f58879j, ((r) O7.g.a(cVar.f58875f, rVar2)).a());
        this.f58893f = (O7.d) O7.g.a(cVar.f58880k, ((r) O7.g.a(cVar.f58876g, rVar2)).a());
        long j11 = (cVar.f58877h == 0 || cVar.f58878i == 0) ? 0L : cVar.f58874e == null ? cVar.f58872c : cVar.f58873d;
        this.f58896i = j11;
        com.google.common.cache.n<? super K, ? super V> nVar = cVar.f58874e;
        c.e eVar = c.e.INSTANCE;
        com.google.common.cache.n<K, V> nVar2 = (com.google.common.cache.n) O7.g.a(nVar, eVar);
        this.f58897j = nVar2;
        long j12 = cVar.f58878i;
        this.f58898k = j12 == -1 ? 0L : j12;
        long j13 = cVar.f58877h;
        this.f58899l = j13 == -1 ? 0L : j13;
        this.f58900m = 0L;
        com.google.common.cache.l<? super K, ? super V> lVar = cVar.f58881l;
        c.d dVar = c.d.INSTANCE;
        com.google.common.cache.l<K, V> lVar2 = (com.google.common.cache.l) O7.g.a(lVar, dVar);
        this.f58902o = lVar2;
        this.f58901n = (AbstractQueue) (lVar2 == dVar ? f58887x : new ConcurrentLinkedQueue());
        int i12 = 0;
        boolean z11 = (e() || (0L > 0L ? 1 : (0L == 0L ? 0 : -1)) > 0) || c();
        O7.s sVar = cVar.f58882m;
        this.f58903p = sVar == null ? z11 ? O7.s.b() : c.f58869p : sVar;
        this.f58904q = EnumC0895f.factories[(rVar3 != r.WEAK ? (char) 0 : (char) 4) | ((c() || b() || c()) ? (char) 1 : (char) 0) | (e() || e() || (0L > 0L ? 1 : (0L == 0L ? 0 : -1)) > 0 ? 2 : 0)];
        O7.p<? extends a> pVar = cVar.f58883n;
        this.f58905r = pVar.get();
        int min = Math.min(16, 1073741824);
        if (b() && nVar2 == eVar) {
            min = (int) Math.min(min, j11);
        }
        int i13 = 0;
        int i14 = 1;
        while (i14 < this.f58891d && (!b() || i14 * 20 <= this.f58896i)) {
            i13++;
            i14 <<= 1;
        }
        this.f58889b = 32 - i13;
        this.f58888a = i14 - 1;
        this.f58890c = new p[i14];
        int i15 = min / i14;
        int i16 = 1;
        while (i16 < (i15 * i14 < min ? i15 + 1 : i15)) {
            i16 <<= 1;
        }
        if (b()) {
            long j14 = this.f58896i;
            long j15 = i14;
            long j16 = (j14 / j15) + 1;
            long j17 = j14 % j15;
            while (true) {
                p<K, V>[] pVarArr = this.f58890c;
                if (i12 >= pVarArr.length) {
                    return;
                }
                if (i12 == j17) {
                    j16--;
                }
                pVarArr[i12] = new p<>(this, i16, j16, pVar.get());
                i12++;
            }
        } else {
            while (true) {
                p<K, V>[] pVarArr2 = this.f58890c;
                if (i12 >= pVarArr2.length) {
                    return;
                }
                pVarArr2[i12] = new p<>(this, i16, -1L, pVar.get());
                i12++;
            }
        }
    }

    final boolean b() {
        return this.f58896i >= 0;
    }

    final boolean c() {
        return this.f58898k > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        com.google.common.cache.k kVar;
        for (p<K, V> pVar : this.f58890c) {
            if (pVar.f58967b != 0) {
                pVar.lock();
                try {
                    pVar.C(pVar.f58966a.f58903p.a());
                    AtomicReferenceArray<j<K, V>> atomicReferenceArray = pVar.f58971f;
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        for (j<K, V> jVar = atomicReferenceArray.get(i11); jVar != null; jVar = jVar.h()) {
                            if (jVar.a().isActive()) {
                                K key = jVar.getKey();
                                V v11 = jVar.a().get();
                                if (key != null && v11 != null) {
                                    kVar = com.google.common.cache.k.EXPLICIT;
                                    jVar.n();
                                    pVar.e(key, v11, jVar.a().getWeight(), kVar);
                                }
                                kVar = com.google.common.cache.k.COLLECTED;
                                jVar.n();
                                pVar.e(key, v11, jVar.a().getWeight(), kVar);
                            }
                        }
                    }
                    for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                        atomicReferenceArray.set(i12, null);
                    }
                    f<K, V> fVar = pVar.f58966a;
                    if (fVar.f58894g != r.STRONG) {
                        while (pVar.f58973h.poll() != null) {
                        }
                    }
                    if (fVar.f58895h != r.STRONG) {
                        while (pVar.f58974i.poll() != null) {
                        }
                    }
                    pVar.f58977l.clear();
                    pVar.f58978m.clear();
                    pVar.f58976k.set(0);
                    pVar.f58969d++;
                    pVar.f58967b = 0;
                    pVar.unlock();
                    pVar.D();
                } catch (Throwable th2) {
                    pVar.unlock();
                    pVar.D();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:7:0x000f, B:9:0x0013, B:16:0x0044, B:21:0x0023, B:23:0x002b, B:27:0x0034, B:30:0x003a, B:31:0x003d, B:26:0x0031), top: B:6:0x000f, inners: #1 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int h11 = h(obj);
        p<K, V> j11 = j(h11);
        j11.getClass();
        try {
            if (j11.f58967b == 0) {
                return false;
            }
            long a11 = j11.f58966a.f58903p.a();
            j<K, V> j12 = j11.j(h11, obj);
            if (j12 != null) {
                if (j11.f58966a.i(j12, a11)) {
                    if (j11.tryLock()) {
                        try {
                            j11.h(a11);
                        } finally {
                            j11.unlock();
                        }
                    }
                }
                if (j12 != null) {
                    return false;
                }
                return j12.a().get() != null;
            }
            j12 = null;
            if (j12 != null) {
            }
        } finally {
            j11.n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        boolean z11 = false;
        if (obj == null) {
            return false;
        }
        long a11 = this.f58903p.a();
        p<K, V>[] pVarArr = this.f58890c;
        long j11 = -1;
        int i11 = 0;
        while (i11 < 3) {
            int length = pVarArr.length;
            long j12 = 0;
            for (?? r12 = z11; r12 < length; r12++) {
                p<K, V> pVar = pVarArr[r12];
                int i12 = pVar.f58967b;
                AtomicReferenceArray<j<K, V>> atomicReferenceArray = pVar.f58971f;
                boolean z12 = z11;
                for (?? r15 = z12; r15 < atomicReferenceArray.length(); r15++) {
                    j<K, V> jVar = atomicReferenceArray.get(r15);
                    while (jVar != null) {
                        p<K, V>[] pVarArr2 = pVarArr;
                        V l11 = pVar.l(jVar, a11);
                        j<K, V> jVar2 = jVar;
                        if (l11 != null && this.f58893f.e(obj, l11)) {
                            return true;
                        }
                        jVar = jVar2.h();
                        pVarArr = pVarArr2;
                    }
                }
                j12 += pVar.f58969d;
                z11 = z12;
            }
            boolean z13 = z11;
            p<K, V>[] pVarArr3 = pVarArr;
            if (j12 == j11) {
                return z13;
            }
            i11++;
            j11 = j12;
            z11 = z13;
            pVarArr = pVarArr3;
        }
        return z11;
    }

    final boolean e() {
        return this.f58899l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f58908u;
        if (set != null) {
            return set;
        }
        C5854h c5854h = new C5854h();
        this.f58908u = c5854h;
        return c5854h;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[Catch: all -> 0x0064, TRY_ENTER, TryCatch #0 {all -> 0x0064, blocks: (B:7:0x000f, B:9:0x0013, B:16:0x0045, B:18:0x004f, B:21:0x0067, B:22:0x0022, B:24:0x002a, B:28:0x0033, B:31:0x0039, B:32:0x003d, B:27:0x0030), top: B:6:0x000f, inners: #1 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        j<K, V> jVar;
        if (obj == null) {
            return null;
        }
        int h11 = h(obj);
        p<K, V> j11 = j(h11);
        j11.getClass();
        try {
            if (j11.f58967b != 0) {
                long a11 = j11.f58966a.f58903p.a();
                j<K, V> j12 = j11.j(h11, obj);
                if (j12 != null) {
                    if (!j11.f58966a.i(j12, a11)) {
                        jVar = j12;
                        if (jVar != null) {
                            j11.n();
                            return null;
                        }
                        V v11 = jVar.a().get();
                        if (v11 != null) {
                            j11.u(jVar, a11);
                            K key = jVar.getKey();
                            j11.f58966a.getClass();
                            V E11 = j11.E(jVar, key, h11, v11, a11, null);
                            j11.n();
                            return E11;
                        }
                        j11.H();
                    } else if (j11.tryLock()) {
                        try {
                            j11.h(a11);
                        } finally {
                            j11.unlock();
                        }
                    }
                }
                jVar = null;
                if (jVar != null) {
                }
            }
            j11.n();
            return null;
        } catch (Throwable th2) {
            j11.n();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V getOrDefault(Object obj, V v11) {
        V v12 = get(obj);
        return v12 != null ? v12 : v11;
    }

    final int h(Object obj) {
        int f7 = this.f58892e.f(obj);
        int i11 = f7 + ((f7 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = (i14 << 2) + (i14 << 14) + i14;
        return (i15 >>> 16) ^ i15;
    }

    final boolean i(j<K, V> jVar, long j11) {
        jVar.getClass();
        if (!c() || j11 - jVar.p() < this.f58898k) {
            return e() && j11 - jVar.f() >= this.f58899l;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        p<K, V>[] pVarArr = this.f58890c;
        long j11 = 0;
        for (p<K, V> pVar : pVarArr) {
            if (pVar.f58967b != 0) {
                return false;
            }
            j11 += r8.f58969d;
        }
        if (j11 == 0) {
            return true;
        }
        for (p<K, V> pVar2 : pVarArr) {
            if (pVar2.f58967b != 0) {
                return false;
            }
            j11 -= r9.f58969d;
        }
        return j11 == 0;
    }

    final p<K, V> j(int i11) {
        return this.f58890c[(i11 >>> this.f58889b) & this.f58888a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f58906s;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f58906s = kVar;
        return kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k11, V v11) {
        k11.getClass();
        v11.getClass();
        int h11 = h(k11);
        return (V) j(h11).p(h11, k11, v11, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k11, V v11) {
        k11.getClass();
        v11.getClass();
        int h11 = h(k11);
        return (V) j(h11).p(h11, k11, v11, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        com.google.common.cache.k kVar;
        if (obj == null) {
            return null;
        }
        int h11 = h(obj);
        p<K, V> j11 = j(h11);
        j11.lock();
        try {
            j11.C(j11.f58966a.f58903p.a());
            AtomicReferenceArray<j<K, V>> atomicReferenceArray = j11.f58971f;
            int length = h11 & (atomicReferenceArray.length() - 1);
            j<K, V> jVar = atomicReferenceArray.get(length);
            for (j<K, V> jVar2 = jVar; jVar2 != null; jVar2 = jVar2.h()) {
                K key = jVar2.getKey();
                if (jVar2.n() == h11 && key != null && j11.f58966a.f58892e.e(obj, key)) {
                    y<K, V> a11 = jVar2.a();
                    V v11 = a11.get();
                    if (v11 != null) {
                        kVar = com.google.common.cache.k.EXPLICIT;
                    } else {
                        if (!a11.isActive()) {
                            j11.unlock();
                            j11.D();
                            return null;
                        }
                        kVar = com.google.common.cache.k.COLLECTED;
                    }
                    com.google.common.cache.k kVar2 = kVar;
                    j11.f58969d++;
                    j<K, V> B11 = j11.B(jVar, jVar2, key, v11, a11, kVar2);
                    int i11 = j11.f58967b - 1;
                    atomicReferenceArray.set(length, B11);
                    j11.f58967b = i11;
                    j11.unlock();
                    j11.D();
                    return v11;
                }
            }
            j11.unlock();
            j11.D();
            return null;
        } catch (Throwable th2) {
            j11.unlock();
            j11.D();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k11, V v11) {
        k11.getClass();
        v11.getClass();
        int h11 = h(k11);
        p<K, V> j11 = j(h11);
        j11.lock();
        try {
            long a11 = j11.f58966a.f58903p.a();
            j11.C(a11);
            AtomicReferenceArray<j<K, V>> atomicReferenceArray = j11.f58971f;
            int length = h11 & (atomicReferenceArray.length() - 1);
            j<K, V> jVar = atomicReferenceArray.get(length);
            j<K, V> jVar2 = jVar;
            while (jVar2 != null) {
                K key = jVar2.getKey();
                if (jVar2.n() == h11 && key != null && j11.f58966a.f58892e.e(k11, key)) {
                    y<K, V> a12 = jVar2.a();
                    V v12 = a12.get();
                    if (v12 != null) {
                        j<K, V> jVar3 = jVar2;
                        j11.f58969d++;
                        j11.e(k11, v12, a12.getWeight(), com.google.common.cache.k.REPLACED);
                        j11.F(jVar3, k11, v11, a11);
                        j11.f(jVar3);
                        j11.unlock();
                        j11.D();
                        return v12;
                    }
                    if (a12.isActive()) {
                        j11.f58969d++;
                        j<K, V> B11 = j11.B(jVar, jVar2, key, v12, a12, com.google.common.cache.k.COLLECTED);
                        int i11 = j11.f58967b - 1;
                        atomicReferenceArray.set(length, B11);
                        j11.f58967b = i11;
                    }
                    j11.unlock();
                    j11.D();
                    return null;
                }
                V v13 = v11;
                jVar = jVar;
                k11 = k11;
                jVar2 = jVar2.h();
                v11 = v13;
            }
            return null;
        } finally {
            j11.unlock();
            j11.D();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j11 = 0;
        for (int i11 = 0; i11 < this.f58890c.length; i11++) {
            j11 += Math.max(0, r0[i11].f58967b);
        }
        return com.google.common.primitives.b.e(j11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f58907t;
        if (collection != null) {
            return collection;
        }
        z zVar = new z();
        this.f58907t = zVar;
        return zVar;
    }

    static class l<K, V> implements y<K, V> {

        /* renamed from: a, reason: collision with root package name */
        volatile y<K, V> f58950a;

        /* renamed from: b, reason: collision with root package name */
        final com.google.common.util.concurrent.q<V> f58951b;

        /* renamed from: c, reason: collision with root package name */
        final O7.n f58952c;

        public l() {
            this(f.f58886w);
        }

        @Override // com.google.common.cache.f.y
        public final void a(V v11) {
            if (v11 != null) {
                this.f58951b.v(v11);
            } else {
                this.f58950a = f.f58886w;
            }
        }

        @Override // com.google.common.cache.f.y
        public final V b() throws ExecutionException {
            return (V) com.google.common.util.concurrent.s.a(this.f58951b);
        }

        @Override // com.google.common.cache.f.y
        public final y<K, V> c(ReferenceQueue<V> referenceQueue, V v11, j<K, V> jVar) {
            return this;
        }

        @Override // com.google.common.cache.f.y
        public final j<K, V> d() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v7, types: [com.google.common.cache.g] */
        public final com.google.common.util.concurrent.m<V> e(K k11, d<? super K, V> dVar) {
            try {
                this.f58952c.c();
                if (this.f58950a.get() == null) {
                    Object call = ((h) dVar).f59000a.call();
                    return this.f58951b.v(call) ? this.f58951b : com.google.common.util.concurrent.h.c(call);
                }
                dVar.getClass();
                k11.getClass();
                return com.google.common.util.concurrent.h.d(com.google.common.util.concurrent.h.c(((h) dVar).f59000a.call()), new O7.e() { // from class: com.google.common.cache.g
                    @Override // O7.e
                    public final Object apply(Object obj) {
                        f.l.this.f58951b.v(obj);
                        return obj;
                    }
                }, com.google.common.util.concurrent.o.a());
            } catch (Throwable th2) {
                com.google.common.util.concurrent.m<V> b11 = this.f58951b.w(th2) ? this.f58951b : com.google.common.util.concurrent.h.b(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return b11;
            }
        }

        @Override // com.google.common.cache.f.y
        public final V get() {
            return this.f58950a.get();
        }

        @Override // com.google.common.cache.f.y
        public final int getWeight() {
            return this.f58950a.getWeight();
        }

        @Override // com.google.common.cache.f.y
        public final boolean isActive() {
            return this.f58950a.isActive();
        }

        @Override // com.google.common.cache.f.y
        public final boolean isLoading() {
            return true;
        }

        public l(y<K, V> yVar) {
            this.f58951b = com.google.common.util.concurrent.q.x();
            this.f58952c = O7.n.a();
            this.f58950a = yVar;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        com.google.common.cache.k kVar;
        if (obj == null || obj2 == null) {
            return false;
        }
        int h11 = h(obj);
        p<K, V> j11 = j(h11);
        j11.lock();
        try {
            j11.C(j11.f58966a.f58903p.a());
            AtomicReferenceArray<j<K, V>> atomicReferenceArray = j11.f58971f;
            int length = h11 & (atomicReferenceArray.length() - 1);
            j<K, V> jVar = atomicReferenceArray.get(length);
            for (j<K, V> jVar2 = jVar; jVar2 != null; jVar2 = jVar2.h()) {
                K key = jVar2.getKey();
                if (jVar2.n() == h11 && key != null && j11.f58966a.f58892e.e(obj, key)) {
                    y<K, V> a11 = jVar2.a();
                    V v11 = a11.get();
                    if (j11.f58966a.f58893f.e(obj2, v11)) {
                        kVar = com.google.common.cache.k.EXPLICIT;
                    } else if (v11 == null && a11.isActive()) {
                        kVar = com.google.common.cache.k.COLLECTED;
                    } else {
                        j11.unlock();
                        j11.D();
                        return false;
                    }
                    com.google.common.cache.k kVar2 = kVar;
                    j11.f58969d++;
                    j<K, V> B11 = j11.B(jVar, jVar2, key, v11, a11, kVar2);
                    int i11 = j11.f58967b - 1;
                    atomicReferenceArray.set(length, B11);
                    j11.f58967b = i11;
                    boolean z11 = kVar2 == com.google.common.cache.k.EXPLICIT;
                    j11.unlock();
                    j11.D();
                    return z11;
                }
            }
            j11.unlock();
            j11.D();
            return false;
        } catch (Throwable th2) {
            j11.unlock();
            j11.D();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k11, V v11, V v12) {
        K k12 = k11;
        k12.getClass();
        v12.getClass();
        if (v11 == null) {
            return false;
        }
        int h11 = h(k11);
        p<K, V> j11 = j(h11);
        j11.lock();
        try {
            long a11 = j11.f58966a.f58903p.a();
            j11.C(a11);
            AtomicReferenceArray<j<K, V>> atomicReferenceArray = j11.f58971f;
            int length = (atomicReferenceArray.length() - 1) & h11;
            j<K, V> jVar = atomicReferenceArray.get(length);
            int i11 = length;
            while (jVar != null) {
                int i12 = i11;
                K key = jVar.getKey();
                if (jVar.n() == h11 && key != null && j11.f58966a.f58892e.e(k12, key)) {
                    y<K, V> a12 = jVar.a();
                    V v13 = a12.get();
                    if (v13 == null) {
                        if (a12.isActive()) {
                            j11.f58969d++;
                            j<K, V> B11 = j11.B(jVar, jVar, key, v13, a12, com.google.common.cache.k.COLLECTED);
                            int i13 = j11.f58967b - 1;
                            atomicReferenceArray.set(i12, B11);
                            j11.f58967b = i13;
                        }
                        j11.unlock();
                        j11.D();
                        return false;
                    }
                    j<K, V> jVar2 = jVar;
                    if (j11.f58966a.f58893f.e(v11, v13)) {
                        j11.f58969d++;
                        j11.e(k12, v13, a12.getWeight(), com.google.common.cache.k.REPLACED);
                        try {
                            j11.F(jVar2, k12, v12, a11);
                            j11.f(jVar2);
                            j11.unlock();
                            j11.D();
                            return true;
                        } catch (Throwable th2) {
                            th = th2;
                            j11 = j11;
                            j11.unlock();
                            j11.D();
                            throw th;
                        }
                    }
                    j11.s(jVar2, a11);
                    j11.unlock();
                    j11.D();
                    return false;
                }
                jVar = jVar.h();
                i11 = i12;
                k12 = k11;
            }
            j11.unlock();
            j11.D();
            return false;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
