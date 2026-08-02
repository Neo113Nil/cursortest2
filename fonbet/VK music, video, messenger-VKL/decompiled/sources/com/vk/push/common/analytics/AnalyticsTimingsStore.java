package com.vk.push.common.analytics;

/* compiled from: AnalyticsTimingsStore.kt */
/* loaded from: classes.dex */
public interface AnalyticsTimingsStore {
    long getTimePassed(Class<? extends BaseAnalyticsEvent> cls);

    long getTimePassed(String str);

    void storeTiming(Class<? extends BaseAnalyticsEvent> cls);

    void storeTiming(String str);
}
