package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.imagePrefetch;

import Sc.o;
import android.content.Context;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/imagePrefetch/GalleryV3ImagePrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;", "<init>", "()V", "displayWidth", "", "displayHeight", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "getUrl", "", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV3ImagePrefetchInfoProvider implements ImagePrefetchInfoProvider<GalleryV3VO> {
    private int displayHeight;
    private int displayWidth;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/imagePrefetch/GalleryV3ImagePrefetchInfoProvider$Companion;", "", "<init>", "()V", "UNDEFINED_DISPLAY_SIZE", "", "DEFAULT_RATIO", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    @NotNull
    public ImageSize getSize(@NotNull GalleryV3VO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.displayWidth == 0) {
            int intValue = ResourceExtKt.getDisplaySizePx(context).e().intValue();
            this.displayWidth = intValue;
            Float ratio = item.getRatio();
            this.displayHeight = intValue * ((int) (ratio != null ? ratio.floatValue() : 1.0f));
        }
        return new ImageSize(this.displayWidth, this.displayHeight);
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull GalleryV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        GalleryV3VO.Item item2 = (GalleryV3VO.Item) C7714v.M(item.getItems());
        if (item2 == null) {
            return null;
        }
        if (item2 instanceof GalleryV3VO.Item.Photo) {
            return ((GalleryV3VO.Item.Photo) item2).getUrl();
        }
        if (item2 instanceof GalleryV3VO.Item.Photo360) {
            return ((GalleryV3VO.Item.Photo360) item2).getCoverImage();
        }
        if (item2 instanceof GalleryV3VO.Item.OzonVideo) {
            return ((GalleryV3VO.Item.OzonVideo) item2).getPreviewImageUrl();
        }
        throw new o();
    }
}
