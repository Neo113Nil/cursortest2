package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.mapper;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2ControlsDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.SwipeInfoDTO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.ControlsVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeButtonVO;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitControlsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ControlsDTOV2;", "Ll20/d;", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ControlsDTOV2;Ll20/d;)Ljava/util/List;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitControlsV2Mapper implements Function2<CartSplitV2ControlsDTOV2, d, List<? extends CartSplitV2ControlsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CartSplitV2ControlsVO> invoke(@NotNull CartSplitV2ControlsDTOV2 state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode() + state.getIndex();
        String valueOf = String.valueOf(state.getIndex() + c.a(widgetInfo.d(), "swipe"));
        SwipeButtonVO swipeButtonVO = new SwipeButtonVO(R$color.bg_negative_primary, null, state.getRemoveAction(), false, 8, null);
        ControlsVO vov2 = CartSplitV2MappersKt.toVOV2(state.getControls(), hashCode);
        SwipeInfoDTO swipeInfo = state.getSwipeInfo();
        return C7714v.a0(new CartSplitV2ControlsVO(hashCode, vov2, swipeInfo != null ? CartSplitV2MappersKt.toVOV2(swipeInfo, hashCode, swipeButtonVO, state.getFavoriteProduct(), valueOf) : null));
    }
}
