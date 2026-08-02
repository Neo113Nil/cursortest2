package ru.ozon.app.android.pdpvideomolecule.presentation.rewind;

import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.RewindableView;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.utils.PdpVideoMoleculeBinding;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/rewind/PortraitVideoMoleculeRewindDelegate;", "Lru/ozon/app/android/pdpvideomolecule/presentation/rewind/VideoMoleculeOrientatedDelegate;", "videoMoleculeTimeBar", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;", "rewindContainer", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;", "moleculeView", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "visibilityDelegate", "Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;)V", "binding", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "inRewind", "", "onScrubStart", "", "position", "", "onScrubMove", "onScrubStop", "onOrientationChanged", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PortraitVideoMoleculeRewindDelegate extends VideoMoleculeOrientatedDelegate {

    @NotNull
    private final PdpVideoMoleculeBinding binding;
    private boolean inRewind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortraitVideoMoleculeRewindDelegate(@NotNull VideoMoleculeTimeBar videoMoleculeTimeBar, @NotNull RewindableView rewindContainer, @NotNull VideoMoleculeApi moleculeView, @NotNull VideoMoleculeVisibilityDelegate visibilityDelegate) {
        super(videoMoleculeTimeBar, rewindContainer, moleculeView, visibilityDelegate);
        Intrinsics.checkNotNullParameter(videoMoleculeTimeBar, "videoMoleculeTimeBar");
        Intrinsics.checkNotNullParameter(rewindContainer, "rewindContainer");
        Intrinsics.checkNotNullParameter(moleculeView, "moleculeView");
        Intrinsics.checkNotNullParameter(visibilityDelegate, "visibilityDelegate");
        this.binding = moleculeView.getBinding();
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.rewind.VideoMoleculeOrientatedDelegate
    /* renamed from: inRewind, reason: from getter */
    public boolean getInRewind() {
        return this.inRewind;
    }

    public void onOrientationChanged() {
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.rewind.VideoMoleculeOrientatedDelegate
    public void onScrubMove(long position) {
        getRewindContainer().setRewindTime(position);
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.rewind.VideoMoleculeOrientatedDelegate
    public void onScrubStart(long position) {
        this.inRewind = true;
        getVisibilityDelegate().hideImmediately(true);
        getVisibilityDelegate().lockAutoHide();
        VideoMoleculeOrientatedDelegate.hideControlPanelContent$default(this, e0.h(getVideoMoleculeTimeBar()), null, 2, null);
        getRewindContainer().viewShow();
        getRewindContainer().showTime();
        getRewindContainer().bindTime(RewindUtilsKt.getTotalDuration(this.binding.getVideoMoleculePlayer()), position);
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.rewind.VideoMoleculeOrientatedDelegate
    public void onScrubStop(long position) {
        this.inRewind = false;
        showContent(position);
    }
}
