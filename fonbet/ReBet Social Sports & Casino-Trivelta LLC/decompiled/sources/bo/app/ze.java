package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ze {

    /* renamed from: a, reason: collision with root package name */
    public final we f26358a;

    public ze(we sealedSession) {
        Intrinsics.checkNotNullParameter(sealedSession, "sealedSession");
        this.f26358a = sealedSession;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze) && Intrinsics.areEqual(this.f26358a, ((ze) obj).f26358a);
    }

    public final int hashCode() {
        return this.f26358a.hashCode();
    }

    public final String toString() {
        return "SessionSealedEvent(sealedSession=" + this.f26358a + ")";
    }
}
