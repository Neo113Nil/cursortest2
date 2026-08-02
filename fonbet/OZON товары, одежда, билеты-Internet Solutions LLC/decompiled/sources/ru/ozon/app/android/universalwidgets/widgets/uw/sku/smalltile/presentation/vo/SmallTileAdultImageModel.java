package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage;", "image", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "blurMolecule", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage;", "getImage", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "getBlurMolecule", "()Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SmallTileAdultImageModel {
    private final BlurMoleculeVO blurMolecule;

    @NotNull
    private final SmallTileModelImage image;

    public SmallTileAdultImageModel(@NotNull SmallTileModelImage image, BlurMoleculeVO blurMoleculeVO) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.blurMolecule = blurMoleculeVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmallTileAdultImageModel)) {
            return false;
        }
        SmallTileAdultImageModel smallTileAdultImageModel = (SmallTileAdultImageModel) other;
        return Intrinsics.d(this.image, smallTileAdultImageModel.image) && Intrinsics.d(this.blurMolecule, smallTileAdultImageModel.blurMolecule);
    }

    public final BlurMoleculeVO getBlurMolecule() {
        return this.blurMolecule;
    }

    @NotNull
    public final SmallTileModelImage getImage() {
        return this.image;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        BlurMoleculeVO blurMoleculeVO = this.blurMolecule;
        return hashCode + (blurMoleculeVO == null ? 0 : blurMoleculeVO.hashCode());
    }

    @NotNull
    public String toString() {
        return "SmallTileAdultImageModel(image=" + this.image + ", blurMolecule=" + this.blurMolecule + ")";
    }
}
