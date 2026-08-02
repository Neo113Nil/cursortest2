package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l20.c;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.ReviewVoteUpdateKey;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$PreviousVoteState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$PreviousVoteState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BaseReviewWidgetVH$onAttachViewModel$1 extends AbstractC7737t implements Function1<PinnedReviewViewModel$PreviousVoteState, Unit> {
    final /* synthetic */ BaseReviewWidgetVH<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseReviewWidgetVH$onAttachViewModel$1(BaseReviewWidgetVH<T> baseReviewWidgetVH) {
        super(1);
        this.this$0 = baseReviewWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PinnedReviewViewModel$PreviousVoteState pinnedReviewViewModel$PreviousVoteState) {
        invoke2(pinnedReviewViewModel$PreviousVoteState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PinnedReviewViewModel$PreviousVoteState pinnedReviewViewModel$PreviousVoteState) {
        ComposerReferences composerReferences;
        c boundData = this.this$0.getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            composerReferences = ((BaseReviewWidgetVH) this.this$0).refs;
            composerReferences.getController().update(new ReviewVoteUpdateKey(id2, pinnedReviewViewModel$PreviousVoteState.getLiked(), pinnedReviewViewModel$PreviousVoteState.getDisliked()));
        }
    }
}
