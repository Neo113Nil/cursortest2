package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom;

import BU.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/OffsetHelper$show$1", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "offsetVertical", "I", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffsetHelper$show$1 extends RecyclerView.t {
    final /* synthetic */ CurtainCustomVO $item;
    final /* synthetic */ RecyclerView $recycler;
    private int offsetVertical;
    final /* synthetic */ OffsetHelper this$0;

    OffsetHelper$show$1(CurtainCustomVO curtainCustomVO, RecyclerView recyclerView, OffsetHelper offsetHelper) {
        this.$item = curtainCustomVO;
        this.$recycler = recyclerView;
        this.this$0 = offsetHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScrolled$lambda$1$lambda$0(OffsetHelper offsetHelper, CurtainCustomVO curtainCustomVO) {
        offsetHelper.showCurtain(curtainCustomVO);
        offsetHelper.updateVisibility(curtainCustomVO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(RecyclerView rv, int dx, int dy) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        this.offsetVertical += dy;
        CurtainCustomVO curtainCustomVO = this.$item;
        RecyclerView recyclerView = this.$recycler;
        OffsetHelper offsetHelper = this.this$0;
        if (curtainCustomVO.getIsShown()) {
            return;
        }
        CurtainCustomVO.Condition showCondition = curtainCustomVO.getShowCondition();
        Intrinsics.g(showCondition, "null cannot be cast to non-null type ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO.Condition.Offset");
        if (((CurtainCustomVO.Condition.Offset) showCondition).getOffset() < this.offsetVertical) {
            rv.post(new a(2, offsetHelper, curtainCustomVO));
            recyclerView.removeOnScrollListener(this);
        }
    }
}
