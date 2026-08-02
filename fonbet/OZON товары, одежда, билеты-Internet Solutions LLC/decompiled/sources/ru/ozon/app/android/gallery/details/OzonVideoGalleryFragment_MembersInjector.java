package ru.ozon.app.android.gallery.details;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.gallery.common.VolumeContentObserver;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;
import ru.ozon.app.android.video.player.soundservice.SoundService;

/* loaded from: classes12.dex */
public final class OzonVideoGalleryFragment_MembersInjector implements b<OzonVideoGalleryFragment> {
    public static void injectPlayerDelegateProvider(OzonVideoGalleryFragment ozonVideoGalleryFragment, VideoMoleculePlayerDelegateProvider videoMoleculePlayerDelegateProvider) {
        ozonVideoGalleryFragment.playerDelegateProvider = videoMoleculePlayerDelegateProvider;
    }

    public static void injectSoundService(OzonVideoGalleryFragment ozonVideoGalleryFragment, SoundService soundService) {
        ozonVideoGalleryFragment.soundService = soundService;
    }

    public static void injectViewModelProvider(OzonVideoGalleryFragment ozonVideoGalleryFragment, a<OzonVideoGalleryViewModel> aVar) {
        ozonVideoGalleryFragment.viewModelProvider = aVar;
    }

    public static void injectVolumeContentObserver(OzonVideoGalleryFragment ozonVideoGalleryFragment, VolumeContentObserver volumeContentObserver) {
        ozonVideoGalleryFragment.volumeContentObserver = volumeContentObserver;
    }
}
