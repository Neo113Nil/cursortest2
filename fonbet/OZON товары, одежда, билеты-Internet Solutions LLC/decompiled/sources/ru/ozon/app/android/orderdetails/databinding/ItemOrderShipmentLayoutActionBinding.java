package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;

/* loaded from: classes13.dex */
public final class ItemOrderShipmentLayoutActionBinding implements a {

    @NonNull
    public final LargeBorderlessButtonView orderActionItem;

    @NonNull
    private final LargeBorderlessButtonView rootView;

    private ItemOrderShipmentLayoutActionBinding(@NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull LargeBorderlessButtonView largeBorderlessButtonView2) {
        this.rootView = largeBorderlessButtonView;
        this.orderActionItem = largeBorderlessButtonView2;
    }

    @NonNull
    public static ItemOrderShipmentLayoutActionBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) view;
        return new ItemOrderShipmentLayoutActionBinding(largeBorderlessButtonView, largeBorderlessButtonView);
    }

    @Override // X4.a
    @NonNull
    public LargeBorderlessButtonView getRoot() {
        return this.rootView;
    }
}
