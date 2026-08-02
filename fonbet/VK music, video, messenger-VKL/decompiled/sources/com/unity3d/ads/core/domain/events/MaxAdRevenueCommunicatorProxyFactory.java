package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;

/* compiled from: MaxAdRevenueCommunicatorProxyFactory.kt */
/* loaded from: classes14.dex */
public final class MaxAdRevenueCommunicatorProxyFactory {
    private final Logger logger;

    public MaxAdRevenueCommunicatorProxyFactory(Logger logger) {
        this.logger = logger;
    }

    public final CommunicatorSubscriberProxy create(String str, String str2, CommunicatorSubscriberProxy.CommunicatorMessageListener communicatorMessageListener) {
        return new CommunicatorSubscriberProxy(str, str2, communicatorMessageListener, this.logger);
    }
}
