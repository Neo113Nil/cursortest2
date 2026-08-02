package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerView;

/* loaded from: classes4.dex */
public final class ViewHotelsPageHeaderShimmersBinding implements a {

    @NonNull
    public final ShimmerView hotelsPageHeaderPremiumPointsPlaceholderSv;

    @NonNull
    public final ShimmerView hotelsPageHeaderPriceDescriptionPlaceholderSv;

    @NonNull
    public final ShimmerView hotelsPageHeaderPricePlaceholderSv;

    @NonNull
    private final ConstraintLayout rootView;

    private ViewHotelsPageHeaderShimmersBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ShimmerView shimmerView, @NonNull ShimmerView shimmerView2, @NonNull ShimmerView shimmerView3) {
        this.rootView = constraintLayout;
        this.hotelsPageHeaderPremiumPointsPlaceholderSv = shimmerView;
        this.hotelsPageHeaderPriceDescriptionPlaceholderSv = shimmerView2;
        this.hotelsPageHeaderPricePlaceholderSv = shimmerView3;
    }

    @NonNull
    public static ViewHotelsPageHeaderShimmersBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsPageHeaderPremiumPointsPlaceholderSv;
        ShimmerView shimmerView = (ShimmerView) C2548q.d(i11, view);
        if (shimmerView != null) {
            i11 = R$id.hotelsPageHeaderPriceDescriptionPlaceholderSv;
            ShimmerView shimmerView2 = (ShimmerView) C2548q.d(i11, view);
            if (shimmerView2 != null) {
                i11 = R$id.hotelsPageHeaderPricePlaceholderSv;
                ShimmerView shimmerView3 = (ShimmerView) C2548q.d(i11, view);
                if (shimmerView3 != null) {
                    return new ViewHotelsPageHeaderShimmersBinding((ConstraintLayout) view, shimmerView, shimmerView2, shimmerView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
