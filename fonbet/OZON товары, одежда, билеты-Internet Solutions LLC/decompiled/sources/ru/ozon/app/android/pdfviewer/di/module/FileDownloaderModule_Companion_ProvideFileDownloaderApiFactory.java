package ru.ozon.app.android.pdfviewer.di.module;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.pdfviewer.FileDownloaderApi;

/* loaded from: classes13.dex */
public final class FileDownloaderModule_Companion_ProvideFileDownloaderApiFactory implements e<FileDownloaderApi> {
    public static FileDownloaderApi provideFileDownloaderApi(Retrofit retrofit) {
        FileDownloaderApi provideFileDownloaderApi = FileDownloaderModule.INSTANCE.provideFileDownloaderApi(retrofit);
        j.d(provideFileDownloaderApi);
        return provideFileDownloaderApi;
    }
}
