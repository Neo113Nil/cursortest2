package ru.ozon.app.android.pdp.widgets.deliveryV6.core.async;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncPlaceholderViewModel;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryV6AsyncPlaceholderViewMapper$constructLayout$2 extends AbstractC7737t implements Function1<DeliveryV6AsyncPlaceholderViewModel.Event, Unit> {
    final /* synthetic */ i $container;
    final /* synthetic */ l $viewItem;
    final /* synthetic */ DeliveryV6AsyncPlaceholderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryV6AsyncPlaceholderViewMapper$constructLayout$2(DeliveryV6AsyncPlaceholderViewMapper deliveryV6AsyncPlaceholderViewMapper, l lVar, i iVar) {
        super(1);
        this.this$0 = deliveryV6AsyncPlaceholderViewMapper;
        this.$viewItem = lVar;
        this.$container = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DeliveryV6AsyncPlaceholderViewModel.Event event) {
        invoke2(event);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DeliveryV6AsyncPlaceholderViewModel.Event event) {
        if (event instanceof DeliveryV6AsyncPlaceholderViewModel.Event.OnWidgetFetched) {
            this.this$0.onAsyncWidgetFetched((DeliveryV6AsyncPlaceholderViewModel.Event.OnWidgetFetched) event, this.$viewItem, this.$container);
        } else {
            if (!(event instanceof DeliveryV6AsyncPlaceholderViewModel.Event.OnWidgetFetchingFailed)) {
                throw new o();
            }
            this.this$0.onAsyncWidgetFetchingFailed(this.$viewItem, this.$container);
        }
    }
}
