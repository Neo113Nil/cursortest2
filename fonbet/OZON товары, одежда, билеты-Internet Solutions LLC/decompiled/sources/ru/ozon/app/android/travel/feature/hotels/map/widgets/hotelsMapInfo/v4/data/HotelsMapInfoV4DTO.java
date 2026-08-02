package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import Am.C2438a;
import B0.A0;
import B0.C2454a;
import C.C2702w;
import Cm.e;
import El.C2971a;
import G.g;
import Gl.C3124a;
import Ih.a;
import K1.G;
import N3.C3660k;
import Ns.b;
import P4.f;
import Sc.InterfaceC3999a;
import T7.P;
import T7.Z;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
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
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001:\nPQRSTUVWXYB\u0083\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010A\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bB\u00100J\u000b\u0010C\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010D\u001a\u00020\u0018HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001cHÆ\u0003J¤\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020NHÖ\u0001J\t\u0010O\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u00020\u0014¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006Z"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO;", "", "visibleRegion", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "locationPoint", "", "", "pinsDisplaySettings", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "actions", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;", "pinTypes", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinTypes;", "cardStyle", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "districts", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "outOfBoundsBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "mobileSettings", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$MobileSettings;", "regionHash", "", "pinLimits", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;", "delaySettings", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;", "tracking", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$TrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinTypes;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$TrackingInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getVisibleRegion", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "getLocationPoint", "()Ljava/util/List;", "getPinsDisplaySettings", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "getActions", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;", "getPinTypes", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinTypes;", "getCardStyle", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "getDistricts", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "getOutOfBoundsBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getMobileSettings-ie92oRg", "()Ljava/lang/String;", "Ljava/lang/String;", "getRegionHash", "getPinLimits", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;", "getDelaySettings", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;", "getTracking", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$TrackingInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component9-ie92oRg", "component10", "component11", "component12", "component13", "copy", "copy-eOYQnJM", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinTypes;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$TrackingInfo;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO;", "equals", "", "other", "hashCode", "", "toString", "Actions", "PinsDisplaySettings", "PinTypes", "PricePinStates", "PointPinStates", "PinLimits", "CardStyle", "MobileSettings", "DelaySettings", "TrackingInfo", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsMapInfoV4DTO {

    @NotNull
    private final Actions actions;

    @NotNull
    private final CardStyle cardStyle;
    private final DelaySettings delaySettings;
    private final DistrictsDTO districts;

    @NotNull
    private final List<Double> locationPoint;

    @NotNull
    private final String mobileSettings;
    private final NotificationDTO outOfBoundsBar;

    @NotNull
    private final PinLimits pinLimits;

    @NotNull
    private final PinTypes pinTypes;

    @NotNull
    private final PinsDisplaySettings pinsDisplaySettings;
    private final String regionHash;
    private final TrackingInfo tracking;
    private final BoundingBoxV2 visibleRegion;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;", "", "initialFetchResponse", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;", "fetchPinsAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "fetchCardsAction", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getInitialFetchResponse", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;", "getFetchPinsAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getFetchCardsAction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Actions {

        @NotNull
        private final AtomActionDTO fetchCardsAction;

        @NotNull
        private final AtomActionDTO fetchPinsAction;

        @NotNull
        private final FetchPinsActionResponse initialFetchResponse;

        public Actions(@NotNull FetchPinsActionResponse initialFetchResponse, @NotNull AtomActionDTO fetchPinsAction, @NotNull AtomActionDTO fetchCardsAction) {
            Intrinsics.checkNotNullParameter(initialFetchResponse, "initialFetchResponse");
            Intrinsics.checkNotNullParameter(fetchPinsAction, "fetchPinsAction");
            Intrinsics.checkNotNullParameter(fetchCardsAction, "fetchCardsAction");
            this.initialFetchResponse = initialFetchResponse;
            this.fetchPinsAction = fetchPinsAction;
            this.fetchCardsAction = fetchCardsAction;
        }

        public static /* synthetic */ Actions copy$default(Actions actions, FetchPinsActionResponse fetchPinsActionResponse, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                fetchPinsActionResponse = actions.initialFetchResponse;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = actions.fetchPinsAction;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO2 = actions.fetchCardsAction;
            }
            return actions.copy(fetchPinsActionResponse, atomActionDTO, atomActionDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final FetchPinsActionResponse getInitialFetchResponse() {
            return this.initialFetchResponse;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getFetchPinsAction() {
            return this.fetchPinsAction;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getFetchCardsAction() {
            return this.fetchCardsAction;
        }

        @NotNull
        public final Actions copy(@NotNull FetchPinsActionResponse initialFetchResponse, @NotNull AtomActionDTO fetchPinsAction, @NotNull AtomActionDTO fetchCardsAction) {
            Intrinsics.checkNotNullParameter(initialFetchResponse, "initialFetchResponse");
            Intrinsics.checkNotNullParameter(fetchPinsAction, "fetchPinsAction");
            Intrinsics.checkNotNullParameter(fetchCardsAction, "fetchCardsAction");
            return new Actions(initialFetchResponse, fetchPinsAction, fetchCardsAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) other;
            return Intrinsics.d(this.initialFetchResponse, actions.initialFetchResponse) && Intrinsics.d(this.fetchPinsAction, actions.fetchPinsAction) && Intrinsics.d(this.fetchCardsAction, actions.fetchCardsAction);
        }

        @NotNull
        public final AtomActionDTO getFetchCardsAction() {
            return this.fetchCardsAction;
        }

        @NotNull
        public final AtomActionDTO getFetchPinsAction() {
            return this.fetchPinsAction;
        }

        @NotNull
        public final FetchPinsActionResponse getInitialFetchResponse() {
            return this.initialFetchResponse;
        }

        public int hashCode() {
            return this.fetchCardsAction.hashCode() + a.b(this.fetchPinsAction, this.initialFetchResponse.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            FetchPinsActionResponse fetchPinsActionResponse = this.initialFetchResponse;
            AtomActionDTO atomActionDTO = this.fetchPinsAction;
            AtomActionDTO atomActionDTO2 = this.fetchCardsAction;
            StringBuilder sb2 = new StringBuilder("Actions(initialFetchResponse=");
            sb2.append(fetchPinsActionResponse);
            sb2.append(", fetchPinsAction=");
            sb2.append(atomActionDTO);
            sb2.append(", fetchCardsAction=");
            return G.c(sb2, atomActionDTO2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;", "", "showLoaderDelay", "", "showCardSkeletonDelay", "<init>", "(JJ)V", "getShowLoaderDelay", "()J", "getShowCardSkeletonDelay", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DelaySettings {
        private final long showCardSkeletonDelay;
        private final long showLoaderDelay;

        public DelaySettings(long j11, long j12) {
            this.showLoaderDelay = j11;
            this.showCardSkeletonDelay = j12;
        }

        public static /* synthetic */ DelaySettings copy$default(DelaySettings delaySettings, long j11, long j12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = delaySettings.showLoaderDelay;
            }
            if ((i11 & 2) != 0) {
                j12 = delaySettings.showCardSkeletonDelay;
            }
            return delaySettings.copy(j11, j12);
        }

        /* renamed from: component1, reason: from getter */
        public final long getShowLoaderDelay() {
            return this.showLoaderDelay;
        }

        /* renamed from: component2, reason: from getter */
        public final long getShowCardSkeletonDelay() {
            return this.showCardSkeletonDelay;
        }

        @NotNull
        public final DelaySettings copy(long showLoaderDelay, long showCardSkeletonDelay) {
            return new DelaySettings(showLoaderDelay, showCardSkeletonDelay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DelaySettings)) {
                return false;
            }
            DelaySettings delaySettings = (DelaySettings) other;
            return this.showLoaderDelay == delaySettings.showLoaderDelay && this.showCardSkeletonDelay == delaySettings.showCardSkeletonDelay;
        }

        public final long getShowCardSkeletonDelay() {
            return this.showCardSkeletonDelay;
        }

        public final long getShowLoaderDelay() {
            return this.showLoaderDelay;
        }

        public int hashCode() {
            return Long.hashCode(this.showCardSkeletonDelay) + (Long.hashCode(this.showLoaderDelay) * 31);
        }

        @NotNull
        public String toString() {
            return f.a(this.showCardSkeletonDelay, ")", C2702w.d(this.showLoaderDelay, "DelaySettings(showLoaderDelay=", ", showCardSkeletonDelay="));
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$MobileSettings;", "", "searchUpdateLink", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getSearchUpdateLink", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class MobileSettings {

        @NotNull
        private final String searchUpdateLink;

        private /* synthetic */ MobileSettings(String str) {
            this.searchUpdateLink = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ MobileSettings m1324boximpl(String str) {
            return new MobileSettings(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m1325constructorimpl(@NotNull String searchUpdateLink) {
            Intrinsics.checkNotNullParameter(searchUpdateLink, "searchUpdateLink");
            return searchUpdateLink;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1326equalsimpl(String str, Object obj) {
            return (obj instanceof MobileSettings) && Intrinsics.d(str, ((MobileSettings) obj).m1330unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1327equalsimpl0(String str, String str2) {
            return Intrinsics.d(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1328hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1329toStringimpl(String str) {
            return A0.b("MobileSettings(searchUpdateLink=", str, ")");
        }

        public boolean equals(Object obj) {
            return m1326equalsimpl(this.searchUpdateLink, obj);
        }

        @NotNull
        public final String getSearchUpdateLink() {
            return this.searchUpdateLink;
        }

        public int hashCode() {
            return m1328hashCodeimpl(this.searchUpdateLink);
        }

        public String toString() {
            return m1329toStringimpl(this.searchUpdateLink);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m1330unboximpl() {
            return this.searchUpdateLink;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;", "", "cachedPinIdsLimit", "", "pinsInClientLimit", "<init>", "(II)V", "getCachedPinIdsLimit", "()I", "getPinsInClientLimit", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinLimits {
        private final int cachedPinIdsLimit;
        private final int pinsInClientLimit;

        public PinLimits(int i11, int i12) {
            this.cachedPinIdsLimit = i11;
            this.pinsInClientLimit = i12;
        }

        public static /* synthetic */ PinLimits copy$default(PinLimits pinLimits, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = pinLimits.cachedPinIdsLimit;
            }
            if ((i13 & 2) != 0) {
                i12 = pinLimits.pinsInClientLimit;
            }
            return pinLimits.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCachedPinIdsLimit() {
            return this.cachedPinIdsLimit;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPinsInClientLimit() {
            return this.pinsInClientLimit;
        }

        @NotNull
        public final PinLimits copy(int cachedPinIdsLimit, int pinsInClientLimit) {
            return new PinLimits(cachedPinIdsLimit, pinsInClientLimit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinLimits)) {
                return false;
            }
            PinLimits pinLimits = (PinLimits) other;
            return this.cachedPinIdsLimit == pinLimits.cachedPinIdsLimit && this.pinsInClientLimit == pinLimits.pinsInClientLimit;
        }

        public final int getCachedPinIdsLimit() {
            return this.cachedPinIdsLimit;
        }

        public final int getPinsInClientLimit() {
            return this.pinsInClientLimit;
        }

        public int hashCode() {
            return Integer.hashCode(this.pinsInClientLimit) + (Integer.hashCode(this.cachedPinIdsLimit) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("PinLimits(cachedPinIdsLimit=", this.cachedPinIdsLimit, ", pinsInClientLimit=", ")", this.pinsInClientLimit);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinTypes;", "", "highRanked", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates;", "lowRanked", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates;)V", "getHighRanked", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates;", "getLowRanked", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinTypes {

        @NotNull
        private final PricePinStates highRanked;

        @NotNull
        private final PointPinStates lowRanked;

        public PinTypes(@NotNull PricePinStates highRanked, @NotNull PointPinStates lowRanked) {
            Intrinsics.checkNotNullParameter(highRanked, "highRanked");
            Intrinsics.checkNotNullParameter(lowRanked, "lowRanked");
            this.highRanked = highRanked;
            this.lowRanked = lowRanked;
        }

        public static /* synthetic */ PinTypes copy$default(PinTypes pinTypes, PricePinStates pricePinStates, PointPinStates pointPinStates, int i11, Object obj) {
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
        public final PointPinStates getLowRanked() {
            return this.lowRanked;
        }

        @NotNull
        public final PinTypes copy(@NotNull PricePinStates highRanked, @NotNull PointPinStates lowRanked) {
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
        public final PointPinStates getLowRanked() {
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
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010JP\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "", "latitudeCellPxSize", "", "longitudeCellPxSize", "lowRankedPercentPerCell", "lowRankedPerCellMin", "lowRankedPerCellMax", "showHighRankedZoom", "<init>", "(IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLatitudeCellPxSize", "()I", "getLongitudeCellPxSize", "getLowRankedPercentPerCell", "getLowRankedPerCellMin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLowRankedPerCellMax", "getShowHighRankedZoom", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "equals", "", "other", "hashCode", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinsDisplaySettings {
        private final int latitudeCellPxSize;
        private final int longitudeCellPxSize;
        private final Integer lowRankedPerCellMax;
        private final Integer lowRankedPerCellMin;
        private final int lowRankedPercentPerCell;
        private final Integer showHighRankedZoom;

        public PinsDisplaySettings(int i11, int i12, int i13, Integer num, Integer num2, Integer num3) {
            this.latitudeCellPxSize = i11;
            this.longitudeCellPxSize = i12;
            this.lowRankedPercentPerCell = i13;
            this.lowRankedPerCellMin = num;
            this.lowRankedPerCellMax = num2;
            this.showHighRankedZoom = num3;
        }

        public static /* synthetic */ PinsDisplaySettings copy$default(PinsDisplaySettings pinsDisplaySettings, int i11, int i12, int i13, Integer num, Integer num2, Integer num3, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = pinsDisplaySettings.latitudeCellPxSize;
            }
            if ((i14 & 2) != 0) {
                i12 = pinsDisplaySettings.longitudeCellPxSize;
            }
            if ((i14 & 4) != 0) {
                i13 = pinsDisplaySettings.lowRankedPercentPerCell;
            }
            if ((i14 & 8) != 0) {
                num = pinsDisplaySettings.lowRankedPerCellMin;
            }
            if ((i14 & 16) != 0) {
                num2 = pinsDisplaySettings.lowRankedPerCellMax;
            }
            if ((i14 & 32) != 0) {
                num3 = pinsDisplaySettings.showHighRankedZoom;
            }
            Integer num4 = num2;
            Integer num5 = num3;
            return pinsDisplaySettings.copy(i11, i12, i13, num, num4, num5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLatitudeCellPxSize() {
            return this.latitudeCellPxSize;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLongitudeCellPxSize() {
            return this.longitudeCellPxSize;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLowRankedPercentPerCell() {
            return this.lowRankedPercentPerCell;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getLowRankedPerCellMin() {
            return this.lowRankedPerCellMin;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getLowRankedPerCellMax() {
            return this.lowRankedPerCellMax;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getShowHighRankedZoom() {
            return this.showHighRankedZoom;
        }

        @NotNull
        public final PinsDisplaySettings copy(int latitudeCellPxSize, int longitudeCellPxSize, int lowRankedPercentPerCell, Integer lowRankedPerCellMin, Integer lowRankedPerCellMax, Integer showHighRankedZoom) {
            return new PinsDisplaySettings(latitudeCellPxSize, longitudeCellPxSize, lowRankedPercentPerCell, lowRankedPerCellMin, lowRankedPerCellMax, showHighRankedZoom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinsDisplaySettings)) {
                return false;
            }
            PinsDisplaySettings pinsDisplaySettings = (PinsDisplaySettings) other;
            return this.latitudeCellPxSize == pinsDisplaySettings.latitudeCellPxSize && this.longitudeCellPxSize == pinsDisplaySettings.longitudeCellPxSize && this.lowRankedPercentPerCell == pinsDisplaySettings.lowRankedPercentPerCell && Intrinsics.d(this.lowRankedPerCellMin, pinsDisplaySettings.lowRankedPerCellMin) && Intrinsics.d(this.lowRankedPerCellMax, pinsDisplaySettings.lowRankedPerCellMax) && Intrinsics.d(this.showHighRankedZoom, pinsDisplaySettings.showHighRankedZoom);
        }

        public final int getLatitudeCellPxSize() {
            return this.latitudeCellPxSize;
        }

        public final int getLongitudeCellPxSize() {
            return this.longitudeCellPxSize;
        }

        public final Integer getLowRankedPerCellMax() {
            return this.lowRankedPerCellMax;
        }

        public final Integer getLowRankedPerCellMin() {
            return this.lowRankedPerCellMin;
        }

        public final int getLowRankedPercentPerCell() {
            return this.lowRankedPercentPerCell;
        }

        public final Integer getShowHighRankedZoom() {
            return this.showHighRankedZoom;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.lowRankedPercentPerCell, C2454a.a(this.longitudeCellPxSize, Integer.hashCode(this.latitudeCellPxSize) * 31, 31), 31);
            Integer num = this.lowRankedPerCellMin;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.lowRankedPerCellMax;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.showHighRankedZoom;
            return hashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.latitudeCellPxSize;
            int i12 = this.longitudeCellPxSize;
            int i13 = this.lowRankedPercentPerCell;
            Integer num = this.lowRankedPerCellMin;
            Integer num2 = this.lowRankedPerCellMax;
            Integer num3 = this.showHighRankedZoom;
            StringBuilder a11 = C2438a.a("PinsDisplaySettings(latitudeCellPxSize=", i11, ", longitudeCellPxSize=", ", lowRankedPercentPerCell=", i12);
            a11.append(i13);
            a11.append(", lowRankedPerCellMin=");
            a11.append(num);
            a11.append(", lowRankedPerCellMax=");
            return Z.c(a11, num2, ", showHighRankedZoom=", num3, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates;", "", "default", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates$PinStyles;", "selected", "viewed", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates$PinStyles;)V", "getDefault", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates$PinStyles;", "getSelected", "getViewed", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PinStyles", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PointPinStates {

        @NotNull
        private final PinStyles default;
        private final PinStyles selected;
        private final PinStyles viewed;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates$PinStyles;", "", "edgeSize", "", "backgroundColor", "", "borderWidth", "borderColor", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getEdgeSize", "()I", "getBackgroundColor", "()Ljava/lang/String;", "getBorderWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBorderColor", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates$PinStyles;", "equals", "", "other", "hashCode", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PinStyles {

            @NotNull
            private final String backgroundColor;
            private final String borderColor;
            private final Integer borderWidth;
            private final int edgeSize;

            public PinStyles(int i11, @NotNull String backgroundColor, Integer num, String str) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.edgeSize = i11;
                this.backgroundColor = backgroundColor;
                this.borderWidth = num;
                this.borderColor = str;
            }

            public static /* synthetic */ PinStyles copy$default(PinStyles pinStyles, int i11, String str, Integer num, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = pinStyles.edgeSize;
                }
                if ((i12 & 2) != 0) {
                    str = pinStyles.backgroundColor;
                }
                if ((i12 & 4) != 0) {
                    num = pinStyles.borderWidth;
                }
                if ((i12 & 8) != 0) {
                    str2 = pinStyles.borderColor;
                }
                return pinStyles.copy(i11, str, num, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getEdgeSize() {
                return this.edgeSize;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getBorderWidth() {
                return this.borderWidth;
            }

            /* renamed from: component4, reason: from getter */
            public final String getBorderColor() {
                return this.borderColor;
            }

            @NotNull
            public final PinStyles copy(int edgeSize, @NotNull String backgroundColor, Integer borderWidth, String borderColor) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                return new PinStyles(edgeSize, backgroundColor, borderWidth, borderColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinStyles)) {
                    return false;
                }
                PinStyles pinStyles = (PinStyles) other;
                return this.edgeSize == pinStyles.edgeSize && Intrinsics.d(this.backgroundColor, pinStyles.backgroundColor) && Intrinsics.d(this.borderWidth, pinStyles.borderWidth) && Intrinsics.d(this.borderColor, pinStyles.borderColor);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            public final Integer getBorderWidth() {
                return this.borderWidth;
            }

            public final int getEdgeSize() {
                return this.edgeSize;
            }

            public int hashCode() {
                int a11 = g.a(Integer.hashCode(this.edgeSize) * 31, 31, this.backgroundColor);
                Integer num = this.borderWidth;
                int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.borderColor;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.edgeSize;
                String str = this.backgroundColor;
                Integer num = this.borderWidth;
                String str2 = this.borderColor;
                StringBuilder g10 = e.g(i11, "PinStyles(edgeSize=", ", backgroundColor=", str, ", borderWidth=");
                g10.append(num);
                g10.append(", borderColor=");
                g10.append(str2);
                g10.append(")");
                return g10.toString();
            }
        }

        public PointPinStates(@NotNull PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3) {
            Intrinsics.checkNotNullParameter(pinStyles, "default");
            this.default = pinStyles;
            this.selected = pinStyles2;
            this.viewed = pinStyles3;
        }

        public static /* synthetic */ PointPinStates copy$default(PointPinStates pointPinStates, PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                pinStyles = pointPinStates.default;
            }
            if ((i11 & 2) != 0) {
                pinStyles2 = pointPinStates.selected;
            }
            if ((i11 & 4) != 0) {
                pinStyles3 = pointPinStates.viewed;
            }
            return pointPinStates.copy(pinStyles, pinStyles2, pinStyles3);
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
        public final PointPinStates copy(@NotNull PinStyles r22, PinStyles selected, PinStyles viewed) {
            Intrinsics.checkNotNullParameter(r22, "default");
            return new PointPinStates(r22, selected, viewed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointPinStates)) {
                return false;
            }
            PointPinStates pointPinStates = (PointPinStates) other;
            return Intrinsics.d(this.default, pointPinStates.default) && Intrinsics.d(this.selected, pointPinStates.selected) && Intrinsics.d(this.viewed, pointPinStates.viewed);
        }

        @NotNull
        public final PinStyles getDefault() {
            return this.default;
        }

        public final PinStyles getSelected() {
            return this.selected;
        }

        public final PinStyles getViewed() {
            return this.viewed;
        }

        public int hashCode() {
            int hashCode = this.default.hashCode() * 31;
            PinStyles pinStyles = this.selected;
            int hashCode2 = (hashCode + (pinStyles == null ? 0 : pinStyles.hashCode())) * 31;
            PinStyles pinStyles2 = this.viewed;
            return hashCode2 + (pinStyles2 != null ? pinStyles2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PointPinStates(default=" + this.default + ", selected=" + this.selected + ", viewed=" + this.viewed + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$TrackingInfo;", "", "readyTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "pinCommonTrackingInfo", "loaderTrackingInfo", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getReadyTrackingInfo", "()Ljava/util/Map;", "getPinCommonTrackingInfo", "getLoaderTrackingInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public /* synthetic */ HotelsMapInfoV4DTO(BoundingBoxV2 boundingBoxV2, List list, PinsDisplaySettings pinsDisplaySettings, Actions actions, PinTypes pinTypes, CardStyle cardStyle, DistrictsDTO districtsDTO, NotificationDTO notificationDTO, String str, String str2, PinLimits pinLimits, DelaySettings delaySettings, TrackingInfo trackingInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(boundingBoxV2, list, pinsDisplaySettings, actions, pinTypes, cardStyle, districtsDTO, notificationDTO, str, str2, pinLimits, delaySettings, trackingInfo);
    }

    /* renamed from: copy-eOYQnJM$default, reason: not valid java name */
    public static /* synthetic */ HotelsMapInfoV4DTO m1320copyeOYQnJM$default(HotelsMapInfoV4DTO hotelsMapInfoV4DTO, BoundingBoxV2 boundingBoxV2, List list, PinsDisplaySettings pinsDisplaySettings, Actions actions, PinTypes pinTypes, CardStyle cardStyle, DistrictsDTO districtsDTO, NotificationDTO notificationDTO, String str, String str2, PinLimits pinLimits, DelaySettings delaySettings, TrackingInfo trackingInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            boundingBoxV2 = hotelsMapInfoV4DTO.visibleRegion;
        }
        return hotelsMapInfoV4DTO.m1322copyeOYQnJM(boundingBoxV2, (i11 & 2) != 0 ? hotelsMapInfoV4DTO.locationPoint : list, (i11 & 4) != 0 ? hotelsMapInfoV4DTO.pinsDisplaySettings : pinsDisplaySettings, (i11 & 8) != 0 ? hotelsMapInfoV4DTO.actions : actions, (i11 & 16) != 0 ? hotelsMapInfoV4DTO.pinTypes : pinTypes, (i11 & 32) != 0 ? hotelsMapInfoV4DTO.cardStyle : cardStyle, (i11 & 64) != 0 ? hotelsMapInfoV4DTO.districts : districtsDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hotelsMapInfoV4DTO.outOfBoundsBar : notificationDTO, (i11 & 256) != 0 ? hotelsMapInfoV4DTO.mobileSettings : str, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? hotelsMapInfoV4DTO.regionHash : str2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? hotelsMapInfoV4DTO.pinLimits : pinLimits, (i11 & 2048) != 0 ? hotelsMapInfoV4DTO.delaySettings : delaySettings, (i11 & 4096) != 0 ? hotelsMapInfoV4DTO.tracking : trackingInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final BoundingBoxV2 getVisibleRegion() {
        return this.visibleRegion;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRegionHash() {
        return this.regionHash;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final PinLimits getPinLimits() {
        return this.pinLimits;
    }

    /* renamed from: component12, reason: from getter */
    public final DelaySettings getDelaySettings() {
        return this.delaySettings;
    }

    /* renamed from: component13, reason: from getter */
    public final TrackingInfo getTracking() {
        return this.tracking;
    }

    @NotNull
    public final List<Double> component2() {
        return this.locationPoint;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PinsDisplaySettings getPinsDisplaySettings() {
        return this.pinsDisplaySettings;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Actions getActions() {
        return this.actions;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PinTypes getPinTypes() {
        return this.pinTypes;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CardStyle getCardStyle() {
        return this.cardStyle;
    }

    /* renamed from: component7, reason: from getter */
    public final DistrictsDTO getDistricts() {
        return this.districts;
    }

    /* renamed from: component8, reason: from getter */
    public final NotificationDTO getOutOfBoundsBar() {
        return this.outOfBoundsBar;
    }

    @NotNull
    /* renamed from: component9-ie92oRg, reason: not valid java name and from getter */
    public final String getMobileSettings() {
        return this.mobileSettings;
    }

    @NotNull
    /* renamed from: copy-eOYQnJM, reason: not valid java name */
    public final HotelsMapInfoV4DTO m1322copyeOYQnJM(BoundingBoxV2 visibleRegion, @NotNull List<Double> locationPoint, @NotNull PinsDisplaySettings pinsDisplaySettings, @NotNull Actions actions, @NotNull PinTypes pinTypes, @NotNull CardStyle cardStyle, DistrictsDTO districts, NotificationDTO outOfBoundsBar, @NotNull String mobileSettings, String regionHash, @NotNull PinLimits pinLimits, DelaySettings delaySettings, TrackingInfo tracking) {
        Intrinsics.checkNotNullParameter(locationPoint, "locationPoint");
        Intrinsics.checkNotNullParameter(pinsDisplaySettings, "pinsDisplaySettings");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(pinTypes, "pinTypes");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        Intrinsics.checkNotNullParameter(mobileSettings, "mobileSettings");
        Intrinsics.checkNotNullParameter(pinLimits, "pinLimits");
        return new HotelsMapInfoV4DTO(visibleRegion, locationPoint, pinsDisplaySettings, actions, pinTypes, cardStyle, districts, outOfBoundsBar, mobileSettings, regionHash, pinLimits, delaySettings, tracking, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsMapInfoV4DTO)) {
            return false;
        }
        HotelsMapInfoV4DTO hotelsMapInfoV4DTO = (HotelsMapInfoV4DTO) other;
        return Intrinsics.d(this.visibleRegion, hotelsMapInfoV4DTO.visibleRegion) && Intrinsics.d(this.locationPoint, hotelsMapInfoV4DTO.locationPoint) && Intrinsics.d(this.pinsDisplaySettings, hotelsMapInfoV4DTO.pinsDisplaySettings) && Intrinsics.d(this.actions, hotelsMapInfoV4DTO.actions) && Intrinsics.d(this.pinTypes, hotelsMapInfoV4DTO.pinTypes) && Intrinsics.d(this.cardStyle, hotelsMapInfoV4DTO.cardStyle) && Intrinsics.d(this.districts, hotelsMapInfoV4DTO.districts) && Intrinsics.d(this.outOfBoundsBar, hotelsMapInfoV4DTO.outOfBoundsBar) && MobileSettings.m1327equalsimpl0(this.mobileSettings, hotelsMapInfoV4DTO.mobileSettings) && Intrinsics.d(this.regionHash, hotelsMapInfoV4DTO.regionHash) && Intrinsics.d(this.pinLimits, hotelsMapInfoV4DTO.pinLimits) && Intrinsics.d(this.delaySettings, hotelsMapInfoV4DTO.delaySettings) && Intrinsics.d(this.tracking, hotelsMapInfoV4DTO.tracking);
    }

    @NotNull
    public final Actions getActions() {
        return this.actions;
    }

    @NotNull
    public final CardStyle getCardStyle() {
        return this.cardStyle;
    }

    public final DelaySettings getDelaySettings() {
        return this.delaySettings;
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
    public final String m1323getMobileSettingsie92oRg() {
        return this.mobileSettings;
    }

    public final NotificationDTO getOutOfBoundsBar() {
        return this.outOfBoundsBar;
    }

    @NotNull
    public final PinLimits getPinLimits() {
        return this.pinLimits;
    }

    @NotNull
    public final PinTypes getPinTypes() {
        return this.pinTypes;
    }

    @NotNull
    public final PinsDisplaySettings getPinsDisplaySettings() {
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
        int hashCode2 = (hashCode + (districtsDTO == null ? 0 : districtsDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.outOfBoundsBar;
        int m1328hashCodeimpl = (MobileSettings.m1328hashCodeimpl(this.mobileSettings) + ((hashCode2 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31)) * 31;
        String str = this.regionHash;
        int hashCode3 = (this.pinLimits.hashCode() + ((m1328hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        DelaySettings delaySettings = this.delaySettings;
        int hashCode4 = (hashCode3 + (delaySettings == null ? 0 : delaySettings.hashCode())) * 31;
        TrackingInfo trackingInfo = this.tracking;
        return hashCode4 + (trackingInfo != null ? trackingInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BoundingBoxV2 boundingBoxV2 = this.visibleRegion;
        List<Double> list = this.locationPoint;
        PinsDisplaySettings pinsDisplaySettings = this.pinsDisplaySettings;
        Actions actions = this.actions;
        PinTypes pinTypes = this.pinTypes;
        CardStyle cardStyle = this.cardStyle;
        DistrictsDTO districtsDTO = this.districts;
        NotificationDTO notificationDTO = this.outOfBoundsBar;
        String m1329toStringimpl = MobileSettings.m1329toStringimpl(this.mobileSettings);
        String str = this.regionHash;
        PinLimits pinLimits = this.pinLimits;
        DelaySettings delaySettings = this.delaySettings;
        TrackingInfo trackingInfo = this.tracking;
        StringBuilder sb2 = new StringBuilder("HotelsMapInfoV4DTO(visibleRegion=");
        sb2.append(boundingBoxV2);
        sb2.append(", locationPoint=");
        sb2.append(list);
        sb2.append(", pinsDisplaySettings=");
        sb2.append(pinsDisplaySettings);
        sb2.append(", actions=");
        sb2.append(actions);
        sb2.append(", pinTypes=");
        sb2.append(pinTypes);
        sb2.append(", cardStyle=");
        sb2.append(cardStyle);
        sb2.append(", districts=");
        sb2.append(districtsDTO);
        sb2.append(", outOfBoundsBar=");
        sb2.append(notificationDTO);
        sb2.append(", mobileSettings=");
        Nh.a.h(sb2, m1329toStringimpl, ", regionHash=", str, ", pinLimits=");
        sb2.append(pinLimits);
        sb2.append(", delaySettings=");
        sb2.append(delaySettings);
        sb2.append(", tracking=");
        sb2.append(trackingInfo);
        sb2.append(")");
        return sb2.toString();
    }

    private HotelsMapInfoV4DTO(BoundingBoxV2 boundingBoxV2, List<Double> locationPoint, PinsDisplaySettings pinsDisplaySettings, Actions actions, PinTypes pinTypes, CardStyle cardStyle, DistrictsDTO districtsDTO, NotificationDTO notificationDTO, String mobileSettings, String str, PinLimits pinLimits, DelaySettings delaySettings, TrackingInfo trackingInfo) {
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
        this.outOfBoundsBar = notificationDTO;
        this.mobileSettings = mobileSettings;
        this.regionHash = str;
        this.pinLimits = pinLimits;
        this.delaySettings = delaySettings;
        this.tracking = trackingInfo;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates;", "", "default", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;", "selected", "viewed", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;)V", "getDefault", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;", "getSelected", "getViewed", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PinStyles", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PricePinStates {

        @NotNull
        private final PinStyles default;
        private final PinStyles selected;
        private final PinStyles viewed;

        public PricePinStates(@NotNull PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3) {
            Intrinsics.checkNotNullParameter(pinStyles, "default");
            this.default = pinStyles;
            this.selected = pinStyles2;
            this.viewed = pinStyles3;
        }

        public static /* synthetic */ PricePinStates copy$default(PricePinStates pricePinStates, PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                pinStyles = pricePinStates.default;
            }
            if ((i11 & 2) != 0) {
                pinStyles2 = pricePinStates.selected;
            }
            if ((i11 & 4) != 0) {
                pinStyles3 = pricePinStates.viewed;
            }
            return pricePinStates.copy(pinStyles, pinStyles2, pinStyles3);
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
        public final PricePinStates copy(@NotNull PinStyles r22, PinStyles selected, PinStyles viewed) {
            Intrinsics.checkNotNullParameter(r22, "default");
            return new PricePinStates(r22, selected, viewed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PricePinStates)) {
                return false;
            }
            PricePinStates pricePinStates = (PricePinStates) other;
            return Intrinsics.d(this.default, pricePinStates.default) && Intrinsics.d(this.selected, pricePinStates.selected) && Intrinsics.d(this.viewed, pricePinStates.viewed);
        }

        @NotNull
        public final PinStyles getDefault() {
            return this.default;
        }

        public final PinStyles getSelected() {
            return this.selected;
        }

        public final PinStyles getViewed() {
            return this.viewed;
        }

        public int hashCode() {
            int hashCode = this.default.hashCode() * 31;
            PinStyles pinStyles = this.selected;
            int hashCode2 = (hashCode + (pinStyles == null ? 0 : pinStyles.hashCode())) * 31;
            PinStyles pinStyles2 = this.viewed;
            return hashCode2 + (pinStyles2 != null ? pinStyles2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PricePinStates(default=" + this.default + ", selected=" + this.selected + ", viewed=" + this.viewed + ")";
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;", "", "backgroundColor", "", "borderColor", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "discountIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "favoriteIcon", "icons", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDiscountIcon$annotations", "()V", "getDiscountIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getFavoriteIcon", "getIcons", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PinStyles {

            @NotNull
            private final String backgroundColor;
            private final String borderColor;
            private final IconDTO discountIcon;

            @NotNull
            private final IconDTO favoriteIcon;

            @NotNull
            private final Map<Integer, IconDTO> icons;

            @NotNull
            private final TextDTO text;

            public PinStyles(@NotNull String backgroundColor, String str, @NotNull TextDTO text, IconDTO iconDTO, @NotNull IconDTO favoriteIcon, @NotNull Map<Integer, IconDTO> icons) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(favoriteIcon, "favoriteIcon");
                Intrinsics.checkNotNullParameter(icons, "icons");
                this.backgroundColor = backgroundColor;
                this.borderColor = str;
                this.text = text;
                this.discountIcon = iconDTO;
                this.favoriteIcon = favoriteIcon;
                this.icons = icons;
            }

            public static /* synthetic */ PinStyles copy$default(PinStyles pinStyles, String str, String str2, TextDTO textDTO, IconDTO iconDTO, IconDTO iconDTO2, Map map, int i11, Object obj) {
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
                    iconDTO = pinStyles.discountIcon;
                }
                if ((i11 & 16) != 0) {
                    iconDTO2 = pinStyles.favoriteIcon;
                }
                if ((i11 & 32) != 0) {
                    map = pinStyles.icons;
                }
                IconDTO iconDTO3 = iconDTO2;
                Map map2 = map;
                return pinStyles.copy(str, str2, textDTO, iconDTO, iconDTO3, map2);
            }

            @InterfaceC3999a
            public static /* synthetic */ void getDiscountIcon$annotations() {
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

            /* renamed from: component4, reason: from getter */
            public final IconDTO getDiscountIcon() {
                return this.discountIcon;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final IconDTO getFavoriteIcon() {
                return this.favoriteIcon;
            }

            @NotNull
            public final Map<Integer, IconDTO> component6() {
                return this.icons;
            }

            @NotNull
            public final PinStyles copy(@NotNull String backgroundColor, String borderColor, @NotNull TextDTO text, IconDTO discountIcon, @NotNull IconDTO favoriteIcon, @NotNull Map<Integer, IconDTO> icons) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(favoriteIcon, "favoriteIcon");
                Intrinsics.checkNotNullParameter(icons, "icons");
                return new PinStyles(backgroundColor, borderColor, text, discountIcon, favoriteIcon, icons);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinStyles)) {
                    return false;
                }
                PinStyles pinStyles = (PinStyles) other;
                return Intrinsics.d(this.backgroundColor, pinStyles.backgroundColor) && Intrinsics.d(this.borderColor, pinStyles.borderColor) && Intrinsics.d(this.text, pinStyles.text) && Intrinsics.d(this.discountIcon, pinStyles.discountIcon) && Intrinsics.d(this.favoriteIcon, pinStyles.favoriteIcon) && Intrinsics.d(this.icons, pinStyles.icons);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            public final IconDTO getDiscountIcon() {
                return this.discountIcon;
            }

            @NotNull
            public final IconDTO getFavoriteIcon() {
                return this.favoriteIcon;
            }

            @NotNull
            public final Map<Integer, IconDTO> getIcons() {
                return this.icons;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.backgroundColor.hashCode() * 31;
                String str = this.borderColor;
                int a11 = b.a(this.text, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                IconDTO iconDTO = this.discountIcon;
                return this.icons.hashCode() + C2971a.a(this.favoriteIcon, (a11 + (iconDTO != null ? iconDTO.hashCode() : 0)) * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                String str2 = this.borderColor;
                TextDTO textDTO = this.text;
                IconDTO iconDTO = this.discountIcon;
                IconDTO iconDTO2 = this.favoriteIcon;
                Map<Integer, IconDTO> map = this.icons;
                StringBuilder d11 = C3660k.d("PinStyles(backgroundColor=", str, ", borderColor=", str2, ", text=");
                F3.G.f(d11, textDTO, ", discountIcon=", iconDTO, ", favoriteIcon=");
                d11.append(iconDTO2);
                d11.append(", icons=");
                d11.append(map);
                d11.append(")");
                return d11.toString();
            }

            public /* synthetic */ PinStyles(String str, String str2, TextDTO textDTO, IconDTO iconDTO, IconDTO iconDTO2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, textDTO, iconDTO, iconDTO2, (i11 & 32) != 0 ? U.c() : map);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00011BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Je\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "ratingBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "reviewsIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "reviews", "priceText", "milesBadge", "soldOutText", "layoutVariant", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;", "awardBadge", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRatingBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getReviewsIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getReviews", "getPriceText", "getMilesBadge", "getSoldOutText", "getLayoutVariant", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;", "getAwardBadge", "()Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CardLayoutVariant", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CardStyle {
        private final AwardBadgeDTO awardBadge;

        @EnumNullFallback
        @NotNull
        private final CardLayoutVariant layoutVariant;

        @NotNull
        private final BadgeDTO milesBadge;

        @NotNull
        private final TextDTO priceText;

        @NotNull
        private final BadgeDTO ratingBadge;

        @NotNull
        private final TextDTO reviews;

        @NotNull
        private final IconDTO reviewsIcon;

        @NotNull
        private final TextDTO soldOutText;

        @NotNull
        private final TextDTO title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;", "", "<init>", "(Ljava/lang/String;I)V", "V1", "V2", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CardLayoutVariant {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ CardLayoutVariant[] $VALUES;

            /* renamed from: V1, reason: collision with root package name */
            @i(name = "V1")
            public static final CardLayoutVariant f94092V1 = new CardLayoutVariant("V1", 0);

            /* renamed from: V2, reason: collision with root package name */
            @i(name = "V2")
            public static final CardLayoutVariant f94093V2 = new CardLayoutVariant("V2", 1);

            private static final /* synthetic */ CardLayoutVariant[] $values() {
                return new CardLayoutVariant[]{f94092V1, f94093V2};
            }

            static {
                CardLayoutVariant[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private CardLayoutVariant(String str, int i11) {
            }

            public static CardLayoutVariant valueOf(String str) {
                return (CardLayoutVariant) Enum.valueOf(CardLayoutVariant.class, str);
            }

            public static CardLayoutVariant[] values() {
                return (CardLayoutVariant[]) $VALUES.clone();
            }
        }

        public CardStyle(@NotNull TextDTO title, @NotNull BadgeDTO ratingBadge, @NotNull IconDTO reviewsIcon, @NotNull TextDTO reviews, @NotNull TextDTO priceText, @NotNull BadgeDTO milesBadge, @NotNull TextDTO soldOutText, @NotNull CardLayoutVariant layoutVariant, AwardBadgeDTO awardBadgeDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ratingBadge, "ratingBadge");
            Intrinsics.checkNotNullParameter(reviewsIcon, "reviewsIcon");
            Intrinsics.checkNotNullParameter(reviews, "reviews");
            Intrinsics.checkNotNullParameter(priceText, "priceText");
            Intrinsics.checkNotNullParameter(milesBadge, "milesBadge");
            Intrinsics.checkNotNullParameter(soldOutText, "soldOutText");
            Intrinsics.checkNotNullParameter(layoutVariant, "layoutVariant");
            this.title = title;
            this.ratingBadge = ratingBadge;
            this.reviewsIcon = reviewsIcon;
            this.reviews = reviews;
            this.priceText = priceText;
            this.milesBadge = milesBadge;
            this.soldOutText = soldOutText;
            this.layoutVariant = layoutVariant;
            this.awardBadge = awardBadgeDTO;
        }

        public static /* synthetic */ CardStyle copy$default(CardStyle cardStyle, TextDTO textDTO, BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO2, TextDTO textDTO3, BadgeDTO badgeDTO2, TextDTO textDTO4, CardLayoutVariant cardLayoutVariant, AwardBadgeDTO awardBadgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = cardStyle.title;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = cardStyle.ratingBadge;
            }
            if ((i11 & 4) != 0) {
                iconDTO = cardStyle.reviewsIcon;
            }
            if ((i11 & 8) != 0) {
                textDTO2 = cardStyle.reviews;
            }
            if ((i11 & 16) != 0) {
                textDTO3 = cardStyle.priceText;
            }
            if ((i11 & 32) != 0) {
                badgeDTO2 = cardStyle.milesBadge;
            }
            if ((i11 & 64) != 0) {
                textDTO4 = cardStyle.soldOutText;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                cardLayoutVariant = cardStyle.layoutVariant;
            }
            if ((i11 & 256) != 0) {
                awardBadgeDTO = cardStyle.awardBadge;
            }
            CardLayoutVariant cardLayoutVariant2 = cardLayoutVariant;
            AwardBadgeDTO awardBadgeDTO2 = awardBadgeDTO;
            BadgeDTO badgeDTO3 = badgeDTO2;
            TextDTO textDTO5 = textDTO4;
            TextDTO textDTO6 = textDTO3;
            IconDTO iconDTO2 = iconDTO;
            return cardStyle.copy(textDTO, badgeDTO, iconDTO2, textDTO2, textDTO6, badgeDTO3, textDTO5, cardLayoutVariant2, awardBadgeDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final BadgeDTO getRatingBadge() {
            return this.ratingBadge;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconDTO getReviewsIcon() {
            return this.reviewsIcon;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getReviews() {
            return this.reviews;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getPriceText() {
            return this.priceText;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final TextDTO getSoldOutText() {
            return this.soldOutText;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final CardLayoutVariant getLayoutVariant() {
            return this.layoutVariant;
        }

        /* renamed from: component9, reason: from getter */
        public final AwardBadgeDTO getAwardBadge() {
            return this.awardBadge;
        }

        @NotNull
        public final CardStyle copy(@NotNull TextDTO title, @NotNull BadgeDTO ratingBadge, @NotNull IconDTO reviewsIcon, @NotNull TextDTO reviews, @NotNull TextDTO priceText, @NotNull BadgeDTO milesBadge, @NotNull TextDTO soldOutText, @NotNull CardLayoutVariant layoutVariant, AwardBadgeDTO awardBadge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ratingBadge, "ratingBadge");
            Intrinsics.checkNotNullParameter(reviewsIcon, "reviewsIcon");
            Intrinsics.checkNotNullParameter(reviews, "reviews");
            Intrinsics.checkNotNullParameter(priceText, "priceText");
            Intrinsics.checkNotNullParameter(milesBadge, "milesBadge");
            Intrinsics.checkNotNullParameter(soldOutText, "soldOutText");
            Intrinsics.checkNotNullParameter(layoutVariant, "layoutVariant");
            return new CardStyle(title, ratingBadge, reviewsIcon, reviews, priceText, milesBadge, soldOutText, layoutVariant, awardBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardStyle)) {
                return false;
            }
            CardStyle cardStyle = (CardStyle) other;
            return Intrinsics.d(this.title, cardStyle.title) && Intrinsics.d(this.ratingBadge, cardStyle.ratingBadge) && Intrinsics.d(this.reviewsIcon, cardStyle.reviewsIcon) && Intrinsics.d(this.reviews, cardStyle.reviews) && Intrinsics.d(this.priceText, cardStyle.priceText) && Intrinsics.d(this.milesBadge, cardStyle.milesBadge) && Intrinsics.d(this.soldOutText, cardStyle.soldOutText) && this.layoutVariant == cardStyle.layoutVariant && Intrinsics.d(this.awardBadge, cardStyle.awardBadge);
        }

        public final AwardBadgeDTO getAwardBadge() {
            return this.awardBadge;
        }

        @NotNull
        public final CardLayoutVariant getLayoutVariant() {
            return this.layoutVariant;
        }

        @NotNull
        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        @NotNull
        public final TextDTO getPriceText() {
            return this.priceText;
        }

        @NotNull
        public final BadgeDTO getRatingBadge() {
            return this.ratingBadge;
        }

        @NotNull
        public final TextDTO getReviews() {
            return this.reviews;
        }

        @NotNull
        public final IconDTO getReviewsIcon() {
            return this.reviewsIcon;
        }

        @NotNull
        public final TextDTO getSoldOutText() {
            return this.soldOutText;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = (this.layoutVariant.hashCode() + b.a(this.soldOutText, C3124a.c(this.milesBadge, b.a(this.priceText, b.a(this.reviews, C2971a.a(this.reviewsIcon, C3124a.c(this.ratingBadge, this.title.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31;
            AwardBadgeDTO awardBadgeDTO = this.awardBadge;
            return hashCode + (awardBadgeDTO == null ? 0 : awardBadgeDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "CardStyle(title=" + this.title + ", ratingBadge=" + this.ratingBadge + ", reviewsIcon=" + this.reviewsIcon + ", reviews=" + this.reviews + ", priceText=" + this.priceText + ", milesBadge=" + this.milesBadge + ", soldOutText=" + this.soldOutText + ", layoutVariant=" + this.layoutVariant + ", awardBadge=" + this.awardBadge + ")";
        }

        public /* synthetic */ CardStyle(TextDTO textDTO, BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO2, TextDTO textDTO3, BadgeDTO badgeDTO2, TextDTO textDTO4, CardLayoutVariant cardLayoutVariant, AwardBadgeDTO awardBadgeDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, badgeDTO, iconDTO, textDTO2, textDTO3, badgeDTO2, textDTO4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? CardLayoutVariant.f94092V1 : cardLayoutVariant, awardBadgeDTO);
        }
    }

    public HotelsMapInfoV4DTO(BoundingBoxV2 boundingBoxV2, List list, PinsDisplaySettings pinsDisplaySettings, Actions actions, PinTypes pinTypes, CardStyle cardStyle, DistrictsDTO districtsDTO, NotificationDTO notificationDTO, String str, String str2, PinLimits pinLimits, DelaySettings delaySettings, TrackingInfo trackingInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(boundingBoxV2, (i11 & 2) != 0 ? K.f71697a : list, pinsDisplaySettings, actions, pinTypes, cardStyle, districtsDTO, notificationDTO, str, str2, pinLimits, delaySettings, trackingInfo, null);
    }
}
