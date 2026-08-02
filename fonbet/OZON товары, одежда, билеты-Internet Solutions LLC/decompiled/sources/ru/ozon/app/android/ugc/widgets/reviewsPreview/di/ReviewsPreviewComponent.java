package ru.ozon.app.android.ugc.widgets.reviewsPreview.di;

import DA.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModelImpl;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.image.ReviewsPreviewImageMapper;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.image.ReviewsPreviewPrefetchInfoProvider;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoDelegate;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoMapper;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 %2\u00060\u0001j\u0002`\u0002:\u0001%R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010 \u001a\f\u0012\b\u0012\u00060\u001cj\u0002`\u001d0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/di/ReviewsPreviewComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageMapper;", "getImageMapper", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageMapper;", "imageMapper", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoMapper;", "getVideoMapper", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoMapper;", "videoMapper", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModelImpl;", "viewModel", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewPrefetchInfoProvider;", "getImagePrefetchInfoProvider", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewPrefetchInfoProvider;", "imagePrefetchInfoProvider", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "getImagePrefetchInfoProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "imagePrefetchInfoProviderStorage", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoDelegate;", "getVideoDelegate", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoDelegate;", "videoDelegate", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReviewsPreviewComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/di/ReviewsPreviewComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/di/ReviewsPreviewComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReviewsPreviewComponent getInstance$lambda$0(C7475g c7475g) {
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            final ActionComponentApi actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
            final VideoComponentApi videoComponentApi = (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class);
            final RetainImagePrefetchComponentApi retainImagePrefetchComponentApi = (RetainImagePrefetchComponentApi) c7475g.getComponent(RetainImagePrefetchComponentApi.class);
            return new ReviewsPreviewComponent(actionComponentApi, retainComposerComponentApi, retainImagePrefetchComponentApi) { // from class: ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent$Companion$getInstance$1$1
                final /* synthetic */ ActionComponentApi $actionComponentApi;
                final /* synthetic */ RetainComposerComponentApi $retainComposerComponentApi;
                final /* synthetic */ RetainImagePrefetchComponentApi $retainImagePrefetchComponentApi;

                /* renamed from: imageMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j imageMapper = k.b(ReviewsPreviewComponent$Companion$getInstance$1$1$imageMapper$2.INSTANCE);

                /* renamed from: imagePrefetchInfoProvider$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j imagePrefetchInfoProvider = k.b(ReviewsPreviewComponent$Companion$getInstance$1$1$imagePrefetchInfoProvider$2.INSTANCE);

                /* renamed from: videoMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j videoMapper;

                {
                    this.$actionComponentApi = actionComponentApi;
                    this.$retainComposerComponentApi = retainComposerComponentApi;
                    this.$retainImagePrefetchComponentApi = retainImagePrefetchComponentApi;
                    this.videoMapper = k.b(new ReviewsPreviewComponent$Companion$getInstance$1$1$videoMapper$2(VideoComponentApi.this));
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent
                public ReviewsPreviewImageMapper getImageMapper() {
                    return (ReviewsPreviewImageMapper) this.imageMapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent
                public ReviewsPreviewPrefetchInfoProvider getImagePrefetchInfoProvider() {
                    return (ReviewsPreviewPrefetchInfoProvider) this.imagePrefetchInfoProvider.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent
                public ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage() {
                    return this.$retainImagePrefetchComponentApi.getImagePrefetchInfoProviderStorage();
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent
                public PlayerPreloader getPlayerPreloader() {
                    return VideoComponentApi.this.getPlayerPreloader();
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent
                public l getTokenizedAnalytics() {
                    return this.$retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent
                public ReviewsPreviewVideoDelegate getVideoDelegate() {
                    return new ReviewsPreviewVideoDelegate(VideoComponentApi.this.getVideoController(), getTokenizedAnalytics());
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent
                public ReviewsPreviewVideoMapper getVideoMapper() {
                    return (ReviewsPreviewVideoMapper) this.videoMapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent
                public ReviewsPreviewViewModelImpl getViewModel() {
                    return new ReviewsPreviewViewModelImpl(this.$actionComponentApi.getActionRepository());
                }
            };
        }

        @NotNull
        public final C7473e<ReviewsPreviewComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ReviewsPreviewComponent.class), new a(storage, 1));
        }
    }

    @NotNull
    ReviewsPreviewImageMapper getImageMapper();

    @NotNull
    ReviewsPreviewPrefetchInfoProvider getImagePrefetchInfoProvider();

    @NotNull
    ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage();

    @NotNull
    PlayerPreloader getPlayerPreloader();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    ReviewsPreviewVideoDelegate getVideoDelegate();

    @NotNull
    ReviewsPreviewVideoMapper getVideoMapper();

    @NotNull
    ReviewsPreviewViewModelImpl getViewModel();
}
