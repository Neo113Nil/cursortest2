package K7;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;

/* renamed from: K7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1366g implements G6.f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f6304a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.d f6305b;

    /* renamed from: c, reason: collision with root package name */
    public final M f6306c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f6307d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f6308e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6309f;

    /* renamed from: g, reason: collision with root package name */
    public final a f6310g;

    /* renamed from: h, reason: collision with root package name */
    public final a f6311h;

    /* renamed from: i, reason: collision with root package name */
    public final N f6312i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6313j;

    /* renamed from: K7.g$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f6314a;

        /* renamed from: b, reason: collision with root package name */
        public int f6315b;

        public void a(int i10) {
            int i11;
            int i12 = this.f6315b;
            if (i12 < i10 || (i11 = this.f6314a) <= 0) {
                E6.a.P("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i10), Integer.valueOf(this.f6315b), Integer.valueOf(this.f6314a));
            } else {
                this.f6314a = i11 - 1;
                this.f6315b = i12 - i10;
            }
        }

        public void b(int i10) {
            this.f6314a++;
            this.f6315b += i10;
        }
    }

    /* renamed from: K7.g$b */
    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* renamed from: K7.g$c */
    public static class c extends RuntimeException {
        public c(int i10, int i11, int i12, int i13) {
            super("Pool hard cap violation? Hard cap = " + i10 + " Used size = " + i11 + " Free size = " + i12 + " Request size = " + i13);
        }
    }

    public AbstractC1366g(G6.d dVar, M m10, N n10) {
        this.f6304a = getClass();
        this.f6305b = (G6.d) D6.k.g(dVar);
        M m11 = (M) D6.k.g(m10);
        this.f6306c = m11;
        this.f6312i = (N) D6.k.g(n10);
        this.f6307d = new SparseArray();
        if (m11.f6299f) {
            r();
        } else {
            v(new SparseIntArray(0));
        }
        this.f6308e = D6.m.b();
        this.f6311h = new a();
        this.f6310g = new a();
    }

    public abstract Object g(int i10);

    @Override // G6.f
    public Object get(int i10) {
        Object obj;
        Object q10;
        i();
        int n10 = n(i10);
        synchronized (this) {
            try {
                C1371l l10 = l(n10);
                if (l10 != null && (q10 = q(l10)) != null) {
                    D6.k.i(this.f6308e.add(q10));
                    int o10 = o(q10);
                    int p10 = p(o10);
                    this.f6310g.b(p10);
                    this.f6311h.a(p10);
                    this.f6312i.e(p10);
                    w();
                    if (E6.a.w(2)) {
                        E6.a.z(this.f6304a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(q10)), Integer.valueOf(o10));
                    }
                    return q10;
                }
                int p11 = p(n10);
                if (!h(p11)) {
                    throw new c(this.f6306c.f6294a, this.f6310g.f6315b, this.f6311h.f6315b, p11);
                }
                this.f6310g.b(p11);
                if (l10 != null) {
                    l10.e();
                }
                try {
                    obj = g(n10);
                } catch (Throwable th2) {
                    synchronized (this) {
                        try {
                            this.f6310g.a(p11);
                            C1371l l11 = l(n10);
                            if (l11 != null) {
                                l11.b();
                            }
                            D6.p.c(th2);
                            obj = null;
                        } finally {
                        }
                    }
                }
                synchronized (this) {
                    try {
                        D6.k.i(this.f6308e.add(obj));
                        z();
                        this.f6312i.d(p11);
                        w();
                        if (E6.a.w(2)) {
                            E6.a.z(this.f6304a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(n10));
                        }
                    } finally {
                    }
                }
                return obj;
            } finally {
            }
        }
    }

    public synchronized boolean h(int i10) {
        if (this.f6313j) {
            return true;
        }
        M m10 = this.f6306c;
        int i11 = m10.f6294a;
        int i12 = this.f6310g.f6315b;
        if (i10 > i11 - i12) {
            this.f6312i.g();
            return false;
        }
        int i13 = m10.f6295b;
        if (i10 > i13 - (i12 + this.f6311h.f6315b)) {
            y(i13 - i10);
        }
        if (i10 <= i11 - (this.f6310g.f6315b + this.f6311h.f6315b)) {
            return true;
        }
        this.f6312i.g();
        return false;
    }

    public final synchronized void i() {
        boolean z10;
        try {
            if (t() && this.f6311h.f6315b != 0) {
                z10 = false;
                D6.k.i(z10);
            }
            z10 = true;
            D6.k.i(z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void j(SparseIntArray sparseIntArray) {
        this.f6307d.clear();
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            int keyAt = sparseIntArray.keyAt(i10);
            this.f6307d.put(keyAt, new C1371l(p(keyAt), sparseIntArray.valueAt(i10), 0, this.f6306c.f6299f));
        }
    }

    public abstract void k(Object obj);

    public synchronized C1371l l(int i10) {
        try {
            C1371l c1371l = (C1371l) this.f6307d.get(i10);
            if (c1371l == null && this.f6309f) {
                if (E6.a.w(2)) {
                    E6.a.y(this.f6304a, "creating new bucket %s", Integer.valueOf(i10));
                }
                C1371l x10 = x(i10);
                this.f6307d.put(i10, x10);
                return x10;
            }
            return c1371l;
        } finally {
        }
    }

    public final synchronized C1371l m(int i10) {
        return (C1371l) this.f6307d.get(i10);
    }

    public abstract int n(int i10);

    public abstract int o(Object obj);

    public abstract int p(int i10);

    public synchronized Object q(C1371l c1371l) {
        return c1371l.c();
    }

    public final synchronized void r() {
        try {
            SparseIntArray sparseIntArray = this.f6306c.f6296c;
            if (sparseIntArray != null) {
                j(sparseIntArray);
                this.f6309f = false;
            } else {
                this.f6309f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        r2.b();
     */
    @Override // G6.f, H6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void release(Object obj) {
        D6.k.g(obj);
        int o10 = o(obj);
        int p10 = p(o10);
        synchronized (this) {
            try {
                C1371l m10 = m(o10);
                if (this.f6308e.remove(obj)) {
                    if (m10 != null && !m10.f() && !t() && u(obj)) {
                        m10.h(obj);
                        this.f6311h.b(p10);
                        this.f6310g.a(p10);
                        this.f6312i.c(p10);
                        if (E6.a.w(2)) {
                            E6.a.z(this.f6304a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(o10));
                        }
                    }
                    if (E6.a.w(2)) {
                        E6.a.z(this.f6304a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(o10));
                    }
                    k(obj);
                    this.f6310g.a(p10);
                    this.f6312i.b(p10);
                } else {
                    E6.a.k(this.f6304a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(o10));
                    k(obj);
                    this.f6312i.b(p10);
                }
                w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s() {
        this.f6305b.a(this);
        this.f6312i.f(this);
    }

    public synchronized boolean t() {
        boolean z10;
        z10 = this.f6310g.f6315b + this.f6311h.f6315b > this.f6306c.f6295b;
        if (z10) {
            this.f6312i.a();
        }
        return z10;
    }

    public boolean u(Object obj) {
        D6.k.g(obj);
        return true;
    }

    public final synchronized void v(SparseIntArray sparseIntArray) {
        try {
            D6.k.g(sparseIntArray);
            this.f6307d.clear();
            SparseIntArray sparseIntArray2 = this.f6306c.f6296c;
            if (sparseIntArray2 != null) {
                for (int i10 = 0; i10 < sparseIntArray2.size(); i10++) {
                    int keyAt = sparseIntArray2.keyAt(i10);
                    this.f6307d.put(keyAt, new C1371l(p(keyAt), sparseIntArray2.valueAt(i10), sparseIntArray.get(keyAt, 0), this.f6306c.f6299f));
                }
                this.f6309f = false;
            } else {
                this.f6309f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void w() {
        if (E6.a.w(2)) {
            E6.a.B(this.f6304a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f6310g.f6314a), Integer.valueOf(this.f6310g.f6315b), Integer.valueOf(this.f6311h.f6314a), Integer.valueOf(this.f6311h.f6315b));
        }
    }

    public C1371l x(int i10) {
        return new C1371l(p(i10), Integer.MAX_VALUE, 0, this.f6306c.f6299f);
    }

    public synchronized void y(int i10) {
        try {
            int i11 = this.f6310g.f6315b;
            int i12 = this.f6311h.f6315b;
            int min = Math.min((i11 + i12) - i10, i12);
            if (min <= 0) {
                return;
            }
            if (E6.a.w(2)) {
                E6.a.A(this.f6304a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i10), Integer.valueOf(this.f6310g.f6315b + this.f6311h.f6315b), Integer.valueOf(min));
            }
            w();
            for (int i13 = 0; i13 < this.f6307d.size() && min > 0; i13++) {
                C1371l c1371l = (C1371l) D6.k.g((C1371l) this.f6307d.valueAt(i13));
                while (min > 0) {
                    Object g10 = c1371l.g();
                    if (g10 == null) {
                        break;
                    }
                    k(g10);
                    int i14 = c1371l.f6327a;
                    min -= i14;
                    this.f6311h.a(i14);
                }
            }
            w();
            if (E6.a.w(2)) {
                E6.a.z(this.f6304a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i10), Integer.valueOf(this.f6310g.f6315b + this.f6311h.f6315b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void z() {
        if (t()) {
            y(this.f6306c.f6295b);
        }
    }

    public AbstractC1366g(G6.d dVar, M m10, N n10, boolean z10) {
        this(dVar, m10, n10);
        this.f6313j = z10;
    }
}
