package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.f;
import androidx.camera.core.impl.r;
import xsna.hbq;
import xsna.nl9;
import xsna.o7j;
import xsna.vfq0;
import xsna.x3o0;
import xsna.xfq0;

/* compiled from: UseCaseConfig.java */
/* loaded from: classes11.dex */
public interface u<T extends vfq0> extends x3o0<T>, xfq0, k {
    public static final androidx.camera.core.impl.a h = Config.a.a(r.class, "camerax.core.useCase.defaultSessionConfig");
    public static final androidx.camera.core.impl.a i = Config.a.a(f.class, "camerax.core.useCase.defaultCaptureConfig");
    public static final androidx.camera.core.impl.a j = Config.a.a(r.d.class, "camerax.core.useCase.sessionConfigUnpacker");
    public static final androidx.camera.core.impl.a k = Config.a.a(f.b.class, "camerax.core.useCase.captureConfigUnpacker");
    public static final androidx.camera.core.impl.a l = Config.a.a(Integer.TYPE, "camerax.core.useCase.surfaceOccupancyPriority");
    public static final androidx.camera.core.impl.a m = Config.a.a(nl9.class, "camerax.core.useCase.cameraSelector");
    public static final androidx.camera.core.impl.a n = Config.a.a(o7j.class, "camerax.core.useCase.attachedUseCasesUpdateListener");

    /* compiled from: UseCaseConfig.java */
    public interface a<T extends vfq0, C extends u<T>, B> extends hbq<T> {
        @NonNull
        C b();
    }

    default int n() {
        return ((Integer) g(l, 0)).intValue();
    }

    @Nullable
    default nl9 o() {
        return (nl9) g(m, null);
    }

    @Nullable
    default r q() {
        return (r) g(h, null);
    }

    @Nullable
    default r.d u() {
        return (r.d) g(j, null);
    }

    @Nullable
    default o7j v() {
        return (o7j) g(n, null);
    }

    @Nullable
    default f x() {
        return (f) g(i, null);
    }
}
