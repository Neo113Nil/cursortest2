package ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data;

import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;", "", "", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;", "imageItems", "", "isPagerIndicatorHidden", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "blurMolecule", "<init>", "(Ljava/util/List;ZLru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getImageItems", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "getBlurMolecule", "()Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdultImagesModel {
    private final BlurMoleculeVO blurMolecule;

    @NotNull
    private final List<TileGrid2GalleryModel.GalleryItem> imageItems;
    private final boolean isPagerIndicatorHidden;

    /* JADX WARN: Multi-variable type inference failed */
    public AdultImagesModel(@NotNull List<? extends TileGrid2GalleryModel.GalleryItem> imageItems, boolean z11, BlurMoleculeVO blurMoleculeVO) {
        Intrinsics.checkNotNullParameter(imageItems, "imageItems");
        this.imageItems = imageItems;
        this.isPagerIndicatorHidden = z11;
        this.blurMolecule = blurMoleculeVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdultImagesModel)) {
            return false;
        }
        AdultImagesModel adultImagesModel = (AdultImagesModel) other;
        return Intrinsics.d(this.imageItems, adultImagesModel.imageItems) && this.isPagerIndicatorHidden == adultImagesModel.isPagerIndicatorHidden && Intrinsics.d(this.blurMolecule, adultImagesModel.blurMolecule);
    }

    public final BlurMoleculeVO getBlurMolecule() {
        return this.blurMolecule;
    }

    @NotNull
    public final List<TileGrid2GalleryModel.GalleryItem> getImageItems() {
        return this.imageItems;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.imageItems.hashCode() * 31, 31, this.isPagerIndicatorHidden);
        BlurMoleculeVO blurMoleculeVO = this.blurMolecule;
        return a11 + (blurMoleculeVO == null ? 0 : blurMoleculeVO.hashCode());
    }

    /* renamed from: isPagerIndicatorHidden, reason: from getter */
    public final boolean getIsPagerIndicatorHidden() {
        return this.isPagerIndicatorHidden;
    }

    @NotNull
    public String toString() {
        return "AdultImagesModel(imageItems=" + this.imageItems + ", isPagerIndicatorHidden=" + this.isPagerIndicatorHidden + ", blurMolecule=" + this.blurMolecule + ")";
    }
}
