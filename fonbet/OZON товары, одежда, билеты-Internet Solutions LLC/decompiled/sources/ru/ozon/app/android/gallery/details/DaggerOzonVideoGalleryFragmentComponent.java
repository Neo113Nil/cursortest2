package ru.ozon.app.android.gallery.details;

import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.gallery.common.VolumeContentObserver;
import ru.ozon.app.android.gallery.details.OzonVideoGalleryFragmentComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.soundservice.SoundService;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

/* loaded from: classes12.dex */
public final class DaggerOzonVideoGalleryFragmentComponent {

    private static final class Factory implements OzonVideoGalleryFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.gallery.details.OzonVideoGalleryFragmentComponent.Factory
        public OzonVideoGalleryFragmentComponent create(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            videoComponentApi.getClass();
            networkComponentApi.getClass();
            return new OzonVideoGalleryFragmentComponentImpl(contextComponentDependencies, videoComponentApi, networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OzonVideoGalleryFragmentComponentImpl implements OzonVideoGalleryFragmentComponent {
        private final ContextComponentDependencies contextComponentDependencies;
        private final OzonVideoGalleryFragmentComponentImpl ozonVideoGalleryFragmentComponentImpl;
        private a<OzonVideoGalleryViewModel> ozonVideoGalleryViewModelProvider;
        private final VideoComponentApi videoComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92787id;
            private final OzonVideoGalleryFragmentComponentImpl ozonVideoGalleryFragmentComponentImpl;

            SwitchingProvider(OzonVideoGalleryFragmentComponentImpl ozonVideoGalleryFragmentComponentImpl, int i11) {
                this.ozonVideoGalleryFragmentComponentImpl = ozonVideoGalleryFragmentComponentImpl;
                this.f92787id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92787id == 0) {
                    return (T) new OzonVideoGalleryViewModel();
                }
                throw new AssertionError(this.f92787id);
            }
        }

        /* synthetic */ OzonVideoGalleryFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, NetworkComponentApi networkComponentApi, int i11) {
            this(contextComponentDependencies, videoComponentApi, networkComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, NetworkComponentApi networkComponentApi) {
            this.ozonVideoGalleryViewModelProvider = new SwitchingProvider(this.ozonVideoGalleryFragmentComponentImpl, 0);
        }

        private OzonVideoGalleryFragment injectOzonVideoGalleryFragment(OzonVideoGalleryFragment ozonVideoGalleryFragment) {
            OzonVideoGalleryFragment_MembersInjector.injectViewModelProvider(ozonVideoGalleryFragment, this.ozonVideoGalleryViewModelProvider);
            OzonVideoGalleryFragment_MembersInjector.injectPlayerDelegateProvider(ozonVideoGalleryFragment, videoMoleculePlayerDelegateProvider());
            OzonVideoGalleryFragment_MembersInjector.injectVolumeContentObserver(ozonVideoGalleryFragment, volumeContentObserver());
            SoundService soundService = this.videoComponentApi.getSoundService();
            j.c(soundService);
            OzonVideoGalleryFragment_MembersInjector.injectSoundService(ozonVideoGalleryFragment, soundService);
            return ozonVideoGalleryFragment;
        }

        private VideoMoleculePlayerDelegateProvider videoMoleculePlayerDelegateProvider() {
            VideoController videoController = this.videoComponentApi.getVideoController();
            j.c(videoController);
            return new VideoMoleculePlayerDelegateProvider(videoController);
        }

        private VolumeContentObserver volumeContentObserver() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new VolumeContentObserver(context);
        }

        @Override // ru.ozon.app.android.gallery.details.OzonVideoGalleryFragmentComponent
        public void inject(OzonVideoGalleryFragment ozonVideoGalleryFragment) {
            injectOzonVideoGalleryFragment(ozonVideoGalleryFragment);
        }

        private OzonVideoGalleryFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, NetworkComponentApi networkComponentApi) {
            this.ozonVideoGalleryFragmentComponentImpl = this;
            this.videoComponentApi = videoComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(contextComponentDependencies, videoComponentApi, networkComponentApi);
        }
    }

    public static OzonVideoGalleryFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
