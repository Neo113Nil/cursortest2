package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import WZ.t;
import WZ.x;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.CurtainTrackingInfoVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\f*\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0018\u0010!\u001a\u00020\t*\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0018\u0010#\u001a\u00020\t*\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Landroid/view/View;", "", "height", "", "progress", "", "hideToTopAnimation", "(Landroid/view/View;IF)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "mainButton", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "quantity", "toCartButtonQuantityPlaceholder", "(Lru/ozon/uni/atoms/data/text/TextDTO;I)Lru/ozon/uni/atoms/data/text/TextDTO;", "", "getSelectedDeliverySchema", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Ljava/lang/Long;", "", "getForStars", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Ljava/lang/Boolean;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CurtainTrackingInfo;", "widgetId", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "toVo", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CurtainTrackingInfo;J)Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "Lkotlin/text/Regex;", "PLACEHOLDER_REGEX", "Lkotlin/text/Regex;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "getFirstToCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "firstToCart", "getSecondToCart", "secondToCart", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtKt {

    @NotNull
    private static final Regex PLACEHOLDER_REGEX = new Regex("%ld");

    @NotNull
    public static final ButtonV3Atom.LargeButton getFirstToCart(@NotNull DoubleCartVO doubleCartVO) {
        Intrinsics.checkNotNullParameter(doubleCartVO, "<this>");
        return mainButton(doubleCartVO.getFirstCartData().getToCart());
    }

    public static final Boolean getForStars(@NotNull ButtonV3Atom.LargeButton largeButton) {
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(largeButton, "<this>");
        AtomActionDTO action = largeButton.getAction();
        if (action == null || (params = action.getParams()) == null || (str = params.get("forStars")) == null) {
            return null;
        }
        return h.t0(str);
    }

    @NotNull
    public static final ButtonV3Atom.LargeButton getSecondToCart(@NotNull DoubleCartVO doubleCartVO) {
        Intrinsics.checkNotNullParameter(doubleCartVO, "<this>");
        return mainButton(doubleCartVO.getSecondCartData().getToCart());
    }

    public static final Long getSelectedDeliverySchema(@NotNull ButtonV3Atom.LargeButton largeButton) {
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(largeButton, "<this>");
        AtomActionDTO action = largeButton.getAction();
        if (action == null || (params = action.getParams()) == null || (str = params.get("selectedDeliverySchema")) == null) {
            return null;
        }
        return h.y0(str);
    }

    public static final void hideToTopAnimation(@NotNull View view, int i11, float f7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().cancel();
        view.animate().translationY((-i11) * f7).setDuration(0L).start();
    }

    @NotNull
    public static final ButtonV3Atom.LargeButton mainButton(@NotNull CartButtonV4Dto.Configuration.CartData.Buttons buttons) {
        Intrinsics.checkNotNullParameter(buttons, "<this>");
        return buttons.getButtonWithIcon().getButton();
    }

    @NotNull
    public static final TextDTO toCartButtonQuantityPlaceholder(TextDTO textDTO, int i11) {
        if (textDTO != null) {
            TextDTO copy$default = TextDTO.copy$default(textDTO, OzonSpannableStringKt.toOzonSpannableString(PLACEHOLDER_REGEX.replace(textDTO.getText(), String.valueOf(i11))), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
            if (copy$default != null) {
                return copy$default;
            }
        }
        return new TextDTO(OzonSpannableStringKt.toOzonSpannableString(String.valueOf(i11)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
    }

    @NotNull
    public static final CurtainTrackingInfoVO toVo(@NotNull CartButtonV4Dto.CurtainTrackingInfo curtainTrackingInfo, long j11) {
        Intrinsics.checkNotNullParameter(curtainTrackingInfo, "<this>");
        Map<String, TokenizedTrackingInfo> open = curtainTrackingInfo.getOpen();
        t vo$toClickTokenizedEvent = open != null ? toVo$toClickTokenizedEvent(open, j11) : null;
        Map<String, TokenizedTrackingInfo> openFull = curtainTrackingInfo.getOpenFull();
        t vo$toClickTokenizedEvent2 = openFull != null ? toVo$toClickTokenizedEvent(openFull, j11) : null;
        Map<String, TokenizedTrackingInfo> closeFull = curtainTrackingInfo.getCloseFull();
        t vo$toClickTokenizedEvent3 = closeFull != null ? toVo$toClickTokenizedEvent(closeFull, j11) : null;
        Map<String, TokenizedTrackingInfo> miniCloseSwipe = curtainTrackingInfo.getMiniCloseSwipe();
        t vo$toClickTokenizedEvent4 = miniCloseSwipe != null ? toVo$toClickTokenizedEvent(miniCloseSwipe, j11) : null;
        Map<String, TokenizedTrackingInfo> miniCloseTap = curtainTrackingInfo.getMiniCloseTap();
        t vo$toClickTokenizedEvent5 = miniCloseTap != null ? toVo$toClickTokenizedEvent(miniCloseTap, j11) : null;
        Map<String, TokenizedTrackingInfo> reopenFull = curtainTrackingInfo.getReopenFull();
        return new CurtainTrackingInfoVO(vo$toClickTokenizedEvent, vo$toClickTokenizedEvent4, vo$toClickTokenizedEvent5, vo$toClickTokenizedEvent2, vo$toClickTokenizedEvent3, reopenFull != null ? toVo$toClickTokenizedEvent(reopenFull, j11) : null);
    }

    private static final t toVo$toClickTokenizedEvent(Map<String, TokenizedTrackingInfo> map, long j11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.put("click", ((Map.Entry) it.next()).getValue());
        }
        return x.b(linkedHashMap, Long.valueOf(j11), null);
    }
}
