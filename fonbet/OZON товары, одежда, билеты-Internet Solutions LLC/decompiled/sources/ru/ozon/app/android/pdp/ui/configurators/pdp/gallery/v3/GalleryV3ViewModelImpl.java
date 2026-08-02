package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryAction;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.app.android.video.VideoPosition;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "<init>", "()V", "Lru/ozon/app/android/video/VideoPosition;", "position", "", "setVideoPosition", "(Lru/ozon/app/android/video/VideoPosition;)V", "", "fullScreen", "galleryVideoItemClicked", "(Z)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "item", "", "openGalleryVideoFromPosition", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;JZ)V", "onPauseVideoItem", "onResumeVideoItem", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "action", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV3ViewModelImpl extends w0 implements GalleryV3ViewModel {

    @NotNull
    private final BroadcastSingleLiveEvent<GalleryAction> action = new BroadcastSingleLiveEvent<>();

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel
    public void galleryVideoItemClicked(boolean fullScreen) {
        getAction().setValue(new GalleryAction.VideoItemClicked(fullScreen));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel
    public void onPauseVideoItem() {
        getAction().setValue(GalleryAction.Pause.INSTANCE);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel
    public void onResumeVideoItem() {
        getAction().setValue(GalleryAction.Resume.INSTANCE);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel
    public void openGalleryVideoFromPosition(@NotNull GalleryV3VO.Item item, long position, boolean fullScreen) {
        Intrinsics.checkNotNullParameter(item, "item");
        getAction().setValue(new GalleryAction.OpenGalleyVideoItem(item, position, fullScreen));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel
    public void setVideoPosition(@NotNull VideoPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        getAction().setValue(new GalleryAction.UpdateVideoPosition(position));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel
    @NotNull
    public BroadcastSingleLiveEvent<GalleryAction> getAction() {
        return this.action;
    }
}
