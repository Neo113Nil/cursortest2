package ru.ozon.app.android.analytics.store;

import Sc.InterfaceC3999a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.store.OzonInstallStore;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH'J\b\u0010\r\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "", "installStore", "Lru/ozon/app/android/analytics/store/OzonInstallStore;", "getInstallStore", "()Lru/ozon/app/android/analytics/store/OzonInstallStore;", "appStores", "", "Lru/ozon/app/android/analytics/store/OzonInstallStore$Known;", "getAppStores", "()Ljava/util/List;", "retrievePackageName", "", "retrieveStoreName", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppStoreInfoProvider {
    @NotNull
    List<OzonInstallStore.Known> getAppStores();

    @NotNull
    OzonInstallStore getInstallStore();

    @InterfaceC3999a
    String retrievePackageName();

    @NotNull
    String retrieveStoreName();
}
