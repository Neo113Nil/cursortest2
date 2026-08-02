package com.socure.docv.capturesdk.feature.scanner.data;

import com.socure.docv.capturesdk.common.logger.LoggerKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;

/* compiled from: TimeOutKeeper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0003J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/TimeOutKeeper;", "", "totalTimeOut", "", "(J)V", "lastStartTimeStamp", "remaining", "state", "Lcom/socure/docv/capturesdk/feature/scanner/data/TimerState;", OpsMetricTracker.FINISH, "", "getTimeout", "pause", MetricTracker.Object.RESET, "resetRemaining", "newTimeout", "start", "timeBeforeHalf", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TimeOutKeeper {
    private long remaining;
    private long totalTimeOut;
    private long lastStartTimeStamp = -1;
    private TimerState state = TimerState.RESET;

    public TimeOutKeeper(long j) {
        this.totalTimeOut = j;
        this.remaining = j;
    }

    /* renamed from: getTimeout, reason: from getter */
    public final long getRemaining() {
        return this.remaining;
    }

    public final long timeBeforeHalf() {
        return this.remaining - (this.totalTimeOut / 2);
    }

    public final long start() {
        this.lastStartTimeStamp = System.currentTimeMillis();
        TimerState timerState = TimerState.RUNNING;
        this.state = timerState;
        LoggerKt.logD("SDLT_TOK", "start - remaining: " + this.remaining + ", state: " + timerState + ", lastStartTimeStamp: " + this.lastStartTimeStamp);
        return this.remaining;
    }

    public final void reset() {
        this.remaining = this.totalTimeOut;
        this.state = TimerState.RESET;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.lastStartTimeStamp;
        LoggerKt.logD("SDLT_TOK", "reset - ran for: " + (currentTimeMillis - j) + ", remaining: " + this.remaining + ", lastStartTimeStamp: " + j + ", state: " + this.state);
        this.lastStartTimeStamp = -1L;
    }

    public final void finish() {
        this.state = TimerState.FINISHED;
        this.remaining = 0L;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.lastStartTimeStamp;
        LoggerKt.logD("SDLT_TOK", "finish - ran for: " + (currentTimeMillis - j) + ", remaining: " + this.remaining + ", lastStartTimeStamp: " + j + ", state: " + this.state);
        this.lastStartTimeStamp = -1L;
    }

    public final void pause() {
        long currentTimeMillis = System.currentTimeMillis() - this.lastStartTimeStamp;
        if (this.state != TimerState.RUNNING || this.remaining <= currentTimeMillis) {
            return;
        }
        TimerState timerState = TimerState.PAUSED;
        this.state = timerState;
        long j = this.remaining - currentTimeMillis;
        this.remaining = j;
        LoggerKt.logD("SDLT_TOK", "pause - ran for: " + currentTimeMillis + ", remaining: " + j + ", lastStartTimeStamp: " + this.lastStartTimeStamp + ", state: " + timerState);
    }

    public final void resetRemaining(long newTimeout) {
        this.totalTimeOut = newTimeout;
        reset();
    }
}
