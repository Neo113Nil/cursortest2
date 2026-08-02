package ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.viewHolders;

import W10.c;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.universalwidgets.databinding.ProductItemFavoriteMoleculeBinding;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0010J*\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R*\u00101\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000e\u0018\u00010+8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/viewHolders/FavoriteMoleculeViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Landroid/view/View;", "containerView", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/l;", "widgetViewItem", "favoriteProductDelegate", "<init>", "(Landroid/view/View;LW10/c;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;)V", "", "onAttach", "()V", "onDetach", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "item", "bind", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "LW10/c;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "", "dp8", "I", "dp4", "Lru/ozon/app/android/universalwidgets/databinding/ProductItemFavoriteMoleculeBinding;", "binding", "Lru/ozon/app/android/universalwidgets/databinding/ProductItemFavoriteMoleculeBinding;", "Lkotlin/Function1;", "", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "onFavoriteClick", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FavoriteMoleculeViewHolder extends j implements FavoriteProductDelegate {

    @NotNull
    private final ProductItemFavoriteMoleculeBinding binding;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final FavoriteProductDelegate favoriteProductDelegate;
    private final c trackingData;
    private final l widgetViewItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteMoleculeViewHolder(@NotNull View containerView, c cVar, l lVar, @NotNull FavoriteProductDelegate favoriteProductDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(favoriteProductDelegate, "favoriteProductDelegate");
        this.trackingData = cVar;
        this.widgetViewItem = lVar;
        this.favoriteProductDelegate = favoriteProductDelegate;
        this.dp8 = ResourceExtKt.toPx(8);
        this.dp4 = ResourceExtKt.toPx(4);
        ProductItemFavoriteMoleculeBinding bind = ProductItemFavoriteMoleculeBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.favoriteProductDelegate.attachFavButtonView(button);
    }

    public final void bind(@NotNull FavoriteProductMolecule item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = this.binding.productFavMoleculeButton;
        Intrinsics.f(productFavoriteMoleculeButtonView);
        bindFavoriteProductButton(productFavoriteMoleculeButtonView, item, new AnalyticData(this.trackingData, this.widgetViewItem));
        SmallIconButtonView favIcon = productFavoriteMoleculeButtonView.getFavIcon();
        int i11 = this.dp8;
        int i12 = this.dp4;
        favIcon.setPadding(i11, i12, i11, i12);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favoriteProductDelegate.bindFavoriteProductButton(button, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        this.favoriteProductDelegate.detachFavButtonView();
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        ProductFavoriteMoleculeButtonView productFavMoleculeButton = this.binding.productFavMoleculeButton;
        Intrinsics.checkNotNullExpressionValue(productFavMoleculeButton, "productFavMoleculeButton");
        attachFavButtonView(productFavMoleculeButton);
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        detachFavButtonView();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.favoriteProductDelegate.setOnFavoriteClick(function1);
    }
}
