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
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuantWithBadge;

/* loaded from: classes13.dex */
public final class WidgetCartbuttonQuantDoublecartBinding implements a {

    @NonNull
    public final CartButtonQuantWithBadge firstCb;

    @NonNull
    private final View rootView;

    @NonNull
    public final CartButtonQuant secondCb;

    private WidgetCartbuttonQuantDoublecartBinding(@NonNull View view, @NonNull CartButtonQuantWithBadge cartButtonQuantWithBadge, @NonNull CartButtonQuant cartButtonQuant) {
        this.rootView = view;
        this.firstCb = cartButtonQuantWithBadge;
        this.secondCb = cartButtonQuant;
    }

    @NonNull
    public static WidgetCartbuttonQuantDoublecartBinding bind(@NonNull View view) {
        int i11 = R$id.firstCb;
        CartButtonQuantWithBadge cartButtonQuantWithBadge = (CartButtonQuantWithBadge) C2548q.d(i11, view);
        if (cartButtonQuantWithBadge != null) {
            i11 = R$id.secondCb;
            CartButtonQuant cartButtonQuant = (CartButtonQuant) C2548q.d(i11, view);
            if (cartButtonQuant != null) {
                return new WidgetCartbuttonQuantDoublecartBinding(view, cartButtonQuantWithBadge, cartButtonQuant);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetCartbuttonQuantDoublecartBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_cartbutton_quant_doublecart, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
