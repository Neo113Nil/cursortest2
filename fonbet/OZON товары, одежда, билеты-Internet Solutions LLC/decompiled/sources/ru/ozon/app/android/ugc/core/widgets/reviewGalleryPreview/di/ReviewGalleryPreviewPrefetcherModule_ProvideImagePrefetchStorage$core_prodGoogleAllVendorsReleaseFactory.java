package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.imagePrefetch.ReviewGalleryPreviewPrefetchInfoProvider;

/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewPrefetcherModule_ProvideImagePrefetchStorage$core_prodGoogleAllVendorsReleaseFactory implements e<ImagePrefetchInfoProviderStorage<ReviewGalleryPreviewVO.ImagePrefetchVO>> {
    public static ImagePrefetchInfoProviderStorage<ReviewGalleryPreviewVO.ImagePrefetchVO> provideImagePrefetchStorage$core_prodGoogleAllVendorsRelease(ReviewGalleryPreviewPrefetcherModule reviewGalleryPreviewPrefetcherModule, ReviewGalleryPreviewPrefetchInfoProvider reviewGalleryPreviewPrefetchInfoProvider) {
        ImagePrefetchInfoProviderStorage<ReviewGalleryPreviewVO.ImagePrefetchVO> provideImagePrefetchStorage$core_prodGoogleAllVendorsRelease = reviewGalleryPreviewPrefetcherModule.provideImagePrefetchStorage$core_prodGoogleAllVendorsRelease(reviewGalleryPreviewPrefetchInfoProvider);
        j.d(provideImagePrefetchStorage$core_prodGoogleAllVendorsRelease);
        return provideImagePrefetchStorage$core_prodGoogleAllVendorsRelease;
    }
}
