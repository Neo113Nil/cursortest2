package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation;

import Ae.B0;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.t;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010#\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00110*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00103\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/uni/android/cell/CellView;", "view", "Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "viewModel", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;LVg/d;Ll10/i;)V", "", "observeEvents", "()V", "LWZ/t;", "event", "trackAnalytics", "(LWZ/t;)V", "onCellClick", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "notificationBarDelegate$delegate", "LSc/j;", "getNotificationBarDelegate", "()Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "notificationBarDelegate", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddToFavoritesCellWidgetViewHolder extends k<AddToFavoritesCellVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final FavoriteManager favoriteManager;

    /* renamed from: notificationBarDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notificationBarDelegate;

    @NotNull
    private final CellView view;

    @NotNull
    private final AddToFavoritesViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToFavoritesCellWidgetViewHolder(@NotNull CellView view, @NotNull AddToFavoritesViewModel viewModel, @NotNull FavoriteManager favoriteManager, @NotNull d customActionHandlersStoreFactory, @NotNull i container) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        this.view = view;
        this.viewModel = viewModel;
        this.favoriteManager = favoriteManager;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).onComposerAction(new AddToFavoritesCellWidgetViewHolder$actionHandler$1(this)).customActionHandlers(new AddToFavoritesCellWidgetViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
        this.notificationBarDelegate = LazyUtilsKt.unsafeLazy(new AddToFavoritesCellWidgetViewHolder$notificationBarDelegate$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationBarDelegate getNotificationBarDelegate() {
        return (NotificationBarDelegate) this.notificationBarDelegate.getValue();
    }

    private final void observeEvents() {
        B0<NotificationDTO> notificationFlow = this.viewModel.getNotificationFlow();
        AbstractC5434v lifecycle = getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(C5427n.a(notificationFlow, lifecycle, bVar), new AddToFavoritesCellWidgetViewHolder$observeEvents$1(this, null)), K.a(this));
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getAnalyticsFlow(), getLifecycle(), bVar), new AddToFavoritesCellWidgetViewHolder$observeEvents$2(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCellClick() {
        AddToFavoritesCellVI boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        this.viewModel.toggleClicked(boundData.getModel(), new AnalyticData(getTrackingData(), getViewItem()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAnalytics(t event) {
        TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.container.X(), event, null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C(new C2408n0(this.favoriteManager.onFavoriteChangeFlow(), new AddToFavoritesCellWidgetViewHolder$onAttach$1(this, null)), new AddToFavoritesCellWidgetViewHolder$onAttach$2(null)), K.a(this));
        observeEvents();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddToFavoritesCellVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellHolderKt.bind(this.view, item.getCell(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AddToFavoritesCellVI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }
}
