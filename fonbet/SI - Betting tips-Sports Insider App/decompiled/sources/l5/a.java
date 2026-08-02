package l5;

import io.appmetrica.analytics.AppMetricaDefaultValues;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f19365f = new a(200, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 81920, 10485760, 604800000);

    /* renamed from: a, reason: collision with root package name */
    public final long f19366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19367b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19368c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19369d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19370e;

    public a(int i5, int i10, int i11, long j, long j6) {
        this.f19366a = j;
        this.f19367b = i5;
        this.f19368c = i10;
        this.f19369d = j6;
        this.f19370e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f19366a == aVar.f19366a && this.f19367b == aVar.f19367b && this.f19368c == aVar.f19368c && this.f19369d == aVar.f19369d && this.f19370e == aVar.f19370e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19366a;
        int i5 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19367b) * 1000003) ^ this.f19368c) * 1000003;
        long j6 = this.f19369d;
        return ((i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f19370e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f19366a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f19367b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f19368c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f19369d);
        sb2.append(", maxBlobByteSizePerRow=");
        return r4.k.n(sb2, this.f19370e, "}");
    }
}
