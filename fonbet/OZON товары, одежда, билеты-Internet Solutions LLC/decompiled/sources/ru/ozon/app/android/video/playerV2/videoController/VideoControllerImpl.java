package ru.ozon.app.android.video.playerV2.videoController;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.manager.ExoManagerLive;
import ru.ozon.app.android.video.manager.ExoManagerWithCache;
import ru.ozon.app.android.video.manager.ProgressiveExoManager;
import ru.ozon.app.android.video.manager.ProgressiveWithCacheExoManager;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.PlayerPoolManager;
import ru.ozon.app.android.video.playerV2.videoController.singleInstanceFactory.SingleInstanceFactory;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/VideoControllerImpl;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lru/ozon/app/android/video/playerV2/videoController/singleInstanceFactory/SingleInstanceFactory;", "singleInstanceFactory", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/PlayerPoolManager;", "playerPoolManager", "LPc/a;", "Lru/ozon/app/android/video/manager/ExoManagerLive;", "pExoManagerLive", "Lru/ozon/app/android/video/manager/ExoManagerWithCache;", "pExoManagerWithCache", "Lru/ozon/app/android/video/manager/ProgressiveExoManager;", "pProgressiveExoManager", "Lru/ozon/app/android/video/manager/ProgressiveWithCacheExoManager;", "pProgressiveWithCacheExoManager", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/singleInstanceFactory/SingleInstanceFactory;Lru/ozon/app/android/video/playerV2/videoController/poolManager/PlayerPoolManager;LPc/a;LPc/a;LPc/a;LPc/a;)V", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "getSingleInstancePlayerController", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "()Lru/ozon/app/android/video/playerV2/videoController/poolManager/PlayerPoolManager;", "getExoManagerLive", "()Lru/ozon/app/android/video/manager/ExoManagerLive;", "getProgressiveExoManager", "()Lru/ozon/app/android/video/manager/ProgressiveExoManager;", "getProgressiveWithCacheExoManager", "()Lru/ozon/app/android/video/manager/ProgressiveWithCacheExoManager;", "getDownloadableExoManager", "()Lru/ozon/app/android/video/manager/ExoManagerWithCache;", "Lru/ozon/app/android/video/playerV2/videoController/singleInstanceFactory/SingleInstanceFactory;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/PlayerPoolManager;", "LPc/a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoControllerImpl implements VideoController {

    @NotNull
    private final a<ExoManagerLive> pExoManagerLive;

    @NotNull
    private final a<ExoManagerWithCache> pExoManagerWithCache;

    @NotNull
    private final a<ProgressiveExoManager> pProgressiveExoManager;

    @NotNull
    private final a<ProgressiveWithCacheExoManager> pProgressiveWithCacheExoManager;

    @NotNull
    private final PlayerPoolManager playerPoolManager;

    @NotNull
    private final SingleInstanceFactory singleInstanceFactory;

    public VideoControllerImpl(@NotNull SingleInstanceFactory singleInstanceFactory, @NotNull PlayerPoolManager playerPoolManager, @NotNull a<ExoManagerLive> pExoManagerLive, @NotNull a<ExoManagerWithCache> pExoManagerWithCache, @NotNull a<ProgressiveExoManager> pProgressiveExoManager, @NotNull a<ProgressiveWithCacheExoManager> pProgressiveWithCacheExoManager) {
        Intrinsics.checkNotNullParameter(singleInstanceFactory, "singleInstanceFactory");
        Intrinsics.checkNotNullParameter(playerPoolManager, "playerPoolManager");
        Intrinsics.checkNotNullParameter(pExoManagerLive, "pExoManagerLive");
        Intrinsics.checkNotNullParameter(pExoManagerWithCache, "pExoManagerWithCache");
        Intrinsics.checkNotNullParameter(pProgressiveExoManager, "pProgressiveExoManager");
        Intrinsics.checkNotNullParameter(pProgressiveWithCacheExoManager, "pProgressiveWithCacheExoManager");
        this.singleInstanceFactory = singleInstanceFactory;
        this.playerPoolManager = playerPoolManager;
        this.pExoManagerLive = pExoManagerLive;
        this.pExoManagerWithCache = pExoManagerWithCache;
        this.pProgressiveExoManager = pProgressiveExoManager;
        this.pProgressiveWithCacheExoManager = pProgressiveWithCacheExoManager;
    }

    @Override // ru.ozon.app.android.video.manager.ExoManagerProvider
    @NotNull
    public ExoManagerWithCache getDownloadableExoManager() {
        ExoManagerWithCache exoManagerWithCache = this.pExoManagerWithCache.get();
        Intrinsics.checkNotNullExpressionValue(exoManagerWithCache, "get(...)");
        return exoManagerWithCache;
    }

    @Override // ru.ozon.app.android.video.manager.ExoManagerProvider
    @NotNull
    public ExoManagerLive getExoManagerLive() {
        ExoManagerLive exoManagerLive = this.pExoManagerLive.get();
        Intrinsics.checkNotNullExpressionValue(exoManagerLive, "get(...)");
        return exoManagerLive;
    }

    @Override // ru.ozon.app.android.video.manager.ExoManagerProvider
    @NotNull
    public ProgressiveExoManager getProgressiveExoManager() {
        ProgressiveExoManager progressiveExoManager = this.pProgressiveExoManager.get();
        Intrinsics.checkNotNullExpressionValue(progressiveExoManager, "get(...)");
        return progressiveExoManager;
    }

    @Override // ru.ozon.app.android.video.manager.ExoManagerProvider
    @NotNull
    public ProgressiveWithCacheExoManager getProgressiveWithCacheExoManager() {
        ProgressiveWithCacheExoManager progressiveWithCacheExoManager = this.pProgressiveWithCacheExoManager.get();
        Intrinsics.checkNotNullExpressionValue(progressiveWithCacheExoManager, "get(...)");
        return progressiveWithCacheExoManager;
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.VideoController
    @NotNull
    public SingleInstancePlayerController getSingleInstancePlayerController(@NotNull PlayerConfigAlias playerConfigAlias) {
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        return this.singleInstanceFactory.getPlayerController(playerConfigAlias);
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.VideoController
    @NotNull
    /* renamed from: playerPoolManager, reason: from getter */
    public PlayerPoolManager getPlayerPoolManager() {
        return this.playerPoolManager;
    }
}
