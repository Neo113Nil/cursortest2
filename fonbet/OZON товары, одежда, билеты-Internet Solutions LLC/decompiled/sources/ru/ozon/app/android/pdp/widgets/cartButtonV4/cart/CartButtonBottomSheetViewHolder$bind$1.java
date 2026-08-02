package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonBottomSheetViewHolder$bind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CartVO $item;
    final /* synthetic */ CartButtonBottomSheetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonBottomSheetViewHolder$bind$1(CartButtonBottomSheetViewHolder cartButtonBottomSheetViewHolder, CartVO cartVO) {
        super(0);
        this.this$0 = cartButtonBottomSheetViewHolder;
        this.$item = cartVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CartViewV4 cartViewV4;
        View view;
        CartViewV4 cartViewV42;
        cartViewV4 = this.this$0.cartView;
        final CartVO cartVO = this.$item;
        final CartButtonBottomSheetViewHolder cartButtonBottomSheetViewHolder = this.this$0;
        int i11 = Y.f42258g;
        if (!cartViewV4.isLaidOut() || cartViewV4.isLayoutRequested()) {
            cartViewV4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartButtonBottomSheetViewHolder$bind$1$invoke$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    View view3;
                    CartViewV4 cartViewV43;
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    String relatedProductsCurtain = CartVO.this.getRelatedProductsCurtain();
                    if (relatedProductsCurtain != null) {
                        cartButtonBottomSheetViewHolder.bottomSheetView.bind(CartVO.this.getCurtainTrackingInfoVO(), relatedProductsCurtain);
                    }
                    view3 = cartButtonBottomSheetViewHolder.stickyPlaceHolderView;
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams == null) {
                        return;
                    }
                    int i12 = marginLayoutParams.leftMargin;
                    int i13 = marginLayoutParams.topMargin;
                    int i14 = marginLayoutParams.rightMargin;
                    int i15 = marginLayoutParams.bottomMargin;
                    cartViewV43 = cartButtonBottomSheetViewHolder.cartView;
                    marginLayoutParams.bottomMargin = cartViewV43.getHeight();
                    if (i12 == marginLayoutParams.leftMargin) {
                        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        if (i13 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                            if (i14 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                                if (i15 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                                    return;
                                }
                            }
                        }
                    }
                    view3.setLayoutParams(marginLayoutParams);
                }
            });
            return;
        }
        String relatedProductsCurtain = cartVO.getRelatedProductsCurtain();
        if (relatedProductsCurtain != null) {
            cartButtonBottomSheetViewHolder.bottomSheetView.bind(cartVO.getCurtainTrackingInfoVO(), relatedProductsCurtain);
        }
        view = cartButtonBottomSheetViewHolder.stickyPlaceHolderView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i12 = marginLayoutParams.leftMargin;
        int i13 = marginLayoutParams.topMargin;
        int i14 = marginLayoutParams.rightMargin;
        int i15 = marginLayoutParams.bottomMargin;
        cartViewV42 = cartButtonBottomSheetViewHolder.cartView;
        marginLayoutParams.bottomMargin = cartViewV42.getHeight();
        if (i12 == marginLayoutParams.leftMargin) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i13 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i14 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i15 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
