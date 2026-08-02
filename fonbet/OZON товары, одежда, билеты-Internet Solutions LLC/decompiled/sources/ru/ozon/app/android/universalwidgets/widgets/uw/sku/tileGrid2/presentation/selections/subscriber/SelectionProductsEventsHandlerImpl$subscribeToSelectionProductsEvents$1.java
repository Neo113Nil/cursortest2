package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SelectionProductsEventsHandlerImpl$subscribeToSelectionProductsEvents$1 extends C7719a implements Function2<SelectionProductEvent, d<? super Unit>, Object> {
    SelectionProductsEventsHandlerImpl$subscribeToSelectionProductsEvents$1(Object obj) {
        super(2, obj, SelectionProductsEventsHandlerImpl.class, "onEvent", "onEvent(Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SelectionProductEvent selectionProductEvent, d<? super Unit> dVar) {
        Object subscribeToSelectionProductsEvents$onEvent;
        subscribeToSelectionProductsEvents$onEvent = SelectionProductsEventsHandlerImpl.subscribeToSelectionProductsEvents$onEvent((SelectionProductsEventsHandlerImpl) this.receiver, selectionProductEvent, dVar);
        return subscribeToSelectionProductsEvents$onEvent;
    }
}
