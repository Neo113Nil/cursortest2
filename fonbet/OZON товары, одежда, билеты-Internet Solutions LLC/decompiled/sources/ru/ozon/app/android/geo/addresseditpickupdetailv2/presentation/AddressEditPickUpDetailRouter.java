package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailRouter;", "", "<init>", "()V", "showGallery", "", "context", "Landroid/content/Context;", "galleryRequest", "Lru/ozon/app/android/gallery/GalleryRequest;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditPickUpDetailRouter {
    public final void showGallery(@NotNull Context context, @NotNull GalleryRequest galleryRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(galleryRequest, "galleryRequest");
        context.startActivity(GalleryActivity.INSTANCE.newIntent(context, galleryRequest));
    }
}
