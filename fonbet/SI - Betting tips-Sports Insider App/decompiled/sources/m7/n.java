package m7;

import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class n extends k implements List, RandomAccess, j$.util.List {

    /* renamed from: b, reason: collision with root package name */
    public static final l f20469b = new l(o.f20470e, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public static n g(List list) {
        if (list instanceof k) {
            n nVar = (n) ((k) list);
            if (!nVar.d()) {
                return nVar;
            }
            Object[] array = nVar.toArray(k.f20462a);
            int length = array.length;
            return length == 0 ? o.f20470e : new o(length, array);
        }
        Object[] array2 = list.toArray();
        int length2 = array2.length;
        for (int i5 = 0; i5 < length2; i5++) {
            if (array2[i5] == null) {
                throw new NullPointerException(r4.k.o(new StringBuilder(String.valueOf(i5).length() + 9), "at index ", i5));
            }
        }
        return length2 == 0 ? o.f20470e : new o(length2, array2);
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // m7.k
    public int e(Object[] objArr) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5] = get(i5);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        int i5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (0; i5 < size; i5 + 1) {
                        Object obj2 = get(i5);
                        Object obj3 = list.get(i5);
                        i5 = (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) ? i5 + 1 : 0;
                    }
                    return true;
                }
                l listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    /* renamed from: f */
    public n subList(int i5, int i10) {
        y4.a.N(i5, i10, size());
        int i11 = i10 - i5;
        return i11 == size() ? this : i11 == 0 ? o.f20470e : new m(this, i5, i11);
    }

    @Override // java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final l listIterator(int i5) {
        int size = size();
        if (i5 < 0 || i5 > size) {
            throw new IndexOutOfBoundsException(y4.a.O(i5, size, "index"));
        }
        return isEmpty() ? f20469b : new l(this, i5);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i5 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i5 = (i5 * 31) + get(i10).hashCode();
        }
        return i5;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (obj.equals(get(i5))) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }
}
