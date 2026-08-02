package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.myc0;
import xsna.ovj;
import xsna.pvj;
import xsna.s3q0;
import xsna.spj;
import xsna.vtk0;
import xsna.xh50;
import xsna.yvj;
import xsna.zvj;

/* compiled from: DiagnosticEventObserver.kt */
/* loaded from: classes14.dex */
public final class DiagnosticEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetRequestPolicy diagnosticRequestPolicy;
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final xh50<Boolean> isRunning = vtk0.a(Boolean.FALSE);
    private final yvj scope;
    private final UniversalRequestDataSource universalRequestDataSource;
    private final UniversalRequestEventSender universalRequestEventSender;

    public DiagnosticEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, ovj ovjVar, DiagnosticEventRepository diagnosticEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker, UniversalRequestEventSender universalRequestEventSender, GetRequestPolicy getRequestPolicy) {
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.diagnosticRequestPolicy = getRequestPolicy;
        this.scope = zvj.a(ovjVar.plus(new DiagnosticEventObserver$special$$inlined$CoroutineExceptionHandler$1(pvj.a.b)));
    }

    public final Object invoke(spj<? super s3q0> spjVar) {
        Object k = myc0.k(this.scope.getCoroutineContext(), new DiagnosticEventObserver$invoke$2(this, null), spjVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
