package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.Executors;
import xsna.ahn;
import xsna.fxc0;
import xsna.gr;
import xsna.grz;
import xsna.gtf0;
import xsna.m5k;
import xsna.p2r0;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class Loader implements grz {
    public static final b d = new b(0, C.TIME_UNSET);
    public static final b e = new b(2, C.TIME_UNSET);
    public static final b f = new b(3, C.TIME_UNSET);
    public final gtf0 a;

    @Nullable
    public c<? extends d> b;

    @Nullable
    public IOException c;

    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UnexpectedLoaderException(Throwable th) {
            super(r0.toString(), th);
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            sb.append(th.getMessage() != null ? m5k.b(th, new StringBuilder(": ")) : "");
        }
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean a() {
            int i = this.a;
            return i == 0 || i == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class c<T extends d> extends Handler implements Runnable {
        public final int b;
        public final T c;
        public final long d;

        @Nullable
        public a<T> e;

        @Nullable
        public IOException f;
        public int g;

        @Nullable
        public Thread h;
        public boolean i;
        public volatile boolean j;

        public c(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.c = t;
            this.e = aVar;
            this.b = i;
            this.d = j;
        }

        public final void a(boolean z) {
            this.j = z;
            this.f = null;
            if (hasMessages(1)) {
                this.i = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.i = true;
                        this.c.cancelLoad();
                        Thread thread = this.h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                Loader.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.e;
                aVar.getClass();
                aVar.j(this.c, elapsedRealtime, elapsedRealtime - this.d, true);
                this.e = null;
            }
        }

        public final void b() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.d;
            a<T> aVar = this.e;
            aVar.getClass();
            aVar.i(this.c, elapsedRealtime, j, this.g);
            this.f = null;
            Loader loader = Loader.this;
            gtf0 gtf0Var = loader.a;
            c<? extends d> cVar = loader.b;
            cVar.getClass();
            gtf0Var.execute(cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.j) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            Loader.this.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.d;
            a<T> aVar = this.e;
            aVar.getClass();
            if (this.i) {
                aVar.j(this.c, elapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    aVar.d(this.c, elapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    ahn.o("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.c = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f = iOException;
            int i3 = this.g + 1;
            this.g = i3;
            b g = aVar.g(this.c, elapsedRealtime, j, iOException, i3);
            int i4 = g.a;
            if (i4 == 3) {
                Loader.this.c = this.f;
                return;
            }
            if (i4 != 2) {
                if (i4 == 1) {
                    this.g = 1;
                }
                long j2 = g.b;
                if (j2 == C.TIME_UNSET) {
                    j2 = Math.min((this.g - 1) * 1000, 5000);
                }
                Loader loader = Loader.this;
                fxc0.z(loader.b == null);
                loader.b = this;
                if (j2 > 0) {
                    sendEmptyMessageDelayed(1, j2);
                } else {
                    b();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.i;
                    this.h = Thread.currentThread();
                }
                if (!z) {
                    Trace.beginSection("load:".concat(this.c.getClass().getSimpleName()));
                    try {
                        this.c.load();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.h = null;
                    Thread.interrupted();
                }
                if (this.j) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.j) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Exception e2) {
                if (this.j) {
                    return;
                }
                ahn.o("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.j) {
                    return;
                }
                ahn.o("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.j) {
                    ahn.o("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    public interface d {
        void cancelLoad();

        void load() throws IOException;
    }

    public interface e {
        void onLoaderReleased();
    }

    public static final class f implements Runnable {
        public final e b;

        public f(e eVar) {
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.onLoaderReleased();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Loader(String str) {
        this(new gtf0(Executors.newSingleThreadExecutor(new p2r0(r3)), new gr(18)));
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = y2r0.a;
    }

    public final void a() {
        c<? extends d> cVar = this.b;
        cVar.getClass();
        cVar.a(false);
    }

    public final boolean b() {
        return this.c != null;
    }

    public final boolean c() {
        return this.b != null;
    }

    public final void d(@Nullable e eVar) {
        c<? extends d> cVar = this.b;
        if (cVar != null) {
            cVar.a(true);
        }
        gtf0 gtf0Var = this.a;
        if (eVar != null) {
            gtf0Var.execute(new f(eVar));
        }
        gtf0Var.c.accept(gtf0Var.b);
    }

    public final <T extends d> long e(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c<? extends d> cVar = new c<>(myLooper, t, aVar, i, elapsedRealtime);
        fxc0.z(this.b == null);
        this.b = cVar;
        cVar.b();
        return elapsedRealtime;
    }

    @Override // xsna.grz
    public final void maybeThrowError() throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        c<? extends d> cVar = this.b;
        if (cVar != null) {
            int i = cVar.b;
            IOException iOException2 = cVar.f;
            if (iOException2 != null && cVar.g > i) {
                throw iOException2;
            }
        }
    }

    public Loader(gtf0 gtf0Var) {
        this.a = gtf0Var;
    }

    public interface a<T extends d> {
        void d(T t, long j, long j2);

        b g(T t, long j, long j2, IOException iOException, int i);

        void j(T t, long j, long j2, boolean z);

        default void i(T t, long j, long j2, int i) {
        }
    }
}
