package we0;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f104453a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f104454b;

    /* renamed from: c, reason: collision with root package name */
    private final Double f104455c;

    /* renamed from: d, reason: collision with root package name */
    private final Float f104456d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f104457e;

    /* renamed from: f, reason: collision with root package name */
    private final Float f104458f;

    public p(@NotNull m latLng, Float f7, Double d11, Float f11, boolean z11, Float f12) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this.f104453a = latLng;
        this.f104454b = f7;
        this.f104455c = d11;
        this.f104456d = f11;
        this.f104457e = z11;
        this.f104458f = f12;
    }

    public static p a(p pVar, m mVar, Float f7, Float f11, int i11) {
        if ((i11 & 1) != 0) {
            mVar = pVar.f104453a;
        }
        m latLng = mVar;
        if ((i11 & 2) != 0) {
            f7 = pVar.f104454b;
        }
        Float f12 = f7;
        Double d11 = pVar.f104455c;
        Float f13 = pVar.f104456d;
        boolean z11 = pVar.f104457e;
        if ((i11 & 32) != 0) {
            f11 = pVar.f104458f;
        }
        pVar.getClass();
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        return new p(latLng, f12, d11, f13, z11, f11);
    }

    public final Float b() {
        return this.f104458f;
    }

    public final Double c() {
        return this.f104455c;
    }

    public final Float d() {
        return this.f104454b;
    }

    @NotNull
    public final m e() {
        return this.f104453a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f104453a, pVar.f104453a) && Intrinsics.d(this.f104454b, pVar.f104454b) && Intrinsics.d(this.f104455c, pVar.f104455c) && Intrinsics.d(this.f104456d, pVar.f104456d) && this.f104457e == pVar.f104457e && Intrinsics.d(this.f104458f, pVar.f104458f);
    }

    public final Float f() {
        return this.f104456d;
    }

    public final int hashCode() {
        int hashCode = this.f104453a.hashCode() * 31;
        Float f7 = this.f104454b;
        int hashCode2 = (hashCode + (f7 == null ? 0 : f7.hashCode())) * 31;
        Double d11 = this.f104455c;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Float f11 = this.f104456d;
        int a11 = C3532b.a((hashCode3 + (f11 == null ? 0 : f11.hashCode())) * 31, 31, this.f104457e);
        Float f12 = this.f104458f;
        return a11 + (f12 != null ? f12.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "LocationInfo(latLng=" + this.f104453a + ", bearing=" + this.f104454b + ", altitude=" + this.f104455c + ", speed=" + this.f104456d + ", isFakeLocation=" + this.f104457e + ", accuracyInMeters=" + this.f104458f + ")";
    }
}
