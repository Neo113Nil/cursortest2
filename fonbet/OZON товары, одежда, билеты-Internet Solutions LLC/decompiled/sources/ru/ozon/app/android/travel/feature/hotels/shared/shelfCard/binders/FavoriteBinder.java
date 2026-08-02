package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.binders;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Bl.b;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.utils.viewGroup.TouchEventsThiefFrameLayout;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0011J\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b!\u0010\u001cJ*\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u001c\u0010)\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/FavoriteBinder;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parent", "favoriteProductDelegate", "", "constraintId", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;ILru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "", "subscribeToFavoriteFeature", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "favoriteButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindOrGone", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "getId", "()I", "onAttach", "onDetach", "()V", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "view", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;)V", "detachFavButtonView", "molecule", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "dp2", "I", "productFavoriteView", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "productFavoriteViewWrapper", "Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FavoriteBinder implements FavoriteProductV4Delegate {
    private final Context context;
    private final int dp2;

    @NotNull
    private final FavoriteProductV4Delegate favoriteProductDelegate;

    @NotNull
    private final HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator;

    @NotNull
    private final ProductFavoriteMoleculeV4ButtonView productFavoriteView;

    @NotNull
    private final TouchEventsThiefFrameLayout productFavoriteViewWrapper;

    public FavoriteBinder(@NotNull ConstraintLayout parent, @NotNull FavoriteProductV4Delegate favoriteProductDelegate, int i11, @NotNull HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator, HotelFavoriteUnauthorizedClickDelegate hotelFavoriteUnauthorizedClickDelegate) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(favoriteProductDelegate, "favoriteProductDelegate");
        Intrinsics.checkNotNullParameter(favoritesForAuthorizedFeatureActivator, "favoritesForAuthorizedFeatureActivator");
        this.favoriteProductDelegate = favoriteProductDelegate;
        this.favoritesForAuthorizedFeatureActivator = favoritesForAuthorizedFeatureActivator;
        Context context = parent.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px = UiExtKt.toPx(2, context);
        this.dp2 = px;
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = (ProductFavoriteMoleculeV4ButtonView) b.a(ProductFavoriteMoleculeV4ButtonView.class, "type", q.f64554a, null);
        if (productFavoriteMoleculeV4ButtonView == null) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            productFavoriteMoleculeV4ButtonView = new ProductFavoriteMoleculeV4ButtonView(context, null, 0, 6, null);
        }
        productFavoriteMoleculeV4ButtonView.setId(R$id.shelfCardFavouriteButton);
        productFavoriteMoleculeV4ButtonView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.productFavoriteView = productFavoriteMoleculeV4ButtonView;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        TouchEventsThiefFrameLayout touchEventsThiefFrameLayout = new TouchEventsThiefFrameLayout(context, null, 0, 0, 14, null);
        touchEventsThiefFrameLayout.setId(R$id.shelfCardFavouriteButtonWrapper);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = i11;
        bVar.f41658v = i11;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = px;
        bVar.setMarginEnd(px);
        touchEventsThiefFrameLayout.setLayoutParams(bVar);
        this.productFavoriteViewWrapper = touchEventsThiefFrameLayout;
        parent.addView(touchEventsThiefFrameLayout);
        touchEventsThiefFrameLayout.addView(productFavoriteMoleculeV4ButtonView);
        touchEventsThiefFrameLayout.setOnClickListener(hotelFavoriteUnauthorizedClickDelegate);
    }

    private final void subscribeToFavoriteFeature(J lifecycleOwner) {
        C2399j.C(new C(new C2408n0(C5427n.a(this.favoritesForAuthorizedFeatureActivator.isFeatureActivatedFlow(), lifecycleOwner.getLifecycle(), AbstractC5434v.b.STARTED), new FavoriteBinder$subscribeToFavoriteFeature$1(this, null)), new FavoriteBinder$subscribeToFavoriteFeature$2(null)), K.a(lifecycleOwner));
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeV4ButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.favoriteProductDelegate.attachFavButtonView(view);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void bindFavoriteProductButton(@NotNull ProductFavoriteMoleculeV4ButtonView view, FavoriteProductModel molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favoriteProductDelegate.bindFavoriteProductButton(view, molecule, analyticData);
    }

    public final void bindOrGone(FavoriteProductModel favoriteButton, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        if (favoriteButton == null) {
            this.productFavoriteView.setVisibility(8);
            return;
        }
        this.productFavoriteView.setVisibility(0);
        bindFavoriteProductButton(this.productFavoriteView, favoriteButton, analyticData);
        this.productFavoriteViewWrapper.setTouchEventOneTimePassEnabled(favoriteButton.getIsFavorite());
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void detachFavButtonView() {
        this.favoriteProductDelegate.detachFavButtonView();
    }

    public final int getId() {
        return this.productFavoriteView.getId();
    }

    public final void onAttach(@NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.favoriteProductDelegate.attachFavButtonView(this.productFavoriteView);
        subscribeToFavoriteFeature(lifecycleOwner);
    }

    public final void onDetach() {
        this.favoriteProductDelegate.detachFavButtonView();
    }
}
