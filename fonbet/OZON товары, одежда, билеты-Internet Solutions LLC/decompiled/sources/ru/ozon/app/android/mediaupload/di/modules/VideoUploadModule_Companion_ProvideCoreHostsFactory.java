package ru.ozon.app.android.mediaupload.di.modules;

import Ib.a;
import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.CoreHosts;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes12.dex */
public final class VideoUploadModule_Companion_ProvideCoreHostsFactory implements e<CoreHosts> {
    public static CoreHosts provideCoreHosts(a<EnvironmentService> aVar, AppType appType) {
        CoreHosts provideCoreHosts = VideoUploadModule.INSTANCE.provideCoreHosts(aVar, appType);
        j.d(provideCoreHosts);
        return provideCoreHosts;
    }
}
