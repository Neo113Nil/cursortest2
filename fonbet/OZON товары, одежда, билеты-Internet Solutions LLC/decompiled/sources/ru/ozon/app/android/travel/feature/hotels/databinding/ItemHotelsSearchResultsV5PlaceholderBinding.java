package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;

/* loaded from: classes4.dex */
public final class ItemHotelsSearchResultsV5PlaceholderBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RoundedShimmerView shimmer1;

    @NonNull
    public final RoundedShimmerView shimmer2;

    @NonNull
    public final RoundedShimmerView shimmer3;

    @NonNull
    public final RoundedShimmerView shimmer4;

    @NonNull
    public final RoundedShimmerView shimmer5;

    @NonNull
    public final RoundedShimmerView shimmer6;

    @NonNull
    public final RoundedShimmerView shimmer7;

    private ItemHotelsSearchResultsV5PlaceholderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RoundedShimmerView roundedShimmerView, @NonNull RoundedShimmerView roundedShimmerView2, @NonNull RoundedShimmerView roundedShimmerView3, @NonNull RoundedShimmerView roundedShimmerView4, @NonNull RoundedShimmerView roundedShimmerView5, @NonNull RoundedShimmerView roundedShimmerView6, @NonNull RoundedShimmerView roundedShimmerView7) {
        this.rootView = constraintLayout;
        this.shimmer1 = roundedShimmerView;
        this.shimmer2 = roundedShimmerView2;
        this.shimmer3 = roundedShimmerView3;
        this.shimmer4 = roundedShimmerView4;
        this.shimmer5 = roundedShimmerView5;
        this.shimmer6 = roundedShimmerView6;
        this.shimmer7 = roundedShimmerView7;
    }

    @NonNull
    public static ItemHotelsSearchResultsV5PlaceholderBinding bind(@NonNull View view) {
        int i11 = R$id.shimmer1;
        RoundedShimmerView roundedShimmerView = (RoundedShimmerView) C2548q.d(i11, view);
        if (roundedShimmerView != null) {
            i11 = R$id.shimmer2;
            RoundedShimmerView roundedShimmerView2 = (RoundedShimmerView) C2548q.d(i11, view);
            if (roundedShimmerView2 != null) {
                i11 = R$id.shimmer3;
                RoundedShimmerView roundedShimmerView3 = (RoundedShimmerView) C2548q.d(i11, view);
                if (roundedShimmerView3 != null) {
                    i11 = R$id.shimmer4;
                    RoundedShimmerView roundedShimmerView4 = (RoundedShimmerView) C2548q.d(i11, view);
                    if (roundedShimmerView4 != null) {
                        i11 = R$id.shimmer5;
                        RoundedShimmerView roundedShimmerView5 = (RoundedShimmerView) C2548q.d(i11, view);
                        if (roundedShimmerView5 != null) {
                            i11 = R$id.shimmer6;
                            RoundedShimmerView roundedShimmerView6 = (RoundedShimmerView) C2548q.d(i11, view);
                            if (roundedShimmerView6 != null) {
                                i11 = R$id.shimmer7;
                                RoundedShimmerView roundedShimmerView7 = (RoundedShimmerView) C2548q.d(i11, view);
                                if (roundedShimmerView7 != null) {
                                    return new ItemHotelsSearchResultsV5PlaceholderBinding((ConstraintLayout) view, roundedShimmerView, roundedShimmerView2, roundedShimmerView3, roundedShimmerView4, roundedShimmerView5, roundedShimmerView6, roundedShimmerView7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHotelsSearchResultsV5PlaceholderBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hotels_search_results_v5_placeholder, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
