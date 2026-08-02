package com.google.common.collect;

import com.google.common.collect.AbstractC3443x;
import com.google.common.collect.f0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class D extends AbstractC3429i implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient B f36677e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f36678f;

    public class a extends m0 {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f36679a;

        /* renamed from: b, reason: collision with root package name */
        public Object f36680b = null;

        /* renamed from: c, reason: collision with root package name */
        public Iterator f36681c = J.g();

        public a() {
            this.f36679a = D.this.f36677e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!this.f36681c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f36679a.next();
                this.f36680b = entry.getKey();
                this.f36681c = ((AbstractC3443x) entry.getValue()).iterator();
            }
            Object obj = this.f36680b;
            Objects.requireNonNull(obj);
            return N.d(obj, this.f36681c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36681c.hasNext() || this.f36679a.hasNext();
        }
    }

    public class b extends m0 {

        /* renamed from: a, reason: collision with root package name */
        public Iterator f36683a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator f36684b = J.g();

        public b() {
            this.f36683a = D.this.f36677e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36684b.hasNext() || this.f36683a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f36684b.hasNext()) {
                this.f36684b = ((AbstractC3443x) this.f36683a.next()).iterator();
            }
            return this.f36684b.next();
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public Map f36686a;

        /* renamed from: b, reason: collision with root package name */
        public Comparator f36687b;

        /* renamed from: c, reason: collision with root package name */
        public Comparator f36688c;

        /* renamed from: d, reason: collision with root package name */
        public int f36689d = 4;

        public D a() {
            Map map = this.f36686a;
            if (map == null) {
                return A.y();
            }
            Collection entrySet = map.entrySet();
            Comparator comparator = this.f36687b;
            if (comparator != null) {
                entrySet = W.d(comparator).i().e(entrySet);
            }
            return A.w(entrySet, this.f36688c);
        }

        public Map b() {
            Map map = this.f36686a;
            if (map != null) {
                return map;
            }
            Map d10 = X.d();
            this.f36686a = d10;
            return d10;
        }

        public AbstractC3443x.b c(int i10) {
            return AbstractC3445z.l(i10);
        }

        public c d(Object obj, Object obj2) {
            AbstractC3431k.a(obj, obj2);
            AbstractC3443x.b bVar = (AbstractC3443x.b) b().get(obj);
            if (bVar == null) {
                bVar = c(this.f36689d);
                b().put(obj, bVar);
            }
            bVar.a(obj2);
            return this;
        }
    }

    public static class d extends AbstractC3443x {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final D f36690a;

        public d(D d10) {
            this.f36690a = d10;
        }

        @Override // com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f36690a.b(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: h */
        public m0 iterator() {
            return this.f36690a.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f36690a.size();
        }

        @Override // com.google.common.collect.AbstractC3443x
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final f0.b f36691a = f0.a(D.class, "map");

        /* renamed from: b, reason: collision with root package name */
        public static final f0.b f36692b = f0.a(D.class, "size");
    }

    public static final class f extends AbstractC3443x {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final transient D f36693a;

        public f(D d10) {
            this.f36693a = d10;
        }

        @Override // com.google.common.collect.AbstractC3443x
        public int b(Object[] objArr, int i10) {
            m0 it = this.f36693a.f36677e.values().iterator();
            while (it.hasNext()) {
                i10 = ((AbstractC3443x) it.next()).b(objArr, i10);
            }
            return i10;
        }

        @Override // com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f36693a.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: h */
        public m0 iterator() {
            return this.f36693a.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f36693a.size();
        }

        @Override // com.google.common.collect.AbstractC3443x
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public D(B b10, int i10) {
        this.f36677e = b10;
        this.f36678f = i10;
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC3426f
    public boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.common.collect.O
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC3426f
    public Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC3426f
    public Set f() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public B asMap() {
        return this.f36677e;
    }

    public boolean n(Object obj) {
        return this.f36677e.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC3426f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC3443x e() {
        return new d(this);
    }

    @Override // com.google.common.collect.AbstractC3426f
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC3443x g() {
        return new f(this);
    }

    @Override // com.google.common.collect.O
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC3443x a() {
        return (AbstractC3443x) super.a();
    }

    @Override // com.google.common.collect.AbstractC3426f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public m0 h() {
        return new a();
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public E s() {
        return this.f36677e.keySet();
    }

    @Override // com.google.common.collect.O
    public int size() {
        return this.f36678f;
    }

    @Override // com.google.common.collect.AbstractC3426f
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public m0 l() {
        return new b();
    }

    @Override // com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC3443x values() {
        return (AbstractC3443x) super.values();
    }
}
