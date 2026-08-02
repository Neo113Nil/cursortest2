package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.viewMapper;

import A00.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.SelectTabEvent;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsVO;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/viewMapper/CatalogueTabsUpdateConsumer;", "Lkotlin/Function2;", "LA00/a$J$a;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;", "<init>", "()V", "oldVO", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/SelectTabEvent;", "update", "processSelectTabEvent", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/SelectTabEvent;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsUpdateConsumer implements Function2<a.J.InterfaceC0007a, CatalogueTabsVO, CatalogueTabsVO> {
    private final CatalogueTabsVO processSelectTabEvent(CatalogueTabsVO oldVO, SelectTabEvent update) {
        CatalogueTabsVO.CatalogueTabsSingleTab copy$default;
        List<CatalogueTabsVO.CatalogueTabsSingleTab> tabs = oldVO.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        int i11 = 0;
        int i12 = 0;
        for (Object obj : tabs) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CatalogueTabsVO.CatalogueTabsSingleTab catalogueTabsSingleTab = (CatalogueTabsVO.CatalogueTabsSingleTab) obj;
            if (catalogueTabsSingleTab.getWidgetScrollKey() == update.getScrollKey()) {
                copy$default = CatalogueTabsVO.CatalogueTabsSingleTab.copy$default(catalogueTabsSingleTab, 0, ChipDTO.copy$default(catalogueTabsSingleTab.getChip(), null, null, ChipState.SELECTED, null, null, null, null, 123, null), null, 5, null);
                i12 = i11;
            } else {
                copy$default = CatalogueTabsVO.CatalogueTabsSingleTab.copy$default(catalogueTabsSingleTab, 0, ChipDTO.copy$default(catalogueTabsSingleTab.getChip(), null, null, ChipState.ENABLED, null, null, null, null, 123, null), null, 5, null);
            }
            arrayList.add(copy$default);
            i11 = i13;
        }
        return CatalogueTabsVO.copy$default(oldVO, 0L, 0, 0.0f, 0.0f, null, null, arrayList, i12, oldVO.getSelectedTabIndex() != i12, 63, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public CatalogueTabsVO invoke(@NotNull a.J.InterfaceC0007a update, @NotNull CatalogueTabsVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        return update instanceof SelectTabEvent ? processSelectTabEvent(oldVO, (SelectTabEvent) update) : oldVO;
    }
}
