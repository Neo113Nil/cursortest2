package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isSwiped", "", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaComplexSearchFormView$routeAdapter$2 extends AbstractC7737t implements Function2<Boolean, Integer, Unit> {
    final /* synthetic */ AviaComplexSearchFormView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaComplexSearchFormView$routeAdapter$2(AviaComplexSearchFormView aviaComplexSearchFormView) {
        super(2);
        this.this$0 = aviaComplexSearchFormView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num) {
        invoke(bool.booleanValue(), num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, int i11) {
        Function2 function2;
        function2 = this.this$0.onSwipedListener;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(z11), Integer.valueOf(i11));
        }
    }
}
