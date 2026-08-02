package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import l10.i;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.SelectTabEvent;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation.CatalogueTabsViewHolder$softScrollToSelectedWidget$1", f = "CatalogueTabsViewHolder.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CatalogueTabsViewHolder$softScrollToSelectedWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CatalogueTabsVO.CatalogueTabsSingleTab $this_softScrollToSelectedWidget;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CatalogueTabsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogueTabsViewHolder$softScrollToSelectedWidget$1(CatalogueTabsViewHolder catalogueTabsViewHolder, CatalogueTabsVO.CatalogueTabsSingleTab catalogueTabsSingleTab, d<? super CatalogueTabsViewHolder$softScrollToSelectedWidget$1> dVar) {
        super(2, dVar);
        this.this$0 = catalogueTabsViewHolder;
        this.$this_softScrollToSelectedWidget = catalogueTabsSingleTab;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CatalogueTabsViewHolder$softScrollToSelectedWidget$1(this.this$0, this.$this_softScrollToSelectedWidget, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CatalogueTabsViewHolder catalogueTabsViewHolder;
        Object scrollToStartIfNecessary;
        CatalogueTabsVO.CatalogueTabsSingleTab catalogueTabsSingleTab;
        i iVar;
        i iVar2;
        int appBarHeight;
        RecyclerView recyclerView;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CatalogueTabsVO boundData = this.this$0.getBoundData();
            if (boundData != null) {
                catalogueTabsViewHolder = this.this$0;
                CatalogueTabsVO.CatalogueTabsSingleTab catalogueTabsSingleTab2 = this.$this_softScrollToSelectedWidget;
                this.L$0 = catalogueTabsViewHolder;
                this.L$1 = catalogueTabsSingleTab2;
                this.label = 1;
                scrollToStartIfNecessary = catalogueTabsViewHolder.scrollToStartIfNecessary(catalogueTabsSingleTab2, boundData, this);
                if (scrollToStartIfNecessary == aVar) {
                    return aVar;
                }
                catalogueTabsSingleTab = catalogueTabsSingleTab2;
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        catalogueTabsSingleTab = (CatalogueTabsVO.CatalogueTabsSingleTab) this.L$1;
        catalogueTabsViewHolder = (CatalogueTabsViewHolder) this.L$0;
        s.b(obj);
        iVar = catalogueTabsViewHolder.container;
        iVar.M().update(new SelectTabEvent(catalogueTabsSingleTab.getWidgetScrollKey()));
        iVar2 = catalogueTabsViewHolder.container;
        InterfaceC7851b M11 = iVar2.M();
        int widgetScrollKey = catalogueTabsSingleTab.getWidgetScrollKey();
        appBarHeight = catalogueTabsViewHolder.getAppBarHeight();
        recyclerView = catalogueTabsViewHolder.view;
        M11.o(widgetScrollKey, recyclerView.getHeight() + appBarHeight, true, false);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CatalogueTabsViewHolder$softScrollToSelectedWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
