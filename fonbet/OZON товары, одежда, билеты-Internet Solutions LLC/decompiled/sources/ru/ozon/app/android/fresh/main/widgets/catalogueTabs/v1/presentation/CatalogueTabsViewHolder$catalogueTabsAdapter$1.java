package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CatalogueTabsViewHolder$catalogueTabsAdapter$1 extends C7735q implements Function1<CatalogueTabsVO.CatalogueTabsSingleTab, Unit> {
    CatalogueTabsViewHolder$catalogueTabsAdapter$1(Object obj) {
        super(1, obj, CatalogueTabsViewHolder.class, "onCatalogueTabsItemClicked", "onCatalogueTabsItemClicked(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CatalogueTabsVO.CatalogueTabsSingleTab catalogueTabsSingleTab) {
        invoke2(catalogueTabsSingleTab);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CatalogueTabsVO.CatalogueTabsSingleTab p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CatalogueTabsViewHolder) this.receiver).onCatalogueTabsItemClicked(p02);
    }
}
