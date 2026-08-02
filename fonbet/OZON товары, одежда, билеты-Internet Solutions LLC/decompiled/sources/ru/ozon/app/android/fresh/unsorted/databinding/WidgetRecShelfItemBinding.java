package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerView;

/* loaded from: classes12.dex */
public final class WidgetRecShelfItemBinding implements a {

    @NonNull
    public final ShimmerView buttonShimmer;

    @NonNull
    public final ShimmerView iconShimmer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ShimmerView shimmerViewItem1;

    @NonNull
    public final ShimmerView shimmerViewItem2;

    @NonNull
    public final ShimmerView shimmerViewItem3;

    private WidgetRecShelfItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ShimmerView shimmerView, @NonNull ShimmerView shimmerView2, @NonNull ShimmerView shimmerView3, @NonNull ShimmerView shimmerView4, @NonNull ShimmerView shimmerView5) {
        this.rootView = constraintLayout;
        this.buttonShimmer = shimmerView;
        this.iconShimmer = shimmerView2;
        this.shimmerViewItem1 = shimmerView3;
        this.shimmerViewItem2 = shimmerView4;
        this.shimmerViewItem3 = shimmerView5;
    }

    @NonNull
    public static WidgetRecShelfItemBinding bind(@NonNull View view) {
        int i11 = R$id.buttonShimmer;
        ShimmerView shimmerView = (ShimmerView) C2548q.d(i11, view);
        if (shimmerView != null) {
            i11 = R$id.iconShimmer;
            ShimmerView shimmerView2 = (ShimmerView) C2548q.d(i11, view);
            if (shimmerView2 != null) {
                i11 = R$id.shimmerViewItem1;
                ShimmerView shimmerView3 = (ShimmerView) C2548q.d(i11, view);
                if (shimmerView3 != null) {
                    i11 = R$id.shimmerViewItem2;
                    ShimmerView shimmerView4 = (ShimmerView) C2548q.d(i11, view);
                    if (shimmerView4 != null) {
                        i11 = R$id.shimmerViewItem3;
                        ShimmerView shimmerView5 = (ShimmerView) C2548q.d(i11, view);
                        if (shimmerView5 != null) {
                            return new WidgetRecShelfItemBinding((ConstraintLayout) view, shimmerView, shimmerView2, shimmerView3, shimmerView4, shimmerView5);
                        }
                    }
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
