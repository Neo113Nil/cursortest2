package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.AppLovinCommunicatorBridge;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: MaxAdRevenueObserver.kt */
/* loaded from: classes14.dex */
public final class MaxAdRevenueObserver {
    private static final String COMMUNICATOR_ID = "ilrd_observer";
    public static final Companion Companion = new Companion(null);
    private static final String MAX_REVENUE_EVENTS_TOPIC = "max_revenue_events";
    private final AppLovinCommunicatorBridge communicatorBridge;
    private final MaxAdRevenueCommunicatorProxyFactory communicatorProxyFactory;
    private Object communicatorSubscriber;
    private boolean isStarted;
    private final Logger logger;
    private final MaxAdRevenueListener revenueListener;
    private final SessionRepository sessionRepository;

    /* compiled from: MaxAdRevenueObserver.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public MaxAdRevenueObserver(SessionRepository sessionRepository, Logger logger, AppLovinCommunicatorBridge appLovinCommunicatorBridge, MaxAdRevenueListener maxAdRevenueListener, MaxAdRevenueCommunicatorProxyFactory maxAdRevenueCommunicatorProxyFactory) {
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
                    if (collectIlrData) {
                        Logger.DefaultImpls.trace$default(this.logger, "ILRD observer already started", null, 2, null);
                    } else {
                        Logger.DefaultImpls.trace$default(this.logger, "ILRD collection feature flag changed to disabled, stopping", null, 2, null);
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
                s3q0 s3q0Var = s3q0.a;
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
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }
}
