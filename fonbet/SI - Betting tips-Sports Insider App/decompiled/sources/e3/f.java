package e3;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {
    public static final f j = new f();

    /* renamed from: a, reason: collision with root package name */
    public final y f8506a;

    /* renamed from: b, reason: collision with root package name */
    public final n3.i f8507b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8508c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8509d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8510e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8511f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8512g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8513h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f8514i;

    public f() {
        y requiredNetworkType = y.f8572a;
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        kotlin.collections.g0 contentUriTriggers = kotlin.collections.g0.f19206a;
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f8507b = new n3.i(null);
        this.f8506a = requiredNetworkType;
        this.f8508c = false;
        this.f8509d = false;
        this.f8510e = false;
        this.f8511f = false;
        this.f8512g = -1L;
        this.f8513h = -1L;
        this.f8514i = contentUriTriggers;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.f8507b.f20836a;
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT < 24 || !this.f8514i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(f.class, obj.getClass())) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f8508c == fVar.f8508c && this.f8509d == fVar.f8509d && this.f8510e == fVar.f8510e && this.f8511f == fVar.f8511f && this.f8512g == fVar.f8512g && this.f8513h == fVar.f8513h && Intrinsics.areEqual(a(), fVar.a()) && this.f8506a == fVar.f8506a) {
            return Intrinsics.areEqual(this.f8514i, fVar.f8514i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f8506a.hashCode() * 31) + (this.f8508c ? 1 : 0)) * 31) + (this.f8509d ? 1 : 0)) * 31) + (this.f8510e ? 1 : 0)) * 31) + (this.f8511f ? 1 : 0)) * 31;
        long j6 = this.f8512g;
        int i5 = (hashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f8513h;
        int hashCode2 = (this.f8514i.hashCode() + ((i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        NetworkRequest a7 = a();
        return hashCode2 + (a7 != null ? a7.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f8506a + ", requiresCharging=" + this.f8508c + ", requiresDeviceIdle=" + this.f8509d + ", requiresBatteryNotLow=" + this.f8510e + ", requiresStorageNotLow=" + this.f8511f + ", contentTriggerUpdateDelayMillis=" + this.f8512g + ", contentTriggerMaxDelayMillis=" + this.f8513h + ", contentUriTriggers=" + this.f8514i + ", }";
    }

    public f(n3.i requiredNetworkRequestCompat, y requiredNetworkType, boolean z5, boolean z7, boolean z10, boolean z11, long j6, long j10, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f8507b = requiredNetworkRequestCompat;
        this.f8506a = requiredNetworkType;
        this.f8508c = z5;
        this.f8509d = z7;
        this.f8510e = z10;
        this.f8511f = z11;
        this.f8512g = j6;
        this.f8513h = j10;
        this.f8514i = contentUriTriggers;
    }

    public f(f other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f8508c = other.f8508c;
        this.f8509d = other.f8509d;
        this.f8507b = other.f8507b;
        this.f8506a = other.f8506a;
        this.f8510e = other.f8510e;
        this.f8511f = other.f8511f;
        this.f8514i = other.f8514i;
        this.f8512g = other.f8512g;
        this.f8513h = other.f8513h;
    }
}
