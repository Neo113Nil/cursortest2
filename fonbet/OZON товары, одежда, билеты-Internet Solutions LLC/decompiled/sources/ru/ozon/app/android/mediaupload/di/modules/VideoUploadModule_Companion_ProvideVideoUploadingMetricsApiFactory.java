package ru.ozon.app.android.mediaupload.di.modules;

import Jb.e;
import Jb.j;
import We.E;
import retrofit2.Retrofit;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingMetricsApi;

/* loaded from: classes12.dex */
public final class VideoUploadModule_Companion_ProvideVideoUploadingMetricsApiFactory implements e<VideoUploadingMetricsApi> {
    public static VideoUploadingMetricsApi provideVideoUploadingMetricsApi(E e11, String str, Retrofit retrofit) {
        VideoUploadingMetricsApi provideVideoUploadingMetricsApi = VideoUploadModule.INSTANCE.provideVideoUploadingMetricsApi(e11, str, retrofit);
        j.d(provideVideoUploadingMetricsApi);
        return provideVideoUploadingMetricsApi;
    }
}
