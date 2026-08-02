package androidx.car.app;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import xsna.h5s;

/* loaded from: classes11.dex */
public final class SurfaceContainer {
    private final int mDpi;
    private final int mHeight;

    @Nullable
    private final Surface mSurface;
    private final int mWidth;

    public SurfaceContainer(@Nullable Surface surface, int i, int i2, int i3) {
        this.mSurface = surface;
        this.mWidth = i;
        this.mHeight = i2;
        this.mDpi = i3;
    }

    public int getDpi() {
        return this.mDpi;
    }

    public int getHeight() {
        return this.mHeight;
    }

    @Nullable
    public Surface getSurface() {
        return this.mSurface;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(this.mSurface);
        sb.append(", ");
        sb.append(this.mWidth);
        sb.append("x");
        sb.append(this.mHeight);
        sb.append(", dpi: ");
        return h5s.c(this.mDpi, X3.j.e, sb);
    }

    private SurfaceContainer() {
        this.mSurface = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDpi = 0;
    }
}
