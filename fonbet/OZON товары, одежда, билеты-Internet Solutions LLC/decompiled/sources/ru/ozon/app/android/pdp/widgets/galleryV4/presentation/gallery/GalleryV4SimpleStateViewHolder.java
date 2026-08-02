package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV4.core.GalleryV4UpdateKey;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.BaseGalleryV4ViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.video.player.soundservice.SoundController;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4SimpleStateViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/BaseGalleryV4ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4SimpleStateView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "preCreationConfig", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;", "gallerySyncViewModel", "", "isTextureViewEnabled", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4SimpleStateView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;Z)V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;", "item", "", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4SimpleStateViewHolder extends BaseGalleryV4ViewHolder {
    public static final int $stable = ComposerReferences.$stable;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4SimpleStateViewHolder(@NotNull GalleryV4SimpleStateView view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull GalleryV4PreCreationConfig preCreationConfig, @NotNull Function0<GalleryVideoPlayer> videoPlayerProvider, @NotNull SoundController soundController, @NotNull GallerySyncViewModel gallerySyncViewModel, boolean z11) {
        super(view, refs, tokenizedAnalytics, preCreationConfig, null, videoPlayerProvider, soundController, gallerySyncViewModel, z11, 16, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        Intrinsics.checkNotNullParameter(videoPlayerProvider, "videoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(gallerySyncViewModel, "gallerySyncViewModel");
        this.refs = refs;
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.BaseGalleryV4ViewHolder
    public void bind(@NotNull GalleryV4VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getPreCreationConfig().getWidth() == getResources().getDisplayMetrics().widthPixels) {
            super.bind(item);
        } else {
            setFoldable(true);
            this.refs.getController().update(GalleryV4UpdateKey.INSTANCE);
        }
    }
}
