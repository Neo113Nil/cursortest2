package com.socure.docv.capturesdk.feature.consent.ui;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.socure.docv.capturesdk.models.ConsentModuleModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentVMFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "shim", "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentShim;", "model", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "(Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentShim;Lcom/socure/docv/capturesdk/models/ConsentModuleModel;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConsentVMFactory implements ViewModelProvider.Factory {
    private final ConsentModuleModel model;
    private final ConsentShim shim;

    public ConsentVMFactory(ConsentShim shim, ConsentModuleModel model) {
        Intrinsics.checkNotNullParameter(shim, "shim");
        Intrinsics.checkNotNullParameter(model, "model");
        this.shim = shim;
        this.model = model;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(ConsentViewModel.class)) {
            return new ConsentViewModel(this.shim, this.model);
        }
        throw new IllegalArgumentException("Unknown ViewModel Class");
    }
}
