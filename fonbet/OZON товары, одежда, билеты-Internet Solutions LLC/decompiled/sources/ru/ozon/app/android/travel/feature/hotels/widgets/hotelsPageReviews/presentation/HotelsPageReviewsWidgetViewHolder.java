package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.presentation;

import De.s;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetHotelsPageReviewsBinding;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.ReviewVO;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.ReviewViewHolder;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.ReviewsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.presentation.adapter.HotelsPageReviewsDecoration;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J3\u0010#\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00110*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/presentation/HotelsPageReviewsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/presentation/HotelsPageReviewsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "reviews", "tallestReview", "", "showReviews", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;)V", "cancelShowReviewsJob", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/presentation/HotelsPageReviewsVO;Ll20/d;)V", "onRecycle", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/presentation/HotelsPageReviewsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsPageReviewsBinding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsPageReviewsBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/adapter/ReviewsAdapter;", "reviewsAdapter", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/adapter/ReviewsAdapter;", "", "singleReviewRightPadding", "I", "multipleReviewsRightPadding", "Lxe/M;", "viewHolderScope", "Lxe/M;", "Lxe/B0;", "showReviewsJob", "Lxe/B0;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageReviewsWidgetViewHolder extends k<HotelsPageReviewsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetHotelsPageReviewsBinding binding;
    private final int multipleReviewsRightPadding;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final ReviewsAdapter reviewsAdapter;
    private B0 showReviewsJob;
    private final int singleReviewRightPadding;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final M viewHolderScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsPageReviewsWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetHotelsPageReviewsBinding bind = WidgetHotelsPageReviewsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        ReviewsAdapter reviewsAdapter = new ReviewsAdapter(references, buildHandler, null, this, 4, null);
        this.reviewsAdapter = reviewsAdapter;
        this.singleReviewRightPadding = ResourceExtKt.toPx(10, getContext());
        this.multipleReviewsRightPadding = ResourceExtKt.toPx(50, getContext());
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.viewHolderScope = N.a(CoroutineContext.Element.a.d(s.f6650a, (H0) b11));
        RecyclerView recyclerView = bind.hotelsPageReviewsRv;
        recyclerView.setAdapter(reviewsAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new HotelsPageReviewsDecoration(context));
    }

    private final void cancelShowReviewsJob() {
        B0 b02 = this.showReviewsJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.showReviewsJob = null;
    }

    private final void showReviews(List<ReviewVO> reviews, ReviewVO tallestReview) {
        RecyclerView hotelsPageReviewsRv = this.binding.hotelsPageReviewsRv;
        Intrinsics.checkNotNullExpressionValue(hotelsPageReviewsRv, "hotelsPageReviewsRv");
        ViewExtKt.updatePadding$default(hotelsPageReviewsRv, 0, 0, reviews.size() > 1 ? this.multipleReviewsRightPadding : this.singleReviewRightPadding, 0, 11, null);
        if (tallestReview == null) {
            this.reviewsAdapter.submitList(reviews);
            return;
        }
        FrameLayout hotelsPageReviewsMeasureContainerFl = this.binding.hotelsPageReviewsMeasureContainerFl;
        Intrinsics.checkNotNullExpressionValue(hotelsPageReviewsMeasureContainerFl, "hotelsPageReviewsMeasureContainerFl");
        View inflate = ViewGroupExtKt.inflate(hotelsPageReviewsMeasureContainerFl, R$layout.item_hotels_review);
        ReviewViewHolder reviewViewHolder = new ReviewViewHolder(inflate, this.references, new RecyclerView.u(), this.actionHandler);
        cancelShowReviewsJob();
        this.showReviewsJob = C10727i.c(this.viewHolderScope, null, null, new HotelsPageReviewsWidgetViewHolder$showReviews$1$1(reviewViewHolder, tallestReview, inflate, this, reviews, null), 3);
    }

    @Override // jk0.j
    public void onRecycle() {
        cancelShowReviewsJob();
        super.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsPageReviewsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView hotelsPageReviewsTitleTav = this.binding.hotelsPageReviewsTitleTav;
        Intrinsics.checkNotNullExpressionValue(hotelsPageReviewsTitleTav, "hotelsPageReviewsTitleTav");
        TextAtomHolderKt.bind$default(hotelsPageReviewsTitleTav, item.getTitle(), null, 2, null);
        BadgeView hotelsPageReviewsRatingBv = this.binding.hotelsPageReviewsRatingBv;
        Intrinsics.checkNotNullExpressionValue(hotelsPageReviewsRatingBv, "hotelsPageReviewsRatingBv");
        BadgeHolderKt.bind$default(hotelsPageReviewsRatingBv, item.getRating(), (Function1) null, 2, (Object) null);
        LargeButtonView hotelsPageReviewsShowMoreLbv = this.binding.hotelsPageReviewsShowMoreLbv;
        Intrinsics.checkNotNullExpressionValue(hotelsPageReviewsShowMoreLbv, "hotelsPageReviewsShowMoreLbv");
        LargeButtonHolderKt.bind(hotelsPageReviewsShowMoreLbv, item.getShowMoreButton(), this.actionHandler);
        showReviews(item.getReviews(), item.getTallestReview());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsPageReviewsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsPageReviewsWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
