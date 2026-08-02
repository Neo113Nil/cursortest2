package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;
import xsna.gfw;
import xsna.ilw;
import xsna.jqo0;

/* compiled from: ImageAnalysisConfig.java */
/* loaded from: classes11.dex */
public final class i implements u<gfw>, l, jqo0 {
    public static final a t = Config.a.a(gfw.b.class, "camerax.core.imageAnalysis.backpressureStrategy");
    public static final a u = Config.a.a(Integer.TYPE, "camerax.core.imageAnalysis.imageQueueDepth");
    public static final a v = Config.a.a(ilw.class, "camerax.core.imageAnalysis.imageReaderProxyProvider");
    public final o s;

    public i(@NonNull o oVar) {
        this.s = oVar;
    }

    @Override // androidx.camera.core.impl.q
    @NonNull
    public final Config getConfig() {
        return this.s;
    }

    @Override // androidx.camera.core.impl.k
    public final int getInputFormat() {
        return 35;
    }
}
