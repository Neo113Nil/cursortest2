package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import Lm0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ComparisonCarouselView$handleClick$3 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ AtomAction.Click $click;
    final /* synthetic */ ComparisonCarouselView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonCarouselView$handleClick$3(ComparisonCarouselView comparisonCarouselView, AtomAction.Click click) {
        super(1);
        this.this$0 = comparisonCarouselView;
        this.$click = click;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.handleFailedClickResult(this.$click.getId());
        a.f17149a.d(it);
    }
}
