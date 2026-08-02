package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di;

import EV.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.MediaCentricMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/di/MediaCentricComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModelImpl;", "getMediaCentricViewModelProvider", "()LPc/a;", "mediaCentricViewModelProvider", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricMapper;", "getMediaCentricMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricMapper;", "mediaCentricMapper", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "getCartButtonBinder", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "cartButtonBinder", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MediaCentricComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/di/MediaCentricComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/di/MediaCentricComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MediaCentricComponent create$lambda$0(C7475g c7475g) {
            ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
            RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            return new MediaCentricComponent$Companion$create$1$1(new SingleReviewPrefetcher(contextComponentDependencies.getContext()), contextComponentDependencies, (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class), (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class), (CartServiceApi) c7475g.getComponent(CartServiceApi.class), ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType(), retainComposerComponentApi);
        }

        @NotNull
        public final C7473e<MediaCentricComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MediaCentricComponent.class), new a(storage, 0));
        }
    }

    @NotNull
    ReviewGalleryV2ProductButtonBinder getCartButtonBinder();

    @NotNull
    MediaCentricMapper getMediaCentricMapper();

    @NotNull
    Pc.a<MediaCentricViewModelImpl> getMediaCentricViewModelProvider();

    @NotNull
    PlayerPreloader getPlayerPreloader();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    VideoController getVideoController();
}
