package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yd {

    /* renamed from: a, reason: collision with root package name */
    public final td f26325a;

    public yd(td debugConfig) {
        Intrinsics.checkNotNullParameter(debugConfig, "debugConfig");
        this.f26325a = debugConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd) && Intrinsics.areEqual(this.f26325a, ((yd) obj).f26325a);
    }

    public final int hashCode() {
        return this.f26325a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerConfigUpdateEvent(debugConfig=" + this.f26325a + ")";
    }
}
