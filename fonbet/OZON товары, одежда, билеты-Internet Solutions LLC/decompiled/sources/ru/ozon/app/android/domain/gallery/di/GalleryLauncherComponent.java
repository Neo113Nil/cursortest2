package ru.ozon.app.android.domain.gallery.di;

import Bi.k;
import Bz.C2680a;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/domain/gallery/di/GalleryLauncherComponent;", "Lhi/a;", "LBi/k;", "getGalleryLauncher", "()LBi/k;", "setGalleryLauncher", "(LBi/k;)V", "galleryLauncher", "Companion", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GalleryLauncherComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/domain/gallery/di/GalleryLauncherComponent$Companion;", "", "<init>", "()V", "LBi/k;", "galleryLauncher", "Lk20/e;", "Lru/ozon/app/android/domain/gallery/di/GalleryLauncherComponent;", "create", "(LBi/k;)Lk20/e;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GalleryLauncherComponent create$lambda$0(final k kVar) {
            return new GalleryLauncherComponent(kVar) { // from class: ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponent$Companion$create$1$1
                private k galleryLauncher;

                {
                    this.galleryLauncher = kVar;
                }

                @Override // ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponent
                public k getGalleryLauncher() {
                    return this.galleryLauncher;
                }

                @Override // ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponent
                public void setGalleryLauncher(k kVar2) {
                    this.galleryLauncher = kVar2;
                }
            };
        }

        @NotNull
        public final C7473e<GalleryLauncherComponent> create(@NotNull k galleryLauncher) {
            Intrinsics.checkNotNullParameter(galleryLauncher, "galleryLauncher");
            return new C7473e<>(N.b(GalleryLauncherComponent.class), new C2680a(galleryLauncher, 11));
        }
    }

    k getGalleryLauncher();

    void setGalleryLauncher(k kVar);
}
