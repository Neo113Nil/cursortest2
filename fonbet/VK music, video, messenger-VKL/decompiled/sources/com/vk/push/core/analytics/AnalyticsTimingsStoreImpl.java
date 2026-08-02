package com.vk.push.core.analytics;

import android.os.SystemClock;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TimingsHolder.kt */
/* loaded from: classes.dex */
public final class AnalyticsTimingsStoreImpl implements AnalyticsTimingsStore {
    public final ConcurrentHashMap<String, Long> a = new ConcurrentHashMap<>();

    @Override // com.vk.push.common.analytics.AnalyticsTimingsStore
    public long getTimePassed(String str) {
        Long l = this.a.get(str);
        if (l == null) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - l.longValue();
    }

    @Override // com.vk.push.common.analytics.AnalyticsTimingsStore
    public void storeTiming(String str) {
        this.a.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.vk.push.common.analytics.AnalyticsTimingsStore
    public void storeTiming(Class<? extends BaseAnalyticsEvent> cls) {
        storeTiming(cls.getSimpleName());
    }

    @Override // com.vk.push.common.analytics.AnalyticsTimingsStore
    public long getTimePassed(Class<? extends BaseAnalyticsEvent> cls) {
        return getTimePassed(cls.getSimpleName());
    }
}
