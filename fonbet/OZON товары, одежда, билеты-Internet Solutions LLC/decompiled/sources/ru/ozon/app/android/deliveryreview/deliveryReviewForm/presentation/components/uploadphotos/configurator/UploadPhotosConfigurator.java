package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.configurator;

import Pc.a;
import a00.h;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModelImpl;
import ru.ozon.app.android.ui.gallery.configurator.GalleryLauncherConfigurator;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/configurator/UploadPhotosConfigurator;", "Lru/ozon/app/android/ui/gallery/configurator/GalleryLauncherConfigurator;", "LPc/a;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModelImpl;", "uploadPhotosViewModelProvider", "<init>", "(LPc/a;)V", "", "onComposerInitialized", "()V", "LPc/a;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;", "uploadPhotosViewModel", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UploadPhotosConfigurator extends GalleryLauncherConfigurator {
    private ComponentUploadPhotosViewModel uploadPhotosViewModel;

    @NotNull
    private final a<ComponentUploadPhotosViewModelImpl> uploadPhotosViewModelProvider;

    public UploadPhotosConfigurator(@NotNull a<ComponentUploadPhotosViewModelImpl> uploadPhotosViewModelProvider) {
        Intrinsics.checkNotNullParameter(uploadPhotosViewModelProvider, "uploadPhotosViewModelProvider");
        this.uploadPhotosViewModelProvider = uploadPhotosViewModelProvider;
    }

    @Override // ru.ozon.app.android.ui.gallery.configurator.GalleryLauncherConfigurator, ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ComponentUploadPhotosViewModelImpl componentUploadPhotosViewModelImpl;
        h viewModelOwnerProvider;
        B0 a11;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) {
            componentUploadPhotosViewModelImpl = null;
        } else {
            final a<ComponentUploadPhotosViewModelImpl> aVar = this.uploadPhotosViewModelProvider;
            componentUploadPhotosViewModelImpl = (ComponentUploadPhotosViewModelImpl) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.configurator.UploadPhotosConfigurator$onComposerInitialized$$inlined$createViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    ComponentUploadPhotosViewModelImpl componentUploadPhotosViewModelImpl2 = (ComponentUploadPhotosViewModelImpl) a.this.get();
                    Intrinsics.g(componentUploadPhotosViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return componentUploadPhotosViewModelImpl2;
                }
            }).a(ComponentUploadPhotosViewModelImpl.class);
        }
        this.uploadPhotosViewModel = componentUploadPhotosViewModelImpl;
    }
}
