package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewGalleryImagePrefetcher;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewGalleryItemSizeHolder;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewGalleryImagePrefetcher;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewV2Component$Companion$create$1$photoPrefetcherLazy$1 extends AbstractC7737t implements Function0<PreviewGalleryImagePrefetcher> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PreviewGalleryItemSizeHolder $previewGalleryItemSizeHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewV2Component$Companion$create$1$photoPrefetcherLazy$1(Context context, PreviewGalleryItemSizeHolder previewGalleryItemSizeHolder) {
        super(0);
        this.$context = context;
        this.$previewGalleryItemSizeHolder = previewGalleryItemSizeHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PreviewGalleryImagePrefetcher invoke() {
        return new PreviewGalleryImagePrefetcher(this.$context, this.$previewGalleryItemSizeHolder);
    }
}
