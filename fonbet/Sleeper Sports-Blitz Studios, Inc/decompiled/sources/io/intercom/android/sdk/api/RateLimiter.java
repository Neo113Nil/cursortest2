package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* loaded from: classes9.dex */
class RateLimiter {
    private final AppConfig appConfig;
    private int limitedRequestCount;
    private long periodStartTimestamp;
    private final TimeProvider timeProvider;
    private final Twig twig;

    RateLimiter(AppConfig appConfig) {
        this(appConfig, TimeProvider.SYSTEM);
    }

    RateLimiter(AppConfig appConfig, TimeProvider timeProvider) {
        this.twig = LumberMill.getLogger();
        this.appConfig = appConfig;
        this.timeProvider = timeProvider;
    }

    void recordRequest() {
        if (!isInsideCurrentTimePeriod()) {
            this.periodStartTimestamp = this.timeProvider.currentTimeMillis();
            this.limitedRequestCount = 0;
        }
        this.limitedRequestCount++;
    }

    void logError() {
        this.twig.e("Your app is being rate limited because you're performing too many requests per minute", new Object[0]);
    }

    boolean isLimited() {
        return isInsideCurrentTimePeriod() && hasReachedMaxCount();
    }

    private boolean isInsideCurrentTimePeriod() {
        return this.timeProvider.currentTimeMillis() - this.periodStartTimestamp < this.appConfig.getRateLimitPeriodMs();
    }

    private boolean hasReachedMaxCount() {
        return this.limitedRequestCount >= this.appConfig.getRateLimitCount();
    }
}
