package ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe;

import B90.C2618u;
import BT.b;
import Cw.c;
import Lz.d;
import Mc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import io.reactivex.AbstractC7094b;
import io.reactivex.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewModel;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import uc.i;
import vc.l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "subscriptionService", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "<init>", "(Lru/ozon/app/android/account/subscription/SubscriptionService;Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "", "shouldInvokeSubscribeAction", "()Z", "", "productId", "", "onSubscribeClick", "(J)V", "onUnsubscribeClick", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction;", "_action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "quantAction", "Landroidx/lifecycle/P;", "getQuantAction", "()Landroidx/lifecycle/P;", "Z", "isAuthenticatedInitially", "QuantAction", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubscribeQuantViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<QuantAction> _action;

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;
    private final boolean isAuthenticatedInitially;

    @NotNull
    private final P<QuantAction> quantAction;
    private boolean shouldInvokeSubscribeAction;

    @NotNull
    private final SubscriptionService subscriptionService;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0001¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            SubscribeQuantViewModel.this.shouldInvokeSubscribeAction = true;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction;", "", "<init>", "()V", "Error", "CallAuth", "Subscription", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction$CallAuth;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction$Error;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction$Subscription;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class QuantAction {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction$CallAuth;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CallAuth extends QuantAction {

            @NotNull
            public static final CallAuth INSTANCE = new CallAuth();

            private CallAuth() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CallAuth);
            }

            public int hashCode() {
                return -173306315;
            }

            @NotNull
            public String toString() {
                return "CallAuth";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction$Error;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends QuantAction {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 436593497;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction$Subscription;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction;", "", "isSubscribed", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Subscription extends QuantAction {
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

        public /* synthetic */ QuantAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private QuantAction() {
        }
    }

    public SubscribeQuantViewModel(@NotNull SubscriptionService subscriptionService, @NotNull FavoriteInteractor favoriteInteractor, @NotNull AuthStateStorage authManager) {
        Intrinsics.checkNotNullParameter(subscriptionService, "subscriptionService");
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.subscriptionService = subscriptionService;
        this.favoriteInteractor = favoriteInteractor;
        this.authManager = authManager;
        SingleLiveEvent<QuantAction> singleLiveEvent = new SingleLiveEvent<>();
        this._action = singleLiveEvent;
        this.quantAction = singleLiveEvent;
        boolean isAuthenticated = authManager.isAuthenticated();
        this.isAuthenticatedInitially = isAuthenticated;
        if (isAuthenticated) {
            return;
        }
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = authManager.getAuthState().subscribeOn(a.b()).observeOn(C8125a.a()).filter(new c(AnonymousClass1.INSTANCE, 12)).subscribe(new b(new AnonymousClass2(), 10));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSubscribeClick$lambda$3(SubscribeQuantViewModel subscribeQuantViewModel) {
        subscribeQuantViewModel._action.setValue(new QuantAction.Subscription(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnsubscribeClick$lambda$5(SubscribeQuantViewModel subscribeQuantViewModel) {
        subscribeQuantViewModel._action.setValue(new QuantAction.Subscription(false));
    }

    @NotNull
    public final P<QuantAction> getQuantAction() {
        return this.quantAction;
    }

    public final void onSubscribeClick(long productId) {
        if (!this.authManager.isAuthenticated()) {
            this._action.setValue(QuantAction.CallAuth.INSTANCE);
            return;
        }
        C8486a a11 = C5415f.a(this);
        l lVar = new l(this.subscriptionService.subscribeToItemAvailabilityChange(productId).c(this.favoriteInteractor.checkAndAddToFavorite(productId)), C8125a.a());
        i iVar = new i(new d(new SubscribeQuantViewModel$onSubscribeClick$2(this, productId), 7), new InterfaceC9019a() { // from class: nD.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                SubscribeQuantViewModel.onSubscribeClick$lambda$3(SubscribeQuantViewModel.this);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(a11, iVar);
    }

    public final void onUnsubscribeClick(long productId) {
        C8486a a11 = C5415f.a(this);
        AbstractC7094b unsubscribeFromItemAvailabilityChange = this.subscriptionService.unsubscribeFromItemAvailabilityChange(productId);
        x a12 = C8125a.a();
        unsubscribeFromItemAvailabilityChange.getClass();
        l lVar = new l(unsubscribeFromItemAvailabilityChange, a12);
        i iVar = new i(new AA.d(new SubscribeQuantViewModel$onUnsubscribeClick$2(this, productId), 11), new InterfaceC9019a() { // from class: nD.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                SubscribeQuantViewModel.onUnsubscribeClick$lambda$5(SubscribeQuantViewModel.this);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(a11, iVar);
    }

    public final boolean shouldInvokeSubscribeAction() {
        boolean z11 = this.shouldInvokeSubscribeAction;
        this.shouldInvokeSubscribeAction = false;
        return z11;
    }
}
