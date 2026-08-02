package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image;

import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5WaveImageVH;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/BaseGalleryV5ImageVH;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5WaveImageView;", "waveView", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "", "onItemClick", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ZoomConfig;", "zoomConfig", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5WaveImageView;Lkotlin/jvm/functions/Function2;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ZoomConfig;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Image;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Image;)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5WaveImageView;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ZoomConfig;", "Lkotlin/Function1;", "", "onWidthUpdate", "Lkotlin/jvm/functions/Function1;", "getOnWidthUpdate", "()Lkotlin/jvm/functions/Function1;", "", "getOnGalleryElementsVisible", "onGalleryElementsVisible", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5WaveImageVH extends BaseGalleryV5ImageVH {

    @NotNull
    private final Function1<Integer, Unit> onWidthUpdate;

    @NotNull
    private final GalleryV5WaveImageView waveView;
    private final GalleryV5ZoomConfig zoomConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5WaveImageVH(@NotNull GalleryV5WaveImageView waveView, @NotNull Function2<? super AtomAction, ? super GallerySyncModel, Unit> onItemClick, @NotNull l tokenizedAnalytics, GalleryV5ZoomConfig galleryV5ZoomConfig, @NotNull ComposerReferences refs) {
        super(waveView, waveView.getImageView(), onItemClick, tokenizedAnalytics, galleryV5ZoomConfig, refs);
        Intrinsics.checkNotNullParameter(waveView, "waveView");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.waveView = waveView;
        this.zoomConfig = galleryV5ZoomConfig;
        this.onWidthUpdate = new GalleryV5WaveImageVH$onWidthUpdate$1(this);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.BaseGalleryV5ImageVH
    @NotNull
    protected Function1<Boolean, Unit> getOnGalleryElementsVisible() {
        return new GalleryV5WaveImageVH$onGalleryElementsVisible$1(this);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.BaseGalleryV5ImageVH
    @NotNull
    protected Function1<Integer, Unit> getOnWidthUpdate() {
        return this.onWidthUpdate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.BaseGalleryV5ImageVH, ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5ViewHolder
    public void bind(@NotNull GalleryV5VO.Item.Image item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        this.waveView.bind(Integer.valueOf(item.getContainerConfig().getContainerWidth()));
    }
}
