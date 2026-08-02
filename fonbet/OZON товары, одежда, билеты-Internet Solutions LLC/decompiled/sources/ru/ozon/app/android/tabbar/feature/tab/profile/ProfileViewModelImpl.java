package ru.ozon.app.android.tabbar.feature.tab.profile;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2415r0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Fe.d;
import GZ.g;
import Ge.n;
import T7.E;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.domain.flags.AccountTabIndicatorStringFlag;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.OnChangeFeatureListener;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl;
import xe.C10727i;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u000223B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ#\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001d\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R \u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileTabViewModel;", "LGZ/g;", "router", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStorage", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "ordersCountStorage", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LGZ/g;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/account/orders/OrdersCountStorage;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "indicatorShown", "()V", "subscribeToOrdersCount", "checkIfUnauthorizedIndicatorEnabled", "subscribeToAuthChange", "checkOpenLogin", "", "", "values", "", "checkFeatureFlagValues", "([Ljava/lang/String;)Z", "isTheSameSelect", "onProfileTabSelected", "(Z)V", "onCleared", "LGZ/g;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "Lru/ozon/app/android/network/abtool/FeatureService;", "LAe/x0;", "", "ordersCountState", "LAe/x0;", "isAuthState", "unauthorizedIndicatorEnabledState", "unauthorizedIndicatorWasShownState", "LAe/h;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;", "badgeState", "LAe/h;", "getBadgeState", "()LAe/h;", "Lru/ozon/app/android/network/abtool/OnChangeFeatureListener;", "subscribeOnFeatureService", "Lru/ozon/app/android/network/abtool/OnChangeFeatureListener;", "BadgeVariant", "Factory", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileViewModelImpl extends w0 implements ProfileTabViewModel {

    @NotNull
    private final AuthStateStorage authStorage;

    @NotNull
    private final InterfaceC2395h<BadgeVariant> badgeState;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final x0<Boolean> isAuthState;

    @NotNull
    private final x0<Integer> ordersCountState;

    @NotNull
    private final OrdersCountStorage ordersCountStorage;

    @NotNull
    private final g router;

    @NotNull
    private final OnChangeFeatureListener subscribeOnFeatureService;

    @NotNull
    private final x0<Boolean> unauthorizedIndicatorEnabledState;

    @NotNull
    private x0<Boolean> unauthorizedIndicatorWasShownState;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;", "", "UnAuthorized", "None", "Orders", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant$None;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant$Orders;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant$UnAuthorized;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BadgeVariant {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant$None;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class None implements BadgeVariant {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -158389998;
            }

            @NotNull
            public String toString() {
                return "None";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant$Orders;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;", "", "count", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCount", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Orders implements BadgeVariant {
            private final int count;

            public Orders(int i11) {
                this.count = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Orders) && this.count == ((Orders) other).count;
            }

            public final int getCount() {
                return this.count;
            }

            public int hashCode() {
                return Integer.hashCode(this.count);
            }

            @NotNull
            public String toString() {
                return E.a(this.count, "Orders(count=", ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant$UnAuthorized;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnAuthorized implements BadgeVariant {

            @NotNull
            public static final UnAuthorized INSTANCE = new UnAuthorized();

            private UnAuthorized() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UnAuthorized);
            }

            public int hashCode() {
                return -1578289938;
            }

            @NotNull
            public String toString() {
                return "UnAuthorized";
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$Factory;", "Landroidx/lifecycle/z0$b;", "LGZ/g;", "router", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStorage", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "ordersCountStorage", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LGZ/g;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/account/orders/OrdersCountStorage;Lru/ozon/app/android/network/abtool/FeatureService;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "LGZ/g;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "Lru/ozon/app/android/network/abtool/FeatureService;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements z0.b {

        @NotNull
        private final AuthStateStorage authStorage;

        @NotNull
        private final FeatureService featureService;

        @NotNull
        private final OrdersCountStorage ordersCountStorage;

        @NotNull
        private final g router;

        public Factory(@NotNull g router, @NotNull AuthStateStorage authStorage, @NotNull OrdersCountStorage ordersCountStorage, @NotNull FeatureService featureService) {
            Intrinsics.checkNotNullParameter(router, "router");
            Intrinsics.checkNotNullParameter(authStorage, "authStorage");
            Intrinsics.checkNotNullParameter(ordersCountStorage, "ordersCountStorage");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            this.router = router;
            this.authStorage = authStorage;
            this.ordersCountStorage = ordersCountStorage;
            this.featureService = featureService;
        }

        @Override // androidx.lifecycle.z0.b
        @NotNull
        public <T extends w0> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new ProfileViewModelImpl(this.router, this.authStorage, this.ordersCountStorage, this.featureService);
        }
    }

    public ProfileViewModelImpl(@NotNull g router, @NotNull AuthStateStorage authStorage, @NotNull OrdersCountStorage ordersCountStorage, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(authStorage, "authStorage");
        Intrinsics.checkNotNullParameter(ordersCountStorage, "ordersCountStorage");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.router = router;
        this.authStorage = authStorage;
        this.ordersCountStorage = ordersCountStorage;
        this.featureService = featureService;
        x0<Integer> a11 = O0.a(0);
        this.ordersCountState = a11;
        x0<Boolean> a12 = O0.a(Boolean.valueOf(authStorage.isAuthenticated()));
        this.isAuthState = a12;
        x0<Boolean> a13 = O0.a(Boolean.valueOf(checkFeatureFlagValues("ENABLED_TAB_INDICATOR", "ENABLED_TAB_INDICATOR_AND_LOGIN_PAGE")));
        this.unauthorizedIndicatorEnabledState = a13;
        x0<Boolean> a14 = O0.a(Boolean.FALSE);
        this.unauthorizedIndicatorWasShownState = a14;
        this.badgeState = new C2415r0(new InterfaceC2395h[]{a12, a11, a13, a14}, new ProfileViewModelImpl$badgeState$1(null));
        OnChangeFeatureListener onChangeFeatureListener = new OnChangeFeatureListener() { // from class: ZL.a
            @Override // ru.ozon.app.android.network.abtool.OnChangeFeatureListener
            public final void onChangeFeature() {
                ProfileViewModelImpl.this.checkIfUnauthorizedIndicatorEnabled();
            }
        };
        this.subscribeOnFeatureService = onChangeFeatureListener;
        subscribeToOrdersCount();
        subscribeToAuthChange();
        checkIfUnauthorizedIndicatorEnabled();
        featureService.addOnChangeFeatureListener(onChangeFeatureListener);
    }

    private final boolean checkFeatureFlagValues(String... values) {
        String stringKey = this.featureService.getStringKey(AccountTabIndicatorStringFlag.INSTANCE);
        for (String str : values) {
            if (h.D(stringKey, str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIfUnauthorizedIndicatorEnabled() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ProfileViewModelImpl$checkIfUnauthorizedIndicatorEnabled$1(this, checkFeatureFlagValues("ENABLED_TAB_INDICATOR", "ENABLED_TAB_INDICATOR_AND_LOGIN_PAGE"), null), 3);
    }

    private final void checkOpenLogin() {
        if (!checkFeatureFlagValues("ENABLED_TAB_INDICATOR_AND_LOGIN_PAGE") || this.authStorage.isAuthenticated()) {
            return;
        }
        g.a.a(this.router, "ozon://login", null, null, 6);
    }

    private final void indicatorShown() {
        if (!this.unauthorizedIndicatorEnabledState.getValue().booleanValue() || this.isAuthState.getValue().booleanValue() || this.unauthorizedIndicatorWasShownState.getValue().booleanValue()) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ProfileViewModelImpl$indicatorShown$1(this, null), 3);
    }

    private final void subscribeToAuthChange() {
        C2408n0 c2408n0 = new C2408n0(n.a(this.authStorage.getAuthState()), new ProfileViewModelImpl$subscribeToAuthChange$1(this, null));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = I0.f818a;
        C2399j.M(c2408n0, a11, I0.a.c(), Boolean.valueOf(this.authStorage.isAuthenticated()));
    }

    private final void subscribeToOrdersCount() {
        C2408n0 c2408n0 = new C2408n0(d.a(this.ordersCountStorage.count()), new ProfileViewModelImpl$subscribeToOrdersCount$1(this, null));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = I0.f818a;
        C2399j.M(c2408n0, a11, I0.a.c(), 0);
    }

    @Override // ru.ozon.app.android.tabbar.feature.tab.profile.ProfileTabViewModel
    @NotNull
    public InterfaceC2395h<BadgeVariant> getBadgeState() {
        return this.badgeState;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.featureService.removeOnChangeFeatureListener(this.subscribeOnFeatureService);
    }

    @Override // ru.ozon.app.android.tabbar.feature.tab.profile.ProfileTabViewModel
    public void onProfileTabSelected(boolean isTheSameSelect) {
        if (!isTheSameSelect) {
            checkOpenLogin();
        }
        indicatorShown();
    }
}
