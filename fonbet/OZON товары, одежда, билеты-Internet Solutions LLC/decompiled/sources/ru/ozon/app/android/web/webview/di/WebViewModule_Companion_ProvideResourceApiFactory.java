package ru.ozon.app.android.web.webview.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.web.webview.cache.service.CacheManifestApi;

/* loaded from: classes2.dex */
public final class WebViewModule_Companion_ProvideResourceApiFactory implements e<CacheManifestApi> {
    public static CacheManifestApi provideResourceApi(Retrofit retrofit) {
        CacheManifestApi provideResourceApi = WebViewModule.INSTANCE.provideResourceApi(retrofit);
        j.d(provideResourceApi);
        return provideResourceApi;
    }
}
