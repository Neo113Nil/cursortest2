package ru.ozon.app.android.storage.entity.sellerfavorites;

import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\bH'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH'¢\u0006\u0004\b\u0011\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteDao;", "", "<init>", "()V", "", "", "getSellerFavorites", "()Ljava/util/List;", "Lio/reactivex/y;", "getSellerFavoritesAsync", "()Lio/reactivex/y;", "Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteEntity;", "sellerFavoriteEntity", "", "_addSellerFavorite", "(Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteEntity;)V", "_removeSellerFavorite", "removeSellerFavorites", "sellerId", "addSellerFavorite", "(J)V", "removeSellerFavorite", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SellerFavoriteDao {
    public abstract void _addSellerFavorite(@NotNull SellerFavoriteEntity sellerFavoriteEntity);

    public abstract void _removeSellerFavorite(@NotNull SellerFavoriteEntity sellerFavoriteEntity);

    public final void addSellerFavorite(long sellerId) {
        _addSellerFavorite(new SellerFavoriteEntity(sellerId));
    }

    @NotNull
    public abstract List<Long> getSellerFavorites();

    @NotNull
    public abstract y<List<Long>> getSellerFavoritesAsync();

    public final void removeSellerFavorite(long sellerId) {
        _removeSellerFavorite(new SellerFavoriteEntity(sellerId));
    }

    public abstract void removeSellerFavorites();
}
