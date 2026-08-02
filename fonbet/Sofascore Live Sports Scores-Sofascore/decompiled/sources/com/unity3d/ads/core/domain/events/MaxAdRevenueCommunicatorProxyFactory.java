package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;", "", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/log/Logger;)V", "create", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;", "communicatorId", "", "topic", "messageListener", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaxAdRevenueCommunicatorProxyFactory {

    @NotNull
    private final Logger logger;

    public MaxAdRevenueCommunicatorProxyFactory(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    @NotNull
    public final CommunicatorSubscriberProxy create(@NotNull String communicatorId, @NotNull String topic, @NotNull CommunicatorSubscriberProxy.CommunicatorMessageListener messageListener) {
        communicatorId.getClass();
        topic.getClass();
        messageListener.getClass();
        return new CommunicatorSubscriberProxy(communicatorId, topic, messageListener, this.logger);
    }
}
