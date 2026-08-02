package com.vk.id.analytics.stat;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/vk/id/analytics/stat/EventCounter;", "", "<init>", "()V", "startId", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "prevEventId", "getPrevEventId", "()I", "eventId", "getEventId", "increment", "", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EventCounter {
    private volatile int eventId;
    private volatile int prevEventId;
    private final int startId;

    public EventCounter() {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        this.startId = seconds;
        this.eventId = seconds;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final int getPrevEventId() {
        return this.prevEventId;
    }

    public final synchronized void increment() {
        this.prevEventId = this.eventId;
        this.eventId++;
    }
}
