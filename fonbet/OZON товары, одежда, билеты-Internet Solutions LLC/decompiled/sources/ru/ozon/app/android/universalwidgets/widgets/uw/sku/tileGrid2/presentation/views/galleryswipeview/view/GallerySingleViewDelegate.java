package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view;

import Sc.InterfaceC4008j;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegateKt;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.AdultImagesModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImageSizeCalculator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.builder.GallerySwipeViewBuilder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder.TileGrid2ImageBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.image.TileGrid2AdultImageView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104¨\u00067"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySingleViewDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "", "preCreateViewEnabled", "isGalleryOverdrawEnabled", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;ZZ)V", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "blurMolecule", "", "bindBlurMolecule", "(Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;", "imageItem", "bindImage", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;", "model", "adultConfirmed", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;ZLru/ozon/app/android/product/common/TileThemeConfigVO;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "bindRatio", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;)V", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "blurMoleculeDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "imageCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "imageSizeCalculator", "init", "(Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;)V", "Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/TileGrid2AdultImageView;", "gallerySingleView", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/TileGrid2AdultImageView;", "LSc/j;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "blurMoleculeView", "LSc/j;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/holder/TileGrid2ImageBinder;", "imageBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/holder/TileGrid2ImageBinder;", "", "containerId", "I", "getContainerId", "()I", "bottomViewId", "getBottomViewId", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GallerySingleViewDelegate extends GalleryBaseViewDelegate {
    private BlurMoleculeDelegate blurMoleculeDelegate;

    @NotNull
    private final InterfaceC4008j<BlurMoleculeView> blurMoleculeView;
    private final int bottomViewId;
    private final int containerId;

    @NotNull
    private final TileGrid2AdultImageView gallerySingleView;
    private TileGrid2ImageBinder imageBinder;
    private final boolean isGalleryOverdrawEnabled;

    public GallerySingleViewDelegate(@NotNull ConstraintLayout root, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.isGalleryOverdrawEnabled = z12;
        TileGrid2AdultImageView appendSingleItemView = GallerySwipeViewBuilder.INSTANCE.appendSingleItemView(root, z11);
        appendSingleItemView.setOutlineProvider(getGalleryOutlineProvider());
        appendSingleItemView.setClipToOutline(true);
        this.gallerySingleView = appendSingleItemView;
        this.blurMoleculeView = LazyUtilsKt.unsafeLazy(new GallerySingleViewDelegate$blurMoleculeView$1(root, this));
        this.containerId = appendSingleItemView.getId();
        this.bottomViewId = appendSingleItemView.getId();
    }

    private final void bindBlurMolecule(BlurMoleculeVO blurMolecule) {
        BlurMoleculeDelegate blurMoleculeDelegate = this.blurMoleculeDelegate;
        if (blurMoleculeDelegate != null) {
            BlurMoleculeDelegate.bind$default(blurMoleculeDelegate, this.blurMoleculeView.getValue(), blurMolecule, null, 4, null);
        }
    }

    private final void bindImage(TileGrid2GalleryModel.GalleryItem imageItem) {
        TileGrid2GalleryModel.Image image;
        TileGrid2ImageBinder tileGrid2ImageBinder;
        if (imageItem == null || (image = imageItem.getImage()) == null || (tileGrid2ImageBinder = this.imageBinder) == null) {
            return;
        }
        tileGrid2ImageBinder.bind(image);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    public void bind(@NotNull AdultImagesModel model, boolean adultConfirmed, @NotNull TileThemeConfigVO theme) {
        AdultImagesModel adultImagesModel;
        BlurMoleculeVO blurMolecule;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(theme, "theme");
        TileGrid2GalleryModel localModel = getLocalModel();
        TileGrid2GalleryModel tileGrid2GalleryModel = null;
        if (Intrinsics.d(localModel != null ? localModel.getAdultImagesModel() : null, model)) {
            adultImagesModel = model;
        } else {
            TileGrid2GalleryModel localModel2 = getLocalModel();
            if (localModel2 != null) {
                adultImagesModel = model;
                tileGrid2GalleryModel = TileGrid2GalleryModel.copy$default(localModel2, adultImagesModel, null, 0.0f, 6, null);
            } else {
                adultImagesModel = model;
            }
            setLocalModel(tileGrid2GalleryModel);
        }
        boolean isEmpty = adultImagesModel.getImageItems().isEmpty();
        if (!isEmpty && !this.blurMoleculeView.isInitialized() && (blurMolecule = adultImagesModel.getBlurMolecule()) != null && BlurMoleculeDelegateKt.needShowBlur(blurMolecule, adultConfirmed)) {
            bindBlurMolecule(adultImagesModel.getBlurMolecule());
        } else if (!isEmpty && this.blurMoleculeView.isInitialized()) {
            bindBlurMolecule(adultImagesModel.getBlurMolecule());
            bindImage((TileGrid2GalleryModel.GalleryItem) C7714v.M(adultImagesModel.getImageItems()));
        } else if (!isEmpty) {
            bindImage((TileGrid2GalleryModel.GalleryItem) C7714v.M(adultImagesModel.getImageItems()));
        }
        this.gallerySingleView.setVisibility(!isEmpty ? 0 : 8);
        setGalleryRadius(theme.getContainerCornerRadius());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    public void bindRatio(@NotNull TileGrid2GalleryModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getAdultImagesModel().getImageItems().isEmpty()) {
            ViewExtKt.gone(this.gallerySingleView);
            return;
        }
        ViewExtKt.show(this.gallerySingleView);
        ViewGroup.LayoutParams layoutParams = this.gallerySingleView.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null || Intrinsics.d(bVar.f41600G, model.getRatio())) {
            return;
        }
        bVar.f41600G = model.getRatio();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    public int getBottomViewId() {
        return this.bottomViewId;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate
    public int getContainerId() {
        return this.containerId;
    }

    public final void init(@NotNull BlurMoleculeDelegate blurMoleculeDelegate, @NotNull TileGrid2ImageCache imageCache, TileGrid2ImageSizeCalculator imageSizeCalculator) {
        Intrinsics.checkNotNullParameter(blurMoleculeDelegate, "blurMoleculeDelegate");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.blurMoleculeDelegate = blurMoleculeDelegate;
        this.imageBinder = new TileGrid2ImageBinder(this.gallerySingleView.getImageIv(), imageCache, this.isGalleryOverdrawEnabled, imageSizeCalculator);
    }
}
