package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di;

import EL.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.PlayerShowcasePoolCapacityManager;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.manager.ExoManagerLive;
import ru.ozon.app.android.video.manager.ProgressiveExoManager;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \"2\u00060\u0001j\u0002`\u0002:\u0001\"B\u0015\b\u0002\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi$delegate", "LSc/j;", "getVideoComponentApi", "()Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController$delegate", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/video/manager/ProgressiveExoManager;", "progressiveExoManager$delegate", "getProgressiveExoManager", "()Lru/ozon/app/android/video/manager/ProgressiveExoManager;", "progressiveExoManager", "Lru/ozon/app/android/video/manager/ExoManagerLive;", "exoManagerLive$delegate", "getExoManagerLive", "()Lru/ozon/app/android/video/manager/ExoManagerLive;", "exoManagerLive", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/PlayerShowcasePoolCapacityManager;", "poolCapacityManager$delegate", "getPoolCapacityManager", "()Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/PlayerShowcasePoolCapacityManager;", "poolCapacityManager", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerShowcaseComponent implements InterfaceC6958a {

    /* renamed from: exoManagerLive$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j exoManagerLive;

    /* renamed from: poolCapacityManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j poolCapacityManager;

    /* renamed from: progressiveExoManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j progressiveExoManager;

    /* renamed from: videoComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j videoComponentApi;

    /* renamed from: videoController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j videoController;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PlayerShowcaseComponent getInstance$lambda$0(C7475g c7475g) {
            return new PlayerShowcaseComponent(c7475g, null);
        }

        @NotNull
        public final C7473e<PlayerShowcaseComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(PlayerShowcaseComponent.class), new a(storage, 1));
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlayerShowcaseComponent(C7475g c7475g, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7475g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoComponentApi getVideoComponentApi() {
        return (VideoComponentApi) this.videoComponentApi.getValue();
    }

    @NotNull
    public final ExoManagerLive getExoManagerLive() {
        return (ExoManagerLive) this.exoManagerLive.getValue();
    }

    @NotNull
    public final PlayerShowcasePoolCapacityManager getPoolCapacityManager() {
        return (PlayerShowcasePoolCapacityManager) this.poolCapacityManager.getValue();
    }

    @NotNull
    public final ProgressiveExoManager getProgressiveExoManager() {
        return (ProgressiveExoManager) this.progressiveExoManager.getValue();
    }

    @NotNull
    public final VideoController getVideoController() {
        return (VideoController) this.videoController.getValue();
    }

    private PlayerShowcaseComponent(C7475g c7475g) {
        this.videoComponentApi = k.b(new PlayerShowcaseComponent$videoComponentApi$2(c7475g));
        this.videoController = k.b(new PlayerShowcaseComponent$videoController$2(this));
        this.progressiveExoManager = k.b(new PlayerShowcaseComponent$progressiveExoManager$2(this));
        this.exoManagerLive = k.b(new PlayerShowcaseComponent$exoManagerLive$2(this));
        this.poolCapacityManager = k.b(PlayerShowcaseComponent$poolCapacityManager$2.INSTANCE);
    }
}
