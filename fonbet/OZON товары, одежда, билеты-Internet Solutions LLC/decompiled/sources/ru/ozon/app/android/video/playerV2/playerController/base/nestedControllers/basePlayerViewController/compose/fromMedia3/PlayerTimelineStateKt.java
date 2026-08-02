package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import S0.InterfaceC3967k;
import S0.Q;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/media3/exoplayer/ExoPlayer;", "player", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "rememberPlayerTimelineState", "(Landroidx/media3/exoplayer/ExoPlayer;LS0/k;I)Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayerTimelineStateKt {
    @NotNull
    public static final PlayerTimelineState rememberPlayerTimelineState(@NotNull ExoPlayer player, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(player, "player");
        interfaceC3967k.o(-48536472);
        interfaceC3967k.o(210473089);
        boolean n11 = interfaceC3967k.n(player);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new PlayerTimelineState(player);
            interfaceC3967k.x(C11);
        }
        PlayerTimelineState playerTimelineState = (PlayerTimelineState) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(210475574);
        boolean F11 = interfaceC3967k.F(player) | interfaceC3967k.n(playerTimelineState);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new PlayerTimelineStateKt$rememberPlayerTimelineState$1$1(player, playerTimelineState, null);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, player, (Function2) C12);
        interfaceC3967k.k();
        return playerTimelineState;
    }
}
