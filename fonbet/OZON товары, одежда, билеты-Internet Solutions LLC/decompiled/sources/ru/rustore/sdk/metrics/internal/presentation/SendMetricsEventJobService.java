package ru.rustore.sdk.metrics.internal.presentation;

import Bl0.b0;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import jm0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lm0.q;
import lm0.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/metrics/internal/presentation/SendMetricsEventJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "sdk-public-metrics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendMetricsEventJobService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4008j f97954a = k.b(new a());

    /* renamed from: b, reason: collision with root package name */
    public i f97955b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f97956c;

    public static final class a extends AbstractC7737t implements Function0<b0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b0 invoke() {
            return b0.f3963c.a(SendMetricsEventJobService.this);
        }
    }

    public static final class b extends AbstractC7737t implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((b0) SendMetricsEventJobService.this.f97954a.getValue()).f3965a.a();
            return Unit.f71690a;
        }
    }

    public static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JobParameters f97960c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JobParameters jobParameters) {
            super(0);
            this.f97960c = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SendMetricsEventJobService sendMetricsEventJobService = SendMetricsEventJobService.this;
            JobParameters jobParameters = this.f97960c;
            if (!sendMetricsEventJobService.f97956c) {
                sendMetricsEventJobService.jobFinished(jobParameters, false);
            }
            return Unit.f71690a;
        }
    }

    public static final class d extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JobParameters f97962c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JobParameters jobParameters) {
            super(1);
            this.f97962c = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Intrinsics.checkNotNullParameter(th2, "<anonymous parameter 0>");
            SendMetricsEventJobService sendMetricsEventJobService = SendMetricsEventJobService.this;
            JobParameters jobParameters = this.f97962c;
            if (!sendMetricsEventJobService.f97956c) {
                sendMetricsEventJobService.jobFinished(jobParameters, false);
            }
            return Unit.f71690a;
        }
    }

    public static final class e extends AbstractC7737t implements Function1<Unit, Unit> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JobParameters f97964c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JobParameters jobParameters) {
            super(1);
            this.f97964c = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMetricsEventJobService sendMetricsEventJobService = SendMetricsEventJobService.this;
            JobParameters jobParameters = this.f97964c;
            if (!sendMetricsEventJobService.f97956c) {
                sendMetricsEventJobService.jobFinished(jobParameters, false);
            }
            return Unit.f71690a;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        b source = new b();
        Intrinsics.checkNotNullParameter(source, "source");
        lm0.i iVar = new lm0.i(source);
        int i11 = jm0.e.f70218e;
        this.f97955b = q.a(lm0.d.a(t.a(iVar, jm0.e.c()), new c(params)), new d(params), new e(params));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        int stopReason;
        this.f97956c = true;
        i iVar = this.f97955b;
        if (iVar != null) {
            iVar.dispose();
        }
        if (Build.VERSION.SDK_INT >= 31 && jobParameters != null) {
            stopReason = jobParameters.getStopReason();
            Integer valueOf = Integer.valueOf(stopReason);
            if (stopReason != 3) {
                valueOf = null;
            }
            if (valueOf != null) {
                jobParameters.getExtras().getInt("pending_jobs_count");
            }
        }
        return true;
    }
}
