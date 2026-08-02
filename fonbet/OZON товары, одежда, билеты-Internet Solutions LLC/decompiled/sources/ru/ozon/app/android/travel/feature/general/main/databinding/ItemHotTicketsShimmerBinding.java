package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.R$layout;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;

/* loaded from: classes4.dex */
public final class ItemHotTicketsShimmerBinding implements a {

    @NonNull
    public final ConstraintLayoutWithBorder hotTicketsSkeletonsRoot;

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    @NonNull
    public final RoundedShimmerView shimmer1;

    @NonNull
    public final RoundedShimmerView shimmer10;

    @NonNull
    public final RoundedShimmerView shimmer11;

    @NonNull
    public final RoundedShimmerView shimmer15;

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

    private ItemHotTicketsShimmerBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder2, @NonNull RoundedShimmerView roundedShimmerView, @NonNull RoundedShimmerView roundedShimmerView2, @NonNull RoundedShimmerView roundedShimmerView3, @NonNull RoundedShimmerView roundedShimmerView4, @NonNull RoundedShimmerView roundedShimmerView5, @NonNull RoundedShimmerView roundedShimmerView6, @NonNull RoundedShimmerView roundedShimmerView7, @NonNull RoundedShimmerView roundedShimmerView8, @NonNull RoundedShimmerView roundedShimmerView9, @NonNull RoundedShimmerView roundedShimmerView10, @NonNull RoundedShimmerView roundedShimmerView11) {
        this.rootView = constraintLayoutWithBorder;
        this.hotTicketsSkeletonsRoot = constraintLayoutWithBorder2;
        this.shimmer1 = roundedShimmerView;
        this.shimmer10 = roundedShimmerView2;
        this.shimmer11 = roundedShimmerView3;
        this.shimmer15 = roundedShimmerView4;
        this.shimmer3 = roundedShimmerView5;
        this.shimmer4 = roundedShimmerView6;
        this.shimmer5 = roundedShimmerView7;
        this.shimmer6 = roundedShimmerView8;
        this.shimmer7 = roundedShimmerView9;
        this.shimmer8 = roundedShimmerView10;
        this.shimmer9 = roundedShimmerView11;
    }

    @NonNull
    public static ItemHotTicketsShimmerBinding bind(@NonNull View view) {
        ConstraintLayoutWithBorder constraintLayoutWithBorder = (ConstraintLayoutWithBorder) view;
        int i11 = R$id.shimmer1;
        RoundedShimmerView roundedShimmerView = (RoundedShimmerView) C2548q.d(i11, view);
        if (roundedShimmerView != null) {
            i11 = R$id.shimmer10;
            RoundedShimmerView roundedShimmerView2 = (RoundedShimmerView) C2548q.d(i11, view);
            if (roundedShimmerView2 != null) {
                i11 = R$id.shimmer11;
                RoundedShimmerView roundedShimmerView3 = (RoundedShimmerView) C2548q.d(i11, view);
                if (roundedShimmerView3 != null) {
                    i11 = R$id.shimmer15;
                    RoundedShimmerView roundedShimmerView4 = (RoundedShimmerView) C2548q.d(i11, view);
                    if (roundedShimmerView4 != null) {
                        i11 = R$id.shimmer3;
                        RoundedShimmerView roundedShimmerView5 = (RoundedShimmerView) C2548q.d(i11, view);
                        if (roundedShimmerView5 != null) {
                            i11 = R$id.shimmer4;
                            RoundedShimmerView roundedShimmerView6 = (RoundedShimmerView) C2548q.d(i11, view);
                            if (roundedShimmerView6 != null) {
                                i11 = R$id.shimmer5;
                                RoundedShimmerView roundedShimmerView7 = (RoundedShimmerView) C2548q.d(i11, view);
                                if (roundedShimmerView7 != null) {
                                    i11 = R$id.shimmer6;
                                    RoundedShimmerView roundedShimmerView8 = (RoundedShimmerView) C2548q.d(i11, view);
                                    if (roundedShimmerView8 != null) {
                                        i11 = R$id.shimmer7;
                                        RoundedShimmerView roundedShimmerView9 = (RoundedShimmerView) C2548q.d(i11, view);
                                        if (roundedShimmerView9 != null) {
                                            i11 = R$id.shimmer8;
                                            RoundedShimmerView roundedShimmerView10 = (RoundedShimmerView) C2548q.d(i11, view);
                                            if (roundedShimmerView10 != null) {
                                                i11 = R$id.shimmer9;
                                                RoundedShimmerView roundedShimmerView11 = (RoundedShimmerView) C2548q.d(i11, view);
                                                if (roundedShimmerView11 != null) {
                                                    return new ItemHotTicketsShimmerBinding(constraintLayoutWithBorder, constraintLayoutWithBorder, roundedShimmerView, roundedShimmerView2, roundedShimmerView3, roundedShimmerView4, roundedShimmerView5, roundedShimmerView6, roundedShimmerView7, roundedShimmerView8, roundedShimmerView9, roundedShimmerView10, roundedShimmerView11);
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
    public static ItemHotTicketsShimmerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hot_tickets_shimmer, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayoutWithBorder getRoot() {
        return this.rootView;
    }
}
