package ru.ozon.app.android.storage.entity.network;

import J4.A;
import J4.l;
import J4.s;
import O4.f;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class NetworkHistoryDao_Impl implements NetworkHistoryDao {
    private final s __db;
    private final l<NetworkHistoryEntity> __insertionAdapterOfNetworkHistoryEntity;
    private final A __preparedStmtOfClear;
    private final A __preparedStmtOfDeleteNotRelevant;

    public NetworkHistoryDao_Impl(@NonNull s sVar) {
        this.__db = sVar;
        this.__insertionAdapterOfNetworkHistoryEntity = new l<NetworkHistoryEntity>(sVar) { // from class: ru.ozon.app.android.storage.entity.network.NetworkHistoryDao_Impl.1
            @Override // J4.A
            @NonNull
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `network_history` (`id`,`traceId`,`url`,`responseTime`,`time`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // J4.l
            public void bind(@NonNull f fVar, @NonNull NetworkHistoryEntity networkHistoryEntity) {
                fVar.m0(1, networkHistoryEntity.getId());
                if (networkHistoryEntity.getTraceId() == null) {
                    fVar.C0(2);
                } else {
                    fVar.e0(2, networkHistoryEntity.getTraceId());
                }
                fVar.e0(3, networkHistoryEntity.getUrl());
                fVar.S0(4, networkHistoryEntity.getResponseTime());
                fVar.m0(5, networkHistoryEntity.getTime());
            }
        };
        this.__preparedStmtOfDeleteNotRelevant = new A(sVar) { // from class: ru.ozon.app.android.storage.entity.network.NetworkHistoryDao_Impl.2
            @Override // J4.A
            @NonNull
            public String createQuery() {
                return "DELETE from network_history WHERE network_history.id NOT IN (SELECT id FROM network_history ORDER BY time DESC LIMIT 10)";
            }
        };
        this.__preparedStmtOfClear = new A(sVar) { // from class: ru.ozon.app.android.storage.entity.network.NetworkHistoryDao_Impl.3
            @Override // J4.A
            @NonNull
            public String createQuery() {
                return "DELETE from network_history";
            }
        };
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // ru.ozon.app.android.storage.entity.network.NetworkHistoryDao
    public void add(NetworkHistoryEntity networkHistoryEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfNetworkHistoryEntity.insert((l<NetworkHistoryEntity>) networkHistoryEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // ru.ozon.app.android.storage.entity.network.NetworkHistoryDao
    public void deleteNotRelevant() {
        this.__db.assertNotSuspendingTransaction();
        f acquire = this.__preparedStmtOfDeleteNotRelevant.acquire();
        try {
            this.__db.beginTransaction();
            try {
                acquire.C();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteNotRelevant.release(acquire);
        }
    }
}
