package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewBodyView$badgeScrollListener$2$1", "invoke", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewBodyView$badgeScrollListener$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewBodyView$badgeScrollListener$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ ReviewBodyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewBodyView$badgeScrollListener$2(ReviewBodyView reviewBodyView) {
        super(0);
        this.this$0 = reviewBodyView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewBodyView$badgeScrollListener$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final ReviewBodyView reviewBodyView = this.this$0;
        return new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewBodyView$badgeScrollListener$2.1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    ReviewBodyView.this.updateGradientVisibility(linearLayoutManager);
                }
            }
        };
    }
}
