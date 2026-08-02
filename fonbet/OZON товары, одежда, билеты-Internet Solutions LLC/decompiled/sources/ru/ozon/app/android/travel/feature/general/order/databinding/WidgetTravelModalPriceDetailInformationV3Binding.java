package ru.ozon.app.android.travel.feature.general.order.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetTravelModalPriceDetailInformationV3Binding implements a {

    @NonNull
    public final TextAtomView headerPricesTAV;

    @NonNull
    public final RecyclerView priceSectionsRV;

    @NonNull
    private final LinearLayout rootView;

    private WidgetTravelModalPriceDetailInformationV3Binding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.headerPricesTAV = textAtomView;
        this.priceSectionsRV = recyclerView;
    }

    @NonNull
    public static WidgetTravelModalPriceDetailInformationV3Binding bind(@NonNull View view) {
        int i11 = R$id.headerPricesTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.priceSectionsRV;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                return new WidgetTravelModalPriceDetailInformationV3Binding((LinearLayout) view, textAtomView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
