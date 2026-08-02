package ru.ozon.app.android.fresh.main.widgets.scrollActionList.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.domain.ScrollActionListVO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ScrollActionListRootViewHolder$decorator$1 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ ScrollActionListRootViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollActionListRootViewHolder$decorator$1(ScrollActionListRootViewHolder scrollActionListRootViewHolder) {
        super(0);
        this.this$0 = scrollActionListRootViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        ScrollActionListVO.PaddingsVO paddings;
        ScrollActionListVO scrollActionListVO = (ScrollActionListVO) this.this$0.getBoundData();
        return Integer.valueOf((scrollActionListVO == null || (paddings = scrollActionListVO.getPaddings()) == null) ? 0 : paddings.getBetween());
    }
}
