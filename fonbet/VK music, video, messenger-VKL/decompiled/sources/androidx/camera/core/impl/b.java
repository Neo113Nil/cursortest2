package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.SurfaceConfig;

/* compiled from: AutoValue_SurfaceConfig.java */
/* loaded from: classes11.dex */
public final class b extends SurfaceConfig {
    public final SurfaceConfig.ConfigType a;
    public final SurfaceConfig.ConfigSize b;

    public b(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize) {
        if (configType == null) {
            throw new NullPointerException("Null configType");
        }
        this.a = configType;
        if (configSize == null) {
            throw new NullPointerException("Null configSize");
        }
        this.b = configSize;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    @NonNull
    public final SurfaceConfig.ConfigSize a() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    @NonNull
    public final SurfaceConfig.ConfigType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.a.equals(surfaceConfig.b()) && this.b.equals(surfaceConfig.a());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SurfaceConfig{configType=" + this.a + ", configSize=" + this.b + "}";
    }
}
