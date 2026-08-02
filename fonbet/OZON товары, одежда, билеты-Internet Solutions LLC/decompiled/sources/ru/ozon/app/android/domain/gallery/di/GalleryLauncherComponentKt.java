package ru.ozon.app.android.domain.gallery.di;

import Bi.k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lk20/g;", "LBi/k;", "getGalleryLauncher", "(Lk20/g;)LBi/k;", "galleryLauncher", "gallery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GalleryLauncherComponentKt {
    public static final k getGalleryLauncher(@NotNull C7475g c7475g) {
        Intrinsics.checkNotNullParameter(c7475g, "<this>");
        GalleryLauncherComponent galleryLauncherComponent = (GalleryLauncherComponent) (c7475g.hasComponent(GalleryLauncherComponent.class) ? c7475g.getComponent(GalleryLauncherComponent.class) : null);
        if (galleryLauncherComponent != null) {
            return galleryLauncherComponent.getGalleryLauncher();
        }
        return null;
    }
}
