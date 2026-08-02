package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newPosition", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseSkuScrollViewHolder$dependencyHolder$2$1$savePlayerPosition$1 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ WiseSkuScrollViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseSkuScrollViewHolder$dependencyHolder$2$1$savePlayerPosition$1(WiseSkuScrollViewHolder wiseSkuScrollViewHolder) {
        super(1);
        this.this$0 = wiseSkuScrollViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(long j11) {
        WiseSkuScrollVO wiseSkuScrollVO = (WiseSkuScrollVO) this.this$0.getBoundData();
        if (wiseSkuScrollVO != null) {
            wiseSkuScrollVO.setPlayerPosition(j11);
        }
    }
}
