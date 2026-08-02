package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import xsna.c0a0;
import xsna.dak0;
import xsna.duk0;
import xsna.e1a0;
import xsna.ebx;
import xsna.epx;
import xsna.euk0;
import xsna.gxc0;
import xsna.jcy;
import xsna.k2u;
import xsna.l3k0;
import xsna.m200;
import xsna.muk0;
import xsna.p4w;
import xsna.puk0;
import xsna.qak0;
import xsna.s3q0;
import xsna.stm0;
import xsna.z4g;

/* compiled from: SnapshotStateList.android.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes11.dex */
public final class SnapshotStateList<T> implements Parcelable, muk0, List<T>, RandomAccess, jcy {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new a();
    public euk0 b;

    /* compiled from: SnapshotStateList.android.kt */
    public static final class a implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
        public static SnapshotStateList a(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            int readInt = parcel.readInt();
            if (readInt == 0) {
                return new SnapshotStateList();
            }
            e1a0 builder = l3k0.c.builder();
            for (int i = 0; i < readInt; i++) {
                builder.add(parcel.readValue(classLoader));
            }
            return new SnapshotStateList(builder.d());
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ SnapshotStateList<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SnapshotStateList[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }
    }

    public SnapshotStateList() {
        this(l3k0.c);
    }

