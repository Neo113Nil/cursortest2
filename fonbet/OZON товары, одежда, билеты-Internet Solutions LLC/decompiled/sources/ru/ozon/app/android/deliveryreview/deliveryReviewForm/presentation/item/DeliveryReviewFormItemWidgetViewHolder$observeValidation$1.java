package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.BaseDeliveryReviewValidator;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DeliveryReviewFormItemWidgetViewHolder$observeValidation$1 extends AbstractC7737t implements Function1<BaseDeliveryReviewValidator.ValidationResult, Unit> {
    final /* synthetic */ DeliveryReviewFormItemWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryReviewFormItemWidgetViewHolder$observeValidation$1(DeliveryReviewFormItemWidgetViewHolder deliveryReviewFormItemWidgetViewHolder) {
        super(1);
        this.this$0 = deliveryReviewFormItemWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BaseDeliveryReviewValidator.ValidationResult validationResult) {
        invoke2(validationResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BaseDeliveryReviewValidator.ValidationResult validationResult) {
        boolean z11;
        DeliveryReviewFormItemVO deliveryReviewFormItemVO;
        if (validationResult instanceof BaseDeliveryReviewValidator.ValidationResult.Error) {
            Integer errorGroupId = ((BaseDeliveryReviewValidator.ValidationResult.Error) validationResult).getErrorGroupId();
            deliveryReviewFormItemVO = this.this$0.groupItemVo;
            if (Intrinsics.d(errorGroupId, deliveryReviewFormItemVO != null ? Integer.valueOf(deliveryReviewFormItemVO.getGroupId()) : null)) {
                z11 = true;
                this.this$0.setErrorIfNeed(z11);
            }
        }
        z11 = false;
        this.this$0.setErrorIfNeed(z11);
    }
}
