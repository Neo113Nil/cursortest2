package com.vk.push.common.analytics;

/* compiled from: EmptyAnalyticsTimingsStore.kt */
/* loaded from: classes5.dex */
public final class EmptyAnalyticsTimingsStore implements AnalyticsTimingsStore {
    @Override // com.vk.push.common.analytics.AnalyticsTimingsStore
    public long getTimePassed(Class<? extends BaseAnalyticsEvent> cls) {
        return 0L;
    }

    @Override // com.vk.push.common.analytics.AnalyticsTimingsStore
    public void storeTiming(Class<? extends BaseAnalyticsEvent> cls) {
    }

    @Override // com.vk.push.common.analytics.AnalyticsTimingsStore
    public long getTimePassed(String str) {
        return 0L;
    }

    @Override // com.vk.push.common.analytics.AnalyticsTimingsStore
    public void storeTiming(String str) {
    }
}
