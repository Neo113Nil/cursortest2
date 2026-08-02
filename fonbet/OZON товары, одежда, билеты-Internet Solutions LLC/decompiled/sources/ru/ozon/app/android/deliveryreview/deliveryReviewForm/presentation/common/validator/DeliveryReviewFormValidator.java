package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.BaseDeliveryReviewValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormFooterVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewFormValidator;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator;", "<init>", "()V", "validate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "groups", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewFormValidator extends BaseDeliveryReviewValidator {
    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.BaseDeliveryReviewValidator
    @NotNull
    public BaseDeliveryReviewValidator.ValidationResult validate(@NotNull List<? extends DeliveryReviewItemVO> groups) {
        Object obj;
        Intrinsics.checkNotNullParameter(groups, "groups");
        List<? extends DeliveryReviewItemVO> list = groups;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof DeliveryReviewFormFooterVO) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((DeliveryReviewFormFooterVO) obj).getWholeFormRequired(), Boolean.FALSE)) {
                break;
            }
        }
        if (((DeliveryReviewFormFooterVO) obj) != null) {
            return BaseDeliveryReviewValidator.ValidationResult.Success.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            C7714v.p(((DeliveryReviewItemVO) it2.next()).getComponents(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!((ComponentVO) next).getHidden()) {
                arrayList3.add(next);
            }
        }
        if (!arrayList3.isEmpty()) {
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                ElementVO element = ((ComponentVO) it4.next()).getElement();
                if (element != null && selected(element)) {
                    return BaseDeliveryReviewValidator.ValidationResult.Success.INSTANCE;
                }
            }
        }
        return new BaseDeliveryReviewValidator.ValidationResult.Error(null, null, 3, null);
    }
}
