package ru.ozon.app.android.commonwidgets.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.common.disclaimer.DisclaimerViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cell.core.CellConfig;
import ru.ozon.app.android.commonwidgets.widgets.cell.core.CellViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cellList.core.CellListConfig;
import ru.ozon.app.android.commonwidgets.widgets.cellList.core.CellListHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cellList.core.CellListViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.disclaimer.data.DisclaimerConfig;
import ru.ozon.app.android.commonwidgets.widgets.emptyState.core.CommonEmptyStateViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.emptyState.core.EmptyStateConfig;
import ru.ozon.app.android.commonwidgets.widgets.headerWidget.data.PageHeaderConfig;
import ru.ozon.app.android.commonwidgets.widgets.headerWidget.presentation.PageHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.pixel.data.PixelConfig;
import ru.ozon.app.android.commonwidgets.widgets.pixel.presentation.PixelViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.core.RestrictionsConfig;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.core.RestrictionsNoUIViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsConfig;
import ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0096\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0007¨\u0006)"}, d2 = {"Lru/ozon/app/android/commonwidgets/di/CommonWidgetsV1DiModule;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/di/Widget;", "pageHeaderConfig", "Lru/ozon/app/android/commonwidgets/widgets/headerWidget/data/PageHeaderConfig;", "pageHeaderWidgetViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/headerWidget/presentation/PageHeaderViewMapper;", "cellConfig", "Lru/ozon/app/android/commonwidgets/widgets/cell/core/CellConfig;", "cellViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/cell/core/CellViewMapper;", "tabsConfig", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsConfig;", "tabsViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper;", "cellListConfig", "Lru/ozon/app/android/commonwidgets/widgets/cellList/core/CellListConfig;", "cellListHeaderViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/cellList/core/CellListHeaderViewMapper;", "cellListViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/cellList/core/CellListViewMapper;", "pixelViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/pixel/presentation/PixelViewMapper;", "pixelConfig", "Lru/ozon/app/android/commonwidgets/widgets/pixel/data/PixelConfig;", "disclaimerViewMapper", "Lru/ozon/app/android/common/disclaimer/DisclaimerViewMapper;", "disclaimerConfig", "Lru/ozon/app/android/commonwidgets/widgets/disclaimer/data/DisclaimerConfig;", "emptyStateConfig", "Lru/ozon/app/android/commonwidgets/widgets/emptyState/core/EmptyStateConfig;", "emptyStateViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/emptyState/core/CommonEmptyStateViewMapper;", "restrictionsConfig", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsConfig;", "restrictionsNoUIViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsNoUIViewMapper;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonWidgetsV1DiModule {

    @NotNull
    public static final CommonWidgetsV1DiModule INSTANCE = new CommonWidgetsV1DiModule();

    private CommonWidgetsV1DiModule() {
    }

    @NotNull
    public final Set<Widget> provideWidget(@NotNull PageHeaderConfig pageHeaderConfig, @NotNull PageHeaderViewMapper pageHeaderWidgetViewMapper, @NotNull CellConfig cellConfig, @NotNull CellViewMapper cellViewMapper, @NotNull TabsConfig tabsConfig, @NotNull TabsViewMapper tabsViewMapper, @NotNull CellListConfig cellListConfig, @NotNull CellListHeaderViewMapper cellListHeaderViewMapper, @NotNull CellListViewMapper cellListViewMapper, @NotNull PixelViewMapper pixelViewMapper, @NotNull PixelConfig pixelConfig, @NotNull DisclaimerViewMapper disclaimerViewMapper, @NotNull DisclaimerConfig disclaimerConfig, @NotNull EmptyStateConfig emptyStateConfig, @NotNull CommonEmptyStateViewMapper emptyStateViewMapper, @NotNull RestrictionsConfig restrictionsConfig, @NotNull RestrictionsNoUIViewMapper restrictionsNoUIViewMapper) {
        Intrinsics.checkNotNullParameter(pageHeaderConfig, "pageHeaderConfig");
        Intrinsics.checkNotNullParameter(pageHeaderWidgetViewMapper, "pageHeaderWidgetViewMapper");
        Intrinsics.checkNotNullParameter(cellConfig, "cellConfig");
        Intrinsics.checkNotNullParameter(cellViewMapper, "cellViewMapper");
        Intrinsics.checkNotNullParameter(tabsConfig, "tabsConfig");
        Intrinsics.checkNotNullParameter(tabsViewMapper, "tabsViewMapper");
        Intrinsics.checkNotNullParameter(cellListConfig, "cellListConfig");
        Intrinsics.checkNotNullParameter(cellListHeaderViewMapper, "cellListHeaderViewMapper");
        Intrinsics.checkNotNullParameter(cellListViewMapper, "cellListViewMapper");
        Intrinsics.checkNotNullParameter(pixelViewMapper, "pixelViewMapper");
        Intrinsics.checkNotNullParameter(pixelConfig, "pixelConfig");
        Intrinsics.checkNotNullParameter(disclaimerViewMapper, "disclaimerViewMapper");
        Intrinsics.checkNotNullParameter(disclaimerConfig, "disclaimerConfig");
        Intrinsics.checkNotNullParameter(emptyStateConfig, "emptyStateConfig");
        Intrinsics.checkNotNullParameter(emptyStateViewMapper, "emptyStateViewMapper");
        Intrinsics.checkNotNullParameter(restrictionsConfig, "restrictionsConfig");
        Intrinsics.checkNotNullParameter(restrictionsNoUIViewMapper, "restrictionsNoUIViewMapper");
        Widget[] elements = {new Widget("common", "pageHeader", pageHeaderConfig, new PageHeaderViewMapper[]{pageHeaderWidgetViewMapper}), new Widget("common", "cell", cellConfig, new CellViewMapper[]{cellViewMapper}), new Widget("common", DynamicElementDTO.TABS, tabsConfig, new TabsViewMapper[]{tabsViewMapper}), new Widget("common", "cellList", cellListConfig, new WidgetViewMapper[]{cellListHeaderViewMapper, cellListViewMapper}), new Widget("common", "pixel", pixelConfig, new PixelViewMapper[]{pixelViewMapper}), new Widget("common", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, disclaimerConfig, new DisclaimerViewMapper[]{disclaimerViewMapper}), new Widget("common", "emptyState", emptyStateConfig, new CommonEmptyStateViewMapper[]{emptyStateViewMapper}), new Widget("common", "restrictions", restrictionsConfig, new RestrictionsNoUIViewMapper[]{restrictionsNoUIViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
