package ic;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@og.e
/* loaded from: classes.dex */
public final class d0 implements m {

    @NotNull
    public static final c0 Companion = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final String f11097a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11098b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11099c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11100d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11101e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11102f;

    public /* synthetic */ d0(int i5, String str, String str2, String str3, long j, int i10, int i11) {
        if (63 != (i5 & 63)) {
            s0.f(i5, 63, b0.f11084a.d());
            throw null;
        }
        this.f11097a = str;
        this.f11098b = str2;
        this.f11099c = str3;
        this.f11100d = j;
        this.f11101e = i10;
        this.f11102f = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.areEqual(this.f11097a, d0Var.f11097a) && Intrinsics.areEqual(this.f11098b, d0Var.f11098b) && Intrinsics.areEqual(this.f11099c, d0Var.f11099c) && this.f11100d == d0Var.f11100d && this.f11101e == d0Var.f11101e && this.f11102f == d0Var.f11102f;
    }

    public final int hashCode() {
        int j = r4.k.j(r4.k.j(this.f11097a.hashCode() * 31, 31, this.f11098b), 31, this.f11099c);
        long j6 = this.f11100d;
        return ((((j + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f11101e) * 31) + this.f11102f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PricingPhaseImpl(formattedPrice=");
        sb2.append(this.f11097a);
        sb2.append(", priceCurrencyCode=");
        sb2.append(this.f11098b);
        sb2.append(", billingPeriod=");
        sb2.append(this.f11099c);
        sb2.append(", priceAmountMicros=");
        sb2.append(this.f11100d);
        sb2.append(", recurrenceMode=");
        sb2.append(this.f11101e);
        sb2.append(", billingCycleCount=");
        return d9.e.i(sb2, this.f11102f, ')');
    }

    public d0(String formattedPrice, String priceCurrencyCode, String billingPeriod, long j, int i5, int i10) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        this.f11097a = formattedPrice;
        this.f11098b = priceCurrencyCode;
        this.f11099c = billingPeriod;
        this.f11100d = j;
        this.f11101e = i5;
        this.f11102f = i10;
    }
}
