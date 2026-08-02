package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data;

import B90.C2619v;
import Cm.e;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Pk0.g;
import T7.P;
import Xc.b;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u0001:\u000289B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jª\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u000bHÖ\u0001J\t\u00107\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;", "", "courierPin", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;", "destinationPin", "darkStorePin", "orderStatus", "", "isReceived", "", "defaultSheetHeightRatio", "", "locationTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "defaultSheetTrackingInfo", "expandedSheetTrackingInfo", "webSocketURL", "courierPinModification", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification;", "<init>", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;Ljava/lang/String;ZLjava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification;)V", "getCourierPin", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;", "getDestinationPin", "getDarkStorePin", "getOrderStatus", "()Ljava/lang/String;", "()Z", "getDefaultSheetHeightRatio", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLocationTrackingInfo", "()Ljava/util/Map;", "getDefaultSheetTrackingInfo", "getExpandedSheetTrackingInfo", "getWebSocketURL", "getCourierPinModification", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;Ljava/lang/String;ZLjava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;", "equals", "other", "hashCode", "toString", "Pin", "CourierPinModification", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GeotrackingMapV2DTO {

    @NotNull
    private final Pin courierPin;
    private final CourierPinModification courierPinModification;

    @NotNull
    private final Pin darkStorePin;
    private final Integer defaultSheetHeightRatio;
    private final Map<String, TokenizedTrackingInfo> defaultSheetTrackingInfo;

    @NotNull
    private final Pin destinationPin;
    private final Map<String, TokenizedTrackingInfo> expandedSheetTrackingInfo;
    private final boolean isReceived;
    private final Map<String, TokenizedTrackingInfo> locationTrackingInfo;

    @NotNull
    private final String orderStatus;

    @NotNull
    private final String webSocketURL;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification;", "", "modifications", "", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification$Modification;", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/TooltipDTO;)V", "getModifications", "()Ljava/util/List;", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Modification", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CourierPinModification {

        @NotNull
        private final List<Modification> modifications;

        @NotNull
        private final TooltipDTO tooltip;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JO\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification$Modification;", "", "type", "", "animatedIconUrl", "tooltipTitle", "tooltipSubtitle", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getAnimatedIconUrl", "getTooltipTitle", "getTooltipSubtitle", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Modification {
            private final String animatedIconUrl;
            private final String tooltipSubtitle;
            private final String tooltipTitle;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final String type;

            public Modification(@NotNull String type, String str, String str2, String str3, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.animatedIconUrl = str;
                this.tooltipTitle = str2;
                this.tooltipSubtitle = str3;
                this.trackingInfo = map;
            }

            public static /* synthetic */ Modification copy$default(Modification modification, String str, String str2, String str3, String str4, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = modification.type;
                }
                if ((i11 & 2) != 0) {
                    str2 = modification.animatedIconUrl;
                }
                if ((i11 & 4) != 0) {
                    str3 = modification.tooltipTitle;
                }
                if ((i11 & 8) != 0) {
                    str4 = modification.tooltipSubtitle;
                }
                if ((i11 & 16) != 0) {
                    map = modification.trackingInfo;
                }
                Map map2 = map;
                String str5 = str3;
                return modification.copy(str, str2, str5, str4, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAnimatedIconUrl() {
                return this.animatedIconUrl;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTooltipTitle() {
                return this.tooltipTitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTooltipSubtitle() {
                return this.tooltipSubtitle;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            @NotNull
            public final Modification copy(@NotNull String type, String animatedIconUrl, String tooltipTitle, String tooltipSubtitle, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new Modification(type, animatedIconUrl, tooltipTitle, tooltipSubtitle, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Modification)) {
                    return false;
                }
                Modification modification = (Modification) other;
                return Intrinsics.d(this.type, modification.type) && Intrinsics.d(this.animatedIconUrl, modification.animatedIconUrl) && Intrinsics.d(this.tooltipTitle, modification.tooltipTitle) && Intrinsics.d(this.tooltipSubtitle, modification.tooltipSubtitle) && Intrinsics.d(this.trackingInfo, modification.trackingInfo);
            }

            public final String getAnimatedIconUrl() {
                return this.animatedIconUrl;
            }

            public final String getTooltipSubtitle() {
                return this.tooltipSubtitle;
            }

            public final String getTooltipTitle() {
                return this.tooltipTitle;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                String str = this.animatedIconUrl;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.tooltipTitle;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.tooltipSubtitle;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode4 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.type;
                String str2 = this.animatedIconUrl;
                String str3 = this.tooltipTitle;
                String str4 = this.tooltipSubtitle;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("Modification(type=", str, ", animatedIconUrl=", str2, ", tooltipTitle=");
                a.h(d11, str3, ", tooltipSubtitle=", str4, ", trackingInfo=");
                return P.f(d11, map, ")");
            }
        }

        public CourierPinModification(@NotNull List<Modification> modifications, @NotNull TooltipDTO tooltip) {
            Intrinsics.checkNotNullParameter(modifications, "modifications");
            Intrinsics.checkNotNullParameter(tooltip, "tooltip");
            this.modifications = modifications;
            this.tooltip = tooltip;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CourierPinModification copy$default(CourierPinModification courierPinModification, List list, TooltipDTO tooltipDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = courierPinModification.modifications;
            }
            if ((i11 & 2) != 0) {
                tooltipDTO = courierPinModification.tooltip;
            }
            return courierPinModification.copy(list, tooltipDTO);
        }

        @NotNull
        public final List<Modification> component1() {
            return this.modifications;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TooltipDTO getTooltip() {
            return this.tooltip;
        }

        @NotNull
        public final CourierPinModification copy(@NotNull List<Modification> modifications, @NotNull TooltipDTO tooltip) {
            Intrinsics.checkNotNullParameter(modifications, "modifications");
            Intrinsics.checkNotNullParameter(tooltip, "tooltip");
            return new CourierPinModification(modifications, tooltip);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CourierPinModification)) {
                return false;
            }
            CourierPinModification courierPinModification = (CourierPinModification) other;
            return Intrinsics.d(this.modifications, courierPinModification.modifications) && Intrinsics.d(this.tooltip, courierPinModification.tooltip);
        }

        @NotNull
        public final List<Modification> getModifications() {
            return this.modifications;
        }

        @NotNull
        public final TooltipDTO getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            return this.tooltip.hashCode() + (this.modifications.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CourierPinModification(modifications=" + this.modifications + ", tooltip=" + this.tooltip + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;", "", "coordinates", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Coordinates;", "icon", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon;", "direction", "", "<init>", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Coordinates;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon;Ljava/lang/Double;)V", "getCoordinates", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Coordinates;", "getIcon", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon;", "getDirection", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Coordinates;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon;Ljava/lang/Double;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;", "equals", "", "other", "hashCode", "", "toString", "", "Coordinates", "Icon", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Pin {
        private final Coordinates coordinates;
        private final Double direction;

        @NotNull
        private final Icon icon;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Coordinates;", "", "longitude", "", "latitude", "<init>", "(DD)V", "getLongitude", "()D", "getLatitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Coordinates {
            private final double latitude;
            private final double longitude;

            public Coordinates(double d11, double d12) {
                this.longitude = d11;
                this.latitude = d12;
            }

            public static /* synthetic */ Coordinates copy$default(Coordinates coordinates, double d11, double d12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    d11 = coordinates.longitude;
                }
                if ((i11 & 2) != 0) {
                    d12 = coordinates.latitude;
                }
                return coordinates.copy(d11, d12);
            }

            /* renamed from: component1, reason: from getter */
            public final double getLongitude() {
                return this.longitude;
            }

            /* renamed from: component2, reason: from getter */
            public final double getLatitude() {
                return this.latitude;
            }

            @NotNull
            public final Coordinates copy(double longitude, double latitude) {
                return new Coordinates(longitude, latitude);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Coordinates)) {
                    return false;
                }
                Coordinates coordinates = (Coordinates) other;
                return Double.compare(this.longitude, coordinates.longitude) == 0 && Double.compare(this.latitude, coordinates.latitude) == 0;
            }

            public final double getLatitude() {
                return this.latitude;
            }

            public final double getLongitude() {
                return this.longitude;
            }

            public int hashCode() {
                return Double.hashCode(this.latitude) + (Double.hashCode(this.longitude) * 31);
            }

            @NotNull
            public String toString() {
                double d11 = this.longitude;
                return C2619v.c(e.e(d11, "Coordinates(longitude=", ", latitude="), this.latitude, ")");
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon;", "", ImagesContract.URL, "", "animatedIconUrl", "options", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon$Options;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon$Options;)V", "getUrl", "()Ljava/lang/String;", "getAnimatedIconUrl", "getOptions", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon$Options;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Options", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Icon {
            private final String animatedIconUrl;

            @NotNull
            private final Options options;

            @NotNull
            private final String url;

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon$Options;", "", "width", "", "height", "gravity", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon$Options$Gravity;", "<init>", "(DDLru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon$Options$Gravity;)V", "getWidth", "()D", "getHeight", "getGravity", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon$Options$Gravity;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Gravity", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class Options {

                @NotNull
                private final Gravity gravity;
                private final double height;
                private final double width;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon$Options$Gravity;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "BOTTOM", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Gravity {
                    private static final /* synthetic */ Xc.a $ENTRIES;
                    private static final /* synthetic */ Gravity[] $VALUES;

                    @i(name = "CENTER")
                    public static final Gravity CENTER = new Gravity("CENTER", 0);

                    @i(name = "BOTTOM")
                    public static final Gravity BOTTOM = new Gravity("BOTTOM", 1);

                    private static final /* synthetic */ Gravity[] $values() {
                        return new Gravity[]{CENTER, BOTTOM};
                    }

                    static {
                        Gravity[] $values = $values();
                        $VALUES = $values;
                        $ENTRIES = b.a($values);
                    }

                    private Gravity(String str, int i11) {
                    }

                    public static Gravity valueOf(String str) {
                        return (Gravity) Enum.valueOf(Gravity.class, str);
                    }

                    public static Gravity[] values() {
                        return (Gravity[]) $VALUES.clone();
                    }
                }

                public Options(double d11, double d12, @NotNull Gravity gravity) {
                    Intrinsics.checkNotNullParameter(gravity, "gravity");
                    this.width = d11;
                    this.height = d12;
                    this.gravity = gravity;
                }

                public static /* synthetic */ Options copy$default(Options options, double d11, double d12, Gravity gravity, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        d11 = options.width;
                    }
                    double d13 = d11;
                    if ((i11 & 2) != 0) {
                        d12 = options.height;
                    }
                    double d14 = d12;
                    if ((i11 & 4) != 0) {
                        gravity = options.gravity;
                    }
                    return options.copy(d13, d14, gravity);
                }

                /* renamed from: component1, reason: from getter */
                public final double getWidth() {
                    return this.width;
                }

                /* renamed from: component2, reason: from getter */
                public final double getHeight() {
                    return this.height;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final Gravity getGravity() {
                    return this.gravity;
                }

                @NotNull
                public final Options copy(double width, double height, @NotNull Gravity gravity) {
                    Intrinsics.checkNotNullParameter(gravity, "gravity");
                    return new Options(width, height, gravity);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Options)) {
                        return false;
                    }
                    Options options = (Options) other;
                    return Double.compare(this.width, options.width) == 0 && Double.compare(this.height, options.height) == 0 && this.gravity == options.gravity;
                }

                @NotNull
                public final Gravity getGravity() {
                    return this.gravity;
                }

                public final double getHeight() {
                    return this.height;
                }

                public final double getWidth() {
                    return this.width;
                }

                public int hashCode() {
                    return this.gravity.hashCode() + g.a(Double.hashCode(this.width) * 31, 31, this.height);
                }

                @NotNull
                public String toString() {
                    double d11 = this.width;
                    double d12 = this.height;
                    Gravity gravity = this.gravity;
                    StringBuilder e11 = e.e(d11, "Options(width=", ", height=");
                    e11.append(d12);
                    e11.append(", gravity=");
                    e11.append(gravity);
                    e11.append(")");
                    return e11.toString();
                }
            }

            public Icon(@NotNull String url, String str, @NotNull Options options) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(options, "options");
                this.url = url;
                this.animatedIconUrl = str;
                this.options = options;
            }

            public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, Options options, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = icon.url;
                }
                if ((i11 & 2) != 0) {
                    str2 = icon.animatedIconUrl;
                }
                if ((i11 & 4) != 0) {
                    options = icon.options;
                }
                return icon.copy(str, str2, options);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAnimatedIconUrl() {
                return this.animatedIconUrl;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Options getOptions() {
                return this.options;
            }

            @NotNull
            public final Icon copy(@NotNull String url, String animatedIconUrl, @NotNull Options options) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(options, "options");
                return new Icon(url, animatedIconUrl, options);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return Intrinsics.d(this.url, icon.url) && Intrinsics.d(this.animatedIconUrl, icon.animatedIconUrl) && Intrinsics.d(this.options, icon.options);
            }

            public final String getAnimatedIconUrl() {
                return this.animatedIconUrl;
            }

            @NotNull
            public final Options getOptions() {
                return this.options;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                String str = this.animatedIconUrl;
                return this.options.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                String str = this.url;
                String str2 = this.animatedIconUrl;
                Options options = this.options;
                StringBuilder d11 = C3660k.d("Icon(url=", str, ", animatedIconUrl=", str2, ", options=");
                d11.append(options);
                d11.append(")");
                return d11.toString();
            }
        }

        public Pin(Coordinates coordinates, @NotNull Icon icon, Double d11) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.coordinates = coordinates;
            this.icon = icon;
            this.direction = d11;
        }

        public static /* synthetic */ Pin copy$default(Pin pin, Coordinates coordinates, Icon icon, Double d11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                coordinates = pin.coordinates;
            }
            if ((i11 & 2) != 0) {
                icon = pin.icon;
            }
            if ((i11 & 4) != 0) {
                d11 = pin.direction;
            }
            return pin.copy(coordinates, icon, d11);
        }

        /* renamed from: component1, reason: from getter */
        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final Double getDirection() {
            return this.direction;
        }

        @NotNull
        public final Pin copy(Coordinates coordinates, @NotNull Icon icon, Double direction) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Pin(coordinates, icon, direction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.d(this.coordinates, pin.coordinates) && Intrinsics.d(this.icon, pin.icon) && Intrinsics.d(this.direction, pin.direction);
        }

        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        public final Double getDirection() {
            return this.direction;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public int hashCode() {
            Coordinates coordinates = this.coordinates;
            int hashCode = (this.icon.hashCode() + ((coordinates == null ? 0 : coordinates.hashCode()) * 31)) * 31;
            Double d11 = this.direction;
            return hashCode + (d11 != null ? d11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Pin(coordinates=" + this.coordinates + ", icon=" + this.icon + ", direction=" + this.direction + ")";
        }
    }

    public GeotrackingMapV2DTO(@NotNull Pin courierPin, @NotNull Pin destinationPin, @NotNull Pin darkStorePin, @NotNull String orderStatus, boolean z11, Integer num, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, @NotNull String webSocketURL, CourierPinModification courierPinModification) {
        Intrinsics.checkNotNullParameter(courierPin, "courierPin");
        Intrinsics.checkNotNullParameter(destinationPin, "destinationPin");
        Intrinsics.checkNotNullParameter(darkStorePin, "darkStorePin");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(webSocketURL, "webSocketURL");
        this.courierPin = courierPin;
        this.destinationPin = destinationPin;
        this.darkStorePin = darkStorePin;
        this.orderStatus = orderStatus;
        this.isReceived = z11;
        this.defaultSheetHeightRatio = num;
        this.locationTrackingInfo = map;
        this.defaultSheetTrackingInfo = map2;
        this.expandedSheetTrackingInfo = map3;
        this.webSocketURL = webSocketURL;
        this.courierPinModification = courierPinModification;
    }

    public static /* synthetic */ GeotrackingMapV2DTO copy$default(GeotrackingMapV2DTO geotrackingMapV2DTO, Pin pin, Pin pin2, Pin pin3, String str, boolean z11, Integer num, Map map, Map map2, Map map3, String str2, CourierPinModification courierPinModification, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pin = geotrackingMapV2DTO.courierPin;
        }
        if ((i11 & 2) != 0) {
            pin2 = geotrackingMapV2DTO.destinationPin;
        }
        if ((i11 & 4) != 0) {
            pin3 = geotrackingMapV2DTO.darkStorePin;
        }
        if ((i11 & 8) != 0) {
            str = geotrackingMapV2DTO.orderStatus;
        }
        if ((i11 & 16) != 0) {
            z11 = geotrackingMapV2DTO.isReceived;
        }
        if ((i11 & 32) != 0) {
            num = geotrackingMapV2DTO.defaultSheetHeightRatio;
        }
        if ((i11 & 64) != 0) {
            map = geotrackingMapV2DTO.locationTrackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map2 = geotrackingMapV2DTO.defaultSheetTrackingInfo;
        }
        if ((i11 & 256) != 0) {
            map3 = geotrackingMapV2DTO.expandedSheetTrackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str2 = geotrackingMapV2DTO.webSocketURL;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            courierPinModification = geotrackingMapV2DTO.courierPinModification;
        }
        String str3 = str2;
        CourierPinModification courierPinModification2 = courierPinModification;
        Map map4 = map2;
        Map map5 = map3;
        Integer num2 = num;
        Map map6 = map;
        boolean z12 = z11;
        Pin pin4 = pin3;
        return geotrackingMapV2DTO.copy(pin, pin2, pin4, str, z12, num2, map6, map4, map5, str3, courierPinModification2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Pin getCourierPin() {
        return this.courierPin;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getWebSocketURL() {
        return this.webSocketURL;
    }

    /* renamed from: component11, reason: from getter */
    public final CourierPinModification getCourierPinModification() {
        return this.courierPinModification;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Pin getDestinationPin() {
        return this.destinationPin;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Pin getDarkStorePin() {
        return this.darkStorePin;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsReceived() {
        return this.isReceived;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getDefaultSheetHeightRatio() {
        return this.defaultSheetHeightRatio;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.locationTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.defaultSheetTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.expandedSheetTrackingInfo;
    }

    @NotNull
    public final GeotrackingMapV2DTO copy(@NotNull Pin courierPin, @NotNull Pin destinationPin, @NotNull Pin darkStorePin, @NotNull String orderStatus, boolean isReceived, Integer defaultSheetHeightRatio, Map<String, TokenizedTrackingInfo> locationTrackingInfo, Map<String, TokenizedTrackingInfo> defaultSheetTrackingInfo, Map<String, TokenizedTrackingInfo> expandedSheetTrackingInfo, @NotNull String webSocketURL, CourierPinModification courierPinModification) {
        Intrinsics.checkNotNullParameter(courierPin, "courierPin");
        Intrinsics.checkNotNullParameter(destinationPin, "destinationPin");
        Intrinsics.checkNotNullParameter(darkStorePin, "darkStorePin");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(webSocketURL, "webSocketURL");
        return new GeotrackingMapV2DTO(courierPin, destinationPin, darkStorePin, orderStatus, isReceived, defaultSheetHeightRatio, locationTrackingInfo, defaultSheetTrackingInfo, expandedSheetTrackingInfo, webSocketURL, courierPinModification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeotrackingMapV2DTO)) {
            return false;
        }
        GeotrackingMapV2DTO geotrackingMapV2DTO = (GeotrackingMapV2DTO) other;
        return Intrinsics.d(this.courierPin, geotrackingMapV2DTO.courierPin) && Intrinsics.d(this.destinationPin, geotrackingMapV2DTO.destinationPin) && Intrinsics.d(this.darkStorePin, geotrackingMapV2DTO.darkStorePin) && Intrinsics.d(this.orderStatus, geotrackingMapV2DTO.orderStatus) && this.isReceived == geotrackingMapV2DTO.isReceived && Intrinsics.d(this.defaultSheetHeightRatio, geotrackingMapV2DTO.defaultSheetHeightRatio) && Intrinsics.d(this.locationTrackingInfo, geotrackingMapV2DTO.locationTrackingInfo) && Intrinsics.d(this.defaultSheetTrackingInfo, geotrackingMapV2DTO.defaultSheetTrackingInfo) && Intrinsics.d(this.expandedSheetTrackingInfo, geotrackingMapV2DTO.expandedSheetTrackingInfo) && Intrinsics.d(this.webSocketURL, geotrackingMapV2DTO.webSocketURL) && Intrinsics.d(this.courierPinModification, geotrackingMapV2DTO.courierPinModification);
    }

    @NotNull
    public final Pin getCourierPin() {
        return this.courierPin;
    }

    public final CourierPinModification getCourierPinModification() {
        return this.courierPinModification;
    }

    @NotNull
    public final Pin getDarkStorePin() {
        return this.darkStorePin;
    }

    public final Integer getDefaultSheetHeightRatio() {
        return this.defaultSheetHeightRatio;
    }

    public final Map<String, TokenizedTrackingInfo> getDefaultSheetTrackingInfo() {
        return this.defaultSheetTrackingInfo;
    }

    @NotNull
    public final Pin getDestinationPin() {
        return this.destinationPin;
    }

    public final Map<String, TokenizedTrackingInfo> getExpandedSheetTrackingInfo() {
        return this.expandedSheetTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getLocationTrackingInfo() {
        return this.locationTrackingInfo;
    }

    @NotNull
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @NotNull
    public final String getWebSocketURL() {
        return this.webSocketURL;
    }

    public int hashCode() {
        int a11 = C3532b.a(G.g.a((this.darkStorePin.hashCode() + ((this.destinationPin.hashCode() + (this.courierPin.hashCode() * 31)) * 31)) * 31, 31, this.orderStatus), 31, this.isReceived);
        Integer num = this.defaultSheetHeightRatio;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.locationTrackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.defaultSheetTrackingInfo;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.expandedSheetTrackingInfo;
        int a12 = G.g.a((hashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31, 31, this.webSocketURL);
        CourierPinModification courierPinModification = this.courierPinModification;
        return a12 + (courierPinModification != null ? courierPinModification.hashCode() : 0);
    }

    public final boolean isReceived() {
        return this.isReceived;
    }

    @NotNull
    public String toString() {
        Pin pin = this.courierPin;
        Pin pin2 = this.destinationPin;
        Pin pin3 = this.darkStorePin;
        String str = this.orderStatus;
        boolean z11 = this.isReceived;
        Integer num = this.defaultSheetHeightRatio;
        Map<String, TokenizedTrackingInfo> map = this.locationTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.defaultSheetTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.expandedSheetTrackingInfo;
        String str2 = this.webSocketURL;
        CourierPinModification courierPinModification = this.courierPinModification;
        StringBuilder sb2 = new StringBuilder("GeotrackingMapV2DTO(courierPin=");
        sb2.append(pin);
        sb2.append(", destinationPin=");
        sb2.append(pin2);
        sb2.append(", darkStorePin=");
        sb2.append(pin3);
        sb2.append(", orderStatus=");
        sb2.append(str);
        sb2.append(", isReceived=");
        sb2.append(z11);
        sb2.append(", defaultSheetHeightRatio=");
        sb2.append(num);
        sb2.append(", locationTrackingInfo=");
        Tl.b.g(sb2, map, ", defaultSheetTrackingInfo=", map2, ", expandedSheetTrackingInfo=");
        sb2.append(map3);
        sb2.append(", webSocketURL=");
        sb2.append(str2);
        sb2.append(", courierPinModification=");
        sb2.append(courierPinModification);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ GeotrackingMapV2DTO(Pin pin, Pin pin2, Pin pin3, String str, boolean z11, Integer num, Map map, Map map2, Map map3, String str2, CourierPinModification courierPinModification, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pin, pin2, pin3, str, z11, (i11 & 32) != 0 ? null : num, map, map2, map3, str2, courierPinModification);
    }
}
