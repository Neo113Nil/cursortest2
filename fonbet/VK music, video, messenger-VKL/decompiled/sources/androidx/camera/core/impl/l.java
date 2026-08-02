package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import java.util.List;
import xsna.pu3;

/* compiled from: ImageOutputConfig.java */
/* loaded from: classes11.dex */
public interface l extends q {
    public static final androidx.camera.core.impl.a b = Config.a.a(pu3.class, "camerax.core.imageOutput.targetAspectRatio");
    public static final androidx.camera.core.impl.a c = Config.a.a(Integer.TYPE, "camerax.core.imageOutput.targetRotation");
    public static final androidx.camera.core.impl.a d = Config.a.a(Size.class, "camerax.core.imageOutput.targetResolution");
    public static final androidx.camera.core.impl.a e = Config.a.a(Size.class, "camerax.core.imageOutput.defaultResolution");
    public static final androidx.camera.core.impl.a f = Config.a.a(Size.class, "camerax.core.imageOutput.maxResolution");
    public static final androidx.camera.core.impl.a g = Config.a.a(List.class, "camerax.core.imageOutput.supportedResolutions");

    /* compiled from: ImageOutputConfig.java */
    public interface a<B> {
        @NonNull
        B a(@NonNull Size size);

        @NonNull
        B c(int i);
    }

    @Nullable
    default Size j() {
        return (Size) g(d, null);
    }

    @Nullable
    default Size k() {
        return (Size) g(f, null);
    }

    default int m() {
        return ((Integer) f(b)).intValue();
    }

    default int p(int i) {
        return ((Integer) g(c, Integer.valueOf(i))).intValue();
    }

    @Nullable
    default List r() {
        return (List) g(g, null);
    }

    @Nullable
    default Size s() {
        return (Size) g(e, null);
    }

    default boolean t() {
        return c(b);
    }
}
