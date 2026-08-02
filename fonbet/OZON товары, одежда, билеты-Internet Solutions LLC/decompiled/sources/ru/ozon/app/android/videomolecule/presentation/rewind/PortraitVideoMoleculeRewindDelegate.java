package ru.ozon.app.android.videomolecule.presentation.rewind;

import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.videomolecule.databinding.VideoMoleculeBinding;
import ru.ozon.app.android.videomolecule.presentation.view.VideoMoleculeRewindView;
import ru.ozon.app.android.videomolecule.presentation.view.VideoMoleculeView;
import ru.ozon.app.android.videomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar;
import ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rewind/PortraitVideoMoleculeRewindDelegate;", "Lru/ozon/app/android/videomolecule/presentation/rewind/VideoMoleculeOrientatedDelegate;", "videoMoleculeTimeBar", "Lru/ozon/app/android/videomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;", "moleculeView", "Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;", "binding", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeBinding;", "visibilityDelegate", "Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "<init>", "(Lru/ozon/app/android/videomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeBinding;Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;)V", "inRewind", "", "onScrubStart", "", "position", "", "onScrubMove", "onScrubStop", "onOrientationChanged", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PortraitVideoMoleculeRewindDelegate extends VideoMoleculeOrientatedDelegate {

    @NotNull
    private final VideoMoleculeBinding binding;
    private boolean inRewind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortraitVideoMoleculeRewindDelegate(@NotNull VideoMoleculeTimeBar videoMoleculeTimeBar, @NotNull VideoMoleculeView moleculeView, @NotNull VideoMoleculeBinding binding, @NotNull VideoMoleculeVisibilityDelegate visibilityDelegate) {
        super(videoMoleculeTimeBar, moleculeView, binding, visibilityDelegate);
        Intrinsics.checkNotNullParameter(videoMoleculeTimeBar, "videoMoleculeTimeBar");
        Intrinsics.checkNotNullParameter(moleculeView, "moleculeView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(visibilityDelegate, "visibilityDelegate");
        this.binding = binding;
    }

    @Override // ru.ozon.app.android.videomolecule.presentation.rewind.VideoMoleculeOrientatedDelegate
    /* renamed from: inRewind, reason: from getter */
    public boolean getInRewind() {
        return this.inRewind;
    }

    public void onOrientationChanged() {
    }

    @Override // ru.ozon.app.android.videomolecule.presentation.rewind.VideoMoleculeOrientatedDelegate
    public void onScrubMove(long position) {
        this.binding.rewindContainer.setRewindTime(position);
    }

    @Override // ru.ozon.app.android.videomolecule.presentation.rewind.VideoMoleculeOrientatedDelegate
    public void onScrubStart(long position) {
        this.inRewind = true;
        getVisibilityDelegate().hideImediatly();
        getVisibilityDelegate().lockAutoHide();
        VideoMoleculeOrientatedDelegate.hideControlPanelContent$default(this, e0.h(getVideoMoleculeTimeBar()), null, 2, null);
        VideoMoleculeRewindView videoMoleculeRewindView = this.binding.rewindContainer;
        Intrinsics.f(videoMoleculeRewindView);
        ViewExtKt.show(videoMoleculeRewindView);
        videoMoleculeRewindView.showTime();
        videoMoleculeRewindView.bindTime(RewindUtilsKt.getTotalDuration(this.binding), position);
    }

    @Override // ru.ozon.app.android.videomolecule.presentation.rewind.VideoMoleculeOrientatedDelegate
    public void onScrubStop(long position) {
        this.inRewind = false;
        showContent(position);
    }
}
