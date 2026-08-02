package ru.ozon.app.android.gallery;

import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleActivityCallback;

/* loaded from: classes12.dex */
public final class GalleryActivity_MembersInjector implements b<GalleryActivity> {
    public static void injectManualStateBundleActivityCallback(GalleryActivity galleryActivity, ManualStateBundleActivityCallback manualStateBundleActivityCallback) {
        galleryActivity.manualStateBundleActivityCallback = manualStateBundleActivityCallback;
    }

    public static void injectPViewModel(GalleryActivity galleryActivity, a<GalleryViewModelImpl> aVar) {
        galleryActivity.pViewModel = aVar;
    }

    public static void injectRouter(GalleryActivity galleryActivity, g gVar) {
        galleryActivity.router = gVar;
    }
}
