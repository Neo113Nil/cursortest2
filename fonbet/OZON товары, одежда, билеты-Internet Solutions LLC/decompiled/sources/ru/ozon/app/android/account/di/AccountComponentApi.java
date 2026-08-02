package ru.ozon.app.android.account.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository;
import ru.ozon.app.android.account.authEvents.AlreadyAuthEvents;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.account.authEvents.data.AuthStatusRepository;
import ru.ozon.app.android.account.coupon.ApplyCouponState;
import ru.ozon.app.android.account.currency.CurrencyRepository;
import ru.ozon.app.android.account.currency.CurrencyState;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;
import ru.ozon.app.android.account.eventBus.UserDataChangedEventBus;
import ru.ozon.app.android.account.events.WidgetEventService;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager;
import ru.ozon.app.android.account.session.SessionListUpdatedEventBus;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.account.user.UserManager;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H&¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H&¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H&¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/account/di/AccountComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "getSubscriptionServiceProvider", "()Lru/ozon/app/android/account/subscription/SubscriptionService;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "getSellerFavoriteService", "()Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "Lru/ozon/app/android/account/user/UserManager;", "getUserManager", "()Lru/ozon/app/android/account/user/UserManager;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "getOrderChangePreferences", "()Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "getOrderCountsStorage", "()Lru/ozon/app/android/account/orders/OrdersCountStorage;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "getOrderChangeManager", "()Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;", "getKeyStoreRepository", "()Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;", "Lru/ozon/app/android/account/currency/CurrencyRepository;", "getCurrencyRepository", "()Lru/ozon/app/android/account/currency/CurrencyRepository;", "Lru/ozon/app/android/account/currency/CurrencyState;", "getCurrencyLocalStore", "()Lru/ozon/app/android/account/currency/CurrencyState;", "Lru/ozon/app/android/account/coupon/ApplyCouponState;", "getCouponUpdateState", "()Lru/ozon/app/android/account/coupon/ApplyCouponState;", "Lru/ozon/app/android/account/session/SessionListUpdatedEventBus;", "getSessionListUpdatedEventBus", "()Lru/ozon/app/android/account/session/SessionListUpdatedEventBus;", "Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;", "getEmailActualizedEventBus", "()Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;", "Lru/ozon/app/android/account/eventBus/UserDataChangedEventBus;", "getUserDataChangedEventBus", "()Lru/ozon/app/android/account/eventBus/UserDataChangedEventBus;", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "getAuthEventsCollector", "()Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents;", "getAlreadyAuthEvents", "()Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents;", "Lru/ozon/app/android/account/events/WidgetEventService;", "getWidgetEventService", "()Lru/ozon/app/android/account/events/WidgetEventService;", "Lru/ozon/app/android/account/authEvents/data/AuthStatusRepository;", "getUserAuthStatusRepository", "()Lru/ozon/app/android/account/authEvents/data/AuthStatusRepository;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AccountComponentApi extends InterfaceC6958a {
    @NotNull
    AdultHandler getAdultHandler();

    @NotNull
    AlreadyAuthEvents getAlreadyAuthEvents();

    @NotNull
    AuthEventsCollector getAuthEventsCollector();

    @NotNull
    ApplyCouponState getCouponUpdateState();

    @NotNull
    CurrencyState getCurrencyLocalStore();

    @NotNull
    CurrencyRepository getCurrencyRepository();

    @NotNull
    EmailActualizedEventBus getEmailActualizedEventBus();

    @NotNull
    KeyStoreRepository getKeyStoreRepository();

    @NotNull
    OrderChangeManager getOrderChangeManager();

    @NotNull
    OrderChangePreferences getOrderChangePreferences();

    @NotNull
    OrdersCountStorage getOrderCountsStorage();

    @NotNull
    SellerFavoriteService getSellerFavoriteService();

    @NotNull
    SessionListUpdatedEventBus getSessionListUpdatedEventBus();

    @NotNull
    SubscriptionService getSubscriptionServiceProvider();

    @NotNull
    AuthStatusRepository getUserAuthStatusRepository();

    @NotNull
    UserDataChangedEventBus getUserDataChangedEventBus();

    @NotNull
    UserManager getUserManager();

    @NotNull
    WidgetEventService getWidgetEventService();
}
