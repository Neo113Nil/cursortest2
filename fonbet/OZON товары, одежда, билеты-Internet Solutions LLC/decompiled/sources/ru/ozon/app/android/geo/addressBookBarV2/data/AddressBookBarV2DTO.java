package ru.ozon.app.android.geo.addressBookBarV2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/addressBookBarV2/data/AddressBookBarV2DTO;", "", "addressCell", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "isEmbedded", "", "backgroundColor", "", "geoAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getAddressCell", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundColor", "()Ljava/lang/String;", "getGeoAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/geo/addressBookBarV2/data/AddressBookBarV2DTO;", "equals", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AddressBookBarV2DTO {

    @NotNull
    private final AddressCell addressCell;
    private final String backgroundColor;
    private final AtomActionDTO geoAction;
    private final Boolean isEmbedded;

    public AddressBookBarV2DTO(@NotNull AddressCell addressCell, Boolean bool, String str, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(addressCell, "addressCell");
        this.addressCell = addressCell;
        this.isEmbedded = bool;
        this.backgroundColor = str;
        this.geoAction = atomActionDTO;
    }

    public static /* synthetic */ AddressBookBarV2DTO copy$default(AddressBookBarV2DTO addressBookBarV2DTO, AddressCell addressCell, Boolean bool, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addressCell = addressBookBarV2DTO.addressCell;
        }
        if ((i11 & 2) != 0) {
            bool = addressBookBarV2DTO.isEmbedded;
        }
        if ((i11 & 4) != 0) {
            str = addressBookBarV2DTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = addressBookBarV2DTO.geoAction;
        }
        return addressBookBarV2DTO.copy(addressCell, bool, str, atomActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AddressCell getAddressCell() {
        return this.addressCell;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getGeoAction() {
        return this.geoAction;
    }

    @NotNull
    public final AddressBookBarV2DTO copy(@NotNull AddressCell addressCell, Boolean isEmbedded, String backgroundColor, AtomActionDTO geoAction) {
        Intrinsics.checkNotNullParameter(addressCell, "addressCell");
        return new AddressBookBarV2DTO(addressCell, isEmbedded, backgroundColor, geoAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressBookBarV2DTO)) {
            return false;
        }
        AddressBookBarV2DTO addressBookBarV2DTO = (AddressBookBarV2DTO) other;
        return Intrinsics.d(this.addressCell, addressBookBarV2DTO.addressCell) && Intrinsics.d(this.isEmbedded, addressBookBarV2DTO.isEmbedded) && Intrinsics.d(this.backgroundColor, addressBookBarV2DTO.backgroundColor) && Intrinsics.d(this.geoAction, addressBookBarV2DTO.geoAction);
    }

    @NotNull
    public final AddressCell getAddressCell() {
        return this.addressCell;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AtomActionDTO getGeoAction() {
        return this.geoAction;
    }

    public int hashCode() {
        int hashCode = this.addressCell.hashCode() * 31;
        Boolean bool = this.isEmbedded;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.geoAction;
        return hashCode3 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    public final Boolean isEmbedded() {
        return this.isEmbedded;
    }

    @NotNull
    public String toString() {
        return "AddressBookBarV2DTO(addressCell=" + this.addressCell + ", isEmbedded=" + this.isEmbedded + ", backgroundColor=" + this.backgroundColor + ", geoAction=" + this.geoAction + ")";
    }
}
