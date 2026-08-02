package ru.ozon.app.android.favorites.ui.configurators;

import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.ui.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$string;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/EditListFavoriteConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/EventManagerConfigurator;", "favoriteEventManager", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoritesComposerActionHandler", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "<init>", "(Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;)V", "handleEvents", "", "events", "", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;", "updateFavoriteState", "showMessage", "event", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteListEdited;", "refs", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "showNotification", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteWishlistEdited;", "createBaseActionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "confRefs", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class EditListFavoriteConfigurator extends EventManagerConfigurator {

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditListFavoriteConfigurator(@NotNull FavoriteEventManager favoriteEventManager, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler) {
        super(favoriteEventManager);
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
    }

    private final Function1<AtomAction, Unit> createBaseActionHandler(ConfiguratorReferences confRefs) {
        return BaseActionHandler.Builder.INSTANCE.invoke(confRefs.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(confRefs.getComposerWidgetComponentStorage())).onComposerAction(new EditListFavoriteConfigurator$createBaseActionHandler$1(this.favoritesComposerActionHandler)).buildHandler();
    }

    private final void showMessage(FavoriteEvent.OnFavoriteListEdited event, ConfiguratorReferences refs) {
        C4911f ownerContainer;
        r a11;
        ViewGroup rootView;
        OzonSpannableString ozonSpannableString;
        if (event.getMessage() == null || event.getMessageIsShowed()) {
            return;
        }
        event.setMessageIsShowed(true);
        if (refs == null || (ownerContainer = refs.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        int i11 = R$drawable.ic_favourites_tabbar;
        String message = event.getMessage();
        if (message == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message)) == null) {
            ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.error_flashbar_universal_network_error));
        }
        FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 6000L, null, null, refs.getOwnerContainer().f(), 57306, null).show();
    }

    private final void showNotification(FavoriteEvent.OnFavoriteWishlistEdited event, ConfiguratorReferences refs) {
        C4911f ownerContainer;
        r a11;
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        NotificationModelWrapper notification = event.getNotification();
        if (notification == null || refs == null || (ownerContainer = refs.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null || (rootView = ContextExtKt.getRootView(a11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null || event.getNotificationIsShowed()) {
            return;
        }
        event.setNotificationIsShowed(true);
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, refs.getOwnerContainer().g(), createBaseActionHandler(refs)).show();
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.EventManagerConfigurator
    public void handleEvents(@NotNull List<? extends FavoriteEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        List<? extends FavoriteEvent> list = events;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FavoriteEvent.OnFavoriteListEdited) {
                arrayList.add(obj);
            }
        }
        FavoriteEvent.OnFavoriteListEdited onFavoriteListEdited = (FavoriteEvent.OnFavoriteListEdited) C7714v.Z(arrayList);
        if (onFavoriteListEdited != null) {
            showMessage(onFavoriteListEdited, getReferences());
            updateFavoriteState();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof FavoriteEvent.OnFavoriteWishlistEdited) {
                arrayList2.add(obj2);
            }
        }
        FavoriteEvent.OnFavoriteWishlistEdited onFavoriteWishlistEdited = (FavoriteEvent.OnFavoriteWishlistEdited) C7714v.Z(arrayList2);
        if (onFavoriteWishlistEdited != null) {
            showNotification(onFavoriteWishlistEdited, getReferences());
            if (onFavoriteWishlistEdited.getNeedRefresh()) {
                updateFavoriteState();
            }
        }
    }

    public void updateFavoriteState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.e(controller, null, null, null, 7);
    }
}
