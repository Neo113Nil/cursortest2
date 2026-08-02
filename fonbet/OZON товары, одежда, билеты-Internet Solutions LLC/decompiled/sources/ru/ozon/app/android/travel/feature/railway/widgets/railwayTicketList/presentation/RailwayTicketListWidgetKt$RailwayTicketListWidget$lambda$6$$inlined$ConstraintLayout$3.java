package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.presentation;

import S0.InterfaceC3978p0;
import e2.C6271o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RailwayTicketListWidgetKt$RailwayTicketListWidget$lambda$6$$inlined$ConstraintLayout$3 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ C6271o $constraintSet;
    final /* synthetic */ InterfaceC3978p0 $remeasureRequesterState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayTicketListWidgetKt$RailwayTicketListWidget$lambda$6$$inlined$ConstraintLayout$3(InterfaceC3978p0 interfaceC3978p0, C6271o c6271o) {
        super(0);
        this.$remeasureRequesterState = interfaceC3978p0;
        this.$constraintSet = c6271o;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$remeasureRequesterState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
        this.$constraintSet.j();
    }
}
