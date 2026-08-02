package ru.ozon.app.android.mediaupload.di.modules;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;
import ru.ozon.app.android.storage.hosts.CoreHosts;

/* loaded from: classes12.dex */
public final class VideoUploadModule_Companion_ProvidePDPHostsFactory implements e<PDPHosts> {
    public static PDPHosts providePDPHosts(CoreHosts coreHosts) {
        PDPHosts providePDPHosts = VideoUploadModule.INSTANCE.providePDPHosts(coreHosts);
        j.d(providePDPHosts);
        return providePDPHosts;
    }
}
