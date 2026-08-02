package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManager;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandlerImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2BindStrategyPicker$createBindStrategy$tileGrid2ViewHolderBinder$1 extends AbstractC7737t implements Function0<SelectionProductsEventsHandler> {
    final /* synthetic */ TileGrid2BaseViewBinding $viewBinding;
    final /* synthetic */ TileGrid2BindStrategyPicker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2BindStrategyPicker$createBindStrategy$tileGrid2ViewHolderBinder$1(TileGrid2BindStrategyPicker tileGrid2BindStrategyPicker, TileGrid2BaseViewBinding tileGrid2BaseViewBinding) {
        super(0);
        this.this$0 = tileGrid2BindStrategyPicker;
        this.$viewBinding = tileGrid2BaseViewBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SelectionProductsEventsHandler invoke() {
        SelectionProductsEventManager selectionProductsEventManager;
        HashMap hashMap;
        TileOverlayBinder tileOverlayBinder;
        selectionProductsEventManager = this.this$0.selectionProductsEventManager;
        hashMap = this.this$0.selectionProductsEventsMap;
        tileOverlayBinder = this.this$0.overlayBinder;
        return new SelectionProductsEventsHandlerImpl.Creator(selectionProductsEventManager, hashMap, tileOverlayBinder).createForRoot(this.$viewBinding);
    }
}
