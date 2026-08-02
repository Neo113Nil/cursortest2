package ru.ozon.app.android.returns.actionModal.presentation;

import Bi.k;
import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent;
import ru.ozon.app.android.ui.gallery.configurator.GalleryLauncherConfigurator;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/actionModal/presentation/ReturnActionModalConfigurator;", "Lru/ozon/app/android/ui/gallery/configurator/GalleryLauncherConfigurator;", "<init>", "()V", "onComposerInitialized", "", "component", "Lru/ozon/app/android/returns/actionModal/di/ReturnActionModalComposeComponent;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnActionModalConfigurator extends GalleryLauncherConfigurator {
    private final ReturnActionModalComposeComponent component() {
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        if (references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) {
            throw new IllegalStateException("Component must not be null");
        }
        return (ReturnActionModalComposeComponent) composerWidgetComponentStorage.getComponent(ReturnActionModalComposeComponent.class);
    }

    @Override // ru.ozon.app.android.ui.gallery.configurator.GalleryLauncherConfigurator, ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) {
            return;
        }
        ReturnActionModalComposeComponent component = component();
        int i11 = k.f3828a;
        component.setGalleryLauncher(k.a.i(c11, null, 15));
    }
}
