package ru.ozon.app.android.account.favorites.seller.api;

import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/favorites/seller/api/SellerFavoriteApi;", "", "", "", "ids", "Lio/reactivex/b;", "addSellersFavorite", "(Ljava/util/List;)Lio/reactivex/b;", "Lru/ozon/app/android/account/favorites/seller/api/SellerFavoriteRequest;", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/account/favorites/seller/api/SellerActionResponse;", "addSellerFavoriteWithResult", "(Lru/ozon/app/android/account/favorites/seller/api/SellerFavoriteRequest;)Lio/reactivex/y;", "removeSellerFavoriteWithResult", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SellerFavoriteApi {
    @POST("composer-api.bx/_action/favoriteSellerAdd")
    @NotNull
    y<SellerActionResponse> addSellerFavoriteWithResult(@Body @NotNull SellerFavoriteRequest request);

    @POST("composer-api.bx/_action/sisLike")
    @NotNull
    AbstractC7094b addSellersFavorite(@Body @NotNull List<Long> ids);

    @POST("composer-api.bx/_action/favoriteSellerRemove")
    @NotNull
    y<SellerActionResponse> removeSellerFavoriteWithResult(@Body @NotNull SellerFavoriteRequest request);
}
