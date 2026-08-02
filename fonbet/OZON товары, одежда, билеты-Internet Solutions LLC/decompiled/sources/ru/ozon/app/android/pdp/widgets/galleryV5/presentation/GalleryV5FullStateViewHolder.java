package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import WZ.l;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5UpdateKey;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5ButtonsAdapter;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnboardingViewModel;
import ru.ozon.app.android.video.player.soundservice.SoundController;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/BaseGalleryV5ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "preCreationConfig", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "onboardingViewModel", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;", "gallerySyncViewModel", "", "isTextureViewEnabled", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;Z)V", "isVisible", "", "setGalleryElementsVisible", "(Z)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;)V", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "onGalleryElementsVisible", "Lkotlin/jvm/functions/Function1;", "getOnGalleryElementsVisible", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ButtonsAdapter;", "buttonsAdapter", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ButtonsAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5FullStateViewHolder extends BaseGalleryV5ViewHolder {

    @NotNull
    private final GalleryV5ButtonsAdapter buttonsAdapter;

    @NotNull
    private final Function1<Boolean, Unit> onGalleryElementsVisible;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final GalleryV5FullStateView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5FullStateViewHolder(@NotNull GalleryV5FullStateView view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull GalleryV5PreCreationConfig preCreationConfig, @NotNull GalleryV5OnboardingViewModel onboardingViewModel, @NotNull Function0<GalleryVideoPlayer> videoPlayerProvider, @NotNull SoundController soundController, @NotNull GallerySyncViewModel gallerySyncViewModel, boolean z11) {
        super(view.getGalleryRv(), refs, tokenizedAnalytics, preCreationConfig, view, videoPlayerProvider, soundController, gallerySyncViewModel, z11, onboardingViewModel);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(videoPlayerProvider, "videoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(gallerySyncViewModel, "gallerySyncViewModel");
        this.view = view;
        this.refs = refs;
        this.onGalleryElementsVisible = new GalleryV5FullStateViewHolder$onGalleryElementsVisible$1(this);
        GalleryV5ButtonsAdapter galleryV5ButtonsAdapter = new GalleryV5ButtonsAdapter(preCreationConfig, refs, tokenizedAnalytics, onboardingViewModel, view.getPreCreationGalleryResources(), getActionHandler());
        this.buttonsAdapter = galleryV5ButtonsAdapter;
        view.getButtonsRv().setAdapter(galleryV5ButtonsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGalleryElementsVisible(boolean isVisible) {
        this.view.getButtonsRv().setVisibility(isVisible ? 0 : 8);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.presentation.BaseGalleryV5ViewHolder
    public void bind(@NotNull GalleryV5VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getPreCreationConfig().getWidth() != getResources().getDisplayMetrics().widthPixels) {
            setFoldable(true);
            this.refs.getController().update(GalleryV5UpdateKey.INSTANCE);
        } else {
            super.bind(item);
            this.view.updateLayoutParams(item.getPreCreationConfig());
            this.buttonsAdapter.submitList(item.getButtons(), item.getPreCreationConfig());
        }
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.presentation.BaseGalleryV5ViewHolder
    @NotNull
    protected Function1<Boolean, Unit> getOnGalleryElementsVisible() {
        return this.onGalleryElementsVisible;
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
