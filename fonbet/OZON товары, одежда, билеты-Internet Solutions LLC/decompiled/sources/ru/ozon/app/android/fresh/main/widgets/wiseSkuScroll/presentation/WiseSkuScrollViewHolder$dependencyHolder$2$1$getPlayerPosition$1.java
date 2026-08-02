package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseSkuScrollViewHolder$dependencyHolder$2$1$getPlayerPosition$1 extends AbstractC7737t implements Function0<Long> {
    final /* synthetic */ WiseSkuScrollViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseSkuScrollViewHolder$dependencyHolder$2$1$getPlayerPosition$1(WiseSkuScrollViewHolder wiseSkuScrollViewHolder) {
        super(0);
        this.this$0 = wiseSkuScrollViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        WiseSkuScrollVO wiseSkuScrollVO = (WiseSkuScrollVO) this.this$0.getBoundData();
        return Long.valueOf(wiseSkuScrollVO != null ? wiseSkuScrollVO.getPlayerPosition() : 0L);
    }
}
