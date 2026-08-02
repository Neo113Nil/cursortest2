package a6;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1921a {

    /* renamed from: a, reason: collision with root package name */
    public final float f15085a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15087c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15088d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15089e;

    /* renamed from: f, reason: collision with root package name */
    public final List f15090f;

    /* renamed from: g, reason: collision with root package name */
    public final List f15091g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15092h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15093i;

    /* renamed from: j, reason: collision with root package name */
    public final Function2 f15094j;

    public C1921a(float f10, float f11, int i10, boolean z10, boolean z11, List textsToMask, List maskInputFieldsOfTypes, boolean z12, int i11, Function2 function2) {
        Intrinsics.checkNotNullParameter(textsToMask, "textsToMask");
        Intrinsics.checkNotNullParameter(maskInputFieldsOfTypes, "maskInputFieldsOfTypes");
        this.f15085a = f10;
        this.f15086b = f11;
        this.f15087c = i10;
        this.f15088d = z10;
        this.f15089e = z11;
        this.f15090f = textsToMask;
        this.f15091g = maskInputFieldsOfTypes;
        this.f15092h = z12;
        this.f15093i = i11;
        this.f15094j = function2;
        if (i10 < 0 || i10 >= 101) {
            throw new IllegalArgumentException(("Session recording sample rate must be between 0 and 100. Provided: " + i10).toString());
        }
        if (f10 <= 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException(("Capture scale must be greater than 0 and up to 1. Provided: " + f10).toString());
        }
        if (f11 <= 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException(("Capture compress quality must be greater than 0 and up to 1. Provided: " + f11).toString());
        }
        if (1 > i11 || i11 >= 61) {
            throw new IllegalArgumentException(("Sample frame rate per second must be between 1 and 60. Provided: " + i11).toString());
        }
    }

    public final boolean a() {
        return this.f15088d;
    }

    public final float b() {
        return this.f15086b;
    }

    public final float c() {
        return this.f15085a;
    }

    public final boolean d() {
        return this.f15092h;
    }

    public final boolean e() {
        return this.f15089e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1921a)) {
            return false;
        }
        C1921a c1921a = (C1921a) obj;
        return Float.compare(this.f15085a, c1921a.f15085a) == 0 && Float.compare(this.f15086b, c1921a.f15086b) == 0 && this.f15087c == c1921a.f15087c && this.f15088d == c1921a.f15088d && this.f15089e == c1921a.f15089e && Intrinsics.areEqual(this.f15090f, c1921a.f15090f) && Intrinsics.areEqual(this.f15091g, c1921a.f15091g) && this.f15092h == c1921a.f15092h && this.f15093i == c1921a.f15093i && Intrinsics.areEqual(this.f15094j, c1921a.f15094j);
    }

    public final List f() {
        return this.f15091g;
    }

    public final int g() {
        return this.f15093i;
    }

    public final int h() {
        return this.f15087c;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((Float.hashCode(this.f15085a) * 31) + Float.hashCode(this.f15086b)) * 31) + Integer.hashCode(this.f15087c)) * 31) + Boolean.hashCode(this.f15088d)) * 31) + Boolean.hashCode(this.f15089e)) * 31) + this.f15090f.hashCode()) * 31) + this.f15091g.hashCode()) * 31) + Boolean.hashCode(this.f15092h)) * 31) + Integer.hashCode(this.f15093i)) * 31;
        Function2 function2 = this.f15094j;
        return hashCode + (function2 == null ? 0 : function2.hashCode());
    }

    public final List i() {
        return this.f15090f;
    }

    public String toString() {
        return "SessionReplayOptions(captureScale=" + this.f15085a + ", captureCompressQuality=" + this.f15086b + ", sessionRecordingSampleRate=" + this.f15087c + ", autoStartSessionRecording=" + this.f15088d + ", maskAllTexts=" + this.f15089e + ", textsToMask=" + this.f15090f + ", maskInputFieldsOfTypes=" + this.f15091g + ", maskAllImages=" + this.f15092h + ", sampleFrameRatePerSecond=" + this.f15093i + ", flutterMaskRegionsProvider=" + this.f15094j + ")";
    }

    public /* synthetic */ C1921a(float f10, float f11, int i10, boolean z10, boolean z11, List list, List list2, boolean z12, int i11, Function2 function2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.5f : f10, (i12 & 2) != 0 ? 1.0f : f11, (i12 & 4) != 0 ? 100 : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? true : z11, (i12 & 32) != 0 ? CollectionsKt.emptyList() : list, (i12 & 64) != 0 ? CollectionsKt.emptyList() : list2, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? 1 : i11, (i12 & 512) != 0 ? null : function2);
    }
}
