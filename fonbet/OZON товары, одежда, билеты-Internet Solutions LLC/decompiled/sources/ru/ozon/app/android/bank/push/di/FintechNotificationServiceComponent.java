package ru.ozon.app.android.bank.push.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.bank.domain.FintechLibApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/bank/push/di/FintechNotificationServiceComponent;", "Lru/ozon/app/android/bank/push/di/FintechNotificationServiceApi;", "Factory", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FintechNotificationServiceComponent extends FintechNotificationServiceApi {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/bank/push/di/FintechNotificationServiceComponent$Factory;", "", "create", "Lru/ozon/app/android/bank/push/di/FintechNotificationServiceComponent;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "fintechLibApi", "Lru/ozon/app/android/bank/domain/FintechLibApi;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        FintechNotificationServiceComponent create(@NotNull AccountComponentApi accountComponentApi, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull NetworkComponentApi networkComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull FintechLibApi fintechLibApi);
    }
}
