package com.google.android.gms.internal.fido;

import defpackage.bvn;
import defpackage.kda;
import defpackage.kqn;
import defpackage.yhk;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c extends zzck {
    public static final c g;
    public final transient zzcc f;

    static {
        kqn kqnVar = zzcc.b;
        g = new c(a.e, bvn.a);
    }

    public c(zzcc zzccVar, Comparator comparator) {
        super(comparator);
        this.f = zzccVar;
    }

    public final int A(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final c B(int i, int i2) {
        zzcc zzccVar = this.f;
        if (i == 0) {
            if (i2 == zzccVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.d;
        return i < i2 ? new c(zzccVar.subList(i, i2), comparator) : zzck.x(comparator);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        return this.f.a(objArr);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int A = A(obj, true);
        zzcc zzccVar = this.f;
        if (A == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(A);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzcp) {
            collection = ((zzcp) collection).zza();
        }
        Comparator comparator = this.d;
        if (!kda.Y(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        kqn listIterator = this.f.listIterator(0);
        Iterator it = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int d() {
        return this.f.d();
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            zzcc zzccVar = this.f;
            if (zzccVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.d;
                if (!kda.Y(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    kqn listIterator = zzccVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f.get(0);
        }
        yhk.d();
        return null;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object floor(Object obj) {
        int z = z(obj, true) - 1;
        if (z == -1) {
            return null;
        }
        return this.f.get(z);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object higher(Object obj) {
        int A = A(obj, false);
        zzcc zzccVar = this.f;
        if (A == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(A);
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            yhk.d();
            return null;
        }
        return this.f.get(r1.size() - 1);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object lower(Object obj) {
        int z = z(obj, false) - 1;
        if (z == -1) {
            return null;
        }
        return this.f.get(z);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int m() {
        return this.f.m();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    /* renamed from: n */
    public final zzdc iterator() {
        return this.f.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] o() {
        return this.f.o();
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc r() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final c t() {
        Comparator reverseOrder = Collections.reverseOrder(this.d);
        return isEmpty() ? zzck.x(reverseOrder) : new c(this.f.p(), reverseOrder);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final c u(Object obj, boolean z) {
        return B(0, z(obj, z));
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck v(Object obj, boolean z, Object obj2, boolean z2) {
        return w(obj, z).u(obj2, z2);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final c w(Object obj, boolean z) {
        return B(A(obj, z), this.f.size());
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    /* renamed from: y */
    public final kqn descendingIterator() {
        return this.f.p().listIterator(0);
    }

    public final int z(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }
}
