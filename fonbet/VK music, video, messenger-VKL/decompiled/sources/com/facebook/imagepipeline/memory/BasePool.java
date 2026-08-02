package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.memory.MemoryTrimType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import xsna.ahq;
import xsna.avb0;
import xsna.bd3;
import xsna.bhq;
import xsna.fvb0;
import xsna.g320;
import xsna.gvb0;
import xsna.odj;
import xsna.pl8;
import xsna.s200;
import xsna.sex0;

/* loaded from: classes.dex */
public abstract class BasePool<V> implements avb0<V> {
    public final Class<?> b = getClass();
    public final g320 c;
    public final fvb0 d;
    public final SparseArray<pl8<V>> e;
    public final Set<V> f;
    public boolean g;
    public final a h;
    public final a i;
    public final gvb0 j;

    /* loaded from: classes12.dex */
    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Integer num) {
            super("Invalid size: " + num.toString());
        }
    }

    /* loaded from: classes12.dex */
    public static class InvalidValueException extends RuntimeException {
    }

    /* loaded from: classes12.dex */
    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i, int i2, int i3, int i4) {
            super(bd3.b(" Request size = ", i3, i4, odj.a(i, i2, "Pool hard cap violation? Hard cap = ", " Used size = ", " Free size = ")));
        }
    }

    /* loaded from: classes12.dex */
    public static class SizeTooLargeException extends InvalidSizeException {
    }

    public static class a {
        public int a;
        public int b;

        public final void a(int i) {
            int i2;
            int i3 = this.b;
            if (i3 < i || (i2 = this.a) <= 0) {
                ahq.m("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.b), Integer.valueOf(this.a));
            } else {
                this.a = i2 - 1;
                this.b = i3 - i;
            }
        }
    }

    public BasePool(g320 g320Var, fvb0 fvb0Var, gvb0 gvb0Var) {
        g320Var.getClass();
        this.c = g320Var;
        fvb0Var.getClass();
        this.d = fvb0Var;
        gvb0Var.getClass();
        this.j = gvb0Var;
        this.e = new SparseArray<>();
        s(new SparseIntArray(0));
        this.f = Collections.newSetFromMap(new IdentityHashMap());
        this.i = new a();
        this.h = new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (r2.d <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        xsna.sex0.f(r5);
        r2.d--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        r5 = false;
     */
    @Override // xsna.avb0, xsna.zag0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(V v) {
        pl8<V> pl8Var;
        v.getClass();
        int n = n(v);
        int o = o(n);
        synchronized (this) {
            try {
                synchronized (this) {
                    pl8Var = this.e.get(n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f.remove(v)) {
            if (pl8Var != null) {
                if (pl8Var.c.size() + pl8Var.d <= pl8Var.b && !q() && r(v)) {
                    int i = pl8Var.d;
                    if (i > 0) {
                        pl8Var.d = i - 1;
                        pl8Var.c.add(v);
                    } else {
                        Object[] objArr = {v};
                        if (ahq.a.a(6)) {
                            bhq.b(6, "BUCKET", String.format(null, "Tried to release value %s from an empty bucket!", objArr));
                        }
                    }
                    a aVar = this.i;
                    aVar.a++;
                    aVar.b += o;
                    this.h.a(o);
                    this.j.getClass();
                    if (ahq.a.a(2)) {
                        ahq.g(this.b, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
                    }
                }
            }
            if (ahq.a.a(2)) {
                ahq.g(this.b, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
            }
            k(v);
            this.h.a(o);
            this.j.getClass();
        } else {
            ahq.c(this.b, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
            k(v);
            this.j.getClass();
        }
        t();
    }

    @Override // xsna.avb0
    public final V get(int i) {
        boolean z;
        V v;
        V p;
        synchronized (this) {
            try {
                if (q() && this.i.b != 0) {
                    z = false;
                    sex0.f(z);
                }
                z = true;
                sex0.f(z);
            } finally {
            }
        }
        int m = m(i);
        synchronized (this) {
            try {
                pl8<V> l = l(m);
                if (l != null && (p = p(l)) != null) {
                    sex0.f(this.f.add(p));
                    int n = n(p);
                    int o = o(n);
                    a aVar = this.h;
                    aVar.a++;
                    aVar.b += o;
                    this.i.a(o);
                    this.j.getClass();
                    t();
                    if (ahq.a.a(2)) {
                        ahq.g(this.b, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(p)), Integer.valueOf(n));
                    }
                    return p;
                }
                int o2 = o(m);
                if (!j(o2)) {
                    throw new PoolSizeViolationException(this.d.a, this.h.b, this.i.b, o2);
                }
                a aVar2 = this.h;
                aVar2.a++;
                aVar2.b += o2;
                if (l != null) {
                    l.d++;
                }
                try {
                    v = i(m);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.h.a(o2);
                        pl8<V> l2 = l(m);
                        if (l2 != null) {
                            sex0.f(l2.d > 0);
                            l2.d--;
                        }
                        s200.K(th);
                        v = null;
                    }
                }
                synchronized (this) {
                    try {
                        sex0.f(this.f.add(v));
                        synchronized (this) {
                            if (q()) {
                                u(this.d.b);
                            }
                        }
                        return v;
                    } finally {
                    }
                }
                this.j.getClass();
                t();
                if (ahq.a.a(2)) {
                    ahq.g(this.b, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(m));
                }
                return v;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.f320
    public final void h(MemoryTrimType memoryTrimType) {
        ArrayList arrayList;
        int i;
        synchronized (this) {
            try {
                this.d.getClass();
                arrayList = new ArrayList(this.e.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    pl8<V> valueAt = this.e.valueAt(i2);
                    valueAt.getClass();
                    if (valueAt.c.size() > 0) {
                        arrayList.add(valueAt);
                    }
                    sparseIntArray.put(this.e.keyAt(i2), valueAt.d);
                }
                s(sparseIntArray);
                a aVar = this.i;
                aVar.a = 0;
                aVar.b = 0;
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
        for (i = 0; i < arrayList.size(); i++) {
            pl8 pl8Var = (pl8) arrayList.get(i);
            while (true) {
                Object a2 = pl8Var.a();
                if (a2 == null) {
                    break;
                } else {
                    k(a2);
                }
            }
        }
    }

    public abstract V i(int i);

    public final synchronized boolean j(int i) {
        fvb0 fvb0Var = this.d;
        int i2 = fvb0Var.a;
        int i3 = this.h.b;
        if (i > i2 - i3) {
            this.j.getClass();
            return false;
        }
        int i4 = fvb0Var.b;
        if (i > i4 - (i3 + this.i.b)) {
            u(i4 - i);
        }
        if (i <= i2 - (this.h.b + this.i.b)) {
            return true;
        }
        this.j.getClass();
        return false;
    }

    public abstract void k(V v);

    public final synchronized pl8<V> l(int i) {
        try {
            pl8<V> pl8Var = this.e.get(i);
            if (pl8Var == null && this.g) {
                if (ahq.a.a(2)) {
                    ahq.f(this.b, Integer.valueOf(i), "creating new bucket %s");
                }
                int o = o(i);
                this.d.getClass();
                pl8<V> pl8Var2 = new pl8<>(o, Integer.MAX_VALUE, 0);
                this.e.put(i, pl8Var2);
                return pl8Var2;
            }
            return pl8Var;
        } finally {
        }
    }

    public abstract int m(int i);

    public abstract int n(V v);

    public abstract int o(int i);

    public synchronized V p(pl8<V> pl8Var) {
        V a2;
        a2 = pl8Var.a();
        if (a2 != null) {
            pl8Var.d++;
        }
        return a2;
    }

    public final synchronized boolean q() {
        boolean z;
        z = this.h.b + this.i.b > this.d.b;
        if (z) {
            this.j.getClass();
        }
        return z;
    }

    public boolean r(V v) {
        v.getClass();
        return true;
    }

    public final synchronized void s(SparseIntArray sparseIntArray) {
        try {
            this.e.clear();
            SparseIntArray sparseIntArray2 = this.d.c;
            if (sparseIntArray2 != null) {
                for (int i = 0; i < sparseIntArray2.size(); i++) {
                    int keyAt = sparseIntArray2.keyAt(i);
                    int valueAt = sparseIntArray2.valueAt(i);
                    int i2 = sparseIntArray.get(keyAt, 0);
                    SparseArray<pl8<V>> sparseArray = this.e;
                    int o = o(keyAt);
                    this.d.getClass();
                    sparseArray.put(keyAt, new pl8<>(o, valueAt, i2));
                }
                this.g = false;
            } else {
                this.g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    public final void t() {
        if (ahq.a.a(2)) {
            a aVar = this.h;
            Integer valueOf = Integer.valueOf(aVar.a);
            Integer valueOf2 = Integer.valueOf(aVar.b);
            a aVar2 = this.i;
            Integer valueOf3 = Integer.valueOf(aVar2.a);
            Integer valueOf4 = Integer.valueOf(aVar2.b);
            if (ahq.a.a(2)) {
                bhq.b(2, this.b.getSimpleName(), String.format(null, "Used = (%d, %d); Free = (%d, %d)", valueOf, valueOf2, valueOf3, valueOf4));
            }
        }
    }

    public final synchronized void u(int i) {
        try {
            int i2 = this.h.b;
            int i3 = this.i.b;
            int min = Math.min((i2 + i3) - i, i3);
            if (min <= 0) {
                return;
            }
            if (ahq.a.a(2)) {
                ahq.h(this.b, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.h.b + this.i.b), Integer.valueOf(min));
            }
            t();
            for (int i4 = 0; i4 < this.e.size() && min > 0; i4++) {
                pl8<V> valueAt = this.e.valueAt(i4);
                valueAt.getClass();
                while (min > 0) {
                    V a2 = valueAt.a();
                    if (a2 == null) {
                        break;
                    }
                    k(a2);
                    int i5 = valueAt.a;
                    min -= i5;
                    this.i.a(i5);
                }
            }
            t();
            if (ahq.a.a(2)) {
                ahq.g(this.b, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.h.b + this.i.b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
