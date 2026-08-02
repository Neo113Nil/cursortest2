package ru.ozon.app.android.returns.returnableItemsList.data.dto;

import B90.C2619v;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/data/dto/TotalMobileDTO;", "", "total", "Lru/ozon/uni/atoms/data/price/Price;", "quantity", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "getTotal", "()Lru/ozon/uni/atoms/data/price/Price;", "getQuantity", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TotalMobileDTO {
    public static final int $stable = (ButtonV3Atom.SmallButton.$stable | TextAtom.$stable) | Price.$stable;

    @NotNull
    private final ButtonV3Atom.SmallButton button;

    @NotNull
    private final TextAtom quantity;

    @NotNull
    private final Price total;

    public TotalMobileDTO(@NotNull Price total, @NotNull TextAtom quantity, @NotNull ButtonV3Atom.SmallButton button) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(button, "button");
        this.total = total;
        this.quantity = quantity;
        this.button = button;
    }

    public static /* synthetic */ TotalMobileDTO copy$default(TotalMobileDTO totalMobileDTO, Price price, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            price = totalMobileDTO.total;
        }
        if ((i11 & 2) != 0) {
            textAtom = totalMobileDTO.quantity;
        }
        if ((i11 & 4) != 0) {
            smallButton = totalMobileDTO.button;
        }
        return totalMobileDTO.copy(price, textAtom, smallButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Price getTotal() {
        return this.total;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @NotNull
    public final TotalMobileDTO copy(@NotNull Price total, @NotNull TextAtom quantity, @NotNull ButtonV3Atom.SmallButton button) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(button, "button");
        return new TotalMobileDTO(total, quantity, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalMobileDTO)) {
            return false;
        }
        TotalMobileDTO totalMobileDTO = (TotalMobileDTO) other;
        return Intrinsics.d(this.total, totalMobileDTO.total) && Intrinsics.d(this.quantity, totalMobileDTO.quantity) && Intrinsics.d(this.button, totalMobileDTO.button);
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @NotNull
    public final TextAtom getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final Price getTotal() {
        return this.total;
    }

    public int hashCode() {
        return this.button.hashCode() + C2619v.b(this.total.hashCode() * 31, 31, this.quantity);
    }

    @NotNull
    public String toString() {
        return "TotalMobileDTO(total=" + this.total + ", quantity=" + this.quantity + ", button=" + this.button + ")";
    }
}
