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
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\n"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/CheckboxAndTextareaValidator;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator;", "<init>", "()V", "validate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "groups", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "Companion", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckboxAndTextareaValidator extends BaseDeliveryReviewValidator {

    @NotNull
    private static final List<String> checkedErrorIdsList = C7714v.b0("507_2571", "500_2546", "493_2521", "532_2659", "525_2636", "518_2613", "457_2379", "450_2353", "443_2327");

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.BaseDeliveryReviewValidator
    @NotNull
    public BaseDeliveryReviewValidator.ValidationResult validate(@NotNull List<? extends DeliveryReviewItemVO> groups) {
        boolean z11;
        Intrinsics.checkNotNullParameter(groups, "groups");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = groups.iterator();
        while (it.hasNext()) {
            C7714v.p(((DeliveryReviewItemVO) it.next()).getComponents(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            ComponentVO componentVO = (ComponentVO) next;
            if (checkedErrorIdsList.contains(componentVO.getId()) && (componentVO.getElement() instanceof ElementVO.Checkbox)) {
                arrayList2.add(next);
            }
        }
        boolean z12 = true;
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ElementVO element = ((ComponentVO) it3.next()).getElement();
                Intrinsics.g(element, "null cannot be cast to non-null type ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO.Checkbox");
                if (((ElementVO.Checkbox) element).getIsSelected()) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (((ComponentVO) next2).getElement() instanceof ElementVO.Textarea) {
                arrayList3.add(next2);
            }
        }
        if (!arrayList3.isEmpty()) {
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                ElementVO element2 = ((ComponentVO) it5.next()).getElement();
                Intrinsics.g(element2, "null cannot be cast to non-null type ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO.Textarea");
                String value = ((ElementVO.Textarea) element2).getValue();
                if ((value != null ? value.length() : 0) >= 5) {
                    break;
                }
            }
        }
        z12 = false;
        return (!z11 || z12) ? BaseDeliveryReviewValidator.ValidationResult.Success.INSTANCE : BaseDeliveryReviewValidator.ValidationResult.EmptyWithCheckboxError.INSTANCE;
    }
}
