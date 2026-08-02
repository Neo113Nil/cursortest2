package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewComponentValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewGroupValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateCheckbox;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.common.ComponentUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.model.ComponentUpdateModel;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/CheckboxUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/common/ComponentUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateCheckbox;", "componentsValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;", "groupValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;", "<init>", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;)V", "update", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "oldVO", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckboxUpdateDelegate extends ComponentUpdateDelegate<UpdateCheckbox> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxUpdateDelegate(@NotNull DeliveryReviewComponentValidator componentsValidator, @NotNull DeliveryReviewGroupValidator groupValidator) {
        super(componentsValidator, groupValidator);
        Intrinsics.checkNotNullParameter(componentsValidator, "componentsValidator");
        Intrinsics.checkNotNullParameter(groupValidator, "groupValidator");
    }

    public DeliveryReviewItemVO update(@NotNull DeliveryReviewItemVO oldVO, @NotNull UpdateCheckbox update) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        Intrinsics.checkNotNullParameter(update, "update");
        List<ComponentVO> components = oldVO.getComponents();
        List a02 = C7714v.a0(new ComponentUpdateModel(update.getComponentId(), !update.getIsSelected(), new CheckboxUpdateDelegate$update$updatedComponents$1(update)));
        List<ComponentVO> list = components;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (ComponentVO componentVO : list) {
            List list2 = a02;
            Iterator it = list2.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.d(((ComponentUpdateModel) obj2).getChangedComponentId(), componentVO.getId())) {
                    break;
                }
            }
            ComponentUpdateModel componentUpdateModel = (ComponentUpdateModel) obj2;
            if (componentUpdateModel == null || !(componentVO.getElement() instanceof ElementVO.Checkbox)) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.d(((ComponentUpdateModel) next).getChangedComponentId(), componentVO.getControllingComponentId())) {
                        obj = next;
                        break;
                    }
                }
                ComponentUpdateModel componentUpdateModel2 = (ComponentUpdateModel) obj;
                if (componentUpdateModel2 != null) {
                    componentVO = ComponentVO.copy$default(componentVO, null, null, componentUpdateModel2.getIsHiddenForControlledComponents(), null, null, null, false, 123, null);
                }
            } else {
                componentVO = ComponentVO.copy$default(componentVO, null, null, false, null, null, (ElementVO) componentUpdateModel.getElementUpdate().invoke(componentVO.getElement()), false, 95, null);
            }
            arrayList.add(componentVO);
        }
        return oldVO.copy(arrayList);
    }
}
