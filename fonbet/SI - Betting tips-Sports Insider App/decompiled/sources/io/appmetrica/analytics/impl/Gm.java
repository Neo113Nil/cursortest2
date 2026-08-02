package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Gm {

    /* renamed from: a, reason: collision with root package name */
    public final long f12285a;

    public Gm(long j) {
        this.f12285a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Gm.class == obj.getClass() && this.f12285a == ((Gm) obj).f12285a;
    }

    public final int hashCode() {
        long j = this.f12285a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return d9.e.j(new StringBuilder("StatSending{disabledReportingInterval="), this.f12285a, '}');
    }
}
