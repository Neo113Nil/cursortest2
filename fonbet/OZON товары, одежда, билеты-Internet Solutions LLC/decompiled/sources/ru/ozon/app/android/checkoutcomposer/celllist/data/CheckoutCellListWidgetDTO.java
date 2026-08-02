package ru.ozon.app.android.checkoutcomposer.celllist.data;

import D3.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0004\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/celllist/data/CheckoutCellListWidgetDTO;", "", "checkoutCellList", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "isSticky", "", "isAutoToggleDisabled", "<init>", "(Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCheckoutCellList", "()Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/checkoutcomposer/celllist/data/CheckoutCellListWidgetDTO;", "equals", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckoutCellListWidgetDTO {
    public static final int $stable = 8;

    @NotNull
    private final CheckoutCellListDTO checkoutCellList;
    private final Boolean isAutoToggleDisabled;
    private final Boolean isSticky;

    public CheckoutCellListWidgetDTO(@NotNull CheckoutCellListDTO checkoutCellList, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(checkoutCellList, "checkoutCellList");
        this.checkoutCellList = checkoutCellList;
        this.isSticky = bool;
        this.isAutoToggleDisabled = bool2;
    }

    public static /* synthetic */ CheckoutCellListWidgetDTO copy$default(CheckoutCellListWidgetDTO checkoutCellListWidgetDTO, CheckoutCellListDTO checkoutCellListDTO, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            checkoutCellListDTO = checkoutCellListWidgetDTO.checkoutCellList;
        }
        if ((i11 & 2) != 0) {
            bool = checkoutCellListWidgetDTO.isSticky;
        }
        if ((i11 & 4) != 0) {
            bool2 = checkoutCellListWidgetDTO.isAutoToggleDisabled;
        }
        return checkoutCellListWidgetDTO.copy(checkoutCellListDTO, bool, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CheckoutCellListDTO getCheckoutCellList() {
        return this.checkoutCellList;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsAutoToggleDisabled() {
        return this.isAutoToggleDisabled;
    }

    @NotNull
    public final CheckoutCellListWidgetDTO copy(@NotNull CheckoutCellListDTO checkoutCellList, Boolean isSticky, Boolean isAutoToggleDisabled) {
        Intrinsics.checkNotNullParameter(checkoutCellList, "checkoutCellList");
        return new CheckoutCellListWidgetDTO(checkoutCellList, isSticky, isAutoToggleDisabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutCellListWidgetDTO)) {
            return false;
        }
        CheckoutCellListWidgetDTO checkoutCellListWidgetDTO = (CheckoutCellListWidgetDTO) other;
        return Intrinsics.d(this.checkoutCellList, checkoutCellListWidgetDTO.checkoutCellList) && Intrinsics.d(this.isSticky, checkoutCellListWidgetDTO.isSticky) && Intrinsics.d(this.isAutoToggleDisabled, checkoutCellListWidgetDTO.isAutoToggleDisabled);
    }

    @NotNull
    public final CheckoutCellListDTO getCheckoutCellList() {
        return this.checkoutCellList;
    }

    public int hashCode() {
        int hashCode = this.checkoutCellList.hashCode() * 31;
        Boolean bool = this.isSticky;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAutoToggleDisabled;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isAutoToggleDisabled() {
        return this.isAutoToggleDisabled;
    }

    public final Boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        CheckoutCellListDTO checkoutCellListDTO = this.checkoutCellList;
        Boolean bool = this.isSticky;
        Boolean bool2 = this.isAutoToggleDisabled;
        StringBuilder sb2 = new StringBuilder("CheckoutCellListWidgetDTO(checkoutCellList=");
        sb2.append(checkoutCellListDTO);
        sb2.append(", isSticky=");
        sb2.append(bool);
        sb2.append(", isAutoToggleDisabled=");
        return g.d(sb2, bool2, ")");
    }
}
