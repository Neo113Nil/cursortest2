package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a7;
import defpackage.c7;
import defpackage.d09;
import defpackage.gia;
import defpackage.h3f;
import defpackage.hc9;
import defpackage.ife;
import defpackage.ioh;
import defpackage.j72;
import defpackage.mdi;
import defpackage.nnh;
import defpackage.qdi;
import defpackage.rfo;
import defpackage.rji;
import defpackage.sdi;
import defpackage.slh;
import defpackage.snh;
import defpackage.tj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Lqdi;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements Parcelable, qdi, List<T>, RandomAccess, gia {

    @NotNull
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new ioh(0);
    public mdi a;

    public SnapshotStateList(c7 c7Var) {
        nnh h = snh.h();
        mdi mdiVar = new mdi(h.g(), c7Var);
        if (!(h instanceof d09)) {
            mdiVar.b = new mdi(1L, c7Var);
        }
        this.a = mdiVar;
    }

    public final void a(int i, int i2) {
        int i3;
        c7 c7Var;
        nnh h;
        boolean u;
        do {
            synchronized (j72.f) {
                mdi mdiVar = this.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i3 = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            ife m = c7Var.m();
            m.subList(i, i2).clear();
            c7 d = m.d();
            if (Intrinsics.c(d, c7Var)) {
                return;
            }
            mdi mdiVar3 = this.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h = snh.h();
                u = j72.u((mdi) snh.w(mdiVar3, this, h), i3, d, true);
            }
            snh.l(h, this);
        } while (!u);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        c7 c7Var;
        nnh h;
        boolean u;
        do {
            synchronized (j72.f) {
                mdi mdiVar = this.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            c7 c = c7Var.c(obj);
            if (c.equals(c7Var)) {
                return false;
            }
            mdi mdiVar3 = this.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h = snh.h();
                u = j72.u((mdi) snh.w(mdiVar3, this, h), i, c, true);
            }
            snh.l(h, this);
        } while (!u);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        c7 c7Var;
        nnh h;
        boolean u;
        do {
            synchronized (j72.f) {
                mdi mdiVar = this.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            c7 d = c7Var.d(collection);
            if (Intrinsics.c(d, c7Var)) {
                return false;
            }
            mdi mdiVar3 = this.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h = snh.h();
                u = j72.u((mdi) snh.w(mdiVar3, this, h), i, d, true);
            }
            snh.l(h, this);
        } while (!u);
        return true;
    }

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        sdiVar.b = this.a;
        this.a = (mdi) sdiVar;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        nnh h;
        mdi mdiVar = this.a;
        mdiVar.getClass();
        synchronized (snh.c) {
            h = snh.h();
            mdi mdiVar2 = (mdi) snh.w(mdiVar, this, h);
            synchronized (j72.f) {
                mdiVar2.c = slh.b;
                mdiVar2.d++;
                mdiVar2.e++;
            }
        }
        snh.l(h, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return j72.B(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return j72.B(this).c.containsAll(collection);
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return j72.B(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return j72.B(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return j72.B(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return j72.B(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new hc9(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        c7 c7Var;
        nnh h;
        boolean u;
        do {
            synchronized (j72.f) {
                mdi mdiVar = this.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            int indexOf = c7Var.indexOf(obj);
            c7 o = indexOf != -1 ? c7Var.o(indexOf) : c7Var;
            if (o.equals(c7Var)) {
                return false;
            }
            mdi mdiVar3 = this.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h = snh.h();
                u = j72.u((mdi) snh.w(mdiVar3, this, h), i, o, true);
            }
            snh.l(h, this);
        } while (!u);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        c7 c7Var;
        nnh h;
        boolean u;
        do {
            synchronized (j72.f) {
                mdi mdiVar = this.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            c7 n = c7Var.n(new a7(0, collection));
            if (Intrinsics.c(n, c7Var)) {
                return false;
            }
            mdi mdiVar3 = this.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h = snh.h();
                u = j72.u((mdi) snh.w(mdiVar3, this, h), i, n, true);
            }
            snh.l(h, this);
        } while (!u);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return j72.F(this, new a7(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        c7 c7Var;
        nnh h;
        boolean u;
        Object obj2 = get(i);
        do {
            synchronized (j72.f) {
                mdi mdiVar = this.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i2 = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            c7 p = c7Var.p(i, obj);
            if (p.equals(c7Var)) {
                break;
            }
            mdi mdiVar3 = this.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h = snh.h();
                u = j72.u((mdi) snh.w(mdiVar3, this, h), i2, p, false);
            }
            snh.l(h, this);
        } while (!u);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return j72.B(this).c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            h3f.a("fromIndex or toIndex are out of bounds");
        }
        return new rji(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return rfo.M(this);
    }

    public final String toString() {
        mdi mdiVar = this.a;
        mdiVar.getClass();
        return "SnapshotStateList(value=" + ((mdi) snh.f(mdiVar)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c7 c7Var = j72.B(this).c;
        int size = c7Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(c7Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return rfo.N(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new hc9(this, i);
    }

    public SnapshotStateList() {
        this(slh.b);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        c7 c7Var;
        nnh h;
        boolean u;
        do {
            synchronized (j72.f) {
                mdi mdiVar = this.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i2 = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            c7 a = c7Var.a(i, obj);
            if (a.equals(c7Var)) {
                return;
            }
            mdi mdiVar3 = this.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h = snh.h();
                u = j72.u((mdi) snh.w(mdiVar3, this, h), i2, a, true);
            }
            snh.l(h, this);
        } while (!u);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return j72.F(this, new tj(i, collection, 10));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        c7 c7Var;
        nnh h;
        boolean u;
        Object obj = get(i);
        do {
            synchronized (j72.f) {
                mdi mdiVar = this.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i2 = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            c7 o = c7Var.o(i);
            if (o.equals(c7Var)) {
                break;
            }
            mdi mdiVar3 = this.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h = snh.h();
                u = j72.u((mdi) snh.w(mdiVar3, this, h), i2, o, true);
            }
            snh.l(h, this);
        } while (!u);
        return obj;
    }
}
