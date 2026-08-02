package c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26378b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26379c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26381e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26382f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26383g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26384h;

    /* renamed from: i, reason: collision with root package name */
    public final Float f26385i;

    /* renamed from: j, reason: collision with root package name */
    public final long f26386j;

    /* renamed from: k, reason: collision with root package name */
    public final long f26387k;

    /* renamed from: l, reason: collision with root package name */
    public final List f26388l;

    /* renamed from: m, reason: collision with root package name */
    public final List f26389m;

    /* renamed from: n, reason: collision with root package name */
    public final Long f26390n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f26391o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f26392p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f26393q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f26394r;

    public B0(String manufacturer, String model, String brand, String osVersion, int i10, int i11, int i12, float f10, Float f11, long j10, long j11, List list, List list2, Long l10, Boolean bool, Integer num, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.f26377a = manufacturer;
        this.f26378b = model;
        this.f26379c = brand;
        this.f26380d = osVersion;
        this.f26381e = i10;
        this.f26382f = i11;
        this.f26383g = i12;
        this.f26384h = f10;
        this.f26385i = f11;
        this.f26386j = j10;
        this.f26387k = j11;
        this.f26388l = list;
        this.f26389m = list2;
        this.f26390n = l10;
        this.f26391o = bool;
        this.f26392p = num;
        this.f26393q = z10;
        this.f26394r = z11;
    }

    public final List a() {
        return this.f26388l;
    }

    public final String b() {
        return this.f26379c;
    }

    public final Integer c() {
        return this.f26392p;
    }

    public final float d() {
        return this.f26384h;
    }

    public final Long e() {
        return this.f26390n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return Intrinsics.areEqual(this.f26377a, b02.f26377a) && Intrinsics.areEqual(this.f26378b, b02.f26378b) && Intrinsics.areEqual(this.f26379c, b02.f26379c) && Intrinsics.areEqual(this.f26380d, b02.f26380d) && this.f26381e == b02.f26381e && this.f26382f == b02.f26382f && this.f26383g == b02.f26383g && Float.compare(this.f26384h, b02.f26384h) == 0 && Intrinsics.areEqual((Object) this.f26385i, (Object) b02.f26385i) && this.f26386j == b02.f26386j && this.f26387k == b02.f26387k && Intrinsics.areEqual(this.f26388l, b02.f26388l) && Intrinsics.areEqual(this.f26389m, b02.f26389m) && Intrinsics.areEqual(this.f26390n, b02.f26390n) && Intrinsics.areEqual(this.f26391o, b02.f26391o) && Intrinsics.areEqual(this.f26392p, b02.f26392p) && this.f26393q == b02.f26393q && this.f26394r == b02.f26394r;
    }

    public final boolean f() {
        return this.f26394r;
    }

    public final boolean g() {
        return this.f26393q;
    }

    public final String h() {
        return this.f26377a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (Float.hashCode(this.f26384h) + ((Integer.hashCode(this.f26383g) + ((Integer.hashCode(this.f26382f) + ((Integer.hashCode(this.f26381e) + ((this.f26380d.hashCode() + ((this.f26379c.hashCode() + ((this.f26378b.hashCode() + (this.f26377a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Float f10 = this.f26385i;
        int hashCode2 = (Long.hashCode(this.f26387k) + ((Long.hashCode(this.f26386j) + ((hashCode + (f10 == null ? 0 : f10.hashCode())) * 31)) * 31)) * 31;
        List list = this.f26388l;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f26389m;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l10 = this.f26390n;
        int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.f26391o;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f26392p;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z10 = this.f26393q;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode7 + i10) * 31;
        boolean z11 = this.f26394r;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String i() {
        return this.f26378b;
    }

    public final String j() {
        return this.f26380d;
    }

    public final int k() {
        return this.f26383g;
    }

    public final Float l() {
        return this.f26385i;
    }

    public final int m() {
        return this.f26382f;
    }

    public final int n() {
        return this.f26381e;
    }

    public final List o() {
        return this.f26389m;
    }

    public final long p() {
        return this.f26386j;
    }

    public final long q() {
        return this.f26387k;
    }

    public final Boolean r() {
        return this.f26391o;
    }

    public final String toString() {
        return "DeviceInfo(manufacturer=" + this.f26377a + ", model=" + this.f26378b + ", brand=" + this.f26379c + ", osVersion=" + this.f26380d + ", sdkInt=" + this.f26381e + ", screenWidth=" + this.f26382f + ", screenHeight=" + this.f26383g + ", density=" + this.f26384h + ", screenRefreshRate=" + this.f26385i + ", totalMemory=" + this.f26386j + ", totalStorage=" + this.f26387k + ", availableSensors=" + this.f26388l + ", systemFeatures=" + this.f26389m + ", deviceUptime=" + this.f26390n + ", isDarkMode=" + this.f26391o + ", cameraCount=" + this.f26392p + ", hasNFC=" + this.f26393q + ", hasFingerprint=" + this.f26394r + ')';
    }
}
