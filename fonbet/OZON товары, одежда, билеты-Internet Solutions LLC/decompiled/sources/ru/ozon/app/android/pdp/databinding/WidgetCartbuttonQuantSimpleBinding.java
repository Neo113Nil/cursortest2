package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuant;

/* loaded from: classes13.dex */
public final class WidgetCartbuttonQuantSimpleBinding implements a {

    @NonNull
    public final CartButtonQuant cartButton;

    @NonNull
    private final View rootView;

    @NonNull
    public final View separatorView;

    private WidgetCartbuttonQuantSimpleBinding(@NonNull View view, @NonNull CartButtonQuant cartButtonQuant, @NonNull View view2) {
        this.rootView = view;
        this.cartButton = cartButtonQuant;
        this.separatorView = view2;
    }

    @NonNull
    public static WidgetCartbuttonQuantSimpleBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.cartButton;
        CartButtonQuant cartButtonQuant = (CartButtonQuant) C2548q.d(i11, view);
        if (cartButtonQuant == null || (d11 = C2548q.d((i11 = R$id.separatorView), view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new WidgetCartbuttonQuantSimpleBinding(view, cartButtonQuant, d11);
    }

    @NonNull
    public static WidgetCartbuttonQuantSimpleBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_cartbutton_quant_simple, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
