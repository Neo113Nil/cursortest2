package ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.mapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "invoke", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SendDeliveryReviewFormRequestMapper$map$components$2 extends AbstractC7737t implements Function1<ComponentVO, Boolean> {
    final /* synthetic */ SendDeliveryReviewFormRequestMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendDeliveryReviewFormRequestMapper$map$components$2(SendDeliveryReviewFormRequestMapper sendDeliveryReviewFormRequestMapper) {
        super(1);
        this.this$0 = sendDeliveryReviewFormRequestMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ComponentVO it) {
        boolean z11;
        boolean isNotEmpty;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.getHidden()) {
            isNotEmpty = this.this$0.isNotEmpty(it.getElement());
            if (isNotEmpty) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
