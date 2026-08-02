package ru.ozon.app.android.travel.feature.general.order.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes4.dex */
public final class WidgetOrderPassengersDetailsBinding implements a {

    @NonNull
    public final Guideline endGuideline;

    @NonNull
    public final ImageView logoIv;

    @NonNull
    public final VerticalAtomsLayout passengersAtomsVal;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Guideline startGuideline;

    @NonNull
    public final TextAtomView titleTv;

    private WidgetOrderPassengersDetailsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull Guideline guideline2, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.endGuideline = guideline;
        this.logoIv = imageView;
        this.passengersAtomsVal = verticalAtomsLayout;
        this.startGuideline = guideline2;
        this.titleTv = textAtomView;
    }

    @NonNull
    public static WidgetOrderPassengersDetailsBinding bind(@NonNull View view) {
        int i11 = R$id.endGuideline;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null) {
            i11 = R$id.logoIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.passengersAtomsVal;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    i11 = R$id.startGuideline;
                    Guideline guideline2 = (Guideline) C2548q.d(i11, view);
                    if (guideline2 != null) {
                        i11 = R$id.titleTv;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            return new WidgetOrderPassengersDetailsBinding((ConstraintLayout) view, guideline, imageView, verticalAtomsLayout, guideline2, textAtomView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
