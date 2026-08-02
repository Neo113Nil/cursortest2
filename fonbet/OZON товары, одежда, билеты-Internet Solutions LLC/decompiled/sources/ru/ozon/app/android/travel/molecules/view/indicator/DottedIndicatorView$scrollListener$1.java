package ru.ozon.app.android.travel.molecules.view.indicator;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DottedIndicatorView$scrollListener$1 extends AbstractC7737t implements Function2<RecyclerView, Integer, Unit> {
    final /* synthetic */ DottedIndicatorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DottedIndicatorView$scrollListener$1(DottedIndicatorView dottedIndicatorView) {
        super(2);
        this.this$0 = dottedIndicatorView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(RecyclerView recyclerView, Integer num) {
        invoke(recyclerView, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(RecyclerView rv, int i11) {
        IndicatorInfoProvider infoProvider;
        IndicatorInfoProvider infoProvider2;
        Integer calculateScrollToPosition;
        Intrinsics.checkNotNullParameter(rv, "rv");
        infoProvider = this.this$0.getInfoProvider();
        if (infoProvider != null && (calculateScrollToPosition = infoProvider.calculateScrollToPosition(i11)) != null) {
            rv.scrollToPosition(calculateScrollToPosition.intValue());
        }
        infoProvider2 = this.this$0.getInfoProvider();
        if (infoProvider2 != null) {
            this.this$0.highlightAt(infoProvider2.calculateIndicatorPosition(i11));
        }
    }
}
