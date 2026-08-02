package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer;

import A00.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TileGrid2CartContainerViewMapper$constructLayout$2 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ TileGrid2CartContainerViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2CartContainerViewMapper$constructLayout$2(TileGrid2CartContainerViewMapper tileGrid2CartContainerViewMapper) {
        super(1);
        this.this$0 = tileGrid2CartContainerViewMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HashMap<SelectionProductsTileKey, SelectionProductEvent> selectionProductsEventsMap = this.this$0.component().getSelectionProductsEventsMap();
        if (!selectionProductsEventsMap.isEmpty()) {
            selectionProductsEventsMap.clear();
        }
        this.this$0.component().getWishlistServiceLazy().getValue().clear();
    }
}
