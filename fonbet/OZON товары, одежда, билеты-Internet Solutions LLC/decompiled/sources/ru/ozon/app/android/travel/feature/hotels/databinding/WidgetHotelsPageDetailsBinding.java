package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;

/* loaded from: classes4.dex */
public final class WidgetHotelsPageDetailsBinding implements a {

    @NonNull
    public final LinkButtonView descriptionMoreLBV;

    @NonNull
    public final RecyclerView facilitiesRv;

    @NonNull
    public final RecyclerView hotelAdditionalInfoRV;

    @NonNull
    public final AppCompatTextView hotelDescriptionTv;

    @NonNull
    public final ConstraintLayout hotelPageRootCl;

    @NonNull
    public final AppCompatTextView hotelTitleATV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TabLayout tabInfoTL;

    private WidgetHotelsPageDetailsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinkButtonView linkButtonView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull AppCompatTextView appCompatTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView2, @NonNull TabLayout tabLayout) {
        this.rootView = constraintLayout;
        this.descriptionMoreLBV = linkButtonView;
        this.facilitiesRv = recyclerView;
        this.hotelAdditionalInfoRV = recyclerView2;
        this.hotelDescriptionTv = appCompatTextView;
        this.hotelPageRootCl = constraintLayout2;
        this.hotelTitleATV = appCompatTextView2;
        this.tabInfoTL = tabLayout;
    }

    @NonNull
    public static WidgetHotelsPageDetailsBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionMoreLBV;
        LinkButtonView linkButtonView = (LinkButtonView) C2548q.d(i11, view);
        if (linkButtonView != null) {
            i11 = R$id.facilitiesRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.hotelAdditionalInfoRV;
                RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView2 != null) {
                    i11 = R$id.hotelDescriptionTv;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.hotelTitleATV;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView2 != null) {
                            i11 = R$id.tabInfoTL;
                            TabLayout tabLayout = (TabLayout) C2548q.d(i11, view);
                            if (tabLayout != null) {
                                return new WidgetHotelsPageDetailsBinding(constraintLayout, linkButtonView, recyclerView, recyclerView2, appCompatTextView, constraintLayout, appCompatTextView2, tabLayout);
                            }
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
