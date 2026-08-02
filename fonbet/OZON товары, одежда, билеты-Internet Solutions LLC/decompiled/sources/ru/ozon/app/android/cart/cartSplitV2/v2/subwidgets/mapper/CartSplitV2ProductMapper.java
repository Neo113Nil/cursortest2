package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.mapper;

import Kk.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2ProductDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CheckboxDTO;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.SeparatorConfig;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.SwipeInfoDTO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CheckboxVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeButtonVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitV2ProductMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;", "Ll20/d;", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "itemSeparatorConfig", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "getItemSeparatorConfig", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ProductMapper implements Function2<CartSplitV2ProductDTOV2, d, List<? extends CartSplitV2ProductVO>> {
    private SeparatorConfig itemSeparatorConfig;

    public final SeparatorConfig getItemSeparatorConfig() {
        return this.itemSeparatorConfig;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CartSplitV2ProductVO> invoke(@NotNull CartSplitV2ProductDTOV2 state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode() + state.getIndex();
        String valueOf = String.valueOf(state.getIndex() + c.a(widgetInfo.d(), "swipe"));
        SwipeButtonVO swipeButtonVO = new SwipeButtonVO(R$color.bg_negative_primary, new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_300, ButtonV3DTO.StyleTypes.CUSTOM, null, "ic_m_trash_bin_filled", null, "bgLightKey", UniColors.WHITE_TRANSPARENT_0.getToken(), null, Boolean.TRUE, null, null, null, null, null, 16020, null), state.getRemoveAction(), false, 8, null);
        this.itemSeparatorConfig = state.getCartItemsSeparator();
        ProductVOV2 vov2 = CartSplitV2MappersKt.toVOV2(state.getProduct(), hashCode, state.getCheckbox(), state.getBottomDynamicElements());
        CheckboxDTO checkbox = state.getCheckbox();
        CheckboxVO vov22 = checkbox != null ? CartSplitV2MappersKt.toVOV2(checkbox) : null;
        SwipeInfoDTO swipeInfo = state.getSwipeInfo();
        return C7714v.a0(new CartSplitV2ProductVO(hashCode, vov22, vov2, swipeInfo != null ? CartSplitV2MappersKt.toVOV2(swipeInfo, hashCode, swipeButtonVO, state.getFavoriteProduct(), valueOf) : null));
    }
}
