package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import He.b;
import Kk.c;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.common.internal.ImagesContract;
import h3.C6788a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.api.ProductsInBotV2Api;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain.ProductsInBotV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001)B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR)\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u001d0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\"8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/ProductsInBotV2Api;", "productsInBotV2Api", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/ProductsInBotV2Api;)V", "", "skuId", "", "qty", "", "setProduct", "(JI)V", "deleteProduct", "(J)V", "", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "items", "updateProductList", "(Ljava/util/List;)V", "", ImagesContract.URL, "sendProductsToBot", "(Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/ProductsInBotV2Api;", "", "products", "Ljava/util/Map;", "Landroidx/lifecycle/V;", "Lkotlin/Pair;", "countOfSelectedProducts", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action;", "requestStatus", "Landroidx/lifecycle/P;", "countOfProducts", "Landroidx/lifecycle/P;", "getCountOfProducts", "()Landroidx/lifecycle/P;", "requestState", "getRequestState", "Action", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotV2ViewModel extends w0 {

    @NotNull
    private final P<Pair<Integer, Long>> countOfProducts;

    @NotNull
    private final V<Pair<Integer, Long>> countOfSelectedProducts;

    @NotNull
    private final Map<Long, Integer> products;

    @NotNull
    private final ProductsInBotV2Api productsInBotV2Api;

    @NotNull
    private final P<Action> requestState;

    @NotNull
    private final V<Action> requestStatus;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action;", "", "<init>", "()V", "Error", "Success", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action$Error;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action$Success;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action$Error;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action;", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action$Success;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public ProductsInBotV2ViewModel(@NotNull ProductsInBotV2Api productsInBotV2Api) {
        Intrinsics.checkNotNullParameter(productsInBotV2Api, "productsInBotV2Api");
        this.productsInBotV2Api = productsInBotV2Api;
        this.products = new LinkedHashMap();
        V<Pair<Integer, Long>> v11 = new V<>(new Pair(0, 0L));
        this.countOfSelectedProducts = v11;
        V<Action> v12 = new V<>();
        this.requestStatus = v12;
        this.countOfProducts = v11;
        this.requestState = v12;
    }

    public final void deleteProduct(long skuId) {
        this.products.remove(Long.valueOf(skuId));
        this.countOfSelectedProducts.postValue(new Pair<>(Integer.valueOf(this.products.size()), Long.valueOf(skuId)));
    }

    @NotNull
    public final P<Pair<Integer, Long>> getCountOfProducts() {
        return this.countOfProducts;
    }

    @NotNull
    public final P<Action> getRequestState() {
        return this.requestState;
    }

    public final void sendProductsToBot(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new ProductsInBotV2ViewModel$sendProductsToBot$1(this, url, null), 2);
    }

    public final void setProduct(long skuId, int qty) {
        this.products.put(Long.valueOf(skuId), Integer.valueOf(qty));
        this.countOfSelectedProducts.postValue(new Pair<>(Integer.valueOf(this.products.size()), Long.valueOf(skuId)));
    }

    public final void updateProductList(@NotNull List<ProductsInBotV2VO.ItemVO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        for (ProductsInBotV2VO.ItemVO itemVO : items) {
            if (this.products.keySet().contains(Long.valueOf(itemVO.getSkuId()))) {
                this.products.put(Long.valueOf(itemVO.getSkuId()), Integer.valueOf(itemVO.getCurrentQuantity()));
            }
        }
    }
}
