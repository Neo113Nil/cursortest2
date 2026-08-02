package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes13.dex */
public final class OrderDeliveryDetailsBottomDividerBinding implements a {

    @NonNull
    public final View bottomDivider;

    @NonNull
    private final View rootView;

    private OrderDeliveryDetailsBottomDividerBinding(@NonNull View view, @NonNull View view2) {
        this.rootView = view;
        this.bottomDivider = view2;
    }

    @NonNull
    public static OrderDeliveryDetailsBottomDividerBinding bind(@NonNull View view) {
        if (view != null) {
            return new OrderDeliveryDetailsBottomDividerBinding(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
