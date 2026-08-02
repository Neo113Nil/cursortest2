package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetHotelsReviewsBinding implements a {

    @NonNull
    public final BadgeView hotelsReviewsRatingBv;

    @NonNull
    public final RecyclerView hotelsReviewsRv;

    @NonNull
    public final TextAtomView hotelsReviewsTitleTav;

    @NonNull
    public final ConstraintLayout hotelsReviewsTopContainer;

    @NonNull
    private final FrameLayout rootView;

    private WidgetHotelsReviewsBinding(@NonNull FrameLayout frameLayout, @NonNull BadgeView badgeView, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull ConstraintLayout constraintLayout) {
        this.rootView = frameLayout;
        this.hotelsReviewsRatingBv = badgeView;
        this.hotelsReviewsRv = recyclerView;
        this.hotelsReviewsTitleTav = textAtomView;
        this.hotelsReviewsTopContainer = constraintLayout;
    }

    @NonNull
    public static WidgetHotelsReviewsBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsReviewsRatingBv;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.hotelsReviewsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.hotelsReviewsTitleTav;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.hotelsReviewsTopContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                    if (constraintLayout != null) {
                        return new WidgetHotelsReviewsBinding((FrameLayout) view, badgeView, recyclerView, textAtomView, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
