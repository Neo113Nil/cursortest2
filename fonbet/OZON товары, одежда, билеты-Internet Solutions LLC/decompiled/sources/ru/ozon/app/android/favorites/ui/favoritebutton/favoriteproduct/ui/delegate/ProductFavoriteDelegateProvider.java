package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate;

import Pc.a;
import WZ.l;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4DelegateImpl;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.FavProductButtonPresenter;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ=\u0010&\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;", "LPc/a;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter;", "favoriteProductButtonPresenter", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavProductButtonV4ViewModel;", "viewModel", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(LPc/a;LPc/a;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "get", "(Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Ll10/i;", "container", "(Ll10/i;)Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "provideV4Delegate", "(Ll10/i;)Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Landroidx/fragment/app/m;", "containerFragment", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "processEvents", "provideMessengerDelegate", "(Landroidx/fragment/app/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "LPc/a;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "Lru/ozon/app/android/utils/AppType;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductFavoriteDelegateProvider implements FavoriteDelegateProvider {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AppType appType;

    @NotNull
    private final a<FavProductButtonPresenter> favoriteProductButtonPresenter;

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;

    @NotNull
    private final a<FavProductButtonV4ViewModel> viewModel;

    public ProductFavoriteDelegateProvider(@NotNull a<FavProductButtonPresenter> favoriteProductButtonPresenter, @NotNull a<FavProductButtonV4ViewModel> viewModel, @NotNull AdultHandler adultHandler, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(favoriteProductButtonPresenter, "favoriteProductButtonPresenter");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.favoriteProductButtonPresenter = favoriteProductButtonPresenter;
        this.viewModel = viewModel;
        this.adultHandler = adultHandler;
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
        this.appType = appType;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteDelegateProvider
    @NotNull
    public FavoriteProductDelegate get(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        FavProductButtonPresenter favProductButtonPresenter = this.favoriteProductButtonPresenter.get();
        Intrinsics.checkNotNullExpressionValue(favProductButtonPresenter, "get(...)");
        return new FavoriteProductDelegateImpl(favProductButtonPresenter, this.adultHandler, refs, this.favoritesComposerActionHandler, this.appType);
    }

    @NotNull
    public final FavoriteProductDelegate provideMessengerDelegate(@NotNull ComponentCallbacksC5392m containerFragment, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super FavoriteProductMolecule, Unit> processEvents) {
        Intrinsics.checkNotNullParameter(containerFragment, "containerFragment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(processEvents, "processEvents");
        AdultHandler adultHandler = this.adultHandler;
        AppType appType = this.appType;
        FavProductButtonPresenter favProductButtonPresenter = this.favoriteProductButtonPresenter.get();
        Intrinsics.checkNotNullExpressionValue(favProductButtonPresenter, "get(...)");
        return new MessengerFavoriteDelegateImpl(containerFragment, favProductButtonPresenter, adultHandler, appType, actionHandler, processEvents);
    }

    @NotNull
    public final FavoriteProductV4Delegate provideV4Delegate(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        FavProductButtonV4ViewModel favProductButtonV4ViewModel = this.viewModel.get();
        Intrinsics.checkNotNullExpressionValue(favProductButtonV4ViewModel, "get(...)");
        return new FavoriteProductV4DelegateImpl(favProductButtonV4ViewModel, this.adultHandler, container, this.favoritesComposerActionHandler);
    }

    @NotNull
    public final FavoriteProductV4Delegate provideV4Delegate(@NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        FavProductButtonV4ViewModel favProductButtonV4ViewModel = this.viewModel.get();
        Intrinsics.checkNotNullExpressionValue(favProductButtonV4ViewModel, "get(...)");
        return new FavoriteProductV4DelegateImpl(favProductButtonV4ViewModel, this.adultHandler, refs, this.favoritesComposerActionHandler, tokenizedAnalytics);
    }

    @NotNull
    public final FavoriteProductDelegate get(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        FavProductButtonPresenter favProductButtonPresenter = this.favoriteProductButtonPresenter.get();
        Intrinsics.checkNotNullExpressionValue(favProductButtonPresenter, "get(...)");
        return new FavoriteProductDelegateImpl(favProductButtonPresenter, this.adultHandler, container, this.favoritesComposerActionHandler, this.appType);
    }
}
