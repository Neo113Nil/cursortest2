package com.unity3d.ads.core.data.datasource;

import defpackage.au3;
import defpackage.bu3;
import defpackage.f1d;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.ku3;
import defpackage.s9a;
import defpackage.st;
import defpackage.v98;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AppForegroundDurationObserver;", "Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Lau3;", "defaultDispatcher", "Lkotlin/Function0;", "", "elapsedRealtimeProvider", "initTimeProvider", "<init>", "(Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lau3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "initTime", "now", "currentAccumulatedBackgroundMs", "(JJ)J", "", "onBackground", "()V", "onForeground", "invoke", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Lau3;", "Lkotlin/jvm/functions/Function0;", "Lf1d;", "", "isRunning", "Lf1d;", "Ljava/util/concurrent/atomic/AtomicLong;", "accumulatedBackgroundMs", "Ljava/util/concurrent/atomic/AtomicLong;", "backgroundStartMs", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInBackground", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lku3;", "scope", "Lku3;", "getSessionDurationInForegroundMs", "()J", "sessionDurationInForegroundMs", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppForegroundDurationObserver implements ForegroundDurationReader {

    @NotNull
    private final AtomicLong accumulatedBackgroundMs;

    @NotNull
    private final AtomicLong backgroundStartMs;

    @NotNull
    private final au3 defaultDispatcher;

    @NotNull
    private final Function0<Long> elapsedRealtimeProvider;

    @NotNull
    private final Function0<Long> initTimeProvider;

    @NotNull
    private final AtomicBoolean isInBackground;

    @NotNull
    private final f1d isRunning;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final ku3 scope;

    public AppForegroundDurationObserver(@NotNull LifecycleDataSource lifecycleDataSource, @NotNull au3 au3Var, @NotNull Function0<Long> function0, @NotNull Function0<Long> function02) {
        lifecycleDataSource.getClass();
        au3Var.getClass();
        function0.getClass();
        function02.getClass();
        this.lifecycleDataSource = lifecycleDataSource;
        this.defaultDispatcher = au3Var;
        this.elapsedRealtimeProvider = function0;
        this.initTimeProvider = function02;
        this.isRunning = gdi.a(Boolean.FALSE);
        this.accumulatedBackgroundMs = new AtomicLong(0L);
        this.backgroundStartMs = new AtomicLong(0L);
        this.isInBackground = new AtomicBoolean(false);
        this.scope = s9a.c(au3Var.plus(new AppForegroundDurationObserver$special$$inlined$CoroutineExceptionHandler$1(bu3.a)));
    }

    private final long currentAccumulatedBackgroundMs(long initTime, long now) {
        long j = this.accumulatedBackgroundMs.get();
        return !this.isInBackground.get() ? j : Math.max(0L, now - Math.max(this.backgroundStartMs.get(), initTime)) + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackground() {
        if (this.isInBackground.compareAndSet(false, true)) {
            this.backgroundStartMs.set(((Number) this.elapsedRealtimeProvider.invoke()).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onForeground() {
        if (this.isInBackground.compareAndSet(true, false)) {
            long longValue = ((Number) this.initTimeProvider.invoke()).longValue();
            if (longValue == 0) {
                return;
            }
            long max = Math.max(this.backgroundStartMs.get(), longValue);
            this.accumulatedBackgroundMs.addAndGet(Math.max(0L, ((Number) this.elapsedRealtimeProvider.invoke()).longValue() - max));
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.ForegroundDurationReader
    public long getSessionDurationInForegroundMs() {
        long longValue = ((Number) this.initTimeProvider.invoke()).longValue();
        if (longValue == 0) {
            return 0L;
        }
        long longValue2 = ((Number) this.elapsedRealtimeProvider.invoke()).longValue();
        return Math.max(0L, (longValue2 - longValue) - currentAccumulatedBackgroundMs(longValue, longValue2));
    }

    public final void invoke() {
        fdi fdiVar;
        Object value;
        Boolean bool;
        f1d f1dVar = this.isRunning;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!fdiVar.k(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        if (!this.lifecycleDataSource.appIsForeground()) {
            this.isInBackground.set(true);
            long longValue = ((Number) this.initTimeProvider.invoke()).longValue();
            AtomicLong atomicLong = this.backgroundStartMs;
            if (longValue == 0) {
                longValue = ((Number) this.elapsedRealtimeProvider.invoke()).longValue();
            }
            atomicLong.set(longValue);
        }
        fcp.m0(new v98(this.lifecycleDataSource.getAppActive(), new AppForegroundDurationObserver$invoke$2(this, null), 3), this.scope);
    }

    public /* synthetic */ AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, au3 au3Var, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleDataSource, au3Var, (i & 4) != 0 ? new st(20) : function0, (i & 8) != 0 ? new st(21) : function02);
    }
}
