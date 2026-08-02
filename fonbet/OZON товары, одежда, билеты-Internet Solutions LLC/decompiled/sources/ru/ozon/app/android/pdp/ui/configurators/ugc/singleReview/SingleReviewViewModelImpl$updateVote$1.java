package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.VoteResponse;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.Action;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/data/AtomDTO;", "it", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SingleReviewViewModelImpl$updateVote$1 extends AbstractC7737t implements Function1<TagV3Atom.TagAtom, AtomDTO> {
    final /* synthetic */ ButtonsVO $item;
    final /* synthetic */ VoteResponse $voteResponse;
    final /* synthetic */ SingleReviewViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleReviewViewModelImpl$updateVote$1(VoteResponse voteResponse, SingleReviewViewModelImpl singleReviewViewModelImpl, ButtonsVO buttonsVO) {
        super(1);
        this.$voteResponse = voteResponse;
        this.this$0 = singleReviewViewModelImpl;
        this.$item = buttonsVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AtomDTO invoke(TagV3Atom.TagAtom it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String count = it.getCount();
        boolean z11 = false;
        int parseInt = count != null ? Integer.parseInt(count) : 0;
        int useful = this.$voteResponse.getUsefulness().getUseful();
        if (useful > parseInt && Intrinsics.d(this.$voteResponse.getValue(), "USEFUL")) {
            z11 = true;
        } else if (useful == parseInt) {
            z11 = it.isSelected();
        }
        boolean z12 = z11;
        this.this$0.getActionLiveData().setValue(new Action.SaveLikeState(this.$item.getReviewUuid(), z12));
        return TagV3Atom.TagAtom.copy$default(it, null, null, null, String.valueOf(useful), z12, null, null, null, null, null, 999, null);
    }
}
