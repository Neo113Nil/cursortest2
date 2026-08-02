package ru.ozon.app.android.ugc.widgets.productsforreview.presentation;

import androidx.constraintlayout.widget.ConstraintLayout;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.ugc.databinding.WidgetProductForReviewBinding;
import ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewViewHolder;
import ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewViewHolder$1$2;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"ru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewViewHolder$1$2", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$OnRatingBarChangeListener;", "onRatingChanged", "", "vectorRatingBar", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar;", "rating", "", "fromUser", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductForReviewViewHolder$1$2 implements VectorRatingBar.OnRatingBarChangeListener {
    final /* synthetic */ WidgetProductForReviewBinding $this_with;
    final /* synthetic */ ProductForReviewViewHolder this$0;

    ProductForReviewViewHolder$1$2(ProductForReviewViewHolder productForReviewViewHolder, WidgetProductForReviewBinding widgetProductForReviewBinding) {
        this.this$0 = productForReviewViewHolder;
        this.$this_with = widgetProductForReviewBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRatingChanged$lambda$0(ProductForReviewViewHolder productForReviewViewHolder, ProductForReviewVO productForReviewVO, float f7) {
        Function1 function1;
        String buildRateTapActionLink;
        function1 = productForReviewViewHolder.actionHandler;
        AtomAction.Move rateTapAction = productForReviewVO.getRateTapAction();
        buildRateTapActionLink = productForReviewViewHolder.buildRateTapActionLink(productForReviewVO.getRateDeeplink(), C6915b.c(f7));
        function1.invoke(AtomAction.Move.copy$default(rateTapAction, buildRateTapActionLink, null, null, null, null, 30, null));
    }

    @Override // ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar.OnRatingBarChangeListener
    public void onRatingChanged(VectorRatingBar vectorRatingBar, final float rating, boolean fromUser) {
        Runnable runnable;
        final ProductForReviewVO boundData = this.this$0.getBoundData();
        if (!fromUser || boundData == null) {
            return;
        }
        final ProductForReviewViewHolder productForReviewViewHolder = this.this$0;
        productForReviewViewHolder.openDeeplinkRunnable = new Runnable() { // from class: fW.b
            @Override // java.lang.Runnable
            public final void run() {
                ProductForReviewViewHolder$1$2.onRatingChanged$lambda$0(ProductForReviewViewHolder.this, boundData, rating);
            }
        };
        ConstraintLayout constraintLayout = this.$this_with.getConstraintLayout();
        runnable = this.this$0.openDeeplinkRunnable;
        constraintLayout.post(runnable);
    }
}
