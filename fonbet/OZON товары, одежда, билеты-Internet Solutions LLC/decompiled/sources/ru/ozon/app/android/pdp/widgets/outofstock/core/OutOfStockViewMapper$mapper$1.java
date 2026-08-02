package ru.ozon.app.android.pdp.widgets.outofstock.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.outofstock.data.OutOfStockDTO;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockVO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;", "invoke", "(Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class OutOfStockViewMapper$mapper$1 extends AbstractC7737t implements Function2<OutOfStockDTO, d, List<? extends OutOfStockVO>> {
    final /* synthetic */ OutOfStockViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutOfStockViewMapper$mapper$1(OutOfStockViewMapper outOfStockViewMapper) {
        super(2);
        this.this$0 = outOfStockViewMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final List<OutOfStockVO> invoke(OutOfStockDTO dto, d widgetInfo) {
        OutOfStockVO.SellerInfo sellerInfo;
        TextDTO textDTO;
        Map<String, TokenizedTrackingInfo> map;
        OutOfStockVO.TrackingInfo trackingInfo;
        String str;
        t tVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        long sku = dto.getSku();
        String deeplink = dto.getDeeplink();
        String image = dto.getImage();
        Price price = dto.getPrice();
        TextAtom deliveryInfo = dto.getDeliveryInfo();
        TextDTO dsTextAtom = deliveryInfo != null ? TextMapperKt.getDsTextAtom(deliveryInfo) : null;
        CommonText.TextSmall sellerInfo2 = dto.getSellerInfo();
        if (sellerInfo2 != null) {
            OzonSpannableString text = sellerInfo2.getText();
            String textColor = sellerInfo2.getTextColor();
            if (textColor == null) {
                textColor = UniColors.GRAPHIC_PRIMARY_ON_LIGHT.getToken();
            }
            sellerInfo = new OutOfStockVO.SellerInfo(new TextDTO(text, null, null, null, null, null, null, null, textColor, null, null, null, null, true, null, null, null, null, null, 515838, null), sellerInfo2.getAction());
        } else {
            sellerInfo = null;
        }
        boolean isProductInCart$default = CartService.DefaultImpls.isProductInCart$default(this.this$0.component().getCartService(), dto.getSku(), null, 2, null);
        OutOfStockDTO.TrackingInfo trackingInfo2 = dto.getTrackingInfo();
        if (trackingInfo2 != null) {
            Map<String, TokenizedTrackingInfo> widget = trackingInfo2.getWidget();
            textDTO = dsTextAtom;
            if (widget != null) {
                str = 0;
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(widget, Long.valueOf(hashCode), null, 2, null);
            } else {
                str = 0;
                tVar = null;
            }
            Map<String, TokenizedTrackingInfo> addToCart = trackingInfo2.getAddToCart();
            trackingInfo = new OutOfStockVO.TrackingInfo(tVar, addToCart != null ? TrackingInfoMapperKt.toTokenizedEvent$default(addToCart, Long.valueOf(hashCode), str, 2, str) : str);
            map = str;
        } else {
            textDTO = dsTextAtom;
            map = null;
            trackingInfo = null;
        }
        OutOfStockDTO.TrackingInfo trackingInfo3 = dto.getTrackingInfo();
        return C7714v.a0(new OutOfStockVO(hashCode, sku, deeplink, image, price, textDTO, sellerInfo, isProductInCart$default, trackingInfo, trackingInfo3 != null ? trackingInfo3.getAddToCart() : map, dto.getParams(), dto.getSelectedDeliverySchema()));
    }
}
