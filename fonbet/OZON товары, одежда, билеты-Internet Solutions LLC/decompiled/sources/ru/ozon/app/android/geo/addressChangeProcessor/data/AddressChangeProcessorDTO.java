package ru.ozon.app.android.geo.addressChangeProcessor.data;

import Sc.InterfaceC3999a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0006\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO;", "", "locationInfo", "Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO$LocationInfo;", "redirectLink", "", "isNewLoyalityProgram", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO$LocationInfo;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getLocationInfo", "()Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO$LocationInfo;", "getRedirectLink$annotations", "()V", "getRedirectLink", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO$LocationInfo;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO;", "equals", "other", "hashCode", "", "toString", "LocationInfo", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressChangeProcessorDTO {
    private final AtomActionDTO action;
    private final Boolean isNewLoyalityProgram;
    private final LocationInfo locationInfo;
    private final String redirectLink;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO$LocationInfo;", "", "areaId", "", "addressId", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "getAreaId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAddressId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO$LocationInfo;", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationInfo {
        private final String addressId;
        private final Long areaId;

        public LocationInfo(Long l11, String str) {
            this.areaId = l11;
            this.addressId = str;
        }

        public static /* synthetic */ LocationInfo copy$default(LocationInfo locationInfo, Long l11, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = locationInfo.areaId;
            }
            if ((i11 & 2) != 0) {
                str = locationInfo.addressId;
            }
            return locationInfo.copy(l11, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getAreaId() {
            return this.areaId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAddressId() {
            return this.addressId;
        }

        @NotNull
        public final LocationInfo copy(Long areaId, String addressId) {
            return new LocationInfo(areaId, addressId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationInfo)) {
                return false;
            }
            LocationInfo locationInfo = (LocationInfo) other;
            return Intrinsics.d(this.areaId, locationInfo.areaId) && Intrinsics.d(this.addressId, locationInfo.addressId);
        }

        public final String getAddressId() {
            return this.addressId;
        }

        public final Long getAreaId() {
            return this.areaId;
        }

        public int hashCode() {
            Long l11 = this.areaId;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            String str = this.addressId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LocationInfo(areaId=" + this.areaId + ", addressId=" + this.addressId + ")";
        }
    }

    public AddressChangeProcessorDTO(LocationInfo locationInfo, String str, Boolean bool, AtomActionDTO atomActionDTO) {
        this.locationInfo = locationInfo;
        this.redirectLink = str;
        this.isNewLoyalityProgram = bool;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ AddressChangeProcessorDTO copy$default(AddressChangeProcessorDTO addressChangeProcessorDTO, LocationInfo locationInfo, String str, Boolean bool, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locationInfo = addressChangeProcessorDTO.locationInfo;
        }
        if ((i11 & 2) != 0) {
            str = addressChangeProcessorDTO.redirectLink;
        }
        if ((i11 & 4) != 0) {
            bool = addressChangeProcessorDTO.isNewLoyalityProgram;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = addressChangeProcessorDTO.action;
        }
        return addressChangeProcessorDTO.copy(locationInfo, str, bool, atomActionDTO);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getRedirectLink$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirectLink() {
        return this.redirectLink;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsNewLoyalityProgram() {
        return this.isNewLoyalityProgram;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final AddressChangeProcessorDTO copy(LocationInfo locationInfo, String redirectLink, Boolean isNewLoyalityProgram, AtomActionDTO action) {
        return new AddressChangeProcessorDTO(locationInfo, redirectLink, isNewLoyalityProgram, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressChangeProcessorDTO)) {
            return false;
        }
        AddressChangeProcessorDTO addressChangeProcessorDTO = (AddressChangeProcessorDTO) other;
        return Intrinsics.d(this.locationInfo, addressChangeProcessorDTO.locationInfo) && Intrinsics.d(this.redirectLink, addressChangeProcessorDTO.redirectLink) && Intrinsics.d(this.isNewLoyalityProgram, addressChangeProcessorDTO.isNewLoyalityProgram) && Intrinsics.d(this.action, addressChangeProcessorDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    public final String getRedirectLink() {
        return this.redirectLink;
    }

    public int hashCode() {
        LocationInfo locationInfo = this.locationInfo;
        int hashCode = (locationInfo == null ? 0 : locationInfo.hashCode()) * 31;
        String str = this.redirectLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isNewLoyalityProgram;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode3 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    public final Boolean isNewLoyalityProgram() {
        return this.isNewLoyalityProgram;
    }

    @NotNull
    public String toString() {
        return "AddressChangeProcessorDTO(locationInfo=" + this.locationInfo + ", redirectLink=" + this.redirectLink + ", isNewLoyalityProgram=" + this.isNewLoyalityProgram + ", action=" + this.action + ")";
    }
}
