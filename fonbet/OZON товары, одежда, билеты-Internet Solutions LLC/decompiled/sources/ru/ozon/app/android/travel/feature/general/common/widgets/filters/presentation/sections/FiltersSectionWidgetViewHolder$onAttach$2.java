package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.FiltersSectionView;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FiltersSectionWidgetViewHolder$onAttach$2 extends C7735q implements Function1<TabsDTO, Unit> {
    FiltersSectionWidgetViewHolder$onAttach$2(Object obj) {
        super(1, obj, FiltersSectionView.class, "setTabsWithTitleFilter", "setTabsWithTitleFilter(Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TabsDTO tabsDTO) {
        invoke2(tabsDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TabsDTO tabsDTO) {
        ((FiltersSectionView) this.receiver).setTabsWithTitleFilter(tabsDTO);
    }
}
