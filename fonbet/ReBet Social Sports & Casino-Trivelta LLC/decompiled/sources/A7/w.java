package A7;

import A7.n;
import A7.x;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class w implements n, x {

    /* renamed from: a, reason: collision with root package name */
    public final n.b f254a;

    /* renamed from: b, reason: collision with root package name */
    public final m f255b;

    /* renamed from: c, reason: collision with root package name */
    public final m f256c;

    /* renamed from: e, reason: collision with root package name */
    public final D f258e;

    /* renamed from: f, reason: collision with root package name */
    public final x.a f259f;

    /* renamed from: g, reason: collision with root package name */
    public final D6.n f260g;

    /* renamed from: h, reason: collision with root package name */
    public y f261h;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f263j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f264k;

    /* renamed from: d, reason: collision with root package name */
    public final Map f257d = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    public long f262i = SystemClock.uptimeMillis();

    public class a implements D {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D f265a;

        public a(D d10) {
            this.f265a = d10;
        }

        @Override // A7.D
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(n.a aVar) {
            return w.this.f263j ? aVar.f244g : this.f265a.a(aVar.f239b.z0());
        }
    }

    public class b implements H6.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n.a f267a;

        public b(n.a aVar) {
            this.f267a = aVar;
        }

        @Override // H6.h
        public void release(Object obj) {
            w.this.y(this.f267a);
        }
    }

    public w(D d10, x.a aVar, D6.n nVar, n.b bVar, boolean z10, boolean z11) {
        this.f258e = d10;
        this.f255b = new m(A(d10));
        this.f256c = new m(A(d10));
        this.f259f = aVar;
        this.f260g = nVar;
        this.f261h = (y) D6.k.h((y) nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f254a = bVar;
        this.f263j = z10;
        this.f264k = z11;
    }

    public static void s(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f242e) == null) {
            return;
        }
        bVar.a(aVar.f238a, true);
    }

    public static void t(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f242e) == null) {
            return;
        }
        bVar.a(aVar.f238a, false);
    }

    public final D A(D d10) {
        return new a(d10);
    }

    @Override // A7.x
    public H6.a a(Object obj, H6.a aVar) {
        return c(obj, aVar, this.f254a);
    }

    @Override // A7.x
    public void b(Object obj) {
        D6.k.g(obj);
        synchronized (this) {
            try {
                n.a aVar = (n.a) this.f255b.i(obj);
                if (aVar != null) {
                    this.f255b.h(obj, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // A7.n
    public H6.a c(Object obj, H6.a aVar, n.b bVar) {
        n.a aVar2;
        H6.a aVar3;
        H6.a aVar4;
        D6.k.g(obj);
        D6.k.g(aVar);
        v();
        synchronized (this) {
            try {
                aVar2 = (n.a) this.f255b.i(obj);
                n.a aVar5 = (n.a) this.f256c.i(obj);
                aVar3 = null;
                if (aVar5 != null) {
                    n(aVar5);
                    aVar4 = x(aVar5);
                } else {
                    aVar4 = null;
                }
                int a10 = this.f258e.a(aVar.z0());
                if (i(a10)) {
                    n.a a11 = this.f263j ? n.a.a(obj, aVar, a10, bVar) : n.a.b(obj, aVar, bVar);
                    this.f256c.h(obj, a11);
                    aVar3 = w(a11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H6.a.U(aVar4);
        t(aVar2);
        r();
        return aVar3;
    }

    @Override // A7.x
    public synchronized boolean contains(Object obj) {
        return this.f256c.a(obj);
    }

    @Override // A7.n
    public H6.a d(Object obj) {
        n.a aVar;
        boolean z10;
        H6.a aVar2;
        D6.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f255b.i(obj);
                if (aVar != null) {
                    n.a aVar3 = (n.a) this.f256c.i(obj);
                    D6.k.g(aVar3);
                    D6.k.i(aVar3.f240c == 0);
                    aVar2 = aVar3.f239b;
                    z10 = true;
                } else {
                    aVar2 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            t(aVar);
        }
        return aVar2;
    }

    @Override // A7.x
    public synchronized boolean e(D6.l lVar) {
        return !this.f256c.e(lVar).isEmpty();
    }

    @Override // A7.x
    public int f(D6.l lVar) {
        ArrayList j10;
        ArrayList j11;
        synchronized (this) {
            j10 = this.f255b.j(lVar);
            j11 = this.f256c.j(lVar);
            o(j11);
        }
        q(j11);
        u(j10);
        v();
        r();
        return j11.size();
    }

    @Override // A7.x
    public H6.a get(Object obj) {
        n.a aVar;
        H6.a w10;
        D6.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f255b.i(obj);
                n.a aVar2 = (n.a) this.f256c.b(obj);
                w10 = aVar2 != null ? w(aVar2) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t(aVar);
        v();
        r();
        return w10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (l() <= (r3.f261h.f269a - r4)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean i(int i10) {
        boolean z10;
        if (i10 <= this.f261h.f273e) {
            z10 = true;
            if (k() <= this.f261h.f270b - 1) {
            }
        }
        z10 = false;
        return z10;
    }

    public final synchronized void j(n.a aVar) {
        D6.k.g(aVar);
        D6.k.i(aVar.f240c > 0);
        aVar.f240c--;
    }

    public synchronized int k() {
        return this.f256c.c() - this.f255b.c();
    }

    public synchronized int l() {
        return this.f256c.f() - this.f255b.f();
    }

    public final synchronized void m(n.a aVar) {
        D6.k.g(aVar);
        D6.k.i(!aVar.f241d);
        aVar.f240c++;
    }

    public final synchronized void n(n.a aVar) {
        D6.k.g(aVar);
        D6.k.i(!aVar.f241d);
        aVar.f241d = true;
    }

    public final synchronized void o(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n((n.a) it.next());
            }
        }
    }

    public final synchronized boolean p(n.a aVar) {
        if (aVar.f241d || aVar.f240c != 0) {
            return false;
        }
        this.f255b.h(aVar.f238a, aVar);
        return true;
    }

    public final void q(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                H6.a.U(x((n.a) it.next()));
            }
        }
    }

    public void r() {
        ArrayList z10;
        synchronized (this) {
            y yVar = this.f261h;
            int min = Math.min(yVar.f272d, yVar.f270b - k());
            y yVar2 = this.f261h;
            z10 = z(min, Math.min(yVar2.f271c, yVar2.f269a - l()));
            o(z10);
        }
        q(z10);
        u(z10);
    }

    public final void u(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t((n.a) it.next());
            }
        }
    }

    public final synchronized void v() {
        if (this.f262i + this.f261h.f274f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f262i = SystemClock.uptimeMillis();
        this.f261h = (y) D6.k.h((y) this.f260g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    public final synchronized H6.a w(n.a aVar) {
        m(aVar);
        return H6.a.n1(aVar.f239b.z0(), new b(aVar));
    }

    public final synchronized H6.a x(n.a aVar) {
        D6.k.g(aVar);
        return (aVar.f241d && aVar.f240c == 0) ? aVar.f239b : null;
    }

    public final void y(n.a aVar) {
        boolean p10;
        H6.a x10;
        D6.k.g(aVar);
        synchronized (this) {
            j(aVar);
            p10 = p(aVar);
            x10 = x(aVar);
        }
        H6.a.U(x10);
        if (!p10) {
            aVar = null;
        }
        s(aVar);
        v();
        r();
    }

    public final synchronized ArrayList z(int i10, int i11) {
        int max = Math.max(i10, 0);
        int max2 = Math.max(i11, 0);
        if (this.f255b.c() <= max && this.f255b.f() <= max2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f255b.c() <= max && this.f255b.f() <= max2) {
                break;
            }
            Object d10 = this.f255b.d();
            if (d10 != null) {
                this.f255b.i(d10);
                arrayList.add((n.a) this.f256c.i(d10));
            } else {
                if (!this.f264k) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f255b.c()), Integer.valueOf(this.f255b.f())));
                }
                this.f255b.k();
            }
        }
        return arrayList;
    }
}
