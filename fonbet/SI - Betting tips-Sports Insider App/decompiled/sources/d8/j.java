package d8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f8298a;

    public j(long j) {
        this.f8298a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof j) && this.f8298a == ((j) obj).f8298a;
    }

    public final int hashCode() {
        long j = this.f8298a;
        return (-724379968) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.f8298a + "}";
    }
}
