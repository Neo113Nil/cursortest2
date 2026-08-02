package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class hv9 extends wu9 implements List, RandomAccess {
    public static final av9 b = new av9(vvf.e, 0);

    public static vvf A(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        qha.p(2, objArr);
        return r(2, objArr);
    }

    public static vvf B(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        z1a.r("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        qha.p(length, objArr2);
        return r(length, objArr2);
    }

    public static vvf D(Comparator comparator, List list) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        qha.p(array.length, array);
        Arrays.sort(array, comparator);
        return r(array.length, array);
    }

    public static vvf r(int i, Object[] objArr) {
        return i == 0 ? vvf.e : new vvf(objArr, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static zu9 s() {
        return new zu9(4);
    }

    public static zu9 t(int i) {
        yqo.w(i, "expectedSize");
        return new zu9(i);
    }

    public static hv9 u(Iterable iterable) {
        if (iterable instanceof Collection) {
            return v((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return vvf.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return z(next);
        }
        zu9 zu9Var = new zu9(4);
        zu9Var.c(next);
        while (it.hasNext()) {
            zu9Var.c(it.next());
        }
        return zu9Var.g();
    }

    public static hv9 v(Collection collection) {
        if (!(collection instanceof wu9)) {
            Object[] array = collection.toArray();
            qha.p(array.length, array);
            return r(array.length, array);
        }
        hv9 d = ((wu9) collection).d();
        if (!d.p()) {
            return d;
        }
        Object[] array2 = d.toArray(wu9.a);
        return r(array2.length, array2);
    }

    public static vvf w(Object[] objArr) {
        if (objArr.length == 0) {
            return vvf.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        qha.p(objArr2.length, objArr2);
        return r(objArr2.length, objArr2);
    }

    public static vvf y(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        qha.p(5, objArr);
        return r(5, objArr);
    }

    public static vvf z(Object obj) {
        Object[] objArr = {obj};
        qha.p(1, objArr);
        return r(1, objArr);
    }

    public hv9 C() {
        return size() <= 1 ? this : new bv9(this);
    }

    @Override // java.util.List
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public hv9 subList(int i, int i2) {
        z1a.A(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? vvf.e : new dv9(this, i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.wu9
    public int e(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && sha.r(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (sha.r(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
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

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.wu9
    /* renamed from: q */
    public final cck iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wu9
    public Object writeReplace() {
        return new cv9(toArray(wu9.a));
    }

    @Override // java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final av9 listIterator(int i) {
        z1a.z(i, size());
        return isEmpty() ? b : new av9(this, i);
    }

    @Override // defpackage.wu9
    public final hv9 d() {
        return this;
    }
}
