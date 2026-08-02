package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data;

import Ef0.c;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004!\"#$B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;", "", "radius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "scrollableStatePaddings", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "tabsGapPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsSingleTab;", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/util/List;)V", "getRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getScrollableStatePaddings", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "getTabsGapPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTabs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CatalogueTabsPaddings", "CatalogueTabsSingleTab", "DtoFieldName", "DtoPaddingsFieldName", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogueTabsDTO {

    @NotNull
    private final CornerRadius radius;

    @NotNull
    private final CatalogueTabsPaddings scrollableStatePaddings;

    @NotNull
    private final List<CatalogueTabsSingleTab> tabs;

    @NotNull
    private final CommonCellSettings.LayoutPadding tabsGapPadding;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "", "leftPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightPadding", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getLeftPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightPadding", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CatalogueTabsPaddings {

        @NotNull
        private final CommonCellSettings.LayoutPadding bottomPadding;

        @NotNull
        private final CommonCellSettings.LayoutPadding leftPadding;

        @NotNull
        private final CommonCellSettings.LayoutPadding rightPadding;

        @NotNull
        private final CommonCellSettings.LayoutPadding topPadding;

        public CatalogueTabsPaddings(@NotNull CommonCellSettings.LayoutPadding leftPadding, @NotNull CommonCellSettings.LayoutPadding rightPadding, @NotNull CommonCellSettings.LayoutPadding topPadding, @NotNull CommonCellSettings.LayoutPadding bottomPadding) {
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
        }

        public static /* synthetic */ CatalogueTabsPaddings copy$default(CatalogueTabsPaddings catalogueTabsPaddings, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = catalogueTabsPaddings.leftPadding;
            }
            if ((i11 & 2) != 0) {
                layoutPadding2 = catalogueTabsPaddings.rightPadding;
            }
            if ((i11 & 4) != 0) {
                layoutPadding3 = catalogueTabsPaddings.topPadding;
            }
            if ((i11 & 8) != 0) {
                layoutPadding4 = catalogueTabsPaddings.bottomPadding;
            }
            return catalogueTabsPaddings.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final CatalogueTabsPaddings copy(@NotNull CommonCellSettings.LayoutPadding leftPadding, @NotNull CommonCellSettings.LayoutPadding rightPadding, @NotNull CommonCellSettings.LayoutPadding topPadding, @NotNull CommonCellSettings.LayoutPadding bottomPadding) {
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            return new CatalogueTabsPaddings(leftPadding, rightPadding, topPadding, bottomPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CatalogueTabsPaddings)) {
                return false;
            }
            CatalogueTabsPaddings catalogueTabsPaddings = (CatalogueTabsPaddings) other;
            return this.leftPadding == catalogueTabsPaddings.leftPadding && this.rightPadding == catalogueTabsPaddings.rightPadding && this.topPadding == catalogueTabsPaddings.topPadding && this.bottomPadding == catalogueTabsPaddings.bottomPadding;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.bottomPadding.hashCode() + c.a(this.topPadding, c.a(this.rightPadding, this.leftPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "CatalogueTabsPaddings(leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ", topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsSingleTab;", "", "chip", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "widgetScrollKey", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;Ljava/lang/String;)V", "getChip", "()Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "getWidgetScrollKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CatalogueTabsSingleTab {

        @NotNull
        private final ChipDTO chip;
        private final String widgetScrollKey;

        public CatalogueTabsSingleTab(@NotNull ChipDTO chip, String str) {
            Intrinsics.checkNotNullParameter(chip, "chip");
            this.chip = chip;
            this.widgetScrollKey = str;
        }

        public static /* synthetic */ CatalogueTabsSingleTab copy$default(CatalogueTabsSingleTab catalogueTabsSingleTab, ChipDTO chipDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                chipDTO = catalogueTabsSingleTab.chip;
            }
            if ((i11 & 2) != 0) {
                str = catalogueTabsSingleTab.widgetScrollKey;
            }
            return catalogueTabsSingleTab.copy(chipDTO, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ChipDTO getChip() {
            return this.chip;
        }

        /* renamed from: component2, reason: from getter */
        public final String getWidgetScrollKey() {
            return this.widgetScrollKey;
        }

        @NotNull
        public final CatalogueTabsSingleTab copy(@NotNull ChipDTO chip, String widgetScrollKey) {
            Intrinsics.checkNotNullParameter(chip, "chip");
            return new CatalogueTabsSingleTab(chip, widgetScrollKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CatalogueTabsSingleTab)) {
                return false;
            }
            CatalogueTabsSingleTab catalogueTabsSingleTab = (CatalogueTabsSingleTab) other;
            return Intrinsics.d(this.chip, catalogueTabsSingleTab.chip) && Intrinsics.d(this.widgetScrollKey, catalogueTabsSingleTab.widgetScrollKey);
        }

        @NotNull
        public final ChipDTO getChip() {
            return this.chip;
        }

        public final String getWidgetScrollKey() {
            return this.widgetScrollKey;
        }

        public int hashCode() {
            int hashCode = this.chip.hashCode() * 31;
            String str = this.widgetScrollKey;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "CatalogueTabsSingleTab(chip=" + this.chip + ", widgetScrollKey=" + this.widgetScrollKey + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$DtoFieldName;", "", "jsonName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsonName", "()Ljava/lang/String;", "RADIUS", "SCROLLABLE_STATE_PADDINGS", "TABS_GAP_PADDING", "TABS", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DtoFieldName {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DtoFieldName[] $VALUES;

        @NotNull
        private final String jsonName;
        public static final DtoFieldName RADIUS = new DtoFieldName("RADIUS", 0, "radius");
        public static final DtoFieldName SCROLLABLE_STATE_PADDINGS = new DtoFieldName("SCROLLABLE_STATE_PADDINGS", 1, "scrollableStatePaddings");
        public static final DtoFieldName TABS_GAP_PADDING = new DtoFieldName("TABS_GAP_PADDING", 2, "tabsGapPadding");
        public static final DtoFieldName TABS = new DtoFieldName("TABS", 3, DynamicElementDTO.TABS);

        private static final /* synthetic */ DtoFieldName[] $values() {
            return new DtoFieldName[]{RADIUS, SCROLLABLE_STATE_PADDINGS, TABS_GAP_PADDING, TABS};
        }

        static {
            DtoFieldName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DtoFieldName(String str, int i11, String str2) {
            this.jsonName = str2;
        }

        @NotNull
        public static a<DtoFieldName> getEntries() {
            return $ENTRIES;
        }

        public static DtoFieldName valueOf(String str) {
            return (DtoFieldName) Enum.valueOf(DtoFieldName.class, str);
        }

        public static DtoFieldName[] values() {
            return (DtoFieldName[]) $VALUES.clone();
        }

        @NotNull
        public final String getJsonName() {
            return this.jsonName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$DtoPaddingsFieldName;", "", "jsonName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsonName", "()Ljava/lang/String;", "LEFT_PADDING", "RIGHT_PADDING", "TOP_PADDING", "BOTTOM_PADDING", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DtoPaddingsFieldName {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DtoPaddingsFieldName[] $VALUES;

        @NotNull
        private final String jsonName;
        public static final DtoPaddingsFieldName LEFT_PADDING = new DtoPaddingsFieldName("LEFT_PADDING", 0, "leftPadding");
        public static final DtoPaddingsFieldName RIGHT_PADDING = new DtoPaddingsFieldName("RIGHT_PADDING", 1, "rightPadding");
        public static final DtoPaddingsFieldName TOP_PADDING = new DtoPaddingsFieldName("TOP_PADDING", 2, "topPadding");
        public static final DtoPaddingsFieldName BOTTOM_PADDING = new DtoPaddingsFieldName("BOTTOM_PADDING", 3, "bottomPadding");

        private static final /* synthetic */ DtoPaddingsFieldName[] $values() {
            return new DtoPaddingsFieldName[]{LEFT_PADDING, RIGHT_PADDING, TOP_PADDING, BOTTOM_PADDING};
        }

        static {
            DtoPaddingsFieldName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DtoPaddingsFieldName(String str, int i11, String str2) {
            this.jsonName = str2;
        }

        @NotNull
        public static a<DtoPaddingsFieldName> getEntries() {
            return $ENTRIES;
        }

        public static DtoPaddingsFieldName valueOf(String str) {
            return (DtoPaddingsFieldName) Enum.valueOf(DtoPaddingsFieldName.class, str);
        }

        public static DtoPaddingsFieldName[] values() {
            return (DtoPaddingsFieldName[]) $VALUES.clone();
        }

        @NotNull
        public final String getJsonName() {
            return this.jsonName;
        }
    }

    public CatalogueTabsDTO(@NotNull CornerRadius radius, @NotNull CatalogueTabsPaddings scrollableStatePaddings, @NotNull CommonCellSettings.LayoutPadding tabsGapPadding, @NotNull List<CatalogueTabsSingleTab> tabs) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(scrollableStatePaddings, "scrollableStatePaddings");
        Intrinsics.checkNotNullParameter(tabsGapPadding, "tabsGapPadding");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.radius = radius;
        this.scrollableStatePaddings = scrollableStatePaddings;
        this.tabsGapPadding = tabsGapPadding;
        this.tabs = tabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CatalogueTabsDTO copy$default(CatalogueTabsDTO catalogueTabsDTO, CornerRadius cornerRadius, CatalogueTabsPaddings catalogueTabsPaddings, CommonCellSettings.LayoutPadding layoutPadding, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cornerRadius = catalogueTabsDTO.radius;
        }
        if ((i11 & 2) != 0) {
            catalogueTabsPaddings = catalogueTabsDTO.scrollableStatePaddings;
        }
        if ((i11 & 4) != 0) {
            layoutPadding = catalogueTabsDTO.tabsGapPadding;
        }
        if ((i11 & 8) != 0) {
            list = catalogueTabsDTO.tabs;
        }
        return catalogueTabsDTO.copy(cornerRadius, catalogueTabsPaddings, layoutPadding, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CornerRadius getRadius() {
        return this.radius;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CatalogueTabsPaddings getScrollableStatePaddings() {
        return this.scrollableStatePaddings;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTabsGapPadding() {
        return this.tabsGapPadding;
    }

    @NotNull
    public final List<CatalogueTabsSingleTab> component4() {
        return this.tabs;
    }

    @NotNull
    public final CatalogueTabsDTO copy(@NotNull CornerRadius radius, @NotNull CatalogueTabsPaddings scrollableStatePaddings, @NotNull CommonCellSettings.LayoutPadding tabsGapPadding, @NotNull List<CatalogueTabsSingleTab> tabs) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(scrollableStatePaddings, "scrollableStatePaddings");
        Intrinsics.checkNotNullParameter(tabsGapPadding, "tabsGapPadding");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new CatalogueTabsDTO(radius, scrollableStatePaddings, tabsGapPadding, tabs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogueTabsDTO)) {
            return false;
        }
        CatalogueTabsDTO catalogueTabsDTO = (CatalogueTabsDTO) other;
        return this.radius == catalogueTabsDTO.radius && Intrinsics.d(this.scrollableStatePaddings, catalogueTabsDTO.scrollableStatePaddings) && this.tabsGapPadding == catalogueTabsDTO.tabsGapPadding && Intrinsics.d(this.tabs, catalogueTabsDTO.tabs);
    }

    @NotNull
    public final CornerRadius getRadius() {
        return this.radius;
    }

    @NotNull
    public final CatalogueTabsPaddings getScrollableStatePaddings() {
        return this.scrollableStatePaddings;
    }

    @NotNull
    public final List<CatalogueTabsSingleTab> getTabs() {
        return this.tabs;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getTabsGapPadding() {
        return this.tabsGapPadding;
    }

    public int hashCode() {
        return this.tabs.hashCode() + c.a(this.tabsGapPadding, (this.scrollableStatePaddings.hashCode() + (this.radius.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "CatalogueTabsDTO(radius=" + this.radius + ", scrollableStatePaddings=" + this.scrollableStatePaddings + ", tabsGapPadding=" + this.tabsGapPadding + ", tabs=" + this.tabs + ")";
    }
}
