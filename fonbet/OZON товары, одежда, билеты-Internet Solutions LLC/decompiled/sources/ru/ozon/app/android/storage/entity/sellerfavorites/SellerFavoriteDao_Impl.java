package ru.ozon.app.android.storage.entity.sellerfavorites;

import J4.A;
import J4.k;
import J4.l;
import J4.s;
import J4.w;
import L4.b;
import O4.f;
import android.database.Cursor;
import androidx.annotation.NonNull;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class SellerFavoriteDao_Impl extends SellerFavoriteDao {
    private final s __db;
    private final k<SellerFavoriteEntity> __deletionAdapterOfSellerFavoriteEntity;
    private final l<SellerFavoriteEntity> __insertionAdapterOfSellerFavoriteEntity;
    private final A __preparedStmtOfRemoveSellerFavorites;

    public SellerFavoriteDao_Impl(@NonNull s sVar) {
        this.__db = sVar;
        this.__insertionAdapterOfSellerFavoriteEntity = new l<SellerFavoriteEntity>(sVar) { // from class: ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao_Impl.1
            @Override // J4.A
            @NonNull
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `sellerFavorite` (`id`) VALUES (?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // J4.l
            public void bind(@NonNull f fVar, @NonNull SellerFavoriteEntity sellerFavoriteEntity) {
                fVar.m0(1, sellerFavoriteEntity.getId());
            }
        };
        this.__deletionAdapterOfSellerFavoriteEntity = new k<SellerFavoriteEntity>(sVar) { // from class: ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao_Impl.2
            @Override // J4.A
            @NonNull
            protected String createQuery() {
                return "DELETE FROM `sellerFavorite` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // J4.k
            public void bind(@NonNull f fVar, @NonNull SellerFavoriteEntity sellerFavoriteEntity) {
                fVar.m0(1, sellerFavoriteEntity.getId());
            }
        };
        this.__preparedStmtOfRemoveSellerFavorites = new A(sVar) { // from class: ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao_Impl.3
            @Override // J4.A
            @NonNull
            public String createQuery() {
                return "DELETE from sellerFavorite";
            }
        };
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao
    public void _addSellerFavorite(SellerFavoriteEntity sellerFavoriteEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSellerFavoriteEntity.insert((l<SellerFavoriteEntity>) sellerFavoriteEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao
    public void _removeSellerFavorite(SellerFavoriteEntity sellerFavoriteEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSellerFavoriteEntity.handle(sellerFavoriteEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao
    public List<Long> getSellerFavorites() {
        w j11 = w.j(0, "SELECT id from sellerFavorite");
        this.__db.assertNotSuspendingTransaction();
        Cursor b11 = b.b(this.__db, j11, false);
        try {
            ArrayList arrayList = new ArrayList(b11.getCount());
            while (b11.moveToNext()) {
                arrayList.add(Long.valueOf(b11.getLong(0)));
            }
            return arrayList;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao
    public y<List<Long>> getSellerFavoritesAsync() {
        final w j11 = w.j(0, "SELECT id from sellerFavorite");
        return J4.y.a(new Callable<List<Long>>() { // from class: ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao_Impl.4
            protected void finalize() {
                j11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                Cursor b11 = b.b(SellerFavoriteDao_Impl.this.__db, j11, false);
                try {
                    ArrayList arrayList = new ArrayList(b11.getCount());
                    while (b11.moveToNext()) {
                        arrayList.add(Long.valueOf(b11.getLong(0)));
                    }
                    return arrayList;
                } finally {
                    b11.close();
                }
            }
        });
    }

    @Override // ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao
    public void removeSellerFavorites() {
        this.__db.assertNotSuspendingTransaction();
        f acquire = this.__preparedStmtOfRemoveSellerFavorites.acquire();
        try {
            this.__db.beginTransaction();
            try {
                acquire.C();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfRemoveSellerFavorites.release(acquire);
        }
    }
}
