package ru.ozon.app.android.ugc.widgets.reviewTiles.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesMapper;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesViewModel;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\u00060\u0017j\u0002`\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"ru/ozon/app/android/ugc/widgets/reviewTiles/di/ReviewTilesComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/ugc/widgets/reviewTiles/di/ReviewTilesComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "getVideoComponentApi", "()Lru/ozon/app/android/video/di/VideoComponentApi;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController$delegate", "LSc/j;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesMapper;", "reviewTilesMapper$delegate", "getReviewTilesMapper", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesMapper;", "reviewTilesMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "LPc/a;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewTilesComponent$Companion$getInstance$1$1 implements ReviewTilesComponent {
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: reviewTilesMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j reviewTilesMapper;
    private final l tokenizedAnalytics;
    private final VideoComponentApi videoComponentApi;

    /* renamed from: videoController$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j videoController;
    private final a<ReviewTilesViewModel> viewModelProvider;

    ReviewTilesComponent$Companion$getInstance$1$1(C7475g c7475g) {
        RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.retainComposerComponentApi = retainComposerComponentApi;
        this.videoComponentApi = (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class);
        this.videoController = k.b(new ReviewTilesComponent$Companion$getInstance$1$1$videoController$2(this));
        this.reviewTilesMapper = k.b(ReviewTilesComponent$Companion$getInstance$1$1$reviewTilesMapper$2.INSTANCE);
        this.tokenizedAnalytics = retainComposerComponentApi.getTokenizedAnalytics();
        this.viewModelProvider = new zW.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewTilesViewModel viewModelProvider$lambda$0() {
        return new ReviewTilesViewModel();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.di.ReviewTilesComponent
    public PlayerPreloader getPlayerPreloader() {
        return this.videoComponentApi.getPlayerPreloader();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.di.ReviewTilesComponent
    public ReviewTilesMapper getReviewTilesMapper() {
        return (ReviewTilesMapper) this.reviewTilesMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.di.ReviewTilesComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    public final VideoComponentApi getVideoComponentApi() {
        return this.videoComponentApi;
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.di.ReviewTilesComponent
    public VideoController getVideoController() {
        return (VideoController) this.videoController.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.di.ReviewTilesComponent
    public a<ReviewTilesViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
