package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import Sc.InterfaceC4008j;
import WZ.l;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5UpdateKey;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5ImageButtonView;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnBoardingButtonView;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnboardingViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5ButtonOnBoardingBinder;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5SingleIconButtonBinder;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\b?\u0010@R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190B8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateSingleButtonViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/BaseGalleryV5ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "preCreationConfig", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "onboardingViewModel", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;", "gallerySyncViewModel", "", "isTextureViewEnabled", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;Z)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "singleButtonItem", "", "bindButton", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateView;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;)V", "isVisible", "setGalleryElementsVisible", "(Z)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "singleButtonState", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnBoardingButtonView;", "onBoardingIconButton$delegate", "LSc/j;", "getOnBoardingIconButton", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnBoardingButtonView;", "onBoardingIconButton", "onBoardingButton$delegate", "getOnBoardingButton", "onBoardingButton", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ImageButtonView;", "singleIconButton$delegate", "getSingleIconButton", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ImageButtonView;", "singleIconButton", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/GalleryV5ButtonOnBoardingBinder;", "onBoardingBinder$delegate", "getOnBoardingBinder", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/GalleryV5ButtonOnBoardingBinder;", "onBoardingBinder", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/GalleryV5SingleIconButtonBinder;", "singleButtonBinder$delegate", "getSingleButtonBinder", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/GalleryV5SingleIconButtonBinder;", "singleButtonBinder", "Lkotlin/Function1;", "onGalleryElementsVisible", "Lkotlin/jvm/functions/Function1;", "getOnGalleryElementsVisible", "()Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5FullStateSingleButtonViewHolder extends BaseGalleryV5ViewHolder {

    /* renamed from: onBoardingBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onBoardingBinder;

    /* renamed from: onBoardingButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onBoardingButton;

    /* renamed from: onBoardingIconButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onBoardingIconButton;

    @NotNull
    private final Function1<Boolean, Unit> onGalleryElementsVisible;

    @NotNull
    private final GalleryV5OnboardingViewModel onboardingViewModel;

    @NotNull
    private final GalleryV5PreCreationConfig preCreationConfig;

    @NotNull
    private final ComposerReferences refs;

    /* renamed from: singleButtonBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j singleButtonBinder;
    private GalleryV5VO.Button singleButtonState;

    /* renamed from: singleIconButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j singleIconButton;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final GalleryV5FullStateView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5FullStateSingleButtonViewHolder(@NotNull GalleryV5FullStateView view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull GalleryV5PreCreationConfig preCreationConfig, @NotNull GalleryV5OnboardingViewModel onboardingViewModel, @NotNull Function0<GalleryVideoPlayer> videoPlayerProvider, @NotNull SoundController soundController, @NotNull GallerySyncViewModel gallerySyncViewModel, boolean z11) {
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
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.preCreationConfig = preCreationConfig;
        this.onboardingViewModel = onboardingViewModel;
        this.onBoardingIconButton = DelegatesKt.lazyUnsafe(new GalleryV5FullStateSingleButtonViewHolder$onBoardingIconButton$2(this));
        this.onBoardingButton = DelegatesKt.lazyUnsafe(new GalleryV5FullStateSingleButtonViewHolder$onBoardingButton$2(this));
        this.singleIconButton = DelegatesKt.lazyUnsafe(new GalleryV5FullStateSingleButtonViewHolder$singleIconButton$2(this));
        this.onBoardingBinder = DelegatesKt.lazyUnsafe(new GalleryV5FullStateSingleButtonViewHolder$onBoardingBinder$2(this));
        this.singleButtonBinder = DelegatesKt.lazyUnsafe(new GalleryV5FullStateSingleButtonViewHolder$singleButtonBinder$2(this));
        this.onGalleryElementsVisible = new GalleryV5FullStateSingleButtonViewHolder$onGalleryElementsVisible$1(this);
    }

    private final void bindButton(GalleryV5FullStateView galleryV5FullStateView, GalleryV5VO.Button button) {
        View view;
        this.singleButtonState = button;
        int viewType = button.getViewType();
        if (viewType == GalleryV5VO.ButtonViewType.SINGLE_ICON.ordinal()) {
            getSingleButtonBinder().bind(getSingleIconButton(), button, (Function1<? super AtomAction, Unit>) getActionHandler());
            view = getSingleIconButton();
        } else {
            GalleryV5OnBoardingButtonView onBoardingIconButton = viewType == GalleryV5VO.ButtonViewType.ON_BOARDING_ICON.ordinal() ? getOnBoardingIconButton() : getOnBoardingButton();
            getOnBoardingBinder().bind(onBoardingIconButton, button, (Function1<? super AtomAction, Unit>) getActionHandler());
            view = onBoardingIconButton;
        }
        galleryV5FullStateView.getSingleButtonFL().removeAllViews();
        galleryV5FullStateView.getSingleButtonFL().addView(view);
    }

    private final GalleryV5ButtonOnBoardingBinder getOnBoardingBinder() {
        return (GalleryV5ButtonOnBoardingBinder) this.onBoardingBinder.getValue();
    }

    private final GalleryV5OnBoardingButtonView getOnBoardingButton() {
        return (GalleryV5OnBoardingButtonView) this.onBoardingButton.getValue();
    }

    private final GalleryV5OnBoardingButtonView getOnBoardingIconButton() {
        return (GalleryV5OnBoardingButtonView) this.onBoardingIconButton.getValue();
    }

    private final GalleryV5SingleIconButtonBinder getSingleButtonBinder() {
        return (GalleryV5SingleIconButtonBinder) this.singleButtonBinder.getValue();
    }

    private final GalleryV5ImageButtonView getSingleIconButton() {
        return (GalleryV5ImageButtonView) this.singleIconButton.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGalleryElementsVisible(boolean isVisible) {
        this.view.getSingleButtonFL().setVisibility(isVisible ? 0 : 8);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.presentation.BaseGalleryV5ViewHolder
    public void bind(@NotNull GalleryV5VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getPreCreationConfig().getWidth() != getResources().getDisplayMetrics().widthPixels) {
            setFoldable(true);
            this.refs.getController().update(GalleryV5UpdateKey.INSTANCE);
            return;
        }
        super.bind(item);
        this.view.updateLayoutParams(item.getPreCreationConfig());
        List<GalleryV5VO.Button> buttons = item.getButtons();
        GalleryV5VO.Button button = buttons != null ? (GalleryV5VO.Button) C7714v.M(buttons) : null;
        GalleryV5VO.Button button2 = Intrinsics.d(button, this.singleButtonState) ? null : button;
        if (button2 != null) {
            bindButton(this.view, button2);
        }
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.presentation.BaseGalleryV5ViewHolder
    @NotNull
    protected Function1<Boolean, Unit> getOnGalleryElementsVisible() {
        return this.onGalleryElementsVisible;
    }
}
