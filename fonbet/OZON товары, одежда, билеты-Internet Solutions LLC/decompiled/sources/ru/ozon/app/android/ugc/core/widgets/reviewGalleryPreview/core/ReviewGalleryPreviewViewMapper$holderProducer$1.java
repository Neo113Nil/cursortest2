package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.databinding.WidgetReviewGalleryPreviewBinding;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewWidgetVH;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewWidgetVH;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ReviewGalleryPreviewViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ReviewGalleryPreviewWidgetVH> {
    final /* synthetic */ ReviewGalleryPreviewViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewViewMapper$holderProducer$1(ReviewGalleryPreviewViewMapper reviewGalleryPreviewViewMapper) {
        super(2);
        this.this$0 = reviewGalleryPreviewViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ReviewGalleryPreviewWidgetVH invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        WidgetReviewGalleryPreviewBinding bind = WidgetReviewGalleryPreviewBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new ReviewGalleryPreviewWidgetVH(bind, this.this$0.component().reviewGalleryViewAdapter(), references);
    }
}
