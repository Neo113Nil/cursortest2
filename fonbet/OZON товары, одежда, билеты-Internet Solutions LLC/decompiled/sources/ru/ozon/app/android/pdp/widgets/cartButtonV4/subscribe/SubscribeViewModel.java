package ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe;

import B90.C2618u;
import Dp.C2877a;
import Fn.C3055d;
import Lz.d;
import Mc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import io.reactivex.AbstractC7094b;
import io.reactivex.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import uc.i;
import vc.l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "subscriptionService", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "<init>", "(Lru/ozon/app/android/account/subscription/SubscriptionService;Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/composer/ComposerNavigator;)V", "", "productId", "", "subscribe", "(J)V", "authAndSubscribe", "onSubscribeClick", "onUnsubscribeClick", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action;", "_action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "action", "Landroidx/lifecycle/P;", "getAction", "()Landroidx/lifecycle/P;", "Action", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubscribeViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> _action;

    @NotNull
    private final P<Action> action;

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;

    @NotNull
    private final SubscriptionService subscriptionService;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action;", "", "<init>", "()V", "Error", "Subscription", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action$Error;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action$Subscription;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action$Error;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action;", "", "isNetworkError", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {
            private final boolean isNetworkError;

            public Error(boolean z11) {
                super(null);
                this.isNetworkError = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && this.isNetworkError == ((Error) other).isNetworkError;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isNetworkError);
            }

            /* renamed from: isNetworkError, reason: from getter */
            public final boolean getIsNetworkError() {
                return this.isNetworkError;
            }

            @NotNull
            public String toString() {
                return C2618u.g("Error(isNetworkError=", ")", this.isNetworkError);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action$Subscription;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action;", "", "isSubscribed", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Subscription extends Action {
            private final boolean isSubscribed;

            public Subscription(boolean z11) {
                super(null);
                this.isSubscribed = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Subscription) && this.isSubscribed == ((Subscription) other).isSubscribed;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSubscribed);
            }

            /* renamed from: isSubscribed, reason: from getter */
            public final boolean getIsSubscribed() {
                return this.isSubscribed;
            }

            @NotNull
            public String toString() {
                return C2618u.g("Subscription(isSubscribed=", ")", this.isSubscribed);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public SubscribeViewModel(@NotNull SubscriptionService subscriptionService, @NotNull FavoriteInteractor favoriteInteractor, @NotNull AuthStateStorage authManager, @NotNull ComposerNavigator composerNavigator) {
        Intrinsics.checkNotNullParameter(subscriptionService, "subscriptionService");
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        this.subscriptionService = subscriptionService;
        this.favoriteInteractor = favoriteInteractor;
        this.authManager = authManager;
        this.composerNavigator = composerNavigator;
        SingleLiveEvent<Action> singleLiveEvent = new SingleLiveEvent<>();
        this._action = singleLiveEvent;
        this.action = singleLiveEvent;
    }

    private final void authAndSubscribe(long productId) {
        ComposerNavigator composerNavigator = this.composerNavigator;
        String uri = LinkGenerator.INSTANCE.auth().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, uri, null, 2, null);
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = this.authManager.getAuthState().subscribeOn(a.b()).observeOn(C8125a.a()).filter(new d(SubscribeViewModel$authAndSubscribe$1.INSTANCE, 10)).subscribe(new C2877a(new SubscribeViewModel$authAndSubscribe$2(this, productId), 11));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean authAndSubscribe$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnsubscribeClick$lambda$0(SubscribeViewModel subscribeViewModel) {
        subscribeViewModel._action.setValue(new Action.Subscription(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribe(long productId) {
        C8486a a11 = C5415f.a(this);
        l lVar = new l(this.subscriptionService.subscribeToItemAvailabilityChange(productId).c(this.favoriteInteractor.checkAndAddToFavorite(productId)), C8125a.a());
        i iVar = new i(new C3055d(new SubscribeViewModel$subscribe$2(this, productId), 15), new InterfaceC9019a() { // from class: vD.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                SubscribeViewModel.subscribe$lambda$2(SubscribeViewModel.this);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(a11, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$2(SubscribeViewModel subscribeViewModel) {
        subscribeViewModel._action.setValue(new Action.Subscription(true));
    }

    @NotNull
    public final P<Action> getAction() {
        return this.action;
    }

    public final void onSubscribeClick(long productId) {
        if (this.authManager.isAuthenticated()) {
            subscribe(productId);
        } else {
            authAndSubscribe(productId);
        }
    }

    public final void onUnsubscribeClick(long productId) {
        C8486a a11 = C5415f.a(this);
        AbstractC7094b unsubscribeFromItemAvailabilityChange = this.subscriptionService.unsubscribeFromItemAvailabilityChange(productId);
        x a12 = C8125a.a();
        unsubscribeFromItemAvailabilityChange.getClass();
        l lVar = new l(unsubscribeFromItemAvailabilityChange, a12);
        i iVar = new i(new AF.a(new SubscribeViewModel$onUnsubscribeClick$2(this, productId), 15), new InterfaceC9019a() { // from class: vD.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                SubscribeViewModel.onUnsubscribeClick$lambda$0(SubscribeViewModel.this);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(a11, iVar);
    }
}
