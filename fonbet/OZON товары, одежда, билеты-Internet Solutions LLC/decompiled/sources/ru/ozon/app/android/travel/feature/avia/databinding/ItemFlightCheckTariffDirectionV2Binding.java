package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes8.dex */
public final class ItemFlightCheckTariffDirectionV2Binding implements a {

    @NonNull
    public final Barrier directionV2Barrier;

    @NonNull
    public final TextAtomView directionV2CompoundRouteTextView;

    @NonNull
    public final VerticalAtomsLayout directionV2FeaturesLayout;

    @NonNull
    public final ShapeableImageView directionV2IconImageView;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemFlightCheckTariffDirectionV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull ShapeableImageView shapeableImageView) {
        this.rootView = constraintLayout;
        this.directionV2Barrier = barrier;
        this.directionV2CompoundRouteTextView = textAtomView;
        this.directionV2FeaturesLayout = verticalAtomsLayout;
        this.directionV2IconImageView = shapeableImageView;
    }

    @NonNull
    public static ItemFlightCheckTariffDirectionV2Binding bind(@NonNull View view) {
        int i11 = R$id.directionV2Barrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.directionV2CompoundRouteTextView;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.directionV2FeaturesLayout;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    i11 = R$id.directionV2IconImageView;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                    if (shapeableImageView != null) {
                        return new ItemFlightCheckTariffDirectionV2Binding((ConstraintLayout) view, barrier, textAtomView, verticalAtomsLayout, shapeableImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemFlightCheckTariffDirectionV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_flight_check_tariff_direction_v2, viewGroup, false);
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
