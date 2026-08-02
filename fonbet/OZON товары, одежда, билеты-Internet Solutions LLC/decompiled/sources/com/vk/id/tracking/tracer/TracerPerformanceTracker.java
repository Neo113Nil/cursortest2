package com.vk.id.tracking.tracer;

import Ea.a;
import Hg.c;
import Lg.b;
import com.vk.id.tracking.core.PerformanceTracker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/tracking/tracer/TracerPerformanceTracker;", "Lcom/vk/id/tracking/core/PerformanceTracker;", "LLg/b;", "reporter", "Lkotlin/Function0;", "", "systemClockProvider", "<init>", "(LLg/b;Lkotlin/jvm/functions/Function0;)V", "LHg/c;", "tracerLite", "(LHg/c;)V", "", "key", "", "startTracking", "(Ljava/lang/String;)V", "endTracking", "LLg/b;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/ConcurrentHashMap;", "startTimes", "Ljava/util/concurrent/ConcurrentHashMap;", "tracking-tracer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TracerPerformanceTracker implements PerformanceTracker {
    private final b reporter;

    @NotNull
    private final ConcurrentHashMap<String, Long> startTimes;

    @NotNull
    private final Function0<Long> systemClockProvider;

    public TracerPerformanceTracker(b bVar, @NotNull Function0<Long> systemClockProvider) {
        Intrinsics.checkNotNullParameter(systemClockProvider, "systemClockProvider");
        this.reporter = bVar;
        this.systemClockProvider = systemClockProvider;
        this.startTimes = new ConcurrentHashMap<>();
    }

    @Override // com.vk.id.tracking.core.PerformanceTracker
    public synchronized void endTracking(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long remove = this.startTimes.remove(key);
        if (remove != null) {
            long longValue = this.systemClockProvider.invoke().longValue() - remove.longValue();
            try {
                b bVar = this.reporter;
                if (bVar != null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    bVar.c(key, longValue, new Pair[0]);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.vk.id.tracking.core.PerformanceTracker
    public synchronized void startTracking(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.startTimes.put(key, this.systemClockProvider.invoke());
    }

    public /* synthetic */ TracerPerformanceTracker(b bVar, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i11 & 2) != 0 ? new a() : function0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TracerPerformanceTracker(c cVar) {
        this(r1, r0, 2, r0 == true ? 1 : 0);
        b bVar;
        Function0 function0 = null;
        Object[] objArr = 0;
        if (cVar != null) {
            try {
                bVar = new b(cVar);
            } catch (Throwable unused) {
            }
        }
        bVar = null;
    }
}
