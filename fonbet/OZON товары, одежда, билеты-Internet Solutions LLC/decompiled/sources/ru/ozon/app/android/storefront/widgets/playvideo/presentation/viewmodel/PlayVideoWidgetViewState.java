package ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel;

import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.mute.MuteButtonModel;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetViewState;", "", "", "orientation", "", "viewsIsVisible", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/MuteButtonModel;", "muteButtonModel", "<init>", "(IZLru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/MuteButtonModel;)V", "copy", "(IZLru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/MuteButtonModel;)Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetViewState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getOrientation", "Z", "getViewsIsVisible", "()Z", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/MuteButtonModel;", "getMuteButtonModel", "()Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/MuteButtonModel;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayVideoWidgetViewState {

    @NotNull
    private final MuteButtonModel muteButtonModel;
    private final int orientation;
    private final boolean viewsIsVisible;

    public PlayVideoWidgetViewState(int i11, boolean z11, @NotNull MuteButtonModel muteButtonModel) {
        Intrinsics.checkNotNullParameter(muteButtonModel, "muteButtonModel");
        this.orientation = i11;
        this.viewsIsVisible = z11;
        this.muteButtonModel = muteButtonModel;
    }

    public static /* synthetic */ PlayVideoWidgetViewState copy$default(PlayVideoWidgetViewState playVideoWidgetViewState, int i11, boolean z11, MuteButtonModel muteButtonModel, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = playVideoWidgetViewState.orientation;
        }
        if ((i12 & 2) != 0) {
            z11 = playVideoWidgetViewState.viewsIsVisible;
        }
        if ((i12 & 4) != 0) {
            muteButtonModel = playVideoWidgetViewState.muteButtonModel;
        }
        return playVideoWidgetViewState.copy(i11, z11, muteButtonModel);
    }

    @NotNull
    public final PlayVideoWidgetViewState copy(int orientation, boolean viewsIsVisible, @NotNull MuteButtonModel muteButtonModel) {
        Intrinsics.checkNotNullParameter(muteButtonModel, "muteButtonModel");
        return new PlayVideoWidgetViewState(orientation, viewsIsVisible, muteButtonModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayVideoWidgetViewState)) {
            return false;
        }
        PlayVideoWidgetViewState playVideoWidgetViewState = (PlayVideoWidgetViewState) other;
        return this.orientation == playVideoWidgetViewState.orientation && this.viewsIsVisible == playVideoWidgetViewState.viewsIsVisible && Intrinsics.d(this.muteButtonModel, playVideoWidgetViewState.muteButtonModel);
    }

    @NotNull
    public final MuteButtonModel getMuteButtonModel() {
        return this.muteButtonModel;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final boolean getViewsIsVisible() {
        return this.viewsIsVisible;
    }

    public int hashCode() {
        return this.muteButtonModel.hashCode() + C3532b.a(Integer.hashCode(this.orientation) * 31, 31, this.viewsIsVisible);
    }

    @NotNull
    public String toString() {
        return "PlayVideoWidgetViewState(orientation=" + this.orientation + ", viewsIsVisible=" + this.viewsIsVisible + ", muteButtonModel=" + this.muteButtonModel + ")";
    }
}
