package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.vhutils;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate.FavoriteToggleProductButtonDelegateProvider;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.toprightbuttons.TopRightButtonCheckBox;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders.TopRightButtonProductFavoriteMoleculeViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders.TopRightCheckBoxViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders.TopRightCheckboxAtomViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders.TopRightFavoriteToggleViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders.TopRightIconButtonViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders.TopRightSmallIconButtonViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.utils.TouchDelegateComposite;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonViewHolderFactory;", "", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;", "productFavMoleculeDelegateProvider", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegateProvider;", "favoriteToggleProductButtonDelegateProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegateProvider;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "touchDelegateComposite", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;ILru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;)Ljk0/j;", "model", "getViewType", "(Ljava/lang/Object;)I", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegateProvider;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "preCreateViewEnabled$delegate", "LSc/j;", "getPreCreateViewEnabled", "()Z", "preCreateViewEnabled", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopRightButtonViewHolderFactory {

    @NotNull
    private final FavoriteToggleProductButtonDelegateProvider favoriteToggleProductButtonDelegateProvider;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: preCreateViewEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j preCreateViewEnabled;

    @NotNull
    private final FavoriteDelegateProvider productFavMoleculeDelegateProvider;

    public TopRightButtonViewHolderFactory(@NotNull FavoriteDelegateProvider productFavMoleculeDelegateProvider, @NotNull FavoriteToggleProductButtonDelegateProvider favoriteToggleProductButtonDelegateProvider, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(productFavMoleculeDelegateProvider, "productFavMoleculeDelegateProvider");
        Intrinsics.checkNotNullParameter(favoriteToggleProductButtonDelegateProvider, "favoriteToggleProductButtonDelegateProvider");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.productFavMoleculeDelegateProvider = productFavMoleculeDelegateProvider;
        this.favoriteToggleProductButtonDelegateProvider = favoriteToggleProductButtonDelegateProvider;
        this.featureChecker = featureChecker;
        this.preCreateViewEnabled = LazyUtilsKt.unsafeLazy(new TopRightButtonViewHolderFactory$preCreateViewEnabled$2(this));
    }

    private final boolean getPreCreateViewEnabled() {
        return ((Boolean) this.preCreateViewEnabled.getValue()).booleanValue();
    }

    @NotNull
    public final j createViewHolder(@NotNull ViewGroup parent, int viewType, @NotNull ComposerReferences composerReferences, TouchDelegateComposite touchDelegateComposite) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        TopRightSmallIconButtonViewHolder.Companion companion = TopRightSmallIconButtonViewHolder.INSTANCE;
        if (viewType == companion.getLAYOUT_ID()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return companion.create(context);
        }
        TopRightButtonProductFavoriteMoleculeViewHolder.Companion companion2 = TopRightButtonProductFavoriteMoleculeViewHolder.INSTANCE;
        if (viewType == companion2.getLAYOUT_ID()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return companion2.create(context2, this.productFavMoleculeDelegateProvider.get(composerReferences), getPreCreateViewEnabled());
        }
        if (viewType == 1111) {
            return TopRightIconButtonViewHolder.INSTANCE.create(parent, touchDelegateComposite);
        }
        if (viewType == 2222) {
            return TopRightFavoriteToggleViewHolder.INSTANCE.create(parent, this.favoriteToggleProductButtonDelegateProvider.get(composerReferences), touchDelegateComposite);
        }
        if (viewType != 3333) {
            final View view = new View(parent.getContext());
            return new j(view) { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.vhutils.TopRightButtonViewHolderFactory$createViewHolder$1
            };
        }
        TopRightCheckboxAtomViewHolder.Companion companion3 = TopRightCheckboxAtomViewHolder.INSTANCE;
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return companion3.create(context3);
    }

    public final int getViewType(@NotNull Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof ButtonV3Atom.SmallIconButton) {
            return TopRightSmallIconButtonViewHolder.INSTANCE.getLAYOUT_ID();
        }
        if (model instanceof FavoriteProductMolecule) {
            return TopRightButtonProductFavoriteMoleculeViewHolder.INSTANCE.getLAYOUT_ID();
        }
        if (model instanceof TopRightButtonCheckBox) {
            return TopRightCheckBoxViewHolder.INSTANCE.getLAYOUT_ID();
        }
        if (model instanceof IconButtonV3DTO) {
            return 1111;
        }
        if (model instanceof FavoriteToggleProductButtonMolecule) {
            return 2222;
        }
        return model instanceof TileGrid2CheckBoxVO ? 3333 : -123;
    }
}
