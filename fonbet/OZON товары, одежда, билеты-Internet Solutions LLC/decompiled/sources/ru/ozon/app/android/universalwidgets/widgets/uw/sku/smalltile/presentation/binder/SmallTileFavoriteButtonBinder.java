package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileViewBuilder;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ \u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileFavoriteButtonBinder;", "", "root", "Landroidx/constraintlayout/widget/ConstraintLayout;", "favoriteDelegate", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;)V", "view", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "onAttach", "", "onDetach", "bind", "favoriteProductMolecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "analyticData", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "updateVisibility", "isVisible", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallTileFavoriteButtonBinder {

    @NotNull
    private final FavoriteProductDelegate favoriteDelegate;

    @NotNull
    private final ProductFavoriteMoleculeButtonView view;

    public SmallTileFavoriteButtonBinder(@NotNull ConstraintLayout root, @NotNull FavoriteProductDelegate favoriteDelegate) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(favoriteDelegate, "favoriteDelegate");
        this.favoriteDelegate = favoriteDelegate;
        this.view = SmallTileViewBuilder.INSTANCE.buildFavoriteButton(root);
    }

    public final void bind(FavoriteProductMolecule favoriteProductMolecule, @NotNull AnalyticData analyticData, boolean isAdult) {
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        updateVisibility(!isAdult);
        this.favoriteDelegate.bindFavoriteProductButton(this.view, favoriteProductMolecule, analyticData);
    }

    public final void onAttach() {
        this.favoriteDelegate.attachFavButtonView(this.view);
    }

    public final void onDetach() {
        this.favoriteDelegate.detachFavButtonView();
    }

    public final void updateVisibility(boolean isVisible) {
        this.view.setVisibility(isVisible ? 0 : 8);
    }
}
