package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.cards;

import WZ.t;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelCardView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B}\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R(\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "onClickEvent", "Lkotlin/Function2;", "LWZ/t;", "", "onSlideImageEvent", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductDelegateProvider", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "Landroidx/lifecycle/J;", "lifecycleOwner", "Ll10/i;", "container", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;Landroidx/lifecycle/J;Ll10/i;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;)V", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsViewHolder;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "Landroidx/lifecycle/J;", "Ll10/i;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "CardsDiffUtil", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardsAdapter extends i<HotelsMapInfoV4VO.CardState, CardsViewHolder> {

    @NotNull
    private final AnalyticData analyticData;

    @NotNull
    private final l10.i container;

    @NotNull
    private final ProductFavoriteDelegateProvider favoriteProductDelegateProvider;
    private final HotelFavoriteUnauthorizedClickDelegate favoriteUnauthorizedClickDelegate;

    @NotNull
    private final HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final Function1<HotelsMapInfoV4VO.Card, Unit> onClickEvent;

    @NotNull
    private final Function2<t, Integer, Unit> onSlideImageEvent;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsAdapter$CardsDiffUtil;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;)Z", "areContentsTheSame", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardsDiffUtil extends i.d<HotelsMapInfoV4VO.CardState> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull HotelsMapInfoV4VO.CardState oldItem, @NotNull HotelsMapInfoV4VO.CardState newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull HotelsMapInfoV4VO.CardState oldItem, @NotNull HotelsMapInfoV4VO.CardState newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getId(), newItem.getId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super HotelsMapInfoV4VO.Card, Unit> onClickEvent, @NotNull Function2<? super t, ? super Integer, Unit> onSlideImageEvent, @NotNull ProductFavoriteDelegateProvider favoriteProductDelegateProvider, @NotNull AnalyticData analyticData, @NotNull J lifecycleOwner, @NotNull l10.i container, @NotNull HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator, HotelFavoriteUnauthorizedClickDelegate hotelFavoriteUnauthorizedClickDelegate) {
        super(new CardsDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(onSlideImageEvent, "onSlideImageEvent");
        Intrinsics.checkNotNullParameter(favoriteProductDelegateProvider, "favoriteProductDelegateProvider");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(favoritesForAuthorizedFeatureActivator, "favoritesForAuthorizedFeatureActivator");
        this.onAction = onAction;
        this.onClickEvent = onClickEvent;
        this.onSlideImageEvent = onSlideImageEvent;
        this.favoriteProductDelegateProvider = favoriteProductDelegateProvider;
        this.analyticData = analyticData;
        this.lifecycleOwner = lifecycleOwner;
        this.container = container;
        this.favoritesForAuthorizedFeatureActivator = favoritesForAuthorizedFeatureActivator;
        this.favoriteUnauthorizedClickDelegate = hotelFavoriteUnauthorizedClickDelegate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CardsViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsMapInfoV4VO.CardState cardState = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(cardState, "get(...)");
        holder.bind(cardState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CardsViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelCardView hotelCardView = new HotelCardView(context);
        hotelCardView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new CardsViewHolder(hotelCardView, this.onAction, this.onClickEvent, this.onSlideImageEvent, this.favoriteProductDelegateProvider.provideV4Delegate(this.container), this.analyticData, this.lifecycleOwner, this.favoritesForAuthorizedFeatureActivator, this.favoriteUnauthorizedClickDelegate);
    }
}
