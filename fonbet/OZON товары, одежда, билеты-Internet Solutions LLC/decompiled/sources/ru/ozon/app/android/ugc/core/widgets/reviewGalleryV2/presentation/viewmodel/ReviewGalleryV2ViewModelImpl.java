package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel;

import android.os.Parcelable;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ProductReviewRepository;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryComposerAction;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0019J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010\u001bJ\u0019\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010\u001bJ\u0017\u00100\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b0\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R \u00105\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u00109\u001a\b\u0012\u0004\u0012\u00020\n038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R \u0010;\u001a\b\u0012\u0004\u0012\u00020\n038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R \u0010>\u001a\b\u0012\u0004\u0012\u00020=038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u00108R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b@\u00108R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\bA\u00108R \u0010B\u001a\b\u0012\u0004\u0012\u00020\f038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u00108R$\u0010D\u001a\u0004\u0018\u00010+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010.R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel;", "Lh20/a;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;", "productReviewRepository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;)V", "", "widgetPosition", "", "hasProduct", "hasProductsContainer", "hasFreshBadge", "hasCloseButton", "", "initState", "(IZZZZ)V", "hasAudio", "hasAudioChanged", "(Z)V", "orientation", "orientationChanged", "(I)V", "videoFinished", "()V", "onRenderedFirstFrame", "isVisible", "visibilityChanged", "currentWidget", "currentWidgetChanged", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "onComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "contentIsLoaded", "onCleared", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "processContentViewAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Landroid/os/Parcelable;", "state", "saveProductsContainerScrollState", "(Landroid/os/Parcelable;)V", "clearProductsContainerScrollState", "onLikeClicked", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2WidgetState;", "widgetState", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getWidgetState", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "nextVideoEvent", "getNextVideoEvent", "orientationChangeEvent", "getOrientationChangeEvent", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult;", "actionResult", "getActionResult", "getHasAudio", "getOnRenderedFirstFrame", "contentIsLoadedEvent", "getContentIsLoadedEvent", "scrollState", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "I", "Lnc/a;", "disposables", "Lnc/a;", "isLikeChangeRequestRunning", "Z", "localWidgetState", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2WidgetState;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryV2ViewModelImpl extends w0 implements ReviewGalleryV2ViewModel, InterfaceC6786a {

    @NotNull
    private final SingleLiveEvent<ReviewGalleryV2ViewModel.ActionResult> actionResult;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final SingleLiveEvent<Boolean> contentIsLoadedEvent;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final SingleLiveEvent<Boolean> hasAudio;
    private boolean isLikeChangeRequestRunning;

    @NotNull
    private ReviewGalleryV2WidgetState localWidgetState;

    @NotNull
    private final SingleLiveEvent<Integer> nextVideoEvent;

    @NotNull
    private final SingleLiveEvent<Boolean> onRenderedFirstFrame;

    @NotNull
    private final SingleLiveEvent<Integer> orientationChangeEvent;

    @NotNull
    private final ProductReviewRepository productReviewRepository;
    private Parcelable scrollState;
    private int widgetPosition;

    @NotNull
    private final SingleLiveEvent<ReviewGalleryV2WidgetState> widgetState;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReviewGalleryComposerAction.values().length];
            try {
                iArr[ReviewGalleryComposerAction.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewGalleryComposerAction.VOTE_MEDIA_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReviewGalleryComposerAction.VOTE_MEDIA_DISLIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReviewGalleryComposerAction.VOTE_MEDIA_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReviewGalleryV2ViewModelImpl(@NotNull ActionV2Repository actionV2Repository, @NotNull ProductReviewRepository productReviewRepository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(productReviewRepository, "productReviewRepository");
        this.actionV2Repository = actionV2Repository;
        this.productReviewRepository = productReviewRepository;
        this.widgetState = new SingleLiveEvent<>();
        this.nextVideoEvent = new SingleLiveEvent<>();
        this.orientationChangeEvent = new SingleLiveEvent<>();
        this.actionResult = new SingleLiveEvent<>();
        this.hasAudio = new SingleLiveEvent<>();
        this.onRenderedFirstFrame = new SingleLiveEvent<>();
        this.contentIsLoadedEvent = new SingleLiveEvent<>();
        this.disposables = new C8486a();
        this.localWidgetState = new ReviewGalleryV2WidgetState(1, false, false, false, false, false, false, false, false, 510, null);
        getWidgetState().setValue(this.localWidgetState);
    }

    private final void onLikeClicked(AtomAction.ComposerAction action) {
        if (this.isLikeChangeRequestRunning) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new ReviewGalleryV2ViewModelImpl$onLikeClicked$1(this, action, null), 3);
    }

    public void clearProductsContainerScrollState() {
        setScrollState(null);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModel
    public void contentIsLoaded() {
        getContentIsLoadedEvent().setValue(Boolean.TRUE);
    }

    public void currentWidgetChanged(int currentWidget) {
        this.localWidgetState = ReviewGalleryV2WidgetState.copy$default(this.localWidgetState, 0, false, false, false, false, false, false, currentWidget == this.widgetPosition, false, 383, null);
        getWidgetState().setValue(this.localWidgetState);
    }

    @NotNull
    public SingleLiveEvent<ReviewGalleryV2ViewModel.ActionResult> getActionResult() {
        return this.actionResult;
    }

    @NotNull
    public SingleLiveEvent<Boolean> getContentIsLoadedEvent() {
        return this.contentIsLoadedEvent;
    }

    @NotNull
    public SingleLiveEvent<Boolean> getHasAudio() {
        return this.hasAudio;
    }

    @NotNull
    public SingleLiveEvent<Integer> getNextVideoEvent() {
        return this.nextVideoEvent;
    }

    @NotNull
    public SingleLiveEvent<Boolean> getOnRenderedFirstFrame() {
        return this.onRenderedFirstFrame;
    }

    @NotNull
    public SingleLiveEvent<Integer> getOrientationChangeEvent() {
        return this.orientationChangeEvent;
    }

    public Parcelable getScrollState() {
        return this.scrollState;
    }

    @NotNull
    public SingleLiveEvent<ReviewGalleryV2WidgetState> getWidgetState() {
        return this.widgetState;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModel
    public void hasAudioChanged(boolean hasAudio) {
        getHasAudio().setValue(Boolean.valueOf(hasAudio));
    }

    public void initState(int widgetPosition, boolean hasProduct, boolean hasProductsContainer, boolean hasFreshBadge, boolean hasCloseButton) {
        this.localWidgetState = ReviewGalleryV2WidgetState.copy$default(this.localWidgetState, 0, false, false, hasProduct, hasProductsContainer, hasFreshBadge, false, false, hasCloseButton, 199, null);
        getWidgetState().setValue(this.localWidgetState);
        this.widgetPosition = widgetPosition;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        this.disposables.d();
        setScrollState(null);
    }

    public void onComposerAction(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ReviewGalleryComposerAction fromValue = ReviewGalleryComposerAction.INSTANCE.fromValue(action.getId());
        int i11 = fromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromValue.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            onLikeClicked(action);
        }
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModel
    public void onRenderedFirstFrame() {
        getOnRenderedFirstFrame().setValue(Boolean.TRUE);
    }

    public void orientationChanged(int orientation) {
        this.localWidgetState = ReviewGalleryV2WidgetState.copy$default(this.localWidgetState, orientation, false, false, false, false, false, false, false, false, 510, null);
        getWidgetState().setValue(this.localWidgetState);
        if (this.localWidgetState.getIsCurrentWidget()) {
            getOrientationChangeEvent().setValue(Integer.valueOf(this.widgetPosition));
        }
    }

    public void processContentViewAction(AtomAction atomAction) {
        AtomAction.ComposerAction composerAction = atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null;
        if (composerAction == null) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new ReviewGalleryV2ViewModelImpl$processContentViewAction$1(this, composerAction, null), 3);
    }

    public void saveProductsContainerScrollState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setScrollState(state);
    }

    public void setScrollState(Parcelable parcelable) {
        this.scrollState = parcelable;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModel
    public void videoFinished() {
        if (this.localWidgetState.getOrientation() == 1 && this.localWidgetState.getIsCurrentWidget()) {
            getNextVideoEvent().setValue(Integer.valueOf(this.widgetPosition + 1));
        }
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModel
    public void visibilityChanged(boolean isVisible) {
        this.localWidgetState = ReviewGalleryV2WidgetState.copy$default(this.localWidgetState, 0, false, isVisible, false, false, false, false, false, false, 507, null);
        getWidgetState().setValue(this.localWidgetState);
    }
}
