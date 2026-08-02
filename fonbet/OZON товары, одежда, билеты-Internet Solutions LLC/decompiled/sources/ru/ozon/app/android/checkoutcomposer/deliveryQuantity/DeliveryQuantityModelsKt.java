package ru.ozon.app.android.checkoutcomposer.deliveryQuantity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.DeliveryQuantityDTO;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.DeliveryQuantityVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0000\u001a\u00020\u000b*\u00020\f¨\u0006\r"}, d2 = {"toVO", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO;", "stateId", "", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Header;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Header;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Selector;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector$SelectorElement;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Selector$SelectorElement;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$BottomMessage;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$BottomMessage;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryQuantityModelsKt {
    @NotNull
    public static final DeliveryQuantityVO toVO(@NotNull DeliveryQuantityDTO deliveryQuantityDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(deliveryQuantityDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        DeliveryQuantityDTO.Header header = deliveryQuantityDTO.getHeader();
        DeliveryQuantityVO.Header vo = header != null ? toVO(header) : null;
        DeliveryQuantityVO.Selector vo2 = toVO(deliveryQuantityDTO.getSelector());
        DeliveryQuantityDTO.BottomMessage bottomMessage = deliveryQuantityDTO.getBottomMessage();
        return new DeliveryQuantityVO(hashCode, vo, vo2, bottomMessage != null ? toVO(bottomMessage) : null, deliveryQuantityDTO.getTrackingInfo());
    }

    @NotNull
    public static final DeliveryQuantityVO.Header toVO(@NotNull DeliveryQuantityDTO.Header header) {
        Intrinsics.checkNotNullParameter(header, "<this>");
        return new DeliveryQuantityVO.Header(header.getTitle(), header.getButton());
    }

    @NotNull
    public static final DeliveryQuantityVO.Selector toVO(@NotNull DeliveryQuantityDTO.Selector selector) {
        Intrinsics.checkNotNullParameter(selector, "<this>");
        List<DeliveryQuantityDTO.Selector.SelectorElement> elements = selector.getElements();
        ArrayList arrayList = new ArrayList(C7714v.z(elements, 10));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((DeliveryQuantityDTO.Selector.SelectorElement) it.next()));
        }
        String backgroundColor = selector.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_0.getToken();
        }
        String selectedColor = selector.getSelectedColor();
        if (selectedColor == null) {
            selectedColor = UniColors.BG_ACTION_PRIMARY.getToken();
        }
        return new DeliveryQuantityVO.Selector(arrayList, backgroundColor, selectedColor);
    }

    @NotNull
    public static final DeliveryQuantityVO.Selector.SelectorElement toVO(@NotNull DeliveryQuantityDTO.Selector.SelectorElement selectorElement) {
        TextDTO textDTO;
        TextDTO textDTO2;
        OzonSpannableString ozonSpannableString;
        Intrinsics.checkNotNullParameter(selectorElement, "<this>");
        boolean isSelected = selectorElement.isSelected();
        AtomActionDTO action = selectorElement.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = selectorElement.getTrackingInfo();
        TextDTO title = selectorElement.getTitle();
        if (title == null) {
            String text = selectorElement.getText();
            if (text == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(text)) == null) {
                ozonSpannableString = new OzonSpannableString();
            }
            textDTO = new TextDTO(ozonSpannableString, null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_CONTROL_400_SMALL.getToken(), (selectorElement.isSelected() ? UniColors.BG_LIGHT_KEY : UniColors.TEXT_PRIMARY).getToken(), null, null, null, null, false, null, null, null, null, 1, 261694, null);
        } else {
            textDTO = title;
        }
        TextDTO subtitle = selectorElement.getSubtitle();
        if (subtitle == null) {
            if (selectorElement.getSubtext() != null) {
                textDTO2 = new TextDTO(OzonSpannableStringKt.toOzonSpannableString(selectorElement.getSubtext()), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_300_X_SMALL.getToken(), (selectorElement.isSelected() ? UniColors.BG_LIGHT_KEY : UniColors.TEXT_SECONDARY).getToken(), null, null, null, null, false, null, null, null, null, 1, 261694, null);
                return new DeliveryQuantityVO.Selector.SelectorElement(isSelected, action, trackingInfo, textDTO, textDTO2);
            }
            subtitle = null;
        }
        textDTO2 = subtitle;
        return new DeliveryQuantityVO.Selector.SelectorElement(isSelected, action, trackingInfo, textDTO, textDTO2);
    }

    @NotNull
    public static final DeliveryQuantityVO.BottomMessage toVO(@NotNull DeliveryQuantityDTO.BottomMessage bottomMessage) {
        Intrinsics.checkNotNullParameter(bottomMessage, "<this>");
        return new DeliveryQuantityVO.BottomMessage(bottomMessage.getMessage(), bottomMessage.getIcon());
    }
}
