package com.socure.docv.capturesdk.di.orchestrator;

import com.socure.docv.capturesdk.di.activity.ActivityComponent;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestratorImpl;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductionReleaseOrchestratorActivityComponentImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/di/orchestrator/ProductionReleaseOrchestratorActivityComponentImpl;", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponentImpl;", "activityComponent", "Lcom/socure/docv/capturesdk/di/activity/ActivityComponent;", "(Lcom/socure/docv/capturesdk/di/activity/ActivityComponent;)V", "orchestratorModuleOrchestrator", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;", "getOrchestratorModuleOrchestrator", "()Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleOrchestrator;", "orchestratorModuleOrchestrator$delegate", "Lkotlin/Lazy;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProductionReleaseOrchestratorActivityComponentImpl extends OrchestratorActivityComponentImpl {

    /* renamed from: orchestratorModuleOrchestrator$delegate, reason: from kotlin metadata */
    private final Lazy orchestratorModuleOrchestrator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductionReleaseOrchestratorActivityComponentImpl(ActivityComponent activityComponent) {
        super(activityComponent);
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.orchestratorModuleOrchestrator = LazyKt.lazy(new Function0<ModuleOrchestratorImpl>() { // from class: com.socure.docv.capturesdk.di.orchestrator.ProductionReleaseOrchestratorActivityComponentImpl$orchestratorModuleOrchestrator$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ModuleOrchestratorImpl invoke() {
                return new ModuleOrchestratorImpl(ProductionReleaseOrchestratorActivityComponentImpl.this.getModulesRepository(), ProductionReleaseOrchestratorActivityComponentImpl.this.getBackgroundDispatcher(), ProductionReleaseOrchestratorActivityComponentImpl.this.getStartSessionCache(), ProductionReleaseOrchestratorActivityComponentImpl.this.getEventManager());
            }
        });
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public ModuleOrchestrator getOrchestratorModuleOrchestrator() {
        return (ModuleOrchestrator) this.orchestratorModuleOrchestrator.getValue();
    }
}
