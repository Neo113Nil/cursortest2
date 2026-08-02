package ru.ozon.app.android.mediaupload.di.modules;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;

/* loaded from: classes12.dex */
public final class VideoUploadModule_Companion_ProvideVideoUploadingMetricsBaseHttpUrlFactory implements e<String> {
    public static String provideVideoUploadingMetricsBaseHttpUrl(PDPHosts pDPHosts) {
        String provideVideoUploadingMetricsBaseHttpUrl = VideoUploadModule.INSTANCE.provideVideoUploadingMetricsBaseHttpUrl(pDPHosts);
        j.d(provideVideoUploadingMetricsBaseHttpUrl);
        return provideVideoUploadingMetricsBaseHttpUrl;
    }
}
