package ru.ozon.app.android.debugmenu.debugscreen.version.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.debugmenu.debugscreen.version.VersionActivity;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/debugmenu/debugscreen/version/di/VersionScreenComponent;", "", "inject", "", "activity", "Lru/ozon/app/android/debugmenu/debugscreen/version/VersionActivity;", "Factory", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface VersionScreenComponent {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/debugmenu/debugscreen/version/di/VersionScreenComponent$Factory;", "", "create", "Lru/ozon/app/android/debugmenu/debugscreen/version/di/VersionScreenComponent;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        VersionScreenComponent create(@NotNull StorageComponentApi storageComponentApi);
    }

    void inject(@NotNull VersionActivity activity);
}
