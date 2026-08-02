package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.data;

import B0.C2454a;
import B90.C2616s;
import D3.g;
import El.C2971a;
import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0004+,-.BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "initialVisibleItemsCount", "", "items", "", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ItemDTO;", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "expandCollapseButton", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ExpandCollapseButtonDTO;", "viewTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;ILjava/util/List;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ExpandCollapseButtonDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getInitialVisibleItemsCount", "()I", "getItems", "()Ljava/util/List;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getExpandCollapseButton", "()Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ExpandCollapseButtonDTO;", "getViewTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "ItemDTO", "HeaderDTO", "PriceDTO", "ExpandCollapseButtonDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DirectFlightsDropdownDTO {
    public static final int $stable = 8;
    private final ExpandCollapseButtonDTO expandCollapseButton;
    private final int initialVisibleItemsCount;

    @NotNull
    private final List<ItemDTO> items;

    @NotNull
    private final TravelWidgetSettingsDTO settings;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JW\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ExpandCollapseButtonDTO;", "", "collapsedLabel", "Lru/ozon/uni/atoms/data/text/TextDTO;", "expandedLabel", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "clickExpandTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "clickCollapseTracking", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/Map;Ljava/util/Map;)V", "getCollapsedLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getExpandedLabel", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getClickExpandTracking", "()Ljava/util/Map;", "getClickCollapseTracking", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpandCollapseButtonDTO {
        public static final int $stable = 8;
        private final Map<String, TokenizedTrackingInfo> clickCollapseTracking;
        private final Map<String, TokenizedTrackingInfo> clickExpandTracking;

        @NotNull
        private final TextDTO collapsedLabel;

        @NotNull
        private final TextDTO expandedLabel;

        @NotNull
        private final IconDTO icon;

        public ExpandCollapseButtonDTO(@NotNull TextDTO collapsedLabel, @NotNull TextDTO expandedLabel, @NotNull IconDTO icon, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(collapsedLabel, "collapsedLabel");
            Intrinsics.checkNotNullParameter(expandedLabel, "expandedLabel");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.collapsedLabel = collapsedLabel;
            this.expandedLabel = expandedLabel;
            this.icon = icon;
            this.clickExpandTracking = map;
            this.clickCollapseTracking = map2;
        }

        public static /* synthetic */ ExpandCollapseButtonDTO copy$default(ExpandCollapseButtonDTO expandCollapseButtonDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = expandCollapseButtonDTO.collapsedLabel;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = expandCollapseButtonDTO.expandedLabel;
            }
            if ((i11 & 4) != 0) {
                iconDTO = expandCollapseButtonDTO.icon;
            }
            if ((i11 & 8) != 0) {
                map = expandCollapseButtonDTO.clickExpandTracking;
            }
            if ((i11 & 16) != 0) {
                map2 = expandCollapseButtonDTO.clickCollapseTracking;
            }
            Map map3 = map2;
            IconDTO iconDTO2 = iconDTO;
            return expandCollapseButtonDTO.copy(textDTO, textDTO2, iconDTO2, map, map3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getCollapsedLabel() {
            return this.collapsedLabel;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getExpandedLabel() {
            return this.expandedLabel;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.clickExpandTracking;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.clickCollapseTracking;
        }

        @NotNull
        public final ExpandCollapseButtonDTO copy(@NotNull TextDTO collapsedLabel, @NotNull TextDTO expandedLabel, @NotNull IconDTO icon, Map<String, TokenizedTrackingInfo> clickExpandTracking, Map<String, TokenizedTrackingInfo> clickCollapseTracking) {
            Intrinsics.checkNotNullParameter(collapsedLabel, "collapsedLabel");
            Intrinsics.checkNotNullParameter(expandedLabel, "expandedLabel");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new ExpandCollapseButtonDTO(collapsedLabel, expandedLabel, icon, clickExpandTracking, clickCollapseTracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpandCollapseButtonDTO)) {
                return false;
            }
            ExpandCollapseButtonDTO expandCollapseButtonDTO = (ExpandCollapseButtonDTO) other;
            return Intrinsics.d(this.collapsedLabel, expandCollapseButtonDTO.collapsedLabel) && Intrinsics.d(this.expandedLabel, expandCollapseButtonDTO.expandedLabel) && Intrinsics.d(this.icon, expandCollapseButtonDTO.icon) && Intrinsics.d(this.clickExpandTracking, expandCollapseButtonDTO.clickExpandTracking) && Intrinsics.d(this.clickCollapseTracking, expandCollapseButtonDTO.clickCollapseTracking);
        }

        public final Map<String, TokenizedTrackingInfo> getClickCollapseTracking() {
            return this.clickCollapseTracking;
        }

        public final Map<String, TokenizedTrackingInfo> getClickExpandTracking() {
            return this.clickExpandTracking;
        }

        @NotNull
        public final TextDTO getCollapsedLabel() {
            return this.collapsedLabel;
        }

        @NotNull
        public final TextDTO getExpandedLabel() {
            return this.expandedLabel;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.icon, b.a(this.expandedLabel, this.collapsedLabel.hashCode() * 31, 31), 31);
            Map<String, TokenizedTrackingInfo> map = this.clickExpandTracking;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.clickCollapseTracking;
            return hashCode + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.collapsedLabel;
            TextDTO textDTO2 = this.expandedLabel;
            IconDTO iconDTO = this.icon;
            Map<String, TokenizedTrackingInfo> map = this.clickExpandTracking;
            Map<String, TokenizedTrackingInfo> map2 = this.clickCollapseTracking;
            StringBuilder g10 = g.g("ExpandCollapseButtonDTO(collapsedLabel=", textDTO, ", expandedLabel=", textDTO2, ", icon=");
            g10.append(iconDTO);
            g10.append(", clickExpandTracking=");
            g10.append(map);
            g10.append(", clickCollapseTracking=");
            return P.f(g10, map2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$HeaderDTO;", "", "aviaIcon", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$PriceDTO;)V", "getAviaIcon", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$PriceDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final ImageDTO aviaIcon;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final TextDTO title;

        public HeaderDTO(@NotNull ImageDTO aviaIcon, @NotNull TextDTO title, @NotNull PriceDTO price) {
            Intrinsics.checkNotNullParameter(aviaIcon, "aviaIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            this.aviaIcon = aviaIcon;
            this.title = title;
            this.price = price;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, ImageDTO imageDTO, TextDTO textDTO, PriceDTO priceDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = headerDTO.aviaIcon;
            }
            if ((i11 & 2) != 0) {
                textDTO = headerDTO.title;
            }
            if ((i11 & 4) != 0) {
                priceDTO = headerDTO.price;
            }
            return headerDTO.copy(imageDTO, textDTO, priceDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getAviaIcon() {
            return this.aviaIcon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final HeaderDTO copy(@NotNull ImageDTO aviaIcon, @NotNull TextDTO title, @NotNull PriceDTO price) {
            Intrinsics.checkNotNullParameter(aviaIcon, "aviaIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            return new HeaderDTO(aviaIcon, title, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return Intrinsics.d(this.aviaIcon, headerDTO.aviaIcon) && Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.price, headerDTO.price);
        }

        @NotNull
        public final ImageDTO getAviaIcon() {
            return this.aviaIcon;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.price.hashCode() + b.a(this.title, this.aviaIcon.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.aviaIcon;
            TextDTO textDTO = this.title;
            PriceDTO priceDTO = this.price;
            StringBuilder d11 = C2616s.d("HeaderDTO(aviaIcon=", imageDTO, ", title=", textDTO, ", price=");
            d11.append(priceDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$PriceDTO;", "", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceDTO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO label;

        public PriceDTO(@NotNull TextDTO label, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.label = label;
            this.icon = icon;
        }

        public static /* synthetic */ PriceDTO copy$default(PriceDTO priceDTO, TextDTO textDTO, IconDTO iconDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = priceDTO.label;
            }
            if ((i11 & 2) != 0) {
                iconDTO = priceDTO.icon;
            }
            return priceDTO.copy(textDTO, iconDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getLabel() {
            return this.label;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final PriceDTO copy(@NotNull TextDTO label, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new PriceDTO(label, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDTO)) {
                return false;
            }
            PriceDTO priceDTO = (PriceDTO) other;
            return Intrinsics.d(this.label, priceDTO.label) && Intrinsics.d(this.icon, priceDTO.icon);
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.icon.hashCode() + (this.label.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PriceDTO(label=" + this.label + ", icon=" + this.icon + ")";
        }
    }

    public DirectFlightsDropdownDTO(@NotNull TextDTO title, int i11, @NotNull List<ItemDTO> items, @NotNull TravelWidgetSettingsDTO settings, ExpandCollapseButtonDTO expandCollapseButtonDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.title = title;
        this.initialVisibleItemsCount = i11;
        this.items = items;
        this.settings = settings;
        this.expandCollapseButton = expandCollapseButtonDTO;
        this.viewTracking = map;
    }

    public static /* synthetic */ DirectFlightsDropdownDTO copy$default(DirectFlightsDropdownDTO directFlightsDropdownDTO, TextDTO textDTO, int i11, List list, TravelWidgetSettingsDTO travelWidgetSettingsDTO, ExpandCollapseButtonDTO expandCollapseButtonDTO, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            textDTO = directFlightsDropdownDTO.title;
        }
        if ((i12 & 2) != 0) {
            i11 = directFlightsDropdownDTO.initialVisibleItemsCount;
        }
        if ((i12 & 4) != 0) {
            list = directFlightsDropdownDTO.items;
        }
        if ((i12 & 8) != 0) {
            travelWidgetSettingsDTO = directFlightsDropdownDTO.settings;
        }
        if ((i12 & 16) != 0) {
            expandCollapseButtonDTO = directFlightsDropdownDTO.expandCollapseButton;
        }
        if ((i12 & 32) != 0) {
            map = directFlightsDropdownDTO.viewTracking;
        }
        ExpandCollapseButtonDTO expandCollapseButtonDTO2 = expandCollapseButtonDTO;
        Map map2 = map;
        return directFlightsDropdownDTO.copy(textDTO, i11, list, travelWidgetSettingsDTO, expandCollapseButtonDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getInitialVisibleItemsCount() {
        return this.initialVisibleItemsCount;
    }

    @NotNull
    public final List<ItemDTO> component3() {
        return this.items;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TravelWidgetSettingsDTO getSettings() {
        return this.settings;
    }

    /* renamed from: component5, reason: from getter */
    public final ExpandCollapseButtonDTO getExpandCollapseButton() {
        return this.expandCollapseButton;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.viewTracking;
    }

    @NotNull
    public final DirectFlightsDropdownDTO copy(@NotNull TextDTO title, int initialVisibleItemsCount, @NotNull List<ItemDTO> items, @NotNull TravelWidgetSettingsDTO settings, ExpandCollapseButtonDTO expandCollapseButton, Map<String, TokenizedTrackingInfo> viewTracking) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new DirectFlightsDropdownDTO(title, initialVisibleItemsCount, items, settings, expandCollapseButton, viewTracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectFlightsDropdownDTO)) {
            return false;
        }
        DirectFlightsDropdownDTO directFlightsDropdownDTO = (DirectFlightsDropdownDTO) other;
        return Intrinsics.d(this.title, directFlightsDropdownDTO.title) && this.initialVisibleItemsCount == directFlightsDropdownDTO.initialVisibleItemsCount && Intrinsics.d(this.items, directFlightsDropdownDTO.items) && Intrinsics.d(this.settings, directFlightsDropdownDTO.settings) && Intrinsics.d(this.expandCollapseButton, directFlightsDropdownDTO.expandCollapseButton) && Intrinsics.d(this.viewTracking, directFlightsDropdownDTO.viewTracking);
    }

    public final ExpandCollapseButtonDTO getExpandCollapseButton() {
        return this.expandCollapseButton;
    }

    public final int getInitialVisibleItemsCount() {
        return this.initialVisibleItemsCount;
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }

    @NotNull
    public final TravelWidgetSettingsDTO getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int hashCode = (this.settings.hashCode() + G.g.b(C2454a.a(this.initialVisibleItemsCount, this.title.hashCode() * 31, 31), 31, this.items)) * 31;
        ExpandCollapseButtonDTO expandCollapseButtonDTO = this.expandCollapseButton;
        int hashCode2 = (hashCode + (expandCollapseButtonDTO == null ? 0 : expandCollapseButtonDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DirectFlightsDropdownDTO(title=" + this.title + ", initialVisibleItemsCount=" + this.initialVisibleItemsCount + ", items=" + this.items + ", settings=" + this.settings + ", expandCollapseButton=" + this.expandCollapseButton + ", viewTracking=" + this.viewTracking + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ItemDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$HeaderDTO;", "textItems", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$HeaderDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getHeader", "()Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$HeaderDTO;", "getTextItems", "()Ljava/util/List;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final HeaderDTO header;

        @NotNull
        private final List<TextDTO> textItems;

        public ItemDTO(@NotNull HeaderDTO header, @NotNull List<TextDTO> textItems, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(textItems, "textItems");
            Intrinsics.checkNotNullParameter(common, "common");
            this.header = header;
            this.textItems = textItems;
            this.common = common;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, HeaderDTO headerDTO, List list, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                headerDTO = itemDTO.header;
            }
            if ((i11 & 2) != 0) {
                list = itemDTO.textItems;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = itemDTO.common;
            }
            return itemDTO.copy(headerDTO, list, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final HeaderDTO getHeader() {
            return this.header;
        }

        @NotNull
        public final List<TextDTO> component2() {
            return this.textItems;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final ItemDTO copy(@NotNull HeaderDTO header, @NotNull List<TextDTO> textItems, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(textItems, "textItems");
            Intrinsics.checkNotNullParameter(common, "common");
            return new ItemDTO(header, textItems, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.header, itemDTO.header) && Intrinsics.d(this.textItems, itemDTO.textItems) && Intrinsics.d(this.common, itemDTO.common);
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final HeaderDTO getHeader() {
            return this.header;
        }

        @NotNull
        public final List<TextDTO> getTextItems() {
            return this.textItems;
        }

        public int hashCode() {
            return this.common.hashCode() + G.g.b(this.header.hashCode() * 31, 31, this.textItems);
        }

        @NotNull
        public String toString() {
            HeaderDTO headerDTO = this.header;
            List<TextDTO> list = this.textItems;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("ItemDTO(header=");
            sb2.append(headerDTO);
            sb2.append(", textItems=");
            sb2.append(list);
            sb2.append(", common=");
            return Ak.b.g(sb2, commonControlSettings, ")");
        }

        public ItemDTO(HeaderDTO headerDTO, List list, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(headerDTO, (i11 & 2) != 0 ? K.f71697a : list, commonControlSettings);
        }
    }
}
