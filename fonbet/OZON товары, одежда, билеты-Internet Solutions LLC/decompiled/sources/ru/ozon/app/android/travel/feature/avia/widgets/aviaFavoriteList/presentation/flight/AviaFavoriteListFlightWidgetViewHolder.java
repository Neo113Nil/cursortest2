package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.flight;

import Vg.d;
import W10.c;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListFlightVI;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view.AviaFavoriteListFlightView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b#\u0010\u0017J*\u0010(\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00130-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/flight/AviaFavoriteListFlightWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/AviaFavoriteListFlightView;", "containerView", "favProductMoleculeDelegate", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/AviaFavoriteListFlightView;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;Ll10/i;LVg/d;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI;Ll20/d;)V", "onAttach", "()V", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "view", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/AviaFavoriteListFlightView;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaFavoriteListFlightWidgetViewHolder extends k<AviaFavoriteListFlightVI> implements FavoriteProductV4Delegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final AviaFavoriteListFlightView containerView;

    @NotNull
    private final FavoriteProductV4Delegate favProductMoleculeDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaFavoriteListFlightWidgetViewHolder(@NotNull AviaFavoriteListFlightView containerView, @NotNull FavoriteProductV4Delegate favProductMoleculeDelegate, @NotNull i container, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new AviaFavoriteListFlightWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeV4ButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.favProductMoleculeDelegate.attachFavButtonView(view);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void bindFavoriteProductButton(@NotNull ProductFavoriteMoleculeV4ButtonView view, FavoriteProductModel molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favProductMoleculeDelegate.bindFavoriteProductButton(view, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void detachFavButtonView() {
        this.favProductMoleculeDelegate.detachFavButtonView();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.favProductMoleculeDelegate.attachFavButtonView(this.containerView.getFavoriteButtonV());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.favProductMoleculeDelegate.detachFavButtonView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AviaFavoriteListFlightVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, this.actionHandler, new AviaFavoriteListFlightWidgetViewHolder$bind$1(this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AviaFavoriteListFlightVI item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AviaFavoriteListFlightWidgetViewHolder) item, trackingData, viewedPond);
        AviaFavoriteListFlightVI boundData = getBoundData();
        if (boundData == null || (tokenizedEvent = boundData.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
    }
}
