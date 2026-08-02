package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.data;

import Sc.InterfaceC3999a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/data/OrderDoneCrossButtonDTO;", "", "closeButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getCloseButton$annotations", "()V", "getCloseButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDoneCrossButtonDTO {
    public static final int $stable = IconButtonV3DTO.$stable | ButtonV3Atom.SmallIconButton.$stable;
    private final ButtonV3Atom.SmallIconButton closeButton;

    @NotNull
    private final IconButtonV3DTO iconButton;

    public OrderDoneCrossButtonDTO(ButtonV3Atom.SmallIconButton smallIconButton, @NotNull IconButtonV3DTO iconButton) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.closeButton = smallIconButton;
        this.iconButton = iconButton;
    }

    public static /* synthetic */ OrderDoneCrossButtonDTO copy$default(OrderDoneCrossButtonDTO orderDoneCrossButtonDTO, ButtonV3Atom.SmallIconButton smallIconButton, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallIconButton = orderDoneCrossButtonDTO.closeButton;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = orderDoneCrossButtonDTO.iconButton;
        }
        return orderDoneCrossButtonDTO.copy(smallIconButton, iconButtonV3DTO);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getCloseButton$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final OrderDoneCrossButtonDTO copy(ButtonV3Atom.SmallIconButton closeButton, @NotNull IconButtonV3DTO iconButton) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        return new OrderDoneCrossButtonDTO(closeButton, iconButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDoneCrossButtonDTO)) {
            return false;
        }
        OrderDoneCrossButtonDTO orderDoneCrossButtonDTO = (OrderDoneCrossButtonDTO) other;
        return Intrinsics.d(this.closeButton, orderDoneCrossButtonDTO.closeButton) && Intrinsics.d(this.iconButton, orderDoneCrossButtonDTO.iconButton);
    }

    public final ButtonV3Atom.SmallIconButton getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    public int hashCode() {
        ButtonV3Atom.SmallIconButton smallIconButton = this.closeButton;
        return this.iconButton.hashCode() + ((smallIconButton == null ? 0 : smallIconButton.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "OrderDoneCrossButtonDTO(closeButton=" + this.closeButton + ", iconButton=" + this.iconButton + ")";
    }
}
