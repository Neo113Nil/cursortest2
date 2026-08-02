package com.vk.media.pipeline.gl.codec.surface;

import java.util.concurrent.atomic.AtomicBoolean;
import xsna.ckn0;
import xsna.f100;

/* compiled from: Surface.kt */
/* loaded from: classes3.dex */
public class Surface extends android.view.Surface {
    public final ckn0 b;
    public final f100 c;
    public final AtomicBoolean d;

    public Surface(ckn0 ckn0Var, f100 f100Var) {
        super(ckn0Var);
        this.b = ckn0Var;
        this.c = f100Var;
        this.d = new AtomicBoolean();
    }

    @Override // android.view.Surface
    public void release() {
        if (this.d.compareAndSet(false, true)) {
            f100 f100Var = this.c;
            if (f100Var != null) {
                f100Var.d("Surface", "release Surface");
            }
            try {
                super.release();
            } catch (Throwable th) {
                if (f100Var != null) {
                    f100Var.c("Surface", th);
                }
            }
            this.b.release();
        }
    }

    public void d() {
    }
}
