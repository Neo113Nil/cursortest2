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
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetHotelsPageReviewsBinding implements a {

    @NonNull
    public final FrameLayout hotelsPageReviewsMeasureContainerFl;

    @NonNull
    public final BadgeView hotelsPageReviewsRatingBv;

    @NonNull
    public final RecyclerView hotelsPageReviewsRv;

    @NonNull
    public final LargeButtonView hotelsPageReviewsShowMoreLbv;

    @NonNull
    public final TextAtomView hotelsPageReviewsTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetHotelsPageReviewsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull BadgeView badgeView, @NonNull RecyclerView recyclerView, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.hotelsPageReviewsMeasureContainerFl = frameLayout;
        this.hotelsPageReviewsRatingBv = badgeView;
        this.hotelsPageReviewsRv = recyclerView;
        this.hotelsPageReviewsShowMoreLbv = largeButtonView;
        this.hotelsPageReviewsTitleTav = textAtomView;
    }

    @NonNull
    public static WidgetHotelsPageReviewsBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsPageReviewsMeasureContainerFl;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            i11 = R$id.hotelsPageReviewsRatingBv;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                i11 = R$id.hotelsPageReviewsRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.hotelsPageReviewsShowMoreLbv;
                    LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                    if (largeButtonView != null) {
                        i11 = R$id.hotelsPageReviewsTitleTav;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            return new WidgetHotelsPageReviewsBinding((ConstraintLayout) view, frameLayout, badgeView, recyclerView, largeButtonView, textAtomView);
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
