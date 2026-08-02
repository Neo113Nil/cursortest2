package ru.ozon.app.android.ugc.core.widgets.blockList.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BlockListKt$BlockList$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function2<BlockListVO, t, Unit> $onView;
    final /* synthetic */ BlockListVO $state;
    final /* synthetic */ t $tokenizedEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BlockListKt$BlockList$2$1(Function2<? super BlockListVO, ? super t, Unit> function2, BlockListVO blockListVO, t tVar) {
        super(0);
        this.$onView = function2;
        this.$state = blockListVO;
        this.$tokenizedEvent = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onView.invoke(this.$state, this.$tokenizedEvent);
    }
}
