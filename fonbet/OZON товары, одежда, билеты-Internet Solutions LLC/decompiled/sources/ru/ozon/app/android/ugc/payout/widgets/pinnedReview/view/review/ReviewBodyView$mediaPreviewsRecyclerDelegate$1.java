package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewBodyView$mediaPreviewsRecyclerDelegate$1 extends AbstractC7737t implements Function0<RecyclerView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewBodyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewBodyView$mediaPreviewsRecyclerDelegate$1(Context context, ReviewBodyView reviewBodyView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewBodyView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        MediaPreviewListAdapter mediaPreviewAdapter;
        RecyclerView recyclerView = new RecyclerView(this.$context);
        Context context = this.$context;
        ReviewBodyView reviewBodyView = this.this$0;
        recyclerView.setId(R$id.reviewBodyMediaPreviewsRv);
        recyclerView.setNestedScrollingEnabled(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41598E = 0.0f;
        recyclerView.setLayoutParams(bVar);
        recyclerView.setLayoutManager(new GridLayoutManager(context, reviewBodyView.getMediaPreviewsInLineCount(), 1));
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator(null);
        ViewExtKt.updatePadding$default(recyclerView, 0, 0, 0, Dimens.INSTANCE.getDP_12(), 7, null);
        mediaPreviewAdapter = reviewBodyView.getMediaPreviewAdapter();
        recyclerView.setAdapter(mediaPreviewAdapter);
        recyclerView.addItemDecoration(new MediaPreviewsListItemDecoration(reviewBodyView.getMediaPreviewsGap(), reviewBodyView.getMediaPreviewsInLineCount()));
        this.this$0.addView(recyclerView);
        return recyclerView;
    }
}
