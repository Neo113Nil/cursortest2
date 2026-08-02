package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di;

import By.C2677a;
import Pc.a;
import Sc.k;
import WZ.l;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewV2Mapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.PreviewItemListAdapter;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewGalleryItemSizeHolder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.utils.ReviewGalleryPreviewLayoutParamsProvider;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/di/ReviewGalleryPreviewV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/core/ReviewGalleryPreviewV2Mapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/core/ReviewGalleryPreviewV2Mapper;", "mapper", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$Factory;", "getAdapterFactory", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$Factory;", "adapterFactory", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModelImpl;", "getReviewGalleryPreviewViewModelProvider", "()LPc/a;", "reviewGalleryPreviewViewModelProvider", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$VideoPreloader;", "getVideoPreloader", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$VideoPreloader;", "videoPreloader", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReviewGalleryPreviewV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/di/ReviewGalleryPreviewV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/di/ReviewGalleryPreviewV2Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReviewGalleryPreviewV2Component create$lambda$0(C7475g c7475g) {
            NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
            RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
            PlayerPreloader playerPreloader = ((VideoComponentApi) c7475g.getComponent(VideoComponentApi.class)).getPlayerPreloader();
            PreviewGalleryItemSizeHolder previewGalleryItemSizeHolder = new PreviewGalleryItemSizeHolder();
            Context context = contextComponentDependencies.getContext();
            return new ReviewGalleryPreviewV2Component$Companion$create$1$1(networkComponentApi, retainComposerComponentApi, previewGalleryItemSizeHolder, k.b(new ReviewGalleryPreviewV2Component$Companion$create$1$photoPrefetcherLazy$1(context, previewGalleryItemSizeHolder)), playerPreloader, new ReviewGalleryPreviewLayoutParamsProvider(previewGalleryItemSizeHolder), c7475g);
        }

        @NotNull
        public final C7473e<ReviewGalleryPreviewV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ReviewGalleryPreviewV2Component.class), new C2677a(storage, 4));
        }
    }

    @NotNull
    PreviewItemListAdapter.Factory getAdapterFactory();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    ReviewGalleryPreviewV2Mapper getMapper();

    @NotNull
    a<ReviewGalleryPreviewViewModelImpl> getReviewGalleryPreviewViewModelProvider();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    PreviewItemListAdapter.VideoPreloader getVideoPreloader();
}
