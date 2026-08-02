package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper;

import B0.C2454a;
import G.g;
import Tl.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.ScrollTabAnchor;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00018BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jp\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "", "stickyStateTopCornersRadius", "nonStickyStateTopCornersRadius", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "tabsPaddings", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "tabsGapPadding", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;", DynamicElementDTO.TABS, "selectedTabIndex", "", "selectedTabChanged", "<init>", "(JIFFLru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/util/List;IZ)V", "copy", "(JIFFLru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/util/List;IZ)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getScrollWidgetKey", "()Ljava/lang/Integer;", "F", "getStickyStateTopCornersRadius", "()F", "getNonStickyStateTopCornersRadius", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "getTabsPaddings", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTabsGapPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "getSelectedTabIndex", "Z", "getSelectedTabChanged", "()Z", "CatalogueTabsSingleTab", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogueTabsVO implements c {
    private final long id;
    private final float nonStickyStateTopCornersRadius;
    private final int scrollWidgetKey;
    private final boolean selectedTabChanged;
    private final int selectedTabIndex;
    private final float stickyStateTopCornersRadius;

    @NotNull
    private final List<CatalogueTabsSingleTab> tabs;

    @NotNull
    private final CommonCellSettings.LayoutPadding tabsGapPadding;

    @NotNull
    private final CatalogueTabsDTO.CatalogueTabsPaddings tabsPaddings;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/scroll/ScrollTabAnchor;", "", "widgetScrollKey", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "chip", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(ILru/ozon/uni/atoms/data/controls/chip/ChipDTO;LWZ/t;)V", "copy", "(ILru/ozon/uni/atoms/data/controls/chip/ChipDTO;LWZ/t;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidgetScrollKey", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "getChip", "()Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CatalogueTabsSingleTab implements ScrollTabAnchor {

        @NotNull
        private final ChipDTO chip;
        private final t tokenizedEvent;
        private final int widgetScrollKey;

        public CatalogueTabsSingleTab(int i11, @NotNull ChipDTO chip, t tVar) {
            Intrinsics.checkNotNullParameter(chip, "chip");
            this.widgetScrollKey = i11;
            this.chip = chip;
            this.tokenizedEvent = tVar;
        }

        public static /* synthetic */ CatalogueTabsSingleTab copy$default(CatalogueTabsSingleTab catalogueTabsSingleTab, int i11, ChipDTO chipDTO, t tVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = catalogueTabsSingleTab.widgetScrollKey;
            }
            if ((i12 & 2) != 0) {
                chipDTO = catalogueTabsSingleTab.chip;
            }
            if ((i12 & 4) != 0) {
                tVar = catalogueTabsSingleTab.tokenizedEvent;
            }
            return catalogueTabsSingleTab.copy(i11, chipDTO, tVar);
        }

        @NotNull
        public final CatalogueTabsSingleTab copy(int widgetScrollKey, @NotNull ChipDTO chip, t tokenizedEvent) {
            Intrinsics.checkNotNullParameter(chip, "chip");
            return new CatalogueTabsSingleTab(widgetScrollKey, chip, tokenizedEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CatalogueTabsSingleTab)) {
                return false;
            }
            CatalogueTabsSingleTab catalogueTabsSingleTab = (CatalogueTabsSingleTab) other;
            return this.widgetScrollKey == catalogueTabsSingleTab.widgetScrollKey && Intrinsics.d(this.chip, catalogueTabsSingleTab.chip) && Intrinsics.d(this.tokenizedEvent, catalogueTabsSingleTab.tokenizedEvent);
        }

        @NotNull
        public final ChipDTO getChip() {
            return this.chip;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.ScrollTabAnchor
        public int getWidgetScrollKey() {
            return this.widgetScrollKey;
        }

        public int hashCode() {
            int hashCode = (this.chip.hashCode() + (Integer.hashCode(this.widgetScrollKey) * 31)) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.widgetScrollKey;
            ChipDTO chipDTO = this.chip;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("CatalogueTabsSingleTab(widgetScrollKey=");
            sb2.append(i11);
            sb2.append(", chip=");
            sb2.append(chipDTO);
            sb2.append(", tokenizedEvent=");
            return b.d(sb2, tVar, ")");
        }
    }

    public CatalogueTabsVO(long j11, int i11, float f7, float f11, @NotNull CatalogueTabsDTO.CatalogueTabsPaddings tabsPaddings, @NotNull CommonCellSettings.LayoutPadding tabsGapPadding, @NotNull List<CatalogueTabsSingleTab> tabs, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(tabsPaddings, "tabsPaddings");
        Intrinsics.checkNotNullParameter(tabsGapPadding, "tabsGapPadding");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.scrollWidgetKey = i11;
        this.stickyStateTopCornersRadius = f7;
        this.nonStickyStateTopCornersRadius = f11;
        this.tabsPaddings = tabsPaddings;
        this.tabsGapPadding = tabsGapPadding;
        this.tabs = tabs;
        this.selectedTabIndex = i12;
        this.selectedTabChanged = z11;
    }

    public static /* synthetic */ CatalogueTabsVO copy$default(CatalogueTabsVO catalogueTabsVO, long j11, int i11, float f7, float f11, CatalogueTabsDTO.CatalogueTabsPaddings catalogueTabsPaddings, CommonCellSettings.LayoutPadding layoutPadding, List list, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = catalogueTabsVO.id;
        }
        long j12 = j11;
        if ((i13 & 2) != 0) {
            i11 = catalogueTabsVO.scrollWidgetKey;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            f7 = catalogueTabsVO.stickyStateTopCornersRadius;
        }
        return catalogueTabsVO.copy(j12, i14, f7, (i13 & 8) != 0 ? catalogueTabsVO.nonStickyStateTopCornersRadius : f11, (i13 & 16) != 0 ? catalogueTabsVO.tabsPaddings : catalogueTabsPaddings, (i13 & 32) != 0 ? catalogueTabsVO.tabsGapPadding : layoutPadding, (i13 & 64) != 0 ? catalogueTabsVO.tabs : list, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? catalogueTabsVO.selectedTabIndex : i12, (i13 & 256) != 0 ? catalogueTabsVO.selectedTabChanged : z11);
    }

    @NotNull
    public final CatalogueTabsVO copy(long id2, int scrollWidgetKey, float stickyStateTopCornersRadius, float nonStickyStateTopCornersRadius, @NotNull CatalogueTabsDTO.CatalogueTabsPaddings tabsPaddings, @NotNull CommonCellSettings.LayoutPadding tabsGapPadding, @NotNull List<CatalogueTabsSingleTab> tabs, int selectedTabIndex, boolean selectedTabChanged) {
        Intrinsics.checkNotNullParameter(tabsPaddings, "tabsPaddings");
        Intrinsics.checkNotNullParameter(tabsGapPadding, "tabsGapPadding");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new CatalogueTabsVO(id2, scrollWidgetKey, stickyStateTopCornersRadius, nonStickyStateTopCornersRadius, tabsPaddings, tabsGapPadding, tabs, selectedTabIndex, selectedTabChanged);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogueTabsVO)) {
            return false;
        }
        CatalogueTabsVO catalogueTabsVO = (CatalogueTabsVO) other;
        return this.id == catalogueTabsVO.id && this.scrollWidgetKey == catalogueTabsVO.scrollWidgetKey && Float.compare(this.stickyStateTopCornersRadius, catalogueTabsVO.stickyStateTopCornersRadius) == 0 && Float.compare(this.nonStickyStateTopCornersRadius, catalogueTabsVO.nonStickyStateTopCornersRadius) == 0 && Intrinsics.d(this.tabsPaddings, catalogueTabsVO.tabsPaddings) && this.tabsGapPadding == catalogueTabsVO.tabsGapPadding && Intrinsics.d(this.tabs, catalogueTabsVO.tabs) && this.selectedTabIndex == catalogueTabsVO.selectedTabIndex && this.selectedTabChanged == catalogueTabsVO.selectedTabChanged;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final float getNonStickyStateTopCornersRadius() {
        return this.nonStickyStateTopCornersRadius;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.scrollWidgetKey);
    }

    public final boolean getSelectedTabChanged() {
        return this.selectedTabChanged;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final float getStickyStateTopCornersRadius() {
        return this.stickyStateTopCornersRadius;
    }

    @NotNull
    public final List<CatalogueTabsSingleTab> getTabs() {
        return this.tabs;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getTabsGapPadding() {
        return this.tabsGapPadding;
    }

    @NotNull
    public final CatalogueTabsDTO.CatalogueTabsPaddings getTabsPaddings() {
        return this.tabsPaddings;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.selectedTabChanged) + C2454a.a(this.selectedTabIndex, g.b(Ef0.c.a(this.tabsGapPadding, (this.tabsPaddings.hashCode() + Pk0.b.a(this.nonStickyStateTopCornersRadius, Pk0.b.a(this.stickyStateTopCornersRadius, C2454a.a(this.scrollWidgetKey, Long.hashCode(this.id) * 31, 31), 31), 31)) * 31, 31), 31, this.tabs), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.scrollWidgetKey;
        float f7 = this.stickyStateTopCornersRadius;
        float f11 = this.nonStickyStateTopCornersRadius;
        CatalogueTabsDTO.CatalogueTabsPaddings catalogueTabsPaddings = this.tabsPaddings;
        CommonCellSettings.LayoutPadding layoutPadding = this.tabsGapPadding;
        List<CatalogueTabsSingleTab> list = this.tabs;
        int i12 = this.selectedTabIndex;
        boolean z11 = this.selectedTabChanged;
        StringBuilder b11 = Ql.c.b(j11, "CatalogueTabsVO(id=", i11, ", scrollWidgetKey=");
        b11.append(", stickyStateTopCornersRadius=");
        b11.append(f7);
        b11.append(", nonStickyStateTopCornersRadius=");
        b11.append(f11);
        b11.append(", tabsPaddings=");
        b11.append(catalogueTabsPaddings);
        b11.append(", tabsGapPadding=");
        b11.append(layoutPadding);
        b11.append(", tabs=");
        b11.append(list);
        b11.append(", selectedTabIndex=");
        b11.append(i12);
        return Bi.b.f(b11, ", selectedTabChanged=", z11, ")");
    }
}
