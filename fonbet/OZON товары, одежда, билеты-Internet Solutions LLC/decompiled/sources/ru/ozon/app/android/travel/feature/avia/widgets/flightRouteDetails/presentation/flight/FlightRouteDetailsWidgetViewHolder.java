package ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.presentation.flight;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/presentation/flight/FlightRouteDetailsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/presentation/flight/FlightRouteDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsView;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductDelegateProvider", "Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsView;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;LWZ/l;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/presentation/flight/FlightRouteDetailsVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsView;", "LVg/d;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "LWZ/l;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightRouteDetailsWidgetViewHolder extends k<FlightRouteDetailsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FlightDetailsView container;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final ProductFavoriteDelegateProvider favoriteProductDelegateProvider;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AddToFavoritesViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightRouteDetailsWidgetViewHolder(@NotNull FlightDetailsView container, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences refs, @NotNull ProductFavoriteDelegateProvider favoriteProductDelegateProvider, @NotNull AddToFavoritesViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull FavoriteManager favoriteManager) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(favoriteProductDelegateProvider, "favoriteProductDelegateProvider");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        this.container = container;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.refs = refs;
        this.favoriteProductDelegateProvider = favoriteProductDelegateProvider;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.favoriteManager = favoriteManager;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new FlightRouteDetailsWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        container.setupAdapter(this, buildHandler, favoriteProductDelegateProvider, refs, tokenizedAnalytics);
        container.setRecycledViewPool(refs.getComposerViewPoolProvider().getViewPool());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C(new C2408n0(this.favoriteManager.onFavoriteChangeFlow(), new FlightRouteDetailsWidgetViewHolder$onAttach$1(this, null)), new FlightRouteDetailsWidgetViewHolder$onAttach$2(null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FlightRouteDetailsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FlightDetailsView flightDetailsView = this.container;
        flightDetailsView.bind(item.getFlight(), new AnalyticData(getTrackingData(), getViewItem()));
        int marginBetweenFlights = item.getMarginBetweenFlights();
        Context context = flightDetailsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(marginBetweenFlights, context);
        ViewGroup.LayoutParams layoutParams = flightDetailsView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        if (((ViewGroup.MarginLayoutParams) layoutParams).topMargin != px) {
            ViewGroup.LayoutParams layoutParams2 = flightDetailsView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.topMargin = px;
            flightDetailsView.setLayoutParams(marginLayoutParams);
        }
    }
}
