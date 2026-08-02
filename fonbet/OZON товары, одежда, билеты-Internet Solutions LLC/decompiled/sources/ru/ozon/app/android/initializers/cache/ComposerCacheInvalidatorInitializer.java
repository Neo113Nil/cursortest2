package ru.ozon.app.android.initializers.cache;

import EC.a;
import Ge.n;
import Py.b;
import Ty.C4050a;
import Ty.C4051b;
import Ty.C4052c;
import Ty.C4053d;
import Ty.C4054e;
import Ty.f;
import Ty.g;
import android.annotation.SuppressLint;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.coupon.ApplyCouponState;
import ru.ozon.app.android.account.currency.CurrencyState;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b \u0010\u0019J\u000f\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/initializers/cache/ComposerCacheInvalidatorInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "composerCacheService", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lru/ozon/app/android/location/ComposerLocationRepository;", "locationRepository", "Lru/ozon/app/android/account/currency/CurrencyState;", "currencyState", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "addressUpdateManager", "Lru/ozon/app/android/account/coupon/ApplyCouponState;", "applyCouponState", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/composer/network/cache/ComposerCacheService;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/account/user/UserManager;Lru/ozon/app/android/location/ComposerLocationRepository;Lru/ozon/app/android/account/currency/CurrencyState;Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;Lru/ozon/app/android/account/coupon/ApplyCouponState;)V", "Lio/reactivex/p;", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "getAdultState", "()Lio/reactivex/p;", "getCartState", "getFavoritesState", "getUserState", "getLocationState", "getAddressState", "getCurrencyState", "getCouponState", "", "init", "()V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/account/user/UserManager;", "Lru/ozon/app/android/location/ComposerLocationRepository;", "Lru/ozon/app/android/account/currency/CurrencyState;", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "Lru/ozon/app/android/account/coupon/ApplyCouponState;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerCacheInvalidatorInitializer implements ActionInitializer {

    @NotNull
    private final AddressUpdateManager addressUpdateManager;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final ApplyCouponState applyCouponState;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final ComposerCacheService composerCacheService;

    @NotNull
    private final CurrencyState currencyState;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final ComposerLocationRepository locationRepository;

    @NotNull
    private final UserManager userManager;

    public ComposerCacheInvalidatorInitializer(@NotNull AdultHandler adultHandler, @NotNull ComposerCacheService composerCacheService, @NotNull CartService cartService, @NotNull FavoriteManager favoriteManager, @NotNull UserManager userManager, @NotNull ComposerLocationRepository locationRepository, @NotNull CurrencyState currencyState, @NotNull AddressUpdateManager addressUpdateManager, @NotNull ApplyCouponState applyCouponState) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(composerCacheService, "composerCacheService");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(locationRepository, "locationRepository");
        Intrinsics.checkNotNullParameter(currencyState, "currencyState");
        Intrinsics.checkNotNullParameter(addressUpdateManager, "addressUpdateManager");
        Intrinsics.checkNotNullParameter(applyCouponState, "applyCouponState");
        this.adultHandler = adultHandler;
        this.composerCacheService = composerCacheService;
        this.cartService = cartService;
        this.favoriteManager = favoriteManager;
        this.userManager = userManager;
        this.locationRepository = locationRepository;
        this.currencyState = currencyState;
        this.addressUpdateManager = addressUpdateManager;
        this.applyCouponState = applyCouponState;
    }

    private final p<ClearCacheReason> getAddressState() {
        p map = this.addressUpdateManager.getAddressUpdate().map(new g(ComposerCacheInvalidatorInitializer$getAddressState$1.INSTANCE, 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearCacheReason getAddressState$lambda$7(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ClearCacheReason) function1.invoke(p02);
    }

    private final p<ClearCacheReason> getAdultState() {
        p map = this.adultHandler.isUserAdultChangedObservable().map(new C4054e(ComposerCacheInvalidatorInitializer$getAdultState$1.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearCacheReason getAdultState$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ClearCacheReason) function1.invoke(p02);
    }

    private final p<ClearCacheReason> getCartState() {
        p<ClearCacheReason> map = CartService.DefaultImpls.observeCartStateChanged$default(this.cartService, null, 1, null).map(new C4052c(ComposerCacheInvalidatorInitializer$getCartState$1.INSTANCE, 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearCacheReason getCartState$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ClearCacheReason) function1.invoke(p02);
    }

    private final p<ClearCacheReason> getCouponState() {
        p map = this.applyCouponState.observeCouponUpdate().map(new C4053d(ComposerCacheInvalidatorInitializer$getCouponState$1.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearCacheReason getCouponState$lambda$9(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ClearCacheReason) function1.invoke(p02);
    }

    private final p<ClearCacheReason> getCurrencyState() {
        p map = this.currencyState.observeCurrencyCode().distinctUntilChanged().map(new C4050a(ComposerCacheInvalidatorInitializer$getCurrencyState$1.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearCacheReason getCurrencyState$lambda$8(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ClearCacheReason) function1.invoke(p02);
    }

    private final p<ClearCacheReason> getFavoritesState() {
        p map = this.favoriteManager.onFavoriteChange().map(new f(ComposerCacheInvalidatorInitializer$getFavoritesState$1.INSTANCE, 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearCacheReason getFavoritesState$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ClearCacheReason) function1.invoke(p02);
    }

    private final p<ClearCacheReason> getLocationState() {
        p<ClearCacheReason> map = n.b(this.locationRepository.getCurrentAreaIdChangedFlow()).map(new C4051b(ComposerCacheInvalidatorInitializer$getLocationState$1.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearCacheReason getLocationState$lambda$6(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ClearCacheReason) function1.invoke(p02);
    }

    private final p<ClearCacheReason> getUserState() {
        p<ClearCacheReason> map = n.b(this.userManager.getUserIdChangedFlow()).map(new a(ComposerCacheInvalidatorInitializer$getUserState$1.INSTANCE, 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearCacheReason getUserState$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ClearCacheReason) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    @SuppressLint({"CheckResult"})
    public void init() {
        p.merge(C7714v.b0(getAdultState(), getCartState(), getFavoritesState(), getUserState(), getLocationState(), getAddressState(), getCurrencyState(), getCouponState())).subscribeOn(Mc.a.b()).observeOn(Mc.a.b()).subscribe(new Py.a(new ComposerCacheInvalidatorInitializer$init$1(this.composerCacheService), 1), new b(new ComposerCacheInvalidatorInitializer$init$2(Lm0.a.f17149a), 1));
    }
}
