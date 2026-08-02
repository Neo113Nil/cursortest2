package com.socure.docv.capturesdk.feature.orchestrator;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.ProductionOrchestratorViewModelImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrchestratorViewModelProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/OrchestratorViewModelProvider;", "", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "get", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "get$capturesdk_productionRelease", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrchestratorViewModelProvider {
    public static final int $stable = 8;
    private final ViewModelProvider.Factory viewModelFactory;

    public OrchestratorViewModelProvider(ViewModelProvider.Factory viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.viewModelFactory = viewModelFactory;
    }

    public final IOrchestratorViewModel get$capturesdk_productionRelease(ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return (IOrchestratorViewModel) new ViewModelProvider(owner, this.viewModelFactory).get(ProductionOrchestratorViewModelImpl.class);
    }
}
