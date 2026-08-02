package ru.ozon.app.android.mediaupload.di.modules;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingComposerApi;

/* loaded from: classes12.dex */
public final class VideoUploadModule_Companion_ProvideVideoUploadingComposerApiFactory implements e<VideoUploadingComposerApi> {
    public static VideoUploadingComposerApi provideVideoUploadingComposerApi(Retrofit retrofit) {
        VideoUploadingComposerApi provideVideoUploadingComposerApi = VideoUploadModule.INSTANCE.provideVideoUploadingComposerApi(retrofit);
        j.d(provideVideoUploadingComposerApi);
        return provideVideoUploadingComposerApi;
    }
}
