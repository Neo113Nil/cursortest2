package com.vk.media.recorder;

import android.opengl.EGL14;
import android.util.Log;
import android.view.Surface;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.SimpleGLProgram;
import xsna.byo0;
import xsna.d830;
import xsna.fap;
import xsna.map;
import xsna.ms9;
import xsna.nap;
import xsna.nv70;
import xsna.pes;
import xsna.yk9;

/* compiled from: VkRecorderSurfaceBase.java */
/* loaded from: classes3.dex */
public abstract class i extends f {
    public map.b H;
    public nv70 I;
    public final AtomicLong J = new AtomicLong(0);
    public final AtomicLong K = new AtomicLong(0);

    @Override // com.vk.media.recorder.f
    public void D() {
        nv70 nv70Var = this.I;
        if (nv70Var != null) {
            ((FrameBuffer) nv70Var.c).release();
            ((SimpleGLProgram) nv70Var.d).release();
            this.I = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    @Override // com.vk.media.recorder.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L(pes pesVar, fap fapVar) {
        nv70 nv70Var;
        RecorderBase.State state;
        Surface F;
        RecorderBase.State state2 = this.r;
        if (state2 != RecorderBase.State.IDLE) {
            boolean z = true;
            if (this.H == null && fapVar != null && (((state2 == RecorderBase.State.PREPARING && C()) || (state = this.r) == RecorderBase.State.PREPARED || state == RecorderBase.State.RECORDING) && (F = F()) != null)) {
                F.toString();
                this.H = new map.b(fapVar, F, true);
                if (C()) {
                    this.H.b();
                    E();
                    nap.b();
                    this.H.d(System.nanoTime());
                }
            }
            if (this.H != null && this.c.e != null) {
                this.J.incrementAndGet();
                yk9 yk9Var = this.e;
                if (yk9Var != null) {
                    MediaUtils.d dVar = this.E;
                    yk9Var.a.h(dVar.a, dVar.b);
                }
                if (!H() && (nv70Var = this.I) != null) {
                    ((FrameBuffer) nv70Var.c).release();
                    ((SimpleGLProgram) nv70Var.d).release();
                    this.I = null;
                }
                P();
                long nanoTime = H() ? System.nanoTime() : 0L;
                d830 d830Var = this.G;
                boolean I = I(d830Var != null ? d830Var.a(nanoTime) : nanoTime);
                AtomicLong atomicLong = this.K;
                if (I) {
                    try {
                    } catch (Throwable th) {
                        Log.e("RecorderBase", "can't record frame " + th);
                    }
                    if (E() && H()) {
                        d830 d830Var2 = this.G;
                        byo0 byo0Var = this.F;
                        if (d830Var2 != null && d830Var2.a < 1.0f) {
                            nv70 nv70Var2 = this.I;
                            map.b bVar = this.H;
                            int i = bVar.c;
                            if (i < 0) {
                                int[] iArr = new int[1];
                                EGL14.eglQuerySurface(bVar.a.b, bVar.b, 12375, iArr, 0);
                                i = iArr[0];
                            }
                            map.b bVar2 = this.H;
                            int i2 = bVar2.d;
                            if (i2 < 0) {
                                int[] iArr2 = new int[1];
                                EGL14.eglQuerySurface(bVar2.a.b, bVar2.b, 12374, iArr2, 0);
                                i2 = iArr2[0];
                            }
                            nv70 a = nv70.a(nv70Var2, i, i2);
                            this.I = a;
                            if (a != null) {
                                ((FrameBuffer) a.c).bind();
                                this.e.a(pesVar);
                                ((FrameBuffer) this.I.c).unbind();
                                this.H.b();
                                int i3 = (int) (1.0f / this.G.a);
                                do {
                                    this.I.c();
                                    this.H.d(byo0Var.a(nanoTime));
                                    nanoTime = System.nanoTime();
                                    i3--;
                                } while (i3 > 0);
                                if (!z) {
                                    atomicLong.incrementAndGet();
                                }
                            }
                        }
                        this.H.b();
                        this.e.a(pesVar);
                        this.H.d(byo0Var.a(nanoTime));
                        if (!z) {
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                } else {
                    atomicLong.incrementAndGet();
                }
            }
            r(System.nanoTime());
        }
    }

    @Override // com.vk.media.recorder.f
    public final void O() {
        map.b bVar = this.H;
        if (bVar != null) {
            try {
                bVar.e();
            } catch (Throwable th) {
                L.l(ms9.b("can't release surface ", th));
            }
            this.H = null;
        }
    }
}
