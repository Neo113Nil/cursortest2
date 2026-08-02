package ic;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@og.e
/* loaded from: classes.dex */
public final class x implements j {

    @NotNull
    public static final w Companion = new w();

    /* renamed from: a, reason: collision with root package name */
    public final long f11136a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11137b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11138c;

    public /* synthetic */ x(int i5, long j, String str, String str2) {
        if (7 != (i5 & 7)) {
            s0.f(i5, 7, v.f11135a.d());
            throw null;
        }
        this.f11136a = j;
        this.f11137b = str;
        this.f11138c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f11136a == xVar.f11136a && Intrinsics.areEqual(this.f11137b, xVar.f11137b) && Intrinsics.areEqual(this.f11138c, xVar.f11138c);
    }

    public final int hashCode() {
        long j = this.f11136a;
        return this.f11138c.hashCode() + r4.k.j(((int) (j ^ (j >>> 32))) * 31, 31, this.f11137b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailsSingleImpl(priceAmountMicros=");
        sb2.append(this.f11136a);
        sb2.append(", priceCurrencyCode=");
        sb2.append(this.f11137b);
        sb2.append(", price=");
        return d9.e.k(sb2, this.f11138c, ')');
    }

    public x(long j, String priceCurrencyCode, String price) {
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f11136a = j;
        this.f11137b = priceCurrencyCode;
        this.f11138c = price;
    }
}
