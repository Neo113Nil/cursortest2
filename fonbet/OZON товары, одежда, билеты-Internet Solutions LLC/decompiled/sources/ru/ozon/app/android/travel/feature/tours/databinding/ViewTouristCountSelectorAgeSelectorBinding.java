package ru.ozon.app.android.travel.feature.tours.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.R$layout;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;

/* loaded from: classes4.dex */
public final class ViewTouristCountSelectorAgeSelectorBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView touristAgeSelectorErrorTV;

    @NonNull
    public final TravelTextInputLayout touristAgeSelectorInputLayout;

    @NonNull
    public final AppCompatTextView touristAgeSelectorTextView;

    private ViewTouristCountSelectorAgeSelectorBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull TravelTextInputLayout travelTextInputLayout, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = view;
        this.touristAgeSelectorErrorTV = appCompatTextView;
        this.touristAgeSelectorInputLayout = travelTextInputLayout;
        this.touristAgeSelectorTextView = appCompatTextView2;
    }

    @NonNull
    public static ViewTouristCountSelectorAgeSelectorBinding bind(@NonNull View view) {
        int i11 = R$id.touristAgeSelectorErrorTV;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.touristAgeSelectorInputLayout;
            TravelTextInputLayout travelTextInputLayout = (TravelTextInputLayout) C2548q.d(i11, view);
            if (travelTextInputLayout != null) {
                i11 = R$id.touristAgeSelectorTextView;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView2 != null) {
                    return new ViewTouristCountSelectorAgeSelectorBinding(view, appCompatTextView, travelTextInputLayout, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewTouristCountSelectorAgeSelectorBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_tourist_count_selector_age_selector, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
