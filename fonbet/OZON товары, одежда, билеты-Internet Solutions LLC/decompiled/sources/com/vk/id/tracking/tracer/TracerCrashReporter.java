package com.vk.id.tracking.tracer;

import Ig.c;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.AppMeasurement;
import com.vk.id.tracking.core.AnalyticsTracking;
import com.vk.id.tracking.core.CrashReporter;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JX\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00172\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0011H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/vk/id/tracking/tracer/TracerCrashReporter;", "Lcom/vk/id/tracking/core/CrashReporter;", "Lcom/vk/id/tracking/core/AnalyticsTracking;", "LHg/c;", "tracer", "<init>", "(LHg/c;)V", "", "message", "", "log", "(Ljava/lang/String;)V", "", AppMeasurement.CRASH_ORIGIN, "report", "(Ljava/lang/Throwable;)V", "T", "Lkotlin/Function1;", "errorValueProvider", "Lkotlin/Function0;", "action", "runReportingCrashes", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "runReportingCrashesSuspend", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LIg/c;", "crashReporter", "LIg/c;", "tracking-tracer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TracerCrashReporter implements CrashReporter, AnalyticsTracking {
    private final c crashReporter;

    public TracerCrashReporter(Hg.c cVar) {
        c cVar2 = null;
        if (cVar != null) {
            try {
                c.a.C0249a c0249a = new c.a.C0249a();
                c0249a.b();
                cVar2 = new c(cVar, new c.a(c0249a));
            } catch (Throwable unused) {
            }
        }
        this.crashReporter = cVar2;
    }

    @Override // com.vk.id.tracking.core.AnalyticsTracking
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            c cVar = this.crashReporter;
            if (cVar != null) {
                cVar.c(message);
            }
        } catch (Throwable unused) {
        }
    }

    public void report(@NotNull Throwable crash) {
        Intrinsics.checkNotNullParameter(crash, "crash");
        try {
            c cVar = this.crashReporter;
            if (cVar != null) {
                c.d(cVar, crash);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.vk.id.tracking.core.CrashReporter
    public <T> T runReportingCrashes(@NotNull Function1<? super Throwable, ? extends T> errorValueProvider, @NotNull Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(errorValueProvider, "errorValueProvider");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            return action.invoke();
        } catch (Throwable th2) {
            report(th2);
            return errorValueProvider.invoke(th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.vk.id.tracking.core.CrashReporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object runReportingCrashesSuspend(@NotNull Function2<? super Throwable, ? super d<? super T>, ? extends Object> function2, @NotNull Function1<? super d<? super T>, ? extends Object> function1, @NotNull d<? super T> dVar) {
        TracerCrashReporter$runReportingCrashesSuspend$1 tracerCrashReporter$runReportingCrashesSuspend$1;
        a aVar;
        int i11;
        TracerCrashReporter tracerCrashReporter;
        Object invoke;
        Object invoke2;
        try {
            if (dVar instanceof TracerCrashReporter$runReportingCrashesSuspend$1) {
                tracerCrashReporter$runReportingCrashesSuspend$1 = (TracerCrashReporter$runReportingCrashesSuspend$1) dVar;
                int i12 = tracerCrashReporter$runReportingCrashesSuspend$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    tracerCrashReporter$runReportingCrashesSuspend$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = tracerCrashReporter$runReportingCrashesSuspend$1.result;
                    aVar = a.COROUTINE_SUSPENDED;
                    i11 = tracerCrashReporter$runReportingCrashesSuspend$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        try {
                            tracerCrashReporter$runReportingCrashesSuspend$1.L$0 = this;
                            tracerCrashReporter$runReportingCrashesSuspend$1.L$1 = function2;
                            tracerCrashReporter$runReportingCrashesSuspend$1.label = 1;
                            invoke = function1.invoke(tracerCrashReporter$runReportingCrashesSuspend$1);
                        } catch (Throwable th2) {
                            th = th2;
                            tracerCrashReporter = this;
                        }
                        return invoke == aVar ? aVar : invoke;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return obj;
                    }
                    function2 = (Function2) tracerCrashReporter$runReportingCrashesSuspend$1.L$1;
                    tracerCrashReporter = (TracerCrashReporter) tracerCrashReporter$runReportingCrashesSuspend$1.L$0;
                    try {
                        s.b(obj);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    tracerCrashReporter.report(th);
                    tracerCrashReporter$runReportingCrashesSuspend$1.L$0 = null;
                    tracerCrashReporter$runReportingCrashesSuspend$1.L$1 = null;
                    tracerCrashReporter$runReportingCrashesSuspend$1.label = 2;
                    invoke2 = function2.invoke(th, tracerCrashReporter$runReportingCrashesSuspend$1);
                    if (invoke2 == aVar) {
                        return invoke2;
                    }
                }
            }
            if (i11 != 0) {
            }
            tracerCrashReporter.report(th);
            tracerCrashReporter$runReportingCrashesSuspend$1.L$0 = null;
            tracerCrashReporter$runReportingCrashesSuspend$1.L$1 = null;
            tracerCrashReporter$runReportingCrashesSuspend$1.label = 2;
            invoke2 = function2.invoke(th, tracerCrashReporter$runReportingCrashesSuspend$1);
            if (invoke2 == aVar) {
            }
        } catch (CancellationException e11) {
            throw e11;
        }
        tracerCrashReporter$runReportingCrashesSuspend$1 = new TracerCrashReporter$runReportingCrashesSuspend$1(this, dVar);
        Object obj2 = tracerCrashReporter$runReportingCrashesSuspend$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = tracerCrashReporter$runReportingCrashesSuspend$1.label;
    }
}
