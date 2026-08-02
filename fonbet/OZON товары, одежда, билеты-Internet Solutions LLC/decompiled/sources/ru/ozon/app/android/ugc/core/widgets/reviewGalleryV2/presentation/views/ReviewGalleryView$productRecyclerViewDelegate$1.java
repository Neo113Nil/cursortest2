package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.ReviewGalleryView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryView$productRecyclerViewDelegate$1 extends AbstractC7737t implements Function0<RecyclerView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewGalleryView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryView$productRecyclerViewDelegate$1(Context context, ReviewGalleryView reviewGalleryView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewGalleryView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        ReviewGalleryView.Companion companion;
        RecyclerView recyclerView = new RecyclerView(this.$context);
        Context context = this.$context;
        recyclerView.setId(R$id.reviewGalleryProductsRecyclerView);
        companion = ReviewGalleryView.Companion;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, companion.getNewProductViewHeight());
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = R$id.contentContainer;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = Dimens.INSTANCE.getDP_16();
        recyclerView.setLayoutParams(bVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.this$0.addView(recyclerView);
        return recyclerView;
    }
}
