package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wfb extends Handler implements Runnable {
    public final int a;
    public final wcf b;
    public ufb c;
    public IOException d;
    public int e;
    public Thread f;
    public boolean g;
    public volatile boolean h;
    public final /* synthetic */ sx2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfb(sx2 sx2Var, Looper looper, wcf wcfVar, ufb ufbVar, int i, long j) {
        super(looper);
        this.i = sx2Var;
        this.b = wcfVar;
        this.c = ufbVar;
        this.a = i;
    }

    public final void a(boolean z) {
        this.h = z;
        this.d = null;
        if (hasMessages(0)) {
            this.g = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.g = true;
                    this.b.g = true;
                    Thread thread = this.f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.i.b = null;
            SystemClock.elapsedRealtime();
            ufb ufbVar = this.c;
            ufbVar.getClass();
            ufbVar.f(this.b, true);
            this.c = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.h) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.d = null;
            sx2 sx2Var = this.i;
            ExecutorService executorService = (ExecutorService) sx2Var.a;
            wfb wfbVar = (wfb) sx2Var.b;
            wfbVar.getClass();
            executorService.execute(wfbVar);
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.i.b = null;
        SystemClock.elapsedRealtime();
        ufb ufbVar = this.c;
        ufbVar.getClass();
        if (this.g) {
            ufbVar.f(this.b, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                ufbVar.b(this.b);
                return;
            } catch (RuntimeException e) {
                m6k.C("Unexpected exception handling load completed", e);
                this.i.c = new bgb(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.d = iOException;
        int i3 = this.e + 1;
        this.e = i3;
        r5a h = ufbVar.h(this.b, iOException, i3);
        int i4 = h.a;
        if (i4 == 3) {
            this.i.c = this.d;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.e = 1;
            }
            long j = h.b;
            if (j == C.TIME_UNSET) {
                j = Math.min((this.e - 1) * 1000, 5000);
            }
            sx2 sx2Var2 = this.i;
            qx9.t(((wfb) sx2Var2.b) == null);
            sx2Var2.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                this.d = null;
                ((ExecutorService) sx2Var2.a).execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.g;
                this.f = Thread.currentThread();
            }
            if (!z) {
                q5a.y("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.b();
                    q5a.B();
                } catch (Throwable th) {
                    q5a.B();
                    throw th;
                }
            }
            synchronized (this) {
                this.f = null;
                Thread.interrupted();
            }
            if (this.h) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.h) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.h) {
                return;
            }
            m6k.C("Unexpected exception loading stream", e2);
            obtainMessage(2, new bgb(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.h) {
                return;
            }
            m6k.C("OutOfMemory error loading stream", e3);
            obtainMessage(2, new bgb(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.h) {
                m6k.C("Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
