package A7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v6.InterfaceC6644a;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final a f225h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final Class f226i = j.class;

    /* renamed from: a, reason: collision with root package name */
    public final x6.k f227a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.i f228b;

    /* renamed from: c, reason: collision with root package name */
    public final G6.l f229c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f230d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f231e;

    /* renamed from: f, reason: collision with root package name */
    public final t f232f;

    /* renamed from: g, reason: collision with root package name */
    public final C f233g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public j(x6.k fileCache, G6.i pooledByteBufferFactory, G6.l pooledByteStreams, Executor readExecutor, Executor writeExecutor, t imageCacheStatsTracker) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(readExecutor, "readExecutor");
        Intrinsics.checkNotNullParameter(writeExecutor, "writeExecutor");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f227a = fileCache;
        this.f228b = pooledByteBufferFactory;
        this.f229c = pooledByteStreams;
        this.f230d = readExecutor;
        this.f231e = writeExecutor;
        this.f232f = imageCacheStatsTracker;
        C d10 = C.d();
        Intrinsics.checkNotNullExpressionValue(d10, "getInstance(...)");
        this.f233g = d10;
    }

    public static final Void i(Object obj, j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object e10 = I7.a.e(obj, null);
        try {
            this$0.f233g.a();
            this$0.f227a.a();
            return null;
        } finally {
        }
    }

    public static final H7.k o(Object obj, AtomicBoolean isCancelled, j this$0, InterfaceC6713d key) {
        Intrinsics.checkNotNullParameter(isCancelled, "$isCancelled");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object e10 = I7.a.e(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            H7.k c10 = this$0.f233g.c(key);
            if (c10 != null) {
                E6.a.y(f226i, "Found image for %s in staging area", key.a());
                this$0.f232f.c(key);
            } else {
                E6.a.y(f226i, "Did not find image for %s in staging area", key.a());
                this$0.f232f.g(key);
                try {
                    G6.h r10 = this$0.r(key);
                    if (r10 == null) {
                        return null;
                    }
                    H6.a D02 = H6.a.D0(r10);
                    Intrinsics.checkNotNullExpressionValue(D02, "of(...)");
                    try {
                        c10 = new H7.k(D02);
                    } finally {
                        H6.a.U(D02);
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                return c10;
            }
            E6.a.x(f226i, "Host thread was interrupted, decreasing reference count");
            c10.close();
            throw new InterruptedException();
        } catch (Throwable th2) {
            try {
                I7.a.c(obj, th2);
                throw th2;
            } finally {
                I7.a.f(e10);
            }
        }
    }

    public static final void q(Object obj, j this$0, InterfaceC6713d key, H7.k kVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object e10 = I7.a.e(obj, null);
        try {
            this$0.u(key, kVar);
        } finally {
        }
    }

    public static final Void t(Object obj, j this$0, InterfaceC6713d key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object e10 = I7.a.e(obj, null);
        try {
            this$0.f233g.g(key);
            this$0.f227a.f(key);
            return null;
        } finally {
        }
    }

    public static final void v(H7.k kVar, j this$0, OutputStream os) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNull(kVar);
        InputStream D02 = kVar.D0();
        if (D02 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this$0.f229c.a(D02, os);
    }

    public final void f(InterfaceC6713d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f227a.g(key);
    }

    public final boolean g(InterfaceC6713d interfaceC6713d) {
        H7.k c10 = this.f233g.c(interfaceC6713d);
        if (c10 != null) {
            c10.close();
            E6.a.y(f226i, "Found image for %s in staging area", interfaceC6713d.a());
            this.f232f.c(interfaceC6713d);
            return true;
        }
        E6.a.y(f226i, "Did not find image for %s in staging area", interfaceC6713d.a());
        this.f232f.g(interfaceC6713d);
        try {
            return this.f227a.e(interfaceC6713d);
        } catch (Exception unused) {
            return false;
        }
    }

    public final d3.f h() {
        this.f233g.a();
        final Object d10 = I7.a.d("BufferedDiskCache_clearAll");
        try {
            return d3.f.b(new Callable() { // from class: A7.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void i10;
                    i10 = j.i(d10, this);
                    return i10;
                }
            }, this.f231e);
        } catch (Exception e10) {
            E6.a.J(f226i, e10, "Failed to schedule disk-cache clear", new Object[0]);
            return d3.f.g(e10);
        }
    }

    public final boolean j(InterfaceC6713d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f233g.b(key) || this.f227a.d(key);
    }

    public final boolean k(InterfaceC6713d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (j(key)) {
            return true;
        }
        return g(key);
    }

    public final d3.f l(InterfaceC6713d interfaceC6713d, H7.k kVar) {
        E6.a.y(f226i, "Found image for %s in staging area", interfaceC6713d.a());
        this.f232f.c(interfaceC6713d);
        d3.f h10 = d3.f.h(kVar);
        Intrinsics.checkNotNullExpressionValue(h10, "forResult(...)");
        return h10;
    }

    public final d3.f m(InterfaceC6713d key, AtomicBoolean isCancelled) {
        d3.f n10;
        d3.f l10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
        if (!N7.b.d()) {
            H7.k c10 = this.f233g.c(key);
            return (c10 == null || (l10 = l(key, c10)) == null) ? n(key, isCancelled) : l10;
        }
        N7.b.a("BufferedDiskCache#get");
        try {
            H7.k c11 = this.f233g.c(key);
            if (c11 != null) {
                n10 = l(key, c11);
                if (n10 == null) {
                }
                N7.b.b();
                return n10;
            }
            n10 = n(key, isCancelled);
            N7.b.b();
            return n10;
        } catch (Throwable th2) {
            N7.b.b();
            throw th2;
        }
    }

    public final d3.f n(final InterfaceC6713d interfaceC6713d, final AtomicBoolean atomicBoolean) {
        try {
            final Object d10 = I7.a.d("BufferedDiskCache_getAsync");
            return d3.f.b(new Callable() { // from class: A7.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    H7.k o10;
                    o10 = j.o(d10, atomicBoolean, this, interfaceC6713d);
                    return o10;
                }
            }, this.f230d);
        } catch (Exception e10) {
            E6.a.J(f226i, e10, "Failed to schedule disk-cache read for %s", interfaceC6713d.a());
            return d3.f.g(e10);
        }
    }

    public final void p(final InterfaceC6713d key, H7.k encodedImage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!N7.b.d()) {
            if (!H7.k.isValid(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f233g.f(key, encodedImage);
            final H7.k k10 = H7.k.k(encodedImage);
            try {
                final Object d10 = I7.a.d("BufferedDiskCache_putAsync");
                this.f231e.execute(new Runnable() { // from class: A7.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(d10, this, key, k10);
                    }
                });
                return;
            } catch (Exception e10) {
                E6.a.J(f226i, e10, "Failed to schedule disk-cache write for %s", key.a());
                this.f233g.h(key, encodedImage);
                H7.k.r(k10);
                return;
            }
        }
        N7.b.a("BufferedDiskCache#put");
        try {
            if (!H7.k.isValid(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f233g.f(key, encodedImage);
            final H7.k k11 = H7.k.k(encodedImage);
            try {
                final Object d11 = I7.a.d("BufferedDiskCache_putAsync");
                this.f231e.execute(new Runnable() { // from class: A7.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(d11, this, key, k11);
                    }
                });
            } catch (Exception e11) {
                E6.a.J(f226i, e11, "Failed to schedule disk-cache write for %s", key.a());
                this.f233g.h(key, encodedImage);
                H7.k.r(k11);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            N7.b.b();
        }
    }

    public final G6.h r(InterfaceC6713d interfaceC6713d) {
        try {
            Class cls = f226i;
            E6.a.y(cls, "Disk cache read for %s", interfaceC6713d.a());
            InterfaceC6644a c10 = this.f227a.c(interfaceC6713d);
            if (c10 == null) {
                E6.a.y(cls, "Disk cache miss for %s", interfaceC6713d.a());
                this.f232f.i(interfaceC6713d);
                return null;
            }
            E6.a.y(cls, "Found entry in disk cache for %s", interfaceC6713d.a());
            this.f232f.f(interfaceC6713d);
            InputStream a10 = c10.a();
            try {
                G6.h b10 = this.f228b.b(a10, (int) c10.size());
                a10.close();
                E6.a.y(cls, "Successful read from disk cache for %s", interfaceC6713d.a());
                return b10;
            } catch (Throwable th2) {
                a10.close();
                throw th2;
            }
        } catch (IOException e10) {
            E6.a.J(f226i, e10, "Exception reading from cache for %s", interfaceC6713d.a());
            this.f232f.k(interfaceC6713d);
            throw e10;
        }
    }

    public final d3.f s(final InterfaceC6713d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f233g.g(key);
        try {
            final Object d10 = I7.a.d("BufferedDiskCache_remove");
            return d3.f.b(new Callable() { // from class: A7.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void t10;
                    t10 = j.t(d10, this, key);
                    return t10;
                }
            }, this.f231e);
        } catch (Exception e10) {
            E6.a.J(f226i, e10, "Failed to schedule disk-cache remove for %s", key.a());
            return d3.f.g(e10);
        }
    }

    public final void u(InterfaceC6713d interfaceC6713d, final H7.k kVar) {
        Class cls = f226i;
        E6.a.y(cls, "About to write to disk-cache for key %s", interfaceC6713d.a());
        try {
            this.f227a.b(interfaceC6713d, new w6.j() { // from class: A7.i
                @Override // w6.j
                public final void a(OutputStream outputStream) {
                    j.v(H7.k.this, this, outputStream);
                }
            });
            this.f232f.b(interfaceC6713d);
            E6.a.y(cls, "Successful disk-cache write for key %s", interfaceC6713d.a());
        } catch (IOException e10) {
            E6.a.J(f226i, e10, "Failed to write to disk-cache for key %s", interfaceC6713d.a());
        }
    }
}
