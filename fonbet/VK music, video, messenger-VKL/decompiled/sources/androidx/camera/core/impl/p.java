package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;
import xsna.es9;
import xsna.jqo0;
import xsna.n3d0;
import xsna.rjw;

/* compiled from: PreviewConfig.java */
/* loaded from: classes11.dex */
public final class p implements u<n3d0>, l, jqo0 {
    public static final a t = Config.a.a(rjw.class, "camerax.core.preview.imageInfoProcessor");
    public static final a u = Config.a.a(es9.class, "camerax.core.preview.captureProcessor");
    public final o s;

    public p(@NonNull o oVar) {
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
