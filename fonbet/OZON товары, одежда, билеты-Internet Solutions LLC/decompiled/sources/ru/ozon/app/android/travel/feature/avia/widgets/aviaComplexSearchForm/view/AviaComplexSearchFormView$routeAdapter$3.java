package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaComplexSearchFormView$routeAdapter$3 extends AbstractC7737t implements Function1<Boolean, Boolean> {
    final /* synthetic */ AviaComplexSearchFormView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaComplexSearchFormView$routeAdapter$3(AviaComplexSearchFormView aviaComplexSearchFormView) {
        super(1);
        this.this$0 = aviaComplexSearchFormView;
    }

    public final Boolean invoke(boolean z11) {
        Function1 function1;
        function1 = this.this$0.getIsDemoAnimationRequired;
        if (function1 != null) {
            return (Boolean) function1.invoke(Boolean.valueOf(z11));
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
