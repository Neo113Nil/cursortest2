package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import e1.RunnableC4150q;

/* loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f22090d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f22091e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22092a;

    /* renamed from: b, reason: collision with root package name */
    public final b f22093b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22094c;

    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public RunnableC4150q f22095a;

        /* renamed from: b, reason: collision with root package name */
        public Handler f22096b;

        /* renamed from: c, reason: collision with root package name */
        public Error f22097c;

        /* renamed from: d, reason: collision with root package name */
        public RuntimeException f22098d;

        /* renamed from: e, reason: collision with root package name */
        public PlaceholderSurface f22099e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public PlaceholderSurface a(int i10) {
            boolean z10;
            start();
            this.f22096b = new Handler(getLooper(), this);
            this.f22095a = new RunnableC4150q(this.f22096b);
            synchronized (this) {
                z10 = false;
                this.f22096b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f22099e == null && this.f22098d == null && this.f22097c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f22098d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f22097c;
            if (error == null) {
                return (PlaceholderSurface) AbstractC4134a.e(this.f22099e);
            }
            throw error;
        }

        public final void b(int i10) {
            AbstractC4134a.e(this.f22095a);
            this.f22095a.h(i10);
            this.f22099e = new PlaceholderSurface(this, this.f22095a.g(), i10 != 0);
        }

        public void c() {
            AbstractC4134a.e(this.f22096b);
            this.f22096b.sendEmptyMessage(2);
        }

        public final void d() {
            AbstractC4134a.e(this.f22095a);
            this.f22095a.i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (AbstractC4151s.a e10) {
                    AbstractC4156x.e("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f22098d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    AbstractC4156x.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f22097c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    AbstractC4156x.e("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f22098d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public static int a(Context context) {
        try {
            if (AbstractC4151s.P(context)) {
                return AbstractC4151s.Q() ? 1 : 2;
            }
            return 0;
        } catch (AbstractC4151s.a e10) {
            AbstractC4156x.d("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e10.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (PlaceholderSurface.class) {
            try {
                if (!f22091e) {
                    f22090d = a(context);
                    f22091e = true;
                }
                z10 = f22090d != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static PlaceholderSurface c(Context context, boolean z10) {
        AbstractC4134a.g(!z10 || b(context));
        return new b().a(z10 ? f22090d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f22093b) {
            try {
                if (!this.f22094c) {
                    this.f22093b.c();
                    this.f22094c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f22093b = bVar;
        this.f22092a = z10;
    }
}
