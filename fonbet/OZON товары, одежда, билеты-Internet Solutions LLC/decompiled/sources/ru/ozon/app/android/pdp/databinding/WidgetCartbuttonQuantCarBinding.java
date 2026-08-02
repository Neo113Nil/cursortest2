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
public final class WidgetCartbuttonQuantCarBinding implements a {

    @NonNull
    public final CartButtonQuant mainBtn;

    @NonNull
    private final View rootView;

    private WidgetCartbuttonQuantCarBinding(@NonNull View view, @NonNull CartButtonQuant cartButtonQuant) {
        this.rootView = view;
        this.mainBtn = cartButtonQuant;
    }

    @NonNull
    public static WidgetCartbuttonQuantCarBinding bind(@NonNull View view) {
        int i11 = R$id.mainBtn;
        CartButtonQuant cartButtonQuant = (CartButtonQuant) C2548q.d(i11, view);
        if (cartButtonQuant != null) {
            return new WidgetCartbuttonQuantCarBinding(view, cartButtonQuant);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetCartbuttonQuantCarBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_cartbutton_quant_car, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
