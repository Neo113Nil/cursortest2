package ru.ozon.app.android.ugc.core.widgets.singlereview.contextReviews;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ContextReviewsView$contextReviewsContainerDelegate$1 extends AbstractC7737t implements Function0<LinearLayout> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ContextReviewsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContextReviewsView$contextReviewsContainerDelegate$1(Context context, ContextReviewsView contextReviewsView) {
        super(0);
        this.$context = context;
        this.this$0 = contextReviewsView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        ShapeDrawable shapeDrawable;
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(this.$context);
        ContextReviewsView contextReviewsView = this.this$0;
        linearLayout2.setLayoutParams(new ConstraintLayout.b(-1, -2));
        linearLayout2.setOrientation(1);
        Dimens dimens = Dimens.INSTANCE;
        linearLayout2.setPadding(dimens.getDP_8(), dimens.getDP_8(), dimens.getDP_8(), dimens.getDP_8());
        shapeDrawable = contextReviewsView.contextReviewsBackgroundDrawable;
        linearLayout2.setBackground(shapeDrawable);
        linearLayout = this.this$0.layoutContainer;
        linearLayout.addView(linearLayout2);
        return linearLayout2;
    }
}
