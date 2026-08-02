package ru.ozon.app.android.geo.addressBookBar.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/data/AddressBookBarDTO;", "", "showSeparator", "", "addressCell", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/Boolean;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;Ljava/util/Map;)V", "getShowSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAddressCell", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;Ljava/util/Map;)Lru/ozon/app/android/geo/addressBookBar/data/AddressBookBarDTO;", "equals", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressBookBarDTO {

    @NotNull
    private final AddressCell addressCell;
    private final Boolean showSeparator;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AddressBookBarDTO(Boolean bool, @NotNull AddressCell addressCell, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(addressCell, "addressCell");
        this.showSeparator = bool;
        this.addressCell = addressCell;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressBookBarDTO copy$default(AddressBookBarDTO addressBookBarDTO, Boolean bool, AddressCell addressCell, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = addressBookBarDTO.showSeparator;
        }
        if ((i11 & 2) != 0) {
            addressCell = addressBookBarDTO.addressCell;
        }
        if ((i11 & 4) != 0) {
            map = addressBookBarDTO.trackingInfo;
        }
        return addressBookBarDTO.copy(bool, addressCell, map);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getShowSeparator() {
        return this.showSeparator;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AddressCell getAddressCell() {
        return this.addressCell;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final AddressBookBarDTO copy(Boolean showSeparator, @NotNull AddressCell addressCell, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(addressCell, "addressCell");
        return new AddressBookBarDTO(showSeparator, addressCell, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressBookBarDTO)) {
            return false;
        }
        AddressBookBarDTO addressBookBarDTO = (AddressBookBarDTO) other;
        return Intrinsics.d(this.showSeparator, addressBookBarDTO.showSeparator) && Intrinsics.d(this.addressCell, addressBookBarDTO.addressCell) && Intrinsics.d(this.trackingInfo, addressBookBarDTO.trackingInfo);
    }

    @NotNull
    public final AddressCell getAddressCell() {
        return this.addressCell;
    }

    public final Boolean getShowSeparator() {
        return this.showSeparator;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Boolean bool = this.showSeparator;
        int hashCode = (this.addressCell.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.showSeparator;
        AddressCell addressCell = this.addressCell;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AddressBookBarDTO(showSeparator=");
        sb2.append(bool);
        sb2.append(", addressCell=");
        sb2.append(addressCell);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
