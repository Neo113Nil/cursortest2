package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091d3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13560a;

    public C0091d3(long j) {
        this.f13560a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0091d3.class == obj.getClass() && this.f13560a == ((C0091d3) obj).f13560a;
    }

    public final int hashCode() {
        long j = this.f13560a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return d9.e.j(new StringBuilder("CacheControl{lastKnownLocationTtl="), this.f13560a, '}');
    }
}
