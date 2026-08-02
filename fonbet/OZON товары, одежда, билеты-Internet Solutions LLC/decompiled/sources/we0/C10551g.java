package we0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: we0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10551g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f104422a;

    /* renamed from: b, reason: collision with root package name */
    private final float f104423b;

    /* renamed from: c, reason: collision with root package name */
    private final float f104424c;

    /* renamed from: d, reason: collision with root package name */
    private final float f104425d;

    public C10551g(@NotNull m latLng, float f7, float f11, float f12) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this.f104422a = latLng;
        this.f104423b = f7;
        this.f104424c = f11;
        this.f104425d = f12;
    }

    public static C10551g a(C10551g c10551g, m latLng, float f7, int i11) {
        if ((i11 & 1) != 0) {
            latLng = c10551g.f104422a;
        }
        if ((i11 & 2) != 0) {
            f7 = c10551g.f104423b;
        }
        float f11 = c10551g.f104424c;
        float f12 = c10551g.f104425d;
        c10551g.getClass();
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        return new C10551g(latLng, f7, f11, f12);
    }

    public final float b() {
        return this.f104424c;
    }

    @NotNull
    public final m c() {
        return this.f104422a;
    }

    public final float d() {
        return this.f104425d;
    }

    public final float e() {
        return this.f104423b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10551g)) {
            return false;
        }
        C10551g c10551g = (C10551g) obj;
        return Intrinsics.d(this.f104422a, c10551g.f104422a) && Float.compare(this.f104423b, c10551g.f104423b) == 0 && Float.compare(this.f104424c, c10551g.f104424c) == 0 && Float.compare(this.f104425d, c10551g.f104425d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f104425d) + Pk0.b.a(this.f104424c, Pk0.b.a(this.f104423b, this.f104422a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "CameraPosition(latLng=" + this.f104422a + ", zoom=" + this.f104423b + ", azimuth=" + this.f104424c + ", tiltAngle=" + this.f104425d + ")";
    }
}
