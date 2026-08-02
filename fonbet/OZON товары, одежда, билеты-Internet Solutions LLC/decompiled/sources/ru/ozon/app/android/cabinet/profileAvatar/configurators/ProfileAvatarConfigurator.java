package ru.ozon.app.android.cabinet.profileAvatar.configurators;

import a00.C4911f;
import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cabinet.profileAvatar.di.ProfileAvatarComponent;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel.AvatarViewModel;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/configurators/ProfileAvatarConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "viewModel", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel;", "onComposerInitialized", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileAvatarConfigurator extends ComposerScreenConfig.PageConfigurator {
    private AvatarViewModel viewModel;

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        AvatarViewModel avatarViewModel;
        if (resultCode == -1 && requestCode == 64572 && (avatarViewModel = this.viewModel) != null) {
            avatarViewModel.onActivityResult(data);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        final AvatarViewModel avatarViewModel;
        ConfiguratorReferences references;
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        C7475g composerWidgetComponentStorage;
        super.onComposerInitialized();
        ConfiguratorReferences references2 = getReferences();
        AvatarViewModel avatarViewModel2 = null;
        ProfileAvatarComponent profileAvatarComponent = (ProfileAvatarComponent) ((references2 == null || (composerWidgetComponentStorage = references2.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(ProfileAvatarComponent.class));
        if (profileAvatarComponent != null && (avatarViewModel = profileAvatarComponent.getAvatarViewModel()) != null && (references = getReferences()) != null && (ownerContainer = references.getOwnerContainer()) != null && (c11 = ownerContainer.c()) != null) {
            if (c11.isDetached()) {
                c11 = null;
            }
            if (c11 != null) {
                avatarViewModel2 = (AvatarViewModel) new z0(c11, new z0.c() { // from class: ru.ozon.app.android.cabinet.profileAvatar.configurators.ProfileAvatarConfigurator$onComposerInitialized$lambda$2$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        AvatarViewModel avatarViewModel3 = AvatarViewModel.this;
                        Intrinsics.g(avatarViewModel3, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return avatarViewModel3;
                    }
                }).a(AvatarViewModel.class);
            }
        }
        this.viewModel = avatarViewModel2;
    }
}
