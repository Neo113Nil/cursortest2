package ru.ozon.app.android.debugmenu.servicemesh.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.debugmenu.servicemesh.DebugToolsActivity;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/debugmenu/servicemesh/di/DebugToolsComponent;", "", "inject", "", "screen", "Lru/ozon/app/android/debugmenu/servicemesh/DebugToolsActivity;", "Factory", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DebugToolsComponent {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/debugmenu/servicemesh/di/DebugToolsComponent$Factory;", "", "create", "Lru/ozon/app/android/debugmenu/servicemesh/di/DebugToolsComponent;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        DebugToolsComponent create(@NotNull StorageComponentApi storageComponentApi, @NotNull NavigationComponentApi navigationComponentApi);
    }

    void inject(@NotNull DebugToolsActivity screen);
}
