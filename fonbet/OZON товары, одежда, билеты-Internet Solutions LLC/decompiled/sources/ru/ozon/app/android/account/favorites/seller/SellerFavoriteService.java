package ru.ozon.app.android.account.favorites.seller;

import io.reactivex.p;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.favorites.seller.api.SellerActionResponse;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u00130\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "", "", "sellerId", "Lio/reactivex/y;", "Lru/ozon/app/android/account/favorites/seller/api/SellerActionResponse;", "addSellerFavorite", "(J)Lio/reactivex/y;", "addSellerFavoriteWithResult", "", "addSellerFavoriteLocal", "(J)V", "removeSellerFavorite", "removeSellerFavoriteWithResult", "removeSellerFavoriteLocal", "", "isSellerFavoriteLocally", "(J)Z", "Lio/reactivex/p;", "", "favoritesChangeEvents", "()Lio/reactivex/p;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SellerFavoriteService {
    @NotNull
    y<SellerActionResponse> addSellerFavorite(long sellerId);

    void addSellerFavoriteLocal(long sellerId);

    @NotNull
    y<SellerActionResponse> addSellerFavoriteWithResult(long sellerId);

    @NotNull
    p<Map<Long, Boolean>> favoritesChangeEvents();

    boolean isSellerFavoriteLocally(long sellerId);

    @NotNull
    y<SellerActionResponse> removeSellerFavorite(long sellerId);

    void removeSellerFavoriteLocal(long sellerId);

    @NotNull
    y<SellerActionResponse> removeSellerFavoriteWithResult(long sellerId);
}
