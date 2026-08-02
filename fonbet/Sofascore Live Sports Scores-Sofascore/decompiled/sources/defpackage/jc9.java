package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jc9 implements List, eia {
    public final l0d a = new l0d(16);
    public final a0d b = new a0d(16);
    public int c = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long c() {
        long g = un0.g(Float.POSITIVE_INFINITY, false, false);
        int i = this.c + 1;
        int i2 = this.a.b - 1;
        if (i > i2) {
            return g;
        }
        while (i >= 0) {
            a0d a0dVar = this.b;
            if (i >= a0dVar.b) {
                break;
            }
            long j = a0dVar.a[i];
            if (xw3.A(j, g) < 0) {
                g = j;
            }
            if ((xw3.G(g) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && xw3.J(g)) || i == i2) {
                return g;
            }
            i++;
        }
        zzl.r("Index must be between 0 and size");
        return 0L;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c = -1;
        this.a.d();
        this.b.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof wtc) && indexOf((wtc) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((wtc) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i, int i2) {
        a0d a0dVar;
        int i3;
        if (i >= i2) {
            return;
        }
        this.a.l(i, i2);
        if (i < 0 || i > (i3 = (a0dVar = this.b).b) || i2 < 0 || i2 > i3) {
            zzl.r("Index must be between 0 and size");
            return;
        }
        if (i2 < i) {
            a70.p("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = a0dVar.a;
                mh0.h(jArr, jArr, i, i2, i3);
            }
            a0dVar.b -= i2 - i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object f = this.a.f(i);
        f.getClass();
        return (wtc) f;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof wtc)) {
            return -1;
        }
        wtc wtcVar = (wtc) obj;
        l0d l0dVar = this.a;
        int i = l0dVar.b - 1;
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        while (!Intrinsics.c(l0dVar.f(i2), wtcVar)) {
            if (i2 == i) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new hc9(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof wtc) {
            wtc wtcVar = (wtc) obj;
            l0d l0dVar = this.a;
            for (int i = l0dVar.b - 1; -1 < i; i--) {
                if (Intrinsics.c(l0dVar.f(i), wtcVar)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new hc9(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new ic9(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return rfo.M(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return rfo.N(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new hc9(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
