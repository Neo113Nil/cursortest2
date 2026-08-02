package ru.ozon.uni.atoms.v3.holders.cell;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/v3/holders/cell/CellHolder$FlowBadgeListViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CellHolder$badgeListHolder$2 extends AbstractC7737t implements Function0<CellHolder.FlowBadgeListViewHolder> {
    final /* synthetic */ CellHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellHolder$badgeListHolder$2(CellHolder cellHolder) {
        super(0);
        this.this$0 = cellHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CellHolder.FlowBadgeListViewHolder invoke() {
        return new CellHolder.FlowBadgeListViewHolder(this.this$0.getContainerView().getCenterBlock().getBadgeListView());
    }
}
