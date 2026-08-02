package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f15196a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeProvider f15197b;

    /* renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f15198c;

    /* renamed from: d, reason: collision with root package name */
    private long f15199d;

    /* renamed from: e, reason: collision with root package name */
    private int f15200e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15201f;

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider, @NonNull String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f15200e = 1;
        this.f15199d = 0L;
        this.f15198c.saveNextSendAttemptNumber(1);
        this.f15198c.saveLastAttemptTimeSeconds(this.f15199d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f15197b.currentTimeSeconds();
        this.f15199d = currentTimeSeconds;
        this.f15200e++;
        this.f15198c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f15198c.saveNextSendAttemptNumber(this.f15200e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j = this.f15199d;
            if (j != 0) {
                TimePassedChecker timePassedChecker = this.f15196a;
                int i5 = ((1 << (this.f15200e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i10 = retryPolicyConfig.maxIntervalSeconds;
                if (i5 > i10) {
                    i5 = i10;
                }
                return timePassedChecker.didTimePassSeconds(j, i5, this.f15201f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f15198c = hostRetryInfoProvider;
        this.f15197b = systemTimeProvider;
        this.f15196a = timePassedChecker;
        this.f15199d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f15200e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f15201f = c1.n("[ExponentialBackoffDataHolder-", str, "]");
    }
}
