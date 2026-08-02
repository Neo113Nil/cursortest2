package ru.ozon.app.android.network.dependency;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.history.NetworkHistoryModel;
import ru.ozon.app.android.network.history.NetworkHistoryService;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryDao;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryEntity;
import ru.ozon.app.android.storage.user.UserStatusStorage;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/network/dependency/NetworkHistoryServiceImpl;", "Lru/ozon/app/android/network/history/NetworkHistoryService;", "networkHistoryDao", "Lru/ozon/app/android/storage/entity/network/NetworkHistoryDao;", "userStatusStorage", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "<init>", "(Lru/ozon/app/android/storage/entity/network/NetworkHistoryDao;Lru/ozon/app/android/storage/user/UserStatusStorage;)V", ProductAction.ACTION_ADD, "", "model", "Lru/ozon/app/android/network/history/NetworkHistoryModel;", "deleteNotRelevant", "canProcess", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkHistoryServiceImpl implements NetworkHistoryService {

    @NotNull
    private final NetworkHistoryDao networkHistoryDao;

    @NotNull
    private final UserStatusStorage userStatusStorage;

    public NetworkHistoryServiceImpl(@NotNull NetworkHistoryDao networkHistoryDao, @NotNull UserStatusStorage userStatusStorage) {
        Intrinsics.checkNotNullParameter(networkHistoryDao, "networkHistoryDao");
        Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
        this.networkHistoryDao = networkHistoryDao;
        this.userStatusStorage = userStatusStorage;
    }

    @Override // ru.ozon.app.android.network.history.NetworkHistoryService
    public void add(@NotNull NetworkHistoryModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.networkHistoryDao.add(new NetworkHistoryEntity(0L, model.getTraceId(), model.getUrl(), model.getResponseTime(), model.getTime(), 1, null));
    }

    @Override // ru.ozon.app.android.network.history.NetworkHistoryService
    public boolean canProcess() {
        return this.userStatusStorage.isOzonQa();
    }

    @Override // ru.ozon.app.android.network.history.NetworkHistoryService
    public void deleteNotRelevant() {
        this.networkHistoryDao.deleteNotRelevant();
    }
}
