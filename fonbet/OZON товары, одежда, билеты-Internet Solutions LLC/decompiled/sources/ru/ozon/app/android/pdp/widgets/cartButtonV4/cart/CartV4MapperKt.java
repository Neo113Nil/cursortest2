package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$string;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;", "dto", "", "prioritySku", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "toVo", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData;Ll20/d;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;Ljava/lang/Long;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "extractNotificationBar", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "updateWithPlaceholderIfNeeded", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "updateWithPlaceholderTitle", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartV4MapperKt {
    public static final CartVO.NotificationBar extractNotificationBar(@NotNull CartButtonV4Dto cartButtonV4Dto) {
        Intrinsics.checkNotNullParameter(cartButtonV4Dto, "<this>");
        CartButtonV4Dto.NotificationBar notificationBar = cartButtonV4Dto.getNotificationBar();
        if (notificationBar != null) {
            return new CartVO.NotificationBar(notificationBar.getNotification(), notificationBar.getPresentationDelay() != null ? Long.valueOf(r3.intValue()) : null, !notificationBar.getRestrictToCurrentComposer());
        }
        NotificationAtom.NotificationWithIcon notification = cartButtonV4Dto.getNotification();
        if (notification != null) {
            return new CartVO.NotificationBar(notification, null, false);
        }
        return null;
    }

    @NotNull
    public static final CartVO toVo(@NotNull CartButtonV4Dto.Configuration.CartData cartData, @NotNull d widgetInfo, @NotNull CartButtonV4Dto dto, Long l11) {
        Intrinsics.checkNotNullParameter(cartData, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(dto, "dto");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        long longValue = l11 != null ? l11.longValue() : dto.getSku();
        boolean isInCart = cartData.isInCart();
        CartButtonV4Dto.Configuration.CartData.Buttons copy$default = CartButtonV4Dto.Configuration.CartData.Buttons.copy$default(cartData.getInCart(), updateWithPlaceholderIfNeeded(cartData.getInCart().getButtonWithIcon()), null, 2, null);
        CartButtonV4Dto.Configuration.CartData.Buttons copy$default2 = CartButtonV4Dto.Configuration.CartData.Buttons.copy$default(cartData.getToCart(), updateWithPlaceholderIfNeeded(cartData.getToCart().getButtonWithIcon()), null, 2, null);
        int inCartQty = cartData.getInCartQty();
        int freeRest = cartData.getFreeRest();
        Integer minAddToCartQuantity = cartData.getMinAddToCartQuantity();
        boolean needsShadow = dto.getNeedsShadow();
        Integer multiplicityValue = cartData.getMultiplicityValue();
        CartButtonV4Dto.CartButtonStyle style = dto.getStyle();
        CartVO.NotificationBar extractNotificationBar = extractNotificationBar(dto);
        String relatedProductsCurtain = dto.getRelatedProductsCurtain();
        String str = (relatedProductsCurtain == null || relatedProductsCurtain.length() <= 0 || h.K(relatedProductsCurtain)) ? null : relatedProductsCurtain;
        CartButtonV4Dto.CurtainTrackingInfo curtainTrackingInfo = dto.getCurtainTrackingInfo();
        return new CartVO(widgetId, longValue, isInCart, copy$default, copy$default2, inCartQty, freeRest, minAddToCartQuantity, multiplicityValue, null, needsShadow, style, extractNotificationBar, false, false, str, curtainTrackingInfo != null ? ExtKt.toVo(curtainTrackingInfo, widgetId) : null, 24576, null);
    }

    public static /* synthetic */ CartVO toVo$default(CartButtonV4Dto.Configuration.CartData cartData, d dVar, CartButtonV4Dto cartButtonV4Dto, Long l11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        return toVo(cartData, dVar, cartButtonV4Dto, l11);
    }

    private static final CartButtonV4Dto.CartButton updateWithPlaceholderIfNeeded(CartButtonV4Dto.CartButton cartButton) {
        return cartButton.getAsyncFetchType() == CartButtonV4Dto.AsyncFetchType.TITLE ? CartButtonV4Dto.CartButton.copy$default(cartButton, updateWithPlaceholderTitle(cartButton.getButton()), null, null, null, null, null, 62, null) : cartButton;
    }

    @NotNull
    public static final ButtonV3Atom.LargeButton updateWithPlaceholderTitle(@NotNull ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(largeButton, "<this>");
        return ButtonV3Atom.LargeButton.copy$default(largeButton, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.pdp_loading_android)), null, null, null, null, null, null, null, null, 510, null);
    }
}
