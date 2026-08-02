package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.BaseDeliveryReviewValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator;", "<init>", "()V", "validate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "groups", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewGroupValidator extends BaseDeliveryReviewValidator {
    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.BaseDeliveryReviewValidator
    @NotNull
    public BaseDeliveryReviewValidator.ValidationResult validate(@NotNull List<? extends DeliveryReviewItemVO> groups) {
        ElementVO element;
        Intrinsics.checkNotNullParameter(groups, "groups");
        int i11 = 0;
        for (Object obj : groups) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DeliveryReviewItemVO deliveryReviewItemVO = (DeliveryReviewItemVO) obj;
            if (!deliveryReviewItemVO.getComponents().isEmpty()) {
                List<ComponentVO> components = deliveryReviewItemVO.getComponents();
                boolean z11 = true;
                if (!(components instanceof Collection) || !components.isEmpty()) {
                    for (ComponentVO componentVO : components) {
                        if (!Intrinsics.d(deliveryReviewItemVO.getRequired(), Boolean.TRUE) || (element = componentVO.getElement()) == null || selected(element)) {
                            z11 = false;
                            break;
                        }
                    }
                }
                if (z11) {
                    return new BaseDeliveryReviewValidator.ValidationResult.Error(Integer.valueOf(deliveryReviewItemVO.getGroupId()), Integer.valueOf(i11));
                }
            }
            i11 = i12;
        }
        return BaseDeliveryReviewValidator.ValidationResult.Success.INSTANCE;
    }
}
