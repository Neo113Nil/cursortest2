package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.image;

import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.BoundedLinkedHashMap;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/image/GalleryV4WaveImageVH;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Image;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/image/GalleryV4WaveImageView;", "waveView", "Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;", "", "", "containerSizeCache", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "", "onItemClick", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/image/GalleryV4WaveImageView;Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;Lkotlin/jvm/functions/Function2;LWZ/l;)V", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Image;)V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/image/GalleryV4WaveImageView;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/image/GalleryV4ImageVH;", "imageViewHolder", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/image/GalleryV4ImageVH;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4WaveImageVH extends GalleryV4ViewHolder<GalleryV4VO.Item.Image> {

    @NotNull
    private final GalleryV4ImageVH imageViewHolder;

    @NotNull
    private final GalleryV4WaveImageView waveView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4WaveImageVH(@NotNull GalleryV4WaveImageView waveView, @NotNull BoundedLinkedHashMap<String, Integer> containerSizeCache, @NotNull Function2<? super AtomAction, ? super GallerySyncModel, Unit> onItemClick, @NotNull l tokenizedAnalytics) {
        super(waveView);
        Intrinsics.checkNotNullParameter(waveView, "waveView");
        Intrinsics.checkNotNullParameter(containerSizeCache, "containerSizeCache");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.waveView = waveView;
        this.imageViewHolder = new GalleryV4ImageVH(waveView.getImageView(), containerSizeCache, new GalleryV4WaveImageVH$imageViewHolder$1(waveView), onItemClick, tokenizedAnalytics);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder
    public void bind(@NotNull GalleryV4VO.Item.Image item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.imageViewHolder.bind(item);
        this.waveView.bind(item.getContainerConfig().getContainerWidth());
    }
}
