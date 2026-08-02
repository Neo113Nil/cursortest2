package ru.ozon.app.android.mediaupload.di.modules;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;

/* loaded from: classes12.dex */
public final class VideoUploadModule_Companion_ProvideVideoUploadingBaseHttpUrlFactory implements e<String> {
    public static String provideVideoUploadingBaseHttpUrl(PDPHosts pDPHosts) {
        String provideVideoUploadingBaseHttpUrl = VideoUploadModule.INSTANCE.provideVideoUploadingBaseHttpUrl(pDPHosts);
        j.d(provideVideoUploadingBaseHttpUrl);
        return provideVideoUploadingBaseHttpUrl;
    }
}
