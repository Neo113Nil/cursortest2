package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.R$layout;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;

/* loaded from: classes3.dex */
public final class ItemTravelPaymentV3ImageBinding implements a {

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    @NonNull
    public final ShapeableImageView travelPaymentV3ImageBgIV;

    private ItemTravelPaymentV3ImageBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull ShapeableImageView shapeableImageView) {
        this.rootView = constraintLayoutWithBorder;
        this.travelPaymentV3ImageBgIV = shapeableImageView;
    }

    @NonNull
    public static ItemTravelPaymentV3ImageBinding bind(@NonNull View view) {
        int i11 = R$id.travelPaymentV3ImageBgIV;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
        if (shapeableImageView != null) {
            return new ItemTravelPaymentV3ImageBinding((ConstraintLayoutWithBorder) view, shapeableImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelPaymentV3ImageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_payment_v3_image, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayoutWithBorder getRoot() {
        return this.rootView;
    }
}