    public final void a(int i, int i2) {
        int i3;
        c0a0<? extends T> c0a0Var;
        dak0 j;
        boolean e;
        do {
            synchronized (m200.i) {
                euk0 euk0Var = (euk0) qak0.h(this.b);
                i3 = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            e1a0 builder = c0a0Var.builder();
            builder.subList(i, i2).clear();
            c0a0 d = builder.d();
            if (epx.f(d, c0a0Var)) {
                return;
            }
            euk0 euk0Var2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                e = m200.e((euk0) qak0.w(euk0Var2, this, j), i3, d, true);
            }
            qak0.n(j, this);
        } while (!e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        c0a0<? extends T> c0a0Var;
        dak0 j;
        boolean e;
        do {
            synchronized (m200.i) {
                euk0 euk0Var = (euk0) qak0.h(this.b);
                i = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            c0a0<? extends T> add = c0a0Var.add((c0a0<? extends T>) t);
            if (add.equals(c0a0Var)) {
                return false;
            }
            euk0 euk0Var2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                e = m200.e((euk0) qak0.w(euk0Var2, this, j), i, add, true);
            }
            qak0.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return m200.z(this, new p4w(i, collection, 1));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        dak0 j;
        euk0 euk0Var = this.b;
        synchronized (qak0.c) {
            j = qak0.j();
            euk0 euk0Var2 = (euk0) qak0.w(euk0Var, this, j);
            synchronized (m200.i) {
                euk0Var2.c = l3k0.c;
                euk0Var2.d++;
                euk0Var2.e++;
            }
        }
        qak0.n(j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((euk0) qak0.t(this.b, this)).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return ((euk0) qak0.t(this.b, this)).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final T get(int i) {
        return ((euk0) qak0.t(this.b, this)).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ((euk0) qak0.t(this.b, this)).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((euk0) qak0.t(this.b, this)).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // xsna.muk0
    public final puk0 j() {
        return this.b;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ((euk0) qak0.t(this.b, this)).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new duk0(this, 0);
    }

    @Override // xsna.muk0
    public final void n(puk0 puk0Var) {
        puk0Var.b = this.b;
        this.b = (euk0) puk0Var;
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        c0a0<? extends T> c0a0Var;
        dak0 j;
        boolean e;
        T t = get(i);
        do {
            synchronized (m200.i) {
                euk0 euk0Var = (euk0) qak0.h(this.b);
                i2 = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            c0a0<? extends T> g9 = c0a0Var.g9(i);
            if (epx.f(g9, c0a0Var)) {
                break;
            }
            euk0 euk0Var2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                e = m200.e((euk0) qak0.w(euk0Var2, this, j), i2, g9, true);
            }
            qak0.n(j, this);
        } while (!e);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i;
        c0a0<? extends T> c0a0Var;
        dak0 j;
        boolean e;
        do {
            synchronized (m200.i) {
                euk0 euk0Var = (euk0) qak0.h(this.b);
                i = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            c0a0<? extends T> removeAll = c0a0Var.removeAll((Collection<? extends Object>) collection);
            if (epx.f(removeAll, c0a0Var)) {
                return false;
            }
            euk0 euk0Var2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                e = m200.e((euk0) qak0.w(euk0Var2, this, j), i, removeAll, true);
            }
            qak0.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return m200.z(this, new ebx(collection, 28));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        c0a0<? extends T> c0a0Var;
        dak0 j;
        boolean e;
        T t2 = get(i);
        do {
            synchronized (m200.i) {
                euk0 euk0Var = (euk0) qak0.h(this.b);
                i2 = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            c0a0<? extends T> c0a0Var2 = c0a0Var.set(i, (int) t);
            if (c0a0Var2.equals(c0a0Var)) {
                break;
            }
            euk0 euk0Var2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                e = m200.e((euk0) qak0.w(euk0Var2, this, j), i2, c0a0Var2, false);
            }
            qak0.n(j, this);
        } while (!e);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((euk0) qak0.t(this.b, this)).c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            gxc0.a("fromIndex or toIndex are out of bounds");
        }
        return new stm0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return z4g.h(this);
    }

    public final String toString() {
        return "SnapshotStateList(value=" + ((euk0) qak0.h(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c0a0<? extends T> c0a0Var = ((euk0) qak0.t(this.b, this)).c;
        int size = c0a0Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(c0a0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        c0a0<? extends T> c0a0Var;
        dak0 j;
        boolean e;
        do {
            synchronized (m200.i) {
                euk0 euk0Var = (euk0) qak0.h(this.b);
                i = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            c0a0<? extends T> addAll = c0a0Var.addAll((Collection<? extends Object>) collection);
            if (epx.f(addAll, c0a0Var)) {
                return false;
            }
            euk0 euk0Var2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                e = m200.e((euk0) qak0.w(euk0Var2, this, j), i, addAll, true);
            }
            qak0.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new duk0(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) z4g.i(this, tArr);
    }

    public SnapshotStateList(c0a0<? extends T> c0a0Var) {
        dak0 j = qak0.j();
        euk0 euk0Var = new euk0(j.g(), c0a0Var);
        if (!(j instanceof k2u)) {
            euk0Var.b = new euk0(1, c0a0Var);
        }
        this.b = euk0Var;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        c0a0<? extends T> c0a0Var;
        dak0 j;
        boolean e;
        do {
            synchronized (m200.i) {
                euk0 euk0Var = (euk0) qak0.h(this.b);
                i2 = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            c0a0<? extends T> add = c0a0Var.add(i, (int) t);
            if (add.equals(c0a0Var)) {
                return;
            }
            euk0 euk0Var2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                e = m200.e((euk0) qak0.w(euk0Var2, this, j), i2, add, true);
            }
            qak0.n(j, this);
        } while (!e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        c0a0<? extends T> c0a0Var;
        dak0 j;
        boolean e;
        do {
            synchronized (m200.i) {
                euk0 euk0Var = (euk0) qak0.h(this.b);
                i = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            c0a0<? extends T> remove = c0a0Var.remove((c0a0<? extends T>) obj);
            if (epx.f(remove, c0a0Var)) {
                return false;
            }
            euk0 euk0Var2 = this.b;
            synchronized (qak0.c) {
                j = qak0.j();
                e = m200.e((euk0) qak0.w(euk0Var2, this, j), i, remove, true);
            }
            qak0.n(j, this);
        } while (!e);
        return true;
    }
}
