package ru.ozon.app.android.platform.rv.looped;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LoopedRecyclerViewAttacher$onPositionChangeListener$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ LoopedRecyclerViewAttacher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoopedRecyclerViewAttacher$onPositionChangeListener$1(LoopedRecyclerViewAttacher loopedRecyclerViewAttacher) {
        super(1);
        this.this$0 = loopedRecyclerViewAttacher;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ScrollingPagerIndicator scrollingPagerIndicator;
        scrollingPagerIndicator = this.this$0.pagerIndicator;
        if (scrollingPagerIndicator != null) {
            scrollingPagerIndicator.k(i11);
        } else {
            Intrinsics.n("pagerIndicator");
            throw null;
        }
    }
}
