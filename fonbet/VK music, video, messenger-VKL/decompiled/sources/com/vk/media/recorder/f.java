package com.vk.media.recorder;

import android.view.Surface;
import androidx.annotation.NonNull;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import xsna.byo0;
import xsna.d830;
import xsna.fap;
import xsna.io9;
import xsna.oj9;
import xsna.pes;
import xsna.sy70;
import xsna.syf0;

/* compiled from: RecorderSurfaceBase.java */
/* loaded from: classes3.dex */
public abstract class f extends RecorderBase {
    public final Object D = new Object();
    public final MediaUtils.d E = new MediaUtils.d();
    public final byo0 F = new byo0();
    public d830 G;

    /* compiled from: RecorderSurfaceBase.java */
    public class a {
        public a() {
        }

        public final void a(pes pesVar, fap fapVar) {
            synchronized (f.this.D) {
                f.this.L(pesVar, fapVar);
            }
        }
    }

    public f() {
        this.d = new a();
    }

    public abstract void D();

    public boolean E() {
        return false;
    }

    public Surface F() {
        return null;
    }

    public final boolean G(@NonNull MediaUtils.e eVar, boolean z) {
        oj9 oj9Var = this.c;
        MediaUtils.d c = io9.c(eVar, z);
        StringBuilder sb = new StringBuilder("frame size change! record=");
        sb.append(this.E.toString());
        sb.append(" -> ");
        sb.append(c.toString());
        sb.append(", configs=");
        sb.append(oj9Var != null ? oj9Var.e : null);
        sb.append(" -> ");
        sb.append(eVar.toString());
        L.e("RecorderBase", sb.toString());
        if (this.q && !(this instanceof sy70)) {
            L.G("RecorderBase", "can't change resolution due recording.");
            return false;
        }
        MediaUtils.d dVar = this.E;
        dVar.getClass();
        dVar.a = c.a;
        dVar.b = c.b;
        s(eVar);
        return true;
    }

    public final boolean H() {
        if (!this.q) {
            return false;
        }
        RecorderBase.State state = this.r;
        return state == RecorderBase.State.PREPARED || state == RecorderBase.State.RECORDING;
    }

    public boolean I(long j) {
        return true;
    }

    public final void J() {
        if (this.t < 0) {
            long j = this.u;
            if (j > 0) {
                this.t = j;
                f(-1001);
            }
        }
    }

    public abstract void L(pes pesVar, fap fapVar);

    public final void P() {
        if (!H()) {
            if (this.G != null) {
                this.G = null;
                K(null);
                return;
            }
            return;
        }
        float f = this.w;
        if (f == 1.0f) {
            if (this.G != null) {
                this.G = null;
                K(null);
                return;
            }
            return;
        }
        d830 d830Var = this.G;
        if (d830Var == null || d830Var.a != f) {
            d830 d830Var2 = new d830(f);
            this.G = d830Var2;
            K(d830Var2);
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public void m() {
        this.m = null;
        if (this.G != null) {
            this.G = null;
            K(null);
        }
        synchronized (this.D) {
            N();
            O();
        }
    }

    public void N() {
    }

    public void O() {
    }

    public void K(d830 d830Var) {
    }

    public void M(syf0 syf0Var) {
    }
}
