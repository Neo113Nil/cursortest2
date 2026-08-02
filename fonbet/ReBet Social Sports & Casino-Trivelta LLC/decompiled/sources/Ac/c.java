package Ac;

import Ac.b;
import com.surt.guardian.utils.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f422a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger.Level f423b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f424c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f425d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f426e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f427f;

    /* renamed from: g, reason: collision with root package name */
    public final d f428g;

    /* renamed from: h, reason: collision with root package name */
    public final long f429h;

    public c(b failurePolicy, Logger.Level logLevel, boolean z10, boolean z11, boolean z12, boolean z13, d locationPermissionConfig, long j10) {
        Intrinsics.checkNotNullParameter(failurePolicy, "failurePolicy");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(locationPermissionConfig, "locationPermissionConfig");
        this.f422a = failurePolicy;
        this.f423b = logLevel;
        this.f424c = z10;
        this.f425d = z11;
        this.f426e = z12;
        this.f427f = z13;
        this.f428g = locationPermissionConfig;
        this.f429h = j10;
    }

    public final boolean a() {
        return this.f427f;
    }

    public final boolean b() {
        return this.f424c;
    }

    public final boolean c() {
        return this.f426e;
    }

    public final boolean d() {
        return this.f425d;
    }

    public final b e() {
        return this.f422a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f422a, cVar.f422a) && this.f423b == cVar.f423b && this.f424c == cVar.f424c && this.f425d == cVar.f425d && this.f426e == cVar.f426e && this.f427f == cVar.f427f && Intrinsics.areEqual(this.f428g, cVar.f428g) && this.f429h == cVar.f429h;
    }

    public final d f() {
        return this.f428g;
    }

    public final Logger.Level g() {
        return this.f423b;
    }

    public final long h() {
        return this.f429h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.f423b.hashCode() + (this.f422a.hashCode() * 31)) * 31;
        boolean z10 = this.f424c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f425d;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f426e;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f427f;
        return Long.hashCode(this.f429h) + ((this.f428g.hashCode() + ((i15 + (z13 ? 1 : z13 ? 1 : 0)) * 31)) * 31);
    }

    public String toString() {
        return "GuardianOptions(failurePolicy=" + this.f422a + ", logLevel=" + this.f423b + ", collectLocation=" + this.f424c + ", collectWifiInfo=" + this.f425d + ", collectSimCardInfo=" + this.f426e + ", collectCameraInfo=" + this.f427f + ", locationPermissionConfig=" + this.f428g + ", timeout=" + this.f429h + ')';
    }

    public /* synthetic */ c(b bVar, Logger.Level level, boolean z10, boolean z11, boolean z12, boolean z13, d dVar, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? b.a.f421a : bVar, (i10 & 2) != 0 ? Logger.Level.WARN : level, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12, (i10 & 32) == 0 ? z13 : false, (i10 & 64) != 0 ? new d(null, null, null, null, false, 0, 0, 127, null) : dVar, (i10 & 128) != 0 ? 30000L : j10);
    }
}
