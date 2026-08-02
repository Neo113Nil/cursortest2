package ru.ozon.app.android.storage.entity.network;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storage/entity/network/NetworkHistoryDao;", "", "Lru/ozon/app/android/storage/entity/network/NetworkHistoryEntity;", "entity", "", ProductAction.ACTION_ADD, "(Lru/ozon/app/android/storage/entity/network/NetworkHistoryEntity;)V", "deleteNotRelevant", "()V", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NetworkHistoryDao {
    void add(@NotNull NetworkHistoryEntity entity);

    void deleteNotRelevant();
}
