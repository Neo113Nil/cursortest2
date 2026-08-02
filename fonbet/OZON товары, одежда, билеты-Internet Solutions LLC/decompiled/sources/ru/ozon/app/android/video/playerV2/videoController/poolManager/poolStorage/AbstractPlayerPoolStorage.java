package ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage;

import Sc.InterfaceC4008j;
import Sc.o;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerInternal;
import ru.ozon.app.android.video.playerV2.utils.VideoModuleExtKt;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.factory.PoolPlayerFactory;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\b!\u0018\u0000 72\u00020\u0001:\u00017B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J1\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R!\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010.R?\u00106\u001a&\u0012\f\u0012\n 1*\u0004\u0018\u00010\u000e0\u000e 1*\u0012\u0012\f\u0012\n 1*\u0004\u0018\u00010\u000e0\u000e\u0018\u000102008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/AbstractPlayerPoolStorage;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/factory/PoolPlayerFactory;", "poolPlayerFactory", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "playerLogger", "Lkotlin/Function0;", "onGetMainPoolStorage", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/poolManager/factory/PoolPlayerFactory;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/logs/PlayerLogger;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "acquireControllerFromPool", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "createPlayerControllerFromPull", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;", "poolStorageConfig", "getPlayerController", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Ljava/lang/String;Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;)Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "poolPlayerController", "", "returnPlayerToPool", "(Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)V", "stopPreloadedPlayer", "()V", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/factory/PoolPlayerFactory;", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "Lkotlin/jvm/functions/Function0;", "", "logPlayerErrors$delegate", "LSc/j;", "getLogPlayerErrors", "()Z", "logPlayerErrors", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlin/collections/k;", "freeControllers$delegate", "getFreeControllers", "()Lkotlin/collections/k;", "freeControllers", "", "kotlin.jvm.PlatformType", "", "acquiredControllers$delegate", "getAcquiredControllers", "()Ljava/util/Set;", "acquiredControllers", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AbstractPlayerPoolStorage implements PlayerPoolStorage {

    /* renamed from: acquiredControllers$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j acquiredControllers;

    /* renamed from: freeControllers$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j freeControllers;

    @NotNull
    private final ReentrantLock lock;

    /* renamed from: logPlayerErrors$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j logPlayerErrors;

    @NotNull
    private final Function0<PlayerPoolStorage> onGetMainPoolStorage;

    @NotNull
    private final PlayerLogger playerLogger;

    @NotNull
    private final PoolPlayerFactory poolPlayerFactory;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/AbstractPlayerPoolStorage$Companion;", "", "<init>", "()V", "EMPTY_STRING", "", "DEFAULT_POOL_STORAGE_SIZE", "", "UNEXPECTED_POOL_RETURN_PLAYER_ERROR", "NO_WIDGET_NAME", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PoolStorageConfig.values().length];
            try {
                iArr[PoolStorageConfig.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PoolStorageConfig.NO_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractPlayerPoolStorage(@NotNull PoolPlayerFactory poolPlayerFactory, @NotNull FeatureService featureService, @NotNull PlayerLogger playerLogger, @NotNull Function0<? extends PlayerPoolStorage> onGetMainPoolStorage) {
        Intrinsics.checkNotNullParameter(poolPlayerFactory, "poolPlayerFactory");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(playerLogger, "playerLogger");
        Intrinsics.checkNotNullParameter(onGetMainPoolStorage, "onGetMainPoolStorage");
        this.poolPlayerFactory = poolPlayerFactory;
        this.playerLogger = playerLogger;
        this.onGetMainPoolStorage = onGetMainPoolStorage;
        this.logPlayerErrors = VideoModuleExtKt.publicationLazy(new AbstractPlayerPoolStorage$logPlayerErrors$2(featureService));
        this.lock = new ReentrantLock();
        this.freeControllers = VideoModuleExtKt.publicationLazy(AbstractPlayerPoolStorage$freeControllers$2.INSTANCE);
        this.acquiredControllers = VideoModuleExtKt.publicationLazy(AbstractPlayerPoolStorage$acquiredControllers$2.INSTANCE);
    }

    private final PoolPlayerControllerInternal acquireControllerFromPool(PlayerConfigAlias playerConfigAlias) {
        C7704k<PoolPlayerControllerInternal> freeControllers = getFreeControllers();
        PoolPlayerControllerInternal removeLast = freeControllers.isEmpty() ? null : freeControllers.removeLast();
        if (removeLast == null) {
            removeLast = createPlayerControllerFromPull(playerConfigAlias);
        }
        getAcquiredControllers().add(removeLast);
        return removeLast;
    }

    private final PoolPlayerControllerInternal createPlayerControllerFromPull(PlayerConfigAlias playerConfigAlias) {
        return this.poolPlayerFactory.getPlayerControllerFromPull(playerConfigAlias, this.onGetMainPoolStorage.invoke());
    }

    private final Set<PoolPlayerControllerInternal> getAcquiredControllers() {
        return (Set) this.acquiredControllers.getValue();
    }

    private final C7704k<PoolPlayerControllerInternal> getFreeControllers() {
        return (C7704k) this.freeControllers.getValue();
    }

    private final boolean getLogPlayerErrors() {
        return ((Boolean) this.logPlayerErrors.getValue()).booleanValue();
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage
    public PoolPlayerControllerInternal getPlayerController(@NotNull PlayerConfigAlias playerConfigAlias, String videoUrl, @NotNull PoolStorageConfig poolStorageConfig) {
        PoolPlayerControllerInternal poolPlayerControllerInternal;
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        Intrinsics.checkNotNullParameter(poolStorageConfig, "poolStorageConfig");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (getAcquiredControllers().size() < 3) {
                poolPlayerControllerInternal = acquireControllerFromPool(playerConfigAlias);
            } else {
                int i11 = WhenMappings.$EnumSwitchMapping$0[poolStorageConfig.ordinal()];
                if (i11 == 1) {
                    poolPlayerControllerInternal = null;
                } else {
                    if (i11 != 2) {
                        throw new o();
                    }
                    poolPlayerControllerInternal = this.poolPlayerFactory.getPlayerControllerOutOfPool(playerConfigAlias, this.onGetMainPoolStorage.invoke());
                }
            }
            reentrantLock.unlock();
            return poolPlayerControllerInternal;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage
    public void returnPlayerToPool(@NotNull PoolPlayerControllerInternal poolPlayerController, @NotNull PlayerConfigAlias playerConfigAlias) {
        Intrinsics.checkNotNullParameter(poolPlayerController, "poolPlayerController");
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (getAcquiredControllers().remove(poolPlayerController)) {
                getFreeControllers().addLast(poolPlayerController);
            } else if (getLogPlayerErrors()) {
                PlayerLogger playerLogger = this.playerLogger;
                String playerUrl = poolPlayerController.getPlayerUrl();
                if (playerUrl == null) {
                    playerUrl = "";
                }
                playerLogger.logNonFatalPlayerError("Unexpected pool return: controller not issued (double-return / alias mismatch)", playerUrl, "", "", "NONE");
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage
    public void stopPreloadedPlayer() {
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage
    public void storePreloadedPlayer(@NotNull String str, @NotNull PoolPlayerControllerInternal poolPlayerControllerInternal, @NotNull PlayerConfigAlias playerConfigAlias) {
        PlayerPoolStorage.DefaultImpls.storePreloadedPlayer(this, str, poolPlayerControllerInternal, playerConfigAlias);
    }
}
