package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class te {

    /* renamed from: a, reason: collision with root package name */
    public final re f26090a;

    public te(re serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        this.f26090a = serverConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te) && Intrinsics.areEqual(this.f26090a, ((te) obj).f26090a);
    }

    public final int hashCode() {
        return this.f26090a.hashCode();
    }

    public final String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.f26090a + ")";
    }
}
