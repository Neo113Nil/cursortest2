package F1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import com.facebook.react.uimanager.ViewProps;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final C1147i f3236a = new C1147i();

    /* renamed from: b, reason: collision with root package name */
    public final b f3237b;

    /* renamed from: c, reason: collision with root package name */
    public final c f3238c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3239d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f3240e;

    /* renamed from: f, reason: collision with root package name */
    public float f3241f;

    /* renamed from: g, reason: collision with root package name */
    public float f3242g;

    /* renamed from: h, reason: collision with root package name */
    public float f3243h;

    /* renamed from: i, reason: collision with root package name */
    public float f3244i;

    /* renamed from: j, reason: collision with root package name */
    public int f3245j;

    /* renamed from: k, reason: collision with root package name */
    public long f3246k;

    /* renamed from: l, reason: collision with root package name */
    public long f3247l;

    /* renamed from: m, reason: collision with root package name */
    public long f3248m;

    /* renamed from: n, reason: collision with root package name */
    public long f3249n;

    /* renamed from: o, reason: collision with root package name */
    public long f3250o;

    /* renamed from: p, reason: collision with root package name */
    public long f3251p;

    /* renamed from: q, reason: collision with root package name */
    public long f3252q;

    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                AbstractC4156x.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    public static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        public static final c f3255f = new c();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f3256a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f3257b;

        /* renamed from: c, reason: collision with root package name */
        public final HandlerThread f3258c;

        /* renamed from: d, reason: collision with root package name */
        public Choreographer f3259d;

        /* renamed from: e, reason: collision with root package name */
        public int f3260e;

        public c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f3258c = handlerThread;
            handlerThread.start();
            Handler y10 = Z.y(handlerThread.getLooper(), this);
            this.f3257b = y10;
            y10.sendEmptyMessage(1);
        }

        public static c d() {
            return f3255f;
        }

        public void a() {
            this.f3257b.sendEmptyMessage(2);
        }

        public final void b() {
            Choreographer choreographer = this.f3259d;
            if (choreographer != null) {
                int i10 = this.f3260e + 1;
                this.f3260e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public final void c() {
            try {
                this.f3259d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                AbstractC4156x.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f3256a = j10;
            ((Choreographer) AbstractC4134a.e(this.f3259d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f3257b.sendEmptyMessage(3);
        }

        public final void f() {
            Choreographer choreographer = this.f3259d;
            if (choreographer != null) {
                int i10 = this.f3260e - 1;
                this.f3260e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f3256a = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public C(Context context) {
        b f10 = f(context);
        this.f3237b = f10;
        this.f3238c = f10 != null ? c.d() : null;
        this.f3246k = -9223372036854775807L;
        this.f3247l = -9223372036854775807L;
        this.f3241f = -1.0f;
        this.f3244i = 1.0f;
        this.f3245j = 0;
    }

    public static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    public static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j12 + j14;
            j13 = j14;
            j14 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long b(long j10) {
        long j11;
        c cVar;
        long j12;
        if (this.f3251p != -1 && this.f3236a.e()) {
            long a10 = this.f3252q + ((long) ((this.f3236a.a() * (this.f3248m - this.f3251p)) / this.f3244i));
            if (c(j10, a10)) {
                j11 = a10;
                this.f3249n = this.f3248m;
                this.f3250o = j11;
                cVar = this.f3238c;
                if (cVar != null && this.f3246k != -9223372036854775807L) {
                    j12 = cVar.f3256a;
                    if (j12 != -9223372036854775807L) {
                        return e(j11, j12, this.f3246k) - this.f3247l;
                    }
                }
                return j11;
            }
            n();
        }
        j11 = j10;
        this.f3249n = this.f3248m;
        this.f3250o = j11;
        cVar = this.f3238c;
        if (cVar != null) {
            j12 = cVar.f3256a;
            if (j12 != -9223372036854775807L) {
            }
        }
        return j11;
    }

    public final void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f3240e) == null || this.f3245j == Integer.MIN_VALUE || this.f3243h == 0.0f) {
            return;
        }
        this.f3243h = 0.0f;
        a.a(surface, 0.0f);
    }

    public final b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY)) == null) {
            return null;
        }
        return new b(displayManager);
    }

    public void g(float f10) {
        this.f3241f = f10;
        this.f3236a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f3249n;
        if (j11 != -1) {
            this.f3251p = j11;
            this.f3252q = this.f3250o;
        }
        this.f3248m++;
        this.f3236a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f3244i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f3239d = true;
        n();
        if (this.f3237b != null) {
            ((c) AbstractC4134a.e(this.f3238c)).a();
            this.f3237b.b();
        }
        r(false);
    }

    public void l() {
        this.f3239d = false;
        b bVar = this.f3237b;
        if (bVar != null) {
            bVar.c();
            ((c) AbstractC4134a.e(this.f3238c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.f3240e == surface) {
            return;
        }
        d();
        this.f3240e = surface;
        r(true);
    }

    public final void n() {
        this.f3248m = 0L;
        this.f3251p = -1L;
        this.f3249n = -1L;
    }

    public void o(int i10) {
        if (this.f3245j == i10) {
            return;
        }
        this.f3245j = i10;
        r(true);
    }

    public final void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f3246k = refreshRate;
            this.f3247l = (refreshRate * 80) / 100;
        } else {
            AbstractC4156x.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f3246k = -9223372036854775807L;
            this.f3247l = -9223372036854775807L;
        }
    }

    public final void q() {
        if (Build.VERSION.SDK_INT < 30 || this.f3240e == null) {
            return;
        }
        float b10 = this.f3236a.e() ? this.f3236a.b() : this.f3241f;
        float f10 = this.f3242g;
        if (b10 == f10) {
            return;
        }
        if (b10 != -1.0f && f10 != -1.0f) {
            if (Math.abs(b10 - this.f3242g) < ((!this.f3236a.e() || this.f3236a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b10 == -1.0f && this.f3236a.c() < 30) {
            return;
        }
        this.f3242g = b10;
        r(false);
    }

    public final void r(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f3240e) == null || this.f3245j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f3239d) {
            float f11 = this.f3242g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f3244i;
                if (z10 && this.f3243h == f10) {
                    return;
                }
                this.f3243h = f10;
                a.a(surface, f10);
            }
        }
        f10 = 0.0f;
        if (z10) {
        }
        this.f3243h = f10;
        a.a(surface, f10);
    }

    public final class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f3253a;

        public b(DisplayManager displayManager) {
            this.f3253a = displayManager;
        }

        public final Display a() {
            return this.f3253a.getDisplay(0);
        }

        public void b() {
            this.f3253a.registerDisplayListener(this, Z.z());
            C.this.p(a());
        }

        public void c() {
            this.f3253a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                C.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
