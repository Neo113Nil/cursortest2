package ru.ozon.app.android.account.orders.changeDeliveryTimeButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/orders/changeDeliveryTimeButton/data/ChangeDeliveryTimeButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "disabled", "", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Z)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getDisabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChangeDeliveryTimeButtonDTO {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final boolean disabled;

    public ChangeDeliveryTimeButtonDTO(@NotNull ButtonV3Atom.LargeButton button, boolean z11) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.disabled = z11;
    }

    public static /* synthetic */ ChangeDeliveryTimeButtonDTO copy$default(ChangeDeliveryTimeButtonDTO changeDeliveryTimeButtonDTO, ButtonV3Atom.LargeButton largeButton, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            largeButton = changeDeliveryTimeButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            z11 = changeDeliveryTimeButtonDTO.disabled;
        }
        return changeDeliveryTimeButtonDTO.copy(largeButton, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    @NotNull
    public final ChangeDeliveryTimeButtonDTO copy(@NotNull ButtonV3Atom.LargeButton button, boolean disabled) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new ChangeDeliveryTimeButtonDTO(button, disabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeDeliveryTimeButtonDTO)) {
            return false;
        }
        ChangeDeliveryTimeButtonDTO changeDeliveryTimeButtonDTO = (ChangeDeliveryTimeButtonDTO) other;
        return Intrinsics.d(this.button, changeDeliveryTimeButtonDTO.button) && this.disabled == changeDeliveryTimeButtonDTO.disabled;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disabled) + (this.button.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ChangeDeliveryTimeButtonDTO(button=" + this.button + ", disabled=" + this.disabled + ")";
    }

    public /* synthetic */ ChangeDeliveryTimeButtonDTO(ButtonV3Atom.LargeButton largeButton, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(largeButton, (i11 & 2) != 0 ? false : z11);
    }
}
