package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;
import ru.ozon.app.android.storage.hosts.CoreHosts;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvidePDPHostsFactory implements e<PDPHosts> {
    public static PDPHosts providePDPHosts(EnvironmentModule environmentModule, CoreHosts coreHosts) {
        PDPHosts providePDPHosts = environmentModule.providePDPHosts(coreHosts);
        j.d(providePDPHosts);
        return providePDPHosts;
    }
}
