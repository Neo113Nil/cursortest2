package ru.ozon.app.android.videomolecule.presentation.viewholder.player;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "", "videoController", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;)V", "get", "Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculePlayerDelegateProvider {

    @NotNull
    private final VideoController videoController;

    public VideoMoleculePlayerDelegateProvider(@NotNull VideoController videoController) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        this.videoController = videoController;
    }

    @NotNull
    public final VideoMoleculePlayerDelegate get() {
        return new VideoMoleculePlayerDelegate(this.videoController);
    }
}
