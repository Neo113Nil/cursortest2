package ru.ozon.app.android.fresh.cart.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetStickyTotalBinding implements a {

    @NonNull
    public final ButtonV3View button;

    @NonNull
    public final CartPickerView countPicker;

    @NonNull
    public final PriceAtomView price;

    @NonNull
    public final PriceAtomView priceWithoutCard;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FrameLayout stickyBorderContainer;

    private WidgetStickyTotalBinding(@NonNull FrameLayout frameLayout, @NonNull ButtonV3View buttonV3View, @NonNull CartPickerView cartPickerView, @NonNull PriceAtomView priceAtomView, @NonNull PriceAtomView priceAtomView2, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.button = buttonV3View;
        this.countPicker = cartPickerView;
        this.price = priceAtomView;
        this.priceWithoutCard = priceAtomView2;
        this.stickyBorderContainer = frameLayout2;
    }

    @NonNull
    public static WidgetStickyTotalBinding bind(@NonNull View view) {
        int i11 = R$id.button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.countPicker;
            CartPickerView cartPickerView = (CartPickerView) C2548q.d(i11, view);
            if (cartPickerView != null) {
                i11 = R$id.price;
                PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                if (priceAtomView != null) {
                    i11 = R$id.priceWithoutCard;
                    PriceAtomView priceAtomView2 = (PriceAtomView) C2548q.d(i11, view);
                    if (priceAtomView2 != null) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        return new WidgetStickyTotalBinding(frameLayout, buttonV3View, cartPickerView, priceAtomView, priceAtomView2, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
