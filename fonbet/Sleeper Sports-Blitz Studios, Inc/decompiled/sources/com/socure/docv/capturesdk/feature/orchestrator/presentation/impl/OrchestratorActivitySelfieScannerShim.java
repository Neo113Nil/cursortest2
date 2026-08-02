package com.socure.docv.capturesdk.feature.orchestrator.presentation.impl;

import com.socure.docv.capturesdk.common.analytics.MetricsManager;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleCompletedUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleSubmissionErrorUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MultipartBody;

/* compiled from: OrchestratorActivityScannerShim.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/impl/OrchestratorActivitySelfieScannerShim;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/impl/OrchestratorActivityScannerShim;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "onModuleCompletedUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;", "moduleOrchestrator", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "onModuleSubmissionErrorUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;", "metricsManager", "Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;)V", "getSubmission", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "documentBody", "Lokhttp3/MultipartBody$Part;", "metricsData", "onComplete", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrchestratorActivitySelfieScannerShim extends OrchestratorActivityScannerShim {
    private final MetricsManager metricsManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrchestratorActivitySelfieScannerShim(CoroutineScope coroutineScope, OnModuleCompletedUseCase onModuleCompletedUseCase, ModuleOrchestrator moduleOrchestrator, CoroutineDispatcher dispatcher, OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase, MetricsManager metricsManager) {
        super(coroutineScope, onModuleCompletedUseCase, moduleOrchestrator, dispatcher, onModuleSubmissionErrorUseCase);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onModuleCompletedUseCase, "onModuleCompletedUseCase");
        Intrinsics.checkNotNullParameter(moduleOrchestrator, "moduleOrchestrator");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(onModuleSubmissionErrorUseCase, "onModuleSubmissionErrorUseCase");
        Intrinsics.checkNotNullParameter(metricsManager, "metricsManager");
        this.metricsManager = metricsManager;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorActivityScannerShim
    public ModuleSubmission getSubmission(MultipartBody.Part documentBody, MultipartBody.Part metricsData) {
        Intrinsics.checkNotNullParameter(documentBody, "documentBody");
        return new ModuleSubmission.Selfie(documentBody, metricsData);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorActivityScannerShim, com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerShim
    public void onComplete() {
        this.metricsManager.setDeviceMetricData$capturesdk_productionRelease(ConstantsKt.FRONT_CAMERA, "user");
        super.onComplete();
    }
}
