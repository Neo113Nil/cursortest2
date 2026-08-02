package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.footer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewFooterBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.BaseDeliveryReviewValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormFooterVO;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "validationResult", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DeliveryReviewFormFooterViewHolder$observeValidation$1 extends AbstractC7737t implements Function1<BaseDeliveryReviewValidator.ValidationResult, Unit> {
    final /* synthetic */ DeliveryReviewFormFooterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryReviewFormFooterViewHolder$observeValidation$1(DeliveryReviewFormFooterViewHolder deliveryReviewFormFooterViewHolder) {
        super(1);
        this.this$0 = deliveryReviewFormFooterViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BaseDeliveryReviewValidator.ValidationResult validationResult) {
        invoke2(validationResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BaseDeliveryReviewValidator.ValidationResult validationResult) {
        DeliveryReviewFormFooterVO deliveryReviewFormFooterVO;
        DisclaimerAtom defaultAnnotation;
        DeliveryReviewFormFooterVO deliveryReviewFormFooterVO2;
        ItemDeliveryReviewFooterBinding itemDeliveryReviewFooterBinding;
        DeliveryReviewFormFooterVO deliveryReviewFormFooterVO3;
        if ((validationResult instanceof BaseDeliveryReviewValidator.ValidationResult.Error) && ((BaseDeliveryReviewValidator.ValidationResult.Error) validationResult).getErrorGroupId() == null) {
            deliveryReviewFormFooterVO3 = this.this$0.itemVo;
            if (deliveryReviewFormFooterVO3 != null) {
                defaultAnnotation = deliveryReviewFormFooterVO3.getErrorAnnotation();
            }
            defaultAnnotation = null;
        } else if (validationResult instanceof BaseDeliveryReviewValidator.ValidationResult.EmptyWithCheckboxError) {
            deliveryReviewFormFooterVO2 = this.this$0.itemVo;
            if (deliveryReviewFormFooterVO2 != null) {
                defaultAnnotation = deliveryReviewFormFooterVO2.getErrorEmptyWithCheckboxAnnotation();
            }
            defaultAnnotation = null;
        } else {
            deliveryReviewFormFooterVO = this.this$0.itemVo;
            if (deliveryReviewFormFooterVO != null) {
                defaultAnnotation = deliveryReviewFormFooterVO.getDefaultAnnotation();
            }
            defaultAnnotation = null;
        }
        itemDeliveryReviewFooterBinding = this.this$0.binding;
        SingleAtom saAnnotation = itemDeliveryReviewFooterBinding.saAnnotation;
        Intrinsics.checkNotNullExpressionValue(saAnnotation, "saAnnotation");
        ContainerExtKt.bindOrGone$default(saAnnotation, defaultAnnotation, false, 2, null);
    }
}
