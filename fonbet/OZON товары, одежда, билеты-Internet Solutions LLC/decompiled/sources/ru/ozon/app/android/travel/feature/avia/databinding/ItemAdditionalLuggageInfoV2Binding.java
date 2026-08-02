package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.molecules.view.disclaimer.TravelDisclaimerView;

/* loaded from: classes8.dex */
public final class ItemAdditionalLuggageInfoV2Binding implements a {

    @NonNull
    public final TravelDisclaimerView luggageInfoV2Disclaimer;

    @NonNull
    private final FrameLayout rootView;

    private ItemAdditionalLuggageInfoV2Binding(@NonNull FrameLayout frameLayout, @NonNull TravelDisclaimerView travelDisclaimerView) {
        this.rootView = frameLayout;
        this.luggageInfoV2Disclaimer = travelDisclaimerView;
    }

    @NonNull
    public static ItemAdditionalLuggageInfoV2Binding bind(@NonNull View view) {
        int i11 = R$id.luggageInfoV2Disclaimer;
        TravelDisclaimerView travelDisclaimerView = (TravelDisclaimerView) C2548q.d(i11, view);
        if (travelDisclaimerView != null) {
            return new ItemAdditionalLuggageInfoV2Binding((FrameLayout) view, travelDisclaimerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemAdditionalLuggageInfoV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_additional_luggage_info_v2, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
