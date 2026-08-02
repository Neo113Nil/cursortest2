package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xfb extends Handler implements Runnable {
    public final int a;
    public final yfb b;
    public final long c;
    public vfb d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ x6k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfb(x6k x6kVar, Looper looper, yfb yfbVar, vfb vfbVar, int i, long j) {
        super(looper);
        this.j = x6kVar;
        this.b = yfbVar;
        this.d = vfbVar;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(1)) {
            this.h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.h = true;
                    this.b.cancelLoad();
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.j.c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            vfb vfbVar = this.d;
            vfbVar.getClass();
            vfbVar.b(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        vfb vfbVar = this.d;
        vfbVar.getClass();
        vfbVar.l(this.b, elapsedRealtime, j, this.f);
        this.e = null;
        x6k x6kVar = this.j;
        irb irbVar = (irb) x6kVar.b;
        xfb xfbVar = (xfb) x6kVar.c;
        xfbVar.getClass();
        irbVar.execute(xfbVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
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
        this.j.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        vfb vfbVar = this.d;
        vfbVar.getClass();
        if (this.h) {
            vfbVar.b(this.b, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                vfbVar.d(this.b, elapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                tgj.A("Unexpected exception handling load completed", e);
                this.j.d = new cgb(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        r5a r = vfbVar.r(this.b, elapsedRealtime, j, iOException, i3);
        int i4 = r.a;
        if (i4 == 3) {
            this.j.d = this.e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f = 1;
            }
            long j2 = r.b;
            if (j2 == C.TIME_UNSET) {
                j2 = Math.min((this.f - 1) * 1000, 5000);
            }
            x6k x6kVar = this.j;
            z1a.E(((xfb) x6kVar.c) == null);
            x6kVar.c = this;
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
                z = this.h;
                this.g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.load();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.i) {
                return;
            }
            tgj.A("Unexpected exception loading stream", e2);
            obtainMessage(3, new cgb(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.i) {
                return;
            }
            tgj.A("OutOfMemory error loading stream", e3);
            obtainMessage(3, new cgb(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.i) {
                tgj.A("Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
