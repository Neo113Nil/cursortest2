package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartV4MapperKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartV4Mapper implements Function2<CartButtonV4Dto, d, List<? extends DoubleCartVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DoubleCartVO> invoke(@NotNull CartButtonV4Dto dto, @NotNull d widgetInfo) {
        AtomActionDTO action;
        AtomActionDTO action2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CartButtonV4Dto.Configuration configuration = dto.getConfiguration();
        CartButtonV4Dto.Configuration.DoubleCartData doubleCartData = configuration instanceof CartButtonV4Dto.Configuration.DoubleCartData ? (CartButtonV4Dto.Configuration.DoubleCartData) configuration : null;
        if (doubleCartData == null) {
            return K.f71697a;
        }
        AtomActionDTO action3 = doubleCartData.getFirstCartButton().getToCart().getButtonWithIcon().getButton().getAction();
        Long skuParamsWithIds = action3 != null ? DoubleCartV4MapperKt.getSkuParamsWithIds(action3, "addToCart") : null;
        CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO additionalButton = doubleCartData.getFirstCartButton().getInCart().getAdditionalButton();
        Long skuParamsWithIds2 = (additionalButton == null || (action2 = additionalButton.getAction()) == null) ? null : DoubleCartV4MapperKt.getSkuParamsWithIds(action2, "plusButtonClick", "minusButtonClick");
        AtomActionDTO action4 = doubleCartData.getSecondCartButton().getToCart().getButtonWithIcon().getButton().getAction();
        Long skuParamsWithIds3 = action4 != null ? DoubleCartV4MapperKt.getSkuParamsWithIds(action4, "addToCart") : null;
        CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO additionalButton2 = doubleCartData.getSecondCartButton().getInCart().getAdditionalButton();
        Long skuParamsWithIds4 = (additionalButton2 == null || (action = additionalButton2.getAction()) == null) ? null : DoubleCartV4MapperKt.getSkuParamsWithIds(action, "plusButtonClick", "minusButtonClick");
        long longValue = skuParamsWithIds != null ? skuParamsWithIds.longValue() : skuParamsWithIds2 != null ? skuParamsWithIds2.longValue() : dto.getSku();
        long longValue2 = skuParamsWithIds3 != null ? skuParamsWithIds3.longValue() : skuParamsWithIds4 != null ? skuParamsWithIds4.longValue() : dto.getSku();
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        DoubleCartVO.CartMode cartMode = doubleCartData.getFirstCartButton().getInCartQty() > 0 ? DoubleCartVO.CartMode.FIRST : doubleCartData.getSecondCartButton().getInCartQty() > 0 ? DoubleCartVO.CartMode.SECOND : DoubleCartVO.CartMode.DEFAULT;
        CartVO vo = CartV4MapperKt.toVo(doubleCartData.getFirstCartButton(), widgetInfo, dto, Long.valueOf(longValue));
        CartVO vo2 = CartV4MapperKt.toVo(doubleCartData.getSecondCartButton(), widgetInfo, dto, Long.valueOf(longValue2));
        boolean needsShadow = dto.getNeedsShadow();
        CartButtonV4Dto.CartButtonStyle style = dto.getStyle();
        CartVO.NotificationBar extractNotificationBar = CartV4MapperKt.extractNotificationBar(dto);
        String relatedProductsCurtain = dto.getRelatedProductsCurtain();
        String str = (relatedProductsCurtain == null || relatedProductsCurtain.length() <= 0 || h.K(relatedProductsCurtain)) ? null : relatedProductsCurtain;
        CartButtonV4Dto.CurtainTrackingInfo curtainTrackingInfo = dto.getCurtainTrackingInfo();
        return C7714v.a0(new DoubleCartVO(widgetId, cartMode, vo, vo2, needsShadow, style, extractNotificationBar, str, curtainTrackingInfo != null ? ExtKt.toVo(curtainTrackingInfo, widgetId) : null));
    }
}
