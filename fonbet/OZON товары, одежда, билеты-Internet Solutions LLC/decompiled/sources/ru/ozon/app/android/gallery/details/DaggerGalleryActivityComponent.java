package ru.ozon.app.android.gallery.details;

import GZ.g;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryActivity_MembersInjector;
import ru.ozon.app.android.gallery.GalleryViewModelImpl;
import ru.ozon.app.android.gallery.details.GalleryActivityComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleActivityCallback;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;

/* loaded from: classes12.dex */
public final class DaggerGalleryActivityComponent {

    private static final class Factory implements GalleryActivityComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.gallery.details.GalleryActivityComponent.Factory
        public GalleryActivityComponent create(NavigationComponentApi navigationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            navigationComponentApi.getClass();
            androidPlatformComponentApi.getClass();
            return new GalleryActivityComponentImpl(navigationComponentApi, androidPlatformComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class GalleryActivityComponentImpl implements GalleryActivityComponent {
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private final GalleryActivityComponentImpl galleryActivityComponentImpl;
        private a<GalleryViewModelImpl> galleryViewModelImplProvider;
        private final NavigationComponentApi navigationComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final GalleryActivityComponentImpl galleryActivityComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92786id;

            SwitchingProvider(GalleryActivityComponentImpl galleryActivityComponentImpl, int i11) {
                this.galleryActivityComponentImpl = galleryActivityComponentImpl;
                this.f92786id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92786id == 0) {
                    return (T) new GalleryViewModelImpl();
                }
                throw new AssertionError(this.f92786id);
            }
        }

        /* synthetic */ GalleryActivityComponentImpl(NavigationComponentApi navigationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, int i11) {
            this(navigationComponentApi, androidPlatformComponentApi);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.galleryViewModelImplProvider = new SwitchingProvider(this.galleryActivityComponentImpl, 0);
        }

        private GalleryActivity injectGalleryActivity(GalleryActivity galleryActivity) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            GalleryActivity_MembersInjector.injectRouter(galleryActivity, ozonRouter);
            GalleryActivity_MembersInjector.injectPViewModel(galleryActivity, this.galleryViewModelImplProvider);
            ManualStateBundleActivityCallback manualStateBundleActivityCallback = this.androidPlatformComponentApi.getManualStateBundleActivityCallback();
            j.c(manualStateBundleActivityCallback);
            GalleryActivity_MembersInjector.injectManualStateBundleActivityCallback(galleryActivity, manualStateBundleActivityCallback);
            return galleryActivity;
        }

        @Override // ru.ozon.app.android.gallery.details.GalleryActivityComponent
        public void inject(GalleryActivity galleryActivity) {
            injectGalleryActivity(galleryActivity);
        }

        private GalleryActivityComponentImpl(NavigationComponentApi navigationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.galleryActivityComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            initialize(navigationComponentApi, androidPlatformComponentApi);
        }
    }

    public static GalleryActivityComponent.Factory factory() {
        return new Factory(0);
    }
}
