package Wj;

import Ej.q;
import kotlin.jvm.internal.Intrinsics;
import zendesk.core.CustomNetworkConfig;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public final class a {
    public final i a(q talkRestServiceProvider) {
        RestServiceProvider restServiceProvider;
        CustomNetworkConfig customNetworkConfig;
        Intrinsics.checkNotNullParameter(talkRestServiceProvider, "talkRestServiceProvider");
        restServiceProvider = talkRestServiceProvider.f3204a;
        customNetworkConfig = talkRestServiceProvider.f3206c;
        Object createRestService = restServiceProvider.createRestService(i.class, "1.4.0", "Talk", customNetworkConfig);
        Intrinsics.checkNotNullExpressionValue(createRestService, "createRestService(...)");
        return (i) createRestService;
    }
}
