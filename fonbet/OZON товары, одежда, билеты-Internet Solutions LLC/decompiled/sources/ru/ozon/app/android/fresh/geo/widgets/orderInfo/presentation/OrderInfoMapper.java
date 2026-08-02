package ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.geo.utils.ExtensionsKt;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.data.OrderInfoDTO;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO$OrderProductDTO;", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$OrderProduct;", "toProduct", "(Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO$OrderProductDTO;)Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$OrderProduct;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO;Ll20/d;)Ljava/util/List;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderInfoMapper implements Function2<OrderInfoDTO, d, List<? extends OrderInfoVO>> {
    private final OrderInfoVO.OrderProduct toProduct(OrderInfoDTO.OrderProductDTO orderProductDTO) {
        ImageDTO image = orderProductDTO.getImage();
        AtomActionDTO openProduct = orderProductDTO.getOpenProduct();
        return new OrderInfoVO.OrderProduct(image, openProduct != null ? AtomActionMapperKt.toAtomAction(openProduct, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderInfoVO> invoke(@NotNull OrderInfoDTO state, @NotNull d widgetInfo) {
        AtomAction atomAction;
        CommonControlSettings common;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long id2 = ExtensionsKt.getId(widgetInfo);
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        BadgeDTO headerButton = state.getHeaderButton();
        TextDTO rightHeaderText = state.getRightHeaderText();
        AtomActionDTO rightHeaderTextAction = state.getRightHeaderTextAction();
        if (rightHeaderTextAction != null) {
            TextDTO rightHeaderText2 = state.getRightHeaderText();
            atomAction = AtomActionMapperKt.toAtomAction(rightHeaderTextAction, rightHeaderText2 != null ? rightHeaderText2.getTrackingInfo() : null);
        } else {
            atomAction = null;
        }
        List<OrderInfoDTO.OrderProductDTO> products = state.getProducts();
        ArrayList arrayList = new ArrayList(C7714v.z(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(toProduct((OrderInfoDTO.OrderProductDTO) it.next()));
        }
        BadgeDTO headerButton2 = state.getHeaderButton();
        AtomAction atomAction2 = (headerButton2 == null || (common = headerButton2.getCommon()) == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getHeaderButton().getTrackingInfo());
        AtomActionDTO productsListAction = state.getProductsListAction();
        AtomAction atomAction3 = productsListAction != null ? AtomActionMapperKt.toAtomAction(productsListAction, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new OrderInfoVO(id2, title, subtitle, headerButton, rightHeaderText, atomAction, arrayList, atomAction2, atomAction3, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(id2), null, 2, null) : null, state.getTitle() == null ? OrderInfoVO.AlignmentType.ONLY_SUBTITLE : OrderInfoVO.AlignmentType.ALL_VISIBLE));
    }
}
