package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModelImpl;", "", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$PreviousVoteState;", "previousState", "", "revertVote", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$PreviousVoteState;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "votePressed", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$PreviousVoteState;)V", "onCleared", "()V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "revertVoteStateEvent", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getRevertVoteStateEvent", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$VoteError;", "showErrorEvent", "getShowErrorEvent", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$PreviousVoteState;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewViewModelImpl extends w0 implements InterfaceC6786a {

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private PinnedReviewViewModel$PreviousVoteState previousState;

    @NotNull
    private final SingleLiveEvent<PinnedReviewViewModel$PreviousVoteState> revertVoteStateEvent;

    @NotNull
    private final SingleLiveEvent<PinnedReviewViewModel$VoteError> showErrorEvent;

    public PinnedReviewViewModelImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.revertVoteStateEvent = new SingleLiveEvent<>();
        this.showErrorEvent = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void revertVote(PinnedReviewViewModel$PreviousVoteState previousState) {
        getRevertVoteStateEvent().postValue(previousState);
    }

    @NotNull
    public SingleLiveEvent<PinnedReviewViewModel$PreviousVoteState> getRevertVoteStateEvent() {
        return this.revertVoteStateEvent;
    }

    @NotNull
    public SingleLiveEvent<PinnedReviewViewModel$VoteError> getShowErrorEvent() {
        return this.showErrorEvent;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }

    public void votePressed(@NotNull AtomAction.Click action, @NotNull PinnedReviewViewModel$PreviousVoteState previousState) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(previousState, "previousState");
        String link = action.getLink();
        Map<String, String> params = action.getParams();
        if (link == null || params == null) {
            revertVote(previousState);
        } else if (this.previousState == null) {
            this.previousState = previousState;
            C10727i.c(x0.a(this), null, null, new PinnedReviewViewModelImpl$votePressed$1(this, params, link, previousState, null), 3);
        }
    }
}
