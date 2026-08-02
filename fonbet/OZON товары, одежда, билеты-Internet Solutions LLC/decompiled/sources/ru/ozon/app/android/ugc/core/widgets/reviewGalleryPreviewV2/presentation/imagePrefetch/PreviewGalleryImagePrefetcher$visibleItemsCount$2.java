package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class PreviewGalleryImagePrefetcher$visibleItemsCount$2 extends C7735q implements Function0<Integer> {
    PreviewGalleryImagePrefetcher$visibleItemsCount$2(Object obj) {
        super(0, obj, PreviewGalleryImagePrefetcher.class, "calcVisibleItemsCount", "calcVisibleItemsCount()I", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int calcVisibleItemsCount;
        calcVisibleItemsCount = ((PreviewGalleryImagePrefetcher) this.receiver).calcVisibleItemsCount();
        return Integer.valueOf(calcVisibleItemsCount);
    }
}
