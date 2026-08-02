package com.vk.media.render;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.NonNull;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.f;
import com.vk.media.render.RenderTexture;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.ci9;
import xsna.cqi;
import xsna.efz;
import xsna.fap;
import xsna.g100;
import xsna.hts0;
import xsna.jhu0;
import xsna.map;
import xsna.mk9;
import xsna.mo9;
import xsna.s3q0;
import xsna.soo0;
import xsna.syf0;
import xsna.tyf0;
import xsna.xk9;

/* loaded from: classes3.dex */
public class RenderBase {
    public static volatile AtomicInteger r = new AtomicInteger(100);
    public final g100 a;
    public final RenderTexture b;
    public final float[] c;
    public final MediaUtils.d d;
    public final MediaUtils.d e;
    public final e f;
    public float[] g;
    public volatile RenderingState h;
    public boolean i;
    public fap j;
    public map.a k;
    public d l;
    public final mo9 m;
    public final Handler n;
    public final a o;
    public final b p;
    public final c q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RenderingState {
        private static final /* synthetic */ RenderingState[] $VALUES;
        public static final RenderingState PAUSE;
        public static final RenderingState START;
        public static final RenderingState STOP;

        static {
            RenderingState renderingState = new RenderingState("STOP", 0);
            STOP = renderingState;
            RenderingState renderingState2 = new RenderingState("PAUSE", 1);
            PAUSE = renderingState2;
            RenderingState renderingState3 = new RenderingState("START", 2);
            START = renderingState3;
            $VALUES = new RenderingState[]{renderingState, renderingState2, renderingState3};
        }

        public RenderingState() {
            throw null;
        }

        public static RenderingState valueOf(String str) {
            return (RenderingState) Enum.valueOf(RenderingState.class, str);
        }

        public static RenderingState[] values() {
            return (RenderingState[]) $VALUES.clone();
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.vk.media.render.a aVar;
            RenderBase renderBase = RenderBase.this;
            RenderTexture.b bVar = renderBase.b.c;
            MediaUtils.d dVar = renderBase.d;
            int i = dVar.a;
            int i2 = dVar.b;
            d dVar2 = renderBase.l;
            if (dVar2 != null && (aVar = dVar2.h) != null) {
                aVar.onSurfaceTextureAvailable(bVar, i, i2);
            }
            mo9 mo9Var = renderBase.m;
            if (mo9Var != null) {
                mo9Var.onSurfaceTextureAvailable(bVar, i, i2);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RenderBase renderBase = RenderBase.this;
            RenderTexture.b bVar = renderBase.b.c;
            if (bVar == null) {
                Log.e("RenderBase", "Unexpected texture (null)! Notifications skipped.");
                return;
            }
            MediaUtils.d dVar = renderBase.d;
            int i = dVar.a;
            int i2 = dVar.b;
            mo9 mo9Var = renderBase.m;
            if (mo9Var != null) {
                mo9Var.onSurfaceTextureSizeChanged(bVar, i, i2);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.vk.media.render.a aVar;
            RenderBase renderBase = RenderBase.this;
            RenderTexture.b bVar = renderBase.b.c;
            d dVar = renderBase.l;
            if (dVar == null || (aVar = dVar.h) == null) {
                return;
            }
            aVar.onSurfaceTextureDestroyed(bVar);
        }
    }

    public static class d extends tyf0 implements RenderTexture.Renderer {
        public com.vk.media.render.a h;
        public final mk9 i;
        public volatile xk9.b j = null;

        public d(mk9 mk9Var) {
            this.i = mk9Var;
        }

        @Override // com.vk.media.render.RenderTexture.a
        public final void g(@NonNull RenderTexture.Renderer.Error error, Throwable th) {
            mk9 mk9Var = this.i;
            String str = "onError(): error=" + error + ", exception=" + th;
            AtomicInteger atomicInteger = RenderBase.r;
            mk9Var.b(str);
        }

        @Override // xsna.tyf0
        public final void k(long j) {
            if (i()) {
                mk9 mk9Var = this.i;
                if (mk9Var.l != null) {
                    mk9Var.f();
                    xk9.b bVar = this.j;
                    if (bVar != null) {
                        bVar.a(j);
                    }
                }
            }
        }

        @Override // xsna.tyf0
        public final void l(int i, int i2) {
            mk9 mk9Var = this.i;
            MediaUtils.d dVar = mk9Var.d;
            if (i != dVar.a || i2 != dVar.b) {
                dVar.a = i;
                dVar.b = i2;
                RenderTexture.b bVar = mk9Var.b.c;
                if (bVar != null) {
                    bVar.setDefaultBufferSize(i, i2);
                }
                mk9Var.c();
                mk9Var.b("display size: " + i + "x" + i2);
            }
            com.vk.media.ok.b bVar2 = mk9Var.B;
            if (bVar2 != null) {
                MediaUtils.d dVar2 = new MediaUtils.d(i, i2);
                MediaUtils.d dVar3 = bVar2.f;
                if (dVar3.a != i || dVar3.b != i2) {
                    bVar2.f = dVar2;
                }
                bVar2.w();
            }
            mk9Var.getClass();
            mk9Var.b("onSurfaceChanged: " + i + "x" + i2);
            mk9Var.n.post(mk9Var.p);
        }

        @Override // xsna.tyf0
        public final void m(Surface surface) {
            mk9 mk9Var = this.i;
            g100 g100Var = mk9Var.a;
            mk9Var.b("onSurfaceCreated: surface=" + surface);
            mk9Var.j = new fap(surface != null ? mk9Var.i ? 7 : 3 : 0, g100Var);
            if (surface != null) {
                e eVar = mk9Var.f;
                map.b bVar = eVar.c;
                if (bVar != null) {
                    bVar.e();
                    eVar.c = null;
                }
                try {
                    fap fapVar = mk9Var.j;
                    if (fapVar != null) {
                        map.b bVar2 = new map.b(fapVar, surface, false);
                        eVar.b = surface;
                        eVar.c = bVar2;
                        bVar2.b();
                        mk9Var.f();
                    }
                } catch (Throwable th) {
                    g100Var.b("RenderBase", "can't create display #" + surface.hashCode(), th);
                }
            } else {
                mk9Var.a();
            }
            mk9Var.r();
            mk9Var.n.post(mk9Var.o);
        }

        @Override // xsna.tyf0
        public final void o() {
            mk9 mk9Var = this.i;
            f.a aVar = mk9Var.d0;
            if (aVar != null) {
                com.vk.media.recorder.f.this.D();
            }
            com.vk.media.gles.a aVar2 = mk9Var.z;
            if (aVar2 != null) {
                aVar2.h();
            }
            mk9Var.z = null;
            ci9.b bVar = mk9Var.A;
            if (bVar != null) {
                bVar.h();
            }
            mk9Var.A = null;
            com.vk.media.ok.b bVar2 = mk9Var.B;
            if (bVar2 != null) {
                bVar2.h();
            }
            mk9Var.B = null;
            hts0 hts0Var = mk9Var.S;
            if (hts0Var != null) {
                hts0Var.h();
            }
            mk9Var.S = null;
            mk9Var.h = RenderingState.STOP;
            e eVar = mk9Var.f;
            map.b bVar3 = eVar.c;
            if (bVar3 != null) {
                bVar3.e();
                eVar.c = null;
            }
            map.a aVar3 = mk9Var.k;
            if (aVar3 != null) {
                aVar3.c(true);
                mk9Var.k = null;
            }
            fap fapVar = mk9Var.j;
            if (fapVar != null) {
                fapVar.c();
                mk9Var.j = null;
            }
            RenderTexture renderTexture = mk9Var.b;
            synchronized (renderTexture.b) {
                try {
                    renderTexture.a.a("RenderTexture", "texture released! " + renderTexture.e);
                    RenderTexture.b bVar4 = renderTexture.c;
                    if (bVar4 != null) {
                        bVar4.setOnFrameAvailableListener(null);
                    }
                    renderTexture.c = null;
                    renderTexture.d = false;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mk9Var.b("onSurfaceDestroyed");
            mk9 mk9Var2 = this.i;
            mk9Var2.n.post(mk9Var2.q);
        }

        @Override // xsna.tyf0
        public final void p(SurfaceTexture surfaceTexture) {
            mk9 mk9Var = this.i;
            g100 g100Var = mk9Var.a;
            mk9Var.b("onSurfaceTextureCreated: surface=" + surfaceTexture);
            mk9Var.j = new fap(surfaceTexture != null ? mk9Var.i ? 7 : 3 : 0, g100Var);
            if (surfaceTexture != null) {
                e eVar = mk9Var.f;
                map.b bVar = eVar.c;
                if (bVar != null) {
                    bVar.e();
                    eVar.c = null;
                }
                try {
                    fap fapVar = mk9Var.j;
                    if (fapVar != null) {
                        map.b bVar2 = new map.b(fapVar);
                        bVar2.a(surfaceTexture);
                        eVar.a = surfaceTexture;
                        eVar.c = bVar2;
                        bVar2.b();
                        mk9Var.f();
                    }
                } catch (Throwable th) {
                    g100Var.b("RenderBase", "can't create display #" + surfaceTexture.hashCode() + " release=true, error=" + th, th);
                }
            } else {
                mk9Var.a();
            }
            mk9Var.r();
            mk9Var.n.post(mk9Var.o);
        }

        @Override // xsna.tyf0
        public final void q(jhu0.b bVar) {
            if (i()) {
                mk9 mk9Var = this.i;
                if (mk9Var.l != null) {
                    mk9Var.c0 = bVar;
                }
            }
        }

        public final void r(int i, int i2) {
            mk9 mk9Var = this.i;
            String a = efz.a(i, i2, "onBaseSurfaceChanged ", "x");
            AtomicInteger atomicInteger = RenderBase.r;
            mk9Var.b(a);
            syf0 syf0Var = (syf0) this.b;
            if (syf0Var == null || !i()) {
                return;
            }
            syf0Var.sendMessage(syf0Var.obtainMessage(2, i, i2));
        }

        public final void s(Object obj) {
            mk9 mk9Var = this.i;
            String c = cqi.c(obj, "onBaseSurfaceDestroyed ");
            AtomicInteger atomicInteger = RenderBase.r;
            mk9Var.b(c);
            syf0 syf0Var = (syf0) this.b;
            if (syf0Var != null && i() && syf0Var.a()) {
                syf0Var.sendMessage(syf0Var.obtainMessage(3, obj));
            }
        }
    }

    public static final class e {
        public SurfaceTexture a;
        public Surface b;
        public map.b c;
    }

    public class f extends d implements SurfaceHolder.Callback {
        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            r(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            Surface surface = surfaceHolder != null ? surfaceHolder.getSurface() : null;
            AtomicInteger atomicInteger = RenderBase.r;
            this.i.b("onBaseSurfaceCreated " + surface);
            j(this.i.a.a);
            syf0 syf0Var = (syf0) this.b;
            if (syf0Var == null || !i()) {
                return;
            }
            syf0Var.sendMessage(syf0Var.obtainMessage(0, surface));
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            s(surfaceHolder.getSurface());
        }
    }

    public RenderBase(mo9 mo9Var) {
        g100 g100Var = new g100(r.getAndIncrement());
        this.c = new float[16];
        this.d = new MediaUtils.d();
        this.e = new MediaUtils.d();
        e eVar = new e();
        new MediaUtils.d();
        this.f = eVar;
        this.h = RenderingState.START;
        this.n = new Handler(Looper.getMainLooper());
        this.o = new a();
        this.p = new b();
        this.q = new c();
        this.a = g100Var;
        this.b = new RenderTexture(g100Var);
        this.m = mo9Var;
    }

    public final void a() {
        MediaUtils.d dVar = this.d;
        map.a aVar = this.k;
        if (aVar != null) {
            aVar.c(true);
            this.k = null;
        }
        try {
            if (dVar.d()) {
                return;
            }
            map.a aVar2 = new map.a(this.j, dVar.a, dVar.b);
            this.k = aVar2;
            aVar2.b();
        } catch (Throwable th) {
            this.l.g(RenderTexture.Renderer.Error.ERROR_EGL, th);
            throw th;
        }
    }

    public final void b(String str) {
        this.a.a("RenderBase", str);
    }

    public final void c() {
        MediaUtils.d dVar = this.d;
        if (dVar.d()) {
            return;
        }
        MediaUtils.d dVar2 = this.e;
        if (dVar2.d()) {
            return;
        }
        b("fit preview: " + dVar2.a + "x" + dVar2.b + " into display: " + dVar.a + "x" + dVar.b);
        float f2 = (((float) dVar2.a) * 1.0f) / ((float) dVar2.b);
        float f3 = (((float) dVar.a) * 1.0f) / ((float) dVar.b);
        if (f2 < f3) {
            float[] fArr = new float[16];
            this.g = fArr;
            Matrix.setIdentityM(fArr, 0);
            Matrix.scaleM(this.g, 0, 1.0f, f3 / f2, 1.0f);
            return;
        }
        if (f2 <= f3) {
            this.g = null;
            return;
        }
        float[] fArr2 = new float[16];
        this.g = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.scaleM(this.g, 0, f2 / f3, 1.0f, 1.0f);
    }

    public final void d(Runnable runnable) {
        syf0 syf0Var;
        d dVar = this.l;
        if (dVar == null || (syf0Var = (syf0) dVar.b) == null || !dVar.i()) {
            return;
        }
        syf0Var.sendMessage(syf0Var.obtainMessage(-1, runnable));
    }

    public class g extends d implements TextureView.SurfaceTextureListener {
        public soo0 k;

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            AtomicInteger atomicInteger = RenderBase.r;
            this.i.b("onBaseSurfaceTextureCreated " + surfaceTexture);
            j(this.i.a.a);
            syf0 syf0Var = (syf0) this.b;
            if (syf0Var != null && i()) {
                syf0Var.sendMessage(syf0Var.obtainMessage(1, surfaceTexture));
            }
            r(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            s(surfaceTexture);
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            r(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
