package ru.ozon.app.android.gallery.details;

import GZ.g;
import Jb.j;
import ru.ozon.app.android.gallery.details.Photo360GalleryFragmentComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

/* loaded from: classes12.dex */
public final class DaggerPhoto360GalleryFragmentComponent {

    private static final class Factory implements Photo360GalleryFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.gallery.details.Photo360GalleryFragmentComponent.Factory
        public Photo360GalleryFragmentComponent create(NavigationComponentApi navigationComponentApi) {
            navigationComponentApi.getClass();
            return new Photo360GalleryFragmentComponentImpl(navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class Photo360GalleryFragmentComponentImpl implements Photo360GalleryFragmentComponent {
        private final NavigationComponentApi navigationComponentApi;
        private final Photo360GalleryFragmentComponentImpl photo360GalleryFragmentComponentImpl;

        /* synthetic */ Photo360GalleryFragmentComponentImpl(NavigationComponentApi navigationComponentApi, int i11) {
            this(navigationComponentApi);
        }

        private Photo360GalleryFragment injectPhoto360GalleryFragment(Photo360GalleryFragment photo360GalleryFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            Photo360GalleryFragment_MembersInjector.injectRouter(photo360GalleryFragment, ozonRouter);
            return photo360GalleryFragment;
        }

        @Override // ru.ozon.app.android.gallery.details.Photo360GalleryFragmentComponent
        public void inject(Photo360GalleryFragment photo360GalleryFragment) {
            injectPhoto360GalleryFragment(photo360GalleryFragment);
        }

        private Photo360GalleryFragmentComponentImpl(NavigationComponentApi navigationComponentApi) {
            this.photo360GalleryFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
        }
    }

    public static Photo360GalleryFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
