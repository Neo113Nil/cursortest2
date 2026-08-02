package ru.ozon.app.android.favorites.shoppinglistv2.presentation.item;

import Dc0.m;
import GZ.g;
import T00.a;
import a00.C4911f;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.vectordrawable.graphics.drawable.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.feature.databinding.WidgetShoppingListsListItemBinding;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.ComparisonActionSheetHandler;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler;
import ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B{\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010*J\u000f\u0010.\u001a\u00020&H\u0016¢\u0006\u0004\b.\u0010*J#\u00102\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00022\n\u00101\u001a\u00060/j\u0002`0H\u0014¢\u0006\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0018\u0010C\u001a\u00060Aj\u0002`B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010KR\u001e\u00101\u001a\n\u0018\u00010/j\u0004\u0018\u0001`08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010LR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010M¨\u0006N"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;", "sharedSellerViewModel", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favoritesListsInteractor", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "createFavoritesListDelegate", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "shoppingListsViewModel", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;LGZ/g;Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;)V", "item", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "", "bindOptionButton", "(Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemVO;Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "recreateActionHandler", "()V", "setupPinIcon", "(Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemVO;)V", "onAttach", "onDetach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;", "Lru/ozon/app/android/favorites/feature/databinding/WidgetShoppingListsListItemBinding;", "binding", "Lru/ozon/app/android/favorites/feature/databinding/WidgetShoppingListsListItemBinding;", "", "cornersRadius", "I", "optionsButtonPadding", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "La00/f;", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/FavoritesListAtomActionSheetHandler;", "favoritesListsActionHandler", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/FavoritesListAtomActionSheetHandler;", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/ComparisonActionSheetHandler;", "comparisonActionSheetHandler", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/ComparisonActionSheetHandler;", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemVO;", "Ll20/d;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShoppingListsV2ItemViewHolder extends k<ShoppingListsV2ItemVO> {
    private DisposableActionHandler actionHandler;

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final WidgetShoppingListsListItemBinding binding;

    @NotNull
    private final ComparisonActionSheetHandler comparisonActionSheetHandler;

    @NotNull
    private final View containerView;
    private final int cornersRadius;

    @NotNull
    private final FavoritesListAtomActionSheetHandler favoritesListsActionHandler;
    private d info;
    private ShoppingListsV2ItemVO item;
    private final int optionsButtonPadding;

    @NotNull
    private final C4911f ownerContainer;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final SharedSellerViewModel sharedSellerViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListsV2ItemViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull SharedSellerViewModel sharedSellerViewModel, @NotNull JsonParser jsonDeserializer, @NotNull FavoritesListsInteractor favoritesListsInteractor, @NotNull FavoritesListsEventsManager favoritesListsEventsManager, @NotNull CreateFavoritesListDelegate createFavoritesListDelegate, @NotNull ShoppingListsViewModel shoppingListsViewModel, @NotNull CartService cartService, @NotNull AdultHandler adultHandler, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull g ozonRouter, @NotNull FavoriteEntityInteractor favoriteEntityInteractor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(sharedSellerViewModel, "sharedSellerViewModel");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(favoritesListsInteractor, "favoritesListsInteractor");
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        Intrinsics.checkNotNullParameter(createFavoritesListDelegate, "createFavoritesListDelegate");
        Intrinsics.checkNotNullParameter(shoppingListsViewModel, "shoppingListsViewModel");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(favoriteEntityInteractor, "favoriteEntityInteractor");
        this.containerView = containerView;
        this.references = references;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.sharedSellerViewModel = sharedSellerViewModel;
        WidgetShoppingListsListItemBinding bind = WidgetShoppingListsListItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.cornersRadius = getContext().getResources().getDimensionPixelOffset(R$dimen.default_radius);
        this.optionsButtonPadding = ResourceExtKt.toPx(4);
        this.ownerContainer = references.getContainer();
        this.favoritesListsActionHandler = new FavoritesListAtomActionSheetHandler(ozonRouter, jsonDeserializer, favoritesListsInteractor, shoppingListsViewModel, cartService, favoritesListsEventsManager, references, createFavoritesListDelegate, adultHandler, sellerFavoriteService, favoriteEntityInteractor, null, false, null, 14336, null);
        this.comparisonActionSheetHandler = new ComparisonActionSheetHandler(references);
        containerView.setOnClickListener(new m(this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ShoppingListsV2ItemViewHolder shoppingListsV2ItemViewHolder, View view) {
        DisposableActionHandler disposableActionHandler;
        Function1<AtomAction, Unit> handler;
        ComponentCallbacksC5392m c11 = shoppingListsV2ItemViewHolder.ownerContainer.c();
        if ((c11 instanceof ComposerFragment) && ((ComposerFragment) c11).getDisplayMode() == ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL) {
            shoppingListsV2ItemViewHolder.references.getNavigator().popBackStack();
        }
        ShoppingListsV2ItemVO shoppingListsV2ItemVO = shoppingListsV2ItemViewHolder.item;
        if (shoppingListsV2ItemVO == null || (disposableActionHandler = shoppingListsV2ItemViewHolder.actionHandler) == null || (handler = disposableActionHandler.getHandler()) == null) {
            return;
        }
        handler.invoke(shoppingListsV2ItemVO.getAction());
    }

    private final void bindOptionButton(ShoppingListsV2ItemVO item, DisposableActionHandler actionHandler) {
        if (item.getOptionsButton() == null) {
            SmallIconButtonView optionsButtonHolder = this.binding.optionsButtonHolder;
            Intrinsics.checkNotNullExpressionValue(optionsButtonHolder, "optionsButtonHolder");
            ViewExtKt.gone(optionsButtonHolder);
            return;
        }
        SmallIconButtonView optionsButtonHolder2 = this.binding.optionsButtonHolder;
        Intrinsics.checkNotNullExpressionValue(optionsButtonHolder2, "optionsButtonHolder");
        ViewExtKt.show(optionsButtonHolder2);
        SmallIconButtonView optionsButtonHolder3 = this.binding.optionsButtonHolder;
        Intrinsics.checkNotNullExpressionValue(optionsButtonHolder3, "optionsButtonHolder");
        WrappedIconButtonHolderKt.bindWithNewHolder(optionsButtonHolder3, item.getOptionsButton(), actionHandler.getHandler());
        SmallIconButtonView optionsButtonHolder4 = this.binding.optionsButtonHolder;
        Intrinsics.checkNotNullExpressionValue(optionsButtonHolder4, "optionsButtonHolder");
        int i11 = this.optionsButtonPadding;
        ViewExtKt.updatePadding(optionsButtonHolder4, i11, i11, i11, i11);
    }

    private final void recreateActionHandler() {
        a b11;
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
        ActionHandler.Builder builder = new ActionHandler.Builder(this.references, this);
        d dVar = this.info;
        ActionHandler.Builder onPreProcess = builder.setCurrentPageUrl((dVar == null || (b11 = dVar.b()) == null) ? null : b11.c()).onPreProcess(new ShoppingListsV2ItemViewHolder$recreateActionHandler$1(this));
        ShoppingListsV2ItemVO shoppingListsV2ItemVO = this.item;
        if (shoppingListsV2ItemVO != null) {
            this.actionHandler = onPreProcess.buildDisposableHandler(shoppingListsV2ItemVO.getId(), getLifecycle(), this.actionSheetEventHandler);
        }
    }

    private final void setupPinIcon(ShoppingListsV2ItemVO item) {
        if (!item.getIsPinned()) {
            this.binding.titleTv.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        e a11 = e.a(getResources(), R$drawable.ic_s_pin, getContext().getTheme());
        a11.setTint(ThemeExtKt.themeColor(getContext(), R$attr.textSecondary));
        this.binding.titleTv.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a11, (Drawable) null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        DisposableActionHandler disposableActionHandler;
        super.onAttach();
        recreateActionHandler();
        ShoppingListsV2ItemVO shoppingListsV2ItemVO = this.item;
        if (shoppingListsV2ItemVO == null || (disposableActionHandler = this.actionHandler) == null) {
            return;
        }
        bindOptionButton(shoppingListsV2ItemVO, disposableActionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ShoppingListsV2ItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.info = info;
        this.favoritesListsActionHandler.setWidgetTrackingData(getTrackingData());
        this.favoritesListsActionHandler.setRequestId(item.getId());
        this.favoritesListsActionHandler.onBind();
        recreateActionHandler();
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler == null) {
            return;
        }
        this.binding.titleTv.setText(item.getTitle());
        this.binding.subtitleTv.setText(item.getSubtitle());
        ImageView listIv = this.binding.listIv;
        Intrinsics.checkNotNullExpressionValue(listIv, "listIv");
        ImageViewExtKt.loadWithRoundCorners(listIv, item.getIcon(), Integer.valueOf(this.cornersRadius));
        View listImageBackgroundView = this.binding.listImageBackgroundView;
        Intrinsics.checkNotNullExpressionValue(listImageBackgroundView, "listImageBackgroundView");
        ViewExtKt.showOrGone(listImageBackgroundView, Boolean.valueOf(ThemeExtKt.isDarkThemeActive(getContext())));
        bindOptionButton(item, disposableActionHandler);
        setupPinIcon(item);
    }
}
