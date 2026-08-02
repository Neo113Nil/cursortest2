package ru.ozon.app.android.analytics.di;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\u0004\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0005\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/analytics/di/AnalyticsComponentConfig;", "", "", "isShakerEnabled", "isPerformanceTrackingEnabled", "isStartupStepsTimeTrackingEnabled", "isProcessCreationTimeLoggingEnabled", "<init>", "(ZZZZ)V", "Z", "()Z", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsComponentConfig {
    private final boolean isPerformanceTrackingEnabled;
    private final boolean isProcessCreationTimeLoggingEnabled;
    private final boolean isShakerEnabled;
    private final boolean isStartupStepsTimeTrackingEnabled;

    public AnalyticsComponentConfig(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.isShakerEnabled = z11;
        this.isPerformanceTrackingEnabled = z12;
        this.isStartupStepsTimeTrackingEnabled = z13;
        this.isProcessCreationTimeLoggingEnabled = z14;
    }

    /* renamed from: isShakerEnabled, reason: from getter */
    public final boolean getIsShakerEnabled() {
        return this.isShakerEnabled;
    }
}
