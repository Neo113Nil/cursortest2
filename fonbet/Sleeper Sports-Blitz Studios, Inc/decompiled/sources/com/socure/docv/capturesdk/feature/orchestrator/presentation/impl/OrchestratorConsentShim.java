package com.socure.docv.capturesdk.feature.orchestrator.presentation.impl;

import com.socure.docv.capturesdk.feature.consent.ui.ConsentShim;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleCompletedUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleSubmissionErrorUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrchestratorConsentShim.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/impl/OrchestratorConsentShim;", "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentShim;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "moduleOrchestrator", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;", "moduleCompletedUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;", "onModuleSubmissionErrorUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;)V", "onFinished", "", "consentGiven", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrchestratorConsentShim implements ConsentShim {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final OnModuleCompletedUseCase moduleCompletedUseCase;
    private final ModuleOrchestrator moduleOrchestrator;
    private final OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase;

    public OrchestratorConsentShim(CoroutineScope coroutineScope, ModuleOrchestrator moduleOrchestrator, OnModuleCompletedUseCase moduleCompletedUseCase, OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(moduleOrchestrator, "moduleOrchestrator");
        Intrinsics.checkNotNullParameter(moduleCompletedUseCase, "moduleCompletedUseCase");
        Intrinsics.checkNotNullParameter(onModuleSubmissionErrorUseCase, "onModuleSubmissionErrorUseCase");
        this.coroutineScope = coroutineScope;
        this.moduleOrchestrator = moduleOrchestrator;
        this.moduleCompletedUseCase = moduleCompletedUseCase;
        this.onModuleSubmissionErrorUseCase = onModuleSubmissionErrorUseCase;
    }

    @Override // com.socure.docv.capturesdk.feature.consent.ui.ConsentShim
    public void onFinished(boolean consentGiven) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new OrchestratorConsentShim$onFinished$1(this, consentGiven, null), 3, null);
    }
}
