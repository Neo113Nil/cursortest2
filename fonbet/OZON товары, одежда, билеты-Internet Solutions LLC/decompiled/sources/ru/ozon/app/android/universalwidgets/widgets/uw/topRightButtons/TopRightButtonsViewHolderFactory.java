package ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons;

import W10.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.storefrontcommonwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.viewHolders.FavoriteMoleculeViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.viewHolders.TopRightButtonsSmallIconButtonViewHolder;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR*\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderFactory;", "", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavDelegateProvider", "<init>", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;)V", "Landroid/content/Context;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "buildMoleculeView", "(Landroid/content/Context;)Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "buildSmallIconButton", "(Landroid/content/Context;)Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;ILru/ozon/app/android/composer/ComposerReferences;)Ljk0/j;", "model", "getViewType", "(Ljava/lang/Object;)I", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "LW10/c;", "getTrackingData", "()LW10/c;", "setTrackingData", "(LW10/c;)V", "Lru/ozon/composer/ui/widget/l;", "widgetViewItem", "Lru/ozon/composer/ui/widget/l;", "getWidgetViewItem", "()Lru/ozon/composer/ui/widget/l;", "setWidgetViewItem", "(Lru/ozon/composer/ui/widget/l;)V", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRightButtonsViewHolderFactory {

    @NotNull
    private final ProductFavoriteDelegateProvider productFavDelegateProvider;
    private c trackingData;
    private l widgetViewItem;
    private static final int dp40 = ResourceExtKt.toPx(40);
    private static final int dp32 = ResourceExtKt.toPx(32);

    public TopRightButtonsViewHolderFactory(@NotNull ProductFavoriteDelegateProvider productFavDelegateProvider) {
        Intrinsics.checkNotNullParameter(productFavDelegateProvider, "productFavDelegateProvider");
        this.productFavDelegateProvider = productFavDelegateProvider;
    }

    private final ProductFavoriteMoleculeButtonView buildMoleculeView(Context context) {
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = new ProductFavoriteMoleculeButtonView(context, null, 0, 6, null);
        productFavoriteMoleculeButtonView.setId(R$id.productFavMoleculeButton);
        productFavoriteMoleculeButtonView.setLayoutParams(new RecyclerView.p(dp40, dp32));
        return productFavoriteMoleculeButtonView;
    }

    private final SmallIconButtonView buildSmallIconButton(Context context) {
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) q.f64554a.g(N.b(SmallIconButtonView.class), context);
        smallIconButtonView.setId(ru.ozon.app.android.storefrontcommonwidgets.R$id.trSmallIconButton);
        smallIconButtonView.setLayoutParams(new RecyclerView.p(dp40, dp32));
        return smallIconButtonView;
    }

    @NotNull
    public final j createViewHolder(@NotNull ViewGroup parent, int viewType, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(references, "references");
        if (viewType == R$layout.product_item_small_icon_atom) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new TopRightButtonsSmallIconButtonViewHolder(buildSmallIconButton(context));
        }
        if (viewType != ru.ozon.app.android.universalwidgets.R$layout.product_item_favorite_molecule) {
            final View view = new View(parent.getContext());
            return new j(view) { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderFactory$createViewHolder$1
            };
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new FavoriteMoleculeViewHolder(buildMoleculeView(context2), this.trackingData, this.widgetViewItem, this.productFavDelegateProvider.get(references));
    }

    public final int getViewType(@NotNull Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof ButtonV3Atom.SmallIconButton) {
            return R$layout.product_item_small_icon_atom;
        }
        if (model instanceof FavoriteProductMolecule) {
            return ru.ozon.app.android.universalwidgets.R$layout.product_item_favorite_molecule;
        }
        return -123;
    }

    public final void setTrackingData(c cVar) {
        this.trackingData = cVar;
    }

    public final void setWidgetViewItem(l lVar) {
        this.widgetViewItem = lVar;
    }
}
