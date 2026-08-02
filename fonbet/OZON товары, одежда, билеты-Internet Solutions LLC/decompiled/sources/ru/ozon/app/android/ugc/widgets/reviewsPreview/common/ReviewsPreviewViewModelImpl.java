package ru.ozon.app.android.ugc.widgets.reviewsPreview.common;

import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.PairCoordinator;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJI\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModelImpl;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "recalculate", "()V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "atomAction", "processViewAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "onCleared", "", "pairId", "", "blockIndex", "Lkotlin/Function0;", "blockOnEntry", "onStart", "onStop", "onBlockEnterBounds", "(JILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "currentBlock", "nextBlock", "onVideoLooped", "(JII)V", "", "score", "updateScore", "(JF)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/PairCoordinator;", "coordinators", "Ljava/util/Map;", TopAuthorDTO.SCORES_FIELD_NAME, "activePairId", "Ljava/lang/Long;", "", "isViewActionSent", "Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewViewModelImpl extends w0 implements InterfaceC6786a, ReviewsPreviewViewModel {

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private Long activePairId;

    @NotNull
    private final Map<Long, PairCoordinator> coordinators;
    private boolean isViewActionSent;

    @NotNull
    private final Map<Long, Float> scores;

    public ReviewsPreviewViewModelImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.coordinators = new LinkedHashMap();
        this.scores = new LinkedHashMap();
    }

    private final void recalculate() {
        Object next;
        Map<Long, Float> map = this.scores;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, Float> entry : map.entrySet()) {
            if (entry.getValue().floatValue() >= 0.2f) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        next = next2;
                        floatValue = floatValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        Long l11 = entry2 != null ? (Long) entry2.getKey() : null;
        if (Intrinsics.d(l11, this.activePairId)) {
            return;
        }
        Long l12 = this.activePairId;
        if (l12 != null) {
            PairCoordinator pairCoordinator = this.coordinators.get(Long.valueOf(l12.longValue()));
            if (pairCoordinator != null) {
                pairCoordinator.deactivate();
            }
        }
        this.activePairId = l11;
        if (l11 != null) {
            PairCoordinator pairCoordinator2 = this.coordinators.get(Long.valueOf(l11.longValue()));
            if (pairCoordinator2 != null) {
                pairCoordinator2.activate();
            }
        }
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModel
    public void onBlockEnterBounds(long pairId, int blockIndex, @NotNull Function0<Integer> blockOnEntry, @NotNull Function0<Unit> onStart, @NotNull Function0<Unit> onStop) {
        Intrinsics.checkNotNullParameter(blockOnEntry, "blockOnEntry");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        Map<Long, PairCoordinator> map = this.coordinators;
        Long valueOf = Long.valueOf(pairId);
        PairCoordinator pairCoordinator = map.get(valueOf);
        if (pairCoordinator == null) {
            pairCoordinator = new PairCoordinator(blockOnEntry);
            map.put(valueOf, pairCoordinator);
        }
        pairCoordinator.register(blockIndex, onStart, onStop);
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModel
    public void onVideoLooped(long pairId, int currentBlock, int nextBlock) {
        PairCoordinator pairCoordinator = this.coordinators.get(Long.valueOf(pairId));
        if (pairCoordinator != null) {
            pairCoordinator.switchTo(nextBlock);
        }
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModel
    public void processViewAction(@NotNull AtomAction.ComposerAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        String id2 = atomAction.getId();
        if (id2 == null || this.isViewActionSent) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new ReviewsPreviewViewModelImpl$processViewAction$1(this, atomAction, id2, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModel
    public void updateScore(long pairId, float score) {
        if (Intrinsics.b(this.scores.get(Long.valueOf(pairId)), score)) {
            return;
        }
        this.scores.put(Long.valueOf(pairId), Float.valueOf(score));
        recalculate();
    }
}
