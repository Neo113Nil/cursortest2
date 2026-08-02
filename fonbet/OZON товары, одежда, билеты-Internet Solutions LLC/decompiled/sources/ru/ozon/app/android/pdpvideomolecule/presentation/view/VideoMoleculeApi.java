package ru.ozon.app.android.pdpvideomolecule.presentation.view;

import androidx.media3.ui.LegacyPlayerControlView;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.utils.PdpVideoMoleculeBinding;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH&J\u001c\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "", "binding", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "getBinding", "()Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "getPlayerControllerView", "Landroidx/media3/ui/LegacyPlayerControlView;", "getPlayerView", "Landroidx/media3/ui/PlayerView;", "setLandscapeTimeGroupWidth", "", "newWidth", "", "setCurrentOrientation", "orientation", "setConfig", "enableRoundCorners", "", "applyResize", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface VideoMoleculeApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static LegacyPlayerControlView getPlayerControllerView(@NotNull VideoMoleculeApi videoMoleculeApi) {
            return videoMoleculeApi.getBinding().getPlayerControlsView();
        }

        @NotNull
        public static PlayerView getPlayerView(@NotNull VideoMoleculeApi videoMoleculeApi) {
            return videoMoleculeApi.getBinding().getVideoMoleculePlayer();
        }

        public static /* synthetic */ void setConfig$default(VideoMoleculeApi videoMoleculeApi, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setConfig");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            if ((i11 & 2) != 0) {
                z12 = false;
            }
            videoMoleculeApi.setConfig(z11, z12);
        }
    }

    @NotNull
    PdpVideoMoleculeBinding getBinding();

    @NotNull
    LegacyPlayerControlView getPlayerControllerView();

    @NotNull
    PlayerView getPlayerView();

    void setConfig(boolean enableRoundCorners, boolean applyResize);

    void setCurrentOrientation(int orientation);

    void setLandscapeTimeGroupWidth(int newWidth);
}
