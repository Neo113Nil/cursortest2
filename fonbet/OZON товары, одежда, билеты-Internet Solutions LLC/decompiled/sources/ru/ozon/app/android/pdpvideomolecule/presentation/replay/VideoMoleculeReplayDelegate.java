package ru.ozon.app.android.pdpvideomolecule.presentation.replay;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/replay/VideoMoleculeReplayDelegate;", "", "replayView", "Lru/ozon/app/android/pdpvideomolecule/presentation/replay/VideoMoleculeReplayView;", "visibilityDelegate", "Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/presentation/replay/VideoMoleculeReplayView;Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;)V", "show", "", "hide", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoMoleculeReplayDelegate {

    @NotNull
    private final VideoMoleculeReplayView replayView;

    @NotNull
    private final VideoMoleculeVisibilityDelegate visibilityDelegate;

    public VideoMoleculeReplayDelegate(@NotNull VideoMoleculeReplayView replayView, @NotNull VideoMoleculeVisibilityDelegate visibilityDelegate) {
        Intrinsics.checkNotNullParameter(replayView, "replayView");
        Intrinsics.checkNotNullParameter(visibilityDelegate, "visibilityDelegate");
        this.replayView = replayView;
        this.visibilityDelegate = visibilityDelegate;
    }

    public final void hide() {
        if (this.replayView.getVisibility() == 0) {
            this.visibilityDelegate.unlockAutoHide();
            VideoMoleculeVisibilityDelegate.hideImmediately$default(this.visibilityDelegate, false, 1, null);
        }
        ViewExtKt.invisible(this.replayView);
    }

    public final void show() {
        this.visibilityDelegate.lockAutoHide();
        ViewExtKt.show(this.replayView);
        VideoMoleculeVisibilityDelegate.showImmediately$default(this.visibilityDelegate, false, false, 3, null);
        this.visibilityDelegate.clearPendingActions();
    }
}
