package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001Bo\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nH\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHubImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;", "onSetPlayerListener", "Lkotlin/Function1;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "", "onReleasePlayerListener", "Lkotlin/Function0;", "onGetCurrentPlayerListener", "onSetMute", "", "onCheckLoadErrorFlagChanged", "onDiscardHistoryStats", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "setPlayerListenerOnMediaPrepare", "playerListener", "setMuteOnMediaPrepare", "isMuted", "getCurrentPlayerListener", "checkLoadError", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BaseControllersHubImpl implements BaseControllersHub {

    @NotNull
    private final Function1<Boolean, Unit> onCheckLoadErrorFlagChanged;

    @NotNull
    private final Function0<Unit> onDiscardHistoryStats;

    @NotNull
    private final Function0<PlayerListenersContainer> onGetCurrentPlayerListener;

    @NotNull
    private final Function0<Unit> onReleasePlayerListener;

    @NotNull
    private final Function1<Boolean, Unit> onSetMute;

    @NotNull
    private final Function1<PlayerListenersContainer, Unit> onSetPlayerListener;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseControllersHubImpl(@NotNull Function1<? super PlayerListenersContainer, Unit> onSetPlayerListener, @NotNull Function0<Unit> onReleasePlayerListener, @NotNull Function0<PlayerListenersContainer> onGetCurrentPlayerListener, @NotNull Function1<? super Boolean, Unit> onSetMute, @NotNull Function1<? super Boolean, Unit> onCheckLoadErrorFlagChanged, @NotNull Function0<Unit> onDiscardHistoryStats) {
        Intrinsics.checkNotNullParameter(onSetPlayerListener, "onSetPlayerListener");
        Intrinsics.checkNotNullParameter(onReleasePlayerListener, "onReleasePlayerListener");
        Intrinsics.checkNotNullParameter(onGetCurrentPlayerListener, "onGetCurrentPlayerListener");
        Intrinsics.checkNotNullParameter(onSetMute, "onSetMute");
        Intrinsics.checkNotNullParameter(onCheckLoadErrorFlagChanged, "onCheckLoadErrorFlagChanged");
        Intrinsics.checkNotNullParameter(onDiscardHistoryStats, "onDiscardHistoryStats");
        this.onSetPlayerListener = onSetPlayerListener;
        this.onReleasePlayerListener = onReleasePlayerListener;
        this.onGetCurrentPlayerListener = onGetCurrentPlayerListener;
        this.onSetMute = onSetMute;
        this.onCheckLoadErrorFlagChanged = onCheckLoadErrorFlagChanged;
        this.onDiscardHistoryStats = onDiscardHistoryStats;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHub
    public PlayerListenersContainer getCurrentPlayerListener() {
        return this.onGetCurrentPlayerListener.invoke();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHub
    public void onCheckLoadErrorFlagChanged(boolean checkLoadError) {
        this.onCheckLoadErrorFlagChanged.invoke(Boolean.valueOf(checkLoadError));
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHub
    public void onDiscardHistoryStats() {
        this.onDiscardHistoryStats.invoke();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHub
    public void onReleasePlayerListener() {
        this.onReleasePlayerListener.invoke();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHub
    public void setMuteOnMediaPrepare(boolean isMuted) {
        this.onSetMute.invoke(Boolean.valueOf(isMuted));
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHub
    public void setPlayerListenerOnMediaPrepare(@NotNull PlayerListenersContainer playerListener) {
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        this.onSetPlayerListener.invoke(playerListener);
    }
}
