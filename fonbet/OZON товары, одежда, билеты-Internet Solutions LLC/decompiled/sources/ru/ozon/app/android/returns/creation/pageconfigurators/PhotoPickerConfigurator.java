package ru.ozon.app.android.returns.creation.pageconfigurators;

import Bi.k;
import a00.C4911f;
import a00.h;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\u0003J#\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/returns/creation/pageconfigurators/PhotoPickerConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/di/ReturnCreationPhotoPickerComponent;", "componentOrNull", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/di/ReturnCreationPhotoPickerComponent;", "", "onComposerInitialized", "Landroid/os/Bundle;", "outState", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "onSaveInstanceState", "(Landroid/os/Bundle;La00/h;)V", "onRestoreInstanceState", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PhotoPickerConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/returns/creation/pageconfigurators/PhotoPickerConfigurator$Companion;", "", "<init>", "()V", "ARG_ACTION_NAME", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final ReturnCreationPhotoPickerComponent componentOrNull() {
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        if (references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) {
            return null;
        }
        return (ReturnCreationPhotoPickerComponent) composerWidgetComponentStorage.getComponent(ReturnCreationPhotoPickerComponent.class);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references;
        h viewModelOwnerProvider;
        ButtonsViewModel buttonsViewModel;
        ConfiguratorReferences references2;
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        final ReturnCreationPhotoPickerComponent componentOrNull = componentOrNull();
        if (componentOrNull == null || (references = getReferences()) == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (buttonsViewModel = (ButtonsViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.returns.creation.pageconfigurators.PhotoPickerConfigurator$onComposerInitialized$lambda$2$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ButtonsViewModel buttonsViewModel2 = ReturnCreationPhotoPickerComponent.this.getButtonsViewModel().get();
                Intrinsics.g(buttonsViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return buttonsViewModel2;
            }
        }).a(ButtonsViewModel.class)) == null || (references2 = getReferences()) == null || (ownerContainer = references2.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) {
            return;
        }
        int i11 = k.f3828a;
        componentOrNull.setGalleryLauncher(k.a.j(c11, new PhotoPickerConfigurator$onComposerInitialized$1$1$1(buttonsViewModel)));
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onRestoreInstanceState(Bundle outState, @NotNull h viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        final ReturnCreationPhotoPickerComponent componentOrNull = componentOrNull();
        if (componentOrNull != null) {
            ((ButtonsViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.returns.creation.pageconfigurators.PhotoPickerConfigurator$onRestoreInstanceState$lambda$6$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    ButtonsViewModel buttonsViewModel = ReturnCreationPhotoPickerComponent.this.getButtonsViewModel().get();
                    Intrinsics.g(buttonsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return buttonsViewModel;
                }
            }).a(ButtonsViewModel.class)).setActionName(outState != null ? outState.getString("actionName") : null);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onSaveInstanceState(@NotNull Bundle outState, @NotNull h viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        final ReturnCreationPhotoPickerComponent componentOrNull = componentOrNull();
        if (componentOrNull != null) {
            ButtonsViewModel buttonsViewModel = (ButtonsViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.returns.creation.pageconfigurators.PhotoPickerConfigurator$onSaveInstanceState$lambda$4$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    ButtonsViewModel buttonsViewModel2 = ReturnCreationPhotoPickerComponent.this.getButtonsViewModel().get();
                    Intrinsics.g(buttonsViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return buttonsViewModel2;
                }
            }).a(ButtonsViewModel.class);
            outState.putString("actionName", buttonsViewModel != null ? buttonsViewModel.getActionName() : null);
        }
    }
}
