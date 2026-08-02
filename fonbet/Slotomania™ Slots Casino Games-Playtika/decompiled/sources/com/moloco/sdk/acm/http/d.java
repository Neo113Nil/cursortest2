package com.moloco.sdk.acm.http;

import com.moloco.sdk.MetricsRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class d {
    public final List<MetricsRequest.PostMetricsRequest.CountEvent> a;
    public final List<MetricsRequest.PostMetricsRequest.TimerEvent> b;

    public d(List<MetricsRequest.PostMetricsRequest.CountEvent> counts, List<MetricsRequest.PostMetricsRequest.TimerEvent> timers) {
        Intrinsics.checkNotNullParameter(counts, "counts");
        Intrinsics.checkNotNullParameter(timers, "timers");
        this.a = counts;
        this.b = timers;
    }

    public final List<MetricsRequest.PostMetricsRequest.CountEvent> a() {
        return this.a;
    }

    public final List<MetricsRequest.PostMetricsRequest.TimerEvent> b() {
        return this.b;
    }
}
