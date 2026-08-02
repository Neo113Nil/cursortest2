package com.google.android.gms.internal.ads;

import defpackage.mio;
import defpackage.nio;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgxm extends zzgxi implements List, RandomAccess {
    public static final mio b = new mio(s.e, 0);

    public static s t(Object obj) {
        Object[] objArr = {obj};
        zzgzf.a(1, objArr);
        return z(1, objArr);
    }

    public static s u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgzf.a(2, objArr);
        return z(2, objArr);
    }

    public static s v(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        zzgzf.a(5, objArr);
        return z(5, objArr);
    }

    public static s w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgzf.a(i, objArr2);
        return z(i, objArr2);
    }

    public static zzgxm x(Collection collection) {
        if (!(collection instanceof zzgxi)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgzf.a(length, array);
            return z(length, array);
        }
        zzgxm p = ((zzgxi) collection).p();
        if (!p.q()) {
            return p;
        }
        Object[] array2 = p.toArray(zzgxi.a);
        return z(array2.length, array2);
    }

    public static s y(Object[] objArr) {
        if (objArr.length == 0) {
            return s.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgzf.a(length, objArr2);
        return z(length, objArr2);
    }

    public static s z(int i, Object[] objArr) {
        return i == 0 ? s.e : new s(objArr, i);
    }

    @Override // java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final mio listIterator(int i) {
        zzguk.j(i, size());
        return isEmpty() ? b : new mio(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    /* renamed from: d */
    public final zzhaa iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equals(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
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

    @Override // com.google.android.gms.internal.ads.zzgxi
    public int r(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public zzgxm subList(int i, int i2) {
        zzguk.k(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? s.e : new nio(this, i, i3);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final zzgxm p() {
        return this;
    }
}
