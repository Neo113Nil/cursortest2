package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager;

import QD.b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.PdpWidgetProductGalleryV3VideoPreviewItemBinding;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3VideoState;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/VideoPreviewItemViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryItemViewHolder;", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetProductGalleryV3VideoPreviewItemBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "", "onPlayButtonClick", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "onVideoStateChanged", "<init>", "(Lru/ozon/app/android/pdp/databinding/PdpWidgetProductGalleryV3VideoPreviewItemBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;)V", "processBindViewEvent", "bindItem", "processOpenViewEvent", "Lru/ozon/app/android/pdp/databinding/PdpWidgetProductGalleryV3VideoPreviewItemBinding;", "Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoPreviewItemViewHolder extends GalleryItemViewHolder {
    private final /* synthetic */ VideoItemViewHolderAnalyticsDelegateImpl $$delegate_0;

    @NotNull
    private final PdpWidgetProductGalleryV3VideoPreviewItemBinding binding;

    @NotNull
    private final Function1<GalleryV3VO.Item.OzonVideo, Unit> onPlayButtonClick;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoPreviewItemViewHolder(@NotNull PdpWidgetProductGalleryV3VideoPreviewItemBinding binding, @NotNull Function1<? super GalleryV3VO.Item.OzonVideo, Unit> onPlayButtonClick, @NotNull Function1<? super GalleryV3VideoState, Unit> onVideoStateChanged) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onPlayButtonClick, "onPlayButtonClick");
        Intrinsics.checkNotNullParameter(onVideoStateChanged, "onVideoStateChanged");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.$$delegate_0 = new VideoItemViewHolderAnalyticsDelegateImpl(onVideoStateChanged);
        this.binding = binding;
        this.onPlayButtonClick = onPlayButtonClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(VideoPreviewItemViewHolder videoPreviewItemViewHolder, GalleryV3VO.Item.OzonVideo ozonVideo, View view) {
        videoPreviewItemViewHolder.onPlayButtonClick.invoke(ozonVideo);
    }

    public final void bind(@NotNull GalleryV3VO.Item.OzonVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PdpWidgetProductGalleryV3VideoPreviewItemBinding pdpWidgetProductGalleryV3VideoPreviewItemBinding = this.binding;
        if (item.getIsAutoPlay()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ImageView videoPreviewIv = pdpWidgetProductGalleryV3VideoPreviewItemBinding.videoPreviewIv;
        Intrinsics.checkNotNullExpressionValue(videoPreviewIv, "videoPreviewIv");
        ImageViewExtKt.load$default(videoPreviewIv, item.getPreviewImageUrl(), null, null, null, null, false, null, 126, null);
        pdpWidgetProductGalleryV3VideoPreviewItemBinding.playIv.setOnClickListener(new b(0, this, item));
        processBindViewEvent(item);
        processOpenViewEvent(item);
    }

    public void processBindViewEvent(@NotNull GalleryV3VO.Item.OzonVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.$$delegate_0.processBindViewEvent(item);
    }

    public void processOpenViewEvent(@NotNull GalleryV3VO.Item.OzonVideo bindItem) {
        Intrinsics.checkNotNullParameter(bindItem, "bindItem");
        this.$$delegate_0.processOpenViewEvent(bindItem);
    }
}
