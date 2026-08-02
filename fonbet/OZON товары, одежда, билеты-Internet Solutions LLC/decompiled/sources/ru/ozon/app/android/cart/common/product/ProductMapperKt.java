package ru.ozon.app.android.cart.common.product;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementMapperKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.app.android.cart.common.product.ProductDTO;
import ru.ozon.app.android.cart.common.product.ProductVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/cart/common/product/ProductVO;", "Lru/ozon/app/android/cart/common/product/ProductDTO;", "widgetId", "", "Lru/ozon/app/android/cart/common/product/ProductVO$Image;", "Lru/ozon/app/android/cart/common/product/ProductDTO$Image;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductMapperKt {
    @NotNull
    public static final ProductVO toVO(@NotNull ProductDTO productDTO, long j11) {
        Intrinsics.checkNotNullParameter(productDTO, "<this>");
        String id2 = productDTO.getId();
        ProductVO.Image vo = toVO(productDTO.getImage());
        List<DynamicElementDTO> dynamicElements = productDTO.getDynamicElements();
        Intrinsics.g(dynamicElements, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = dynamicElements.iterator();
        while (it.hasNext()) {
            DynamicElementVO mapToDynamicElementVO = DynamicElementMapperKt.mapToDynamicElementVO(it.next(), j11);
            if (mapToDynamicElementVO != null) {
                arrayList.add(mapToDynamicElementVO);
            }
        }
        AtomActionDTO action = productDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = productDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        AtomActionDTO getAccessoriesAction = productDTO.getGetAccessoriesAction();
        return new ProductVO(id2, vo, arrayList, atomAction, tokenizedEvent$default, getAccessoriesAction != null ? AtomActionMapperKt.toAtomAction(getAccessoriesAction, null) : null);
    }

    private static final ProductVO.Image toVO(ProductDTO.Image image) {
        return new ProductVO.Image(image.getUrl(), image.getBadge());
    }
}
