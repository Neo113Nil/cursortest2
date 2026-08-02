package ru.ozon.app.android.product.molecules.countbutton.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVO;
import ru.ozon.app.android.storefront.data.tiles.countbutton.CountButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.countbutton.UpdateCartMode;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\u0006\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO;", "", "tileId", "", "widgetId", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "toVo", "(Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO;Ljava/lang/String;J)Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO$UpdateCart;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;", "(Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO$UpdateCart;)Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CountButtonVOKt {
    public static final CountButtonVO toVo(@NotNull CountButtonDTO countButtonDTO, String str, long j11) {
        Long y02;
        String automatizationId;
        TestInfo testInfo;
        TestInfo testInfo2;
        Intrinsics.checkNotNullParameter(countButtonDTO, "<this>");
        if (str == null || (y02 = h.y0(str)) == null) {
            return null;
        }
        long longValue = y02.longValue();
        Object action = countButtonDTO.getAction();
        CountButtonDTO.UpdateCart updateCart = action instanceof CountButtonDTO.UpdateCart ? (CountButtonDTO.UpdateCart) action : null;
        Object action2 = countButtonDTO.getAction();
        CommonControlSettings commonControlSettings = action2 instanceof CommonControlSettings ? (CommonControlSettings) action2 : null;
        if (commonControlSettings == null || (testInfo2 = commonControlSettings.getTestInfo()) == null || (automatizationId = testInfo2.getAutomatizationId()) == null) {
            automatizationId = (updateCart == null || (testInfo = updateCart.getTestInfo()) == null) ? null : testInfo.getAutomatizationId();
        }
        String icon = countButtonDTO.getIcon();
        String iconColor = countButtonDTO.getIconColor();
        if (iconColor == null) {
            iconColor = UniColors.GRAPHIC_DARK_KEY.getToken();
        }
        String str2 = iconColor;
        String backgroundColor = countButtonDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_LIGHT_KEY.getToken();
        }
        String str3 = backgroundColor;
        Boolean isDisabled = countButtonDTO.isDisabled();
        boolean booleanValue = isDisabled != null ? isDisabled.booleanValue() : false;
        CountButtonVO.UpdateCart vo = updateCart != null ? toVo(updateCart) : null;
        AtomAction atomAction = commonControlSettings != null ? commonControlSettings.toAtomAction() : null;
        if (automatizationId == null) {
            automatizationId = "countButton";
        }
        return new CountButtonVO(longValue, booleanValue, j11, icon, str2, str3, vo, atomAction, automatizationId);
    }

    @NotNull
    public static final CountButtonVO.UpdateCart toVo(@NotNull CountButtonDTO.UpdateCart updateCart) {
        Intrinsics.checkNotNullParameter(updateCart, "<this>");
        Integer quantity = updateCart.getQuantity();
        int intValue = quantity != null ? quantity.intValue() : 1;
        Integer minItems = updateCart.getMinItems();
        int intValue2 = minItems != null ? minItems.intValue() : 1;
        int maxItems = updateCart.getMaxItems();
        Long selectedDeliverySchema = updateCart.getSelectedDeliverySchema();
        UpdateCartMode mode = updateCart.getMode();
        if (mode == null) {
            mode = UpdateCartMode.INCREMENT;
        }
        return new CountButtonVO.UpdateCart(intValue, intValue2, maxItems, selectedDeliverySchema, mode, updateCart.getTrackingInfo(), updateCart.getExtendMap());
    }
}
