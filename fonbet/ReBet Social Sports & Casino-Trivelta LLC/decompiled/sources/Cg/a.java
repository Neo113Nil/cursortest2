package Cg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f2268a;

    /* renamed from: b, reason: collision with root package name */
    public long f2269b;

    public a(long j10, long j11) {
        this.f2268a = j10;
        this.f2269b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2268a == aVar.f2268a && this.f2269b == aVar.f2269b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f2268a) * 31) + Long.hashCode(this.f2269b);
    }

    public String toString() {
        return "RingingTimerConfig(directCallRingingValue=" + this.f2268a + ", missedCallTimeout=" + this.f2269b + ')';
    }

    public /* synthetic */ a(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 60000L : j10, (i10 & 2) != 0 ? 60000L : j11);
    }
}
