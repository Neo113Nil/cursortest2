package ru.ozon.app.android.travel.feature.hotels.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.hotels.map.R$id;
import ru.ozon.app.android.travel.feature.hotels.map.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ViewMapPinPriceContainerBinding implements a {

    @NonNull
    public final Guideline pinGuideline;

    @NonNull
    public final View pinPriceIcon;

    @NonNull
    public final TextAtomView pinPriceTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private ViewMapPinPriceContainerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull View view, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.pinGuideline = guideline;
        this.pinPriceIcon = view;
        this.pinPriceTitle = textAtomView;
    }

    @NonNull
    public static ViewMapPinPriceContainerBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.pinGuideline;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null && (d11 = C2548q.d((i11 = R$id.pinPriceIcon), view)) != null) {
            i11 = R$id.pinPriceTitle;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ViewMapPinPriceContainerBinding((ConstraintLayout) view, guideline, d11, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewMapPinPriceContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewMapPinPriceContainerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_map_pin_price_container, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
