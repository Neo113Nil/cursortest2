package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterValuesViewModel$changeCurrency$3 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ FilterValuesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterValuesViewModel$changeCurrency$3(FilterValuesViewModel filterValuesViewModel) {
        super(1);
        this.this$0 = filterValuesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.getViewModelAction().setValue(FilterValuesViewModel.Action.ErrorAndClose.INSTANCE);
        Lm0.a.f17149a.e(it);
    }
}
