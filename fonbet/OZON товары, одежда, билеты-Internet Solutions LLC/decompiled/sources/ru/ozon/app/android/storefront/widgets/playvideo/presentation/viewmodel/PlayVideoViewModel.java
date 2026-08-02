package ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.mute.MuteButtonModel;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoWidgetActions;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.SwitchingImageModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetViewState;", "state", "", "initState", "(Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetViewState;)V", "", "isMuted", "onMuteChanged", "(Z)V", "isVisible", "animated", "visibilityChanged", "(ZZ)V", "", "orientation", "orientationChanged", "(I)V", "hasAudio", "hasAudioChanged", "getState", "()Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetViewState;", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetActions;", "widgetActions", "Landroidx/lifecycle/P;", "getWidgetActions", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "_widgetAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "widgetState", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetViewState;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayVideoViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<PlayVideoWidgetActions> _widgetAction;

    @NotNull
    private final P<PlayVideoWidgetActions> widgetActions;
    private PlayVideoWidgetViewState widgetState;

    public PlayVideoViewModel() {
        SingleLiveEvent<PlayVideoWidgetActions> singleLiveEvent = new SingleLiveEvent<>();
        this._widgetAction = singleLiveEvent;
        this.widgetActions = singleLiveEvent;
    }

    @NotNull
    public final PlayVideoWidgetViewState getState() {
        PlayVideoWidgetViewState playVideoWidgetViewState = this.widgetState;
        if (playVideoWidgetViewState != null) {
            return playVideoWidgetViewState;
        }
        Intrinsics.n("widgetState");
        throw null;
    }

    @NotNull
    public final P<PlayVideoWidgetActions> getWidgetActions() {
        return this.widgetActions;
    }

    public final void hasAudioChanged(boolean hasAudio) {
        PlayVideoWidgetViewState playVideoWidgetViewState = this.widgetState;
        if (playVideoWidgetViewState == null) {
            Intrinsics.n("widgetState");
            throw null;
        }
        this.widgetState = PlayVideoWidgetViewState.copy$default(playVideoWidgetViewState, 0, false, MuteButtonModel.copy$default(playVideoWidgetViewState.getMuteButtonModel(), null, hasAudio, 1, null), 3, null);
        this._widgetAction.setValue(new PlayVideoWidgetActions.HasAudioChanged(hasAudio));
    }

    public final void initState(@NotNull PlayVideoWidgetViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.widgetState = state;
    }

    public final void onMuteChanged(boolean isMuted) {
        PlayVideoWidgetViewState playVideoWidgetViewState = this.widgetState;
        if (playVideoWidgetViewState == null) {
            Intrinsics.n("widgetState");
            throw null;
        }
        this.widgetState = PlayVideoWidgetViewState.copy$default(playVideoWidgetViewState, 0, false, MuteButtonModel.copy$default(playVideoWidgetViewState.getMuteButtonModel(), SwitchingImageModel.copy$default(playVideoWidgetViewState.getMuteButtonModel().getImageModel(), isMuted, 0, 0, null, 14, null), false, 2, null), 3, null);
        this._widgetAction.setValue(new PlayVideoWidgetActions.MuteChanged(isMuted));
    }

    public final void orientationChanged(int orientation) {
        PlayVideoWidgetViewState playVideoWidgetViewState = this.widgetState;
        if (playVideoWidgetViewState == null) {
            Intrinsics.n("widgetState");
            throw null;
        }
        this.widgetState = PlayVideoWidgetViewState.copy$default(playVideoWidgetViewState, orientation, false, null, 6, null);
        this._widgetAction.setValue(new PlayVideoWidgetActions.OrientationChanged(orientation));
    }

    public final void visibilityChanged(boolean isVisible, boolean animated) {
        PlayVideoWidgetViewState playVideoWidgetViewState = this.widgetState;
        if (playVideoWidgetViewState == null) {
            Intrinsics.n("widgetState");
            throw null;
        }
        this.widgetState = PlayVideoWidgetViewState.copy$default(playVideoWidgetViewState, 0, isVisible, null, 5, null);
        this._widgetAction.setValue(new PlayVideoWidgetActions.VisibilityChanged(isVisible, animated));
    }
}
