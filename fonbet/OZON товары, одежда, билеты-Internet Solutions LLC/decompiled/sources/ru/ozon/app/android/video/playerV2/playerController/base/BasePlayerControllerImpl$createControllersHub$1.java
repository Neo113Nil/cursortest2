package ru.ozon.app.android.video.playerV2.playerController.base;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BasePlayerControllerImpl$createControllersHub$1 extends AbstractC7737t implements Function1<PlayerListenersContainer, Unit> {
    final /* synthetic */ BasePlayerControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePlayerControllerImpl$createControllersHub$1(BasePlayerControllerImpl basePlayerControllerImpl) {
        super(1);
        this.this$0 = basePlayerControllerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PlayerListenersContainer playerListenersContainer) {
        invoke2(playerListenersContainer);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PlayerListenersContainer listener) {
        BasePlayerListenersController basePlayerListenersController;
        Intrinsics.checkNotNullParameter(listener, "listener");
        basePlayerListenersController = this.this$0.getBasePlayerListenersController();
        basePlayerListenersController.setPlayerListener(listener);
    }
}
