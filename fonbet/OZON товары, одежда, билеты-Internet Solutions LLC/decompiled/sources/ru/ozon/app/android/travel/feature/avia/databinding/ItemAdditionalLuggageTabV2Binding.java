package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.view.IndicatorView;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ItemAdditionalLuggageTabV2Binding implements a {

    @NonNull
    public final IndicatorView additionalLuggageV2AddedLuggageIndicatorView;

    @NonNull
    public final TextAtomView additionalLuggageV2TabTitleTextView;

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    private ItemAdditionalLuggageTabV2Binding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull IndicatorView indicatorView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayoutWithBorder;
        this.additionalLuggageV2AddedLuggageIndicatorView = indicatorView;
        this.additionalLuggageV2TabTitleTextView = textAtomView;
    }

    @NonNull
    public static ItemAdditionalLuggageTabV2Binding bind(@NonNull View view) {
        int i11 = R$id.additionalLuggageV2AddedLuggageIndicatorView;
        IndicatorView indicatorView = (IndicatorView) C2548q.d(i11, view);
        if (indicatorView != null) {
            i11 = R$id.additionalLuggageV2TabTitleTextView;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ItemAdditionalLuggageTabV2Binding((ConstraintLayoutWithBorder) view, indicatorView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemAdditionalLuggageTabV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_additional_luggage_tab_v2, viewGroup, false);
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
