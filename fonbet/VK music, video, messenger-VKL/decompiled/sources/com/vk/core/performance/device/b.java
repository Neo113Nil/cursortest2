package com.vk.core.performance.device;

import com.vk.log.L;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;

/* compiled from: PerformanceInfoReporter.kt */
/* loaded from: classes17.dex */
public final class b {
    public static final void a(DevicePerformanceInfo devicePerformanceInfo) {
        L.e("PerformanceInfoReporter", "Reporting device performance info");
        AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.PERFORMANCE_CLASS);
        aggregateEventBuilder.v(0, devicePerformanceInfo.a.h());
        aggregateEventBuilder.v(1, devicePerformanceInfo.b.h());
        aggregateEventBuilder.v(2, devicePerformanceInfo.c.h());
        aggregateEventBuilder.v(3, devicePerformanceInfo.d.h());
        aggregateEventBuilder.q();
    }

    public static final void b(int i, int i2, int i3) {
        L.e("PerformanceInfoReporter", "Reporting scores");
        AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.PERFORMANCE_SCORE);
        aggregateEventBuilder.v(1, i);
        aggregateEventBuilder.v(3, i2);
        aggregateEventBuilder.v(4, i3);
        aggregateEventBuilder.q();
    }
}
