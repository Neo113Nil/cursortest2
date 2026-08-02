package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/PlayInfo;", "", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "videoMolecule", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getVideoMolecule", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "getPlayerListener", "()Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlayInfo {

    @NotNull
    private final PlayerListenersContainer playerListener;

    @NotNull
    private final VideoMolecule videoMolecule;

    public PlayInfo(@NotNull VideoMolecule videoMolecule, @NotNull PlayerListenersContainer playerListener) {
        Intrinsics.checkNotNullParameter(videoMolecule, "videoMolecule");
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        this.videoMolecule = videoMolecule;
        this.playerListener = playerListener;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayInfo)) {
            return false;
        }
        PlayInfo playInfo = (PlayInfo) other;
        return Intrinsics.d(this.videoMolecule, playInfo.videoMolecule) && Intrinsics.d(this.playerListener, playInfo.playerListener);
    }

    public int hashCode() {
        return this.playerListener.hashCode() + (this.videoMolecule.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PlayInfo(videoMolecule=" + this.videoMolecule + ", playerListener=" + this.playerListener + ")";
    }
}
