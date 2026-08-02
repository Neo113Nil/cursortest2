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
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateCarousel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.common.ComponentUpdateDelegate;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/CarouselUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/common/ComponentUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateCarousel;", "componentsValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;", "groupValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;", "<init>", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;)V", "update", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "oldVO", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarouselUpdateDelegate extends ComponentUpdateDelegate<UpdateCarousel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselUpdateDelegate(@NotNull DeliveryReviewComponentValidator componentsValidator, @NotNull DeliveryReviewGroupValidator groupValidator) {
        super(componentsValidator, groupValidator);
        Intrinsics.checkNotNullParameter(componentsValidator, "componentsValidator");
        Intrinsics.checkNotNullParameter(groupValidator, "groupValidator");
    }

    public DeliveryReviewItemVO update(@NotNull DeliveryReviewItemVO oldVO, @NotNull UpdateCarousel update) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        Intrinsics.checkNotNullParameter(update, "update");
        Iterator<T> it = oldVO.getComponents().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((ComponentVO) obj).getId(), update.getComponentId())) {
                break;
            }
        }
        ComponentVO componentVO = (ComponentVO) obj;
        ElementVO element = componentVO != null ? componentVO.getElement() : null;
        ElementVO.Carousel carousel = element instanceof ElementVO.Carousel ? (ElementVO.Carousel) element : null;
        if (carousel == null) {
            return null;
        }
        Iterator<T> it2 = carousel.getList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.d(((ElementVO.Carousel.Item) obj2).getId(), update.getItemId())) {
                break;
            }
        }
        ElementVO.Carousel.Item item = (ElementVO.Carousel.Item) obj2;
        if (item == null || item.getIsSelected() == update.getIsSelected()) {
            return null;
        }
        if (!carousel.getMultiple() && item.getIsSelected()) {
            return null;
        }
        List<ComponentVO> components = oldVO.getComponents();
        String componentId = update.getComponentId();
        List<ComponentVO> list = components;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (ComponentVO componentVO2 : list) {
            if (Intrinsics.d(componentVO2.getId(), componentId) && (componentVO2.getElement() instanceof ElementVO.Carousel)) {
                ElementVO.Carousel carousel2 = (ElementVO.Carousel) componentVO2.getElement();
                List<ElementVO.Carousel.Item> list2 = carousel2.getList();
                ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
                for (ElementVO.Carousel.Item item2 : list2) {
                    if (Intrinsics.d(item2.getId(), update.getItemId())) {
                        item2 = ElementVO.Carousel.Item.copy$default(item2, null, null, null, update.getIsSelected(), 7, null);
                    } else if (!carousel.getMultiple() && item2.getIsSelected()) {
                        item2 = ElementVO.Carousel.Item.copy$default(item2, null, null, null, false, 7, null);
                    }
                    arrayList2.add(item2);
                }
                componentVO2 = ComponentVO.copy$default(componentVO2, null, null, false, null, null, ElementVO.Carousel.copy$default(carousel2, null, arrayList2, false, 5, null), false, 95, null);
            }
            arrayList.add(componentVO2);
        }
        return oldVO.copy(arrayList);
    }
}
