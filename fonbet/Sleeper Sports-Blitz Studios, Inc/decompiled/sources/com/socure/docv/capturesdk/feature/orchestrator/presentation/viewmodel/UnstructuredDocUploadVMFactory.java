package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.socure.docv.capturesdk.common.analytics.MixPanelAgent;
import com.socure.docv.capturesdk.feature.orchestrator.LaunchCameraUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OpenFilePickerUseCase;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnstructuredDocUploadVMFactory.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/UnstructuredDocUploadVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "model", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "openFilePickerUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OpenFilePickerUseCase;", "launchCameraUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/LaunchCameraUseCase;", "mixPanelAgent", "Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;", "(Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;Lcom/socure/docv/capturesdk/feature/orchestrator/OpenFilePickerUseCase;Lcom/socure/docv/capturesdk/feature/orchestrator/LaunchCameraUseCase;Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnstructuredDocUploadVMFactory implements ViewModelProvider.Factory {
    private final LaunchCameraUseCase launchCameraUseCase;
    private final MixPanelAgent mixPanelAgent;
    private final UnstructuredModuleModel model;
    private final OpenFilePickerUseCase openFilePickerUseCase;

    public UnstructuredDocUploadVMFactory(UnstructuredModuleModel model, OpenFilePickerUseCase openFilePickerUseCase, LaunchCameraUseCase launchCameraUseCase, MixPanelAgent mixPanelAgent) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(openFilePickerUseCase, "openFilePickerUseCase");
        Intrinsics.checkNotNullParameter(launchCameraUseCase, "launchCameraUseCase");
        Intrinsics.checkNotNullParameter(mixPanelAgent, "mixPanelAgent");
        this.model = model;
        this.openFilePickerUseCase = openFilePickerUseCase;
        this.launchCameraUseCase = launchCameraUseCase;
        this.mixPanelAgent = mixPanelAgent;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(UnstructuredDocUploadViewModel.class)) {
            return new UnstructuredDocUploadViewModel(this.model, this.openFilePickerUseCase, this.launchCameraUseCase, this.mixPanelAgent);
        }
        if (modelClass.isAssignableFrom(UnstructuredDocUploadViewModelV2.class)) {
            return new UnstructuredDocUploadViewModelV2(this.model, this.openFilePickerUseCase, this.launchCameraUseCase, this.mixPanelAgent);
        }
        throw new IllegalArgumentException("Unknown ViewModel Class");
    }
}
