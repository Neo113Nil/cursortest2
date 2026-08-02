package ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.mapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.request.SendDeliveryReviewFormRequest;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/request/SendDeliveryReviewFormRequest$Component;", "it", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SendDeliveryReviewFormRequestMapper$map$components$3 extends AbstractC7737t implements Function1<ComponentVO, SendDeliveryReviewFormRequest.Component> {
    final /* synthetic */ SendDeliveryReviewFormRequestMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendDeliveryReviewFormRequestMapper$map$components$3(SendDeliveryReviewFormRequestMapper sendDeliveryReviewFormRequestMapper) {
        super(1);
        this.this$0 = sendDeliveryReviewFormRequestMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SendDeliveryReviewFormRequest.Component invoke(ComponentVO it) {
        SendDeliveryReviewFormRequest.Component requestComponent;
        Intrinsics.checkNotNullParameter(it, "it");
        requestComponent = this.this$0.toRequestComponent(it);
        return requestComponent;
    }
}
