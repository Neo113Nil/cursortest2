package ru.ozon.app.android.travel.feature.general.services.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.services.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetAdditionalServicesOfferBinding implements a {

    @NonNull
    public final LinearLayout additionalServicesOfferLL;

    @NonNull
    public final RecyclerView additionalServicesOfferRV;

    @NonNull
    public final TextAtomView additionalServicesOfferTitleTAV;

    @NonNull
    private final LinearLayout rootView;

    private WidgetAdditionalServicesOfferBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.additionalServicesOfferLL = linearLayout2;
        this.additionalServicesOfferRV = recyclerView;
        this.additionalServicesOfferTitleTAV = textAtomView;
    }

    @NonNull
    public static WidgetAdditionalServicesOfferBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.additionalServicesOfferRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.additionalServicesOfferTitleTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new WidgetAdditionalServicesOfferBinding(linearLayout, linearLayout, recyclerView, textAtomView);
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
