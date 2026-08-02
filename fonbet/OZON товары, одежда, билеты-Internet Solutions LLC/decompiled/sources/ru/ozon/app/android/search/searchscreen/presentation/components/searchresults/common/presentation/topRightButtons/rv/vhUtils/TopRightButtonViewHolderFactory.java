package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.common.SelectedProcessor;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProcessorProvider;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonCheckBox;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.viewHolders.TopRightButtonProductFavoriteMoleculeViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.viewHolders.TopRightCheckBoxViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.viewHolders.TopRightSmallIconButtonViewHolder;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonViewHolderFactory;", "", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavMoleculeDelegateProvider", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProcessorProvider;", "selectedProcessorProvider", "<init>", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/favorites/common/SelectedProductsManager;Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProcessorProvider;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;ILru/ozon/app/android/composer/ComposerReferences;)Ljk0/j;", "model", "getViewType", "(Ljava/lang/Object;)I", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "selectedProcessor", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopRightButtonViewHolderFactory {

    @NotNull
    private final ProductFavoriteDelegateProvider productFavMoleculeDelegateProvider;

    @NotNull
    private final SelectedProcessor selectedProcessor;
    public static final int $stable = 8;

    public TopRightButtonViewHolderFactory(@NotNull ProductFavoriteDelegateProvider productFavMoleculeDelegateProvider, @NotNull SelectedProductsManager selectedProductsManager, @NotNull SelectedProcessorProvider selectedProcessorProvider) {
        Intrinsics.checkNotNullParameter(productFavMoleculeDelegateProvider, "productFavMoleculeDelegateProvider");
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        Intrinsics.checkNotNullParameter(selectedProcessorProvider, "selectedProcessorProvider");
        this.productFavMoleculeDelegateProvider = productFavMoleculeDelegateProvider;
        this.selectedProcessor = selectedProcessorProvider.get(selectedProductsManager);
    }

    @NotNull
    public final j createViewHolder(@NotNull ViewGroup parent, int viewType, @NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        TopRightSmallIconButtonViewHolder.Companion companion = TopRightSmallIconButtonViewHolder.INSTANCE;
        if (viewType == companion.getLAYOUT_ID()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return companion.create(context);
        }
        TopRightCheckBoxViewHolder.Companion companion2 = TopRightCheckBoxViewHolder.INSTANCE;
        if (viewType == companion2.getLAYOUT_ID()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return companion2.create(context2, this.selectedProcessor, composerReferences);
        }
        TopRightButtonProductFavoriteMoleculeViewHolder.Companion companion3 = TopRightButtonProductFavoriteMoleculeViewHolder.INSTANCE;
        if (viewType != companion3.getLAYOUT_ID()) {
            final View view = new View(parent.getContext());
            return new j(view) { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonViewHolderFactory$createViewHolder$1
            };
        }
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return companion3.create(context3, this.productFavMoleculeDelegateProvider.get(composerReferences));
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
        return -123;
    }
}
