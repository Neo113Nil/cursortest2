package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CatalogTabsV2OverlayViewHolder$tagsAdapter$2 extends C7735q implements Function1<CatalogTabsV2VO.Tab, Unit> {
    CatalogTabsV2OverlayViewHolder$tagsAdapter$2(Object obj) {
        super(1, obj, CatalogTabsV2OverlayViewHolder.class, "onCatalogueTabsItemClicked", "onCatalogueTabsItemClicked(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CatalogTabsV2VO.Tab tab) {
        invoke2(tab);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CatalogTabsV2VO.Tab p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CatalogTabsV2OverlayViewHolder) this.receiver).onCatalogueTabsItemClicked(p02);
    }
}
