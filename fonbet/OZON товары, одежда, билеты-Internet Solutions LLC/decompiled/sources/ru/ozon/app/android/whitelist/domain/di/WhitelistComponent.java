package ru.ozon.app.android.whitelist.domain.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/whitelist/domain/di/WhitelistComponent;", "Lru/ozon/app/android/network/whitelist/di/WhitelistComponentApi;", "Factory", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WhitelistComponent extends WhitelistComponentApi {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/whitelist/domain/di/WhitelistComponent$Factory;", "", "create", "Lru/ozon/app/android/whitelist/domain/di/WhitelistComponent;", "networkComponent", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "storageComponent", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "cdnHostManager", "Lru/ozon/app/android/cdn/host/manager/di/CdnHostManagerComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "appType", "Lru/ozon/app/android/utils/AppType;", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        WhitelistComponent create(@NotNull NetworkComponentApi networkComponent, @NotNull StorageComponentApi storageComponent, @NotNull CdnHostManagerComponentApi cdnHostManager, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull AppType appType);
    }
}
