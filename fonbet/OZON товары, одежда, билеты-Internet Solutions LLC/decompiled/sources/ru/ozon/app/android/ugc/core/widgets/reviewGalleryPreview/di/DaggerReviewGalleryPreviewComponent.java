package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.core.ReviewGalleryPreviewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di.ReviewGalleryPreviewComponent;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryViewAdapter;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryViewBinder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.imagePrefetch.ReviewGalleryPreviewPrefetchInfoProvider;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;

/* loaded from: classes2.dex */
public final class DaggerReviewGalleryPreviewComponent {

    private static final class Factory implements ReviewGalleryPreviewComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di.ReviewGalleryPreviewComponent.Factory
        public ReviewGalleryPreviewComponent create(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi) {
            contextComponentDependencies.getClass();
            videoComponentApi.getClass();
            return new ReviewGalleryPreviewComponentImpl(new ReviewGalleryPreviewPrefetcherModule(), contextComponentDependencies, videoComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class ReviewGalleryPreviewComponentImpl implements ReviewGalleryPreviewComponent {
        private final ContextComponentDependencies contextComponentDependencies;
        private a<ImagePrefetchInfoProviderStorage<ReviewGalleryPreviewVO.ImagePrefetchVO>> provideImagePrefetchStorage$core_prodGoogleAllVendorsReleaseProvider;
        private a<ImagePrefetcher<ReviewGalleryPreviewVO.ImagePrefetchVO>> provideImagePrefetcher$core_prodGoogleAllVendorsReleaseProvider;
        private final ReviewGalleryPreviewComponentImpl reviewGalleryPreviewComponentImpl;
        private a<ReviewGalleryPreviewMapper> reviewGalleryPreviewMapperProvider;
        private final ReviewGalleryPreviewPrefetcherModule reviewGalleryPreviewPrefetcherModule;
        private final VideoComponentApi videoComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94373id;
            private final ReviewGalleryPreviewComponentImpl reviewGalleryPreviewComponentImpl;

            SwitchingProvider(ReviewGalleryPreviewComponentImpl reviewGalleryPreviewComponentImpl, int i11) {
                this.reviewGalleryPreviewComponentImpl = reviewGalleryPreviewComponentImpl;
                this.f94373id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f94373id;
                if (i11 == 0) {
                    Context context = this.reviewGalleryPreviewComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    return (T) new ReviewGalleryPreviewMapper(context, (ImagePrefetcher) this.reviewGalleryPreviewComponentImpl.provideImagePrefetcher$core_prodGoogleAllVendorsReleaseProvider.get());
                }
                if (i11 == 1) {
                    return (T) ReviewGalleryPreviewPrefetcherModule_ProvideImagePrefetcher$core_prodGoogleAllVendorsReleaseFactory.provideImagePrefetcher$core_prodGoogleAllVendorsRelease(this.reviewGalleryPreviewComponentImpl.reviewGalleryPreviewPrefetcherModule, (ImagePrefetchInfoProviderStorage) this.reviewGalleryPreviewComponentImpl.provideImagePrefetchStorage$core_prodGoogleAllVendorsReleaseProvider.get());
                }
                if (i11 == 2) {
                    return (T) ReviewGalleryPreviewPrefetcherModule_ProvideImagePrefetchStorage$core_prodGoogleAllVendorsReleaseFactory.provideImagePrefetchStorage$core_prodGoogleAllVendorsRelease(this.reviewGalleryPreviewComponentImpl.reviewGalleryPreviewPrefetcherModule, new ReviewGalleryPreviewPrefetchInfoProvider());
                }
                throw new AssertionError(this.f94373id);
            }
        }

        /* synthetic */ ReviewGalleryPreviewComponentImpl(ReviewGalleryPreviewPrefetcherModule reviewGalleryPreviewPrefetcherModule, ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, int i11) {
            this(reviewGalleryPreviewPrefetcherModule, contextComponentDependencies, videoComponentApi);
        }

        private void initialize(ReviewGalleryPreviewPrefetcherModule reviewGalleryPreviewPrefetcherModule, ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi) {
            this.provideImagePrefetchStorage$core_prodGoogleAllVendorsReleaseProvider = d.b(new SwitchingProvider(this.reviewGalleryPreviewComponentImpl, 2));
            this.provideImagePrefetcher$core_prodGoogleAllVendorsReleaseProvider = d.b(new SwitchingProvider(this.reviewGalleryPreviewComponentImpl, 1));
            this.reviewGalleryPreviewMapperProvider = d.b(new SwitchingProvider(this.reviewGalleryPreviewComponentImpl, 0));
        }

        private ReviewGalleryViewBinder reviewGalleryViewBinder() {
            PlayerPreloader playerPreloader = this.videoComponentApi.getPlayerPreloader();
            j.c(playerPreloader);
            return new ReviewGalleryViewBinder(playerPreloader);
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di.ReviewGalleryPreviewComponent
        public ReviewGalleryPreviewMapper getMapper() {
            return this.reviewGalleryPreviewMapperProvider.get();
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di.ReviewGalleryPreviewComponent
        public ReviewGalleryViewAdapter reviewGalleryViewAdapter() {
            return new ReviewGalleryViewAdapter(reviewGalleryViewBinder());
        }

        private ReviewGalleryPreviewComponentImpl(ReviewGalleryPreviewPrefetcherModule reviewGalleryPreviewPrefetcherModule, ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi) {
            this.reviewGalleryPreviewComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.reviewGalleryPreviewPrefetcherModule = reviewGalleryPreviewPrefetcherModule;
            this.videoComponentApi = videoComponentApi;
            initialize(reviewGalleryPreviewPrefetcherModule, contextComponentDependencies, videoComponentApi);
        }
    }

    public static ReviewGalleryPreviewComponent.Factory factory() {
        return new Factory(0);
    }
}
