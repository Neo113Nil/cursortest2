package ru.ozon.app.android.storefront.widgets.playvideo.presentation;

import Vg.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.databinding.PlayVideoWidgetBinding;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.mute.MuteButtonView;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.mute.PlayVideoMuteButtonDelegate;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoViewModel;
import ru.ozon.app.android.videomolecule.presentation.view.VideoMoleculeView;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.videomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoViewHolderProvider;", "", "Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "playerDelegateProvider", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;LVg/c;)V", "Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;", "moleculeView", "Ll10/i;", "container", "Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "provideVideoMoleculeViewHolder", "(Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;Ll10/i;)Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "Lru/ozon/app/android/storefront/databinding/PlayVideoWidgetBinding;", "binding", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;", "playVideoViewModel", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoViewHolder;", "provide", "(Ll10/i;Lru/ozon/app/android/storefront/databinding/PlayVideoWidgetBinding;Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;)Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoViewHolder;", "Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "LVg/c;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayVideoViewHolderProvider {

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final VideoMoleculePlayerDelegateProvider playerDelegateProvider;

    public PlayVideoViewHolderProvider(@NotNull VideoMoleculePlayerDelegateProvider playerDelegateProvider, @NotNull c customActionHandlersStore) {
        Intrinsics.checkNotNullParameter(playerDelegateProvider, "playerDelegateProvider");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        this.playerDelegateProvider = playerDelegateProvider;
        this.customActionHandlersStore = customActionHandlersStore;
    }

    private final VideoMoleculeViewHolder provideVideoMoleculeViewHolder(VideoMoleculeView moleculeView, i container) {
        return new VideoMoleculeViewHolder(moleculeView, this.playerDelegateProvider.get(), new VideoMoleculeRefsProvider(container), container.Q().g().getLifecycle());
    }

    @NotNull
    public final PlayVideoViewHolder provide(@NotNull i container, @NotNull PlayVideoWidgetBinding binding, @NotNull PlayVideoViewModel playVideoViewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(playVideoViewModel, "playVideoViewModel");
        VideoMoleculeView moleculeView = binding.moleculeView;
        Intrinsics.checkNotNullExpressionValue(moleculeView, "moleculeView");
        VideoMoleculeViewHolder provideVideoMoleculeViewHolder = provideVideoMoleculeViewHolder(moleculeView, container);
        MuteButtonView muteButton = binding.muteButton;
        Intrinsics.checkNotNullExpressionValue(muteButton, "muteButton");
        return new PlayVideoViewHolder(container, provideVideoMoleculeViewHolder, new PlayVideoMuteButtonDelegate(muteButton), binding, playVideoViewModel, new PlayVideoVisibilityDelegate(binding), this.customActionHandlersStore, new PlayVideoEventsDelegate(playVideoViewModel));
    }
}
