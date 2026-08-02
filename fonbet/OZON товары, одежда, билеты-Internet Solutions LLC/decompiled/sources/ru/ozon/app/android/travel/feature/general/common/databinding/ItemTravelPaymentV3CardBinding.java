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
public final class ItemTravelPaymentV3CardBinding implements a {

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    @NonNull
    public final ShapeableImageView travelPaymentV3CardBgIV;

    @NonNull
    public final AppCompatImageView travelPaymentV3CardIconIV;

    @NonNull
    public final AppCompatImageView travelPaymentV3CardRightIconIV;

    @NonNull
    public final TextAtomView travelPaymentV3CardTitleTAV;

    private ItemTravelPaymentV3CardBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull ShapeableImageView shapeableImageView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayoutWithBorder;
        this.travelPaymentV3CardBgIV = shapeableImageView;
        this.travelPaymentV3CardIconIV = appCompatImageView;
        this.travelPaymentV3CardRightIconIV = appCompatImageView2;
        this.travelPaymentV3CardTitleTAV = textAtomView;
    }

    @NonNull
    public static ItemTravelPaymentV3CardBinding bind(@NonNull View view) {
        int i11 = R$id.travelPaymentV3CardBgIV;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
        if (shapeableImageView != null) {
            i11 = R$id.travelPaymentV3CardIconIV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.travelPaymentV3CardRightIconIV;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView2 != null) {
                    i11 = R$id.travelPaymentV3CardTitleTAV;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        return new ItemTravelPaymentV3CardBinding((ConstraintLayoutWithBorder) view, shapeableImageView, appCompatImageView, appCompatImageView2, textAtomView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelPaymentV3CardBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_payment_v3_card, viewGroup, false);
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
