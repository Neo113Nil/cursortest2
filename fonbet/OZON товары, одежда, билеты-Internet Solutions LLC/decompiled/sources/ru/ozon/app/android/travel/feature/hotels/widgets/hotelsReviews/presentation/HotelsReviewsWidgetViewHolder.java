package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.presentation;

import aM.RunnableC4975a;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetHotelsReviewsBinding;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.ReviewsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.presentation.adapter.HotelsReviewsItemDecoration;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u001a\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/presentation/HotelsReviewsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/presentation/HotelsReviewsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/presentation/HotelsReviewsVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsReviewsBinding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsReviewsBinding;", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/adapter/ReviewsAdapter;", "reviewsAdapter", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/adapter/ReviewsAdapter;", "ru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/presentation/HotelsReviewsWidgetViewHolder$smoothScroller$1", "smoothScroller", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/presentation/HotelsReviewsWidgetViewHolder$smoothScroller$1;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsReviewsWidgetViewHolder extends k<HotelsReviewsVO> {

    @NotNull
    private final WidgetHotelsReviewsBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ReviewsAdapter reviewsAdapter;

    @NotNull
    private final HotelsReviewsWidgetViewHolder$smoothScroller$1 smoothScroller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.presentation.HotelsReviewsWidgetViewHolder$smoothScroller$1] */
    public HotelsReviewsWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.containerView = containerView;
        WidgetHotelsReviewsBinding bind = WidgetHotelsReviewsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ReviewsAdapter reviewsAdapter = new ReviewsAdapter(ref, new ActionHandler.Builder(ref, this).buildHandler(), null, this, 4, null);
        this.reviewsAdapter = reviewsAdapter;
        final Context context = getContext();
        this.smoothScroller = new r(context) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.presentation.HotelsReviewsWidgetViewHolder$smoothScroller$1
            @Override // androidx.recyclerview.widget.r
            protected int getVerticalSnapPreference() {
                return -1;
            }
        };
        RecyclerView recyclerView = bind.hotelsReviewsRv;
        recyclerView.setAdapter(reviewsAdapter);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.addItemDecoration(new HotelsReviewsItemDecoration(context2));
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(recyclerView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(HotelsReviewsVO hotelsReviewsVO, HotelsReviewsWidgetViewHolder hotelsReviewsWidgetViewHolder) {
        Integer focusedReviewIndex = hotelsReviewsVO.getFocusedReviewIndex();
        if (focusedReviewIndex != null) {
            hotelsReviewsWidgetViewHolder.smoothScroller.setTargetPosition(focusedReviewIndex.intValue());
            RecyclerView.o layoutManager = hotelsReviewsWidgetViewHolder.binding.hotelsReviewsRv.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.startSmoothScroll(hotelsReviewsWidgetViewHolder.smoothScroller);
            }
            hotelsReviewsVO.setFocusedReviewIndex(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsReviewsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView hotelsReviewsTitleTav = this.binding.hotelsReviewsTitleTav;
        Intrinsics.checkNotNullExpressionValue(hotelsReviewsTitleTav, "hotelsReviewsTitleTav");
        TextAtomHolderKt.bind$default(hotelsReviewsTitleTav, item.getTitle(), null, 2, null);
        BadgeView hotelsReviewsRatingBv = this.binding.hotelsReviewsRatingBv;
        Intrinsics.checkNotNullExpressionValue(hotelsReviewsRatingBv, "hotelsReviewsRatingBv");
        BadgeHolderKt.bind$default(hotelsReviewsRatingBv, item.getRating(), (Function1) null, 2, (Object) null);
        this.reviewsAdapter.submitList(item.getReviews(), new RunnableC4975a(3, item, this));
    }
}
