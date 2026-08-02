package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation;

import WZ.l;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001dB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;LWZ/l;)V", "", "onCleared", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/CartItemParams;", "params", "addToCart", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/CartItemParams;)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lnc/a;", "disposable", "Lnc/a;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action;", "_actions", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "actions", "Landroidx/lifecycle/P;", "getActions", "()Landroidx/lifecycle/P;", "Action", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WholeSaleViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> _actions;

    @NotNull
    private final P<Action> actions;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final C8486a disposable;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action;", "", "<init>", "()V", "AddToCartSuccess", "AddToCartError", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action$AddToCartError;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action$AddToCartSuccess;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action$AddToCartError;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AddToCartError extends Action {

            @NotNull
            public static final AddToCartError INSTANCE = new AddToCartError();

            private AddToCartError() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AddToCartError);
            }

            public int hashCode() {
                return 1253108270;
            }

            @NotNull
            public String toString() {
                return "AddToCartError";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action$AddToCartSuccess;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AddToCartSuccess extends Action {

            @NotNull
            public static final AddToCartSuccess INSTANCE = new AddToCartSuccess();

            private AddToCartSuccess() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AddToCartSuccess);
            }

            public int hashCode() {
                return 1258022569;
            }

            @NotNull
            public String toString() {
                return "AddToCartSuccess";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public WholeSaleViewModel(@NotNull CartService cartService, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService = cartService;
        this.disposable = new C8486a();
        SingleLiveEvent<Action> singleLiveEvent = new SingleLiveEvent<>();
        this._actions = singleLiveEvent;
        this.actions = singleLiveEvent;
        cartService.attach(tokenizedAnalytics);
    }

    public final void addToCart(@NotNull CartItemParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        RxExtKt.plusAssign(this.disposable, RxExtKt.subscribeBy(CartService.DefaultImpls.addProductToCart$default(this.cartService, String.valueOf(params.getSkuId()), params.getQuantity(), params.getDeliverySchema(), params.getTrackingInfo(), params.getWidgetId(), null, null, null, null, null, 992, null), new WholeSaleViewModel$addToCart$1(this), new WholeSaleViewModel$addToCart$2(this)));
    }

    @NotNull
    public final P<Action> getActions() {
        return this.actions;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposable.dispose();
    }
}
