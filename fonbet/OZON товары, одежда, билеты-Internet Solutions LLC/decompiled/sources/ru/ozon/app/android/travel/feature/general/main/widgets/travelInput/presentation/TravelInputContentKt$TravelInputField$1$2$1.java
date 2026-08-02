package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import B0.L0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB0/L0;", "", "invoke", "(LB0/L0;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TravelInputContentKt$TravelInputField$1$2$1 extends AbstractC7737t implements Function1<L0, Unit> {
    final /* synthetic */ Function0<Unit> $onDone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelInputContentKt$TravelInputField$1$2$1(Function0<Unit> function0) {
        super(1);
        this.$onDone = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(L0 l02) {
        invoke2(l02);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(L0 KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        this.$onDone.invoke();
    }
}
