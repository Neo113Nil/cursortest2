package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButton;

/* loaded from: classes13.dex */
public final class WidgetCartbuttonCartV4Binding implements a {

    @NonNull
    public final CartButton mainBtn;

    @NonNull
    private final View rootView;

    private WidgetCartbuttonCartV4Binding(@NonNull View view, @NonNull CartButton cartButton) {
        this.rootView = view;
        this.mainBtn = cartButton;
    }

    @NonNull
    public static WidgetCartbuttonCartV4Binding bind(@NonNull View view) {
        int i11 = R$id.mainBtn;
        CartButton cartButton = (CartButton) C2548q.d(i11, view);
        if (cartButton != null) {
            return new WidgetCartbuttonCartV4Binding(view, cartButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetCartbuttonCartV4Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_cartbutton_cart_v4, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
