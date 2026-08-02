package ru.ozon.app.android.cart.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final class WidgetCartSplitV2ItemAccessoriesBinding implements a {

    @NonNull
    public final View headerSkeleton;

    @NonNull
    public final TextAtomV2View headerTav;

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ShimmerFrameLayout shimmerView;

    private WidgetCartSplitV2ItemAccessoriesBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextAtomV2View textAtomV2View, @NonNull RecyclerView recyclerView, @NonNull ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = constraintLayout;
        this.headerSkeleton = view;
        this.headerTav = textAtomV2View;
        this.itemsRv = recyclerView;
        this.shimmerView = shimmerFrameLayout;
    }

    @NonNull
    public static WidgetCartSplitV2ItemAccessoriesBinding bind(@NonNull View view) {
        int i11 = R$id.headerSkeleton;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.headerTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.itemsRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.shimmerView;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C2548q.d(i11, view);
                    if (shimmerFrameLayout != null) {
                        return new WidgetCartSplitV2ItemAccessoriesBinding((ConstraintLayout) view, d11, textAtomV2View, recyclerView, shimmerFrameLayout);
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
