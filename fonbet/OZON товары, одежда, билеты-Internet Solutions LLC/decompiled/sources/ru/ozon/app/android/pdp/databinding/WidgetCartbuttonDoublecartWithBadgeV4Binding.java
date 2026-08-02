package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButtonWithBadge;

/* loaded from: classes13.dex */
public final class WidgetCartbuttonDoublecartWithBadgeV4Binding implements a {

    @NonNull
    public final CartButtonWithBadge firstCb;

    @NonNull
    private final View rootView;

    @NonNull
    public final CartButtonWithBadge secondCb;

    private WidgetCartbuttonDoublecartWithBadgeV4Binding(@NonNull View view, @NonNull CartButtonWithBadge cartButtonWithBadge, @NonNull CartButtonWithBadge cartButtonWithBadge2) {
        this.rootView = view;
        this.firstCb = cartButtonWithBadge;
        this.secondCb = cartButtonWithBadge2;
    }

    @NonNull
    public static WidgetCartbuttonDoublecartWithBadgeV4Binding bind(@NonNull View view) {
        int i11 = R$id.firstCb;
        CartButtonWithBadge cartButtonWithBadge = (CartButtonWithBadge) C2548q.d(i11, view);
        if (cartButtonWithBadge != null) {
            i11 = R$id.secondCb;
            CartButtonWithBadge cartButtonWithBadge2 = (CartButtonWithBadge) C2548q.d(i11, view);
            if (cartButtonWithBadge2 != null) {
                return new WidgetCartbuttonDoublecartWithBadgeV4Binding(view, cartButtonWithBadge, cartButtonWithBadge2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetCartbuttonDoublecartWithBadgeV4Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_cartbutton_doublecart_with_badge_v4, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
