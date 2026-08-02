package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.log.Logger;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetHotelsPageReviewsBinding;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.ReviewVO;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.ReviewViewHolder;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.ReviewsAdapter;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.presentation.HotelsPageReviewsWidgetViewHolder$showReviews$1$1", f = "HotelsPageReviewsWidgetViewHolder.kt", l = {Logger.NONE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsPageReviewsWidgetViewHolder$showReviews$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ View $reviewItemView;
    final /* synthetic */ List<ReviewVO> $reviews;
    final /* synthetic */ ReviewVO $tallestReview;
    final /* synthetic */ ReviewViewHolder $vh;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsPageReviewsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageReviewsWidgetViewHolder$showReviews$1$1(ReviewViewHolder reviewViewHolder, ReviewVO reviewVO, View view, HotelsPageReviewsWidgetViewHolder hotelsPageReviewsWidgetViewHolder, List<ReviewVO> list, d<? super HotelsPageReviewsWidgetViewHolder$showReviews$1$1> dVar) {
        super(2, dVar);
        this.$vh = reviewViewHolder;
        this.$tallestReview = reviewVO;
        this.$reviewItemView = view;
        this.this$0 = hotelsPageReviewsWidgetViewHolder;
        this.$reviews = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsPageReviewsWidgetViewHolder$showReviews$1$1 hotelsPageReviewsWidgetViewHolder$showReviews$1$1 = new HotelsPageReviewsWidgetViewHolder$showReviews$1$1(this.$vh, this.$tallestReview, this.$reviewItemView, this.this$0, this.$reviews, dVar);
        hotelsPageReviewsWidgetViewHolder$showReviews$1$1.L$0 = obj;
        return hotelsPageReviewsWidgetViewHolder$showReviews$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetHotelsPageReviewsBinding widgetHotelsPageReviewsBinding;
        M m11;
        WidgetHotelsPageReviewsBinding widgetHotelsPageReviewsBinding2;
        WidgetHotelsPageReviewsBinding widgetHotelsPageReviewsBinding3;
        ReviewsAdapter reviewsAdapter;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m12 = (M) this.L$0;
            this.$vh.bind(this.$tallestReview);
            View view = this.$reviewItemView;
            widgetHotelsPageReviewsBinding = this.this$0.binding;
            widgetHotelsPageReviewsBinding.hotelsPageReviewsMeasureContainerFl.addView(view);
            this.L$0 = m12;
            this.label = 1;
            if (ViewExtensionsKt.awaitNextLayout(view, this) == aVar) {
                return aVar;
            }
            m11 = m12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        if (N.f(m11)) {
            widgetHotelsPageReviewsBinding2 = this.this$0.binding;
            RecyclerView hotelsPageReviewsRv = widgetHotelsPageReviewsBinding2.hotelsPageReviewsRv;
            Intrinsics.checkNotNullExpressionValue(hotelsPageReviewsRv, "hotelsPageReviewsRv");
            View view2 = this.$reviewItemView;
            ViewGroup.LayoutParams layoutParams = hotelsPageReviewsRv.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = view2.getHeight();
            hotelsPageReviewsRv.setLayoutParams(layoutParams);
            widgetHotelsPageReviewsBinding3 = this.this$0.binding;
            widgetHotelsPageReviewsBinding3.hotelsPageReviewsMeasureContainerFl.removeAllViews();
            reviewsAdapter = this.this$0.reviewsAdapter;
            reviewsAdapter.submitList(this.$reviews);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsPageReviewsWidgetViewHolder$showReviews$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
