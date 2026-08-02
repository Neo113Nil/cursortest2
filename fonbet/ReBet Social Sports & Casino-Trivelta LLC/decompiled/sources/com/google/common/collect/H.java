package com.google.common.collect;

import com.google.common.collect.E;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;

/* loaded from: classes3.dex */
public abstract class H extends E implements NavigableSet, i0 {
    private static final long serialVersionUID = 912559;

    /* renamed from: b, reason: collision with root package name */
    public final transient Comparator f36706b;

    /* renamed from: c, reason: collision with root package name */
    public transient H f36707c;

    public static final class a extends E.a {

        /* renamed from: d, reason: collision with root package name */
        public final Comparator f36708d;

        public a(Comparator comparator) {
            this.f36708d = (Comparator) Ra.n.k(comparator);
        }

        @Override // com.google.common.collect.E.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.E.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a j(Object... objArr) {
            super.j(objArr);
            return this;
        }

        @Override // com.google.common.collect.E.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a k(Iterable iterable) {
            super.k(iterable);
            return this;
        }

        @Override // com.google.common.collect.E.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public H m() {
            H x10 = H.x(this.f36708d, this.f36861a, this.contents);
            this.f36861a = x10.size();
            this.f36862b = true;
            return x10;
        }
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Comparator f36709a;
        final Object[] elements;

        public b(Comparator comparator, Object[] objArr) {
            this.f36709a = comparator;
            this.elements = objArr;
        }

        public Object readResolve() {
            return new a(this.f36709a).j(this.elements).m();
        }
    }

    public H(Comparator comparator) {
        this.f36706b = comparator;
    }

    public static c0 A(Comparator comparator) {
        return W.h().equals(comparator) ? c0.f36771e : new c0(AbstractC3445z.t(), comparator);
    }

    public static int M(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static H x(Comparator comparator, int i10, Object... objArr) {
        if (i10 == 0) {
            return A(comparator);
        }
        V.c(objArr, i10);
        Arrays.sort(objArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (comparator.compare(obj, objArr[i11 - 1]) != 0) {
                objArr[i11] = obj;
                i11++;
            }
        }
        Arrays.fill(objArr, i11, i10, (Object) null);
        if (i11 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new c0(AbstractC3445z.j(objArr, i11), comparator);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public H headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public H headSet(Object obj, boolean z10) {
        return D(Ra.n.k(obj), z10);
    }

    public abstract H D(Object obj, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public H subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public H subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        Ra.n.k(obj);
        Ra.n.k(obj2);
        Ra.n.d(this.f36706b.compare(obj, obj2) <= 0);
        return G(obj, z10, obj2, z11);
    }

    public abstract H G(Object obj, boolean z10, Object obj2, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public H tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public H tailSet(Object obj, boolean z10) {
        return K(Ra.n.k(obj), z10);
    }

    public abstract H K(Object obj, boolean z10);

    public int L(Object obj, Object obj2) {
        return M(this.f36706b, obj, obj2);
    }

    @Override // java.util.SortedSet, com.google.common.collect.i0
    public Comparator comparator() {
        return this.f36706b;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.E, com.google.common.collect.AbstractC3443x
    public Object writeReplace() {
        return new b(this.f36706b, toArray());
    }

    public abstract H y();

    @Override // java.util.NavigableSet
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public H descendingSet() {
        H h10 = this.f36707c;
        if (h10 != null) {
            return h10;
        }
        H y10 = y();
        this.f36707c = y10;
        y10.f36707c = this;
        return y10;
    }
}
