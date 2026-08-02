package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oc {

    /* renamed from: a, reason: collision with root package name */
    public final String f25891a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25892b;

    public oc(String id2, long j10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f25891a = id2;
        this.f25892b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return Intrinsics.areEqual(this.f25891a, ocVar.f25891a) && this.f25892b == ocVar.f25892b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25892b) + (this.f25891a.hashCode() * 31);
    }

    public final String toString() {
        return "CampaignData(id=" + this.f25891a + ", timestamp=" + this.f25892b + ")";
    }
}
