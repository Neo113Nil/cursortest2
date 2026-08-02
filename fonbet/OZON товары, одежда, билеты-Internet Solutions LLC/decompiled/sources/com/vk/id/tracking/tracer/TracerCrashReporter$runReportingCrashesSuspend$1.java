package com.vk.id.tracking.tracer;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.tracking.tracer.TracerCrashReporter", f = "TracerCrashReporter.kt", l = {60, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "runReportingCrashesSuspend")
/* loaded from: classes9.dex */
final class TracerCrashReporter$runReportingCrashesSuspend$1<T> extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TracerCrashReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TracerCrashReporter$runReportingCrashesSuspend$1(TracerCrashReporter tracerCrashReporter, d<? super TracerCrashReporter$runReportingCrashesSuspend$1> dVar) {
        super(dVar);
        this.this$0 = tracerCrashReporter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.runReportingCrashesSuspend(null, null, this);
    }
}
