package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.data;

import Ak.b;
import B90.C2618u;
import El.C2971a;
import G.g;
import Hj.C3143a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBoxV2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002*+BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "copyButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "map", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$MapSettings;", "pointsOfInterests", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$MapSettings;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAddress", "getCopyButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getMap", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$MapSettings;", "getPointsOfInterests", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "MapSettings", "Pin", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageMapPreviewV2DTO {

    @NotNull
    private final TextDTO address;

    @NotNull
    private final IconButtonV3DTO copyButton;

    @NotNull
    private final MapSettings map;

    @NotNull
    private final List<CellDTO> pointsOfInterests;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$MapSettings;", "", "visibleRegion", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "pin", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$Pin;", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$Pin;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getVisibleRegion", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "getPin", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$Pin;", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapSettings {
        private final CommonControlSettings commonControlSettings;

        @NotNull
        private final Pin pin;

        @NotNull
        private final BoundingBoxV2 visibleRegion;

        public MapSettings(@NotNull BoundingBoxV2 visibleRegion, @NotNull Pin pin, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(visibleRegion, "visibleRegion");
            Intrinsics.checkNotNullParameter(pin, "pin");
            this.visibleRegion = visibleRegion;
            this.pin = pin;
            this.commonControlSettings = commonControlSettings;
        }

        public static /* synthetic */ MapSettings copy$default(MapSettings mapSettings, BoundingBoxV2 boundingBoxV2, Pin pin, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                boundingBoxV2 = mapSettings.visibleRegion;
            }
            if ((i11 & 2) != 0) {
                pin = mapSettings.pin;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = mapSettings.commonControlSettings;
            }
            return mapSettings.copy(boundingBoxV2, pin, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BoundingBoxV2 getVisibleRegion() {
            return this.visibleRegion;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Pin getPin() {
            return this.pin;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        @NotNull
        public final MapSettings copy(@NotNull BoundingBoxV2 visibleRegion, @NotNull Pin pin, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(visibleRegion, "visibleRegion");
            Intrinsics.checkNotNullParameter(pin, "pin");
            return new MapSettings(visibleRegion, pin, commonControlSettings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapSettings)) {
                return false;
            }
            MapSettings mapSettings = (MapSettings) other;
            return Intrinsics.d(this.visibleRegion, mapSettings.visibleRegion) && Intrinsics.d(this.pin, mapSettings.pin) && Intrinsics.d(this.commonControlSettings, mapSettings.commonControlSettings);
        }

        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        @NotNull
        public final Pin getPin() {
            return this.pin;
        }

        @NotNull
        public final BoundingBoxV2 getVisibleRegion() {
            return this.visibleRegion;
        }

        public int hashCode() {
            int hashCode = (this.pin.hashCode() + (this.visibleRegion.hashCode() * 31)) * 31;
            CommonControlSettings commonControlSettings = this.commonControlSettings;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            BoundingBoxV2 boundingBoxV2 = this.visibleRegion;
            Pin pin = this.pin;
            CommonControlSettings commonControlSettings = this.commonControlSettings;
            StringBuilder sb2 = new StringBuilder("MapSettings(visibleRegion=");
            sb2.append(boundingBoxV2);
            sb2.append(", pin=");
            sb2.append(pin);
            sb2.append(", commonControlSettings=");
            return b.g(sb2, commonControlSettings, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$Pin;", "", "coordinate", "", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "anchorPoint", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;)V", "getCoordinate", "()Ljava/util/List;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAnchorPoint", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pin {

        @NotNull
        private final List<Double> anchorPoint;

        @NotNull
        private final List<Double> coordinate;

        @NotNull
        private final IconDTO icon;

        public Pin(@NotNull List<Double> coordinate, @NotNull IconDTO icon, @NotNull List<Double> anchorPoint) {
            Intrinsics.checkNotNullParameter(coordinate, "coordinate");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
            this.coordinate = coordinate;
            this.icon = icon;
            this.anchorPoint = anchorPoint;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Pin copy$default(Pin pin, List list, IconDTO iconDTO, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = pin.coordinate;
            }
            if ((i11 & 2) != 0) {
                iconDTO = pin.icon;
            }
            if ((i11 & 4) != 0) {
                list2 = pin.anchorPoint;
            }
            return pin.copy(list, iconDTO, list2);
        }

        @NotNull
        public final List<Double> component1() {
            return this.coordinate;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final List<Double> component3() {
            return this.anchorPoint;
        }

        @NotNull
        public final Pin copy(@NotNull List<Double> coordinate, @NotNull IconDTO icon, @NotNull List<Double> anchorPoint) {
            Intrinsics.checkNotNullParameter(coordinate, "coordinate");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
            return new Pin(coordinate, icon, anchorPoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.d(this.coordinate, pin.coordinate) && Intrinsics.d(this.icon, pin.icon) && Intrinsics.d(this.anchorPoint, pin.anchorPoint);
        }

        @NotNull
        public final List<Double> getAnchorPoint() {
            return this.anchorPoint;
        }

        @NotNull
        public final List<Double> getCoordinate() {
            return this.coordinate;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.anchorPoint.hashCode() + C2971a.a(this.icon, this.coordinate.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            List<Double> list = this.coordinate;
            IconDTO iconDTO = this.icon;
            List<Double> list2 = this.anchorPoint;
            StringBuilder sb2 = new StringBuilder("Pin(coordinate=");
            sb2.append(list);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", anchorPoint=");
            return C2618u.h(sb2, list2, ")");
        }
    }

    public HotelsPageMapPreviewV2DTO(@NotNull TextDTO title, @NotNull TextDTO address, @NotNull IconButtonV3DTO copyButton, @NotNull MapSettings map, @NotNull List<CellDTO> pointsOfInterests, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(copyButton, "copyButton");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(pointsOfInterests, "pointsOfInterests");
        this.title = title;
        this.address = address;
        this.copyButton = copyButton;
        this.map = map;
        this.pointsOfInterests = pointsOfInterests;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ HotelsPageMapPreviewV2DTO copy$default(HotelsPageMapPreviewV2DTO hotelsPageMapPreviewV2DTO, TextDTO textDTO, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, MapSettings mapSettings, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = hotelsPageMapPreviewV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = hotelsPageMapPreviewV2DTO.address;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = hotelsPageMapPreviewV2DTO.copyButton;
        }
        if ((i11 & 8) != 0) {
            mapSettings = hotelsPageMapPreviewV2DTO.map;
        }
        if ((i11 & 16) != 0) {
            list = hotelsPageMapPreviewV2DTO.pointsOfInterests;
        }
        if ((i11 & 32) != 0) {
            map = hotelsPageMapPreviewV2DTO.trackingInfo;
        }
        List list2 = list;
        Map map2 = map;
        return hotelsPageMapPreviewV2DTO.copy(textDTO, textDTO2, iconButtonV3DTO, mapSettings, list2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getAddress() {
        return this.address;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getCopyButton() {
        return this.copyButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final MapSettings getMap() {
        return this.map;
    }

    @NotNull
    public final List<CellDTO> component5() {
        return this.pointsOfInterests;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsPageMapPreviewV2DTO copy(@NotNull TextDTO title, @NotNull TextDTO address, @NotNull IconButtonV3DTO copyButton, @NotNull MapSettings map, @NotNull List<CellDTO> pointsOfInterests, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(copyButton, "copyButton");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(pointsOfInterests, "pointsOfInterests");
        return new HotelsPageMapPreviewV2DTO(title, address, copyButton, map, pointsOfInterests, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageMapPreviewV2DTO)) {
            return false;
        }
        HotelsPageMapPreviewV2DTO hotelsPageMapPreviewV2DTO = (HotelsPageMapPreviewV2DTO) other;
        return Intrinsics.d(this.title, hotelsPageMapPreviewV2DTO.title) && Intrinsics.d(this.address, hotelsPageMapPreviewV2DTO.address) && Intrinsics.d(this.copyButton, hotelsPageMapPreviewV2DTO.copyButton) && Intrinsics.d(this.map, hotelsPageMapPreviewV2DTO.map) && Intrinsics.d(this.pointsOfInterests, hotelsPageMapPreviewV2DTO.pointsOfInterests) && Intrinsics.d(this.trackingInfo, hotelsPageMapPreviewV2DTO.trackingInfo);
    }

    @NotNull
    public final TextDTO getAddress() {
        return this.address;
    }

    @NotNull
    public final IconButtonV3DTO getCopyButton() {
        return this.copyButton;
    }

    @NotNull
    public final MapSettings getMap() {
        return this.map;
    }

    @NotNull
    public final List<CellDTO> getPointsOfInterests() {
        return this.pointsOfInterests;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b((this.map.hashCode() + GR.b.c(this.copyButton, Ns.b.a(this.address, this.title.hashCode() * 31, 31), 31)) * 31, 31, this.pointsOfInterests);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.address;
        IconButtonV3DTO iconButtonV3DTO = this.copyButton;
        MapSettings mapSettings = this.map;
        List<CellDTO> list = this.pointsOfInterests;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("HotelsPageMapPreviewV2DTO(title=", textDTO, ", address=", textDTO2, ", copyButton=");
        g10.append(iconButtonV3DTO);
        g10.append(", map=");
        g10.append(mapSettings);
        g10.append(", pointsOfInterests=");
        return C3143a.h(g10, list, ", trackingInfo=", map, ")");
    }

    public HotelsPageMapPreviewV2DTO(TextDTO textDTO, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, MapSettings mapSettings, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, iconButtonV3DTO, mapSettings, (i11 & 16) != 0 ? K.f71697a : list, map);
    }
}
