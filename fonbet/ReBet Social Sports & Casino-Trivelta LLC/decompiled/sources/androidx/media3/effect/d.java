package androidx.media3.effect;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.effect.i;
import androidx.media3.effect.r;
import b1.C2357k;
import b1.C2368w;
import b1.InterfaceC2360n;
import b1.InterfaceC2367v;
import b1.V;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import java.util.Objects;
import java.util.concurrent.Executor;
import l1.C5381t;
import l1.L0;

/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20685a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2360n f20686b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceView f20687c;

    /* renamed from: d, reason: collision with root package name */
    public C5381t f20688d;

    /* renamed from: e, reason: collision with root package name */
    public c f20689e;

    /* renamed from: f, reason: collision with root package name */
    public final C2357k f20690f;

    /* renamed from: k, reason: collision with root package name */
    public EGLDisplay f20695k;

    /* renamed from: l, reason: collision with root package name */
    public int f20696l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f20697m = -1;

    /* renamed from: g, reason: collision with root package name */
    public i.b f20691g = new a();

    /* renamed from: h, reason: collision with root package name */
    public i.c f20692h = new b();

    /* renamed from: i, reason: collision with root package name */
    public i.a f20693i = new i.a() { // from class: l1.n
        @Override // androidx.media3.effect.i.a
        public final void a(b1.V v10) {
            AbstractC4156x.e("DebugViewShaderProgram", "Exception caught by errorListener.", v10);
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public Executor f20694j = Ta.r.a();

    public class a implements i.b {
        public a() {
        }
    }

    public class b implements i.c {
        public b() {
        }
    }

    public static final class c implements SurfaceHolder.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final int f20700a;

        /* renamed from: b, reason: collision with root package name */
        public final EGLDisplay f20701b;

        /* renamed from: c, reason: collision with root package name */
        public final EGLContext f20702c;

        /* renamed from: d, reason: collision with root package name */
        public Surface f20703d;

        /* renamed from: e, reason: collision with root package name */
        public EGLSurface f20704e;

        /* renamed from: f, reason: collision with root package name */
        public int f20705f;

        /* renamed from: g, reason: collision with root package name */
        public int f20706g;

        public c(EGLDisplay eGLDisplay, EGLContext eGLContext, SurfaceView surfaceView, int i10) {
            this.f20701b = eGLDisplay;
            this.f20702c = eGLContext;
            if (i10 == 7 && Build.VERSION.SDK_INT < 34) {
                i10 = 6;
            }
            this.f20700a = i10;
            surfaceView.getHolder().addCallback(this);
            this.f20703d = surfaceView.getHolder().getSurface();
            this.f20705f = surfaceView.getWidth();
            this.f20706g = surfaceView.getHeight();
        }

        public synchronized void a(r.b bVar, InterfaceC2367v interfaceC2367v) {
            try {
                Surface surface = this.f20703d;
                if (surface == null) {
                    return;
                }
                if (this.f20704e == null) {
                    this.f20704e = interfaceC2367v.a(this.f20701b, surface, this.f20700a, false);
                }
                EGLSurface eGLSurface = this.f20704e;
                AbstractC4151s.C(this.f20701b, this.f20702c, eGLSurface, this.f20705f, this.f20706g);
                bVar.run();
                EGL14.eglSwapBuffers(this.f20701b, eGLSurface);
                GLES20.glFinish();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public synchronized void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            this.f20705f = i11;
            this.f20706g = i12;
            Surface surface = surfaceHolder.getSurface();
            if (!surface.equals(this.f20703d)) {
                this.f20703d = surface;
                this.f20704e = null;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public synchronized void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f20703d = null;
            this.f20704e = null;
            this.f20705f = -1;
            this.f20706g = -1;
        }
    }

    public d(Context context, InterfaceC2360n interfaceC2360n, C2357k c2357k) {
        this.f20685a = context;
        this.f20686b = interfaceC2360n;
        this.f20690f = c2357k;
    }

    @Override // androidx.media3.effect.i
    public void c(InterfaceC2367v interfaceC2367v, final C2368w c2368w, final long j10) {
        try {
            i(c2368w.f24638d, c2368w.f24639e);
            final C5381t c5381t = (C5381t) AbstractC4134a.e(this.f20688d);
            ((c) AbstractC4134a.e(this.f20689e)).a(new r.b() { // from class: l1.o
                @Override // androidx.media3.effect.r.b
                public final void run() {
                    C5381t.this.i(c2368w.f24635a, j10);
                }
            }, interfaceC2367v);
            this.f20692h.d(c2368w, j10);
        } catch (V | AbstractC4151s.a e10) {
            this.f20694j.execute(new Runnable() { // from class: l1.p
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.d.this.f20693i.a(b1.V.b(e10, j10));
                }
            });
        }
    }

    @Override // androidx.media3.effect.i
    public void f(Executor executor, i.a aVar) {
        this.f20693i = aVar;
        this.f20694j = executor;
    }

    @Override // androidx.media3.effect.i
    public void flush() {
        C5381t c5381t = this.f20688d;
        if (c5381t != null) {
            c5381t.flush();
        }
        this.f20691g.a();
        this.f20691g.e();
    }

    @Override // androidx.media3.effect.i
    public void g() {
        this.f20692h.c();
    }

    public final void i(int i10, int i11) {
        if (this.f20695k == null) {
            this.f20695k = AbstractC4151s.I();
        }
        EGLContext H10 = AbstractC4151s.H();
        if (this.f20696l == -1 || this.f20697m == -1) {
            this.f20696l = i10;
            this.f20697m = i11;
        }
        SurfaceView b10 = this.f20686b.b(this.f20696l, this.f20697m);
        if (b10 != null && !Objects.equals(this.f20687c, b10)) {
            this.f20689e = new c(this.f20695k, H10, b10, this.f20690f.f24606c);
        }
        this.f20687c = b10;
        if (this.f20688d == null) {
            AbstractC3445z.a aVar = new AbstractC3445z.a();
            aVar.a(L0.j(this.f20696l, this.f20697m, 0));
            Context context = this.f20685a;
            AbstractC3445z m10 = aVar.m();
            AbstractC3445z t10 = AbstractC3445z.t();
            C2357k c2357k = this.f20690f;
            this.f20688d = C5381t.r(context, m10, t10, c2357k, c2357k.f24606c == 1 ? 2 : 0);
        }
    }

    @Override // androidx.media3.effect.i
    public void l(i.c cVar) {
        this.f20692h = cVar;
    }

    @Override // androidx.media3.effect.i
    public void m(C2368w c2368w) {
        this.f20691g.b(c2368w);
        this.f20691g.e();
    }

    @Override // androidx.media3.effect.i
    public void n(i.b bVar) {
        this.f20691g = bVar;
        bVar.e();
    }

    @Override // androidx.media3.effect.i
    public void release() {
        C5381t c5381t = this.f20688d;
        if (c5381t != null) {
            c5381t.release();
        }
        try {
            AbstractC4151s.d();
        } catch (AbstractC4151s.a e10) {
            throw new V(e10);
        }
    }
}
