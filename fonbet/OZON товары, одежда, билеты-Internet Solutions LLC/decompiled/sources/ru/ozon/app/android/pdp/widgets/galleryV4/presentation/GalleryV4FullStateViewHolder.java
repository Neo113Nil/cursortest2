package ru.ozon.app.android.pdp.widgets.galleryV4.presentation;

import WZ.l;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV4.core.GalleryV4UpdateKey;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.GalleryV4ButtonsAdapter;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.GalleryV4ButtonsViewModel;
import ru.ozon.app.android.video.player.soundservice.SoundController;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4FullStateViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/BaseGalleryV4ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4FullStateView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "preCreationConfig", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsViewModel;", "buttonsViewModelProvider", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;", "gallerySyncViewModel", "", "isTextureViewEnabled", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4FullStateView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsViewModel;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;Z)V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;", "item", "", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;)V", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4FullStateView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsAdapter;", "buttonsAdapter", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4FullStateViewHolder extends BaseGalleryV4ViewHolder {

    @NotNull
    private final GalleryV4ButtonsAdapter buttonsAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final GalleryV4FullStateView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4FullStateViewHolder(@NotNull GalleryV4FullStateView view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull GalleryV4PreCreationConfig preCreationConfig, @NotNull GalleryV4ButtonsViewModel buttonsViewModelProvider, @NotNull Function0<GalleryVideoPlayer> videoPlayerProvider, @NotNull SoundController soundController, @NotNull GallerySyncViewModel gallerySyncViewModel, boolean z11) {
        super(view.getGalleryRv(), refs, tokenizedAnalytics, preCreationConfig, view, videoPlayerProvider, soundController, gallerySyncViewModel, z11);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        Intrinsics.checkNotNullParameter(buttonsViewModelProvider, "buttonsViewModelProvider");
        Intrinsics.checkNotNullParameter(videoPlayerProvider, "videoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(gallerySyncViewModel, "gallerySyncViewModel");
        this.view = view;
        this.refs = refs;
        GalleryV4ButtonsAdapter galleryV4ButtonsAdapter = new GalleryV4ButtonsAdapter(preCreationConfig, refs, tokenizedAnalytics, buttonsViewModelProvider, view.getPreCreationGalleryResources(), getActionHandler());
        this.buttonsAdapter = galleryV4ButtonsAdapter;
        view.getButtonsRv().setAdapter(galleryV4ButtonsAdapter);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.BaseGalleryV4ViewHolder
    public void bind(@NotNull GalleryV4VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getPreCreationConfig().getWidth() != getResources().getDisplayMetrics().widthPixels) {
            setFoldable(true);
            this.refs.getController().update(GalleryV4UpdateKey.INSTANCE);
        } else {
            super.bind(item);
            this.view.updateLayoutParams(item.getPreCreationConfig());
            this.buttonsAdapter.submitList(item.getButtons(), item.getPreCreationConfig());
        }
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        boolean z11 = false;
        if (getIsResumedState() && o.a(this.view, info, false) > 0.0f) {
            z11 = true;
        }
        this.view.updateButtons(z11);
        super.onVisibleAreaChanged(info);
    }
}
