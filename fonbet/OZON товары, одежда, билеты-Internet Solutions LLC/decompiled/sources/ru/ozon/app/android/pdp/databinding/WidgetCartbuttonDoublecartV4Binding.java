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
public final class WidgetCartbuttonDoublecartV4Binding implements a {

    @NonNull
    public final CartButton firstCb;

    @NonNull
    private final View rootView;

    @NonNull
    public final CartButton secondCb;

    private WidgetCartbuttonDoublecartV4Binding(@NonNull View view, @NonNull CartButton cartButton, @NonNull CartButton cartButton2) {
        this.rootView = view;
        this.firstCb = cartButton;
        this.secondCb = cartButton2;
    }

    @NonNull
    public static WidgetCartbuttonDoublecartV4Binding bind(@NonNull View view) {
        int i11 = R$id.firstCb;
        CartButton cartButton = (CartButton) C2548q.d(i11, view);
        if (cartButton != null) {
            i11 = R$id.secondCb;
            CartButton cartButton2 = (CartButton) C2548q.d(i11, view);
            if (cartButton2 != null) {
                return new WidgetCartbuttonDoublecartV4Binding(view, cartButton, cartButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetCartbuttonDoublecartV4Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_cartbutton_doublecart_v4, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
