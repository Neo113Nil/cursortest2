package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NaviBlocksV3ViewHolder$showOnboardingIfExist$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ int $viewPosition;
    final /* synthetic */ NaviBlocksV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviBlocksV3ViewHolder$showOnboardingIfExist$1$1(NaviBlocksV3ViewHolder naviBlocksV3ViewHolder, int i11) {
        super(0);
        this.this$0 = naviBlocksV3ViewHolder;
        this.$viewPosition = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List<BlockV3VO> blocks;
        BlockV3VO blockV3VO;
        AtomAction action;
        Function1 function1;
        NaviBlocksV3VO boundData = this.this$0.getBoundData();
        if (boundData == null || (blocks = boundData.getBlocks()) == null || (blockV3VO = blocks.get(this.$viewPosition)) == null || (action = blockV3VO.getAction()) == null) {
            return;
        }
        function1 = this.this$0.actionHandler;
        function1.invoke(action);
    }
}
