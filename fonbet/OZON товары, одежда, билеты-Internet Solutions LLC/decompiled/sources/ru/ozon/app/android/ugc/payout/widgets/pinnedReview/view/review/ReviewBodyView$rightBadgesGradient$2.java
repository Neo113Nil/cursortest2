package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewBodyView$rightBadgesGradient$2 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewBodyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewBodyView$rightBadgesGradient$2(Context context, ReviewBodyView reviewBodyView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewBodyView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        RecyclerView badgesRecycler;
        RecyclerView badgesRecycler2;
        RecyclerView badgesRecycler3;
        GradientDrawable gradientDrawable;
        View view = new View(this.$context);
        ReviewBodyView reviewBodyView = this.this$0;
        view.setId(R$id.reviewBodyBadgesRightGradient);
        ConstraintLayout.b bVar = new ConstraintLayout.b(Dimens.INSTANCE.getDP_32(), 0);
        badgesRecycler = reviewBodyView.getBadgesRecycler();
        bVar.f41636i = badgesRecycler.getId();
        badgesRecycler2 = reviewBodyView.getBadgesRecycler();
        bVar.f41642l = badgesRecycler2.getId();
        badgesRecycler3 = reviewBodyView.getBadgesRecycler();
        bVar.f41658v = badgesRecycler3.getId();
        view.setLayoutParams(bVar);
        gradientDrawable = reviewBodyView.getGradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT);
        view.setBackground(gradientDrawable);
        ViewExtKt.gone(view);
        this.this$0.addView(view);
        return view;
    }
}
