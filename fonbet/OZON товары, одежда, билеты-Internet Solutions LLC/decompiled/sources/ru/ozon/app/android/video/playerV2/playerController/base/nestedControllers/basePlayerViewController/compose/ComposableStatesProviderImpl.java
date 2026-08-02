package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose;

import A4.c;
import A4.e;
import A4.h;
import A4.j;
import S0.InterfaceC3967k;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineState;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineStateKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/ComposableStatesProviderImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/ComposableStatesProvider;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "LA4/c;", "rememberPlayPauseButtonState", "(LS0/k;I)LA4/c;", "", "keepContentOnReset", "LA4/h;", "rememberPresentationState", "(Ljava/lang/Boolean;LS0/k;I)LA4/h;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "rememberTimelineState", "(LS0/k;I)Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "Landroidx/media3/exoplayer/ExoPlayer;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableStatesProviderImpl implements ComposableStatesProvider {

    @NotNull
    private final ExoPlayer exoPlayer;

    public ComposableStatesProviderImpl(@NotNull ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        this.exoPlayer = exoPlayer;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.ComposableStatesProvider
    @NotNull
    public c rememberPlayPauseButtonState(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(275201421);
        c a11 = e.a(this.exoPlayer, interfaceC3967k);
        interfaceC3967k.k();
        return a11;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.ComposableStatesProvider
    @NotNull
    public h rememberPresentationState(Boolean bool, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-2035564735);
        h a11 = j.a(this.exoPlayer, bool != null ? bool.booleanValue() : false, interfaceC3967k);
        interfaceC3967k.k();
        return a11;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.ComposableStatesProvider
    @NotNull
    public PlayerTimelineState rememberTimelineState(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(443150352);
        PlayerTimelineState rememberPlayerTimelineState = PlayerTimelineStateKt.rememberPlayerTimelineState(this.exoPlayer, interfaceC3967k, 0);
        interfaceC3967k.k();
        return rememberPlayerTimelineState;
    }
}
