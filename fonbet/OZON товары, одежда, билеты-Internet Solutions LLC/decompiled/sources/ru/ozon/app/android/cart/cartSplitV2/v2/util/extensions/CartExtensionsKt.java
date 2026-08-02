package ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions;

import WZ.l;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.CheckBoxExtKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CheckboxVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeButtonVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeInfoVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0019\u001a\u00020\u0018*\u00020\u000f2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "adapterPosition", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lm10/d;", "composerAdapter", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getActionWithScrollParams", "(Lru/ozon/uni/atoms/af/AtomAction;ILru/ozon/app/android/composer/ComposerReferences;Lm10/d;)Lru/ozon/uni/atoms/af/AtomAction$Click;", "bindingAdapter", "Lkotlin/Pair;", "findPreviousScrollAnchor", "(ILm10/d;)Lkotlin/Pair;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "toInvertCheckBoxState", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;)Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function0;", "Ll20/d;", "getWidgetInfo", "", "trackSelectAction", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;LWZ/l;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "lockRemoveButton", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;)Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartExtensionsKt {
    private static final Pair<Integer, Integer> findPreviousScrollAnchor(int i11, C8042d c8042d) {
        Integer num;
        Integer scrollWidgetKey;
        c b11 = c8042d != null ? c8042d.b(i11) : null;
        loop0: while (true) {
            num = null;
            while (i11 > 0 && num == null) {
                i11--;
                c b12 = c8042d != null ? c8042d.b(i11) : null;
                if (b12 != null && (scrollWidgetKey = b12.getScrollWidgetKey()) != null) {
                    boolean z11 = false;
                    if (b11 != null && b12.getId() == b11.getId()) {
                        z11 = true;
                    }
                    if (!z11) {
                        num = scrollWidgetKey;
                    }
                }
            }
        }
        return new Pair<>(Integer.valueOf(i11), Integer.valueOf(num != null ? num.intValue() : -1));
    }

    public static final AtomAction.Click getActionWithScrollParams(@NotNull AtomAction action, int i11, @NotNull ComposerReferences composerReferences, C8042d c8042d) {
        View view;
        View rootView;
        RecyclerView composerRecyclerViewOrNull;
        RecyclerView.C findViewHolderForAdapterPosition;
        View view2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        LinkedHashMap linkedHashMap = null;
        if (!(action instanceof AtomAction.Click)) {
            return null;
        }
        if (i11 == -1 || i11 == 0) {
            return (AtomAction.Click) action;
        }
        Pair<Integer, Integer> findPreviousScrollAnchor = findPreviousScrollAnchor(i11, c8042d);
        int intValue = findPreviousScrollAnchor.a().intValue();
        int intValue2 = findPreviousScrollAnchor.b().intValue();
        ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
        int y11 = (c11 == null || (view = c11.getView()) == null || (rootView = view.getRootView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) == null || (findViewHolderForAdapterPosition = composerRecyclerViewOrNull.findViewHolderForAdapterPosition(intValue)) == null || (view2 = findViewHolderForAdapterPosition.itemView) == null) ? 0 : (int) view2.getY();
        AtomAction.Click click = (AtomAction.Click) action;
        Map<String, String> params = click.getParams();
        if (params != null) {
            linkedHashMap = U.u(params);
            linkedHashMap.put("widgetScrollId", String.valueOf(intValue2));
            linkedHashMap.put("widgetOffsetScroll", String.valueOf(y11));
            Unit unit = Unit.f71690a;
        }
        return AtomAction.Click.copy$default(click, null, null, null, linkedHashMap, null, null, 55, null);
    }

    @NotNull
    public static final SwipeInfoVO lockRemoveButton(@NotNull SwipeInfoVO swipeInfoVO) {
        Intrinsics.checkNotNullParameter(swipeInfoVO, "<this>");
        SwipeButtonVO removeButton = swipeInfoVO.getRemoveButton();
        return SwipeInfoVO.copy$default(swipeInfoVO, null, null, null, removeButton != null ? SwipeButtonVO.copy$default(removeButton, 0, null, null, true, 7, null) : null, 7, null);
    }

    public static final CartSplitV2ProductVO toInvertCheckBoxState(@NotNull CartSplitV2ProductVO cartSplitV2ProductVO) {
        CheckBoxDTO checkbox;
        Intrinsics.checkNotNullParameter(cartSplitV2ProductVO, "<this>");
        CheckboxVO checkbox2 = cartSplitV2ProductVO.getProduct().getCheckbox();
        if (checkbox2 == null || (checkbox = checkbox2.getCheckbox()) == null) {
            return null;
        }
        CheckBoxDTO invertCheckBoxState = CheckBoxExtKt.toInvertCheckBoxState(checkbox);
        boolean z11 = invertCheckBoxState.getStatus() == CheckBoxDTO.CheckboxStatus.SELECTED;
        CheckboxVO checkbox3 = cartSplitV2ProductVO.getProduct().getCheckbox();
        AtomAction action = cartSplitV2ProductVO.getProduct().getCheckbox().getAction();
        CheckboxVO copy = checkbox3.copy(action != null ? CheckBoxExtKt.toInvertActionOfCheckBox(action, z11) : null, invertCheckBoxState);
        return CartSplitV2ProductVO.copy$default(cartSplitV2ProductVO, 0L, copy, ProductVOV2.copy$default(cartSplitV2ProductVO.getProduct(), null, null, null, null, null, copy, null, 95, null), null, 9, null);
    }

    public static final void trackSelectAction(@NotNull CartSplitV2ProductVO cartSplitV2ProductVO, @NotNull l tokenizedAnalytics, @NotNull Function0<d> getWidgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CheckBoxDTO checkbox;
        Intrinsics.checkNotNullParameter(cartSplitV2ProductVO, "<this>");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(getWidgetInfo, "getWidgetInfo");
        CheckboxVO checkbox2 = cartSplitV2ProductVO.getCheckbox();
        AtomAction action = checkbox2 != null ? checkbox2.getAction() : null;
        AtomAction.SendAnalytics sendAnalytics = action instanceof AtomAction.SendAnalytics ? (AtomAction.SendAnalytics) action : null;
        if (sendAnalytics == null || (trackingInfo = sendAnalytics.getTrackingInfo()) == null || (checkbox = cartSplitV2ProductVO.getCheckbox().getCheckbox()) == null) {
            return;
        }
        CheckBoxExtKt.trackSelectAction(checkbox, tokenizedAnalytics, trackingInfo, getWidgetInfo);
    }
}
