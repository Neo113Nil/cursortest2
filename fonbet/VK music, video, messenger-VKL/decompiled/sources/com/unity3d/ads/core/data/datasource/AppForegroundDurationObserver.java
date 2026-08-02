package com.unity3d.ads.core.data.datasource;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.gzs;
import xsna.lg;
import xsna.lz2;
import xsna.ovj;
import xsna.pvj;
import xsna.rsr;
import xsna.vtk0;
import xsna.xh50;
import xsna.yvj;
import xsna.zcl;
import xsna.zvj;

/* compiled from: AppForegroundDurationObserver.kt */
/* loaded from: classes14.dex */
public final class AppForegroundDurationObserver implements ForegroundDurationReader {
    private final AtomicLong accumulatedBackgroundMs;
    private final AtomicLong backgroundStartMs;
    private final ovj defaultDispatcher;
    private final gzs<Long> elapsedRealtimeProvider;
    private final gzs<Long> initTimeProvider;
    private final AtomicBoolean isInBackground;
    private final xh50<Boolean> isRunning;
    private final LifecycleDataSource lifecycleDataSource;
    private final yvj scope;

    public AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, ovj ovjVar, gzs<Long> gzsVar, gzs<Long> gzsVar2) {
        this.lifecycleDataSource = lifecycleDataSource;
        this.defaultDispatcher = ovjVar;
        this.elapsedRealtimeProvider = gzsVar;
        this.initTimeProvider = gzsVar2;
        this.isRunning = vtk0.a(Boolean.FALSE);
        this.accumulatedBackgroundMs = new AtomicLong(0L);
        this.backgroundStartMs = new AtomicLong(0L);
        this.isInBackground = new AtomicBoolean(false);
        this.scope = zvj.a(ovjVar.plus(new AppForegroundDurationObserver$special$$inlined$CoroutineExceptionHandler$1(pvj.a.b)));
    }

    private final long currentAccumulatedBackgroundMs(long j, long j2) {
        long j3 = this.accumulatedBackgroundMs.get();
        return !this.isInBackground.get() ? j3 : Math.max(0L, j2 - Math.max(this.backgroundStartMs.get(), j)) + j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackground() {
        if (this.isInBackground.compareAndSet(false, true)) {
            this.backgroundStartMs.set(this.elapsedRealtimeProvider.invoke().longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onForeground() {
        if (this.isInBackground.compareAndSet(true, false)) {
            long longValue = this.initTimeProvider.invoke().longValue();
            if (longValue == 0) {
                return;
            }
            long max = Math.max(this.backgroundStartMs.get(), longValue);
            this.accumulatedBackgroundMs.addAndGet(Math.max(0L, this.elapsedRealtimeProvider.invoke().longValue() - max));
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.ForegroundDurationReader
    public long getSessionDurationInForegroundMs() {
        long longValue = this.initTimeProvider.invoke().longValue();
        if (longValue == 0) {
            return 0L;
        }
        long longValue2 = this.elapsedRealtimeProvider.invoke().longValue();
        return Math.max(0L, (longValue2 - longValue) - currentAccumulatedBackgroundMs(longValue, longValue2));
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        xh50<Boolean> xh50Var = this.isRunning;
        do {
            value = xh50Var.getValue();
            bool = value;
            bool.getClass();
        } while (!xh50Var.compareAndSet(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        if (!this.lifecycleDataSource.appIsForeground()) {
            this.isInBackground.set(true);
            long longValue = this.initTimeProvider.invoke().longValue();
            AtomicLong atomicLong = this.backgroundStartMs;
            if (longValue == 0) {
                longValue = this.elapsedRealtimeProvider.invoke().longValue();
            }
            atomicLong.set(longValue);
        }
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.lifecycleDataSource.getAppActive(), new AppForegroundDurationObserver$invoke$2(this, null)), this.scope);
    }

    public /* synthetic */ AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, ovj ovjVar, gzs gzsVar, gzs gzsVar2, int i, zcl zclVar) {
        this(lifecycleDataSource, ovjVar, (i & 4) != 0 ? new lz2(1) : gzsVar, (i & 8) != 0 ? new lg(1) : gzsVar2);
    }
}
