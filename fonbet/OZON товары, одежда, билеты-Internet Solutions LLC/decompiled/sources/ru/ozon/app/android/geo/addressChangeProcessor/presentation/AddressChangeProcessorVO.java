package ru.ozon.app.android.geo.addressChangeProcessor.presentation;

import D40.a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001%B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO$LocationInfo;", "locationInfo", "", "redirectLink", "", "isNewLoyalityProgram", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO$LocationInfo;Ljava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO$LocationInfo;", "getLocationInfo", "()Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO$LocationInfo;", "Ljava/lang/String;", "getRedirectLink", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LocationInfo", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressChangeProcessorVO implements c {
    private final AtomAction action;
    private final long id;
    private final boolean isNewLoyalityProgram;
    private final LocationInfo locationInfo;
    private final String redirectLink;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO$LocationInfo;", "", "", "areaId", "", "addressId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getAreaId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getAddressId", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationInfo {
        private final String addressId;
        private final Long areaId;

        public LocationInfo(Long l11, String str) {
            this.areaId = l11;
            this.addressId = str;
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

    public AddressChangeProcessorVO(long j11, LocationInfo locationInfo, String str, boolean z11, AtomAction atomAction) {
        this.id = j11;
        this.locationInfo = locationInfo;
        this.redirectLink = str;
        this.isNewLoyalityProgram = z11;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressChangeProcessorVO)) {
            return false;
        }
        AddressChangeProcessorVO addressChangeProcessorVO = (AddressChangeProcessorVO) other;
        return this.id == addressChangeProcessorVO.id && Intrinsics.d(this.locationInfo, addressChangeProcessorVO.locationInfo) && Intrinsics.d(this.redirectLink, addressChangeProcessorVO.redirectLink) && this.isNewLoyalityProgram == addressChangeProcessorVO.isNewLoyalityProgram && Intrinsics.d(this.action, addressChangeProcessorVO.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    public final String getRedirectLink() {
        return this.redirectLink;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        LocationInfo locationInfo = this.locationInfo;
        int hashCode2 = (hashCode + (locationInfo == null ? 0 : locationInfo.hashCode())) * 31;
        String str = this.redirectLink;
        int a11 = C3532b.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isNewLoyalityProgram);
        AtomAction atomAction = this.action;
        return a11 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        LocationInfo locationInfo = this.locationInfo;
        String str = this.redirectLink;
        boolean z11 = this.isNewLoyalityProgram;
        AtomAction atomAction = this.action;
        StringBuilder sb2 = new StringBuilder("AddressChangeProcessorVO(id=");
        sb2.append(j11);
        sb2.append(", locationInfo=");
        sb2.append(locationInfo);
        a.g(", redirectLink=", str, ", isNewLoyalityProgram=", sb2, z11);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(")");
        return sb2.toString();
    }
}
