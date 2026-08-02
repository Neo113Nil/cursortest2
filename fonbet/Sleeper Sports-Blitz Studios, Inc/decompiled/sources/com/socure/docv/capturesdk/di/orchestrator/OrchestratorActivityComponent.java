package com.socure.docv.capturesdk.di.orchestrator;

import com.socure.docv.capturesdk.di.activity.ActivityComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrchestratorActivityComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponentProvisions;", "Lcom/socure/docv/capturesdk/di/activity/ActivityComponent;", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface OrchestratorActivityComponent extends OrchestratorActivityComponentProvisions, ActivityComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: OrchestratorActivityComponent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent$Companion;", "", "()V", "build", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "activityComponent", "Lcom/socure/docv/capturesdk/di/activity/ActivityComponent;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OrchestratorActivityComponent build(ActivityComponent activityComponent) {
            Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
            return new ProductionReleaseOrchestratorActivityComponentImpl(activityComponent);
        }
    }
}
