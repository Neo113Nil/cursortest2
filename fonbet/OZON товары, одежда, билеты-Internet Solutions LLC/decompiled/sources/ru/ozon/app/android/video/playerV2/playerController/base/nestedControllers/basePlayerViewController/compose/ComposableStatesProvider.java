package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose;

import A4.c;
import A4.h;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineState;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/ComposableStatesProvider;", "", "LA4/c;", "rememberPlayPauseButtonState", "(LS0/k;I)LA4/c;", "", "keepContentOnReset", "LA4/h;", "rememberPresentationState", "(Ljava/lang/Boolean;LS0/k;I)LA4/h;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "rememberTimelineState", "(LS0/k;I)Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ComposableStatesProvider {
    @NotNull
    c rememberPlayPauseButtonState(InterfaceC3967k interfaceC3967k, int i11);

    @NotNull
    h rememberPresentationState(Boolean bool, InterfaceC3967k interfaceC3967k, int i11);

    @NotNull
    PlayerTimelineState rememberTimelineState(InterfaceC3967k interfaceC3967k, int i11);
}
