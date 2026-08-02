package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final c f25365c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final String f25366a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25367b;

    public d(String bannerId, long j10) {
        Intrinsics.checkNotNullParameter(bannerId, "bannerId");
        this.f25366a = bannerId;
        this.f25367b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f25366a, dVar.f25366a) && this.f25367b == dVar.f25367b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25367b) + (this.f25366a.hashCode() * 31);
    }

    public final String toString() {
        return "AcknowledgedBannerDismissal(bannerId=" + this.f25366a + ", dismissalTimeMs=" + this.f25367b + ")";
    }
}
