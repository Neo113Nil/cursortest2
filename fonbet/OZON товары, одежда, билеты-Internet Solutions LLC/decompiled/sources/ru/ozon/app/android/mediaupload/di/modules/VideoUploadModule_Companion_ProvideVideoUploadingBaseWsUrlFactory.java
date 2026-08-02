package ru.ozon.app.android.mediaupload.di.modules;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;

/* loaded from: classes12.dex */
public final class VideoUploadModule_Companion_ProvideVideoUploadingBaseWsUrlFactory implements e<String> {
    public static String provideVideoUploadingBaseWsUrl(PDPHosts pDPHosts) {
        String provideVideoUploadingBaseWsUrl = VideoUploadModule.INSTANCE.provideVideoUploadingBaseWsUrl(pDPHosts);
        j.d(provideVideoUploadingBaseWsUrl);
        return provideVideoUploadingBaseWsUrl;
    }
}
