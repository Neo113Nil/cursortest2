package ru.ozon.app.android.ugc.widgets.reviewsPreview.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModel;", "", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "atomAction", "", "processViewAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "", "pairId", "", "blockIndex", "Lkotlin/Function0;", "blockOnEntry", "onStart", "onStop", "onBlockEnterBounds", "(JILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "currentBlock", "nextBlock", "onVideoLooped", "(JII)V", "", "score", "updateScore", "(JF)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReviewsPreviewViewModel {
    void onBlockEnterBounds(long pairId, int blockIndex, @NotNull Function0<Integer> blockOnEntry, @NotNull Function0<Unit> onStart, @NotNull Function0<Unit> onStop);

    void onVideoLooped(long pairId, int currentBlock, int nextBlock);

    void processViewAction(@NotNull AtomAction.ComposerAction atomAction);

    void updateScore(long pairId, float score);
}
