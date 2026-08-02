package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class ReviewGalleryViewMapper$holderProducer$1 extends C7735q implements Function2<View, ComposerReferences, ReviewGalleryBaseWidgetVH> {
    ReviewGalleryViewMapper$holderProducer$1(Object obj) {
        super(2, obj, ReviewGalleryViewMapper.class, "getReviewGalleryViewHolder", "getReviewGalleryViewHolder(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ReviewGalleryBaseWidgetVH invoke(View p02, ComposerReferences p12) {
        ReviewGalleryBaseWidgetVH reviewGalleryViewHolder;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        reviewGalleryViewHolder = ((ReviewGalleryViewMapper) this.receiver).getReviewGalleryViewHolder(p02, p12);
        return reviewGalleryViewHolder;
    }
}
