package ru.ozon.app.android.storefront.widgets.playvideo.presentation.mute;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoWidgetViewState;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.SwitchingImageModel;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\n*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/PlayVideoMuteButtonDelegate;", "", "muteButtonContainer", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/MuteButtonView;", "<init>", "(Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/MuteButtonView;)V", "muteModel", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/MuteButtonModel;", "getInitedModel", "setOnMuteListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "onModelStateChanged", "widgetState", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetViewState;", "render", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayVideoMuteButtonDelegate {

    @NotNull
    private final MuteButtonView muteButtonContainer;

    @NotNull
    private MuteButtonModel muteModel;

    public PlayVideoMuteButtonDelegate(@NotNull MuteButtonView muteButtonContainer) {
        Intrinsics.checkNotNullParameter(muteButtonContainer, "muteButtonContainer");
        this.muteButtonContainer = muteButtonContainer;
        this.muteModel = new MuteButtonModel(new SwitchingImageModel(false, R$drawable.ic_l_volume_no_compact, R$drawable.ic_l_volume_compact, null, 8, null), false);
        ViewExtKt.gone(muteButtonContainer);
    }

    private final void render(MuteButtonModel muteButtonModel, PlayVideoWidgetViewState playVideoWidgetViewState) {
        this.muteButtonContainer.bindOrGone(muteButtonModel.getImageModel());
        if (playVideoWidgetViewState.getViewsIsVisible() && muteButtonModel.getHasAudio() && playVideoWidgetViewState.getOrientation() != 2) {
            ViewExtKt.show(this.muteButtonContainer);
        } else {
            ViewExtKt.gone(this.muteButtonContainer);
        }
    }

    @NotNull
    /* renamed from: getInitedModel, reason: from getter */
    public final MuteButtonModel getMuteModel() {
        return this.muteModel;
    }

    public final void onModelStateChanged(@NotNull PlayVideoWidgetViewState widgetState) {
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        MuteButtonModel muteButtonModel = widgetState.getMuteButtonModel();
        this.muteModel = muteButtonModel;
        render(muteButtonModel, widgetState);
    }

    public final void setOnMuteListener(Function1<? super Boolean, Unit> listener) {
        this.muteButtonContainer.setListener(listener);
    }
}
