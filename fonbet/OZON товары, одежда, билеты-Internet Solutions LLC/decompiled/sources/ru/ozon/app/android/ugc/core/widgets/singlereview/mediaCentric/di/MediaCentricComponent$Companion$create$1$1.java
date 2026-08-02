package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di;

import EV.b;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.MediaCentricMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"ru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/di/MediaCentricComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/di/MediaCentricComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricMapper;", "mediaCentricMapper$delegate", "LSc/j;", "getMediaCentricMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricMapper;", "mediaCentricMapper", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModelImpl;", "getMediaCentricViewModelProvider", "()LPc/a;", "mediaCentricViewModelProvider", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "getCartButtonBinder", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "cartButtonBinder", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricComponent$Companion$create$1$1 implements MediaCentricComponent {
    final /* synthetic */ ActionComponentApi $actionComponentApi;
    final /* synthetic */ AppType $appType;
    final /* synthetic */ CartServiceApi $cartServiceApi;
    final /* synthetic */ RetainComposerComponentApi $retainComposerComponentApi;
    final /* synthetic */ VideoComponentApi $videoComponentApi;

    /* renamed from: mediaCentricMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mediaCentricMapper;

    MediaCentricComponent$Companion$create$1$1(SingleReviewPrefetcher singleReviewPrefetcher, ContextComponentDependencies contextComponentDependencies, ActionComponentApi actionComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, AppType appType, RetainComposerComponentApi retainComposerComponentApi) {
        this.$actionComponentApi = actionComponentApi;
        this.$videoComponentApi = videoComponentApi;
        this.$cartServiceApi = cartServiceApi;
        this.$appType = appType;
        this.$retainComposerComponentApi = retainComposerComponentApi;
        this.mediaCentricMapper = k.b(new MediaCentricComponent$Companion$create$1$1$mediaCentricMapper$2(singleReviewPrefetcher, contextComponentDependencies));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaCentricViewModelImpl _get_mediaCentricViewModelProvider_$lambda$0(ActionComponentApi actionComponentApi) {
        return new MediaCentricViewModelImpl(actionComponentApi.getActionRepository());
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di.MediaCentricComponent
    public ReviewGalleryV2ProductButtonBinder getCartButtonBinder() {
        return new ReviewGalleryV2ProductButtonBinder(this.$cartServiceApi.getCartService(), this.$appType);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di.MediaCentricComponent
    public MediaCentricMapper getMediaCentricMapper() {
        return (MediaCentricMapper) this.mediaCentricMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di.MediaCentricComponent
    public a<MediaCentricViewModelImpl> getMediaCentricViewModelProvider() {
        return new b(this.$actionComponentApi, 0);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di.MediaCentricComponent
    public PlayerPreloader getPlayerPreloader() {
        return this.$videoComponentApi.getPlayerPreloader();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di.MediaCentricComponent
    public l getTokenizedAnalytics() {
        return this.$retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di.MediaCentricComponent
    public VideoController getVideoController() {
        return this.$videoComponentApi.getVideoController();
    }
}
