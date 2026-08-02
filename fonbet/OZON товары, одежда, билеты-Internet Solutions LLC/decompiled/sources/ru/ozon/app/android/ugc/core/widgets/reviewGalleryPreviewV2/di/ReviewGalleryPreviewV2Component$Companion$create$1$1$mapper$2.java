package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewV2Mapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewGalleryImagePrefetcher;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewGalleryItemSizeHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/core/ReviewGalleryPreviewV2Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewV2Component$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<ReviewGalleryPreviewV2Mapper> {
    final /* synthetic */ InterfaceC4008j<PreviewGalleryImagePrefetcher> $photoPrefetcherLazy;
    final /* synthetic */ PreviewGalleryItemSizeHolder $previewGalleryItemSizeHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewV2Component$Companion$create$1$1$mapper$2(PreviewGalleryItemSizeHolder previewGalleryItemSizeHolder, InterfaceC4008j<PreviewGalleryImagePrefetcher> interfaceC4008j) {
        super(0);
        this.$previewGalleryItemSizeHolder = previewGalleryItemSizeHolder;
        this.$photoPrefetcherLazy = interfaceC4008j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReviewGalleryPreviewV2Mapper invoke() {
        return new ReviewGalleryPreviewV2Mapper(this.$previewGalleryItemSizeHolder, this.$photoPrefetcherLazy);
    }
}
