package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose;

import Cg0.c;
import Cg0.d;
import S0.InterfaceC3967k;
import S0.Q;
import Sc.InterfaceC4008j;
import androidx.compose.ui.e;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.performance.placeholder.VideoComposablePlaceholderTimeTracker;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;
import ru.ozon.app.android.video.playerV2.utils.VideoModuleExtKt;
import ru.ozon.pikazon.compose.placeholder.a;
import y4.j;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/BasePlayerComposableControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/BasePlayerComposableController;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "LSc/j;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "playbackAnalyticsListenerDelegate", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;", "composablePlaceholderTimeTracker", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;LSc/j;Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;)V", "Landroidx/compose/ui/e;", "modifier", "", "surfaceType", "", "PlayerSurfaceComposable", "(Landroidx/compose/ui/e;ILS0/k;I)V", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/ComposableStatesProvider;", "statesProvider", "()Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/ComposableStatesProvider;", "Landroidx/media3/exoplayer/ExoPlayer;", "LSc/j;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;", "composableStatesProvider$delegate", "getComposableStatesProvider", "composableStatesProvider", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BasePlayerComposableControllerImpl implements BasePlayerComposableController {

    @NotNull
    private final VideoComposablePlaceholderTimeTracker composablePlaceholderTimeTracker;

    /* renamed from: composableStatesProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j composableStatesProvider;

    @NotNull
    private final ExoPlayer exoPlayer;

    @NotNull
    private final InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate;

    public BasePlayerComposableControllerImpl(@NotNull ExoPlayer exoPlayer, @NotNull InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate, @NotNull VideoComposablePlaceholderTimeTracker composablePlaceholderTimeTracker) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(playbackAnalyticsListenerDelegate, "playbackAnalyticsListenerDelegate");
        Intrinsics.checkNotNullParameter(composablePlaceholderTimeTracker, "composablePlaceholderTimeTracker");
        this.exoPlayer = exoPlayer;
        this.playbackAnalyticsListenerDelegate = playbackAnalyticsListenerDelegate;
        this.composablePlaceholderTimeTracker = composablePlaceholderTimeTracker;
        this.composableStatesProvider = VideoModuleExtKt.unsafeLazy(new BasePlayerComposableControllerImpl$composableStatesProvider$2(this));
    }

    private final ComposableStatesProvider getComposableStatesProvider() {
        return (ComposableStatesProvider) this.composableStatesProvider.getValue();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableController
    public void PlayerSurfaceComposable(@NotNull e modifier, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        interfaceC3967k.o(1887916119);
        c cVar = (c) interfaceC3967k.m(d.a());
        M m11 = new M();
        Q.c(Unit.f71690a, new BasePlayerComposableControllerImpl$PlayerSurfaceComposable$1(this, cVar, m11), interfaceC3967k);
        String a11 = cVar.a();
        interfaceC3967k.o(-1122062380);
        boolean F11 = interfaceC3967k.F(this) | interfaceC3967k.F(cVar);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new BasePlayerComposableControllerImpl$PlayerSurfaceComposable$2$1(this, cVar, null);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, a11, (Function2) C11);
        j.b(this.exoPlayer, a.a(modifier, new BasePlayerComposableControllerImpl$PlayerSurfaceComposable$3(m11)), i11, interfaceC3967k, (i12 << 3) & 896);
        interfaceC3967k.k();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableController
    @NotNull
    public ComposableStatesProvider statesProvider() {
        return getComposableStatesProvider();
    }
}
