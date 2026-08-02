package z70;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: z70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10997a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f107309a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f107310b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f107311c;

    /* renamed from: d, reason: collision with root package name */
    private final String f107312d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f107313e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f107314f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f107315g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f107316h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f107317i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f107318j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f107319k;

    /* renamed from: l, reason: collision with root package name */
    private final Integer f107320l;

    public C10997a(Integer num, Integer num2, Integer num3, String str, boolean z11, Integer num4, boolean z12, boolean z13, boolean z14, boolean z15, Integer num5, Integer num6) {
        this.f107309a = num;
        this.f107310b = num2;
        this.f107311c = num3;
        this.f107312d = str;
        this.f107313e = z11;
        this.f107314f = num4;
        this.f107315g = z12;
        this.f107316h = z13;
        this.f107317i = z14;
        this.f107318j = z15;
        this.f107319k = num5;
        this.f107320l = num6;
    }

    public final String a() {
        return this.f107312d;
    }

    public final Integer b() {
        return this.f107309a;
    }

    public final Integer c() {
        return this.f107311c;
    }

    public final Integer d() {
        return this.f107320l;
    }

    public final Integer e() {
        return this.f107319k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10997a)) {
            return false;
        }
        C10997a c10997a = (C10997a) obj;
        return Intrinsics.d(this.f107309a, c10997a.f107309a) && Intrinsics.d(this.f107310b, c10997a.f107310b) && Intrinsics.d(this.f107311c, c10997a.f107311c) && Intrinsics.d(this.f107312d, c10997a.f107312d) && this.f107313e == c10997a.f107313e && Intrinsics.d(this.f107314f, c10997a.f107314f) && this.f107315g == c10997a.f107315g && this.f107316h == c10997a.f107316h && this.f107317i == c10997a.f107317i && this.f107318j == c10997a.f107318j && Intrinsics.d(this.f107319k, c10997a.f107319k) && Intrinsics.d(this.f107320l, c10997a.f107320l);
    }

    public final boolean f() {
        return this.f107313e;
    }

    public final Integer g() {
        return this.f107310b;
    }

    public final boolean h() {
        return this.f107315g;
    }

    public final int hashCode() {
        Integer num = this.f107309a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f107310b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f107311c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f107312d;
        int a11 = C3532b.a((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f107313e);
        Integer num4 = this.f107314f;
        int a12 = C3532b.a(C3532b.a(C3532b.a(C3532b.a((a11 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.f107315g), 31, this.f107316h), 31, this.f107317i), 31, this.f107318j);
        Integer num5 = this.f107319k;
        int hashCode4 = (a12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f107320l;
        return hashCode4 + (num6 != null ? num6.hashCode() : 0);
    }

    public final boolean i() {
        return this.f107316h;
    }

    public final boolean j() {
        return this.f107318j;
    }

    public final boolean k() {
        return this.f107317i;
    }

    public final Integer l() {
        return this.f107314f;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingUI(helloLottieRes=");
        sb2.append(this.f107309a);
        sb2.append(", progressLottieRes=");
        sb2.append(this.f107310b);
        sb2.append(", logoViewRes=");
        sb2.append(this.f107311c);
        sb2.append(", advertisingText=");
        sb2.append(this.f107312d);
        sb2.append(", playUltra=");
        sb2.append(this.f107313e);
        sb2.append(", ultraBackground=");
        sb2.append(this.f107314f);
        sb2.append(", roundProgress=");
        sb2.append(this.f107315g);
        sb2.append(", showDisclosure=");
        sb2.append(this.f107316h);
        sb2.append(", showOnboardingSlides=");
        sb2.append(this.f107317i);
        sb2.append(", showForceUpdate=");
        sb2.append(this.f107318j);
        sb2.append(", onboardingDrawablePic=");
        sb2.append(this.f107319k);
        sb2.append(", onboardingColor=");
        return Ep.a.c(sb2, this.f107320l, ")");
    }
}
