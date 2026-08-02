package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncTimeout.java */
/* loaded from: classes14.dex */
public class a extends t {
    private static final long h;
    private static final long i;

    @Nullable
    static a j;
    private boolean e;

    @Nullable
    private a f;
    private long g;

    /* compiled from: AsyncTimeout.java */
    /* renamed from: com.mbridge.msdk.thrid.okio.a$a, reason: collision with other inner class name */
    public class C0336a implements r {
        final /* synthetic */ r a;

        public C0336a(r rVar) {
            this.a = rVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            u.a(cVar.b, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                o oVar = cVar.a;
                while (true) {
                    if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j2 += oVar.c - oVar.b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    oVar = oVar.f;
                }
                a.this.h();
                try {
                    try {
                        this.a.a(cVar, j2);
                        j -= j2;
                        a.this.a(true);
                    } catch (IOException e) {
                        throw a.this.a(e);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.h();
            try {
                try {
                    this.a.close();
                    a.this.a(true);
                } catch (IOException e) {
                    throw a.this.a(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.h();
            try {
                try {
                    this.a.flush();
                    a.this.a(true);
                } catch (IOException e) {
                    throw a.this.a(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.a + ")";
        }
    }

    /* compiled from: AsyncTimeout.java */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0017, code lost:
        
            r1.j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            while (true) {
                synchronized (a.class) {
                    try {
                        a g = a.g();
                        if (g != null) {
                            if (g == a.j) {
                                a.j = null;
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private static synchronized void a(a aVar, long j2, boolean z) {
        synchronized (a.class) {
            try {
                if (j == null) {
                    j = new a();
                    new c().start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    aVar.g = Math.min(j2, aVar.c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    aVar.g = j2 + nanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    aVar.g = aVar.c();
                }
                long b2 = aVar.b(nanoTime);
                a aVar2 = j;
                while (true) {
                    a aVar3 = aVar2.f;
                    if (aVar3 == null || b2 < aVar3.b(nanoTime)) {
                        break;
                    } else {
                        aVar2 = aVar2.f;
                    }
                }
                aVar.f = aVar2.f;
                aVar2.f = aVar;
                if (aVar2 == j) {
                    a.class.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private long b(long j2) {
        return this.g - j2;
    }

    @Nullable
    public static a g() throws InterruptedException {
        a aVar = j.f;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(h);
            if (j.f != null || System.nanoTime() - nanoTime < i) {
                return null;
            }
            return j;
        }
        long b2 = aVar.b(System.nanoTime());
        if (b2 > 0) {
            long j2 = b2 / 1000000;
            a.class.wait(j2, (int) (b2 - (1000000 * j2)));
            return null;
        }
        j.f = aVar.f;
        aVar.f = null;
        return aVar;
    }

    public final void h() {
        if (this.e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long f = f();
        boolean d = d();
        if (f != 0 || d) {
            this.e = true;
            a(this, f, d);
        }
    }

    public final boolean i() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a(this);
    }

    public IOException b(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* compiled from: AsyncTimeout.java */
    public class b implements s {
        final /* synthetic */ s a;

        public b(s sVar) {
            this.a = sVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            a.this.h();
            try {
                try {
                    long b = this.a.b(cVar, j);
                    a.this.a(true);
                    return b;
                } catch (IOException e) {
                    throw a.this.a(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.a.close();
                    a.this.a(true);
                } catch (IOException e) {
                    throw a.this.a(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.a + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return a.this;
        }
    }

    private static synchronized boolean a(a aVar) {
        synchronized (a.class) {
            a aVar2 = j;
            while (aVar2 != null) {
                a aVar3 = aVar2.f;
                if (aVar3 == aVar) {
                    aVar2.f = aVar.f;
                    aVar.f = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    public void j() {
    }

    public final r a(r rVar) {
        return new C0336a(rVar);
    }

    public final s a(s sVar) {
        return new b(sVar);
    }

    public final void a(boolean z) throws IOException {
        if (i() && z) {
            throw b((IOException) null);
        }
    }

    public final IOException a(IOException iOException) throws IOException {
        return !i() ? iOException : b(iOException);
    }
}
