package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class WidgetAdditionalLuggageTotalBinding implements a {

    @NonNull
    public final ConstraintLayout additionalLuggageTotalCL;

    @NonNull
    public final TextAtomView additionalLuggageTotalInfoTAV;

    @NonNull
    public final TextAtomView additionalLuggageTotalPriceTAV;

    @NonNull
    public final RecyclerView additionalLuggageTotalRV;

    @NonNull
    public final TextAtomView additionalLuggageTotalTitleTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetAdditionalLuggageTotalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.additionalLuggageTotalCL = constraintLayout2;
        this.additionalLuggageTotalInfoTAV = textAtomView;
        this.additionalLuggageTotalPriceTAV = textAtomView2;
        this.additionalLuggageTotalRV = recyclerView;
        this.additionalLuggageTotalTitleTAV = textAtomView3;
    }

    @NonNull
    public static WidgetAdditionalLuggageTotalBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.additionalLuggageTotalInfoTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.additionalLuggageTotalPriceTAV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.additionalLuggageTotalRV;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.additionalLuggageTotalTitleTAV;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        return new WidgetAdditionalLuggageTotalBinding(constraintLayout, constraintLayout, textAtomView, textAtomView2, recyclerView, textAtomView3);
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
