package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Ae.O0;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.s;
import android.os.Parcelable;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import h20.InterfaceC6786a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ReviewGalleryPreviewResponse;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewV2MapperKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewGalleryImagePrefetcher;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001YB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010%J\u000f\u0010-\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u001b\u00103\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001e0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010BR\"\u0010C\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\u0016\"\u0004\bF\u0010GR \u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR$\u0010N\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010)R\"\u0010T\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModelImpl;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LSc/j;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewGalleryImagePrefetcher;", "photoPrefetcherLazy", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LSc/j;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "loadNextItems", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ReviewGalleryPreviewResponse;", "response", "emitNextItems", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ReviewGalleryPreviewResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "hasEnoughTimePassedForNextRequest", "()Z", "updateTimeForNextRequest", "()V", "", "voId", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "initialItems", "Lru/ozon/uni/atoms/af/AtomAction;", "setupInitialData", "(JLjava/util/List;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "lastVisiblePosition", "lastItemPosition", "loadNextItemsIfNeed", "(II)V", "Landroid/os/Parcelable;", "state", "saveScrollState", "(Landroid/os/Parcelable;)V", "index", "offset", "updateScrollPosition", "onCleared", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "photoPrefetcher$delegate", "LSc/j;", "getPhotoPrefetcher", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewGalleryImagePrefetcher;", "photoPrefetcher", "Lxe/B0;", "loadNextJob", "Lxe/B0;", "loadNextAction", "Lru/ozon/uni/atoms/af/AtomAction;", "loadNextRequestTime", "J", "loadNextItemOffset", "I", "", "consumedActions", "Ljava/util/Set;", "items", "Ljava/util/List;", "Ljava/lang/Long;", "initialized", "Z", "getInitialized", "setInitialized", "(Z)V", "LAe/x0;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModel$Previews;", "previews", "LAe/x0;", "getPreviews", "()LAe/x0;", "scrollState", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "Lkotlin/Pair;", "_scrollPositon", "Lkotlin/Pair;", "getScrollPosition", "()Lkotlin/Pair;", "scrollPosition", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewViewModelImpl extends w0 implements InterfaceC6786a, ReviewGalleryPreviewViewModel {

    @NotNull
    private Pair<Integer, Integer> _scrollPositon;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final Set<AtomAction> consumedActions;
    private boolean initialized;

    @NotNull
    private List<ReviewGalleryPreviewV2VO.ItemVO> items;
    private AtomAction loadNextAction;
    private int loadNextItemOffset;
    private B0 loadNextJob;
    private long loadNextRequestTime;

    /* renamed from: photoPrefetcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j photoPrefetcher;

    @NotNull
    private final x0<ReviewGalleryPreviewViewModel.Previews> previews;
    private Parcelable scrollState;
    private Long voId;
    public static final int $stable = 8;

    public ReviewGalleryPreviewViewModelImpl(@NotNull ActionV2Repository actionV2Repository, @NotNull InterfaceC4008j<PreviewGalleryImagePrefetcher> photoPrefetcherLazy) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(photoPrefetcherLazy, "photoPrefetcherLazy");
        this.actionV2Repository = actionV2Repository;
        this.photoPrefetcher = photoPrefetcherLazy;
        this.loadNextItemOffset = 10;
        this.consumedActions = new LinkedHashSet();
        this.items = K.f71697a;
        this.previews = O0.a(new ReviewGalleryPreviewViewModel.Previews(null, false, 3, null));
        this._scrollPositon = new Pair<>(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitNextItems(ReviewGalleryPreviewResponse reviewGalleryPreviewResponse, d<? super Unit> dVar) {
        ReviewGalleryPreviewViewModelImpl$emitNextItems$1 reviewGalleryPreviewViewModelImpl$emitNextItems$1;
        int i11;
        ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelImpl;
        if (dVar instanceof ReviewGalleryPreviewViewModelImpl$emitNextItems$1) {
            reviewGalleryPreviewViewModelImpl$emitNextItems$1 = (ReviewGalleryPreviewViewModelImpl$emitNextItems$1) dVar;
            int i12 = reviewGalleryPreviewViewModelImpl$emitNextItems$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                reviewGalleryPreviewViewModelImpl$emitNextItems$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = reviewGalleryPreviewViewModelImpl$emitNextItems$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = reviewGalleryPreviewViewModelImpl$emitNextItems$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    List<ReviewGalleryPreviewResponse.ItemDTO> items = reviewGalleryPreviewResponse.getItems();
                    if (items != null) {
                        List<ReviewGalleryPreviewResponse.ItemDTO> list = items;
                        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ReviewGalleryPreviewV2MapperKt.toVO((ReviewGalleryPreviewResponse.ItemDTO) it.next(), this.voId));
                        }
                        this.items = C7714v.p0(arrayList, this.items);
                        PreviewGalleryImagePrefetcher.prefetchItems$default(getPhotoPrefetcher(), this.items, 0, false, 6, null);
                        x0<ReviewGalleryPreviewViewModel.Previews> previews = getPreviews();
                        ReviewGalleryPreviewViewModel.Previews previews2 = new ReviewGalleryPreviewViewModel.Previews(this.items, false);
                        reviewGalleryPreviewViewModelImpl$emitNextItems$1.L$0 = this;
                        reviewGalleryPreviewViewModelImpl$emitNextItems$1.L$1 = reviewGalleryPreviewResponse;
                        reviewGalleryPreviewViewModelImpl$emitNextItems$1.label = 1;
                        if (previews.emit(previews2, reviewGalleryPreviewViewModelImpl$emitNextItems$1) == aVar) {
                            return aVar;
                        }
                    }
                    reviewGalleryPreviewViewModelImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    reviewGalleryPreviewResponse = (ReviewGalleryPreviewResponse) reviewGalleryPreviewViewModelImpl$emitNextItems$1.L$1;
                    reviewGalleryPreviewViewModelImpl = (ReviewGalleryPreviewViewModelImpl) reviewGalleryPreviewViewModelImpl$emitNextItems$1.L$0;
                    s.b(obj);
                }
                AtomActionDTO nextItemsAction = reviewGalleryPreviewResponse.getNextItemsAction();
                reviewGalleryPreviewViewModelImpl.loadNextAction = nextItemsAction != null ? AtomActionMapperKt.toAtomAction(nextItemsAction, null) : null;
                return Unit.f71690a;
            }
        }
        reviewGalleryPreviewViewModelImpl$emitNextItems$1 = new ReviewGalleryPreviewViewModelImpl$emitNextItems$1(this, dVar);
        Object obj2 = reviewGalleryPreviewViewModelImpl$emitNextItems$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = reviewGalleryPreviewViewModelImpl$emitNextItems$1.label;
        if (i11 != 0) {
        }
        AtomActionDTO nextItemsAction2 = reviewGalleryPreviewResponse.getNextItemsAction();
        reviewGalleryPreviewViewModelImpl.loadNextAction = nextItemsAction2 != null ? AtomActionMapperKt.toAtomAction(nextItemsAction2, null) : null;
        return Unit.f71690a;
    }

    private final PreviewGalleryImagePrefetcher getPhotoPrefetcher() {
        return (PreviewGalleryImagePrefetcher) this.photoPrefetcher.getValue();
    }

    private final boolean hasEnoughTimePassedForNextRequest() {
        return System.currentTimeMillis() > this.loadNextRequestTime;
    }

    private final void loadNextItems(AtomAction.ComposerAction action) {
        this.loadNextJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ReviewGalleryPreviewViewModelImpl$loadNextItems$1(this, action, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimeForNextRequest() {
        this.loadNextRequestTime = System.currentTimeMillis() + 300;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel
    public boolean getInitialized() {
        return this.initialized;
    }

    @NotNull
    public Pair<Integer, Integer> getScrollPosition() {
        return this._scrollPositon;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel
    public Parcelable getScrollState() {
        return this.scrollState;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel
    public void loadNextItemsIfNeed(int lastVisiblePosition, int lastItemPosition) {
        AtomAction atomAction;
        PreviewGalleryImagePrefetcher.prefetchItems$default(getPhotoPrefetcher(), this.items, lastVisiblePosition, false, 4, null);
        if (lastVisiblePosition < lastItemPosition - this.loadNextItemOffset) {
            return;
        }
        if (hasEnoughTimePassedForNextRequest() || lastVisiblePosition == lastItemPosition) {
            B0 b02 = this.loadNextJob;
            if ((b02 != null && b02.isActive()) || (atomAction = this.loadNextAction) == null || C7714v.A(this.consumedActions, atomAction)) {
                return;
            }
            AtomAction atomAction2 = this.loadNextAction;
            AtomAction.ComposerAction composerAction = atomAction2 instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction2 : null;
            if (composerAction == null) {
                return;
            }
            loadNextItems(composerAction);
        }
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        this.loadNextJob = null;
        setScrollState(null);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel
    public void saveScrollState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setScrollState(state);
    }

    public void setInitialized(boolean z11) {
        this.initialized = z11;
    }

    public void setScrollState(Parcelable parcelable) {
        this.scrollState = parcelable;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel
    public void setupInitialData(long voId, @NotNull List<ReviewGalleryPreviewV2VO.ItemVO> initialItems, AtomAction action) {
        Intrinsics.checkNotNullParameter(initialItems, "initialItems");
        this.voId = Long.valueOf(voId);
        setScrollState(null);
        updateScrollPosition(0, 0);
        this.loadNextAction = action;
        this.loadNextItemOffset = initialItems.size();
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ReviewGalleryPreviewViewModelImpl$setupInitialData$1(this, initialItems, null), 3);
    }

    public void updateScrollPosition(int index, int offset) {
        this._scrollPositon = new Pair<>(Integer.valueOf(index), Integer.valueOf(offset));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel
    @NotNull
    public x0<ReviewGalleryPreviewViewModel.Previews> getPreviews() {
        return this.previews;
    }
}
