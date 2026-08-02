package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetProductGalleryV2ImageItemBinding;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/PhotoItemViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryItemViewHolder;", "binding", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetProductGalleryV2ImageItemBinding;", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetProductGalleryV2ImageItemBinding;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$Photo;", "position", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoItemViewHolder extends GalleryItemViewHolder {

    @NotNull
    private final PdpWidgetProductGalleryV2ImageItemBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PhotoItemViewHolder(@NotNull PdpWidgetProductGalleryV2ImageItemBinding binding) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    public final void bind(@NotNull GalleryV3VO.Item.Photo item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        PdpWidgetProductGalleryV2ImageItemBinding pdpWidgetProductGalleryV2ImageItemBinding = this.binding;
        ImageView imageIv = pdpWidgetProductGalleryV2ImageItemBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        PhotoItemViewHolderKt.updateLocator(imageIv, position);
        ImageView imageIv2 = pdpWidgetProductGalleryV2ImageItemBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv2, "imageIv");
        ImageViewExtKt.load$default(imageIv2, item.getUrl(), null, null, null, null, false, null, 126, null);
        pdpWidgetProductGalleryV2ImageItemBinding.imageIv.setAlpha(item.getAlpha());
        if (item.getIsBorderless()) {
            ImageView imageIv3 = pdpWidgetProductGalleryV2ImageItemBinding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv3, "imageIv");
            imageIv3.setPadding(0, 0, 0, 0);
        } else {
            ImageView imageIv4 = pdpWidgetProductGalleryV2ImageItemBinding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv4, "imageIv");
            Dimens dimens = Dimens.INSTANCE;
            imageIv4.setPadding(dimens.getDP_24(), dimens.getDP_24(), dimens.getDP_24(), 0);
        }
        View galleryParandjaV = pdpWidgetProductGalleryV2ImageItemBinding.galleryParandjaV;
        Intrinsics.checkNotNullExpressionValue(galleryParandjaV, "galleryParandjaV");
        galleryParandjaV.setVisibility(item.getHasParandja() ? 0 : 8);
    }
}
