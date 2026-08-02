package ru.ozon.app.android.mediaupload.di.modules;

import Jb.e;
import Jb.j;
import We.E;
import ru.ozon.app.android.mediaupload.di.VideoUploadingOkHttpProvider;

/* loaded from: classes12.dex */
public final class VideoUploadModule_Companion_ProvideUploadingOkHttpFactory implements e<E> {
    public static E provideUploadingOkHttp(VideoUploadingOkHttpProvider videoUploadingOkHttpProvider) {
        E provideUploadingOkHttp = VideoUploadModule.INSTANCE.provideUploadingOkHttp(videoUploadingOkHttpProvider);
        j.d(provideUploadingOkHttp);
        return provideUploadingOkHttp;
    }
}
