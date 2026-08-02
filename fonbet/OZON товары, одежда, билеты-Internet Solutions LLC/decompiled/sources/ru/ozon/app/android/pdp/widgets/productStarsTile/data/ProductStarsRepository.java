package ru.ozon.app.android.pdp.widgets.productStarsTile.data;

import He.b;
import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/productStarsTile/data/ProductStarsRepository;", "", "Lretrofit2/Retrofit;", "retrofit", "<init>", "(Lretrofit2/Retrofit;)V", "", "productId", "Lru/ozon/app/android/utils/Result;", "getStarsBalance", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/pdp/widgets/productStarsTile/data/ProductStarsApi;", "kotlin.jvm.PlatformType", "api$delegate", "LSc/j;", "getApi", "()Lru/ozon/app/android/pdp/widgets/productStarsTile/data/ProductStarsApi;", "api", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductStarsRepository {

    /* renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j api;

    public ProductStarsRepository(@NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.api = k.b(new ProductStarsRepository$api$2(retrofit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductStarsApi getApi() {
        return (ProductStarsApi) this.api.getValue();
    }

    public final Object getStarsBalance(@NotNull String str, @NotNull d<? super Result<String>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new ProductStarsRepository$getStarsBalance$$inlined$runCatchingWithDispatchers$default$1(this, null, str), dVar);
    }
}
