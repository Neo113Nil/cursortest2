package ru.ozon.app.android.checkoutgeo.address.addressUiInfoService;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoResponse;", "", "addressCell", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "addressCellV2", "<init>", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;)V", "getAddressCell", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "getAddressCellV2", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddressUiInfoResponse {

    @NotNull
    private final AddressCell addressCell;

    @NotNull
    private final AddressCell addressCellV2;

    public AddressUiInfoResponse(@NotNull AddressCell addressCell, @NotNull AddressCell addressCellV2) {
        Intrinsics.checkNotNullParameter(addressCell, "addressCell");
        Intrinsics.checkNotNullParameter(addressCellV2, "addressCellV2");
        this.addressCell = addressCell;
        this.addressCellV2 = addressCellV2;
    }

    public static /* synthetic */ AddressUiInfoResponse copy$default(AddressUiInfoResponse addressUiInfoResponse, AddressCell addressCell, AddressCell addressCell2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addressCell = addressUiInfoResponse.addressCell;
        }
        if ((i11 & 2) != 0) {
            addressCell2 = addressUiInfoResponse.addressCellV2;
        }
        return addressUiInfoResponse.copy(addressCell, addressCell2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AddressCell getAddressCell() {
        return this.addressCell;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AddressCell getAddressCellV2() {
        return this.addressCellV2;
    }

    @NotNull
    public final AddressUiInfoResponse copy(@NotNull AddressCell addressCell, @NotNull AddressCell addressCellV2) {
        Intrinsics.checkNotNullParameter(addressCell, "addressCell");
        Intrinsics.checkNotNullParameter(addressCellV2, "addressCellV2");
        return new AddressUiInfoResponse(addressCell, addressCellV2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressUiInfoResponse)) {
            return false;
        }
        AddressUiInfoResponse addressUiInfoResponse = (AddressUiInfoResponse) other;
        return Intrinsics.d(this.addressCell, addressUiInfoResponse.addressCell) && Intrinsics.d(this.addressCellV2, addressUiInfoResponse.addressCellV2);
    }

    @NotNull
    public final AddressCell getAddressCell() {
        return this.addressCell;
    }

    @NotNull
    public final AddressCell getAddressCellV2() {
        return this.addressCellV2;
    }

    public int hashCode() {
        return this.addressCellV2.hashCode() + (this.addressCell.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AddressUiInfoResponse(addressCell=" + this.addressCell + ", addressCellV2=" + this.addressCellV2 + ")";
    }
}
