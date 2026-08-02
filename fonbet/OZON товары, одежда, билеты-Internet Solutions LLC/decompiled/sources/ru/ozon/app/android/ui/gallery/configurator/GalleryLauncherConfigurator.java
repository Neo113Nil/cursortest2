package ru.ozon.app.android.ui.gallery.configurator;

import Bi.k;
import Ti.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponent;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ui/gallery/configurator/GalleryLauncherConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Lru/ozon/app/android/domain/gallery/di/GalleryLauncherComponent;", "galleryLauncherComponent", "()Lru/ozon/app/android/domain/gallery/di/GalleryLauncherComponent;", "", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class GalleryLauncherConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final GalleryLauncherComponent galleryLauncherComponent() {
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        if (references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) {
            return null;
        }
        return (GalleryLauncherComponent) composerWidgetComponentStorage.getComponent(GalleryLauncherComponent.class);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ComponentCallbacksC5392m c11;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null || (c11 = references.getOwnerContainer().c()) == null) {
            return;
        }
        int i11 = k.f3828a;
        a i12 = k.a.i(c11, null, 15);
        C7475g composerWidgetComponentStorage = references.getComposerWidgetComponentStorage();
        if (!composerWidgetComponentStorage.hasComponent(GalleryLauncherComponent.class)) {
            composerWidgetComponentStorage.a(GalleryLauncherComponent.INSTANCE.create(i12));
            return;
        }
        GalleryLauncherComponent galleryLauncherComponent = galleryLauncherComponent();
        if (galleryLauncherComponent != null) {
            galleryLauncherComponent.setGalleryLauncher(i12);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        GalleryLauncherComponent galleryLauncherComponent = galleryLauncherComponent();
        if (galleryLauncherComponent != null) {
            galleryLauncherComponent.setGalleryLauncher(null);
        }
    }
}
