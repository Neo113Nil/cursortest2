package ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.request.SendDeliveryReviewFormRequest;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005J\u000e\u0010\r\u001a\u00020\u000e*\u0004\u0018\u00010\u000fH\u0002J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/mapper/SendDeliveryReviewFormRequestMapper;", "", "<init>", "()V", "map", "", "", "rating", "", "groups", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "params", "isNotEmpty", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "toRequestComponent", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/request/SendDeliveryReviewFormRequest$Component;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "Companion", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendDeliveryReviewFormRequestMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/mapper/SendDeliveryReviewFormRequestMapper$Companion;", "", "<init>", "()V", "FIELD_RATING", "", "FIELD_COMPONENTS", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotEmpty(ElementVO elementVO) {
        List<String> values;
        if (elementVO instanceof ElementVO.Checkbox) {
            return ((ElementVO.Checkbox) elementVO).getIsSelected();
        }
        if (elementVO instanceof ElementVO.Radio) {
            return ((ElementVO.Radio) elementVO).getIsSelected();
        }
        if (elementVO instanceof ElementVO.Toggle) {
            return ((ElementVO.Toggle) elementVO).getIsSelected();
        }
        if (!(elementVO instanceof ElementVO.Carousel)) {
            if (!(elementVO instanceof ElementVO.Textarea)) {
                return (elementVO instanceof ElementVO.UploadPhotos) && (values = ((ElementVO.UploadPhotos) elementVO).getValues()) != null && (values.isEmpty() ^ true);
            }
            String value = ((ElementVO.Textarea) elementVO).getValue();
            return value != null && (h.K(value) ^ true);
        }
        List<ElementVO.Carousel.Item> list = ((ElementVO.Carousel) elementVO).getList();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ElementVO.Carousel.Item) it.next()).getIsSelected()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendDeliveryReviewFormRequest.Component toRequestComponent(ComponentVO componentVO) {
        List list;
        String id2 = componentVO.getId();
        ElementVO element = componentVO.getElement();
        if (element instanceof ElementVO.Checkbox) {
            list = C7714v.a0(Boolean.valueOf(((ElementVO.Checkbox) element).getIsSelected()));
        } else if (element instanceof ElementVO.Radio) {
            list = C7714v.a0(Boolean.valueOf(((ElementVO.Radio) element).getIsSelected()));
        } else if (element instanceof ElementVO.Toggle) {
            list = C7714v.a0(Boolean.valueOf(((ElementVO.Toggle) element).getIsSelected()));
        } else if (element instanceof ElementVO.Carousel) {
            List<ElementVO.Carousel.Item> list2 = ((ElementVO.Carousel) element).getList();
            ArrayList<ElementVO.Carousel.Item> arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((ElementVO.Carousel.Item) obj).getIsSelected()) {
                    arrayList.add(obj);
                }
            }
            list = new ArrayList(C7714v.z(arrayList, 10));
            for (ElementVO.Carousel.Item item : arrayList) {
                list.add(new SendDeliveryReviewFormRequest.Component.Carousel(item.getId(), item.getImage(), item.getText()));
            }
        } else if (element instanceof ElementVO.Textarea) {
            String value = ((ElementVO.Textarea) element).getValue();
            if (value == null) {
                value = "";
            }
            list = C7714v.a0(value);
        } else if (element instanceof ElementVO.UploadPhotos) {
            list = ((ElementVO.UploadPhotos) element).getValues();
            if (list == null) {
                list = K.f71697a;
            }
        } else {
            list = K.f71697a;
        }
        return new SendDeliveryReviewFormRequest.Component(id2, list);
    }

    @NotNull
    public final Map<String, Object> map(int rating, @NotNull List<? extends DeliveryReviewItemVO> groups, Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        List C11 = l.C(l.v(l.h(l.n(C7714v.w(groups), SendDeliveryReviewFormRequestMapper$map$components$1.INSTANCE), new SendDeliveryReviewFormRequestMapper$map$components$2(this)), new SendDeliveryReviewFormRequestMapper$map$components$3(this)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rating", Integer.valueOf(rating));
        linkedHashMap.put("components", C11);
        if (params != null) {
            linkedHashMap.putAll(params);
        }
        return linkedHashMap;
    }
}
