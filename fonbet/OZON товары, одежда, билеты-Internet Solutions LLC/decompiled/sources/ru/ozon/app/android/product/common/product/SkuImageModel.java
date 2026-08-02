package ru.ozon.app.android.product.common.product;

import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.core.GalleryItem;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/product/common/product/SkuImageModel;", "", "Lru/ozon/app/android/product/common/core/GalleryItem$VideoItem;", "videoItem", "Lru/ozon/app/android/product/common/core/GalleryItem$ImageItem;", "imageItem", "", "hasVideoCover", "", "ratio", "<init>", "(Lru/ozon/app/android/product/common/core/GalleryItem$VideoItem;Lru/ozon/app/android/product/common/core/GalleryItem$ImageItem;ZF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/common/core/GalleryItem$VideoItem;", "getVideoItem", "()Lru/ozon/app/android/product/common/core/GalleryItem$VideoItem;", "Lru/ozon/app/android/product/common/core/GalleryItem$ImageItem;", "getImageItem", "()Lru/ozon/app/android/product/common/core/GalleryItem$ImageItem;", "Z", "getHasVideoCover", "()Z", "F", "getRatio", "()F", "Lru/ozon/app/android/product/common/core/GalleryItem;", "currentItem", "Lru/ozon/app/android/product/common/core/GalleryItem;", "getCurrentItem", "()Lru/ozon/app/android/product/common/core/GalleryItem;", "setCurrentItem", "(Lru/ozon/app/android/product/common/core/GalleryItem;)V", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SkuImageModel {
    private GalleryItem currentItem;
    private final boolean hasVideoCover;
    private final GalleryItem.ImageItem imageItem;
    private final float ratio;
    private final GalleryItem.VideoItem videoItem;

    public SkuImageModel() {
        this(null, null, false, 0.0f, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkuImageModel)) {
            return false;
        }
        SkuImageModel skuImageModel = (SkuImageModel) other;
        return Intrinsics.d(this.videoItem, skuImageModel.videoItem) && Intrinsics.d(this.imageItem, skuImageModel.imageItem) && this.hasVideoCover == skuImageModel.hasVideoCover && Float.compare(this.ratio, skuImageModel.ratio) == 0;
    }

    public final GalleryItem getCurrentItem() {
        return this.currentItem;
    }

    public final boolean getHasVideoCover() {
        return this.hasVideoCover;
    }

    public final GalleryItem.ImageItem getImageItem() {
        return this.imageItem;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final GalleryItem.VideoItem getVideoItem() {
        return this.videoItem;
    }

    public int hashCode() {
        GalleryItem.VideoItem videoItem = this.videoItem;
        int hashCode = (videoItem == null ? 0 : videoItem.hashCode()) * 31;
        GalleryItem.ImageItem imageItem = this.imageItem;
        return Float.hashCode(this.ratio) + C3532b.a((hashCode + (imageItem != null ? imageItem.hashCode() : 0)) * 31, 31, this.hasVideoCover);
    }

    public final void setCurrentItem(GalleryItem galleryItem) {
        this.currentItem = galleryItem;
    }

    @NotNull
    public String toString() {
        return "SkuImageModel(videoItem=" + this.videoItem + ", imageItem=" + this.imageItem + ", hasVideoCover=" + this.hasVideoCover + ", ratio=" + this.ratio + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkuImageModel(GalleryItem.VideoItem videoItem, GalleryItem.ImageItem imageItem, boolean z11, float f7) {
        this.videoItem = videoItem;
        this.imageItem = imageItem;
        this.hasVideoCover = z11;
        this.ratio = f7;
        this.currentItem = videoItem == null ? imageItem : videoItem;
    }

    public /* synthetic */ SkuImageModel(GalleryItem.VideoItem videoItem, GalleryItem.ImageItem imageItem, boolean z11, float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : videoItem, (i11 & 2) != 0 ? null : imageItem, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? 1.0f : f7);
    }
}
