package ru.ozon.app.android.cart.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes11.dex */
public final class WidgetAllToCartBinding implements a {

    @NonNull
    public final LargeButtonView btnAllToCart;

    @NonNull
    private final FrameLayout rootView;

    private WidgetAllToCartBinding(@NonNull FrameLayout frameLayout, @NonNull LargeButtonView largeButtonView) {
        this.rootView = frameLayout;
        this.btnAllToCart = largeButtonView;
    }

    @NonNull
    public static WidgetAllToCartBinding bind(@NonNull View view) {
        int i11 = R$id.btnAllToCart;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            return new WidgetAllToCartBinding((FrameLayout) view, largeButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
