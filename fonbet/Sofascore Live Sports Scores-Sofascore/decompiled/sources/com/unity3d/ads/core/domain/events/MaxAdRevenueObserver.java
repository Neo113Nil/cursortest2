package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.AppLovinCommunicatorBridge;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0011\u001a\u00020\u0012H\u0086\u0002J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "communicatorBridge", "Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;", "revenueListener", "Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "communicatorProxyFactory", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;)V", "communicatorSubscriber", "isStarted", "", "invoke", "", "stop", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaxAdRevenueObserver {

    @NotNull
    private static final String COMMUNICATOR_ID = "ilrd_observer";

    @NotNull
    private static final String MAX_REVENUE_EVENTS_TOPIC = "max_revenue_events";

    @NotNull
    private final AppLovinCommunicatorBridge communicatorBridge;

    @NotNull
    private final MaxAdRevenueCommunicatorProxyFactory communicatorProxyFactory;

    @Nullable
    private Object communicatorSubscriber;
    private boolean isStarted;

    @NotNull
    private final Logger logger;

    @NotNull
    private final MaxAdRevenueListener revenueListener;

    @NotNull
    private final SessionRepository sessionRepository;

    public MaxAdRevenueObserver(@NotNull SessionRepository sessionRepository, @NotNull Logger logger, @NotNull AppLovinCommunicatorBridge appLovinCommunicatorBridge, @NotNull MaxAdRevenueListener maxAdRevenueListener, @NotNull MaxAdRevenueCommunicatorProxyFactory maxAdRevenueCommunicatorProxyFactory) {
        sessionRepository.getClass();
        logger.getClass();
        appLovinCommunicatorBridge.getClass();
        maxAdRevenueListener.getClass();
        maxAdRevenueCommunicatorProxyFactory.getClass();
        this.sessionRepository = sessionRepository;
        this.logger = logger;
        this.communicatorBridge = appLovinCommunicatorBridge;
        this.revenueListener = maxAdRevenueListener;
        this.communicatorProxyFactory = maxAdRevenueCommunicatorProxyFactory;
    }

    public final void invoke() {
        synchronized (this) {
            try {
                boolean collectIlrData = this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectIlrData();
                if (this.isStarted) {
                    Logger logger = this.logger;
                    if (collectIlrData) {
                        Logger.DefaultImpls.trace$default(logger, "ILRD observer already started", null, 2, null);
                    } else {
                        Logger.DefaultImpls.trace$default(logger, "ILRD collection feature flag changed to disabled, stopping", null, 2, null);
                        stop();
                    }
                    return;
                }
                if (!collectIlrData) {
                    Logger.DefaultImpls.trace$default(this.logger, "ILRD collection feature flag is disabled", null, 2, null);
                    return;
                }
                try {
                    try {
                        Object subscribe = this.communicatorBridge.subscribe(this.communicatorProxyFactory.create(COMMUNICATOR_ID, MAX_REVENUE_EVENTS_TOPIC, new MaxAdRevenueObserver$invoke$1$proxy$1(this.revenueListener)), MAX_REVENUE_EVENTS_TOPIC);
                        if (subscribe != null) {
                            this.communicatorSubscriber = subscribe;
                            this.isStarted = true;
                            Logger.DefaultImpls.trace$default(this.logger, "Successfully started ad revenue automatic collection", null, 2, null);
                        } else {
                            Logger.DefaultImpls.trace$default(this.logger, "Mediation SDK not available, automatic collection not started", null, 2, null);
                        }
                    } catch (ClassNotFoundException unused) {
                        Logger.DefaultImpls.trace$default(this.logger, "Mediation SDK not found, skipping automatic collection", null, 2, null);
                    }
                } catch (NoSuchMethodException e) {
                    this.logger.trace("Communicator method not found, SDK version may be incompatible", e);
                } catch (Exception e2) {
                    this.logger.trace("Failed to start ad revenue collection", e2);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void stop() {
        synchronized (this) {
            if (this.isStarted) {
                Object obj = this.communicatorSubscriber;
                if (obj != null) {
                    try {
                        this.communicatorBridge.unsubscribe(obj, MAX_REVENUE_EVENTS_TOPIC);
                        Logger.DefaultImpls.trace$default(this.logger, "Unsubscribed from revenue events", null, 2, null);
                    } catch (Exception e) {
                        this.logger.trace("Failed to unsubscribe from revenue events", e);
                    }
                    this.communicatorSubscriber = null;
                }
                this.isStarted = false;
                Unit unit = Unit.a;
            }
        }
    }
}
