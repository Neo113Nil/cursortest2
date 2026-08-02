package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max;

import android.view.View;
import androidx.lifecycle.B0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModel;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModelFactoryKt;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2Component;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CatalogTabsV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CatalogTabsV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CatalogTabsV2ViewHolder> {
    final /* synthetic */ CatalogTabsV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogTabsV2ViewMapper$holderProducer$1(CatalogTabsV2ViewMapper catalogTabsV2ViewMapper) {
        super(2);
        this.this$0 = catalogTabsV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CatalogTabsV2ViewHolder invoke(View view, ComposerReferences refs) {
        CatalogTabsV2Component catalogTabsV2Component;
        CatalogTabsV2Component catalogTabsV2Component2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        catalogTabsV2Component = this.this$0.tabsComponent;
        CatalogueTabsViewModel createCatalogueTabsViewModel = CatalogueTabsViewModelFactoryKt.createCatalogueTabsViewModel(a11, catalogTabsV2Component.getCatalogTabsSharedViewModelProvider());
        catalogTabsV2Component2 = this.this$0.tabsComponent;
        return new CatalogTabsV2ViewHolder((CloudTabsLayout) view, refs, createCatalogueTabsViewModel, catalogTabsV2Component2.getTokenizedAnalytics());
    }
}
