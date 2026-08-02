package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;

/* loaded from: classes8.dex */
public final class ItemAdditionalLuggageV2SkeletonBinding implements a {

    @NonNull
    private final LinearLayout rootView;

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

    @NonNull
    public final RoundedShimmerView shimmer8;

    @NonNull
    public final RoundedShimmerView shimmer9;

    @NonNull
    public final ConstraintLayout shimmerGroup1;

    @NonNull
    public final ConstraintLayout shimmerGroup2;

    private ItemAdditionalLuggageV2SkeletonBinding(@NonNull LinearLayout linearLayout, @NonNull RoundedShimmerView roundedShimmerView, @NonNull RoundedShimmerView roundedShimmerView2, @NonNull RoundedShimmerView roundedShimmerView3, @NonNull RoundedShimmerView roundedShimmerView4, @NonNull RoundedShimmerView roundedShimmerView5, @NonNull RoundedShimmerView roundedShimmerView6, @NonNull RoundedShimmerView roundedShimmerView7, @NonNull RoundedShimmerView roundedShimmerView8, @NonNull RoundedShimmerView roundedShimmerView9, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = linearLayout;
        this.shimmer1 = roundedShimmerView;
        this.shimmer2 = roundedShimmerView2;
        this.shimmer3 = roundedShimmerView3;
        this.shimmer4 = roundedShimmerView4;
        this.shimmer5 = roundedShimmerView5;
        this.shimmer6 = roundedShimmerView6;
        this.shimmer7 = roundedShimmerView7;
        this.shimmer8 = roundedShimmerView8;
        this.shimmer9 = roundedShimmerView9;
        this.shimmerGroup1 = constraintLayout;
        this.shimmerGroup2 = constraintLayout2;
    }

    @NonNull
    public static ItemAdditionalLuggageV2SkeletonBinding bind(@NonNull View view) {
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
                                    i11 = R$id.shimmer8;
                                    RoundedShimmerView roundedShimmerView8 = (RoundedShimmerView) C2548q.d(i11, view);
                                    if (roundedShimmerView8 != null) {
                                        i11 = R$id.shimmer9;
                                        RoundedShimmerView roundedShimmerView9 = (RoundedShimmerView) C2548q.d(i11, view);
                                        if (roundedShimmerView9 != null) {
                                            i11 = R$id.shimmerGroup1;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                                            if (constraintLayout != null) {
                                                i11 = R$id.shimmerGroup2;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C2548q.d(i11, view);
                                                if (constraintLayout2 != null) {
                                                    return new ItemAdditionalLuggageV2SkeletonBinding((LinearLayout) view, roundedShimmerView, roundedShimmerView2, roundedShimmerView3, roundedShimmerView4, roundedShimmerView5, roundedShimmerView6, roundedShimmerView7, roundedShimmerView8, roundedShimmerView9, constraintLayout, constraintLayout2);
                                                }
                                            }
                                        }
                                    }
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
    public static ItemAdditionalLuggageV2SkeletonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_additional_luggage_v2_skeleton, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
