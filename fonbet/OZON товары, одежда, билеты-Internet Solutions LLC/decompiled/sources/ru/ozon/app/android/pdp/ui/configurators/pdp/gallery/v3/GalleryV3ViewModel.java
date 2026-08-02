package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.video.VideoPosition;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "", "Lru/ozon/app/android/video/VideoPosition;", "position", "", "setVideoPosition", "(Lru/ozon/app/android/video/VideoPosition;)V", "", "fullScreen", "galleryVideoItemClicked", "(Z)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "item", "", "openGalleryVideoFromPosition", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;JZ)V", "onPauseVideoItem", "()V", "onResumeVideoItem", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "getAction", "()Landroidx/lifecycle/P;", "action", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GalleryV3ViewModel {
    void galleryVideoItemClicked(boolean fullScreen);

    @NotNull
    P<GalleryAction> getAction();

    void onPauseVideoItem();

    void onResumeVideoItem();

    void openGalleryVideoFromPosition(@NotNull GalleryV3VO.Item item, long position, boolean fullScreen);

    void setVideoPosition(@NotNull VideoPosition position);
}
