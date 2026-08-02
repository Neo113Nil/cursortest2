package ru.ozon.app.android.miniapp.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.miniapp.MiniAppWebActivity;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.web.di.WebComponentApi;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/miniapp/di/MiniAppWebActivityComponent;", "", "inject", "", "screen", "Lru/ozon/app/android/miniapp/MiniAppWebActivity;", "getWebViewRendererProcessCrashHandler", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "Factory", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MiniAppWebActivityComponent {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/miniapp/di/MiniAppWebActivityComponent$Factory;", "", "create", "Lru/ozon/app/android/miniapp/di/MiniAppWebActivityComponent;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "whitelistComponent", "Lru/ozon/app/android/network/whitelist/di/WhitelistComponentApi;", "webComponentApi", "Lru/ozon/app/android/web/di/WebComponentApi;", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MiniAppWebActivityComponent create(@NotNull StorageComponentApi storageComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull WhitelistComponentApi whitelistComponent, @NotNull WebComponentApi webComponentApi);
    }

    @NotNull
    WebViewRendererProcessCrashHandler getWebViewRendererProcessCrashHandler();

    void inject(@NotNull MiniAppWebActivity screen);
}
