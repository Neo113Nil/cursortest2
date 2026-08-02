package ru.ozon.app.android.travel.feature.general.services.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.services.R$id;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetAdditionalServicesTotalBinding implements a {

    @NonNull
    public final TextAtomView additionalServicesTotalInfoTAV;

    @NonNull
    public final TextAtomView additionalServicesTotalPriceTAV;

    @NonNull
    public final RecyclerView additionalServicesTotalRV;

    @NonNull
    public final LinkButtonView additionalServicesTotalSmallButtonSBBV;

    @NonNull
    public final TextAtomView additionalServicesTotalTitleTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetAdditionalServicesTotalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull RecyclerView recyclerView, @NonNull LinkButtonView linkButtonView, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.additionalServicesTotalInfoTAV = textAtomView;
        this.additionalServicesTotalPriceTAV = textAtomView2;
        this.additionalServicesTotalRV = recyclerView;
        this.additionalServicesTotalSmallButtonSBBV = linkButtonView;
        this.additionalServicesTotalTitleTAV = textAtomView3;
    }

    @NonNull
    public static WidgetAdditionalServicesTotalBinding bind(@NonNull View view) {
        int i11 = R$id.additionalServicesTotalInfoTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.additionalServicesTotalPriceTAV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.additionalServicesTotalRV;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.additionalServicesTotalSmallButtonSBBV;
                    LinkButtonView linkButtonView = (LinkButtonView) C2548q.d(i11, view);
                    if (linkButtonView != null) {
                        i11 = R$id.additionalServicesTotalTitleTAV;
                        TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView3 != null) {
                            return new WidgetAdditionalServicesTotalBinding((ConstraintLayout) view, textAtomView, textAtomView2, recyclerView, linkButtonView, textAtomView3);
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
