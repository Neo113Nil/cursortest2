package bo.app;

/* loaded from: classes.dex */
public final class rc {

    /* renamed from: a, reason: collision with root package name */
    public final long f25989a;

    public rc(long j10) {
        this.f25989a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc) && this.f25989a == ((rc) obj).f25989a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25989a);
    }

    public final String toString() {
        return "PushMaxRequestSuccessEvent(lastUpdateTime=" + this.f25989a + ")";
    }
}
