package x6;

import I6.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import v6.InterfaceC6644a;
import w6.C6714e;
import w6.InterfaceC6710a;
import w6.InterfaceC6712c;
import w6.InterfaceC6713d;
import x6.f;

/* loaded from: classes2.dex */
public class g implements k, A6.a {

    /* renamed from: r, reason: collision with root package name */
    public static final Class f67906r = g.class;

    /* renamed from: s, reason: collision with root package name */
    public static final long f67907s = TimeUnit.HOURS.toMillis(2);

    /* renamed from: t, reason: collision with root package name */
    public static final long f67908t = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final long f67909a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67910b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f67911c;

    /* renamed from: d, reason: collision with root package name */
    public long f67912d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6712c f67913e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f67914f;

    /* renamed from: g, reason: collision with root package name */
    public long f67915g;

    /* renamed from: h, reason: collision with root package name */
    public final long f67916h;

    /* renamed from: i, reason: collision with root package name */
    public final I6.a f67917i;

    /* renamed from: j, reason: collision with root package name */
    public final f f67918j;

    /* renamed from: k, reason: collision with root package name */
    public final j f67919k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC6710a f67920l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f67921m;

    /* renamed from: n, reason: collision with root package name */
    public final b f67922n;

    /* renamed from: o, reason: collision with root package name */
    public final K6.a f67923o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f67924p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public boolean f67925q;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.this.f67924p) {
                g.this.p();
            }
            g.this.f67925q = true;
            g.this.f67911c.countDown();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f67927a = false;

        /* renamed from: b, reason: collision with root package name */
        public long f67928b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f67929c = -1;

        public synchronized long a() {
            return this.f67929c;
        }

        public synchronized long b() {
            return this.f67928b;
        }

        public synchronized void c(long j10, long j11) {
            if (this.f67927a) {
                this.f67928b += j10;
                this.f67929c += j11;
            }
        }

        public synchronized boolean d() {
            return this.f67927a;
        }

        public synchronized void e() {
            this.f67927a = false;
            this.f67929c = -1L;
            this.f67928b = -1L;
        }

        public synchronized void f(long j10, long j11) {
            this.f67929c = j11;
            this.f67928b = j10;
            this.f67927a = true;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f67930a;

        /* renamed from: b, reason: collision with root package name */
        public final long f67931b;

        /* renamed from: c, reason: collision with root package name */
        public final long f67932c;

        public c(long j10, long j11, long j12) {
            this.f67930a = j10;
            this.f67931b = j11;
            this.f67932c = j12;
        }
    }

    public g(f fVar, j jVar, c cVar, InterfaceC6712c interfaceC6712c, InterfaceC6710a interfaceC6710a, A6.b bVar, Executor executor, boolean z10) {
        this.f67909a = cVar.f67931b;
        long j10 = cVar.f67932c;
        this.f67910b = j10;
        this.f67912d = j10;
        this.f67917i = I6.a.d();
        this.f67918j = fVar;
        this.f67919k = jVar;
        this.f67915g = -1L;
        this.f67913e = interfaceC6712c;
        this.f67916h = cVar.f67930a;
        this.f67920l = interfaceC6710a;
        this.f67922n = new b();
        this.f67923o = K6.d.a();
        this.f67921m = z10;
        this.f67914f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (!z10) {
            this.f67911c = new CountDownLatch(0);
        } else {
            this.f67911c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    @Override // x6.k
    public void a() {
        synchronized (this.f67924p) {
            try {
                this.f67918j.a();
                this.f67914f.clear();
                InterfaceC6712c interfaceC6712c = this.f67913e;
                if (interfaceC6712c != null) {
                    interfaceC6712c.g();
                }
            } catch (IOException | NullPointerException e10) {
                this.f67920l.a(InterfaceC6710a.EnumC0954a.EVICTION, f67906r, "clearAll: " + e10.getMessage(), e10);
            }
            this.f67922n.e();
        }
    }

    @Override // x6.k
    public InterfaceC6644a b(InterfaceC6713d interfaceC6713d, w6.j jVar) {
        String a10;
        l d10 = l.a().d(interfaceC6713d);
        InterfaceC6712c interfaceC6712c = this.f67913e;
        if (interfaceC6712c != null) {
            interfaceC6712c.e(d10);
        }
        synchronized (this.f67924p) {
            a10 = C6714e.a(interfaceC6713d);
        }
        d10.j(a10);
        try {
            try {
                f.b r10 = r(a10, interfaceC6713d);
                try {
                    r10.b(jVar, interfaceC6713d);
                    InterfaceC6644a l10 = l(r10, interfaceC6713d, a10);
                    d10.i(l10.size()).f(this.f67922n.b());
                    InterfaceC6712c interfaceC6712c2 = this.f67913e;
                    if (interfaceC6712c2 != null) {
                        interfaceC6712c2.a(d10);
                    }
                    return l10;
                } finally {
                    if (!r10.f()) {
                        E6.a.i(f67906r, "Failed to delete temp file");
                    }
                }
            } catch (IOException e10) {
                d10.h(e10);
                InterfaceC6712c interfaceC6712c3 = this.f67913e;
                if (interfaceC6712c3 != null) {
                    interfaceC6712c3.f(d10);
                }
                E6.a.j(f67906r, "Failed inserting a file into the cache", e10);
                throw e10;
            }
        } finally {
            d10.b();
        }
    }

    @Override // x6.k
    public InterfaceC6644a c(InterfaceC6713d interfaceC6713d) {
        InterfaceC6644a interfaceC6644a;
        l d10 = l.a().d(interfaceC6713d);
        try {
            synchronized (this.f67924p) {
                try {
                    List b10 = C6714e.b(interfaceC6713d);
                    String str = null;
                    interfaceC6644a = null;
                    for (int i10 = 0; i10 < b10.size(); i10++) {
                        str = (String) b10.get(i10);
                        d10.j(str);
                        interfaceC6644a = this.f67918j.g(str, interfaceC6713d);
                        if (interfaceC6644a != null) {
                            break;
                        }
                    }
                    if (interfaceC6644a == null) {
                        InterfaceC6712c interfaceC6712c = this.f67913e;
                        if (interfaceC6712c != null) {
                            interfaceC6712c.d(d10);
                        }
                        this.f67914f.remove(str);
                    } else {
                        D6.k.g(str);
                        InterfaceC6712c interfaceC6712c2 = this.f67913e;
                        if (interfaceC6712c2 != null) {
                            interfaceC6712c2.h(d10);
                        }
                        this.f67914f.add(str);
                    }
                } finally {
                }
            }
            return interfaceC6644a;
        } catch (IOException e10) {
            this.f67920l.a(InterfaceC6710a.EnumC0954a.GENERIC_IO, f67906r, "getResource", e10);
            d10.h(e10);
            InterfaceC6712c interfaceC6712c3 = this.f67913e;
            if (interfaceC6712c3 != null) {
                interfaceC6712c3.b(d10);
            }
            return null;
        } finally {
            d10.b();
        }
    }

    @Override // x6.k
    public boolean d(InterfaceC6713d interfaceC6713d) {
        synchronized (this.f67924p) {
            try {
                List b10 = C6714e.b(interfaceC6713d);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    if (this.f67914f.contains((String) b10.get(i10))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x6.k
    public boolean e(InterfaceC6713d interfaceC6713d) {
        synchronized (this.f67924p) {
            if (d(interfaceC6713d)) {
                return true;
            }
            try {
                List b10 = C6714e.b(interfaceC6713d);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    String str = (String) b10.get(i10);
                    if (this.f67918j.f(str, interfaceC6713d)) {
                        this.f67914f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // x6.k
    public void f(InterfaceC6713d interfaceC6713d) {
        synchronized (this.f67924p) {
            try {
                List b10 = C6714e.b(interfaceC6713d);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    String str = (String) b10.get(i10);
                    this.f67918j.remove(str);
                    this.f67914f.remove(str);
                }
            } catch (IOException e10) {
                this.f67920l.a(InterfaceC6710a.EnumC0954a.DELETE_FILE, f67906r, "delete: " + e10.getMessage(), e10);
            }
        }
    }

    @Override // x6.k
    public boolean g(InterfaceC6713d interfaceC6713d) {
        String str;
        IOException e10;
        String str2 = null;
        try {
            try {
                synchronized (this.f67924p) {
                    try {
                        List b10 = C6714e.b(interfaceC6713d);
                        int i10 = 0;
                        while (i10 < b10.size()) {
                            String str3 = (String) b10.get(i10);
                            if (this.f67918j.d(str3, interfaceC6713d)) {
                                this.f67914f.add(str3);
                                return true;
                            }
                            i10++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th2) {
                        str = str2;
                        th = th2;
                        try {
                            throw th;
                        } catch (IOException e11) {
                            e10 = e11;
                            l h10 = l.a().d(interfaceC6713d).j(str).h(e10);
                            InterfaceC6712c interfaceC6712c = this.f67913e;
                            if (interfaceC6712c != null) {
                                interfaceC6712c.b(h10);
                            }
                            h10.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            str = null;
            e10 = e12;
        }
    }

    public final InterfaceC6644a l(f.b bVar, InterfaceC6713d interfaceC6713d, String str) {
        InterfaceC6644a a10;
        synchronized (this.f67924p) {
            a10 = bVar.a(interfaceC6713d);
            this.f67914f.add(str);
            this.f67922n.c(a10.size(), 1L);
        }
        return a10;
    }

    public final void m(long j10, InterfaceC6712c.a aVar) {
        try {
            Collection<f.a> n10 = n(this.f67918j.h());
            long b10 = this.f67922n.b();
            long j11 = b10 - j10;
            int i10 = 0;
            long j12 = 0;
            for (f.a aVar2 : n10) {
                if (j12 > j11) {
                    break;
                }
                long c10 = this.f67918j.c(aVar2);
                this.f67914f.remove(aVar2.getId());
                if (c10 > 0) {
                    i10++;
                    j12 += c10;
                    l e10 = l.a().j(aVar2.getId()).g(aVar).i(c10).f(b10 - j12).e(j10);
                    InterfaceC6712c interfaceC6712c = this.f67913e;
                    if (interfaceC6712c != null) {
                        interfaceC6712c.c(e10);
                    }
                    e10.b();
                }
            }
            this.f67922n.c(-j12, -i10);
            this.f67918j.b();
        } catch (IOException e11) {
            this.f67920l.a(InterfaceC6710a.EnumC0954a.EVICTION, f67906r, "evictAboveSize: " + e11.getMessage(), e11);
            throw e11;
        }
    }

    public final Collection n(Collection collection) {
        long now = this.f67923o.now() + f67907s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f.a aVar = (f.a) it.next();
            if (aVar.a() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f67919k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final void o() {
        synchronized (this.f67924p) {
            try {
                boolean p10 = p();
                s();
                long b10 = this.f67922n.b();
                if (b10 > this.f67912d && !p10) {
                    this.f67922n.e();
                    p();
                }
                long j10 = this.f67912d;
                if (b10 > j10) {
                    m((j10 * 9) / 10, InterfaceC6712c.a.CACHE_FULL);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean p() {
        long now = this.f67923o.now();
        if (this.f67922n.d()) {
            long j10 = this.f67915g;
            if (j10 != -1 && now - j10 <= f67908t) {
                return false;
            }
        }
        return q();
    }

    public final boolean q() {
        boolean z10;
        long j10;
        long now = this.f67923o.now();
        long j11 = f67907s + now;
        Set hashSet = (this.f67921m && this.f67914f.isEmpty()) ? this.f67914f : this.f67921m ? new HashSet() : null;
        try {
            long j12 = 0;
            long j13 = -1;
            int i10 = 0;
            boolean z11 = false;
            int i11 = 0;
            int i12 = 0;
            z10 = false;
            for (f.a aVar : this.f67918j.h()) {
                try {
                    i11++;
                    j12 += aVar.getSize();
                    if (aVar.a() > j11) {
                        i12++;
                        i10 = (int) (i10 + aVar.getSize());
                        j10 = j11;
                        j13 = Math.max(aVar.a() - now, j13);
                        z11 = true;
                    } else {
                        j10 = j11;
                        if (this.f67921m) {
                            D6.k.g(hashSet);
                            hashSet.add(aVar.getId());
                        }
                    }
                    j11 = j10;
                } catch (IOException e10) {
                    e = e10;
                    this.f67920l.a(InterfaceC6710a.EnumC0954a.GENERIC_IO, f67906r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z10;
                }
            }
            if (z11) {
                this.f67920l.a(InterfaceC6710a.EnumC0954a.READ_INVALID_ENTRY, f67906r, "Future timestamp found in " + i12 + " files , with a total size of " + i10 + " bytes, and a maximum time delta of " + j13 + "ms", null);
            }
            long j14 = i11;
            if (this.f67922n.a() != j14 || this.f67922n.b() != j12) {
                if (this.f67921m && this.f67914f != hashSet) {
                    D6.k.g(hashSet);
                    this.f67914f.clear();
                    this.f67914f.addAll(hashSet);
                }
                this.f67922n.f(j12, j14);
            }
            this.f67915g = now;
            return true;
        } catch (IOException e11) {
            e = e11;
            z10 = false;
        }
    }

    public final f.b r(String str, InterfaceC6713d interfaceC6713d) {
        o();
        return this.f67918j.e(str, interfaceC6713d);
    }

    public final void s() {
        if (this.f67917i.f(this.f67918j.isExternal() ? a.EnumC0119a.EXTERNAL : a.EnumC0119a.INTERNAL, this.f67910b - this.f67922n.b())) {
            this.f67912d = this.f67909a;
        } else {
            this.f67912d = this.f67910b;
        }
    }
}
