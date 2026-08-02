package ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$string;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;", "dto", "", "prioritySku", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "toVo", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData;Ll20/d;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;Ljava/lang/Long;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;", "extractNotificationBar", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButton;", "updateWithPlaceholderIfNeeded", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButton;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "updateWithPlaceholderTitle", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class QuantMapperKt {
    public static final CartQuantVO.NotificationBar extractNotificationBar(@NotNull CartButtonQuantDto cartButtonQuantDto) {
        Intrinsics.checkNotNullParameter(cartButtonQuantDto, "<this>");
        CartButtonQuantDto.NotificationBar notificationBar = cartButtonQuantDto.getNotificationBar();
        if (notificationBar != null) {
            return new CartQuantVO.NotificationBar(notificationBar.getNotification(), notificationBar.getPresentationDelay() != null ? Long.valueOf(r3.intValue()) : null, !notificationBar.getRestrictToCurrentComposer());
        }
        NotificationAtom.NotificationWithIcon notification = cartButtonQuantDto.getNotification();
        if (notification != null) {
            return new CartQuantVO.NotificationBar(notification, null, false);
        }
        return null;
    }

    @NotNull
    public static final CartQuantVO toVo(@NotNull CartButtonQuantDto.Configuration.CartData cartData, @NotNull d widgetInfo, @NotNull CartButtonQuantDto dto, Long l11) {
        Intrinsics.checkNotNullParameter(cartData, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(dto, "dto");
        return new CartQuantVO(widgetInfo.d().hashCode(), l11 != null ? l11.longValue() : dto.getSku(), cartData.isInCart(), CartButtonQuantDto.Configuration.CartData.Buttons.copy$default(cartData.getInCart(), updateWithPlaceholderIfNeeded(cartData.getInCart().getButtonWithIcon()), null, 2, null), CartButtonQuantDto.Configuration.CartData.Buttons.copy$default(cartData.getToCart(), updateWithPlaceholderIfNeeded(cartData.getToCart().getButtonWithIcon()), null, 2, null), cartData.getInCartQty(), cartData.getFreeRest(), cartData.getMinAddToCartQuantity(), cartData.getMultiplicityValue(), cartData.getQuantMultiplicityValue(), null, dto.getNeedsShadow(), dto.getStyle(), extractNotificationBar(dto), false, false, 49152, null);
    }

    public static /* synthetic */ CartQuantVO toVo$default(CartButtonQuantDto.Configuration.CartData cartData, d dVar, CartButtonQuantDto cartButtonQuantDto, Long l11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        return toVo(cartData, dVar, cartButtonQuantDto, l11);
    }

    private static final CartButtonQuantDto.CartButton updateWithPlaceholderIfNeeded(CartButtonQuantDto.CartButton cartButton) {
        return cartButton.getAsyncFetchType() == CartButtonQuantDto.AsyncFetchType.TITLE ? CartButtonQuantDto.CartButton.copy$default(cartButton, updateWithPlaceholderTitle(cartButton.getButton()), null, null, null, null, null, null, 126, null) : cartButton;
    }

    @NotNull
    public static final ButtonV3Atom.LargeButton updateWithPlaceholderTitle(@NotNull ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(largeButton, "<this>");
        return ButtonV3Atom.LargeButton.copy$default(largeButton, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.pdp_loading_android)), null, null, null, null, null, null, null, null, 510, null);
    }
}
