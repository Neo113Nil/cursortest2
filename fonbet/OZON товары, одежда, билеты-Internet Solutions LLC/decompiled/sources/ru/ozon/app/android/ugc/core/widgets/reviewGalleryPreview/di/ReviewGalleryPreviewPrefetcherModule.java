package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.imagePrefetch.ReviewGalleryPreviewPrefetchInfoProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/di/ReviewGalleryPreviewPrefetcherModule;", "", "<init>", "()V", "provideImagePrefetchStorage", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$ImagePrefetchVO;", "previewImagePrefetchInfoProvider", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/imagePrefetch/ReviewGalleryPreviewPrefetchInfoProvider;", "provideImagePrefetchStorage$core_prodGoogleAllVendorsRelease", "provideImagePrefetcher", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "providersStorage", "provideImagePrefetcher$core_prodGoogleAllVendorsRelease", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewPrefetcherModule {
    @NotNull
    public final ImagePrefetchInfoProviderStorage<ReviewGalleryPreviewVO.ImagePrefetchVO> provideImagePrefetchStorage$core_prodGoogleAllVendorsRelease(@NotNull ReviewGalleryPreviewPrefetchInfoProvider previewImagePrefetchInfoProvider) {
        Intrinsics.checkNotNullParameter(previewImagePrefetchInfoProvider, "previewImagePrefetchInfoProvider");
        ImagePrefetchInfoProviderStorage<ReviewGalleryPreviewVO.ImagePrefetchVO> imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage<>();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ReviewGalleryPreviewVO.ImagePrefetchVO.class), previewImagePrefetchInfoProvider);
        return imagePrefetchInfoProviderStorage;
    }

    @NotNull
    public final ImagePrefetcher<ReviewGalleryPreviewVO.ImagePrefetchVO> provideImagePrefetcher$core_prodGoogleAllVendorsRelease(@NotNull ImagePrefetchInfoProviderStorage<ReviewGalleryPreviewVO.ImagePrefetchVO> providersStorage) {
        Intrinsics.checkNotNullParameter(providersStorage, "providersStorage");
        return new ImagePrefetcher<>(5, providersStorage);
    }
}
