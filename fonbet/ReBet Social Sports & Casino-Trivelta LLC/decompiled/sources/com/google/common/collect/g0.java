package com.google.common.collect;

import com.google.common.collect.AbstractC3432l;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class g0 {

    public class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f36818a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f36819b;

        /* renamed from: com.google.common.collect.g0$a$a, reason: collision with other inner class name */
        public class C0512a extends AbstractC3422b {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator f36820c;

            /* renamed from: d, reason: collision with root package name */
            public final Iterator f36821d;

            public C0512a() {
                this.f36820c = a.this.f36818a.iterator();
                this.f36821d = a.this.f36819b.iterator();
            }

            @Override // com.google.common.collect.AbstractC3422b
            public Object a() {
                if (this.f36820c.hasNext()) {
                    return this.f36820c.next();
                }
                while (this.f36821d.hasNext()) {
                    Object next = this.f36821d.next();
                    if (!a.this.f36818a.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f36818a = set;
            this.f36819b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0 iterator() {
            return new C0512a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f36818a.contains(obj) || this.f36819b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f36818a.isEmpty() && this.f36819b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f36818a.size();
            Iterator it = this.f36819b.iterator();
            while (it.hasNext()) {
                if (!this.f36818a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f36823a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f36824b;

        public class a extends AbstractC3422b {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator f36825c;

            public a() {
                this.f36825c = b.this.f36823a.iterator();
            }

            @Override // com.google.common.collect.AbstractC3422b
            public Object a() {
                while (this.f36825c.hasNext()) {
                    Object next = this.f36825c.next();
                    if (b.this.f36824b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set, Set set2) {
            super(null);
            this.f36823a = set;
            this.f36824b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public m0 iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f36823a.contains(obj) && this.f36824b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f36823a.containsAll(collection) && this.f36824b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f36824b, this.f36823a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f36823a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f36824b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    public static class c extends AbstractC3432l.a implements Set {
        public c(Set set, Ra.o oVar) {
            super(set, oVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return g0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return g0.d(this);
        }
    }

    public static class d extends c implements SortedSet {
        public d(SortedSet sortedSet, Ra.o oVar) {
            super(sortedSet, oVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f36831a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return J.k(this.f36831a.iterator(), this.f36832b);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new d(((SortedSet) this.f36831a).headSet(obj), this.f36832b);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSet = (SortedSet) this.f36831a;
            while (true) {
                Object last = sortedSet.last();
                if (this.f36832b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new d(((SortedSet) this.f36831a).subSet(obj, obj2), this.f36832b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new d(((SortedSet) this.f36831a).tailSet(obj), this.f36832b);
        }
    }

    public static abstract class e extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return g0.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) Ra.n.k(collection));
        }
    }

    public static abstract class f extends AbstractSet {
        public /* synthetic */ f(a aVar) {
            this();
        }

        /* renamed from: a */
        public abstract m0 iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public f() {
        }
    }

    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Set b(Set set, Ra.o oVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, oVar);
        }
        if (!(set instanceof c)) {
            return new c((Set) Ra.n.k(set), (Ra.o) Ra.n.k(oVar));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f36831a, Ra.p.b(cVar.f36832b, oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet c(SortedSet sortedSet, Ra.o oVar) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) Ra.n.k(sortedSet), (Ra.o) Ra.n.k(oVar));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f36831a, Ra.p.b(cVar.f36832b, oVar));
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static f e(Set set, Set set2) {
        Ra.n.l(set, "set1");
        Ra.n.l(set2, "set2");
        return new b(set, set2);
    }

    public static HashSet f() {
        return new HashSet();
    }

    public static HashSet g(int i10) {
        return new HashSet(N.a(i10));
    }

    public static Set h() {
        return Collections.newSetFromMap(N.h());
    }

    public static boolean i(Set set, Collection collection) {
        Ra.n.k(collection);
        if (collection instanceof S) {
            collection = ((S) collection).J();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : J.r(set.iterator(), collection);
    }

    public static boolean j(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }

    public static f k(Set set, Set set2) {
        Ra.n.l(set, "set1");
        Ra.n.l(set2, "set2");
        return new a(set, set2);
    }
}
