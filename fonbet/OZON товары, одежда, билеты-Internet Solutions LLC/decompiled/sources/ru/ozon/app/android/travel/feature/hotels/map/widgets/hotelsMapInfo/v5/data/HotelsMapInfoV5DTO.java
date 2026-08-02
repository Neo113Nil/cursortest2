package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.data;

import C.o0;
import D40.c;
import El.C2971a;
import G.g;
import N3.C3660k;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBoxV2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003FGHBo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u00108\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b9\u0010*J\u000b\u0010:\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010;\u001a\u00020\u0016HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u008c\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u00020\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006I"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO;", "", "visibleRegion", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "locationPoint", "", "", "pinsDisplaySettings", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "actions", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;", "pinTypes", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PinTypes;", "cardStyle", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "districts", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "mobileSettings", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$MobileSettings;", "regionHash", "", "pinLimits", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;", "tracking", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$TrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PinTypes;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$TrackingInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getVisibleRegion", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "getLocationPoint", "()Ljava/util/List;", "getPinsDisplaySettings", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "getActions", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;", "getPinTypes", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PinTypes;", "getCardStyle", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "getDistricts", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "getMobileSettings-ie92oRg", "()Ljava/lang/String;", "Ljava/lang/String;", "getRegionHash", "getPinLimits", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;", "getTracking", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$TrackingInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component8-ie92oRg", "component9", "component10", "component11", "copy", "copy-ZtuWM3k", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PinTypes;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$TrackingInfo;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO;", "equals", "", "other", "hashCode", "", "toString", "PinTypes", "PricePinStates", "TrackingInfo", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsMapInfoV5DTO {

    @NotNull
    private final HotelsMapInfoV4DTO.Actions actions;

    @NotNull
    private final HotelsMapInfoV4DTO.CardStyle cardStyle;
    private final DistrictsDTO districts;

    @NotNull
    private final List<Double> locationPoint;

    @NotNull
    private final String mobileSettings;

    @NotNull
    private final HotelsMapInfoV4DTO.PinLimits pinLimits;

    @NotNull
    private final PinTypes pinTypes;

    @NotNull
    private final HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings;
    private final String regionHash;
    private final TrackingInfo tracking;
    private final BoundingBoxV2 visibleRegion;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PinTypes;", "", "highRanked", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates;", "lowRanked", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates;)V", "getHighRanked", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates;", "getLowRanked", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinTypes {

        @NotNull
        private final PricePinStates highRanked;

        @NotNull
        private final HotelsMapInfoV4DTO.PointPinStates lowRanked;

        public PinTypes(@NotNull PricePinStates highRanked, @NotNull HotelsMapInfoV4DTO.PointPinStates lowRanked) {
            Intrinsics.checkNotNullParameter(highRanked, "highRanked");
            Intrinsics.checkNotNullParameter(lowRanked, "lowRanked");
            this.highRanked = highRanked;
            this.lowRanked = lowRanked;
        }

        public static /* synthetic */ PinTypes copy$default(PinTypes pinTypes, PricePinStates pricePinStates, HotelsMapInfoV4DTO.PointPinStates pointPinStates, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                pricePinStates = pinTypes.highRanked;
            }
            if ((i11 & 2) != 0) {
                pointPinStates = pinTypes.lowRanked;
            }
            return pinTypes.copy(pricePinStates, pointPinStates);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PricePinStates getHighRanked() {
            return this.highRanked;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final HotelsMapInfoV4DTO.PointPinStates getLowRanked() {
            return this.lowRanked;
        }

        @NotNull
        public final PinTypes copy(@NotNull PricePinStates highRanked, @NotNull HotelsMapInfoV4DTO.PointPinStates lowRanked) {
            Intrinsics.checkNotNullParameter(highRanked, "highRanked");
            Intrinsics.checkNotNullParameter(lowRanked, "lowRanked");
            return new PinTypes(highRanked, lowRanked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinTypes)) {
                return false;
            }
            PinTypes pinTypes = (PinTypes) other;
            return Intrinsics.d(this.highRanked, pinTypes.highRanked) && Intrinsics.d(this.lowRanked, pinTypes.lowRanked);
        }

        @NotNull
        public final PricePinStates getHighRanked() {
            return this.highRanked;
        }

        @NotNull
        public final HotelsMapInfoV4DTO.PointPinStates getLowRanked() {
            return this.lowRanked;
        }

        public int hashCode() {
            return this.lowRanked.hashCode() + (this.highRanked.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PinTypes(highRanked=" + this.highRanked + ", lowRanked=" + this.lowRanked + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$TrackingInfo;", "", "readyTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "pinCommonTrackingInfo", "loaderTrackingInfo", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getReadyTrackingInfo", "()Ljava/util/Map;", "getPinCommonTrackingInfo", "getLoaderTrackingInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingInfo {
        private final Map<String, TokenizedTrackingInfo> loaderTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> pinCommonTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> readyTrackingInfo;

        public TrackingInfo(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
            this.readyTrackingInfo = map;
            this.pinCommonTrackingInfo = map2;
            this.loaderTrackingInfo = map3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrackingInfo copy$default(TrackingInfo trackingInfo, Map map, Map map2, Map map3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = trackingInfo.readyTrackingInfo;
            }
            if ((i11 & 2) != 0) {
                map2 = trackingInfo.pinCommonTrackingInfo;
            }
            if ((i11 & 4) != 0) {
                map3 = trackingInfo.loaderTrackingInfo;
            }
            return trackingInfo.copy(map, map2, map3);
        }

        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.readyTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.pinCommonTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.loaderTrackingInfo;
        }

        @NotNull
        public final TrackingInfo copy(Map<String, TokenizedTrackingInfo> readyTrackingInfo, Map<String, TokenizedTrackingInfo> pinCommonTrackingInfo, Map<String, TokenizedTrackingInfo> loaderTrackingInfo) {
            return new TrackingInfo(readyTrackingInfo, pinCommonTrackingInfo, loaderTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingInfo)) {
                return false;
            }
            TrackingInfo trackingInfo = (TrackingInfo) other;
            return Intrinsics.d(this.readyTrackingInfo, trackingInfo.readyTrackingInfo) && Intrinsics.d(this.pinCommonTrackingInfo, trackingInfo.pinCommonTrackingInfo) && Intrinsics.d(this.loaderTrackingInfo, trackingInfo.loaderTrackingInfo);
        }

        public final Map<String, TokenizedTrackingInfo> getLoaderTrackingInfo() {
            return this.loaderTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getPinCommonTrackingInfo() {
            return this.pinCommonTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getReadyTrackingInfo() {
            return this.readyTrackingInfo;
        }

        public int hashCode() {
            Map<String, TokenizedTrackingInfo> map = this.readyTrackingInfo;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.pinCommonTrackingInfo;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.loaderTrackingInfo;
            return hashCode2 + (map3 != null ? map3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Map<String, TokenizedTrackingInfo> map = this.readyTrackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.pinCommonTrackingInfo;
            Map<String, TokenizedTrackingInfo> map3 = this.loaderTrackingInfo;
            StringBuilder sb2 = new StringBuilder("TrackingInfo(readyTrackingInfo=");
            sb2.append(map);
            sb2.append(", pinCommonTrackingInfo=");
            sb2.append(map2);
            sb2.append(", loaderTrackingInfo=");
            return P.f(sb2, map3, ")");
        }
    }

    public /* synthetic */ HotelsMapInfoV5DTO(BoundingBoxV2 boundingBoxV2, List list, HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings, HotelsMapInfoV4DTO.Actions actions, PinTypes pinTypes, HotelsMapInfoV4DTO.CardStyle cardStyle, DistrictsDTO districtsDTO, String str, String str2, HotelsMapInfoV4DTO.PinLimits pinLimits, TrackingInfo trackingInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(boundingBoxV2, list, pinsDisplaySettings, actions, pinTypes, cardStyle, districtsDTO, str, str2, pinLimits, trackingInfo);
    }

    /* renamed from: copy-ZtuWM3k$default, reason: not valid java name */
    public static /* synthetic */ HotelsMapInfoV5DTO m1333copyZtuWM3k$default(HotelsMapInfoV5DTO hotelsMapInfoV5DTO, BoundingBoxV2 boundingBoxV2, List list, HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings, HotelsMapInfoV4DTO.Actions actions, PinTypes pinTypes, HotelsMapInfoV4DTO.CardStyle cardStyle, DistrictsDTO districtsDTO, String str, String str2, HotelsMapInfoV4DTO.PinLimits pinLimits, TrackingInfo trackingInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            boundingBoxV2 = hotelsMapInfoV5DTO.visibleRegion;
        }
        if ((i11 & 2) != 0) {
            list = hotelsMapInfoV5DTO.locationPoint;
        }
        if ((i11 & 4) != 0) {
            pinsDisplaySettings = hotelsMapInfoV5DTO.pinsDisplaySettings;
        }
        if ((i11 & 8) != 0) {
            actions = hotelsMapInfoV5DTO.actions;
        }
        if ((i11 & 16) != 0) {
            pinTypes = hotelsMapInfoV5DTO.pinTypes;
        }
        if ((i11 & 32) != 0) {
            cardStyle = hotelsMapInfoV5DTO.cardStyle;
        }
        if ((i11 & 64) != 0) {
            districtsDTO = hotelsMapInfoV5DTO.districts;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = hotelsMapInfoV5DTO.mobileSettings;
        }
        if ((i11 & 256) != 0) {
            str2 = hotelsMapInfoV5DTO.regionHash;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            pinLimits = hotelsMapInfoV5DTO.pinLimits;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            trackingInfo = hotelsMapInfoV5DTO.tracking;
        }
        HotelsMapInfoV4DTO.PinLimits pinLimits2 = pinLimits;
        TrackingInfo trackingInfo2 = trackingInfo;
        String str3 = str;
        String str4 = str2;
        HotelsMapInfoV4DTO.CardStyle cardStyle2 = cardStyle;
        DistrictsDTO districtsDTO2 = districtsDTO;
        PinTypes pinTypes2 = pinTypes;
        HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings2 = pinsDisplaySettings;
        return hotelsMapInfoV5DTO.m1335copyZtuWM3k(boundingBoxV2, list, pinsDisplaySettings2, actions, pinTypes2, cardStyle2, districtsDTO2, str3, str4, pinLimits2, trackingInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final BoundingBoxV2 getVisibleRegion() {
        return this.visibleRegion;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final HotelsMapInfoV4DTO.PinLimits getPinLimits() {
        return this.pinLimits;
    }

    /* renamed from: component11, reason: from getter */
    public final TrackingInfo getTracking() {
        return this.tracking;
    }

    @NotNull
    public final List<Double> component2() {
        return this.locationPoint;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final HotelsMapInfoV4DTO.PinsDisplaySettings getPinsDisplaySettings() {
        return this.pinsDisplaySettings;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final HotelsMapInfoV4DTO.Actions getActions() {
        return this.actions;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PinTypes getPinTypes() {
        return this.pinTypes;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final HotelsMapInfoV4DTO.CardStyle getCardStyle() {
        return this.cardStyle;
    }

    /* renamed from: component7, reason: from getter */
    public final DistrictsDTO getDistricts() {
        return this.districts;
    }

    @NotNull
    /* renamed from: component8-ie92oRg, reason: not valid java name and from getter */
    public final String getMobileSettings() {
        return this.mobileSettings;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRegionHash() {
        return this.regionHash;
    }

    @NotNull
    /* renamed from: copy-ZtuWM3k, reason: not valid java name */
    public final HotelsMapInfoV5DTO m1335copyZtuWM3k(BoundingBoxV2 visibleRegion, @NotNull List<Double> locationPoint, @NotNull HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings, @NotNull HotelsMapInfoV4DTO.Actions actions, @NotNull PinTypes pinTypes, @NotNull HotelsMapInfoV4DTO.CardStyle cardStyle, DistrictsDTO districts, @NotNull String mobileSettings, String regionHash, @NotNull HotelsMapInfoV4DTO.PinLimits pinLimits, TrackingInfo tracking) {
        Intrinsics.checkNotNullParameter(locationPoint, "locationPoint");
        Intrinsics.checkNotNullParameter(pinsDisplaySettings, "pinsDisplaySettings");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(pinTypes, "pinTypes");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        Intrinsics.checkNotNullParameter(mobileSettings, "mobileSettings");
        Intrinsics.checkNotNullParameter(pinLimits, "pinLimits");
        return new HotelsMapInfoV5DTO(visibleRegion, locationPoint, pinsDisplaySettings, actions, pinTypes, cardStyle, districts, mobileSettings, regionHash, pinLimits, tracking, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsMapInfoV5DTO)) {
            return false;
        }
        HotelsMapInfoV5DTO hotelsMapInfoV5DTO = (HotelsMapInfoV5DTO) other;
        return Intrinsics.d(this.visibleRegion, hotelsMapInfoV5DTO.visibleRegion) && Intrinsics.d(this.locationPoint, hotelsMapInfoV5DTO.locationPoint) && Intrinsics.d(this.pinsDisplaySettings, hotelsMapInfoV5DTO.pinsDisplaySettings) && Intrinsics.d(this.actions, hotelsMapInfoV5DTO.actions) && Intrinsics.d(this.pinTypes, hotelsMapInfoV5DTO.pinTypes) && Intrinsics.d(this.cardStyle, hotelsMapInfoV5DTO.cardStyle) && Intrinsics.d(this.districts, hotelsMapInfoV5DTO.districts) && HotelsMapInfoV4DTO.MobileSettings.m1327equalsimpl0(this.mobileSettings, hotelsMapInfoV5DTO.mobileSettings) && Intrinsics.d(this.regionHash, hotelsMapInfoV5DTO.regionHash) && Intrinsics.d(this.pinLimits, hotelsMapInfoV5DTO.pinLimits) && Intrinsics.d(this.tracking, hotelsMapInfoV5DTO.tracking);
    }

    @NotNull
    public final HotelsMapInfoV4DTO.Actions getActions() {
        return this.actions;
    }

    @NotNull
    public final HotelsMapInfoV4DTO.CardStyle getCardStyle() {
        return this.cardStyle;
    }

    public final DistrictsDTO getDistricts() {
        return this.districts;
    }

    @NotNull
    public final List<Double> getLocationPoint() {
        return this.locationPoint;
    }

    @NotNull
    /* renamed from: getMobileSettings-ie92oRg, reason: not valid java name */
    public final String m1336getMobileSettingsie92oRg() {
        return this.mobileSettings;
    }

    @NotNull
    public final HotelsMapInfoV4DTO.PinLimits getPinLimits() {
        return this.pinLimits;
    }

    @NotNull
    public final PinTypes getPinTypes() {
        return this.pinTypes;
    }

    @NotNull
    public final HotelsMapInfoV4DTO.PinsDisplaySettings getPinsDisplaySettings() {
        return this.pinsDisplaySettings;
    }

    public final String getRegionHash() {
        return this.regionHash;
    }

    public final TrackingInfo getTracking() {
        return this.tracking;
    }

    public final BoundingBoxV2 getVisibleRegion() {
        return this.visibleRegion;
    }

    public int hashCode() {
        BoundingBoxV2 boundingBoxV2 = this.visibleRegion;
        int hashCode = (this.cardStyle.hashCode() + ((this.pinTypes.hashCode() + ((this.actions.hashCode() + ((this.pinsDisplaySettings.hashCode() + g.b((boundingBoxV2 == null ? 0 : boundingBoxV2.hashCode()) * 31, 31, this.locationPoint)) * 31)) * 31)) * 31)) * 31;
        DistrictsDTO districtsDTO = this.districts;
        int m1328hashCodeimpl = (HotelsMapInfoV4DTO.MobileSettings.m1328hashCodeimpl(this.mobileSettings) + ((hashCode + (districtsDTO == null ? 0 : districtsDTO.hashCode())) * 31)) * 31;
        String str = this.regionHash;
        int hashCode2 = (this.pinLimits.hashCode() + ((m1328hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        TrackingInfo trackingInfo = this.tracking;
        return hashCode2 + (trackingInfo != null ? trackingInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HotelsMapInfoV5DTO(visibleRegion=" + this.visibleRegion + ", locationPoint=" + this.locationPoint + ", pinsDisplaySettings=" + this.pinsDisplaySettings + ", actions=" + this.actions + ", pinTypes=" + this.pinTypes + ", cardStyle=" + this.cardStyle + ", districts=" + this.districts + ", mobileSettings=" + HotelsMapInfoV4DTO.MobileSettings.m1329toStringimpl(this.mobileSettings) + ", regionHash=" + this.regionHash + ", pinLimits=" + this.pinLimits + ", tracking=" + this.tracking + ")";
    }

    private HotelsMapInfoV5DTO(BoundingBoxV2 boundingBoxV2, List<Double> locationPoint, HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings, HotelsMapInfoV4DTO.Actions actions, PinTypes pinTypes, HotelsMapInfoV4DTO.CardStyle cardStyle, DistrictsDTO districtsDTO, String mobileSettings, String str, HotelsMapInfoV4DTO.PinLimits pinLimits, TrackingInfo trackingInfo) {
        Intrinsics.checkNotNullParameter(locationPoint, "locationPoint");
        Intrinsics.checkNotNullParameter(pinsDisplaySettings, "pinsDisplaySettings");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(pinTypes, "pinTypes");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        Intrinsics.checkNotNullParameter(mobileSettings, "mobileSettings");
        Intrinsics.checkNotNullParameter(pinLimits, "pinLimits");
        this.visibleRegion = boundingBoxV2;
        this.locationPoint = locationPoint;
        this.pinsDisplaySettings = pinsDisplaySettings;
        this.actions = actions;
        this.pinTypes = pinTypes;
        this.cardStyle = cardStyle;
        this.districts = districtsDTO;
        this.mobileSettings = mobileSettings;
        this.regionHash = str;
        this.pinLimits = pinLimits;
        this.tracking = trackingInfo;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates;", "", "default", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates$PinStyles;", "selected", "viewed", "icons", "", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "favoriteIcon", "singlePinTemplateTitle", "", "clusterPinTemplateTitle", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates$PinStyles;Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Ljava/lang/String;)V", "getDefault", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates$PinStyles;", "getSelected", "getViewed", "getIcons", "()Ljava/util/Map;", "getFavoriteIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSinglePinTemplateTitle", "()Ljava/lang/String;", "getClusterPinTemplateTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "PinStyles", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PricePinStates {

        @NotNull
        private final String clusterPinTemplateTitle;

        @NotNull
        private final PinStyles default;

        @NotNull
        private final IconDTO favoriteIcon;

        @NotNull
        private final Map<Integer, IconDTO> icons;
        private final PinStyles selected;

        @NotNull
        private final String singlePinTemplateTitle;
        private final PinStyles viewed;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates$PinStyles;", "", "backgroundColor", "", "borderColor", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "clusterBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getClusterBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PinStyles {

            @NotNull
            private final String backgroundColor;
            private final String borderColor;

            @NotNull
            private final BadgeDTO clusterBadge;

            @NotNull
            private final TextDTO text;

            public PinStyles(@NotNull String backgroundColor, String str, @NotNull TextDTO text, @NotNull BadgeDTO clusterBadge) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(clusterBadge, "clusterBadge");
                this.backgroundColor = backgroundColor;
                this.borderColor = str;
                this.text = text;
                this.clusterBadge = clusterBadge;
            }

            public static /* synthetic */ PinStyles copy$default(PinStyles pinStyles, String str, String str2, TextDTO textDTO, BadgeDTO badgeDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = pinStyles.backgroundColor;
                }
                if ((i11 & 2) != 0) {
                    str2 = pinStyles.borderColor;
                }
                if ((i11 & 4) != 0) {
                    textDTO = pinStyles.text;
                }
                if ((i11 & 8) != 0) {
                    badgeDTO = pinStyles.clusterBadge;
                }
                return pinStyles.copy(str, str2, textDTO, badgeDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBorderColor() {
                return this.borderColor;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final BadgeDTO getClusterBadge() {
                return this.clusterBadge;
            }

            @NotNull
            public final PinStyles copy(@NotNull String backgroundColor, String borderColor, @NotNull TextDTO text, @NotNull BadgeDTO clusterBadge) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(clusterBadge, "clusterBadge");
                return new PinStyles(backgroundColor, borderColor, text, clusterBadge);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinStyles)) {
                    return false;
                }
                PinStyles pinStyles = (PinStyles) other;
                return Intrinsics.d(this.backgroundColor, pinStyles.backgroundColor) && Intrinsics.d(this.borderColor, pinStyles.borderColor) && Intrinsics.d(this.text, pinStyles.text) && Intrinsics.d(this.clusterBadge, pinStyles.clusterBadge);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            @NotNull
            public final BadgeDTO getClusterBadge() {
                return this.clusterBadge;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.backgroundColor.hashCode() * 31;
                String str = this.borderColor;
                return this.clusterBadge.hashCode() + b.a(this.text, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                String str2 = this.borderColor;
                TextDTO textDTO = this.text;
                BadgeDTO badgeDTO = this.clusterBadge;
                StringBuilder d11 = C3660k.d("PinStyles(backgroundColor=", str, ", borderColor=", str2, ", text=");
                d11.append(textDTO);
                d11.append(", clusterBadge=");
                d11.append(badgeDTO);
                d11.append(")");
                return d11.toString();
            }
        }

        public PricePinStates(@NotNull PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3, @NotNull Map<Integer, IconDTO> icons, @NotNull IconDTO favoriteIcon, @NotNull String singlePinTemplateTitle, @NotNull String clusterPinTemplateTitle) {
            Intrinsics.checkNotNullParameter(pinStyles, "default");
            Intrinsics.checkNotNullParameter(icons, "icons");
            Intrinsics.checkNotNullParameter(favoriteIcon, "favoriteIcon");
            Intrinsics.checkNotNullParameter(singlePinTemplateTitle, "singlePinTemplateTitle");
            Intrinsics.checkNotNullParameter(clusterPinTemplateTitle, "clusterPinTemplateTitle");
            this.default = pinStyles;
            this.selected = pinStyles2;
            this.viewed = pinStyles3;
            this.icons = icons;
            this.favoriteIcon = favoriteIcon;
            this.singlePinTemplateTitle = singlePinTemplateTitle;
            this.clusterPinTemplateTitle = clusterPinTemplateTitle;
        }

        public static /* synthetic */ PricePinStates copy$default(PricePinStates pricePinStates, PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3, Map map, IconDTO iconDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                pinStyles = pricePinStates.default;
            }
            if ((i11 & 2) != 0) {
                pinStyles2 = pricePinStates.selected;
            }
            if ((i11 & 4) != 0) {
                pinStyles3 = pricePinStates.viewed;
            }
            if ((i11 & 8) != 0) {
                map = pricePinStates.icons;
            }
            if ((i11 & 16) != 0) {
                iconDTO = pricePinStates.favoriteIcon;
            }
            if ((i11 & 32) != 0) {
                str = pricePinStates.singlePinTemplateTitle;
            }
            if ((i11 & 64) != 0) {
                str2 = pricePinStates.clusterPinTemplateTitle;
            }
            String str3 = str;
            String str4 = str2;
            IconDTO iconDTO2 = iconDTO;
            PinStyles pinStyles4 = pinStyles3;
            return pricePinStates.copy(pinStyles, pinStyles2, pinStyles4, map, iconDTO2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PinStyles getDefault() {
            return this.default;
        }

        /* renamed from: component2, reason: from getter */
        public final PinStyles getSelected() {
            return this.selected;
        }

        /* renamed from: component3, reason: from getter */
        public final PinStyles getViewed() {
            return this.viewed;
        }

        @NotNull
        public final Map<Integer, IconDTO> component4() {
            return this.icons;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final IconDTO getFavoriteIcon() {
            return this.favoriteIcon;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getSinglePinTemplateTitle() {
            return this.singlePinTemplateTitle;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final String getClusterPinTemplateTitle() {
            return this.clusterPinTemplateTitle;
        }

        @NotNull
        public final PricePinStates copy(@NotNull PinStyles r102, PinStyles selected, PinStyles viewed, @NotNull Map<Integer, IconDTO> icons, @NotNull IconDTO favoriteIcon, @NotNull String singlePinTemplateTitle, @NotNull String clusterPinTemplateTitle) {
            Intrinsics.checkNotNullParameter(r102, "default");
            Intrinsics.checkNotNullParameter(icons, "icons");
            Intrinsics.checkNotNullParameter(favoriteIcon, "favoriteIcon");
            Intrinsics.checkNotNullParameter(singlePinTemplateTitle, "singlePinTemplateTitle");
            Intrinsics.checkNotNullParameter(clusterPinTemplateTitle, "clusterPinTemplateTitle");
            return new PricePinStates(r102, selected, viewed, icons, favoriteIcon, singlePinTemplateTitle, clusterPinTemplateTitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PricePinStates)) {
                return false;
            }
            PricePinStates pricePinStates = (PricePinStates) other;
            return Intrinsics.d(this.default, pricePinStates.default) && Intrinsics.d(this.selected, pricePinStates.selected) && Intrinsics.d(this.viewed, pricePinStates.viewed) && Intrinsics.d(this.icons, pricePinStates.icons) && Intrinsics.d(this.favoriteIcon, pricePinStates.favoriteIcon) && Intrinsics.d(this.singlePinTemplateTitle, pricePinStates.singlePinTemplateTitle) && Intrinsics.d(this.clusterPinTemplateTitle, pricePinStates.clusterPinTemplateTitle);
        }

        @NotNull
        public final String getClusterPinTemplateTitle() {
            return this.clusterPinTemplateTitle;
        }

        @NotNull
        public final PinStyles getDefault() {
            return this.default;
        }

        @NotNull
        public final IconDTO getFavoriteIcon() {
            return this.favoriteIcon;
        }

        @NotNull
        public final Map<Integer, IconDTO> getIcons() {
            return this.icons;
        }

        public final PinStyles getSelected() {
            return this.selected;
        }

        @NotNull
        public final String getSinglePinTemplateTitle() {
            return this.singlePinTemplateTitle;
        }

        public final PinStyles getViewed() {
            return this.viewed;
        }

        public int hashCode() {
            int hashCode = this.default.hashCode() * 31;
            PinStyles pinStyles = this.selected;
            int hashCode2 = (hashCode + (pinStyles == null ? 0 : pinStyles.hashCode())) * 31;
            PinStyles pinStyles2 = this.viewed;
            return this.clusterPinTemplateTitle.hashCode() + g.a(C2971a.a(this.favoriteIcon, c.a(this.icons, (hashCode2 + (pinStyles2 != null ? pinStyles2.hashCode() : 0)) * 31, 31), 31), 31, this.singlePinTemplateTitle);
        }

        @NotNull
        public String toString() {
            PinStyles pinStyles = this.default;
            PinStyles pinStyles2 = this.selected;
            PinStyles pinStyles3 = this.viewed;
            Map<Integer, IconDTO> map = this.icons;
            IconDTO iconDTO = this.favoriteIcon;
            String str = this.singlePinTemplateTitle;
            String str2 = this.clusterPinTemplateTitle;
            StringBuilder sb2 = new StringBuilder("PricePinStates(default=");
            sb2.append(pinStyles);
            sb2.append(", selected=");
            sb2.append(pinStyles2);
            sb2.append(", viewed=");
            sb2.append(pinStyles3);
            sb2.append(", icons=");
            sb2.append(map);
            sb2.append(", favoriteIcon=");
            sb2.append(iconDTO);
            sb2.append(", singlePinTemplateTitle=");
            sb2.append(str);
            sb2.append(", clusterPinTemplateTitle=");
            return o0.c(sb2, str2, ")");
        }

        public /* synthetic */ PricePinStates(PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3, Map map, IconDTO iconDTO, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(pinStyles, pinStyles2, pinStyles3, (i11 & 8) != 0 ? U.c() : map, iconDTO, str, str2);
        }
    }

    public HotelsMapInfoV5DTO(BoundingBoxV2 boundingBoxV2, List list, HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings, HotelsMapInfoV4DTO.Actions actions, PinTypes pinTypes, HotelsMapInfoV4DTO.CardStyle cardStyle, DistrictsDTO districtsDTO, String str, String str2, HotelsMapInfoV4DTO.PinLimits pinLimits, TrackingInfo trackingInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(boundingBoxV2, (i11 & 2) != 0 ? K.f71697a : list, pinsDisplaySettings, actions, pinTypes, cardStyle, districtsDTO, str, str2, pinLimits, trackingInfo, null);
    }
}
