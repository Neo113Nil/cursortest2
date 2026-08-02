package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final re f25844a;

    /* renamed from: b, reason: collision with root package name */
    public final re f25845b;

    public o3(re oldConfig, re newConfig) {
        Intrinsics.checkNotNullParameter(oldConfig, "oldConfig");
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f25844a = oldConfig;
        this.f25845b = newConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.areEqual(this.f25844a, o3Var.f25844a) && Intrinsics.areEqual(this.f25845b, o3Var.f25845b);
    }

    public final int hashCode() {
        return this.f25845b.hashCode() + (this.f25844a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigChangeEvent(oldConfig=" + this.f25844a + ", newConfig=" + this.f25845b + ")";
    }
}
