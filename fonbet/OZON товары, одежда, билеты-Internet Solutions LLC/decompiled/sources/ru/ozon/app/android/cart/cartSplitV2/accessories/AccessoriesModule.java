package ru.ozon.app.android.cart.cartSplitV2.accessories;

import Ve.C4598rp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesModule;", "", "<init>", "()V", "provideSkuThinScrollFetchApi", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesActionApi;", "retrofit", "Lretrofit2/Retrofit;", "provideSkuThinScrollFetchApi$cart_prodGoogleAllVendorsRelease", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccessoriesModule {
    @NotNull
    public final AccessoriesActionApi provideSkuThinScrollFetchApi$cart_prodGoogleAllVendorsRelease(@NotNull Retrofit retrofit) {
        return (AccessoriesActionApi) C4598rp.b(retrofit, "retrofit", AccessoriesActionApi.class, "create(...)");
    }
}
