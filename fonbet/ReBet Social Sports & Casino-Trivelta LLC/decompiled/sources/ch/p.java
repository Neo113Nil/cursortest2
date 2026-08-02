package ch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;

/* loaded from: classes3.dex */
public class p implements Set, KMutableSet {

    /* renamed from: a, reason: collision with root package name */
    public final Set f27830a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f27831b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f27832c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27833d;

    public static final class a implements Iterator, KMutableIterator {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f27834a;

        public a() {
            this.f27834a = p.this.f27830a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27834a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return p.this.f27831b.invoke(this.f27834a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f27834a.remove();
        }
    }

    public p(Set delegate, Function1 convertTo, Function1 convert) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(convertTo, "convertTo");
        Intrinsics.checkNotNullParameter(convert, "convert");
        this.f27830a = delegate;
        this.f27831b = convertTo;
        this.f27832c = convert;
        this.f27833d = delegate.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f27830a.add(this.f27832c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f27830a.addAll(c(elements));
    }

    public Collection c(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f27832c.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f27830a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27830a.contains(this.f27832c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f27830a.containsAll(c(elements));
    }

    public Collection e(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f27831b.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Set)) {
            Collection<?> e10 = e(this.f27830a);
            if (((Set) obj).containsAll(e10) && e10.containsAll((Collection) obj)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f27833d;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f27830a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f27830a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f27830a.remove(this.f27832c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f27830a.removeAll(c(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f27830a.retainAll(c(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        return e(this.f27830a).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }
}
