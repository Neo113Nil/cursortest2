package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation;

import He.b;
import Kk.c;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.api.ProductsInBotApi;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/ProductsInBotApi;", "productsInBotApi", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/ProductsInBotApi;)V", "", "onCleared", "()V", "", "skuId", "", "qty", "setProduct", "(JI)V", "deleteProduct", "(J)V", "sendProductsToBot", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/ProductsInBotApi;", "", "products", "Ljava/util/Map;", "Landroidx/lifecycle/V;", "countOfSelectedProducts", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action;", "requestStatus", "Landroidx/lifecycle/P;", "countOfProducts", "Landroidx/lifecycle/P;", "getCountOfProducts", "()Landroidx/lifecycle/P;", "requestState", "getRequestState", "Action", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotViewModel extends w0 {

    @NotNull
    private final P<Integer> countOfProducts;

    @NotNull
    private final V<Integer> countOfSelectedProducts;

    @NotNull
    private final Map<Long, Integer> products;

    @NotNull
    private final ProductsInBotApi productsInBotApi;

    @NotNull
    private final P<Action> requestState;

    @NotNull
    private final V<Action> requestStatus;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action;", "", "<init>", "()V", "Error", "Success", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action$Error;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action$Success;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action$Error;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action;", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action$Success;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull AtomAction action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.action, ((Success) other).action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("Success(action=", ")", this.action);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public ProductsInBotViewModel(@NotNull ProductsInBotApi productsInBotApi) {
        Intrinsics.checkNotNullParameter(productsInBotApi, "productsInBotApi");
        this.productsInBotApi = productsInBotApi;
        this.products = new LinkedHashMap();
        V<Integer> v11 = new V<>(0);
        this.countOfSelectedProducts = v11;
        V<Action> v12 = new V<>();
        this.requestStatus = v12;
        this.countOfProducts = v11;
        this.requestState = v12;
    }

    public final void deleteProduct(long skuId) {
        this.products.remove(Long.valueOf(skuId));
        this.countOfSelectedProducts.postValue(Integer.valueOf(this.products.size()));
    }

    @NotNull
    public final P<Integer> getCountOfProducts() {
        return this.countOfProducts;
    }

    @NotNull
    public final P<Action> getRequestState() {
        return this.requestState;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        C5415f.a(this).dispose();
    }

    public final void sendProductsToBot() {
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new ProductsInBotViewModel$sendProductsToBot$1(this, null), 2);
    }

    public final void setProduct(long skuId, int qty) {
        this.products.put(Long.valueOf(skuId), Integer.valueOf(qty));
        this.countOfSelectedProducts.postValue(Integer.valueOf(this.products.size()));
    }
}
