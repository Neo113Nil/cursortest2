package ru.ozon.app.android.cart.cartButtonWithTooltip.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartButtonWithTooltip.data.CartButtonWithTooltipDTO;
import ru.ozon.app.android.cart.cartButtonWithTooltip.presentation.CartButtonWithTooltipVO;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVOKt;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cart/cartButtonWithTooltip/data/CartButtonWithTooltipDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/cart/cartButtonWithTooltip/data/CartButtonWithTooltipDTO;Ljava/lang/String;)Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/cart/cartButtonWithTooltip/data/CartButtonWithTooltipDTO;Ll20/d;)Ljava/util/List;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartButtonWithTooltipMapper implements Function2<CartButtonWithTooltipDTO, d, List<? extends CartButtonWithTooltipVO>> {
    private final CartButtonWithTooltipVO toVo(CartButtonWithTooltipDTO cartButtonWithTooltipDTO, String str) {
        long hashCode = str.hashCode();
        CartButtonWithTooltipVO.ActionButton actionButton = new CartButtonWithTooltipVO.ActionButton(cartButtonWithTooltipDTO.getActionButton().getText(), AtomActionMapperKt.toAtomAction(cartButtonWithTooltipDTO.getActionButton().getAction(), cartButtonWithTooltipDTO.getActionButton().getTrackingInfo()), cartButtonWithTooltipDTO.getActionButton().getTestInfo());
        TooltipDTO tooltip = cartButtonWithTooltipDTO.getTooltip();
        return new CartButtonWithTooltipVO(hashCode, actionButton, tooltip != null ? CartTooltipVOKt.toCartTooltipVO(tooltip) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CartButtonWithTooltipVO> invoke(@NotNull CartButtonWithTooltipDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }
}
