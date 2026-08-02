package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.overlay;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersAnimator;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "event", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class QuickFiltersOverlayWidgetViewHolder$onWidgetCreated$2 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ QuickFiltersOverlayWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuickFiltersOverlayWidgetViewHolder$onWidgetCreated$2(QuickFiltersOverlayWidgetViewHolder quickFiltersOverlayWidgetViewHolder) {
        super(1);
        this.this$0 = quickFiltersOverlayWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r1 = r0.this$0.animator;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(a aVar) {
        QuickFiltersAnimator quickFiltersAnimator;
        if (!(aVar instanceof a.u.b) || quickFiltersAnimator == null) {
            return;
        }
        quickFiltersAnimator.show();
    }
}
