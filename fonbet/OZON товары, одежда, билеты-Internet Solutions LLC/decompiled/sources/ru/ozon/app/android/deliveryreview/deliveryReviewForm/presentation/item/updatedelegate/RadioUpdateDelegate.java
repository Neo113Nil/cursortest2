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
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateRadio;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.common.ComponentUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.model.ComponentUpdateModel;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/RadioUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/common/ComponentUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateRadio;", "componentsValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;", "groupValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;", "<init>", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;)V", "update", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "oldVO", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RadioUpdateDelegate extends ComponentUpdateDelegate<UpdateRadio> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioUpdateDelegate(@NotNull DeliveryReviewComponentValidator componentsValidator, @NotNull DeliveryReviewGroupValidator groupValidator) {
        super(componentsValidator, groupValidator);
        Intrinsics.checkNotNullParameter(componentsValidator, "componentsValidator");
        Intrinsics.checkNotNullParameter(groupValidator, "groupValidator");
    }

    public DeliveryReviewItemVO update(@NotNull DeliveryReviewItemVO oldVO, @NotNull UpdateRadio update) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        Intrinsics.checkNotNullParameter(update, "update");
        List<ComponentVO> components = oldVO.getComponents();
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : components) {
            if (((ComponentVO) obj4).getElement() instanceof ElementVO.Radio) {
                arrayList.add(obj4);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ComponentVO) it.next()).getId());
        }
        Iterator<T> it2 = oldVO.getComponents().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.d(((ComponentVO) obj).getId(), update.getComponentId())) {
                break;
            }
        }
        ComponentVO componentVO = (ComponentVO) obj;
        ElementVO element = componentVO != null ? componentVO.getElement() : null;
        ElementVO.Radio radio = element instanceof ElementVO.Radio ? (ElementVO.Radio) element : null;
        if (radio != null && radio.getIsSelected()) {
            return null;
        }
        List<ComponentVO> components2 = oldVO.getComponents();
        ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList2, 10));
        for (String str : arrayList2) {
            arrayList3.add(new ComponentUpdateModel(str, !Intrinsics.d(str, update.getComponentId()), new RadioUpdateDelegate$update$updatedComponents$1$1(str, update)));
        }
        List<ComponentVO> list = components2;
        ArrayList arrayList4 = new ArrayList(C7714v.z(list, 10));
        for (ComponentVO componentVO2 : list) {
            Iterator it3 = arrayList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (Intrinsics.d(((ComponentUpdateModel) obj2).getChangedComponentId(), componentVO2.getId())) {
                    break;
                }
            }
            ComponentUpdateModel componentUpdateModel = (ComponentUpdateModel) obj2;
            if (componentUpdateModel == null || !(componentVO2.getElement() instanceof ElementVO.Radio)) {
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it4.next();
                    if (Intrinsics.d(((ComponentUpdateModel) obj3).getChangedComponentId(), componentVO2.getControllingComponentId())) {
                        break;
                    }
                }
                ComponentUpdateModel componentUpdateModel2 = (ComponentUpdateModel) obj3;
                if (componentUpdateModel2 != null) {
                    componentVO2 = ComponentVO.copy$default(componentVO2, null, null, componentUpdateModel2.getIsHiddenForControlledComponents(), null, null, null, false, 123, null);
                }
            } else {
                componentVO2 = ComponentVO.copy$default(componentVO2, null, null, false, null, null, (ElementVO) componentUpdateModel.getElementUpdate().invoke(componentVO2.getElement()), false, 95, null);
            }
            arrayList4.add(componentVO2);
        }
        return oldVO.copy(arrayList4);
    }
}
