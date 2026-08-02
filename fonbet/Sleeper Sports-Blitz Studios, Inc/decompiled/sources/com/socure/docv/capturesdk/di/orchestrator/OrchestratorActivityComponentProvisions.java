package com.socure.docv.capturesdk.di.orchestrator;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.socure.docv.capturesdk.di.consent.ConsentFragmentComponent;
import com.socure.docv.capturesdk.di.docselection.DocSelectionFragmentComponent;
import com.socure.docv.capturesdk.di.scanner.ScannerFragmentComponent;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleCompletedUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleSubmissionErrorUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OrchestratorViewModelProvider;
import io.sentry.protocol.Request;
import kotlin.Metadata;

/* compiled from: OrchestratorActivityComponentProvisions.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponentProvisions;", "", "onModuleCompletedUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;", "getOnModuleCompletedUseCase", "()Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;", "onModuleSubmissionErrorUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;", "getOnModuleSubmissionErrorUseCase", "()Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;", "orchestratorModuleOrchestrator", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;", "getOrchestratorModuleOrchestrator", "()Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;", "orchestratorVMFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getOrchestratorVMFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "orchestratorVMProvider", "Lcom/socure/docv/capturesdk/feature/orchestrator/OrchestratorViewModelProvider;", "getOrchestratorVMProvider", "()Lcom/socure/docv/capturesdk/feature/orchestrator/OrchestratorViewModelProvider;", "backIDScannerFragmentSubComponent", "Lcom/socure/docv/capturesdk/di/scanner/ScannerFragmentComponent;", Request.JsonKeys.FRAGMENT, "Landroidx/fragment/app/Fragment;", "consentFragmentSubComponent", "Lcom/socure/docv/capturesdk/di/consent/ConsentFragmentComponent;", "docSelectionFragmentSubComponent", "Lcom/socure/docv/capturesdk/di/docselection/DocSelectionFragmentComponent;", "frontIDScannerFragmentSubComponent", "passportScannerFragmentSubComponent", "selfieScannerFragmentSubComponent", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface OrchestratorActivityComponentProvisions {
    ScannerFragmentComponent backIDScannerFragmentSubComponent(Fragment fragment);

    ConsentFragmentComponent consentFragmentSubComponent(Fragment fragment);

    DocSelectionFragmentComponent docSelectionFragmentSubComponent(Fragment fragment);

    ScannerFragmentComponent frontIDScannerFragmentSubComponent(Fragment fragment);

    OnModuleCompletedUseCase getOnModuleCompletedUseCase();

    OnModuleSubmissionErrorUseCase getOnModuleSubmissionErrorUseCase();

    ModuleOrchestrator getOrchestratorModuleOrchestrator();

    ViewModelProvider.Factory getOrchestratorVMFactory();

    OrchestratorViewModelProvider getOrchestratorVMProvider();

    ScannerFragmentComponent passportScannerFragmentSubComponent(Fragment fragment);

    ScannerFragmentComponent selfieScannerFragmentSubComponent(Fragment fragment);
}
