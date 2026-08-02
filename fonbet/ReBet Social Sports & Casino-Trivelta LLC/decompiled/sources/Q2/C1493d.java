package Q2;

import android.net.NetworkRequest;
import android.net.Uri;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1493d {

    /* renamed from: j, reason: collision with root package name */
    public static final a f9266j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final C1493d f9267k = new C1493d(null, false, false, false, 15, null);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1509u f9268a;

    /* renamed from: b, reason: collision with root package name */
    public final Y2.y f9269b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9270c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9271d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9272e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9273f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9274g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9275h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f9276i;

    /* renamed from: Q2.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: Q2.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f9277a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9278b;

        public b(Uri uri, boolean z10) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f9277a = uri;
            this.f9278b = z10;
        }

        public final Uri a() {
            return this.f9277a;
        }

        public final boolean b() {
            return this.f9278b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f9277a, bVar.f9277a) && this.f9278b == bVar.f9278b;
        }

        public int hashCode() {
            return (this.f9277a.hashCode() * 31) + Boolean.hashCode(this.f9278b);
        }
    }

    public /* synthetic */ C1493d(EnumC1509u enumC1509u, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC1509u.NOT_REQUIRED : enumC1509u, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    public final long a() {
        return this.f9275h;
    }

    public final long b() {
        return this.f9274g;
    }

    public final Set c() {
        return this.f9276i;
    }

    public final NetworkRequest d() {
        return this.f9269b.b();
    }

    public final Y2.y e() {
        return this.f9269b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(C1493d.class, obj.getClass())) {
            return false;
        }
        C1493d c1493d = (C1493d) obj;
        if (this.f9270c == c1493d.f9270c && this.f9271d == c1493d.f9271d && this.f9272e == c1493d.f9272e && this.f9273f == c1493d.f9273f && this.f9274g == c1493d.f9274g && this.f9275h == c1493d.f9275h && Intrinsics.areEqual(d(), c1493d.d()) && this.f9268a == c1493d.f9268a) {
            return Intrinsics.areEqual(this.f9276i, c1493d.f9276i);
        }
        return false;
    }

    public final EnumC1509u f() {
        return this.f9268a;
    }

    public final boolean g() {
        return !this.f9276i.isEmpty();
    }

    public final boolean h() {
        return this.f9272e;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f9268a.hashCode() * 31) + (this.f9270c ? 1 : 0)) * 31) + (this.f9271d ? 1 : 0)) * 31) + (this.f9272e ? 1 : 0)) * 31) + (this.f9273f ? 1 : 0)) * 31;
        long j10 = this.f9274g;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f9275h;
        int hashCode2 = (((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f9276i.hashCode()) * 31;
        NetworkRequest d10 = d();
        return hashCode2 + (d10 != null ? d10.hashCode() : 0);
    }

    public final boolean i() {
        return this.f9270c;
    }

    public final boolean j() {
        return this.f9271d;
    }

    public final boolean k() {
        return this.f9273f;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f9268a + ", requiresCharging=" + this.f9270c + ", requiresDeviceIdle=" + this.f9271d + ", requiresBatteryNotLow=" + this.f9272e + ", requiresStorageNotLow=" + this.f9273f + ", contentTriggerUpdateDelayMillis=" + this.f9274g + ", contentTriggerMaxDelayMillis=" + this.f9275h + ", contentUriTriggers=" + this.f9276i + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1493d(EnumC1509u requiredNetworkType, boolean z10, boolean z11, boolean z12) {
        this(requiredNetworkType, z10, false, z11, z12);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1493d(EnumC1509u requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(requiredNetworkType, z10, z11, z12, z13, -1L, 0L, null, 192, null);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ C1493d(EnumC1509u enumC1509u, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC1509u.NOT_REQUIRED : enumC1509u, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) != 0 ? -1L : j11, (i10 & 128) != 0 ? SetsKt.emptySet() : set);
    }

    public C1493d(EnumC1509u requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f9269b = new Y2.y(null, 1, null);
        this.f9268a = requiredNetworkType;
        this.f9270c = z10;
        this.f9271d = z11;
        this.f9272e = z12;
        this.f9273f = z13;
        this.f9274g = j10;
        this.f9275h = j11;
        this.f9276i = contentUriTriggers;
    }

    public C1493d(Y2.y requiredNetworkRequestCompat, EnumC1509u requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f9269b = requiredNetworkRequestCompat;
        this.f9268a = requiredNetworkType;
        this.f9270c = z10;
        this.f9271d = z11;
        this.f9272e = z12;
        this.f9273f = z13;
        this.f9274g = j10;
        this.f9275h = j11;
        this.f9276i = contentUriTriggers;
    }

    public C1493d(C1493d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f9270c = other.f9270c;
        this.f9271d = other.f9271d;
        this.f9269b = other.f9269b;
        this.f9268a = other.f9268a;
        this.f9272e = other.f9272e;
        this.f9273f = other.f9273f;
        this.f9276i = other.f9276i;
        this.f9274g = other.f9274g;
        this.f9275h = other.f9275h;
    }
}
