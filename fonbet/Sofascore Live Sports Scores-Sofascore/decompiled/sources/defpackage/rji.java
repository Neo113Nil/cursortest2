package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rji implements List, gia {
    public final SnapshotStateList a;
    public final int b;
    public int c;
    public int d;

    public rji(SnapshotStateList snapshotStateList, int i, int i2) {
        this.a = snapshotStateList;
        this.b = i;
        this.c = j72.C(snapshotStateList);
        this.d = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        c();
        int i = this.b + this.d;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i, obj);
        this.d++;
        this.c = j72.C(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        int i2 = i + this.b;
        SnapshotStateList snapshotStateList = this.a;
        boolean addAll = snapshotStateList.addAll(i2, collection);
        if (addAll) {
            this.d = collection.size() + this.d;
            this.c = j72.C(snapshotStateList);
        }
        return addAll;
    }

    public final void c() {
        if (j72.C(this.a) == this.c) {
            return;
        }
        a70.o();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            c();
            int i = this.d;
            int i2 = this.b;
            SnapshotStateList snapshotStateList = this.a;
            snapshotStateList.a(i2, i + i2);
            this.d = 0;
            this.c = j72.C(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        j72.K(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        int i = this.d;
        int i2 = this.b;
        v6a it = llf.j(i2, i + i2).iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (Intrinsics.c(obj, this.a.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (Intrinsics.c(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        dsf dsfVar = new dsf();
        dsfVar.a = i - 1;
        return new k4g(dsfVar, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        int i2 = this.b + i;
        SnapshotStateList snapshotStateList = this.a;
        Object remove = snapshotStateList.remove(i2);
        this.d--;
        this.c = j72.C(snapshotStateList);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        c7 c7Var;
        nnh h;
        boolean u;
        c();
        SnapshotStateList snapshotStateList = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (j72.f) {
                mdi mdiVar = snapshotStateList.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            ife m = c7Var.m();
            m.subList(i2, i3).retainAll(collection);
            c7 d = m.d();
            if (Intrinsics.c(d, c7Var)) {
                break;
            }
            mdi mdiVar3 = snapshotStateList.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h = snh.h();
                u = j72.u((mdi) snh.w(mdiVar3, snapshotStateList, h), i, d, true);
            }
            snh.l(h, snapshotStateList);
        } while (!u);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.c = j72.C(this.a);
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        j72.K(i, this.d);
        c();
        int i2 = i + this.b;
        SnapshotStateList snapshotStateList = this.a;
        Object obj2 = snapshotStateList.set(i2, obj);
        this.c = j72.C(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            h3f.a("fromIndex or toIndex are out of bounds");
        }
        c();
        int i3 = this.b;
        return new rji(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return rfo.M(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return rfo.N(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        int i2 = this.b + i;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i2, obj);
        this.d++;
        this.c = j72.C(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }
}
