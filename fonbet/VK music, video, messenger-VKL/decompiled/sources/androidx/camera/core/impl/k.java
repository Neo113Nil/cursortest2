package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;

/* compiled from: ImageInputConfig.java */
/* loaded from: classes11.dex */
public interface k extends q {
    public static final a a = Config.a.a(Integer.TYPE, "camerax.core.imageInput.inputFormat");

    default int getInputFormat() {
        return ((Integer) f(a)).intValue();
    }
}
