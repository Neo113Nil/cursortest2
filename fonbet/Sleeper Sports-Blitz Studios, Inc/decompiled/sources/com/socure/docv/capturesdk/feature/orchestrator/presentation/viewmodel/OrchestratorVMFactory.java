package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.MimeTypes;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrchestratorVMFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/OrchestratorVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "component", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "(Landroid/app/Application;Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrchestratorVMFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final Application application;
    private final OrchestratorActivityComponent component;

    public OrchestratorVMFactory(Application application, OrchestratorActivityComponent component) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(component, "component");
        this.application = application;
        this.component = component;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        LoggerKt.logD("SDLT_OVM_F", "OrchestratorVMFactory create");
        if (IOrchestratorViewModel.class.isAssignableFrom(modelClass)) {
            return new OrchestratorViewModel(this.application, this.component);
        }
        throw new IllegalArgumentException("Unknown ViewModel Class");
    }
}
