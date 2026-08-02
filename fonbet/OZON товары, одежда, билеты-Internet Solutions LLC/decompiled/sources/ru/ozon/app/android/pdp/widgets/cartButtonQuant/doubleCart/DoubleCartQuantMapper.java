package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.QuantMapperKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartQuantMapper implements Function2<CartButtonQuantDto, d, List<? extends DoubleCartQuantVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DoubleCartQuantVO> invoke(@NotNull CartButtonQuantDto dto, @NotNull d widgetInfo) {
        AtomActionDTO action;
        AtomActionDTO action2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CartButtonQuantDto.Configuration configuration = dto.getConfiguration();
        Long l11 = null;
        CartButtonQuantDto.Configuration.DoubleCartData doubleCartData = configuration instanceof CartButtonQuantDto.Configuration.DoubleCartData ? (CartButtonQuantDto.Configuration.DoubleCartData) configuration : null;
        if (doubleCartData == null) {
            return K.f71697a;
        }
        AtomActionDTO action3 = doubleCartData.getFirstCartButton().getToCart().getButtonWithIcon().getButton().getAction();
        Long skuParamsWithIds = action3 != null ? DoubleCartQuantMapperKt.getSkuParamsWithIds(action3, "addToCart") : null;
        CartButtonQuantDto.Configuration.CartData.Buttons.AdditionalButtonDTO additionalButton = doubleCartData.getFirstCartButton().getInCart().getAdditionalButton();
        Long skuParamsWithIds2 = (additionalButton == null || (action2 = additionalButton.getAction()) == null) ? null : DoubleCartQuantMapperKt.getSkuParamsWithIds(action2, "plusButtonClick", "minusButtonClick");
        AtomActionDTO action4 = doubleCartData.getSecondCartButton().getToCart().getButtonWithIcon().getButton().getAction();
        Long skuParamsWithIds3 = action4 != null ? DoubleCartQuantMapperKt.getSkuParamsWithIds(action4, "addToCart") : null;
        CartButtonQuantDto.Configuration.CartData.Buttons.AdditionalButtonDTO additionalButton2 = doubleCartData.getSecondCartButton().getInCart().getAdditionalButton();
        if (additionalButton2 != null && (action = additionalButton2.getAction()) != null) {
            l11 = DoubleCartQuantMapperKt.getSkuParamsWithIds(action, "plusButtonClick", "minusButtonClick");
        }
        return C7714v.a0(new DoubleCartQuantVO(widgetInfo.d().hashCode(), doubleCartData.getFirstCartButton().getInCartQty() > 0 ? DoubleCartQuantVO.CartMode.FIRST : doubleCartData.getSecondCartButton().getInCartQty() > 0 ? DoubleCartQuantVO.CartMode.SECOND : DoubleCartQuantVO.CartMode.DEFAULT, QuantMapperKt.toVo(doubleCartData.getFirstCartButton(), widgetInfo, dto, Long.valueOf(skuParamsWithIds != null ? skuParamsWithIds.longValue() : skuParamsWithIds2 != null ? skuParamsWithIds2.longValue() : dto.getSku())), QuantMapperKt.toVo(CartButtonQuantDto.Configuration.CartData.copy$default(doubleCartData.getSecondCartButton(), false, null, null, 0, 0, null, null, doubleCartData.getFirstCartButton().getQuantMultiplicityValue(), 127, null), widgetInfo, dto, Long.valueOf(skuParamsWithIds3 != null ? skuParamsWithIds3.longValue() : l11 != null ? l11.longValue() : dto.getSku())), dto.getNeedsShadow(), dto.getStyle(), QuantMapperKt.extractNotificationBar(dto)));
    }
}
