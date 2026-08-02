package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetBottomCartBinding implements a {

    @NonNull
    public final ConstraintLayout bottomCartLayout;

    @NonNull
    public final ButtonV3View cartButton;

    @NonNull
    public final ButtonV3View catalogButton;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetBottomCartBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ButtonV3View buttonV3View, @NonNull ButtonV3View buttonV3View2) {
        this.rootView = constraintLayout;
        this.bottomCartLayout = constraintLayout2;
        this.cartButton = buttonV3View;
        this.catalogButton = buttonV3View2;
    }

    @NonNull
    public static WidgetBottomCartBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.cartButton;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.catalogButton;
            ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View2 != null) {
                return new WidgetBottomCartBinding(constraintLayout, constraintLayout, buttonV3View, buttonV3View2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetBottomCartBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WidgetBottomCartBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_bottom_cart, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
