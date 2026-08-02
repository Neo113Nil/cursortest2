package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose;

import WZ.l;
import WZ.t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.BlockV3VO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.NaviBlocksV3VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NaviBlocksV3ComposableKt$NaviBlocksV3Composable$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ NaviBlocksV3VO $item;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviBlocksV3ComposableKt$NaviBlocksV3Composable$1$1(NaviBlocksV3VO naviBlocksV3VO, l lVar) {
        super(0);
        this.$item = naviBlocksV3VO;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List<BlockV3VO> blocks = this.$item.getBlocks();
        l lVar = this.$tokenizedAnalytics;
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            t tokenizedEvent = ((BlockV3VO) it.next()).getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent, null, 2, null);
            }
        }
    }
}
