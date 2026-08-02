package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.cards;

import WZ.t;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelCardView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b$\u0010\u001bJ*\u0010'\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R(\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u001c\u00101\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelCardView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "onClickEvent", "Lkotlin/Function2;", "LWZ/t;", "", "onSlideImageEvent", "favoriteProductDelegate", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelCardView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;Landroidx/lifecycle/J;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;)V", "onAttach", "()V", "onDetach", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;)V", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelCardView;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "Landroidx/lifecycle/J;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "screenWidth", "I", "compactCardWidth", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardsViewHolder extends j implements FavoriteProductV4Delegate {

    @NotNull
    private final AnalyticData analyticData;
    private final int compactCardWidth;
    private final Context context;

    @NotNull
    private final FavoriteProductV4Delegate favoriteProductDelegate;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final Function1<HotelsMapInfoV4VO.Card, Unit> onClickEvent;

    @NotNull
    private final Function2<t, Integer, Unit> onSlideImageEvent;
    private final int screenWidth;

    @NotNull
    private final HotelCardView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsViewHolder(@NotNull HotelCardView view, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super HotelsMapInfoV4VO.Card, Unit> onClickEvent, @NotNull Function2<? super t, ? super Integer, Unit> onSlideImageEvent, @NotNull FavoriteProductV4Delegate favoriteProductDelegate, @NotNull AnalyticData analyticData, @NotNull J lifecycleOwner, @NotNull HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator, HotelFavoriteUnauthorizedClickDelegate hotelFavoriteUnauthorizedClickDelegate) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(onSlideImageEvent, "onSlideImageEvent");
        Intrinsics.checkNotNullParameter(favoriteProductDelegate, "favoriteProductDelegate");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(favoritesForAuthorizedFeatureActivator, "favoritesForAuthorizedFeatureActivator");
        this.view = view;
        this.onAction = onAction;
        this.onClickEvent = onClickEvent;
        this.onSlideImageEvent = onSlideImageEvent;
        this.favoriteProductDelegate = favoriteProductDelegate;
        this.analyticData = analyticData;
        this.lifecycleOwner = lifecycleOwner;
        Context context = view.getContext();
        this.context = context;
        int i11 = context.getResources().getConfiguration().smallestScreenWidthDp;
        this.screenWidth = i11;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.compactCardWidth = UiExtKt.toPx(i11 * 0.9f, context);
        view.setup(onAction, onClickEvent, onSlideImageEvent, favoriteProductDelegate, analyticData, lifecycleOwner, favoritesForAuthorizedFeatureActivator, hotelFavoriteUnauthorizedClickDelegate);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeV4ButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.favoriteProductDelegate.attachFavButtonView(view);
    }

    public final void bind(@NotNull HotelsMapInfoV4VO.CardState item) {
        Intrinsics.checkNotNullParameter(item, "item");
        HotelCardView hotelCardView = this.view;
        ViewGroup.LayoutParams layoutParams = hotelCardView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = item.getIsCompactWidth() ? this.compactCardWidth : -1;
        hotelCardView.setLayoutParams(layoutParams);
        this.view.bind(item);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void bindFavoriteProductButton(@NotNull ProductFavoriteMoleculeV4ButtonView view, FavoriteProductModel molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favoriteProductDelegate.bindFavoriteProductButton(view, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void detachFavButtonView() {
        this.favoriteProductDelegate.detachFavButtonView();
    }

    @Override // jk0.j
    public void onAttach() {
        this.view.onAttach(this);
        super.onAttach();
    }

    @Override // jk0.j
    public void onDetach() {
        this.view.onDetach();
        super.onDetach();
    }
}
