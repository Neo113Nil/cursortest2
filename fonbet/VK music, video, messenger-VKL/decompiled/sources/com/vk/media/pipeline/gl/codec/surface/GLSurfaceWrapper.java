package com.vk.media.pipeline.gl.codec.surface;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.vk.media.pipeline.gl.GlException;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.b0u;
import xsna.ckn0;
import xsna.f100;
import xsna.q0u;

/* compiled from: GLSurfaceWrapper.kt */
/* loaded from: classes3.dex */
public final class GLSurfaceWrapper extends Surface {
    public final q0u e;
    public final AtomicBoolean f;

    public GLSurfaceWrapper(b0u b0uVar, ckn0 ckn0Var, f100 f100Var) {
        super(ckn0Var, f100Var);
        this.e = q0u.a.b(b0uVar, this, f100Var);
        this.f = new AtomicBoolean();
    }

    @Override // com.vk.media.pipeline.gl.codec.surface.Surface
    public final void d() {
        q0u q0uVar = this.e;
        b0u b0uVar = q0uVar.d;
        EGLDisplay eGLDisplay = b0uVar.b;
        EGLSurface eGLSurface = q0uVar.c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, b0uVar.c)) {
            throw new GlException("eglMakeCurrent failed");
        }
    }

    @Override // com.vk.media.pipeline.gl.codec.surface.Surface, android.view.Surface
    public final void release() {
        if (this.f.compareAndSet(false, true)) {
            f100 f100Var = this.c;
            if (f100Var != null) {
                f100Var.d("GLSurfaceWrapper", "release GLSurfaceWrapper");
            }
            try {
                super.release();
            } catch (Throwable th) {
                if (f100Var != null) {
                    f100Var.c("GLSurfaceWrapper", th);
                }
            }
            this.e.a();
        }
    }
}
