package ru.ozon.app.android.pdp.widgets.galleryV4.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;", "", "", "galleryId", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "itemModel", "", "putSyncItem", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;)V", "removeSyncItem", "(Ljava/lang/String;)V", "findSyncItem", "(Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GallerySyncViewModel {
    GallerySyncModel findSyncItem(@NotNull String galleryId);

    void putSyncItem(@NotNull String galleryId, @NotNull GallerySyncModel itemModel);

    void removeSyncItem(@NotNull String galleryId);
}
