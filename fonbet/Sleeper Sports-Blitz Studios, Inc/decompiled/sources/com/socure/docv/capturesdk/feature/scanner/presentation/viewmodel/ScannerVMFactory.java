package com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerShim;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScannerVMFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/ScannerVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "scannerShim", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerShim;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerShim;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScannerVMFactory implements ViewModelProvider.Factory {
    public static final int $stable = 0;
    private final ApplicationComponent applicationComponent;
    private final ScanType scanType;
    private final ScannerShim scannerShim;

    public ScannerVMFactory(ApplicationComponent applicationComponent, ScanType scanType, ScannerShim scannerShim) {
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(scannerShim, "scannerShim");
        this.applicationComponent = applicationComponent;
        this.scanType = scanType;
        this.scannerShim = scannerShim;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(ScannerViewModel.class)) {
            return new ScannerViewModel(this.applicationComponent, this.scanType, this.scannerShim);
        }
        throw new IllegalArgumentException("Unknown ViewModel Class");
    }
}
