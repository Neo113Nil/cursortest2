package ru.ozon.uni.android.atom.price.data;

import B0.C2454a;
import Ek.a;
import J0.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Spacings;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b \u0010\u0012R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lru/ozon/uni/android/atom/price/data/PricePreset;", "", "Lru/ozon/uni/android/atom/price/data/PriceTextAppearance;", "textAppearance", "", "iconSize", "contentGap", "bgPaddings", "bgCornerRadius", "atomHeight", "priceGap", "leftPartGap", "<init>", "(Lru/ozon/uni/android/atom/price/data/PriceTextAppearance;IIIIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/atom/price/data/PriceTextAppearance;", "getTextAppearance", "()Lru/ozon/uni/android/atom/price/data/PriceTextAppearance;", "I", "getIconSize", "getContentGap", "getBgPaddings", "getBgCornerRadius", "getAtomHeight", "getPriceGap", "getLeftPartGap", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PricePreset {
    private final int atomHeight;
    private final int bgCornerRadius;
    private final int bgPaddings;
    private final int contentGap;
    private final int iconSize;
    private final int leftPartGap;
    private final int priceGap;

    @NotNull
    private final PriceTextAppearance textAppearance;

    public PricePreset(@NotNull PriceTextAppearance textAppearance, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
        this.textAppearance = textAppearance;
        this.iconSize = i11;
        this.contentGap = i12;
        this.bgPaddings = i13;
        this.bgCornerRadius = i14;
        this.atomHeight = i15;
        this.priceGap = i16;
        this.leftPartGap = i17;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricePreset)) {
            return false;
        }
        PricePreset pricePreset = (PricePreset) other;
        return Intrinsics.d(this.textAppearance, pricePreset.textAppearance) && this.iconSize == pricePreset.iconSize && this.contentGap == pricePreset.contentGap && this.bgPaddings == pricePreset.bgPaddings && this.bgCornerRadius == pricePreset.bgCornerRadius && this.atomHeight == pricePreset.atomHeight && this.priceGap == pricePreset.priceGap && this.leftPartGap == pricePreset.leftPartGap;
    }

    public final int getAtomHeight() {
        return this.atomHeight;
    }

    public final int getBgCornerRadius() {
        return this.bgCornerRadius;
    }

    public final int getBgPaddings() {
        return this.bgPaddings;
    }

    public final int getContentGap() {
        return this.contentGap;
    }

    public final int getIconSize() {
        return this.iconSize;
    }

    public final int getLeftPartGap() {
        return this.leftPartGap;
    }

    public final int getPriceGap() {
        return this.priceGap;
    }

    @NotNull
    public final PriceTextAppearance getTextAppearance() {
        return this.textAppearance;
    }

    public int hashCode() {
        return Integer.hashCode(this.leftPartGap) + C2454a.a(this.priceGap, C2454a.a(this.atomHeight, C2454a.a(this.bgCornerRadius, C2454a.a(this.bgPaddings, C2454a.a(this.contentGap, C2454a.a(this.iconSize, this.textAppearance.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        PriceTextAppearance priceTextAppearance = this.textAppearance;
        int i11 = this.iconSize;
        int i12 = this.contentGap;
        int i13 = this.bgPaddings;
        int i14 = this.bgCornerRadius;
        int i15 = this.atomHeight;
        int i16 = this.priceGap;
        int i17 = this.leftPartGap;
        StringBuilder sb2 = new StringBuilder("PricePreset(textAppearance=");
        sb2.append(priceTextAppearance);
        sb2.append(", iconSize=");
        sb2.append(i11);
        sb2.append(", contentGap=");
        a.f(i12, i13, ", bgPaddings=", ", bgCornerRadius=", sb2);
        a.f(i14, i15, ", atomHeight=", ", priceGap=", sb2);
        return P.a(i16, i17, ", leftPartGap=", ")", sb2);
    }

    public /* synthetic */ PricePreset(PriceTextAppearance priceTextAppearance, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(priceTextAppearance, i11, i12, i13, i14, i15, (i18 & 64) != 0 ? Spacings.SPACING_2.getPx() : i16, (i18 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Spacings.SPACING_0.getPx() : i17);
    }
}
