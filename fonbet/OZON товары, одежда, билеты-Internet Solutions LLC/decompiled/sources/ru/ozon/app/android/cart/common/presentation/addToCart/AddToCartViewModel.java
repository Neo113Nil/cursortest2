package ru.ozon.app.android.cart.common.presentation.addToCart;

import AJ.c;
import AJ.d;
import Bc.i;
import Bc.m;
import Bc.n;
import Bc.o;
import DJ.e;
import WZ.l;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import io.reactivex.C;
import io.reactivex.f;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartParams;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00102\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "refreshController", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;)V", "", "", "actionParams", "", "widgetId", "", "addToCart", "(Ljava/util/Map;Ljava/lang/Long;)V", "LWZ/l;", "tokenizedAnalytics", "attach", "(LWZ/l;)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel$Result;", "_state", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "state", "Landroidx/lifecycle/P;", "getState", "()Landroidx/lifecycle/P;", "Companion", "Result", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddToCartViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final V<Result> _state;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final CartEventsController refreshController;

    @NotNull
    private final P<Result> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel$Companion;", "", "<init>", "()V", "ADD_TO_CART_PARAMS_KEY", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel$Result;", "", "", "inProgress", "", "", "actionParams", "<init>", "(ZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getInProgress", "()Z", "Ljava/util/Map;", "getActionParams", "()Ljava/util/Map;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {
        private final Map<String, String> actionParams;
        private final boolean inProgress;

        public Result(boolean z11, Map<String, String> map) {
            this.inProgress = z11;
            this.actionParams = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.inProgress == result.inProgress && Intrinsics.d(this.actionParams, result.actionParams);
        }

        public final Map<String, String> getActionParams() {
            return this.actionParams;
        }

        public final boolean getInProgress() {
            return this.inProgress;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.inProgress) * 31;
            Map<String, String> map = this.actionParams;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "Result(inProgress=" + this.inProgress + ", actionParams=" + this.actionParams + ")";
        }
    }

    public AddToCartViewModel(@NotNull CartService cartService, @NotNull JsonParser jsonDeserializer, @NotNull CartEventsController refreshController) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(refreshController, "refreshController");
        this.cartService = cartService;
        this.jsonDeserializer = jsonDeserializer;
        this.refreshController = refreshController;
        V<Result> v11 = new V<>();
        this._state = v11;
        this.state = v11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToCartParams addToCart$lambda$0(AddToCartViewModel addToCartViewModel, String str) {
        return (AddToCartParams) addToCartViewModel.jsonDeserializer.fromJson(str, AddToCartParams.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C addToCart$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f addToCart$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (f) function1.invoke(p02);
    }

    public final void addToCart(Map<String, String> actionParams, Long widgetId) {
        final String str;
        if (actionParams == null || (str = actionParams.get("postData")) == null) {
            return;
        }
        n nVar = new n(new m(new i(new o(new Callable() { // from class: xn.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AddToCartParams addToCart$lambda$0;
                addToCart$lambda$0 = AddToCartViewModel.addToCart$lambda$0(AddToCartViewModel.this, str);
                return addToCart$lambda$0;
            }
        }).j(Mc.a.b()), new c(new AddToCartViewModel$addToCart$2(this, actionParams), 11)), new d(new AddToCartViewModel$addToCart$3(this, widgetId), 11)), new e(new AddToCartViewModel$addToCart$4(this), 13));
        Intrinsics.checkNotNullExpressionValue(nVar, "flatMapCompletable(...)");
        RxExtKt.subscribeBy$default(nVar, null, new AddToCartViewModel$addToCart$5(this, actionParams), 1, null);
    }

    public final void attach(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService.attach(tokenizedAnalytics);
    }

    @NotNull
    public final P<Result> getState() {
        return this.state;
    }
}
