package ru.ozon.app.android.favorites.ui.configurators;

import RZ.c;
import WZ.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.notification.NotificationBundle;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/CreateFavoritesListConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/FavoritesListsUpdateEventsConfigurator;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;LWZ/l;)V", "Lru/ozon/app/android/favorites/ui/notification/NotificationBundle;", "bundle", "", "showNotification", "(Lru/ozon/app/android/favorites/ui/notification/NotificationBundle;)V", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "confRefs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "createBaseActionHandler", "(Lru/ozon/app/android/composer/ConfiguratorReferences;)Lkotlin/jvm/functions/Function1;", "", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "events", "handleEvents", "(Ljava/util/List;)V", "updateFavoritesState", "()V", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "LWZ/l;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CreateFavoritesListConfigurator extends FavoritesListsUpdateEventsConfigurator {

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;

    @NotNull
    private final FavoritesListsEventsManager favoritesListsEventsManager;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFavoritesListConfigurator(@NotNull FavoritesListsEventsManager favoritesListsEventsManager, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler, @NotNull l tokenizedAnalytics) {
        super(favoritesListsEventsManager);
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.favoritesListsEventsManager = favoritesListsEventsManager;
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final Function1<AtomAction, Unit> createBaseActionHandler(ConfiguratorReferences confRefs) {
        return BaseActionHandler.Builder.INSTANCE.invoke(confRefs.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(confRefs.getComposerWidgetComponentStorage())).onComposerAction(new CreateFavoritesListConfigurator$createBaseActionHandler$1(this.favoritesComposerActionHandler)).buildHandler();
    }

    private final void showNotification(NotificationBundle bundle) {
        if (bundle.getWidgetId() != null && bundle.getTrackingData().d() != null) {
            this.tokenizedAnalytics.b(U.i(new Pair(bundle.getWidgetId(), new c(bundle.getTrackingData().d()))));
        }
        Map<String, String> payloads = bundle.getPayloads();
        if (payloads != null) {
            this.tokenizedAnalytics.e(payloads);
        }
        this.favoritesComposerActionHandler.setTrackingData(bundle.getTrackingData());
        ComponentCallbacksC5392m c11 = getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            r a11 = getContainer().a();
            viewGroup = a11 != null ? ContextExtKt.getRootView(a11) : null;
            if (viewGroup == null) {
                return;
            }
        }
        ConfiguratorReferences references = getReferences();
        Function1<AtomAction, Unit> createBaseActionHandler = references != null ? createBaseActionHandler(references) : null;
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(bundle.getNotification()));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, bundle.getNotification(), getContainer().g(), createBaseActionHandler).show();
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.FavoritesListsUpdateEventsConfigurator
    public void handleEvents(@NotNull List<? extends FavoritesListsEventsManager.FavoritesListsEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        ArrayList arrayList = new ArrayList();
        for (Object obj : events) {
            if (obj instanceof FavoritesListsEventsManager.FavoritesListsEvent.Created) {
                arrayList.add(obj);
            }
        }
        FavoritesListsEventsManager.FavoritesListsEvent.Created created = (FavoritesListsEventsManager.FavoritesListsEvent.Created) C7714v.Z(arrayList);
        if (created != null) {
            updateFavoritesState();
            if (this.favoritesListsEventsManager.getShouldShowFlashbar().get()) {
                this.favoritesListsEventsManager.getShouldShowFlashbar().set(false);
                NotificationBundle notificationBundle = created.getNotificationBundle();
                if (notificationBundle != null) {
                    showNotification(notificationBundle);
                }
            }
        }
    }

    public void updateFavoritesState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.e(controller, null, null, null, 7);
    }
}
