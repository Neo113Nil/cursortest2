package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.api.B2bDownloadFileApi;

/* loaded from: classes12.dex */
public final class B2bDownloadFileModule_Companion_ProvideB2bDownloadFileApiFactory implements e<B2bDownloadFileApi> {
    public static B2bDownloadFileApi provideB2bDownloadFileApi(Retrofit retrofit) {
        B2bDownloadFileApi provideB2bDownloadFileApi = B2bDownloadFileModule.INSTANCE.provideB2bDownloadFileApi(retrofit);
        j.d(provideB2bDownloadFileApi);
        return provideB2bDownloadFileApi;
    }
}
