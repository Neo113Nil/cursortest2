package ru.ozon.app.android.pdpvideomolecule.presentation.rewind;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.ui.LegacyPlayerControlView;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.RewindableView;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.utils.PdpVideoMoleculeBinding;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\fH\u0004¢\u0006\u0004\b\u001a\u0010\u000eJ/\u0010 \u001a\u00020\f2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u0004¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/rewind/VideoMoleculeOrientatedDelegate;", "", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;", "videoMoleculeTimeBar", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;", "rewindContainer", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "moleculeView", "Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "visibilityDelegate", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;)V", "", "showTimeBarContent", "()V", "", "position", "onScrubStart", "(J)V", "onScrubMove", "onScrubStop", "", "inRewind", "()Z", "endPosition", "showContent", "showControls", "", "Landroid/view/View;", "excludedViews", "", "excludedIds", "hideControlPanelContent", "(Ljava/util/Set;Ljava/util/Set;)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;", "getVideoMoleculeTimeBar", "()Lru/ozon/app/android/pdpvideomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;", "getRewindContainer", "()Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "getMoleculeView", "()Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "getVisibilityDelegate", "()Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "binding", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class VideoMoleculeOrientatedDelegate {

    @NotNull
    private final PdpVideoMoleculeBinding binding;

    @NotNull
    private final VideoMoleculeApi moleculeView;

    @NotNull
    private final RewindableView rewindContainer;

    @NotNull
    private final VideoMoleculeTimeBar videoMoleculeTimeBar;

    @NotNull
    private final VideoMoleculeVisibilityDelegate visibilityDelegate;

    public VideoMoleculeOrientatedDelegate(@NotNull VideoMoleculeTimeBar videoMoleculeTimeBar, @NotNull RewindableView rewindContainer, @NotNull VideoMoleculeApi moleculeView, @NotNull VideoMoleculeVisibilityDelegate visibilityDelegate) {
        Intrinsics.checkNotNullParameter(videoMoleculeTimeBar, "videoMoleculeTimeBar");
        Intrinsics.checkNotNullParameter(rewindContainer, "rewindContainer");
        Intrinsics.checkNotNullParameter(moleculeView, "moleculeView");
        Intrinsics.checkNotNullParameter(visibilityDelegate, "visibilityDelegate");
        this.videoMoleculeTimeBar = videoMoleculeTimeBar;
        this.rewindContainer = rewindContainer;
        this.moleculeView = moleculeView;
        this.visibilityDelegate = visibilityDelegate;
        this.binding = moleculeView.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void hideControlPanelContent$default(VideoMoleculeOrientatedDelegate videoMoleculeOrientatedDelegate, Set set, Set set2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideControlPanelContent");
        }
        if ((i11 & 1) != 0) {
            set = M.f71699a;
        }
        if ((i11 & 2) != 0) {
            set2 = M.f71699a;
        }
        videoMoleculeOrientatedDelegate.hideControlPanelContent(set, set2);
    }

    private final void showTimeBarContent() {
        showControls();
        ViewParent parent = this.videoMoleculeTimeBar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            ViewExtKt.show(viewGroup);
            Iterator<View> it = ViewGroupExtKt.children(viewGroup).iterator();
            while (it.hasNext()) {
                ViewExtKt.show(it.next());
            }
        }
    }

    @NotNull
    protected final RewindableView getRewindContainer() {
        return this.rewindContainer;
    }

    @NotNull
    protected final VideoMoleculeTimeBar getVideoMoleculeTimeBar() {
        return this.videoMoleculeTimeBar;
    }

    @NotNull
    protected final VideoMoleculeVisibilityDelegate getVisibilityDelegate() {
        return this.visibilityDelegate;
    }

    protected final void hideControlPanelContent(@NotNull Set<? extends View> excludedViews, @NotNull Set<Integer> excludedIds) {
        Intrinsics.checkNotNullParameter(excludedViews, "excludedViews");
        Intrinsics.checkNotNullParameter(excludedIds, "excludedIds");
        showControls();
        ViewParent parent = this.videoMoleculeTimeBar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            for (View view : ViewGroupExtKt.children(viewGroup)) {
                if (excludedViews.contains(view) || excludedIds.contains(Integer.valueOf(view.getId()))) {
                    ViewExtKt.show(view);
                    view.setAlpha(1.0f);
                } else {
                    ViewExtKt.invisible(view);
                }
            }
        }
    }

    public abstract boolean inRewind();

    public abstract void onScrubMove(long position);

    public abstract void onScrubStart(long position);

    public abstract void onScrubStop(long position);

    protected final void showContent(long endPosition) {
        this.visibilityDelegate.unlockAutoHide();
        VideoMoleculeVisibilityDelegate.showImmediately$default(this.visibilityDelegate, false, true, 1, null);
        showTimeBarContent();
        this.rewindContainer.viewGone();
        if (RewindUtilsKt.getTotalDuration(this.binding.getVideoMoleculePlayer()) > endPosition) {
            ViewExtKt.invisible(this.binding.getReplayContainer());
        }
    }

    protected final void showControls() {
        LegacyPlayerControlView playerControlsView = this.binding.getPlayerControlsView();
        playerControlsView.B();
        playerControlsView.setAlpha(1.0f);
    }
}
