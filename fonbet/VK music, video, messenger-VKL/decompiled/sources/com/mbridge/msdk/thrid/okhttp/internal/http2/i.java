package com.mbridge.msdk.thrid.okhttp.internal.http2;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.thrid.okhttp.internal.http2.c;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import defpackage.k0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* compiled from: Http2Stream.java */
/* loaded from: classes14.dex */
public final class i {
    static final /* synthetic */ boolean l = true;
    long a = 0;
    long b;
    final int c;
    final g d;
    private final Deque<r> e;
    private boolean f;
    private final b g;
    final a h;
    final c i;
    final c j;
    com.mbridge.msdk.thrid.okhttp.internal.http2.b k;

    /* compiled from: Http2Stream.java */
    public class c extends com.mbridge.msdk.thrid.okio.a {
        public c() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
            i.this.d.l();
        }

        public void k() throws IOException {
            if (i()) {
                throw b((IOException) null);
            }
        }
    }

    public i(int i, g gVar, boolean z, boolean z2, r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.i = new c();
        this.j = new c();
        this.k = null;
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.c = i;
        this.d = gVar;
        this.b = gVar.u.c();
        b bVar = new b(gVar.t.c());
        this.g = bVar;
        a aVar = new a();
        this.h = aVar;
        bVar.e = z2;
        aVar.c = z;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (f() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public static /* synthetic */ c.a b(i iVar) {
        iVar.getClass();
        return null;
    }

    public int c() {
        return this.c;
    }

    public com.mbridge.msdk.thrid.okio.r d() {
        synchronized (this) {
            try {
                if (!this.f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.h;
    }

    public s e() {
        return this.g;
    }

    public boolean f() {
        return this.d.a == ((this.c & 1) == 1);
    }

    public synchronized boolean g() {
        try {
            if (this.k != null) {
                return false;
            }
            b bVar = this.g;
            if (!bVar.e) {
                if (bVar.d) {
                }
                return true;
            }
            a aVar = this.h;
            if (aVar.c || aVar.b) {
                if (this.f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public t h() {
        return this.i;
    }

    public void i() {
        boolean g;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.g.e = true;
            g = g();
            notifyAll();
        }
        if (g) {
            return;
        }
        this.d.c(this.c);
    }

    public synchronized r j() throws IOException {
        this.i.h();
        while (this.e.isEmpty() && this.k == null) {
            try {
                k();
            } catch (Throwable th) {
                this.i.k();
                throw th;
            }
        }
        this.i.k();
        if (this.e.isEmpty()) {
            throw new n(this.k);
        }
        return this.e.removeFirst();
    }

    public void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.j;
    }

    private boolean b(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.k != null) {
                    return false;
                }
                if (this.g.e && this.h.c) {
                    return false;
                }
                this.k = bVar;
                notifyAll();
                this.d.c(this.c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        if (b(bVar)) {
            this.d.b(this.c, bVar);
        }
    }

    public void c(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.d.c(this.c, bVar);
        }
    }

    /* compiled from: Http2Stream.java */
    public final class a implements com.mbridge.msdk.thrid.okio.r {
        static final /* synthetic */ boolean e = true;
        private final com.mbridge.msdk.thrid.okio.c a = new com.mbridge.msdk.thrid.okio.c();
        boolean b;
        boolean c;

        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            if (!e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.a.a(cVar, j);
            while (this.a.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                a(false);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return i.this.j;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                try {
                    if (this.b) {
                        return;
                    }
                    if (!i.this.h.c) {
                        if (this.a.size() > 0) {
                            while (this.a.size() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.d.a(iVar.c, true, (com.mbridge.msdk.thrid.okio.c) null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.b = true;
                    }
                    i.this.d.flush();
                    i.this.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (!e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.a.size() > 0) {
                a(false);
                i.this.d.flush();
            }
        }

        private void a(boolean z) throws IOException {
            i iVar;
            long min;
            i iVar2;
            synchronized (i.this) {
                i.this.j.h();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.b > 0 || this.c || this.b || iVar.k != null) {
                            break;
                        } else {
                            iVar.k();
                        }
                    } finally {
                        i.this.j.k();
                    }
                }
                iVar.j.k();
                i.this.b();
                min = Math.min(i.this.b, this.a.size());
                iVar2 = i.this;
                iVar2.b -= min;
            }
            iVar2.j.h();
            try {
                i iVar3 = i.this;
                iVar3.d.a(iVar3.c, z && min == this.a.size(), this.a, min);
                i.this.j.k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        boolean g;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f = true;
            this.e.add(com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
            g = g();
            notifyAll();
        }
        if (g) {
            return;
        }
        this.d.c(this.c);
    }

    public synchronized void d(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (this.k == null) {
            this.k = bVar;
            notifyAll();
        }
    }

    public void a(com.mbridge.msdk.thrid.okio.e eVar, int i) throws IOException {
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.g.a(eVar, i);
    }

    public void b() throws IOException {
        a aVar = this.h;
        if (!aVar.b) {
            if (!aVar.c) {
                if (this.k != null) {
                    throw new n(this.k);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void a() throws IOException {
        boolean z;
        boolean g;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                b bVar = this.g;
                if (!bVar.e && bVar.d) {
                    a aVar = this.h;
                    if (!aVar.c) {
                        if (aVar.b) {
                        }
                    }
                    z = true;
                    g = g();
                }
                z = false;
                g = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
        } else {
            if (g) {
                return;
            }
            this.d.c(this.c);
        }
    }

    public void a(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* compiled from: Http2Stream.java */
    public final class b implements s {
        static final /* synthetic */ boolean g = true;
        private final com.mbridge.msdk.thrid.okio.c a = new com.mbridge.msdk.thrid.okio.c();
        private final com.mbridge.msdk.thrid.okio.c b = new com.mbridge.msdk.thrid.okio.c();
        private final long c;
        boolean d;
        boolean e;

        public b(long j) {
            this.c = j;
        }

        private void f(long j) {
            if (!g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.d.g(j);
        }

        public void a(com.mbridge.msdk.thrid.okio.e eVar, long j) throws IOException {
            boolean z;
            boolean z2;
            long j2;
            if (!g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (i.this) {
                    z = this.e;
                    z2 = this.b.size() + j > this.c;
                }
                if (z2) {
                    eVar.skip(j);
                    i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    eVar.skip(j);
                    return;
                }
                long b = eVar.b(this.a, j);
                if (b == -1) {
                    throw new EOFException();
                }
                j -= b;
                synchronized (i.this) {
                    try {
                        if (this.d) {
                            j2 = this.a.size();
                            this.a.k();
                        } else {
                            boolean z3 = this.b.size() == 0;
                            this.b.a(this.a);
                            if (z3) {
                                i.this.notifyAll();
                            }
                            j2 = 0;
                        }
                    } finally {
                    }
                }
                if (j2 > 0) {
                    f(j2);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        
            r12 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        
            r11.f.i.k();
         */
        @Override // com.mbridge.msdk.thrid.okio.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            long b;
            if (j < 0) {
                throw new IllegalArgumentException(k0.a(j, "byteCount < 0: "));
            }
            while (true) {
                synchronized (i.this) {
                    try {
                        i.this.i.h();
                        try {
                            i iVar = i.this;
                            bVar = iVar.k;
                            if (bVar == null) {
                                bVar = null;
                            }
                            if (this.d) {
                                throw new IOException("stream closed");
                            }
                            if (!iVar.e.isEmpty()) {
                                i.b(i.this);
                            }
                            if (this.b.size() > 0) {
                                com.mbridge.msdk.thrid.okio.c cVar2 = this.b;
                                b = cVar2.b(cVar, Math.min(j, cVar2.size()));
                                i iVar2 = i.this;
                                long j2 = iVar2.a + b;
                                iVar2.a = j2;
                                if (bVar == null && j2 >= iVar2.d.t.c() / 2) {
                                    i iVar3 = i.this;
                                    iVar3.d.a(iVar3.c, iVar3.a);
                                    i.this.a = 0L;
                                }
                            } else {
                                if (this.e || bVar != null) {
                                    break;
                                }
                                i.this.k();
                                i.this.i.k();
                            }
                        } finally {
                            i.this.i.k();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (b != -1) {
                    f(b);
                    return b;
                }
                if (bVar == null) {
                    return -1L;
                }
                throw new n(bVar);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                try {
                    this.d = true;
                    size = this.b.size();
                    this.b.k();
                    if (!i.this.e.isEmpty()) {
                        i.b(i.this);
                    }
                    i.this.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (size > 0) {
                f(size);
            }
            i.this.a();
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return i.this.i;
        }
    }
}
