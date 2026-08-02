package Ac;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f430a;

    /* renamed from: b, reason: collision with root package name */
    public final String f431b;

    /* renamed from: c, reason: collision with root package name */
    public final String f432c;

    /* renamed from: d, reason: collision with root package name */
    public final String f433d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f434e;

    /* renamed from: f, reason: collision with root package name */
    public final int f435f;

    /* renamed from: g, reason: collision with root package name */
    public final int f436g;

    public d(String title, String message, String positiveButtonText, String negativeButtonText, boolean z10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        this.f430a = title;
        this.f431b = message;
        this.f432c = positiveButtonText;
        this.f433d = negativeButtonText;
        this.f434e = z10;
        this.f435f = i10;
        this.f436g = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f430a, dVar.f430a) && Intrinsics.areEqual(this.f431b, dVar.f431b) && Intrinsics.areEqual(this.f432c, dVar.f432c) && Intrinsics.areEqual(this.f433d, dVar.f433d) && this.f434e == dVar.f434e && this.f435f == dVar.f435f && this.f436g == dVar.f436g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.f433d.hashCode() + ((this.f432c.hashCode() + ((this.f431b.hashCode() + (this.f430a.hashCode() * 31)) * 31)) * 31)) * 31;
        boolean z10 = this.f434e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return Integer.hashCode(this.f436g) + ((Integer.hashCode(this.f435f) + ((hashCode + i10) * 31)) * 31);
    }

    public String toString() {
        return "LocationPermissionConfig(title=" + this.f430a + ", message=" + this.f431b + ", positiveButtonText=" + this.f432c + ", negativeButtonText=" + this.f433d + ", showStatistics=" + this.f434e + ", approvalRateWithLocation=" + this.f435f + ", approvalRateWithoutLocation=" + this.f436g + ')';
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, boolean z10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "Location Verification" : str, (i12 & 2) != 0 ? "Your location helps verify your identity and protect your account." : str2, (i12 & 4) != 0 ? "Enable Location" : str3, (i12 & 8) != 0 ? "Skip for Now" : str4, (i12 & 16) != 0 ? true : z10, (i12 & 32) != 0 ? 95 : i10, (i12 & 64) != 0 ? 60 : i11);
    }
}
