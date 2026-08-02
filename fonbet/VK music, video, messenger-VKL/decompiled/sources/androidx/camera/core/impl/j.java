package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;
import xsna.es9;
import xsna.ilw;
import xsna.ugw;
import xsna.zr9;

/* compiled from: ImageCaptureConfig.java */
/* loaded from: classes11.dex */
public final class j implements u<ugw>, l, q {
    public static final a A;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    public final o s;

    static {
        Class cls = Integer.TYPE;
        t = Config.a.a(cls, "camerax.core.imageCapture.captureMode");
        u = Config.a.a(cls, "camerax.core.imageCapture.flashMode");
        v = Config.a.a(zr9.class, "camerax.core.imageCapture.captureBundle");
        w = Config.a.a(es9.class, "camerax.core.imageCapture.captureProcessor");
        x = Config.a.a(Integer.class, "camerax.core.imageCapture.bufferFormat");
        y = Config.a.a(Integer.class, "camerax.core.imageCapture.maxCaptureStages");
        z = Config.a.a(ilw.class, "camerax.core.imageCapture.imageReaderProxyProvider");
        A = Config.a.a(Boolean.TYPE, "camerax.core.imageCapture.useSoftwareJpegEncoder");
    }

    public j(@NonNull o oVar) {
        this.s = oVar;
    }

    @Override // androidx.camera.core.impl.q
    @NonNull
    public final Config getConfig() {
        return this.s;
    }

    @Override // androidx.camera.core.impl.k
    public final int getInputFormat() {
        return ((Integer) f(k.a)).intValue();
    }
}
