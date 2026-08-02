package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image;

import WZ.l;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ImageVH;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/BaseGalleryV5ImageVH;", "Landroid/widget/ImageView;", "imageView", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "", "onItemClick", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ZoomConfig;", "zoomConfig", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/widget/ImageView;Lkotlin/jvm/functions/Function2;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ZoomConfig;Lru/ozon/app/android/composer/ComposerReferences;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5ImageVH extends BaseGalleryV5ImageVH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5ImageVH(@NotNull ImageView imageView, @NotNull Function2<? super AtomAction, ? super GallerySyncModel, Unit> onItemClick, @NotNull l tokenizedAnalytics, GalleryV5ZoomConfig galleryV5ZoomConfig, @NotNull ComposerReferences refs) {
        super(imageView, imageView, onItemClick, tokenizedAnalytics, galleryV5ZoomConfig, refs);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
    }
}
