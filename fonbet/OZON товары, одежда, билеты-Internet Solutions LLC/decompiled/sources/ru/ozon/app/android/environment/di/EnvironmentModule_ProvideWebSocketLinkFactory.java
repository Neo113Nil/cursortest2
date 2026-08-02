package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideWebSocketLinkFactory implements e<String> {
    public static String provideWebSocketLink(EnvironmentModule environmentModule, PDPHosts pDPHosts) {
        String provideWebSocketLink = environmentModule.provideWebSocketLink(pDPHosts);
        j.d(provideWebSocketLink);
        return provideWebSocketLink;
    }
}
