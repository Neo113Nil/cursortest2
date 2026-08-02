package D1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.InterfaceC4148o;
import e1.T;
import e1.Z;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final c f2454d = h(false, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final c f2455e = h(true, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final c f2456f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f2457g;

    /* renamed from: a, reason: collision with root package name */
    public final E1.b f2458a;

    /* renamed from: b, reason: collision with root package name */
    public d f2459b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f2460c;

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f2461a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2462b;

        public boolean c() {
            int i10 = this.f2461a;
            return i10 == 0 || i10 == 1;
        }

        public c(int i10, long j10) {
            this.f2461a = i10;
            this.f2462b = j10;
        }
    }

    public final class d extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f2463a;

        /* renamed from: b, reason: collision with root package name */
        public final e f2464b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2465c;

        /* renamed from: d, reason: collision with root package name */
        public b f2466d;

        /* renamed from: e, reason: collision with root package name */
        public IOException f2467e;

        /* renamed from: f, reason: collision with root package name */
        public int f2468f;

        /* renamed from: g, reason: collision with root package name */
        public Thread f2469g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2470h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f2471i;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f2464b = eVar;
            this.f2466d = bVar;
            this.f2463a = i10;
            this.f2465c = j10;
        }

        public void a(boolean z10) {
            this.f2471i = z10;
            this.f2467e = null;
            if (hasMessages(1)) {
                this.f2470h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f2470h = true;
                        this.f2464b.c();
                        Thread thread = this.f2469g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) AbstractC4134a.e(this.f2466d)).l(this.f2464b, elapsedRealtime, elapsedRealtime - this.f2465c, true);
                this.f2466d = null;
            }
        }

        public final void b() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ((b) AbstractC4134a.e(this.f2466d)).j(this.f2464b, elapsedRealtime, elapsedRealtime - this.f2465c, this.f2468f);
            this.f2467e = null;
            m.this.f2458a.execute((Runnable) AbstractC4134a.e(m.this.f2459b));
        }

        public final void c() {
            m.this.f2459b = null;
        }

        public final long d() {
            return Math.min((this.f2468f - 1) * 1000, 5000);
        }

        public void e(int i10) {
            IOException iOException = this.f2467e;
            if (iOException != null && this.f2468f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            AbstractC4134a.g(m.this.f2459b == null);
            m.this.f2459b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f2471i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f2465c;
            b bVar = (b) AbstractC4134a.e(this.f2466d);
            if (this.f2470h) {
                bVar.l(this.f2464b, elapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.i(this.f2464b, elapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    AbstractC4156x.e("LoadTask", "Unexpected exception handling load completed", e10);
                    m.this.f2460c = new h(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f2467e = iOException;
            int i12 = this.f2468f + 1;
            this.f2468f = i12;
            c o10 = bVar.o(this.f2464b, elapsedRealtime, j10, iOException, i12);
            if (o10.f2461a == 3) {
                m.this.f2460c = this.f2467e;
            } else if (o10.f2461a != 2) {
                if (o10.f2461a == 1) {
                    this.f2468f = 1;
                }
                f(o10.f2462b != -9223372036854775807L ? o10.f2462b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f2470h;
                    this.f2469g = Thread.currentThread();
                }
                if (!z10) {
                    T.a("load:" + this.f2464b.getClass().getSimpleName());
                    try {
                        this.f2464b.a();
                        T.b();
                    } catch (Throwable th2) {
                        T.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f2469g = null;
                    Thread.interrupted();
                }
                if (this.f2471i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f2471i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f2471i) {
                    AbstractC4156x.e("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f2471i) {
                    return;
                }
                AbstractC4156x.e("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(3, new h(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f2471i) {
                    return;
                }
                AbstractC4156x.e("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(3, new h(e13)).sendToTarget();
            }
        }
    }

    public interface e {
        void a();

        void c();
    }

    public interface f {
        void p();
    }

    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final f f2473a;

        public g(f fVar) {
            this.f2473a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2473a.p();
        }
    }

    public static final class h extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public h(Throwable th2) {
            super(r0.toString(), th2);
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f2456f = new c(2, j10);
        f2457g = new c(3, j10);
    }

    public m(String str) {
        this(E1.b.B(Z.b1("ExoPlayer:Loader:" + str), new InterfaceC4148o() { // from class: D1.l
            @Override // e1.InterfaceC4148o
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // D1.n
    public void a() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) AbstractC4134a.i(this.f2459b)).a(false);
    }

    public void g() {
        this.f2460c = null;
    }

    public boolean i() {
        return this.f2460c != null;
    }

    public boolean j() {
        return this.f2459b != null;
    }

    public void k(int i10) {
        IOException iOException = this.f2460c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f2459b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f2463a;
            }
            dVar.e(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.f2459b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f2458a.execute(new g(fVar));
        }
        this.f2458a.release();
    }

    public long n(e eVar, b bVar, int i10) {
        Looper looper = (Looper) AbstractC4134a.i(Looper.myLooper());
        this.f2460c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i10, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }

    public m(E1.b bVar) {
        this.f2458a = bVar;
    }

    public interface b {
        void i(e eVar, long j10, long j11);

        void l(e eVar, long j10, long j11, boolean z10);

        c o(e eVar, long j10, long j11, IOException iOException, int i10);

        default void j(e eVar, long j10, long j11, int i10) {
        }
    }
}
