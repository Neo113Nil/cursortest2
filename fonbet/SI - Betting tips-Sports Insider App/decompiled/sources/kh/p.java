package kh;

import com.google.firebase.messaging.x;
import gh.g0;
import gh.i0;
import gh.o0;
import io.sentry.y3;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p implements gh.e, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f19138a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f19139b;

    /* renamed from: c, reason: collision with root package name */
    public final r f19140c;

    /* renamed from: d, reason: collision with root package name */
    public final gh.r f19141d;

    /* renamed from: e, reason: collision with root package name */
    public final o f19142e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f19143f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19144g;

    /* renamed from: h, reason: collision with root package name */
    public i f19145h;

    /* renamed from: i, reason: collision with root package name */
    public q f19146i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public h f19147k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19148l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19149m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19150n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19151o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19152p;
    public volatile boolean q;

    /* renamed from: r, reason: collision with root package name */
    public volatile h f19153r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f19154s;

    public p(g0 client, i0 originalRequest) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f19138a = client;
        this.f19139b = originalRequest;
        this.f19140c = (r) client.A.f10430b;
        gh.r rVar = (gh.r) client.f10173d.f1514b;
        Intrinsics.checkNotNullParameter(this, "it");
        this.f19141d = rVar;
        o oVar = new o(this);
        oVar.timeout(0, TimeUnit.MILLISECONDS);
        this.f19142e = oVar;
        this.f19143f = new AtomicBoolean();
        this.f19152p = true;
        this.f19154s = new CopyOnWriteArrayList();
        new AtomicReference(originalRequest.f10210e);
    }

    public static final String a(p pVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pVar.q ? "canceled " : "");
        sb2.append("call");
        sb2.append(" to ");
        sb2.append(pVar.f19139b.f10206a.g());
        return sb2.toString();
    }

    public final void b(q connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        TimeZone timeZone = hh.g.f10825a;
        if (this.f19146i != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f19146i = connection;
        connection.f19168p.add(new n(this, this.f19144g));
    }

    public final void cancel() {
        if (this.q) {
            return;
        }
        this.q = true;
        h hVar = this.f19153r;
        if (hVar != null) {
            ((lh.f) hVar.f19122e).cancel();
        }
        Iterator it = this.f19154s.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((v) it.next()).cancel();
        }
        this.f19141d.f(this);
    }

    public final Object clone() {
        return new p(this.f19138a, this.f19139b);
    }

    public final IOException d(IOException iOException) {
        IOException iOException2;
        Socket k6;
        TimeZone timeZone = hh.g.f10825a;
        q connection = this.f19146i;
        if (connection != null) {
            synchronized (connection) {
                k6 = k();
            }
            if (this.f19146i == null) {
                if (k6 != null) {
                    hh.g.c(k6);
                }
                this.f19141d.k(this, connection);
                Intrinsics.checkNotNullParameter(connection, "connection");
                Intrinsics.checkNotNullParameter(this, "call");
                if (k6 != null) {
                    Intrinsics.checkNotNullParameter(connection, "connection");
                }
            } else if (k6 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.j && this.f19142e.exit()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException == null) {
            this.f19141d.c(this);
            return iOException2;
        }
        gh.r rVar = this.f19141d;
        Intrinsics.checkNotNull(iOException2);
        rVar.d(this, iOException2);
        return iOException2;
    }

    public final void e(gh.f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f19143f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        qh.e eVar = qh.e.f22190a;
        this.f19144g = qh.e.f22190a.h();
        this.f19141d.e(this);
        x xVar = this.f19138a.f10170a;
        m call = new m(this, responseCallback);
        xVar.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        x.I(xVar, call, null, null, 6);
    }

    public final o0 f() {
        if (!this.f19143f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f19142e.enter();
        qh.e eVar = qh.e.f22190a;
        this.f19144g = qh.e.f22190a.h();
        this.f19141d.e(this);
        try {
            x xVar = this.f19138a.f10170a;
            synchronized (xVar) {
                Intrinsics.checkNotNullParameter(this, "call");
                ((ArrayDeque) xVar.f6184c).add(this);
            }
            return h();
        } finally {
            x xVar2 = this.f19138a.f10170a;
            xVar2.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            x.I(xVar2, null, this, null, 5);
        }
    }

    public final void g(boolean z5) {
        h hVar;
        synchronized (this) {
            if (!this.f19152p) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f19194a;
        }
        if (z5 && (hVar = this.f19153r) != null) {
            ((lh.f) hVar.f19122e).cancel();
            ((p) hVar.f19119b).i(hVar, true, true, true, true, null);
        }
        this.f19147k = null;
    }

    public final o0 h() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        z.n(this.f19138a.f10171b, arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((gh.z) obj) instanceof io.sentry.okhttp.g) {
                break;
            }
        }
        if (obj == null) {
            y3 scopes = y3.f17255a;
            Intrinsics.checkNotNullExpressionValue(scopes, "getInstance(...)");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            arrayList.add(new io.sentry.okhttp.g(28, null));
        }
        arrayList.add(new lh.a(this.f19138a));
        arrayList.add(new lh.a(this.f19138a.j));
        arrayList.add(new ih.a());
        arrayList.add(a.f19078a);
        z.n(this.f19138a.f10172c, arrayList);
        arrayList.add(lh.c.f20085a);
        i0 i0Var = this.f19139b;
        g0 g0Var = this.f19138a;
        lh.h hVar = new lh.h(this, arrayList, 0, null, i0Var, g0Var.f10189v, g0Var.f10190w, g0Var.f10191x);
        boolean z5 = false;
        try {
            try {
                o0 b10 = hVar.b(this.f19139b);
                if (this.q) {
                    hh.e.b(b10);
                    throw new IOException("Canceled");
                }
                j(null);
                return b10;
            } catch (IOException e7) {
                z5 = true;
                IOException j = j(e7);
                Intrinsics.checkNotNull(j, "null cannot be cast to non-null type kotlin.Throwable");
                throw j;
            }
        } catch (Throwable th2) {
            if (!z5) {
                j(null);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:54:0x0013, B:10:0x002f, B:12:0x0033, B:14:0x0037, B:16:0x003b, B:17:0x003d, B:19:0x0042, B:21:0x0046, B:23:0x004a, B:27:0x0053, B:31:0x005d, B:7:0x001d, B:47:0x0023, B:50:0x0029), top: B:53:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:54:0x0013, B:10:0x002f, B:12:0x0033, B:14:0x0037, B:16:0x003b, B:17:0x003d, B:19:0x0042, B:21:0x0046, B:23:0x004a, B:27:0x0053, B:31:0x005d, B:7:0x001d, B:47:0x0023, B:50:0x0029), top: B:53:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:54:0x0013, B:10:0x002f, B:12:0x0033, B:14:0x0037, B:16:0x003b, B:17:0x003d, B:19:0x0042, B:21:0x0046, B:23:0x004a, B:27:0x0053, B:31:0x005d, B:7:0x001d, B:47:0x0023, B:50:0x0029), top: B:53:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:54:0x0013, B:10:0x002f, B:12:0x0033, B:14:0x0037, B:16:0x003b, B:17:0x003d, B:19:0x0042, B:21:0x0046, B:23:0x004a, B:27:0x0053, B:31:0x005d, B:7:0x001d, B:47:0x0023, B:50:0x0029), top: B:53:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException i(h exchange, boolean z5, boolean z7, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        boolean z14;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.areEqual(exchange, this.f19153r)) {
            synchronized (this) {
                z12 = false;
                if (z5) {
                    try {
                        if (!this.f19148l) {
                        }
                        if (z5) {
                            this.f19148l = false;
                        }
                        if (z7) {
                            this.f19149m = false;
                        }
                        if (z11) {
                            this.f19150n = false;
                        }
                        if (z10) {
                            this.f19151o = false;
                        }
                        z14 = (!this.f19148l || this.f19149m || this.f19150n || this.f19151o) ? false : true;
                        if (z14 && !this.f19152p) {
                            z12 = true;
                        }
                        boolean z15 = z14;
                        z13 = z12;
                        z12 = z15;
                        Unit unit = Unit.f19194a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if ((!z7 || !this.f19149m) && ((!z11 || !this.f19150n) && (!z10 || !this.f19151o))) {
                    z13 = false;
                    Unit unit2 = Unit.f19194a;
                }
                if (z5) {
                }
                if (z7) {
                }
                if (z11) {
                }
                if (z10) {
                }
                if (!this.f19148l) {
                }
                if (z14) {
                    z12 = true;
                }
                boolean z152 = z14;
                z13 = z12;
                z12 = z152;
                Unit unit22 = Unit.f19194a;
            }
            if (z12) {
                this.f19153r = null;
                q qVar = this.f19146i;
                if (qVar != null) {
                    qVar.d();
                }
            }
            if (z13) {
                return d(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z5;
        synchronized (this) {
            try {
                z5 = false;
                if (this.f19152p) {
                    this.f19152p = false;
                    if (!this.f19148l && !this.f19149m && !this.f19150n && !this.f19151o) {
                        z5 = true;
                    }
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5 ? d(iOException) : iOException;
    }

    public final Socket k() {
        q connection = this.f19146i;
        Intrinsics.checkNotNull(connection);
        TimeZone timeZone = hh.g.f10825a;
        ArrayList arrayList = connection.f19168p;
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i5++;
        }
        if (i5 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i5);
        this.f19146i = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        connection.q = System.nanoTime();
        r rVar = this.f19140c;
        ConcurrentLinkedQueue concurrentLinkedQueue = rVar.f19172d;
        jh.c cVar = rVar.f19170b;
        Intrinsics.checkNotNullParameter(connection, "connection");
        TimeZone timeZone2 = hh.g.f10825a;
        if (!connection.j) {
            cVar.d(rVar.f19171c, 0L);
            return null;
        }
        connection.j = true;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        return connection.f19158e;
    }
}
