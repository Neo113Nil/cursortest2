package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/TimerHelper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV2AnimationDelegate$timer$2 extends AbstractC7737t implements Function0<TimerHelper> {
    final /* synthetic */ DeliveryWidgetV2AnimationDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2AnimationDelegate$timer$2(DeliveryWidgetV2AnimationDelegate deliveryWidgetV2AnimationDelegate) {
        super(0);
        this.this$0 = deliveryWidgetV2AnimationDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TimerHelper invoke() {
        M m11;
        m11 = this.this$0.coroutineScope;
        return new TimerHelper(m11);
    }
}
