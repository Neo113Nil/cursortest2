package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.platform.rv.looped.LoopedAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator.NonXmlScrollingPagerIndicator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LoopedRecyclerNonXmlAttacher$attachToPager$1$setupPosition$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ LoopedRecyclerNonXmlAttacher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoopedRecyclerNonXmlAttacher$attachToPager$1$setupPosition$1(LoopedRecyclerNonXmlAttacher loopedRecyclerNonXmlAttacher) {
        super(0);
        this.this$0 = loopedRecyclerNonXmlAttacher;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NonXmlScrollingPagerIndicator nonXmlScrollingPagerIndicator;
        LoopedAdapter loopedAdapter;
        NonXmlScrollingPagerIndicator nonXmlScrollingPagerIndicator2;
        nonXmlScrollingPagerIndicator = this.this$0.pagerIndicator;
        if (nonXmlScrollingPagerIndicator == null) {
            Intrinsics.n("pagerIndicator");
            throw null;
        }
        loopedAdapter = this.this$0.adapter;
        if (loopedAdapter == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        nonXmlScrollingPagerIndicator.setDotCount(loopedAdapter.getCorrectItemsCount());
        nonXmlScrollingPagerIndicator2 = this.this$0.pagerIndicator;
        if (nonXmlScrollingPagerIndicator2 != null) {
            nonXmlScrollingPagerIndicator2.setCurrentPosition(0);
        } else {
            Intrinsics.n("pagerIndicator");
            throw null;
        }
    }
}
