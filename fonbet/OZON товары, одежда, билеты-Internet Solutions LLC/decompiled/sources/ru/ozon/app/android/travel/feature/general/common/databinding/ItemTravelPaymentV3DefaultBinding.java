package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.R$layout;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class ItemTravelPaymentV3DefaultBinding implements a {

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    @NonNull
    public final ShapeableImageView travelPaymentV3DefaultBgIV;

    @NonNull
    public final AppCompatImageView travelPaymentV3DefaultIconIV;

    @NonNull
    public final TextAtomView travelPaymentV3DefaultTitleTAV;

    private ItemTravelPaymentV3DefaultBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull ShapeableImageView shapeableImageView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayoutWithBorder;
        this.travelPaymentV3DefaultBgIV = shapeableImageView;
        this.travelPaymentV3DefaultIconIV = appCompatImageView;
        this.travelPaymentV3DefaultTitleTAV = textAtomView;
    }

    @NonNull
    public static ItemTravelPaymentV3DefaultBinding bind(@NonNull View view) {
        int i11 = R$id.travelPaymentV3DefaultBgIV;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
        if (shapeableImageView != null) {
            i11 = R$id.travelPaymentV3DefaultIconIV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.travelPaymentV3DefaultTitleTAV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new ItemTravelPaymentV3DefaultBinding((ConstraintLayoutWithBorder) view, shapeableImageView, appCompatImageView, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelPaymentV3DefaultBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_payment_v3_default, viewGroup, false);
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
