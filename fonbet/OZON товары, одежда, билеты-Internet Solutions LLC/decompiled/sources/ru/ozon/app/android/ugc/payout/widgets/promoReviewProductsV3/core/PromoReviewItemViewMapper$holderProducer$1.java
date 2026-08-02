package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemVH;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVH;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PromoReviewItemViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PromoReviewItemVH> {
    final /* synthetic */ PromoReviewItemViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoReviewItemViewMapper$holderProducer$1(PromoReviewItemViewMapper promoReviewItemViewMapper) {
        super(2);
        this.this$0 = promoReviewItemViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PromoReviewItemVH invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new PromoReviewItemVH((PromoReviewItemView) view, refs, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getHandlersInhibitor());
    }
}
