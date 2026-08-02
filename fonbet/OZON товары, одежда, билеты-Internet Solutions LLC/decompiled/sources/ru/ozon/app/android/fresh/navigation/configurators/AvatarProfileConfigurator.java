package ru.ozon.app.android.fresh.navigation.configurators;

import Pc.a;
import a00.C4911f;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.navigation.profileAvatar.presentation.AvatarProfileViewModel;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\tJ)\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/navigation/configurators/AvatarProfileConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel;", "viewModelProvider", "<init>", "(LPc/a;)V", "", "makeStatusBarTransparent", "()V", "Landroidx/lifecycle/J;", "owner", "onResume", "(Landroidx/lifecycle/J;)V", "onComposerInitialized", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LPc/a;", "viewModel", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel;", "Landroid/view/ViewGroup;", "getComposerContainer", "()Landroid/view/ViewGroup;", "composerContainer", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarProfileConfigurator extends ComposerScreenConfig.PageConfigurator {
    private AvatarProfileViewModel viewModel;

    @NotNull
    private final a<AvatarProfileViewModel> viewModelProvider;

    public AvatarProfileConfigurator(@NotNull a<AvatarProfileViewModel> viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.viewModelProvider = viewModelProvider;
    }

    private final ViewGroup getComposerContainer() {
        View view;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerContainer(view);
    }

    private final void makeStatusBarTransparent() {
        Window window = getContainer().i().getWindow();
        ViewGroup composerContainer = getComposerContainer();
        if (composerContainer != null) {
            composerContainer.setFitsSystemWindows(false);
        }
        window.setStatusBarColor(0);
        ViewGroup composerContainer2 = getComposerContainer();
        if (composerContainer2 != null) {
            composerContainer2.requestLayout();
        }
        ViewGroup composerContainer3 = getComposerContainer();
        if (composerContainer3 != null) {
            composerContainer3.invalidate();
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        AvatarProfileViewModel avatarProfileViewModel;
        if (resultCode == -1 && requestCode == 61572 && (avatarProfileViewModel = this.viewModel) != null) {
            avatarProfileViewModel.onActivityResult(data);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references;
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        super.onComposerInitialized();
        final AvatarProfileViewModel avatarProfileViewModel = this.viewModelProvider.get();
        AvatarProfileViewModel avatarProfileViewModel2 = null;
        if (avatarProfileViewModel != null && (references = getReferences()) != null && (ownerContainer = references.getOwnerContainer()) != null && (c11 = ownerContainer.c()) != null) {
            if (c11.isDetached()) {
                c11 = null;
            }
            if (c11 != null) {
                avatarProfileViewModel2 = (AvatarProfileViewModel) new z0(c11, new z0.c() { // from class: ru.ozon.app.android.fresh.navigation.configurators.AvatarProfileConfigurator$onComposerInitialized$lambda$2$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        AvatarProfileViewModel avatarProfileViewModel3 = AvatarProfileViewModel.this;
                        Intrinsics.g(avatarProfileViewModel3, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return avatarProfileViewModel3;
                    }
                }).a(AvatarProfileViewModel.class);
            }
        }
        this.viewModel = avatarProfileViewModel2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        makeStatusBarTransparent();
    }
}
