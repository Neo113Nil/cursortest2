package ru.ozon.app.android.returns.ui.molecules.quantitySelector;

import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "", "increase", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "decrease", "quantity", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIncrease", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDecrease", "getQuantity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RmsQuantitySelector {

    @NotNull
    private final IconButtonV3DTO decrease;

    @NotNull
    private final IconButtonV3DTO increase;

    @NotNull
    private final TextDTO quantity;

    public RmsQuantitySelector(@NotNull IconButtonV3DTO increase, @NotNull IconButtonV3DTO decrease, @NotNull TextDTO quantity) {
        Intrinsics.checkNotNullParameter(increase, "increase");
        Intrinsics.checkNotNullParameter(decrease, "decrease");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.increase = increase;
        this.decrease = decrease;
        this.quantity = quantity;
    }

    public static /* synthetic */ RmsQuantitySelector copy$default(RmsQuantitySelector rmsQuantitySelector, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = rmsQuantitySelector.increase;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO2 = rmsQuantitySelector.decrease;
        }
        if ((i11 & 4) != 0) {
            textDTO = rmsQuantitySelector.quantity;
        }
        return rmsQuantitySelector.copy(iconButtonV3DTO, iconButtonV3DTO2, textDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getIncrease() {
        return this.increase;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getDecrease() {
        return this.decrease;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final RmsQuantitySelector copy(@NotNull IconButtonV3DTO increase, @NotNull IconButtonV3DTO decrease, @NotNull TextDTO quantity) {
        Intrinsics.checkNotNullParameter(increase, "increase");
        Intrinsics.checkNotNullParameter(decrease, "decrease");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return new RmsQuantitySelector(increase, decrease, quantity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RmsQuantitySelector)) {
            return false;
        }
        RmsQuantitySelector rmsQuantitySelector = (RmsQuantitySelector) other;
        return Intrinsics.d(this.increase, rmsQuantitySelector.increase) && Intrinsics.d(this.decrease, rmsQuantitySelector.decrease) && Intrinsics.d(this.quantity, rmsQuantitySelector.quantity);
    }

    @NotNull
    public final IconButtonV3DTO getDecrease() {
        return this.decrease;
    }

    @NotNull
    public final IconButtonV3DTO getIncrease() {
        return this.increase;
    }

    @NotNull
    public final TextDTO getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return this.quantity.hashCode() + b.c(this.decrease, this.increase.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        IconButtonV3DTO iconButtonV3DTO = this.increase;
        IconButtonV3DTO iconButtonV3DTO2 = this.decrease;
        TextDTO textDTO = this.quantity;
        StringBuilder sb2 = new StringBuilder("RmsQuantitySelector(increase=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", decrease=");
        sb2.append(iconButtonV3DTO2);
        sb2.append(", quantity=");
        return Tl.b.e(sb2, textDTO, ")");
    }
}
