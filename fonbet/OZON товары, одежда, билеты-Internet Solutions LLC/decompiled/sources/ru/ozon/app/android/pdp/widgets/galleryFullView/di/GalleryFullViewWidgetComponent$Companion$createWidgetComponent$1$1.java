package ru.ozon.app.android.pdp.widgets.galleryFullView.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.gallery.common.VolumeContentObserver;
import ru.ozon.app.android.pdp.widgets.galleryFullView.core.GalleryFullViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewLayout;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GallerySyncViewModelImpl;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.soundservice.SoundService;

@Metadata(d1 = {"\u0000i\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"ru/ozon/app/android/pdp/widgets/galleryFullView/di/GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1", "Lru/ozon/app/android/pdp/widgets/galleryFullView/di/GalleryFullViewWidgetComponent;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "platformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/core/GalleryFullViewMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/core/GalleryFullViewMapper;", "mapper", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "playerDelegateProvider$delegate", "getPlayerDelegateProvider", "()Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "playerDelegateProvider", "Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "volumeContentObserver$delegate", "getVolumeContentObserver", "()Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "volumeContentObserver", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout;", "layout$delegate", "getLayout", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout;", "layout", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/video/di/VideoComponentApi;", "getVideoComponentApi", "()Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "getViewModelProvider", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "viewModelProvider", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "getSoundService", "()Lru/ozon/app/android/video/player/soundservice/SoundService;", "soundService", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1 implements GalleryFullViewWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AndroidPlatformComponentDependencies platformComponentDependencies;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1$mapper$2(this));

    /* renamed from: playerDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j playerDelegateProvider = k.b(new GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1$playerDelegateProvider$2(this));

    /* renamed from: volumeContentObserver$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j volumeContentObserver = k.b(new GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1$volumeContentObserver$2(this));

    /* renamed from: layout$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j layout = k.b(GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1$layout$2.INSTANCE);

    GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.platformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.di.GalleryFullViewWidgetComponent
    public AppType getAppType() {
        return this.platformComponentDependencies.getAppType();
    }

    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.di.GalleryFullViewWidgetComponent
    public GalleryFullViewLayout getLayout() {
        return (GalleryFullViewLayout) this.layout.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.di.GalleryFullViewWidgetComponent
    public GalleryFullViewMapper getMapper() {
        return (GalleryFullViewMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.di.GalleryFullViewWidgetComponent
    public VideoMoleculePlayerDelegateProvider getPlayerDelegateProvider() {
        return (VideoMoleculePlayerDelegateProvider) this.playerDelegateProvider.getValue();
    }

    public final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.di.GalleryFullViewWidgetComponent
    public SoundService getSoundService() {
        return getVideoComponentApi().getSoundService();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.di.GalleryFullViewWidgetComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }

    public final VideoComponentApi getVideoComponentApi() {
        return (VideoComponentApi) this.$storage.getComponent(VideoComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.di.GalleryFullViewWidgetComponent
    public GallerySyncViewModelImpl getViewModelProvider() {
        return new GallerySyncViewModelImpl();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.di.GalleryFullViewWidgetComponent
    public VolumeContentObserver getVolumeContentObserver() {
        return (VolumeContentObserver) this.volumeContentObserver.getValue();
    }
}
