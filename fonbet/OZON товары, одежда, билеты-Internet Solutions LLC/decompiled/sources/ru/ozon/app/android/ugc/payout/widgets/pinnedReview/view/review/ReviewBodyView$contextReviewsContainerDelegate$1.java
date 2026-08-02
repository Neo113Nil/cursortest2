package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewBodyView$contextReviewsContainerDelegate$1 extends AbstractC7737t implements Function0<LinearLayout> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewBodyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewBodyView$contextReviewsContainerDelegate$1(Context context, ReviewBodyView reviewBodyView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewBodyView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        ShapeDrawable contextReviewsBackgroundDrawable;
        LinearLayout linearLayout = new LinearLayout(this.$context);
        ReviewBodyView reviewBodyView = this.this$0;
        linearLayout.setId(R$id.reviewBodyContextReviewsContainer);
        linearLayout.setLayoutParams(new ConstraintLayout.b(-1, -2));
        linearLayout.setOrientation(1);
        if (reviewBodyView.getShowContextReviewsBackground()) {
            Dimens dimens = Dimens.INSTANCE;
            linearLayout.setPadding(dimens.getDP_12(), dimens.getDP_12(), dimens.getDP_12(), dimens.getDP_12());
            contextReviewsBackgroundDrawable = reviewBodyView.getContextReviewsBackgroundDrawable();
            linearLayout.setBackground(contextReviewsBackgroundDrawable);
        }
        this.this$0.addView(linearLayout);
        return linearLayout;
    }
}
