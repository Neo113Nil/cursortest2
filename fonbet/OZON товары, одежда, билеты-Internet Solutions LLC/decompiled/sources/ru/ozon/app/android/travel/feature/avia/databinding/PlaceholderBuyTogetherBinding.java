package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;

/* loaded from: classes8.dex */
public final class PlaceholderBuyTogetherBinding implements a {

    @NonNull
    public final RoundedShimmerView pbtAddButton;

    @NonNull
    public final RoundedShimmerView pbtAllButton;

    @NonNull
    public final RoundedShimmerView pbtDescription;

    @NonNull
    public final RoundedShimmerView pbtImage;

    @NonNull
    public final RoundedShimmerView pbtPrice;

    @NonNull
    public final RoundedShimmerView pbtTitle;

    @NonNull
    public final View pbtView;

    @NonNull
    private final View rootView;

    private PlaceholderBuyTogetherBinding(@NonNull View view, @NonNull RoundedShimmerView roundedShimmerView, @NonNull RoundedShimmerView roundedShimmerView2, @NonNull RoundedShimmerView roundedShimmerView3, @NonNull RoundedShimmerView roundedShimmerView4, @NonNull RoundedShimmerView roundedShimmerView5, @NonNull RoundedShimmerView roundedShimmerView6, @NonNull View view2) {
        this.rootView = view;
        this.pbtAddButton = roundedShimmerView;
        this.pbtAllButton = roundedShimmerView2;
        this.pbtDescription = roundedShimmerView3;
        this.pbtImage = roundedShimmerView4;
        this.pbtPrice = roundedShimmerView5;
        this.pbtTitle = roundedShimmerView6;
        this.pbtView = view2;
    }

    @NonNull
    public static PlaceholderBuyTogetherBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.pbtAddButton;
        RoundedShimmerView roundedShimmerView = (RoundedShimmerView) C2548q.d(i11, view);
        if (roundedShimmerView != null) {
            i11 = R$id.pbtAllButton;
            RoundedShimmerView roundedShimmerView2 = (RoundedShimmerView) C2548q.d(i11, view);
            if (roundedShimmerView2 != null) {
                i11 = R$id.pbtDescription;
                RoundedShimmerView roundedShimmerView3 = (RoundedShimmerView) C2548q.d(i11, view);
                if (roundedShimmerView3 != null) {
                    i11 = R$id.pbtImage;
                    RoundedShimmerView roundedShimmerView4 = (RoundedShimmerView) C2548q.d(i11, view);
                    if (roundedShimmerView4 != null) {
                        i11 = R$id.pbtPrice;
                        RoundedShimmerView roundedShimmerView5 = (RoundedShimmerView) C2548q.d(i11, view);
                        if (roundedShimmerView5 != null) {
                            i11 = R$id.pbtTitle;
                            RoundedShimmerView roundedShimmerView6 = (RoundedShimmerView) C2548q.d(i11, view);
                            if (roundedShimmerView6 != null && (d11 = C2548q.d((i11 = R$id.pbtView), view)) != null) {
                                return new PlaceholderBuyTogetherBinding(view, roundedShimmerView, roundedShimmerView2, roundedShimmerView3, roundedShimmerView4, roundedShimmerView5, roundedShimmerView6, d11);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PlaceholderBuyTogetherBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.placeholder_buy_together, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
