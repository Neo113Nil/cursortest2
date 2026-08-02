package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.databinding.ViewGalleryReviewProductV2Binding;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2WidgetState;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.ReviewGalleryView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\u001a\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVisibilityDelegate;", "", "<init>", "()V", "reviewGalleryView", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;", "setup", "", "clear", "onVisibilityChanged", "widgetState", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2WidgetState;", "showViews", "showProductView", "hasProduct", "", "showProductsRecyclerView", "changeBadgeVisibility", "showBadge", "hasFreshBadge", "hideViews", "changeHeaderVisibility", "showHeader", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryVisibilityDelegate {
    private ReviewGalleryView reviewGalleryView;

    private final void changeBadgeVisibility(boolean showBadge, boolean hasFreshBadge) {
        if (hasFreshBadge) {
            ReviewGalleryView reviewGalleryView = this.reviewGalleryView;
            BadgeView badgeView = reviewGalleryView != null ? (BadgeView) reviewGalleryView.findViewById(R$id.freshBadge) : null;
            if (badgeView != null) {
                ViewExtKt.showOrInvisible(badgeView, showBadge);
            }
        }
    }

    private final void changeHeaderVisibility(boolean showHeader) {
        CellView cellView;
        ReviewGalleryView reviewGalleryView = this.reviewGalleryView;
        if (reviewGalleryView == null || (cellView = (CellView) reviewGalleryView.findViewById(R$id.socialHeader)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = cellView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        if (((ConstraintLayout.b) layoutParams).f41636i == 0) {
            return;
        }
        ViewExtKt.showOrInvisible(cellView, showHeader);
    }

    private final void hideViews(ReviewGalleryV2WidgetState widgetState) {
        ReviewGalleryView reviewGalleryView = this.reviewGalleryView;
        if (reviewGalleryView != null) {
            if (widgetState.getHasCloseButton()) {
                ViewExtKt.show(reviewGalleryView.getCloseButton());
            }
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hide(reviewGalleryView.getRightPanel());
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hide(reviewGalleryView.getRatingText());
            ConstraintLayout constraintLayout = reviewGalleryView.getProductBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hide(constraintLayout);
            ReviewGalleryView reviewGalleryView2 = this.reviewGalleryView;
            if (reviewGalleryView2 != null) {
                reviewGalleryView2.ifProductsRecyclerViewInitialized(ReviewGalleryVisibilityDelegate$hideViews$1$1.INSTANCE);
            }
        }
        changeBadgeVisibility(false, widgetState.getHasFreshBadge());
        changeHeaderVisibility(false);
    }

    private final void showProductView(boolean hasProduct) {
        ViewGalleryReviewProductV2Binding productBinding;
        ConstraintLayout constraintLayout;
        ReviewGalleryView reviewGalleryView = this.reviewGalleryView;
        if (reviewGalleryView == null || (productBinding = reviewGalleryView.getProductBinding()) == null || (constraintLayout = productBinding.getConstraintLayout()) == null) {
            return;
        }
        ViewExtKt.showOrInvisible(constraintLayout, hasProduct);
    }

    private final void showProductsRecyclerView() {
        ReviewGalleryView reviewGalleryView = this.reviewGalleryView;
        if (reviewGalleryView != null) {
            reviewGalleryView.ifProductsRecyclerViewInitialized(ReviewGalleryVisibilityDelegate$showProductsRecyclerView$1.INSTANCE);
        }
    }

    private final void showViews(ReviewGalleryV2WidgetState widgetState) {
        ReviewGalleryView reviewGalleryView = this.reviewGalleryView;
        if (reviewGalleryView != null) {
            ViewExtKt.show(reviewGalleryView.getRightPanel());
            ViewExtKt.show(reviewGalleryView.getRatingText());
            if (widgetState.getHasCloseButton()) {
                ViewExtKt.show(reviewGalleryView.getCloseButton());
            }
        }
        changeBadgeVisibility(true, widgetState.getHasFreshBadge());
        showProductView(widgetState.getHasProduct());
        showProductsRecyclerView();
        changeHeaderVisibility(true);
    }

    public final void clear() {
        this.reviewGalleryView = null;
    }

    public final void onVisibilityChanged(@NotNull ReviewGalleryV2WidgetState widgetState) {
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        if (widgetState.getOrientation() == 1 && widgetState.getViewsIsVisible()) {
            showViews(widgetState);
        } else {
            hideViews(widgetState);
        }
    }

    public final void setup(@NotNull ReviewGalleryView reviewGalleryView) {
        Intrinsics.checkNotNullParameter(reviewGalleryView, "reviewGalleryView");
        this.reviewGalleryView = reviewGalleryView;
    }
}
