package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import S0.A1;
import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class SlimTimeBarKt$SlimTimeBar$7$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ InterfaceC3978p0<Long> $activeScrubPositionMs$delegate;
    final /* synthetic */ SlimTimeBarBehavior $behavior;
    final /* synthetic */ SlimTimeBarDimensionsPx $dimensionsPx;
    final /* synthetic */ A1<Long> $idleBufferedPositionState;
    final /* synthetic */ A1<Long> $idlePositionState;
    final /* synthetic */ SlimTimeBarState $state;
    final /* synthetic */ SlimTimeBarStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlimTimeBarKt$SlimTimeBar$7$1(A1<Long> a12, SlimTimeBarState slimTimeBarState, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, SlimTimeBarDimensionsPx slimTimeBarDimensionsPx, A1<Long> a13, InterfaceC3978p0<Long> interfaceC3978p0) {
        super(1);
        this.$idlePositionState = a12;
        this.$state = slimTimeBarState;
        this.$style = slimTimeBarStyle;
        this.$behavior = slimTimeBarBehavior;
        this.$dimensionsPx = slimTimeBarDimensionsPx;
        this.$idleBufferedPositionState = a13;
        this.$activeScrubPositionMs$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e Canvas) {
        Long SlimTimeBar$lambda$7;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        SlimTimeBar$lambda$7 = SlimTimeBarKt.SlimTimeBar$lambda$7(this.$activeScrubPositionMs$delegate);
        SlimTimeBarKt.drawSlimTimeBar(Canvas, this.$state.getDurationMs(), this.$style.getColors(), this.$behavior, this.$dimensionsPx, this.$style.getGravity(), SlimTimeBar$lambda$7 != null ? SlimTimeBarKt.coercePosition(SlimTimeBar$lambda$7.longValue(), this.$state.getDurationMs()) : this.$idlePositionState.getValue().longValue(), this.$idleBufferedPositionState.getValue().longValue(), SlimTimeBar$lambda$7 != null);
    }
}
