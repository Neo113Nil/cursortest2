package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegateKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogoView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoDelegate;", "", "binding", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "brandLogoCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache;", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "brandLogoView", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogo;", "root", "Landroid/view/ViewGroup;", "getRoot", "()Landroid/view/ViewGroup;", "bind", "", "item", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "getOrCreateLogoView", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BrandLogoDelegate {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final TileGrid2BaseViewBinding binding;

    @NotNull
    private final BrandLogoTransformedBitmapCache brandLogoCache;
    private BrandLogo brandLogoView;

    public BrandLogoDelegate(@NotNull TileGrid2BaseViewBinding binding, @NotNull BrandLogoTransformedBitmapCache brandLogoCache, @NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(brandLogoCache, "brandLogoCache");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.binding = binding;
        this.brandLogoCache = brandLogoCache;
        this.adultHandler = adultHandler;
    }

    private final BrandLogo getOrCreateLogoView() {
        BrandLogo brandLogo = this.brandLogoView;
        if (brandLogo != null) {
            return brandLogo;
        }
        BrandLogoView.Companion companion = BrandLogoView.INSTANCE;
        Context context = getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BrandLogoView create = companion.create(context, this.brandLogoCache);
        this.brandLogoView = create;
        return create;
    }

    private final ViewGroup getRoot() {
        return this.binding.getRoot();
    }

    public final void bind(@NotNull TileGrid2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean needShowBlur = BlurMoleculeDelegateKt.needShowBlur(item.getGalleryModel().getAdultImagesModel().getBlurMolecule(), this.adultHandler.isUserAnAdult());
        String brandLogo = item.getBrandLogo();
        if (brandLogo == null || h.K(brandLogo) || needShowBlur) {
            BrandLogo brandLogo2 = this.brandLogoView;
            if (brandLogo2 != null) {
                brandLogo2.hide();
                return;
            }
            return;
        }
        if (this.brandLogoView == null) {
            ViewGroup root = getRoot();
            Object orCreateLogoView = getOrCreateLogoView();
            View view = orCreateLogoView instanceof View ? (View) orCreateLogoView : null;
            if (view == null) {
                return;
            } else {
                root.addView(view);
            }
        }
        BrandLogo brandLogo3 = this.brandLogoView;
        if (brandLogo3 != null) {
            brandLogo3.bind(item.getBrandLogo());
        }
    }
}
