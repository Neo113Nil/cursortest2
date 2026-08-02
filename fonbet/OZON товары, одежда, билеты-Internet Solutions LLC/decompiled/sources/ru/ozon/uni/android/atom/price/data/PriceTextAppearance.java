package ru.ozon.uni.android.atom.price.data;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import J0.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/android/atom/price/data/PriceTextAppearance;", "", "", "prefixTextAppearanceResId", "priceTextAppearanceResId", "ppuTextAppearanceResId", "captionTextAppearanceResId", "originalPriceTextAppearanceResId", "discountTextAppearanceResId", "<init>", "(IIIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPrefixTextAppearanceResId", "getPriceTextAppearanceResId", "getPpuTextAppearanceResId", "getCaptionTextAppearanceResId", "getOriginalPriceTextAppearanceResId", "getDiscountTextAppearanceResId", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PriceTextAppearance {
    private final int captionTextAppearanceResId;
    private final int discountTextAppearanceResId;
    private final int originalPriceTextAppearanceResId;
    private final int ppuTextAppearanceResId;
    private final int prefixTextAppearanceResId;
    private final int priceTextAppearanceResId;

    public PriceTextAppearance(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.prefixTextAppearanceResId = i11;
        this.priceTextAppearanceResId = i12;
        this.ppuTextAppearanceResId = i13;
        this.captionTextAppearanceResId = i14;
        this.originalPriceTextAppearanceResId = i15;
        this.discountTextAppearanceResId = i16;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceTextAppearance)) {
            return false;
        }
        PriceTextAppearance priceTextAppearance = (PriceTextAppearance) other;
        return this.prefixTextAppearanceResId == priceTextAppearance.prefixTextAppearanceResId && this.priceTextAppearanceResId == priceTextAppearance.priceTextAppearanceResId && this.ppuTextAppearanceResId == priceTextAppearance.ppuTextAppearanceResId && this.captionTextAppearanceResId == priceTextAppearance.captionTextAppearanceResId && this.originalPriceTextAppearanceResId == priceTextAppearance.originalPriceTextAppearanceResId && this.discountTextAppearanceResId == priceTextAppearance.discountTextAppearanceResId;
    }

    public final int getCaptionTextAppearanceResId() {
        return this.captionTextAppearanceResId;
    }

    public final int getDiscountTextAppearanceResId() {
        return this.discountTextAppearanceResId;
    }

    public final int getOriginalPriceTextAppearanceResId() {
        return this.originalPriceTextAppearanceResId;
    }

    public final int getPpuTextAppearanceResId() {
        return this.ppuTextAppearanceResId;
    }

    public final int getPrefixTextAppearanceResId() {
        return this.prefixTextAppearanceResId;
    }

    public final int getPriceTextAppearanceResId() {
        return this.priceTextAppearanceResId;
    }

    public int hashCode() {
        return Integer.hashCode(this.discountTextAppearanceResId) + C2454a.a(this.originalPriceTextAppearanceResId, C2454a.a(this.captionTextAppearanceResId, C2454a.a(this.ppuTextAppearanceResId, C2454a.a(this.priceTextAppearanceResId, Integer.hashCode(this.prefixTextAppearanceResId) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.prefixTextAppearanceResId;
        int i12 = this.priceTextAppearanceResId;
        int i13 = this.ppuTextAppearanceResId;
        int i14 = this.captionTextAppearanceResId;
        int i15 = this.originalPriceTextAppearanceResId;
        int i16 = this.discountTextAppearanceResId;
        StringBuilder a11 = C2438a.a("PriceTextAppearance(prefixTextAppearanceResId=", i11, ", priceTextAppearanceResId=", ", ppuTextAppearanceResId=", i12);
        a.f(i13, i14, ", captionTextAppearanceResId=", ", originalPriceTextAppearanceResId=", a11);
        return P.a(i15, i16, ", discountTextAppearanceResId=", ")", a11);
    }
}
