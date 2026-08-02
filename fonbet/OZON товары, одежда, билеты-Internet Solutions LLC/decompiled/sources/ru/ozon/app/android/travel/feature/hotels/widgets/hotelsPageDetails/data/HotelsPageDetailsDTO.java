package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.data;

import Kk.c;
import N3.C3660k;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.molecules.dto.iconWithText.v2.IconWithTextV2DTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO;", "", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO$TabInfo;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getTabs", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TabInfo", "Facilities", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageDetailsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<TabInfo> tabs;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO$Facilities;", "", "key", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Facilities {
        public static final int $stable = 0;

        @NotNull
        private final String key;

        @NotNull
        private final String value;

        public Facilities(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.value = value;
        }

        public static /* synthetic */ Facilities copy$default(Facilities facilities, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = facilities.key;
            }
            if ((i11 & 2) != 0) {
                str2 = facilities.value;
            }
            return facilities.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Facilities copy(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Facilities(key, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Facilities)) {
                return false;
            }
            Facilities facilities = (Facilities) other;
            return Intrinsics.d(this.key, facilities.key) && Intrinsics.d(this.value, facilities.value);
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Facilities(key=", this.key, ", value=", this.value, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006HÆ\u0003J[\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO$TabInfo;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "facilities", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO$Facilities;", "extendButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "fullDescriptionButtonTitle", "additionalInfo", "Lru/ozon/app/android/travel/molecules/dto/iconWithText/v2/IconWithTextV2DTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getFacilities", "()Ljava/util/List;", "getExtendButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getFullDescriptionButtonTitle", "getAdditionalInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabInfo {
        public static final int $stable = 8;
        private final List<IconWithTextV2DTO> additionalInfo;
        private final String description;
        private final LinkButtonDTO extendButton;
        private final List<Facilities> facilities;
        private final String fullDescriptionButtonTitle;

        @NotNull
        private final String title;

        public TabInfo(@NotNull String title, String str, List<Facilities> list, LinkButtonDTO linkButtonDTO, String str2, List<IconWithTextV2DTO> list2) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.description = str;
            this.facilities = list;
            this.extendButton = linkButtonDTO;
            this.fullDescriptionButtonTitle = str2;
            this.additionalInfo = list2;
        }

        public static /* synthetic */ TabInfo copy$default(TabInfo tabInfo, String str, String str2, List list, LinkButtonDTO linkButtonDTO, String str3, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabInfo.title;
            }
            if ((i11 & 2) != 0) {
                str2 = tabInfo.description;
            }
            if ((i11 & 4) != 0) {
                list = tabInfo.facilities;
            }
            if ((i11 & 8) != 0) {
                linkButtonDTO = tabInfo.extendButton;
            }
            if ((i11 & 16) != 0) {
                str3 = tabInfo.fullDescriptionButtonTitle;
            }
            if ((i11 & 32) != 0) {
                list2 = tabInfo.additionalInfo;
            }
            String str4 = str3;
            List list3 = list2;
            return tabInfo.copy(str, str2, list, linkButtonDTO, str4, list3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final List<Facilities> component3() {
            return this.facilities;
        }

        /* renamed from: component4, reason: from getter */
        public final LinkButtonDTO getExtendButton() {
            return this.extendButton;
        }

        /* renamed from: component5, reason: from getter */
        public final String getFullDescriptionButtonTitle() {
            return this.fullDescriptionButtonTitle;
        }

        public final List<IconWithTextV2DTO> component6() {
            return this.additionalInfo;
        }

        @NotNull
        public final TabInfo copy(@NotNull String title, String description, List<Facilities> facilities, LinkButtonDTO extendButton, String fullDescriptionButtonTitle, List<IconWithTextV2DTO> additionalInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new TabInfo(title, description, facilities, extendButton, fullDescriptionButtonTitle, additionalInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabInfo)) {
                return false;
            }
            TabInfo tabInfo = (TabInfo) other;
            return Intrinsics.d(this.title, tabInfo.title) && Intrinsics.d(this.description, tabInfo.description) && Intrinsics.d(this.facilities, tabInfo.facilities) && Intrinsics.d(this.extendButton, tabInfo.extendButton) && Intrinsics.d(this.fullDescriptionButtonTitle, tabInfo.fullDescriptionButtonTitle) && Intrinsics.d(this.additionalInfo, tabInfo.additionalInfo);
        }

        public final List<IconWithTextV2DTO> getAdditionalInfo() {
            return this.additionalInfo;
        }

        public final String getDescription() {
            return this.description;
        }

        public final LinkButtonDTO getExtendButton() {
            return this.extendButton;
        }

        public final List<Facilities> getFacilities() {
            return this.facilities;
        }

        public final String getFullDescriptionButtonTitle() {
            return this.fullDescriptionButtonTitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<Facilities> list = this.facilities;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            LinkButtonDTO linkButtonDTO = this.extendButton;
            int hashCode4 = (hashCode3 + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode())) * 31;
            String str2 = this.fullDescriptionButtonTitle;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<IconWithTextV2DTO> list2 = this.additionalInfo;
            return hashCode5 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.description;
            List<Facilities> list = this.facilities;
            LinkButtonDTO linkButtonDTO = this.extendButton;
            String str3 = this.fullDescriptionButtonTitle;
            List<IconWithTextV2DTO> list2 = this.additionalInfo;
            StringBuilder d11 = C3660k.d("TabInfo(title=", str, ", description=", str2, ", facilities=");
            d11.append(list);
            d11.append(", extendButton=");
            d11.append(linkButtonDTO);
            d11.append(", fullDescriptionButtonTitle=");
            d11.append(str3);
            d11.append(", additionalInfo=");
            d11.append(list2);
            d11.append(")");
            return d11.toString();
        }
    }

    public HotelsPageDetailsDTO(@NotNull List<TabInfo> tabs, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.tabs = tabs;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsPageDetailsDTO copy$default(HotelsPageDetailsDTO hotelsPageDetailsDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsPageDetailsDTO.tabs;
        }
        if ((i11 & 2) != 0) {
            map = hotelsPageDetailsDTO.trackingInfo;
        }
        return hotelsPageDetailsDTO.copy(list, map);
    }

    @NotNull
    public final List<TabInfo> component1() {
        return this.tabs;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsPageDetailsDTO copy(@NotNull List<TabInfo> tabs, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new HotelsPageDetailsDTO(tabs, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageDetailsDTO)) {
            return false;
        }
        HotelsPageDetailsDTO hotelsPageDetailsDTO = (HotelsPageDetailsDTO) other;
        return Intrinsics.d(this.tabs, hotelsPageDetailsDTO.tabs) && Intrinsics.d(this.trackingInfo, hotelsPageDetailsDTO.trackingInfo);
    }

    @NotNull
    public final List<TabInfo> getTabs() {
        return this.tabs;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.tabs.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("HotelsPageDetailsDTO(tabs=", ", trackingInfo=", ")", this.tabs, this.trackingInfo);
    }
}
