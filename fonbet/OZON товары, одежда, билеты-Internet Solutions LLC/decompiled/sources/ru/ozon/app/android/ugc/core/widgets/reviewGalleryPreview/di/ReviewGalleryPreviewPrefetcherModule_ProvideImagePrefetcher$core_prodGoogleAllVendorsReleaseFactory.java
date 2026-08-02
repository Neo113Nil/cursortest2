package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO;

/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewPrefetcherModule_ProvideImagePrefetcher$core_prodGoogleAllVendorsReleaseFactory implements e<ImagePrefetcher<ReviewGalleryPreviewVO.ImagePrefetchVO>> {
    public static ImagePrefetcher<ReviewGalleryPreviewVO.ImagePrefetchVO> provideImagePrefetcher$core_prodGoogleAllVendorsRelease(ReviewGalleryPreviewPrefetcherModule reviewGalleryPreviewPrefetcherModule, ImagePrefetchInfoProviderStorage<ReviewGalleryPreviewVO.ImagePrefetchVO> imagePrefetchInfoProviderStorage) {
        ImagePrefetcher<ReviewGalleryPreviewVO.ImagePrefetchVO> provideImagePrefetcher$core_prodGoogleAllVendorsRelease = reviewGalleryPreviewPrefetcherModule.provideImagePrefetcher$core_prodGoogleAllVendorsRelease(imagePrefetchInfoProviderStorage);
        j.d(provideImagePrefetcher$core_prodGoogleAllVendorsRelease);
        return provideImagePrefetcher$core_prodGoogleAllVendorsRelease;
    }
}
