package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductionOrchestratorVMFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J%\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH\u0016¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/ProductionOrchestratorVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "delegate", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProductionOrchestratorVMFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final ViewModelProvider.Factory delegate;

    public ProductionOrchestratorVMFactory(ViewModelProvider.Factory delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        LoggerKt.logD("SDLT_OVM_F", "ProductionOrchestratorVMFactory create");
        if (IOrchestratorViewModel.class.isAssignableFrom(modelClass)) {
            Object create = this.delegate.create(modelClass);
            Intrinsics.checkNotNull(create, "null cannot be cast to non-null type com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel");
            return new ProductionOrchestratorViewModelImpl((IOrchestratorViewModel) create);
        }
        throw new IllegalArgumentException("Unknown ViewModel Class");
    }
}
