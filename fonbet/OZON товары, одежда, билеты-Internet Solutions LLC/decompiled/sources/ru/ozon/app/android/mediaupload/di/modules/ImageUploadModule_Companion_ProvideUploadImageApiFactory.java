package ru.ozon.app.android.mediaupload.di.modules;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.mediaupload.image.data.UploadImageApi;

/* loaded from: classes12.dex */
public final class ImageUploadModule_Companion_ProvideUploadImageApiFactory implements e<UploadImageApi> {
    public static UploadImageApi provideUploadImageApi(Retrofit retrofit) {
        UploadImageApi provideUploadImageApi = ImageUploadModule.INSTANCE.provideUploadImageApi(retrofit);
        j.d(provideUploadImageApi);
        return provideUploadImageApi;
    }
}
