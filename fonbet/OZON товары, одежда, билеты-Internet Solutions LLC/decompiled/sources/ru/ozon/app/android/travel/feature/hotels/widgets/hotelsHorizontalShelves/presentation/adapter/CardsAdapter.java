package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.adapter;

import Bl.b;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import gk0.q;
import java.util.Map;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bq\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u001e\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010/R,\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101R\u0018\u00102\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010(\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onViewEvent", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "<init>", "(Landroidx/lifecycle/J;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;)V", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardViewHolder;", "getItemViewType", "(I)I", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "setAnalyticsData", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "_analyticData", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "getAnalyticData", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardsAdapter extends i<ShelfCardVO, CardViewHolder> {
    private AnalyticData _analyticData;

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
    private final Function1<Map<String, TokenizedTrackingInfo>, Unit> onViewEvent;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsAdapter(@NotNull J lifecycleOwner, @NotNull ProductFavoriteDelegateProvider favoriteProductDelegateProvider, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super Map<String, TokenizedTrackingInfo>, Unit> onViewEvent, @NotNull HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator, HotelFavoriteUnauthorizedClickDelegate hotelFavoriteUnauthorizedClickDelegate) {
        super(new CardsAdapterDiffUtilItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(favoriteProductDelegateProvider, "favoriteProductDelegateProvider");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onViewEvent, "onViewEvent");
        Intrinsics.checkNotNullParameter(favoritesForAuthorizedFeatureActivator, "favoritesForAuthorizedFeatureActivator");
        this.lifecycleOwner = lifecycleOwner;
        this.favoriteProductDelegateProvider = favoriteProductDelegateProvider;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onAction = onAction;
        this.onViewEvent = onViewEvent;
        this.favoritesForAuthorizedFeatureActivator = favoritesForAuthorizedFeatureActivator;
        this.favoriteUnauthorizedClickDelegate = hotelFavoriteUnauthorizedClickDelegate;
    }

    private final AnalyticData getAnalyticData() {
        AnalyticData analyticData = this._analyticData;
        if (analyticData != null) {
            return analyticData;
        }
        throw new IllegalStateException("You need setup analyticData before using cardsAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.hotelsHorizontalShelvesRv;
    }

    public final void setAnalyticsData(@NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this._analyticData = analyticData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CardViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ShelfCardVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, getAnalyticData());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CardViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ShelfCardView shelfCardView = (ShelfCardView) b.a(ShelfCardView.class, "type", q.f64554a, null);
        if (shelfCardView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            shelfCardView = new ShelfCardView(context);
        }
        ShelfCardView shelfCardView2 = shelfCardView;
        shelfCardView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return new CardViewHolder(shelfCardView2, this.onAction, this.onViewEvent, this.lifecycleOwner, this.favoriteProductDelegateProvider.provideV4Delegate(this.references, this.tokenizedAnalytics), this.favoritesForAuthorizedFeatureActivator, this.favoriteUnauthorizedClickDelegate);
    }
}
