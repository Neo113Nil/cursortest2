package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;

/* loaded from: classes13.dex */
public final class ItemOrderShipmentAnnotationButtonBinding implements a {

    @NonNull
    public final SmallBorderlessButtonView buttonBa;

    @NonNull
    private final SmallBorderlessButtonView rootView;

    private ItemOrderShipmentAnnotationButtonBinding(@NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull SmallBorderlessButtonView smallBorderlessButtonView2) {
        this.rootView = smallBorderlessButtonView;
        this.buttonBa = smallBorderlessButtonView2;
    }

    @NonNull
    public static ItemOrderShipmentAnnotationButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) view;
        return new ItemOrderShipmentAnnotationButtonBinding(smallBorderlessButtonView, smallBorderlessButtonView);
    }

    @NonNull
    public static ItemOrderShipmentAnnotationButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_shipment_annotation_button, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public SmallBorderlessButtonView getRoot() {
        return this.rootView;
    }
}
