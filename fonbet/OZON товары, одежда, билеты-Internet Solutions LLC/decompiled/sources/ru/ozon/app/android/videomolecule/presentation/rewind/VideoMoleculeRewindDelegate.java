package ru.ozon.app.android.videomolecule.presentation.rewind;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.media3.ui.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.storefront.ui.videomolecule.databinding.VideoMoleculeBinding;
import ru.ozon.app.android.videomolecule.presentation.replay.VideoMoleculeReplayDelegate;
import ru.ozon.app.android.videomolecule.presentation.view.VideoMoleculeView;
import ru.ozon.app.android.videomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar;
import ru.ozon.app.android.videomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rewind/VideoMoleculeRewindDelegate;", "", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeBinding;", "binding", "Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;", "moleculeView", "Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "visibilityDelegate", "Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "playerDelegate", "Lru/ozon/app/android/videomolecule/presentation/replay/VideoMoleculeReplayDelegate;", "replayDelegate", "<init>", "(Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeBinding;Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;Lru/ozon/app/android/videomolecule/presentation/replay/VideoMoleculeReplayDelegate;)V", "", "orientation", "", "onOrientationChange", "(I)V", "", "isInRewind", "()Z", "Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "Lru/ozon/app/android/videomolecule/presentation/replay/VideoMoleculeReplayDelegate;", "currentOrientation", "I", "Lru/ozon/app/android/videomolecule/presentation/rewind/VideoMoleculeOrientatedDelegate;", "activeDelegate", "Lru/ozon/app/android/videomolecule/presentation/rewind/VideoMoleculeOrientatedDelegate;", "Lru/ozon/app/android/videomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;", "videoMoleculeTimeBar", "Lru/ozon/app/android/videomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;", "Lru/ozon/app/android/videomolecule/presentation/rewind/PortraitVideoMoleculeRewindDelegate;", "portraitDelegate", "Lru/ozon/app/android/videomolecule/presentation/rewind/PortraitVideoMoleculeRewindDelegate;", "Lru/ozon/app/android/videomolecule/presentation/rewind/LandscapeVideoMoleculeRewindDelegate;", "landscapeDelegate", "Lru/ozon/app/android/videomolecule/presentation/rewind/LandscapeVideoMoleculeRewindDelegate;", "Landroidx/media3/ui/y$a;", "timeBarListener", "Landroidx/media3/ui/y$a;", "Landroid/os/Handler;", "modeHandler", "Landroid/os/Handler;", "Lru/ozon/app/android/videomolecule/presentation/rewind/VideoMoleculeRewindRunnable;", "scrubStartRunnable", "Lru/ozon/app/android/videomolecule/presentation/rewind/VideoMoleculeRewindRunnable;", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeRewindDelegate {

    @NotNull
    private VideoMoleculeOrientatedDelegate activeDelegate;
    private int currentOrientation;

    @NotNull
    private final LandscapeVideoMoleculeRewindDelegate landscapeDelegate;

    @NotNull
    private final Handler modeHandler;

    @NotNull
    private final VideoMoleculePlayerDelegate playerDelegate;

    @NotNull
    private final PortraitVideoMoleculeRewindDelegate portraitDelegate;

    @NotNull
    private final VideoMoleculeReplayDelegate replayDelegate;

    @NotNull
    private VideoMoleculeRewindRunnable scrubStartRunnable;

    @NotNull
    private final y.a timeBarListener;

    @NotNull
    private final VideoMoleculeTimeBar videoMoleculeTimeBar;

    public VideoMoleculeRewindDelegate(@NotNull VideoMoleculeBinding binding, @NotNull VideoMoleculeView moleculeView, @NotNull VideoMoleculeVisibilityDelegate visibilityDelegate, @NotNull VideoMoleculePlayerDelegate playerDelegate, @NotNull VideoMoleculeReplayDelegate replayDelegate) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(moleculeView, "moleculeView");
        Intrinsics.checkNotNullParameter(visibilityDelegate, "visibilityDelegate");
        Intrinsics.checkNotNullParameter(playerDelegate, "playerDelegate");
        Intrinsics.checkNotNullParameter(replayDelegate, "replayDelegate");
        this.playerDelegate = playerDelegate;
        this.replayDelegate = replayDelegate;
        this.currentOrientation = binding.getConstraintLayout().getContext().getResources().getConfiguration().orientation;
        View findViewById = binding.playerControlsView.findViewById(R.id.exo_progress);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        VideoMoleculeTimeBar videoMoleculeTimeBar = (VideoMoleculeTimeBar) findViewById;
        this.videoMoleculeTimeBar = videoMoleculeTimeBar;
        PortraitVideoMoleculeRewindDelegate portraitVideoMoleculeRewindDelegate = new PortraitVideoMoleculeRewindDelegate(videoMoleculeTimeBar, moleculeView, binding, visibilityDelegate);
        this.portraitDelegate = portraitVideoMoleculeRewindDelegate;
        LandscapeVideoMoleculeRewindDelegate landscapeVideoMoleculeRewindDelegate = new LandscapeVideoMoleculeRewindDelegate(videoMoleculeTimeBar, moleculeView, binding, visibilityDelegate);
        this.landscapeDelegate = landscapeVideoMoleculeRewindDelegate;
        this.modeHandler = new Handler(Looper.getMainLooper());
        if (this.currentOrientation == 1) {
            this.activeDelegate = portraitVideoMoleculeRewindDelegate;
        } else {
            this.activeDelegate = landscapeVideoMoleculeRewindDelegate;
        }
        this.scrubStartRunnable = new VideoMoleculeRewindRunnable() { // from class: ru.ozon.app.android.videomolecule.presentation.rewind.VideoMoleculeRewindDelegate.1
            @Override // java.lang.Runnable
            public void run() {
                VideoMoleculeRewindDelegate.this.activeDelegate.onScrubStart(getPosition());
            }
        };
        y.a aVar = new y.a() { // from class: ru.ozon.app.android.videomolecule.presentation.rewind.VideoMoleculeRewindDelegate.2
            @Override // androidx.media3.ui.y.a
            public void onScrubMove(y timeBar, long position) {
                Intrinsics.checkNotNullParameter(timeBar, "timeBar");
                VideoMoleculeRewindDelegate.this.activeDelegate.onScrubMove(position);
            }

            @Override // androidx.media3.ui.y.a
            public void onScrubStart(y timeBar, long position) {
                Intrinsics.checkNotNullParameter(timeBar, "timeBar");
                VideoMoleculeRewindDelegate.this.replayDelegate.hide();
                VideoMoleculeRewindDelegate.this.playerDelegate.pause();
                VideoMoleculeRewindDelegate.this.scrubStartRunnable.setPosition(position);
                VideoMoleculeRewindDelegate.this.modeHandler.postDelayed(VideoMoleculeRewindDelegate.this.scrubStartRunnable, 150L);
            }

            @Override // androidx.media3.ui.y.a
            public void onScrubStop(y timeBar, long position, boolean canceled) {
                Intrinsics.checkNotNullParameter(timeBar, "timeBar");
                VideoMoleculeRewindDelegate.this.playerDelegate.play();
                VideoMoleculeRewindDelegate.this.modeHandler.removeCallbacks(VideoMoleculeRewindDelegate.this.scrubStartRunnable);
                VideoMoleculeRewindDelegate.this.activeDelegate.onScrubStop(position);
            }
        };
        this.timeBarListener = aVar;
        videoMoleculeTimeBar.addListener(aVar);
    }

    public final boolean isInRewind() {
        return this.activeDelegate.getInRewind();
    }

    public final void onOrientationChange(int orientation) {
        this.currentOrientation = orientation;
        this.portraitDelegate.onOrientationChanged();
        this.landscapeDelegate.onOrientationChanged();
        if (this.currentOrientation == 1) {
            this.activeDelegate = this.portraitDelegate;
        } else {
            this.activeDelegate = this.landscapeDelegate;
        }
    }
}
