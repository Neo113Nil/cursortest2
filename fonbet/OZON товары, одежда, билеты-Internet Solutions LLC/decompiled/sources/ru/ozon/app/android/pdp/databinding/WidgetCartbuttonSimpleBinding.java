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
public final class WidgetCartbuttonSimpleBinding implements a {

    @NonNull
    public final CartButton cartButton;

    @NonNull
    private final View rootView;

    @NonNull
    public final View separatorView;

    private WidgetCartbuttonSimpleBinding(@NonNull View view, @NonNull CartButton cartButton, @NonNull View view2) {
        this.rootView = view;
        this.cartButton = cartButton;
        this.separatorView = view2;
    }

    @NonNull
    public static WidgetCartbuttonSimpleBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.cartButton;
        CartButton cartButton = (CartButton) C2548q.d(i11, view);
        if (cartButton == null || (d11 = C2548q.d((i11 = R$id.separatorView), view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new WidgetCartbuttonSimpleBinding(view, cartButton, d11);
    }

    @NonNull
    public static WidgetCartbuttonSimpleBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_cartbutton_simple, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
