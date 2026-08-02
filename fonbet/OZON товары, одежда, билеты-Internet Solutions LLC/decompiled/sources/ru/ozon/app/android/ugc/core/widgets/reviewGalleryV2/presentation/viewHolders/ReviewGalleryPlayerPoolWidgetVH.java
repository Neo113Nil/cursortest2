package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.s;
import WZ.l;
import Wc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.material.bottomsheet.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.RedesignedPhotoBinder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.SubviewsDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.ReviewGalleryView;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u0000 92\u00020\u0001:\u00019Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020!2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J)\u00103\u001a\u00020!2\b\u00100\u001a\u0004\u0018\u00010\u001f2\u0006\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020,H\u0014¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryPlayerPoolWidgetVH;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "playerDelegate", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;", "mainViewModel", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2PlayerPoolViewModel;", "playerPoolViewModel", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;", "view", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/RedesignedPhotoBinder;", "redesignedPhotoBinder", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/SubviewsDelegate;", "subviewsDelegate", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "ugcCachedActionsSharedViewModel", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2PlayerPoolViewModel;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/RedesignedPhotoBinder;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/SubviewsDelegate;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/d;Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;)V", "", "adapterPos", "", "stopPlayer", "(I)V", "onRecycle", "()V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "content", "", "isCompactControls", "buildVideo", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Z)V", "currentPosition", "isPlaybackAvailable", "needNewHolder", "managePlaying", "(Ljava/lang/Integer;ZZ)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2PlayerPoolViewModel;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPlayerPoolWidgetVH extends ReviewGalleryBaseWidgetVH {

    @NotNull
    private final ReviewGalleryV2MainViewModel mainViewModel;

    @NotNull
    private final VideoMoleculePlayerDelegate playerDelegate;

    @NotNull
    private final ReviewGalleryV2PlayerPoolViewModel playerPoolViewModel;

    @NotNull
    private final ComposerReferences refs;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "requestedPlayerPosition", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryPlayerPoolWidgetVH$1", f = "ReviewGalleryPlayerPoolWidgetVH.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryPlayerPoolWidgetVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Integer, d<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = ReviewGalleryPlayerPoolWidgetVH.this.new AnonymousClass1(dVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            int i11 = this.I$0;
            int adapterPosition = ReviewGalleryPlayerPoolWidgetVH.this.getAdapterPosition();
            if (adapterPosition >= 0 && Math.abs(i11 - adapterPosition) >= 3) {
                ReviewGalleryPlayerPoolWidgetVH.this.stopPlayer(adapterPosition);
                ReviewGalleryPlayerPoolWidgetVH.this.playerPoolViewModel.onPositionForPlayerReleased(i11);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
            return invoke(num.intValue(), dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewGalleryPlayerPoolWidgetVH(@NotNull VideoMoleculePlayerDelegate playerDelegate, @NotNull ComposerReferences refs, @NotNull ReviewGalleryV2MainViewModel mainViewModel, @NotNull ReviewGalleryV2PlayerPoolViewModel playerPoolViewModel, @NotNull ReviewGalleryView view, @NotNull RedesignedPhotoBinder redesignedPhotoBinder, @NotNull SubviewsDelegate subviewsDelegate, @NotNull FrameBinder frameBinder, @NotNull l tokenizedAnalytics, @NotNull HandlersInhibitor handlersInhibitor, @NotNull Vg.d customActionHandlersStoreFactory, @NotNull SubscribeAuthorsIdStorage subscribeAuthorsIdStorage, @NotNull UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel) {
        super(view, redesignedPhotoBinder, subviewsDelegate, playerDelegate, refs, mainViewModel, frameBinder, tokenizedAnalytics, subscribeAuthorsIdStorage, ugcCachedActionsSharedViewModel, handlersInhibitor, customActionHandlersStoreFactory);
        Intrinsics.checkNotNullParameter(playerDelegate, "playerDelegate");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        Intrinsics.checkNotNullParameter(playerPoolViewModel, "playerPoolViewModel");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(redesignedPhotoBinder, "redesignedPhotoBinder");
        Intrinsics.checkNotNullParameter(subviewsDelegate, "subviewsDelegate");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(subscribeAuthorsIdStorage, "subscribeAuthorsIdStorage");
        Intrinsics.checkNotNullParameter(ugcCachedActionsSharedViewModel, "ugcCachedActionsSharedViewModel");
        this.playerDelegate = playerDelegate;
        this.refs = refs;
        this.mainViewModel = mainViewModel;
        this.playerPoolViewModel = playerPoolViewModel;
        C2399j.C(new C2408n0(playerPoolViewModel.getPositionForPlayerRequest(), new AnonymousClass1(null)), H.a(refs.getContainer().g().getLifecycle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPlayer(int adapterPos) {
        this.playerDelegate.setWasVideoRendered(false);
        this.playerDelegate.switchPlayWhenReadyTo(false);
        VideoMoleculeViewHolder videoHolder = getVideoHolder();
        if (videoHolder != null) {
            videoHolder.stop();
        }
        setVideoHolder(null);
        this.playerPoolViewModel.onPositionForPlayerOutdated(adapterPos);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH
    protected void buildVideo(@NotNull VideoMolecule content, boolean isCompactControls) {
        Intrinsics.checkNotNullParameter(content, "content");
        super.buildVideo(content, isCompactControls);
        this.playerPoolViewModel.onPositionForPlayerCaptured(getAdapterPosition());
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH
    protected void managePlaying(Integer currentPosition, boolean isPlaybackAvailable, boolean needNewHolder) {
        List<ComponentCallbacksC5392m> r02;
        int adapterPosition = getAdapterPosition();
        if (currentPosition == null || currentPosition.intValue() != adapterPosition) {
            if (adapterPosition >= 0 && currentPosition != null && getVideoHolder() != null && Math.abs(currentPosition.intValue() - adapterPosition) > 1) {
                stopPlayer(adapterPosition);
                return;
            }
            VideoMoleculeViewHolder videoHolder = getVideoHolder();
            if (videoHolder != null) {
                videoHolder.pauseVideo();
                return;
            }
            return;
        }
        G d11 = this.refs.getContainer().d();
        if (((d11 == null || (r02 = d11.r0()) == null) ? null : (ComponentCallbacksC5392m) C7714v.Z(r02)) instanceof b) {
            return;
        }
        VideoMoleculeViewHolder videoHolder2 = getVideoHolder();
        if (videoHolder2 != null) {
            VideoMoleculeViewHolder videoHolder3 = getVideoHolder();
            if (videoHolder3 != null) {
                setSoundState(videoHolder3, this.mainViewModel.isMuted());
            }
            videoHolder2.playVideo();
            if (this.playerDelegate.getWasVideoRendered()) {
                this.playerPoolViewModel.onVideoRenderedForPosition(currentPosition.intValue());
                return;
            }
            return;
        }
        ReviewGalleryVO boundData = getBoundData();
        if (boundData != null) {
            if (boundData.getContent().getImage() != null) {
                this.playerPoolViewModel.onVideoRenderedForPosition(adapterPosition);
                return;
            }
            if (boundData.getContent().getVideo() != null) {
                if (this.playerPoolViewModel.shouldAskHoldersToReleasePlayer() && !needNewHolder) {
                    this.playerPoolViewModel.onPositionForPlayerRequested(adapterPosition);
                    return;
                }
                buildVideo(boundData.getContent().getVideo(), boundData.getIsCompactControls());
                VideoMoleculeViewHolder videoHolder4 = getVideoHolder();
                if (videoHolder4 != null) {
                    setSoundState(videoHolder4, this.mainViewModel.isMuted());
                }
            }
        }
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH, ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        SingleLiveEvent<Boolean> onRenderedFirstFrame;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        ReviewGalleryVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        ReviewGalleryV2ViewModelImpl viewModel = getViewModel();
        if (viewModel != null && (onRenderedFirstFrame = viewModel.getOnRenderedFirstFrame()) != null) {
            onRenderedFirstFrame.observe(this.refs.getContainer().g(), new ReviewGalleryPlayerPoolWidgetVH$sam$androidx_lifecycle_Observer$0(new ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$1(this)));
        }
        C2399j.C(new C2408n0(this.playerPoolViewModel.getPositionForPlayerReleased(), new ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2(this, boundData, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.playerPoolViewModel.getVideoRenderInfoForPosition(), new ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3(this, boundData, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH, jk0.j
    public void onRecycle() {
        this.playerDelegate.switchPlayWhenReadyTo(false);
        super.onRecycle();
        this.playerPoolViewModel.onPositionForPlayerOutdated(getAdapterPosition());
    }
}
