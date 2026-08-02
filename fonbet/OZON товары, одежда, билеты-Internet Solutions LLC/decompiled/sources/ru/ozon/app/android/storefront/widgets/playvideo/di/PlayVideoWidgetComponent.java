package ru.ozon.app.android.storefront.widgets.playvideo.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoViewModel;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.videomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/di/PlayVideoWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "videoMoleculePlayerDelegateProvider$delegate", "LSc/j;", "getVideoMoleculePlayerDelegateProvider", "()Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "videoMoleculePlayerDelegateProvider", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;", "getPlayVideoViewModel", "()Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;", "playVideoViewModel", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayVideoWidgetComponent implements InterfaceC6958a {

    @NotNull
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    @NotNull
    private final VideoComponentApi videoComponentApi;

    /* renamed from: videoMoleculePlayerDelegateProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j videoMoleculePlayerDelegateProvider;

    public PlayVideoWidgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
        this.videoComponentApi = (VideoComponentApi) storage.getComponent(VideoComponentApi.class);
        this.videoMoleculePlayerDelegateProvider = k.b(new PlayVideoWidgetComponent$videoMoleculePlayerDelegateProvider$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoController getVideoController() {
        return this.videoComponentApi.getVideoController();
    }

    @NotNull
    public final d getCustomActionHandlersFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final PlayVideoViewModel getPlayVideoViewModel() {
        return new PlayVideoViewModel();
    }

    @NotNull
    public final VideoMoleculePlayerDelegateProvider getVideoMoleculePlayerDelegateProvider() {
        return (VideoMoleculePlayerDelegateProvider) this.videoMoleculePlayerDelegateProvider.getValue();
    }
}
