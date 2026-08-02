package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xe {

    /* renamed from: a, reason: collision with root package name */
    public final za f26284a;

    public xe(za session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f26284a = session;
        if (session.f26208d) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe) && Intrinsics.areEqual(this.f26284a, ((xe) obj).f26284a);
    }

    public final int hashCode() {
        return this.f26284a.hashCode();
    }

    public final String toString() {
        return "SessionCreatedEvent(session=" + this.f26284a + ")";
    }
}
