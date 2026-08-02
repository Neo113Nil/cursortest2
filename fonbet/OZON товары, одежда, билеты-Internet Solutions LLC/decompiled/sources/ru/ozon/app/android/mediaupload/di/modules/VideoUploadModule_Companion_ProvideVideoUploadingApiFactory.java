package ru.ozon.app.android.mediaupload.di.modules;

import Jb.e;
import Jb.j;
import We.E;
import retrofit2.Retrofit;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingApi;

/* loaded from: classes12.dex */
public final class VideoUploadModule_Companion_ProvideVideoUploadingApiFactory implements e<VideoUploadingApi> {
    public static VideoUploadingApi provideVideoUploadingApi(E e11, String str, Retrofit retrofit) {
        VideoUploadingApi provideVideoUploadingApi = VideoUploadModule.INSTANCE.provideVideoUploadingApi(e11, str, retrofit);
        j.d(provideVideoUploadingApi);
        return provideVideoUploadingApi;
    }
}
