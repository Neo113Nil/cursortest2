package gf;

import I0.C3173b;
import We.z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kd.C7665d;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import sf.C9677c;
import sf.C9681g;
import sf.G;
import sf.K;
import sf.M;
import sf.N;

/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private long f64420a;

    /* renamed from: b, reason: collision with root package name */
    private long f64421b;

    /* renamed from: c, reason: collision with root package name */
    private long f64422c;

    /* renamed from: d, reason: collision with root package name */
    private long f64423d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<z> f64424e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f64425f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final b f64426g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final a f64427h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final c f64428i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final c f64429j;

    /* renamed from: k, reason: collision with root package name */
    private EnumC6726b f64430k;

    /* renamed from: l, reason: collision with root package name */
    private IOException f64431l;

    /* renamed from: m, reason: collision with root package name */
    private final int f64432m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final f f64433n;

    public final class a implements K {

        /* renamed from: a, reason: collision with root package name */
        private final C9681g f64434a = new C9681g();

        /* renamed from: b, reason: collision with root package name */
        private z f64435b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f64436c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f64437d;

        public a(boolean z11) {
            this.f64437d = z11;
        }

        /* JADX WARN: Finally extract failed */
        private final void c(boolean z11) throws IOException {
            long min;
            boolean z12;
            synchronized (n.this) {
                try {
                    n.this.u().r();
                    while (n.this.t() >= n.this.s() && !this.f64437d && !this.f64436c && n.this.i() == null) {
                        try {
                            n.this.F();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    n.this.u().v();
                    n.this.c();
                    min = Math.min(n.this.s() - n.this.t(), this.f64434a.size());
                    n nVar = n.this;
                    nVar.D(nVar.t() + min);
                    z12 = z11 && min == this.f64434a.size();
                    Unit unit = Unit.f71690a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            n.this.u().r();
            try {
                n.this.h().k1(n.this.k(), z12, this.f64434a, min);
            } finally {
                n.this.u().v();
            }
        }

        @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            n nVar = n.this;
            byte[] bArr = Ye.b.f34900a;
            synchronized (nVar) {
                if (this.f64436c) {
                    return;
                }
                boolean z11 = n.this.i() == null;
                Unit unit = Unit.f71690a;
                if (!n.this.p().f64437d) {
                    boolean z12 = this.f64434a.size() > 0;
                    if (this.f64435b != null) {
                        while (this.f64434a.size() > 0) {
                            c(false);
                        }
                        f h11 = n.this.h();
                        int k11 = n.this.k();
                        z toHeaderList = this.f64435b;
                        Intrinsics.f(toHeaderList);
                        Intrinsics.checkNotNullParameter(toHeaderList, "$this$toHeaderList");
                        IntRange o11 = kotlin.ranges.h.o(0, toHeaderList.size());
                        ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
                        C7665d it = o11.iterator();
                        while (it.hasNext()) {
                            int b11 = it.b();
                            arrayList.add(new C6727c(toHeaderList.e(b11), toHeaderList.k(b11)));
                        }
                        h11.l1(k11, arrayList, z11);
                    } else if (z12) {
                        while (this.f64434a.size() > 0) {
                            c(true);
                        }
                    } else if (z11) {
                        n.this.h().k1(n.this.k(), true, null, 0L);
                    }
                }
                synchronized (n.this) {
                    this.f64436c = true;
                    Unit unit2 = Unit.f71690a;
                }
                n.this.h().flush();
                n.this.b();
            }
        }

        public final boolean d() {
            return this.f64436c;
        }

        @Override // sf.K, java.io.Flushable
        public final void flush() throws IOException {
            n nVar = n.this;
            byte[] bArr = Ye.b.f34900a;
            synchronized (nVar) {
                n.this.c();
                Unit unit = Unit.f71690a;
            }
            while (this.f64434a.size() > 0) {
                c(false);
                n.this.h().flush();
            }
        }

        public final boolean j() {
            return this.f64437d;
        }

        public final void k() {
            this.f64437d = true;
        }

        public final void m(z zVar) {
            this.f64435b = zVar;
        }

        @Override // sf.K
        @NotNull
        public final N timeout() {
            return n.this.u();
        }

        @Override // sf.K
        public final void z0(@NotNull C9681g source, long j11) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = Ye.b.f34900a;
            C9681g c9681g = this.f64434a;
            c9681g.z0(source, j11);
            while (c9681g.size() >= 16384) {
                c(false);
            }
        }
    }

    public final class b implements M {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C9681g f64439a = new C9681g();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C9681g f64440b = new C9681g();

        /* renamed from: c, reason: collision with root package name */
        private boolean f64441c;

        /* renamed from: d, reason: collision with root package name */
        private final long f64442d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f64443e;

        public b(long j11, boolean z11) {
            this.f64442d = j11;
            this.f64443e = z11;
        }

        private final void m(long j11) {
            byte[] bArr = Ye.b.f34900a;
            n.this.h().j1(j11);
        }

        public final boolean c() {
            return this.f64441c;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long size;
            synchronized (n.this) {
                this.f64441c = true;
                size = this.f64440b.size();
                this.f64440b.c();
                n nVar = n.this;
                if (nVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                nVar.notifyAll();
                Unit unit = Unit.f71690a;
            }
            if (size > 0) {
                m(size);
            }
            n.this.b();
        }

        public final boolean d() {
            return this.f64443e;
        }

        public final void j(@NotNull G source, long j11) throws IOException {
            boolean z11;
            boolean z12;
            long j12;
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = Ye.b.f34900a;
            while (j11 > 0) {
                synchronized (n.this) {
                    z11 = this.f64443e;
                    z12 = this.f64440b.size() + j11 > this.f64442d;
                    Unit unit = Unit.f71690a;
                }
                if (z12) {
                    source.skip(j11);
                    n.this.f(EnumC6726b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z11) {
                    source.skip(j11);
                    return;
                }
                long read = source.read(this.f64439a, j11);
                if (read == -1) {
                    throw new EOFException();
                }
                j11 -= read;
                synchronized (n.this) {
                    try {
                        if (this.f64441c) {
                            j12 = this.f64439a.size();
                            this.f64439a.c();
                        } else {
                            boolean z13 = this.f64440b.size() == 0;
                            this.f64440b.y0(this.f64439a);
                            if (z13) {
                                n nVar = n.this;
                                if (nVar == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                                nVar.notifyAll();
                            }
                            j12 = 0;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (j12 > 0) {
                    m(j12);
                }
            }
        }

        public final void k() {
            this.f64443e = true;
        }

        @Override // sf.M
        public final long read(@NotNull C9681g sink, long j11) throws IOException {
            IOException iOException;
            boolean z11;
            long j12;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j13 = 0;
            if (j11 < 0) {
                throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
            }
            while (true) {
                synchronized (n.this) {
                    n.this.n().r();
                    try {
                        if (n.this.i() != null) {
                            iOException = n.this.j();
                            if (iOException == null) {
                                EnumC6726b i11 = n.this.i();
                                Intrinsics.f(i11);
                                iOException = new t(i11);
                            }
                        } else {
                            iOException = null;
                        }
                        if (this.f64441c) {
                            throw new IOException("stream closed");
                        }
                        z11 = false;
                        if (this.f64440b.size() > j13) {
                            C9681g c9681g = this.f64440b;
                            j12 = c9681g.read(sink, Math.min(j11, c9681g.size()));
                            n nVar = n.this;
                            nVar.C(nVar.m() + j12);
                            long m11 = n.this.m() - n.this.l();
                            if (iOException == null && m11 >= n.this.h().Z().c() / 2) {
                                n.this.h().t1(n.this.k(), m11);
                                n nVar2 = n.this;
                                nVar2.B(nVar2.m());
                            }
                        } else {
                            if (!this.f64443e && iOException == null) {
                                n.this.F();
                                z11 = true;
                            }
                            j12 = -1;
                        }
                        n.this.n().v();
                        Unit unit = Unit.f71690a;
                    } catch (Throwable th2) {
                        n.this.n().v();
                        throw th2;
                    }
                }
                if (!z11) {
                    if (j12 != -1) {
                        m(j12);
                        return j12;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    throw iOException;
                }
                j13 = 0;
            }
        }

        @Override // sf.M
        @NotNull
        public final N timeout() {
            return n.this.n();
        }
    }

    public final class c extends C9677c {
        public c() {
        }

        @Override // sf.C9677c
        @NotNull
        protected final IOException t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // sf.C9677c
        protected final void u() {
            EnumC6726b enumC6726b = EnumC6726b.CANCEL;
            n nVar = n.this;
            nVar.f(enumC6726b);
            nVar.h().T0();
        }

        public final void v() throws IOException {
            if (s()) {
                throw t(null);
            }
        }
    }

    public n(int i11, @NotNull f connection, boolean z11, boolean z12, z zVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f64432m = i11;
        this.f64433n = connection;
        this.f64423d = connection.b0().c();
        ArrayDeque<z> arrayDeque = new ArrayDeque<>();
        this.f64424e = arrayDeque;
        this.f64426g = new b(connection.Z().c(), z12);
        this.f64427h = new a(z11);
        this.f64428i = new c();
        this.f64429j = new c();
        if (zVar == null) {
            if (!v()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (v()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(zVar);
        }
    }

    private final boolean e(EnumC6726b enumC6726b, IOException iOException) {
        byte[] bArr = Ye.b.f34900a;
        synchronized (this) {
            if (this.f64430k != null) {
                return false;
            }
            if (this.f64426g.d() && this.f64427h.j()) {
                return false;
            }
            this.f64430k = enumC6726b;
            this.f64431l = iOException;
            notifyAll();
            Unit unit = Unit.f71690a;
            this.f64433n.M0(this.f64432m);
            return true;
        }
    }

    public final synchronized void A(@NotNull EnumC6726b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f64430k == null) {
            this.f64430k = errorCode;
            notifyAll();
        }
    }

    public final void B(long j11) {
        this.f64421b = j11;
    }

    public final void C(long j11) {
        this.f64420a = j11;
    }

    public final void D(long j11) {
        this.f64422c = j11;
    }

    @NotNull
    public final synchronized z E() throws IOException {
        z removeFirst;
        this.f64428i.r();
        while (this.f64424e.isEmpty() && this.f64430k == null) {
            try {
                F();
            } catch (Throwable th2) {
                this.f64428i.v();
                throw th2;
            }
        }
        this.f64428i.v();
        if (this.f64424e.isEmpty()) {
            IOException iOException = this.f64431l;
            if (iOException != null) {
                throw iOException;
            }
            EnumC6726b enumC6726b = this.f64430k;
            Intrinsics.f(enumC6726b);
            throw new t(enumC6726b);
        }
        removeFirst = this.f64424e.removeFirst();
        Intrinsics.checkNotNullExpressionValue(removeFirst, "headersQueue.removeFirst()");
        return removeFirst;
    }

    public final void F() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void G(@NotNull List<C6727c> responseHeaders, boolean z11, boolean z12) throws IOException {
        boolean z13;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        byte[] bArr = Ye.b.f34900a;
        synchronized (this) {
            try {
                this.f64425f = true;
                if (z11) {
                    this.f64427h.k();
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z12) {
            synchronized (this.f64433n) {
                z13 = this.f64433n.r0() >= this.f64433n.o0();
            }
            z12 = z13;
        }
        this.f64433n.l1(this.f64432m, responseHeaders, z11);
        if (z12) {
            this.f64433n.flush();
        }
    }

    @NotNull
    public final c H() {
        return this.f64429j;
    }

    public final void a(long j11) {
        this.f64423d += j11;
        if (j11 > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z11;
        boolean w11;
        byte[] bArr = Ye.b.f34900a;
        synchronized (this) {
            try {
                if (this.f64426g.d() || !this.f64426g.c() || (!this.f64427h.j() && !this.f64427h.d())) {
                    z11 = false;
                    w11 = w();
                    Unit unit = Unit.f71690a;
                }
                z11 = true;
                w11 = w();
                Unit unit2 = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            d(EnumC6726b.CANCEL, null);
        } else {
            if (w11) {
                return;
            }
            this.f64433n.M0(this.f64432m);
        }
    }

    public final void c() throws IOException {
        a aVar = this.f64427h;
        if (aVar.d()) {
            throw new IOException("stream closed");
        }
        if (aVar.j()) {
            throw new IOException("stream finished");
        }
        if (this.f64430k != null) {
            IOException iOException = this.f64431l;
            if (iOException != null) {
                throw iOException;
            }
            EnumC6726b enumC6726b = this.f64430k;
            Intrinsics.f(enumC6726b);
            throw new t(enumC6726b);
        }
    }

    public final void d(@NotNull EnumC6726b rstStatusCode, IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f64433n.n1(this.f64432m, rstStatusCode);
        }
    }

    public final void f(@NotNull EnumC6726b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f64433n.q1(this.f64432m, errorCode);
        }
    }

    public final void g(@NotNull z trailers) {
        Intrinsics.checkNotNullParameter(trailers, "trailers");
        synchronized (this) {
            if (this.f64427h.j()) {
                throw new IllegalStateException("already finished");
            }
            if (trailers.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
            this.f64427h.m(trailers);
            Unit unit = Unit.f71690a;
        }
    }

    @NotNull
    public final f h() {
        return this.f64433n;
    }

    public final synchronized EnumC6726b i() {
        return this.f64430k;
    }

    public final IOException j() {
        return this.f64431l;
    }

    public final int k() {
        return this.f64432m;
    }

    public final long l() {
        return this.f64421b;
    }

    public final long m() {
        return this.f64420a;
    }

    @NotNull
    public final c n() {
        return this.f64428i;
    }

    @NotNull
    public final a o() {
        synchronized (this) {
            try {
                if (!this.f64425f && !v()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f64427h;
    }

    @NotNull
    public final a p() {
        return this.f64427h;
    }

    @NotNull
    public final b q() {
        return this.f64426g;
    }

    @NotNull
    public final b r() {
        return this.f64426g;
    }

    public final long s() {
        return this.f64423d;
    }

    public final long t() {
        return this.f64422c;
    }

    @NotNull
    public final c u() {
        return this.f64429j;
    }

    public final boolean v() {
        return this.f64433n.O() == ((this.f64432m & 1) == 1);
    }

    public final synchronized boolean w() {
        try {
            if (this.f64430k != null) {
                return false;
            }
            if (!this.f64426g.d()) {
                if (this.f64426g.c()) {
                }
                return true;
            }
            if (this.f64427h.j() || this.f64427h.d()) {
                if (this.f64425f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final c x() {
        return this.f64428i;
    }

    public final void y(@NotNull G source, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArr = Ye.b.f34900a;
        this.f64426g.j(source, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0008, B:8:0x000f, B:10:0x0021, B:11:0x0026, B:19:0x0017), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(@NotNull z headers, boolean z11) {
        boolean w11;
        Intrinsics.checkNotNullParameter(headers, "headers");
        byte[] bArr = Ye.b.f34900a;
        synchronized (this) {
            try {
                if (this.f64425f && z11) {
                    this.f64426g.getClass();
                    if (z11) {
                        this.f64426g.k();
                    }
                    w11 = w();
                    notifyAll();
                    Unit unit = Unit.f71690a;
                }
                this.f64425f = true;
                this.f64424e.add(headers);
                if (z11) {
                }
                w11 = w();
                notifyAll();
                Unit unit2 = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (w11) {
            return;
        }
        this.f64433n.M0(this.f64432m);
    }
}
